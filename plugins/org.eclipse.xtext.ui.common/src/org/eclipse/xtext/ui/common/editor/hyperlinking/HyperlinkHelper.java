/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.common.editor.hyperlinking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.crossref.ILinkingService;
import org.eclipse.xtext.crossref.impl.IllegalNodeException;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.parsetree.ParseTreeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.core.ILocationInFileProvider;
import org.eclipse.xtext.util.Wrapper;

import com.google.inject.Inject;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class HyperlinkHelper {

	private final ILinkingService linkingService;
	private final ILocationInFileProvider locationProvider;
	private final ILabelProvider labelProvider;

	@Inject
	public HyperlinkHelper(ILinkingService linkingService, ILocationInFileProvider locationProvider, ILabelProvider labelProvider) {
		super();
		this.linkingService = linkingService;
		this.locationProvider = locationProvider;
		this.labelProvider = labelProvider;
	}

	public ActionBasedHyperlink[] createHyperlinksByOffset(XtextResource resource, int offset, boolean createMultipleHyperlinks) {
		IParseResult parseResult = resource.getParseResult();
		Assert.isNotNull(parseResult);
		AbstractNode abstractNode = ParseTreeUtil.getCurrentOrFollowingNodeByOffset(parseResult.getRootNode(), offset);
		final Wrapper<Region> location = Wrapper.wrap(new Region(abstractNode.getOffset(), abstractNode.getLength()));
		List<EObject> crossLinkedEObjects = findCrossLinkedEObject(resource.getContents().get(0), abstractNode, location);
		if (crossLinkedEObjects.isEmpty())
			return null;
		final URIConverter uriConverter = resource.getResourceSet().getURIConverter();
		List<IHyperlink> links = new ArrayList<IHyperlink>();
		for (EObject crossReffed : crossLinkedEObjects) {
			if (!links.isEmpty() && !createMultipleHyperlinks)
				break;
			final String label = labelProvider.getText(crossReffed);
			final URI uri = EcoreUtil.getURI(crossReffed);
			final URI normalized = uriConverter.normalize(uri);
			links.add(new ActionBasedHyperlink(label, location.get(), new OpenDeclarationAction(normalized, locationProvider)));
		}
		return links.toArray(new ActionBasedHyperlink[links.size()]);
	}

	public OpenDeclarationAction getOpenDeclarationAction(XtextResource resource, int offset) {
		AbstractNode node = ParseTreeUtil.getCurrentOrFollowingNodeByOffset(resource.getParseResult().getRootNode(), offset);
		List<EObject> crossLinkedEObject = findCrossLinkedEObject(resource.getContents().get(0), node, null);
		if (crossLinkedEObject.isEmpty())
			return null;
		final URI uri = EcoreUtil.getURI(crossLinkedEObject.get(0));
		final URI normalized = resource.getResourceSet().getURIConverter().normalize(uri);
		return new OpenDeclarationAction(normalized, locationProvider);
	}

	protected List<EObject> findCrossLinkedEObject(EObject rootModel, AbstractNode node, Wrapper<Region> location) {
		AbstractNode nodeToCheck = node;
		while(nodeToCheck != null && !(nodeToCheck.getGrammarElement() instanceof Assignment)) {
			if (nodeToCheck.getGrammarElement() instanceof CrossReference) {
				EObject semanticModel = NodeUtil.getNearestSemanticObject(nodeToCheck);
				EReference eReference = GrammarUtil.getReference((CrossReference) nodeToCheck.getGrammarElement(),
						semanticModel.eClass());
				try {
					if (location != null)
						location.set(new Region(nodeToCheck.getOffset(), nodeToCheck.getLength()));
					return linkingService.getLinkedObjects(rootModel, semanticModel, eReference, nodeToCheck);
				} catch (IllegalNodeException ex) {
					return Collections.emptyList();
				}
			}
			nodeToCheck = nodeToCheck.getParent();
		}
		return Collections.emptyList();
	}
}
