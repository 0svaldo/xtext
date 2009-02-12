/*
Generated with Xtext
*/
package org.eclipse.xtext.parsetree.reconstr.parser.antlr;

import org.antlr.runtime.ANTLRInputStream;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

import org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal.InternalComplexReconstrTestLanguageLexer;
import org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal.InternalComplexReconstrTestLanguageParser;

import org.eclipse.xtext.parsetree.reconstr.services.ComplexReconstrTestLanguageGrammarAccess;

public class ComplexReconstrTestLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject 
    protected ITokenDefProvider antlrTokenDefProvider;
	
	@Inject
	private ComplexReconstrTestLanguageGrammarAccess grammarAccess;
	
	@Override
	protected IParseResult parse(String ruleName, ANTLRInputStream in) {
		InternalComplexReconstrTestLanguageLexer lexer = new InternalComplexReconstrTestLanguageLexer(in);
		XtextTokenStream stream = new XtextTokenStream(lexer, antlrTokenDefProvider);
		stream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		InternalComplexReconstrTestLanguageParser parser = new InternalComplexReconstrTestLanguageParser(
				stream, getElementFactory(), grammarAccess);
		parser.setTokenTypeMap(antlrTokenDefProvider.getTokenDefMap());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Root";
	}
	
	public ComplexReconstrTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ComplexReconstrTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
