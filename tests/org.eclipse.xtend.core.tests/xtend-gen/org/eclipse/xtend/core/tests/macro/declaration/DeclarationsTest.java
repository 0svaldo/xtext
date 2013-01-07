package org.eclipse.xtend.core.tests.macro.declaration;

import com.google.inject.Provider;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.xtend.core.macro.declaration.CompilationUnitImpl;
import org.eclipse.xtend.core.tests.AbstractXtendTestCase;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration;
import org.eclipse.xtend.lib.macro.declaration.CompilationUnit;
import org.eclipse.xtend.lib.macro.declaration.ConstructorDeclaration;
import org.eclipse.xtend.lib.macro.declaration.FieldDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MemberDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MethodDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableMemberDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableMethodDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableTypeParameterDeclaration;
import org.eclipse.xtend.lib.macro.declaration.ParameterDeclaration;
import org.eclipse.xtend.lib.macro.declaration.Type;
import org.eclipse.xtend.lib.macro.declaration.TypeDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeParameterDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeParameterDeclarator;
import org.eclipse.xtend.lib.macro.type.TypeReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class DeclarationsTest extends AbstractXtendTestCase {
  @Inject
  private Provider<CompilationUnitImpl> compilationUnitProvider;
  
  @Test
  public void testSimpleClassWithField() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class MyClass extends Object implements java.io.Serializable {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("MyClass foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    XtendFile _validFile = this.validFile(_builder);
    final Procedure1<CompilationUnit> _function = new Procedure1<CompilationUnit>() {
        public void apply(final CompilationUnit it) {
          String _packageName = it.getPackageName();
          Assert.assertEquals("foo", _packageName);
          List<? extends TypeDeclaration> _sourceTypeDeclarations = it.getSourceTypeDeclarations();
          TypeDeclaration _head = IterableExtensions.head(_sourceTypeDeclarations);
          final ClassDeclaration clazz = ((ClassDeclaration) _head);
          String _name = clazz.getName();
          Assert.assertEquals("foo.MyClass", _name);
          TypeReference _superclass = clazz.getSuperclass();
          String _string = _superclass.toString();
          Assert.assertEquals("Object", _string);
          List<TypeReference> _implementedInterfaces = clazz.getImplementedInterfaces();
          TypeReference _head_1 = IterableExtensions.<TypeReference>head(_implementedInterfaces);
          String _string_1 = _head_1.toString();
          Assert.assertEquals("Serializable", _string_1);
          List<? extends MemberDeclaration> _members = clazz.getMembers();
          MemberDeclaration _head_2 = IterableExtensions.head(_members);
          final FieldDeclaration field = ((FieldDeclaration) _head_2);
          String _name_1 = field.getName();
          Assert.assertEquals("foo", _name_1);
          List<? extends TypeDeclaration> _generatedTypeDeclarations = it.getGeneratedTypeDeclarations();
          TypeDeclaration _head_3 = IterableExtensions.head(_generatedTypeDeclarations);
          TypeReference _type = field.getType();
          Type _type_1 = _type.getType();
          Assert.assertSame(_head_3, _type_1);
        }
      };
    this.asCompilationUnit(_validFile, _function);
  }
  
  @Test
  public void testXtendClassWithMethodFieldAndConstructor() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package foo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class MyClass<T extends CharSequence> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String myField");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("new(String initial) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.myField = initial");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def <T2 extends CharSequence> MyClass myMethod(T2 a, T b) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("myField = myField + a + b");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    XtendFile _validFile = this.validFile(_builder);
    final Procedure1<CompilationUnit> _function = new Procedure1<CompilationUnit>() {
        public void apply(final CompilationUnit it) {
          String _packageName = it.getPackageName();
          Assert.assertEquals("foo", _packageName);
          List<? extends TypeDeclaration> _sourceTypeDeclarations = it.getSourceTypeDeclarations();
          TypeDeclaration _head = IterableExtensions.head(_sourceTypeDeclarations);
          final ClassDeclaration clazz = ((ClassDeclaration) _head);
          List<? extends TypeDeclaration> _generatedTypeDeclarations = it.getGeneratedTypeDeclarations();
          TypeDeclaration _head_1 = IterableExtensions.head(_generatedTypeDeclarations);
          final MutableClassDeclaration genClazz = ((MutableClassDeclaration) _head_1);
          String _name = clazz.getName();
          Assert.assertEquals("foo.MyClass", _name);
          TypeReference _superclass = clazz.getSuperclass();
          Assert.assertNull(_superclass);
          List<TypeReference> _implementedInterfaces = clazz.getImplementedInterfaces();
          boolean _isEmpty = _implementedInterfaces.isEmpty();
          Assert.assertTrue(_isEmpty);
          List<? extends MemberDeclaration> _members = clazz.getMembers();
          int _size = _members.size();
          Assert.assertEquals(3, _size);
          List<? extends TypeParameterDeclaration> _typeParameters = clazz.getTypeParameters();
          TypeParameterDeclaration _head_2 = IterableExtensions.head(_typeParameters);
          String _name_1 = _head_2.getName();
          Assert.assertEquals("T", _name_1);
          List<? extends TypeParameterDeclaration> _typeParameters_1 = clazz.getTypeParameters();
          TypeParameterDeclaration _head_3 = IterableExtensions.head(_typeParameters_1);
          List<TypeReference> _upperBounds = _head_3.getUpperBounds();
          TypeReference _head_4 = IterableExtensions.<TypeReference>head(_upperBounds);
          String _string = _head_4.toString();
          Assert.assertEquals("CharSequence", _string);
          List<? extends TypeParameterDeclaration> _typeParameters_2 = clazz.getTypeParameters();
          TypeParameterDeclaration _head_5 = IterableExtensions.head(_typeParameters_2);
          TypeParameterDeclarator _typeParameterDeclarator = _head_5.getTypeParameterDeclarator();
          Assert.assertSame(clazz, _typeParameterDeclarator);
          List<? extends MemberDeclaration> _members_1 = clazz.getMembers();
          MemberDeclaration _head_6 = IterableExtensions.head(_members_1);
          final FieldDeclaration field = ((FieldDeclaration) _head_6);
          ClassDeclaration _declaringType = field.getDeclaringType();
          Assert.assertSame(clazz, _declaringType);
          String _name_2 = field.getName();
          Assert.assertEquals("myField", _name_2);
          TypeReference _type = field.getType();
          String _string_1 = _type.toString();
          Assert.assertEquals("String", _string_1);
          boolean _isFinal = field.isFinal();
          Assert.assertFalse(_isFinal);
          List<? extends MemberDeclaration> _members_2 = clazz.getMembers();
          MemberDeclaration _get = _members_2.get(1);
          final ConstructorDeclaration constructor = ((ConstructorDeclaration) _get);
          TypeDeclaration _declaringType_1 = constructor.getDeclaringType();
          Assert.assertSame(clazz, _declaringType_1);
          String _name_3 = constructor.getName();
          Assert.assertEquals("MyClass", _name_3);
          List<? extends ParameterDeclaration> _parameters = constructor.getParameters();
          ParameterDeclaration _head_7 = IterableExtensions.head(_parameters);
          String _name_4 = _head_7.getName();
          Assert.assertEquals("initial", _name_4);
          List<? extends ParameterDeclaration> _parameters_1 = constructor.getParameters();
          ParameterDeclaration _head_8 = IterableExtensions.head(_parameters_1);
          TypeReference _type_1 = _head_8.getType();
          String _string_2 = _type_1.toString();
          Assert.assertEquals("String", _string_2);
          List<? extends MemberDeclaration> _members_3 = clazz.getMembers();
          MemberDeclaration _get_1 = _members_3.get(2);
          final MethodDeclaration method = ((MethodDeclaration) _get_1);
          List<? extends MutableMemberDeclaration> _members_4 = genClazz.getMembers();
          MutableMemberDeclaration _get_2 = _members_4.get(2);
          final MutableMethodDeclaration genMethod = ((MutableMethodDeclaration) _get_2);
          TypeDeclaration _declaringType_2 = method.getDeclaringType();
          Assert.assertSame(clazz, _declaringType_2);
          List<? extends ParameterDeclaration> _parameters_2 = method.getParameters();
          ParameterDeclaration _head_9 = IterableExtensions.head(_parameters_2);
          String _name_5 = _head_9.getName();
          Assert.assertEquals("a", _name_5);
          List<? extends ParameterDeclaration> _parameters_3 = method.getParameters();
          ParameterDeclaration _head_10 = IterableExtensions.head(_parameters_3);
          TypeReference _type_2 = _head_10.getType();
          String _string_3 = _type_2.toString();
          Assert.assertEquals("T2", _string_3);
          List<MutableTypeParameterDeclaration> _typeParameters_3 = genMethod.getTypeParameters();
          MutableTypeParameterDeclaration _head_11 = IterableExtensions.<MutableTypeParameterDeclaration>head(_typeParameters_3);
          List<? extends ParameterDeclaration> _parameters_4 = method.getParameters();
          ParameterDeclaration _head_12 = IterableExtensions.head(_parameters_4);
          TypeReference _type_3 = _head_12.getType();
          Type _type_4 = _type_3.getType();
          Assert.assertSame(_head_11, _type_4);
          List<? extends ParameterDeclaration> _parameters_5 = method.getParameters();
          ParameterDeclaration _get_3 = _parameters_5.get(1);
          TypeReference _type_5 = _get_3.getType();
          String _string_4 = _type_5.toString();
          Assert.assertEquals("T", _string_4);
          List<? extends TypeParameterDeclaration> _typeParameters_4 = genClazz.getTypeParameters();
          TypeParameterDeclaration _head_13 = IterableExtensions.head(_typeParameters_4);
          List<? extends ParameterDeclaration> _parameters_6 = method.getParameters();
          ParameterDeclaration _get_4 = _parameters_6.get(1);
          TypeReference _type_6 = _get_4.getType();
          Type _type_7 = _type_6.getType();
          Assert.assertSame(_head_13, _type_7);
          TypeReference _returnType = method.getReturnType();
          Type _type_8 = _returnType.getType();
          Assert.assertSame(genClazz, _type_8);
          List<? extends TypeParameterDeclaration> _typeParameters_5 = method.getTypeParameters();
          TypeParameterDeclaration _head_14 = IterableExtensions.head(_typeParameters_5);
          String _name_6 = _head_14.getName();
          Assert.assertEquals("T2", _name_6);
          List<? extends TypeParameterDeclaration> _typeParameters_6 = method.getTypeParameters();
          TypeParameterDeclaration _head_15 = IterableExtensions.head(_typeParameters_6);
          List<TypeReference> _upperBounds_1 = _head_15.getUpperBounds();
          TypeReference _head_16 = IterableExtensions.<TypeReference>head(_upperBounds_1);
          String _string_5 = _head_16.toString();
          Assert.assertEquals("CharSequence", _string_5);
          List<? extends TypeParameterDeclaration> _typeParameters_7 = method.getTypeParameters();
          TypeParameterDeclaration _head_17 = IterableExtensions.head(_typeParameters_7);
          List<? extends TypeParameterDeclaration> _typeParameters_8 = method.getTypeParameters();
          TypeParameterDeclaration _head_18 = IterableExtensions.head(_typeParameters_8);
          Assert.assertSame(_head_17, _head_18);
          List<? extends TypeParameterDeclaration> _typeParameters_9 = method.getTypeParameters();
          TypeParameterDeclaration _head_19 = IterableExtensions.head(_typeParameters_9);
          TypeParameterDeclarator _typeParameterDeclarator_1 = _head_19.getTypeParameterDeclarator();
          Assert.assertSame(method, _typeParameterDeclarator_1);
          List<? extends MemberDeclaration> _members_5 = clazz.getMembers();
          MemberDeclaration _get_5 = _members_5.get(0);
          Assert.assertSame(field, _get_5);
          List<? extends MemberDeclaration> _members_6 = clazz.getMembers();
          MemberDeclaration _get_6 = _members_6.get(1);
          Assert.assertSame(constructor, _get_6);
          List<? extends MemberDeclaration> _members_7 = clazz.getMembers();
          MemberDeclaration _get_7 = _members_7.get(2);
          Assert.assertSame(method, _get_7);
        }
      };
    this.asCompilationUnit(_validFile, _function);
  }
  
  public XtendFile validFile(final CharSequence code) {
    try {
      String _string = code.toString();
      XtendFile _file = this.file(_string, true);
      return _file;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void asCompilationUnit(final XtendFile file, final Procedure1<? super CompilationUnit> block) {
    final CompilationUnitImpl compilationUnit = this.compilationUnitProvider.get();
    compilationUnit.setXtendFile(file);
    block.apply(compilationUnit);
  }
}
