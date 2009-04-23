/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.ui.common.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.xtext.ui.common.editor.contentassist.impl.JavaContentAssistProcessorTest;
import org.eclipse.xtext.ui.common.editor.hyperlinking.HyperlinkHelperTest;
import org.eclipse.xtext.ui.common.editor.outline.impl.DefaultSemanticModelTransformerTest;

/**
 * @author Dennis H�bner - Initial contribution and API
 *
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xtext.ui.common.tests");
		// $JUnit-BEGIN$
		suite.addTestSuite(JavaContentAssistProcessorTest.class);
		suite.addTestSuite(DefaultSemanticModelTransformerTest.class);
		suite.addTestSuite(HyperlinkHelperTest.class);
		// $JUnit-END$
		return suite;
	}

}
