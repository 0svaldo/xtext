/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator;

import com.google.inject.Injector;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xtext.generator.IGeneratorFragment2;
import org.eclipse.xtext.xtext.generator.LanguageConfig2;

/**
 * A composite generator fragment delegates to its contained fragments.
 */
@SuppressWarnings("all")
public class CompositeGeneratorFragment2 implements IGeneratorFragment2 {
  private final List<IGeneratorFragment2> fragments = CollectionLiterals.<IGeneratorFragment2>newArrayList();
  
  public void addFragment(final IGeneratorFragment2 fragment) {
    if ((fragment == this)) {
      throw new IllegalArgumentException();
    }
    this.fragments.add(fragment);
  }
  
  @Override
  public void initialize(final Injector injector) {
    injector.injectMembers(this);
    for (final IGeneratorFragment2 fragment : this.fragments) {
      fragment.initialize(injector);
    }
  }
  
  @Override
  public void generate(final LanguageConfig2 language) {
    for (final IGeneratorFragment2 fragment : this.fragments) {
      fragment.generate(language);
    }
  }
}
