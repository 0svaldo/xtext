package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal; 

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
import org.eclipse.xtext.parsetree.reconstr.services.ComplexReconstrTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalComplexReconstrTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'('", "')'", "'!'", "'TG'", "'['", "','", "']'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalComplexReconstrTestLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g"; }


     
     	private ComplexReconstrTestLanguageGrammarAccess grammarAccess;
     	
        public InternalComplexReconstrTestLanguageParser(TokenStream input, IAstFactory factory, ComplexReconstrTestLanguageGrammarAccess grammarAccess) {
            super(input, factory, grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	} 



    // $ANTLR start entryRuleRoot
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:69:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:69:46: (iv_ruleRoot= ruleRoot EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:70:2: iv_ruleRoot= ruleRoot EOF
            {
             currentNode = createCompositeNode(grammarAccess.prRoot().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleRoot_in_entryRuleRoot71);
            iv_ruleRoot=ruleRoot();
            _fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoot81); 

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
    // $ANTLR end entryRuleRoot


    // $ANTLR start ruleRoot
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:77:1: ruleRoot returns [EObject current=null] : (this_Op_0= ruleOp | this_TrickyG_1= ruleTrickyG ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Op_0 = null;

        EObject this_TrickyG_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:82:6: ( (this_Op_0= ruleOp | this_TrickyG_1= ruleTrickyG ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:83:1: (this_Op_0= ruleOp | this_TrickyG_1= ruleTrickyG )
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:83:1: (this_Op_0= ruleOp | this_TrickyG_1= ruleTrickyG )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("83:1: (this_Op_0= ruleOp | this_TrickyG_1= ruleTrickyG )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:84:5: this_Op_0= ruleOp
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prRoot().ele0ParserRuleCallOp(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOp_in_ruleRoot128);
                    this_Op_0=ruleOp();
                    _fsp--;

                     
                            current = this_Op_0; 
                            currentNode = currentNode.getParent();
                        
                     
                        createLeafNode(grammarAccess.prRoot().ele0ParserRuleCallOp(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:98:5: this_TrickyG_1= ruleTrickyG
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prRoot().ele1ParserRuleCallTrickyG(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTrickyG_in_ruleRoot162);
                    this_TrickyG_1=ruleTrickyG();
                    _fsp--;

                     
                            current = this_TrickyG_1; 
                            currentNode = currentNode.getParent();
                        
                     
                        createLeafNode(grammarAccess.prRoot().ele1ParserRuleCallTrickyG(), null); 
                        

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
    // $ANTLR end ruleRoot


    // $ANTLR start entryRuleOp
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:117:1: entryRuleOp returns [EObject current=null] : iv_ruleOp= ruleOp EOF ;
    public final EObject entryRuleOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOp = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:117:44: (iv_ruleOp= ruleOp EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:118:2: iv_ruleOp= ruleOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.prOp().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleOp_in_entryRuleOp201);
            iv_ruleOp=ruleOp();
            _fsp--;

             current =iv_ruleOp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOp211); 

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
    // $ANTLR end entryRuleOp


    // $ANTLR start ruleOp
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:125:1: ruleOp returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () '+' ) (lv_addOperands_3= ruleTerm ) ) | ( ( () '-' ) (lv_minusOperands_6= ruleTerm ) ) )* ) ;
    public final EObject ruleOp() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        EObject lv_addOperands_3 = null;

        EObject lv_minusOperands_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:130:6: ( (this_Term_0= ruleTerm ( ( ( () '+' ) (lv_addOperands_3= ruleTerm ) ) | ( ( () '-' ) (lv_minusOperands_6= ruleTerm ) ) )* ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:131:1: (this_Term_0= ruleTerm ( ( ( () '+' ) (lv_addOperands_3= ruleTerm ) ) | ( ( () '-' ) (lv_minusOperands_6= ruleTerm ) ) )* )
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:131:1: (this_Term_0= ruleTerm ( ( ( () '+' ) (lv_addOperands_3= ruleTerm ) ) | ( ( () '-' ) (lv_minusOperands_6= ruleTerm ) ) )* )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:132:5: this_Term_0= ruleTerm ( ( ( () '+' ) (lv_addOperands_3= ruleTerm ) ) | ( ( () '-' ) (lv_minusOperands_6= ruleTerm ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.prOp().ele0ParserRuleCallTerm(), currentNode); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleOp258);
            this_Term_0=ruleTerm();
            _fsp--;

             
                    current = this_Term_0; 
                    currentNode = currentNode.getParent();
                
             
                createLeafNode(grammarAccess.prOp().ele0ParserRuleCallTerm(), null); 
                
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:144:1: ( ( ( () '+' ) (lv_addOperands_3= ruleTerm ) ) | ( ( () '-' ) (lv_minusOperands_6= ruleTerm ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }
                else if ( (LA2_0==12) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:144:2: ( ( () '+' ) (lv_addOperands_3= ruleTerm ) )
            	    {
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:144:2: ( ( () '+' ) (lv_addOperands_3= ruleTerm ) )
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:144:3: ( () '+' ) (lv_addOperands_3= ruleTerm )
            	    {
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:144:3: ( () '+' )
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:144:4: () '+'
            	    {
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:144:4: ()
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:145:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.prOp().ele1000ActionAddaddOperands().getTypeName().getType());
            	            try {
            	            	factory.add(temp, "addOperands", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.prOp().ele1000ActionAddaddOperands(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,11,FOLLOW_11_in_ruleOp285); 

            	            createLeafNode(grammarAccess.prOp().ele1001KeywordPlusSign(), null); 
            	        

            	    }

            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:164:2: (lv_addOperands_3= ruleTerm )
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:167:6: lv_addOperands_3= ruleTerm
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.prOp().ele1010ParserRuleCallTerm(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleOp320);
            	    lv_addOperands_3=ruleTerm();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.prOp().getRule().getType().getType());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "addOperands", lv_addOperands_3, "Term", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:186:6: ( ( () '-' ) (lv_minusOperands_6= ruleTerm ) )
            	    {
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:186:6: ( ( () '-' ) (lv_minusOperands_6= ruleTerm ) )
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:186:7: ( () '-' ) (lv_minusOperands_6= ruleTerm )
            	    {
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:186:7: ( () '-' )
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:186:8: () '-'
            	    {
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:186:8: ()
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:187:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.prOp().ele1100ActionMinusminusOperands().getTypeName().getType());
            	            try {
            	            	factory.add(temp, "minusOperands", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.prOp().ele1100ActionMinusminusOperands(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,12,FOLLOW_12_in_ruleOp351); 

            	            createLeafNode(grammarAccess.prOp().ele1101KeywordHyphenMinus(), null); 
            	        

            	    }

            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:206:2: (lv_minusOperands_6= ruleTerm )
            	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:209:6: lv_minusOperands_6= ruleTerm
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.prOp().ele1110ParserRuleCallTerm(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleOp386);
            	    lv_minusOperands_6=ruleTerm();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.prOp().getRule().getType().getType());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "minusOperands", lv_minusOperands_6, "Term", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end ruleOp


    // $ANTLR start entryRuleTerm
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:234:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:234:46: (iv_ruleTerm= ruleTerm EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:235:2: iv_ruleTerm= ruleTerm EOF
            {
             currentNode = createCompositeNode(grammarAccess.prTerm().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm426);
            iv_ruleTerm=ruleTerm();
            _fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm436); 

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
    // $ANTLR end entryRuleTerm


    // $ANTLR start ruleTerm
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:242:1: ruleTerm returns [EObject current=null] : (this_Atom_0= ruleAtom | this_Parens_1= ruleParens ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_Parens_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:247:6: ( (this_Atom_0= ruleAtom | this_Parens_1= ruleParens ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:248:1: (this_Atom_0= ruleAtom | this_Parens_1= ruleParens )
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:248:1: (this_Atom_0= ruleAtom | this_Parens_1= ruleParens )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("248:1: (this_Atom_0= ruleAtom | this_Parens_1= ruleParens )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:249:5: this_Atom_0= ruleAtom
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prTerm().ele0ParserRuleCallAtom(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAtom_in_ruleTerm483);
                    this_Atom_0=ruleAtom();
                    _fsp--;

                     
                            current = this_Atom_0; 
                            currentNode = currentNode.getParent();
                        
                     
                        createLeafNode(grammarAccess.prTerm().ele0ParserRuleCallAtom(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:263:5: this_Parens_1= ruleParens
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prTerm().ele1ParserRuleCallParens(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleParens_in_ruleTerm517);
                    this_Parens_1=ruleParens();
                    _fsp--;

                     
                            current = this_Parens_1; 
                            currentNode = currentNode.getParent();
                        
                     
                        createLeafNode(grammarAccess.prTerm().ele1ParserRuleCallParens(), null); 
                        

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
    // $ANTLR end ruleTerm


    // $ANTLR start entryRuleAtom
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:282:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:282:46: (iv_ruleAtom= ruleAtom EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:283:2: iv_ruleAtom= ruleAtom EOF
            {
             currentNode = createCompositeNode(grammarAccess.prAtom().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom556);
            iv_ruleAtom=ruleAtom();
            _fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom566); 

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
    // $ANTLR end entryRuleAtom


    // $ANTLR start ruleAtom
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:290:1: ruleAtom returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:295:6: ( (lv_name_0= RULE_ID ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:296:1: (lv_name_0= RULE_ID )
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:296:1: (lv_name_0= RULE_ID )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:298:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtom612); 

            		createLeafNode(grammarAccess.prAtom().ele0TerminalRuleCallID(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prAtom().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

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
    // $ANTLR end ruleAtom


    // $ANTLR start entryRuleParens
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:323:1: entryRuleParens returns [EObject current=null] : iv_ruleParens= ruleParens EOF ;
    public final EObject entryRuleParens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParens = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:323:48: (iv_ruleParens= ruleParens EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:324:2: iv_ruleParens= ruleParens EOF
            {
             currentNode = createCompositeNode(grammarAccess.prParens().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleParens_in_entryRuleParens652);
            iv_ruleParens=ruleParens();
            _fsp--;

             current =iv_ruleParens; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParens662); 

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
    // $ANTLR end entryRuleParens


    // $ANTLR start ruleParens
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:331:1: ruleParens returns [EObject current=null] : ( ( ( '(' this_Op_1= ruleOp ) ')' ) (lv_em_3= '!' )? ) ;
    public final EObject ruleParens() throws RecognitionException {
        EObject current = null;

        Token lv_em_3=null;
        EObject this_Op_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:336:6: ( ( ( ( '(' this_Op_1= ruleOp ) ')' ) (lv_em_3= '!' )? ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:337:1: ( ( ( '(' this_Op_1= ruleOp ) ')' ) (lv_em_3= '!' )? )
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:337:1: ( ( ( '(' this_Op_1= ruleOp ) ')' ) (lv_em_3= '!' )? )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:337:2: ( ( '(' this_Op_1= ruleOp ) ')' ) (lv_em_3= '!' )?
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:337:2: ( ( '(' this_Op_1= ruleOp ) ')' )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:337:3: ( '(' this_Op_1= ruleOp ) ')'
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:337:3: ( '(' this_Op_1= ruleOp )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:337:4: '(' this_Op_1= ruleOp
            {
            match(input,13,FOLLOW_13_in_ruleParens698); 

                    createLeafNode(grammarAccess.prParens().ele000KeywordLeftParenthesis(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.prParens().ele001ParserRuleCallOp(), currentNode); 
                
            pushFollow(FOLLOW_ruleOp_in_ruleParens720);
            this_Op_1=ruleOp();
            _fsp--;

             
                    current = this_Op_1; 
                    currentNode = currentNode.getParent();
                
             
                createLeafNode(grammarAccess.prParens().ele001ParserRuleCallOp(), null); 
                

            }

            match(input,14,FOLLOW_14_in_ruleParens736); 

                    createLeafNode(grammarAccess.prParens().ele01KeywordRightParenthesis(), null); 
                

            }

            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:358:2: (lv_em_3= '!' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:360:6: lv_em_3= '!'
                    {
                    lv_em_3=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleParens758); 

                            createLeafNode(grammarAccess.prParens().ele10KeywordExclamationMark(), "em"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.prParens().getRule().getType().getType());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "em", /* lv_em_3 */ input.LT(-1), "!", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


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
    // $ANTLR end ruleParens


    // $ANTLR start entryRuleTrickyA1
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:388:1: entryRuleTrickyA1 returns [EObject current=null] : iv_ruleTrickyA1= ruleTrickyA1 EOF ;
    public final EObject entryRuleTrickyA1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrickyA1 = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:388:50: (iv_ruleTrickyA1= ruleTrickyA1 EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:389:2: iv_ruleTrickyA1= ruleTrickyA1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.prTrickyA1().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrickyA1_in_entryRuleTrickyA1807);
            iv_ruleTrickyA1=ruleTrickyA1();
            _fsp--;

             current =iv_ruleTrickyA1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrickyA1817); 

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
    // $ANTLR end entryRuleTrickyA1


    // $ANTLR start ruleTrickyA1
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:396:1: ruleTrickyA1 returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleTrickyA1() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:401:6: ( (lv_name_0= RULE_ID ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:402:1: (lv_name_0= RULE_ID )
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:402:1: (lv_name_0= RULE_ID )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:404:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrickyA1863); 

            		createLeafNode(grammarAccess.prTrickyA1().ele0TerminalRuleCallID(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.prTrickyA1().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		add(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

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
    // $ANTLR end ruleTrickyA1


    // $ANTLR start entryRuleTrickyG
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:439:1: entryRuleTrickyG returns [EObject current=null] : iv_ruleTrickyG= ruleTrickyG EOF ;
    public final EObject entryRuleTrickyG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrickyG = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:439:49: (iv_ruleTrickyG= ruleTrickyG EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:440:2: iv_ruleTrickyG= ruleTrickyG EOF
            {
             currentNode = createCompositeNode(grammarAccess.prTrickyG().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrickyG_in_entryRuleTrickyG913);
            iv_ruleTrickyG=ruleTrickyG();
            _fsp--;

             current =iv_ruleTrickyG; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrickyG923); 

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
    // $ANTLR end entryRuleTrickyG


    // $ANTLR start ruleTrickyG
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:447:1: ruleTrickyG returns [EObject current=null] : ( 'TG' (lv_tree_1= ruleTrickyG1 ) ) ;
    public final EObject ruleTrickyG() throws RecognitionException {
        EObject current = null;

        EObject lv_tree_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:452:6: ( ( 'TG' (lv_tree_1= ruleTrickyG1 ) ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:453:1: ( 'TG' (lv_tree_1= ruleTrickyG1 ) )
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:453:1: ( 'TG' (lv_tree_1= ruleTrickyG1 ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:453:2: 'TG' (lv_tree_1= ruleTrickyG1 )
            {
            match(input,16,FOLLOW_16_in_ruleTrickyG957); 

                    createLeafNode(grammarAccess.prTrickyG().ele0KeywordTG(), null); 
                
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:457:1: (lv_tree_1= ruleTrickyG1 )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:460:6: lv_tree_1= ruleTrickyG1
            {
             
            	        currentNode=createCompositeNode(grammarAccess.prTrickyG().ele10ParserRuleCallTrickyG1(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTrickyG1_in_ruleTrickyG991);
            lv_tree_1=ruleTrickyG1();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.prTrickyG().getRule().getType().getType());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "tree", lv_tree_1, "TrickyG1", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


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
    // $ANTLR end ruleTrickyG


    // $ANTLR start entryRuleTrickyG1
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:485:1: entryRuleTrickyG1 returns [EObject current=null] : iv_ruleTrickyG1= ruleTrickyG1 EOF ;
    public final EObject entryRuleTrickyG1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrickyG1 = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:485:50: (iv_ruleTrickyG1= ruleTrickyG1 EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:486:2: iv_ruleTrickyG1= ruleTrickyG1 EOF
            {
             currentNode = createCompositeNode(grammarAccess.prTrickyG1().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrickyG1_in_entryRuleTrickyG11028);
            iv_ruleTrickyG1=ruleTrickyG1();
            _fsp--;

             current =iv_ruleTrickyG1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrickyG11038); 

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
    // $ANTLR end entryRuleTrickyG1


    // $ANTLR start ruleTrickyG1
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:493:1: ruleTrickyG1 returns [EObject current=null] : ( ( '[' ( (lv_vals_1= ruleTrickyG2 ) ( ',' (lv_vals_3= ruleTrickyG2 ) )* )? ) ']' ) ;
    public final EObject ruleTrickyG1() throws RecognitionException {
        EObject current = null;

        EObject lv_vals_1 = null;

        EObject lv_vals_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:498:6: ( ( ( '[' ( (lv_vals_1= ruleTrickyG2 ) ( ',' (lv_vals_3= ruleTrickyG2 ) )* )? ) ']' ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:499:1: ( ( '[' ( (lv_vals_1= ruleTrickyG2 ) ( ',' (lv_vals_3= ruleTrickyG2 ) )* )? ) ']' )
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:499:1: ( ( '[' ( (lv_vals_1= ruleTrickyG2 ) ( ',' (lv_vals_3= ruleTrickyG2 ) )* )? ) ']' )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:499:2: ( '[' ( (lv_vals_1= ruleTrickyG2 ) ( ',' (lv_vals_3= ruleTrickyG2 ) )* )? ) ']'
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:499:2: ( '[' ( (lv_vals_1= ruleTrickyG2 ) ( ',' (lv_vals_3= ruleTrickyG2 ) )* )? )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:499:3: '[' ( (lv_vals_1= ruleTrickyG2 ) ( ',' (lv_vals_3= ruleTrickyG2 ) )* )?
            {
            match(input,17,FOLLOW_17_in_ruleTrickyG11073); 

                    createLeafNode(grammarAccess.prTrickyG1().ele00KeywordLeftSquareBracket(), null); 
                
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:503:1: ( (lv_vals_1= ruleTrickyG2 ) ( ',' (lv_vals_3= ruleTrickyG2 ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:503:2: (lv_vals_1= ruleTrickyG2 ) ( ',' (lv_vals_3= ruleTrickyG2 ) )*
                    {
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:503:2: (lv_vals_1= ruleTrickyG2 )
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:506:6: lv_vals_1= ruleTrickyG2
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.prTrickyG1().ele0100ParserRuleCallTrickyG2(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTrickyG2_in_ruleTrickyG11108);
                    lv_vals_1=ruleTrickyG2();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.prTrickyG1().getRule().getType().getType());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "vals", lv_vals_1, "TrickyG2", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:524:2: ( ',' (lv_vals_3= ruleTrickyG2 ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:524:3: ',' (lv_vals_3= ruleTrickyG2 )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleTrickyG11122); 

                    	            createLeafNode(grammarAccess.prTrickyG1().ele0110KeywordComma(), null); 
                    	        
                    	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:528:1: (lv_vals_3= ruleTrickyG2 )
                    	    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:531:6: lv_vals_3= ruleTrickyG2
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.prTrickyG1().ele01110ParserRuleCallTrickyG2(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTrickyG2_in_ruleTrickyG11156);
                    	    lv_vals_3=ruleTrickyG2();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.prTrickyG1().getRule().getType().getType());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "vals", lv_vals_3, "TrickyG2", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            match(input,19,FOLLOW_19_in_ruleTrickyG11174); 

                    createLeafNode(grammarAccess.prTrickyG1().ele1KeywordRightSquareBracket(), null); 
                

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
    // $ANTLR end ruleTrickyG1


    // $ANTLR start entryRuleTrickyG2
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:560:1: entryRuleTrickyG2 returns [EObject current=null] : iv_ruleTrickyG2= ruleTrickyG2 EOF ;
    public final EObject entryRuleTrickyG2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrickyG2 = null;


        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:560:50: (iv_ruleTrickyG2= ruleTrickyG2 EOF )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:561:2: iv_ruleTrickyG2= ruleTrickyG2 EOF
            {
             currentNode = createCompositeNode(grammarAccess.prTrickyG2().getRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrickyG2_in_entryRuleTrickyG21207);
            iv_ruleTrickyG2=ruleTrickyG2();
            _fsp--;

             current =iv_ruleTrickyG2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrickyG21217); 

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
    // $ANTLR end entryRuleTrickyG2


    // $ANTLR start ruleTrickyG2
    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:568:1: ruleTrickyG2 returns [EObject current=null] : (this_TrickyG1_0= ruleTrickyG1 | (lv_val_1= RULE_INT ) ) ;
    public final EObject ruleTrickyG2() throws RecognitionException {
        EObject current = null;

        Token lv_val_1=null;
        EObject this_TrickyG1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:573:6: ( (this_TrickyG1_0= ruleTrickyG1 | (lv_val_1= RULE_INT ) ) )
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:574:1: (this_TrickyG1_0= ruleTrickyG1 | (lv_val_1= RULE_INT ) )
            {
            // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:574:1: (this_TrickyG1_0= ruleTrickyG1 | (lv_val_1= RULE_INT ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("574:1: (this_TrickyG1_0= ruleTrickyG1 | (lv_val_1= RULE_INT ) )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:575:5: this_TrickyG1_0= ruleTrickyG1
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.prTrickyG2().ele0ParserRuleCallTrickyG1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTrickyG1_in_ruleTrickyG21264);
                    this_TrickyG1_0=ruleTrickyG1();
                    _fsp--;

                     
                            current = this_TrickyG1_0; 
                            currentNode = currentNode.getParent();
                        
                     
                        createLeafNode(grammarAccess.prTrickyG2().ele0ParserRuleCallTrickyG1(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:588:6: (lv_val_1= RULE_INT )
                    {
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:588:6: (lv_val_1= RULE_INT )
                    // ../org.eclipse.xtext.generator.tests/src-gen/org/eclipse/xtext/parsetree/reconstr/parser/antlr/internal/InternalComplexReconstrTestLanguage.g:590:6: lv_val_1= RULE_INT
                    {
                    lv_val_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTrickyG21298); 

                    		createLeafNode(grammarAccess.prTrickyG2().ele10TerminalRuleCallINT(), "val"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.prTrickyG2().getRule().getType().getType());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "val", lv_val_1, "INT", lastConsumedNode);
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
    // $ANTLR end ruleTrickyG2


 

    public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot71 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoot81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOp_in_ruleRoot128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrickyG_in_ruleRoot162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOp_in_entryRuleOp201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOp211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleOp258 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_ruleOp285 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleOp320 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_12_in_ruleOp351 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleOp386 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleTerm483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParens_in_ruleTerm517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtom612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParens_in_entryRuleParens652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParens662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleParens698 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleOp_in_ruleParens720 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParens736 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleParens758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrickyA1_in_entryRuleTrickyA1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrickyA1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrickyA1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrickyG_in_entryRuleTrickyG913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrickyG923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTrickyG957 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleTrickyG1_in_ruleTrickyG991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrickyG1_in_entryRuleTrickyG11028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrickyG11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTrickyG11073 = new BitSet(new long[]{0x00000000000A0020L});
    public static final BitSet FOLLOW_ruleTrickyG2_in_ruleTrickyG11108 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleTrickyG11122 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleTrickyG2_in_ruleTrickyG11156 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleTrickyG11174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrickyG2_in_entryRuleTrickyG21207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrickyG21217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrickyG1_in_ruleTrickyG21264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTrickyG21298 = new BitSet(new long[]{0x0000000000000002L});

}