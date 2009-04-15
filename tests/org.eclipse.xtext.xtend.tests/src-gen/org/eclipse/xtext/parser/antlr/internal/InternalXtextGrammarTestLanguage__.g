lexer grammar InternalXtextGrammarTestLanguage;
@header {
package org.eclipse.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'grammar' ;
T12 : 'with' ;
T13 : ',' ;
T14 : 'hidden' ;
T15 : '(' ;
T16 : ')' ;
T17 : '.' ;
T18 : 'generate' ;
T19 : 'as' ;
T20 : 'import' ;
T21 : 'returns' ;
T22 : ':' ;
T23 : ';' ;
T24 : '::' ;
T25 : '|' ;
T26 : '?' ;
T27 : '*' ;
T28 : '+' ;
T29 : '{' ;
T30 : '=' ;
T31 : '+=' ;
T32 : 'current' ;
T33 : '}' ;
T34 : '?=' ;
T35 : '[' ;
T36 : ']' ;
T37 : 'terminal' ;
T38 : '!' ;
T39 : '->' ;
T40 : '..' ;
T41 : 'enum' ;

// $ANTLR src "../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtextGrammarTestLanguage.g" 2668
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtextGrammarTestLanguage.g" 2670
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtextGrammarTestLanguage.g" 2672
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtextGrammarTestLanguage.g" 2674
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtextGrammarTestLanguage.g" 2676
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtextGrammarTestLanguage.g" 2678
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalXtextGrammarTestLanguage.g" 2680
RULE_ANY_OTHER : .;


