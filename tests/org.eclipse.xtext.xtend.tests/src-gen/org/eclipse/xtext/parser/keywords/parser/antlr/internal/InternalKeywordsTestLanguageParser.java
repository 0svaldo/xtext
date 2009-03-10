package org.eclipse.xtext.parser.keywords.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parser.keywords.services.KeywordsTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalKeywordsTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'foo\\\\bar'", "'foo\\\\'", "'\\\\bar'", "'\\\\'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalKeywordsTestLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g"; }


     
     	private KeywordsTestLanguageGrammarAccess grammarAccess;
     	
        public InternalKeywordsTestLanguageParser(TokenStream input, IAstFactory factory, KeywordsTestLanguageGrammarAccess grammarAccess) {
            super(input, factory, grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	} 



    // $ANTLR start entryRuleModel
    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:69:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:69:47: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:70:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel71);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel81); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:77:1: ruleModel returns [EObject current=null] : ( (lv_first_0= 'foo\\\\bar' ) | (lv_second_1= 'foo\\\\' ) | (lv_third_2= '\\\\bar' ) | (lv_forth_3= '\\\\' ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_first_0=null;
        Token lv_second_1=null;
        Token lv_third_2=null;
        Token lv_forth_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:82:6: ( ( (lv_first_0= 'foo\\\\bar' ) | (lv_second_1= 'foo\\\\' ) | (lv_third_2= '\\\\bar' ) | (lv_forth_3= '\\\\' ) ) )
            // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:83:1: ( (lv_first_0= 'foo\\\\bar' ) | (lv_second_1= 'foo\\\\' ) | (lv_third_2= '\\\\bar' ) | (lv_forth_3= '\\\\' ) )
            {
            // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:83:1: ( (lv_first_0= 'foo\\\\bar' ) | (lv_second_1= 'foo\\\\' ) | (lv_third_2= '\\\\bar' ) | (lv_forth_3= '\\\\' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("83:1: ( (lv_first_0= 'foo\\\\bar' ) | (lv_second_1= 'foo\\\\' ) | (lv_third_2= '\\\\bar' ) | (lv_forth_3= '\\\\' ) )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:83:2: (lv_first_0= 'foo\\\\bar' )
                    {
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:83:2: (lv_first_0= 'foo\\\\bar' )
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:85:6: lv_first_0= 'foo\\\\bar'
                    {
                    lv_first_0=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleModel127); 

                            createLeafNode(grammarAccess.getModelAccess().getFirstFooBarKeyword_0_0(), "first"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "first", true, "foo\\bar", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:105:6: (lv_second_1= 'foo\\\\' )
                    {
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:105:6: (lv_second_1= 'foo\\\\' )
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:107:6: lv_second_1= 'foo\\\\'
                    {
                    lv_second_1=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleModel167); 

                            createLeafNode(grammarAccess.getModelAccess().getSecondFooKeyword_1_0(), "second"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "second", true, "foo\\", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:127:6: (lv_third_2= '\\\\bar' )
                    {
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:127:6: (lv_third_2= '\\\\bar' )
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:129:6: lv_third_2= '\\\\bar'
                    {
                    lv_third_2=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleModel207); 

                            createLeafNode(grammarAccess.getModelAccess().getThirdBarKeyword_2_0(), "third"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "third", true, "\\bar", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:149:6: (lv_forth_3= '\\\\' )
                    {
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:149:6: (lv_forth_3= '\\\\' )
                    // ../org.eclipse.xtext.xtend.tests/src-gen/org/eclipse/xtext/parser/keywords/parser/antlr/internal/InternalKeywordsTestLanguage.g:151:6: lv_forth_3= '\\\\'
                    {
                    lv_forth_3=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleModel247); 

                            createLeafNode(grammarAccess.getModelAccess().getForthReverseSolidusKeyword_3_0(), "forth"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "forth", true, "\\", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel71 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleModel207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModel247 = new BitSet(new long[]{0x0000000000000002L});

}