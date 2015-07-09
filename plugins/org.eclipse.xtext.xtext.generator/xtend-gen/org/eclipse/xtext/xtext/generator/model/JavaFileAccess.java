/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.model;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.model.IClassAnnotation;
import org.eclipse.xtext.xtext.generator.model.TextFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

@SuppressWarnings("all")
public class JavaFileAccess extends TextFileAccess {
  private static class JavaStringConcatenation extends StringConcatenation {
    private final JavaFileAccess access;
    
    public JavaStringConcatenation(final JavaFileAccess access) {
      super(access.codeConfig.getLineDelimiter());
      this.access = access;
    }
    
    @Override
    public String getStringRepresentation(final Object object) {
      String _xifexpression = null;
      if ((object instanceof TypeReference)) {
        _xifexpression = this.access.importType(((TypeReference)object));
      } else {
        String _xifexpression_1 = null;
        if ((object instanceof Class<?>)) {
          TypeReference _typeReference = new TypeReference(((Class<?>)object));
          _xifexpression_1 = this.access.importType(_typeReference);
        } else {
          _xifexpression_1 = object.toString();
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    }
  }
  
  private final Map<String, String> imports = CollectionLiterals.<String, String>newHashMap();
  
  private final TypeReference javaType;
  
  private final CodeConfig codeConfig;
  
  @Accessors
  private CharSequence typeComment;
  
  @Accessors
  private boolean markedAsGenerated;
  
  @Accessors
  private final List<IClassAnnotation> annotations = CollectionLiterals.<IClassAnnotation>newArrayList();
  
  public JavaFileAccess(final String qualifiedName, final CodeConfig codeConfig) {
    this(new TypeReference(qualifiedName), codeConfig);
  }
  
  public JavaFileAccess(final TypeReference typeRef, final CodeConfig codeConfig) {
    List<String> _simpleNames = typeRef.getSimpleNames();
    int _length = ((Object[])Conversions.unwrapArray(_simpleNames, Object.class)).length;
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      throw new IllegalArgumentException(("Nested type cannot be serialized: " + typeRef));
    }
    this.javaType = typeRef;
    this.codeConfig = codeConfig;
    String _path = typeRef.getPath();
    String _plus = (_path + ".");
    String _fileExtension = this.getFileExtension();
    String _plus_1 = (_plus + _fileExtension);
    this.setPath(_plus_1);
  }
  
  protected String getFileExtension() {
    return "java";
  }
  
  public String importType(final TypeReference typeRef) {
    final List<String> simpleNames = typeRef.getSimpleNames();
    String usableName = null;
    boolean _or = false;
    String _packageName = typeRef.getPackageName();
    boolean _equals = Objects.equal(_packageName, "java.lang");
    if (_equals) {
      _or = true;
    } else {
      String _packageName_1 = typeRef.getPackageName();
      String _packageName_2 = this.javaType.getPackageName();
      boolean _equals_1 = Objects.equal(_packageName_1, _packageName_2);
      _or = _equals_1;
    }
    if (_or) {
      String _join = IterableExtensions.join(simpleNames, ".");
      usableName = _join;
    } else {
      boolean found = false;
      for (int i = (((Object[])Conversions.unwrapArray(simpleNames, Object.class)).length - 1); ((i >= 0) && (!found)); i--) {
        {
          final String simpleName = simpleNames.get(i);
          if ((usableName == null)) {
            usableName = simpleName;
          } else {
            usableName = ((simpleName + ".") + usableName);
          }
          boolean _and = false;
          boolean _isJavaDefaultType = CodeGenUtil.isJavaDefaultType(simpleName);
          boolean _not = (!_isJavaDefaultType);
          if (!_not) {
            _and = false;
          } else {
            boolean _and_1 = false;
            boolean _and_2 = false;
            int _length = ((Object[])Conversions.unwrapArray(simpleNames, Object.class)).length;
            int _minus = (_length - 1);
            boolean _equals_2 = (i == _minus);
            if (!_equals_2) {
              _and_2 = false;
            } else {
              _and_2 = (i > 0);
            }
            if (!_and_2) {
              _and_1 = false;
            } else {
              int _length_1 = simpleName.length();
              boolean _lessEqualsThan = (_length_1 <= 8);
              _and_1 = _lessEqualsThan;
            }
            boolean _not_1 = (!_and_1);
            _and = _not_1;
          }
          if (_and) {
            String _packageName_3 = typeRef.getPackageName();
            String _plus = (_packageName_3 + ".");
            List<String> _subList = simpleNames.subList(0, (i + 1));
            String _join_1 = IterableExtensions.join(_subList, ".");
            final String importable = (_plus + _join_1);
            final String imported = this.imports.get(usableName);
            if ((imported == null)) {
              this.imports.put(usableName, importable);
              found = true;
            } else {
              boolean _equals_3 = Objects.equal(imported, importable);
              if (_equals_3) {
                found = true;
              }
            }
          }
        }
      }
      if ((!found)) {
        String _name = typeRef.getName();
        usableName = _name;
      }
    }
    List<TypeReference> _typeArguments = typeRef.getTypeArguments();
    final Function1<TypeReference, CharSequence> _function = new Function1<TypeReference, CharSequence>() {
      @Override
      public CharSequence apply(final TypeReference it) {
        return JavaFileAccess.this.importType(it);
      }
    };
    String _join_1 = IterableExtensions.<TypeReference>join(_typeArguments, "<", ", ", ">", _function);
    return (usableName + _join_1);
  }
  
  public void setJavaContent(final StringConcatenationClient javaContent) {
    final JavaFileAccess.JavaStringConcatenation javaStringConcat = new JavaFileAccess.JavaStringConcatenation(this);
    javaStringConcat.append(javaContent);
    this.setContent(javaStringConcat);
  }
  
  protected boolean appendSemicolons() {
    return true;
  }
  
  @Override
  public CharSequence generate() {
    List<IClassAnnotation> _classAnnotations = this.codeConfig.getClassAnnotations();
    final Function1<IClassAnnotation, Boolean> _function = new Function1<IClassAnnotation, Boolean>() {
      @Override
      public Boolean apply(final IClassAnnotation it) {
        return Boolean.valueOf(it.appliesTo(JavaFileAccess.this));
      }
    };
    Iterable<IClassAnnotation> _filter = IterableExtensions.<IClassAnnotation>filter(_classAnnotations, _function);
    final Iterable<IClassAnnotation> classAnnotations = Iterables.<IClassAnnotation>concat(this.annotations, _filter);
    final Procedure1<IClassAnnotation> _function_1 = new Procedure1<IClassAnnotation>() {
      @Override
      public void apply(final IClassAnnotation it) {
        TypeReference _annotationImport = it.getAnnotationImport();
        JavaFileAccess.this.importType(_annotationImport);
      }
    };
    IterableExtensions.<IClassAnnotation>forEach(classAnnotations, _function_1);
    Collection<String> _values = this.imports.values();
    final ArrayList<String> sortedImports = Lists.<String>newArrayList(_values);
    Collections.<String>sort(sortedImports);
    StringConcatenation _builder = new StringConcatenation();
    String _fileHeader = this.codeConfig.getFileHeader();
    _builder.append(_fileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packageName = this.javaType.getPackageName();
    _builder.append(_packageName, "");
    {
      boolean _appendSemicolons = this.appendSemicolons();
      if (_appendSemicolons) {
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      for(final String importName : sortedImports) {
        _builder.append("import ");
        _builder.append(importName, "");
        {
          boolean _appendSemicolons_1 = this.appendSemicolons();
          if (_appendSemicolons_1) {
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append(this.typeComment, "");
    _builder.newLineIfNotEmpty();
    {
      for(final IClassAnnotation annot : classAnnotations) {
        CharSequence _generate = annot.generate();
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence _content = this.getContent();
    _builder.append(_content, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Pure
  public CharSequence getTypeComment() {
    return this.typeComment;
  }
  
  public void setTypeComment(final CharSequence typeComment) {
    this.typeComment = typeComment;
  }
  
  @Pure
  public boolean isMarkedAsGenerated() {
    return this.markedAsGenerated;
  }
  
  public void setMarkedAsGenerated(final boolean markedAsGenerated) {
    this.markedAsGenerated = markedAsGenerated;
  }
  
  @Pure
  public List<IClassAnnotation> getAnnotations() {
    return this.annotations;
  }
}
