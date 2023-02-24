package githubwf.githubwf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import githubwf.githubwf.services.JobNeedsOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJobNeedsOneOf0Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Comma", "LeftSquareBracket", "RightSquareBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=11;
    public static final int RULE_WS=14;
    public static final int RULE_E_INT=9;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_SL_COMMENT=13;
    public static final int Comma=4;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=12;
    public static final int LeftSquareBracket=5;
    public static final int RULE_E_DOUBLE=10;
    public static final int EOF=-1;
    public static final int RightSquareBracket=6;

    // delegates
    // delegators


        public InternalJobNeedsOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJobNeedsOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJobNeedsOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalJobNeedsOneOf0Parser.g"; }



     	private JobNeedsOneOf0GrammarAccess grammarAccess;

        public InternalJobNeedsOneOf0Parser(TokenStream input, JobNeedsOneOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JobNeedsOneOf0";
       	}

       	@Override
       	protected JobNeedsOneOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJobNeedsOneOf0"
    // InternalJobNeedsOneOf0Parser.g:57:1: entryRuleJobNeedsOneOf0 returns [EObject current=null] : iv_ruleJobNeedsOneOf0= ruleJobNeedsOneOf0 EOF ;
    public final EObject entryRuleJobNeedsOneOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsOneOf0 = null;


        try {
            // InternalJobNeedsOneOf0Parser.g:57:55: (iv_ruleJobNeedsOneOf0= ruleJobNeedsOneOf0 EOF )
            // InternalJobNeedsOneOf0Parser.g:58:2: iv_ruleJobNeedsOneOf0= ruleJobNeedsOneOf0 EOF
            {
             newCompositeNode(grammarAccess.getJobNeedsOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsOneOf0=ruleJobNeedsOneOf0();

            state._fsp--;

             current =iv_ruleJobNeedsOneOf0; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJobNeedsOneOf0"


    // $ANTLR start "ruleJobNeedsOneOf0"
    // InternalJobNeedsOneOf0Parser.g:64:1: ruleJobNeedsOneOf0 returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_jobNeeds_1_0= ruleJobNeedsOneOf0Items ) ) (otherlv_2= Comma ( (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleJobNeedsOneOf0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_jobNeeds_1_0 = null;

        EObject lv_jobNeeds_3_0 = null;



        	enterRule();

        try {
            // InternalJobNeedsOneOf0Parser.g:70:2: ( (otherlv_0= LeftSquareBracket ( (lv_jobNeeds_1_0= ruleJobNeedsOneOf0Items ) ) (otherlv_2= Comma ( (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalJobNeedsOneOf0Parser.g:71:2: (otherlv_0= LeftSquareBracket ( (lv_jobNeeds_1_0= ruleJobNeedsOneOf0Items ) ) (otherlv_2= Comma ( (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalJobNeedsOneOf0Parser.g:71:2: (otherlv_0= LeftSquareBracket ( (lv_jobNeeds_1_0= ruleJobNeedsOneOf0Items ) ) (otherlv_2= Comma ( (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items ) ) )* otherlv_4= RightSquareBracket )
            // InternalJobNeedsOneOf0Parser.g:72:3: otherlv_0= LeftSquareBracket ( (lv_jobNeeds_1_0= ruleJobNeedsOneOf0Items ) ) (otherlv_2= Comma ( (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJobNeedsOneOf0Access().getLeftSquareBracketKeyword_0());
            		
            // InternalJobNeedsOneOf0Parser.g:76:3: ( (lv_jobNeeds_1_0= ruleJobNeedsOneOf0Items ) )
            // InternalJobNeedsOneOf0Parser.g:77:4: (lv_jobNeeds_1_0= ruleJobNeedsOneOf0Items )
            {
            // InternalJobNeedsOneOf0Parser.g:77:4: (lv_jobNeeds_1_0= ruleJobNeedsOneOf0Items )
            // InternalJobNeedsOneOf0Parser.g:78:5: lv_jobNeeds_1_0= ruleJobNeedsOneOf0Items
            {

            					newCompositeNode(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_jobNeeds_1_0=ruleJobNeedsOneOf0Items();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobNeedsOneOf0Rule());
            					}
            					add(
            						current,
            						"jobNeeds",
            						lv_jobNeeds_1_0,
            						"githubwf.githubwf.JobNeedsOneOf0.JobNeedsOneOf0Items");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJobNeedsOneOf0Parser.g:95:3: (otherlv_2= Comma ( (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comma) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJobNeedsOneOf0Parser.g:96:4: otherlv_2= Comma ( (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getJobNeedsOneOf0Access().getCommaKeyword_2_0());
            	    			
            	    // InternalJobNeedsOneOf0Parser.g:100:4: ( (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items ) )
            	    // InternalJobNeedsOneOf0Parser.g:101:5: (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items )
            	    {
            	    // InternalJobNeedsOneOf0Parser.g:101:5: (lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items )
            	    // InternalJobNeedsOneOf0Parser.g:102:6: lv_jobNeeds_3_0= ruleJobNeedsOneOf0Items
            	    {

            	    						newCompositeNode(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_jobNeeds_3_0=ruleJobNeedsOneOf0Items();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJobNeedsOneOf0Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"jobNeeds",
            	    							lv_jobNeeds_3_0,
            	    							"githubwf.githubwf.JobNeedsOneOf0.JobNeedsOneOf0Items");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJobNeedsOneOf0Access().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleJobNeedsOneOf0"


    // $ANTLR start "entryRuleJobNeedsOneOf0Items"
    // InternalJobNeedsOneOf0Parser.g:128:1: entryRuleJobNeedsOneOf0Items returns [EObject current=null] : iv_ruleJobNeedsOneOf0Items= ruleJobNeedsOneOf0Items EOF ;
    public final EObject entryRuleJobNeedsOneOf0Items() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsOneOf0Items = null;


        try {
            // InternalJobNeedsOneOf0Parser.g:128:60: (iv_ruleJobNeedsOneOf0Items= ruleJobNeedsOneOf0Items EOF )
            // InternalJobNeedsOneOf0Parser.g:129:2: iv_ruleJobNeedsOneOf0Items= ruleJobNeedsOneOf0Items EOF
            {
             newCompositeNode(grammarAccess.getJobNeedsOneOf0ItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsOneOf0Items=ruleJobNeedsOneOf0Items();

            state._fsp--;

             current =iv_ruleJobNeedsOneOf0Items; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJobNeedsOneOf0Items"


    // $ANTLR start "ruleJobNeedsOneOf0Items"
    // InternalJobNeedsOneOf0Parser.g:135:1: ruleJobNeedsOneOf0Items returns [EObject current=null] : ( (lv_items_0_0= ruleName ) ) ;
    public final EObject ruleJobNeedsOneOf0Items() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalJobNeedsOneOf0Parser.g:141:2: ( ( (lv_items_0_0= ruleName ) ) )
            // InternalJobNeedsOneOf0Parser.g:142:2: ( (lv_items_0_0= ruleName ) )
            {
            // InternalJobNeedsOneOf0Parser.g:142:2: ( (lv_items_0_0= ruleName ) )
            // InternalJobNeedsOneOf0Parser.g:143:3: (lv_items_0_0= ruleName )
            {
            // InternalJobNeedsOneOf0Parser.g:143:3: (lv_items_0_0= ruleName )
            // InternalJobNeedsOneOf0Parser.g:144:4: lv_items_0_0= ruleName
            {

            				newCompositeNode(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJobNeedsOneOf0ItemsRule());
            				}
            				set(
            					current,
            					"items",
            					lv_items_0_0,
            					"githubwf.githubwf.JobNeedsOneOf0.Name");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleJobNeedsOneOf0Items"


    // $ANTLR start "entryRuleName"
    // InternalJobNeedsOneOf0Parser.g:164:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalJobNeedsOneOf0Parser.g:164:45: (iv_ruleName= ruleName EOF )
            // InternalJobNeedsOneOf0Parser.g:165:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalJobNeedsOneOf0Parser.g:171:1: ruleName returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalJobNeedsOneOf0Parser.g:177:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalJobNeedsOneOf0Parser.g:178:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalJobNeedsOneOf0Parser.g:178:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalJobNeedsOneOf0Parser.g:179:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalJobNeedsOneOf0Parser.g:179:3: ()
            // InternalJobNeedsOneOf0Parser.g:180:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameAccess().getNameAction_0(),
            					current);
            			

            }

            // InternalJobNeedsOneOf0Parser.g:186:3: ( (lv_name_1_0= ruleEString ) )
            // InternalJobNeedsOneOf0Parser.g:187:4: (lv_name_1_0= ruleEString )
            {
            // InternalJobNeedsOneOf0Parser.g:187:4: (lv_name_1_0= ruleEString )
            // InternalJobNeedsOneOf0Parser.g:188:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNameAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"githubwf.githubwf.JobNeedsOneOf0.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleEString"
    // InternalJobNeedsOneOf0Parser.g:209:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJobNeedsOneOf0Parser.g:209:47: (iv_ruleEString= ruleEString EOF )
            // InternalJobNeedsOneOf0Parser.g:210:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalJobNeedsOneOf0Parser.g:216:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalJobNeedsOneOf0Parser.g:222:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalJobNeedsOneOf0Parser.g:223:2: this_VALID_STRING_0= ruleVALID_STRING
            {

            		newCompositeNode(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_VALID_STRING_0=ruleVALID_STRING();

            state._fsp--;


            		current.merge(this_VALID_STRING_0);
            	

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalJobNeedsOneOf0Parser.g:236:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalJobNeedsOneOf0Parser.g:236:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalJobNeedsOneOf0Parser.g:237:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
            {
             newCompositeNode(grammarAccess.getVALID_STRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALID_STRING=ruleVALID_STRING();

            state._fsp--;

             current =iv_ruleVALID_STRING.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVALID_STRING"


    // $ANTLR start "ruleVALID_STRING"
    // InternalJobNeedsOneOf0Parser.g:243:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalJobNeedsOneOf0Parser.g:249:2: (this_STRING_0= RULE_STRING )
            // InternalJobNeedsOneOf0Parser.g:250:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleVALID_STRING"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000050L});

}
