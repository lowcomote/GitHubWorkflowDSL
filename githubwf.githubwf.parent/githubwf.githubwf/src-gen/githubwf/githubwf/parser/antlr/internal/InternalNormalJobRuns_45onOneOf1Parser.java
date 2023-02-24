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
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobRuns_45onOneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RunsOn", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=6;
    public static final int True=7;
    public static final int RULE_STRING=15;
    public static final int False=5;
    public static final int RULE_SL_COMMENT=20;
    public static final int Comma=8;
    public static final int Colon=9;
    public static final int RightCurlyBracket=13;
    public static final int RULE_E_DOUBLE=17;
    public static final int EOF=-1;
    public static final int RightSquareBracket=11;
    public static final int RULE_ID=18;
    public static final int RULE_WS=21;
    public static final int LeftCurlyBracket=12;
    public static final int RULE_E_INT=16;
    public static final int RULE_ANY_OTHER=22;
    public static final int RunsOn=4;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;

    // delegates
    // delegators


        public InternalNormalJobRuns_45onOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobRuns_45onOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobRuns_45onOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobRuns_45onOneOf1Parser.g"; }



     	private NormalJobRuns_45onOneOf1GrammarAccess grammarAccess;

        public InternalNormalJobRuns_45onOneOf1Parser(TokenStream input, NormalJobRuns_45onOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobRuns_45onOneOf1";
       	}

       	@Override
       	protected NormalJobRuns_45onOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1"
    // InternalNormalJobRuns_45onOneOf1Parser.g:58:1: entryRuleNormalJobRuns_45onOneOf1 returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1= ruleNormalJobRuns_45onOneOf1 EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1 = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:58:65: (iv_ruleNormalJobRuns_45onOneOf1= ruleNormalJobRuns_45onOneOf1 EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:59:2: iv_ruleNormalJobRuns_45onOneOf1= ruleNormalJobRuns_45onOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1=ruleNormalJobRuns_45onOneOf1();

            state._fsp--;

             current =iv_ruleNormalJobRuns_45onOneOf1; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1"
    // InternalNormalJobRuns_45onOneOf1Parser.g:65:1: ruleNormalJobRuns_45onOneOf1 returns [EObject current=null] : ( () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_runs_45on_4_0 = null;

        EObject lv_runs_45on_6_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:71:2: ( ( () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:72:2: ( () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:72:2: ( () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalNormalJobRuns_45onOneOf1Parser.g:73:3: () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:73:3: ()
            // InternalNormalJobRuns_45onOneOf1Parser.g:74:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalJobRuns_45onOneOf1Access().getNormalJobRuns_45onOneOf1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,RunsOn,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf1Access().getRunsOnKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getNormalJobRuns_45onOneOf1Access().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getNormalJobRuns_45onOneOf1Access().getLeftSquareBracketKeyword_3());
            		
            // InternalNormalJobRuns_45onOneOf1Parser.g:92:3: ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RunsOn && LA2_0<=True)||LA2_0==LeftSquareBracket||LA2_0==LeftCurlyBracket||(LA2_0>=RULE_STRING && LA2_0<=RULE_E_DOUBLE)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:93:4: ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) ) )*
                    {
                    // InternalNormalJobRuns_45onOneOf1Parser.g:93:4: ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items ) )
                    // InternalNormalJobRuns_45onOneOf1Parser.g:94:5: (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items )
                    {
                    // InternalNormalJobRuns_45onOneOf1Parser.g:94:5: (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items )
                    // InternalNormalJobRuns_45onOneOf1Parser.g:95:6: lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1Items
                    {

                    						newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1Access().getRuns_45onNormalJobRuns_45onOneOf1ItemsParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_runs_45on_4_0=ruleNormalJobRuns_45onOneOf1Items();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1Rule());
                    						}
                    						add(
                    							current,
                    							"runs_45on",
                    							lv_runs_45on_4_0,
                    							"githubwf.githubwf.NormalJobRuns_45onOneOf1.NormalJobRuns_45onOneOf1Items");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalNormalJobRuns_45onOneOf1Parser.g:112:4: (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:113:5: otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getNormalJobRuns_45onOneOf1Access().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:117:5: ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items ) )
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:118:6: (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items )
                    	    {
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:118:6: (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items )
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:119:7: lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1Items
                    	    {

                    	    							newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1Access().getRuns_45onNormalJobRuns_45onOneOf1ItemsParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_runs_45on_6_0=ruleNormalJobRuns_45onOneOf1Items();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1Rule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"runs_45on",
                    	    								lv_runs_45on_6_0,
                    	    								"githubwf.githubwf.NormalJobRuns_45onOneOf1.NormalJobRuns_45onOneOf1Items");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNormalJobRuns_45onOneOf1Access().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1"


    // $ANTLR start "entryRuleValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:146:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:146:46: (iv_ruleValue= ruleValue EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:147:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:153:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_ArrayValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_NumberValue_3 = null;

        EObject this_ObjectValue_4 = null;

        EObject this_BooleanValue_5 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:159:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:160:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:160:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RunsOn:
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt3=2;
                }
                break;
            case Null:
                {
                alt3=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt3=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt3=5;
                }
                break;
            case False:
            case True:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:161:3: this_StringValue_0= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:170:3: this_ArrayValue_1= ruleArrayValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayValue_1=ruleArrayValue();

                    state._fsp--;


                    			current = this_ArrayValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:179:3: this_NullValue_2= ruleNullValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;


                    			current = this_NullValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:188:3: this_NumberValue_3= ruleNumberValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberValue_3=ruleNumberValue();

                    state._fsp--;


                    			current = this_NumberValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:197:3: this_ObjectValue_4= ruleObjectValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectValue_4=ruleObjectValue();

                    state._fsp--;


                    			current = this_ObjectValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:206:3: this_BooleanValue_5= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_5=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1Items"
    // InternalNormalJobRuns_45onOneOf1Parser.g:218:1: entryRuleNormalJobRuns_45onOneOf1Items returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1Items= ruleNormalJobRuns_45onOneOf1Items EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1Items() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1Items = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:218:70: (iv_ruleNormalJobRuns_45onOneOf1Items= ruleNormalJobRuns_45onOneOf1Items EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:219:2: iv_ruleNormalJobRuns_45onOneOf1Items= ruleNormalJobRuns_45onOneOf1Items EOF
            {
             newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1ItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1Items=ruleNormalJobRuns_45onOneOf1Items();

            state._fsp--;

             current =iv_ruleNormalJobRuns_45onOneOf1Items; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1Items"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1Items"
    // InternalNormalJobRuns_45onOneOf1Parser.g:225:1: ruleNormalJobRuns_45onOneOf1Items returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1Items() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:231:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:232:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:232:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:233:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:233:3: (lv_items_0_0= ruleJsonDocument )
            // InternalNormalJobRuns_45onOneOf1Parser.g:234:4: lv_items_0_0= ruleJsonDocument
            {

            				newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1ItemsAccess().getItemsJsonDocumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1ItemsRule());
            				}
            				set(
            					current,
            					"items",
            					lv_items_0_0,
            					"githubwf.githubwf.NormalJobRuns_45onOneOf1.JsonDocument");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1Items"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalNormalJobRuns_45onOneOf1Parser.g:254:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:254:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:255:2: iv_ruleJsonDocument= ruleJsonDocument EOF
            {
             newCompositeNode(grammarAccess.getJsonDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonDocument=ruleJsonDocument();

            state._fsp--;

             current =iv_ruleJsonDocument; 
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
    // $ANTLR end "entryRuleJsonDocument"


    // $ANTLR start "ruleJsonDocument"
    // InternalNormalJobRuns_45onOneOf1Parser.g:261:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:267:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:268:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:268:2: ( (lv_value_0_0= ruleValue ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:269:3: (lv_value_0_0= ruleValue )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:269:3: (lv_value_0_0= ruleValue )
            // InternalNormalJobRuns_45onOneOf1Parser.g:270:4: lv_value_0_0= ruleValue
            {

            				newCompositeNode(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJsonDocumentRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"githubwf.githubwf.NormalJobRuns_45onOneOf1.Value");
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
    // $ANTLR end "ruleJsonDocument"


    // $ANTLR start "entryRuleStringValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:290:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:290:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:291:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:297:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:303:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:304:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:304:2: ( (lv_value_0_0= ruleEString ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:305:3: (lv_value_0_0= ruleEString )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:305:3: (lv_value_0_0= ruleEString )
            // InternalNormalJobRuns_45onOneOf1Parser.g:306:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"githubwf.githubwf.NormalJobRuns_45onOneOf1.EString");
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:326:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:326:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:327:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
             newCompositeNode(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;

             current =iv_ruleArrayValue; 
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
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:333:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:339:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:340:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:340:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobRuns_45onOneOf1Parser.g:341:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:341:3: ()
            // InternalNormalJobRuns_45onOneOf1Parser.g:342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalNormalJobRuns_45onOneOf1Parser.g:352:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RunsOn && LA5_0<=True)||LA5_0==LeftSquareBracket||LA5_0==LeftCurlyBracket||(LA5_0>=RULE_STRING && LA5_0<=RULE_E_DOUBLE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:353:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalNormalJobRuns_45onOneOf1Parser.g:353:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalNormalJobRuns_45onOneOf1Parser.g:354:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalNormalJobRuns_45onOneOf1Parser.g:354:5: (lv_value_2_0= ruleValue )
                    // InternalNormalJobRuns_45onOneOf1Parser.g:355:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"githubwf.githubwf.NormalJobRuns_45onOneOf1.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalNormalJobRuns_45onOneOf1Parser.g:372:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:373:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:377:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:378:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:378:6: (lv_value_4_0= ruleValue )
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:379:7: lv_value_4_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_value_4_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_4_0,
                    	    								"githubwf.githubwf.NormalJobRuns_45onOneOf1.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:406:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:406:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:407:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalNormalJobRuns_45onOneOf1Parser.g:413:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:419:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:420:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:420:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:421:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:421:3: (lv_value_0_0= ruleNullEnum )
            // InternalNormalJobRuns_45onOneOf1Parser.g:422:4: lv_value_0_0= ruleNullEnum
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
            					"githubwf.githubwf.NormalJobRuns_45onOneOf1.NullEnum");
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


    // $ANTLR start "entryRuleNumberValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:442:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:442:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:443:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
             newCompositeNode(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;

             current =iv_ruleNumberValue; 
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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:449:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:455:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:456:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:456:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:457:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:457:3: (lv_value_0_0= ruleEDouble )
            // InternalNormalJobRuns_45onOneOf1Parser.g:458:4: lv_value_0_0= ruleEDouble
            {

            				newCompositeNode(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEDouble();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"githubwf.githubwf.NormalJobRuns_45onOneOf1.EDouble");
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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:478:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:478:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:479:2: iv_ruleObjectValue= ruleObjectValue EOF
            {
             newCompositeNode(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectValue=ruleObjectValue();

            state._fsp--;

             current =iv_ruleObjectValue; 
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
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:485:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:491:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:492:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:492:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobRuns_45onOneOf1Parser.g:493:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:493:3: ()
            // InternalNormalJobRuns_45onOneOf1Parser.g:494:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalNormalJobRuns_45onOneOf1Parser.g:504:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RunsOn||LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:505:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalNormalJobRuns_45onOneOf1Parser.g:505:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalNormalJobRuns_45onOneOf1Parser.g:506:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalNormalJobRuns_45onOneOf1Parser.g:506:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalNormalJobRuns_45onOneOf1Parser.g:507:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {

                    						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_keyvaluepair_2_0=ruleKeyValuePair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    						}
                    						add(
                    							current,
                    							"keyvaluepair",
                    							lv_keyvaluepair_2_0,
                    							"githubwf.githubwf.NormalJobRuns_45onOneOf1.KeyValuePair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalNormalJobRuns_45onOneOf1Parser.g:524:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:525:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:529:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:530:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:530:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalNormalJobRuns_45onOneOf1Parser.g:531:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_keyvaluepair_4_0=ruleKeyValuePair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keyvaluepair",
                    	    								lv_keyvaluepair_4_0,
                    	    								"githubwf.githubwf.NormalJobRuns_45onOneOf1.KeyValuePair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:558:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:558:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:559:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalNormalJobRuns_45onOneOf1Parser.g:565:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:571:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:572:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:572:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:573:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:573:3: (lv_value_0_0= ruleEBoolean )
            // InternalNormalJobRuns_45onOneOf1Parser.g:574:4: lv_value_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"githubwf.githubwf.NormalJobRuns_45onOneOf1.EBoolean");
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobRuns_45onOneOf1Parser.g:594:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:594:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:595:2: iv_ruleEString= ruleEString EOF
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
    // InternalNormalJobRuns_45onOneOf1Parser.g:601:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:607:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobRuns_45onOneOf1Parser.g:608:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleEDouble"
    // InternalNormalJobRuns_45onOneOf1Parser.g:621:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:621:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:622:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalNormalJobRuns_45onOneOf1Parser.g:628:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:634:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:635:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:635:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_E_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_E_DOUBLE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:636:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:644:3: this_E_DOUBLE_1= RULE_E_DOUBLE
                    {
                    this_E_DOUBLE_1=(Token)match(input,RULE_E_DOUBLE,FOLLOW_2); 

                    			current.merge(this_E_DOUBLE_1);
                    		

                    			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalNormalJobRuns_45onOneOf1Parser.g:655:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:655:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:656:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getKeyValuePairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValuePair=ruleKeyValuePair();

            state._fsp--;

             current =iv_ruleKeyValuePair; 
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
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // InternalNormalJobRuns_45onOneOf1Parser.g:662:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:668:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:669:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:669:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:670:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:670:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:671:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:671:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobRuns_45onOneOf1Parser.g:672:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"githubwf.githubwf.NormalJobRuns_45onOneOf1.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalNormalJobRuns_45onOneOf1Parser.g:693:3: ( (lv_value_2_0= ruleValue ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:694:4: (lv_value_2_0= ruleValue )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:694:4: (lv_value_2_0= ruleValue )
            // InternalNormalJobRuns_45onOneOf1Parser.g:695:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"githubwf.githubwf.NormalJobRuns_45onOneOf1.Value");
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
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleEBoolean"
    // InternalNormalJobRuns_45onOneOf1Parser.g:716:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:716:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:717:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalNormalJobRuns_45onOneOf1Parser.g:723:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:729:2: ( (kw= True | kw= False ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:730:2: (kw= True | kw= False )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:730:2: (kw= True | kw= False )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==True) ) {
                alt9=1;
            }
            else if ( (LA9_0==False) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:731:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:737:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalNormalJobRuns_45onOneOf1Parser.g:746:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:746:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:747:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalNormalJobRuns_45onOneOf1Parser.g:753:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:759:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:760:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:760:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RunsOn) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:761:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf1Parser.g:769:3: this_KEYWORD_1= ruleKEYWORD
                    {

                    			newCompositeNode(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_1=ruleKEYWORD();

                    state._fsp--;


                    			current.merge(this_KEYWORD_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalNormalJobRuns_45onOneOf1Parser.g:783:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:783:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobRuns_45onOneOf1Parser.g:784:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;

             current =iv_ruleKEYWORD.getText(); 
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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalNormalJobRuns_45onOneOf1Parser.g:790:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= RunsOn ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:796:2: (kw= RunsOn )
            // InternalNormalJobRuns_45onOneOf1Parser.g:797:2: kw= RunsOn
            {
            kw=(Token)match(input,RunsOn,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRunsOnKeyword());
            	

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
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleNullEnum"
    // InternalNormalJobRuns_45onOneOf1Parser.g:805:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1Parser.g:811:2: ( (enumLiteral_0= Null ) )
            // InternalNormalJobRuns_45onOneOf1Parser.g:812:2: (enumLiteral_0= Null )
            {
            // InternalNormalJobRuns_45onOneOf1Parser.g:812:2: (enumLiteral_0= Null )
            // InternalNormalJobRuns_45onOneOf1Parser.g:813:3: enumLiteral_0= Null
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008010L});

}
