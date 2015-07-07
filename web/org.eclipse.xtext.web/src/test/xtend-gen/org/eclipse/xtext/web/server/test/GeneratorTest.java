/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.web.server.test;

import com.google.common.collect.Iterables;
import com.google.inject.Module;
import java.io.File;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.web.example.statemachine.StatemachineRuntimeModule;
import org.eclipse.xtext.web.example.statemachine.statemachine.State;
import org.eclipse.xtext.web.example.statemachine.statemachine.Statemachine;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.generator.GeneratorResult;
import org.eclipse.xtext.web.server.test.AbstractWebServerTest;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class GeneratorTest extends AbstractWebServerTest {
  public static class Generator implements IGenerator {
    @Override
    public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
      EList<EObject> _contents = input.getContents();
      Iterable<Statemachine> _filter = Iterables.<Statemachine>filter(_contents, Statemachine.class);
      final Statemachine statemachine = IterableExtensions.<Statemachine>head(_filter);
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<State> _states = statemachine.getStates();
        boolean _hasElements = false;
        for(final State state : _states) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(",", "");
          }
          String _name = state.getName();
          _builder.append(_name, "");
        }
      }
      _builder.newLineIfNotEmpty();
      fsa.generateFile("test.txt", _builder);
    }
  }
  
  @Override
  protected Module getRuntimeModule() {
    return new StatemachineRuntimeModule() {
      @Override
      public Class<? extends IGenerator> bindIGenerator() {
        return GeneratorTest.Generator.class;
      }
    };
  }
  
  @Test
  public void testGenerateText() {
    final File file = this.createFile("state foo end state bar end");
    Pair<String, String> _mappedTo = Pair.<String, String>of("requestType", "generate");
    String _name = file.getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("resource", _name);
    final XtextServiceDispatcher.ServiceDescriptor generate = this.getService(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1)));
    boolean _isHasSideEffects = generate.isHasSideEffects();
    Assert.assertFalse(_isHasSideEffects);
    boolean _isHasTextInput = generate.isHasTextInput();
    Assert.assertFalse(_isHasTextInput);
    Function0<? extends IServiceResult> _service = generate.getService();
    IServiceResult _apply = _service.apply();
    final GeneratorResult result = ((GeneratorResult) _apply);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("GeneratorResult [");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("entries = ArrayList (");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("GeneratedDocument [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("name = \"test.txt\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("contentType = \"text/plain\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("content = \"foo,bar\\n\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("  ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("]");
    final String expectedResult = _builder.toString();
    String _string = result.toString();
    Assert.assertEquals(expectedResult, _string);
  }
}
