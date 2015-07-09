/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.EqualsHashCode;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@EqualsHashCode
@SuppressWarnings("all")
public class TypeReference {
  public static TypeReference typeRef(final String name, final String... arguments) {
    final Function1<String, TypeReference> _function = new Function1<String, TypeReference>() {
      @Override
      public TypeReference apply(final String it) {
        return new TypeReference(it);
      }
    };
    List<TypeReference> _map = ListExtensions.<String, TypeReference>map(((List<String>)Conversions.doWrapArray(arguments)), _function);
    return new TypeReference(name, _map);
  }
  
  public static TypeReference typeRef(final Class<?> clazz, final Class<?>... arguments) {
    final Function1<Class<?>, TypeReference> _function = new Function1<Class<?>, TypeReference>() {
      @Override
      public TypeReference apply(final Class<?> it) {
        return new TypeReference(it);
      }
    };
    List<TypeReference> _map = ListExtensions.<Class<?>, TypeReference>map(((List<Class<?>>)Conversions.doWrapArray(arguments)), _function);
    return new TypeReference(clazz, _map);
  }
  
  private final static Pattern PACKAGE_MATCHER = Pattern.compile("[a-z][a-zA-Z0-9_]*(\\.[a-z][a-zA-Z0-9_]*)*");
  
  private final static Pattern CLASS_MATCHER = Pattern.compile("[A-Z][a-zA-Z0-9_]*(\\.[A-Z][a-zA-Z0-9_]*)*");
  
  private final String packageName;
  
  private final List<String> simpleNames;
  
  private final List<TypeReference> typeArguments;
  
  public TypeReference(final String qualifiedName) {
    this(qualifiedName, ((List<TypeReference>) null));
  }
  
  public TypeReference(final String qualifiedName, final List<TypeReference> arguments) {
    this(TypeReference.getPackageName(qualifiedName), TypeReference.getClassName(qualifiedName), arguments);
  }
  
  public TypeReference(final String packageName, final String className) {
    this(packageName, className, null);
  }
  
  public TypeReference(final String packageName, final String className, final List<TypeReference> arguments) {
    boolean _or = false;
    if ((packageName == null)) {
      _or = true;
    } else {
      Matcher _matcher = TypeReference.PACKAGE_MATCHER.matcher(packageName);
      boolean _matches = _matcher.matches();
      boolean _not = (!_matches);
      _or = _not;
    }
    if (_or) {
      throw new IllegalArgumentException(("Invalid package name: " + packageName));
    }
    boolean _or_1 = false;
    if ((className == null)) {
      _or_1 = true;
    } else {
      Matcher _matcher_1 = TypeReference.CLASS_MATCHER.matcher(className);
      boolean _matches_1 = _matcher_1.matches();
      boolean _not_1 = (!_matches_1);
      _or_1 = _not_1;
    }
    if (_or_1) {
      throw new IllegalArgumentException(("Invalid class name: " + className));
    }
    this.packageName = packageName;
    String[] _split = className.split("\\.");
    this.simpleNames = ((List<String>)Conversions.doWrapArray(_split));
    List<TypeReference> _elvis = null;
    if (arguments != null) {
      _elvis = arguments;
    } else {
      List<TypeReference> _emptyList = Collections.<TypeReference>emptyList();
      _elvis = _emptyList;
    }
    this.typeArguments = _elvis;
  }
  
  public TypeReference(final Class<?> clazz) {
    this(clazz, null);
  }
  
  public TypeReference(final Class<?> clazz, final List<TypeReference> arguments) {
    boolean _isPrimitive = clazz.isPrimitive();
    if (_isPrimitive) {
      String _name = clazz.getName();
      String _plus = ("Type is primitive: " + _name);
      throw new IllegalArgumentException(_plus);
    }
    boolean _isAnonymousClass = clazz.isAnonymousClass();
    if (_isAnonymousClass) {
      String _name_1 = clazz.getName();
      String _plus_1 = ("Class is anonymous: " + _name_1);
      throw new IllegalArgumentException(_plus_1);
    }
    boolean _isLocalClass = clazz.isLocalClass();
    if (_isLocalClass) {
      String _name_2 = clazz.getName();
      String _plus_2 = ("Class is local: " + _name_2);
      throw new IllegalArgumentException(_plus_2);
    }
    Package _package = clazz.getPackage();
    String _name_3 = _package.getName();
    this.packageName = _name_3;
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
    this.simpleNames = _newArrayList;
    List<TypeReference> _elvis = null;
    if (arguments != null) {
      _elvis = arguments;
    } else {
      List<TypeReference> _emptyList = Collections.<TypeReference>emptyList();
      _elvis = _emptyList;
    }
    this.typeArguments = _elvis;
    Class<?> c = clazz;
    do {
      {
        String _simpleName = c.getSimpleName();
        this.simpleNames.add(0, _simpleName);
        Class<?> _declaringClass = c.getDeclaringClass();
        c = _declaringClass;
      }
    } while((c != null));
  }
  
  private static String getPackageName(final String qualifiedName) {
    int packageEnd = qualifiedName.length();
    for (int i = (qualifiedName.length() - 1); (i >= 0); i--) {
      char _charAt = qualifiedName.charAt(i);
      boolean _matches = TypeReference.matches(_charAt, '.');
      if (_matches) {
        char _charAt_1 = qualifiedName.charAt((i + 1));
        boolean _isLowerCase = Character.isLowerCase(_charAt_1);
        if (_isLowerCase) {
          return qualifiedName.substring(0, packageEnd);
        } else {
          packageEnd = i;
        }
      }
    }
    return null;
  }
  
  private static String getClassName(final String qualifiedName) {
    int classStart = qualifiedName.length();
    for (int i = (qualifiedName.length() - 1); (i >= 0); i--) {
      char _charAt = qualifiedName.charAt(i);
      boolean _matches = TypeReference.matches(_charAt, '.');
      if (_matches) {
        char _charAt_1 = qualifiedName.charAt((i + 1));
        boolean _isLowerCase = Character.isLowerCase(_charAt_1);
        if (_isLowerCase) {
          return qualifiedName.substring(classStart);
        } else {
          classStart = (i + 1);
        }
      }
    }
    return null;
  }
  
  private static boolean matches(final char c1, final char c2) {
    return (c1 == c2);
  }
  
  @Override
  public String toString() {
    String _name = this.getName();
    final Function1<TypeReference, CharSequence> _function = new Function1<TypeReference, CharSequence>() {
      @Override
      public CharSequence apply(final TypeReference it) {
        return it.toString();
      }
    };
    String _join = IterableExtensions.<TypeReference>join(this.typeArguments, "<", ", ", ">", _function);
    return (_name + _join);
  }
  
  public String getName() {
    String _join = IterableExtensions.join(this.simpleNames, ".");
    return ((this.packageName + ".") + _join);
  }
  
  public String getSimpleName() {
    return IterableExtensions.<String>last(this.simpleNames);
  }
  
  public String getPath() {
    String _replace = this.packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _head = IterableExtensions.<String>head(this.simpleNames);
    return (_plus + _head);
  }
  
  @Pure
  public String getPackageName() {
    return this.packageName;
  }
  
  @Pure
  public List<String> getSimpleNames() {
    return this.simpleNames;
  }
  
  @Pure
  public List<TypeReference> getTypeArguments() {
    return this.typeArguments;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    TypeReference other = (TypeReference) obj;
    if (this.packageName == null) {
      if (other.packageName != null)
        return false;
    } else if (!this.packageName.equals(other.packageName))
      return false;
    if (this.simpleNames == null) {
      if (other.simpleNames != null)
        return false;
    } else if (!this.simpleNames.equals(other.simpleNames))
      return false;
    if (this.typeArguments == null) {
      if (other.typeArguments != null)
        return false;
    } else if (!this.typeArguments.equals(other.typeArguments))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.packageName== null) ? 0 : this.packageName.hashCode());
    result = prime * result + ((this.simpleNames== null) ? 0 : this.simpleNames.hashCode());
    result = prime * result + ((this.typeArguments== null) ? 0 : this.typeArguments.hashCode());
    return result;
  }
}
