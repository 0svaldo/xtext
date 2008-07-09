/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipe.xtext.automated.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.rcpquickstart.bundletestcollector.BundleTestCollector;

/**
 * @author Jan K�hnlein - Initial contribution and API
 *
 */
public class AllUITests {

	private static final String[] TEST_BUNDLES = new String[] {
		"org.eclipse.xtext.ui.tests"
	};
	
	public static Test suite() {
		BundleTestCollector bundleTestCollector = new BundleTestCollector();
		TestSuite allTests = new TestSuite("AllUITests");
		for (String testBundle: TEST_BUNDLES) {
			TestSuite bundleTestSuite = new TestSuite(testBundle);
			bundleTestCollector.collectTests(bundleTestSuite, testBundle, "", "*");
			allTests.addTest(bundleTestSuite);
		}
		return allTests;
	}
	
}
