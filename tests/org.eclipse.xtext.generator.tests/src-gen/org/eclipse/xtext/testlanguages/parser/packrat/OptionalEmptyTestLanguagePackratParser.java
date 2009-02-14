/*
Generated with Xtext
*/
package org.eclipse.xtext.testlanguages.parser.packrat;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.packrat.AbstractPackratParser;
import org.eclipse.xtext.parser.packrat.IParseResultFactory;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;

import org.eclipse.xtext.testlanguages.services.OptionalEmptyTestLanguageGrammarAccess;

public class OptionalEmptyTestLanguagePackratParser extends AbstractPackratParser {
	
	@Inject
	public OptionalEmptyTestLanguagePackratParser(IParseResultFactory parseResultFactory, OptionalEmptyTestLanguageGrammarAccess grammarAccess) {
		super(parseResultFactory, grammarAccess);
	}
	
	@Override
	protected OptionalEmptyTestLanguageParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration) {
		return new OptionalEmptyTestLanguageParserConfiguration(configuration, getGrammarAccess());
	}
	
	@Override
	protected OptionalEmptyTestLanguageGrammarAccess getGrammarAccess() {
		return (OptionalEmptyTestLanguageGrammarAccess)super.getGrammarAccess();
	}
	
}
