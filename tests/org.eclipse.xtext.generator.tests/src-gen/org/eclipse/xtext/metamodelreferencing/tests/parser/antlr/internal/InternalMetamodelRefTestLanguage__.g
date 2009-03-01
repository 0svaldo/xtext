lexer grammar InternalMetamodelRefTestLanguage;
@header {
package org.eclipse.xtext.metamodelreferencing.tests.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMetamodelRefTestLanguage.g" 195
RULE_ID : '^'? (('a'..'z'|'A'..'Z')|'_') ((('a'..'z'|'A'..'Z')|'_')|'0'..'9')*;



// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMetamodelRefTestLanguage.g" 199
RULE_INT : ('0'..'9')+;



// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMetamodelRefTestLanguage.g" 203
RULE_STRING : ('\"' ('\\' ((((((('b'|'t')|'n')|'f')|'r')|'\"')|'\'')|'\\')|~(('\\'|'\"')))* '\"'|'\'' ('\\' ((((((('b'|'t')|'n')|'f')|'r')|'\"')|'\'')|'\\')|~(('\\'|'\'')))* '\'');



// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMetamodelRefTestLanguage.g" 207
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';



// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMetamodelRefTestLanguage.g" 211
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;



// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMetamodelRefTestLanguage.g" 215
RULE_WS : (((' '|'\t')|'\r')|'\n')+;



// $ANTLR src "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/metamodelreferencing/tests/parser/antlr/internal/InternalMetamodelRefTestLanguage.g" 219
RULE_ANY_OTHER : .;




