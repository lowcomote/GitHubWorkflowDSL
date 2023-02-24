package githubwf.githubwf.parser.antlr.internal;

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
import githubwf.githubwf.services.RefOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRefOneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Null", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=4;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_E_INT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_E_DOUBLE=8;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRefOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRefOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRefOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalRefOneOf1Parser.g"; }



     	private RefOneOf1GrammarAccess grammarAccess;

        public InternalRefOneOf1Parser(TokenStream input, RefOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RefOneOf1";
       	}

       	@Override
       	protected RefOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRefOneOf1"
    // InternalRefOneOf1Parser.g:58:1: entryRuleRefOneOf1 returns [EObject current=null] : iv_ruleRefOneOf1= ruleRefOneOf1 EOF ;
    public final EObject entryRuleRefOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf1 = null;


        try {
            // InternalRefOneOf1Parser.g:58:50: (iv_ruleRefOneOf1= ruleRefOneOf1 EOF )
            // InternalRefOneOf1Parser.g:59:2: iv_ruleRefOneOf1= ruleRefOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getRefOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf1=ruleRefOneOf1();

            state._fsp--;

             current =iv_ruleRefOneOf1; 
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
    // $ANTLR end "entryRuleRefOneOf1"


    // $ANTLR start "ruleRefOneOf1"
    // InternalRefOneOf1Parser.g:65:1: ruleRefOneOf1 returns [EObject current=null] : ( (lv_ref_0_0= ruleNullValue ) ) ;
    public final EObject ruleRefOneOf1() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf1Parser.g:71:2: ( ( (lv_ref_0_0= ruleNullValue ) ) )
            // InternalRefOneOf1Parser.g:72:2: ( (lv_ref_0_0= ruleNullValue ) )
            {
            // InternalRefOneOf1Parser.g:72:2: ( (lv_ref_0_0= ruleNullValue ) )
            // InternalRefOneOf1Parser.g:73:3: (lv_ref_0_0= ruleNullValue )
            {
            // InternalRefOneOf1Parser.g:73:3: (lv_ref_0_0= ruleNullValue )
            // InternalRefOneOf1Parser.g:74:4: lv_ref_0_0= ruleNullValue
            {

            				newCompositeNode(grammarAccess.getRefOneOf1Access().getRefNullValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ref_0_0=ruleNullValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRefOneOf1Rule());
            				}
            				set(
            					current,
            					"ref",
            					lv_ref_0_0,
            					"githubwf.githubwf.RefOneOf1.NullValue");
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
    // $ANTLR end "ruleRefOneOf1"


    // $ANTLR start "entryRuleNullValue"
    // InternalRefOneOf1Parser.g:94:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalRefOneOf1Parser.g:94:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalRefOneOf1Parser.g:95:2: iv_ruleNullValue= ruleNullValue EOF
            {
             newCompositeNode(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;

             current =iv_ruleNullValue; 
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
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalRefOneOf1Parser.g:101:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf1Parser.g:107:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalRefOneOf1Parser.g:108:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalRefOneOf1Parser.g:108:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalRefOneOf1Parser.g:109:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalRefOneOf1Parser.g:109:3: (lv_value_0_0= ruleNullEnum )
            // InternalRefOneOf1Parser.g:110:4: lv_value_0_0= ruleNullEnum
            {

            				newCompositeNode(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNullEnum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNullValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"githubwf.githubwf.RefOneOf1.NullEnum");
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
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "ruleNullEnum"
    // InternalRefOneOf1Parser.g:130:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRefOneOf1Parser.g:136:2: ( (enumLiteral_0= Null ) )
            // InternalRefOneOf1Parser.g:137:2: (enumLiteral_0= Null )
            {
            // InternalRefOneOf1Parser.g:137:2: (enumLiteral_0= Null )
            // InternalRefOneOf1Parser.g:138:3: enumLiteral_0= Null
            {
            enumLiteral_0=(Token)match(input,Null,FOLLOW_2); 

            			current = grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleNullEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}
