/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.core.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class ReadonlyFileStorage extends ReadonlyStorage {

	private final File file;

	public ReadonlyFileStorage(File file, URI uri) throws IOException {
		super(URI.createURI(uri.scheme()+ ":" +uri.devicePath()));
		this.file = file;
		if (!file.exists() || file.isDirectory())
			throw new IOException("file does not exist or is a directory: " + file.getCanonicalPath());
	}

	public InputStream getContents() throws CoreException {
		try {
			return new FileInputStream(file);
		}
		catch (FileNotFoundException e) {
			throw new WrappedException(e);
		}
	}

	public IPath getFullPath() {
		return new Path(getURI().toString());
	}

	public String getName() {
		return file.getName();
	}

}
