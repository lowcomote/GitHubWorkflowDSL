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
import githubwf.githubwf.services.ConfigurationOneOf2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigurationOneOf2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "True", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int True=5;
    public static final int RULE_E_INT=8;
    public static final int RULE_STRING=7;
    public static final int False=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_E_DOUBLE=9;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalConfigurationOneOf2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigurationOneOf2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigurationOneOf2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigurationOneOf2Parser.g"; }



     	private ConfigurationOneOf2GrammarAccess grammarAccess;

        public InternalConfigurationOneOf2Parser(TokenStream input, ConfigurationOneOf2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConfigurationOneOf2";
       	}

       	@Override
       	protected ConfigurationOneOf2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfigurationOneOf2"
    // InternalConfigurationOneOf2Parser.g:57:1: entryRuleConfigurationOneOf2 returns [EObject current=null] : iv_ruleConfigurationOneOf2= ruleConfigurationOneOf2 EOF ;
    public final EObject entryRuleConfigurationOneOf2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationOneOf2 = null;


        try {
            // InternalConfigurationOneOf2Parser.g:57:60: (iv_ruleConfigurationOneOf2= ruleConfigurationOneOf2 EOF )
            // InternalConfigurationOneOf2Parser.g:58:2: iv_ruleConfigurationOneOf2= ruleConfigurationOneOf2 EOF
            {
             newCompositeNode(grammarAccess.getConfigurationOneOf2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationOneOf2=ruleConfigurationOneOf2();

            state._fsp--;

             current =iv_ruleConfigurationOneOf2; 
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
    // $ANTLR end "entryRuleConfigurationOneOf2"


    // $ANTLR start "ruleConfigurationOneOf2"
    // InternalConfigurationOneOf2Parser.g:64:1: ruleConfigurationOneOf2 returns [EObject current=null] : ( (lv_configuration_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleConfigurationOneOf2() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalConfigurationOneOf2Parser.g:70:2: ( ( (lv_configuration_0_0= ruleEBooleanObject ) ) )
            // InternalConfigurationOneOf2Parser.g:71:2: ( (lv_configuration_0_0= ruleEBooleanObject ) )
            {
            // InternalConfigurationOneOf2Parser.g:71:2: ( (lv_configuration_0_0= ruleEBooleanObject ) )
            // InternalConfigurationOneOf2Parser.g:72:3: (lv_configuration_0_0= ruleEBooleanObject )
            {
            // InternalConfigurationOneOf2Parser.g:72:3: (lv_configuration_0_0= ruleEBooleanObject )
            // InternalConfigurationOneOf2Parser.g:73:4: lv_configuration_0_0= ruleEBooleanObject
            {

            				newCompositeNode(grammarAccess.getConfigurationOneOf2Access().getConfigurationEBooleanObjectParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEBooleanObject();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConfigurationOneOf2Rule());
            				}
            				set(
            					current,
            					"configuration",
            					lv_configuration_0_0,
            					"githubwf.githubwf.ConfigurationOneOf2.EBooleanObject");
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
    // $ANTLR end "ruleConfigurationOneOf2"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalConfigurationOneOf2Parser.g:93:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalConfigurationOneOf2Parser.g:93:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalConfigurationOneOf2Parser.g:94:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
            {
             newCompositeNode(grammarAccess.getEBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBooleanObject=ruleEBooleanObject();

            state._fsp--;

             current =iv_ruleEBooleanObject.getText(); 
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
    // $ANTLR end "entryRuleEBooleanObject"


    // $ANTLR start "ruleEBooleanObject"
    // InternalConfigurationOneOf2Parser.g:100:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConfigurationOneOf2Parser.g:106:2: ( (kw= True | kw= False ) )
            // InternalConfigurationOneOf2Parser.g:107:2: (kw= True | kw= False )
            {
            // InternalConfigurationOneOf2Parser.g:107:2: (kw= True | kw= False )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==True) ) {
                alt1=1;
            }
            else if ( (LA1_0==False) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalConfigurationOneOf2Parser.g:108:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfigurationOneOf2Parser.g:114:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBooleanObject"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}
