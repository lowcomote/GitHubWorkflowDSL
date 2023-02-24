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
import githubwf.githubwf.services.NormalJobRuns_45onOneOf1AnyOf2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNormalJobRuns_45onOneOf1AnyOf2Parser extends AbstractInternalAntlrParser {
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


        public InternalNormalJobRuns_45onOneOf1AnyOf2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobRuns_45onOneOf1AnyOf2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobRuns_45onOneOf1AnyOf2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g"; }



     	private NormalJobRuns_45onOneOf1AnyOf2GrammarAccess grammarAccess;

        public InternalNormalJobRuns_45onOneOf1AnyOf2Parser(TokenStream input, NormalJobRuns_45onOneOf1AnyOf2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobRuns_45onOneOf1AnyOf2";
       	}

       	@Override
       	protected NormalJobRuns_45onOneOf1AnyOf2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:58:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2 returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2= ruleNormalJobRuns_45onOneOf1AnyOf2 EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2 = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:58:71: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2= ruleNormalJobRuns_45onOneOf1AnyOf2 EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:59:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2= ruleNormalJobRuns_45onOneOf1AnyOf2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2=ruleNormalJobRuns_45onOneOf1AnyOf2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:65:1: ruleNormalJobRuns_45onOneOf1AnyOf2 returns [EObject current=null] : ( (lv_runs_45on_0_0= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2() throws RecognitionException {
        EObject current = null;

        EObject lv_runs_45on_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:71:2: ( ( (lv_runs_45on_0_0= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:72:2: ( (lv_runs_45on_0_0= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:72:2: ( (lv_runs_45on_0_0= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:73:3: (lv_runs_45on_0_0= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:73:3: (lv_runs_45on_0_0= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:74:4: lv_runs_45on_0_0= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2Access().getRuns_45onNormalJobRuns_45onOneOf1AnyOf2AbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_runs_45on_0_0=ruleNormalJobRuns_45onOneOf1AnyOf2Abstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2Rule());
              				}
              				set(
              					current,
              					"runs_45on",
              					lv_runs_45on_0_0,
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NormalJobRuns_45onOneOf1AnyOf2Abstract");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2Abstract"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:94:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2Abstract returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2Abstract= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2Abstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2Abstract = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:94:79: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2Abstract= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:95:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2Abstract= ruleNormalJobRuns_45onOneOf1AnyOf2Abstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2Abstract=ruleNormalJobRuns_45onOneOf1AnyOf2Abstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2Abstract; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2Abstract"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2Abstract"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:101:1: ruleNormalJobRuns_45onOneOf1AnyOf2Abstract returns [EObject current=null] : ( ( ( ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )=>this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber ) | this_NormalJobRuns_45onOneOf1AnyOf2TypeString_1= ruleNormalJobRuns_45onOneOf1AnyOf2TypeString | this_NormalJobRuns_45onOneOf1AnyOf2TypeInteger_2= ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger | this_NormalJobRuns_45onOneOf1AnyOf2TypeBoolean_3= ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean | this_NormalJobRuns_45onOneOf1AnyOf2TypeObject_4= ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject | this_NormalJobRuns_45onOneOf1AnyOf2TypeArray_5= ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray | this_NormalJobRuns_45onOneOf1AnyOf2TypeNull_6= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2Abstract() throws RecognitionException {
        EObject current = null;

        EObject this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0 = null;

        EObject this_NormalJobRuns_45onOneOf1AnyOf2TypeString_1 = null;

        EObject this_NormalJobRuns_45onOneOf1AnyOf2TypeInteger_2 = null;

        EObject this_NormalJobRuns_45onOneOf1AnyOf2TypeBoolean_3 = null;

        EObject this_NormalJobRuns_45onOneOf1AnyOf2TypeObject_4 = null;

        EObject this_NormalJobRuns_45onOneOf1AnyOf2TypeArray_5 = null;

        EObject this_NormalJobRuns_45onOneOf1AnyOf2TypeNull_6 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:107:2: ( ( ( ( ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )=>this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber ) | this_NormalJobRuns_45onOneOf1AnyOf2TypeString_1= ruleNormalJobRuns_45onOneOf1AnyOf2TypeString | this_NormalJobRuns_45onOneOf1AnyOf2TypeInteger_2= ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger | this_NormalJobRuns_45onOneOf1AnyOf2TypeBoolean_3= ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean | this_NormalJobRuns_45onOneOf1AnyOf2TypeObject_4= ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject | this_NormalJobRuns_45onOneOf1AnyOf2TypeArray_5= ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray | this_NormalJobRuns_45onOneOf1AnyOf2TypeNull_6= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:108:2: ( ( ( ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )=>this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber ) | this_NormalJobRuns_45onOneOf1AnyOf2TypeString_1= ruleNormalJobRuns_45onOneOf1AnyOf2TypeString | this_NormalJobRuns_45onOneOf1AnyOf2TypeInteger_2= ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger | this_NormalJobRuns_45onOneOf1AnyOf2TypeBoolean_3= ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean | this_NormalJobRuns_45onOneOf1AnyOf2TypeObject_4= ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject | this_NormalJobRuns_45onOneOf1AnyOf2TypeArray_5= ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray | this_NormalJobRuns_45onOneOf1AnyOf2TypeNull_6= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:108:2: ( ( ( ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )=>this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber ) | this_NormalJobRuns_45onOneOf1AnyOf2TypeString_1= ruleNormalJobRuns_45onOneOf1AnyOf2TypeString | this_NormalJobRuns_45onOneOf1AnyOf2TypeInteger_2= ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger | this_NormalJobRuns_45onOneOf1AnyOf2TypeBoolean_3= ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean | this_NormalJobRuns_45onOneOf1AnyOf2TypeObject_4= ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject | this_NormalJobRuns_45onOneOf1AnyOf2TypeArray_5= ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray | this_NormalJobRuns_45onOneOf1AnyOf2TypeNull_6= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:109:3: ( ( ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )=>this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )
                    {
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:109:3: ( ( ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )=>this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:110:4: ( ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )=>this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AbstractAccess().getNormalJobRuns_45onOneOf1AnyOf2TypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0=ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:121:3: this_NormalJobRuns_45onOneOf1AnyOf2TypeString_1= ruleNormalJobRuns_45onOneOf1AnyOf2TypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AbstractAccess().getNormalJobRuns_45onOneOf1AnyOf2TypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobRuns_45onOneOf1AnyOf2TypeString_1=ruleNormalJobRuns_45onOneOf1AnyOf2TypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobRuns_45onOneOf1AnyOf2TypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:130:3: this_NormalJobRuns_45onOneOf1AnyOf2TypeInteger_2= ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AbstractAccess().getNormalJobRuns_45onOneOf1AnyOf2TypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobRuns_45onOneOf1AnyOf2TypeInteger_2=ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobRuns_45onOneOf1AnyOf2TypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:139:3: this_NormalJobRuns_45onOneOf1AnyOf2TypeBoolean_3= ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AbstractAccess().getNormalJobRuns_45onOneOf1AnyOf2TypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobRuns_45onOneOf1AnyOf2TypeBoolean_3=ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobRuns_45onOneOf1AnyOf2TypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:148:3: this_NormalJobRuns_45onOneOf1AnyOf2TypeObject_4= ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AbstractAccess().getNormalJobRuns_45onOneOf1AnyOf2TypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobRuns_45onOneOf1AnyOf2TypeObject_4=ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobRuns_45onOneOf1AnyOf2TypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:157:3: this_NormalJobRuns_45onOneOf1AnyOf2TypeArray_5= ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AbstractAccess().getNormalJobRuns_45onOneOf1AnyOf2TypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobRuns_45onOneOf1AnyOf2TypeArray_5=ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobRuns_45onOneOf1AnyOf2TypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:166:3: this_NormalJobRuns_45onOneOf1AnyOf2TypeNull_6= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AbstractAccess().getNormalJobRuns_45onOneOf1AnyOf2TypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobRuns_45onOneOf1AnyOf2TypeNull_6=ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobRuns_45onOneOf1AnyOf2TypeNull_6;
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2Abstract"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:178:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:178:89: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:179:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract=ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:185:1: ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract returns [EObject current=null] : ( ( ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties )=>this_NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:191:2: ( ( ( ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties )=>this_NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:192:2: ( ( ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties )=>this_NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:192:2: ( ( ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties )=>this_NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:193:3: ( ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties )=>this_NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstractAccess().getNormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_0=ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_0;
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:206:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:206:46: (iv_ruleValue= ruleValue EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:207:2: iv_ruleValue= ruleValue EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:213:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:219:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:220:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:220:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RunsOn:
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
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:221:3: this_StringValue_0= ruleStringValue
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
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:230:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:239:3: this_NullValue_2= ruleNullValue
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
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:248:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:257:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:266:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeString"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:278:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeString returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeString= ruleNormalJobRuns_45onOneOf1AnyOf2TypeString EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeString = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:278:81: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeString= ruleNormalJobRuns_45onOneOf1AnyOf2TypeString EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:279:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeString= ruleNormalJobRuns_45onOneOf1AnyOf2TypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeString=ruleNormalJobRuns_45onOneOf1AnyOf2TypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeString; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeString"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2TypeString"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:285:1: ruleNormalJobRuns_45onOneOf1AnyOf2TypeString returns [EObject current=null] : (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEString ) ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2TypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_runs_45on_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:291:2: ( (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEString ) ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:292:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEString ) ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:292:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEString ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:293:3: otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,RunsOn,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeStringAccess().getRunsOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:301:3: ( (lv_runs_45on_2_0= ruleEString ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:302:4: (lv_runs_45on_2_0= ruleEString )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:302:4: (lv_runs_45on_2_0= ruleEString )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:303:5: lv_runs_45on_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeStringAccess().getRuns_45onEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_runs_45on_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeStringRule());
              					}
              					set(
              						current,
              						"runs_45on",
              						lv_runs_45on_2_0,
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EString");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2TypeString"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeInteger"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:324:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeInteger returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger= ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:324:82: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger= ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:325:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger= ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger=ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeInteger"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:331:1: ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger returns [EObject current=null] : (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_runs_45on_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:337:2: ( (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:338:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:338:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:339:3: otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,RunsOn,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeIntegerAccess().getRunsOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeIntegerAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:347:3: ( (lv_runs_45on_2_0= ruleEDoubleObject ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:348:4: (lv_runs_45on_2_0= ruleEDoubleObject )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:348:4: (lv_runs_45on_2_0= ruleEDoubleObject )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:349:5: lv_runs_45on_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeIntegerAccess().getRuns_45onEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_runs_45on_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeIntegerRule());
              					}
              					set(
              						current,
              						"runs_45on",
              						lv_runs_45on_2_0,
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EDoubleObject");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeNumber"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:370:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeNumber returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:370:81: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:371:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber=ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeNumber"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:377:1: ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber returns [EObject current=null] : (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_runs_45on_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:383:2: ( (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:384:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:384:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:385:3: otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,RunsOn,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNumberAccess().getRunsOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:393:3: ( (lv_runs_45on_2_0= ruleEDoubleObject ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:394:4: (lv_runs_45on_2_0= ruleEDoubleObject )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:394:4: (lv_runs_45on_2_0= ruleEDoubleObject )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:395:5: lv_runs_45on_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNumberAccess().getRuns_45onEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_runs_45on_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNumberRule());
              					}
              					set(
              						current,
              						"runs_45on",
              						lv_runs_45on_2_0,
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EDoubleObject");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:416:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean= ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:416:82: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean= ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:417:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean= ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean=ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:423:1: ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean returns [EObject current=null] : (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_runs_45on_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:429:2: ( (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEBooleanObject ) ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:430:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEBooleanObject ) ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:430:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEBooleanObject ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:431:3: otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,RunsOn,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeBooleanAccess().getRunsOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:439:3: ( (lv_runs_45on_2_0= ruleEBooleanObject ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:440:4: (lv_runs_45on_2_0= ruleEBooleanObject )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:440:4: (lv_runs_45on_2_0= ruleEBooleanObject )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:441:5: lv_runs_45on_2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeBooleanAccess().getRuns_45onEBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_runs_45on_2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeBooleanRule());
              					}
              					set(
              						current,
              						"runs_45on",
              						lv_runs_45on_2_0,
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EBooleanObject");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeObject"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:462:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeObject returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject= ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:462:81: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject= ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:463:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject= ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject=ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeObject"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:469:1: ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject returns [EObject current=null] : ( () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject() throws RecognitionException {
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
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:475:2: ( ( () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:476:2: ( () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:476:2: ( () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:477:3: () otherlv_1= RunsOn otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:477:3: ()
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:478:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectAccess().getNormalJobRuns_45onOneOf1AnyOf2TypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,RunsOn,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectAccess().getRunsOnKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:496:3: ( ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RunsOn||LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:497:4: ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:497:4: ( (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) )
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:498:5: (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract )
                    {
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:498:5: (lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract )
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:499:6: lv_runs_45on_4_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectAccess().getRuns_45onNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_runs_45on_4_0=ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"runs_45on",
                      							lv_runs_45on_4_0,
                      							"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:516:4: (otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Comma) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:517:5: otherlv_5= Comma ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:521:5: ( (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract ) )
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:522:6: (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract )
                    	    {
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:522:6: (lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract )
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:523:7: lv_runs_45on_6_0= ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectAccess().getRuns_45onNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_runs_45on_6_0=ruleNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"runs_45on",
                    	      								lv_runs_45on_6_0,
                    	      								"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract");
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

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeObjectAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeArray"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:550:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeArray returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray= ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:550:80: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray= ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:551:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray= ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray=ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeArray"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:557:1: ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray returns [EObject current=null] : (otherlv_0= RunsOn otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_runs_45on_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_runs_45on_3_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:563:2: ( (otherlv_0= RunsOn otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_runs_45on_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple ) ) otherlv_4= RightSquareBracket ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:564:2: (otherlv_0= RunsOn otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_runs_45on_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple ) ) otherlv_4= RightSquareBracket )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:564:2: (otherlv_0= RunsOn otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_runs_45on_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple ) ) otherlv_4= RightSquareBracket )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:565:3: otherlv_0= RunsOn otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_runs_45on_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,RunsOn,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeArrayAccess().getRunsOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeArrayAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeArrayAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:577:3: ( (lv_runs_45on_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:578:4: (lv_runs_45on_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:578:4: (lv_runs_45on_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:579:5: lv_runs_45on_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeArrayAccess().getRuns_45onNormalJobRuns_45onOneOf1AnyOf2TupleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_runs_45on_3_0=ruleNormalJobRuns_45onOneOf1AnyOf2Tuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeArrayRule());
              					}
              					set(
              						current,
              						"runs_45on",
              						lv_runs_45on_3_0,
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NormalJobRuns_45onOneOf1AnyOf2Tuple");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeArrayAccess().getRightSquareBracketKeyword_4());
              		
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeNull"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:604:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeNull returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:604:79: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:605:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull=ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2TypeNull"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:611:1: ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull returns [EObject current=null] : (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleNullValue ) ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_runs_45on_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:617:2: ( (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleNullValue ) ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:618:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleNullValue ) ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:618:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleNullValue ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:619:3: otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleNullValue ) )
            {
            otherlv_0=(Token)match(input,RunsOn,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNullAccess().getRunsOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNullAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:627:3: ( (lv_runs_45on_2_0= ruleNullValue ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:628:4: (lv_runs_45on_2_0= ruleNullValue )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:628:4: (lv_runs_45on_2_0= ruleNullValue )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:629:5: lv_runs_45on_2_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNullAccess().getRuns_45onNullValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_runs_45on_2_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TypeNullRule());
              					}
              					set(
              						current,
              						"runs_45on",
              						lv_runs_45on_2_0,
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NullValue");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:650:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:650:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:651:2: iv_ruleEString= ruleEString EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:657:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:663:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:664:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:677:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:677:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:678:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:684:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:690:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:691:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:691:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_E_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_E_DOUBLE) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:692:3: this_E_INT_0= RULE_E_INT
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
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:700:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:711:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:711:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:712:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:718:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:724:2: ( (kw= True | kw= False ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:725:2: (kw= True | kw= False )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:725:2: (kw= True | kw= False )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==True) ) {
                alt6=1;
            }
            else if ( (LA6_0==False) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:726:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:732:3: kw= False
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


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:741:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:741:91: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:742:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties=ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:748:1: ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:754:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:755:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:755:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:756:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:756:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:757:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:757:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:758:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:779:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:780:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:780:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:781:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.JsonDocument");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:802:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:802:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:803:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:809:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:815:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:816:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:816:2: ( (lv_value_0_0= ruleValue ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:817:3: (lv_value_0_0= ruleValue )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:817:3: (lv_value_0_0= ruleValue )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:818:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.Value");
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:838:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:838:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:839:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:845:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:851:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:852:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:852:2: ( (lv_value_0_0= ruleEString ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:853:3: (lv_value_0_0= ruleEString )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:853:3: (lv_value_0_0= ruleEString )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:854:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EString");
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:874:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:874:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:875:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:881:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:887:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:888:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:888:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:889:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:889:3: ()
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:890:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:900:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RunsOn && LA8_0<=True)||LA8_0==LeftSquareBracket||LA8_0==LeftCurlyBracket||(LA8_0>=RULE_STRING && LA8_0<=RULE_E_DOUBLE)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:901:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:901:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:902:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:902:5: (lv_value_2_0= ruleValue )
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:903:6: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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
                      							"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:920:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Comma) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:921:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:925:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:926:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:926:6: (lv_value_4_0= ruleValue )
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:927:7: lv_value_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
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
                    	      								"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:954:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:954:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:955:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:961:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:967:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:968:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:968:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:969:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:969:3: (lv_value_0_0= ruleNullEnum )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:970:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NullEnum");
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:990:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:990:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:991:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:997:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1003:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1004:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1004:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1005:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1005:3: (lv_value_0_0= ruleEDouble )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1006:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EDouble");
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1026:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1026:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1027:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1033:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1039:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1040:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1040:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1041:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1041:3: ()
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1042:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1052:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RunsOn||LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1053:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1053:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1054:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1054:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1055:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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
                      							"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1072:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Comma) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1073:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1077:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1078:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1078:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1079:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	      								"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.KeyValuePair");
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1106:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1106:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1107:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1113:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1119:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1120:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1120:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1121:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1121:3: (lv_value_0_0= ruleEBoolean )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1122:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EBoolean");
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1142:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1142:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1143:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1149:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1155:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1156:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1156:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_E_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_E_DOUBLE) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1157:3: this_E_INT_0= RULE_E_INT
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
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1165:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1176:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1176:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1177:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1183:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1189:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1190:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1190:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1191:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1191:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1192:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1192:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1193:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
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
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1214:3: ( (lv_value_2_0= ruleValue ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1215:4: (lv_value_2_0= ruleValue )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1215:4: (lv_value_2_0= ruleValue )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1216:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.Value");
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1237:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1237:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1238:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1244:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1250:2: ( (kw= True | kw= False ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1251:2: (kw= True | kw= False )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1251:2: (kw= True | kw= False )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==True) ) {
                alt12=1;
            }
            else if ( (LA12_0==False) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1252:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1258:3: kw= False
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


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2Tuple"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1267:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2Tuple returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2Tuple= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2Tuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2Tuple = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1267:76: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2Tuple= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1268:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2Tuple= ruleNormalJobRuns_45onOneOf1AnyOf2Tuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2Tuple=ruleNormalJobRuns_45onOneOf1AnyOf2Tuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2Tuple; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2Tuple"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2Tuple"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1274:1: ruleNormalJobRuns_45onOneOf1AnyOf2Tuple returns [EObject current=null] : ( () ( ( (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 ) ) (otherlv_2= Comma ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) ) (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )? )? )? ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2Tuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_items0_1_0 = null;

        EObject lv_items1_3_0 = null;

        EObject lv_additionalItems_5_0 = null;

        EObject lv_additionalItems_7_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1280:2: ( ( () ( ( (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 ) ) (otherlv_2= Comma ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) ) (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )? )? )? ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1281:2: ( () ( ( (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 ) ) (otherlv_2= Comma ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) ) (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )? )? )? )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1281:2: ( () ( ( (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 ) ) (otherlv_2= Comma ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) ) (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )? )? )? )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1282:3: () ( ( (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 ) ) (otherlv_2= Comma ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) ) (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )? )? )?
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1282:3: ()
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1283:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleAccess().getNormalJobRuns_45onOneOf1AnyOf2TupleAction_0(),
              					current);
              			
            }

            }

            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1289:3: ( ( (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 ) ) (otherlv_2= Comma ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) ) (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )? )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RunsOn && LA16_0<=True)||LA16_0==LeftSquareBracket||LA16_0==LeftCurlyBracket||(LA16_0>=RULE_STRING && LA16_0<=RULE_E_DOUBLE)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1290:4: ( (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 ) ) (otherlv_2= Comma ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) ) (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )? )?
                    {
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1290:4: ( (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 ) )
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1291:5: (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 )
                    {
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1291:5: (lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 )
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1292:6: lv_items0_1_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleAccess().getItems0NormalJobRuns_45onOneOf1AnyOf2Items0ParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_items0_1_0=ruleNormalJobRuns_45onOneOf1AnyOf2Items0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleRule());
                      						}
                      						set(
                      							current,
                      							"items0",
                      							lv_items0_1_0,
                      							"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NormalJobRuns_45onOneOf1AnyOf2Items0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1309:4: (otherlv_2= Comma ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) ) (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==Comma) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1310:5: otherlv_2= Comma ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) ) (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )?
                            {
                            otherlv_2=(Token)match(input,Comma,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleAccess().getCommaKeyword_1_1_0());
                              				
                            }
                            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1314:5: ( (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 ) )
                            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1315:6: (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 )
                            {
                            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1315:6: (lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 )
                            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1316:7: lv_items1_3_0= ruleNormalJobRuns_45onOneOf1AnyOf2Items1
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleAccess().getItems1NormalJobRuns_45onOneOf1AnyOf2Items1ParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_16);
                            lv_items1_3_0=ruleNormalJobRuns_45onOneOf1AnyOf2Items1();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleRule());
                              							}
                              							set(
                              								current,
                              								"items1",
                              								lv_items1_3_0,
                              								"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NormalJobRuns_45onOneOf1AnyOf2Items1");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1333:5: (otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )* )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==Comma) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1334:6: otherlv_4= Comma ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )*
                                    {
                                    otherlv_4=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_4, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleAccess().getCommaKeyword_1_1_2_0());
                                      					
                                    }
                                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1338:6: ( (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) )
                                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1339:7: (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems )
                                    {
                                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1339:7: (lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems )
                                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1340:8: lv_additionalItems_5_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleAccess().getAdditionalItemsNormalJobRuns_45onOneOf1AnyOf2AdditionalItemsParserRuleCall_1_1_2_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_16);
                                    lv_additionalItems_5_0=ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleRule());
                                      								}
                                      								add(
                                      									current,
                                      									"additionalItems",
                                      									lv_additionalItems_5_0,
                                      									"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NormalJobRuns_45onOneOf1AnyOf2AdditionalItems");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }

                                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1357:6: (otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) ) )*
                                    loop13:
                                    do {
                                        int alt13=2;
                                        int LA13_0 = input.LA(1);

                                        if ( (LA13_0==Comma) ) {
                                            alt13=1;
                                        }


                                        switch (alt13) {
                                    	case 1 :
                                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1358:7: otherlv_6= Comma ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) )
                                    	    {
                                    	    otherlv_6=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      							newLeafNode(otherlv_6, grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleAccess().getCommaKeyword_1_1_2_2_0());
                                    	      						
                                    	    }
                                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1362:7: ( (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems ) )
                                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1363:8: (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems )
                                    	    {
                                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1363:8: (lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems )
                                    	    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1364:9: lv_additionalItems_7_0= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      									newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleAccess().getAdditionalItemsNormalJobRuns_45onOneOf1AnyOf2AdditionalItemsParserRuleCall_1_1_2_2_1_0());
                                    	      								
                                    	    }
                                    	    pushFollow(FOLLOW_16);
                                    	    lv_additionalItems_7_0=ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      									if (current==null) {
                                    	      										current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2TupleRule());
                                    	      									}
                                    	      									add(
                                    	      										current,
                                    	      										"additionalItems",
                                    	      										lv_additionalItems_7_0,
                                    	      										"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.NormalJobRuns_45onOneOf1AnyOf2AdditionalItems");
                                    	      									afterParserOrEnumRuleCall();
                                    	      								
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop13;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2Tuple"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2Items0"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1389:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2Items0 returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2Items0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items0 = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1389:77: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1390:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items0= ruleNormalJobRuns_45onOneOf1AnyOf2Items0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2Items0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items0=ruleNormalJobRuns_45onOneOf1AnyOf2Items0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items0; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2Items0"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2Items0"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1396:1: ruleNormalJobRuns_45onOneOf1AnyOf2Items0 returns [EObject current=null] : ( (lv_items0_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2Items0() throws RecognitionException {
        EObject current = null;

        EObject lv_items0_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1402:2: ( ( (lv_items0_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1403:2: ( (lv_items0_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1403:2: ( (lv_items0_0_0= ruleJsonDocument ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1404:3: (lv_items0_0_0= ruleJsonDocument )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1404:3: (lv_items0_0_0= ruleJsonDocument )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1405:4: lv_items0_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2Items0Access().getItems0JsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items0_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2Items0Rule());
              				}
              				set(
              					current,
              					"items0",
              					lv_items0_0_0,
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.JsonDocument");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2Items0"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2Items1"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1425:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2Items1 returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items1= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2Items1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items1 = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1425:77: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items1= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1426:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items1= ruleNormalJobRuns_45onOneOf1AnyOf2Items1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2Items1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items1=ruleNormalJobRuns_45onOneOf1AnyOf2Items1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2Items1; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2Items1"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2Items1"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1432:1: ruleNormalJobRuns_45onOneOf1AnyOf2Items1 returns [EObject current=null] : ( (lv_items1_0_0= ruleArchitecture ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2Items1() throws RecognitionException {
        EObject current = null;

        EObject lv_items1_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1438:2: ( ( (lv_items1_0_0= ruleArchitecture ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1439:2: ( (lv_items1_0_0= ruleArchitecture ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1439:2: ( (lv_items1_0_0= ruleArchitecture ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1440:3: (lv_items1_0_0= ruleArchitecture )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1440:3: (lv_items1_0_0= ruleArchitecture )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1441:4: lv_items1_0_0= ruleArchitecture
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2Items1Access().getItems1ArchitectureParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items1_0_0=ruleArchitecture();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2Items1Rule());
              				}
              				set(
              					current,
              					"items1",
              					lv_items1_0_0,
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.Architecture");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2Items1"


    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1461:1: entryRuleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1461:86: (iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1462:2: iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems= ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AdditionalItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems=ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems; 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1468:1: ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems returns [EObject current=null] : ( (lv_additionalItems_0_0= ruleEString ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalItems_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1474:2: ( ( (lv_additionalItems_0_0= ruleEString ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1475:2: ( (lv_additionalItems_0_0= ruleEString ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1475:2: ( (lv_additionalItems_0_0= ruleEString ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1476:3: (lv_additionalItems_0_0= ruleEString )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1476:3: (lv_additionalItems_0_0= ruleEString )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1477:4: lv_additionalItems_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AdditionalItemsAccess().getAdditionalItemsEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalItems_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf1AnyOf2AdditionalItemsRule());
              				}
              				set(
              					current,
              					"additionalItems",
              					lv_additionalItems_0_0,
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.EString");
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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf1AnyOf2AdditionalItems"


    // $ANTLR start "entryRuleArchitecture"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1497:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1497:53: (iv_ruleArchitecture= ruleArchitecture EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1498:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArchitectureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArchitecture; 
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
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1504:1: ruleArchitecture returns [EObject current=null] : ( (lv_architecture_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject lv_architecture_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1510:2: ( ( (lv_architecture_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1511:2: ( (lv_architecture_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1511:2: ( (lv_architecture_0_0= ruleJsonDocument ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1512:3: (lv_architecture_0_0= ruleJsonDocument )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1512:3: (lv_architecture_0_0= ruleJsonDocument )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1513:4: lv_architecture_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getArchitectureAccess().getArchitectureJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_architecture_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getArchitectureRule());
              				}
              				set(
              					current,
              					"architecture",
              					lv_architecture_0_0,
              					"githubwf.githubwf.NormalJobRuns_45onOneOf1AnyOf2.JsonDocument");
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
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1533:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1533:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1534:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1540:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1546:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1547:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1547:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RunsOn) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1548:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1556:3: this_KEYWORD_1= ruleKEYWORD
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_1=ruleKEYWORD();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1570:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1570:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1571:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKEYWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKEYWORD.getText(); 
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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1577:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= RunsOn ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1583:2: (kw= RunsOn )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1584:2: kw= RunsOn
            {
            kw=(Token)match(input,RunsOn,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRunsOnKeyword());
              	
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
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleNullEnum"
    // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1592:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1598:2: ( (enumLiteral_0= Null ) )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1599:2: (enumLiteral_0= Null )
            {
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1599:2: (enumLiteral_0= Null )
            // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:1600:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalNormalJobRuns_45onOneOf1AnyOf2Parser
    public final void synpred1_InternalNormalJobRuns_45onOneOf1AnyOf2Parser_fragment() throws RecognitionException {   
        // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:110:4: ( ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )
        // InternalNormalJobRuns_45onOneOf1AnyOf2Parser.g:110:5: ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalNormalJobRuns_45onOneOf1AnyOf2Parser

    // Delegated rules

    public final boolean synpred1_InternalNormalJobRuns_45onOneOf1AnyOf2Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalNormalJobRuns_45onOneOf1AnyOf2Parser_fragment(); // can never throw exception
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
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\11\1\4\2\0\7\uffff";
    static final String dfa_3s = "\1\4\1\11\1\21\2\0\7\uffff";
    static final String dfa_4s = "\5\uffff\1\4\1\7\1\5\1\6\1\2\1\1\1\3";
    static final String dfa_5s = "\3\uffff\1\0\1\1\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\11\1\5\1\6\1\5\2\uffff\1\10\1\uffff\1\7\2\uffff\1\11\1\3\1\4",
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
            return "108:2: ( ( ( ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber )=>this_NormalJobRuns_45onOneOf1AnyOf2TypeNumber_0= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNumber ) | this_NormalJobRuns_45onOneOf1AnyOf2TypeString_1= ruleNormalJobRuns_45onOneOf1AnyOf2TypeString | this_NormalJobRuns_45onOneOf1AnyOf2TypeInteger_2= ruleNormalJobRuns_45onOneOf1AnyOf2TypeInteger | this_NormalJobRuns_45onOneOf1AnyOf2TypeBoolean_3= ruleNormalJobRuns_45onOneOf1AnyOf2TypeBoolean | this_NormalJobRuns_45onOneOf1AnyOf2TypeObject_4= ruleNormalJobRuns_45onOneOf1AnyOf2TypeObject | this_NormalJobRuns_45onOneOf1AnyOf2TypeArray_5= ruleNormalJobRuns_45onOneOf1AnyOf2TypeArray | this_NormalJobRuns_45onOneOf1AnyOf2TypeNull_6= ruleNormalJobRuns_45onOneOf1AnyOf2TypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalNormalJobRuns_45onOneOf1AnyOf2Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalNormalJobRuns_45onOneOf1AnyOf2Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index1_4);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000102L});

}
