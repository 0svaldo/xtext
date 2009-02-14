/*
Generated with Xtext
*/
package org.eclipse.xtext.parsetree.reconstr.parser.packrat;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.packrat.AbstractPackratParser;
import org.eclipse.xtext.parser.packrat.IParseResultFactory;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;

import org.eclipse.xtext.parsetree.reconstr.services.SimpleReconstrTestLanguageGrammarAccess;

public class SimpleReconstrTestLanguagePackratParser extends AbstractPackratParser {
	
	@Inject
	public SimpleReconstrTestLanguagePackratParser(IParseResultFactory parseResultFactory, SimpleReconstrTestLanguageGrammarAccess grammarAccess) {
		super(parseResultFactory, grammarAccess);
	}
	
	@Override
	protected SimpleReconstrTestLanguageParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration) {
		return new SimpleReconstrTestLanguageParserConfiguration(configuration, getGrammarAccess());
	}
	
	@Override
	protected SimpleReconstrTestLanguageGrammarAccess getGrammarAccess() {
		return (SimpleReconstrTestLanguageGrammarAccess)super.getGrammarAccess();
	}
	
}
