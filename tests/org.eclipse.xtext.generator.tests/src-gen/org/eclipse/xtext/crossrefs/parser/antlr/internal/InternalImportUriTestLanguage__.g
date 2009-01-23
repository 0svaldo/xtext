lexer grammar InternalImportUriTestLanguage;
@header {
package org.eclipse.xtext.crossrefs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'import' ;
T12 : 'type' ;
T13 : 'extends' ;

// $ANTLR src "./src-gen/org/eclipse/xtext/crossrefs/parser/antlr/internal/InternalImportUriTestLanguage.g" 248
RULE_ID : ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "./src-gen/org/eclipse/xtext/crossrefs/parser/antlr/internal/InternalImportUriTestLanguage.g" 250
RULE_INT : ('0'..'9')+;

// $ANTLR src "./src-gen/org/eclipse/xtext/crossrefs/parser/antlr/internal/InternalImportUriTestLanguage.g" 252
RULE_STRING : '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |                '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\'';

// $ANTLR src "./src-gen/org/eclipse/xtext/crossrefs/parser/antlr/internal/InternalImportUriTestLanguage.g" 254
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/xtext/crossrefs/parser/antlr/internal/InternalImportUriTestLanguage.g" 256
RULE_SL_COMMENT : '//' ~('\n'|'\r')* ('\r'? '\n')? {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/xtext/crossrefs/parser/antlr/internal/InternalImportUriTestLanguage.g" 258
RULE_WS : (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;};

// $ANTLR src "./src-gen/org/eclipse/xtext/crossrefs/parser/antlr/internal/InternalImportUriTestLanguage.g" 260
RULE_ANY_OTHER : .;


