/*
Generated with Xtext
*/
package org.eclipse.xtext.parser.keywords.parser.packrat;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.packrat.AbstractPackratParser;
import org.eclipse.xtext.parser.packrat.IParseResultFactory;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;

import org.eclipse.xtext.parser.keywords.services.KeywordsTestLanguageGrammarAccess;

public class KeywordsTestLanguagePackratParser extends AbstractPackratParser {
	
	@Inject
	public KeywordsTestLanguagePackratParser(IParseResultFactory parseResultFactory, KeywordsTestLanguageGrammarAccess grammarAccess) {
		super(parseResultFactory, grammarAccess);
	}
	
	@Override
	protected KeywordsTestLanguageParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration) {
		return new KeywordsTestLanguageParserConfiguration(configuration, getGrammarAccess());
	}
	
	@Override
	protected KeywordsTestLanguageGrammarAccess getGrammarAccess() {
		return (KeywordsTestLanguageGrammarAccess)super.getGrammarAccess();
	}
	
}
