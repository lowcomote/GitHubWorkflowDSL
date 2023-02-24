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
import githubwf.githubwf.services.GithubwfRootOnOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "On", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=6;
    public static final int True=7;
    public static final int RULE_STRING=15;
    public static final int False=4;
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
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;
    public static final int On=5;

    // delegates
    // delegators


        public InternalGithubwfRootOnOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootOnOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootOnOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf1Parser.g"; }



     	private GithubwfRootOnOneOf1GrammarAccess grammarAccess;

        public InternalGithubwfRootOnOneOf1Parser(TokenStream input, GithubwfRootOnOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GithubwfRootOnOneOf1";
       	}

       	@Override
       	protected GithubwfRootOnOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGithubwfRootOnOneOf1"
    // InternalGithubwfRootOnOneOf1Parser.g:58:1: entryRuleGithubwfRootOnOneOf1 returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf1= ruleGithubwfRootOnOneOf1 EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf1 = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:58:61: (iv_ruleGithubwfRootOnOneOf1= ruleGithubwfRootOnOneOf1 EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:59:2: iv_ruleGithubwfRootOnOneOf1= ruleGithubwfRootOnOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getGithubwfRootOnOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf1=ruleGithubwfRootOnOneOf1();

            state._fsp--;

             current =iv_ruleGithubwfRootOnOneOf1; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf1"


    // $ANTLR start "ruleGithubwfRootOnOneOf1"
    // InternalGithubwfRootOnOneOf1Parser.g:65:1: ruleGithubwfRootOnOneOf1 returns [EObject current=null] : (otherlv_0= On otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_on_3_0= ruleGithubwfRootOnOneOf1Items ) ) (otherlv_4= Comma ( (lv_on_5_0= ruleGithubwfRootOnOneOf1Items ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleGithubwfRootOnOneOf1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_on_3_0 = null;

        EObject lv_on_5_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:71:2: ( (otherlv_0= On otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_on_3_0= ruleGithubwfRootOnOneOf1Items ) ) (otherlv_4= Comma ( (lv_on_5_0= ruleGithubwfRootOnOneOf1Items ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf1Parser.g:72:2: (otherlv_0= On otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_on_3_0= ruleGithubwfRootOnOneOf1Items ) ) (otherlv_4= Comma ( (lv_on_5_0= ruleGithubwfRootOnOneOf1Items ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:72:2: (otherlv_0= On otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_on_3_0= ruleGithubwfRootOnOneOf1Items ) ) (otherlv_4= Comma ( (lv_on_5_0= ruleGithubwfRootOnOneOf1Items ) ) )* otherlv_6= RightSquareBracket )
            // InternalGithubwfRootOnOneOf1Parser.g:73:3: otherlv_0= On otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_on_3_0= ruleGithubwfRootOnOneOf1Items ) ) (otherlv_4= Comma ( (lv_on_5_0= ruleGithubwfRootOnOneOf1Items ) ) )* otherlv_6= RightSquareBracket
            {
            otherlv_0=(Token)match(input,On,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootOnOneOf1Access().getOnKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnOneOf1Access().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGithubwfRootOnOneOf1Access().getLeftSquareBracketKeyword_2());
            		
            // InternalGithubwfRootOnOneOf1Parser.g:85:3: ( (lv_on_3_0= ruleGithubwfRootOnOneOf1Items ) )
            // InternalGithubwfRootOnOneOf1Parser.g:86:4: (lv_on_3_0= ruleGithubwfRootOnOneOf1Items )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:86:4: (lv_on_3_0= ruleGithubwfRootOnOneOf1Items )
            // InternalGithubwfRootOnOneOf1Parser.g:87:5: lv_on_3_0= ruleGithubwfRootOnOneOf1Items
            {

            					newCompositeNode(grammarAccess.getGithubwfRootOnOneOf1Access().getOnGithubwfRootOnOneOf1ItemsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_on_3_0=ruleGithubwfRootOnOneOf1Items();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf1Rule());
            					}
            					add(
            						current,
            						"on",
            						lv_on_3_0,
            						"githubwf.githubwf.GithubwfRootOnOneOf1.GithubwfRootOnOneOf1Items");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGithubwfRootOnOneOf1Parser.g:104:3: (otherlv_4= Comma ( (lv_on_5_0= ruleGithubwfRootOnOneOf1Items ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comma) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf1Parser.g:105:4: otherlv_4= Comma ( (lv_on_5_0= ruleGithubwfRootOnOneOf1Items ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGithubwfRootOnOneOf1Access().getCommaKeyword_4_0());
            	    			
            	    // InternalGithubwfRootOnOneOf1Parser.g:109:4: ( (lv_on_5_0= ruleGithubwfRootOnOneOf1Items ) )
            	    // InternalGithubwfRootOnOneOf1Parser.g:110:5: (lv_on_5_0= ruleGithubwfRootOnOneOf1Items )
            	    {
            	    // InternalGithubwfRootOnOneOf1Parser.g:110:5: (lv_on_5_0= ruleGithubwfRootOnOneOf1Items )
            	    // InternalGithubwfRootOnOneOf1Parser.g:111:6: lv_on_5_0= ruleGithubwfRootOnOneOf1Items
            	    {

            	    						newCompositeNode(grammarAccess.getGithubwfRootOnOneOf1Access().getOnGithubwfRootOnOneOf1ItemsParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_on_5_0=ruleGithubwfRootOnOneOf1Items();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf1Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"on",
            	    							lv_on_5_0,
            	    							"githubwf.githubwf.GithubwfRootOnOneOf1.GithubwfRootOnOneOf1Items");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGithubwfRootOnOneOf1Access().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleGithubwfRootOnOneOf1"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootOnOneOf1Parser.g:137:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:137:46: (iv_ruleValue= ruleValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:138:2: iv_ruleValue= ruleValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:144:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalGithubwfRootOnOneOf1Parser.g:150:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalGithubwfRootOnOneOf1Parser.g:151:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:151:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt2=6;
            switch ( input.LA(1) ) {
            case On:
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt2=2;
                }
                break;
            case Null:
                {
                alt2=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt2=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt2=5;
                }
                break;
            case False:
            case True:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGithubwfRootOnOneOf1Parser.g:152:3: this_StringValue_0= ruleStringValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:161:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:170:3: this_NullValue_2= ruleNullValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:179:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:188:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:197:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf1Items"
    // InternalGithubwfRootOnOneOf1Parser.g:209:1: entryRuleGithubwfRootOnOneOf1Items returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf1Items= ruleGithubwfRootOnOneOf1Items EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf1Items() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf1Items = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:209:66: (iv_ruleGithubwfRootOnOneOf1Items= ruleGithubwfRootOnOneOf1Items EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:210:2: iv_ruleGithubwfRootOnOneOf1Items= ruleGithubwfRootOnOneOf1Items EOF
            {
             newCompositeNode(grammarAccess.getGithubwfRootOnOneOf1ItemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf1Items=ruleGithubwfRootOnOneOf1Items();

            state._fsp--;

             current =iv_ruleGithubwfRootOnOneOf1Items; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf1Items"


    // $ANTLR start "ruleGithubwfRootOnOneOf1Items"
    // InternalGithubwfRootOnOneOf1Parser.g:216:1: ruleGithubwfRootOnOneOf1Items returns [EObject current=null] : ( (lv_items_0_0= ruleEvent ) ) ;
    public final EObject ruleGithubwfRootOnOneOf1Items() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:222:2: ( ( (lv_items_0_0= ruleEvent ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:223:2: ( (lv_items_0_0= ruleEvent ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:223:2: ( (lv_items_0_0= ruleEvent ) )
            // InternalGithubwfRootOnOneOf1Parser.g:224:3: (lv_items_0_0= ruleEvent )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:224:3: (lv_items_0_0= ruleEvent )
            // InternalGithubwfRootOnOneOf1Parser.g:225:4: lv_items_0_0= ruleEvent
            {

            				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf1ItemsAccess().getItemsEventParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEvent();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf1ItemsRule());
            				}
            				set(
            					current,
            					"items",
            					lv_items_0_0,
            					"githubwf.githubwf.GithubwfRootOnOneOf1.Event");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf1Items"


    // $ANTLR start "entryRuleEvent"
    // InternalGithubwfRootOnOneOf1Parser.g:245:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:245:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:246:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalGithubwfRootOnOneOf1Parser.g:252:1: ruleEvent returns [EObject current=null] : ( (lv_event_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:258:2: ( ( (lv_event_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:259:2: ( (lv_event_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:259:2: ( (lv_event_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf1Parser.g:260:3: (lv_event_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:260:3: (lv_event_0_0= ruleJsonDocument )
            // InternalGithubwfRootOnOneOf1Parser.g:261:4: lv_event_0_0= ruleJsonDocument
            {

            				newCompositeNode(grammarAccess.getEventAccess().getEventJsonDocumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_event_0_0=ruleJsonDocument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEventRule());
            				}
            				set(
            					current,
            					"event",
            					lv_event_0_0,
            					"githubwf.githubwf.GithubwfRootOnOneOf1.JsonDocument");
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfRootOnOneOf1Parser.g:281:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:281:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:282:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:288:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:294:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:295:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:295:2: ( (lv_value_0_0= ruleValue ) )
            // InternalGithubwfRootOnOneOf1Parser.g:296:3: (lv_value_0_0= ruleValue )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:296:3: (lv_value_0_0= ruleValue )
            // InternalGithubwfRootOnOneOf1Parser.g:297:4: lv_value_0_0= ruleValue
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
            					"githubwf.githubwf.GithubwfRootOnOneOf1.Value");
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
    // InternalGithubwfRootOnOneOf1Parser.g:317:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:317:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:318:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:324:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:330:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:331:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:331:2: ( (lv_value_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf1Parser.g:332:3: (lv_value_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:332:3: (lv_value_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf1Parser.g:333:4: lv_value_0_0= ruleEString
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
            					"githubwf.githubwf.GithubwfRootOnOneOf1.EString");
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
    // InternalGithubwfRootOnOneOf1Parser.g:353:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:353:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:354:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:360:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:366:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf1Parser.g:367:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:367:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootOnOneOf1Parser.g:368:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootOnOneOf1Parser.g:368:3: ()
            // InternalGithubwfRootOnOneOf1Parser.g:369:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalGithubwfRootOnOneOf1Parser.g:379:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=False && LA4_0<=True)||LA4_0==LeftSquareBracket||LA4_0==LeftCurlyBracket||(LA4_0>=RULE_STRING && LA4_0<=RULE_E_DOUBLE)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGithubwfRootOnOneOf1Parser.g:380:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:380:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalGithubwfRootOnOneOf1Parser.g:381:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:381:5: (lv_value_2_0= ruleValue )
                    // InternalGithubwfRootOnOneOf1Parser.g:382:6: lv_value_2_0= ruleValue
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
                    							"githubwf.githubwf.GithubwfRootOnOneOf1.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubwfRootOnOneOf1Parser.g:399:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Comma) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf1Parser.g:400:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalGithubwfRootOnOneOf1Parser.g:404:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalGithubwfRootOnOneOf1Parser.g:405:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalGithubwfRootOnOneOf1Parser.g:405:6: (lv_value_4_0= ruleValue )
                    	    // InternalGithubwfRootOnOneOf1Parser.g:406:7: lv_value_4_0= ruleValue
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
                    	    								"githubwf.githubwf.GithubwfRootOnOneOf1.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
    // InternalGithubwfRootOnOneOf1Parser.g:433:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:433:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:434:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:440:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:446:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:447:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:447:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalGithubwfRootOnOneOf1Parser.g:448:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:448:3: (lv_value_0_0= ruleNullEnum )
            // InternalGithubwfRootOnOneOf1Parser.g:449:4: lv_value_0_0= ruleNullEnum
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
            					"githubwf.githubwf.GithubwfRootOnOneOf1.NullEnum");
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
    // InternalGithubwfRootOnOneOf1Parser.g:469:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:469:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:470:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:476:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:482:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:483:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:483:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalGithubwfRootOnOneOf1Parser.g:484:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:484:3: (lv_value_0_0= ruleEDouble )
            // InternalGithubwfRootOnOneOf1Parser.g:485:4: lv_value_0_0= ruleEDouble
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
            					"githubwf.githubwf.GithubwfRootOnOneOf1.EDouble");
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
    // InternalGithubwfRootOnOneOf1Parser.g:505:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:505:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:506:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:512:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:518:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf1Parser.g:519:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:519:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootOnOneOf1Parser.g:520:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootOnOneOf1Parser.g:520:3: ()
            // InternalGithubwfRootOnOneOf1Parser.g:521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGithubwfRootOnOneOf1Parser.g:531:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==On||LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGithubwfRootOnOneOf1Parser.g:532:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:532:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalGithubwfRootOnOneOf1Parser.g:533:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:533:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalGithubwfRootOnOneOf1Parser.g:534:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                    							"githubwf.githubwf.GithubwfRootOnOneOf1.KeyValuePair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubwfRootOnOneOf1Parser.g:551:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf1Parser.g:552:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalGithubwfRootOnOneOf1Parser.g:556:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalGithubwfRootOnOneOf1Parser.g:557:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalGithubwfRootOnOneOf1Parser.g:557:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalGithubwfRootOnOneOf1Parser.g:558:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	    								"githubwf.githubwf.GithubwfRootOnOneOf1.KeyValuePair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
    // InternalGithubwfRootOnOneOf1Parser.g:585:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:585:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:586:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:592:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:598:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:599:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:599:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalGithubwfRootOnOneOf1Parser.g:600:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:600:3: (lv_value_0_0= ruleEBoolean )
            // InternalGithubwfRootOnOneOf1Parser.g:601:4: lv_value_0_0= ruleEBoolean
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
            					"githubwf.githubwf.GithubwfRootOnOneOf1.EBoolean");
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
    // InternalGithubwfRootOnOneOf1Parser.g:621:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:621:47: (iv_ruleEString= ruleEString EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:622:2: iv_ruleEString= ruleEString EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:628:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:634:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalGithubwfRootOnOneOf1Parser.g:635:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalGithubwfRootOnOneOf1Parser.g:648:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:648:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:649:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:655:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:661:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGithubwfRootOnOneOf1Parser.g:662:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:662:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_E_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_E_DOUBLE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootOnOneOf1Parser.g:663:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf1Parser.g:671:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf1Parser.g:682:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:682:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:683:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:689:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:695:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:696:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:696:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:697:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:697:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf1Parser.g:698:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:698:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf1Parser.g:699:5: lv_key_0_0= ruleEString
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
            						"githubwf.githubwf.GithubwfRootOnOneOf1.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalGithubwfRootOnOneOf1Parser.g:720:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGithubwfRootOnOneOf1Parser.g:721:4: (lv_value_2_0= ruleValue )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:721:4: (lv_value_2_0= ruleValue )
            // InternalGithubwfRootOnOneOf1Parser.g:722:5: lv_value_2_0= ruleValue
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
            						"githubwf.githubwf.GithubwfRootOnOneOf1.Value");
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
    // InternalGithubwfRootOnOneOf1Parser.g:743:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:743:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:744:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:750:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:756:2: ( (kw= True | kw= False ) )
            // InternalGithubwfRootOnOneOf1Parser.g:757:2: (kw= True | kw= False )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:757:2: (kw= True | kw= False )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==True) ) {
                alt8=1;
            }
            else if ( (LA8_0==False) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGithubwfRootOnOneOf1Parser.g:758:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf1Parser.g:764:3: kw= False
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
    // InternalGithubwfRootOnOneOf1Parser.g:773:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:773:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:774:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:780:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:786:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalGithubwfRootOnOneOf1Parser.g:787:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:787:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==On) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGithubwfRootOnOneOf1Parser.g:788:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf1Parser.g:796:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalGithubwfRootOnOneOf1Parser.g:810:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalGithubwfRootOnOneOf1Parser.g:810:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:811:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:817:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= On ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:823:2: (kw= On )
            // InternalGithubwfRootOnOneOf1Parser.g:824:2: kw= On
            {
            kw=(Token)match(input,On,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOnKeyword());
            	

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
    // InternalGithubwfRootOnOneOf1Parser.g:832:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf1Parser.g:838:2: ( (enumLiteral_0= Null ) )
            // InternalGithubwfRootOnOneOf1Parser.g:839:2: (enumLiteral_0= Null )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:839:2: (enumLiteral_0= Null )
            // InternalGithubwfRootOnOneOf1Parser.g:840:3: enumLiteral_0= Null
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008020L});

}
