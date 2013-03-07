/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.core.macro.declaration;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.macro.declaration.CompilationUnitImpl;
import org.eclipse.xtend.core.macro.declaration.XtendTypeDeclarationImpl;
import org.eclipse.xtend.core.macro.declaration.XtendTypeParameterDeclarationImpl;
import org.eclipse.xtend.core.xtend.XtendInterface;
import org.eclipse.xtend.lib.macro.declaration.InterfaceDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeParameterDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class XtendInterfaceDeclarationImpl extends XtendTypeDeclarationImpl<XtendInterface> implements InterfaceDeclaration {
  public List<TypeReference> getSuperInterfaces() {
    XtendInterface _delegate = this.getDelegate();
    EList<JvmTypeReference> _extends = _delegate.getExtends();
    final Function1<JvmTypeReference,TypeReference> _function = new Function1<JvmTypeReference,TypeReference>() {
        public TypeReference apply(final JvmTypeReference it) {
          CompilationUnitImpl _compilationUnit = XtendInterfaceDeclarationImpl.this.getCompilationUnit();
          TypeReference _typeReference = _compilationUnit.toTypeReference(it);
          return _typeReference;
        }
      };
    List<TypeReference> _map = ListExtensions.<JvmTypeReference, TypeReference>map(_extends, _function);
    return _map;
  }
  
  public List<? extends TypeParameterDeclaration> getTypeParameters() {
    XtendInterface _delegate = this.getDelegate();
    EList<JvmTypeParameter> _typeParameters = _delegate.getTypeParameters();
    final Function1<JvmTypeParameter,XtendTypeParameterDeclarationImpl> _function = new Function1<JvmTypeParameter,XtendTypeParameterDeclarationImpl>() {
        public XtendTypeParameterDeclarationImpl apply(final JvmTypeParameter it) {
          CompilationUnitImpl _compilationUnit = XtendInterfaceDeclarationImpl.this.getCompilationUnit();
          XtendTypeParameterDeclarationImpl _xtendTypeParameterDeclaration = _compilationUnit.toXtendTypeParameterDeclaration(it);
          return _xtendTypeParameterDeclaration;
        }
      };
    List<XtendTypeParameterDeclarationImpl> _map = ListExtensions.<JvmTypeParameter, XtendTypeParameterDeclarationImpl>map(_typeParameters, _function);
    return _map;
  }
}
