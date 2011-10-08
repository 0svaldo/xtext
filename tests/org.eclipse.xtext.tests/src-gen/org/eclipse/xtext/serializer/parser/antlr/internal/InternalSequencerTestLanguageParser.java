package org.eclipse.xtext.serializer.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.serializer.services.SequencerTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSequencerTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ID1", "RULE_ID2", "RULE_ID3", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#1'", "'#2'", "'kw1'", "'kw2'", "'#3'", "'kw3'", "'#4'", "'#5'", "'kw4'", "'kw5'", "'#6'", "','", "'#7'", "'#8'", "'#9'", "'kw'", "'#10'", "'#11'", "'#12'", "'#13'", "'#14'", "'#15'", "'#16'", "'#17'", "'#18'", "'#19'", "'#20'", "'#21'", "'#22'", "'Bye'", "'#23'", "'#24'", "'#25'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_INT=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_ID1=5;
    public static final int RULE_ID2=6;
    public static final int RULE_ID3=7;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalSequencerTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSequencerTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSequencerTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g"; }



     	private SequencerTestLanguageGrammarAccess grammarAccess;
     	
        public InternalSequencerTestLanguageParser(TokenStream input, SequencerTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SequencerTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
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
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_x1_0_0= ruleSimpleGroup ) ) | ( (lv_x2_1_0= ruleSimpleAlternative ) ) | ( (lv_x3_2_0= ruleSimpleMultiplicities ) ) | ( (lv_x4_3_0= ruleGroupMultiplicities ) ) | ( (lv_x5_4_0= ruleAlternativeMultiplicities ) ) | ( (lv_x6_5_0= ruleList1 ) ) | ( (lv_x7_6_0= ruleList2 ) ) | ( (lv_x8_7_0= ruleAltList1 ) ) | ( (lv_x9_8_0= ruleAltList2 ) ) | ( (lv_x10_9_0= ruleSingleKeywords ) ) | ( (lv_x11_10_0= ruleSingleKeywordsOrID ) ) | ( (lv_x12_11_0= ruleSingleTerminals ) ) | ( (lv_x10_12_0= ruleMultiKeywords ) ) | ( (lv_x11_13_0= ruleMultiKeywordsOrID ) ) | ( (lv_x12_14_0= ruleMultiTerminals ) ) | ( (lv_x13_15_0= ruleSingleEnum ) ) | ( (lv_x14_16_0= ruleSingleCrossReference ) ) | ( (lv_x15_17_0= ruleSingleContainmentReference ) ) | ( (lv_x19_18_0= ruleDependentAlternative1 ) ) | ( (lv_x20_19_0= ruleDependentAlternative2 ) ) | ( (lv_x21_20_0= ruleOptional ) ) | ( (lv_x22_21_0= ruleFloat ) ) | ( (lv_x23_22_0= ruleUnorderedAlternative ) ) | ( (lv_x24_23_0= ruleUnorderedGroup ) ) | ( (lv_x25_24_0= ruleUnorderedGroupOptional ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_x1_0_0 = null;

        EObject lv_x2_1_0 = null;

        EObject lv_x3_2_0 = null;

        EObject lv_x4_3_0 = null;

        EObject lv_x5_4_0 = null;

        EObject lv_x6_5_0 = null;

        EObject lv_x7_6_0 = null;

        EObject lv_x8_7_0 = null;

        EObject lv_x9_8_0 = null;

        EObject lv_x10_9_0 = null;

        EObject lv_x11_10_0 = null;

        EObject lv_x12_11_0 = null;

        EObject lv_x10_12_0 = null;

        EObject lv_x11_13_0 = null;

        EObject lv_x12_14_0 = null;

        EObject lv_x13_15_0 = null;

        EObject lv_x14_16_0 = null;

        EObject lv_x15_17_0 = null;

        EObject lv_x19_18_0 = null;

        EObject lv_x20_19_0 = null;

        EObject lv_x21_20_0 = null;

        EObject lv_x22_21_0 = null;

        EObject lv_x23_22_0 = null;

        EObject lv_x24_23_0 = null;

        EObject lv_x25_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:80:28: ( ( ( (lv_x1_0_0= ruleSimpleGroup ) ) | ( (lv_x2_1_0= ruleSimpleAlternative ) ) | ( (lv_x3_2_0= ruleSimpleMultiplicities ) ) | ( (lv_x4_3_0= ruleGroupMultiplicities ) ) | ( (lv_x5_4_0= ruleAlternativeMultiplicities ) ) | ( (lv_x6_5_0= ruleList1 ) ) | ( (lv_x7_6_0= ruleList2 ) ) | ( (lv_x8_7_0= ruleAltList1 ) ) | ( (lv_x9_8_0= ruleAltList2 ) ) | ( (lv_x10_9_0= ruleSingleKeywords ) ) | ( (lv_x11_10_0= ruleSingleKeywordsOrID ) ) | ( (lv_x12_11_0= ruleSingleTerminals ) ) | ( (lv_x10_12_0= ruleMultiKeywords ) ) | ( (lv_x11_13_0= ruleMultiKeywordsOrID ) ) | ( (lv_x12_14_0= ruleMultiTerminals ) ) | ( (lv_x13_15_0= ruleSingleEnum ) ) | ( (lv_x14_16_0= ruleSingleCrossReference ) ) | ( (lv_x15_17_0= ruleSingleContainmentReference ) ) | ( (lv_x19_18_0= ruleDependentAlternative1 ) ) | ( (lv_x20_19_0= ruleDependentAlternative2 ) ) | ( (lv_x21_20_0= ruleOptional ) ) | ( (lv_x22_21_0= ruleFloat ) ) | ( (lv_x23_22_0= ruleUnorderedAlternative ) ) | ( (lv_x24_23_0= ruleUnorderedGroup ) ) | ( (lv_x25_24_0= ruleUnorderedGroupOptional ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:81:1: ( ( (lv_x1_0_0= ruleSimpleGroup ) ) | ( (lv_x2_1_0= ruleSimpleAlternative ) ) | ( (lv_x3_2_0= ruleSimpleMultiplicities ) ) | ( (lv_x4_3_0= ruleGroupMultiplicities ) ) | ( (lv_x5_4_0= ruleAlternativeMultiplicities ) ) | ( (lv_x6_5_0= ruleList1 ) ) | ( (lv_x7_6_0= ruleList2 ) ) | ( (lv_x8_7_0= ruleAltList1 ) ) | ( (lv_x9_8_0= ruleAltList2 ) ) | ( (lv_x10_9_0= ruleSingleKeywords ) ) | ( (lv_x11_10_0= ruleSingleKeywordsOrID ) ) | ( (lv_x12_11_0= ruleSingleTerminals ) ) | ( (lv_x10_12_0= ruleMultiKeywords ) ) | ( (lv_x11_13_0= ruleMultiKeywordsOrID ) ) | ( (lv_x12_14_0= ruleMultiTerminals ) ) | ( (lv_x13_15_0= ruleSingleEnum ) ) | ( (lv_x14_16_0= ruleSingleCrossReference ) ) | ( (lv_x15_17_0= ruleSingleContainmentReference ) ) | ( (lv_x19_18_0= ruleDependentAlternative1 ) ) | ( (lv_x20_19_0= ruleDependentAlternative2 ) ) | ( (lv_x21_20_0= ruleOptional ) ) | ( (lv_x22_21_0= ruleFloat ) ) | ( (lv_x23_22_0= ruleUnorderedAlternative ) ) | ( (lv_x24_23_0= ruleUnorderedGroup ) ) | ( (lv_x25_24_0= ruleUnorderedGroupOptional ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:81:1: ( ( (lv_x1_0_0= ruleSimpleGroup ) ) | ( (lv_x2_1_0= ruleSimpleAlternative ) ) | ( (lv_x3_2_0= ruleSimpleMultiplicities ) ) | ( (lv_x4_3_0= ruleGroupMultiplicities ) ) | ( (lv_x5_4_0= ruleAlternativeMultiplicities ) ) | ( (lv_x6_5_0= ruleList1 ) ) | ( (lv_x7_6_0= ruleList2 ) ) | ( (lv_x8_7_0= ruleAltList1 ) ) | ( (lv_x9_8_0= ruleAltList2 ) ) | ( (lv_x10_9_0= ruleSingleKeywords ) ) | ( (lv_x11_10_0= ruleSingleKeywordsOrID ) ) | ( (lv_x12_11_0= ruleSingleTerminals ) ) | ( (lv_x10_12_0= ruleMultiKeywords ) ) | ( (lv_x11_13_0= ruleMultiKeywordsOrID ) ) | ( (lv_x12_14_0= ruleMultiTerminals ) ) | ( (lv_x13_15_0= ruleSingleEnum ) ) | ( (lv_x14_16_0= ruleSingleCrossReference ) ) | ( (lv_x15_17_0= ruleSingleContainmentReference ) ) | ( (lv_x19_18_0= ruleDependentAlternative1 ) ) | ( (lv_x20_19_0= ruleDependentAlternative2 ) ) | ( (lv_x21_20_0= ruleOptional ) ) | ( (lv_x22_21_0= ruleFloat ) ) | ( (lv_x23_22_0= ruleUnorderedAlternative ) ) | ( (lv_x24_23_0= ruleUnorderedGroup ) ) | ( (lv_x25_24_0= ruleUnorderedGroupOptional ) ) )
            int alt1=25;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            case 24:
                {
                alt1=6;
                }
                break;
            case 26:
                {
                alt1=7;
                }
                break;
            case 27:
                {
                alt1=8;
                }
                break;
            case 28:
                {
                alt1=9;
                }
                break;
            case 30:
                {
                alt1=10;
                }
                break;
            case 31:
                {
                alt1=11;
                }
                break;
            case 32:
                {
                alt1=12;
                }
                break;
            case 36:
                {
                alt1=13;
                }
                break;
            case 37:
                {
                alt1=14;
                }
                break;
            case 38:
                {
                alt1=15;
                }
                break;
            case 33:
                {
                alt1=16;
                }
                break;
            case 34:
                {
                alt1=17;
                }
                break;
            case 35:
                {
                alt1=18;
                }
                break;
            case 39:
                {
                alt1=19;
                }
                break;
            case 40:
                {
                alt1=20;
                }
                break;
            case 41:
                {
                alt1=21;
                }
                break;
            case 42:
                {
                alt1=22;
                }
                break;
            case 44:
                {
                alt1=23;
                }
                break;
            case 45:
                {
                alt1=24;
                }
                break;
            case 46:
                {
                alt1=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:81:2: ( (lv_x1_0_0= ruleSimpleGroup ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:81:2: ( (lv_x1_0_0= ruleSimpleGroup ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:82:1: (lv_x1_0_0= ruleSimpleGroup )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:82:1: (lv_x1_0_0= ruleSimpleGroup )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:83:3: lv_x1_0_0= ruleSimpleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX1SimpleGroupParserRuleCall_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleGroup_in_ruleModel131);
                    lv_x1_0_0=ruleSimpleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x1",
                            		lv_x1_0_0, 
                            		"SimpleGroup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:100:6: ( (lv_x2_1_0= ruleSimpleAlternative ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:100:6: ( (lv_x2_1_0= ruleSimpleAlternative ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:101:1: (lv_x2_1_0= ruleSimpleAlternative )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:101:1: (lv_x2_1_0= ruleSimpleAlternative )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:102:3: lv_x2_1_0= ruleSimpleAlternative
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX2SimpleAlternativeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleAlternative_in_ruleModel158);
                    lv_x2_1_0=ruleSimpleAlternative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x2",
                            		lv_x2_1_0, 
                            		"SimpleAlternative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:119:6: ( (lv_x3_2_0= ruleSimpleMultiplicities ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:119:6: ( (lv_x3_2_0= ruleSimpleMultiplicities ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:120:1: (lv_x3_2_0= ruleSimpleMultiplicities )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:120:1: (lv_x3_2_0= ruleSimpleMultiplicities )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:121:3: lv_x3_2_0= ruleSimpleMultiplicities
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX3SimpleMultiplicitiesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleMultiplicities_in_ruleModel185);
                    lv_x3_2_0=ruleSimpleMultiplicities();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x3",
                            		lv_x3_2_0, 
                            		"SimpleMultiplicities");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:138:6: ( (lv_x4_3_0= ruleGroupMultiplicities ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:138:6: ( (lv_x4_3_0= ruleGroupMultiplicities ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:139:1: (lv_x4_3_0= ruleGroupMultiplicities )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:139:1: (lv_x4_3_0= ruleGroupMultiplicities )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:140:3: lv_x4_3_0= ruleGroupMultiplicities
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX4GroupMultiplicitiesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGroupMultiplicities_in_ruleModel212);
                    lv_x4_3_0=ruleGroupMultiplicities();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x4",
                            		lv_x4_3_0, 
                            		"GroupMultiplicities");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:157:6: ( (lv_x5_4_0= ruleAlternativeMultiplicities ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:157:6: ( (lv_x5_4_0= ruleAlternativeMultiplicities ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:158:1: (lv_x5_4_0= ruleAlternativeMultiplicities )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:158:1: (lv_x5_4_0= ruleAlternativeMultiplicities )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:159:3: lv_x5_4_0= ruleAlternativeMultiplicities
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX5AlternativeMultiplicitiesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAlternativeMultiplicities_in_ruleModel239);
                    lv_x5_4_0=ruleAlternativeMultiplicities();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x5",
                            		lv_x5_4_0, 
                            		"AlternativeMultiplicities");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:176:6: ( (lv_x6_5_0= ruleList1 ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:176:6: ( (lv_x6_5_0= ruleList1 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:177:1: (lv_x6_5_0= ruleList1 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:177:1: (lv_x6_5_0= ruleList1 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:178:3: lv_x6_5_0= ruleList1
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX6List1ParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleList1_in_ruleModel266);
                    lv_x6_5_0=ruleList1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x6",
                            		lv_x6_5_0, 
                            		"List1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:195:6: ( (lv_x7_6_0= ruleList2 ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:195:6: ( (lv_x7_6_0= ruleList2 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:196:1: (lv_x7_6_0= ruleList2 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:196:1: (lv_x7_6_0= ruleList2 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:197:3: lv_x7_6_0= ruleList2
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX7List2ParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleList2_in_ruleModel293);
                    lv_x7_6_0=ruleList2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x7",
                            		lv_x7_6_0, 
                            		"List2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:214:6: ( (lv_x8_7_0= ruleAltList1 ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:214:6: ( (lv_x8_7_0= ruleAltList1 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:215:1: (lv_x8_7_0= ruleAltList1 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:215:1: (lv_x8_7_0= ruleAltList1 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:216:3: lv_x8_7_0= ruleAltList1
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX8AltList1ParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAltList1_in_ruleModel320);
                    lv_x8_7_0=ruleAltList1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x8",
                            		lv_x8_7_0, 
                            		"AltList1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:233:6: ( (lv_x9_8_0= ruleAltList2 ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:233:6: ( (lv_x9_8_0= ruleAltList2 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:234:1: (lv_x9_8_0= ruleAltList2 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:234:1: (lv_x9_8_0= ruleAltList2 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:235:3: lv_x9_8_0= ruleAltList2
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX9AltList2ParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAltList2_in_ruleModel347);
                    lv_x9_8_0=ruleAltList2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x9",
                            		lv_x9_8_0, 
                            		"AltList2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:252:6: ( (lv_x10_9_0= ruleSingleKeywords ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:252:6: ( (lv_x10_9_0= ruleSingleKeywords ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:253:1: (lv_x10_9_0= ruleSingleKeywords )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:253:1: (lv_x10_9_0= ruleSingleKeywords )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:254:3: lv_x10_9_0= ruleSingleKeywords
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX10SingleKeywordsParserRuleCall_9_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleKeywords_in_ruleModel374);
                    lv_x10_9_0=ruleSingleKeywords();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x10",
                            		lv_x10_9_0, 
                            		"SingleKeywords");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:271:6: ( (lv_x11_10_0= ruleSingleKeywordsOrID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:271:6: ( (lv_x11_10_0= ruleSingleKeywordsOrID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:272:1: (lv_x11_10_0= ruleSingleKeywordsOrID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:272:1: (lv_x11_10_0= ruleSingleKeywordsOrID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:273:3: lv_x11_10_0= ruleSingleKeywordsOrID
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX11SingleKeywordsOrIDParserRuleCall_10_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleKeywordsOrID_in_ruleModel401);
                    lv_x11_10_0=ruleSingleKeywordsOrID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x11",
                            		lv_x11_10_0, 
                            		"SingleKeywordsOrID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:290:6: ( (lv_x12_11_0= ruleSingleTerminals ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:290:6: ( (lv_x12_11_0= ruleSingleTerminals ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:291:1: (lv_x12_11_0= ruleSingleTerminals )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:291:1: (lv_x12_11_0= ruleSingleTerminals )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:292:3: lv_x12_11_0= ruleSingleTerminals
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX12SingleTerminalsParserRuleCall_11_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleTerminals_in_ruleModel428);
                    lv_x12_11_0=ruleSingleTerminals();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x12",
                            		lv_x12_11_0, 
                            		"SingleTerminals");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:309:6: ( (lv_x10_12_0= ruleMultiKeywords ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:309:6: ( (lv_x10_12_0= ruleMultiKeywords ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:310:1: (lv_x10_12_0= ruleMultiKeywords )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:310:1: (lv_x10_12_0= ruleMultiKeywords )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:311:3: lv_x10_12_0= ruleMultiKeywords
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX10MultiKeywordsParserRuleCall_12_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMultiKeywords_in_ruleModel455);
                    lv_x10_12_0=ruleMultiKeywords();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x10",
                            		lv_x10_12_0, 
                            		"MultiKeywords");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:328:6: ( (lv_x11_13_0= ruleMultiKeywordsOrID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:328:6: ( (lv_x11_13_0= ruleMultiKeywordsOrID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:329:1: (lv_x11_13_0= ruleMultiKeywordsOrID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:329:1: (lv_x11_13_0= ruleMultiKeywordsOrID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:330:3: lv_x11_13_0= ruleMultiKeywordsOrID
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX11MultiKeywordsOrIDParserRuleCall_13_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMultiKeywordsOrID_in_ruleModel482);
                    lv_x11_13_0=ruleMultiKeywordsOrID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x11",
                            		lv_x11_13_0, 
                            		"MultiKeywordsOrID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 15 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:347:6: ( (lv_x12_14_0= ruleMultiTerminals ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:347:6: ( (lv_x12_14_0= ruleMultiTerminals ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:348:1: (lv_x12_14_0= ruleMultiTerminals )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:348:1: (lv_x12_14_0= ruleMultiTerminals )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:349:3: lv_x12_14_0= ruleMultiTerminals
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX12MultiTerminalsParserRuleCall_14_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMultiTerminals_in_ruleModel509);
                    lv_x12_14_0=ruleMultiTerminals();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x12",
                            		lv_x12_14_0, 
                            		"MultiTerminals");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:366:6: ( (lv_x13_15_0= ruleSingleEnum ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:366:6: ( (lv_x13_15_0= ruleSingleEnum ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:367:1: (lv_x13_15_0= ruleSingleEnum )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:367:1: (lv_x13_15_0= ruleSingleEnum )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:368:3: lv_x13_15_0= ruleSingleEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX13SingleEnumParserRuleCall_15_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleEnum_in_ruleModel536);
                    lv_x13_15_0=ruleSingleEnum();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x13",
                            		lv_x13_15_0, 
                            		"SingleEnum");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 17 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:385:6: ( (lv_x14_16_0= ruleSingleCrossReference ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:385:6: ( (lv_x14_16_0= ruleSingleCrossReference ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:386:1: (lv_x14_16_0= ruleSingleCrossReference )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:386:1: (lv_x14_16_0= ruleSingleCrossReference )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:387:3: lv_x14_16_0= ruleSingleCrossReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX14SingleCrossReferenceParserRuleCall_16_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleCrossReference_in_ruleModel563);
                    lv_x14_16_0=ruleSingleCrossReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x14",
                            		lv_x14_16_0, 
                            		"SingleCrossReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 18 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:404:6: ( (lv_x15_17_0= ruleSingleContainmentReference ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:404:6: ( (lv_x15_17_0= ruleSingleContainmentReference ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:405:1: (lv_x15_17_0= ruleSingleContainmentReference )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:405:1: (lv_x15_17_0= ruleSingleContainmentReference )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:406:3: lv_x15_17_0= ruleSingleContainmentReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX15SingleContainmentReferenceParserRuleCall_17_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleContainmentReference_in_ruleModel590);
                    lv_x15_17_0=ruleSingleContainmentReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x15",
                            		lv_x15_17_0, 
                            		"SingleContainmentReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 19 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:423:6: ( (lv_x19_18_0= ruleDependentAlternative1 ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:423:6: ( (lv_x19_18_0= ruleDependentAlternative1 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:424:1: (lv_x19_18_0= ruleDependentAlternative1 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:424:1: (lv_x19_18_0= ruleDependentAlternative1 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:425:3: lv_x19_18_0= ruleDependentAlternative1
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX19DependentAlternative1ParserRuleCall_18_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependentAlternative1_in_ruleModel617);
                    lv_x19_18_0=ruleDependentAlternative1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x19",
                            		lv_x19_18_0, 
                            		"DependentAlternative1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 20 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:442:6: ( (lv_x20_19_0= ruleDependentAlternative2 ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:442:6: ( (lv_x20_19_0= ruleDependentAlternative2 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:443:1: (lv_x20_19_0= ruleDependentAlternative2 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:443:1: (lv_x20_19_0= ruleDependentAlternative2 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:444:3: lv_x20_19_0= ruleDependentAlternative2
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX20DependentAlternative2ParserRuleCall_19_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDependentAlternative2_in_ruleModel644);
                    lv_x20_19_0=ruleDependentAlternative2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x20",
                            		lv_x20_19_0, 
                            		"DependentAlternative2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 21 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:461:6: ( (lv_x21_20_0= ruleOptional ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:461:6: ( (lv_x21_20_0= ruleOptional ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:462:1: (lv_x21_20_0= ruleOptional )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:462:1: (lv_x21_20_0= ruleOptional )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:463:3: lv_x21_20_0= ruleOptional
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX21OptionalParserRuleCall_20_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOptional_in_ruleModel671);
                    lv_x21_20_0=ruleOptional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x21",
                            		lv_x21_20_0, 
                            		"Optional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 22 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:480:6: ( (lv_x22_21_0= ruleFloat ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:480:6: ( (lv_x22_21_0= ruleFloat ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:481:1: (lv_x22_21_0= ruleFloat )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:481:1: (lv_x22_21_0= ruleFloat )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:482:3: lv_x22_21_0= ruleFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX22FloatParserRuleCall_21_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFloat_in_ruleModel698);
                    lv_x22_21_0=ruleFloat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x22",
                            		lv_x22_21_0, 
                            		"Float");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 23 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:499:6: ( (lv_x23_22_0= ruleUnorderedAlternative ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:499:6: ( (lv_x23_22_0= ruleUnorderedAlternative ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:500:1: (lv_x23_22_0= ruleUnorderedAlternative )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:500:1: (lv_x23_22_0= ruleUnorderedAlternative )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:501:3: lv_x23_22_0= ruleUnorderedAlternative
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX23UnorderedAlternativeParserRuleCall_22_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnorderedAlternative_in_ruleModel725);
                    lv_x23_22_0=ruleUnorderedAlternative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x23",
                            		lv_x23_22_0, 
                            		"UnorderedAlternative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 24 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:518:6: ( (lv_x24_23_0= ruleUnorderedGroup ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:518:6: ( (lv_x24_23_0= ruleUnorderedGroup ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:519:1: (lv_x24_23_0= ruleUnorderedGroup )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:519:1: (lv_x24_23_0= ruleUnorderedGroup )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:520:3: lv_x24_23_0= ruleUnorderedGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX24UnorderedGroupParserRuleCall_23_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_ruleModel752);
                    lv_x24_23_0=ruleUnorderedGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x24",
                            		lv_x24_23_0, 
                            		"UnorderedGroup");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 25 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:537:6: ( (lv_x25_24_0= ruleUnorderedGroupOptional ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:537:6: ( (lv_x25_24_0= ruleUnorderedGroupOptional ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:538:1: (lv_x25_24_0= ruleUnorderedGroupOptional )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:538:1: (lv_x25_24_0= ruleUnorderedGroupOptional )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:539:3: lv_x25_24_0= ruleUnorderedGroupOptional
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getX25UnorderedGroupOptionalParserRuleCall_24_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroupOptional_in_ruleModel779);
                    lv_x25_24_0=ruleUnorderedGroupOptional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"x25",
                            		lv_x25_24_0, 
                            		"UnorderedGroupOptional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleSimpleGroup"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:563:1: entryRuleSimpleGroup returns [EObject current=null] : iv_ruleSimpleGroup= ruleSimpleGroup EOF ;
    public final EObject entryRuleSimpleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleGroup = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:564:2: (iv_ruleSimpleGroup= ruleSimpleGroup EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:565:2: iv_ruleSimpleGroup= ruleSimpleGroup EOF
            {
             newCompositeNode(grammarAccess.getSimpleGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleGroup_in_entryRuleSimpleGroup815);
            iv_ruleSimpleGroup=ruleSimpleGroup();

            state._fsp--;

             current =iv_ruleSimpleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleGroup825); 

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
    // $ANTLR end "entryRuleSimpleGroup"


    // $ANTLR start "ruleSimpleGroup"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:572:1: ruleSimpleGroup returns [EObject current=null] : (otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSimpleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token lv_val2_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:575:28: ( (otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:576:1: (otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:576:1: (otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:576:3: otherlv_0= '#1' ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSimpleGroup862); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleGroupAccess().getNumberSignDigitOneKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:580:1: ( (lv_val1_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:581:1: (lv_val1_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:581:1: (lv_val1_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:582:3: lv_val1_1_0= RULE_ID
            {
            lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleGroup879); 

            			newLeafNode(lv_val1_1_0, grammarAccess.getSimpleGroupAccess().getVal1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val1",
                    		lv_val1_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:598:2: ( (lv_val2_2_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:599:1: (lv_val2_2_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:599:1: (lv_val2_2_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:600:3: lv_val2_2_0= RULE_ID
            {
            lv_val2_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleGroup901); 

            			newLeafNode(lv_val2_2_0, grammarAccess.getSimpleGroupAccess().getVal2IDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val2",
                    		lv_val2_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleGroup"


    // $ANTLR start "entryRuleSimpleAlternative"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:624:1: entryRuleSimpleAlternative returns [EObject current=null] : iv_ruleSimpleAlternative= ruleSimpleAlternative EOF ;
    public final EObject entryRuleSimpleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAlternative = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:625:2: (iv_ruleSimpleAlternative= ruleSimpleAlternative EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:626:2: iv_ruleSimpleAlternative= ruleSimpleAlternative EOF
            {
             newCompositeNode(grammarAccess.getSimpleAlternativeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAlternative_in_entryRuleSimpleAlternative942);
            iv_ruleSimpleAlternative=ruleSimpleAlternative();

            state._fsp--;

             current =iv_ruleSimpleAlternative; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAlternative952); 

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
    // $ANTLR end "entryRuleSimpleAlternative"


    // $ANTLR start "ruleSimpleAlternative"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:633:1: ruleSimpleAlternative returns [EObject current=null] : (otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) ) ) ;
    public final EObject ruleSimpleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_val1_2_0=null;
        Token otherlv_3=null;
        Token lv_val2_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:636:28: ( (otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:637:1: (otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:637:1: (otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:637:3: otherlv_0= '#2' ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSimpleAlternative989); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleAlternativeAccess().getNumberSignDigitTwoKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:641:1: ( (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:641:2: (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:641:2: (otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:641:4: otherlv_1= 'kw1' ( (lv_val1_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSimpleAlternative1003); 

                        	newLeafNode(otherlv_1, grammarAccess.getSimpleAlternativeAccess().getKw1Keyword_1_0_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:645:1: ( (lv_val1_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:646:1: (lv_val1_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:646:1: (lv_val1_2_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:647:3: lv_val1_2_0= RULE_ID
                    {
                    lv_val1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleAlternative1020); 

                    			newLeafNode(lv_val1_2_0, grammarAccess.getSimpleAlternativeAccess().getVal1IDTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleAlternativeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val1",
                            		lv_val1_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:664:6: (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:664:6: (otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:664:8: otherlv_3= 'kw2' ( (lv_val2_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleAlternative1045); 

                        	newLeafNode(otherlv_3, grammarAccess.getSimpleAlternativeAccess().getKw2Keyword_1_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:668:1: ( (lv_val2_4_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:669:1: (lv_val2_4_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:669:1: (lv_val2_4_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:670:3: lv_val2_4_0= RULE_ID
                    {
                    lv_val2_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleAlternative1062); 

                    			newLeafNode(lv_val2_4_0, grammarAccess.getSimpleAlternativeAccess().getVal2IDTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleAlternativeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val2",
                            		lv_val2_4_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleAlternative"


    // $ANTLR start "entryRuleSimpleMultiplicities"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:694:1: entryRuleSimpleMultiplicities returns [EObject current=null] : iv_ruleSimpleMultiplicities= ruleSimpleMultiplicities EOF ;
    public final EObject entryRuleSimpleMultiplicities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleMultiplicities = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:695:2: (iv_ruleSimpleMultiplicities= ruleSimpleMultiplicities EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:696:2: iv_ruleSimpleMultiplicities= ruleSimpleMultiplicities EOF
            {
             newCompositeNode(grammarAccess.getSimpleMultiplicitiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleMultiplicities_in_entryRuleSimpleMultiplicities1105);
            iv_ruleSimpleMultiplicities=ruleSimpleMultiplicities();

            state._fsp--;

             current =iv_ruleSimpleMultiplicities; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleMultiplicities1115); 

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
    // $ANTLR end "entryRuleSimpleMultiplicities"


    // $ANTLR start "ruleSimpleMultiplicities"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:703:1: ruleSimpleMultiplicities returns [EObject current=null] : (otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )* ) ;
    public final EObject ruleSimpleMultiplicities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token otherlv_2=null;
        Token lv_val2_3_0=null;
        Token otherlv_4=null;
        Token lv_val3_5_0=null;
        Token otherlv_6=null;
        Token lv_val4_7_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:706:28: ( (otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:707:1: (otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:707:1: (otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:707:3: otherlv_0= '#3' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( (lv_val2_3_0= RULE_ID ) )? otherlv_4= 'kw2' ( (lv_val3_5_0= RULE_ID ) )+ otherlv_6= 'kw3' ( (lv_val4_7_0= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSimpleMultiplicities1152); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleMultiplicitiesAccess().getNumberSignDigitThreeKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:711:1: ( (lv_val1_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:712:1: (lv_val1_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:712:1: (lv_val1_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:713:3: lv_val1_1_0= RULE_ID
            {
            lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleMultiplicities1169); 

            			newLeafNode(lv_val1_1_0, grammarAccess.getSimpleMultiplicitiesAccess().getVal1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleMultiplicitiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val1",
                    		lv_val1_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSimpleMultiplicities1186); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleMultiplicitiesAccess().getKw1Keyword_2());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:733:1: ( (lv_val2_3_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:734:1: (lv_val2_3_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:734:1: (lv_val2_3_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:735:3: lv_val2_3_0= RULE_ID
                    {
                    lv_val2_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleMultiplicities1203); 

                    			newLeafNode(lv_val2_3_0, grammarAccess.getSimpleMultiplicitiesAccess().getVal2IDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleMultiplicitiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val2",
                            		lv_val2_3_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleMultiplicities1221); 

                	newLeafNode(otherlv_4, grammarAccess.getSimpleMultiplicitiesAccess().getKw2Keyword_4());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:755:1: ( (lv_val3_5_0= RULE_ID ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:756:1: (lv_val3_5_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:756:1: (lv_val3_5_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:757:3: lv_val3_5_0= RULE_ID
            	    {
            	    lv_val3_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleMultiplicities1238); 

            	    			newLeafNode(lv_val3_5_0, grammarAccess.getSimpleMultiplicitiesAccess().getVal3IDTerminalRuleCall_5_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSimpleMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val3",
            	            		lv_val3_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSimpleMultiplicities1256); 

                	newLeafNode(otherlv_6, grammarAccess.getSimpleMultiplicitiesAccess().getKw3Keyword_6());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:777:1: ( (lv_val4_7_0= RULE_ID ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:778:1: (lv_val4_7_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:778:1: (lv_val4_7_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:779:3: lv_val4_7_0= RULE_ID
            	    {
            	    lv_val4_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleMultiplicities1273); 

            	    			newLeafNode(lv_val4_7_0, grammarAccess.getSimpleMultiplicitiesAccess().getVal4IDTerminalRuleCall_7_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSimpleMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val4",
            	            		lv_val4_7_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleMultiplicities"


    // $ANTLR start "entryRuleGroupMultiplicities"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:803:1: entryRuleGroupMultiplicities returns [EObject current=null] : iv_ruleGroupMultiplicities= ruleGroupMultiplicities EOF ;
    public final EObject entryRuleGroupMultiplicities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupMultiplicities = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:804:2: (iv_ruleGroupMultiplicities= ruleGroupMultiplicities EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:805:2: iv_ruleGroupMultiplicities= ruleGroupMultiplicities EOF
            {
             newCompositeNode(grammarAccess.getGroupMultiplicitiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupMultiplicities_in_entryRuleGroupMultiplicities1315);
            iv_ruleGroupMultiplicities=ruleGroupMultiplicities();

            state._fsp--;

             current =iv_ruleGroupMultiplicities; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupMultiplicities1325); 

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
    // $ANTLR end "entryRuleGroupMultiplicities"


    // $ANTLR start "ruleGroupMultiplicities"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:812:1: ruleGroupMultiplicities returns [EObject current=null] : (otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )* ) ;
    public final EObject ruleGroupMultiplicities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token otherlv_2=null;
        Token lv_val2_3_0=null;
        Token lv_val3_4_0=null;
        Token otherlv_5=null;
        Token lv_val4_6_0=null;
        Token lv_val5_7_0=null;
        Token otherlv_8=null;
        Token lv_val6_9_0=null;
        Token lv_val7_10_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:815:28: ( (otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:816:1: (otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:816:1: (otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:816:3: otherlv_0= '#4' ( (lv_val1_1_0= RULE_ID ) ) otherlv_2= 'kw1' ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )? otherlv_5= 'kw2' ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+ otherlv_8= 'kw3' ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGroupMultiplicities1362); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupMultiplicitiesAccess().getNumberSignDigitFourKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:820:1: ( (lv_val1_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:821:1: (lv_val1_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:821:1: (lv_val1_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:822:3: lv_val1_1_0= RULE_ID
            {
            lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGroupMultiplicities1379); 

            			newLeafNode(lv_val1_1_0, grammarAccess.getGroupMultiplicitiesAccess().getVal1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val1",
                    		lv_val1_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroupMultiplicities1396); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupMultiplicitiesAccess().getKw1Keyword_2());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:842:1: ( ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:842:2: ( (lv_val2_3_0= RULE_ID ) ) ( (lv_val3_4_0= RULE_ID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:842:2: ( (lv_val2_3_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:843:1: (lv_val2_3_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:843:1: (lv_val2_3_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:844:3: lv_val2_3_0= RULE_ID
                    {
                    lv_val2_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGroupMultiplicities1414); 

                    			newLeafNode(lv_val2_3_0, grammarAccess.getGroupMultiplicitiesAccess().getVal2IDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val2",
                            		lv_val2_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:860:2: ( (lv_val3_4_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:861:1: (lv_val3_4_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:861:1: (lv_val3_4_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:862:3: lv_val3_4_0= RULE_ID
                    {
                    lv_val3_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGroupMultiplicities1436); 

                    			newLeafNode(lv_val3_4_0, grammarAccess.getGroupMultiplicitiesAccess().getVal3IDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val3",
                            		lv_val3_4_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroupMultiplicities1455); 

                	newLeafNode(otherlv_5, grammarAccess.getGroupMultiplicitiesAccess().getKw2Keyword_4());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:882:1: ( ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:882:2: ( (lv_val4_6_0= RULE_ID ) ) ( (lv_val5_7_0= RULE_ID ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:882:2: ( (lv_val4_6_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:883:1: (lv_val4_6_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:883:1: (lv_val4_6_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:884:3: lv_val4_6_0= RULE_ID
            	    {
            	    lv_val4_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGroupMultiplicities1473); 

            	    			newLeafNode(lv_val4_6_0, grammarAccess.getGroupMultiplicitiesAccess().getVal4IDTerminalRuleCall_5_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val4",
            	            		lv_val4_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:900:2: ( (lv_val5_7_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:901:1: (lv_val5_7_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:901:1: (lv_val5_7_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:902:3: lv_val5_7_0= RULE_ID
            	    {
            	    lv_val5_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGroupMultiplicities1495); 

            	    			newLeafNode(lv_val5_7_0, grammarAccess.getGroupMultiplicitiesAccess().getVal5IDTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val5",
            	            		lv_val5_7_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGroupMultiplicities1514); 

                	newLeafNode(otherlv_8, grammarAccess.getGroupMultiplicitiesAccess().getKw3Keyword_6());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:922:1: ( ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:922:2: ( (lv_val6_9_0= RULE_ID ) ) ( (lv_val7_10_0= RULE_ID ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:922:2: ( (lv_val6_9_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:923:1: (lv_val6_9_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:923:1: (lv_val6_9_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:924:3: lv_val6_9_0= RULE_ID
            	    {
            	    lv_val6_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGroupMultiplicities1532); 

            	    			newLeafNode(lv_val6_9_0, grammarAccess.getGroupMultiplicitiesAccess().getVal6IDTerminalRuleCall_7_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val6",
            	            		lv_val6_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:940:2: ( (lv_val7_10_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:941:1: (lv_val7_10_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:941:1: (lv_val7_10_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:942:3: lv_val7_10_0= RULE_ID
            	    {
            	    lv_val7_10_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGroupMultiplicities1554); 

            	    			newLeafNode(lv_val7_10_0, grammarAccess.getGroupMultiplicitiesAccess().getVal7IDTerminalRuleCall_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val7",
            	            		lv_val7_10_0, 
            	            		"ID");
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupMultiplicities"


    // $ANTLR start "entryRuleAlternativeMultiplicities"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:966:1: entryRuleAlternativeMultiplicities returns [EObject current=null] : iv_ruleAlternativeMultiplicities= ruleAlternativeMultiplicities EOF ;
    public final EObject entryRuleAlternativeMultiplicities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeMultiplicities = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:967:2: (iv_ruleAlternativeMultiplicities= ruleAlternativeMultiplicities EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:968:2: iv_ruleAlternativeMultiplicities= ruleAlternativeMultiplicities EOF
            {
             newCompositeNode(grammarAccess.getAlternativeMultiplicitiesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternativeMultiplicities_in_entryRuleAlternativeMultiplicities1597);
            iv_ruleAlternativeMultiplicities=ruleAlternativeMultiplicities();

            state._fsp--;

             current =iv_ruleAlternativeMultiplicities; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternativeMultiplicities1607); 

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
    // $ANTLR end "entryRuleAlternativeMultiplicities"


    // $ANTLR start "ruleAlternativeMultiplicities"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:975:1: ruleAlternativeMultiplicities returns [EObject current=null] : (otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )* ) ;
    public final EObject ruleAlternativeMultiplicities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val2_1_0=null;
        Token otherlv_2=null;
        Token lv_val3_3_0=null;
        Token otherlv_4=null;
        Token lv_val4_5_0=null;
        Token otherlv_6=null;
        Token lv_val5_7_0=null;
        Token otherlv_8=null;
        Token lv_val6_9_0=null;
        Token otherlv_10=null;
        Token lv_val7_11_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:978:28: ( (otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:979:1: (otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:979:1: (otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:979:3: otherlv_0= '#5' ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )? otherlv_4= 'kw2' ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+ otherlv_8= 'kw4' ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )*
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAlternativeMultiplicities1644); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativeMultiplicitiesAccess().getNumberSignDigitFiveKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:983:1: ( ( (lv_val2_1_0= RULE_ID ) ) | (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:983:2: ( (lv_val2_1_0= RULE_ID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:983:2: ( (lv_val2_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:984:1: (lv_val2_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:984:1: (lv_val2_1_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:985:3: lv_val2_1_0= RULE_ID
                    {
                    lv_val2_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1662); 

                    			newLeafNode(lv_val2_1_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal2IDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val2",
                            		lv_val2_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1002:6: (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1002:6: (otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1002:8: otherlv_2= 'kw1' ( (lv_val3_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAlternativeMultiplicities1686); 

                        	newLeafNode(otherlv_2, grammarAccess.getAlternativeMultiplicitiesAccess().getKw1Keyword_1_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1006:1: ( (lv_val3_3_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1007:1: (lv_val3_3_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1007:1: (lv_val3_3_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1008:3: lv_val3_3_0= RULE_ID
                    {
                    lv_val3_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1703); 

                    			newLeafNode(lv_val3_3_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal3IDTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val3",
                            		lv_val3_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAlternativeMultiplicities1723); 

                	newLeafNode(otherlv_4, grammarAccess.getAlternativeMultiplicitiesAccess().getKw2Keyword_2());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1028:1: ( ( (lv_val4_5_0= RULE_ID ) ) | (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }
                else if ( (LA10_0==19) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1028:2: ( (lv_val4_5_0= RULE_ID ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1028:2: ( (lv_val4_5_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1029:1: (lv_val4_5_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1029:1: (lv_val4_5_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1030:3: lv_val4_5_0= RULE_ID
            	    {
            	    lv_val4_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1741); 

            	    			newLeafNode(lv_val4_5_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal4IDTerminalRuleCall_3_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val4",
            	            		lv_val4_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1047:6: (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1047:6: (otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1047:8: otherlv_6= 'kw3' ( (lv_val5_7_0= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAlternativeMultiplicities1765); 

            	        	newLeafNode(otherlv_6, grammarAccess.getAlternativeMultiplicitiesAccess().getKw3Keyword_3_1_0());
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1051:1: ( (lv_val5_7_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1052:1: (lv_val5_7_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1052:1: (lv_val5_7_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1053:3: lv_val5_7_0= RULE_ID
            	    {
            	    lv_val5_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1782); 

            	    			newLeafNode(lv_val5_7_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal5IDTerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val5",
            	            		lv_val5_7_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAlternativeMultiplicities1802); 

                	newLeafNode(otherlv_8, grammarAccess.getAlternativeMultiplicitiesAccess().getKw4Keyword_4());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1073:1: ( ( (lv_val6_9_0= RULE_ID ) ) | (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }
                else if ( (LA11_0==23) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1073:2: ( (lv_val6_9_0= RULE_ID ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1073:2: ( (lv_val6_9_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1074:1: (lv_val6_9_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1074:1: (lv_val6_9_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1075:3: lv_val6_9_0= RULE_ID
            	    {
            	    lv_val6_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1820); 

            	    			newLeafNode(lv_val6_9_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal6IDTerminalRuleCall_5_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val6",
            	            		lv_val6_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1092:6: (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1092:6: (otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1092:8: otherlv_10= 'kw5' ( (lv_val7_11_0= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAlternativeMultiplicities1844); 

            	        	newLeafNode(otherlv_10, grammarAccess.getAlternativeMultiplicitiesAccess().getKw5Keyword_5_1_0());
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1096:1: ( (lv_val7_11_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1097:1: (lv_val7_11_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1097:1: (lv_val7_11_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1098:3: lv_val7_11_0= RULE_ID
            	    {
            	    lv_val7_11_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1861); 

            	    			newLeafNode(lv_val7_11_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal7IDTerminalRuleCall_5_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val7",
            	            		lv_val7_11_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternativeMultiplicities"


    // $ANTLR start "entryRuleList1"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1122:1: entryRuleList1 returns [EObject current=null] : iv_ruleList1= ruleList1 EOF ;
    public final EObject entryRuleList1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList1 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1123:2: (iv_ruleList1= ruleList1 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1124:2: iv_ruleList1= ruleList1 EOF
            {
             newCompositeNode(grammarAccess.getList1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleList1_in_entryRuleList11905);
            iv_ruleList1=ruleList1();

            state._fsp--;

             current =iv_ruleList1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList11915); 

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
    // $ANTLR end "entryRuleList1"


    // $ANTLR start "ruleList1"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1131:1: ruleList1 returns [EObject current=null] : (otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleList1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token otherlv_2=null;
        Token lv_val1_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1134:28: ( (otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1135:1: (otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1135:1: (otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1135:3: otherlv_0= '#6' ( (lv_val1_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleList11952); 

                	newLeafNode(otherlv_0, grammarAccess.getList1Access().getNumberSignDigitSixKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1139:1: ( (lv_val1_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1140:1: (lv_val1_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1140:1: (lv_val1_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1141:3: lv_val1_1_0= RULE_ID
            {
            lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList11969); 

            			newLeafNode(lv_val1_1_0, grammarAccess.getList1Access().getVal1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getList1Rule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"val1",
                    		lv_val1_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1157:2: (otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1157:4: otherlv_2= ',' ( (lv_val1_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleList11987); 

            	        	newLeafNode(otherlv_2, grammarAccess.getList1Access().getCommaKeyword_2_0());
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1161:1: ( (lv_val1_3_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1162:1: (lv_val1_3_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1162:1: (lv_val1_3_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1163:3: lv_val1_3_0= RULE_ID
            	    {
            	    lv_val1_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList12004); 

            	    			newLeafNode(lv_val1_3_0, grammarAccess.getList1Access().getVal1IDTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getList1Rule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val1",
            	            		lv_val1_3_0, 
            	            		"ID");
            	    	    

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList1"


    // $ANTLR start "entryRuleList2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1187:1: entryRuleList2 returns [EObject current=null] : iv_ruleList2= ruleList2 EOF ;
    public final EObject entryRuleList2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1188:2: (iv_ruleList2= ruleList2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1189:2: iv_ruleList2= ruleList2 EOF
            {
             newCompositeNode(grammarAccess.getList2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleList2_in_entryRuleList22047);
            iv_ruleList2=ruleList2();

            state._fsp--;

             current =iv_ruleList2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList22057); 

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
    // $ANTLR end "entryRuleList2"


    // $ANTLR start "ruleList2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1196:1: ruleList2 returns [EObject current=null] : (otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )? ) ;
    public final EObject ruleList2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val1_2_0=null;
        Token otherlv_3=null;
        Token lv_val1_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1199:28: ( (otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1200:1: (otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1200:1: (otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1200:3: otherlv_0= '#7' () ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleList22094); 

                	newLeafNode(otherlv_0, grammarAccess.getList2Access().getNumberSignDigitSevenKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1204:1: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1205:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getList2Access().getList2Action_1(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1210:2: ( ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1210:3: ( (lv_val1_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )*
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1210:3: ( (lv_val1_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1211:1: (lv_val1_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1211:1: (lv_val1_2_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1212:3: lv_val1_2_0= RULE_ID
                    {
                    lv_val1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList22121); 

                    			newLeafNode(lv_val1_2_0, grammarAccess.getList2Access().getVal1IDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getList2Rule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val1",
                            		lv_val1_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1228:2: (otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1228:4: otherlv_3= ',' ( (lv_val1_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleList22139); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getList2Access().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1232:1: ( (lv_val1_4_0= RULE_ID ) )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1233:1: (lv_val1_4_0= RULE_ID )
                    	    {
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1233:1: (lv_val1_4_0= RULE_ID )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1234:3: lv_val1_4_0= RULE_ID
                    	    {
                    	    lv_val1_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList22156); 

                    	    			newLeafNode(lv_val1_4_0, grammarAccess.getList2Access().getVal1IDTerminalRuleCall_2_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getList2Rule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"val1",
                    	            		lv_val1_4_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList2"


    // $ANTLR start "entryRuleAltList1"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1258:1: entryRuleAltList1 returns [EObject current=null] : iv_ruleAltList1= ruleAltList1 EOF ;
    public final EObject entryRuleAltList1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltList1 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1259:2: (iv_ruleAltList1= ruleAltList1 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1260:2: iv_ruleAltList1= ruleAltList1 EOF
            {
             newCompositeNode(grammarAccess.getAltList1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAltList1_in_entryRuleAltList12201);
            iv_ruleAltList1=ruleAltList1();

            state._fsp--;

             current =iv_ruleAltList1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAltList12211); 

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
    // $ANTLR end "entryRuleAltList1"


    // $ANTLR start "ruleAltList1"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1267:1: ruleAltList1 returns [EObject current=null] : (otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) ) ) ;
    public final EObject ruleAltList1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token lv_val2_2_0=null;
        Token otherlv_3=null;
        Token lv_val1_4_0=null;
        Token lv_val3_5_0=null;
        Token otherlv_6=null;
        Token lv_val1_7_0=null;
        Token lv_val4_8_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1270:28: ( (otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1271:1: (otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1271:1: (otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1271:3: otherlv_0= '#8' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAltList12248); 

                	newLeafNode(otherlv_0, grammarAccess.getAltList1Access().getNumberSignDigitEightKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1275:1: ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) ) | (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case 16:
                {
                alt16=2;
                }
                break;
            case 17:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1275:2: ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1275:2: ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1275:3: ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1275:3: ( (lv_val1_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1276:1: (lv_val1_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1276:1: (lv_val1_1_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1277:3: lv_val1_1_0= RULE_ID
                    {
                    lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList12267); 

                    			newLeafNode(lv_val1_1_0, grammarAccess.getAltList1Access().getVal1IDTerminalRuleCall_1_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAltList1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val1",
                            		lv_val1_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1293:2: ( (lv_val2_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1294:1: (lv_val2_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1294:1: (lv_val2_2_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1295:3: lv_val2_2_0= RULE_ID
                    {
                    lv_val2_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList12289); 

                    			newLeafNode(lv_val2_2_0, grammarAccess.getAltList1Access().getVal2IDTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAltList1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val2",
                            		lv_val2_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1312:6: (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1312:6: (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1312:8: otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ( (lv_val3_5_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAltList12314); 

                        	newLeafNode(otherlv_3, grammarAccess.getAltList1Access().getKw1Keyword_1_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1316:1: ( (lv_val1_4_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1317:1: (lv_val1_4_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1317:1: (lv_val1_4_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1318:3: lv_val1_4_0= RULE_ID
                    {
                    lv_val1_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList12331); 

                    			newLeafNode(lv_val1_4_0, grammarAccess.getAltList1Access().getVal1IDTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAltList1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val1",
                            		lv_val1_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1334:2: ( (lv_val3_5_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1335:1: (lv_val3_5_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1335:1: (lv_val3_5_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1336:3: lv_val3_5_0= RULE_ID
                    {
                    lv_val3_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList12353); 

                    			newLeafNode(lv_val3_5_0, grammarAccess.getAltList1Access().getVal3IDTerminalRuleCall_1_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAltList1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val3",
                            		lv_val3_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1353:6: (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1353:6: (otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )? )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1353:8: otherlv_6= 'kw2' ( (lv_val1_7_0= RULE_ID ) ) ( (lv_val4_8_0= RULE_ID ) )?
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAltList12378); 

                        	newLeafNode(otherlv_6, grammarAccess.getAltList1Access().getKw2Keyword_1_2_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1357:1: ( (lv_val1_7_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1358:1: (lv_val1_7_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1358:1: (lv_val1_7_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1359:3: lv_val1_7_0= RULE_ID
                    {
                    lv_val1_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList12395); 

                    			newLeafNode(lv_val1_7_0, grammarAccess.getAltList1Access().getVal1IDTerminalRuleCall_1_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAltList1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val1",
                            		lv_val1_7_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1375:2: ( (lv_val4_8_0= RULE_ID ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1376:1: (lv_val4_8_0= RULE_ID )
                            {
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1376:1: (lv_val4_8_0= RULE_ID )
                            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1377:3: lv_val4_8_0= RULE_ID
                            {
                            lv_val4_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList12417); 

                            			newLeafNode(lv_val4_8_0, grammarAccess.getAltList1Access().getVal4IDTerminalRuleCall_1_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAltList1Rule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"val4",
                                    		lv_val4_8_0, 
                                    		"ID");
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAltList1"


    // $ANTLR start "entryRuleAltList2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1401:1: entryRuleAltList2 returns [EObject current=null] : iv_ruleAltList2= ruleAltList2 EOF ;
    public final EObject entryRuleAltList2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltList2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1402:2: (iv_ruleAltList2= ruleAltList2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1403:2: iv_ruleAltList2= ruleAltList2 EOF
            {
             newCompositeNode(grammarAccess.getAltList2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAltList2_in_entryRuleAltList22461);
            iv_ruleAltList2=ruleAltList2();

            state._fsp--;

             current =iv_ruleAltList2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAltList22471); 

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
    // $ANTLR end "entryRuleAltList2"


    // $ANTLR start "ruleAltList2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1410:1: ruleAltList2 returns [EObject current=null] : (otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) ) ) ;
    public final EObject ruleAltList2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val1_1_0=null;
        Token lv_val2_2_0=null;
        Token otherlv_3=null;
        Token lv_val1_4_0=null;
        Token otherlv_5=null;
        Token lv_val1_6_0=null;
        Token lv_val3_7_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1413:28: ( (otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1414:1: (otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1414:1: (otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1414:3: otherlv_0= '#9' ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAltList22508); 

                	newLeafNode(otherlv_0, grammarAccess.getAltList2Access().getNumberSignDigitNineKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1418:1: ( ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) ) | (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==29) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1418:2: ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1418:2: ( ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1418:3: ( (lv_val1_1_0= RULE_ID ) ) ( (lv_val2_2_0= RULE_ID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1418:3: ( (lv_val1_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1419:1: (lv_val1_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1419:1: (lv_val1_1_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1420:3: lv_val1_1_0= RULE_ID
                    {
                    lv_val1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList22527); 

                    			newLeafNode(lv_val1_1_0, grammarAccess.getAltList2Access().getVal1IDTerminalRuleCall_1_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAltList2Rule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val1",
                            		lv_val1_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1436:2: ( (lv_val2_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1437:1: (lv_val2_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1437:1: (lv_val2_2_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1438:3: lv_val2_2_0= RULE_ID
                    {
                    lv_val2_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList22549); 

                    			newLeafNode(lv_val2_2_0, grammarAccess.getAltList2Access().getVal2IDTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAltList2Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val2",
                            		lv_val2_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1455:6: (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1455:6: (otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1455:8: otherlv_3= 'kw' ( (lv_val1_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )* ( (lv_val3_7_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAltList22574); 

                        	newLeafNode(otherlv_3, grammarAccess.getAltList2Access().getKwKeyword_1_1_0());
                        
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1459:1: ( (lv_val1_4_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1460:1: (lv_val1_4_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1460:1: (lv_val1_4_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1461:3: lv_val1_4_0= RULE_ID
                    {
                    lv_val1_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList22591); 

                    			newLeafNode(lv_val1_4_0, grammarAccess.getAltList2Access().getVal1IDTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAltList2Rule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val1",
                            		lv_val1_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1477:2: (otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1477:4: otherlv_5= ',' ( (lv_val1_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAltList22609); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAltList2Access().getCommaKeyword_1_1_2_0());
                    	        
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1481:1: ( (lv_val1_6_0= RULE_ID ) )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1482:1: (lv_val1_6_0= RULE_ID )
                    	    {
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1482:1: (lv_val1_6_0= RULE_ID )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1483:3: lv_val1_6_0= RULE_ID
                    	    {
                    	    lv_val1_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList22626); 

                    	    			newLeafNode(lv_val1_6_0, grammarAccess.getAltList2Access().getVal1IDTerminalRuleCall_1_1_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAltList2Rule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"val1",
                    	            		lv_val1_6_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1499:4: ( (lv_val3_7_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1500:1: (lv_val3_7_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1500:1: (lv_val3_7_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1501:3: lv_val3_7_0= RULE_ID
                    {
                    lv_val3_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAltList22650); 

                    			newLeafNode(lv_val3_7_0, grammarAccess.getAltList2Access().getVal3IDTerminalRuleCall_1_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAltList2Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val3",
                            		lv_val3_7_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAltList2"


    // $ANTLR start "entryRuleSingleKeywords"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1525:1: entryRuleSingleKeywords returns [EObject current=null] : iv_ruleSingleKeywords= ruleSingleKeywords EOF ;
    public final EObject entryRuleSingleKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleKeywords = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1526:2: (iv_ruleSingleKeywords= ruleSingleKeywords EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1527:2: iv_ruleSingleKeywords= ruleSingleKeywords EOF
            {
             newCompositeNode(grammarAccess.getSingleKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleKeywords_in_entryRuleSingleKeywords2693);
            iv_ruleSingleKeywords=ruleSingleKeywords();

            state._fsp--;

             current =iv_ruleSingleKeywords; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleKeywords2703); 

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
    // $ANTLR end "entryRuleSingleKeywords"


    // $ANTLR start "ruleSingleKeywords"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1534:1: ruleSingleKeywords returns [EObject current=null] : (otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) ) ;
    public final EObject ruleSingleKeywords() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;
        Token lv_val_1_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1537:28: ( (otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1538:1: (otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1538:1: (otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1538:3: otherlv_0= '#10' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSingleKeywords2740); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleKeywordsAccess().getNumberSignDigitOneDigitZeroKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1542:1: ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1543:1: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1543:1: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1544:1: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1544:1: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt19=1;
                }
                break;
            case 17:
                {
                alt19=2;
                }
                break;
            case 19:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1545:3: lv_val_1_1= 'kw1'
                    {
                    lv_val_1_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingleKeywords2760); 

                            newLeafNode(lv_val_1_1, grammarAccess.getSingleKeywordsAccess().getValKw1Keyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleKeywordsRule());
                    	        }
                           		setWithLastConsumed(current, "val", lv_val_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1557:8: lv_val_1_2= 'kw2'
                    {
                    lv_val_1_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingleKeywords2789); 

                            newLeafNode(lv_val_1_2, grammarAccess.getSingleKeywordsAccess().getValKw2Keyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleKeywordsRule());
                    	        }
                           		setWithLastConsumed(current, "val", lv_val_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1569:8: lv_val_1_3= 'kw3'
                    {
                    lv_val_1_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSingleKeywords2818); 

                            newLeafNode(lv_val_1_3, grammarAccess.getSingleKeywordsAccess().getValKw3Keyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleKeywordsRule());
                    	        }
                           		setWithLastConsumed(current, "val", lv_val_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleKeywords"


    // $ANTLR start "entryRuleSingleKeywordsOrID"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1592:1: entryRuleSingleKeywordsOrID returns [EObject current=null] : iv_ruleSingleKeywordsOrID= ruleSingleKeywordsOrID EOF ;
    public final EObject entryRuleSingleKeywordsOrID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleKeywordsOrID = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1593:2: (iv_ruleSingleKeywordsOrID= ruleSingleKeywordsOrID EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1594:2: iv_ruleSingleKeywordsOrID= ruleSingleKeywordsOrID EOF
            {
             newCompositeNode(grammarAccess.getSingleKeywordsOrIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleKeywordsOrID_in_entryRuleSingleKeywordsOrID2870);
            iv_ruleSingleKeywordsOrID=ruleSingleKeywordsOrID();

            state._fsp--;

             current =iv_ruleSingleKeywordsOrID; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleKeywordsOrID2880); 

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
    // $ANTLR end "entryRuleSingleKeywordsOrID"


    // $ANTLR start "ruleSingleKeywordsOrID"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1601:1: ruleSingleKeywordsOrID returns [EObject current=null] : (otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) ) ;
    public final EObject ruleSingleKeywordsOrID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;
        Token lv_val_1_3=null;
        Token lv_val_1_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1604:28: ( (otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1605:1: (otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1605:1: (otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1605:3: otherlv_0= '#11' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSingleKeywordsOrID2917); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleKeywordsOrIDAccess().getNumberSignDigitOneDigitOneKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1609:1: ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1610:1: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1610:1: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1611:1: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1611:1: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt20=1;
                }
                break;
            case 17:
                {
                alt20=2;
                }
                break;
            case 19:
                {
                alt20=3;
                }
                break;
            case RULE_ID:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1612:3: lv_val_1_1= 'kw1'
                    {
                    lv_val_1_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingleKeywordsOrID2937); 

                            newLeafNode(lv_val_1_1, grammarAccess.getSingleKeywordsOrIDAccess().getValKw1Keyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleKeywordsOrIDRule());
                    	        }
                           		setWithLastConsumed(current, "val", lv_val_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1624:8: lv_val_1_2= 'kw2'
                    {
                    lv_val_1_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingleKeywordsOrID2966); 

                            newLeafNode(lv_val_1_2, grammarAccess.getSingleKeywordsOrIDAccess().getValKw2Keyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleKeywordsOrIDRule());
                    	        }
                           		setWithLastConsumed(current, "val", lv_val_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1636:8: lv_val_1_3= 'kw3'
                    {
                    lv_val_1_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSingleKeywordsOrID2995); 

                            newLeafNode(lv_val_1_3, grammarAccess.getSingleKeywordsOrIDAccess().getValKw3Keyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleKeywordsOrIDRule());
                    	        }
                           		setWithLastConsumed(current, "val", lv_val_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1648:8: lv_val_1_4= RULE_ID
                    {
                    lv_val_1_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleKeywordsOrID3023); 

                    			newLeafNode(lv_val_1_4, grammarAccess.getSingleKeywordsOrIDAccess().getValIDTerminalRuleCall_1_0_3()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleKeywordsOrIDRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_1_4, 
                            		"ID");
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleKeywordsOrID"


    // $ANTLR start "entryRuleSingleTerminals"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1674:1: entryRuleSingleTerminals returns [EObject current=null] : iv_ruleSingleTerminals= ruleSingleTerminals EOF ;
    public final EObject entryRuleSingleTerminals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleTerminals = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1675:2: (iv_ruleSingleTerminals= ruleSingleTerminals EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1676:2: iv_ruleSingleTerminals= ruleSingleTerminals EOF
            {
             newCompositeNode(grammarAccess.getSingleTerminalsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleTerminals_in_entryRuleSingleTerminals3067);
            iv_ruleSingleTerminals=ruleSingleTerminals();

            state._fsp--;

             current =iv_ruleSingleTerminals; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleTerminals3077); 

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
    // $ANTLR end "entryRuleSingleTerminals"


    // $ANTLR start "ruleSingleTerminals"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1683:1: ruleSingleTerminals returns [EObject current=null] : (otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) ) ;
    public final EObject ruleSingleTerminals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1686:28: ( (otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1687:1: (otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1687:1: (otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1687:3: otherlv_0= '#12' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSingleTerminals3114); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleTerminalsAccess().getNumberSignDigitOneDigitTwoKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1691:1: ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1692:1: ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1692:1: ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1693:1: (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1693:1: (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID1) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID2) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1694:3: lv_val_1_1= RULE_ID1
                    {
                    lv_val_1_1=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_RULE_ID1_in_ruleSingleTerminals3133); 

                    			newLeafNode(lv_val_1_1, grammarAccess.getSingleTerminalsAccess().getValID1TerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleTerminalsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_1_1, 
                            		"ID1");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1709:8: lv_val_1_2= RULE_ID2
                    {
                    lv_val_1_2=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_RULE_ID2_in_ruleSingleTerminals3153); 

                    			newLeafNode(lv_val_1_2, grammarAccess.getSingleTerminalsAccess().getValID2TerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleTerminalsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_1_2, 
                            		"ID2");
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleTerminals"


    // $ANTLR start "entryRuleSingleEnum"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1735:1: entryRuleSingleEnum returns [EObject current=null] : iv_ruleSingleEnum= ruleSingleEnum EOF ;
    public final EObject entryRuleSingleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleEnum = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1736:2: (iv_ruleSingleEnum= ruleSingleEnum EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1737:2: iv_ruleSingleEnum= ruleSingleEnum EOF
            {
             newCompositeNode(grammarAccess.getSingleEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleEnum_in_entryRuleSingleEnum3197);
            iv_ruleSingleEnum=ruleSingleEnum();

            state._fsp--;

             current =iv_ruleSingleEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleEnum3207); 

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
    // $ANTLR end "entryRuleSingleEnum"


    // $ANTLR start "ruleSingleEnum"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1744:1: ruleSingleEnum returns [EObject current=null] : (otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) ) ) ;
    public final EObject ruleSingleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_val_1_1 = null;

        Enumerator lv_val_1_2 = null;

        Enumerator lv_val_1_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1747:28: ( (otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1748:1: (otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1748:1: (otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1748:3: otherlv_0= '#13' ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSingleEnum3244); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleEnumAccess().getNumberSignDigitOneDigitThreeKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1752:1: ( ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1753:1: ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1753:1: ( (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1754:1: (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1754:1: (lv_val_1_1= ruleDefEnum1 | lv_val_1_2= ruleDefEnum2 | lv_val_1_3= ruleDefEnum3 )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt22=1;
                }
                break;
            case 17:
                {
                alt22=2;
                }
                break;
            case 19:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1755:3: lv_val_1_1= ruleDefEnum1
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleEnumAccess().getValDefEnum1EnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDefEnum1_in_ruleSingleEnum3267);
                    lv_val_1_1=ruleDefEnum1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_1, 
                            		"DefEnum1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1770:8: lv_val_1_2= ruleDefEnum2
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleEnumAccess().getValDefEnum2EnumRuleCall_1_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDefEnum2_in_ruleSingleEnum3286);
                    lv_val_1_2=ruleDefEnum2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_2, 
                            		"DefEnum2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1785:8: lv_val_1_3= ruleDefEnum3
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleEnumAccess().getValDefEnum3EnumRuleCall_1_0_2()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDefEnum3_in_ruleSingleEnum3305);
                    lv_val_1_3=ruleDefEnum3();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleEnumRule());
                    	        }
                           		set(
                           			current, 
                           			"val",
                            		lv_val_1_3, 
                            		"DefEnum3");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleEnum"


    // $ANTLR start "entryRuleSingleCrossReference"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1811:1: entryRuleSingleCrossReference returns [EObject current=null] : iv_ruleSingleCrossReference= ruleSingleCrossReference EOF ;
    public final EObject entryRuleSingleCrossReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleCrossReference = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1812:2: (iv_ruleSingleCrossReference= ruleSingleCrossReference EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1813:2: iv_ruleSingleCrossReference= ruleSingleCrossReference EOF
            {
             newCompositeNode(grammarAccess.getSingleCrossReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleCrossReference_in_entryRuleSingleCrossReference3344);
            iv_ruleSingleCrossReference=ruleSingleCrossReference();

            state._fsp--;

             current =iv_ruleSingleCrossReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleCrossReference3354); 

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
    // $ANTLR end "entryRuleSingleCrossReference"


    // $ANTLR start "ruleSingleCrossReference"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1820:1: ruleSingleCrossReference returns [EObject current=null] : (otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) ) ) ;
    public final EObject ruleSingleCrossReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1823:28: ( (otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1824:1: (otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1824:1: (otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1824:3: otherlv_0= '#14' ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) ) ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSingleCrossReference3391); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleCrossReferenceAccess().getNumberSignDigitOneDigitFourKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1828:1: ( ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1829:1: ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1829:1: ( (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1830:1: (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1830:1: (lv_name_1_1= RULE_ID1 | lv_name_1_2= RULE_ID2 | lv_name_1_3= RULE_ID3 )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_ID1:
                {
                alt23=1;
                }
                break;
            case RULE_ID2:
                {
                alt23=2;
                }
                break;
            case RULE_ID3:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1831:3: lv_name_1_1= RULE_ID1
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_RULE_ID1_in_ruleSingleCrossReference3410); 

                    			newLeafNode(lv_name_1_1, grammarAccess.getSingleCrossReferenceAccess().getNameID1TerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_1, 
                            		"ID1");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1846:8: lv_name_1_2= RULE_ID2
                    {
                    lv_name_1_2=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_RULE_ID2_in_ruleSingleCrossReference3430); 

                    			newLeafNode(lv_name_1_2, grammarAccess.getSingleCrossReferenceAccess().getNameID2TerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_2, 
                            		"ID2");
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1861:8: lv_name_1_3= RULE_ID3
                    {
                    lv_name_1_3=(Token)match(input,RULE_ID3,FollowSets000.FOLLOW_RULE_ID3_in_ruleSingleCrossReference3450); 

                    			newLeafNode(lv_name_1_3, grammarAccess.getSingleCrossReferenceAccess().getNameID3TerminalRuleCall_1_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_3, 
                            		"ID3");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1879:2: ( ( (otherlv_2= RULE_ID1 ) ) | ( (otherlv_3= RULE_ID2 ) ) | ( (otherlv_4= RULE_ID3 ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_ID1:
                {
                alt24=1;
                }
                break;
            case RULE_ID2:
                {
                alt24=2;
                }
                break;
            case RULE_ID3:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1879:3: ( (otherlv_2= RULE_ID1 ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1879:3: ( (otherlv_2= RULE_ID1 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1880:1: (otherlv_2= RULE_ID1 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1880:1: (otherlv_2= RULE_ID1 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1881:3: otherlv_2= RULE_ID1
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_RULE_ID1_in_ruleSingleCrossReference3479); 

                    		newLeafNode(otherlv_2, grammarAccess.getSingleCrossReferenceAccess().getRefSingleCrossReferenceCrossReference_2_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1893:6: ( (otherlv_3= RULE_ID2 ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1893:6: ( (otherlv_3= RULE_ID2 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1894:1: (otherlv_3= RULE_ID2 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1894:1: (otherlv_3= RULE_ID2 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1895:3: otherlv_3= RULE_ID2
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_RULE_ID2_in_ruleSingleCrossReference3505); 

                    		newLeafNode(otherlv_3, grammarAccess.getSingleCrossReferenceAccess().getRefSingleCrossReferenceCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1907:6: ( (otherlv_4= RULE_ID3 ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1907:6: ( (otherlv_4= RULE_ID3 ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1908:1: (otherlv_4= RULE_ID3 )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1908:1: (otherlv_4= RULE_ID3 )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1909:3: otherlv_4= RULE_ID3
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID3,FollowSets000.FOLLOW_RULE_ID3_in_ruleSingleCrossReference3531); 

                    		newLeafNode(otherlv_4, grammarAccess.getSingleCrossReferenceAccess().getRefSingleCrossReferenceCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleCrossReference"


    // $ANTLR start "entryRuleSingleContainmentReference"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1928:1: entryRuleSingleContainmentReference returns [EObject current=null] : iv_ruleSingleContainmentReference= ruleSingleContainmentReference EOF ;
    public final EObject entryRuleSingleContainmentReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleContainmentReference = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1929:2: (iv_ruleSingleContainmentReference= ruleSingleContainmentReference EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1930:2: iv_ruleSingleContainmentReference= ruleSingleContainmentReference EOF
            {
             newCompositeNode(grammarAccess.getSingleContainmentReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleContainmentReference_in_entryRuleSingleContainmentReference3568);
            iv_ruleSingleContainmentReference=ruleSingleContainmentReference();

            state._fsp--;

             current =iv_ruleSingleContainmentReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleContainmentReference3578); 

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
    // $ANTLR end "entryRuleSingleContainmentReference"


    // $ANTLR start "ruleSingleContainmentReference"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1937:1: ruleSingleContainmentReference returns [EObject current=null] : (otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) ) ) ;
    public final EObject ruleSingleContainmentReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_child_1_1 = null;

        EObject lv_child_1_2 = null;

        EObject lv_child_1_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1940:28: ( (otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1941:1: (otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1941:1: (otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1941:3: otherlv_0= '#15' ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) )
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSingleContainmentReference3615); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleContainmentReferenceAccess().getNumberSignDigitOneDigitFiveKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1945:1: ( ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1946:1: ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1946:1: ( (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1947:1: (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1947:1: (lv_child_1_1= ruleSingleContainmentReferenceChild1 | lv_child_1_2= ruleSingleContainmentReferenceChild2 | lv_child_1_3= ruleSingleContainmentReferenceChild3 )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt25=1;
                }
                break;
            case 17:
                {
                alt25=2;
                }
                break;
            case 19:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1948:3: lv_child_1_1= ruleSingleContainmentReferenceChild1
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleContainmentReferenceAccess().getChildSingleContainmentReferenceChild1ParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleContainmentReferenceChild1_in_ruleSingleContainmentReference3638);
                    lv_child_1_1=ruleSingleContainmentReferenceChild1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleContainmentReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"child",
                            		lv_child_1_1, 
                            		"SingleContainmentReferenceChild1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1963:8: lv_child_1_2= ruleSingleContainmentReferenceChild2
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleContainmentReferenceAccess().getChildSingleContainmentReferenceChild2ParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleContainmentReferenceChild2_in_ruleSingleContainmentReference3657);
                    lv_child_1_2=ruleSingleContainmentReferenceChild2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleContainmentReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"child",
                            		lv_child_1_2, 
                            		"SingleContainmentReferenceChild2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:1978:8: lv_child_1_3= ruleSingleContainmentReferenceChild3
                    {
                     
                    	        newCompositeNode(grammarAccess.getSingleContainmentReferenceAccess().getChildSingleContainmentReferenceChild3ParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSingleContainmentReferenceChild3_in_ruleSingleContainmentReference3676);
                    lv_child_1_3=ruleSingleContainmentReferenceChild3();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSingleContainmentReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"child",
                            		lv_child_1_3, 
                            		"SingleContainmentReferenceChild3");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleContainmentReference"


    // $ANTLR start "entryRuleSingleContainmentReferenceChild1"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2004:1: entryRuleSingleContainmentReferenceChild1 returns [EObject current=null] : iv_ruleSingleContainmentReferenceChild1= ruleSingleContainmentReferenceChild1 EOF ;
    public final EObject entryRuleSingleContainmentReferenceChild1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleContainmentReferenceChild1 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2005:2: (iv_ruleSingleContainmentReferenceChild1= ruleSingleContainmentReferenceChild1 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2006:2: iv_ruleSingleContainmentReferenceChild1= ruleSingleContainmentReferenceChild1 EOF
            {
             newCompositeNode(grammarAccess.getSingleContainmentReferenceChild1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleContainmentReferenceChild1_in_entryRuleSingleContainmentReferenceChild13715);
            iv_ruleSingleContainmentReferenceChild1=ruleSingleContainmentReferenceChild1();

            state._fsp--;

             current =iv_ruleSingleContainmentReferenceChild1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleContainmentReferenceChild13725); 

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
    // $ANTLR end "entryRuleSingleContainmentReferenceChild1"


    // $ANTLR start "ruleSingleContainmentReferenceChild1"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2013:1: ruleSingleContainmentReferenceChild1 returns [EObject current=null] : ( (lv_val_0_0= 'kw1' ) ) ;
    public final EObject ruleSingleContainmentReferenceChild1() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2016:28: ( ( (lv_val_0_0= 'kw1' ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2017:1: ( (lv_val_0_0= 'kw1' ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2017:1: ( (lv_val_0_0= 'kw1' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2018:1: (lv_val_0_0= 'kw1' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2018:1: (lv_val_0_0= 'kw1' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2019:3: lv_val_0_0= 'kw1'
            {
            lv_val_0_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingleContainmentReferenceChild13767); 

                    newLeafNode(lv_val_0_0, grammarAccess.getSingleContainmentReferenceChild1Access().getValKw1Keyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleContainmentReferenceChild1Rule());
            	        }
                   		setWithLastConsumed(current, "val", lv_val_0_0, "kw1");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleContainmentReferenceChild1"


    // $ANTLR start "entryRuleSingleContainmentReferenceChild2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2040:1: entryRuleSingleContainmentReferenceChild2 returns [EObject current=null] : iv_ruleSingleContainmentReferenceChild2= ruleSingleContainmentReferenceChild2 EOF ;
    public final EObject entryRuleSingleContainmentReferenceChild2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleContainmentReferenceChild2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2041:2: (iv_ruleSingleContainmentReferenceChild2= ruleSingleContainmentReferenceChild2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2042:2: iv_ruleSingleContainmentReferenceChild2= ruleSingleContainmentReferenceChild2 EOF
            {
             newCompositeNode(grammarAccess.getSingleContainmentReferenceChild2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleContainmentReferenceChild2_in_entryRuleSingleContainmentReferenceChild23815);
            iv_ruleSingleContainmentReferenceChild2=ruleSingleContainmentReferenceChild2();

            state._fsp--;

             current =iv_ruleSingleContainmentReferenceChild2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleContainmentReferenceChild23825); 

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
    // $ANTLR end "entryRuleSingleContainmentReferenceChild2"


    // $ANTLR start "ruleSingleContainmentReferenceChild2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2049:1: ruleSingleContainmentReferenceChild2 returns [EObject current=null] : ( (lv_val_0_0= 'kw2' ) ) ;
    public final EObject ruleSingleContainmentReferenceChild2() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2052:28: ( ( (lv_val_0_0= 'kw2' ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2053:1: ( (lv_val_0_0= 'kw2' ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2053:1: ( (lv_val_0_0= 'kw2' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2054:1: (lv_val_0_0= 'kw2' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2054:1: (lv_val_0_0= 'kw2' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2055:3: lv_val_0_0= 'kw2'
            {
            lv_val_0_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingleContainmentReferenceChild23867); 

                    newLeafNode(lv_val_0_0, grammarAccess.getSingleContainmentReferenceChild2Access().getValKw2Keyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleContainmentReferenceChild2Rule());
            	        }
                   		setWithLastConsumed(current, "val", lv_val_0_0, "kw2");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleContainmentReferenceChild2"


    // $ANTLR start "entryRuleSingleContainmentReferenceChild3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2076:1: entryRuleSingleContainmentReferenceChild3 returns [EObject current=null] : iv_ruleSingleContainmentReferenceChild3= ruleSingleContainmentReferenceChild3 EOF ;
    public final EObject entryRuleSingleContainmentReferenceChild3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleContainmentReferenceChild3 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2077:2: (iv_ruleSingleContainmentReferenceChild3= ruleSingleContainmentReferenceChild3 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2078:2: iv_ruleSingleContainmentReferenceChild3= ruleSingleContainmentReferenceChild3 EOF
            {
             newCompositeNode(grammarAccess.getSingleContainmentReferenceChild3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSingleContainmentReferenceChild3_in_entryRuleSingleContainmentReferenceChild33915);
            iv_ruleSingleContainmentReferenceChild3=ruleSingleContainmentReferenceChild3();

            state._fsp--;

             current =iv_ruleSingleContainmentReferenceChild3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleContainmentReferenceChild33925); 

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
    // $ANTLR end "entryRuleSingleContainmentReferenceChild3"


    // $ANTLR start "ruleSingleContainmentReferenceChild3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2085:1: ruleSingleContainmentReferenceChild3 returns [EObject current=null] : ( (lv_val_0_0= 'kw3' ) ) ;
    public final EObject ruleSingleContainmentReferenceChild3() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2088:28: ( ( (lv_val_0_0= 'kw3' ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2089:1: ( (lv_val_0_0= 'kw3' ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2089:1: ( (lv_val_0_0= 'kw3' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2090:1: (lv_val_0_0= 'kw3' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2090:1: (lv_val_0_0= 'kw3' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2091:3: lv_val_0_0= 'kw3'
            {
            lv_val_0_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSingleContainmentReferenceChild33967); 

                    newLeafNode(lv_val_0_0, grammarAccess.getSingleContainmentReferenceChild3Access().getValKw3Keyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleContainmentReferenceChild3Rule());
            	        }
                   		setWithLastConsumed(current, "val", lv_val_0_0, "kw3");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleContainmentReferenceChild3"


    // $ANTLR start "entryRuleMultiKeywords"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2112:1: entryRuleMultiKeywords returns [EObject current=null] : iv_ruleMultiKeywords= ruleMultiKeywords EOF ;
    public final EObject entryRuleMultiKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiKeywords = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2113:2: (iv_ruleMultiKeywords= ruleMultiKeywords EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2114:2: iv_ruleMultiKeywords= ruleMultiKeywords EOF
            {
             newCompositeNode(grammarAccess.getMultiKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiKeywords_in_entryRuleMultiKeywords4015);
            iv_ruleMultiKeywords=ruleMultiKeywords();

            state._fsp--;

             current =iv_ruleMultiKeywords; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiKeywords4025); 

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
    // $ANTLR end "entryRuleMultiKeywords"


    // $ANTLR start "ruleMultiKeywords"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2121:1: ruleMultiKeywords returns [EObject current=null] : (otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) ) ;
    public final EObject ruleMultiKeywords() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;
        Token lv_val_1_3=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2124:28: ( (otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2125:1: (otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2125:1: (otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2125:3: otherlv_0= '#16' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) )
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultiKeywords4062); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiKeywordsAccess().getNumberSignDigitOneDigitSixKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2129:1: ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2130:1: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2130:1: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2131:1: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2131:1: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt26=1;
                }
                break;
            case 17:
                {
                alt26=2;
                }
                break;
            case 19:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2132:3: lv_val_1_1= 'kw1'
                    {
                    lv_val_1_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiKeywords4082); 

                            newLeafNode(lv_val_1_1, grammarAccess.getMultiKeywordsAccess().getValKw1Keyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiKeywordsRule());
                    	        }
                           		addWithLastConsumed(current, "val", lv_val_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2144:8: lv_val_1_2= 'kw2'
                    {
                    lv_val_1_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiKeywords4111); 

                            newLeafNode(lv_val_1_2, grammarAccess.getMultiKeywordsAccess().getValKw2Keyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiKeywordsRule());
                    	        }
                           		addWithLastConsumed(current, "val", lv_val_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2156:8: lv_val_1_3= 'kw3'
                    {
                    lv_val_1_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultiKeywords4140); 

                            newLeafNode(lv_val_1_3, grammarAccess.getMultiKeywordsAccess().getValKw3Keyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiKeywordsRule());
                    	        }
                           		addWithLastConsumed(current, "val", lv_val_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiKeywords"


    // $ANTLR start "entryRuleMultiKeywordsOrID"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2179:1: entryRuleMultiKeywordsOrID returns [EObject current=null] : iv_ruleMultiKeywordsOrID= ruleMultiKeywordsOrID EOF ;
    public final EObject entryRuleMultiKeywordsOrID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiKeywordsOrID = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2180:2: (iv_ruleMultiKeywordsOrID= ruleMultiKeywordsOrID EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2181:2: iv_ruleMultiKeywordsOrID= ruleMultiKeywordsOrID EOF
            {
             newCompositeNode(grammarAccess.getMultiKeywordsOrIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiKeywordsOrID_in_entryRuleMultiKeywordsOrID4192);
            iv_ruleMultiKeywordsOrID=ruleMultiKeywordsOrID();

            state._fsp--;

             current =iv_ruleMultiKeywordsOrID; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiKeywordsOrID4202); 

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
    // $ANTLR end "entryRuleMultiKeywordsOrID"


    // $ANTLR start "ruleMultiKeywordsOrID"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2188:1: ruleMultiKeywordsOrID returns [EObject current=null] : (otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) ) ;
    public final EObject ruleMultiKeywordsOrID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;
        Token lv_val_1_3=null;
        Token lv_val_1_4=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2191:28: ( (otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2192:1: (otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2192:1: (otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2192:3: otherlv_0= '#17' ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMultiKeywordsOrID4239); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiKeywordsOrIDAccess().getNumberSignDigitOneDigitSevenKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2196:1: ( ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2197:1: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2197:1: ( (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2198:1: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2198:1: (lv_val_1_1= 'kw1' | lv_val_1_2= 'kw2' | lv_val_1_3= 'kw3' | lv_val_1_4= RULE_ID )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt27=1;
                }
                break;
            case 17:
                {
                alt27=2;
                }
                break;
            case 19:
                {
                alt27=3;
                }
                break;
            case RULE_ID:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2199:3: lv_val_1_1= 'kw1'
                    {
                    lv_val_1_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiKeywordsOrID4259); 

                            newLeafNode(lv_val_1_1, grammarAccess.getMultiKeywordsOrIDAccess().getValKw1Keyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiKeywordsOrIDRule());
                    	        }
                           		addWithLastConsumed(current, "val", lv_val_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2211:8: lv_val_1_2= 'kw2'
                    {
                    lv_val_1_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiKeywordsOrID4288); 

                            newLeafNode(lv_val_1_2, grammarAccess.getMultiKeywordsOrIDAccess().getValKw2Keyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiKeywordsOrIDRule());
                    	        }
                           		addWithLastConsumed(current, "val", lv_val_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2223:8: lv_val_1_3= 'kw3'
                    {
                    lv_val_1_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultiKeywordsOrID4317); 

                            newLeafNode(lv_val_1_3, grammarAccess.getMultiKeywordsOrIDAccess().getValKw3Keyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiKeywordsOrIDRule());
                    	        }
                           		addWithLastConsumed(current, "val", lv_val_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2235:8: lv_val_1_4= RULE_ID
                    {
                    lv_val_1_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMultiKeywordsOrID4345); 

                    			newLeafNode(lv_val_1_4, grammarAccess.getMultiKeywordsOrIDAccess().getValIDTerminalRuleCall_1_0_3()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiKeywordsOrIDRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_1_4, 
                            		"ID");
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiKeywordsOrID"


    // $ANTLR start "entryRuleMultiTerminals"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2261:1: entryRuleMultiTerminals returns [EObject current=null] : iv_ruleMultiTerminals= ruleMultiTerminals EOF ;
    public final EObject entryRuleMultiTerminals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiTerminals = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2262:2: (iv_ruleMultiTerminals= ruleMultiTerminals EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2263:2: iv_ruleMultiTerminals= ruleMultiTerminals EOF
            {
             newCompositeNode(grammarAccess.getMultiTerminalsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiTerminals_in_entryRuleMultiTerminals4389);
            iv_ruleMultiTerminals=ruleMultiTerminals();

            state._fsp--;

             current =iv_ruleMultiTerminals; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiTerminals4399); 

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
    // $ANTLR end "entryRuleMultiTerminals"


    // $ANTLR start "ruleMultiTerminals"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2270:1: ruleMultiTerminals returns [EObject current=null] : (otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) ) ;
    public final EObject ruleMultiTerminals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_1=null;
        Token lv_val_1_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2273:28: ( (otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2274:1: (otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2274:1: (otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2274:3: otherlv_0= '#18' ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) )
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMultiTerminals4436); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiTerminalsAccess().getNumberSignDigitOneDigitEightKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2278:1: ( ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2279:1: ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2279:1: ( (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2280:1: (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2280:1: (lv_val_1_1= RULE_ID1 | lv_val_1_2= RULE_ID2 )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID1) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID2) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2281:3: lv_val_1_1= RULE_ID1
                    {
                    lv_val_1_1=(Token)match(input,RULE_ID1,FollowSets000.FOLLOW_RULE_ID1_in_ruleMultiTerminals4455); 

                    			newLeafNode(lv_val_1_1, grammarAccess.getMultiTerminalsAccess().getValID1TerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiTerminalsRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_1_1, 
                            		"ID1");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2296:8: lv_val_1_2= RULE_ID2
                    {
                    lv_val_1_2=(Token)match(input,RULE_ID2,FollowSets000.FOLLOW_RULE_ID2_in_ruleMultiTerminals4475); 

                    			newLeafNode(lv_val_1_2, grammarAccess.getMultiTerminalsAccess().getValID2TerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiTerminalsRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_1_2, 
                            		"ID2");
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiTerminals"


    // $ANTLR start "entryRuleDependentAlternative1"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2322:1: entryRuleDependentAlternative1 returns [EObject current=null] : iv_ruleDependentAlternative1= ruleDependentAlternative1 EOF ;
    public final EObject entryRuleDependentAlternative1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependentAlternative1 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2323:2: (iv_ruleDependentAlternative1= ruleDependentAlternative1 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2324:2: iv_ruleDependentAlternative1= ruleDependentAlternative1 EOF
            {
             newCompositeNode(grammarAccess.getDependentAlternative1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependentAlternative1_in_entryRuleDependentAlternative14519);
            iv_ruleDependentAlternative1=ruleDependentAlternative1();

            state._fsp--;

             current =iv_ruleDependentAlternative1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependentAlternative14529); 

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
    // $ANTLR end "entryRuleDependentAlternative1"


    // $ANTLR start "ruleDependentAlternative1"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2331:1: ruleDependentAlternative1 returns [EObject current=null] : (otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) ) ) ;
    public final EObject ruleDependentAlternative1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;
        Token lv_val_2_0=null;
        Token lv_flag_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2334:28: ( (otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2335:1: (otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2335:1: (otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2335:3: otherlv_0= '#19' ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) )
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDependentAlternative14566); 

                	newLeafNode(otherlv_0, grammarAccess.getDependentAlternative1Access().getNumberSignDigitOneDigitNineKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2339:1: ( ( (lv_val_1_0= RULE_ID ) ) | ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==16) ) {
                    alt29=2;
                }
                else if ( (LA29_1==EOF) ) {
                    alt29=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2339:2: ( (lv_val_1_0= RULE_ID ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2339:2: ( (lv_val_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2340:1: (lv_val_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2340:1: (lv_val_1_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2341:3: lv_val_1_0= RULE_ID
                    {
                    lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependentAlternative14584); 

                    			newLeafNode(lv_val_1_0, grammarAccess.getDependentAlternative1Access().getValIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependentAlternative1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2358:6: ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2358:6: ( ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2358:7: ( (lv_val_2_0= RULE_ID ) ) ( (lv_flag_3_0= 'kw1' ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2358:7: ( (lv_val_2_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2359:1: (lv_val_2_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2359:1: (lv_val_2_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2360:3: lv_val_2_0= RULE_ID
                    {
                    lv_val_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependentAlternative14613); 

                    			newLeafNode(lv_val_2_0, grammarAccess.getDependentAlternative1Access().getValIDTerminalRuleCall_1_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependentAlternative1Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2376:2: ( (lv_flag_3_0= 'kw1' ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2377:1: (lv_flag_3_0= 'kw1' )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2377:1: (lv_flag_3_0= 'kw1' )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2378:3: lv_flag_3_0= 'kw1'
                    {
                    lv_flag_3_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDependentAlternative14636); 

                            newLeafNode(lv_flag_3_0, grammarAccess.getDependentAlternative1Access().getFlagKw1Keyword_1_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependentAlternative1Rule());
                    	        }
                           		setWithLastConsumed(current, "flag", true, "kw1");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependentAlternative1"


    // $ANTLR start "entryRuleDependentAlternative2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2399:1: entryRuleDependentAlternative2 returns [EObject current=null] : iv_ruleDependentAlternative2= ruleDependentAlternative2 EOF ;
    public final EObject entryRuleDependentAlternative2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependentAlternative2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2400:2: (iv_ruleDependentAlternative2= ruleDependentAlternative2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2401:2: iv_ruleDependentAlternative2= ruleDependentAlternative2 EOF
            {
             newCompositeNode(grammarAccess.getDependentAlternative2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependentAlternative2_in_entryRuleDependentAlternative24687);
            iv_ruleDependentAlternative2=ruleDependentAlternative2();

            state._fsp--;

             current =iv_ruleDependentAlternative2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDependentAlternative24697); 

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
    // $ANTLR end "entryRuleDependentAlternative2"


    // $ANTLR start "ruleDependentAlternative2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2408:1: ruleDependentAlternative2 returns [EObject current=null] : (otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) ) ) ;
    public final EObject ruleDependentAlternative2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;
        Token lv_val_2_0=null;
        Token lv_val_3_0=null;
        Token lv_flag_4_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2411:28: ( (otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2412:1: (otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2412:1: (otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2412:3: otherlv_0= '#20' ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) )
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDependentAlternative24734); 

                	newLeafNode(otherlv_0, grammarAccess.getDependentAlternative2Access().getNumberSignDigitTwoDigitZeroKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2416:1: ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2416:2: ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2416:2: ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2416:3: ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2416:3: ( (lv_val_1_0= RULE_ID ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2417:1: (lv_val_1_0= RULE_ID )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2417:1: (lv_val_1_0= RULE_ID )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2418:3: lv_val_1_0= RULE_ID
                    {
                    lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependentAlternative24753); 

                    			newLeafNode(lv_val_1_0, grammarAccess.getDependentAlternative2Access().getValIDTerminalRuleCall_1_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependentAlternative2Rule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2434:2: ( (lv_val_2_0= RULE_ID ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2435:1: (lv_val_2_0= RULE_ID )
                    	    {
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2435:1: (lv_val_2_0= RULE_ID )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2436:3: lv_val_2_0= RULE_ID
                    	    {
                    	    lv_val_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependentAlternative24775); 

                    	    			newLeafNode(lv_val_2_0, grammarAccess.getDependentAlternative2Access().getValIDTerminalRuleCall_1_0_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDependentAlternative2Rule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"val",
                    	            		lv_val_2_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2453:6: ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2453:6: ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2453:7: ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2453:7: ( (lv_val_3_0= RULE_ID ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2454:1: (lv_val_3_0= RULE_ID )
                    	    {
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2454:1: (lv_val_3_0= RULE_ID )
                    	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2455:3: lv_val_3_0= RULE_ID
                    	    {
                    	    lv_val_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDependentAlternative24806); 

                    	    			newLeafNode(lv_val_3_0, grammarAccess.getDependentAlternative2Access().getValIDTerminalRuleCall_1_1_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDependentAlternative2Rule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"val",
                    	            		lv_val_3_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2471:3: ( (lv_flag_4_0= 'kw1' ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2472:1: (lv_flag_4_0= 'kw1' )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2472:1: (lv_flag_4_0= 'kw1' )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2473:3: lv_flag_4_0= 'kw1'
                    {
                    lv_flag_4_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDependentAlternative24830); 

                            newLeafNode(lv_flag_4_0, grammarAccess.getDependentAlternative2Access().getFlagKw1Keyword_1_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependentAlternative2Rule());
                    	        }
                           		setWithLastConsumed(current, "flag", true, "kw1");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependentAlternative2"


    // $ANTLR start "entryRuleOptional"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2494:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2495:2: (iv_ruleOptional= ruleOptional EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2496:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptional_in_entryRuleOptional4881);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptional4891); 

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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2503:1: ruleOptional returns [EObject current=null] : (otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_int0_1_0=null;
        Token lv_int1_2_0=null;
        Token lv_int2_3_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2506:28: ( (otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )? ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2507:1: (otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )? )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2507:1: (otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )? )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2507:3: otherlv_0= '#21' ( (lv_int0_1_0= RULE_INT ) ) ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOptional4928); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getNumberSignDigitTwoDigitOneKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2511:1: ( (lv_int0_1_0= RULE_INT ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2512:1: (lv_int0_1_0= RULE_INT )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2512:1: (lv_int0_1_0= RULE_INT )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2513:3: lv_int0_1_0= RULE_INT
            {
            lv_int0_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleOptional4945); 

            			newLeafNode(lv_int0_1_0, grammarAccess.getOptionalAccess().getInt0INTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"int0",
                    		lv_int0_1_0, 
                    		"INT");
            	    

            }


            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2529:2: ( ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2529:3: ( (lv_int1_2_0= RULE_INT ) ) ( (lv_int2_3_0= RULE_INT ) )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2529:3: ( (lv_int1_2_0= RULE_INT ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2530:1: (lv_int1_2_0= RULE_INT )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2530:1: (lv_int1_2_0= RULE_INT )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2531:3: lv_int1_2_0= RULE_INT
                    {
                    lv_int1_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleOptional4968); 

                    			newLeafNode(lv_int1_2_0, grammarAccess.getOptionalAccess().getInt1INTTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int1",
                            		lv_int1_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2547:2: ( (lv_int2_3_0= RULE_INT ) )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2548:1: (lv_int2_3_0= RULE_INT )
                    {
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2548:1: (lv_int2_3_0= RULE_INT )
                    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2549:3: lv_int2_3_0= RULE_INT
                    {
                    lv_int2_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleOptional4990); 

                    			newLeafNode(lv_int2_3_0, grammarAccess.getOptionalAccess().getInt2INTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int2",
                            		lv_int2_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleFloat"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2573:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2574:2: (iv_ruleFloat= ruleFloat EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2575:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFloat_in_entryRuleFloat5033);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloat5043); 

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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2582:1: ruleFloat returns [EObject current=null] : (otherlv_0= '#22' () otherlv_2= 'Bye' ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2585:28: ( (otherlv_0= '#22' () otherlv_2= 'Bye' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2586:1: (otherlv_0= '#22' () otherlv_2= 'Bye' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2586:1: (otherlv_0= '#22' () otherlv_2= 'Bye' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2586:3: otherlv_0= '#22' () otherlv_2= 'Bye'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleFloat5080); 

                	newLeafNode(otherlv_0, grammarAccess.getFloatAccess().getNumberSignDigitTwoDigitTwoKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2590:1: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2591:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatAccess().getFloatAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleFloat5101); 

                	newLeafNode(otherlv_2, grammarAccess.getFloatAccess().getByeKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleUnorderedAlternative"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2608:1: entryRuleUnorderedAlternative returns [EObject current=null] : iv_ruleUnorderedAlternative= ruleUnorderedAlternative EOF ;
    public final EObject entryRuleUnorderedAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedAlternative = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2609:2: (iv_ruleUnorderedAlternative= ruleUnorderedAlternative EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2610:2: iv_ruleUnorderedAlternative= ruleUnorderedAlternative EOF
            {
             newCompositeNode(grammarAccess.getUnorderedAlternativeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedAlternative_in_entryRuleUnorderedAlternative5137);
            iv_ruleUnorderedAlternative=ruleUnorderedAlternative();

            state._fsp--;

             current =iv_ruleUnorderedAlternative; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedAlternative5147); 

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
    // $ANTLR end "entryRuleUnorderedAlternative"


    // $ANTLR start "ruleUnorderedAlternative"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2617:1: ruleUnorderedAlternative returns [EObject current=null] : (otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )* ) ;
    public final EObject ruleUnorderedAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val1_2_0=null;
        Token lv_val2_3_0=null;
        EObject lv_val3_4_0 = null;

        EObject lv_val4_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2620:28: ( (otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2621:1: (otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )* )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2621:1: (otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2621:3: otherlv_0= '#23' () ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )*
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleUnorderedAlternative5184); 

                	newLeafNode(otherlv_0, grammarAccess.getUnorderedAlternativeAccess().getNumberSignDigitTwoDigitThreeKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2625:1: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2626:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnorderedAlternativeAccess().getUnorderedAlternativeAction_1(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2631:2: ( ( (lv_val1_2_0= RULE_ID ) ) | ( (lv_val2_3_0= RULE_INT ) ) | ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) ) | ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) ) )*
            loop34:
            do {
                int alt34=5;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt34=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt34=2;
                    }
                    break;
                case 16:
                    {
                    alt34=3;
                    }
                    break;
                case 17:
                    {
                    alt34=4;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2631:3: ( (lv_val1_2_0= RULE_ID ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2631:3: ( (lv_val1_2_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2632:1: (lv_val1_2_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2632:1: (lv_val1_2_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2633:3: lv_val1_2_0= RULE_ID
            	    {
            	    lv_val1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUnorderedAlternative5211); 

            	    			newLeafNode(lv_val1_2_0, grammarAccess.getUnorderedAlternativeAccess().getVal1IDTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnorderedAlternativeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val1",
            	            		lv_val1_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2650:6: ( (lv_val2_3_0= RULE_INT ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2650:6: ( (lv_val2_3_0= RULE_INT ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2651:1: (lv_val2_3_0= RULE_INT )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2651:1: (lv_val2_3_0= RULE_INT )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2652:3: lv_val2_3_0= RULE_INT
            	    {
            	    lv_val2_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUnorderedAlternative5239); 

            	    			newLeafNode(lv_val2_3_0, grammarAccess.getUnorderedAlternativeAccess().getVal2INTTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnorderedAlternativeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"val2",
            	            		lv_val2_3_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2669:6: ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2669:6: ( (lv_val3_4_0= ruleUnorderedAlternativeVal ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2670:1: (lv_val3_4_0= ruleUnorderedAlternativeVal )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2670:1: (lv_val3_4_0= ruleUnorderedAlternativeVal )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2671:3: lv_val3_4_0= ruleUnorderedAlternativeVal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnorderedAlternativeAccess().getVal3UnorderedAlternativeValParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUnorderedAlternativeVal_in_ruleUnorderedAlternative5271);
            	    lv_val3_4_0=ruleUnorderedAlternativeVal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnorderedAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"val3",
            	            		lv_val3_4_0, 
            	            		"UnorderedAlternativeVal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2688:6: ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2688:6: ( (lv_val4_5_0= ruleUnorderedAlternativeValDelegate ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2689:1: (lv_val4_5_0= ruleUnorderedAlternativeValDelegate )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2689:1: (lv_val4_5_0= ruleUnorderedAlternativeValDelegate )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2690:3: lv_val4_5_0= ruleUnorderedAlternativeValDelegate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnorderedAlternativeAccess().getVal4UnorderedAlternativeValDelegateParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUnorderedAlternativeValDelegate_in_ruleUnorderedAlternative5298);
            	    lv_val4_5_0=ruleUnorderedAlternativeValDelegate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnorderedAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"val4",
            	            		lv_val4_5_0, 
            	            		"UnorderedAlternativeValDelegate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedAlternative"


    // $ANTLR start "entryRuleUnorderedAlternativeVal"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2714:1: entryRuleUnorderedAlternativeVal returns [EObject current=null] : iv_ruleUnorderedAlternativeVal= ruleUnorderedAlternativeVal EOF ;
    public final EObject entryRuleUnorderedAlternativeVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedAlternativeVal = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2715:2: (iv_ruleUnorderedAlternativeVal= ruleUnorderedAlternativeVal EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2716:2: iv_ruleUnorderedAlternativeVal= ruleUnorderedAlternativeVal EOF
            {
             newCompositeNode(grammarAccess.getUnorderedAlternativeValRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedAlternativeVal_in_entryRuleUnorderedAlternativeVal5336);
            iv_ruleUnorderedAlternativeVal=ruleUnorderedAlternativeVal();

            state._fsp--;

             current =iv_ruleUnorderedAlternativeVal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedAlternativeVal5346); 

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
    // $ANTLR end "entryRuleUnorderedAlternativeVal"


    // $ANTLR start "ruleUnorderedAlternativeVal"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2723:1: ruleUnorderedAlternativeVal returns [EObject current=null] : (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUnorderedAlternativeVal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2726:28: ( (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2727:1: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2727:1: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2727:3: otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUnorderedAlternativeVal5383); 

                	newLeafNode(otherlv_0, grammarAccess.getUnorderedAlternativeValAccess().getKw1Keyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2731:1: ( (lv_val_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2732:1: (lv_val_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2732:1: (lv_val_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2733:3: lv_val_1_0= RULE_ID
            {
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUnorderedAlternativeVal5400); 

            			newLeafNode(lv_val_1_0, grammarAccess.getUnorderedAlternativeValAccess().getValIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnorderedAlternativeValRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val",
                    		lv_val_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedAlternativeVal"


    // $ANTLR start "entryRuleUnorderedAlternativeValDelegate"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2757:1: entryRuleUnorderedAlternativeValDelegate returns [EObject current=null] : iv_ruleUnorderedAlternativeValDelegate= ruleUnorderedAlternativeValDelegate EOF ;
    public final EObject entryRuleUnorderedAlternativeValDelegate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedAlternativeValDelegate = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2758:2: (iv_ruleUnorderedAlternativeValDelegate= ruleUnorderedAlternativeValDelegate EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2759:2: iv_ruleUnorderedAlternativeValDelegate= ruleUnorderedAlternativeValDelegate EOF
            {
             newCompositeNode(grammarAccess.getUnorderedAlternativeValDelegateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedAlternativeValDelegate_in_entryRuleUnorderedAlternativeValDelegate5441);
            iv_ruleUnorderedAlternativeValDelegate=ruleUnorderedAlternativeValDelegate();

            state._fsp--;

             current =iv_ruleUnorderedAlternativeValDelegate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedAlternativeValDelegate5451); 

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
    // $ANTLR end "entryRuleUnorderedAlternativeValDelegate"


    // $ANTLR start "ruleUnorderedAlternativeValDelegate"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2766:1: ruleUnorderedAlternativeValDelegate returns [EObject current=null] : this_UnorderedAlternativeVal2_0= ruleUnorderedAlternativeVal2 ;
    public final EObject ruleUnorderedAlternativeValDelegate() throws RecognitionException {
        EObject current = null;

        EObject this_UnorderedAlternativeVal2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2769:28: (this_UnorderedAlternativeVal2_0= ruleUnorderedAlternativeVal2 )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2771:5: this_UnorderedAlternativeVal2_0= ruleUnorderedAlternativeVal2
            {
             
                    newCompositeNode(grammarAccess.getUnorderedAlternativeValDelegateAccess().getUnorderedAlternativeVal2ParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedAlternativeVal2_in_ruleUnorderedAlternativeValDelegate5497);
            this_UnorderedAlternativeVal2_0=ruleUnorderedAlternativeVal2();

            state._fsp--;

             
                    current = this_UnorderedAlternativeVal2_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedAlternativeValDelegate"


    // $ANTLR start "entryRuleUnorderedAlternativeVal2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2787:1: entryRuleUnorderedAlternativeVal2 returns [EObject current=null] : iv_ruleUnorderedAlternativeVal2= ruleUnorderedAlternativeVal2 EOF ;
    public final EObject entryRuleUnorderedAlternativeVal2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedAlternativeVal2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2788:2: (iv_ruleUnorderedAlternativeVal2= ruleUnorderedAlternativeVal2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2789:2: iv_ruleUnorderedAlternativeVal2= ruleUnorderedAlternativeVal2 EOF
            {
             newCompositeNode(grammarAccess.getUnorderedAlternativeVal2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedAlternativeVal2_in_entryRuleUnorderedAlternativeVal25531);
            iv_ruleUnorderedAlternativeVal2=ruleUnorderedAlternativeVal2();

            state._fsp--;

             current =iv_ruleUnorderedAlternativeVal2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedAlternativeVal25541); 

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
    // $ANTLR end "entryRuleUnorderedAlternativeVal2"


    // $ANTLR start "ruleUnorderedAlternativeVal2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2796:1: ruleUnorderedAlternativeVal2 returns [EObject current=null] : (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUnorderedAlternativeVal2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2799:28: ( (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2800:1: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2800:1: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2800:3: otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUnorderedAlternativeVal25578); 

                	newLeafNode(otherlv_0, grammarAccess.getUnorderedAlternativeVal2Access().getKw2Keyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2804:1: ( (lv_val_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2805:1: (lv_val_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2805:1: (lv_val_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2806:3: lv_val_1_0= RULE_ID
            {
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUnorderedAlternativeVal25595); 

            			newLeafNode(lv_val_1_0, grammarAccess.getUnorderedAlternativeVal2Access().getValIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnorderedAlternativeVal2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val",
                    		lv_val_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedAlternativeVal2"


    // $ANTLR start "entryRuleUnorderedGroup"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2830:1: entryRuleUnorderedGroup returns [EObject current=null] : iv_ruleUnorderedGroup= ruleUnorderedGroup EOF ;
    public final EObject entryRuleUnorderedGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedGroup = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2831:2: (iv_ruleUnorderedGroup= ruleUnorderedGroup EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2832:2: iv_ruleUnorderedGroup= ruleUnorderedGroup EOF
            {
             newCompositeNode(grammarAccess.getUnorderedGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup5636);
            iv_ruleUnorderedGroup=ruleUnorderedGroup();

            state._fsp--;

             current =iv_ruleUnorderedGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroup5646); 

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
    // $ANTLR end "entryRuleUnorderedGroup"


    // $ANTLR start "ruleUnorderedGroup"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2839:1: ruleUnorderedGroup returns [EObject current=null] : (otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleUnorderedGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val1_2_0=null;
        Token lv_val2_3_0=null;
        EObject lv_val3_4_0 = null;

        EObject lv_val4_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2842:28: ( (otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2843:1: (otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2843:1: (otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2843:3: otherlv_0= '#24' ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleUnorderedGroup5683); 

                	newLeafNode(otherlv_0, grammarAccess.getUnorderedGroupAccess().getNumberSignDigitTwoDigitFourKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2847:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2849:1: ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2849:1: ( ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2850:2: ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2853:2: ( ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?)
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2854:3: ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+ {...}?
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2854:3: ( ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=5;
                int LA35_0 = input.LA(1);

                if ( LA35_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 ==RULE_INT && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1) ) {
                    alt35=2;
                }
                else if ( LA35_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt35=3;
                }
                else if ( LA35_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt35=4;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2856:4: ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2856:4: ({...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2857:5: {...}? => ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2857:111: ( ({...}? => ( (lv_val1_2_0= RULE_ID ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2858:6: ({...}? => ( (lv_val1_2_0= RULE_ID ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2861:6: ({...}? => ( (lv_val1_2_0= RULE_ID ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2861:7: {...}? => ( (lv_val1_2_0= RULE_ID ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2861:16: ( (lv_val1_2_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2862:1: (lv_val1_2_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2862:1: (lv_val1_2_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2863:3: lv_val1_2_0= RULE_ID
            	    {
            	    lv_val1_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUnorderedGroup5745); 

            	    			newLeafNode(lv_val1_2_0, grammarAccess.getUnorderedGroupAccess().getVal1IDTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnorderedGroupRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"val1",
            	            		lv_val1_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2886:4: ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2886:4: ({...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2887:5: {...}? => ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2887:111: ( ({...}? => ( (lv_val2_3_0= RULE_INT ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2888:6: ({...}? => ( (lv_val2_3_0= RULE_INT ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2891:6: ({...}? => ( (lv_val2_3_0= RULE_INT ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2891:7: {...}? => ( (lv_val2_3_0= RULE_INT ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2891:16: ( (lv_val2_3_0= RULE_INT ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2892:1: (lv_val2_3_0= RULE_INT )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2892:1: (lv_val2_3_0= RULE_INT )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2893:3: lv_val2_3_0= RULE_INT
            	    {
            	    lv_val2_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleUnorderedGroup5821); 

            	    			newLeafNode(lv_val2_3_0, grammarAccess.getUnorderedGroupAccess().getVal2INTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnorderedGroupRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"val2",
            	            		lv_val2_3_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2916:4: ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2916:4: ({...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2917:5: {...}? => ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2917:111: ( ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2918:6: ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2921:6: ({...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2921:7: {...}? => ( (lv_val3_4_0= ruleUnorderedGroupVal ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2921:16: ( (lv_val3_4_0= ruleUnorderedGroupVal ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2922:1: (lv_val3_4_0= ruleUnorderedGroupVal )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2922:1: (lv_val3_4_0= ruleUnorderedGroupVal )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2923:3: lv_val3_4_0= ruleUnorderedGroupVal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnorderedGroupAccess().getVal3UnorderedGroupValParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroupVal_in_ruleUnorderedGroup5901);
            	    lv_val3_4_0=ruleUnorderedGroupVal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnorderedGroupRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"val3",
            	            		lv_val3_4_0, 
            	            		"UnorderedGroupVal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2946:4: ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2946:4: ({...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2947:5: {...}? => ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2947:111: ( ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2948:6: ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2951:6: ({...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2951:7: {...}? => ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroup", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2951:16: ( (lv_val4_5_0= ruleUnorderedGroupValDelegate ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2952:1: (lv_val4_5_0= ruleUnorderedGroupValDelegate )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2952:1: (lv_val4_5_0= ruleUnorderedGroupValDelegate )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2953:3: lv_val4_5_0= ruleUnorderedGroupValDelegate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnorderedGroupAccess().getVal4UnorderedGroupValDelegateParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroupValDelegate_in_ruleUnorderedGroup5976);
            	    lv_val4_5_0=ruleUnorderedGroupValDelegate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnorderedGroupRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"val4",
            	            		lv_val4_5_0, 
            	            		"UnorderedGroupValDelegate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleUnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedGroup"


    // $ANTLR start "entryRuleUnorderedGroupVal"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2992:1: entryRuleUnorderedGroupVal returns [EObject current=null] : iv_ruleUnorderedGroupVal= ruleUnorderedGroupVal EOF ;
    public final EObject entryRuleUnorderedGroupVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedGroupVal = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2993:2: (iv_ruleUnorderedGroupVal= ruleUnorderedGroupVal EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:2994:2: iv_ruleUnorderedGroupVal= ruleUnorderedGroupVal EOF
            {
             newCompositeNode(grammarAccess.getUnorderedGroupValRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroupVal_in_entryRuleUnorderedGroupVal6058);
            iv_ruleUnorderedGroupVal=ruleUnorderedGroupVal();

            state._fsp--;

             current =iv_ruleUnorderedGroupVal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroupVal6068); 

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
    // $ANTLR end "entryRuleUnorderedGroupVal"


    // $ANTLR start "ruleUnorderedGroupVal"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3001:1: ruleUnorderedGroupVal returns [EObject current=null] : (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUnorderedGroupVal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3004:28: ( (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3005:1: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3005:1: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3005:3: otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUnorderedGroupVal6105); 

                	newLeafNode(otherlv_0, grammarAccess.getUnorderedGroupValAccess().getKw1Keyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3009:1: ( (lv_val_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3010:1: (lv_val_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3010:1: (lv_val_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3011:3: lv_val_1_0= RULE_ID
            {
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUnorderedGroupVal6122); 

            			newLeafNode(lv_val_1_0, grammarAccess.getUnorderedGroupValAccess().getValIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnorderedGroupValRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val",
                    		lv_val_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedGroupVal"


    // $ANTLR start "entryRuleUnorderedGroupValDelegate"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3035:1: entryRuleUnorderedGroupValDelegate returns [EObject current=null] : iv_ruleUnorderedGroupValDelegate= ruleUnorderedGroupValDelegate EOF ;
    public final EObject entryRuleUnorderedGroupValDelegate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedGroupValDelegate = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3036:2: (iv_ruleUnorderedGroupValDelegate= ruleUnorderedGroupValDelegate EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3037:2: iv_ruleUnorderedGroupValDelegate= ruleUnorderedGroupValDelegate EOF
            {
             newCompositeNode(grammarAccess.getUnorderedGroupValDelegateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroupValDelegate_in_entryRuleUnorderedGroupValDelegate6163);
            iv_ruleUnorderedGroupValDelegate=ruleUnorderedGroupValDelegate();

            state._fsp--;

             current =iv_ruleUnorderedGroupValDelegate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroupValDelegate6173); 

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
    // $ANTLR end "entryRuleUnorderedGroupValDelegate"


    // $ANTLR start "ruleUnorderedGroupValDelegate"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3044:1: ruleUnorderedGroupValDelegate returns [EObject current=null] : this_UnorderedGroupVal2_0= ruleUnorderedGroupVal2 ;
    public final EObject ruleUnorderedGroupValDelegate() throws RecognitionException {
        EObject current = null;

        EObject this_UnorderedGroupVal2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3047:28: (this_UnorderedGroupVal2_0= ruleUnorderedGroupVal2 )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3049:5: this_UnorderedGroupVal2_0= ruleUnorderedGroupVal2
            {
             
                    newCompositeNode(grammarAccess.getUnorderedGroupValDelegateAccess().getUnorderedGroupVal2ParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroupVal2_in_ruleUnorderedGroupValDelegate6219);
            this_UnorderedGroupVal2_0=ruleUnorderedGroupVal2();

            state._fsp--;

             
                    current = this_UnorderedGroupVal2_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedGroupValDelegate"


    // $ANTLR start "entryRuleUnorderedGroupVal2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3065:1: entryRuleUnorderedGroupVal2 returns [EObject current=null] : iv_ruleUnorderedGroupVal2= ruleUnorderedGroupVal2 EOF ;
    public final EObject entryRuleUnorderedGroupVal2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedGroupVal2 = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3066:2: (iv_ruleUnorderedGroupVal2= ruleUnorderedGroupVal2 EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3067:2: iv_ruleUnorderedGroupVal2= ruleUnorderedGroupVal2 EOF
            {
             newCompositeNode(grammarAccess.getUnorderedGroupVal2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroupVal2_in_entryRuleUnorderedGroupVal26253);
            iv_ruleUnorderedGroupVal2=ruleUnorderedGroupVal2();

            state._fsp--;

             current =iv_ruleUnorderedGroupVal2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroupVal26263); 

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
    // $ANTLR end "entryRuleUnorderedGroupVal2"


    // $ANTLR start "ruleUnorderedGroupVal2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3074:1: ruleUnorderedGroupVal2 returns [EObject current=null] : (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final EObject ruleUnorderedGroupVal2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3077:28: ( (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3078:1: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3078:1: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3078:3: otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUnorderedGroupVal26300); 

                	newLeafNode(otherlv_0, grammarAccess.getUnorderedGroupVal2Access().getKw2Keyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3082:1: ( (lv_val_1_0= RULE_ID ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3083:1: (lv_val_1_0= RULE_ID )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3083:1: (lv_val_1_0= RULE_ID )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3084:3: lv_val_1_0= RULE_ID
            {
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUnorderedGroupVal26317); 

            			newLeafNode(lv_val_1_0, grammarAccess.getUnorderedGroupVal2Access().getValIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnorderedGroupVal2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val",
                    		lv_val_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedGroupVal2"


    // $ANTLR start "entryRuleUnorderedGroupOptional"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3108:1: entryRuleUnorderedGroupOptional returns [EObject current=null] : iv_ruleUnorderedGroupOptional= ruleUnorderedGroupOptional EOF ;
    public final EObject entryRuleUnorderedGroupOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedGroupOptional = null;


        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3109:2: (iv_ruleUnorderedGroupOptional= ruleUnorderedGroupOptional EOF )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3110:2: iv_ruleUnorderedGroupOptional= ruleUnorderedGroupOptional EOF
            {
             newCompositeNode(grammarAccess.getUnorderedGroupOptionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnorderedGroupOptional_in_entryRuleUnorderedGroupOptional6358);
            iv_ruleUnorderedGroupOptional=ruleUnorderedGroupOptional();

            state._fsp--;

             current =iv_ruleUnorderedGroupOptional; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnorderedGroupOptional6368); 

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
    // $ANTLR end "entryRuleUnorderedGroupOptional"


    // $ANTLR start "ruleUnorderedGroupOptional"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3117:1: ruleUnorderedGroupOptional returns [EObject current=null] : (otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleUnorderedGroupOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_val1_4_0=null;
        Token otherlv_5=null;
        Token lv_va2_6_0=null;
        Token otherlv_7=null;
        Token lv_val3_8_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3120:28: ( (otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3121:1: (otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3121:1: (otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3121:3: otherlv_0= '#25' () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleUnorderedGroupOptional6405); 

                	newLeafNode(otherlv_0, grammarAccess.getUnorderedGroupOptionalAccess().getNumberSignDigitTwoDigitFiveKeyword_0());
                
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3125:1: ()
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3126:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroupOptionalAction_1(),
                        current);
                

            }

            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3131:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3133:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3133:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3134:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            	
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3137:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )* )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3138:3: ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )*
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3138:3: ( ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) ) )*
            loop36:
            do {
                int alt36=4;
                int LA36_0 = input.LA(1);

                if ( LA36_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1) ) {
                    alt36=2;
                }
                else if ( LA36_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2) ) {
                    alt36=3;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3140:4: ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3140:4: ({...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3141:5: {...}? => ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3141:119: ( ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3142:6: ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3145:6: ({...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3145:7: {...}? => (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3145:16: (otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3145:18: otherlv_3= 'kw1' ( (lv_val1_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUnorderedGroupOptional6472); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUnorderedGroupOptionalAccess().getKw1Keyword_2_0_0());
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3149:1: ( (lv_val1_4_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3150:1: (lv_val1_4_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3150:1: (lv_val1_4_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3151:3: lv_val1_4_0= RULE_ID
            	    {
            	    lv_val1_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUnorderedGroupOptional6489); 

            	    			newLeafNode(lv_val1_4_0, grammarAccess.getUnorderedGroupOptionalAccess().getVal1IDTerminalRuleCall_2_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnorderedGroupOptionalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"val1",
            	            		lv_val1_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3174:4: ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3174:4: ({...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3175:5: {...}? => ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3175:119: ( ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3176:6: ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3179:6: ({...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3179:7: {...}? => (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3179:16: (otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3179:18: otherlv_5= 'kw2' ( (lv_va2_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUnorderedGroupOptional6562); 

            	        	newLeafNode(otherlv_5, grammarAccess.getUnorderedGroupOptionalAccess().getKw2Keyword_2_1_0());
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3183:1: ( (lv_va2_6_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3184:1: (lv_va2_6_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3184:1: (lv_va2_6_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3185:3: lv_va2_6_0= RULE_ID
            	    {
            	    lv_va2_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUnorderedGroupOptional6579); 

            	    			newLeafNode(lv_va2_6_0, grammarAccess.getUnorderedGroupOptionalAccess().getVa2IDTerminalRuleCall_2_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnorderedGroupOptionalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"va2",
            	            		lv_va2_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3208:4: ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3208:4: ({...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3209:5: {...}? => ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3209:119: ( ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3210:6: ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3213:6: ({...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3213:7: {...}? => (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnorderedGroupOptional", "true");
            	    }
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3213:16: (otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3213:18: otherlv_7= 'kw3' ( (lv_val3_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleUnorderedGroupOptional6652); 

            	        	newLeafNode(otherlv_7, grammarAccess.getUnorderedGroupOptionalAccess().getKw3Keyword_2_2_0());
            	        
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3217:1: ( (lv_val3_8_0= RULE_ID ) )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3218:1: (lv_val3_8_0= RULE_ID )
            	    {
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3218:1: (lv_val3_8_0= RULE_ID )
            	    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3219:3: lv_val3_8_0= RULE_ID
            	    {
            	    lv_val3_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleUnorderedGroupOptional6669); 

            	    			newLeafNode(lv_val3_8_0, grammarAccess.getUnorderedGroupOptionalAccess().getVal3IDTerminalRuleCall_2_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnorderedGroupOptionalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"val3",
            	            		lv_val3_8_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnorderedGroupOptional"


    // $ANTLR start "ruleDefEnum1"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3257:1: ruleDefEnum1 returns [Enumerator current=null] : (enumLiteral_0= 'kw1' ) ;
    public final Enumerator ruleDefEnum1() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3259:28: ( (enumLiteral_0= 'kw1' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3260:1: (enumLiteral_0= 'kw1' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3260:1: (enumLiteral_0= 'kw1' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3260:3: enumLiteral_0= 'kw1'
            {
            enumLiteral_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDefEnum16764); 

                    current = grammarAccess.getDefEnum1Access().getKw1EnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getDefEnum1Access().getKw1EnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefEnum1"


    // $ANTLR start "ruleDefEnum2"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3270:1: ruleDefEnum2 returns [Enumerator current=null] : (enumLiteral_0= 'kw2' ) ;
    public final Enumerator ruleDefEnum2() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3272:28: ( (enumLiteral_0= 'kw2' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3273:1: (enumLiteral_0= 'kw2' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3273:1: (enumLiteral_0= 'kw2' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3273:3: enumLiteral_0= 'kw2'
            {
            enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDefEnum26807); 

                    current = grammarAccess.getDefEnum2Access().getKw2EnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getDefEnum2Access().getKw2EnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefEnum2"


    // $ANTLR start "ruleDefEnum3"
    // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3283:1: ruleDefEnum3 returns [Enumerator current=null] : (enumLiteral_0= 'kw3' ) ;
    public final Enumerator ruleDefEnum3() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3285:28: ( (enumLiteral_0= 'kw3' ) )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3286:1: (enumLiteral_0= 'kw3' )
            {
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3286:1: (enumLiteral_0= 'kw3' )
            // ../org.eclipse.xtext.tests/src-gen/org/eclipse/xtext/serializer/parser/antlr/internal/InternalSequencerTestLanguage.g:3286:3: enumLiteral_0= 'kw3'
            {
            enumLiteral_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDefEnum36850); 

                    current = grammarAccess.getDefEnum3Access().getKw3EnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getDefEnum3Access().getKw3EnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefEnum3"

    // Delegated rules


    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA32_eotS =
        "\5\uffff";
    static final String DFA32_eofS =
        "\3\uffff\1\4\1\uffff";
    static final String DFA32_minS =
        "\2\4\1\uffff\1\4\1\uffff";
    static final String DFA32_maxS =
        "\1\4\1\20\1\uffff\1\20\1\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA32_specialS =
        "\5\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1",
            "\1\3\13\uffff\1\2",
            "",
            "\1\3\13\uffff\1\2",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2416:1: ( ( ( (lv_val_1_0= RULE_ID ) ) ( (lv_val_2_0= RULE_ID ) )+ ) | ( ( (lv_val_3_0= RULE_ID ) )+ ( (lv_flag_4_0= 'kw1' ) ) ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleGroup_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAlternative_in_ruleModel158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleMultiplicities_in_ruleModel185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupMultiplicities_in_ruleModel212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternativeMultiplicities_in_ruleModel239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList1_in_ruleModel266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList2_in_ruleModel293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAltList1_in_ruleModel320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAltList2_in_ruleModel347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleKeywords_in_ruleModel374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleKeywordsOrID_in_ruleModel401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleTerminals_in_ruleModel428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiKeywords_in_ruleModel455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiKeywordsOrID_in_ruleModel482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiTerminals_in_ruleModel509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleEnum_in_ruleModel536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleCrossReference_in_ruleModel563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleContainmentReference_in_ruleModel590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependentAlternative1_in_ruleModel617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependentAlternative2_in_ruleModel644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptional_in_ruleModel671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_ruleModel698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedAlternative_in_ruleModel725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_ruleModel752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroupOptional_in_ruleModel779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleGroup_in_entryRuleSimpleGroup815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleGroup825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleSimpleGroup862 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleGroup879 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleGroup901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAlternative_in_entryRuleSimpleAlternative942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAlternative952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleSimpleAlternative989 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleSimpleAlternative1003 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleAlternative1020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSimpleAlternative1045 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleAlternative1062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleMultiplicities_in_entryRuleSimpleMultiplicities1105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleMultiplicities1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSimpleMultiplicities1152 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleMultiplicities1169 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSimpleMultiplicities1186 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleMultiplicities1203 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSimpleMultiplicities1221 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleMultiplicities1238 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_19_in_ruleSimpleMultiplicities1256 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleMultiplicities1273 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleGroupMultiplicities_in_entryRuleGroupMultiplicities1315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupMultiplicities1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleGroupMultiplicities1362 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGroupMultiplicities1379 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleGroupMultiplicities1396 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGroupMultiplicities1414 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGroupMultiplicities1436 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleGroupMultiplicities1455 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGroupMultiplicities1473 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGroupMultiplicities1495 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_19_in_ruleGroupMultiplicities1514 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGroupMultiplicities1532 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGroupMultiplicities1554 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAlternativeMultiplicities_in_entryRuleAlternativeMultiplicities1597 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternativeMultiplicities1607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleAlternativeMultiplicities1644 = new BitSet(new long[]{0x0000000000030010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1662 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_16_in_ruleAlternativeMultiplicities1686 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1703 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAlternativeMultiplicities1723 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1741 = new BitSet(new long[]{0x0000000000480010L});
        public static final BitSet FOLLOW_19_in_ruleAlternativeMultiplicities1765 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1782 = new BitSet(new long[]{0x0000000000480010L});
        public static final BitSet FOLLOW_22_in_ruleAlternativeMultiplicities1802 = new BitSet(new long[]{0x0000000000800012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1820 = new BitSet(new long[]{0x0000000000800012L});
        public static final BitSet FOLLOW_23_in_ruleAlternativeMultiplicities1844 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlternativeMultiplicities1861 = new BitSet(new long[]{0x0000000000800012L});
        public static final BitSet FOLLOW_ruleList1_in_entryRuleList11905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList11915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleList11952 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList11969 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleList11987 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList12004 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleList2_in_entryRuleList22047 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList22057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleList22094 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList22121 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleList22139 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList22156 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_ruleAltList1_in_entryRuleAltList12201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAltList12211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAltList12248 = new BitSet(new long[]{0x0000000000030010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList12267 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList12289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAltList12314 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList12331 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList12353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAltList12378 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList12395 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList12417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAltList2_in_entryRuleAltList22461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAltList22471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAltList22508 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList22527 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList22549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleAltList22574 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList22591 = new BitSet(new long[]{0x0000000002000010L});
        public static final BitSet FOLLOW_25_in_ruleAltList22609 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList22626 = new BitSet(new long[]{0x0000000002000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAltList22650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleKeywords_in_entryRuleSingleKeywords2693 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleKeywords2703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleSingleKeywords2740 = new BitSet(new long[]{0x00000000000B0000L});
        public static final BitSet FOLLOW_16_in_ruleSingleKeywords2760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSingleKeywords2789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSingleKeywords2818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleKeywordsOrID_in_entryRuleSingleKeywordsOrID2870 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleKeywordsOrID2880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSingleKeywordsOrID2917 = new BitSet(new long[]{0x00000000000B0010L});
        public static final BitSet FOLLOW_16_in_ruleSingleKeywordsOrID2937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSingleKeywordsOrID2966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSingleKeywordsOrID2995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleKeywordsOrID3023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleTerminals_in_entryRuleSingleTerminals3067 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleTerminals3077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleSingleTerminals3114 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_RULE_ID1_in_ruleSingleTerminals3133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID2_in_ruleSingleTerminals3153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleEnum_in_entryRuleSingleEnum3197 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleEnum3207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleSingleEnum3244 = new BitSet(new long[]{0x00000000000B0000L});
        public static final BitSet FOLLOW_ruleDefEnum1_in_ruleSingleEnum3267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefEnum2_in_ruleSingleEnum3286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefEnum3_in_ruleSingleEnum3305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleCrossReference_in_entryRuleSingleCrossReference3344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleCrossReference3354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleSingleCrossReference3391 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_RULE_ID1_in_ruleSingleCrossReference3410 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_RULE_ID2_in_ruleSingleCrossReference3430 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_RULE_ID3_in_ruleSingleCrossReference3450 = new BitSet(new long[]{0x00000000000000E0L});
        public static final BitSet FOLLOW_RULE_ID1_in_ruleSingleCrossReference3479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID2_in_ruleSingleCrossReference3505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID3_in_ruleSingleCrossReference3531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleContainmentReference_in_entryRuleSingleContainmentReference3568 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleContainmentReference3578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleSingleContainmentReference3615 = new BitSet(new long[]{0x00000000000B0000L});
        public static final BitSet FOLLOW_ruleSingleContainmentReferenceChild1_in_ruleSingleContainmentReference3638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleContainmentReferenceChild2_in_ruleSingleContainmentReference3657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleContainmentReferenceChild3_in_ruleSingleContainmentReference3676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleContainmentReferenceChild1_in_entryRuleSingleContainmentReferenceChild13715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleContainmentReferenceChild13725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleSingleContainmentReferenceChild13767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleContainmentReferenceChild2_in_entryRuleSingleContainmentReferenceChild23815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleContainmentReferenceChild23825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSingleContainmentReferenceChild23867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleContainmentReferenceChild3_in_entryRuleSingleContainmentReferenceChild33915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleContainmentReferenceChild33925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSingleContainmentReferenceChild33967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiKeywords_in_entryRuleMultiKeywords4015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiKeywords4025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleMultiKeywords4062 = new BitSet(new long[]{0x00000000000B0000L});
        public static final BitSet FOLLOW_16_in_ruleMultiKeywords4082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleMultiKeywords4111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleMultiKeywords4140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiKeywordsOrID_in_entryRuleMultiKeywordsOrID4192 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiKeywordsOrID4202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleMultiKeywordsOrID4239 = new BitSet(new long[]{0x00000000000B0010L});
        public static final BitSet FOLLOW_16_in_ruleMultiKeywordsOrID4259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleMultiKeywordsOrID4288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleMultiKeywordsOrID4317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMultiKeywordsOrID4345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiTerminals_in_entryRuleMultiTerminals4389 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiTerminals4399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleMultiTerminals4436 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_RULE_ID1_in_ruleMultiTerminals4455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID2_in_ruleMultiTerminals4475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependentAlternative1_in_entryRuleDependentAlternative14519 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependentAlternative14529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDependentAlternative14566 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependentAlternative14584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependentAlternative14613 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDependentAlternative14636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependentAlternative2_in_entryRuleDependentAlternative24687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDependentAlternative24697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleDependentAlternative24734 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependentAlternative24753 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependentAlternative24775 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDependentAlternative24806 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_16_in_ruleDependentAlternative24830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional4881 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptional4891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleOptional4928 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleOptional4945 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleOptional4968 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleOptional4990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat5033 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloat5043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleFloat5080 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleFloat5101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedAlternative_in_entryRuleUnorderedAlternative5137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedAlternative5147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleUnorderedAlternative5184 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUnorderedAlternative5211 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUnorderedAlternative5239 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_ruleUnorderedAlternativeVal_in_ruleUnorderedAlternative5271 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_ruleUnorderedAlternativeValDelegate_in_ruleUnorderedAlternative5298 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_ruleUnorderedAlternativeVal_in_entryRuleUnorderedAlternativeVal5336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedAlternativeVal5346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleUnorderedAlternativeVal5383 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUnorderedAlternativeVal5400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedAlternativeValDelegate_in_entryRuleUnorderedAlternativeValDelegate5441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedAlternativeValDelegate5451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedAlternativeVal2_in_ruleUnorderedAlternativeValDelegate5497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedAlternativeVal2_in_entryRuleUnorderedAlternativeVal25531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedAlternativeVal25541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleUnorderedAlternativeVal25578 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUnorderedAlternativeVal25595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroup_in_entryRuleUnorderedGroup5636 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroup5646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleUnorderedGroup5683 = new BitSet(new long[]{0x0000000000030110L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUnorderedGroup5745 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleUnorderedGroup5821 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_ruleUnorderedGroupVal_in_ruleUnorderedGroup5901 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_ruleUnorderedGroupValDelegate_in_ruleUnorderedGroup5976 = new BitSet(new long[]{0x0000000000030112L});
        public static final BitSet FOLLOW_ruleUnorderedGroupVal_in_entryRuleUnorderedGroupVal6058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroupVal6068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleUnorderedGroupVal6105 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUnorderedGroupVal6122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroupValDelegate_in_entryRuleUnorderedGroupValDelegate6163 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroupValDelegate6173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroupVal2_in_ruleUnorderedGroupValDelegate6219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroupVal2_in_entryRuleUnorderedGroupVal26253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroupVal26263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleUnorderedGroupVal26300 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUnorderedGroupVal26317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnorderedGroupOptional_in_entryRuleUnorderedGroupOptional6358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedGroupOptional6368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleUnorderedGroupOptional6405 = new BitSet(new long[]{0x00000000000B0002L});
        public static final BitSet FOLLOW_16_in_ruleUnorderedGroupOptional6472 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUnorderedGroupOptional6489 = new BitSet(new long[]{0x00000000000B0002L});
        public static final BitSet FOLLOW_17_in_ruleUnorderedGroupOptional6562 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUnorderedGroupOptional6579 = new BitSet(new long[]{0x00000000000B0002L});
        public static final BitSet FOLLOW_19_in_ruleUnorderedGroupOptional6652 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleUnorderedGroupOptional6669 = new BitSet(new long[]{0x00000000000B0002L});
        public static final BitSet FOLLOW_16_in_ruleDefEnum16764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleDefEnum26807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleDefEnum36850 = new BitSet(new long[]{0x0000000000000002L});
    }


}