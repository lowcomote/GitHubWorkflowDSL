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
import githubwf.githubwf.services.PermissionsOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPermissionsOneOf0Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=5;
    public static final int True=6;
    public static final int RULE_STRING=14;
    public static final int False=4;
    public static final int RULE_SL_COMMENT=19;
    public static final int Comma=7;
    public static final int Colon=8;
    public static final int RightCurlyBracket=12;
    public static final int RULE_E_DOUBLE=16;
    public static final int EOF=-1;
    public static final int RightSquareBracket=10;
    public static final int RULE_ID=17;
    public static final int RULE_WS=20;
    public static final int LeftCurlyBracket=11;
    public static final int RULE_E_INT=15;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_INT=13;
    public static final int RULE_ML_COMMENT=18;
    public static final int LeftSquareBracket=9;

    // delegates
    // delegators


        public InternalPermissionsOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPermissionsOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPermissionsOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPermissionsOneOf0Parser.g"; }



     	private PermissionsOneOf0GrammarAccess grammarAccess;

        public InternalPermissionsOneOf0Parser(TokenStream input, PermissionsOneOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PermissionsOneOf0";
       	}

       	@Override
       	protected PermissionsOneOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePermissionsOneOf0"
    // InternalPermissionsOneOf0Parser.g:58:1: entryRulePermissionsOneOf0 returns [EObject current=null] : iv_rulePermissionsOneOf0= rulePermissionsOneOf0 EOF ;
    public final EObject entryRulePermissionsOneOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsOneOf0 = null;


        try {
            // InternalPermissionsOneOf0Parser.g:58:58: (iv_rulePermissionsOneOf0= rulePermissionsOneOf0 EOF )
            // InternalPermissionsOneOf0Parser.g:59:2: iv_rulePermissionsOneOf0= rulePermissionsOneOf0 EOF
            {
             newCompositeNode(grammarAccess.getPermissionsOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissionsOneOf0=rulePermissionsOneOf0();

            state._fsp--;

             current =iv_rulePermissionsOneOf0; 
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
    // $ANTLR end "entryRulePermissionsOneOf0"


    // $ANTLR start "rulePermissionsOneOf0"
    // InternalPermissionsOneOf0Parser.g:65:1: rulePermissionsOneOf0 returns [EObject current=null] : ( (lv_permissions_0_0= ruleJsonDocument ) ) ;
    public final EObject rulePermissionsOneOf0() throws RecognitionException {
        EObject current = null;

        EObject lv_permissions_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:71:2: ( ( (lv_permissions_0_0= ruleJsonDocument ) ) )
            // InternalPermissionsOneOf0Parser.g:72:2: ( (lv_permissions_0_0= ruleJsonDocument ) )
            {
            // InternalPermissionsOneOf0Parser.g:72:2: ( (lv_permissions_0_0= ruleJsonDocument ) )
            // InternalPermissionsOneOf0Parser.g:73:3: (lv_permissions_0_0= ruleJsonDocument )
            {
            // InternalPermissionsOneOf0Parser.g:73:3: (lv_permissions_0_0= ruleJsonDocument )
            // InternalPermissionsOneOf0Parser.g:74:4: lv_permissions_0_0= ruleJsonDocument
            {

            				newCompositeNode(grammarAccess.getPermissionsOneOf0Access().getPermissionsJsonDocumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_permissions_0_0=ruleJsonDocument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPermissionsOneOf0Rule());
            				}
            				set(
            					current,
            					"permissions",
            					lv_permissions_0_0,
            					"githubwf.githubwf.PermissionsOneOf0.JsonDocument");
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
    // $ANTLR end "rulePermissionsOneOf0"


    // $ANTLR start "entryRuleValue"
    // InternalPermissionsOneOf0Parser.g:94:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalPermissionsOneOf0Parser.g:94:46: (iv_ruleValue= ruleValue EOF )
            // InternalPermissionsOneOf0Parser.g:95:2: iv_ruleValue= ruleValue EOF
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
    // InternalPermissionsOneOf0Parser.g:101:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalPermissionsOneOf0Parser.g:107:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalPermissionsOneOf0Parser.g:108:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalPermissionsOneOf0Parser.g:108:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt1=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt1=2;
                }
                break;
            case Null:
                {
                alt1=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt1=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt1=5;
                }
                break;
            case False:
            case True:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPermissionsOneOf0Parser.g:109:3: this_StringValue_0= ruleStringValue
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
                    // InternalPermissionsOneOf0Parser.g:118:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalPermissionsOneOf0Parser.g:127:3: this_NullValue_2= ruleNullValue
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
                    // InternalPermissionsOneOf0Parser.g:136:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalPermissionsOneOf0Parser.g:145:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalPermissionsOneOf0Parser.g:154:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleJsonDocument"
    // InternalPermissionsOneOf0Parser.g:166:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalPermissionsOneOf0Parser.g:166:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalPermissionsOneOf0Parser.g:167:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalPermissionsOneOf0Parser.g:173:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:179:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalPermissionsOneOf0Parser.g:180:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalPermissionsOneOf0Parser.g:180:2: ( (lv_value_0_0= ruleValue ) )
            // InternalPermissionsOneOf0Parser.g:181:3: (lv_value_0_0= ruleValue )
            {
            // InternalPermissionsOneOf0Parser.g:181:3: (lv_value_0_0= ruleValue )
            // InternalPermissionsOneOf0Parser.g:182:4: lv_value_0_0= ruleValue
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
            					"githubwf.githubwf.PermissionsOneOf0.Value");
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
    // InternalPermissionsOneOf0Parser.g:202:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalPermissionsOneOf0Parser.g:202:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalPermissionsOneOf0Parser.g:203:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalPermissionsOneOf0Parser.g:209:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:215:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalPermissionsOneOf0Parser.g:216:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalPermissionsOneOf0Parser.g:216:2: ( (lv_value_0_0= ruleEString ) )
            // InternalPermissionsOneOf0Parser.g:217:3: (lv_value_0_0= ruleEString )
            {
            // InternalPermissionsOneOf0Parser.g:217:3: (lv_value_0_0= ruleEString )
            // InternalPermissionsOneOf0Parser.g:218:4: lv_value_0_0= ruleEString
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
            					"githubwf.githubwf.PermissionsOneOf0.EString");
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
    // InternalPermissionsOneOf0Parser.g:238:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalPermissionsOneOf0Parser.g:238:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalPermissionsOneOf0Parser.g:239:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalPermissionsOneOf0Parser.g:245:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:251:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalPermissionsOneOf0Parser.g:252:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalPermissionsOneOf0Parser.g:252:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalPermissionsOneOf0Parser.g:253:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalPermissionsOneOf0Parser.g:253:3: ()
            // InternalPermissionsOneOf0Parser.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPermissionsOneOf0Parser.g:264:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=False && LA3_0<=True)||LA3_0==LeftSquareBracket||LA3_0==LeftCurlyBracket||(LA3_0>=RULE_STRING && LA3_0<=RULE_E_DOUBLE)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPermissionsOneOf0Parser.g:265:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalPermissionsOneOf0Parser.g:265:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalPermissionsOneOf0Parser.g:266:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalPermissionsOneOf0Parser.g:266:5: (lv_value_2_0= ruleValue )
                    // InternalPermissionsOneOf0Parser.g:267:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"githubwf.githubwf.PermissionsOneOf0.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPermissionsOneOf0Parser.g:284:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Comma) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalPermissionsOneOf0Parser.g:285:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalPermissionsOneOf0Parser.g:289:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalPermissionsOneOf0Parser.g:290:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalPermissionsOneOf0Parser.g:290:6: (lv_value_4_0= ruleValue )
                    	    // InternalPermissionsOneOf0Parser.g:291:7: lv_value_4_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_value_4_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_4_0,
                    	    								"githubwf.githubwf.PermissionsOneOf0.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
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
    // InternalPermissionsOneOf0Parser.g:318:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalPermissionsOneOf0Parser.g:318:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalPermissionsOneOf0Parser.g:319:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalPermissionsOneOf0Parser.g:325:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:331:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalPermissionsOneOf0Parser.g:332:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalPermissionsOneOf0Parser.g:332:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalPermissionsOneOf0Parser.g:333:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalPermissionsOneOf0Parser.g:333:3: (lv_value_0_0= ruleNullEnum )
            // InternalPermissionsOneOf0Parser.g:334:4: lv_value_0_0= ruleNullEnum
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
            					"githubwf.githubwf.PermissionsOneOf0.NullEnum");
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
    // InternalPermissionsOneOf0Parser.g:354:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalPermissionsOneOf0Parser.g:354:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalPermissionsOneOf0Parser.g:355:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalPermissionsOneOf0Parser.g:361:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:367:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalPermissionsOneOf0Parser.g:368:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalPermissionsOneOf0Parser.g:368:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalPermissionsOneOf0Parser.g:369:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalPermissionsOneOf0Parser.g:369:3: (lv_value_0_0= ruleEDouble )
            // InternalPermissionsOneOf0Parser.g:370:4: lv_value_0_0= ruleEDouble
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
            					"githubwf.githubwf.PermissionsOneOf0.EDouble");
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
    // InternalPermissionsOneOf0Parser.g:390:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalPermissionsOneOf0Parser.g:390:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalPermissionsOneOf0Parser.g:391:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalPermissionsOneOf0Parser.g:397:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:403:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalPermissionsOneOf0Parser.g:404:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalPermissionsOneOf0Parser.g:404:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalPermissionsOneOf0Parser.g:405:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalPermissionsOneOf0Parser.g:405:3: ()
            // InternalPermissionsOneOf0Parser.g:406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPermissionsOneOf0Parser.g:416:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPermissionsOneOf0Parser.g:417:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalPermissionsOneOf0Parser.g:417:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalPermissionsOneOf0Parser.g:418:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalPermissionsOneOf0Parser.g:418:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalPermissionsOneOf0Parser.g:419:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {

                    						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_keyvaluepair_2_0=ruleKeyValuePair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    						}
                    						add(
                    							current,
                    							"keyvaluepair",
                    							lv_keyvaluepair_2_0,
                    							"githubwf.githubwf.PermissionsOneOf0.KeyValuePair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPermissionsOneOf0Parser.g:436:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPermissionsOneOf0Parser.g:437:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalPermissionsOneOf0Parser.g:441:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalPermissionsOneOf0Parser.g:442:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalPermissionsOneOf0Parser.g:442:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalPermissionsOneOf0Parser.g:443:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_keyvaluepair_4_0=ruleKeyValuePair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keyvaluepair",
                    	    								lv_keyvaluepair_4_0,
                    	    								"githubwf.githubwf.PermissionsOneOf0.KeyValuePair");
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
    // InternalPermissionsOneOf0Parser.g:470:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalPermissionsOneOf0Parser.g:470:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalPermissionsOneOf0Parser.g:471:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalPermissionsOneOf0Parser.g:477:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:483:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalPermissionsOneOf0Parser.g:484:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalPermissionsOneOf0Parser.g:484:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalPermissionsOneOf0Parser.g:485:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalPermissionsOneOf0Parser.g:485:3: (lv_value_0_0= ruleEBoolean )
            // InternalPermissionsOneOf0Parser.g:486:4: lv_value_0_0= ruleEBoolean
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
            					"githubwf.githubwf.PermissionsOneOf0.EBoolean");
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
    // InternalPermissionsOneOf0Parser.g:506:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPermissionsOneOf0Parser.g:506:47: (iv_ruleEString= ruleEString EOF )
            // InternalPermissionsOneOf0Parser.g:507:2: iv_ruleEString= ruleEString EOF
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
    // InternalPermissionsOneOf0Parser.g:513:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:519:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalPermissionsOneOf0Parser.g:520:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalPermissionsOneOf0Parser.g:533:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalPermissionsOneOf0Parser.g:533:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalPermissionsOneOf0Parser.g:534:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalPermissionsOneOf0Parser.g:540:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:546:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalPermissionsOneOf0Parser.g:547:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalPermissionsOneOf0Parser.g:547:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_E_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_E_DOUBLE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPermissionsOneOf0Parser.g:548:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf0Parser.g:556:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalPermissionsOneOf0Parser.g:567:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalPermissionsOneOf0Parser.g:567:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalPermissionsOneOf0Parser.g:568:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalPermissionsOneOf0Parser.g:574:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:580:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalPermissionsOneOf0Parser.g:581:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalPermissionsOneOf0Parser.g:581:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalPermissionsOneOf0Parser.g:582:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalPermissionsOneOf0Parser.g:582:3: ( (lv_key_0_0= ruleEString ) )
            // InternalPermissionsOneOf0Parser.g:583:4: (lv_key_0_0= ruleEString )
            {
            // InternalPermissionsOneOf0Parser.g:583:4: (lv_key_0_0= ruleEString )
            // InternalPermissionsOneOf0Parser.g:584:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"githubwf.githubwf.PermissionsOneOf0.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf0Parser.g:605:3: ( (lv_value_2_0= ruleValue ) )
            // InternalPermissionsOneOf0Parser.g:606:4: (lv_value_2_0= ruleValue )
            {
            // InternalPermissionsOneOf0Parser.g:606:4: (lv_value_2_0= ruleValue )
            // InternalPermissionsOneOf0Parser.g:607:5: lv_value_2_0= ruleValue
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
            						"githubwf.githubwf.PermissionsOneOf0.Value");
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
    // InternalPermissionsOneOf0Parser.g:628:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalPermissionsOneOf0Parser.g:628:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalPermissionsOneOf0Parser.g:629:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalPermissionsOneOf0Parser.g:635:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:641:2: ( (kw= True | kw= False ) )
            // InternalPermissionsOneOf0Parser.g:642:2: (kw= True | kw= False )
            {
            // InternalPermissionsOneOf0Parser.g:642:2: (kw= True | kw= False )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==True) ) {
                alt7=1;
            }
            else if ( (LA7_0==False) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPermissionsOneOf0Parser.g:643:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf0Parser.g:649:3: kw= False
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
    // InternalPermissionsOneOf0Parser.g:658:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalPermissionsOneOf0Parser.g:658:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalPermissionsOneOf0Parser.g:659:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalPermissionsOneOf0Parser.g:665:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:671:2: (this_STRING_0= RULE_STRING )
            // InternalPermissionsOneOf0Parser.g:672:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "ruleNullEnum"
    // InternalPermissionsOneOf0Parser.g:682:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalPermissionsOneOf0Parser.g:688:2: ( (enumLiteral_0= Null ) )
            // InternalPermissionsOneOf0Parser.g:689:2: (enumLiteral_0= Null )
            {
            // InternalPermissionsOneOf0Parser.g:689:2: (enumLiteral_0= Null )
            // InternalPermissionsOneOf0Parser.g:690:3: enumLiteral_0= Null
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001CE70L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001CA70L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});

}
