/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.ui.common.editor.outline;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.xtext.concurrent.IUnitOfWork;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.parsetree.ParseTreeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.common.editor.outline.impl.ContentOutlineNodeAdapter;
import org.eclipse.xtext.ui.common.editor.outline.impl.EditorSelectionChangedListener;
import org.eclipse.xtext.ui.common.editor.outline.impl.LazyVirtualContentOutlinePage;
import org.eclipse.xtext.ui.common.editor.outline.impl.LexicalSortingAction;
import org.eclipse.xtext.ui.common.editor.outline.impl.LinkingHelper;
import org.eclipse.xtext.ui.common.editor.outline.impl.OutlineSelectionChangedListener;
import org.eclipse.xtext.ui.common.editor.outline.impl.ToggleLinkWithEditorAction;
import org.eclipse.xtext.ui.core.editor.ISourceViewerAware;
import org.eclipse.xtext.ui.core.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.core.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.core.editor.model.XtextDocumentUtil;

import com.google.inject.Inject;

/**
 * An outline page for Xtext resources.
 * 
 * This class is not intended to be subclassed. It is designed to be configured
 * with a domain specific combined label and content provider (which is
 * automatically injected to the {@link #provider} field).
 * 
 * The outline page can synchronize itself with the associated editor.
 * Selections made in the outline will be propagated to the editor at any time,
 * whereas the synchronization from the editor to the outline can be controlled
 * by the user using the "Link with Editor" button.
 * 
 * @author Peter Friese - Initial contribution and API
 */
public class XtextContentOutlinePage extends LazyVirtualContentOutlinePage implements ISourceViewerAware {

	static final Logger logger = Logger.getLogger(XtextContentOutlinePage.class);

	@Inject
	private ILazyTreeProvider provider;

	private ISourceViewer sourceViewer;
	private OutlineSelectionChangedListener outlineSelectionChangedListener;
	private EditorSelectionChangedListener editorSelectionChangedListener;

	private IXtextModelListener modelListener;

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		configureViewer();
		configureProviders();
		configureDocument();
	}

	private void configureViewer() {
		TreeViewer viewer = getTreeViewer();
		viewer.setAutoExpandLevel(AbstractTreeViewer.ALL_LEVELS);
	}

	protected void configureProviders() {
		Assert.isNotNull(provider, "No ILazyTreeProvider available. Dependency injection broken?");
		getTreeViewer().setContentProvider(provider);
		getTreeViewer().setLabelProvider(provider);
	}

	private void configureDocument() {
		if (sourceViewer != null) {
			IDocument document = sourceViewer.getDocument();
			IXtextDocument xtextDocument = XtextDocumentUtil.get(document);

			// TODO: it would be better to have NodeContentAdapter update the
			// parts of the outline model that need updates instead of
			// installing a model listener.
			installModelListener();

			internalSetInput(xtextDocument);
		}
	}

	private void installModelListener() {
		if (sourceViewer != null) {
			IDocument document = sourceViewer.getDocument();
			IXtextDocument xtextDocument = XtextDocumentUtil.get(document);

			if (modelListener == null) {
				modelListener = new IXtextModelListener() {
					public void modelChanged(XtextResource resource) {
						if (logger.isDebugEnabled()) {
							logger.debug("Document has been changed. Triggering update of outline.");
						}
						runInSWTThread(new Runnable() {
							public void run() {
								TreeViewer viewer = getTreeViewer();
								IDocument document = sourceViewer.getDocument();
								internalSetInput(XtextDocumentUtil.get(document));
								viewer.refresh();
							}
						});
					}
				};
			}
			xtextDocument.addModelListener(modelListener);
		}
	}

	private void uninstallModelListener() {
		if (sourceViewer != null) {
			IDocument document = sourceViewer.getDocument();
			IXtextDocument xtextDocument = XtextDocumentUtil.get(document);
			if (xtextDocument != null) {
				xtextDocument.removeModelListener(modelListener);
			}
		}
	}

	public IXtextDocument getDocument() {
		return XtextDocumentUtil.get(getSourceViewer());
	}

	@Override
	public void init(IPageSite pageSite) {
		super.init(pageSite);
		registerToolbarActions(getSite().getActionBars());
	}

	protected void registerToolbarActions(IActionBars actionBars) {
		IToolBarManager toolBarManager = actionBars.getToolBarManager();
		if (toolBarManager != null) {
			toolBarManager.add(new ToggleLinkWithEditorAction(this));

			// sort button only available if provider offers sorting facilities
			if (provider instanceof ISortableContentProvider) {
				toolBarManager.add(new LexicalSortingAction(this));
			}
		}
	}

	@Override
	public void dispose() {
		outlineSelectionChangedListener.uninstall(this);
		outlineSelectionChangedListener = null;
		editorSelectionChangedListener.uninstall(sourceViewer.getSelectionProvider());
		editorSelectionChangedListener = null;
		uninstallModelListener();
		provider.dispose();
		provider = null;
		super.dispose();
	}

	/**
	 * Runs the runnable in the SWT thread. (Simply runs the runnable if the
	 * current thread is the UI thread, otherwise calls the runnable in
	 * asyncexec.)
	 */
	private void runInSWTThread(Runnable runnable) {
		if (Display.getCurrent() == null) {
			Display.getDefault().asyncExec(runnable);
		}
		else {
			runnable.run();
		}
	}

	private void internalSetInput(IXtextDocument xtextDocument) {
		TreeViewer tree = getTreeViewer();
		if (tree != null) {
			// TreePath[] expandedTreePaths = tree.getExpandedTreePaths();
			// Object[] expandedElements = tree.getExpandedElements();
			tree.setInput(xtextDocument);
			// tree.setExpandedElements(expandedElements);
			// tree.setExpandedTreePaths(expandedTreePaths);
		}
	}

	public void setSourceViewer(ISourceViewer sourceViewer) {
		this.sourceViewer = sourceViewer;
		getOutlineSelectionListener().install(this);
		getEditorSelectionChangedListener().install(sourceViewer.getSelectionProvider());
	}

	public ISourceViewer getSourceViewer() {
		return sourceViewer;
	}

	private OutlineSelectionChangedListener getOutlineSelectionListener() {
		if (outlineSelectionChangedListener == null) {
			outlineSelectionChangedListener = new OutlineSelectionChangedListener(this);
		}
		return outlineSelectionChangedListener;
	}

	private EditorSelectionChangedListener getEditorSelectionChangedListener() {
		if (editorSelectionChangedListener == null) {
			editorSelectionChangedListener = new EditorSelectionChangedListener(this);
		}
		return editorSelectionChangedListener;
	}

	public boolean isLinkingEnabled() {
		return LinkingHelper.isLinkingEnabled();
	}

	public void setLinkingEnabled(boolean enabled) {
		LinkingHelper.setLinkingEnabled(enabled);
	}

	public void setSelection(ISelection selection, boolean reveal) {
		getTreeViewer().setSelection(selection, reveal);
	}

	public void synchronizeOutlinePage() {
		getDocument().readOnly(new IUnitOfWork.Void<XtextResource>() {
			public void process(XtextResource resource) throws Exception {
				int caretOffset = getSourceViewer().getTextWidget().getCaretOffset();

				IParseResult parseResult = resource.getParseResult();
				Assert.isNotNull(parseResult);
				CompositeNode rootNode = parseResult.getRootNode();
				AbstractNode currentNode = ParseTreeUtil.getLastCompleteNodeByOffset(rootNode, caretOffset);
				synchronizeOutlinePage(currentNode);
			}
		});
	}

	private boolean shouldSynchronizeOutlinePage() {
		return isLinkingEnabled();
	}

	private ContentOutlineNode findMostSignificantOutlineNode(AbstractNode node) {
		if (node != null) {
			CompositeNode compositeNode = node instanceof CompositeNode ? (CompositeNode) node : node.getParent();
			EObject astElement = NodeUtil.getASTElementForRootNode(compositeNode);
			if (astElement != null) {
				ContentOutlineNodeAdapter adapter = (ContentOutlineNodeAdapter) EcoreUtil.getAdapter(astElement
						.eAdapters(), ContentOutlineNode.class);
				if (adapter != null) {
					ContentOutlineNode contentOutlineNode = adapter.getContentOutlineNode();
					if (contentOutlineNode != null) {
						return contentOutlineNode;
					}
				}
				else {
					CompositeNode parent = node.getParent();
					return findMostSignificantOutlineNode(parent);
				}
			}
		}
		return null;
	}

	public void synchronizeOutlinePage(AbstractNode node) {
		ISelection selection = StructuredSelection.EMPTY;

		if (shouldSynchronizeOutlinePage()) {
			ContentOutlineNode mostSignificantOutlineNode = findMostSignificantOutlineNode(node);
			if (mostSignificantOutlineNode != null) {
				selection = new StructuredSelection(mostSignificantOutlineNode);
			}
			outlineSelectionChangedListener.uninstall(this);
			this.setSelection(selection, true);
			outlineSelectionChangedListener.install(this);
		}
	}

	public void setSorted(boolean sorted) {
		if (provider instanceof ISortableContentProvider) {
			ISortableContentProvider sortableContentProvider = (ISortableContentProvider) provider;
			sortableContentProvider.setSorted(sorted);
			refresh();
		}
	}

	public void enableFilter(IOutlineFilter filterSpec) {
		if (provider instanceof IFilterableContentProvider) {
			IFilterableContentProvider filterableContentProvider = (IFilterableContentProvider) provider;
			filterableContentProvider.enableFilter(filterSpec);
			refresh();
		}
	}

	public void disableFilter(IOutlineFilter filterSpec) {
		if (provider instanceof IFilterableContentProvider) {
			IFilterableContentProvider filterableContentProvider = (IFilterableContentProvider) provider;
			filterableContentProvider.disableFilter(filterSpec);
			refresh();
		}
	}

	private void refresh() {
		runInSWTThread(new Runnable() {
			public void run() {
				TreeViewer tv = getTreeViewer();
				if (tv != null) {
					IDocument document = sourceViewer.getDocument();
					internalSetInput(XtextDocumentUtil.get(document));
					tv.refresh();
				}
			}
		});
	}

}
