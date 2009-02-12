lexer grammar InternalTerminalRulesTestLanguage;
@header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalTerminalRulesTestLanguage.g" 267
RULE_ID : '^'? (('a'..'z'|'A'..'Z')|'_') ((('a'..'z'|'A'..'Z')|'_')|'0'..'9')*;



// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalTerminalRulesTestLanguage.g" 271
RULE_INT : ('0'..'9')+;



// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalTerminalRulesTestLanguage.g" 275
RULE_STRING : ('\"' ('\\' ((((((('b'|'t')|'n')|'f')|'r')|'\"')|'\'')|'\\')|~(('\\'|'\"')))* '\"'|'\'' ('\\' ((((((('b'|'t')|'n')|'f')|'r')|'\"')|'\'')|'\\')|~(('\\'|'\'')))* '\'');



// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalTerminalRulesTestLanguage.g" 279
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';



// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalTerminalRulesTestLanguage.g" 283
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;



// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalTerminalRulesTestLanguage.g" 287
RULE_WS : (((' '|'\t')|'\r')|'\n')+;



// $ANTLR src "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalTerminalRulesTestLanguage.g" 291
RULE_ANY_OTHER : .;




