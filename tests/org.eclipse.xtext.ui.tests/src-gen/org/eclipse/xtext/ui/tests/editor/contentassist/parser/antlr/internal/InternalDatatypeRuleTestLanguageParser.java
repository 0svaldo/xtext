package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal; 

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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.DatatypeRuleTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDatatypeRuleTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Types'", "'Type'", "';'", "'Composite'", "'base'", "'<'", "','", "'>'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int T__12=12;
    public static final int RULE_WS=9;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__18=18;
    public static final int T__15=15;

    // delegates
    // delegators


        public InternalDatatypeRuleTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDatatypeRuleTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDatatypeRuleTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g"; }



     	private DatatypeRuleTestLanguageGrammarAccess grammarAccess;
     	
        public InternalDatatypeRuleTestLanguageParser(TokenStream input, IAstFactory factory, DatatypeRuleTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DatatypeRuleTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:71:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:72:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:73:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:80:1: ruleModel returns [EObject current=null] : this_Types_0= ruleTypes ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Types_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:85:6: (this_Types_0= ruleTypes )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:87:5: this_Types_0= ruleTypes
            {
             
                    currentNode=createCompositeNode(grammarAccess.getModelAccess().getTypesParserRuleCall(), currentNode); 
                
            pushFollow(FollowSets000.FOLLOW_ruleTypes_in_ruleModel131);
            this_Types_0=ruleTypes();

            state._fsp--;

             
                    current = this_Types_0; 
                    // currentNode = currentNode.getParent();
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypes"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:104:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:105:2: (iv_ruleTypes= ruleTypes EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:106:2: iv_ruleTypes= ruleTypes EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypesRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTypes_in_entryRuleTypes165);
            iv_ruleTypes=ruleTypes();

            state._fsp--;

             current =iv_ruleTypes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypes175); 

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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:113:1: ruleTypes returns [EObject current=null] : ( () otherlv_1= 'Types' ( (lv_types_2_0= ruleType ) )* ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_types_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:118:6: ( ( () otherlv_1= 'Types' ( (lv_types_2_0= ruleType ) )* ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:119:1: ( () otherlv_1= 'Types' ( (lv_types_2_0= ruleType ) )* )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:119:1: ( () otherlv_1= 'Types' ( (lv_types_2_0= ruleType ) )* )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:119:2: () otherlv_1= 'Types' ( (lv_types_2_0= ruleType ) )*
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:119:2: ()
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:120:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypesAccess().getTypesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTypes221); 

                	createLeafNode(otherlv_1, grammarAccess.getTypesAccess().getTypesKeyword_1(), null);
                
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:129:1: ( (lv_types_2_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:130:1: (lv_types_2_0= ruleType )
            	    {
            	    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:130:1: (lv_types_2_0= ruleType )
            	    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:131:3: lv_types_2_0= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTypesAccess().getTypesTypeParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleTypes242);
            	    lv_types_2_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTypesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_2_0, 
            	            		"Type", 
            	            		currentNode);
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleType"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:156:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:157:2: (iv_ruleType= ruleType EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:158:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType279);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType289); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:165:1: ruleType returns [EObject current=null] : (this_SimpleType_0= ruleSimpleType | this_CompositeType_1= ruleCompositeType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleType_0 = null;

        EObject this_CompositeType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:170:6: ( (this_SimpleType_0= ruleSimpleType | this_CompositeType_1= ruleCompositeType ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:171:1: (this_SimpleType_0= ruleSimpleType | this_CompositeType_1= ruleCompositeType )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:171:1: (this_SimpleType_0= ruleSimpleType | this_CompositeType_1= ruleCompositeType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:172:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_ruleType336);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;

                     
                            current = this_SimpleType_0; 
                            // currentNode = currentNode.getParent();
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:183:5: this_CompositeType_1= ruleCompositeType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getCompositeTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeType_in_ruleType363);
                    this_CompositeType_1=ruleCompositeType();

                    state._fsp--;

                     
                            current = this_CompositeType_1; 
                            // currentNode = currentNode.getParent();
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:200:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:201:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:202:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSimpleTypeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_entryRuleSimpleType398);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleType408); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:209:1: ruleSimpleType returns [EObject current=null] : (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:214:6: ( (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:215:1: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:215:1: (otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:215:3: otherlv_0= 'Type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSimpleType445); 

                	createLeafNode(otherlv_0, grammarAccess.getSimpleTypeAccess().getTypeKeyword_0(), null);
                
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:219:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:220:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:220:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:221:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleType462); 

            			createLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID", 
                    		lastConsumedNode);
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSimpleType479); 

                	createLeafNode(otherlv_2, grammarAccess.getSimpleTypeAccess().getSemicolonKeyword_2(), null);
                

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleCompositeType"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:250:1: entryRuleCompositeType returns [EObject current=null] : iv_ruleCompositeType= ruleCompositeType EOF ;
    public final EObject entryRuleCompositeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeType = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:251:2: (iv_ruleCompositeType= ruleCompositeType EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:252:2: iv_ruleCompositeType= ruleCompositeType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeTypeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeType_in_entryRuleCompositeType515);
            iv_ruleCompositeType=ruleCompositeType();

            state._fsp--;

             current =iv_ruleCompositeType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeType525); 

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
    // $ANTLR end "entryRuleCompositeType"


    // $ANTLR start "ruleCompositeType"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:259:1: ruleCompositeType returns [EObject current=null] : (otherlv_0= 'Composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'base' ( (lv_baseType_3_0= ruleCompositeTypeEntry ) ) otherlv_4= ';' ) ;
    public final EObject ruleCompositeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_baseType_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:264:6: ( (otherlv_0= 'Composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'base' ( (lv_baseType_3_0= ruleCompositeTypeEntry ) ) otherlv_4= ';' ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:265:1: (otherlv_0= 'Composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'base' ( (lv_baseType_3_0= ruleCompositeTypeEntry ) ) otherlv_4= ';' )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:265:1: (otherlv_0= 'Composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'base' ( (lv_baseType_3_0= ruleCompositeTypeEntry ) ) otherlv_4= ';' )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:265:3: otherlv_0= 'Composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'base' ( (lv_baseType_3_0= ruleCompositeTypeEntry ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCompositeType562); 

                	createLeafNode(otherlv_0, grammarAccess.getCompositeTypeAccess().getCompositeKeyword_0(), null);
                
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:269:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:270:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:270:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:271:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompositeType579); 

            			createLeafNode(lv_name_1_0, grammarAccess.getCompositeTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompositeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID", 
                    		lastConsumedNode);
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCompositeType596); 

                	createLeafNode(otherlv_2, grammarAccess.getCompositeTypeAccess().getBaseKeyword_2(), null);
                
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:292:1: ( (lv_baseType_3_0= ruleCompositeTypeEntry ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:293:1: (lv_baseType_3_0= ruleCompositeTypeEntry )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:293:1: (lv_baseType_3_0= ruleCompositeTypeEntry )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:294:3: lv_baseType_3_0= ruleCompositeTypeEntry
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeTypeAccess().getBaseTypeCompositeTypeEntryParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCompositeTypeEntry_in_ruleCompositeType617);
            lv_baseType_3_0=ruleCompositeTypeEntry();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"baseType",
                    		lv_baseType_3_0, 
                    		"CompositeTypeEntry", 
                    		currentNode);
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCompositeType629); 

                	createLeafNode(otherlv_4, grammarAccess.getCompositeTypeAccess().getSemicolonKeyword_4(), null);
                

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
    // $ANTLR end "ruleCompositeType"


    // $ANTLR start "entryRuleCompositeTypeEntry"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:323:1: entryRuleCompositeTypeEntry returns [EObject current=null] : iv_ruleCompositeTypeEntry= ruleCompositeTypeEntry EOF ;
    public final EObject entryRuleCompositeTypeEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeTypeEntry = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:324:2: (iv_ruleCompositeTypeEntry= ruleCompositeTypeEntry EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:325:2: iv_ruleCompositeTypeEntry= ruleCompositeTypeEntry EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompositeTypeEntryRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleCompositeTypeEntry_in_entryRuleCompositeTypeEntry665);
            iv_ruleCompositeTypeEntry=ruleCompositeTypeEntry();

            state._fsp--;

             current =iv_ruleCompositeTypeEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeTypeEntry675); 

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
    // $ANTLR end "entryRuleCompositeTypeEntry"


    // $ANTLR start "ruleCompositeTypeEntry"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:332:1: ruleCompositeTypeEntry returns [EObject current=null] : ( ( ruleTypeId ) ) ;
    public final EObject ruleCompositeTypeEntry() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:337:6: ( ( ( ruleTypeId ) ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:338:1: ( ( ruleTypeId ) )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:338:1: ( ( ruleTypeId ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:339:1: ( ruleTypeId )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:339:1: ( ruleTypeId )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:340:3: ruleTypeId
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompositeTypeEntryRule());
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getCompositeTypeEntryAccess().getDataTypeTypeCrossReference_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTypeId_in_ruleCompositeTypeEntry722);
            ruleTypeId();

            state._fsp--;

             
            	        // currentNode = currentNode.getParent();
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleCompositeTypeEntry"


    // $ANTLR start "entryRuleTypeId"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:362:1: entryRuleTypeId returns [String current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final String entryRuleTypeId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeId = null;


        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:363:2: (iv_ruleTypeId= ruleTypeId EOF )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:364:2: iv_ruleTypeId= ruleTypeId EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeIdRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleTypeId_in_entryRuleTypeId758);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;

             current =iv_ruleTypeId.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeId769); 

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
    // $ANTLR end "entryRuleTypeId"


    // $ANTLR start "ruleTypeId"
    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:371:1: ruleTypeId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '<' this_TypeId_2= ruleTypeId (kw= ',' this_TypeId_4= ruleTypeId )* kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleTypeId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TypeId_2 = null;

        AntlrDatatypeRuleToken this_TypeId_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:376:6: ( (this_ID_0= RULE_ID (kw= '<' this_TypeId_2= ruleTypeId (kw= ',' this_TypeId_4= ruleTypeId )* kw= '>' )? ) )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:377:1: (this_ID_0= RULE_ID (kw= '<' this_TypeId_2= ruleTypeId (kw= ',' this_TypeId_4= ruleTypeId )* kw= '>' )? )
            {
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:377:1: (this_ID_0= RULE_ID (kw= '<' this_TypeId_2= ruleTypeId (kw= ',' this_TypeId_4= ruleTypeId )* kw= '>' )? )
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:377:6: this_ID_0= RULE_ID (kw= '<' this_TypeId_2= ruleTypeId (kw= ',' this_TypeId_4= ruleTypeId )* kw= '>' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeId809); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(this_ID_0, grammarAccess.getTypeIdAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:384:1: (kw= '<' this_TypeId_2= ruleTypeId (kw= ',' this_TypeId_4= ruleTypeId )* kw= '>' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:385:2: kw= '<' this_TypeId_2= ruleTypeId (kw= ',' this_TypeId_4= ruleTypeId )* kw= '>'
                    {
                    kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTypeId828); 

                            current.merge(kw);
                            createLeafNode(kw, grammarAccess.getTypeIdAccess().getLessThanSignKeyword_1_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeIdAccess().getTypeIdParserRuleCall_1_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTypeId_in_ruleTypeId850);
                    this_TypeId_2=ruleTypeId();

                    state._fsp--;


                    		current.merge(this_TypeId_2);
                        
                     
                            // currentNode = currentNode.getParent();
                            afterParserOrEnumRuleCall();
                        
                    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:402:1: (kw= ',' this_TypeId_4= ruleTypeId )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.ui.tests/src-gen/org/eclipse/xtext/ui/tests/editor/contentassist/parser/antlr/internal/InternalDatatypeRuleTestLanguage.g:403:2: kw= ',' this_TypeId_4= ruleTypeId
                    	    {
                    	    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTypeId869); 

                    	            current.merge(kw);
                    	            createLeafNode(kw, grammarAccess.getTypeIdAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	     
                    	            currentNode=createCompositeNode(grammarAccess.getTypeIdAccess().getTypeIdParserRuleCall_1_2_1(), currentNode); 
                    	        
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypeId_in_ruleTypeId891);
                    	    this_TypeId_4=ruleTypeId();

                    	    state._fsp--;


                    	    		current.merge(this_TypeId_4);
                    	        
                    	     
                    	            // currentNode = currentNode.getParent();
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTypeId911); 

                            current.merge(kw);
                            createLeafNode(kw, grammarAccess.getTypeIdAccess().getGreaterThanSignKeyword_1_3(), null); 
                        

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
    // $ANTLR end "ruleTypeId"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypes_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypes_in_entryRuleTypes165 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypes175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleTypes221 = new BitSet(new long[]{0x0000000000005002L});
        public static final BitSet FOLLOW_ruleType_in_ruleTypes242 = new BitSet(new long[]{0x0000000000005002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleType336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeType_in_ruleType363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType398 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleSimpleType445 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleType462 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSimpleType479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeType_in_entryRuleCompositeType515 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeType525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleCompositeType562 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeType579 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCompositeType596 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCompositeTypeEntry_in_ruleCompositeType617 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCompositeType629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeTypeEntry_in_entryRuleCompositeTypeEntry665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeTypeEntry675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeId_in_ruleCompositeTypeEntry722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId758 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeId769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeId809 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleTypeId828 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeId850 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleTypeId869 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeId891 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleTypeId911 = new BitSet(new long[]{0x0000000000000002L});
    }


}