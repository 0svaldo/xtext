/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.core.tests.linking;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.tests.NewTypeSystemRuntimeInjectorProvider;
import org.eclipse.xtend.core.tests.linking.LinkingTest;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = NewTypeSystemRuntimeInjectorProvider.class)
@SuppressWarnings("all")
public class LinkingTest2 extends LinkingTest {
  @Test
  public void testImplicitFirstArgument_07() throws Exception {
    final XtendClass clazz = this.clazz(
      "import static extension test.ImplicitFirstArgumentStatics.*\n                class MyXtendClass {\n                  def testExtensionMethods(CharSequence it) { \n                    withCharSequence \n                  }\n                }");
    EList<XtendMember> _members = clazz.getMembers();
    XtendMember _get = _members.get(0);
    final XtendFunction func = ((XtendFunction) _get);
    XExpression _expression = func.getExpression();
    EList<XExpression> _expressions = ((XBlockExpression) _expression).getExpressions();
    XExpression _get_1 = _expressions.get(0);
    final XFeatureCall seventh = ((XFeatureCall) _get_1);
    JvmIdentifiableElement _feature = seventh.getFeature();
    final JvmOperation seventhFeature = ((JvmOperation) _feature);
    String _identifier = seventhFeature.getIdentifier();
    Assert.assertEquals("test.ImplicitFirstArgumentStatics.withCharSequence(java.lang.CharSequence)", _identifier);
    XExpression _implicitReceiver = seventh.getImplicitReceiver();
    Assert.assertNull(_implicitReceiver);
    XExpression _implicitFirstArgument = seventh.getImplicitFirstArgument();
    Assert.assertNotNull(_implicitFirstArgument);
    String _invalidFeatureIssueCode = seventh.getInvalidFeatureIssueCode();
    String _invalidFeatureIssueCode_1 = seventh.getInvalidFeatureIssueCode();
    Assert.assertNull(_invalidFeatureIssueCode, _invalidFeatureIssueCode_1);
    XExpression _implicitFirstArgument_1 = seventh.getImplicitFirstArgument();
    JvmIdentifiableElement _feature_1 = ((XAbstractFeatureCall) _implicitFirstArgument_1).getFeature();
    String _simpleName = _feature_1.getSimpleName();
    Assert.assertEquals("it", _simpleName);
  }
  
  @Test
  @Ignore(value = "TBD")
  public void testTypeParameterReference_4() throws Exception {
  }
  
  @Test
  @Ignore(value = "TBD")
  public void testTypeParameterReference_5() throws Exception {
  }
  
  @Test
  @Ignore(value = "TBD")
  public void testTypeParameterReference_6() throws Exception {
  }
  
  @Test
  @Ignore(value = "TBD")
  public void testTypeParameterReference_8() throws Exception {
  }
}
