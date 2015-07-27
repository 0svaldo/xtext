/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtend.core.javaconverter;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.xtend.core.javaconverter.ASTParserFactory;
import org.eclipse.xtend.core.javaconverter.JavaASTFlattener;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Converts Java code or an ICompilationUnit to Xtend code<br>
 * 
 *  @author Dennis H�bner - Initial contribution and API
 */
@SuppressWarnings("all")
public class JavaConverter {
  @Accessors(AccessorType.PUBLIC_GETTER)
  public static class ConversionResult {
    private String xtendCode;
    
    private Iterable<String> problems = CollectionLiterals.<String>newArrayList();
    
    public static JavaConverter.ConversionResult create(final JavaASTFlattener flattener) {
      final JavaConverter.ConversionResult result = new JavaConverter.ConversionResult();
      String _result = flattener.getResult();
      result.xtendCode = _result;
      List<String> _problems = flattener.getProblems();
      boolean _notEquals = (!Objects.equal(_problems, null));
      if (_notEquals) {
        List<String> _problems_1 = flattener.getProblems();
        result.problems = _problems_1;
      }
      return result;
    }
    
    @Pure
    public String getXtendCode() {
      return this.xtendCode;
    }
    
    @Pure
    public Iterable<String> getProblems() {
      return this.problems;
    }
  }
  
  @Inject
  private ASTParserFactory astParserFactory;
  
  @Inject
  private Provider<JavaASTFlattener> astFlattenerProvider;
  
  private boolean fallbackConversionStartegy = false;
  
  public JavaConverter.ConversionResult toXtend(final ICompilationUnit cu) {
    try {
      final ASTParser parser = this.astParserFactory.createJavaParser(cu);
      final ASTNode root = parser.createAST(null);
      String _source = cu.getSource();
      Set<ASTNode> _singleton = Collections.<ASTNode>singleton(root);
      return this.executeAstFlattener(_source, _singleton);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * @param unitName some CU name e.g. Clazz. UnitName may not be <code>null</code>.<br>
   * 			See org.eclipse.jdt.core.dom.ASTParser.setUnitName(String)
   * @param javaSrc Java source code as String
   * @param classPathContext Contextual object from where to get the classpath entries (e.g. IProject)
   * @throws IllegalArgumentException if unitName is <code>null</code>
   */
  public JavaConverter.ConversionResult toXtend(final String unitName, final String javaSrc) {
    JavaConverter.ConversionResult _xblockexpression = null;
    {
      boolean _equals = Objects.equal(unitName, null);
      if (_equals) {
        throw new IllegalArgumentException();
      }
      ASTParser _createJavaParser = this.astParserFactory.createJavaParser();
      _xblockexpression = this.internalToXtend(unitName, javaSrc, null, _createJavaParser);
    }
    return _xblockexpression;
  }
  
  /**
   * @param unitName some CU name e.g. Clazz. UnitName may not be <code>null</code>.<br>
   * 			See org.eclipse.jdt.core.dom.ASTParser.setUnitName(String)
   * @param javaSrc Java source code as String
   * @param classPathContext Contextual object from where to get the classpath entries (e.g. IProject)
   * @throws IllegalArgumentException if unitName is <code>null</code>
   */
  public JavaConverter.ConversionResult toXtend(final String unitName, final String javaSrc, final Object classPathContext) {
    JavaConverter.ConversionResult _xblockexpression = null;
    {
      boolean _equals = Objects.equal(unitName, null);
      if (_equals) {
        throw new IllegalArgumentException();
      }
      ASTParser _createJavaParser = this.astParserFactory.createJavaParser(classPathContext);
      _xblockexpression = this.internalToXtend(unitName, javaSrc, null, _createJavaParser);
    }
    return _xblockexpression;
  }
  
  /**
   * @param javaSrc Java class source code as String
   * @param project JavaProject where the java source code comes from. If project is <code>null</code>, the parser will be<br>
   * 			 configured with the system class loader to resolve bindings.
   * @param imports imports to use
   * @param classPathContext Contextual object from where to get the classpath entries (e.g. IProject in eclipse Module in idea)
   */
  public JavaConverter.ConversionResult bodyDeclarationToXtend(final String javaSrc, final String[] imports, final Object classPathContext) {
    ASTParser _createJavaParser = this.astParserFactory.createJavaParser(classPathContext);
    return this.internalToXtend(null, javaSrc, imports, _createJavaParser);
  }
  
  /**
   * @param javaSrc Java class source code as String
   */
  public JavaConverter.ConversionResult statementToXtend(final String javaSrc) {
    final ASTParser parser = this.astParserFactory.createJavaParser();
    char[] _charArray = javaSrc.toCharArray();
    parser.setSource(_charArray);
    parser.setKind(ASTParser.K_STATEMENTS);
    final ASTNode root = parser.createAST(null);
    if ((root instanceof Block)) {
      List<Statement> statements = ((Block)root).statements();
      return this.executeAstFlattener(javaSrc, statements);
    }
    Set<ASTNode> _singleton = Collections.<ASTNode>singleton(root);
    return this.executeAstFlattener(javaSrc, _singleton);
  }
  
  /**
   * @param javaSrc Java class source code as String
   */
  public JavaConverter.ConversionResult expressionToXtend(final String javaSrc) {
    final ASTParser parser = this.astParserFactory.createJavaParser();
    char[] _charArray = javaSrc.toCharArray();
    parser.setSource(_charArray);
    parser.setKind(ASTParser.K_EXPRESSION);
    final ASTNode root = parser.createAST(null);
    Set<ASTNode> _singleton = Collections.<ASTNode>singleton(root);
    return this.executeAstFlattener(javaSrc, _singleton);
  }
  
  /**
   * @param unitName some CU name e.g. Clazz. If unitName is null, a body declaration content is considered.<br>
   * 			See org.eclipse.jdt.core.dom.ASTParser.setUnitName(String)
   * @param javaSrc Java source code as String
   * @param proj JavaProject where the java source code comes from
   */
  private JavaConverter.ConversionResult internalToXtend(final String unitName, final String javaSrc, final String[] imports, final ASTParser parser) {
    parser.setStatementsRecovery(true);
    parser.setResolveBindings(true);
    parser.setBindingsRecovery(true);
    final StringBuilder javaSrcBuilder = new StringBuilder();
    boolean _notEquals = (!Objects.equal(imports, null));
    if (_notEquals) {
      final Procedure1<String> _function = new Procedure1<String>() {
        @Override
        public void apply(final String it) {
          javaSrcBuilder.append((("import " + it) + ";"));
        }
      };
      IterableExtensions.<String>forEach(((Iterable<String>)Conversions.doWrapArray(imports)), _function);
    }
    boolean _equals = Objects.equal(unitName, null);
    if (_equals) {
      parser.setUnitName("MISSING");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class MISSING { ");
      _builder.append(javaSrc, "");
      _builder.append("}");
      javaSrcBuilder.append(_builder);
    } else {
      parser.setUnitName(unitName);
      javaSrcBuilder.append(javaSrc);
    }
    parser.setKind(ASTParser.K_COMPILATION_UNIT);
    final String preparedJavaSrc = javaSrcBuilder.toString();
    char[] _charArray = preparedJavaSrc.toCharArray();
    parser.setSource(_charArray);
    final ASTNode result = parser.createAST(null);
    Set<ASTNode> _singleton = Collections.<ASTNode>singleton(result);
    return this.executeAstFlattener(preparedJavaSrc, _singleton);
  }
  
  /**
   * @param  preparedJavaSource used to collect javadoc and comments
   */
  private JavaConverter.ConversionResult executeAstFlattener(final String preparedJavaSource, final Collection<? extends ASTNode> parseResult) {
    final JavaASTFlattener astFlattener = this.astFlattenerProvider.get();
    astFlattener.useFallBackStrategy(this.fallbackConversionStartegy);
    astFlattener.setJavaSources(preparedJavaSource);
    for (final ASTNode node : parseResult) {
      node.accept(astFlattener);
    }
    return JavaConverter.ConversionResult.create(astFlattener);
  }
  
  public JavaConverter useRobustSyntax() {
    this.fallbackConversionStartegy = true;
    return this;
  }
}
