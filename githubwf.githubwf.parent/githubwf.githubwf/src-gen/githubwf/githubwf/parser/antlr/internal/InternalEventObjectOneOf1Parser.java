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
import githubwf.githubwf.services.EventObjectOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventObjectOneOf1Parser extends AbstractInternalAntlrParser {
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


        public InternalEventObjectOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventObjectOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventObjectOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEventObjectOneOf1Parser.g"; }



     	private EventObjectOneOf1GrammarAccess grammarAccess;

        public InternalEventObjectOneOf1Parser(TokenStream input, EventObjectOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EventObjectOneOf1";
       	}

       	@Override
       	protected EventObjectOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEventObjectOneOf1"
    // InternalEventObjectOneOf1Parser.g:58:1: entryRuleEventObjectOneOf1 returns [EObject current=null] : iv_ruleEventObjectOneOf1= ruleEventObjectOneOf1 EOF ;
    public final EObject entryRuleEventObjectOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventObjectOneOf1 = null;


        try {
            // InternalEventObjectOneOf1Parser.g:58:58: (iv_ruleEventObjectOneOf1= ruleEventObjectOneOf1 EOF )
            // InternalEventObjectOneOf1Parser.g:59:2: iv_ruleEventObjectOneOf1= ruleEventObjectOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getEventObjectOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventObjectOneOf1=ruleEventObjectOneOf1();

            state._fsp--;

             current =iv_ruleEventObjectOneOf1; 
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
    // $ANTLR end "entryRuleEventObjectOneOf1"


    // $ANTLR start "ruleEventObjectOneOf1"
    // InternalEventObjectOneOf1Parser.g:65:1: ruleEventObjectOneOf1 returns [EObject current=null] : ( (lv_eventObject_0_0= ruleNullValue ) ) ;
    public final EObject ruleEventObjectOneOf1() throws RecognitionException {
        EObject current = null;

        EObject lv_eventObject_0_0 = null;



        	enterRule();

        try {
            // InternalEventObjectOneOf1Parser.g:71:2: ( ( (lv_eventObject_0_0= ruleNullValue ) ) )
            // InternalEventObjectOneOf1Parser.g:72:2: ( (lv_eventObject_0_0= ruleNullValue ) )
            {
            // InternalEventObjectOneOf1Parser.g:72:2: ( (lv_eventObject_0_0= ruleNullValue ) )
            // InternalEventObjectOneOf1Parser.g:73:3: (lv_eventObject_0_0= ruleNullValue )
            {
            // InternalEventObjectOneOf1Parser.g:73:3: (lv_eventObject_0_0= ruleNullValue )
            // InternalEventObjectOneOf1Parser.g:74:4: lv_eventObject_0_0= ruleNullValue
            {

            				newCompositeNode(grammarAccess.getEventObjectOneOf1Access().getEventObjectNullValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_eventObject_0_0=ruleNullValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEventObjectOneOf1Rule());
            				}
            				set(
            					current,
            					"eventObject",
            					lv_eventObject_0_0,
            					"githubwf.githubwf.EventObjectOneOf1.NullValue");
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
    // $ANTLR end "ruleEventObjectOneOf1"


    // $ANTLR start "entryRuleNullValue"
    // InternalEventObjectOneOf1Parser.g:94:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalEventObjectOneOf1Parser.g:94:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalEventObjectOneOf1Parser.g:95:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalEventObjectOneOf1Parser.g:101:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEventObjectOneOf1Parser.g:107:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalEventObjectOneOf1Parser.g:108:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalEventObjectOneOf1Parser.g:108:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalEventObjectOneOf1Parser.g:109:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalEventObjectOneOf1Parser.g:109:3: (lv_value_0_0= ruleNullEnum )
            // InternalEventObjectOneOf1Parser.g:110:4: lv_value_0_0= ruleNullEnum
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
            					"githubwf.githubwf.EventObjectOneOf1.NullEnum");
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
    // InternalEventObjectOneOf1Parser.g:130:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalEventObjectOneOf1Parser.g:136:2: ( (enumLiteral_0= Null ) )
            // InternalEventObjectOneOf1Parser.g:137:2: (enumLiteral_0= Null )
            {
            // InternalEventObjectOneOf1Parser.g:137:2: (enumLiteral_0= Null )
            // InternalEventObjectOneOf1Parser.g:138:3: enumLiteral_0= Null
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
