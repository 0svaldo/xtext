package org.eclipse.xtext.purexbase.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.purexbase.services.PureXbaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPureXbaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'", "'import'", "'static'", "'extension'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=5;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_DECIMAL=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalPureXbaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPureXbaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPureXbaseParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g"; }



     	private PureXbaseGrammarAccess grammarAccess;
     	
        public InternalPureXbaseParser(TokenStream input, PureXbaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PureXbaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_block_1_0= ruleSpecialBlockExpression ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_importSection_0_0 = null;

        EObject lv_block_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:79:28: ( ( ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_block_1_0= ruleSpecialBlockExpression ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:80:1: ( ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_block_1_0= ruleSpecialBlockExpression ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:80:1: ( ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_block_1_0= ruleSpecialBlockExpression ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:80:2: ( (lv_importSection_0_0= ruleXImportSection ) )? ( (lv_block_1_0= ruleSpecialBlockExpression ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:80:2: ( (lv_importSection_0_0= ruleXImportSection ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==76) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:81:1: (lv_importSection_0_0= ruleXImportSection )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:81:1: (lv_importSection_0_0= ruleXImportSection )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:82:3: lv_importSection_0_0= ruleXImportSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelAccess().getImportSectionXImportSectionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXImportSection_in_ruleModel131);
                    lv_importSection_0_0=ruleXImportSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelRule());
                      	        }
                             		set(
                             			current, 
                             			"importSection",
                              		lv_importSection_0_0, 
                              		"XImportSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:98:3: ( (lv_block_1_0= ruleSpecialBlockExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:99:1: (lv_block_1_0= ruleSpecialBlockExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:99:1: (lv_block_1_0= ruleSpecialBlockExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:100:3: lv_block_1_0= ruleSpecialBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getBlockSpecialBlockExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSpecialBlockExpression_in_ruleModel153);
            lv_block_1_0=ruleSpecialBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_1_0, 
                      		"SpecialBlockExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSpecialBlockExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:124:1: entryRuleSpecialBlockExpression returns [EObject current=null] : iv_ruleSpecialBlockExpression= ruleSpecialBlockExpression EOF ;
    public final EObject entryRuleSpecialBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialBlockExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:125:2: (iv_ruleSpecialBlockExpression= ruleSpecialBlockExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:126:2: iv_ruleSpecialBlockExpression= ruleSpecialBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSpecialBlockExpression_in_entryRuleSpecialBlockExpression189);
            iv_ruleSpecialBlockExpression=ruleSpecialBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialBlockExpression199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSpecialBlockExpression"


    // $ANTLR start "ruleSpecialBlockExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:133:1: ruleSpecialBlockExpression returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleSpecialBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:136:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:137:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:137:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:137:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:137:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:138:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSpecialBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:143:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==24||(LA3_0>=31 && LA3_0<=32)||LA3_0==37||LA3_0==43||LA3_0==45||LA3_0==48||LA3_0==50||LA3_0==52||(LA3_0>=56 && LA3_0<=61)||(LA3_0>=63 && LA3_0<=70)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:143:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:143:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:144:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:144:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:145:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecialBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleSpecialBlockExpression255);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecialBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:161:2: (otherlv_2= ';' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:161:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSpecialBlockExpression268); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getSpecialBlockExpressionAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSpecialBlockExpression"


    // $ANTLR start "entryRuleXExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:173:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:174:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:175:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression308);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression318); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:182:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:185:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:187:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression364);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:203:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:204:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:205:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment398);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment408); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:212:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:215:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:216:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:216:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=RULE_STRING && LA5_1<=RULE_ID)||LA5_1==13||(LA5_1>=15 && LA5_1<=45)||(LA5_1>=47 && LA5_1<=72)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==14) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_DECIMAL)||LA5_0==24||(LA5_0>=31 && LA5_0<=32)||LA5_0==37||LA5_0==43||LA5_0==45||LA5_0==48||LA5_0==50||LA5_0==52||(LA5_0>=56 && LA5_0<=58)||LA5_0==61||(LA5_0>=63 && LA5_0<=70)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:216:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:216:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:216:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:216:3: ()
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:217:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:222:2: ( ( ruleValidID ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:223:1: ( ruleValidID )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:223:1: ( ruleValidID )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:224:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment466);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment482);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:245:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:246:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:246:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:247:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment502);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:264:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:264:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:265:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment532);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:273:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        int LA4_1 = input.LA(2);

                        if ( (synpred1_InternalPureXbase()) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:273:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:273:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:273:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:278:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:278:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:278:7: ()
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:279:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:284:2: ( ( ruleOpMultiAssign ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:285:1: ( ruleOpMultiAssign )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:285:1: ( ruleOpMultiAssign )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:286:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment585);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:299:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:300:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:300:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:301:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment608);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:325:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:326:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:327:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign648);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign659); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:334:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:337:28: (kw= '=' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:339:2: kw= '='
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleOpSingleAssign696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:352:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:353:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:354:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign736);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign747); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:361:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:364:28: (kw= '+=' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:366:2: kw= '+='
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMultiAssign784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:379:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:380:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:381:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression823);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression833); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:388:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:391:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:392:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:392:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:393:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression880);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:401:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred2_InternalPureXbase()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:401:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:401:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:401:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:406:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:406:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:406:7: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:407:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:412:2: ( ( ruleOpOr ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:413:1: ( ruleOpOr )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:413:1: ( ruleOpOr )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:414:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression933);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:427:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:428:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:428:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:429:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression956);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:453:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:454:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:455:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr995);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1006); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:462:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:465:28: (kw= '||' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:467:2: kw= '||'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpOr1043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:480:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:481:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:482:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1082);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1092); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:489:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:492:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:493:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:493:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:494:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1139);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:502:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred3_InternalPureXbase()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:502:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:502:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:502:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:507:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:507:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:507:7: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:508:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:513:2: ( ( ruleOpAnd ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:514:1: ( ruleOpAnd )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:514:1: ( ruleOpAnd )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:515:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1192);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:528:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:529:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:529:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:530:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1215);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:554:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:555:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:556:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1254);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1265); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:563:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:566:28: (kw= '&&' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:568:2: kw= '&&'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpAnd1302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:581:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:582:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:583:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1341);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1351); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:590:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:593:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:594:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:594:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:595:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1398);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:603:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred4_InternalPureXbase()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==19) ) {
                    int LA8_3 = input.LA(2);

                    if ( (synpred4_InternalPureXbase()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:603:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:603:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:603:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:608:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:608:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:608:7: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:609:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:614:2: ( ( ruleOpEquality ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:615:1: ( ruleOpEquality )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:615:1: ( ruleOpEquality )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:616:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1451);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:629:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:630:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:630:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:631:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1474);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:655:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:656:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:657:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1513);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1524); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:664:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:667:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:668:1: (kw= '==' | kw= '!=' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:668:1: (kw= '==' | kw= '!=' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:669:2: kw= '=='
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOpEquality1562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:676:2: kw= '!='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpEquality1581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:689:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:690:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:691:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1621);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1631); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:698:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:701:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:702:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:702:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:703:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1678);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred6_InternalPureXbase()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred6_InternalPureXbase()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred5_InternalPureXbase()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred6_InternalPureXbase()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA10_6 = input.LA(2);

                    if ( (synpred6_InternalPureXbase()) ) {
                        alt10=2;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:713:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:713:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:713:6: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:714:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXRelationalExpression1714); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:723:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:724:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:724:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:725:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1737);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:747:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:747:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:747:7: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:748:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:753:2: ( ( ruleOpCompare ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:754:1: ( ruleOpCompare )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:754:1: ( ruleOpCompare )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:755:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1798);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:768:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:769:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:769:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:770:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1821);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:794:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:795:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:796:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare1861);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare1872); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:803:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:806:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:807:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:807:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:808:2: kw= '>='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpCompare1910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:815:2: kw= '<='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpCompare1929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:822:2: kw= '>'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare1948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:829:2: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare1967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:842:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:843:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:844:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2007);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2017); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:851:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:854:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:855:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:855:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:856:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2064);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:864:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:864:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:864:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:864:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:869:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:869:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:869:7: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:870:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:875:2: ( ( ruleOpOther ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:876:1: ( ruleOpOther )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:876:1: ( ruleOpOther )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:877:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2117);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:890:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:891:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:891:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:892:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2140);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:916:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:917:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:918:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2179);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2190); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:925:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:928:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:929:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:929:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            case 23:
                {
                alt15=4;
                }
                break;
            case 24:
                {
                alt15=5;
                }
                break;
            case 28:
                {
                alt15=6;
                }
                break;
            case 29:
                {
                alt15=7;
                }
                break;
            case 30:
                {
                alt15=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:930:2: kw= '->'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:937:2: kw= '..'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:944:2: kw= '=>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2266); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:950:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:950:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:951:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpOther2286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:956:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==23) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==23) && (synpred8_InternalPureXbase())) {
                            alt13=1;
                        }
                        else if ( (LA13_1==EOF||(LA13_1>=RULE_STRING && LA13_1<=RULE_ID)||LA13_1==24||(LA13_1>=31 && LA13_1<=32)||LA13_1==37||LA13_1==43||LA13_1==45||LA13_1==48||LA13_1==50||LA13_1==52||(LA13_1>=56 && LA13_1<=58)||LA13_1==61||(LA13_1>=63 && LA13_1<=70)) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:956:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:956:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:956:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:960:5: (kw= '>' kw= '>' )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:961:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpOther2317); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpOther2330); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:974:2: kw= '>'
                            {
                            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpOther2351); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:980:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:980:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:981:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:986:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==24) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred9_InternalPureXbase()) ) {
                            alt14=1;
                        }
                        else if ( (true) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:986:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:986:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:986:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:990:5: (kw= '<' kw= '<' )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:991:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2404); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2417); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1004:2: kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2438); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1011:2: kw= '<>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1018:2: kw= '?:'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1025:2: kw= '<=>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1038:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1039:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1040:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2537);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2547); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1047:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1050:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1051:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1051:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1052:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2594);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1060:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred10_InternalPureXbase()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==32) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred10_InternalPureXbase()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1060:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1060:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1060:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1065:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1065:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1065:7: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1066:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1071:2: ( ( ruleOpAdd ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1072:1: ( ruleOpAdd )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1072:1: ( ruleOpAdd )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1073:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2647);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1086:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1087:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1087:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1088:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2670);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1112:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1113:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1114:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2709);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2720); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1121:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1124:28: ( (kw= '+' | kw= '-' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1125:1: (kw= '+' | kw= '-' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1125:1: (kw= '+' | kw= '-' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1126:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAdd2758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1133:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd2777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1146:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1147:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1148:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2817);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2827); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1155:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1158:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1159:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1159:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1160:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2874);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1168:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred11_InternalPureXbase()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred11_InternalPureXbase()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred11_InternalPureXbase()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred11_InternalPureXbase()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1168:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1168:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1168:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1173:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1173:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1173:7: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1174:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1179:2: ( ( ruleOpMulti ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1180:1: ( ruleOpMulti )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1180:1: ( ruleOpMulti )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1181:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2927);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1194:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1195:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1195:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1196:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2950);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1220:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1221:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1222:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti2989);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3000); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1229:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1232:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1233:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1233:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            case 36:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1234:2: kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1241:2: kw= '**'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1248:2: kw= '/'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1255:2: kw= '%'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1268:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1269:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1270:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3135);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3145); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1277:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1280:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1281:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1281:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=31 && LA20_0<=32)||LA20_0==37) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==24||LA20_0==43||LA20_0==45||LA20_0==48||LA20_0==50||LA20_0==52||(LA20_0>=56 && LA20_0<=58)||LA20_0==61||(LA20_0>=63 && LA20_0<=70)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1281:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1281:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1281:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1281:3: ()
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1282:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1287:2: ( ( ruleOpUnary ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1288:1: ( ruleOpUnary )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1288:1: ( ruleOpUnary )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1289:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3203);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1302:2: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1303:1: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1303:1: (lv_operand_2_0= ruleXUnaryOperation )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1304:3: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3224);
                    lv_operand_2_0=ruleXUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XUnaryOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1322:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3253);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1338:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1339:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1340:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3289);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3300); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1347:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1350:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1351:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1351:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt21=1;
                }
                break;
            case 32:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1352:2: kw= '!'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary3338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1359:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1366:2: kw= '+'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpUnary3376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1379:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1380:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1381:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3416);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3426); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1388:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1391:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1392:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1392:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1393:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3473);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1401:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred12_InternalPureXbase()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1401:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1401:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1401:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1403:5: ( () otherlv_2= 'as' )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1403:6: () otherlv_2= 'as'
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1403:6: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1404:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleXCastedExpression3508); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1413:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1414:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1414:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1415:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3531);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1439:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1440:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1441:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3569);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3579); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1448:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1451:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1452:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1452:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1453:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3626);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop30:
            do {
                int alt30=3;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred13_InternalPureXbase()) ) {
                        alt30=1;
                    }
                    else if ( (synpred14_InternalPureXbase()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred14_InternalPureXbase()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred14_InternalPureXbase()) ) {
                        alt30=2;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1467:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1467:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1467:26: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1468:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3675); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1477:1: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1478:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1478:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1479:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3698);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3714);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1500:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1501:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1501:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1502:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3736);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1535:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1535:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1535:8: ()
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1536:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1541:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1541:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall3822); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1546:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1546:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1547:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1547:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1548:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall3846); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1562:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1562:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1563:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1563:1: (lv_spreading_9_0= '*.' )
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1564:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3883); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1577:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==24) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1577:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall3912); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1581:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1582:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1582:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1583:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3933);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1599:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==42) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1599:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3946); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1603:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1604:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1604:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1605:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3967);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop24;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall3981); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1625:3: ( ( ruleValidID ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1626:1: ( ruleValidID )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1626:1: ( ruleValidID )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1627:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4006);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1640:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1640:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1640:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1640:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1647:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1648:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4040); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1661:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt27=3;
            	            alt27 = dfa27.predict(input);
            	            switch (alt27) {
            	                case 1 :
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1661:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1661:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1661:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1678:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1679:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4125);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1696:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1696:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1696:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1696:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1697:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1697:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1698:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4153);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1714:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop26:
            	                    do {
            	                        int alt26=2;
            	                        int LA26_0 = input.LA(1);

            	                        if ( (LA26_0==42) ) {
            	                            alt26=1;
            	                        }


            	                        switch (alt26) {
            	                    	case 1 :
            	                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1714:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4166); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1718:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1719:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1719:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1720:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4187);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop26;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4204); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1740:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1740:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1743:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1744:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4239);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1768:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1769:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1770:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4279);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4289); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1777:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1780:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1781:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1781:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt31=13;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1782:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4336);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1792:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4363);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1802:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4390);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1812:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4417);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1822:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4444);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1832:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4471);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1842:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4498);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1852:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4525);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1862:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4552);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1872:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4579);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1882:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4606);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1892:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4633);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1902:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4660);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1918:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1919:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1920:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4695);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4705); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1927:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1930:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt32=6;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) && (synpred18_InternalPureXbase())) {
                alt32=1;
            }
            else if ( ((LA32_0>=64 && LA32_0<=65)) ) {
                alt32=2;
            }
            else if ( ((LA32_0>=RULE_HEX && LA32_0<=RULE_DECIMAL)) ) {
                alt32=3;
            }
            else if ( (LA32_0==66) ) {
                alt32=4;
            }
            else if ( (LA32_0==RULE_STRING) ) {
                alt32=5;
            }
            else if ( (LA32_0==67) ) {
                alt32=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4765);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1944:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4793);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1954:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4820);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1964:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4847);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1974:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4874);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1984:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4901);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2000:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2001:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2002:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4936);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4946); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2009:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2012:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2013:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2013:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2013:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2013:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2013:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2015:5: ( () otherlv_1= '[' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2015:6: () otherlv_1= '['
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2015:6: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2016:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2025:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2025:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2040:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2040:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2040:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==27||LA34_0==43) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2040:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2040:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2041:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2041:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2042:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5079);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2058:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==42) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2058:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5092); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2062:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2063:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2063:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2064:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5113);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2080:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2081:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2081:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2082:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2095:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2096:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2096:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2097:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5172);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2125:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2126:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2127:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5220);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5230); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2134:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2137:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2138:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2138:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2138:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2138:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2139:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2144:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||LA37_0==24||(LA37_0>=31 && LA37_0<=32)||LA37_0==37||LA37_0==43||LA37_0==45||LA37_0==48||LA37_0==50||LA37_0==52||(LA37_0>=56 && LA37_0<=61)||(LA37_0>=63 && LA37_0<=70)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2144:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2144:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2145:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2145:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2146:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5286);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2162:2: (otherlv_2= ';' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==13) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2162:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXExpressionInClosure5299); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2174:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2175:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2176:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5339);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5349); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2183:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2186:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2187:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2187:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2187:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2187:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2187:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2203:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2203:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2203:7: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2204:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2209:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==27||LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2209:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2209:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2210:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2210:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2211:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5457);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2227:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==42) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2227:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXShortClosure5470); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2231:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2232:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2232:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2233:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5491);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2249:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2250:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2250:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2251:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,46,FOLLOW_46_in_ruleXShortClosure5513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2264:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2265:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2265:1: (lv_expression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2266:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5549);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2290:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2291:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2292:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5585);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5595); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2299:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2302:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2303:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2303:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2303:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXParenthesizedExpression5632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5654);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression5665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2328:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2329:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2330:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5701);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5711); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2337:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2340:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2341:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2341:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2341:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2341:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2342:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression5757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXIfExpression5769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2355:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2356:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2356:1: (lv_if_3_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2357:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5790);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression5802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2377:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2378:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2378:1: (lv_then_5_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2379:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5823);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2395:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred22_InternalPureXbase()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2395:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2395:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2395:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression5844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2400:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2401:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2401:1: (lv_else_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2402:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5866);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2426:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2427:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2428:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5904);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5914); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2435:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2438:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2439:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2439:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2439:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2439:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2440:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression5960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)||LA42_0==24||(LA42_0>=31 && LA42_0<=32)||LA42_0==37||LA42_0==45||LA42_0==48||LA42_0==50||LA42_0==52||(LA42_0>=56 && LA42_0<=58)||LA42_0==61||(LA42_0>=63 && LA42_0<=70)) ) {
                alt42=1;
            }
            else if ( (LA42_0==43) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==RULE_ID) ) {
                    int LA42_3 = input.LA(3);

                    if ( ((LA42_3>=14 && LA42_3<=36)||(LA42_3>=38 && LA42_3<=41)||(LA42_3>=43 && LA42_3<=45)||LA42_3==62) ) {
                        alt42=1;
                    }
                    else if ( (LA42_3==51) && (synpred24_InternalPureXbase())) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA42_2>=RULE_STRING && LA42_2<=RULE_DECIMAL)||LA42_2==24||(LA42_2>=31 && LA42_2<=32)||LA42_2==37||LA42_2==43||LA42_2==45||LA42_2==48||LA42_2==50||LA42_2==52||(LA42_2>=56 && LA42_2<=58)||LA42_2==61||(LA42_2>=63 && LA42_2<=70)) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        int LA41_1 = input.LA(2);

                        if ( (LA41_1==51) && (synpred23_InternalPureXbase())) {
                            alt41=1;
                        }
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2454:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2454:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2454:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2455:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2455:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2456:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6003);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6015); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2476:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2477:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2477:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2478:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6039);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2495:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2495:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2495:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2495:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2495:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2501:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2501:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXSwitchExpression6083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2505:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2506:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2506:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2507:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6104);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2527:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2528:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2528:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2529:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6139);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,44,FOLLOW_44_in_ruleXSwitchExpression6151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2553:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==27||LA43_0==43||LA43_0==51||LA43_0==55) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2554:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2554:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2555:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6186);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2571:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2571:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6200); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2579:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2580:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2580:1: (lv_default_14_0= ruleXExpression )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2581:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6233);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2609:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2610:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2611:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6283);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6293); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2618:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2621:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2622:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2622:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2622:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2622:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==27||LA45_0==43) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2623:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2623:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2624:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6339);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2640:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2640:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXCasePart6353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2644:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2645:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2645:1: (lv_case_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2646:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6374);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleXCasePart6388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2666:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2667:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2667:1: (lv_then_4_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2668:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6409);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2692:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2693:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2694:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6445);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6455); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2701:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2704:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2705:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2705:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2705:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2705:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2706:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression6501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXForLoopExpression6513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2719:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2720:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2720:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2721:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6534);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression6546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2741:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2742:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2742:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2743:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6567);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression6579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2763:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2764:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2764:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2765:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6600);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2789:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2790:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2791:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6636);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6646); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2798:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2801:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2802:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2802:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2802:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2802:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2803:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXWhileExpression6692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXWhileExpression6704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2816:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2817:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2817:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2818:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6725);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression6737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2838:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2839:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2839:1: (lv_body_5_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2840:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6758);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2864:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2865:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2866:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6794);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6804); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2873:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2876:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2877:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2877:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2877:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2877:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2878:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression6850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2887:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2888:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2888:1: (lv_body_2_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2889:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6871);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXDoWhileExpression6883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXDoWhileExpression6895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2913:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2914:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2914:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2915:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6916);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression6928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2943:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2944:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2945:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6964);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6974); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2952:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2955:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2956:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2956:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2956:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2956:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2957:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression7020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2966:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||LA48_0==24||(LA48_0>=31 && LA48_0<=32)||LA48_0==37||LA48_0==43||LA48_0==45||LA48_0==48||LA48_0==50||LA48_0==52||(LA48_0>=56 && LA48_0<=61)||(LA48_0>=63 && LA48_0<=70)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2966:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2966:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2967:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2967:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2968:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7042);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2984:2: (otherlv_3= ';' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==13) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2984:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7055); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression7071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3000:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3001:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3002:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7107);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7117); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3009:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3012:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3013:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3013:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=59 && LA49_0<=60)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||LA49_0==24||(LA49_0>=31 && LA49_0<=32)||LA49_0==37||LA49_0==43||LA49_0==45||LA49_0==48||LA49_0==50||LA49_0==52||(LA49_0>=56 && LA49_0<=58)||LA49_0==61||(LA49_0>=63 && LA49_0<=70)) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3014:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7164);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3024:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7191);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3040:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3041:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3042:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7226);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7236); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3049:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3052:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3053:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3053:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3053:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3053:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3054:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3059:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            else if ( (LA50_0==60) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3059:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3059:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3060:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3060:1: (lv_writeable_1_0= 'var' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3061:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,59,FOLLOW_59_in_ruleXVariableDeclaration7289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3075:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3079:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred25_InternalPureXbase()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==43) && (synpred25_InternalPureXbase())) {
                alt51=1;
            }
            else if ( (LA51_0==27) && (synpred25_InternalPureXbase())) {
                alt51=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3079:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3079:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3079:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3087:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3087:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3087:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3088:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3088:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3089:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7368);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3105:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3106:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3106:1: (lv_name_4_0= ruleValidID )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3107:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7389);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3124:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3124:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3125:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3125:1: (lv_name_5_0= ruleValidID )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3126:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7418);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3142:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==14) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3142:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleXVariableDeclaration7432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3146:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3147:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3147:1: (lv_right_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3148:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7453);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3172:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3173:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3174:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7491);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7501); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3181:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3184:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3185:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3185:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3185:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3185:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==RULE_ID||LA53_1==24||LA53_1==39||LA53_1==45) ) {
                    alt53=1;
                }
            }
            else if ( (LA53_0==27||LA53_0==43) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3186:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3186:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3187:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7547);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3203:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3204:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3204:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3205:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7569);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3229:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3230:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3231:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7605);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7615); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3238:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3241:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3242:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3242:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3242:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3242:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3243:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3243:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3244:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7661);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3260:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3261:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3261:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3262:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7682);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3286:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3287:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3288:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7718);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7728); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3295:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3298:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3299:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3299:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3299:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3299:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3300:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3305:2: ( ( ruleStaticQualifier ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==62) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3306:1: ( ruleStaticQualifier )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3306:1: ( ruleStaticQualifier )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3307:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7785);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3320:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==24) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3320:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall7799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3324:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3325:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3325:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3326:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7820);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3342:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==42) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3342:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall7833); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3346:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3347:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3347:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3348:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7854);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleXFeatureCall7868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3368:3: ( ( ruleIdOrSuper ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3369:1: ( ruleIdOrSuper )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3369:1: ( ruleIdOrSuper )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3370:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7893);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3383:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3383:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3383:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3383:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3390:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3391:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3404:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt58=3;
                    alt58 = dfa58.predict(input);
                    switch (alt58) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3404:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3404:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3404:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3421:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3422:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8012);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3439:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3439:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3439:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3439:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3440:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3440:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3441:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8040);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3457:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==42) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3457:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleXFeatureCall8053); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3461:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3462:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3462:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3463:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8074);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop57;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall8091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3483:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3483:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3486:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3487:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8126);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3511:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3512:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3513:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8164);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8175); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3520:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3523:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3524:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3524:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==61) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3525:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8222);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3537:2: kw= 'super'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleIdOrSuper8246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3550:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3551:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3552:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8287);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8298); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3559:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3562:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3563:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3563:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==62) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3564:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8345);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleStaticQualifier8363); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3588:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3589:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3590:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8404);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8414); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3597:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3600:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3601:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3601:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3601:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3601:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3602:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXConstructorCall8460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3611:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3612:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3612:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3613:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8483);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3626:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3626:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3626:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3626:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall8504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3631:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3632:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3632:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3633:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8526);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3649:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==42) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3649:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8539); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3653:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3654:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3654:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3655:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8560);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleXConstructorCall8574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3675:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3675:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3675:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3675:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8597); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3680:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt66=3;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3680:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3680:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3680:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3697:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3698:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8670);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3715:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3715:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3715:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3715:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3716:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3716:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3717:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8698);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3733:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==42) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3733:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleXConstructorCall8711); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3737:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3738:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3738:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3739:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8732);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop65;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3759:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3759:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3762:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3763:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8784);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3787:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3788:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3789:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8821);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8831); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3796:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3799:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3800:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3800:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3800:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3800:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3801:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3806:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==64) ) {
                alt69=1;
            }
            else if ( (LA69_0==65) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3806:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXBooleanLiteral8878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3811:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3811:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3812:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3812:1: (lv_isTrue_2_0= 'true' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3813:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral8902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3834:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3835:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3836:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8952);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8962); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3843:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3846:28: ( ( () otherlv_1= 'null' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3847:1: ( () otherlv_1= 'null' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3847:1: ( () otherlv_1= 'null' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3847:2: () otherlv_1= 'null'
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3847:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3848:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXNullLiteral9008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3865:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3866:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3867:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9044);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9054); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3874:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3877:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3878:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3878:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3878:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3878:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3879:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3884:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3885:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3885:1: (lv_value_1_0= ruleNumber )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3886:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9109);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3910:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3911:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3912:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9145);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9155); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3919:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3922:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3923:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3923:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3923:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3923:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3924:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3929:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3930:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3930:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3931:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3955:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3956:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3957:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9247);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9257); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3964:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3967:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3968:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3968:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3968:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3968:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3969:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTypeLiteral9303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXTypeLiteral9315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3982:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3983:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3983:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3984:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9338);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3997:2: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==45) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3998:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3998:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3999:3: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral9359);
            	    lv_arrayDimensions_4_0=ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXTypeLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arrayDimensions",
            	              		lv_arrayDimensions_4_0, 
            	              		"ArrayBrackets");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4027:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4028:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4029:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9408);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9418); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4036:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4039:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4040:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4040:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4040:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4040:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4041:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXThrowExpression9464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4050:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4051:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4051:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4052:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9485);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4076:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4077:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4078:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9521);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9531); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4085:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4088:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4089:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4089:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4089:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4089:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4090:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXReturnExpression9577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4099:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4099:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4104:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4105:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9608);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4129:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4130:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4131:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9645);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9655); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4138:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4141:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4142:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4142:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4142:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4142:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4143:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTryCatchFinallyExpression9701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4152:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4153:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4153:1: (lv_expression_2_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4154:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9722);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4170:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==72) ) {
                alt74=1;
            }
            else if ( (LA74_0==71) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4170:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4170:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4170:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4170:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==72) ) {
                            int LA72_2 = input.LA(2);

                            if ( (synpred34_InternalPureXbase()) ) {
                                alt72=1;
                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4170:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4172:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4173:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9752);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4189:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==71) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred35_InternalPureXbase()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4189:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4189:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4189:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9774); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4194:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4195:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4195:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4196:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9796);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4213:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4213:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4213:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4217:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4218:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4218:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4219:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9839);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4243:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4244:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4245:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9877);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9887); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4252:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4255:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4256:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4256:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4256:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4256:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4256:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleXCatchClause9932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleXCatchClause9945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4265:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4266:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4266:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4267:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9966);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause9978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4287:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4288:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4288:1: (lv_expression_4_0= ruleXExpression )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4289:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9999);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4313:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4314:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4315:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10036);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10047); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4322:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4325:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4326:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4326:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4327:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10094);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4337:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==39) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==RULE_ID) ) {
                        int LA75_3 = input.LA(3);

                        if ( (synpred37_InternalPureXbase()) ) {
                            alt75=1;
                        }


                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4337:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4337:2: ( ( '.' )=>kw= '.' )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4337:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedName10122); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10145);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4364:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4368:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4369:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10199);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10210); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4379:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4383:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4384:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4384:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_HEX) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_DECIMAL)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4384:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4392:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4392:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4392:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4392:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_INT) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==RULE_DECIMAL) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4392:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10282); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4400:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10308); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4407:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==39) ) {
                        int LA78_1 = input.LA(2);

                        if ( ((LA78_1>=RULE_INT && LA78_1<=RULE_DECIMAL)) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4408:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,39,FOLLOW_39_in_ruleNumber10328); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4413:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==RULE_INT) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==RULE_DECIMAL) ) {
                                alt77=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 77, 0, input);

                                throw nvae;
                            }
                            switch (alt77) {
                                case 1 :
                                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4413:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10344); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4421:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10370); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4439:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4440:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4441:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10423);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10433); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4448:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4451:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4452:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4452:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==27||LA81_0==43) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4452:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4452:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4453:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10481);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4461:1: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==45) ) {
                            int LA80_2 = input.LA(2);

                            if ( (LA80_2==47) ) {
                                int LA80_3 = input.LA(3);

                                if ( (synpred38_InternalPureXbase()) ) {
                                    alt80=1;
                                }


                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4461:2: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4462:24: ( () ruleArrayBrackets )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4462:25: () ruleArrayBrackets
                    	    {
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4462:25: ()
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4463:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference10517);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4478:5: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10548);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4494:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4495:2: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4496:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets10584);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayBrackets10595); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4503:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4506:28: ( (kw= '[' kw= ']' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4507:1: (kw= '[' kw= ']' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4507:1: (kw= '[' kw= ']' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4508:2: kw= '[' kw= ']'
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleArrayBrackets10633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            kw=(Token)match(input,47,FOLLOW_47_in_ruleArrayBrackets10646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4527:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4528:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4529:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10686);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10696); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4536:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4539:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4540:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4540:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4540:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4540:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==43) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4540:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4544:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_ID||LA83_0==27||LA83_0==43) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4544:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4544:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4545:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4545:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4546:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10756);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4562:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==42) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4562:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXFunctionTypeRef10769); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4566:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4567:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4567:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4568:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10790);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop82;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleXFunctionTypeRef10820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4592:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4593:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4593:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4594:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10841);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4618:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4619:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4620:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10877);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10887); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4627:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4630:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4631:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4631:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4631:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4631:2: ( ( ruleQualifiedName ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4632:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4632:1: ( ruleQualifiedName )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4633:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10935);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4646:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4646:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4646:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4646:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference10956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4651:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4652:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4652:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4653:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10978);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4669:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==42) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4669:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleJvmParameterizedTypeReference10991); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4673:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4674:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4674:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4675:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11012);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleJvmParameterizedTypeReference11026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4703:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4704:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4705:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11064);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11074); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4712:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4715:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4716:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4716:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID||LA87_0==27||LA87_0==43) ) {
                alt87=1;
            }
            else if ( (LA87_0==73) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4717:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11121);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4727:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11148);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4743:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4744:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4745:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11183);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11193); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4752:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4755:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4756:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4756:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4756:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4756:2: ()
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4757:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleJvmWildcardTypeReference11239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4766:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==74) ) {
                alt88=1;
            }
            else if ( (LA88_0==61) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4766:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4766:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4767:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4767:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4768:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11261);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4785:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4785:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4786:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4786:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4787:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11288);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4811:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4812:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4813:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11326);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11336); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4820:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4823:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4824:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4824:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4824:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,74,FOLLOW_74_in_ruleJvmUpperBound11373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4828:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4829:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4829:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4830:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11394);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4854:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4855:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4856:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11430);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11440); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4863:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4866:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4867:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4867:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4867:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBoundAnded11477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4871:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4872:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4872:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4873:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11498);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4897:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4898:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4899:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11534);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11544); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4906:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4909:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4910:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4910:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4910:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleJvmLowerBound11581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4914:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4915:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4915:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4916:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11602);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4942:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4943:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4944:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard11641);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard11652); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4951:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4954:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4955:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4955:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4956:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard11699);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedNameWithWildCard11717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,33,FOLLOW_33_in_ruleQualifiedNameWithWildCard11730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4986:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4987:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4988:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11771);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11782); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4995:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4998:28: (this_ID_0= RULE_ID )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4999:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportSection"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5014:1: entryRuleXImportSection returns [EObject current=null] : iv_ruleXImportSection= ruleXImportSection EOF ;
    public final EObject entryRuleXImportSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportSection = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5015:2: (iv_ruleXImportSection= ruleXImportSection EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5016:2: iv_ruleXImportSection= ruleXImportSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportSectionRule()); 
            }
            pushFollow(FOLLOW_ruleXImportSection_in_entryRuleXImportSection11865);
            iv_ruleXImportSection=ruleXImportSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportSection11875); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXImportSection"


    // $ANTLR start "ruleXImportSection"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5023:1: ruleXImportSection returns [EObject current=null] : ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+ ;
    public final EObject ruleXImportSection() throws RecognitionException {
        EObject current = null;

        EObject lv_importDeclarations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5026:28: ( ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+ )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5027:1: ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5027:1: ( (lv_importDeclarations_0_0= ruleXImportDeclaration ) )+
            int cnt89=0;
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==76) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5028:1: (lv_importDeclarations_0_0= ruleXImportDeclaration )
            	    {
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5028:1: (lv_importDeclarations_0_0= ruleXImportDeclaration )
            	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5029:3: lv_importDeclarations_0_0= ruleXImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXImportSectionAccess().getImportDeclarationsXImportDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXImportDeclaration_in_ruleXImportSection11920);
            	    lv_importDeclarations_0_0=ruleXImportDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXImportSectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"importDeclarations",
            	              		lv_importDeclarations_0_0, 
            	              		"XImportDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt89 >= 1 ) break loop89;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(89, input);
                        throw eee;
                }
                cnt89++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXImportSection"


    // $ANTLR start "entryRuleXImportDeclaration"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5053:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5054:2: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5055:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration11956);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportDeclaration11966); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5062:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5065:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_8= ';' )? ) )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5066:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_8= ';' )? )
            {
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5066:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_8= ';' )? )
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5066:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleXImportDeclaration12003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5070:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) )
            int alt91=3;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5070:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5070:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5070:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5070:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5071:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5071:1: (lv_static_1_0= 'static' )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5072:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,77,FOLLOW_77_in_ruleXImportDeclaration12023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5085:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==78) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5086:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5086:1: (lv_extension_2_0= 'extension' )
                            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5087:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,78,FOLLOW_78_in_ruleXImportDeclaration12054); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5100:3: ( ( ruleQualifiedName ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5101:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5101:1: ( ruleQualifiedName )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5102:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12091);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXImportDeclaration12103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXImportDeclarationAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleXImportDeclaration12115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXImportDeclarationAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5124:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5124:6: ( ( ruleQualifiedName ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5125:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5125:1: ( ruleQualifiedName )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5126:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12145);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5140:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5140:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5141:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard )
                    {
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5141:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard )
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5142:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImportDeclaration12172);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildCard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_7_0, 
                              		"QualifiedNameWithWildCard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5158:3: (otherlv_8= ';' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==13) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:5158:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleXImportDeclaration12186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXImportDeclaration"

    // $ANTLR start synpred1_InternalPureXbase
    public final void synpred1_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:273:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:273:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:273:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:273:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:273:5: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:274:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:274:2: ( ( ruleOpMultiAssign ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:275:1: ( ruleOpMultiAssign )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:275:1: ( ruleOpMultiAssign )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:276:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalPureXbase553);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalPureXbase

    // $ANTLR start synpred2_InternalPureXbase
    public final void synpred2_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:401:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:401:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:401:4: ( () ( ( ruleOpOr ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:401:5: () ( ( ruleOpOr ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:401:5: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:402:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:402:2: ( ( ruleOpOr ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:403:1: ( ruleOpOr )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:403:1: ( ruleOpOr )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:404:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalPureXbase901);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalPureXbase

    // $ANTLR start synpred3_InternalPureXbase
    public final void synpred3_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:502:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:502:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:502:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:502:5: () ( ( ruleOpAnd ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:502:5: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:503:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:503:2: ( ( ruleOpAnd ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:504:1: ( ruleOpAnd )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:504:1: ( ruleOpAnd )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:505:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalPureXbase1160);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalPureXbase

    // $ANTLR start synpred4_InternalPureXbase
    public final void synpred4_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:603:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:603:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:603:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:603:5: () ( ( ruleOpEquality ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:603:5: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:604:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:604:2: ( ( ruleOpEquality ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:605:1: ( ruleOpEquality )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:605:1: ( ruleOpEquality )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:606:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalPureXbase1419);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalPureXbase

    // $ANTLR start synpred5_InternalPureXbase
    public final void synpred5_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:4: ( ( () 'instanceof' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:5: ( () 'instanceof' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:5: ( () 'instanceof' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:6: () 'instanceof'
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:711:6: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:712:1: 
        {
        }

        match(input,20,FOLLOW_20_in_synpred5_InternalPureXbase1695); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalPureXbase

    // $ANTLR start synpred6_InternalPureXbase
    public final void synpred6_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:10: () ( ( ruleOpCompare ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:742:10: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:743:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:743:2: ( ( ruleOpCompare ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:744:1: ( ruleOpCompare )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:744:1: ( ruleOpCompare )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:745:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalPureXbase1766);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalPureXbase

    // $ANTLR start synpred7_InternalPureXbase
    public final void synpred7_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:864:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:864:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:864:4: ( () ( ( ruleOpOther ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:864:5: () ( ( ruleOpOther ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:864:5: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:865:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:865:2: ( ( ruleOpOther ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:866:1: ( ruleOpOther )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:866:1: ( ruleOpOther )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:867:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalPureXbase2085);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalPureXbase

    // $ANTLR start synpred8_InternalPureXbase
    public final void synpred8_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:956:3: ( ( '>' '>' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:956:4: ( '>' '>' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:956:4: ( '>' '>' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:957:2: '>' '>'
        {
        match(input,23,FOLLOW_23_in_synpred8_InternalPureXbase2301); if (state.failed) return ;
        match(input,23,FOLLOW_23_in_synpred8_InternalPureXbase2306); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalPureXbase

    // $ANTLR start synpred9_InternalPureXbase
    public final void synpred9_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:986:3: ( ( '<' '<' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:986:4: ( '<' '<' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:986:4: ( '<' '<' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:987:2: '<' '<'
        {
        match(input,24,FOLLOW_24_in_synpred9_InternalPureXbase2388); if (state.failed) return ;
        match(input,24,FOLLOW_24_in_synpred9_InternalPureXbase2393); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalPureXbase

    // $ANTLR start synpred10_InternalPureXbase
    public final void synpred10_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1060:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1060:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1060:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1060:5: () ( ( ruleOpAdd ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1060:5: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1061:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1061:2: ( ( ruleOpAdd ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1062:1: ( ruleOpAdd )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1062:1: ( ruleOpAdd )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1063:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalPureXbase2615);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalPureXbase

    // $ANTLR start synpred11_InternalPureXbase
    public final void synpred11_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1168:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1168:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1168:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1168:5: () ( ( ruleOpMulti ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1168:5: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1169:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1169:2: ( ( ruleOpMulti ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1170:1: ( ruleOpMulti )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1170:1: ( ruleOpMulti )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1171:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalPureXbase2895);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalPureXbase

    // $ANTLR start synpred12_InternalPureXbase
    public final void synpred12_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1401:3: ( ( () 'as' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1401:4: ( () 'as' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1401:4: ( () 'as' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1401:5: () 'as'
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1401:5: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1402:1: 
        {
        }

        match(input,38,FOLLOW_38_in_synpred12_InternalPureXbase3489); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalPureXbase

    // $ANTLR start synpred13_InternalPureXbase
    public final void synpred13_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1461:6: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1462:1: 
        {
        }

        match(input,39,FOLLOW_39_in_synpred13_InternalPureXbase3643); if (state.failed) return ;
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1463:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1464:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1464:1: ( ruleValidID )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1465:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalPureXbase3652);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalPureXbase3658);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalPureXbase

    // $ANTLR start synpred14_InternalPureXbase
    public final void synpred14_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1519:10: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1520:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1520:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt93=3;
        switch ( input.LA(1) ) {
        case 39:
            {
            alt93=1;
            }
            break;
        case 40:
            {
            alt93=2;
            }
            break;
        case 41:
            {
            alt93=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 93, 0, input);

            throw nvae;
        }

        switch (alt93) {
            case 1 :
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1520:4: '.'
                {
                match(input,39,FOLLOW_39_in_synpred14_InternalPureXbase3761); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1522:6: ( ( '?.' ) )
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1522:6: ( ( '?.' ) )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1523:1: ( '?.' )
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1523:1: ( '?.' )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1524:2: '?.'
                {
                match(input,40,FOLLOW_40_in_synpred14_InternalPureXbase3775); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1529:6: ( ( '*.' ) )
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1529:6: ( ( '*.' ) )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1530:1: ( '*.' )
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1530:1: ( '*.' )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1531:2: '*.'
                {
                match(input,41,FOLLOW_41_in_synpred14_InternalPureXbase3795); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalPureXbase

    // $ANTLR start synpred15_InternalPureXbase
    public final void synpred15_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1640:4: ( ( '(' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1641:1: ( '(' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1641:1: ( '(' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1642:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred15_InternalPureXbase4022); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalPureXbase

    // $ANTLR start synpred16_InternalPureXbase
    public final void synpred16_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1661:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1661:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1661:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1661:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1661:6: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1662:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1662:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==27||LA95_0==43) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1662:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1662:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1663:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1663:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1664:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalPureXbase4074);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1666:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==42) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1666:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred16_InternalPureXbase4081); if (state.failed) return ;
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1667:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1668:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1668:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1669:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalPureXbase4088);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1671:6: ( ( '|' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1672:1: ( '|' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1672:1: ( '|' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1673:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred16_InternalPureXbase4102); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalPureXbase

    // $ANTLR start synpred17_InternalPureXbase
    public final void synpred17_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1740:4: ( ( () '[' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1740:5: ( () '[' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1740:5: ( () '[' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1740:6: () '['
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1740:6: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1741:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred17_InternalPureXbase4222); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalPureXbase

    // $ANTLR start synpred18_InternalPureXbase
    public final void synpred18_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:3: ( ( () '[' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:4: ( () '[' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:4: ( () '[' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:5: () '['
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1931:5: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:1932:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred18_InternalPureXbase4746); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalPureXbase

    // $ANTLR start synpred20_InternalPureXbase
    public final void synpred20_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2025:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2025:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2025:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2025:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2025:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==27||LA97_0==43) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2025:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2025:7: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2026:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2026:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2027:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalPureXbase5025);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2029:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==42) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2029:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred20_InternalPureXbase5032); if (state.failed) return ;
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2030:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2031:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2031:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2032:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalPureXbase5039);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2034:6: ( ( '|' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2035:1: ( '|' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2035:1: ( '|' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2036:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred20_InternalPureXbase5053); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalPureXbase

    // $ANTLR start synpred22_InternalPureXbase
    public final void synpred22_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2395:4: ( 'else' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2395:6: 'else'
        {
        match(input,49,FOLLOW_49_in_synpred22_InternalPureXbase5836); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalPureXbase

    // $ANTLR start synpred23_InternalPureXbase
    public final void synpred23_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2449:6: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2450:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2450:1: ( ruleValidID )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2451:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalPureXbase5978);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,51,FOLLOW_51_in_synpred23_InternalPureXbase5984); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalPureXbase

    // $ANTLR start synpred24_InternalPureXbase
    public final void synpred24_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2495:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2495:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2495:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2495:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,43,FOLLOW_43_in_synpred24_InternalPureXbase6060); if (state.failed) return ;
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2496:1: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2497:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2497:1: ( ruleValidID )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:2498:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalPureXbase6067);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,51,FOLLOW_51_in_synpred24_InternalPureXbase6073); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalPureXbase

    // $ANTLR start synpred25_InternalPureXbase
    public final void synpred25_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3079:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3079:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3079:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3079:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3079:6: ( ( ruleJvmTypeReference ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3080:1: ( ruleJvmTypeReference )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3080:1: ( ruleJvmTypeReference )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3081:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalPureXbase7338);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3083:2: ( ( ruleValidID ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3084:1: ( ruleValidID )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3084:1: ( ruleValidID )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3085:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalPureXbase7347);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalPureXbase

    // $ANTLR start synpred26_InternalPureXbase
    public final void synpred26_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3383:4: ( ( '(' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3384:1: ( '(' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3384:1: ( '(' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3385:2: '('
        {
        match(input,43,FOLLOW_43_in_synpred26_InternalPureXbase7909); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalPureXbase

    // $ANTLR start synpred27_InternalPureXbase
    public final void synpred27_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3404:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3404:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3404:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3404:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3404:6: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3405:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3405:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==RULE_ID||LA101_0==27||LA101_0==43) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3405:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3405:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3406:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3406:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3407:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalPureXbase7961);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3409:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==42) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3409:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred27_InternalPureXbase7968); if (state.failed) return ;
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3410:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3411:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3411:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3412:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalPureXbase7975);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3414:6: ( ( '|' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3415:1: ( '|' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3415:1: ( '|' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3416:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred27_InternalPureXbase7989); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalPureXbase

    // $ANTLR start synpred28_InternalPureXbase
    public final void synpred28_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3483:4: ( ( () '[' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3483:5: ( () '[' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3483:5: ( () '[' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3483:6: () '['
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3483:6: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3484:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred28_InternalPureXbase8109); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalPureXbase

    // $ANTLR start synpred29_InternalPureXbase
    public final void synpred29_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3626:4: ( '<' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3626:6: '<'
        {
        match(input,24,FOLLOW_24_in_synpred29_InternalPureXbase8496); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalPureXbase

    // $ANTLR start synpred30_InternalPureXbase
    public final void synpred30_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3675:5: ( '(' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3675:7: '('
        {
        match(input,43,FOLLOW_43_in_synpred30_InternalPureXbase8589); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalPureXbase

    // $ANTLR start synpred31_InternalPureXbase
    public final void synpred31_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3680:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3680:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3680:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3680:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3680:6: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3681:1: 
        {
        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3681:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==RULE_ID||LA103_0==27||LA103_0==43) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3681:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3681:3: ( ( ruleJvmFormalParameter ) )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3682:1: ( ruleJvmFormalParameter )
                {
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3682:1: ( ruleJvmFormalParameter )
                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3683:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalPureXbase8619);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3685:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop102:
                do {
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==42) ) {
                        alt102=1;
                    }


                    switch (alt102) {
                	case 1 :
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3685:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,42,FOLLOW_42_in_synpred31_InternalPureXbase8626); if (state.failed) return ;
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3686:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3687:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3687:1: ( ruleJvmFormalParameter )
                	    // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3688:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalPureXbase8633);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop102;
                    }
                } while (true);


                }
                break;

        }

        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3690:6: ( ( '|' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3691:1: ( '|' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3691:1: ( '|' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3692:2: '|'
        {
        match(input,46,FOLLOW_46_in_synpred31_InternalPureXbase8647); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalPureXbase

    // $ANTLR start synpred32_InternalPureXbase
    public final void synpred32_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3759:4: ( ( () '[' ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3759:5: ( () '[' )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3759:5: ( () '[' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3759:6: () '['
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3759:6: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:3760:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred32_InternalPureXbase8767); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalPureXbase

    // $ANTLR start synpred33_InternalPureXbase
    public final void synpred33_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4099:2: ( ( ruleXExpression ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4100:1: ( ruleXExpression )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4100:1: ( ruleXExpression )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4101:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalPureXbase9591);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalPureXbase

    // $ANTLR start synpred34_InternalPureXbase
    public final void synpred34_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4170:5: ( 'catch' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4170:7: 'catch'
        {
        match(input,72,FOLLOW_72_in_synpred34_InternalPureXbase9736); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalPureXbase

    // $ANTLR start synpred35_InternalPureXbase
    public final void synpred35_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4189:5: ( 'finally' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4189:7: 'finally'
        {
        match(input,71,FOLLOW_71_in_synpred35_InternalPureXbase9766); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalPureXbase

    // $ANTLR start synpred37_InternalPureXbase
    public final void synpred37_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4337:3: ( '.' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4338:2: '.'
        {
        match(input,39,FOLLOW_39_in_synpred37_InternalPureXbase10113); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalPureXbase

    // $ANTLR start synpred38_InternalPureXbase
    public final void synpred38_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4461:2: ( ( () ruleArrayBrackets ) )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4461:3: ( () ruleArrayBrackets )
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4461:3: ( () ruleArrayBrackets )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4461:4: () ruleArrayBrackets
        {
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4461:4: ()
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4462:1: 
        {
        }

        pushFollow(FOLLOW_ruleArrayBrackets_in_synpred38_InternalPureXbase10496);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalPureXbase

    // $ANTLR start synpred39_InternalPureXbase
    public final void synpred39_InternalPureXbase_fragment() throws RecognitionException {   
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4646:4: ( '<' )
        // ../org.eclipse.xtext.purexbase/src-gen/org/eclipse/xtext/purexbase/parser/antlr/internal/InternalPureXbase.g:4646:6: '<'
        {
        match(input,24,FOLLOW_24_in_synpred39_InternalPureXbase10948); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalPureXbase

    // Delegated rules

    public final boolean synpred39_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalPureXbase() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalPureXbase_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA12_eotS =
        "\13\uffff";
    static final String DFA12_eofS =
        "\1\1\12\uffff";
    static final String DFA12_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA12_maxS =
        "\1\110\1\uffff\10\0\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA12_specialS =
        "\2\uffff\1\6\1\0\1\7\1\5\1\4\1\2\1\3\1\1\1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\5\1\4\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\17\1\1\uffff\17\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 864:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPureXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPureXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPureXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPureXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPureXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPureXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPureXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalPureXbase()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\101\uffff";
    static final String DFA28_eofS =
        "\1\2\100\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA28_maxS =
        "\1\110\1\0\77\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA28_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1640:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\36\uffff";
    static final String DFA27_eofS =
        "\36\uffff";
    static final String DFA27_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA27_maxS =
        "\1\106\2\0\33\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA27_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA27_transitionS = {
            "\4\5\1\1\17\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1661:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==RULE_ID) ) {s = 1;}

                        else if ( (LA27_0==43) ) {s = 2;}

                        else if ( (LA27_0==27) && (synpred16_InternalPureXbase())) {s = 3;}

                        else if ( (LA27_0==46) && (synpred16_InternalPureXbase())) {s = 4;}

                        else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_DECIMAL)||LA27_0==24||(LA27_0>=31 && LA27_0<=32)||LA27_0==37||LA27_0==45||LA27_0==48||LA27_0==50||LA27_0==52||(LA27_0>=56 && LA27_0<=58)||LA27_0==61||(LA27_0>=63 && LA27_0<=70)) ) {s = 5;}

                        else if ( (LA27_0==44) ) {s = 29;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalPureXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalPureXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\101\uffff";
    static final String DFA29_eofS =
        "\1\2\100\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA29_maxS =
        "\1\110\1\0\77\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1740:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\16\uffff";
    static final String DFA31_eofS =
        "\16\uffff";
    static final String DFA31_minS =
        "\1\4\15\uffff";
    static final String DFA31_maxS =
        "\1\106\15\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA31_specialS =
        "\16\uffff}>";
    static final String[] DFA31_transitionS = {
            "\4\5\1\4\17\uffff\1\4\22\uffff\1\15\1\uffff\1\5\2\uffff\1\6"+
            "\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1"+
            "\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1781:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA35_eotS =
        "\40\uffff";
    static final String DFA35_eofS =
        "\40\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA35_maxS =
        "\1\106\2\0\35\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA35_transitionS = {
            "\4\5\1\1\17\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\uffff\1\5\1\4\2\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "2025:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==43) ) {s = 2;}

                        else if ( (LA35_0==27) && (synpred20_InternalPureXbase())) {s = 3;}

                        else if ( (LA35_0==46) && (synpred20_InternalPureXbase())) {s = 4;}

                        else if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_DECIMAL)||LA35_0==24||(LA35_0>=31 && LA35_0<=32)||LA35_0==37||LA35_0==45||(LA35_0>=47 && LA35_0<=48)||LA35_0==50||LA35_0==52||(LA35_0>=56 && LA35_0<=61)||(LA35_0>=63 && LA35_0<=70)) ) {s = 5;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalPureXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalPureXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\101\uffff";
    static final String DFA59_eofS =
        "\1\2\100\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA59_maxS =
        "\1\110\1\0\77\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA59_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3383:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\36\uffff";
    static final String DFA58_eofS =
        "\36\uffff";
    static final String DFA58_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA58_maxS =
        "\1\106\2\0\33\uffff";
    static final String DFA58_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA58_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA58_transitionS = {
            "\4\5\1\1\17\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3404:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA58_0==RULE_ID) ) {s = 1;}

                        else if ( (LA58_0==43) ) {s = 2;}

                        else if ( (LA58_0==27) && (synpred27_InternalPureXbase())) {s = 3;}

                        else if ( (LA58_0==46) && (synpred27_InternalPureXbase())) {s = 4;}

                        else if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_DECIMAL)||LA58_0==24||(LA58_0>=31 && LA58_0<=32)||LA58_0==37||LA58_0==45||LA58_0==48||LA58_0==50||LA58_0==52||(LA58_0>=56 && LA58_0<=58)||LA58_0==61||(LA58_0>=63 && LA58_0<=70)) ) {s = 5;}

                        else if ( (LA58_0==44) ) {s = 29;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalPureXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalPureXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\101\uffff";
    static final String DFA60_eofS =
        "\1\2\100\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA60_maxS =
        "\1\110\1\0\77\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA60_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3483:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\101\uffff";
    static final String DFA64_eofS =
        "\1\2\100\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA64_maxS =
        "\1\110\1\0\77\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA64_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3626:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\101\uffff";
    static final String DFA67_eofS =
        "\1\2\100\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA67_maxS =
        "\1\110\1\0\77\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3675:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\36\uffff";
    static final String DFA66_eofS =
        "\36\uffff";
    static final String DFA66_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA66_maxS =
        "\1\106\2\0\33\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA66_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA66_transitionS = {
            "\4\5\1\1\17\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3680:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_0 = input.LA(1);

                         
                        int index66_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA66_0==RULE_ID) ) {s = 1;}

                        else if ( (LA66_0==43) ) {s = 2;}

                        else if ( (LA66_0==27) && (synpred31_InternalPureXbase())) {s = 3;}

                        else if ( (LA66_0==46) && (synpred31_InternalPureXbase())) {s = 4;}

                        else if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_DECIMAL)||LA66_0==24||(LA66_0>=31 && LA66_0<=32)||LA66_0==37||LA66_0==45||LA66_0==48||LA66_0==50||LA66_0==52||(LA66_0>=56 && LA66_0<=58)||LA66_0==61||(LA66_0>=63 && LA66_0<=70)) ) {s = 5;}

                        else if ( (LA66_0==44) ) {s = 29;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalPureXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalPureXbase()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\101\uffff";
    static final String DFA68_eofS =
        "\1\2\100\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA68_maxS =
        "\1\110\1\0\77\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3759:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\101\uffff";
    static final String DFA71_eofS =
        "\1\33\100\uffff";
    static final String DFA71_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA71_maxS =
        "\1\110\32\0\46\uffff";
    static final String DFA71_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\46\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\4\uffff\1\33\1\uffff\11\33\1\10\6\33"+
            "\1\4\1\3\4\33\1\2\5\33\1\32\1\33\1\12\1\uffff\1\33\1\23\1\33"+
            "\1\7\1\33\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13"+
            "\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4099:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_7 = input.LA(1);

                         
                        int index71_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_8 = input.LA(1);

                         
                        int index71_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA71_9 = input.LA(1);

                         
                        int index71_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA71_11 = input.LA(1);

                         
                        int index71_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA71_12 = input.LA(1);

                         
                        int index71_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA71_13 = input.LA(1);

                         
                        int index71_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA71_14 = input.LA(1);

                         
                        int index71_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA71_15 = input.LA(1);

                         
                        int index71_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA71_16 = input.LA(1);

                         
                        int index71_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA71_17 = input.LA(1);

                         
                        int index71_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA71_18 = input.LA(1);

                         
                        int index71_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA71_19 = input.LA(1);

                         
                        int index71_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA71_20 = input.LA(1);

                         
                        int index71_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA71_21 = input.LA(1);

                         
                        int index71_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA71_22 = input.LA(1);

                         
                        int index71_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA71_23 = input.LA(1);

                         
                        int index71_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA71_24 = input.LA(1);

                         
                        int index71_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA71_25 = input.LA(1);

                         
                        int index71_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA71_26 = input.LA(1);

                         
                        int index71_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA86_eotS =
        "\101\uffff";
    static final String DFA86_eofS =
        "\1\2\100\uffff";
    static final String DFA86_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA86_maxS =
        "\1\110\1\0\77\uffff";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA86_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA86_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
            "\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "4646:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalPureXbase()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA91_eotS =
        "\7\uffff";
    static final String DFA91_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA91_minS =
        "\1\10\1\uffff\1\4\1\10\2\uffff\1\4";
    static final String DFA91_maxS =
        "\1\115\1\uffff\1\114\1\41\2\uffff\1\114";
    static final String DFA91_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA91_specialS =
        "\7\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\2\104\uffff\1\1",
            "",
            "\5\4\4\uffff\1\4\12\uffff\1\4\6\uffff\2\4\4\uffff\1\4\1\uffff"+
            "\1\3\3\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\6\4\1\uffff\10\4\5\uffff\1\4",
            "\1\6\30\uffff\1\5",
            "",
            "",
            "\5\4\4\uffff\1\4\12\uffff\1\4\6\uffff\2\4\4\uffff\1\4\1\uffff"+
            "\1\3\3\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\6\4\1\uffff\10\4\5\uffff\1\4"
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "5070:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildCard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportSection_in_ruleModel131 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleSpecialBlockExpression_in_ruleModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialBlockExpression_in_entryRuleSpecialBlockExpression189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialBlockExpression199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleSpecialBlockExpression255 = new BitSet(new long[]{0xBF152821810021F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_13_in_ruleSpecialBlockExpression268 = new BitSet(new long[]{0xBF152821810001F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment466 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment482 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment532 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment585 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpSingleAssign696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMultiAssign784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression880 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression933 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression956 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpOr1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1139 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1192 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1215 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpAnd1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1398 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1451 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1474 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpEquality1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpEquality1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1678 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_20_in_ruleXRelationalExpression1714 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1737 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1798 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1821 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpCompare1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpCompare1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2064 = new BitSet(new long[]{0x000000007F800002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2117 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2140 = new BitSet(new long[]{0x000000007F800002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpOther2286 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOpOther2317 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOpOther2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpOther2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2373 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2404 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2594 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2647 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2670 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAdd2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2874 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2927 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2950 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti2989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3203 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpUnary3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3473 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleXCastedExpression3508 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3531 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3626 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3675 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3714 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3736 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall3822 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall3846 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3883 = new BitSet(new long[]{0x0000000001000100L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall3912 = new BitSet(new long[]{0x0000080008000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3933 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3946 = new BitSet(new long[]{0x0000080008000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3967 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall3981 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4006 = new BitSet(new long[]{0x00002B8000000002L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4040 = new BitSet(new long[]{0xBF157821890001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4125 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4153 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4166 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4187 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4204 = new BitSet(new long[]{0x0000238000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4239 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5006 = new BitSet(new long[]{0xBF15E821890001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5079 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5092 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5113 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5135 = new BitSet(new long[]{0xBF15A821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5172 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5286 = new BitSet(new long[]{0xBF152821810021F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_13_in_ruleXExpressionInClosure5299 = new BitSet(new long[]{0xBF152821810001F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5457 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_ruleXShortClosure5470 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5491 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_ruleXShortClosure5513 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXParenthesizedExpression5632 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5654 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression5757 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXIfExpression5769 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5790 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression5802 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5823 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression5844 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression5960 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6003 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6015 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6039 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43_in_ruleXSwitchExpression6083 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6104 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6116 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6139 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXSwitchExpression6151 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6165 = new BitSet(new long[]{0x0088080008000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6186 = new BitSet(new long[]{0x00E8080008000100L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6200 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6212 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6233 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6339 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXCasePart6353 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6374 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXCasePart6388 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression6501 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXForLoopExpression6513 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6534 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression6546 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6567 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression6579 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXWhileExpression6692 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXWhileExpression6704 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6725 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression6737 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression6850 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6871 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXDoWhileExpression6883 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXDoWhileExpression6895 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6916 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression7020 = new BitSet(new long[]{0xBF552821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7042 = new BitSet(new long[]{0xBF552821810021F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7055 = new BitSet(new long[]{0xBF552821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXVariableDeclaration7289 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7320 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7368 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7389 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7418 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleXVariableDeclaration7432 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7547 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7661 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7785 = new BitSet(new long[]{0x2000000001000100L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall7799 = new BitSet(new long[]{0x0000080008000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7820 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall7833 = new BitSet(new long[]{0x0000080008000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7854 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_23_in_ruleXFeatureCall7868 = new BitSet(new long[]{0x2000000001000100L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7893 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7927 = new BitSet(new long[]{0xBF157821890001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8012 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8040 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFeatureCall8053 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8074 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall8091 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleIdOrSuper8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8345 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleStaticQualifier8363 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXConstructorCall8460 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8483 = new BitSet(new long[]{0x0000280001000002L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall8504 = new BitSet(new long[]{0x0000080008000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8526 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8539 = new BitSet(new long[]{0x0000080008000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8560 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_23_in_ruleXConstructorCall8574 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8597 = new BitSet(new long[]{0xBF157821890001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8670 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8698 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXConstructorCall8711 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8732 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8749 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXBooleanLiteral8878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral8902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXNullLiteral9008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTypeLiteral9303 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXTypeLiteral9315 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9338 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral9359 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXThrowExpression9464 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXReturnExpression9577 = new BitSet(new long[]{0xBF152821810001F2L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTryCatchFinallyExpression9701 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9774 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9818 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXCatchClause9932 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleXCatchClause9945 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9966 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause9978 = new BitSet(new long[]{0xBF152821810001F0L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10094 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName10122 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10145 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10282 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10308 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleNumber10328 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10481 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference10517 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets10584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayBrackets10595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleArrayBrackets10633 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleArrayBrackets10646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10734 = new BitSet(new long[]{0x0000180008000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10756 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_42_in_ruleXFunctionTypeRef10769 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10790 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10806 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFunctionTypeRef10820 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10935 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference10956 = new BitSet(new long[]{0x0000080008000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10978 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_42_in_ruleJvmParameterizedTypeReference10991 = new BitSet(new long[]{0x0000080008000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11012 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_23_in_ruleJvmParameterizedTypeReference11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmWildcardTypeReference11239 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmUpperBound11373 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBoundAnded11477 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleJvmLowerBound11581 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard11641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard11699 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedNameWithWildCard11717 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleQualifiedNameWithWildCard11730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportSection_in_entryRuleXImportSection11865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportSection11875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_ruleXImportSection11920 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration11956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportDeclaration11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXImportDeclaration12003 = new BitSet(new long[]{0x0000000000000100L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleXImportDeclaration12023 = new BitSet(new long[]{0x0000000000000100L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleXImportDeclaration12054 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12091 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXImportDeclaration12103 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXImportDeclaration12115 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12145 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleXImportDeclaration12172 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleXImportDeclaration12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalPureXbase553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalPureXbase901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalPureXbase1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalPureXbase1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred5_InternalPureXbase1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalPureXbase1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalPureXbase2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred8_InternalPureXbase2301 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred8_InternalPureXbase2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred9_InternalPureXbase2388 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred9_InternalPureXbase2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalPureXbase2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalPureXbase2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred12_InternalPureXbase3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred13_InternalPureXbase3643 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalPureXbase3652 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalPureXbase3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred14_InternalPureXbase3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred14_InternalPureXbase3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalPureXbase3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred15_InternalPureXbase4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalPureXbase4074 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred16_InternalPureXbase4081 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalPureXbase4088 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalPureXbase4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred17_InternalPureXbase4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred18_InternalPureXbase4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalPureXbase5025 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred20_InternalPureXbase5032 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalPureXbase5039 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred20_InternalPureXbase5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred22_InternalPureXbase5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalPureXbase5978 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred23_InternalPureXbase5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred24_InternalPureXbase6060 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalPureXbase6067 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred24_InternalPureXbase6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalPureXbase7338 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalPureXbase7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred26_InternalPureXbase7909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalPureXbase7961 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred27_InternalPureXbase7968 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalPureXbase7975 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred27_InternalPureXbase7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred28_InternalPureXbase8109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred29_InternalPureXbase8496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred30_InternalPureXbase8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalPureXbase8619 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_synpred31_InternalPureXbase8626 = new BitSet(new long[]{0x0000080008000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalPureXbase8633 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_synpred31_InternalPureXbase8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred32_InternalPureXbase8767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalPureXbase9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred34_InternalPureXbase9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_synpred35_InternalPureXbase9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred37_InternalPureXbase10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_synpred38_InternalPureXbase10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred39_InternalPureXbase10948 = new BitSet(new long[]{0x0000000000000002L});

}