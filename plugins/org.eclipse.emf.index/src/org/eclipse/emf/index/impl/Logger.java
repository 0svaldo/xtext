/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.index.impl;

/**
 * @author Jan K�hnlein - Initial contribution and API
 */
public class Logger {

	public static final void logError(String message, Throwable t) {
		// TODO: Activator
		System.err.println(message);
		t.printStackTrace();
	}

	public static final void logError(String message) {
		// TODO: Activator
		System.err.println(message);
	}
}
