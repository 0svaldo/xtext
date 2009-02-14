lexer grammar InternalHiddenTerminalsTestLanguage;
@header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T8 : 'without' ;
T9 : 'hiddens' ;
T10 : ';' ;
T11 : 'with' ;
T12 : 'overriding' ;
T13 : '(' ;
T14 : ')' ;
T15 : 'call' ;
T16 : 'inheriting' ;
T17 : 'datatype' ;
T18 : 'rule' ;
T19 : 'hiding' ;

// $ANTLR src "./src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalHiddenTerminalsTestLanguage.g" 776
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';



// $ANTLR src "./src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalHiddenTerminalsTestLanguage.g" 780
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;



// $ANTLR src "./src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalHiddenTerminalsTestLanguage.g" 784
RULE_WS : (((' '|'\t')|'\r')|'\n')+;



// $ANTLR src "./src-gen/org/eclipse/xtext/parser/terminalrules/parser/antlr/internal/InternalHiddenTerminalsTestLanguage.g" 788
RULE_ANY_OTHER : .;




