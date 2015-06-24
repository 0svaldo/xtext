/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xbase.web.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.idea.example.entities.EntitiesRuntimeModule;
import org.eclipse.xtext.idea.example.entities.EntitiesStandaloneSetup;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.web.server.ISessionStore;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.eclipse.xtext.xbase.ide.DefaultXbaseIdeModule;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.web.test.HashMapSessionStore;
import org.eclipse.xtext.xbase.web.test.MockRequestData;
import org.eclipse.xtext.xbase.web.test.languages.EntitiesWebModule;

@Accessors(AccessorType.PROTECTED_GETTER)
@SuppressWarnings("all")
public class AbstractXbaseWebTest extends AbstractXtextTests {
  public static class TestResourceBaseProvider implements IResourceBaseProvider {
    private final HashMap<String, URI> testFiles = new HashMap<String, URI>();
    
    @Override
    public URI getFileURI(final String resourceId) {
      return this.testFiles.get(resourceId);
    }
  }
  
  private ExecutorService executorService;
  
  private AbstractXbaseWebTest.TestResourceBaseProvider resourceBaseProvider;
  
  private XtextServiceDispatcher dispatcher;
  
  protected EntitiesRuntimeModule getRuntimeModule() {
    return new EntitiesRuntimeModule();
  }
  
  @Override
  public void setUp() {
    try {
      super.setUp();
      ExecutorService _newCachedThreadPool = Executors.newCachedThreadPool();
      this.executorService = _newCachedThreadPool;
      AbstractXbaseWebTest.TestResourceBaseProvider _testResourceBaseProvider = new AbstractXbaseWebTest.TestResourceBaseProvider();
      this.resourceBaseProvider = _testResourceBaseProvider;
      this.with(new EntitiesStandaloneSetup() {
        @Override
        public Injector createInjector() {
          final DefaultXbaseIdeModule ideModule = new DefaultXbaseIdeModule();
          final EntitiesWebModule webModule = new EntitiesWebModule(AbstractXbaseWebTest.this.executorService);
          webModule.setResourceBaseProvider(AbstractXbaseWebTest.this.resourceBaseProvider);
          EntitiesRuntimeModule _runtimeModule = AbstractXbaseWebTest.this.getRuntimeModule();
          Module _mixin = Modules2.mixin(_runtimeModule, ideModule, webModule);
          return Guice.createInjector(_mixin);
        }
      });
      Injector _injector = this.getInjector();
      XtextServiceDispatcher _instance = _injector.<XtextServiceDispatcher>getInstance(XtextServiceDispatcher.class);
      this.dispatcher = _instance;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void tearDown() {
    try {
      this.executorService.shutdown();
      super.tearDown();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected File createFile(final String content) {
    try {
      final File file = File.createTempFile("test", ".entities");
      String _name = file.getName();
      String _absolutePath = file.getAbsolutePath();
      URI _createFileURI = URI.createFileURI(_absolutePath);
      this.resourceBaseProvider.testFiles.put(_name, _createFileURI);
      final FileWriter writer = new FileWriter(file);
      writer.write(content);
      writer.close();
      file.deleteOnExit();
      return file;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected XtextServiceDispatcher.ServiceDescriptor getService(final Map<String, String> parameters) {
    HashMapSessionStore _hashMapSessionStore = new HashMapSessionStore();
    return this.getService(parameters, _hashMapSessionStore);
  }
  
  protected XtextServiceDispatcher.ServiceDescriptor getService(final Map<String, String> parameters, final ISessionStore sessionStore) {
    XtextServiceDispatcher.ServiceDescriptor _xblockexpression = null;
    {
      final MockRequestData requestData = new MockRequestData(parameters);
      _xblockexpression = this.dispatcher.getService(requestData, sessionStore);
    }
    return _xblockexpression;
  }
  
  @Pure
  protected ExecutorService getExecutorService() {
    return this.executorService;
  }
  
  @Pure
  protected AbstractXbaseWebTest.TestResourceBaseProvider getResourceBaseProvider() {
    return this.resourceBaseProvider;
  }
  
  @Pure
  protected XtextServiceDispatcher getDispatcher() {
    return this.dispatcher;
  }
}
