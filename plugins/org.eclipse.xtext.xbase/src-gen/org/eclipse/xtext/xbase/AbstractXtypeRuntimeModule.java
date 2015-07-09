/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import java.util.Properties;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.formatting2.IFormatter2;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ITokenToStringConverter;
import org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider;
import org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ISyntacticSequencer;
import org.eclipse.xtext.service.DefaultRuntimeModule;
import org.eclipse.xtext.xbase.formatting2.XtypeFormatter;
import org.eclipse.xtext.xbase.parser.antlr.XtypeAntlrTokenFileProvider;
import org.eclipse.xtext.xbase.parser.antlr.XtypeParser;
import org.eclipse.xtext.xbase.parser.antlr.internal.InternalXtypeLexer;
import org.eclipse.xtext.xbase.serializer.XtypeSemanticSequencer;
import org.eclipse.xtext.xbase.serializer.XtypeSyntacticSequencer;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

/**
 * Manual modifications go to {@link XtypeRuntimeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractXtypeRuntimeModule extends DefaultRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "org/eclipse/xtext/xbase/Xtype.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("org.eclipse.xtext.xbase.Xtype");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("___xtype");
	}
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}
	
	// contributed by org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<? extends IGrammarAccess> bindIGrammarAccess() {
		return XtypeGrammarAccess.class;
	}
	
	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends ISemanticSequencer> bindISemanticSequencer() {
		return XtypeSemanticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends ISyntacticSequencer> bindISyntacticSequencer() {
		return XtypeSyntacticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.generator.serializer.SerializerFragment
	public Class<? extends ISerializer> bindISerializer() {
		return Serializer.class;
	}
	
	// contributed by org.eclipse.xtext.generator.formatting2.Formatter2Fragment
	public Class<? extends IFormatter2> bindIFormatter2() {
		return XtypeFormatter.class;
	}
	
	// contributed by org.eclipse.xtext.generator.formatting2.Formatter2Fragment
	public void configureFormatterPreferences(Binder binder) {
		binder.bind(org.eclipse.xtext.preferences.IPreferenceValuesProvider.class).annotatedWith(org.eclipse.xtext.formatting2.FormatterPreferences.class).to(org.eclipse.xtext.formatting2.FormatterPreferenceValuesProvider.class);
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends IParser> bindIParser() {
		return XtypeParser.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends ITokenToStringConverter> bindITokenToStringConverter() {
		return AntlrTokenToStringConverter.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return XtypeAntlrTokenFileProvider.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends Lexer> bindLexer() {
		return InternalXtypeLexer.class;
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Provider<InternalXtypeLexer> provideInternalXtypeLexer() {
		return org.eclipse.xtext.parser.antlr.LexerProvider.create(org.eclipse.xtext.xbase.parser.antlr.internal.InternalXtypeLexer.class);
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public void configureRuntimeLexer(Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME)).to(org.eclipse.xtext.xbase.parser.antlr.internal.InternalXtypeLexer.class);
	}
	
	// contributed by org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment
	public Class<? extends ITokenDefProvider> bindITokenDefProvider() {
		return AntlrTokenDefProvider.class;
	}
	
}
