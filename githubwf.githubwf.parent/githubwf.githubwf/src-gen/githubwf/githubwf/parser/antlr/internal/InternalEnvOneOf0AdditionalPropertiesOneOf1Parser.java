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
import githubwf.githubwf.services.EnvOneOf0AdditionalPropertiesOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnvOneOf0AdditionalPropertiesOneOf1Parser extends AbstractInternalAntlrParser {
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


        public InternalEnvOneOf0AdditionalPropertiesOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnvOneOf0AdditionalPropertiesOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g"; }



     	private EnvOneOf0AdditionalPropertiesOneOf1GrammarAccess grammarAccess;

        public InternalEnvOneOf0AdditionalPropertiesOneOf1Parser(TokenStream input, EnvOneOf0AdditionalPropertiesOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EnvOneOf0AdditionalPropertiesOneOf1";
       	}

       	@Override
       	protected EnvOneOf0AdditionalPropertiesOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesOneOf1"
    // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:57:1: entryRuleEnvOneOf0AdditionalPropertiesOneOf1 returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesOneOf1= ruleEnvOneOf0AdditionalPropertiesOneOf1 EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesOneOf1 = null;


        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:57:76: (iv_ruleEnvOneOf0AdditionalPropertiesOneOf1= ruleEnvOneOf0AdditionalPropertiesOneOf1 EOF )
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:58:2: iv_ruleEnvOneOf0AdditionalPropertiesOneOf1= ruleEnvOneOf0AdditionalPropertiesOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesOneOf1=ruleEnvOneOf0AdditionalPropertiesOneOf1();

            state._fsp--;

             current =iv_ruleEnvOneOf0AdditionalPropertiesOneOf1; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesOneOf1"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesOneOf1"
    // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:64:1: ruleEnvOneOf0AdditionalPropertiesOneOf1 returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesOneOf1() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:70:2: ( ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:71:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:71:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:72:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:72:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:73:4: lv_additionalProperties_0_0= ruleEDoubleObject
            {

            				newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf1Access().getAdditionalPropertiesEDoubleObjectParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEDoubleObject();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf1Rule());
            				}
            				set(
            					current,
            					"additionalProperties",
            					lv_additionalProperties_0_0,
            					"githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf1.EDoubleObject");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesOneOf1"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:93:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:93:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:94:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
             newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;

             current =iv_ruleEDoubleObject.getText(); 
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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:100:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:106:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:107:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:107:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_E_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_E_DOUBLE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:108:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf1Parser.g:116:3: this_E_DOUBLE_1= RULE_E_DOUBLE
                    {
                    this_E_DOUBLE_1=(Token)match(input,RULE_E_DOUBLE,FOLLOW_2); 

                    			current.merge(this_E_DOUBLE_1);
                    		

                    			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEDoubleObject"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}
