lexer grammar InternalEcoreDsl;
@header {
package org.eclipse.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T16 : 'import' ;
T17 : '=' ;
T18 : ';' ;
T19 : 'package' ;
T20 : 'nsURI' ;
T21 : 'nsPrefix' ;
T22 : '{' ;
T23 : '}' ;
T24 : 'datatype' ;
T25 : ':' ;
T26 : '@' ;
T27 : '(' ;
T28 : ',' ;
T29 : ')' ;
T30 : 'abstract' ;
T31 : 'interface' ;
T32 : 'class' ;
T33 : '<' ;
T34 : '>' ;
T35 : 'extends' ;
T36 : 'ID' ;
T37 : 'volatile' ;
T38 : 'transient' ;
T39 : 'unsettable' ;
T40 : 'derived' ;
T41 : 'attr' ;
T42 : '[' ;
T43 : '..' ;
T44 : ']' ;
T45 : 'val' ;
T46 : 'ref' ;
T47 : '#' ;
T48 : 'enum' ;
T49 : '?' ;
T50 : 'super' ;
T51 : 'op' ;
T52 : 'void' ;
T53 : 'throws' ;
T54 : '.' ;
T55 : '$' ;
T56 : '-' ;

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2907
RULE_BAG : 'bag';

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2909
RULE_RANDOM : 'random';

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2911
RULE_READONLY : 'readonly';

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2913
RULE_LOCAL : 'local';

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2915
RULE_SERIALIZABLE : '!serializable';

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2917
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2919
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2921
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2923
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2925
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2927
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.example.ecoredsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalEcoreDsl.g" 2929
RULE_ANY_OTHER : .;


