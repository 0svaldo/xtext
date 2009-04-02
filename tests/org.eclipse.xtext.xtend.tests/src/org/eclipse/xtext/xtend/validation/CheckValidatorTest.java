/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.xtend.validation;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.testlanguages.TreeTestLanguageStandaloneSetup;

/**
 * @author Sven Efftinge - Initial contribution and API
 * 
 */
public class CheckValidatorTest extends AbstractXtextTests {

	public void testErrorValidation() throws Exception {
		with(new TreeTestLanguageStandaloneSetup());
		EObject model = getModel("foo ('A') { a('A'){}; b('A'){}; c('A'){}; d('A'){}; e('A'){}; };");
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(model);
		assertEquals(diagnostic.toString(), 1, diagnostic.getChildren().size());
		diagnostic = diagnostic.getChildren().get(0);
		assertEquals("children", diagnostic.getData().get(1));
		assertTrue(diagnostic.getSeverity() == Diagnostic.ERROR);
	}

	public void testWarningValidation() throws Exception {
		with(new TreeTestLanguageStandaloneSetup());
		EObject model = getModel("foo ('A') { a('A'){}; b('A'){}; c('A'){}; };");
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(model);
		assertEquals(diagnostic.toString(), 1, diagnostic.getChildren().size());
		diagnostic = diagnostic.getChildren().get(0);
		assertNull(diagnostic.getData().get(1)); // no feature
		assertTrue(diagnostic.getSeverity() == Diagnostic.WARNING);
	}
}
