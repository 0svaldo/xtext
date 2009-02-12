package org.eclipse.xtext.valueconverter.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalBug250313Lexer extends Lexer {
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int T11=11;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int T12=12;
    public static final int Tokens=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public InternalBug250313Lexer() {;} 
    public InternalBug250313Lexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:10:5: ( '#2' )
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:10:7: '#2'
            {
            match("#2"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:11:5: ( 'mykeyword1' )
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:11:7: 'mykeyword1'
            {
            match("mykeyword1"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:127:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:127:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:127:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:127:12: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:127:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:129:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:129:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:129:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:129:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:131:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("131:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:132:6: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:132:10: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:132:12: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:132:56: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:133:15: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:133:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:133:22: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:133:66: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:136:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:136:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:136:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:136:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:138:17: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:138:19: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:138:24: (~ ( '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:138:24: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:138:38: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:138:39: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:138:39: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:138:39: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:140:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:140:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:140:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:142:16: ( . )
            // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:142:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:8: ( T11 | T12 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=9;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='#') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='2') ) {
                alt12=1;
            }
            else {
                alt12=9;}
        }
        else if ( (LA12_0=='m') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='y') ) {
                int LA12_12 = input.LA(3);

                if ( (LA12_12=='k') ) {
                    int LA12_19 = input.LA(4);

                    if ( (LA12_19=='e') ) {
                        int LA12_20 = input.LA(5);

                        if ( (LA12_20=='y') ) {
                            int LA12_21 = input.LA(6);

                            if ( (LA12_21=='w') ) {
                                int LA12_22 = input.LA(7);

                                if ( (LA12_22=='o') ) {
                                    int LA12_23 = input.LA(8);

                                    if ( (LA12_23=='r') ) {
                                        int LA12_24 = input.LA(9);

                                        if ( (LA12_24=='d') ) {
                                            int LA12_25 = input.LA(10);

                                            if ( (LA12_25=='1') ) {
                                                int LA12_26 = input.LA(11);

                                                if ( ((LA12_26>='0' && LA12_26<='9')||(LA12_26>='A' && LA12_26<='Z')||LA12_26=='_'||(LA12_26>='a' && LA12_26<='z')) ) {
                                                    alt12=3;
                                                }
                                                else {
                                                    alt12=2;}
                                            }
                                            else {
                                                alt12=3;}
                                        }
                                        else {
                                            alt12=3;}
                                    }
                                    else {
                                        alt12=3;}
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=3;}
                        }
                        else {
                            alt12=3;}
                    }
                    else {
                        alt12=3;}
                }
                else {
                    alt12=3;}
            }
            else {
                alt12=3;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_3 = input.LA(2);

            if ( ((LA12_3>='A' && LA12_3<='Z')||LA12_3=='_'||(LA12_3>='a' && LA12_3<='z')) ) {
                alt12=3;
            }
            else {
                alt12=9;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='z')) ) {
            alt12=3;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=4;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_6 = input.LA(2);

            if ( ((LA12_6>='\u0000' && LA12_6<='\uFFFE')) ) {
                alt12=5;
            }
            else {
                alt12=9;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_7 = input.LA(2);

            if ( ((LA12_7>='\u0000' && LA12_7<='\uFFFE')) ) {
                alt12=5;
            }
            else {
                alt12=9;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=6;
                }
                break;
            case '/':
                {
                alt12=7;
                }
                break;
            default:
                alt12=9;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=8;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=9;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:18: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 4 :
                // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:26: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 5 :
                // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:35: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 6 :
                // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:47: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 7 :
                // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:63: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 8 :
                // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:79: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 9 :
                // ../org.eclipse.xtext.generator.tests//src-gen/org/eclipse/xtext/valueconverter/parser/antlr/internal/InternalBug250313.g:1:87: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}