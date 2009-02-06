/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtend.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Jan K�hnlein - Initial contribution and API
 */
public class PluginTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xtext.xtend.tests");
		//$JUnit-BEGIN$
		suite.addTest(org.eclipse.xtext.xtend.contentassist.AllTests.suite());
		suite.addTest(org.eclipse.xtext.xtend.crossref.AllTests.suite());		
		//$JUnit-END$
		return suite;
	}

}
