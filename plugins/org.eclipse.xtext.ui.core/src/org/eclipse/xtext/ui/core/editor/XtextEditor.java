/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.ui.core.editor;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ChainedPreferenceStore;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
import org.eclipse.ui.texteditor.SelectMarkerRulerAction;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.ui.core.XtextUIMessages;
import org.eclipse.xtext.ui.core.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.core.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.core.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.core.editor.toggleComments.ToggleSLCommentAction;
import org.eclipse.xtext.ui.core.editor.utils.ValidationJob;
import org.eclipse.xtext.ui.core.internal.Activator;
import org.eclipse.xtext.validation.CheckMode;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * @author Dennis Huebner - Initial contribution and API
 * @author Peter Friese - Initial contribution and API
 * @author Sven Efftinge
 */
public class XtextEditor extends TextEditor {

	private static final Logger log = Logger.getLogger(XtextEditor.class);

	public static final String ID = "org.eclipse.xtext.baseEditor"; //$NON-NLS-1$

	@Inject
	private XtextSourceViewerConfiguration sourceViewerConfiguration;

	@Inject(optional = true)
	private IContentOutlinePage outlinePage;

	@Inject
	private Provider<XtextDocumentProvider> documentProvider;

	private String languageName;

	public XtextEditor() {
		if (log.isDebugEnabled())
			log.debug("Creating Xtext Editor. Instance: [" + this.toString() + "]");
	}

	public IXtextDocument getDocument() {
		return XtextDocumentUtil.get(getSourceViewer());
	}

	@Inject
	public void setLanguageName(@Named(Constants.LANGUAGE_NAME) String name) {
		this.languageName = name;
	}

	public String getLanguageName() {
		return languageName;
	}
	
	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		if (log.isDebugEnabled()) {
			log.debug("doSetInput:" + input);
			log.debug("Editor instance is [" + this.toString() + "]");
		}
		super.doSetInput(input);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		if (log.isDebugEnabled())
			log.debug("init:" + input);

		// do document provider setup
		setDocumentProvider(documentProvider.get());

		// source viewer setup
		setSourceViewerConfiguration(sourceViewerConfiguration);

		setPreferenceStore(new ChainedPreferenceStore(new IPreferenceStore[] {
				Activator.getDefault().getPreferenceStore(), EditorsUI.getPreferenceStore() }));
		
		// NOTE: Outline CANNOT be initialized here, since we do not have access
		// to the source viewer yet (it will be created later).

		super.init(site, input);
	}

	/**
	 * Set key binding scope. Needed to make F3 work properly.
	 */
	@Override
	protected void initializeKeyBindingScopes() {
		setKeyBindingScopes(new String[] { "org.eclipse.xtext.ui.core.XtextEditorScope" }); //$NON-NLS-1$
	}

	public IResource getResource() {
		Object adapter = getEditorInput().getAdapter(IResource.class);
		if (adapter != null) {
			return (IResource) adapter;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.equals(IContentOutlinePage.class)) {
			return getContentOutlinePage();
		}
		return super.getAdapter(adapter);
	}

	private IContentOutlinePage getContentOutlinePage() {
		if (outlinePage != null) {
			if (outlinePage instanceof ISourceViewerAware) {
				((ISourceViewerAware) outlinePage).setSourceViewer(getSourceViewer());
			}
		}
		return outlinePage;
	}

	@Override
	protected void createActions() {
		super.createActions();
		if (getSourceViewerConfiguration().getContentFormatter(getSourceViewer()) != null) {
			Action action = new TextOperationAction(XtextUIMessages.getResourceBundle(),
					"Format.", this, ISourceViewer.FORMAT); //$NON-NLS-1$
			action.setActionDefinitionId(Activator.PLUGIN_ID + ".FormatAction");
			setAction("Format", action); //$NON-NLS-1$
			markAsStateDependentAction("Format", true); //$NON-NLS-1$
			markAsSelectionDependentAction("Format", true); //$NON-NLS-1$
		}
		
		ToggleSLCommentAction action= new ToggleSLCommentAction(XtextUIMessages.getResourceBundle(), "ToggleComment.", this); //$NON-NLS-1$
		action.setActionDefinitionId(Activator.PLUGIN_ID + ".ToggleCommentAction");
		setAction("ToggleComment", action); //$NON-NLS-1$
		markAsStateDependentAction("ToggleComment", true); //$NON-NLS-1$
		markAsSelectionDependentAction("ToggleComment", true);
		configureToggleCommentAction(action);

		// Creates an build-in "click an ruler annotation, marks corresponding
		// text" - action
		SelectMarkerRulerAction markerAction = new XtextMarkerRulerAction(XtextUIMessages.getResourceBundle(),
				"XtextSelectAnnotationRulerAction.", this, getVerticalRuler()); //$NON-NLS-1$
		setAction(ITextEditorActionConstants.RULER_CLICK, markerAction);
	}
	
	private void configureToggleCommentAction(ToggleSLCommentAction action) {
		ISourceViewer sourceViewer= getSourceViewer();
		SourceViewerConfiguration configuration= getSourceViewerConfiguration();
		((ToggleSLCommentAction)action).configure(sourceViewer, configuration);
	}

	/**
	 * @return true if content assist is available
	 * 
	 */
	public boolean isContentAssistAvailable() {
		return getSourceViewerConfiguration().getContentAssistant(getSourceViewer()) != null;
	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
		if (log.isDebugEnabled())
			log.debug("Creating Xtext source viewer.");

		// overwrite superclass implementation to allow folding
		fAnnotationAccess = createAnnotationAccess();
		fOverviewRuler = createOverviewRuler(getSharedColors());
		ISourceViewer projectionViewer = new ProjectionViewer(parent, ruler, getOverviewRuler(),
				isOverviewRulerVisible(), styles);
		getSourceViewerDecorationSupport(projectionViewer);
		return projectionViewer;
	}

	private ProjectionSupport projectionSupport;

	@Override
	public void createPartControl(Composite parent) {

		super.createPartControl(parent);
		// We need ProjectionViewer to support Folding
		ProjectionViewer projectionViewer = (ProjectionViewer) getSourceViewer();
		projectionSupport = new ProjectionSupport(projectionViewer, getAnnotationAccess(), getSharedColors());
		projectionSupport.addSummarizableAnnotationType("org.eclipse.ui.workbench.texteditor.warning"); //$NON-NLS-1$
		projectionSupport.addSummarizableAnnotationType("org.eclipse.ui.workbench.texteditor.error"); //$NON-NLS-1$
		projectionSupport.install();
		// TODO Folding stuff
	}

	@Override
	public void dispose() {
		super.dispose();
		if (projectionSupport != null) {
			projectionSupport.dispose();
		}
		if (outlinePage != null) {
			outlinePage = null;
		}
	}

	/**
	 * TODO: get rid of this method. It is only here to support
	 * org.eclipse.xtext.ui.common.editor.hyperlinking.OpenDeclarationHandler,
	 * which needs access to the sourceviewer.
	 */
	public ISourceViewer getInternalSourceViewer() {
		return getSourceViewer();
	}

	@Override
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		super.performSaveAs(progressMonitor);
		doExpensiveValidation();
	}

	@Override
	protected void performSave(boolean overwrite, IProgressMonitor progressMonitor) {
		super.performSave(overwrite, progressMonitor);
		doExpensiveValidation();
	}

	@Override
	protected void performRevert() {
		super.performRevert();
		doExpensiveValidation();
	}

	private void doExpensiveValidation() {
		new ValidationJob(this, CheckMode.NORMAL_AND_FAST).schedule();
	}

	@Override
	protected void handlePreferenceStoreChanged(PropertyChangeEvent event) {
		super.handlePreferenceStoreChanged(event);
		if (getSourceViewer() == null)
			return;
		// TODO (dennis) move preference store constants to ui.core or create a
		// handlePrefStoreChanged service
		boolean tokenStyleChanged = event.getProperty().contains(".syntaxColorer.tokenStyles");
		if (tokenStyleChanged) {
			initializeViewerColors(getSourceViewer());
			getSourceViewer().invalidateTextPresentation();
		}
	}
}
