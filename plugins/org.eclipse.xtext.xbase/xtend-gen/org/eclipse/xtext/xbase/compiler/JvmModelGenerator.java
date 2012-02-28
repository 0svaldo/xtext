package org.eclipse.xtext.xbase.compiler;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmBooleanAnnotationValue;
import org.eclipse.xtext.common.types.JvmByteAnnotationValue;
import org.eclipse.xtext.common.types.JvmCharAnnotationValue;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmDoubleAnnotationValue;
import org.eclipse.xtext.common.types.JvmEnumAnnotationValue;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFloatAnnotationValue;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmIntAnnotationValue;
import org.eclipse.xtext.common.types.JvmLongAnnotationValue;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmShortAnnotationValue;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.Wrapper;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.CompilationStrategyAdapter;
import org.eclipse.xtext.xbase.compiler.DocumentationAdapter;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.compiler.output.TreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * A generator implementation that processes the
 * derived {@link org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer JVM model}
 * and produces the respective java code.
 */
@SuppressWarnings("all")
public class JvmModelGenerator implements IGenerator {
  @Inject
  private ILogicalContainerProvider _iLogicalContainerProvider;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private XbaseCompiler compiler;
  
  @Inject
  private TypeReferenceSerializer typeRefSerializer;
  
  @Inject
  private ILocationInFileProvider locationProvider;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    for (final EObject obj : _contents) {
      this.internalDoGenerate(obj, fsa);
    }
  }
  
  protected void _internalDoGenerate(final EObject obj, final IFileSystemAccess fsa) {
  }
  
  protected void _internalDoGenerate(final JvmGenericType type, final IFileSystemAccess fsa) {
    String _qualifiedName = type.getQualifiedName();
    String _replace = _qualifiedName.replace(".", "/");
    String _plus = (_replace + ".java");
    CharSequence _generateType = this.generateType(type);
    fsa.generateFile(_plus, _generateType);
  }
  
  protected void _internalDoGenerate(final JvmEnumerationType type, final IFileSystemAccess fsa) {
    String _qualifiedName = type.getQualifiedName();
    String _replace = _qualifiedName.replace(".", "/");
    String _plus = (_replace + ".java");
    CharSequence _generateType = this.generateType(type);
    fsa.generateFile(_plus, _generateType);
  }
  
  public CharSequence generateType(final JvmDeclaredType type) {
    ImportManager _importManager = new ImportManager(true, type);
    final ImportManager importManager = _importManager;
    TreeAppendable _createAppendable = this.createAppendable(type, importManager);
    final TreeAppendable bodyAppendable = _createAppendable;
    this.generateBody(type, bodyAppendable);
    TreeAppendable _createAppendable_1 = this.createAppendable(type, importManager);
    final TreeAppendable importAppendable = _createAppendable_1;
    String _packageName = type.getPackageName();
    boolean _notEquals = (!Objects.equal(_packageName, null));
    if (_notEquals) {
      ITreeAppendable _append = importAppendable.append("package ");
      String _packageName_1 = type.getPackageName();
      ITreeAppendable _append_1 = _append.append(_packageName_1);
      _append_1.append(";");
      TreeAppendable _newLine = importAppendable.newLine();
      _newLine.newLine();
    }
    List<String> _imports = importManager.getImports();
    for (final String i : _imports) {
      ITreeAppendable _append_2 = importAppendable.append("import ");
      ITreeAppendable _append_3 = _append_2.append(i);
      ITreeAppendable _append_4 = _append_3.append(";");
      _append_4.newLine();
    }
    List<String> _imports_1 = importManager.getImports();
    boolean _isEmpty = _imports_1.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      importAppendable.newLine();
    }
    importAppendable.append(bodyAppendable);
    return importAppendable;
  }
  
  protected ITreeAppendable _generateBody(final JvmGenericType it, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      this.generateJavaDoc(it, appendable);
      this.generateAnnotations(it, appendable, true);
      this.generateModifier(it, appendable);
      boolean _isInterface = it.isInterface();
      if (_isInterface) {
        appendable.append("interface ");
      } else {
        appendable.append("class ");
      }
      String _simpleName = it.getSimpleName();
      appendable.append(_simpleName);
      this.generateTypeParameterDeclaration(it, appendable);
      appendable.append(" ");
      this.generateExtendsClause(it, appendable);
      appendable.append("{");
      Wrapper<Boolean> _wrap = Wrapper.<Boolean>wrap(Boolean.valueOf(true));
      final Wrapper<Boolean> b = _wrap;
      EList<JvmMember> _members = it.getMembers();
      final Procedure1<JvmMember> _function = new Procedure1<JvmMember>() {
          public void apply(final JvmMember it) {
            ITreeAppendable _trace = appendable.trace(it);
            Boolean _get = b.get();
            boolean _generateMember = JvmModelGenerator.this.generateMember(it, _trace, (_get).booleanValue());
            b.set(Boolean.valueOf(_generateMember));
          }
        };
      IterableExtensions.<JvmMember>forEach(_members, _function);
      ITreeAppendable _newLine = appendable.newLine();
      ITreeAppendable _append = _newLine.append("}");
      ITreeAppendable _newLine_1 = _append.newLine();
      _xblockexpression = (_newLine_1);
    }
    return _xblockexpression;
  }
  
  protected ITreeAppendable _generateBody(final JvmEnumerationType it, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      this.generateJavaDoc(it, appendable);
      this.generateAnnotations(it, appendable, true);
      this.generateModifier(it, appendable);
      appendable.append("enum ");
      String _simpleName = it.getSimpleName();
      appendable.append(_simpleName);
      appendable.append(" ");
      this.generateExtendsClause(it, appendable);
      appendable.append("{");
      Wrapper<Boolean> _wrap = Wrapper.<Boolean>wrap(Boolean.valueOf(true));
      final Wrapper<Boolean> b = _wrap;
      EList<JvmEnumerationLiteral> _literals = it.getLiterals();
      final Procedure1<JvmEnumerationLiteral> _function = new Procedure1<JvmEnumerationLiteral>() {
          public void apply(final JvmEnumerationLiteral it) {
            ITreeAppendable _trace = appendable.trace(it);
            Boolean _get = b.get();
            boolean _generateEnumLiteral = JvmModelGenerator.this.generateEnumLiteral(it, _trace, (_get).booleanValue());
            b.set(Boolean.valueOf(_generateEnumLiteral));
          }
        };
      IterableExtensions.<JvmEnumerationLiteral>forEach(_literals, _function);
      EList<JvmMember> _members = it.getMembers();
      final Function1<JvmMember,Boolean> _function_1 = new Function1<JvmMember,Boolean>() {
          public Boolean apply(final JvmMember it) {
            boolean _not = (!(it instanceof JvmEnumerationLiteral));
            return Boolean.valueOf(_not);
          }
        };
      Iterable<JvmMember> _filter = IterableExtensions.<JvmMember>filter(_members, _function_1);
      final Procedure1<JvmMember> _function_2 = new Procedure1<JvmMember>() {
          public void apply(final JvmMember it) {
            ITreeAppendable _trace = appendable.trace(it);
            Boolean _get = b.get();
            boolean _generateMember = JvmModelGenerator.this.generateMember(it, _trace, (_get).booleanValue());
            b.set(Boolean.valueOf(_generateMember));
          }
        };
      IterableExtensions.<JvmMember>forEach(_filter, _function_2);
      ITreeAppendable _newLine = appendable.newLine();
      ITreeAppendable _append = _newLine.append("}");
      ITreeAppendable _newLine_1 = _append.newLine();
      _xblockexpression = (_newLine_1);
    }
    return _xblockexpression;
  }
  
  protected ITreeAppendable _generateModifier(final JvmDeclaredType it, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      JvmVisibility _visibility = it.getVisibility();
      String _javaName = this.javaName(_visibility);
      appendable.append(_javaName);
      boolean _isAbstract = it.isAbstract();
      if (_isAbstract) {
        appendable.append("abstract ");
      }
      boolean _isStatic = it.isStatic();
      if (_isStatic) {
        appendable.append("static ");
      }
      ITreeAppendable _xifexpression = null;
      boolean _isFinal = it.isFinal();
      if (_isFinal) {
        ITreeAppendable _append = appendable.append("final ");
        _xifexpression = _append;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected ITreeAppendable _generateModifier(final JvmField it, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      JvmVisibility _visibility = it.getVisibility();
      String _javaName = this.javaName(_visibility);
      appendable.append(_javaName);
      boolean _isFinal = it.isFinal();
      if (_isFinal) {
        appendable.append("final ");
      }
      ITreeAppendable _xifexpression = null;
      boolean _isStatic = it.isStatic();
      if (_isStatic) {
        ITreeAppendable _append = appendable.append("static ");
        _xifexpression = _append;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected ITreeAppendable _generateModifier(final JvmOperation it, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      JvmVisibility _visibility = it.getVisibility();
      String _javaName = this.javaName(_visibility);
      appendable.append(_javaName);
      boolean _isAbstract = it.isAbstract();
      if (_isAbstract) {
        appendable.append("abstract ");
      }
      boolean _isStatic = it.isStatic();
      if (_isStatic) {
        appendable.append("static ");
      }
      ITreeAppendable _xifexpression = null;
      boolean _isFinal = it.isFinal();
      if (_isFinal) {
        ITreeAppendable _append = appendable.append("final ");
        _xifexpression = _append;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected ITreeAppendable _generateModifier(final JvmConstructor it, final ITreeAppendable appendable) {
    JvmVisibility _visibility = it.getVisibility();
    String _javaName = this.javaName(_visibility);
    ITreeAppendable _append = appendable.append(_javaName);
    return _append;
  }
  
  /**
   * Returns the visibility modifier and a space as suffix if not empty
   */
  public String javaName(final JvmVisibility visibility) {
    boolean _notEquals = (!Objects.equal(visibility, null));
    if (_notEquals) {
      String _switchResult = null;
      boolean matched = false;
      if (!matched) {
        if (ObjectExtensions.operator_equals(visibility,JvmVisibility.PRIVATE)) {
          matched=true;
          _switchResult = "private ";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(visibility,JvmVisibility.PUBLIC)) {
          matched=true;
          _switchResult = "public ";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(visibility,JvmVisibility.PROTECTED)) {
          matched=true;
          _switchResult = "protected ";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(visibility,JvmVisibility.DEFAULT)) {
          matched=true;
          _switchResult = "";
        }
      }
      return _switchResult;
    } else {
      return "";
    }
  }
  
  public void generateExtendsClause(final JvmDeclaredType it, final ITreeAppendable appendable) {
    EList<JvmTypeReference> _superTypes = it.getSuperTypes();
    boolean _isEmpty = _superTypes.isEmpty();
    if (_isEmpty) {
      return;
    }
    final Procedure2<Iterable<JvmTypeReference>,String> _function = new Procedure2<Iterable<JvmTypeReference>,String>() {
        public void apply(final Iterable<JvmTypeReference> it, final String prefix) {
          {
            boolean _isEmpty = IterableExtensions.isEmpty(it);
            if (_isEmpty) {
              return;
            }
            ITreeAppendable _append = appendable.append(prefix);
            _append.append(" ");
            JvmTypeReference _head = IterableExtensions.<JvmTypeReference>head(it);
            JvmModelGenerator.this.serialize(_head, appendable);
            Iterable<JvmTypeReference> _tail = IterableExtensions.<JvmTypeReference>tail(it);
            final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
                public void apply(final JvmTypeReference it) {
                  appendable.append(", ");
                  JvmModelGenerator.this.serialize(it, appendable);
                }
              };
            IterableExtensions.<JvmTypeReference>forEach(_tail, _function);
            appendable.append(" ");
          }
        }
      };
    final Procedure2<? super Iterable<JvmTypeReference>,? super String> commaDelimited = _function;
    boolean _and = false;
    if (!(it instanceof JvmGenericType)) {
      _and = false;
    } else {
      boolean _isInterface = ((JvmGenericType) it).isInterface();
      _and = ((it instanceof JvmGenericType) && _isInterface);
    }
    if (_and) {
      EList<JvmTypeReference> _superTypes_1 = it.getSuperTypes();
      commaDelimited.apply(_superTypes_1, "extends");
    } else {
      EList<JvmTypeReference> _superTypes_2 = it.getSuperTypes();
      final Function1<JvmTypeReference,Boolean> _function_1 = new Function1<JvmTypeReference,Boolean>() {
          public Boolean apply(final JvmTypeReference typeRef) {
            String _identifier = typeRef.getIdentifier();
            boolean _notEquals = (!Objects.equal(_identifier, "java.lang.Object"));
            return Boolean.valueOf(_notEquals);
          }
        };
      Iterable<JvmTypeReference> _filter = IterableExtensions.<JvmTypeReference>filter(_superTypes_2, _function_1);
      final Iterable<JvmTypeReference> withoutObject = _filter;
      final Function1<JvmTypeReference,Boolean> _function_2 = new Function1<JvmTypeReference,Boolean>() {
          public Boolean apply(final JvmTypeReference typeRef) {
            boolean _and = false;
            JvmType _type = typeRef.getType();
            if (!(_type instanceof JvmGenericType)) {
              _and = false;
            } else {
              JvmType _type_1 = typeRef.getType();
              boolean _isInterface = ((JvmGenericType) _type_1).isInterface();
              boolean _not = (!_isInterface);
              _and = ((_type instanceof JvmGenericType) && _not);
            }
            return Boolean.valueOf(_and);
          }
        };
      Iterable<JvmTypeReference> _filter_1 = IterableExtensions.<JvmTypeReference>filter(withoutObject, _function_2);
      JvmTypeReference _head = IterableExtensions.<JvmTypeReference>head(_filter_1);
      final JvmTypeReference superClazz = _head;
      final Function1<JvmTypeReference,Boolean> _function_3 = new Function1<JvmTypeReference,Boolean>() {
          public Boolean apply(final JvmTypeReference typeRef) {
            boolean _notEquals = (!Objects.equal(typeRef, superClazz));
            return Boolean.valueOf(_notEquals);
          }
        };
      Iterable<JvmTypeReference> _filter_2 = IterableExtensions.<JvmTypeReference>filter(withoutObject, _function_3);
      final Iterable<JvmTypeReference> superInterfaces = _filter_2;
      boolean _notEquals = (!Objects.equal(superClazz, null));
      if (_notEquals) {
        appendable.append("extends ");
        this.serialize(superClazz, appendable);
        appendable.append(" ");
      }
      boolean _isEmpty_1 = IterableExtensions.isEmpty(superInterfaces);
      boolean _not = (!_isEmpty_1);
      if (_not) {
        commaDelimited.apply(superInterfaces, "implements");
      }
    }
  }
  
  public boolean generateEnumLiteral(final JvmEnumerationLiteral it, final ITreeAppendable appendable, final boolean first) {
    boolean _not = (!first);
    if (_not) {
      ITreeAppendable _append = appendable.append(",");
      _append.newLine();
    }
    ITreeAppendable _increaseIndentation = appendable.increaseIndentation();
    _increaseIndentation.newLine();
    this.generateJavaDoc(it, appendable);
    this.generateAnnotations(it, appendable, true);
    String _simpleName = it.getSimpleName();
    appendable.append(_simpleName);
    appendable.decreaseIndentation();
    return false;
  }
  
  protected boolean _generateMember(final JvmMember it, final ITreeAppendable appendable, final boolean first) {
    String _plus = ("generateMember not implemented for elements of type " + it);
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException(_plus);
    throw _unsupportedOperationException;
  }
  
  protected boolean _generateMember(final JvmField it, final ITreeAppendable appendable, final boolean first) {
    ITreeAppendable _increaseIndentation = appendable.increaseIndentation();
    _increaseIndentation.newLine();
    boolean _not = (!first);
    if (_not) {
      appendable.newLine();
    }
    this.generateJavaDoc(it, appendable);
    this.generateAnnotations(it, appendable, true);
    this.generateModifier(it, appendable);
    JvmTypeReference _type = it.getType();
    this.serialize(_type, appendable);
    appendable.append(" ");
    String _simpleName = it.getSimpleName();
    appendable.append(_simpleName);
    this.generateInitialization(it, appendable);
    appendable.append(";");
    appendable.decreaseIndentation();
    return false;
  }
  
  protected boolean _generateMember(final JvmOperation it, final ITreeAppendable appendable, final boolean first) {
    ITreeAppendable _increaseIndentation = appendable.increaseIndentation();
    _increaseIndentation.newLine();
    boolean _not = (!first);
    if (_not) {
      appendable.newLine();
    }
    this.generateJavaDoc(it, appendable);
    this.generateAnnotations(it, appendable, true);
    this.generateModifier(it, appendable);
    this.generateTypeParameterDeclaration(it, appendable);
    JvmTypeReference _returnType = it.getReturnType();
    boolean _equals = Objects.equal(_returnType, null);
    if (_equals) {
      appendable.append("void");
    } else {
      JvmTypeReference _returnType_1 = it.getReturnType();
      this.serialize(_returnType_1, appendable);
    }
    appendable.append(" ");
    String _simpleName = it.getSimpleName();
    appendable.append(_simpleName);
    appendable.append("(");
    this.generateParameters(it, appendable);
    appendable.append(")");
    this.generateThrowsClause(it, appendable);
    boolean _isAbstract = it.isAbstract();
    if (_isAbstract) {
      appendable.append(";");
    } else {
      appendable.append(" ");
      this.generateExecutableBody(it, appendable);
    }
    appendable.decreaseIndentation();
    return false;
  }
  
  protected boolean _generateMember(final JvmConstructor it, final ITreeAppendable appendable, final boolean first) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    EList<JvmFormalParameter> _parameters = it.getParameters();
    boolean _isEmpty = _parameters.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      _or_2 = true;
    } else {
      XExpression _associatedExpression = this._iLogicalContainerProvider.getAssociatedExpression(it);
      boolean _notEquals = (!Objects.equal(_associatedExpression, null));
      _or_2 = (_not || _notEquals);
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      Procedure1<ITreeAppendable> _compilationStrategy = this.compilationStrategy(it);
      boolean _notEquals_1 = (!Objects.equal(_compilationStrategy, null));
      _or_1 = (_or_2 || _notEquals_1);
    }
    if (_or_1) {
      _or = true;
    } else {
      JvmDeclaredType _declaringType = it.getDeclaringType();
      EList<JvmMember> _members = _declaringType.getMembers();
      Iterable<JvmConstructor> _filter = Iterables.<JvmConstructor>filter(_members, JvmConstructor.class);
      int _size = IterableExtensions.size(_filter);
      boolean _notEquals_2 = (_size != 1);
      _or = (_or_1 || _notEquals_2);
    }
    if (_or) {
      ITreeAppendable _increaseIndentation = appendable.increaseIndentation();
      _increaseIndentation.newLine();
      boolean _not_1 = (!first);
      if (_not_1) {
        appendable.newLine();
      }
      this.generateJavaDoc(it, appendable);
      this.generateAnnotations(it, appendable, true);
      this.generateModifier(it, appendable);
      this.generateTypeParameterDeclaration(it, appendable);
      String _simpleName = it.getSimpleName();
      appendable.append(_simpleName);
      appendable.append("(");
      this.generateParameters(it, appendable);
      appendable.append(")");
      this.generateThrowsClause(it, appendable);
      appendable.append(" ");
      this.generateExecutableBody(it, appendable);
      appendable.decreaseIndentation();
      return false;
    }
    return first;
  }
  
  public void generateInitialization(final JvmField it, final ITreeAppendable appendable) {
    Procedure1<ITreeAppendable> _compilationStrategy = this.compilationStrategy(it);
    boolean _notEquals = (!Objects.equal(_compilationStrategy, null));
    if (_notEquals) {
      appendable.append(" = ");
      appendable.increaseIndentation();
      Procedure1<ITreeAppendable> _compilationStrategy_1 = this.compilationStrategy(it);
      _compilationStrategy_1.apply(appendable);
      appendable.decreaseIndentation();
    } else {
      XExpression _associatedExpression = this._iLogicalContainerProvider.getAssociatedExpression(it);
      final XExpression expression = _associatedExpression;
      boolean _notEquals_1 = (!Objects.equal(expression, null));
      if (_notEquals_1) {
        appendable.append(" = ");
        JvmTypeReference _type = it.getType();
        this.compiler.compileAsJavaExpression(expression, appendable, _type);
      } else {
        /* "" */
      }
    }
  }
  
  public void generateTypeParameterDeclaration(final JvmTypeParameterDeclarator it, final ITreeAppendable appendable) {
    EList<JvmTypeParameter> _typeParameters = it.getTypeParameters();
    boolean _isEmpty = _typeParameters.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      appendable.append("<");
      EList<JvmTypeParameter> _typeParameters_1 = it.getTypeParameters();
      JvmTypeParameter _head = IterableExtensions.<JvmTypeParameter>head(_typeParameters_1);
      this.generateTypeParameterDeclaration(_head, appendable);
      EList<JvmTypeParameter> _typeParameters_2 = it.getTypeParameters();
      Iterable<JvmTypeParameter> _tail = IterableExtensions.<JvmTypeParameter>tail(_typeParameters_2);
      final Procedure1<JvmTypeParameter> _function = new Procedure1<JvmTypeParameter>() {
          public void apply(final JvmTypeParameter it) {
            appendable.append(", ");
            JvmModelGenerator.this.generateTypeParameterDeclaration(it, appendable);
          }
        };
      IterableExtensions.<JvmTypeParameter>forEach(_tail, _function);
      appendable.append(">");
    }
  }
  
  public void generateTypeParameterDeclaration(final JvmTypeParameter it, final ITreeAppendable appendable) {
    String _name = it.getName();
    appendable.append(_name);
    this.generateTypeParameterConstraints(it, appendable);
  }
  
  public void generateTypeParameterConstraints(final JvmTypeParameter it, final ITreeAppendable appendable) {
    EList<JvmTypeConstraint> _constraints = it.getConstraints();
    Iterable<JvmUpperBound> _filter = Iterables.<JvmUpperBound>filter(_constraints, JvmUpperBound.class);
    final Iterable<JvmUpperBound> upperBounds = _filter;
    boolean _isEmpty = IterableExtensions.isEmpty(upperBounds);
    boolean _not = (!_isEmpty);
    if (_not) {
      appendable.append(" extends ");
      JvmUpperBound _head = IterableExtensions.<JvmUpperBound>head(upperBounds);
      JvmTypeReference _typeReference = _head.getTypeReference();
      this.serialize(_typeReference, appendable);
      Iterable<JvmUpperBound> _tail = IterableExtensions.<JvmUpperBound>tail(upperBounds);
      final Procedure1<JvmUpperBound> _function = new Procedure1<JvmUpperBound>() {
          public void apply(final JvmUpperBound it) {
            appendable.append(" & ");
            JvmTypeReference _typeReference = it.getTypeReference();
            JvmModelGenerator.this.serialize(_typeReference, appendable);
          }
        };
      IterableExtensions.<JvmUpperBound>forEach(_tail, _function);
    }
  }
  
  public void generateThrowsClause(final JvmExecutable it, final ITreeAppendable appendable) {
    EList<JvmTypeReference> _exceptions = it.getExceptions();
    final Function1<JvmTypeReference,JvmType> _function = new Function1<JvmTypeReference,JvmType>() {
        public JvmType apply(final JvmTypeReference it) {
          JvmType _type = it.getType();
          return _type;
        }
      };
    List<JvmType> _map = ListExtensions.<JvmTypeReference, JvmType>map(_exceptions, _function);
    Set<JvmType> _set = IterableExtensions.<JvmType>toSet(_map);
    final Set<JvmType> allExceptions = _set;
    boolean _isEmpty = allExceptions.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      appendable.append(" throws ");
      JvmType _head = IterableExtensions.<JvmType>head(allExceptions);
      appendable.append(_head);
      Iterable<JvmType> _tail = IterableExtensions.<JvmType>tail(allExceptions);
      final Procedure1<JvmType> _function_1 = new Procedure1<JvmType>() {
          public void apply(final JvmType exception) {
            {
              appendable.append(", ");
              appendable.append(exception);
            }
          }
        };
      IterableExtensions.<JvmType>forEach(_tail, _function_1);
    }
  }
  
  public void generateParameters(final JvmExecutable it, final ITreeAppendable appendable) {
    EList<JvmFormalParameter> _parameters = it.getParameters();
    boolean _isEmpty = _parameters.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<JvmFormalParameter> _parameters_1 = it.getParameters();
      JvmFormalParameter _head = IterableExtensions.<JvmFormalParameter>head(_parameters_1);
      this.generateParameter(_head, appendable);
      EList<JvmFormalParameter> _parameters_2 = it.getParameters();
      Iterable<JvmFormalParameter> _tail = IterableExtensions.<JvmFormalParameter>tail(_parameters_2);
      final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
          public void apply(final JvmFormalParameter it) {
            appendable.append(", ");
            JvmModelGenerator.this.generateParameter(it, appendable);
          }
        };
      IterableExtensions.<JvmFormalParameter>forEach(_tail, _function);
    }
  }
  
  public void generateParameter(final JvmFormalParameter it, final ITreeAppendable appendable) {
    this.generateAnnotations(it, appendable, false);
    appendable.append("final ");
    JvmTypeReference _parameterType = it.getParameterType();
    this.serialize(_parameterType, appendable);
    appendable.append(" ");
    String _simpleName = it.getSimpleName();
    appendable.append(_simpleName);
  }
  
  public void generateExecutableBody(final JvmExecutable op, final ITreeAppendable appendable) {
    Procedure1<ITreeAppendable> _compilationStrategy = this.compilationStrategy(op);
    boolean _notEquals = (!Objects.equal(_compilationStrategy, null));
    if (_notEquals) {
      appendable.openScope();
      ITreeAppendable _increaseIndentation = appendable.increaseIndentation();
      ITreeAppendable _append = _increaseIndentation.append("{");
      _append.newLine();
      Procedure1<ITreeAppendable> _compilationStrategy_1 = this.compilationStrategy(op);
      _compilationStrategy_1.apply(appendable);
      ITreeAppendable _decreaseIndentation = appendable.decreaseIndentation();
      ITreeAppendable _newLine = _decreaseIndentation.newLine();
      _newLine.append("}");
      appendable.closeScope();
    } else {
      XExpression _associatedExpression = this._iLogicalContainerProvider.getAssociatedExpression(op);
      final XExpression expression = _associatedExpression;
      boolean _notEquals_1 = (!Objects.equal(expression, null));
      if (_notEquals_1) {
        appendable.openScope();
        EList<JvmFormalParameter> _parameters = op.getParameters();
        for (final JvmFormalParameter p : _parameters) {
          String _simpleName = p.getSimpleName();
          appendable.declareVariable(p, _simpleName);
        }
        JvmTypeReference _switchResult = null;
        boolean matched = false;
        if (!matched) {
          if (op instanceof JvmOperation) {
            final JvmOperation _jvmOperation = (JvmOperation)op;
            matched=true;
            JvmTypeReference _returnType = _jvmOperation.getReturnType();
            _switchResult = _returnType;
          }
        }
        if (!matched) {
          if (op instanceof JvmConstructor) {
            final JvmConstructor _jvmConstructor = (JvmConstructor)op;
            matched=true;
            JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, _jvmConstructor);
            _switchResult = _typeForName;
          }
        }
        if (!matched) {
          _switchResult = null;
        }
        final JvmTypeReference returnType = _switchResult;
        boolean _and = false;
        boolean _and_1 = false;
        if (!(expression instanceof XBlockExpression)) {
          _and_1 = false;
        } else {
          EList<XExpression> _expressions = ((XBlockExpression) expression).getExpressions();
          int _size = _expressions.size();
          boolean _notEquals_2 = (_size != 1);
          _and_1 = ((expression instanceof XBlockExpression) && _notEquals_2);
        }
        if (!_and_1) {
          _and = false;
        } else {
          _and = (_and_1 && (returnType instanceof JvmVoid));
        }
        if (_and) {
          final XBlockExpression block = ((XBlockExpression) expression);
          EList<XExpression> _expressions_1 = block.getExpressions();
          boolean _isEmpty = _expressions_1.isEmpty();
          if (_isEmpty) {
            appendable.append("{}");
          } else {
            EList<JvmTypeReference> _exceptions = op.getExceptions();
            Set<JvmTypeReference> _set = IterableExtensions.<JvmTypeReference>toSet(_exceptions);
            this.compiler.compile(expression, appendable, returnType, _set);
          }
        } else {
          ITreeAppendable _append_1 = appendable.append("{");
          _append_1.increaseIndentation();
          EList<JvmTypeReference> _exceptions_1 = op.getExceptions();
          Set<JvmTypeReference> _set_1 = IterableExtensions.<JvmTypeReference>toSet(_exceptions_1);
          this.compiler.compile(expression, appendable, returnType, _set_1);
          ITreeAppendable _decreaseIndentation_1 = appendable.decreaseIndentation();
          ITreeAppendable _newLine_1 = _decreaseIndentation_1.newLine();
          _newLine_1.append("}");
        }
        appendable.closeScope();
      } else {
        if ((op instanceof JvmOperation)) {
          ITreeAppendable _increaseIndentation_1 = appendable.increaseIndentation();
          ITreeAppendable _append_2 = _increaseIndentation_1.append("{");
          _append_2.newLine();
          appendable.append("throw new UnsupportedOperationException(\"");
          String _simpleName_1 = op.getSimpleName();
          appendable.append(_simpleName_1);
          appendable.append("is not implemented\");");
          ITreeAppendable _decreaseIndentation_2 = appendable.decreaseIndentation();
          ITreeAppendable _newLine_2 = _decreaseIndentation_2.newLine();
          _newLine_2.append("}");
        }
      }
    }
  }
  
  public void generateJavaDoc(final EObject it, final ITreeAppendable appendable) {
    EList<Adapter> _eAdapters = it.eAdapters();
    Iterable<DocumentationAdapter> _filter = Iterables.<DocumentationAdapter>filter(_eAdapters, DocumentationAdapter.class);
    DocumentationAdapter _head = IterableExtensions.<DocumentationAdapter>head(_filter);
    final DocumentationAdapter adapter = _head;
    String _documentation = adapter==null?(String)null:adapter.getDocumentation();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_documentation);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/**");
      final StringConcatenation doc = ((StringConcatenation) _builder);
      doc.newLine();
      doc.append(" * ");
      String _documentation_1 = adapter.getDocumentation();
      doc.append(_documentation_1, " * ");
      doc.newLine();
      doc.append(" */");
      String _string = doc.toString();
      ITreeAppendable _append = appendable.append(_string);
      _append.newLine();
    }
  }
  
  public void generateAnnotations(final JvmAnnotationTarget it, final ITreeAppendable appendable, final boolean withLineBreak) {
    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
    boolean _isEmpty = _annotations.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
      JvmAnnotationReference _head = IterableExtensions.<JvmAnnotationReference>head(_annotations_1);
      this.generateAnnotation(_head, appendable);
      EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
      Iterable<JvmAnnotationReference> _tail = IterableExtensions.<JvmAnnotationReference>tail(_annotations_2);
      final Procedure1<JvmAnnotationReference> _function = new Procedure1<JvmAnnotationReference>() {
          public void apply(final JvmAnnotationReference it) {
            if (withLineBreak) {
              appendable.newLine();
            } else {
              appendable.append(" ");
            }
            JvmModelGenerator.this.generateAnnotation(it, appendable);
          }
        };
      IterableExtensions.<JvmAnnotationReference>forEach(_tail, _function);
      if (withLineBreak) {
        appendable.newLine();
      } else {
        appendable.append(" ");
      }
    }
  }
  
  public void generateAnnotation(final JvmAnnotationReference it, final ITreeAppendable appendable) {
    appendable.append("@");
    JvmAnnotationType _annotation = it.getAnnotation();
    appendable.append(_annotation);
    EList<JvmAnnotationValue> _values = it.getValues();
    boolean _isEmpty = _values.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      appendable.append("(");
      EList<JvmAnnotationValue> _values_1 = it.getValues();
      JvmAnnotationValue _head = IterableExtensions.<JvmAnnotationValue>head(_values_1);
      this.toJava(_head, appendable);
      EList<JvmAnnotationValue> _values_2 = it.getValues();
      Iterable<JvmAnnotationValue> _tail = IterableExtensions.<JvmAnnotationValue>tail(_values_2);
      final Procedure1<JvmAnnotationValue> _function = new Procedure1<JvmAnnotationValue>() {
          public void apply(final JvmAnnotationValue it) {
            appendable.append(", ");
            JvmModelGenerator.this.toJava(it, appendable);
          }
        };
      IterableExtensions.<JvmAnnotationValue>forEach(_tail, _function);
      appendable.append(")");
    }
  }
  
  public void toJava(final JvmAnnotationValue it, final ITreeAppendable appendable) {
    JvmOperation _operation = it.getOperation();
    boolean _notEquals = (!Objects.equal(_operation, null));
    if (_notEquals) {
      JvmOperation _operation_1 = it.getOperation();
      String _simpleName = _operation_1.getSimpleName();
      appendable.append(_simpleName);
      appendable.append(" = ");
    }
    this.toJavaLiteral(it, appendable);
  }
  
  protected void _toJavaLiteral(final JvmAnnotationAnnotationValue it, final ITreeAppendable appendable) {
    EList<JvmAnnotationReference> _values = it.getValues();
    int _size = _values.size();
    boolean _notEquals = (_size != 1);
    if (_notEquals) {
      appendable.append("{ ");
      this.generateAnnotations(it, appendable, false);
      appendable.append("} ");
    } else {
      this.generateAnnotations(it, appendable, false);
    }
  }
  
  protected void _toJavaLiteral(final JvmShortAnnotationValue it, final ITreeAppendable appendable) {
    EList<Short> _values = it.getValues();
    int _size = _values.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<Short> _values_1 = it.getValues();
      Short _head = IterableExtensions.<Short>head(_values_1);
      String _string = _head.toString();
      appendable.append(_string);
    } else {
      EList<Short> _values_2 = it.getValues();
      final Function1<Short,String> _function = new Function1<Short,String>() {
          public String apply(final Short it) {
            String _string = it.toString();
            return _string;
          }
        };
      String _join = IterableExtensions.<Short>join(_values_2, "{ ", ", ", " }", _function);
      appendable.append(_join);
    }
  }
  
  protected void _toJavaLiteral(final JvmIntAnnotationValue it, final ITreeAppendable appendable) {
    EList<Integer> _values = it.getValues();
    int _size = _values.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<Integer> _values_1 = it.getValues();
      Integer _head = IterableExtensions.<Integer>head(_values_1);
      String _string = _head.toString();
      appendable.append(_string);
    } else {
      EList<Integer> _values_2 = it.getValues();
      final Function1<Integer,String> _function = new Function1<Integer,String>() {
          public String apply(final Integer it) {
            String _string = it.toString();
            return _string;
          }
        };
      String _join = IterableExtensions.<Integer>join(_values_2, "{ ", ", ", " }", _function);
      appendable.append(_join);
    }
  }
  
  protected void _toJavaLiteral(final JvmLongAnnotationValue it, final ITreeAppendable appendable) {
    EList<Long> _values = it.getValues();
    int _size = _values.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<Long> _values_1 = it.getValues();
      Long _head = IterableExtensions.<Long>head(_values_1);
      String _string = _head.toString();
      appendable.append(_string);
    } else {
      EList<Long> _values_2 = it.getValues();
      final Function1<Long,String> _function = new Function1<Long,String>() {
          public String apply(final Long it) {
            String _string = it.toString();
            return _string;
          }
        };
      String _join = IterableExtensions.<Long>join(_values_2, "{ ", ", ", " }", _function);
      appendable.append(_join);
    }
  }
  
  protected void _toJavaLiteral(final JvmByteAnnotationValue it, final ITreeAppendable appendable) {
    EList<Byte> _values = it.getValues();
    int _size = _values.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<Byte> _values_1 = it.getValues();
      Byte _head = IterableExtensions.<Byte>head(_values_1);
      String _string = _head.toString();
      appendable.append(_string);
    } else {
      EList<Byte> _values_2 = it.getValues();
      final Function1<Byte,String> _function = new Function1<Byte,String>() {
          public String apply(final Byte it) {
            String _string = it.toString();
            return _string;
          }
        };
      String _join = IterableExtensions.<Byte>join(_values_2, "{ ", ", ", " }", _function);
      appendable.append(_join);
    }
  }
  
  protected void _toJavaLiteral(final JvmDoubleAnnotationValue it, final ITreeAppendable appendable) {
    EList<Double> _values = it.getValues();
    int _size = _values.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<Double> _values_1 = it.getValues();
      Double _head = IterableExtensions.<Double>head(_values_1);
      String _string = _head.toString();
      appendable.append(_string);
    } else {
      EList<Double> _values_2 = it.getValues();
      final Function1<Double,String> _function = new Function1<Double,String>() {
          public String apply(final Double it) {
            String _switchResult = null;
            boolean matched = false;
            if (!matched) {
              boolean _isNaN = Double.isNaN((it).doubleValue());
              if (_isNaN) {
                matched=true;
                _switchResult = "Double.NaN";
              }
            }
            if (!matched) {
              if (ObjectExtensions.operator_equals(it,Double.POSITIVE_INFINITY)) {
                matched=true;
                _switchResult = "Double.POSITIVE_INFINITY";
              }
            }
            if (!matched) {
              if (ObjectExtensions.operator_equals(it,Double.NEGATIVE_INFINITY)) {
                matched=true;
                _switchResult = "Double.NEGATIVE_INFINITY";
              }
            }
            if (!matched) {
              String _string = it.toString();
              String _plus = (_string + "d");
              _switchResult = _plus;
            }
            return _switchResult;
          }
        };
      String _join = IterableExtensions.<Double>join(_values_2, "{ ", ", ", " }", _function);
      appendable.append(_join);
    }
  }
  
  protected void _toJavaLiteral(final JvmFloatAnnotationValue it, final ITreeAppendable appendable) {
    EList<Float> _values = it.getValues();
    int _size = _values.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<Float> _values_1 = it.getValues();
      Float _head = IterableExtensions.<Float>head(_values_1);
      String _string = _head.toString();
      appendable.append(_string);
    } else {
      EList<Float> _values_2 = it.getValues();
      final Function1<Float,String> _function = new Function1<Float,String>() {
          public String apply(final Float it) {
            String _switchResult = null;
            boolean matched = false;
            if (!matched) {
              boolean _isNaN = Float.isNaN((it).floatValue());
              if (_isNaN) {
                matched=true;
                _switchResult = "Float.NaN";
              }
            }
            if (!matched) {
              if (ObjectExtensions.operator_equals(it,Float.POSITIVE_INFINITY)) {
                matched=true;
                _switchResult = "Float.POSITIVE_INFINITY";
              }
            }
            if (!matched) {
              if (ObjectExtensions.operator_equals(it,Float.NEGATIVE_INFINITY)) {
                matched=true;
                _switchResult = "Float.NEGATIVE_INFINITY";
              }
            }
            if (!matched) {
              String _string = it.toString();
              String _plus = (_string + "f");
              _switchResult = _plus;
            }
            return _switchResult;
          }
        };
      String _join = IterableExtensions.<Float>join(_values_2, "{ ", ", ", " }", _function);
      appendable.append(_join);
    }
  }
  
  protected void _toJavaLiteral(final JvmCharAnnotationValue it, final ITreeAppendable appendable) {
    EList<Character> _values = it.getValues();
    int _size = _values.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<Character> _values_1 = it.getValues();
      Character _head = IterableExtensions.<Character>head(_values_1);
      String _string = _head.toString();
      String _convertToJavaString = Strings.convertToJavaString(_string, true);
      String _plus = ("\'" + _convertToJavaString);
      String _plus_1 = (_plus + "\'");
      appendable.append(_plus_1);
    } else {
      EList<Character> _values_2 = it.getValues();
      final Function1<Character,String> _function = new Function1<Character,String>() {
          public String apply(final Character it) {
            String _string = it.toString();
            String _convertToJavaString = Strings.convertToJavaString(_string, true);
            String _plus = ("\'" + _convertToJavaString);
            String _plus_1 = (_plus + "\'");
            return _plus_1;
          }
        };
      String _join = IterableExtensions.<Character>join(_values_2, "{ ", ", ", " }", _function);
      appendable.append(_join);
    }
  }
  
  protected void _toJavaLiteral(final JvmStringAnnotationValue it, final ITreeAppendable appendable) {
    EList<String> _values = it.getValues();
    int _size = _values.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<String> _values_1 = it.getValues();
      String _head = IterableExtensions.<String>head(_values_1);
      String _convertToJavaString = Strings.convertToJavaString(_head, true);
      String _plus = ("\"" + _convertToJavaString);
      String _plus_1 = (_plus + "\"");
      appendable.append(_plus_1);
    } else {
      EList<String> _values_2 = it.getValues();
      final Function1<String,String> _function = new Function1<String,String>() {
          public String apply(final String it) {
            String _convertToJavaString = Strings.convertToJavaString(it, true);
            String _plus = ("\"" + _convertToJavaString);
            String _plus_1 = (_plus + "\"");
            return _plus_1;
          }
        };
      String _join = IterableExtensions.<String>join(_values_2, "{ ", ", ", " }", _function);
      appendable.append(_join);
    }
  }
  
  protected void _toJavaLiteral(final JvmTypeAnnotationValue it, final ITreeAppendable appendable) {
    EList<JvmTypeReference> _values = it.getValues();
    int _size = _values.size();
    boolean _notEquals = (_size != 1);
    if (_notEquals) {
      appendable.append("{ ");
      EList<JvmTypeReference> _values_1 = it.getValues();
      boolean _isEmpty = _values_1.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<JvmTypeReference> _values_2 = it.getValues();
        JvmTypeReference _head = IterableExtensions.<JvmTypeReference>head(_values_2);
        JvmType _type = _head.getType();
        appendable.append(_type);
        appendable.append(".class");
        EList<JvmTypeReference> _values_3 = it.getValues();
        Iterable<JvmTypeReference> _tail = IterableExtensions.<JvmTypeReference>tail(_values_3);
        final Procedure1<JvmTypeReference> _function = new Procedure1<JvmTypeReference>() {
            public void apply(final JvmTypeReference it) {
              appendable.append(", ");
              JvmType _type = it.getType();
              appendable.append(_type);
              appendable.append(".class");
            }
          };
        IterableExtensions.<JvmTypeReference>forEach(_tail, _function);
      }
      appendable.append(" }");
    } else {
      EList<JvmTypeReference> _values_4 = it.getValues();
      JvmTypeReference _head_1 = IterableExtensions.<JvmTypeReference>head(_values_4);
      JvmType _type_1 = _head_1.getType();
      appendable.append(_type_1);
      appendable.append(".class");
    }
  }
  
  protected void _toJavaLiteral(final JvmEnumAnnotationValue it, final ITreeAppendable appendable) {
    EList<JvmEnumerationLiteral> _values = it.getValues();
    int _size = _values.size();
    boolean _notEquals = (_size != 1);
    if (_notEquals) {
      appendable.append("{ ");
      EList<JvmEnumerationLiteral> _values_1 = it.getValues();
      boolean _isEmpty = _values_1.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        EList<JvmEnumerationLiteral> _values_2 = it.getValues();
        JvmEnumerationLiteral _head = IterableExtensions.<JvmEnumerationLiteral>head(_values_2);
        JvmDeclaredType _declaringType = _head.getDeclaringType();
        appendable.append(_declaringType);
        appendable.append(".");
        EList<JvmEnumerationLiteral> _values_3 = it.getValues();
        JvmEnumerationLiteral _head_1 = IterableExtensions.<JvmEnumerationLiteral>head(_values_3);
        String _simpleName = _head_1.getSimpleName();
        appendable.append(_simpleName);
        EList<JvmEnumerationLiteral> _values_4 = it.getValues();
        Iterable<JvmEnumerationLiteral> _tail = IterableExtensions.<JvmEnumerationLiteral>tail(_values_4);
        final Procedure1<JvmEnumerationLiteral> _function = new Procedure1<JvmEnumerationLiteral>() {
            public void apply(final JvmEnumerationLiteral it) {
              appendable.append(", ");
              JvmDeclaredType _declaringType = it.getDeclaringType();
              appendable.append(_declaringType);
              appendable.append(".");
              String _simpleName = it.getSimpleName();
              appendable.append(_simpleName);
            }
          };
        IterableExtensions.<JvmEnumerationLiteral>forEach(_tail, _function);
      }
      appendable.append(" }");
    } else {
      EList<JvmEnumerationLiteral> _values_5 = it.getValues();
      JvmEnumerationLiteral _head_2 = IterableExtensions.<JvmEnumerationLiteral>head(_values_5);
      JvmDeclaredType _declaringType_1 = _head_2.getDeclaringType();
      appendable.append(_declaringType_1);
      appendable.append(".");
      EList<JvmEnumerationLiteral> _values_6 = it.getValues();
      JvmEnumerationLiteral _head_3 = IterableExtensions.<JvmEnumerationLiteral>head(_values_6);
      String _simpleName_1 = _head_3.getSimpleName();
      appendable.append(_simpleName_1);
    }
  }
  
  protected void _toJavaLiteral(final JvmBooleanAnnotationValue it, final ITreeAppendable appendable) {
    EList<Boolean> _values = it.getValues();
    int _size = _values.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<Boolean> _values_1 = it.getValues();
      Boolean _head = IterableExtensions.<Boolean>head(_values_1);
      String _string = _head.toString();
      appendable.append(_string);
    } else {
      EList<Boolean> _values_2 = it.getValues();
      final Function1<Boolean,String> _function = new Function1<Boolean,String>() {
          public String apply(final Boolean it) {
            String _string = it.toString();
            return _string;
          }
        };
      String _join = IterableExtensions.<Boolean>join(_values_2, "{ ", ", ", " }", _function);
      appendable.append(_join);
    }
  }
  
  protected void _toJavaLiteral(final JvmCustomAnnotationValue it, final ITreeAppendable appendable) {
    EList<Object> _values = it.getValues();
    int _size = _values.size();
    final int __valOfSwitchOver = _size;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,0)) {
        matched=true;
        appendable.append("{}");
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,1)) {
        matched=true;
        EList<Object> _values_1 = it.getValues();
        Object _head = IterableExtensions.<Object>head(_values_1);
        this.compiler.toJavaExpression(((XExpression) _head), appendable);
      }
    }
    if (!matched) {
      {
        appendable.append("{ ");
        EList<Object> _values_2 = it.getValues();
        Object _head_1 = IterableExtensions.<Object>head(_values_2);
        this.compiler.toJavaExpression(((XExpression) _head_1), appendable);
        EList<Object> _values_3 = it.getValues();
        Iterable<Object> _tail = IterableExtensions.<Object>tail(_values_3);
        Iterable<XExpression> _filter = Iterables.<XExpression>filter(_tail, XExpression.class);
        final Procedure1<XExpression> _function = new Procedure1<XExpression>() {
            public void apply(final XExpression it) {
              appendable.append(", ");
              JvmModelGenerator.this.compiler.toJavaExpression(it, appendable);
            }
          };
        IterableExtensions.<XExpression>forEach(_filter, _function);
        appendable.append(" }");
      }
    }
  }
  
  public Procedure1<ITreeAppendable> compilationStrategy(final JvmIdentifiableElement it) {
    Procedure1<ITreeAppendable> _xblockexpression = null;
    {
      EList<Adapter> _eAdapters = it.eAdapters();
      Iterable<CompilationStrategyAdapter> _filter = Iterables.<CompilationStrategyAdapter>filter(_eAdapters, CompilationStrategyAdapter.class);
      CompilationStrategyAdapter _head = IterableExtensions.<CompilationStrategyAdapter>head(_filter);
      final CompilationStrategyAdapter adapter = _head;
      Procedure1<ITreeAppendable> _xifexpression = null;
      boolean _notEquals = (!Objects.equal(adapter, null));
      if (_notEquals) {
        Procedure1<ITreeAppendable> _compilationStrategy = adapter.getCompilationStrategy();
        _xifexpression = _compilationStrategy;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String serialize(final JvmTypeReference it, final ITreeAppendable appendable) {
    String _xblockexpression = null;
    {
      EObject _eContainer = it.eContainer();
      this.typeRefSerializer.serialize(it, _eContainer, appendable);
      String _string = appendable.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public TreeAppendable createAppendable(final EObject context, final ImportManager importManager) {
    TreeAppendable _treeAppendable = new TreeAppendable(importManager, this.locationProvider, context, "  ", "\n");
    final TreeAppendable appendable = _treeAppendable;
    JvmGenericType _containerType = this.containerType(context);
    final JvmGenericType type = _containerType;
    boolean _notEquals = (!Objects.equal(type, null));
    if (_notEquals) {
      JvmGenericType _containerType_1 = this.containerType(context);
      appendable.declareVariable(_containerType_1, "this");
      JvmGenericType _containerType_2 = this.containerType(context);
      JvmTypeReference _extendedClass = _containerType_2.getExtendedClass();
      final JvmTypeReference superType = _extendedClass;
      boolean _notEquals_1 = (!Objects.equal(superType, null));
      if (_notEquals_1) {
        JvmType _type = superType.getType();
        appendable.declareVariable(_type, "super");
      }
    }
    return appendable;
  }
  
  public JvmGenericType containerType(final EObject context) {
    JvmGenericType _xifexpression = null;
    boolean _equals = Objects.equal(context, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xifexpression_1 = null;
      if ((context instanceof JvmGenericType)) {
        _xifexpression_1 = ((JvmGenericType) context);
      } else {
        EObject _eContainer = context.eContainer();
        JvmGenericType _containerType = this.containerType(_eContainer);
        _xifexpression_1 = _containerType;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public void internalDoGenerate(final EObject type, final IFileSystemAccess fsa) {
    if (type instanceof JvmEnumerationType) {
      _internalDoGenerate((JvmEnumerationType)type, fsa);
    } else if (type instanceof JvmGenericType) {
      _internalDoGenerate((JvmGenericType)type, fsa);
    } else if (type != null) {
      _internalDoGenerate(type, fsa);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type, fsa).toString());
    }
  }
  
  public ITreeAppendable generateBody(final JvmDeclaredType it, final ITreeAppendable appendable) {
    if (it instanceof JvmEnumerationType) {
      return _generateBody((JvmEnumerationType)it, appendable);
    } else if (it instanceof JvmGenericType) {
      return _generateBody((JvmGenericType)it, appendable);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, appendable).toString());
    }
  }
  
  public ITreeAppendable generateModifier(final JvmMember it, final ITreeAppendable appendable) {
    if (it instanceof JvmConstructor) {
      return _generateModifier((JvmConstructor)it, appendable);
    } else if (it instanceof JvmOperation) {
      return _generateModifier((JvmOperation)it, appendable);
    } else if (it instanceof JvmDeclaredType) {
      return _generateModifier((JvmDeclaredType)it, appendable);
    } else if (it instanceof JvmField) {
      return _generateModifier((JvmField)it, appendable);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, appendable).toString());
    }
  }
  
  public boolean generateMember(final JvmMember it, final ITreeAppendable appendable, final boolean first) {
    if (it instanceof JvmConstructor) {
      return _generateMember((JvmConstructor)it, appendable, first);
    } else if (it instanceof JvmOperation) {
      return _generateMember((JvmOperation)it, appendable, first);
    } else if (it instanceof JvmField) {
      return _generateMember((JvmField)it, appendable, first);
    } else if (it != null) {
      return _generateMember(it, appendable, first);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, appendable, first).toString());
    }
  }
  
  public void toJavaLiteral(final JvmAnnotationValue it, final ITreeAppendable appendable) {
    if (it instanceof JvmAnnotationAnnotationValue) {
      _toJavaLiteral((JvmAnnotationAnnotationValue)it, appendable);
    } else if (it instanceof JvmBooleanAnnotationValue) {
      _toJavaLiteral((JvmBooleanAnnotationValue)it, appendable);
    } else if (it instanceof JvmByteAnnotationValue) {
      _toJavaLiteral((JvmByteAnnotationValue)it, appendable);
    } else if (it instanceof JvmCharAnnotationValue) {
      _toJavaLiteral((JvmCharAnnotationValue)it, appendable);
    } else if (it instanceof JvmCustomAnnotationValue) {
      _toJavaLiteral((JvmCustomAnnotationValue)it, appendable);
    } else if (it instanceof JvmDoubleAnnotationValue) {
      _toJavaLiteral((JvmDoubleAnnotationValue)it, appendable);
    } else if (it instanceof JvmEnumAnnotationValue) {
      _toJavaLiteral((JvmEnumAnnotationValue)it, appendable);
    } else if (it instanceof JvmFloatAnnotationValue) {
      _toJavaLiteral((JvmFloatAnnotationValue)it, appendable);
    } else if (it instanceof JvmIntAnnotationValue) {
      _toJavaLiteral((JvmIntAnnotationValue)it, appendable);
    } else if (it instanceof JvmLongAnnotationValue) {
      _toJavaLiteral((JvmLongAnnotationValue)it, appendable);
    } else if (it instanceof JvmShortAnnotationValue) {
      _toJavaLiteral((JvmShortAnnotationValue)it, appendable);
    } else if (it instanceof JvmStringAnnotationValue) {
      _toJavaLiteral((JvmStringAnnotationValue)it, appendable);
    } else if (it instanceof JvmTypeAnnotationValue) {
      _toJavaLiteral((JvmTypeAnnotationValue)it, appendable);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, appendable).toString());
    }
  }
}
