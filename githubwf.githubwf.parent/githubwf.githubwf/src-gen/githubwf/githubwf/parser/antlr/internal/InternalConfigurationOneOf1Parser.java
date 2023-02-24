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
import githubwf.githubwf.services.ConfigurationOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigurationOneOf1Parser extends AbstractInternalAntlrParser {
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


        public InternalConfigurationOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigurationOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigurationOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigurationOneOf1Parser.g"; }



     	private ConfigurationOneOf1GrammarAccess grammarAccess;

        public InternalConfigurationOneOf1Parser(TokenStream input, ConfigurationOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConfigurationOneOf1";
       	}

       	@Override
       	protected ConfigurationOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfigurationOneOf1"
    // InternalConfigurationOneOf1Parser.g:57:1: entryRuleConfigurationOneOf1 returns [EObject current=null] : iv_ruleConfigurationOneOf1= ruleConfigurationOneOf1 EOF ;
    public final EObject entryRuleConfigurationOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationOneOf1 = null;


        try {
            // InternalConfigurationOneOf1Parser.g:57:60: (iv_ruleConfigurationOneOf1= ruleConfigurationOneOf1 EOF )
            // InternalConfigurationOneOf1Parser.g:58:2: iv_ruleConfigurationOneOf1= ruleConfigurationOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getConfigurationOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationOneOf1=ruleConfigurationOneOf1();

            state._fsp--;

             current =iv_ruleConfigurationOneOf1; 
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
    // $ANTLR end "entryRuleConfigurationOneOf1"


    // $ANTLR start "ruleConfigurationOneOf1"
    // InternalConfigurationOneOf1Parser.g:64:1: ruleConfigurationOneOf1 returns [EObject current=null] : ( (lv_configuration_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleConfigurationOneOf1() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf1Parser.g:70:2: ( ( (lv_configuration_0_0= ruleEDoubleObject ) ) )
            // InternalConfigurationOneOf1Parser.g:71:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            {
            // InternalConfigurationOneOf1Parser.g:71:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            // InternalConfigurationOneOf1Parser.g:72:3: (lv_configuration_0_0= ruleEDoubleObject )
            {
            // InternalConfigurationOneOf1Parser.g:72:3: (lv_configuration_0_0= ruleEDoubleObject )
            // InternalConfigurationOneOf1Parser.g:73:4: lv_configuration_0_0= ruleEDoubleObject
            {

            				newCompositeNode(grammarAccess.getConfigurationOneOf1Access().getConfigurationEDoubleObjectParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEDoubleObject();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConfigurationOneOf1Rule());
            				}
            				set(
            					current,
            					"configuration",
            					lv_configuration_0_0,
            					"githubwf.githubwf.ConfigurationOneOf1.EDoubleObject");
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
    // $ANTLR end "ruleConfigurationOneOf1"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalConfigurationOneOf1Parser.g:93:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalConfigurationOneOf1Parser.g:93:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalConfigurationOneOf1Parser.g:94:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalConfigurationOneOf1Parser.g:100:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalConfigurationOneOf1Parser.g:106:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalConfigurationOneOf1Parser.g:107:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalConfigurationOneOf1Parser.g:107:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
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
                    // InternalConfigurationOneOf1Parser.g:108:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfigurationOneOf1Parser.g:116:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
