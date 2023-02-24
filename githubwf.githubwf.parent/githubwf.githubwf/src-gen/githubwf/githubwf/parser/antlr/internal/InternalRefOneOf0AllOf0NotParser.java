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
import githubwf.githubwf.services.RefOneOf0AllOf0NotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRefOneOf0AllOf0NotParser extends AbstractInternalAntlrParser {
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


        public InternalRefOneOf0AllOf0NotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRefOneOf0AllOf0NotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRefOneOf0AllOf0NotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRefOneOf0AllOf0NotParser.g"; }



     	private RefOneOf0AllOf0NotGrammarAccess grammarAccess;

        public InternalRefOneOf0AllOf0NotParser(TokenStream input, RefOneOf0AllOf0NotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RefOneOf0AllOf0Not";
       	}

       	@Override
       	protected RefOneOf0AllOf0NotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRefOneOf0AllOf0Not"
    // InternalRefOneOf0AllOf0NotParser.g:58:1: entryRuleRefOneOf0AllOf0Not returns [EObject current=null] : iv_ruleRefOneOf0AllOf0Not= ruleRefOneOf0AllOf0Not EOF ;
    public final EObject entryRuleRefOneOf0AllOf0Not() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0Not = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:58:59: (iv_ruleRefOneOf0AllOf0Not= ruleRefOneOf0AllOf0Not EOF )
            // InternalRefOneOf0AllOf0NotParser.g:59:2: iv_ruleRefOneOf0AllOf0Not= ruleRefOneOf0AllOf0Not EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0Not=ruleRefOneOf0AllOf0Not();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0Not; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0Not"


    // $ANTLR start "ruleRefOneOf0AllOf0Not"
    // InternalRefOneOf0AllOf0NotParser.g:65:1: ruleRefOneOf0AllOf0Not returns [EObject current=null] : ( (lv_ref_0_0= ruleRefOneOf0AllOf0NotAbstract ) ) ;
    public final EObject ruleRefOneOf0AllOf0Not() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:71:2: ( ( (lv_ref_0_0= ruleRefOneOf0AllOf0NotAbstract ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:72:2: ( (lv_ref_0_0= ruleRefOneOf0AllOf0NotAbstract ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:72:2: ( (lv_ref_0_0= ruleRefOneOf0AllOf0NotAbstract ) )
            // InternalRefOneOf0AllOf0NotParser.g:73:3: (lv_ref_0_0= ruleRefOneOf0AllOf0NotAbstract )
            {
            // InternalRefOneOf0AllOf0NotParser.g:73:3: (lv_ref_0_0= ruleRefOneOf0AllOf0NotAbstract )
            // InternalRefOneOf0AllOf0NotParser.g:74:4: lv_ref_0_0= ruleRefOneOf0AllOf0NotAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAccess().getRefRefOneOf0AllOf0NotAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ref_0_0=ruleRefOneOf0AllOf0NotAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotRule());
              				}
              				set(
              					current,
              					"ref",
              					lv_ref_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.RefOneOf0AllOf0NotAbstract");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0Not"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotAbstract"
    // InternalRefOneOf0AllOf0NotParser.g:94:1: entryRuleRefOneOf0AllOf0NotAbstract returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotAbstract= ruleRefOneOf0AllOf0NotAbstract EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotAbstract = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:94:67: (iv_ruleRefOneOf0AllOf0NotAbstract= ruleRefOneOf0AllOf0NotAbstract EOF )
            // InternalRefOneOf0AllOf0NotParser.g:95:2: iv_ruleRefOneOf0AllOf0NotAbstract= ruleRefOneOf0AllOf0NotAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotAbstract=ruleRefOneOf0AllOf0NotAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotAbstract"


    // $ANTLR start "ruleRefOneOf0AllOf0NotAbstract"
    // InternalRefOneOf0AllOf0NotParser.g:101:1: ruleRefOneOf0AllOf0NotAbstract returns [EObject current=null] : ( ( ( ruleRefOneOf0AllOf0NotTypeNumber )=>this_RefOneOf0AllOf0NotTypeNumber_0= ruleRefOneOf0AllOf0NotTypeNumber ) | this_RefOneOf0AllOf0NotTypeString_1= ruleRefOneOf0AllOf0NotTypeString | this_RefOneOf0AllOf0NotTypeInteger_2= ruleRefOneOf0AllOf0NotTypeInteger | this_RefOneOf0AllOf0NotTypeBoolean_3= ruleRefOneOf0AllOf0NotTypeBoolean | this_RefOneOf0AllOf0NotTypeObject_4= ruleRefOneOf0AllOf0NotTypeObject | this_RefOneOf0AllOf0NotTypeArray_5= ruleRefOneOf0AllOf0NotTypeArray | this_RefOneOf0AllOf0NotTypeNull_6= ruleRefOneOf0AllOf0NotTypeNull ) ;
    public final EObject ruleRefOneOf0AllOf0NotAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_RefOneOf0AllOf0NotTypeNumber_0 = null;

        EObject this_RefOneOf0AllOf0NotTypeString_1 = null;

        EObject this_RefOneOf0AllOf0NotTypeInteger_2 = null;

        EObject this_RefOneOf0AllOf0NotTypeBoolean_3 = null;

        EObject this_RefOneOf0AllOf0NotTypeObject_4 = null;

        EObject this_RefOneOf0AllOf0NotTypeArray_5 = null;

        EObject this_RefOneOf0AllOf0NotTypeNull_6 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:107:2: ( ( ( ( ruleRefOneOf0AllOf0NotTypeNumber )=>this_RefOneOf0AllOf0NotTypeNumber_0= ruleRefOneOf0AllOf0NotTypeNumber ) | this_RefOneOf0AllOf0NotTypeString_1= ruleRefOneOf0AllOf0NotTypeString | this_RefOneOf0AllOf0NotTypeInteger_2= ruleRefOneOf0AllOf0NotTypeInteger | this_RefOneOf0AllOf0NotTypeBoolean_3= ruleRefOneOf0AllOf0NotTypeBoolean | this_RefOneOf0AllOf0NotTypeObject_4= ruleRefOneOf0AllOf0NotTypeObject | this_RefOneOf0AllOf0NotTypeArray_5= ruleRefOneOf0AllOf0NotTypeArray | this_RefOneOf0AllOf0NotTypeNull_6= ruleRefOneOf0AllOf0NotTypeNull ) )
            // InternalRefOneOf0AllOf0NotParser.g:108:2: ( ( ( ruleRefOneOf0AllOf0NotTypeNumber )=>this_RefOneOf0AllOf0NotTypeNumber_0= ruleRefOneOf0AllOf0NotTypeNumber ) | this_RefOneOf0AllOf0NotTypeString_1= ruleRefOneOf0AllOf0NotTypeString | this_RefOneOf0AllOf0NotTypeInteger_2= ruleRefOneOf0AllOf0NotTypeInteger | this_RefOneOf0AllOf0NotTypeBoolean_3= ruleRefOneOf0AllOf0NotTypeBoolean | this_RefOneOf0AllOf0NotTypeObject_4= ruleRefOneOf0AllOf0NotTypeObject | this_RefOneOf0AllOf0NotTypeArray_5= ruleRefOneOf0AllOf0NotTypeArray | this_RefOneOf0AllOf0NotTypeNull_6= ruleRefOneOf0AllOf0NotTypeNull )
            {
            // InternalRefOneOf0AllOf0NotParser.g:108:2: ( ( ( ruleRefOneOf0AllOf0NotTypeNumber )=>this_RefOneOf0AllOf0NotTypeNumber_0= ruleRefOneOf0AllOf0NotTypeNumber ) | this_RefOneOf0AllOf0NotTypeString_1= ruleRefOneOf0AllOf0NotTypeString | this_RefOneOf0AllOf0NotTypeInteger_2= ruleRefOneOf0AllOf0NotTypeInteger | this_RefOneOf0AllOf0NotTypeBoolean_3= ruleRefOneOf0AllOf0NotTypeBoolean | this_RefOneOf0AllOf0NotTypeObject_4= ruleRefOneOf0AllOf0NotTypeObject | this_RefOneOf0AllOf0NotTypeArray_5= ruleRefOneOf0AllOf0NotTypeArray | this_RefOneOf0AllOf0NotTypeNull_6= ruleRefOneOf0AllOf0NotTypeNull )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:109:3: ( ( ruleRefOneOf0AllOf0NotTypeNumber )=>this_RefOneOf0AllOf0NotTypeNumber_0= ruleRefOneOf0AllOf0NotTypeNumber )
                    {
                    // InternalRefOneOf0AllOf0NotParser.g:109:3: ( ( ruleRefOneOf0AllOf0NotTypeNumber )=>this_RefOneOf0AllOf0NotTypeNumber_0= ruleRefOneOf0AllOf0NotTypeNumber )
                    // InternalRefOneOf0AllOf0NotParser.g:110:4: ( ruleRefOneOf0AllOf0NotTypeNumber )=>this_RefOneOf0AllOf0NotTypeNumber_0= ruleRefOneOf0AllOf0NotTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAbstractAccess().getRefOneOf0AllOf0NotTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RefOneOf0AllOf0NotTypeNumber_0=ruleRefOneOf0AllOf0NotTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RefOneOf0AllOf0NotTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRefOneOf0AllOf0NotParser.g:121:3: this_RefOneOf0AllOf0NotTypeString_1= ruleRefOneOf0AllOf0NotTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAbstractAccess().getRefOneOf0AllOf0NotTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RefOneOf0AllOf0NotTypeString_1=ruleRefOneOf0AllOf0NotTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RefOneOf0AllOf0NotTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRefOneOf0AllOf0NotParser.g:130:3: this_RefOneOf0AllOf0NotTypeInteger_2= ruleRefOneOf0AllOf0NotTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAbstractAccess().getRefOneOf0AllOf0NotTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RefOneOf0AllOf0NotTypeInteger_2=ruleRefOneOf0AllOf0NotTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RefOneOf0AllOf0NotTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRefOneOf0AllOf0NotParser.g:139:3: this_RefOneOf0AllOf0NotTypeBoolean_3= ruleRefOneOf0AllOf0NotTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAbstractAccess().getRefOneOf0AllOf0NotTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RefOneOf0AllOf0NotTypeBoolean_3=ruleRefOneOf0AllOf0NotTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RefOneOf0AllOf0NotTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRefOneOf0AllOf0NotParser.g:148:3: this_RefOneOf0AllOf0NotTypeObject_4= ruleRefOneOf0AllOf0NotTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAbstractAccess().getRefOneOf0AllOf0NotTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RefOneOf0AllOf0NotTypeObject_4=ruleRefOneOf0AllOf0NotTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RefOneOf0AllOf0NotTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRefOneOf0AllOf0NotParser.g:157:3: this_RefOneOf0AllOf0NotTypeArray_5= ruleRefOneOf0AllOf0NotTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAbstractAccess().getRefOneOf0AllOf0NotTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RefOneOf0AllOf0NotTypeArray_5=ruleRefOneOf0AllOf0NotTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RefOneOf0AllOf0NotTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalRefOneOf0AllOf0NotParser.g:166:3: this_RefOneOf0AllOf0NotTypeNull_6= ruleRefOneOf0AllOf0NotTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAbstractAccess().getRefOneOf0AllOf0NotTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RefOneOf0AllOf0NotTypeNull_6=ruleRefOneOf0AllOf0NotTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RefOneOf0AllOf0NotTypeNull_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotAbstract"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotPropertiesAbstract"
    // InternalRefOneOf0AllOf0NotParser.g:178:1: entryRuleRefOneOf0AllOf0NotPropertiesAbstract returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotPropertiesAbstract= ruleRefOneOf0AllOf0NotPropertiesAbstract EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotPropertiesAbstract = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:178:77: (iv_ruleRefOneOf0AllOf0NotPropertiesAbstract= ruleRefOneOf0AllOf0NotPropertiesAbstract EOF )
            // InternalRefOneOf0AllOf0NotParser.g:179:2: iv_ruleRefOneOf0AllOf0NotPropertiesAbstract= ruleRefOneOf0AllOf0NotPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotPropertiesAbstract=ruleRefOneOf0AllOf0NotPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotPropertiesAbstract"


    // $ANTLR start "ruleRefOneOf0AllOf0NotPropertiesAbstract"
    // InternalRefOneOf0AllOf0NotParser.g:185:1: ruleRefOneOf0AllOf0NotPropertiesAbstract returns [EObject current=null] : ( ( ruleRefOneOf0AllOf0NotAdditionalProperties )=>this_RefOneOf0AllOf0NotAdditionalProperties_0= ruleRefOneOf0AllOf0NotAdditionalProperties ) ;
    public final EObject ruleRefOneOf0AllOf0NotPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_RefOneOf0AllOf0NotAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:191:2: ( ( ( ruleRefOneOf0AllOf0NotAdditionalProperties )=>this_RefOneOf0AllOf0NotAdditionalProperties_0= ruleRefOneOf0AllOf0NotAdditionalProperties ) )
            // InternalRefOneOf0AllOf0NotParser.g:192:2: ( ( ruleRefOneOf0AllOf0NotAdditionalProperties )=>this_RefOneOf0AllOf0NotAdditionalProperties_0= ruleRefOneOf0AllOf0NotAdditionalProperties )
            {
            // InternalRefOneOf0AllOf0NotParser.g:192:2: ( ( ruleRefOneOf0AllOf0NotAdditionalProperties )=>this_RefOneOf0AllOf0NotAdditionalProperties_0= ruleRefOneOf0AllOf0NotAdditionalProperties )
            // InternalRefOneOf0AllOf0NotParser.g:193:3: ( ruleRefOneOf0AllOf0NotAdditionalProperties )=>this_RefOneOf0AllOf0NotAdditionalProperties_0= ruleRefOneOf0AllOf0NotAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotPropertiesAbstractAccess().getRefOneOf0AllOf0NotAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_RefOneOf0AllOf0NotAdditionalProperties_0=ruleRefOneOf0AllOf0NotAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RefOneOf0AllOf0NotAdditionalProperties_0;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalRefOneOf0AllOf0NotParser.g:206:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:206:46: (iv_ruleValue= ruleValue EOF )
            // InternalRefOneOf0AllOf0NotParser.g:207:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:213:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalRefOneOf0AllOf0NotParser.g:219:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalRefOneOf0AllOf0NotParser.g:220:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalRefOneOf0AllOf0NotParser.g:220:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt2=6;
            switch ( input.LA(1) ) {
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:221:3: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRefOneOf0AllOf0NotParser.g:230:3: this_ArrayValue_1= ruleArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayValue_1=ruleArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRefOneOf0AllOf0NotParser.g:239:3: this_NullValue_2= ruleNullValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRefOneOf0AllOf0NotParser.g:248:3: this_NumberValue_3= ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberValue_3=ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRefOneOf0AllOf0NotParser.g:257:3: this_ObjectValue_4= ruleObjectValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ObjectValue_4=ruleObjectValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ObjectValue_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRefOneOf0AllOf0NotParser.g:266:3: this_BooleanValue_5= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_5=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValue_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotTypeString"
    // InternalRefOneOf0AllOf0NotParser.g:278:1: entryRuleRefOneOf0AllOf0NotTypeString returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotTypeString= ruleRefOneOf0AllOf0NotTypeString EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotTypeString = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:278:69: (iv_ruleRefOneOf0AllOf0NotTypeString= ruleRefOneOf0AllOf0NotTypeString EOF )
            // InternalRefOneOf0AllOf0NotParser.g:279:2: iv_ruleRefOneOf0AllOf0NotTypeString= ruleRefOneOf0AllOf0NotTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotTypeString=ruleRefOneOf0AllOf0NotTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotTypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotTypeString"


    // $ANTLR start "ruleRefOneOf0AllOf0NotTypeString"
    // InternalRefOneOf0AllOf0NotParser.g:285:1: ruleRefOneOf0AllOf0NotTypeString returns [EObject current=null] : ( (lv_ref_0_0= ruleEString ) ) ;
    public final EObject ruleRefOneOf0AllOf0NotTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:291:2: ( ( (lv_ref_0_0= ruleEString ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:292:2: ( (lv_ref_0_0= ruleEString ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:292:2: ( (lv_ref_0_0= ruleEString ) )
            // InternalRefOneOf0AllOf0NotParser.g:293:3: (lv_ref_0_0= ruleEString )
            {
            // InternalRefOneOf0AllOf0NotParser.g:293:3: (lv_ref_0_0= ruleEString )
            // InternalRefOneOf0AllOf0NotParser.g:294:4: lv_ref_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeStringAccess().getRefEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ref_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotTypeStringRule());
              				}
              				set(
              					current,
              					"ref",
              					lv_ref_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.EString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotTypeString"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotTypeInteger"
    // InternalRefOneOf0AllOf0NotParser.g:314:1: entryRuleRefOneOf0AllOf0NotTypeInteger returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotTypeInteger= ruleRefOneOf0AllOf0NotTypeInteger EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotTypeInteger = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:314:70: (iv_ruleRefOneOf0AllOf0NotTypeInteger= ruleRefOneOf0AllOf0NotTypeInteger EOF )
            // InternalRefOneOf0AllOf0NotParser.g:315:2: iv_ruleRefOneOf0AllOf0NotTypeInteger= ruleRefOneOf0AllOf0NotTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotTypeInteger=ruleRefOneOf0AllOf0NotTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotTypeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotTypeInteger"


    // $ANTLR start "ruleRefOneOf0AllOf0NotTypeInteger"
    // InternalRefOneOf0AllOf0NotParser.g:321:1: ruleRefOneOf0AllOf0NotTypeInteger returns [EObject current=null] : ( (lv_ref_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleRefOneOf0AllOf0NotTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:327:2: ( ( (lv_ref_0_0= ruleEDoubleObject ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:328:2: ( (lv_ref_0_0= ruleEDoubleObject ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:328:2: ( (lv_ref_0_0= ruleEDoubleObject ) )
            // InternalRefOneOf0AllOf0NotParser.g:329:3: (lv_ref_0_0= ruleEDoubleObject )
            {
            // InternalRefOneOf0AllOf0NotParser.g:329:3: (lv_ref_0_0= ruleEDoubleObject )
            // InternalRefOneOf0AllOf0NotParser.g:330:4: lv_ref_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeIntegerAccess().getRefEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ref_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotTypeIntegerRule());
              				}
              				set(
              					current,
              					"ref",
              					lv_ref_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.EDoubleObject");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotTypeInteger"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotTypeNumber"
    // InternalRefOneOf0AllOf0NotParser.g:350:1: entryRuleRefOneOf0AllOf0NotTypeNumber returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotTypeNumber= ruleRefOneOf0AllOf0NotTypeNumber EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotTypeNumber = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:350:69: (iv_ruleRefOneOf0AllOf0NotTypeNumber= ruleRefOneOf0AllOf0NotTypeNumber EOF )
            // InternalRefOneOf0AllOf0NotParser.g:351:2: iv_ruleRefOneOf0AllOf0NotTypeNumber= ruleRefOneOf0AllOf0NotTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotTypeNumber=ruleRefOneOf0AllOf0NotTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotTypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotTypeNumber"


    // $ANTLR start "ruleRefOneOf0AllOf0NotTypeNumber"
    // InternalRefOneOf0AllOf0NotParser.g:357:1: ruleRefOneOf0AllOf0NotTypeNumber returns [EObject current=null] : ( (lv_ref_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleRefOneOf0AllOf0NotTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:363:2: ( ( (lv_ref_0_0= ruleEDoubleObject ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:364:2: ( (lv_ref_0_0= ruleEDoubleObject ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:364:2: ( (lv_ref_0_0= ruleEDoubleObject ) )
            // InternalRefOneOf0AllOf0NotParser.g:365:3: (lv_ref_0_0= ruleEDoubleObject )
            {
            // InternalRefOneOf0AllOf0NotParser.g:365:3: (lv_ref_0_0= ruleEDoubleObject )
            // InternalRefOneOf0AllOf0NotParser.g:366:4: lv_ref_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeNumberAccess().getRefEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ref_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotTypeNumberRule());
              				}
              				set(
              					current,
              					"ref",
              					lv_ref_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.EDoubleObject");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotTypeNumber"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotTypeBoolean"
    // InternalRefOneOf0AllOf0NotParser.g:386:1: entryRuleRefOneOf0AllOf0NotTypeBoolean returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotTypeBoolean= ruleRefOneOf0AllOf0NotTypeBoolean EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotTypeBoolean = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:386:70: (iv_ruleRefOneOf0AllOf0NotTypeBoolean= ruleRefOneOf0AllOf0NotTypeBoolean EOF )
            // InternalRefOneOf0AllOf0NotParser.g:387:2: iv_ruleRefOneOf0AllOf0NotTypeBoolean= ruleRefOneOf0AllOf0NotTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotTypeBoolean=ruleRefOneOf0AllOf0NotTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotTypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotTypeBoolean"


    // $ANTLR start "ruleRefOneOf0AllOf0NotTypeBoolean"
    // InternalRefOneOf0AllOf0NotParser.g:393:1: ruleRefOneOf0AllOf0NotTypeBoolean returns [EObject current=null] : ( (lv_ref_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleRefOneOf0AllOf0NotTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:399:2: ( ( (lv_ref_0_0= ruleEBooleanObject ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:400:2: ( (lv_ref_0_0= ruleEBooleanObject ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:400:2: ( (lv_ref_0_0= ruleEBooleanObject ) )
            // InternalRefOneOf0AllOf0NotParser.g:401:3: (lv_ref_0_0= ruleEBooleanObject )
            {
            // InternalRefOneOf0AllOf0NotParser.g:401:3: (lv_ref_0_0= ruleEBooleanObject )
            // InternalRefOneOf0AllOf0NotParser.g:402:4: lv_ref_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeBooleanAccess().getRefEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ref_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotTypeBooleanRule());
              				}
              				set(
              					current,
              					"ref",
              					lv_ref_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.EBooleanObject");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotTypeBoolean"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotTypeObject"
    // InternalRefOneOf0AllOf0NotParser.g:422:1: entryRuleRefOneOf0AllOf0NotTypeObject returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotTypeObject= ruleRefOneOf0AllOf0NotTypeObject EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotTypeObject = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:422:69: (iv_ruleRefOneOf0AllOf0NotTypeObject= ruleRefOneOf0AllOf0NotTypeObject EOF )
            // InternalRefOneOf0AllOf0NotParser.g:423:2: iv_ruleRefOneOf0AllOf0NotTypeObject= ruleRefOneOf0AllOf0NotTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotTypeObject=ruleRefOneOf0AllOf0NotTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotTypeObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotTypeObject"


    // $ANTLR start "ruleRefOneOf0AllOf0NotTypeObject"
    // InternalRefOneOf0AllOf0NotParser.g:429:1: ruleRefOneOf0AllOf0NotTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleRefOneOf0AllOf0NotTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ref_2_0 = null;

        EObject lv_ref_4_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:435:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalRefOneOf0AllOf0NotParser.g:436:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalRefOneOf0AllOf0NotParser.g:436:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalRefOneOf0AllOf0NotParser.g:437:3: () otherlv_1= LeftCurlyBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalRefOneOf0AllOf0NotParser.g:437:3: ()
            // InternalRefOneOf0AllOf0NotParser.g:438:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRefOneOf0AllOf0NotTypeObjectAccess().getRefOneOf0AllOf0NotTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRefOneOf0AllOf0NotTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRefOneOf0AllOf0NotParser.g:448:3: ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:449:4: ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) )*
                    {
                    // InternalRefOneOf0AllOf0NotParser.g:449:4: ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) )
                    // InternalRefOneOf0AllOf0NotParser.g:450:5: (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract )
                    {
                    // InternalRefOneOf0AllOf0NotParser.g:450:5: (lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract )
                    // InternalRefOneOf0AllOf0NotParser.g:451:6: lv_ref_2_0= ruleRefOneOf0AllOf0NotPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeObjectAccess().getRefRefOneOf0AllOf0NotPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_ref_2_0=ruleRefOneOf0AllOf0NotPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"ref",
                      							lv_ref_2_0,
                      							"githubwf.githubwf.RefOneOf0AllOf0Not.RefOneOf0AllOf0NotPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRefOneOf0AllOf0NotParser.g:468:4: (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Comma) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRefOneOf0AllOf0NotParser.g:469:5: otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getRefOneOf0AllOf0NotTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalRefOneOf0AllOf0NotParser.g:473:5: ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract ) )
                    	    // InternalRefOneOf0AllOf0NotParser.g:474:6: (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract )
                    	    {
                    	    // InternalRefOneOf0AllOf0NotParser.g:474:6: (lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract )
                    	    // InternalRefOneOf0AllOf0NotParser.g:475:7: lv_ref_4_0= ruleRefOneOf0AllOf0NotPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeObjectAccess().getRefRefOneOf0AllOf0NotPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_ref_4_0=ruleRefOneOf0AllOf0NotPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ref",
                    	      								lv_ref_4_0,
                    	      								"githubwf.githubwf.RefOneOf0AllOf0Not.RefOneOf0AllOf0NotPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRefOneOf0AllOf0NotTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotTypeObject"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotTypeArray"
    // InternalRefOneOf0AllOf0NotParser.g:502:1: entryRuleRefOneOf0AllOf0NotTypeArray returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotTypeArray= ruleRefOneOf0AllOf0NotTypeArray EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotTypeArray = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:502:68: (iv_ruleRefOneOf0AllOf0NotTypeArray= ruleRefOneOf0AllOf0NotTypeArray EOF )
            // InternalRefOneOf0AllOf0NotParser.g:503:2: iv_ruleRefOneOf0AllOf0NotTypeArray= ruleRefOneOf0AllOf0NotTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotTypeArray=ruleRefOneOf0AllOf0NotTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotTypeArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotTypeArray"


    // $ANTLR start "ruleRefOneOf0AllOf0NotTypeArray"
    // InternalRefOneOf0AllOf0NotParser.g:509:1: ruleRefOneOf0AllOf0NotTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleRefOneOf0AllOf0NotTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ref_2_0 = null;

        EObject lv_ref_4_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:515:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalRefOneOf0AllOf0NotParser.g:516:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalRefOneOf0AllOf0NotParser.g:516:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalRefOneOf0AllOf0NotParser.g:517:3: () otherlv_1= LeftSquareBracket ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalRefOneOf0AllOf0NotParser.g:517:3: ()
            // InternalRefOneOf0AllOf0NotParser.g:518:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRefOneOf0AllOf0NotTypeArrayAccess().getRefOneOf0AllOf0NotTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRefOneOf0AllOf0NotTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalRefOneOf0AllOf0NotParser.g:528:3: ( ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=False && LA6_0<=True)||LA6_0==LeftSquareBracket||LA6_0==LeftCurlyBracket||(LA6_0>=RULE_STRING && LA6_0<=RULE_E_DOUBLE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:529:4: ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems ) ) (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) ) )*
                    {
                    // InternalRefOneOf0AllOf0NotParser.g:529:4: ( (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems ) )
                    // InternalRefOneOf0AllOf0NotParser.g:530:5: (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems )
                    {
                    // InternalRefOneOf0AllOf0NotParser.g:530:5: (lv_ref_2_0= ruleRefOneOf0AllOf0NotItems )
                    // InternalRefOneOf0AllOf0NotParser.g:531:6: lv_ref_2_0= ruleRefOneOf0AllOf0NotItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeArrayAccess().getRefRefOneOf0AllOf0NotItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_ref_2_0=ruleRefOneOf0AllOf0NotItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"ref",
                      							lv_ref_2_0,
                      							"githubwf.githubwf.RefOneOf0AllOf0Not.RefOneOf0AllOf0NotItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRefOneOf0AllOf0NotParser.g:548:4: (otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRefOneOf0AllOf0NotParser.g:549:5: otherlv_3= Comma ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getRefOneOf0AllOf0NotTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalRefOneOf0AllOf0NotParser.g:553:5: ( (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems ) )
                    	    // InternalRefOneOf0AllOf0NotParser.g:554:6: (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems )
                    	    {
                    	    // InternalRefOneOf0AllOf0NotParser.g:554:6: (lv_ref_4_0= ruleRefOneOf0AllOf0NotItems )
                    	    // InternalRefOneOf0AllOf0NotParser.g:555:7: lv_ref_4_0= ruleRefOneOf0AllOf0NotItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeArrayAccess().getRefRefOneOf0AllOf0NotItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_ref_4_0=ruleRefOneOf0AllOf0NotItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ref",
                    	      								lv_ref_4_0,
                    	      								"githubwf.githubwf.RefOneOf0AllOf0Not.RefOneOf0AllOf0NotItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRefOneOf0AllOf0NotTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotTypeArray"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotTypeNull"
    // InternalRefOneOf0AllOf0NotParser.g:582:1: entryRuleRefOneOf0AllOf0NotTypeNull returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotTypeNull= ruleRefOneOf0AllOf0NotTypeNull EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotTypeNull = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:582:67: (iv_ruleRefOneOf0AllOf0NotTypeNull= ruleRefOneOf0AllOf0NotTypeNull EOF )
            // InternalRefOneOf0AllOf0NotParser.g:583:2: iv_ruleRefOneOf0AllOf0NotTypeNull= ruleRefOneOf0AllOf0NotTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotTypeNull=ruleRefOneOf0AllOf0NotTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotTypeNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotTypeNull"


    // $ANTLR start "ruleRefOneOf0AllOf0NotTypeNull"
    // InternalRefOneOf0AllOf0NotParser.g:589:1: ruleRefOneOf0AllOf0NotTypeNull returns [EObject current=null] : ( (lv_ref_0_0= ruleNullValue ) ) ;
    public final EObject ruleRefOneOf0AllOf0NotTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_ref_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:595:2: ( ( (lv_ref_0_0= ruleNullValue ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:596:2: ( (lv_ref_0_0= ruleNullValue ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:596:2: ( (lv_ref_0_0= ruleNullValue ) )
            // InternalRefOneOf0AllOf0NotParser.g:597:3: (lv_ref_0_0= ruleNullValue )
            {
            // InternalRefOneOf0AllOf0NotParser.g:597:3: (lv_ref_0_0= ruleNullValue )
            // InternalRefOneOf0AllOf0NotParser.g:598:4: lv_ref_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotTypeNullAccess().getRefNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ref_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotTypeNullRule());
              				}
              				set(
              					current,
              					"ref",
              					lv_ref_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.NullValue");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotTypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalRefOneOf0AllOf0NotParser.g:618:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:618:47: (iv_ruleEString= ruleEString EOF )
            // InternalRefOneOf0AllOf0NotParser.g:619:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:625:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:631:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalRefOneOf0AllOf0NotParser.g:632:2: this_VALID_STRING_0= ruleVALID_STRING
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_VALID_STRING_0=ruleVALID_STRING();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VALID_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalRefOneOf0AllOf0NotParser.g:645:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:645:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalRefOneOf0AllOf0NotParser.g:646:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDoubleObject.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:652:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:658:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalRefOneOf0AllOf0NotParser.g:659:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalRefOneOf0AllOf0NotParser.g:659:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_E_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_E_DOUBLE) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:660:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_E_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRefOneOf0AllOf0NotParser.g:668:3: this_E_DOUBLE_1= RULE_E_DOUBLE
                    {
                    this_E_DOUBLE_1=(Token)match(input,RULE_E_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_E_DOUBLE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalRefOneOf0AllOf0NotParser.g:679:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:679:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalRefOneOf0AllOf0NotParser.g:680:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBooleanObject=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBooleanObject.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:686:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:692:2: ( (kw= True | kw= False ) )
            // InternalRefOneOf0AllOf0NotParser.g:693:2: (kw= True | kw= False )
            {
            // InternalRefOneOf0AllOf0NotParser.g:693:2: (kw= True | kw= False )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==True) ) {
                alt8=1;
            }
            else if ( (LA8_0==False) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:694:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRefOneOf0AllOf0NotParser.g:700:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEBooleanObject"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotAdditionalProperties"
    // InternalRefOneOf0AllOf0NotParser.g:709:1: entryRuleRefOneOf0AllOf0NotAdditionalProperties returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotAdditionalProperties= ruleRefOneOf0AllOf0NotAdditionalProperties EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotAdditionalProperties = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:709:79: (iv_ruleRefOneOf0AllOf0NotAdditionalProperties= ruleRefOneOf0AllOf0NotAdditionalProperties EOF )
            // InternalRefOneOf0AllOf0NotParser.g:710:2: iv_ruleRefOneOf0AllOf0NotAdditionalProperties= ruleRefOneOf0AllOf0NotAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotAdditionalProperties=ruleRefOneOf0AllOf0NotAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotAdditionalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotAdditionalProperties"


    // $ANTLR start "ruleRefOneOf0AllOf0NotAdditionalProperties"
    // InternalRefOneOf0AllOf0NotParser.g:716:1: ruleRefOneOf0AllOf0NotAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleRefOneOf0AllOf0NotAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:722:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:723:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:723:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:724:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:724:3: ( (lv_key_0_0= ruleEString ) )
            // InternalRefOneOf0AllOf0NotParser.g:725:4: (lv_key_0_0= ruleEString )
            {
            // InternalRefOneOf0AllOf0NotParser.g:725:4: (lv_key_0_0= ruleEString )
            // InternalRefOneOf0AllOf0NotParser.g:726:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.RefOneOf0AllOf0Not.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRefOneOf0AllOf0NotAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalRefOneOf0AllOf0NotParser.g:747:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalRefOneOf0AllOf0NotParser.g:748:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalRefOneOf0AllOf0NotParser.g:748:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalRefOneOf0AllOf0NotParser.g:749:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.RefOneOf0AllOf0Not.JsonDocument");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalRefOneOf0AllOf0NotParser.g:770:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:770:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalRefOneOf0AllOf0NotParser.g:771:2: iv_ruleJsonDocument= ruleJsonDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJsonDocument=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonDocument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:777:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:783:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:784:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:784:2: ( (lv_value_0_0= ruleValue ) )
            // InternalRefOneOf0AllOf0NotParser.g:785:3: (lv_value_0_0= ruleValue )
            {
            // InternalRefOneOf0AllOf0NotParser.g:785:3: (lv_value_0_0= ruleValue )
            // InternalRefOneOf0AllOf0NotParser.g:786:4: lv_value_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getJsonDocumentRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.Value");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJsonDocument"


    // $ANTLR start "entryRuleStringValue"
    // InternalRefOneOf0AllOf0NotParser.g:806:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:806:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalRefOneOf0AllOf0NotParser.g:807:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:813:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:819:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:820:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:820:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRefOneOf0AllOf0NotParser.g:821:3: (lv_value_0_0= ruleEString )
            {
            // InternalRefOneOf0AllOf0NotParser.g:821:3: (lv_value_0_0= ruleEString )
            // InternalRefOneOf0AllOf0NotParser.g:822:4: lv_value_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getStringValueRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.EString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalRefOneOf0AllOf0NotParser.g:842:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:842:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalRefOneOf0AllOf0NotParser.g:843:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:849:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:855:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalRefOneOf0AllOf0NotParser.g:856:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalRefOneOf0AllOf0NotParser.g:856:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalRefOneOf0AllOf0NotParser.g:857:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalRefOneOf0AllOf0NotParser.g:857:3: ()
            // InternalRefOneOf0AllOf0NotParser.g:858:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalRefOneOf0AllOf0NotParser.g:868:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=False && LA10_0<=True)||LA10_0==LeftSquareBracket||LA10_0==LeftCurlyBracket||(LA10_0>=RULE_STRING && LA10_0<=RULE_E_DOUBLE)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:869:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalRefOneOf0AllOf0NotParser.g:869:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalRefOneOf0AllOf0NotParser.g:870:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalRefOneOf0AllOf0NotParser.g:870:5: (lv_value_2_0= ruleValue )
                    // InternalRefOneOf0AllOf0NotParser.g:871:6: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_value_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayValueRule());
                      						}
                      						add(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"githubwf.githubwf.RefOneOf0AllOf0Not.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRefOneOf0AllOf0NotParser.g:888:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Comma) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRefOneOf0AllOf0NotParser.g:889:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalRefOneOf0AllOf0NotParser.g:893:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalRefOneOf0AllOf0NotParser.g:894:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalRefOneOf0AllOf0NotParser.g:894:6: (lv_value_4_0= ruleValue )
                    	    // InternalRefOneOf0AllOf0NotParser.g:895:7: lv_value_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_value_4_0=ruleValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"value",
                    	      								lv_value_4_0,
                    	      								"githubwf.githubwf.RefOneOf0AllOf0Not.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalRefOneOf0AllOf0NotParser.g:922:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:922:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalRefOneOf0AllOf0NotParser.g:923:2: iv_ruleNullValue= ruleNullValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:929:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:935:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:936:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:936:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalRefOneOf0AllOf0NotParser.g:937:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalRefOneOf0AllOf0NotParser.g:937:3: (lv_value_0_0= ruleNullEnum )
            // InternalRefOneOf0AllOf0NotParser.g:938:4: lv_value_0_0= ruleNullEnum
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNullEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNullValueRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.NullEnum");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalRefOneOf0AllOf0NotParser.g:958:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:958:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalRefOneOf0AllOf0NotParser.g:959:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:965:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:971:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:972:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:972:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalRefOneOf0AllOf0NotParser.g:973:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalRefOneOf0AllOf0NotParser.g:973:3: (lv_value_0_0= ruleEDouble )
            // InternalRefOneOf0AllOf0NotParser.g:974:4: lv_value_0_0= ruleEDouble
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberValueRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.EDouble");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalRefOneOf0AllOf0NotParser.g:994:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:994:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalRefOneOf0AllOf0NotParser.g:995:2: iv_ruleObjectValue= ruleObjectValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectValue=ruleObjectValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:1001:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:1007:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalRefOneOf0AllOf0NotParser.g:1008:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1008:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalRefOneOf0AllOf0NotParser.g:1009:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalRefOneOf0AllOf0NotParser.g:1009:3: ()
            // InternalRefOneOf0AllOf0NotParser.g:1010:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalRefOneOf0AllOf0NotParser.g:1020:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:1021:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalRefOneOf0AllOf0NotParser.g:1021:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalRefOneOf0AllOf0NotParser.g:1022:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalRefOneOf0AllOf0NotParser.g:1022:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalRefOneOf0AllOf0NotParser.g:1023:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_keyvaluepair_2_0=ruleKeyValuePair();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getObjectValueRule());
                      						}
                      						add(
                      							current,
                      							"keyvaluepair",
                      							lv_keyvaluepair_2_0,
                      							"githubwf.githubwf.RefOneOf0AllOf0Not.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRefOneOf0AllOf0NotParser.g:1040:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRefOneOf0AllOf0NotParser.g:1041:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalRefOneOf0AllOf0NotParser.g:1045:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalRefOneOf0AllOf0NotParser.g:1046:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalRefOneOf0AllOf0NotParser.g:1046:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalRefOneOf0AllOf0NotParser.g:1047:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_keyvaluepair_4_0=ruleKeyValuePair();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"keyvaluepair",
                    	      								lv_keyvaluepair_4_0,
                    	      								"githubwf.githubwf.RefOneOf0AllOf0Not.KeyValuePair");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalRefOneOf0AllOf0NotParser.g:1074:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:1074:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalRefOneOf0AllOf0NotParser.g:1075:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:1081:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:1087:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:1088:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1088:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalRefOneOf0AllOf0NotParser.g:1089:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1089:3: (lv_value_0_0= ruleEBoolean )
            // InternalRefOneOf0AllOf0NotParser.g:1090:4: lv_value_0_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBooleanValueRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.EBoolean");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEDouble"
    // InternalRefOneOf0AllOf0NotParser.g:1110:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:1110:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalRefOneOf0AllOf0NotParser.g:1111:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:1117:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:1123:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalRefOneOf0AllOf0NotParser.g:1124:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1124:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_E_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_E_DOUBLE) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:1125:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_E_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRefOneOf0AllOf0NotParser.g:1133:3: this_E_DOUBLE_1= RULE_E_DOUBLE
                    {
                    this_E_DOUBLE_1=(Token)match(input,RULE_E_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_E_DOUBLE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalRefOneOf0AllOf0NotParser.g:1144:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:1144:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalRefOneOf0AllOf0NotParser.g:1145:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyValuePairRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyValuePair=ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyValuePair; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:1151:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:1157:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:1158:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1158:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:1159:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1159:3: ( (lv_key_0_0= ruleEString ) )
            // InternalRefOneOf0AllOf0NotParser.g:1160:4: (lv_key_0_0= ruleEString )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1160:4: (lv_key_0_0= ruleEString )
            // InternalRefOneOf0AllOf0NotParser.g:1161:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.RefOneOf0AllOf0Not.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalRefOneOf0AllOf0NotParser.g:1182:3: ( (lv_value_2_0= ruleValue ) )
            // InternalRefOneOf0AllOf0NotParser.g:1183:4: (lv_value_2_0= ruleValue )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1183:4: (lv_value_2_0= ruleValue )
            // InternalRefOneOf0AllOf0NotParser.g:1184:5: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"githubwf.githubwf.RefOneOf0AllOf0Not.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleEBoolean"
    // InternalRefOneOf0AllOf0NotParser.g:1205:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:1205:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalRefOneOf0AllOf0NotParser.g:1206:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:1212:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:1218:2: ( (kw= True | kw= False ) )
            // InternalRefOneOf0AllOf0NotParser.g:1219:2: (kw= True | kw= False )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1219:2: (kw= True | kw= False )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==True) ) {
                alt14=1;
            }
            else if ( (LA14_0==False) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRefOneOf0AllOf0NotParser.g:1220:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRefOneOf0AllOf0NotParser.g:1226:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleRefOneOf0AllOf0NotItems"
    // InternalRefOneOf0AllOf0NotParser.g:1235:1: entryRuleRefOneOf0AllOf0NotItems returns [EObject current=null] : iv_ruleRefOneOf0AllOf0NotItems= ruleRefOneOf0AllOf0NotItems EOF ;
    public final EObject entryRuleRefOneOf0AllOf0NotItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefOneOf0AllOf0NotItems = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:1235:64: (iv_ruleRefOneOf0AllOf0NotItems= ruleRefOneOf0AllOf0NotItems EOF )
            // InternalRefOneOf0AllOf0NotParser.g:1236:2: iv_ruleRefOneOf0AllOf0NotItems= ruleRefOneOf0AllOf0NotItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefOneOf0AllOf0NotItems=ruleRefOneOf0AllOf0NotItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefOneOf0AllOf0NotItems; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRefOneOf0AllOf0NotItems"


    // $ANTLR start "ruleRefOneOf0AllOf0NotItems"
    // InternalRefOneOf0AllOf0NotParser.g:1242:1: ruleRefOneOf0AllOf0NotItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleRefOneOf0AllOf0NotItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:1248:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalRefOneOf0AllOf0NotParser.g:1249:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1249:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalRefOneOf0AllOf0NotParser.g:1250:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1250:3: (lv_items_0_0= ruleJsonDocument )
            // InternalRefOneOf0AllOf0NotParser.g:1251:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getRefOneOf0AllOf0NotItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getRefOneOf0AllOf0NotItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.RefOneOf0AllOf0Not.JsonDocument");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRefOneOf0AllOf0NotItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalRefOneOf0AllOf0NotParser.g:1271:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalRefOneOf0AllOf0NotParser.g:1271:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalRefOneOf0AllOf0NotParser.g:1272:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVALID_STRINGRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVALID_STRING=ruleVALID_STRING();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVALID_STRING.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalRefOneOf0AllOf0NotParser.g:1278:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:1284:2: (this_STRING_0= RULE_STRING )
            // InternalRefOneOf0AllOf0NotParser.g:1285:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "ruleNullEnum"
    // InternalRefOneOf0AllOf0NotParser.g:1295:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRefOneOf0AllOf0NotParser.g:1301:2: ( (enumLiteral_0= Null ) )
            // InternalRefOneOf0AllOf0NotParser.g:1302:2: (enumLiteral_0= Null )
            {
            // InternalRefOneOf0AllOf0NotParser.g:1302:2: (enumLiteral_0= Null )
            // InternalRefOneOf0AllOf0NotParser.g:1303:3: enumLiteral_0= Null
            {
            enumLiteral_0=(Token)match(input,Null,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNullEnum"

    // $ANTLR start synpred1_InternalRefOneOf0AllOf0NotParser
    public final void synpred1_InternalRefOneOf0AllOf0NotParser_fragment() throws RecognitionException {   
        // InternalRefOneOf0AllOf0NotParser.g:110:4: ( ruleRefOneOf0AllOf0NotTypeNumber )
        // InternalRefOneOf0AllOf0NotParser.g:110:5: ruleRefOneOf0AllOf0NotTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleRefOneOf0AllOf0NotTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRefOneOf0AllOf0NotParser

    // Delegated rules

    public final boolean synpred1_InternalRefOneOf0AllOf0NotParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalRefOneOf0AllOf0NotParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\0\7\uffff";
    static final String dfa_3s = "\1\20\2\0\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_5s = "\1\uffff\1\1\1\0\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "108:2: ( ( ( ruleRefOneOf0AllOf0NotTypeNumber )=>this_RefOneOf0AllOf0NotTypeNumber_0= ruleRefOneOf0AllOf0NotTypeNumber ) | this_RefOneOf0AllOf0NotTypeString_1= ruleRefOneOf0AllOf0NotTypeString | this_RefOneOf0AllOf0NotTypeInteger_2= ruleRefOneOf0AllOf0NotTypeInteger | this_RefOneOf0AllOf0NotTypeBoolean_3= ruleRefOneOf0AllOf0NotTypeBoolean | this_RefOneOf0AllOf0NotTypeObject_4= ruleRefOneOf0AllOf0NotTypeObject | this_RefOneOf0AllOf0NotTypeArray_5= ruleRefOneOf0AllOf0NotTypeArray | this_RefOneOf0AllOf0NotTypeNull_6= ruleRefOneOf0AllOf0NotTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalRefOneOf0AllOf0NotParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalRefOneOf0AllOf0NotParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001CE70L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001CA70L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});

}
