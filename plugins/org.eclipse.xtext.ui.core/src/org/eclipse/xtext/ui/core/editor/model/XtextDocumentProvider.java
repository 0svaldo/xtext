/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.ui.core.editor.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Peter Friese - Initial contribution and API
 * @author Sven Efftinge
 */
public class XtextDocumentProvider extends FileDocumentProvider {

	private static final Logger log = Logger.getLogger(XtextDocumentProvider.class);

	@Inject
	private Provider<XtextDocument> document;

	/**
	 * @author Sven Efftinge - Initial contribution and API
	 *
	 * updates referenced EMF Resources on IResourceChangeEvent
	 */
	private final class ReferencedResourcesUpdater implements IResourceChangeListener {
		private final XtextDocument document;

		private ReferencedResourcesUpdater(XtextDocument document) {
			this.document = document;
		}

		public void resourceChanged(final IResourceChangeEvent event) {

			final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor(document);
			try {
				event.getDelta().accept(visitor);
			} catch (CoreException e) {
				log.error(e.getMessage(), e);
			}
			if (!visitor.deltas.isEmpty()) {
			new Job("updating resourceset"){
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					document.modify(new UnitOfWork<Object>() {

						public Object exec(XtextResource arg) throws Exception {
							for (IResourceDelta delta : visitor.deltas) {
								IResource res = delta.getResource();
								String string = res.getFullPath().lastSegment();
								ResourceSet set = arg.getResourceSet();
								for(int i = 0; i < set.getResources().size(); ) {
									final Resource emfResource = set.getResources().get(i);
									if (emfResource!=null && string.equals(emfResource.getURI().lastSegment())) {
										switch (delta.getKind()) {
										case IResourceDelta.REMOVED:
											// UNLOAD
											document.modify(new UnitOfWork<Void>() {
												public Void exec(XtextResource arg) throws Exception {
													emfResource.unload();
													return null;
												}
											});
											if (emfResource.getResourceSet() != null)
												set.getResources().remove(emfResource);
											break;
										case IResourceDelta.CHANGED:
											// RELOAD
											document.modify(new UnitOfWork<Void>() {
												public Void exec(XtextResource arg) throws Exception {
													emfResource.unload();
													try {
														emfResource.load(null);
													} catch (IOException e) {
														log.error(e.getMessage(), e);
													}
													return null;
												}
											});
											break;
										}
									}
									if (set.getResources().get(i) == emfResource)
										i++;
								}
							}
							arg.reparse(document.get());
							return null;
						}
					});
					return Status.OK_STATUS;
				}}.schedule();
			}
		}
	}

	/**
	 * @author Sven Efftinge - Initial contribution and API
	 * collects all interesting IResourceDeltas (those which are referenced by the managed EMF Resource)
	 */
	private final class ResourceDeltaVisitor implements IResourceDeltaVisitor {
		private final XtextDocument document;

		private ResourceDeltaVisitor(XtextDocument document) {
			this.document = document;
		}

		public final List<IResourceDelta> deltas = new ArrayList<IResourceDelta>();

		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource res = delta.getResource();
			int kind = delta.getKind();
			int flags = delta.getFlags();
			if ((kind == IResourceDelta.REMOVED ||
					(kind == IResourceDelta.CHANGED && ((IResourceDelta.CONTENT & flags) != 0)))
					&& document.isReferenced(res)) {
				deltas.add(delta);
			}
			return true;
		}
	}

	private final List<IResourceChangeListener> resourceChangeListener = new ArrayList<IResourceChangeListener>();

	@Override
	protected IDocument createEmptyDocument() {
		XtextDocument xtextDocument = document.get();
		ReferencedResourcesUpdater listener = new ReferencedResourcesUpdater(xtextDocument);
		resourceChangeListener.add(listener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(listener,
				IResourceChangeEvent.POST_CHANGE);

		return xtextDocument;
	}

	@Override
	protected void setupDocument(Object element, IDocument document) {
		((XtextDocument) document).setInput((IEditorInput) element);
	}

	@Override
	protected void disconnected() {
		super.disconnected();
		for (IResourceChangeListener listener : resourceChangeListener) {
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(listener);
		}
		resourceChangeListener.clear();
	}

}
