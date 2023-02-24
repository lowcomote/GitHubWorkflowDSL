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
import githubwf.githubwf.services.JobNeedsOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJobNeedsOneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=8;
    public static final int RULE_WS=11;
    public static final int RULE_E_INT=6;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_E_DOUBLE=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalJobNeedsOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJobNeedsOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJobNeedsOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalJobNeedsOneOf1Parser.g"; }



     	private JobNeedsOneOf1GrammarAccess grammarAccess;

        public InternalJobNeedsOneOf1Parser(TokenStream input, JobNeedsOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JobNeedsOneOf1";
       	}

       	@Override
       	protected JobNeedsOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJobNeedsOneOf1"
    // InternalJobNeedsOneOf1Parser.g:57:1: entryRuleJobNeedsOneOf1 returns [EObject current=null] : iv_ruleJobNeedsOneOf1= ruleJobNeedsOneOf1 EOF ;
    public final EObject entryRuleJobNeedsOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsOneOf1 = null;


        try {
            // InternalJobNeedsOneOf1Parser.g:57:55: (iv_ruleJobNeedsOneOf1= ruleJobNeedsOneOf1 EOF )
            // InternalJobNeedsOneOf1Parser.g:58:2: iv_ruleJobNeedsOneOf1= ruleJobNeedsOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getJobNeedsOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsOneOf1=ruleJobNeedsOneOf1();

            state._fsp--;

             current =iv_ruleJobNeedsOneOf1; 
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
    // $ANTLR end "entryRuleJobNeedsOneOf1"


    // $ANTLR start "ruleJobNeedsOneOf1"
    // InternalJobNeedsOneOf1Parser.g:64:1: ruleJobNeedsOneOf1 returns [EObject current=null] : ( (lv_jobNeeds_0_0= ruleName ) ) ;
    public final EObject ruleJobNeedsOneOf1() throws RecognitionException {
        EObject current = null;

        EObject lv_jobNeeds_0_0 = null;



        	enterRule();

        try {
            // InternalJobNeedsOneOf1Parser.g:70:2: ( ( (lv_jobNeeds_0_0= ruleName ) ) )
            // InternalJobNeedsOneOf1Parser.g:71:2: ( (lv_jobNeeds_0_0= ruleName ) )
            {
            // InternalJobNeedsOneOf1Parser.g:71:2: ( (lv_jobNeeds_0_0= ruleName ) )
            // InternalJobNeedsOneOf1Parser.g:72:3: (lv_jobNeeds_0_0= ruleName )
            {
            // InternalJobNeedsOneOf1Parser.g:72:3: (lv_jobNeeds_0_0= ruleName )
            // InternalJobNeedsOneOf1Parser.g:73:4: lv_jobNeeds_0_0= ruleName
            {

            				newCompositeNode(grammarAccess.getJobNeedsOneOf1Access().getJobNeedsNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_jobNeeds_0_0=ruleName();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJobNeedsOneOf1Rule());
            				}
            				set(
            					current,
            					"jobNeeds",
            					lv_jobNeeds_0_0,
            					"githubwf.githubwf.JobNeedsOneOf1.Name");
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
    // $ANTLR end "ruleJobNeedsOneOf1"


    // $ANTLR start "entryRuleName"
    // InternalJobNeedsOneOf1Parser.g:93:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalJobNeedsOneOf1Parser.g:93:45: (iv_ruleName= ruleName EOF )
            // InternalJobNeedsOneOf1Parser.g:94:2: iv_ruleName= ruleName EOF
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
    // InternalJobNeedsOneOf1Parser.g:100:1: ruleName returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalJobNeedsOneOf1Parser.g:106:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalJobNeedsOneOf1Parser.g:107:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalJobNeedsOneOf1Parser.g:107:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalJobNeedsOneOf1Parser.g:108:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalJobNeedsOneOf1Parser.g:108:3: ()
            // InternalJobNeedsOneOf1Parser.g:109:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameAccess().getNameAction_0(),
            					current);
            			

            }

            // InternalJobNeedsOneOf1Parser.g:115:3: ( (lv_name_1_0= ruleEString ) )
            // InternalJobNeedsOneOf1Parser.g:116:4: (lv_name_1_0= ruleEString )
            {
            // InternalJobNeedsOneOf1Parser.g:116:4: (lv_name_1_0= ruleEString )
            // InternalJobNeedsOneOf1Parser.g:117:5: lv_name_1_0= ruleEString
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
            						"githubwf.githubwf.JobNeedsOneOf1.EString");
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
    // InternalJobNeedsOneOf1Parser.g:138:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJobNeedsOneOf1Parser.g:138:47: (iv_ruleEString= ruleEString EOF )
            // InternalJobNeedsOneOf1Parser.g:139:2: iv_ruleEString= ruleEString EOF
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
    // InternalJobNeedsOneOf1Parser.g:145:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalJobNeedsOneOf1Parser.g:151:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalJobNeedsOneOf1Parser.g:152:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalJobNeedsOneOf1Parser.g:165:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalJobNeedsOneOf1Parser.g:165:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalJobNeedsOneOf1Parser.g:166:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalJobNeedsOneOf1Parser.g:172:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalJobNeedsOneOf1Parser.g:178:2: (this_STRING_0= RULE_STRING )
            // InternalJobNeedsOneOf1Parser.g:179:2: this_STRING_0= RULE_STRING
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

}
