/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.generator;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtext.generator.AbstractGeneratorFragment2;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.IXtextProjectConfig;
import org.eclipse.xtext.xtext.generator.LanguageConfig2;
import org.eclipse.xtext.xtext.generator.XtextGenerator;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.FileSystemAccess;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.ManifestAccess;
import org.eclipse.xtext.xtext.generator.model.PluginXmlAccess;
import org.eclipse.xtext.xtext.generator.model.TextFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.model.XtendFileAccess;
import org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2;

@SuppressWarnings("all")
public class GeneratorFragment2 extends AbstractGeneratorFragment2 {
  @Inject
  private IXtextProjectConfig projectConfig;
  
  @Inject
  private CodeConfig codeConfig;
  
  @Inject
  private FileAccessFactory fileAccessFactory;
  
  @Inject
  @Extension
  private FileSystemAccess.Extensions _extensions;
  
  @Accessors(AccessorType.PUBLIC_SETTER)
  private boolean generateStub = true;
  
  @Accessors(AccessorType.PUBLIC_SETTER)
  private boolean generateMwe = false;
  
  @Accessors(AccessorType.PUBLIC_SETTER)
  private boolean generateJavaMain = false;
  
  @Accessors(AccessorType.PUBLIC_SETTER)
  private boolean generateXtendMain = false;
  
  public boolean isGenerateStub(final Grammar grammar) {
    boolean _and = false;
    boolean _inheritsXbase = XbaseGeneratorFragment2.inheritsXbase(grammar);
    boolean _not = (!_inheritsXbase);
    if (!_not) {
      _and = false;
    } else {
      _and = this.generateStub;
    }
    return _and;
  }
  
  public boolean isGenerateJavaMain(final Grammar grammar) {
    boolean _and = false;
    boolean _inheritsXbase = XbaseGeneratorFragment2.inheritsXbase(grammar);
    boolean _not = (!_inheritsXbase);
    if (!_not) {
      _and = false;
    } else {
      _and = this.generateJavaMain;
    }
    return _and;
  }
  
  public boolean isGenerateXtendMain(final Grammar grammar) {
    boolean _and = false;
    boolean _inheritsXbase = XbaseGeneratorFragment2.inheritsXbase(grammar);
    boolean _not = (!_inheritsXbase);
    if (!_not) {
      _and = false;
    } else {
      _and = this.generateXtendMain;
    }
    return _and;
  }
  
  public boolean isGenerateMwe(final Grammar grammar) {
    boolean _and = false;
    boolean _inheritsXbase = XbaseGeneratorFragment2.inheritsXbase(grammar);
    boolean _not = (!_inheritsXbase);
    if (!_not) {
      _and = false;
    } else {
      _and = this.generateMwe;
    }
    return _and;
  }
  
  protected TypeReference getGeneratorStub(final Grammar grammar) {
    XtextGeneratorNaming _naming = XtextGeneratorNaming.naming(grammar);
    String _runtimeBasePackage = _naming.getRuntimeBasePackage();
    String _plus = (_runtimeBasePackage + ".generator.");
    String _name = GrammarUtil.getName(grammar);
    String _plus_1 = (_plus + _name);
    String _plus_2 = (_plus_1 + "Generator");
    return new TypeReference(_plus_2);
  }
  
  protected TypeReference getJavaMain(final Grammar grammar) {
    TypeReference _generatorStub = this.getGeneratorStub(grammar);
    String _packageName = _generatorStub.getPackageName();
    String _plus = (_packageName + ".Main");
    return new TypeReference(_plus);
  }
  
  @Override
  public void checkConfiguration(final XtextGenerator generator, final Issues issues) {
    boolean _and = false;
    if (!this.generateJavaMain) {
      _and = false;
    } else {
      _and = this.generateXtendMain;
    }
    if (_and) {
      issues.addWarning(generator, 
        "Options \'generateJavaMain\' and \'generateXtendMain\' are mutually exclusive. Generating Xtend only.", this);
      this.generateJavaMain = false;
    }
  }
  
  @Override
  public void generate(final LanguageConfig2 language) {
    Grammar _grammar = language.getGrammar();
    boolean _isGenerateStub = this.isGenerateStub(_grammar);
    if (_isGenerateStub) {
      GuiceModuleAccess.BindingFactory _bindingFactory = new GuiceModuleAccess.BindingFactory();
      TypeReference _typeRef = TypeReference.typeRef(IGenerator.class);
      Grammar _grammar_1 = language.getGrammar();
      TypeReference _generatorStub = this.getGeneratorStub(_grammar_1);
      GuiceModuleAccess.BindingFactory _addTypeToType = _bindingFactory.addTypeToType(_typeRef, _generatorStub);
      GuiceModuleAccess _runtimeGenModule = language.getRuntimeGenModule();
      _addTypeToType.contributeTo(_runtimeGenModule);
      ManifestAccess _runtimeManifest = this.projectConfig.getRuntimeManifest();
      boolean _tripleNotEquals = (_runtimeManifest != null);
      if (_tripleNotEquals) {
        ManifestAccess _runtimeManifest_1 = this.projectConfig.getRuntimeManifest();
        Set<String> _requiredBundles = _runtimeManifest_1.getRequiredBundles();
        _requiredBundles.add("org.eclipse.xtext.xbase.lib");
      }
      IFileSystemAccess2 _runtimeSrc = this.projectConfig.getRuntimeSrc();
      Grammar _grammar_2 = language.getGrammar();
      TypeReference _generatorStub_1 = this.getGeneratorStub(_grammar_2);
      boolean _containsXtendFile = this._extensions.containsXtendFile(_runtimeSrc, _generatorStub_1);
      boolean _not = (!_containsXtendFile);
      if (_not) {
        this.doGenerateStubFile(language);
      }
    }
    boolean _or = false;
    Grammar _grammar_3 = language.getGrammar();
    boolean _isGenerateStub_1 = this.isGenerateStub(_grammar_3);
    if (_isGenerateStub_1) {
      _or = true;
    } else {
      Grammar _grammar_4 = language.getGrammar();
      boolean _isGenerateJavaMain = this.isGenerateJavaMain(_grammar_4);
      _or = _isGenerateJavaMain;
    }
    if (_or) {
      ManifestAccess _runtimeManifest_2 = this.projectConfig.getRuntimeManifest();
      Set<String> _exportedPackages = _runtimeManifest_2.getExportedPackages();
      Grammar _grammar_5 = language.getGrammar();
      TypeReference _generatorStub_2 = this.getGeneratorStub(_grammar_5);
      String _packageName = _generatorStub_2.getPackageName();
      _exportedPackages.add(_packageName);
    }
    boolean _and = false;
    Grammar _grammar_6 = language.getGrammar();
    boolean _isGenerateJavaMain_1 = this.isGenerateJavaMain(_grammar_6);
    if (!_isGenerateJavaMain_1) {
      _and = false;
    } else {
      IFileSystemAccess2 _runtimeSrc_1 = this.projectConfig.getRuntimeSrc();
      Grammar _grammar_7 = language.getGrammar();
      TypeReference _javaMain = this.getJavaMain(_grammar_7);
      boolean _containsJavaFile = this._extensions.containsJavaFile(_runtimeSrc_1, _javaMain);
      boolean _not_1 = (!_containsJavaFile);
      _and = _not_1;
    }
    if (_and) {
      this.doGenerateJavaMain(language);
    }
    boolean _and_1 = false;
    Grammar _grammar_8 = language.getGrammar();
    boolean _isGenerateXtendMain = this.isGenerateXtendMain(_grammar_8);
    if (!_isGenerateXtendMain) {
      _and_1 = false;
    } else {
      IFileSystemAccess2 _runtimeSrc_2 = this.projectConfig.getRuntimeSrc();
      Grammar _grammar_9 = language.getGrammar();
      TypeReference _javaMain_1 = this.getJavaMain(_grammar_9);
      boolean _containsXtendFile_1 = this._extensions.containsXtendFile(_runtimeSrc_2, _javaMain_1);
      boolean _not_2 = (!_containsXtendFile_1);
      _and_1 = _not_2;
    }
    if (_and_1) {
      this.doGenerateXtendMain(language);
    }
    boolean _and_2 = false;
    Grammar _grammar_10 = language.getGrammar();
    boolean _isGenerateMwe = this.isGenerateMwe(_grammar_10);
    if (!_isGenerateMwe) {
      _and_2 = false;
    } else {
      IFileSystemAccess2 _runtimeSrc_3 = this.projectConfig.getRuntimeSrc();
      Grammar _grammar_11 = language.getGrammar();
      TypeReference _generatorStub_3 = this.getGeneratorStub(_grammar_11);
      String _path = _generatorStub_3.getPath();
      String _plus = (_path + "MWE.mwe2");
      boolean _isFile = _runtimeSrc_3.isFile(_plus);
      boolean _not_3 = (!_isFile);
      _and_2 = _not_3;
    }
    if (_and_2) {
      this.doGenerateMweFile(language);
    }
    this.contributeEclipsePluginGuiceBindings(language);
    ManifestAccess _eclipsePluginManifest = this.projectConfig.getEclipsePluginManifest();
    boolean _tripleNotEquals_1 = (_eclipsePluginManifest != null);
    if (_tripleNotEquals_1) {
      ManifestAccess _eclipsePluginManifest_1 = this.projectConfig.getEclipsePluginManifest();
      Set<String> _requiredBundles_1 = _eclipsePluginManifest_1.getRequiredBundles();
      _requiredBundles_1.add("org.eclipse.xtext.builder");
    }
    PluginXmlAccess _eclipsePluginPluginXml = this.projectConfig.getEclipsePluginPluginXml();
    boolean _tripleNotEquals_2 = (_eclipsePluginPluginXml != null);
    if (_tripleNotEquals_2) {
      this.contributeEclipsePluginExtensions(language);
    }
  }
  
  protected void contributeEclipsePluginGuiceBindings(final LanguageConfig2 language) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        TypeReference _typeRef = TypeReference.typeRef("org.eclipse.core.resources.ResourcesPlugin");
        _builder.append(_typeRef, "");
        _builder.append(".getWorkspace().getRoot()");
      }
    };
    final StringConcatenationClient expression = _client;
    StringConcatenationClient _client_1 = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("binder.bind(");
        TypeReference _typeRef = TypeReference.typeRef("org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer");
        _builder.append(_typeRef, "");
        _builder.append(".class).annotatedWith(");
        _builder.append(Names.class, "");
        _builder.append(".named(\"builderPreferenceInitializer\")).to(");
        TypeReference _typeRef_1 = TypeReference.typeRef("org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess.Initializer");
        _builder.append(_typeRef_1, "");
        _builder.append(".class);");
      }
    };
    final StringConcatenationClient statement = _client_1;
    GuiceModuleAccess.BindingFactory _bindingFactory = new GuiceModuleAccess.BindingFactory();
    TypeReference _typeRef = TypeReference.typeRef("org.eclipse.xtext.builder.IXtextBuilderParticipant");
    TypeReference _typeRef_1 = TypeReference.typeRef("org.eclipse.xtext.builder.BuilderParticipant");
    GuiceModuleAccess.BindingFactory _addTypeToType = _bindingFactory.addTypeToType(_typeRef, _typeRef_1);
    TypeReference _typeRef_2 = TypeReference.typeRef("org.eclipse.core.resources.IWorkspaceRoot");
    GuiceModuleAccess.BindingFactory _addTypeToInstance = _addTypeToType.addTypeToInstance(_typeRef_2, expression);
    GuiceModuleAccess.BindingFactory _addConfiguredBinding = _addTypeToInstance.addConfiguredBinding("BuilderPreferenceStoreInitializer", statement);
    GuiceModuleAccess _eclipsePluginGenModule = language.getEclipsePluginGenModule();
    _addConfiguredBinding.contributeTo(_eclipsePluginGenModule);
  }
  
  protected void doGenerateStubFile(final LanguageConfig2 language) {
    FileAccessFactory _with = this.fileAccessFactory.with(language);
    Grammar _grammar = language.getGrammar();
    TypeReference _generatorStub = this.getGeneratorStub(_grammar);
    final XtendFileAccess xtendFile = _with.createXtendFile(_generatorStub);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generates code from your model files on save.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    xtendFile.setTypeComment(_builder);
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("class ");
        Grammar _grammar = language.getGrammar();
        TypeReference _generatorStub = GeneratorFragment2.this.getGeneratorStub(_grammar);
        String _simpleName = _generatorStub.getSimpleName();
        _builder.append(_simpleName, "");
        _builder.append(" implements ");
        _builder.append(IGenerator.class, "");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("override void doGenerate(");
        _builder.append(Resource.class, "\t");
        _builder.append(" resource, ");
        _builder.append(IFileSystemAccess.class, "\t");
        _builder.append(" fsa) {");
        _builder.newLineIfNotEmpty();
        _builder.append("//\t\tfsa.generateFile(\'greetings.txt\', \'People to greet: \' + ");
        _builder.newLine();
        _builder.append("//\t\t\tresource.allContents");
        _builder.newLine();
        _builder.append("//\t\t\t\t.filter(typeof(Greeting))");
        _builder.newLine();
        _builder.append("//\t\t\t\t.map[name]");
        _builder.newLine();
        _builder.append("//\t\t\t\t.join(\', \'))");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    };
    xtendFile.setJavaContent(_client);
    IFileSystemAccess2 _runtimeSrc = this.projectConfig.getRuntimeSrc();
    xtendFile.writeTo(_runtimeSrc);
  }
  
  protected void doGenerateJavaMain(final LanguageConfig2 language) {
    FileAccessFactory _with = this.fileAccessFactory.with(language);
    Grammar _grammar = language.getGrammar();
    TypeReference _javaMain = this.getJavaMain(_grammar);
    final JavaFileAccess javaFile = _with.createJavaFile(_javaMain);
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("public class Main {");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static void main(String[] args) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("if (args.length == 0) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("System.err.println(\"Aborting: no path to EMF resource provided!\");");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(Injector.class, "\t\t");
        _builder.append(" injector = new ");
        XtextGeneratorNaming _naming = language.getNaming();
        TypeReference _runtimeSetup = _naming.getRuntimeSetup();
        _builder.append(_runtimeSetup, "\t\t");
        _builder.append("().createInjectorAndDoEMFRegistration();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("Main main = injector.getInstance(Main.class);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("main.runGenerator(args[0]);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("private ");
        _builder.append(Provider.class, "\t");
        _builder.append("<");
        _builder.append(ResourceSet.class, "\t");
        _builder.append("> resourceSetProvider;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("private ");
        _builder.append(IResourceValidator.class, "\t");
        _builder.append(" validator;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("private ");
        _builder.append(IGenerator.class, "\t");
        _builder.append(" generator;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("private ");
        _builder.append(JavaIoFileSystemAccess.class, "\t");
        _builder.append(" fileAccess;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("protected void runGenerator(String string) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Load the resource");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(ResourceSet.class, "\t\t");
        _builder.append(" set = resourceSetProvider.get();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append(Resource.class, "\t\t");
        _builder.append(" resource = set.getResource(");
        _builder.append(URI.class, "\t\t");
        _builder.append(".createURI(string), true);");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Validate the resource");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(List.class, "\t\t");
        _builder.append("<");
        _builder.append(Issue.class, "\t\t");
        _builder.append("> list = validator.validate(resource, ");
        _builder.append(CheckMode.class, "\t\t");
        _builder.append(".ALL, ");
        _builder.append(CancelIndicator.class, "\t\t");
        _builder.append(".NullImpl);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("if (!list.isEmpty()) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("for (");
        _builder.append(Issue.class, "\t\t\t");
        _builder.append(" issue : list) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t");
        _builder.append("System.err.println(issue);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Configure and start the generator");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("fileAccess.setOutputPath(\"src-gen/\");");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("generator.doGenerate(resource, fileAccess);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("System.out.println(\"Code generation finished.\");");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    };
    javaFile.setJavaContent(_client);
    IFileSystemAccess2 _runtimeSrc = this.projectConfig.getRuntimeSrc();
    javaFile.writeTo(_runtimeSrc);
  }
  
  protected void doGenerateXtendMain(final LanguageConfig2 language) {
    FileAccessFactory _with = this.fileAccessFactory.with(language);
    Grammar _grammar = language.getGrammar();
    TypeReference _javaMain = this.getJavaMain(_grammar);
    final XtendFileAccess xtendFile = _with.createXtendFile(_javaMain);
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("class Main {");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("def static main(String[] args) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("if (args.empty) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("System::err.println(\'Aborting: no path to EMF resource provided!\')");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("return");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("val injector = new ");
        XtextGeneratorNaming _naming = language.getNaming();
        TypeReference _runtimeSetup = _naming.getRuntimeSetup();
        _builder.append(_runtimeSetup, "\t\t");
        _builder.append("().createInjectorAndDoEMFRegistration");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("val main = injector.getInstance(Main)");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("main.runGenerator(args.get(0))");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.append(" ");
        _builder.append(Provider.class, "\t");
        _builder.append("<");
        _builder.append(ResourceSet.class, "\t");
        _builder.append("> resourceSetProvider");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.append(" ");
        _builder.append(IResourceValidator.class, "\t");
        _builder.append(" validator");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.append(" ");
        _builder.append(IGenerator.class, "\t");
        _builder.append(" generator");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@");
        _builder.append(Inject.class, "\t");
        _builder.append(" ");
        _builder.append(JavaIoFileSystemAccess.class, "\t");
        _builder.append(" fileAccess");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("def protected runGenerator(String string) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Load the resource");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("val set = resourceSetProvider.get");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("val resource = set.getResource(");
        _builder.append(URI.class, "\t\t");
        _builder.append(".createURI(string), true)");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Validate the resource");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("val issues = validator.validate(resource, ");
        _builder.append(CheckMode.class, "\t\t");
        _builder.append(".ALL, ");
        _builder.append(CancelIndicator.class, "\t\t");
        _builder.append(".NullImpl)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("if (!issues.empty) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("issues.forEach[System.err.println(it)]");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("return");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Configure and start the generator");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("fileAccess.outputPath = \'src-gen/\'");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("generator.doGenerate(resource, fileAccess)");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("System.out.println(\'Code generation finished.\')");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    };
    xtendFile.setJavaContent(_client);
    IFileSystemAccess2 _runtimeSrc = this.projectConfig.getRuntimeSrc();
    xtendFile.writeTo(_runtimeSrc);
  }
  
  protected void doGenerateMweFile(final LanguageConfig2 language) {
    FileAccessFactory _with = this.fileAccessFactory.with(language);
    final TextFileAccess mweFile = _with.createTextFile();
    Grammar _grammar = language.getGrammar();
    TypeReference _generatorStub = this.getGeneratorStub(_grammar);
    String _path = _generatorStub.getPath();
    String _plus = (_path + "MWE.mwe2");
    mweFile.setPath(_plus);
    StringConcatenation _builder = new StringConcatenation();
    String _fileHeader = this.codeConfig.getFileHeader();
    _builder.append(_fileHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("module ");
    Grammar _grammar_1 = language.getGrammar();
    TypeReference _generatorStub_1 = this.getGeneratorStub(_grammar_1);
    String _name = _generatorStub_1.getName();
    _builder.append(_name, "");
    _builder.append("MWE");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.mwe.utils.*");
    _builder.newLine();
    _builder.append("import ");
    XtextGeneratorNaming _naming = language.getNaming();
    TypeReference _runtimeSetup = _naming.getRuntimeSetup();
    String _packageName = _runtimeSetup.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(".*");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("var targetDir");
    _builder.newLine();
    _builder.append("var modelPath");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Workflow {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("component = org.eclipse.xtext.mwe.Reader {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// lookup all resources on the classpath");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// useJavaClassPath = true");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// or define search scope explicitly");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("path = modelPath");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// this class will be generated by the xtext generator ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("register = ");
    XtextGeneratorNaming _naming_1 = language.getNaming();
    TypeReference _runtimeSetup_1 = _naming_1.getRuntimeSetup();
    String _simpleName = _runtimeSetup_1.getSimpleName();
    _builder.append(_simpleName, "\t\t");
    _builder.append(" {}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("loadResource = {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("slot = \"model\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("component = org.eclipse.xtext.generator.GeneratorComponent {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("register = ");
    XtextGeneratorNaming _naming_2 = language.getNaming();
    TypeReference _runtimeSetup_2 = _naming_2.getRuntimeSetup();
    String _simpleName_1 = _runtimeSetup_2.getSimpleName();
    _builder.append(_simpleName_1, "\t\t");
    _builder.append(" {}");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("slot = \'model\'");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("outlet = {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("path = targetDir");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    mweFile.setContent(_builder);
    IFileSystemAccess2 _runtimeSrc = this.projectConfig.getRuntimeSrc();
    mweFile.writeTo(_runtimeSrc);
  }
  
  protected boolean contributeEclipsePluginExtensions(final LanguageConfig2 language) {
    boolean _xblockexpression = false;
    {
      Grammar _grammar = language.getGrammar();
      final String name = _grammar.getName();
      PluginXmlAccess _eclipsePluginPluginXml = this.projectConfig.getEclipsePluginPluginXml();
      List<CharSequence> _entries = _eclipsePluginPluginXml.getEntries();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<extension point=\"org.eclipse.xtext.builder.participant\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<participant");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class=\"");
      XtextGeneratorNaming _naming = language.getNaming();
      TypeReference _eclipsePluginExecutableExtensionFactory = _naming.getEclipsePluginExecutableExtensionFactory();
      _builder.append(_eclipsePluginExecutableExtensionFactory, "\t\t");
      _builder.append(":org.eclipse.xtext.builder.IXtextBuilderParticipant\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("fileExtensions=\"");
      List<String> _fileExtensions = language.getFileExtensions();
      String _join = IterableExtensions.join(_fileExtensions, ",");
      _builder.append(_join, "\t\t");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("</participant>");
      _builder.newLine();
      _builder.append("</extension>");
      _builder.newLine();
      _builder.append("<extension point=\"org.eclipse.ui.preferencePages\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<page");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("category=\"");
      _builder.append(name, "\t\t");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("class=\"");
      XtextGeneratorNaming _naming_1 = language.getNaming();
      TypeReference _eclipsePluginExecutableExtensionFactory_1 = _naming_1.getEclipsePluginExecutableExtensionFactory();
      _builder.append(_eclipsePluginExecutableExtensionFactory_1, "\t\t");
      _builder.append(":org.eclipse.xtext.builder.preferences.BuilderPreferencePage\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("id=\"");
      _builder.append(name, "\t\t");
      _builder.append(".compiler.preferencePage\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("name=\"Compiler\">");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<keywordReference id=\"");
      Grammar _grammar_1 = language.getGrammar();
      String _namespace = GrammarUtil.getNamespace(_grammar_1);
      String _plus = (_namespace + ".ui.keyword_");
      Grammar _grammar_2 = language.getGrammar();
      String _name = GrammarUtil.getName(_grammar_2);
      String _plus_1 = (_plus + _name);
      _builder.append(_plus_1, "\t\t");
      _builder.append("\"/>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("</page>");
      _builder.newLine();
      _builder.append("</extension>");
      _builder.newLine();
      _builder.append("<extension point=\"org.eclipse.ui.propertyPages\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<page");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("category=\"");
      _builder.append(name, "\t\t");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("class=\"");
      XtextGeneratorNaming _naming_2 = language.getNaming();
      TypeReference _eclipsePluginExecutableExtensionFactory_2 = _naming_2.getEclipsePluginExecutableExtensionFactory();
      _builder.append(_eclipsePluginExecutableExtensionFactory_2, "\t\t");
      _builder.append(":org.eclipse.xtext.builder.preferences.BuilderPreferencePage\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("id=\"");
      _builder.append(name, "\t\t");
      _builder.append(".compiler.propertyPage\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("name=\"Compiler\">");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<keywordReference id=\"");
      Grammar _grammar_3 = language.getGrammar();
      String _namespace_1 = GrammarUtil.getNamespace(_grammar_3);
      String _plus_2 = (_namespace_1 + ".ui.keyword_");
      Grammar _grammar_4 = language.getGrammar();
      String _name_1 = GrammarUtil.getName(_grammar_4);
      String _plus_3 = (_plus_2 + _name_1);
      _builder.append(_plus_3, "\t\t");
      _builder.append("\"/>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("<enabledWhen>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<adapt type=\"org.eclipse.core.resources.IProject\"/>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</enabledWhen>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<filter name=\"projectNature\" value=\"org.eclipse.xtext.ui.shared.xtextNature\"/>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</page>");
      _builder.newLine();
      _builder.append("</extension>");
      _builder.newLine();
      _builder.append("<extension point=\"org.eclipse.ui.menus\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<menuContribution locationURI=\"popup:#TextEditorContext?after=xtext.ui.openDeclaration\">");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<command");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("commandId=\"org.eclipse.xtext.ui.OpenGeneratedFileCommand\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("id=\"");
      _builder.append(name, "\t\t\t");
      _builder.append(".OpenGeneratedCode\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("style=\"push\">");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<visibleWhen checkEnabled=\"false\">");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("<reference definitionId=\"");
      _builder.append(name, "\t\t\t\t");
      _builder.append(".Editor.opened\" />");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("</visibleWhen>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("</command>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</menuContribution>");
      _builder.newLine();
      _builder.append("</extension>");
      _builder.newLine();
      _builder.append("<extension point=\"org.eclipse.ui.handlers\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<handler");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class=\"");
      XtextGeneratorNaming _naming_3 = language.getNaming();
      TypeReference _eclipsePluginExecutableExtensionFactory_3 = _naming_3.getEclipsePluginExecutableExtensionFactory();
      _builder.append(_eclipsePluginExecutableExtensionFactory_3, "\t\t");
      _builder.append(":org.eclipse.xtext.ui.generator.trace.OpenGeneratedFileHandler\"");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("commandId=\"org.eclipse.xtext.ui.OpenGeneratedFileCommand\">");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<activeWhen>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<reference definitionId=\"");
      _builder.append(name, "\t\t\t");
      _builder.append(".Editor.opened\" />");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("</activeWhen>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</handler>");
      _builder.newLine();
      _builder.append("</extension>");
      _builder.newLine();
      _xblockexpression = _entries.add(_builder.toString());
    }
    return _xblockexpression;
  }
  
  public void setGenerateStub(final boolean generateStub) {
    this.generateStub = generateStub;
  }
  
  public void setGenerateMwe(final boolean generateMwe) {
    this.generateMwe = generateMwe;
  }
  
  public void setGenerateJavaMain(final boolean generateJavaMain) {
    this.generateJavaMain = generateJavaMain;
  }
  
  public void setGenerateXtendMain(final boolean generateXtendMain) {
    this.generateXtendMain = generateXtendMain;
  }
}
