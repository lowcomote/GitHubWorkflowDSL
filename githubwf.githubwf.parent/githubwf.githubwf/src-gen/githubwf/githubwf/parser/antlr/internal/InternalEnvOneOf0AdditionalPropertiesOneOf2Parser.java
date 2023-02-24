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
import githubwf.githubwf.services.EnvOneOf0AdditionalPropertiesOneOf2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnvOneOf0AdditionalPropertiesOneOf2Parser extends AbstractInternalAntlrParser {
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


        public InternalEnvOneOf0AdditionalPropertiesOneOf2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnvOneOf0AdditionalPropertiesOneOf2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g"; }



     	private EnvOneOf0AdditionalPropertiesOneOf2GrammarAccess grammarAccess;

        public InternalEnvOneOf0AdditionalPropertiesOneOf2Parser(TokenStream input, EnvOneOf0AdditionalPropertiesOneOf2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EnvOneOf0AdditionalPropertiesOneOf2";
       	}

       	@Override
       	protected EnvOneOf0AdditionalPropertiesOneOf2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesOneOf2"
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:57:1: entryRuleEnvOneOf0AdditionalPropertiesOneOf2 returns [EObject current=null] : iv_ruleEnvOneOf0AdditionalPropertiesOneOf2= ruleEnvOneOf0AdditionalPropertiesOneOf2 EOF ;
    public final EObject entryRuleEnvOneOf0AdditionalPropertiesOneOf2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvOneOf0AdditionalPropertiesOneOf2 = null;


        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:57:76: (iv_ruleEnvOneOf0AdditionalPropertiesOneOf2= ruleEnvOneOf0AdditionalPropertiesOneOf2 EOF )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:58:2: iv_ruleEnvOneOf0AdditionalPropertiesOneOf2= ruleEnvOneOf0AdditionalPropertiesOneOf2 EOF
            {
             newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvOneOf0AdditionalPropertiesOneOf2=ruleEnvOneOf0AdditionalPropertiesOneOf2();

            state._fsp--;

             current =iv_ruleEnvOneOf0AdditionalPropertiesOneOf2; 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesOneOf2"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesOneOf2"
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:64:1: ruleEnvOneOf0AdditionalPropertiesOneOf2 returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleEnvOneOf0AdditionalPropertiesOneOf2() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:70:2: ( ( (lv_additionalProperties_0_0= ruleEBooleanObject ) ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:71:2: ( (lv_additionalProperties_0_0= ruleEBooleanObject ) )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:71:2: ( (lv_additionalProperties_0_0= ruleEBooleanObject ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:72:3: (lv_additionalProperties_0_0= ruleEBooleanObject )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:72:3: (lv_additionalProperties_0_0= ruleEBooleanObject )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:73:4: lv_additionalProperties_0_0= ruleEBooleanObject
            {

            				newCompositeNode(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf2Access().getAdditionalPropertiesEBooleanObjectParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEBooleanObject();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf2Rule());
            				}
            				set(
            					current,
            					"additionalProperties",
            					lv_additionalProperties_0_0,
            					"githubwf.githubwf.EnvOneOf0AdditionalPropertiesOneOf2.EBooleanObject");
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesOneOf2"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:93:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:93:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:94:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:100:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:106:2: ( (kw= True | kw= False ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:107:2: (kw= True | kw= False )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:107:2: (kw= True | kw= False )
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
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:108:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:114:3: kw= False
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
