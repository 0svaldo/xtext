/*
Generated with Xtext
*/
package org.eclipse.xtext.parser.terminalrules.parser.packrat;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.packrat.AbstractPackratParser;
import org.eclipse.xtext.parser.packrat.IParseResultFactory;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;

import org.eclipse.xtext.parser.terminalrules.services.XtextTerminalsTestLanguageGrammarAccess;

public class XtextTerminalsTestLanguagePackratParser extends AbstractPackratParser {
	
	@Inject
	public XtextTerminalsTestLanguagePackratParser(IParseResultFactory parseResultFactory, XtextTerminalsTestLanguageGrammarAccess grammarAccess) {
		super(parseResultFactory, grammarAccess);
	}
	
	@Override
	protected XtextTerminalsTestLanguageParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration) {
		return new XtextTerminalsTestLanguageParserConfiguration(configuration, getGrammarAccess());
	}
	
	@Override
	protected XtextTerminalsTestLanguageGrammarAccess getGrammarAccess() {
		return (XtextTerminalsTestLanguageGrammarAccess)super.getGrammarAccess();
	}
	
}
