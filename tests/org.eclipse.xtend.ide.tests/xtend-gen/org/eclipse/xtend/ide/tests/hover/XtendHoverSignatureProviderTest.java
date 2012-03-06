package org.eclipse.xtend.ide.tests.hover;

import com.google.inject.Inject;
import com.google.inject.Injector;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendParameter;
import org.eclipse.xtend.ide.hover.XtendHoverSignatureProvider;
import org.eclipse.xtend.ide.tests.AbstractXtendUITestCase;
import org.eclipse.xtend.ide.tests.WorkbenchTestHelper;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class XtendHoverSignatureProviderTest extends AbstractXtendUITestCase {
  @Inject
  private ParseHelper<XtendFile> parseHelper;
  
  @Inject
  private WorkbenchTestHelper testHelper;
  
  @Inject
  private XtendHoverSignatureProvider signatureProvider;
  
  @Test
  public void testSignatureForXtendClass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package testPackage");
      _builder.newLine();
      _builder.append("class Foo {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _resourceSet = this.getResourceSet();
      final XtendFile xtendFile = this.parseHelper.parse(_builder, _resourceSet);
      final XtendClass clazz = xtendFile.getXtendClass();
      final String signature = this.signatureProvider.getSignature(clazz);
      Assert.assertEquals("Foo", signature);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSignatureForXtendFunction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package testPackage");
      _builder.newLine();
      _builder.append("class Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("def bar(String a) throws NullPointerException");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("def void bar(String a, int b) throws NullPointerException, RuntimeException");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _resourceSet = this.getResourceSet();
      final XtendFile xtendFile = this.parseHelper.parse(_builder, _resourceSet);
      final XtendClass clazz = xtendFile.getXtendClass();
      EList<XtendMember> _members = clazz.getMembers();
      final XtendMember xtendFunction1 = _members.get(0);
      EList<XtendMember> _members_1 = clazz.getMembers();
      final XtendMember xtendFunction2 = _members_1.get(1);
      final String signature1 = this.signatureProvider.getSignature(xtendFunction1);
      final String signature2 = this.signatureProvider.getSignature(xtendFunction2);
      Assert.assertEquals("Object bar(String a) throws NullPointerException", signature1);
      Assert.assertEquals("void bar(String a, int b) throws NullPointerException, RuntimeException", signature2);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSignatureForXtendParameter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package testPackage");
      _builder.newLine();
      _builder.append("class Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("def bar(String a) throws NullPointerException");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _resourceSet = this.getResourceSet();
      final XtendFile xtendFile = this.parseHelper.parse(_builder, _resourceSet);
      final XtendClass clazz = xtendFile.getXtendClass();
      EList<XtendMember> _members = clazz.getMembers();
      XtendMember _get = _members.get(0);
      final XtendFunction xtendFunction = ((XtendFunction) _get);
      EList<XtendParameter> _parameters = xtendFunction.getParameters();
      final XtendParameter xtendParameter = _parameters.get(0);
      final String signature = this.signatureProvider.getSignature(xtendParameter);
      Assert.assertEquals("String a - bar(String)", signature);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSignatureForXtendField() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package testPackage");
      _builder.newLine();
      _builder.append("import java.util.Collections");
      _builder.newLine();
      _builder.append("import com.google.inject.Inject");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("class Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Inject");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Collections collections");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("def bar(String a) throws NullPointerException");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _resourceSet = this.getResourceSet();
      final XtendFile xtendFile = this.parseHelper.parse(_builder, _resourceSet);
      final XtendClass clazz = xtendFile.getXtendClass();
      EList<XtendMember> _members = clazz.getMembers();
      XtendMember _get = _members.get(0);
      final XtendField xtendField = ((XtendField) _get);
      final String signature = this.signatureProvider.getSignature(xtendField);
      Assert.assertEquals("Collections collections", signature);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSignatureForXtendConstructor() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package testPackage");
      _builder.newLine();
      _builder.append("class Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new(String a, int b){}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _resourceSet = this.getResourceSet();
      final XtendFile xtendFile = this.parseHelper.parse(_builder, _resourceSet);
      final XtendClass clazz = xtendFile.getXtendClass();
      EList<XtendMember> _members = clazz.getMembers();
      final XtendMember xtendConstructor = _members.get(0);
      final String signature = this.signatureProvider.getSignature(xtendConstructor);
      Assert.assertEquals("Foo (String a, int b)", signature);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSignatureForXtendDefaultConstructor() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package testPackage");
      _builder.newLine();
      _builder.append("class Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("def bar(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Foo()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _resourceSet = this.getResourceSet();
      final XtendFile xtendFile = this.parseHelper.parse(_builder, _resourceSet);
      final XtendClass clazz = xtendFile.getXtendClass();
      EList<XtendMember> _members = clazz.getMembers();
      XtendMember _get = _members.get(0);
      final XtendFunction xtendFunction = ((XtendFunction) _get);
      XExpression _expression = xtendFunction.getExpression();
      EList<XExpression> _expressions = ((XBlockExpression) _expression).getExpressions();
      XExpression _get_1 = _expressions.get(0);
      final XConstructorCall constructorCall = ((XConstructorCall) _get_1);
      JvmConstructor _constructor = constructorCall.getConstructor();
      final String signature = this.signatureProvider.getSignature(_constructor);
      Assert.assertEquals("Foo ()", signature);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSignatureForForLoopVariable() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package testPackage");
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("class Foo {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("def bar(List<String> list){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("for(foo : list){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _resourceSet = this.getResourceSet();
      final XtendFile xtendFile = this.parseHelper.parse(_builder, _resourceSet);
      final XtendClass clazz = xtendFile.getXtendClass();
      EList<XtendMember> _members = clazz.getMembers();
      XtendMember _get = _members.get(0);
      final XtendFunction xtendFunction = ((XtendFunction) _get);
      XExpression _expression = xtendFunction.getExpression();
      EList<XExpression> _expressions = ((XBlockExpression) _expression).getExpressions();
      XExpression _get_1 = _expressions.get(0);
      final JvmFormalParameter param = ((XForLoopExpression) _get_1).getDeclaredParam();
      final String signature = this.signatureProvider.getSignature(param);
      Assert.assertEquals("String foo", signature);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSignatureForForXClosureVariable() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.append("package testPackage");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class Foo {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("def zonk(){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("bar(s | s + \"42\")");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("def bar((String)=>String fun){");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _resourceSet = this.getResourceSet();
      final XtendFile xtendFile = this.parseHelper.parse(_builder, _resourceSet);
      final XtendClass clazz = xtendFile.getXtendClass();
      EList<XtendMember> _members = clazz.getMembers();
      XtendMember _get = _members.get(0);
      final XtendFunction xtendFunction = ((XtendFunction) _get);
      XExpression _expression = xtendFunction.getExpression();
      EList<XExpression> _expressions = ((XBlockExpression) _expression).getExpressions();
      XExpression _get_1 = _expressions.get(0);
      EList<XExpression> _featureCallArguments = ((XFeatureCall) _get_1).getFeatureCallArguments();
      XExpression _get_2 = _featureCallArguments.get(0);
      final XClosure closure = ((XClosure) _get_2);
      EList<JvmFormalParameter> _declaredFormalParameters = closure.getDeclaredFormalParameters();
      final JvmFormalParameter param = _declaredFormalParameters.get(0);
      final String signature = this.signatureProvider.getSignature(param);
      Assert.assertEquals("String s", signature);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSignatureForXVariableDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package testPackage");
      _builder.newLine();
      _builder.append("class Foo {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("def bar(List<String> list){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("val a = \"42\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      ResourceSet _resourceSet = this.getResourceSet();
      final XtendFile xtendFile = this.parseHelper.parse(_builder, _resourceSet);
      final XtendClass clazz = xtendFile.getXtendClass();
      EList<XtendMember> _members = clazz.getMembers();
      XtendMember _get = _members.get(0);
      final XtendFunction xtendFunction = ((XtendFunction) _get);
      XExpression _expression = xtendFunction.getExpression();
      EList<XExpression> _expressions = ((XBlockExpression) _expression).getExpressions();
      XExpression _get_1 = _expressions.get(0);
      final XVariableDeclaration variable = ((XVariableDeclaration) _get_1);
      final String signature = this.signatureProvider.getSignature(variable);
      Assert.assertEquals("String a", signature);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public ResourceSet getResourceSet() {
    Injector _injector = this.getInjector();
    IResourceSetProvider _instance = _injector.<IResourceSetProvider>getInstance(IResourceSetProvider.class);
    IProject _project = this.testHelper.getProject();
    ResourceSet _get = _instance.get(_project);
    return _get;
  }
  
  @Before
  @After
  public void cleanup() {
    try {
      this.testHelper.tearDown();
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
