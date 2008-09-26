///*******************************************************************************
// * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// *******************************************************************************/
//package org.eclipse.xtext.reference.ui.services;
// 
//import java.util.ArrayList;
//import java.util.List;
//
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.graphics.RGB;
//import org.eclipse.xtext.parsetree.LeafNode;
//import org.eclipse.xtext.ui.editor.utils.TextStyle;
//import org.eclipse.xtext.ui.service.impl.BuiltInTokenTypeDef;
//import org.eclipse.xtext.ui.tokentype.ITokenTypeDef;
//import org.eclipse.xtext.ui.tokentype.TokenTypeDef;
//
///**
// * @author Dennis H�bner - Initial contribution and API
// * 
// */
//public class ReferenceTokenTypeDef extends BuiltInTokenTypeDef {
//
//	@Override
//	public List<ITokenTypeDef> allTokenTypes() {
//
//		List<ITokenTypeDef> allTokenTypes = new ArrayList<ITokenTypeDef>();
//		// allTokenTypes.add(fieldTokenType());
//		allTokenTypes.add(rot());
//		allTokenTypes.add(gelb());
//		allTokenTypes.add(gr�n());
//		allTokenTypes.addAll(super.allTokenTypes());
//		return allTokenTypes;
//	}
//
//	TokenTypeDef rot() {
//		return new TokenTypeDef("rot", "ROT") {
//			@Override
//			public boolean match(LeafNode node) {
//				return keyWordTokenType().match(node) && "ROT".equals(node.getText());
//			}
//
//			@Override
//			public TextStyle defaultTextStyle() {
//				TextStyle textStyle = new TextStyle();
//				textStyle.setColor(new RGB(200, 10, 50));
//				textStyle.setStyle(SWT.BOLD);
//				return textStyle;
//			}
//		};
//	}
//
//	TokenTypeDef gelb() {
//		TokenTypeDef ttd = new TokenTypeDef("gelb", "GELB") {
//			@Override
//			public boolean match(LeafNode node) {
//				return keyWordTokenType().match(node) && "GELB".equals(node.getText());
//			}
//
//			@Override
//			public TextStyle defaultTextStyle() {
//				TextStyle textStyle = new TextStyle();
//				textStyle.setColor(new RGB(221, 212, 88));
//				textStyle.setStyle(SWT.BOLD);
//				return textStyle;
//			}
//		};
//		return ttd;
//	}
//
//	TokenTypeDef gr�n() {
//		TokenTypeDef ttd = new TokenTypeDef("gr�n", "GR�N") {
//			@Override
//			public boolean match(LeafNode node) {
//				return keyWordTokenType().match(node) && "GR�N".equals(node.getText());
//			}
//
//			@Override
//			public TextStyle defaultTextStyle() {
//				TextStyle textStyle = new TextStyle();
//				textStyle.setColor(new RGB(10, 200, 10));
//				textStyle.setStyle(SWT.BOLD);
//				return textStyle;
//			}
//		};
//		return ttd;
//	}
//
//}
