/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.core.macro.declaration;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.macro.declaration.AbstractDeclarationImpl;
import org.eclipse.xtend.core.macro.declaration.CompilationUnitImpl;
import org.eclipse.xtend.lib.macro.declaration.MemberDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeParameterDeclaration;
import org.eclipse.xtend.lib.macro.declaration.Visibility;
import org.eclipse.xtend.lib.macro.type.TypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TypeParameterDeclartionImpl extends AbstractDeclarationImpl<JvmTypeParameter> implements TypeParameterDeclaration {
  public List<TypeReference> getUpperBounds() {
    JvmTypeParameter _delegate = this.getDelegate();
    EList<JvmTypeConstraint> _constraints = _delegate.getConstraints();
    Iterable<JvmUpperBound> _filter = Iterables.<JvmUpperBound>filter(_constraints, JvmUpperBound.class);
    final Function1<JvmUpperBound,TypeReference> _function = new Function1<JvmUpperBound,TypeReference>() {
        public TypeReference apply(final JvmUpperBound it) {
          CompilationUnitImpl _compilationUnit = TypeParameterDeclartionImpl.this.getCompilationUnit();
          JvmTypeReference _typeReference = it.getTypeReference();
          TypeReference _typeReference_1 = _compilationUnit.toTypeReference(_typeReference);
          return _typeReference_1;
        }
      };
    Iterable<TypeReference> _map = IterableExtensions.<JvmUpperBound, TypeReference>map(_filter, _function);
    List<TypeReference> _list = IterableExtensions.<TypeReference>toList(_map);
    return _list;
  }
  
  public List<? extends MemberDeclaration> getMembers() {
    List<MemberDeclaration> _emptyList = CollectionLiterals.<MemberDeclaration>emptyList();
    return _emptyList;
  }
  
  public String getPackageName() {
    return null;
  }
  
  public String getSimpleName() {
    JvmTypeParameter _delegate = this.getDelegate();
    String _name = _delegate.getName();
    return _name;
  }
  
  public String getName() {
    JvmTypeParameter _delegate = this.getDelegate();
    String _name = _delegate.getName();
    return _name;
  }
  
  public TypeDeclaration getDeclaringType() {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  public String getDocComment() {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  public Visibility getVisibility() {
    return Visibility.PRIVATE;
  }
}
