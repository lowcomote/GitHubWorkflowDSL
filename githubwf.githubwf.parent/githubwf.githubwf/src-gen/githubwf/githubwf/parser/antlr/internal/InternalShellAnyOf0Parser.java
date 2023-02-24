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
import githubwf.githubwf.services.ShellAnyOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShellAnyOf0Parser extends AbstractInternalAntlrParser {
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


        public InternalShellAnyOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShellAnyOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShellAnyOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalShellAnyOf0Parser.g"; }



     	private ShellAnyOf0GrammarAccess grammarAccess;

        public InternalShellAnyOf0Parser(TokenStream input, ShellAnyOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ShellAnyOf0";
       	}

       	@Override
       	protected ShellAnyOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleShellAnyOf0"
    // InternalShellAnyOf0Parser.g:57:1: entryRuleShellAnyOf0 returns [EObject current=null] : iv_ruleShellAnyOf0= ruleShellAnyOf0 EOF ;
    public final EObject entryRuleShellAnyOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellAnyOf0 = null;


        try {
            // InternalShellAnyOf0Parser.g:57:52: (iv_ruleShellAnyOf0= ruleShellAnyOf0 EOF )
            // InternalShellAnyOf0Parser.g:58:2: iv_ruleShellAnyOf0= ruleShellAnyOf0 EOF
            {
             newCompositeNode(grammarAccess.getShellAnyOf0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShellAnyOf0=ruleShellAnyOf0();

            state._fsp--;

             current =iv_ruleShellAnyOf0; 
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
    // $ANTLR end "entryRuleShellAnyOf0"


    // $ANTLR start "ruleShellAnyOf0"
    // InternalShellAnyOf0Parser.g:64:1: ruleShellAnyOf0 returns [EObject current=null] : ( (lv_shell_0_0= ruleEString ) ) ;
    public final EObject ruleShellAnyOf0() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalShellAnyOf0Parser.g:70:2: ( ( (lv_shell_0_0= ruleEString ) ) )
            // InternalShellAnyOf0Parser.g:71:2: ( (lv_shell_0_0= ruleEString ) )
            {
            // InternalShellAnyOf0Parser.g:71:2: ( (lv_shell_0_0= ruleEString ) )
            // InternalShellAnyOf0Parser.g:72:3: (lv_shell_0_0= ruleEString )
            {
            // InternalShellAnyOf0Parser.g:72:3: (lv_shell_0_0= ruleEString )
            // InternalShellAnyOf0Parser.g:73:4: lv_shell_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getShellAnyOf0Access().getShellEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getShellAnyOf0Rule());
            				}
            				set(
            					current,
            					"shell",
            					lv_shell_0_0,
            					"githubwf.githubwf.ShellAnyOf0.EString");
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
    // $ANTLR end "ruleShellAnyOf0"


    // $ANTLR start "entryRuleEString"
    // InternalShellAnyOf0Parser.g:93:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalShellAnyOf0Parser.g:93:47: (iv_ruleEString= ruleEString EOF )
            // InternalShellAnyOf0Parser.g:94:2: iv_ruleEString= ruleEString EOF
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
    // InternalShellAnyOf0Parser.g:100:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalShellAnyOf0Parser.g:106:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalShellAnyOf0Parser.g:107:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalShellAnyOf0Parser.g:120:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalShellAnyOf0Parser.g:120:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalShellAnyOf0Parser.g:121:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalShellAnyOf0Parser.g:127:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalShellAnyOf0Parser.g:133:2: (this_STRING_0= RULE_STRING )
            // InternalShellAnyOf0Parser.g:134:2: this_STRING_0= RULE_STRING
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
