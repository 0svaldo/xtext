/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtext.reference.ui.services;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.xtext.parsetree.LeafNode;

/**
 * @author Dennis H�bner
 * 
 */
public class ReferenceSyntaxColorer extends org.eclipse.xtext.ui.core.service.impl.SyntaxColorer {
	@Override
	public TextAttribute color(LeafNode leafNode) {
		return super.color(leafNode);
	}
}
