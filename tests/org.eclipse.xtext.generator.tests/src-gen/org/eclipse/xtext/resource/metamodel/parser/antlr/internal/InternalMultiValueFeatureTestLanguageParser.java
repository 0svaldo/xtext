package org.eclipse.xtext.resource.metamodel.parser.antlr.internal; 

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
import org.eclipse.xtext.resource.metamodel.services.MultiValueFeatureTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalMultiValueFeatureTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalMultiValueFeatureTestLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.g"; }


     
     	private MultiValueFeatureTestLanguageGrammarAccess grammarAccess;
     	
        public InternalMultiValueFeatureTestLanguageParser(TokenStream input, IAstFactory factory, MultiValueFeatureTestLanguageGrammarAccess grammarAccess) {
            super(input, factory, grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Start";	
       	} 



    // $ANTLR start entryRuleStart
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.g:69:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.g:69:47: (iv_ruleStart= ruleStart EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.g:70:2: iv_ruleStart= ruleStart EOF
            {
             currentNode = createCompositeNode(grammarAccess.prStart().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleStart_in_entryRuleStart71);
            iv_ruleStart=ruleStart();
            _fsp--;

             current =iv_ruleStart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStart81); 

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
    // $ANTLR end entryRuleStart


    // $ANTLR start ruleStart
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.g:77:1: ruleStart returns [EObject current=null] : (lv_featureA_0= RULE_ID )+ ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        Token lv_featureA_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.g:82:6: ( (lv_featureA_0= RULE_ID )+ )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.g:83:1: (lv_featureA_0= RULE_ID )+
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.g:83:1: (lv_featureA_0= RULE_ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/resource/metamodel/parser/antlr/internal/InternalMultiValueFeatureTestLanguage.g:85:6: lv_featureA_0= RULE_ID
            	    {
            	    lv_featureA_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStart127); 

            	    		createLeafNode(grammarAccess.prStart().ele0TerminalRuleCallID(), "featureA"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.prStart().getRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "featureA", lv_featureA_0, "ID", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end ruleStart


 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart71 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStart127 = new BitSet(new long[]{0x0000000000000012L});

}