lexer grammar InternalLazyLinkingTestLanguage;
@header {
package org.eclipse.xtext.linking.lazy.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'type' ;
T12 : 'extends' ;
T13 : '.' ;
T14 : 'for' ;
T15 : 'in' ;
T16 : '{' ;
T17 : '}' ;
T18 : ';' ;

// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/linking/lazy/parser/antlr/internal/InternalLazyLinkingTestLanguage.g" 326
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/linking/lazy/parser/antlr/internal/InternalLazyLinkingTestLanguage.g" 328
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/linking/lazy/parser/antlr/internal/InternalLazyLinkingTestLanguage.g" 330
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/linking/lazy/parser/antlr/internal/InternalLazyLinkingTestLanguage.g" 332
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/linking/lazy/parser/antlr/internal/InternalLazyLinkingTestLanguage.g" 334
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/linking/lazy/parser/antlr/internal/InternalLazyLinkingTestLanguage.g" 336
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/linking/lazy/parser/antlr/internal/InternalLazyLinkingTestLanguage.g" 338
RULE_ANY_OTHER : .;


