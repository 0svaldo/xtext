/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext;

import org.eclipse.emf.mwe.core.WorkflowFacade;

/**
 * Generates all test and example languages.
 *
 * @author Jan K�hnlein - Initial contribution and API
 */
public class GenerateAllLanguages {

	public static void main(String... args) {
		try {
			new WorkflowFacade("org/eclipse/xtext/GenerateAllLanguages.mwe").run();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
