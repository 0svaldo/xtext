/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtend.crossref;

import static org.eclipse.xtext.util.CollectionUtils.list;
import static org.eclipse.xtext.util.CollectionUtils.map;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.crossref.IScope;
import org.eclipse.xtext.crossref.IScopeProvider;
import org.eclipse.xtext.crossref.IScopedElement;
import org.eclipse.xtext.testlanguages.ReferenceGrammarTestLanguageStandaloneSetup;
import org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.Familie;
import org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.ReferenceGrammarFactory;
import org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.ReferenceGrammarPackage;
import org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.Spielplatz;
import org.eclipse.xtext.tests.AbstractGeneratorTest;
import org.eclipse.xtext.util.Function;

/**
 * @author Jan K�hnlein - Initial contribution and API
 */
public class CrossrefTest extends AbstractGeneratorTest {

	public void testCrossRef() throws Exception {
		EPackage.Registry.INSTANCE.put(ReferenceGrammarPackage.eNS_URI, ReferenceGrammarPackage.eINSTANCE);
		with(ReferenceGrammarTestLanguageStandaloneSetup.class);
		Spielplatz model = (Spielplatz) getModel("spielplatz 1 \"SpielplatzBeschreibung\" { kind(k1 0) kind(k2 0) erwachsener(v1 1) erwachsener(m1 1) }");
		Familie familie = ReferenceGrammarFactory.eINSTANCE.createFamilie();
		model.getFamilie().add(familie);

		assertInScope(familie, ReferenceGrammarPackage.Literals.FAMILIE__KINDER, "k1", "k2");
		assertInScope(familie, ReferenceGrammarPackage.Literals.FAMILIE__VATER, "v1", "m1");
		assertInScope(familie, ReferenceGrammarPackage.Literals.FAMILIE__MUTTER, "v1", "m1");
	}

	private void assertInScope(Familie familie, EReference eReference, String... names) {
		IScopeProvider scopeProvider = getScopeProvider();
		assertTrue(scopeProvider instanceof AbstractXtendScopeProvider);
		IScope scope = scopeProvider.getScope(familie, eReference);
		List<String> namesInScope = list(map(scope.getContents(), new Function<IScopedElement, String>() {
			public String exec(IScopedElement param) {
				return param.name();
			}
		}));
		assertTrue(namesInScope.size() == 2);
		for(String name : names){
			assertTrue(namesInScope.contains(name));
		}
	}
}
