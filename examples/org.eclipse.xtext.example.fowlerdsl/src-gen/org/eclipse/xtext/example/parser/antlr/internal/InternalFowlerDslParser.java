package org.eclipse.xtext.example.parser.antlr.internal; 

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
import org.eclipse.xtext.example.services.FowlerDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalFowlerDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'events'", "'end'", "'commands'", "'resetting'", "'state'", "'actions'", "'{'", "'}'", "'=>'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

        public InternalFowlerDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g"; }


     
     	private FowlerDslGrammarAccess grammarAccess;
     	
        public InternalFowlerDslParser(TokenStream input, IAstFactory factory, FowlerDslGrammarAccess grammarAccess) {
            super(input, factory, grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Statemachine";	
       	} 



    // $ANTLR start entryRuleStatemachine
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:70:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:70:54: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:71:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatemachineRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine73);
            iv_ruleStatemachine=ruleStatemachine();
            _fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine83); 

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
    // $ANTLR end entryRuleStatemachine


    // $ANTLR start ruleStatemachine
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:78:1: ruleStatemachine returns [EObject current=null] : ( 'events' (lv_events_1= ruleEvent )* 'end' 'commands' (lv_commands_4= ruleCommand )* 'end' (lv_states_6= ruleState )* ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject lv_events_1 = null;

        EObject lv_commands_4 = null;

        EObject lv_states_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:83:6: ( ( 'events' (lv_events_1= ruleEvent )* 'end' 'commands' (lv_commands_4= ruleCommand )* 'end' (lv_states_6= ruleState )* ) )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:84:1: ( 'events' (lv_events_1= ruleEvent )* 'end' 'commands' (lv_commands_4= ruleCommand )* 'end' (lv_states_6= ruleState )* )
            {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:84:1: ( 'events' (lv_events_1= ruleEvent )* 'end' 'commands' (lv_commands_4= ruleCommand )* 'end' (lv_states_6= ruleState )* )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:84:2: 'events' (lv_events_1= ruleEvent )* 'end' 'commands' (lv_commands_4= ruleCommand )* 'end' (lv_states_6= ruleState )*
            {
            match(input,11,FOLLOW_11_in_ruleStatemachine117); 

                    createLeafNode(grammarAccess.getStatemachineAccess().getEventsKeyword_0(), null); 
                
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:88:1: (lv_events_1= ruleEvent )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:91:6: lv_events_1= ruleEvent
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStatemachineAccess().getEventsEventParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleStatemachine151);
            	    lv_events_1=ruleEvent();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStatemachineRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "events", lv_events_1, "Event", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleStatemachine165); 

                    createLeafNode(grammarAccess.getStatemachineAccess().getEndKeyword_2(), null); 
                
            match(input,13,FOLLOW_13_in_ruleStatemachine174); 

                    createLeafNode(grammarAccess.getStatemachineAccess().getCommandsKeyword_3(), null); 
                
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:117:1: (lv_commands_4= ruleCommand )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:120:6: lv_commands_4= ruleCommand
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStatemachineAccess().getCommandsCommandParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleStatemachine208);
            	    lv_commands_4=ruleCommand();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStatemachineRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "commands", lv_commands_4, "Command", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleStatemachine222); 

                    createLeafNode(grammarAccess.getStatemachineAccess().getEndKeyword_5(), null); 
                
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:142:1: (lv_states_6= ruleState )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:145:6: lv_states_6= ruleState
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine256);
            	    lv_states_6=ruleState();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStatemachineRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "states", lv_states_6, "State", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end ruleStatemachine


    // $ANTLR start entryRuleEvent
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:170:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:170:47: (iv_ruleEvent= ruleEvent EOF )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:171:2: iv_ruleEvent= ruleEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent294);
            iv_ruleEvent=ruleEvent();
            _fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent304); 

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
    // $ANTLR end entryRuleEvent


    // $ANTLR start ruleEvent
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:178:1: ruleEvent returns [EObject current=null] : ( (lv_resetting_0= 'resetting' )? (lv_name_1= RULE_ID ) (lv_code_2= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_resetting_0=null;
        Token lv_name_1=null;
        Token lv_code_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:183:6: ( ( (lv_resetting_0= 'resetting' )? (lv_name_1= RULE_ID ) (lv_code_2= RULE_ID ) ) )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:184:1: ( (lv_resetting_0= 'resetting' )? (lv_name_1= RULE_ID ) (lv_code_2= RULE_ID ) )
            {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:184:1: ( (lv_resetting_0= 'resetting' )? (lv_name_1= RULE_ID ) (lv_code_2= RULE_ID ) )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:184:2: (lv_resetting_0= 'resetting' )? (lv_name_1= RULE_ID ) (lv_code_2= RULE_ID )
            {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:184:2: (lv_resetting_0= 'resetting' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:186:6: lv_resetting_0= 'resetting'
                    {
                    lv_resetting_0=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleEvent350); 

                            createLeafNode(grammarAccess.getEventAccess().getResettingResettingKeyword_0_0(), "resetting"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEventRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "resetting", true, "resetting", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:205:3: (lv_name_1= RULE_ID )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:207:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent386); 

            		createLeafNode(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:225:2: (lv_code_2= RULE_ID )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:227:6: lv_code_2= RULE_ID
            {
            lv_code_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent416); 

            		createLeafNode(grammarAccess.getEventAccess().getCodeIDTerminalRuleCall_2_0(), "code"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "code", lv_code_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

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
    // $ANTLR end ruleEvent


    // $ANTLR start entryRuleCommand
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:252:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:252:49: (iv_ruleCommand= ruleCommand EOF )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:253:2: iv_ruleCommand= ruleCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand457);
            iv_ruleCommand=ruleCommand();
            _fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand467); 

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
    // $ANTLR end entryRuleCommand


    // $ANTLR start ruleCommand
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:260:1: ruleCommand returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_code_1= RULE_ID ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_code_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:265:6: ( ( (lv_name_0= RULE_ID ) (lv_code_1= RULE_ID ) ) )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:266:1: ( (lv_name_0= RULE_ID ) (lv_code_1= RULE_ID ) )
            {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:266:1: ( (lv_name_0= RULE_ID ) (lv_code_1= RULE_ID ) )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:266:2: (lv_name_0= RULE_ID ) (lv_code_1= RULE_ID )
            {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:266:2: (lv_name_0= RULE_ID )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:268:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand514); 

            		createLeafNode(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:286:2: (lv_code_1= RULE_ID )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:288:6: lv_code_1= RULE_ID
            {
            lv_code_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand544); 

            		createLeafNode(grammarAccess.getCommandAccess().getCodeIDTerminalRuleCall_1_0(), "code"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "code", lv_code_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

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
    // $ANTLR end ruleCommand


    // $ANTLR start entryRuleState
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:313:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:313:47: (iv_ruleState= ruleState EOF )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:314:2: iv_ruleState= ruleState EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState585);
            iv_ruleState=ruleState();
            _fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState595); 

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
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:321:1: ruleState returns [EObject current=null] : ( 'state' (lv_name_1= RULE_ID ) ( 'actions' '{' ( RULE_ID )+ '}' )? (lv_transitions_6= ruleTransition )* 'end' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_transitions_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:326:6: ( ( 'state' (lv_name_1= RULE_ID ) ( 'actions' '{' ( RULE_ID )+ '}' )? (lv_transitions_6= ruleTransition )* 'end' ) )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:327:1: ( 'state' (lv_name_1= RULE_ID ) ( 'actions' '{' ( RULE_ID )+ '}' )? (lv_transitions_6= ruleTransition )* 'end' )
            {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:327:1: ( 'state' (lv_name_1= RULE_ID ) ( 'actions' '{' ( RULE_ID )+ '}' )? (lv_transitions_6= ruleTransition )* 'end' )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:327:2: 'state' (lv_name_1= RULE_ID ) ( 'actions' '{' ( RULE_ID )+ '}' )? (lv_transitions_6= ruleTransition )* 'end'
            {
            match(input,15,FOLLOW_15_in_ruleState629); 

                    createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0(), null); 
                
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:331:1: (lv_name_1= RULE_ID )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:333:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState651); 

            		createLeafNode(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:351:2: ( 'actions' '{' ( RULE_ID )+ '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:351:3: 'actions' '{' ( RULE_ID )+ '}'
                    {
                    match(input,16,FOLLOW_16_in_ruleState669); 

                            createLeafNode(grammarAccess.getStateAccess().getActionsKeyword_2_0(), null); 
                        
                    match(input,17,FOLLOW_17_in_ruleState678); 

                            createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2_1(), null); 
                        
                    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:359:1: ( RULE_ID )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:362:3: RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState700); 

                    	    		createLeafNode(grammarAccess.getStateAccess().getActionsCommandCrossReference_2_2_0(), "actions"); 
                    	    	

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match(input,18,FOLLOW_18_in_ruleState713); 

                            createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_2_3(), null); 
                        

                    }
                    break;

            }

            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:379:3: (lv_transitions_6= ruleTransition )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:382:6: lv_transitions_6= ruleTransition
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState749);
            	    lv_transitions_6=ruleTransition();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "transitions", lv_transitions_6, "Transition", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_ruleState763); 

                    createLeafNode(grammarAccess.getStateAccess().getEndKeyword_4(), null); 
                

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
    // $ANTLR end ruleState


    // $ANTLR start entryRuleTransition
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:411:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:411:52: (iv_ruleTransition= ruleTransition EOF )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:412:2: iv_ruleTransition= ruleTransition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition796);
            iv_ruleTransition=ruleTransition();
            _fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition806); 

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
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:419:1: ruleTransition returns [EObject current=null] : ( ( RULE_ID ) '=>' ( RULE_ID ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:424:6: ( ( ( RULE_ID ) '=>' ( RULE_ID ) ) )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:425:1: ( ( RULE_ID ) '=>' ( RULE_ID ) )
            {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:425:1: ( ( RULE_ID ) '=>' ( RULE_ID ) )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:425:2: ( RULE_ID ) '=>' ( RULE_ID )
            {
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:425:2: ( RULE_ID )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:428:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition853); 

            		createLeafNode(grammarAccess.getTransitionAccess().getEventEventCrossReference_0_0(), "event"); 
            	

            }

            match(input,19,FOLLOW_19_in_ruleTransition865); 

                    createLeafNode(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1(), null); 
                
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:445:1: ( RULE_ID )
            // ../org.eclipse.xtext.example.fowlerdsl/src-gen/org/eclipse/xtext/example/parser/antlr/internal/InternalFowlerDsl.g:448:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition887); 

            		createLeafNode(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0(), "state"); 
            	

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
    // $ANTLR end ruleTransition


 

    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatemachine117 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleStatemachine151 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine165 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatemachine174 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleStatemachine208 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine222 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine256 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEvent350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleState629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState651 = new BitSet(new long[]{0x0000000000011010L});
    public static final BitSet FOLLOW_16_in_ruleState669 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleState678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState700 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleState713 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState749 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleState763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition853 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransition865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition887 = new BitSet(new long[]{0x0000000000000002L});

}