/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.ui.core.editor.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.core.editor.XtextEditor;
import org.eclipse.xtext.ui.core.editor.utils.ValidationJob;
import org.eclipse.xtext.validator.CheckMode;

/**
 * @author Dennis H�bner - Initial contribution and API
 * 
 */
public class ValidateActionHandler extends AbstractHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
	 * ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Due to an Handler ExtensionPoint declaration, we have an XtextEditor
		// as Active Editor so can just cast to an XtextEditor
		XtextEditor editor = (XtextEditor) HandlerUtil.getActiveEditor(event);
		new ValidationJob(editor, CheckMode.ALL).schedule();
		return this;
	}

}
