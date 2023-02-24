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
import githubwf.githubwf.services.EnvOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnvOneOf1Parser extends AbstractInternalAntlrParser {
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


        public InternalEnvOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnvOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnvOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnvOneOf1Parser.g"; }



     	private EnvOneOf1GrammarAccess grammarAccess;

        public InternalEnvOneOf1Parser(TokenStream input, EnvOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EnvOneOf1";
       	}

       	@Override
       	protected EnvOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEnvOneOf1"
    // InternalEnvOneOf1Parser.g:57:1: entryRuleEnvOneOf1 returns [EObject current=null] : iv_ruleEnvOneOf1= ruleEnvOneOf1 EOF ;
    public final EObject entryRuleEnvOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf1 = null;


        try {
            // InternalEnvOneOf1Parser.g:57:50: (iv_ruleEnvOneOf1= ruleEnvOneOf1 EOF )
            // InternalEnvOneOf1Parser.g:58:2: iv_ruleEnvOneOf1= ruleEnvOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getEnvOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf1=ruleEnvOneOf1();

            state._fsp--;

             current =iv_ruleEnvOneOf1; 
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
    // $ANTLR end "entryRuleEnvOneOf1"


    // $ANTLR start "ruleEnvOneOf1"
    // InternalEnvOneOf1Parser.g:64:1: ruleEnvOneOf1 returns [EObject current=null] : ( (lv_env_0_0= ruleStringContainingExpressionSyntax ) ) ;
    public final EObject ruleEnvOneOf1() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf1Parser.g:70:2: ( ( (lv_env_0_0= ruleStringContainingExpressionSyntax ) ) )
            // InternalEnvOneOf1Parser.g:71:2: ( (lv_env_0_0= ruleStringContainingExpressionSyntax ) )
            {
            // InternalEnvOneOf1Parser.g:71:2: ( (lv_env_0_0= ruleStringContainingExpressionSyntax ) )
            // InternalEnvOneOf1Parser.g:72:3: (lv_env_0_0= ruleStringContainingExpressionSyntax )
            {
            // InternalEnvOneOf1Parser.g:72:3: (lv_env_0_0= ruleStringContainingExpressionSyntax )
            // InternalEnvOneOf1Parser.g:73:4: lv_env_0_0= ruleStringContainingExpressionSyntax
            {

            				newCompositeNode(grammarAccess.getEnvOneOf1Access().getEnvStringContainingExpressionSyntaxParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleStringContainingExpressionSyntax();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEnvOneOf1Rule());
            				}
            				set(
            					current,
            					"env",
            					lv_env_0_0,
            					"githubwf.githubwf.EnvOneOf1.StringContainingExpressionSyntax");
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
    // $ANTLR end "ruleEnvOneOf1"


    // $ANTLR start "entryRuleStringContainingExpressionSyntax"
    // InternalEnvOneOf1Parser.g:93:1: entryRuleStringContainingExpressionSyntax returns [EObject current=null] : iv_ruleStringContainingExpressionSyntax= ruleStringContainingExpressionSyntax EOF ;
    public final EObject entryRuleStringContainingExpressionSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringContainingExpressionSyntax = null;


        try {
            // InternalEnvOneOf1Parser.g:93:73: (iv_ruleStringContainingExpressionSyntax= ruleStringContainingExpressionSyntax EOF )
            // InternalEnvOneOf1Parser.g:94:2: iv_ruleStringContainingExpressionSyntax= ruleStringContainingExpressionSyntax EOF
            {
             newCompositeNode(grammarAccess.getStringContainingExpressionSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringContainingExpressionSyntax=ruleStringContainingExpressionSyntax();

            state._fsp--;

             current =iv_ruleStringContainingExpressionSyntax; 
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
    // $ANTLR end "entryRuleStringContainingExpressionSyntax"


    // $ANTLR start "ruleStringContainingExpressionSyntax"
    // InternalEnvOneOf1Parser.g:100:1: ruleStringContainingExpressionSyntax returns [EObject current=null] : ( (lv_stringContainingExpressionSyntax_0_0= ruleEString ) ) ;
    public final EObject ruleStringContainingExpressionSyntax() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_stringContainingExpressionSyntax_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf1Parser.g:106:2: ( ( (lv_stringContainingExpressionSyntax_0_0= ruleEString ) ) )
            // InternalEnvOneOf1Parser.g:107:2: ( (lv_stringContainingExpressionSyntax_0_0= ruleEString ) )
            {
            // InternalEnvOneOf1Parser.g:107:2: ( (lv_stringContainingExpressionSyntax_0_0= ruleEString ) )
            // InternalEnvOneOf1Parser.g:108:3: (lv_stringContainingExpressionSyntax_0_0= ruleEString )
            {
            // InternalEnvOneOf1Parser.g:108:3: (lv_stringContainingExpressionSyntax_0_0= ruleEString )
            // InternalEnvOneOf1Parser.g:109:4: lv_stringContainingExpressionSyntax_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_stringContainingExpressionSyntax_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringContainingExpressionSyntaxRule());
            				}
            				set(
            					current,
            					"stringContainingExpressionSyntax",
            					lv_stringContainingExpressionSyntax_0_0,
            					"githubwf.githubwf.EnvOneOf1.EString");
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
    // $ANTLR end "ruleStringContainingExpressionSyntax"


    // $ANTLR start "entryRuleEString"
    // InternalEnvOneOf1Parser.g:129:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEnvOneOf1Parser.g:129:47: (iv_ruleEString= ruleEString EOF )
            // InternalEnvOneOf1Parser.g:130:2: iv_ruleEString= ruleEString EOF
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
    // InternalEnvOneOf1Parser.g:136:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf1Parser.g:142:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalEnvOneOf1Parser.g:143:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalEnvOneOf1Parser.g:156:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalEnvOneOf1Parser.g:156:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalEnvOneOf1Parser.g:157:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalEnvOneOf1Parser.g:163:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalEnvOneOf1Parser.g:169:2: (this_STRING_0= RULE_STRING )
            // InternalEnvOneOf1Parser.g:170:2: this_STRING_0= RULE_STRING
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
