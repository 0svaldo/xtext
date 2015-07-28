/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.idea.trace;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFile;
import org.eclipse.xtext.generator.trace.SourceRelativeURI;
import org.eclipse.xtext.generator.trace.internal.AbstractTrace;
import org.eclipse.xtext.generator.trace.internal.LocationInResource;
import org.eclipse.xtext.idea.trace.ILocationInVirtualFile;
import org.eclipse.xtext.idea.trace.VirtualFileBasedTrace;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class LocationInVirtualFile extends LocationInResource implements ILocationInVirtualFile {
  public LocationInVirtualFile(final int offset, final int length, final int lineNumber, final int endLineNumber, final SourceRelativeURI srcRelativeResourceURI, final VirtualFileBasedTrace trace) {
    super(offset, length, lineNumber, endLineNumber, srcRelativeResourceURI, trace);
  }
  
  @Override
  public VirtualFileBasedTrace getTrace() {
    AbstractTrace _trace = super.getTrace();
    return ((VirtualFileBasedTrace) _trace);
  }
  
  @Override
  public VirtualFile getPlatformResource() {
    VirtualFileBasedTrace _trace = this.getTrace();
    SourceRelativeURI _srcRelativeResourceURI = this.getSrcRelativeResourceURI();
    Module _project = this.getProject();
    return _trace.findVirtualFile(_srcRelativeResourceURI, _project);
  }
  
  @Override
  public Module getProject() {
    VirtualFileBasedTrace _trace = this.getTrace();
    return _trace.getLocalProject();
  }
}
