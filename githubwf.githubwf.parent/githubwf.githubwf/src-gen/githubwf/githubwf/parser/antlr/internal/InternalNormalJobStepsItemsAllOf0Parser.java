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
import githubwf.githubwf.services.NormalJobStepsItemsAllOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNormalJobStepsItemsAllOf0Parser extends AbstractInternalAntlrParser {
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


        public InternalNormalJobStepsItemsAllOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobStepsItemsAllOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobStepsItemsAllOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobStepsItemsAllOf0Parser.g"; }



     	private NormalJobStepsItemsAllOf0GrammarAccess grammarAccess;

        public InternalNormalJobStepsItemsAllOf0Parser(TokenStream input, NormalJobStepsItemsAllOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobStepsItemsAllOf0";
       	}

       	@Override
       	protected NormalJobStepsItemsAllOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0"
    // InternalNormalJobStepsItemsAllOf0Parser.g:58:1: entryRuleNormalJobStepsItemsAllOf0 returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0= ruleNormalJobStepsItemsAllOf0 EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0 = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:58:66: (iv_ruleNormalJobStepsItemsAllOf0= ruleNormalJobStepsItemsAllOf0 EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:59:2: iv_ruleNormalJobStepsItemsAllOf0= ruleNormalJobStepsItemsAllOf0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0=ruleNormalJobStepsItemsAllOf0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0"
    // InternalNormalJobStepsItemsAllOf0Parser.g:65:1: ruleNormalJobStepsItemsAllOf0 returns [EObject current=null] : ( (lv_items_0_0= ruleNormalJobStepsItemsAllOf0Abstract ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:71:2: ( ( (lv_items_0_0= ruleNormalJobStepsItemsAllOf0Abstract ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:72:2: ( (lv_items_0_0= ruleNormalJobStepsItemsAllOf0Abstract ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:72:2: ( (lv_items_0_0= ruleNormalJobStepsItemsAllOf0Abstract ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:73:3: (lv_items_0_0= ruleNormalJobStepsItemsAllOf0Abstract )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:73:3: (lv_items_0_0= ruleNormalJobStepsItemsAllOf0Abstract )
            // InternalNormalJobStepsItemsAllOf0Parser.g:74:4: lv_items_0_0= ruleNormalJobStepsItemsAllOf0Abstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0Access().getItemsNormalJobStepsItemsAllOf0AbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleNormalJobStepsItemsAllOf0Abstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0Rule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.NormalJobStepsItemsAllOf0Abstract");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0Abstract"
    // InternalNormalJobStepsItemsAllOf0Parser.g:94:1: entryRuleNormalJobStepsItemsAllOf0Abstract returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0Abstract= ruleNormalJobStepsItemsAllOf0Abstract EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0Abstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0Abstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:94:74: (iv_ruleNormalJobStepsItemsAllOf0Abstract= ruleNormalJobStepsItemsAllOf0Abstract EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:95:2: iv_ruleNormalJobStepsItemsAllOf0Abstract= ruleNormalJobStepsItemsAllOf0Abstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0Abstract=ruleNormalJobStepsItemsAllOf0Abstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0Abstract; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0Abstract"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0Abstract"
    // InternalNormalJobStepsItemsAllOf0Parser.g:101:1: ruleNormalJobStepsItemsAllOf0Abstract returns [EObject current=null] : ( ( ( ruleNormalJobStepsItemsAllOf0TypeNumber )=>this_NormalJobStepsItemsAllOf0TypeNumber_0= ruleNormalJobStepsItemsAllOf0TypeNumber ) | this_NormalJobStepsItemsAllOf0TypeString_1= ruleNormalJobStepsItemsAllOf0TypeString | this_NormalJobStepsItemsAllOf0TypeInteger_2= ruleNormalJobStepsItemsAllOf0TypeInteger | this_NormalJobStepsItemsAllOf0TypeBoolean_3= ruleNormalJobStepsItemsAllOf0TypeBoolean | this_NormalJobStepsItemsAllOf0TypeObject_4= ruleNormalJobStepsItemsAllOf0TypeObject | this_NormalJobStepsItemsAllOf0TypeArray_5= ruleNormalJobStepsItemsAllOf0TypeArray | this_NormalJobStepsItemsAllOf0TypeNull_6= ruleNormalJobStepsItemsAllOf0TypeNull ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0Abstract() throws RecognitionException {
        EObject current = null;

        EObject this_NormalJobStepsItemsAllOf0TypeNumber_0 = null;

        EObject this_NormalJobStepsItemsAllOf0TypeString_1 = null;

        EObject this_NormalJobStepsItemsAllOf0TypeInteger_2 = null;

        EObject this_NormalJobStepsItemsAllOf0TypeBoolean_3 = null;

        EObject this_NormalJobStepsItemsAllOf0TypeObject_4 = null;

        EObject this_NormalJobStepsItemsAllOf0TypeArray_5 = null;

        EObject this_NormalJobStepsItemsAllOf0TypeNull_6 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:107:2: ( ( ( ( ruleNormalJobStepsItemsAllOf0TypeNumber )=>this_NormalJobStepsItemsAllOf0TypeNumber_0= ruleNormalJobStepsItemsAllOf0TypeNumber ) | this_NormalJobStepsItemsAllOf0TypeString_1= ruleNormalJobStepsItemsAllOf0TypeString | this_NormalJobStepsItemsAllOf0TypeInteger_2= ruleNormalJobStepsItemsAllOf0TypeInteger | this_NormalJobStepsItemsAllOf0TypeBoolean_3= ruleNormalJobStepsItemsAllOf0TypeBoolean | this_NormalJobStepsItemsAllOf0TypeObject_4= ruleNormalJobStepsItemsAllOf0TypeObject | this_NormalJobStepsItemsAllOf0TypeArray_5= ruleNormalJobStepsItemsAllOf0TypeArray | this_NormalJobStepsItemsAllOf0TypeNull_6= ruleNormalJobStepsItemsAllOf0TypeNull ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:108:2: ( ( ( ruleNormalJobStepsItemsAllOf0TypeNumber )=>this_NormalJobStepsItemsAllOf0TypeNumber_0= ruleNormalJobStepsItemsAllOf0TypeNumber ) | this_NormalJobStepsItemsAllOf0TypeString_1= ruleNormalJobStepsItemsAllOf0TypeString | this_NormalJobStepsItemsAllOf0TypeInteger_2= ruleNormalJobStepsItemsAllOf0TypeInteger | this_NormalJobStepsItemsAllOf0TypeBoolean_3= ruleNormalJobStepsItemsAllOf0TypeBoolean | this_NormalJobStepsItemsAllOf0TypeObject_4= ruleNormalJobStepsItemsAllOf0TypeObject | this_NormalJobStepsItemsAllOf0TypeArray_5= ruleNormalJobStepsItemsAllOf0TypeArray | this_NormalJobStepsItemsAllOf0TypeNull_6= ruleNormalJobStepsItemsAllOf0TypeNull )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:108:2: ( ( ( ruleNormalJobStepsItemsAllOf0TypeNumber )=>this_NormalJobStepsItemsAllOf0TypeNumber_0= ruleNormalJobStepsItemsAllOf0TypeNumber ) | this_NormalJobStepsItemsAllOf0TypeString_1= ruleNormalJobStepsItemsAllOf0TypeString | this_NormalJobStepsItemsAllOf0TypeInteger_2= ruleNormalJobStepsItemsAllOf0TypeInteger | this_NormalJobStepsItemsAllOf0TypeBoolean_3= ruleNormalJobStepsItemsAllOf0TypeBoolean | this_NormalJobStepsItemsAllOf0TypeObject_4= ruleNormalJobStepsItemsAllOf0TypeObject | this_NormalJobStepsItemsAllOf0TypeArray_5= ruleNormalJobStepsItemsAllOf0TypeArray | this_NormalJobStepsItemsAllOf0TypeNull_6= ruleNormalJobStepsItemsAllOf0TypeNull )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:109:3: ( ( ruleNormalJobStepsItemsAllOf0TypeNumber )=>this_NormalJobStepsItemsAllOf0TypeNumber_0= ruleNormalJobStepsItemsAllOf0TypeNumber )
                    {
                    // InternalNormalJobStepsItemsAllOf0Parser.g:109:3: ( ( ruleNormalJobStepsItemsAllOf0TypeNumber )=>this_NormalJobStepsItemsAllOf0TypeNumber_0= ruleNormalJobStepsItemsAllOf0TypeNumber )
                    // InternalNormalJobStepsItemsAllOf0Parser.g:110:4: ( ruleNormalJobStepsItemsAllOf0TypeNumber )=>this_NormalJobStepsItemsAllOf0TypeNumber_0= ruleNormalJobStepsItemsAllOf0TypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AbstractAccess().getNormalJobStepsItemsAllOf0TypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf0TypeNumber_0=ruleNormalJobStepsItemsAllOf0TypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_NormalJobStepsItemsAllOf0TypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:121:3: this_NormalJobStepsItemsAllOf0TypeString_1= ruleNormalJobStepsItemsAllOf0TypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AbstractAccess().getNormalJobStepsItemsAllOf0TypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf0TypeString_1=ruleNormalJobStepsItemsAllOf0TypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf0TypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:130:3: this_NormalJobStepsItemsAllOf0TypeInteger_2= ruleNormalJobStepsItemsAllOf0TypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AbstractAccess().getNormalJobStepsItemsAllOf0TypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf0TypeInteger_2=ruleNormalJobStepsItemsAllOf0TypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf0TypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:139:3: this_NormalJobStepsItemsAllOf0TypeBoolean_3= ruleNormalJobStepsItemsAllOf0TypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AbstractAccess().getNormalJobStepsItemsAllOf0TypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf0TypeBoolean_3=ruleNormalJobStepsItemsAllOf0TypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf0TypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:148:3: this_NormalJobStepsItemsAllOf0TypeObject_4= ruleNormalJobStepsItemsAllOf0TypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AbstractAccess().getNormalJobStepsItemsAllOf0TypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf0TypeObject_4=ruleNormalJobStepsItemsAllOf0TypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf0TypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:157:3: this_NormalJobStepsItemsAllOf0TypeArray_5= ruleNormalJobStepsItemsAllOf0TypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AbstractAccess().getNormalJobStepsItemsAllOf0TypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf0TypeArray_5=ruleNormalJobStepsItemsAllOf0TypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf0TypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:166:3: this_NormalJobStepsItemsAllOf0TypeNull_6= ruleNormalJobStepsItemsAllOf0TypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AbstractAccess().getNormalJobStepsItemsAllOf0TypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf0TypeNull_6=ruleNormalJobStepsItemsAllOf0TypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf0TypeNull_6;
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0Abstract"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0PropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf0Parser.g:178:1: entryRuleNormalJobStepsItemsAllOf0PropertiesAbstract returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0PropertiesAbstract= ruleNormalJobStepsItemsAllOf0PropertiesAbstract EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0PropertiesAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:178:84: (iv_ruleNormalJobStepsItemsAllOf0PropertiesAbstract= ruleNormalJobStepsItemsAllOf0PropertiesAbstract EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:179:2: iv_ruleNormalJobStepsItemsAllOf0PropertiesAbstract= ruleNormalJobStepsItemsAllOf0PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0PropertiesAbstract=ruleNormalJobStepsItemsAllOf0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0PropertiesAbstract; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0PropertiesAbstract"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0PropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf0Parser.g:185:1: ruleNormalJobStepsItemsAllOf0PropertiesAbstract returns [EObject current=null] : ( ( ruleNormalJobStepsItemsAllOf0AdditionalProperties )=>this_NormalJobStepsItemsAllOf0AdditionalProperties_0= ruleNormalJobStepsItemsAllOf0AdditionalProperties ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_NormalJobStepsItemsAllOf0AdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:191:2: ( ( ( ruleNormalJobStepsItemsAllOf0AdditionalProperties )=>this_NormalJobStepsItemsAllOf0AdditionalProperties_0= ruleNormalJobStepsItemsAllOf0AdditionalProperties ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:192:2: ( ( ruleNormalJobStepsItemsAllOf0AdditionalProperties )=>this_NormalJobStepsItemsAllOf0AdditionalProperties_0= ruleNormalJobStepsItemsAllOf0AdditionalProperties )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:192:2: ( ( ruleNormalJobStepsItemsAllOf0AdditionalProperties )=>this_NormalJobStepsItemsAllOf0AdditionalProperties_0= ruleNormalJobStepsItemsAllOf0AdditionalProperties )
            // InternalNormalJobStepsItemsAllOf0Parser.g:193:3: ( ruleNormalJobStepsItemsAllOf0AdditionalProperties )=>this_NormalJobStepsItemsAllOf0AdditionalProperties_0= ruleNormalJobStepsItemsAllOf0AdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0PropertiesAbstractAccess().getNormalJobStepsItemsAllOf0AdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_NormalJobStepsItemsAllOf0AdditionalProperties_0=ruleNormalJobStepsItemsAllOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NormalJobStepsItemsAllOf0AdditionalProperties_0;
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0PropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalNormalJobStepsItemsAllOf0Parser.g:206:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:206:46: (iv_ruleValue= ruleValue EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:207:2: iv_ruleValue= ruleValue EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:213:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalNormalJobStepsItemsAllOf0Parser.g:219:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:220:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:220:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:221:3: this_StringValue_0= ruleStringValue
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:230:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:239:3: this_NullValue_2= ruleNullValue
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:248:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:257:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:266:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0TypeString"
    // InternalNormalJobStepsItemsAllOf0Parser.g:278:1: entryRuleNormalJobStepsItemsAllOf0TypeString returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0TypeString= ruleNormalJobStepsItemsAllOf0TypeString EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0TypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0TypeString = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:278:76: (iv_ruleNormalJobStepsItemsAllOf0TypeString= ruleNormalJobStepsItemsAllOf0TypeString EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:279:2: iv_ruleNormalJobStepsItemsAllOf0TypeString= ruleNormalJobStepsItemsAllOf0TypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0TypeString=ruleNormalJobStepsItemsAllOf0TypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0TypeString; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0TypeString"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0TypeString"
    // InternalNormalJobStepsItemsAllOf0Parser.g:285:1: ruleNormalJobStepsItemsAllOf0TypeString returns [EObject current=null] : ( (lv_items_0_0= ruleEString ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0TypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:291:2: ( ( (lv_items_0_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:292:2: ( (lv_items_0_0= ruleEString ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:292:2: ( (lv_items_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:293:3: (lv_items_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:293:3: (lv_items_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf0Parser.g:294:4: lv_items_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeStringAccess().getItemsEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0TypeStringRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.EString");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0TypeString"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0TypeInteger"
    // InternalNormalJobStepsItemsAllOf0Parser.g:314:1: entryRuleNormalJobStepsItemsAllOf0TypeInteger returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0TypeInteger= ruleNormalJobStepsItemsAllOf0TypeInteger EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0TypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0TypeInteger = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:314:77: (iv_ruleNormalJobStepsItemsAllOf0TypeInteger= ruleNormalJobStepsItemsAllOf0TypeInteger EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:315:2: iv_ruleNormalJobStepsItemsAllOf0TypeInteger= ruleNormalJobStepsItemsAllOf0TypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0TypeInteger=ruleNormalJobStepsItemsAllOf0TypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0TypeInteger; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0TypeInteger"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0TypeInteger"
    // InternalNormalJobStepsItemsAllOf0Parser.g:321:1: ruleNormalJobStepsItemsAllOf0TypeInteger returns [EObject current=null] : ( (lv_items_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0TypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:327:2: ( ( (lv_items_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:328:2: ( (lv_items_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:328:2: ( (lv_items_0_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:329:3: (lv_items_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:329:3: (lv_items_0_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf0Parser.g:330:4: lv_items_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeIntegerAccess().getItemsEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0TypeIntegerRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.EDoubleObject");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0TypeInteger"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0TypeNumber"
    // InternalNormalJobStepsItemsAllOf0Parser.g:350:1: entryRuleNormalJobStepsItemsAllOf0TypeNumber returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0TypeNumber= ruleNormalJobStepsItemsAllOf0TypeNumber EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0TypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0TypeNumber = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:350:76: (iv_ruleNormalJobStepsItemsAllOf0TypeNumber= ruleNormalJobStepsItemsAllOf0TypeNumber EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:351:2: iv_ruleNormalJobStepsItemsAllOf0TypeNumber= ruleNormalJobStepsItemsAllOf0TypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0TypeNumber=ruleNormalJobStepsItemsAllOf0TypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0TypeNumber; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0TypeNumber"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0TypeNumber"
    // InternalNormalJobStepsItemsAllOf0Parser.g:357:1: ruleNormalJobStepsItemsAllOf0TypeNumber returns [EObject current=null] : ( (lv_items_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0TypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:363:2: ( ( (lv_items_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:364:2: ( (lv_items_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:364:2: ( (lv_items_0_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:365:3: (lv_items_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:365:3: (lv_items_0_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf0Parser.g:366:4: lv_items_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeNumberAccess().getItemsEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0TypeNumberRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.EDoubleObject");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0TypeNumber"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0TypeBoolean"
    // InternalNormalJobStepsItemsAllOf0Parser.g:386:1: entryRuleNormalJobStepsItemsAllOf0TypeBoolean returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0TypeBoolean= ruleNormalJobStepsItemsAllOf0TypeBoolean EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0TypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0TypeBoolean = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:386:77: (iv_ruleNormalJobStepsItemsAllOf0TypeBoolean= ruleNormalJobStepsItemsAllOf0TypeBoolean EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:387:2: iv_ruleNormalJobStepsItemsAllOf0TypeBoolean= ruleNormalJobStepsItemsAllOf0TypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0TypeBoolean=ruleNormalJobStepsItemsAllOf0TypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0TypeBoolean; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0TypeBoolean"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0TypeBoolean"
    // InternalNormalJobStepsItemsAllOf0Parser.g:393:1: ruleNormalJobStepsItemsAllOf0TypeBoolean returns [EObject current=null] : ( (lv_items_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0TypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:399:2: ( ( (lv_items_0_0= ruleEBooleanObject ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:400:2: ( (lv_items_0_0= ruleEBooleanObject ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:400:2: ( (lv_items_0_0= ruleEBooleanObject ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:401:3: (lv_items_0_0= ruleEBooleanObject )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:401:3: (lv_items_0_0= ruleEBooleanObject )
            // InternalNormalJobStepsItemsAllOf0Parser.g:402:4: lv_items_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeBooleanAccess().getItemsEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0TypeBooleanRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.EBooleanObject");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0TypeBoolean"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0TypeObject"
    // InternalNormalJobStepsItemsAllOf0Parser.g:422:1: entryRuleNormalJobStepsItemsAllOf0TypeObject returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0TypeObject= ruleNormalJobStepsItemsAllOf0TypeObject EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0TypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0TypeObject = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:422:76: (iv_ruleNormalJobStepsItemsAllOf0TypeObject= ruleNormalJobStepsItemsAllOf0TypeObject EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:423:2: iv_ruleNormalJobStepsItemsAllOf0TypeObject= ruleNormalJobStepsItemsAllOf0TypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0TypeObject=ruleNormalJobStepsItemsAllOf0TypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0TypeObject; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0TypeObject"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0TypeObject"
    // InternalNormalJobStepsItemsAllOf0Parser.g:429:1: ruleNormalJobStepsItemsAllOf0TypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0TypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:435:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:436:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:436:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobStepsItemsAllOf0Parser.g:437:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:437:3: ()
            // InternalNormalJobStepsItemsAllOf0Parser.g:438:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNormalJobStepsItemsAllOf0TypeObjectAccess().getNormalJobStepsItemsAllOf0TypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf0TypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0Parser.g:448:3: ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:449:4: ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf0Parser.g:449:4: ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) )
                    // InternalNormalJobStepsItemsAllOf0Parser.g:450:5: (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract )
                    {
                    // InternalNormalJobStepsItemsAllOf0Parser.g:450:5: (lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract )
                    // InternalNormalJobStepsItemsAllOf0Parser.g:451:6: lv_items_2_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeObjectAccess().getItemsNormalJobStepsItemsAllOf0PropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleNormalJobStepsItemsAllOf0PropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0TypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"items",
                      							lv_items_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf0.NormalJobStepsItemsAllOf0PropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf0Parser.g:468:4: (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Comma) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:469:5: otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getNormalJobStepsItemsAllOf0TypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:473:5: ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract ) )
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:474:6: (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:474:6: (lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract )
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:475:7: lv_items_4_0= ruleNormalJobStepsItemsAllOf0PropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeObjectAccess().getItemsNormalJobStepsItemsAllOf0PropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleNormalJobStepsItemsAllOf0PropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0TypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"items",
                    	      								lv_items_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf0.NormalJobStepsItemsAllOf0PropertiesAbstract");
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

              			newLeafNode(otherlv_5, grammarAccess.getNormalJobStepsItemsAllOf0TypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0TypeObject"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0TypeArray"
    // InternalNormalJobStepsItemsAllOf0Parser.g:502:1: entryRuleNormalJobStepsItemsAllOf0TypeArray returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0TypeArray= ruleNormalJobStepsItemsAllOf0TypeArray EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0TypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0TypeArray = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:502:75: (iv_ruleNormalJobStepsItemsAllOf0TypeArray= ruleNormalJobStepsItemsAllOf0TypeArray EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:503:2: iv_ruleNormalJobStepsItemsAllOf0TypeArray= ruleNormalJobStepsItemsAllOf0TypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0TypeArray=ruleNormalJobStepsItemsAllOf0TypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0TypeArray; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0TypeArray"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0TypeArray"
    // InternalNormalJobStepsItemsAllOf0Parser.g:509:1: ruleNormalJobStepsItemsAllOf0TypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0TypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:515:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:516:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:516:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobStepsItemsAllOf0Parser.g:517:3: () otherlv_1= LeftSquareBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:517:3: ()
            // InternalNormalJobStepsItemsAllOf0Parser.g:518:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNormalJobStepsItemsAllOf0TypeArrayAccess().getNormalJobStepsItemsAllOf0TypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf0TypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0Parser.g:528:3: ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=False && LA6_0<=True)||LA6_0==LeftSquareBracket||LA6_0==LeftCurlyBracket||(LA6_0>=RULE_STRING && LA6_0<=RULE_E_DOUBLE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:529:4: ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf0Parser.g:529:4: ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items ) )
                    // InternalNormalJobStepsItemsAllOf0Parser.g:530:5: (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items )
                    {
                    // InternalNormalJobStepsItemsAllOf0Parser.g:530:5: (lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items )
                    // InternalNormalJobStepsItemsAllOf0Parser.g:531:6: lv_items_2_0= ruleNormalJobStepsItemsAllOf0Items
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeArrayAccess().getItemsNormalJobStepsItemsAllOf0ItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_items_2_0=ruleNormalJobStepsItemsAllOf0Items();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0TypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"items",
                      							lv_items_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf0.NormalJobStepsItemsAllOf0Items");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf0Parser.g:548:4: (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:549:5: otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getNormalJobStepsItemsAllOf0TypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:553:5: ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items ) )
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:554:6: (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:554:6: (lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items )
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:555:7: lv_items_4_0= ruleNormalJobStepsItemsAllOf0Items
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeArrayAccess().getItemsNormalJobStepsItemsAllOf0ItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_items_4_0=ruleNormalJobStepsItemsAllOf0Items();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0TypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"items",
                    	      								lv_items_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf0.NormalJobStepsItemsAllOf0Items");
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

              			newLeafNode(otherlv_5, grammarAccess.getNormalJobStepsItemsAllOf0TypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0TypeArray"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0TypeNull"
    // InternalNormalJobStepsItemsAllOf0Parser.g:582:1: entryRuleNormalJobStepsItemsAllOf0TypeNull returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0TypeNull= ruleNormalJobStepsItemsAllOf0TypeNull EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0TypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0TypeNull = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:582:74: (iv_ruleNormalJobStepsItemsAllOf0TypeNull= ruleNormalJobStepsItemsAllOf0TypeNull EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:583:2: iv_ruleNormalJobStepsItemsAllOf0TypeNull= ruleNormalJobStepsItemsAllOf0TypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0TypeNull=ruleNormalJobStepsItemsAllOf0TypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0TypeNull; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0TypeNull"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0TypeNull"
    // InternalNormalJobStepsItemsAllOf0Parser.g:589:1: ruleNormalJobStepsItemsAllOf0TypeNull returns [EObject current=null] : ( (lv_items_0_0= ruleNullValue ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0TypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:595:2: ( ( (lv_items_0_0= ruleNullValue ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:596:2: ( (lv_items_0_0= ruleNullValue ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:596:2: ( (lv_items_0_0= ruleNullValue ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:597:3: (lv_items_0_0= ruleNullValue )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:597:3: (lv_items_0_0= ruleNullValue )
            // InternalNormalJobStepsItemsAllOf0Parser.g:598:4: lv_items_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0TypeNullAccess().getItemsNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0TypeNullRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.NullValue");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0TypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobStepsItemsAllOf0Parser.g:618:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:618:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:619:2: iv_ruleEString= ruleEString EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:625:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:631:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobStepsItemsAllOf0Parser.g:632:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:645:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:645:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:646:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:652:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:658:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:659:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:659:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:660:3: this_E_INT_0= RULE_E_INT
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:668:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:679:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:679:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:680:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:686:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:692:2: ( (kw= True | kw= False ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:693:2: (kw= True | kw= False )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:693:2: (kw= True | kw= False )
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:694:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:700:3: kw= False
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


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0AdditionalProperties"
    // InternalNormalJobStepsItemsAllOf0Parser.g:709:1: entryRuleNormalJobStepsItemsAllOf0AdditionalProperties returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0AdditionalProperties= ruleNormalJobStepsItemsAllOf0AdditionalProperties EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0AdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0AdditionalProperties = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:709:86: (iv_ruleNormalJobStepsItemsAllOf0AdditionalProperties= ruleNormalJobStepsItemsAllOf0AdditionalProperties EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:710:2: iv_ruleNormalJobStepsItemsAllOf0AdditionalProperties= ruleNormalJobStepsItemsAllOf0AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0AdditionalProperties=ruleNormalJobStepsItemsAllOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0AdditionalProperties; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0AdditionalProperties"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0AdditionalProperties"
    // InternalNormalJobStepsItemsAllOf0Parser.g:716:1: ruleNormalJobStepsItemsAllOf0AdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0AdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:722:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:723:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:723:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:724:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:724:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:725:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:725:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf0Parser.g:726:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf0AdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0Parser.g:747:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:748:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:748:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobStepsItemsAllOf0Parser.g:749:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf0.JsonDocument");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0AdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalNormalJobStepsItemsAllOf0Parser.g:770:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:770:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:771:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:777:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:783:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:784:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:784:2: ( (lv_value_0_0= ruleValue ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:785:3: (lv_value_0_0= ruleValue )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:785:3: (lv_value_0_0= ruleValue )
            // InternalNormalJobStepsItemsAllOf0Parser.g:786:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.Value");
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:806:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:806:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:807:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:813:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:819:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:820:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:820:2: ( (lv_value_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:821:3: (lv_value_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:821:3: (lv_value_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf0Parser.g:822:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.EString");
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:842:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:842:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:843:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:849:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:855:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:856:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:856:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobStepsItemsAllOf0Parser.g:857:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:857:3: ()
            // InternalNormalJobStepsItemsAllOf0Parser.g:858:4: 
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
            // InternalNormalJobStepsItemsAllOf0Parser.g:868:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=False && LA10_0<=True)||LA10_0==LeftSquareBracket||LA10_0==LeftCurlyBracket||(LA10_0>=RULE_STRING && LA10_0<=RULE_E_DOUBLE)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:869:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf0Parser.g:869:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalNormalJobStepsItemsAllOf0Parser.g:870:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalNormalJobStepsItemsAllOf0Parser.g:870:5: (lv_value_2_0= ruleValue )
                    // InternalNormalJobStepsItemsAllOf0Parser.g:871:6: lv_value_2_0= ruleValue
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
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf0.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf0Parser.g:888:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Comma) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:889:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:893:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:894:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:894:6: (lv_value_4_0= ruleValue )
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:895:7: lv_value_4_0= ruleValue
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
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf0.Value");
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:922:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:922:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:923:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:929:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:935:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:936:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:936:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:937:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:937:3: (lv_value_0_0= ruleNullEnum )
            // InternalNormalJobStepsItemsAllOf0Parser.g:938:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.NullEnum");
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:958:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:958:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:959:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:965:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:971:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:972:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:972:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:973:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:973:3: (lv_value_0_0= ruleEDouble )
            // InternalNormalJobStepsItemsAllOf0Parser.g:974:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.EDouble");
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:994:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:994:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:995:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1001:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1007:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1008:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1008:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1009:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1009:3: ()
            // InternalNormalJobStepsItemsAllOf0Parser.g:1010:4: 
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
            // InternalNormalJobStepsItemsAllOf0Parser.g:1020:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:1021:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf0Parser.g:1021:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalNormalJobStepsItemsAllOf0Parser.g:1022:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalNormalJobStepsItemsAllOf0Parser.g:1022:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalNormalJobStepsItemsAllOf0Parser.g:1023:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf0.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf0Parser.g:1040:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:1041:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:1045:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:1046:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:1046:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalNormalJobStepsItemsAllOf0Parser.g:1047:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf0.KeyValuePair");
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1074:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1074:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1075:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1081:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1087:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1088:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1088:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1089:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1089:3: (lv_value_0_0= ruleEBoolean )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1090:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.EBoolean");
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1110:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1110:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1111:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1117:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1123:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1124:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1124:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:1125:3: this_E_INT_0= RULE_E_INT
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:1133:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1144:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1144:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1145:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1151:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1157:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1158:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1158:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1159:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1159:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1160:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1160:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1161:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.NormalJobStepsItemsAllOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0Parser.g:1182:3: ( (lv_value_2_0= ruleValue ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1183:4: (lv_value_2_0= ruleValue )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1183:4: (lv_value_2_0= ruleValue )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1184:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.NormalJobStepsItemsAllOf0.Value");
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1205:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1205:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1206:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1212:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1218:2: ( (kw= True | kw= False ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1219:2: (kw= True | kw= False )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1219:2: (kw= True | kw= False )
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
                    // InternalNormalJobStepsItemsAllOf0Parser.g:1220:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf0Parser.g:1226:3: kw= False
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


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0Items"
    // InternalNormalJobStepsItemsAllOf0Parser.g:1235:1: entryRuleNormalJobStepsItemsAllOf0Items returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0Items= ruleNormalJobStepsItemsAllOf0Items EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0Items() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0Items = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1235:71: (iv_ruleNormalJobStepsItemsAllOf0Items= ruleNormalJobStepsItemsAllOf0Items EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1236:2: iv_ruleNormalJobStepsItemsAllOf0Items= ruleNormalJobStepsItemsAllOf0Items EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0ItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0Items=ruleNormalJobStepsItemsAllOf0Items();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0Items; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0Items"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0Items"
    // InternalNormalJobStepsItemsAllOf0Parser.g:1242:1: ruleNormalJobStepsItemsAllOf0Items returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0Items() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1248:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1249:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1249:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1250:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1250:3: (lv_items_0_0= ruleJsonDocument )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1251:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0ItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0ItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0.JsonDocument");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0Items"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalNormalJobStepsItemsAllOf0Parser.g:1271:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1271:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1272:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1278:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1284:2: (this_STRING_0= RULE_STRING )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1285:2: this_STRING_0= RULE_STRING
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
    // InternalNormalJobStepsItemsAllOf0Parser.g:1295:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1301:2: ( (enumLiteral_0= Null ) )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1302:2: (enumLiteral_0= Null )
            {
            // InternalNormalJobStepsItemsAllOf0Parser.g:1302:2: (enumLiteral_0= Null )
            // InternalNormalJobStepsItemsAllOf0Parser.g:1303:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalNormalJobStepsItemsAllOf0Parser
    public final void synpred1_InternalNormalJobStepsItemsAllOf0Parser_fragment() throws RecognitionException {   
        // InternalNormalJobStepsItemsAllOf0Parser.g:110:4: ( ruleNormalJobStepsItemsAllOf0TypeNumber )
        // InternalNormalJobStepsItemsAllOf0Parser.g:110:5: ruleNormalJobStepsItemsAllOf0TypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleNormalJobStepsItemsAllOf0TypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalNormalJobStepsItemsAllOf0Parser

    // Delegated rules

    public final boolean synpred1_InternalNormalJobStepsItemsAllOf0Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalNormalJobStepsItemsAllOf0Parser_fragment(); // can never throw exception
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
            return "108:2: ( ( ( ruleNormalJobStepsItemsAllOf0TypeNumber )=>this_NormalJobStepsItemsAllOf0TypeNumber_0= ruleNormalJobStepsItemsAllOf0TypeNumber ) | this_NormalJobStepsItemsAllOf0TypeString_1= ruleNormalJobStepsItemsAllOf0TypeString | this_NormalJobStepsItemsAllOf0TypeInteger_2= ruleNormalJobStepsItemsAllOf0TypeInteger | this_NormalJobStepsItemsAllOf0TypeBoolean_3= ruleNormalJobStepsItemsAllOf0TypeBoolean | this_NormalJobStepsItemsAllOf0TypeObject_4= ruleNormalJobStepsItemsAllOf0TypeObject | this_NormalJobStepsItemsAllOf0TypeArray_5= ruleNormalJobStepsItemsAllOf0TypeArray | this_NormalJobStepsItemsAllOf0TypeNull_6= ruleNormalJobStepsItemsAllOf0TypeNull )";
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
                        if ( (synpred1_InternalNormalJobStepsItemsAllOf0Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalNormalJobStepsItemsAllOf0Parser()) ) {s = 8;}

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
