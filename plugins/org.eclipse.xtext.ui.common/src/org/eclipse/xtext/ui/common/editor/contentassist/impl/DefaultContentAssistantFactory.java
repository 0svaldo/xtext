/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.common.editor.contentassist.impl;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.xtext.ui.core.editor.contentassist.IContentAssistantFactory;

import com.google.inject.Inject;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class DefaultContentAssistantFactory implements IContentAssistantFactory {

	@Inject(optional = true)
	private IContentAssistProcessor contentAssistProcessor;
	
	public IContentAssistant createConfiguredAssistant(SourceViewerConfiguration configuration,
			ISourceViewer sourceViewer) {
		ContentAssistant assistant = createAssistant();
		configureContentAssistant(assistant, configuration, sourceViewer);
		return assistant;
	}

	protected ContentAssistant createAssistant() {
		// cannot use Provider<ContentAssistent>.get() since ContentAssistant does not know anything about guice
		return new ContentAssistant();
	}
	
	protected void configureContentAssistant(ContentAssistant assistant, SourceViewerConfiguration configuration, ISourceViewer sourceViewer) {
		configureDefaults(assistant, configuration, sourceViewer);
		loadPreferences(assistant);
	}

	protected void loadPreferences(ContentAssistant assistant) {
		// TODO load CA preferences
	}

	private void configureDefaults(ContentAssistant assistant, SourceViewerConfiguration configuration, ISourceViewer sourceViewer) {
		setAutoInsert(assistant);
		setContentAssistProcessor(assistant);
		setInformationControlCreator(assistant, configuration, sourceViewer);
	}
	
	private void setInformationControlCreator(ContentAssistant assistant, SourceViewerConfiguration configuration,
			ISourceViewer sourceViewer) {
		if (configuration != null && sourceViewer != null)
			assistant.setInformationControlCreator(configuration.getInformationControlCreator(sourceViewer));
	}

	protected void setAutoInsert(ContentAssistant assistant) {
		assistant.enableAutoInsert(true);
	}
	
	protected void setContentAssistProcessor(ContentAssistant assistant) {
		if (contentAssistProcessor != null)
			assistant.setContentAssistProcessor(contentAssistProcessor, IDocument.DEFAULT_CONTENT_TYPE);
	}

}
