lexer grammar InternalReferenceGrammar;
@header {
package org.eclipse.xtext.testlanguages.parser.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T12 : 'spielplatz' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'kind' ;
T16 : '(' ;
T17 : ')' ;
T18 : 'erwachsener' ;
T19 : 'spielzeug' ;
T20 : 'ROT' ;
T21 : 'BLAU' ;
T22 : 'GELB' ;
T23 : 'GR�N' ;

// $ANTLR src "./src-gen/org/eclipse/xtext/testlanguages/parser/internal/InternalReferenceGrammar.g" 383
RULE_ID : ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "./src-gen/org/eclipse/xtext/testlanguages/parser/internal/InternalReferenceGrammar.g" 385
RULE_INT : ('0'..'9')+;

// $ANTLR src "./src-gen/org/eclipse/xtext/testlanguages/parser/internal/InternalReferenceGrammar.g" 387
RULE_STRING : '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' | '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\'';

// $ANTLR src "./src-gen/org/eclipse/xtext/testlanguages/parser/internal/InternalReferenceGrammar.g" 389
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/xtext/testlanguages/parser/internal/InternalReferenceGrammar.g" 391
RULE_SL_COMMENT : '//' ( ~('\n'|'\r'))* ((options{greedy=true;}:'\r\n' | '\r' | '\n' ))? {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/xtext/testlanguages/parser/internal/InternalReferenceGrammar.g" 393
RULE_WS : (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/xtext/testlanguages/parser/internal/InternalReferenceGrammar.g" 395
RULE_LEXER_BODY : '<#' '.'* '#>';

// $ANTLR src "./src-gen/org/eclipse/xtext/testlanguages/parser/internal/InternalReferenceGrammar.g" 397
RULE_ANY_OTHER : .;


