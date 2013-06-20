/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xbase.tests.typesystem;

import com.google.inject.Inject;
import org.eclipse.xtext.junit4.internal.StopwatchRule;
import org.eclipse.xtext.junit4.internal.Timed;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.tests.typesystem.AbstractBatchTypeResolverTest;
import org.eclipse.xtext.xbase.tests.typesystem.TimedBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow
 */
@Ignore
@SuppressWarnings("all")
public class TimedBatchTypeResolverTest extends AbstractBatchTypeResolverTest {
  @Rule
  public final StopwatchRule rule = new Function0<StopwatchRule>() {
    public StopwatchRule apply() {
      StopwatchRule _stopwatchRule = new StopwatchRule(false);
      return _stopwatchRule;
    }
  }.apply();
  
  @Inject
  private TimedBatchTypeResolver typeResolver;
  
  public IBatchTypeResolver getTypeResolver() {
    return this.typeResolver;
  }
  
  @Test
  @Timed
  public void testFeatureCall_15_n() throws Exception {
    super.testFeatureCall_15_n();
  }
  
  @Test
  @Timed
  public void testFeatureCall_15_n_1() throws Exception {
    super.testFeatureCall_15_n_1();
  }
  
  @Test
  @Timed
  public void testFeatureCall_15_n_2() throws Exception {
    super.testFeatureCall_15_n_2();
  }
}
