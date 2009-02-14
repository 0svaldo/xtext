/*
Generated with Xtext
*/
package org.eclipse.xtext.valueconverter.parser.packrat;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.packrat.AbstractPackratParser;
import org.eclipse.xtext.parser.packrat.IParseResultFactory;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;

import org.eclipse.xtext.valueconverter.services.Bug250313GrammarAccess;

public class Bug250313PackratParser extends AbstractPackratParser {
	
	@Inject
	public Bug250313PackratParser(IParseResultFactory parseResultFactory, Bug250313GrammarAccess grammarAccess) {
		super(parseResultFactory, grammarAccess);
	}
	
	@Override
	protected Bug250313ParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration) {
		return new Bug250313ParserConfiguration(configuration, getGrammarAccess());
	}
	
	@Override
	protected Bug250313GrammarAccess getGrammarAccess() {
		return (Bug250313GrammarAccess)super.getGrammarAccess();
	}
	
}
