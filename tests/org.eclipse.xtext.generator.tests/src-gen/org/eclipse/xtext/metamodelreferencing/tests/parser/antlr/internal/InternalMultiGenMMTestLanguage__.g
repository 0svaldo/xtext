lexer grammar InternalMultiGenMMTestLanguage;
@header {
package org.eclipse.xtext.metamodelreferencing.tests.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMultiGenMMTestLanguage.g" 176
RULE_ID : ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMultiGenMMTestLanguage.g" 178
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMultiGenMMTestLanguage.g" 180
RULE_STRING : 
			  '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' | 
              '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
              ;

// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMultiGenMMTestLanguage.g" 185
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )* '*/';

// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMultiGenMMTestLanguage.g" 187
RULE_SL_COMMENT : '//' ~('\n'|'\r')* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMultiGenMMTestLanguage.g" 189
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMultiGenMMTestLanguage.g" 191
RULE_ANY_OTHER : .;


