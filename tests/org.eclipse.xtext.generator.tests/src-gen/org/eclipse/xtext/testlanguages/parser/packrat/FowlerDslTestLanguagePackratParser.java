/*
Generated with Xtext
*/
package org.eclipse.xtext.testlanguages.parser.packrat;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.packrat.AbstractPackratParser;
import org.eclipse.xtext.parser.packrat.IParseResultFactory;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;

import org.eclipse.xtext.testlanguages.services.FowlerDslTestLanguageGrammarAccess;

public class FowlerDslTestLanguagePackratParser extends AbstractPackratParser {
	
	@Inject
	public FowlerDslTestLanguagePackratParser(IParseResultFactory parseResultFactory, FowlerDslTestLanguageGrammarAccess grammarAccess) {
		super(parseResultFactory, grammarAccess);
	}
	
	@Override
	protected FowlerDslTestLanguageParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration) {
		return new FowlerDslTestLanguageParserConfiguration(configuration, getGrammarAccess());
	}
	
	@Override
	protected FowlerDslTestLanguageGrammarAccess getGrammarAccess() {
		return (FowlerDslTestLanguageGrammarAccess)super.getGrammarAccess();
	}
	
}
