/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.core.tests.compiler;

import org.eclipse.xtend.core.tests.NewTypeSystemRuntimeInjectorProvider;
import org.eclipse.xtend.core.tests.compiler.AbstractCompilerTest;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = NewTypeSystemRuntimeInjectorProvider.class)
@SuppressWarnings("all")
public class CompilerTest2 extends AbstractCompilerTest {
  @Test
  @Ignore(value = "TODO: detect recursion that does not provide any meaningful hints")
  public void testBug343096_01() throws Exception {
    super.testBug343096_01();
  }
  
  @Test
  public void testBug343096_02() throws Exception {
    String _canonicalName = Function1.class.getCanonicalName();
    this.invokeAndExpect2(_canonicalName, 
      "def <T> String bug343096() {\n\t\t\t\t  [T t|switch t { \n\t\t\t\t    case t : bug343096 \n\t\t\t\t  }].getClass.interfaces.head.canonicalName \n\t\t\t\t}", "bug343096");
  }
  
  @Test
  public void testBug343096_03() throws Exception {
    String _canonicalName = Object.class.getCanonicalName();
    this.invokeAndExpect2(_canonicalName, 
      "def <T> String bug343096() {\n\t\t\t\t  [T t|switch t { \n\t\t\t\t    case t : bug343096 \n\t\t\t\t  }].getClass.superclass.canonicalName \n\t\t\t\t}", "bug343096");
  }
  
  @Test
  @Ignore(value = "TODO deferred typing of local vars which are currently \'any\'")
  public void testBug_350932_13() throws Exception {
    super.testBug_350932_13();
  }
  
  @Test
  @Ignore(value = "TODO deferred typing of local vars which are currently \'any\'")
  public void testBug_350932_14() throws Exception {
    super.testBug_350932_14();
  }
  
  @Test
  @Ignore(value = "TODO")
  public void testBug_352849_01() throws Exception {
    super.testBug_352849_01();
  }
  
  @Test
  @Ignore(value = "TODO")
  public void testBug_352849_02() throws Exception {
    super.testBug_352849_02();
  }
  
  @Test
  public void testEscapeCharacterForReservedNames() throws Exception {
    final String code = "package x class Z {\n\t\t\t  def Object create(Object x) {\n\t\t\t    create(x)\n\t\t\t  }\n\t\t\t}";
    final String javaCode = this.compileToJavaCode(code);
    this.javaCompiler.compileToClass("x.Z", javaCode);
  }
  
  @Test
  @Ignore(value = "TODO")
  public void testData_01() throws Exception {
    super.testData_01();
  }
  
  @Test
  @Ignore(value = "TODO")
  public void testData_02() throws Exception {
    super.testData_02();
  }
}
