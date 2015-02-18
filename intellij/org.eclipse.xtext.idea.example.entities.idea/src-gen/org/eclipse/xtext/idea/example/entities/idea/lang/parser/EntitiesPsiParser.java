package org.eclipse.xtext.idea.example.entities.idea.lang.parser;

import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.idea.parser.AbstractXtextPsiParser;
import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.idea.example.entities.idea.lang.EntitiesElementTypeProvider;
import org.eclipse.xtext.idea.example.entities.idea.parser.antlr.internal.PsiInternalEntitiesParser;
import org.eclipse.xtext.idea.example.entities.services.EntitiesGrammarAccess;

import com.google.inject.Inject;
import com.intellij.lang.PsiBuilder;

public class EntitiesPsiParser extends AbstractXtextPsiParser {

	@Inject 
	private EntitiesGrammarAccess grammarAccess;

	@Inject 
	private EntitiesElementTypeProvider elementTypeProvider;

	@Override
	protected AbstractPsiAntlrParser createParser(PsiBuilder builder, TokenStream tokenStream) {
		return new PsiInternalEntitiesParser(builder, tokenStream, elementTypeProvider, grammarAccess);
	}

}
