/*
Generated with Xtext
*/
package org.eclipse.xtext.grammarinheritance.parser.packrat;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.packrat.AbstractPackratParser;
import org.eclipse.xtext.parser.packrat.IParseResultFactory;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;

import org.eclipse.xtext.grammarinheritance.services.AbstractTestLanguageGrammarAccess;

public class AbstractTestLanguagePackratParser extends AbstractPackratParser {
	
	@Inject
	public AbstractTestLanguagePackratParser(IParseResultFactory parseResultFactory, AbstractTestLanguageGrammarAccess grammarAccess) {
		super(parseResultFactory, grammarAccess);
	}
	
	@Override
	protected AbstractTestLanguageParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration) {
		return new AbstractTestLanguageParserConfiguration(configuration, getGrammarAccess());
	}
	
	@Override
	protected AbstractTestLanguageGrammarAccess getGrammarAccess() {
		return (AbstractTestLanguageGrammarAccess)super.getGrammarAccess();
	}
	
}
