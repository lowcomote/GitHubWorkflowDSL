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
import githubwf.githubwf.services.NormalJobConcurrencyOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNormalJobConcurrencyOneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CancelInProgress", "Concurrency", "Group", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Group=6;
    public static final int Null=8;
    public static final int True=9;
    public static final int RULE_STRING=17;
    public static final int False=7;
    public static final int CancelInProgress=4;
    public static final int RULE_SL_COMMENT=22;
    public static final int Comma=10;
    public static final int Concurrency=5;
    public static final int Colon=11;
    public static final int RightCurlyBracket=15;
    public static final int RULE_E_DOUBLE=19;
    public static final int EOF=-1;
    public static final int RightSquareBracket=13;
    public static final int RULE_ID=20;
    public static final int RULE_WS=23;
    public static final int LeftCurlyBracket=14;
    public static final int RULE_E_INT=18;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_INT=16;
    public static final int RULE_ML_COMMENT=21;
    public static final int LeftSquareBracket=12;

    // delegates
    // delegators


        public InternalNormalJobConcurrencyOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobConcurrencyOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobConcurrencyOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobConcurrencyOneOf1Parser.g"; }



     	private NormalJobConcurrencyOneOf1GrammarAccess grammarAccess;

        public InternalNormalJobConcurrencyOneOf1Parser(TokenStream input, NormalJobConcurrencyOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobConcurrencyOneOf1";
       	}

       	@Override
       	protected NormalJobConcurrencyOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobConcurrencyOneOf1"
    // InternalNormalJobConcurrencyOneOf1Parser.g:58:1: entryRuleNormalJobConcurrencyOneOf1 returns [EObject current=null] : iv_ruleNormalJobConcurrencyOneOf1= ruleNormalJobConcurrencyOneOf1 EOF ;
    public final EObject entryRuleNormalJobConcurrencyOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobConcurrencyOneOf1 = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:58:67: (iv_ruleNormalJobConcurrencyOneOf1= ruleNormalJobConcurrencyOneOf1 EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:59:2: iv_ruleNormalJobConcurrencyOneOf1= ruleNormalJobConcurrencyOneOf1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobConcurrencyOneOf1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobConcurrencyOneOf1=ruleNormalJobConcurrencyOneOf1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobConcurrencyOneOf1; 
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
    // $ANTLR end "entryRuleNormalJobConcurrencyOneOf1"


    // $ANTLR start "ruleNormalJobConcurrencyOneOf1"
    // InternalNormalJobConcurrencyOneOf1Parser.g:65:1: ruleNormalJobConcurrencyOneOf1 returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleConcurrency ) ) ) ;
    public final EObject ruleNormalJobConcurrencyOneOf1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:71:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleConcurrency ) ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:72:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleConcurrency ) ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:72:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleConcurrency ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:73:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleConcurrency ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobConcurrencyOneOf1Access().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobConcurrencyOneOf1Access().getColonKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:81:3: ( (lv_concurrency_2_0= ruleConcurrency ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:82:4: (lv_concurrency_2_0= ruleConcurrency )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:82:4: (lv_concurrency_2_0= ruleConcurrency )
            // InternalNormalJobConcurrencyOneOf1Parser.g:83:5: lv_concurrency_2_0= ruleConcurrency
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobConcurrencyOneOf1Access().getConcurrencyConcurrencyParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleConcurrency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobConcurrencyOneOf1Rule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.Concurrency");
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
    // $ANTLR end "ruleNormalJobConcurrencyOneOf1"


    // $ANTLR start "entryRuleConcurrencyPropertiesAbstract"
    // InternalNormalJobConcurrencyOneOf1Parser.g:104:1: entryRuleConcurrencyPropertiesAbstract returns [EObject current=null] : iv_ruleConcurrencyPropertiesAbstract= ruleConcurrencyPropertiesAbstract EOF ;
    public final EObject entryRuleConcurrencyPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyPropertiesAbstract = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:104:70: (iv_ruleConcurrencyPropertiesAbstract= ruleConcurrencyPropertiesAbstract EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:105:2: iv_ruleConcurrencyPropertiesAbstract= ruleConcurrencyPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyPropertiesAbstract=ruleConcurrencyPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyPropertiesAbstract; 
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
    // $ANTLR end "entryRuleConcurrencyPropertiesAbstract"


    // $ANTLR start "ruleConcurrencyPropertiesAbstract"
    // InternalNormalJobConcurrencyOneOf1Parser.g:111:1: ruleConcurrencyPropertiesAbstract returns [EObject current=null] : (this_ConcurrencyGroup_0= ruleConcurrencyGroup | this_ConcurrencyCancel_45in_45progress_1= ruleConcurrencyCancel_45in_45progress ) ;
    public final EObject ruleConcurrencyPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ConcurrencyGroup_0 = null;

        EObject this_ConcurrencyCancel_45in_45progress_1 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:117:2: ( (this_ConcurrencyGroup_0= ruleConcurrencyGroup | this_ConcurrencyCancel_45in_45progress_1= ruleConcurrencyCancel_45in_45progress ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:118:2: (this_ConcurrencyGroup_0= ruleConcurrencyGroup | this_ConcurrencyCancel_45in_45progress_1= ruleConcurrencyCancel_45in_45progress )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:118:2: (this_ConcurrencyGroup_0= ruleConcurrencyGroup | this_ConcurrencyCancel_45in_45progress_1= ruleConcurrencyCancel_45in_45progress )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Group) ) {
                alt1=1;
            }
            else if ( (LA1_0==CancelInProgress) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:119:3: this_ConcurrencyGroup_0= ruleConcurrencyGroup
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcurrencyPropertiesAbstractAccess().getConcurrencyGroupParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConcurrencyGroup_0=ruleConcurrencyGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConcurrencyGroup_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:128:3: this_ConcurrencyCancel_45in_45progress_1= ruleConcurrencyCancel_45in_45progress
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcurrencyPropertiesAbstractAccess().getConcurrencyCancel_45in_45progressParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConcurrencyCancel_45in_45progress_1=ruleConcurrencyCancel_45in_45progress();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConcurrencyCancel_45in_45progress_1;
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
    // $ANTLR end "ruleConcurrencyPropertiesAbstract"


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressAbstract"
    // InternalNormalJobConcurrencyOneOf1Parser.g:140:1: entryRuleConcurrencyCancel_45in_45progressAbstract returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressAbstract= ruleConcurrencyCancel_45in_45progressAbstract EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressAbstract = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:140:82: (iv_ruleConcurrencyCancel_45in_45progressAbstract= ruleConcurrencyCancel_45in_45progressAbstract EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:141:2: iv_ruleConcurrencyCancel_45in_45progressAbstract= ruleConcurrencyCancel_45in_45progressAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressAbstract=ruleConcurrencyCancel_45in_45progressAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressAbstract; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressAbstract"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressAbstract"
    // InternalNormalJobConcurrencyOneOf1Parser.g:147:1: ruleConcurrencyCancel_45in_45progressAbstract returns [EObject current=null] : ( ( ( ruleConcurrencyCancel_45in_45progressTypeNumber )=>this_ConcurrencyCancel_45in_45progressTypeNumber_0= ruleConcurrencyCancel_45in_45progressTypeNumber ) | this_ConcurrencyCancel_45in_45progressTypeString_1= ruleConcurrencyCancel_45in_45progressTypeString | this_ConcurrencyCancel_45in_45progressTypeInteger_2= ruleConcurrencyCancel_45in_45progressTypeInteger | this_ConcurrencyCancel_45in_45progressTypeBoolean_3= ruleConcurrencyCancel_45in_45progressTypeBoolean | this_ConcurrencyCancel_45in_45progressTypeObject_4= ruleConcurrencyCancel_45in_45progressTypeObject | this_ConcurrencyCancel_45in_45progressTypeArray_5= ruleConcurrencyCancel_45in_45progressTypeArray | this_ConcurrencyCancel_45in_45progressTypeNull_6= ruleConcurrencyCancel_45in_45progressTypeNull ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ConcurrencyCancel_45in_45progressTypeNumber_0 = null;

        EObject this_ConcurrencyCancel_45in_45progressTypeString_1 = null;

        EObject this_ConcurrencyCancel_45in_45progressTypeInteger_2 = null;

        EObject this_ConcurrencyCancel_45in_45progressTypeBoolean_3 = null;

        EObject this_ConcurrencyCancel_45in_45progressTypeObject_4 = null;

        EObject this_ConcurrencyCancel_45in_45progressTypeArray_5 = null;

        EObject this_ConcurrencyCancel_45in_45progressTypeNull_6 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:153:2: ( ( ( ( ruleConcurrencyCancel_45in_45progressTypeNumber )=>this_ConcurrencyCancel_45in_45progressTypeNumber_0= ruleConcurrencyCancel_45in_45progressTypeNumber ) | this_ConcurrencyCancel_45in_45progressTypeString_1= ruleConcurrencyCancel_45in_45progressTypeString | this_ConcurrencyCancel_45in_45progressTypeInteger_2= ruleConcurrencyCancel_45in_45progressTypeInteger | this_ConcurrencyCancel_45in_45progressTypeBoolean_3= ruleConcurrencyCancel_45in_45progressTypeBoolean | this_ConcurrencyCancel_45in_45progressTypeObject_4= ruleConcurrencyCancel_45in_45progressTypeObject | this_ConcurrencyCancel_45in_45progressTypeArray_5= ruleConcurrencyCancel_45in_45progressTypeArray | this_ConcurrencyCancel_45in_45progressTypeNull_6= ruleConcurrencyCancel_45in_45progressTypeNull ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:154:2: ( ( ( ruleConcurrencyCancel_45in_45progressTypeNumber )=>this_ConcurrencyCancel_45in_45progressTypeNumber_0= ruleConcurrencyCancel_45in_45progressTypeNumber ) | this_ConcurrencyCancel_45in_45progressTypeString_1= ruleConcurrencyCancel_45in_45progressTypeString | this_ConcurrencyCancel_45in_45progressTypeInteger_2= ruleConcurrencyCancel_45in_45progressTypeInteger | this_ConcurrencyCancel_45in_45progressTypeBoolean_3= ruleConcurrencyCancel_45in_45progressTypeBoolean | this_ConcurrencyCancel_45in_45progressTypeObject_4= ruleConcurrencyCancel_45in_45progressTypeObject | this_ConcurrencyCancel_45in_45progressTypeArray_5= ruleConcurrencyCancel_45in_45progressTypeArray | this_ConcurrencyCancel_45in_45progressTypeNull_6= ruleConcurrencyCancel_45in_45progressTypeNull )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:154:2: ( ( ( ruleConcurrencyCancel_45in_45progressTypeNumber )=>this_ConcurrencyCancel_45in_45progressTypeNumber_0= ruleConcurrencyCancel_45in_45progressTypeNumber ) | this_ConcurrencyCancel_45in_45progressTypeString_1= ruleConcurrencyCancel_45in_45progressTypeString | this_ConcurrencyCancel_45in_45progressTypeInteger_2= ruleConcurrencyCancel_45in_45progressTypeInteger | this_ConcurrencyCancel_45in_45progressTypeBoolean_3= ruleConcurrencyCancel_45in_45progressTypeBoolean | this_ConcurrencyCancel_45in_45progressTypeObject_4= ruleConcurrencyCancel_45in_45progressTypeObject | this_ConcurrencyCancel_45in_45progressTypeArray_5= ruleConcurrencyCancel_45in_45progressTypeArray | this_ConcurrencyCancel_45in_45progressTypeNull_6= ruleConcurrencyCancel_45in_45progressTypeNull )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:155:3: ( ( ruleConcurrencyCancel_45in_45progressTypeNumber )=>this_ConcurrencyCancel_45in_45progressTypeNumber_0= ruleConcurrencyCancel_45in_45progressTypeNumber )
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:155:3: ( ( ruleConcurrencyCancel_45in_45progressTypeNumber )=>this_ConcurrencyCancel_45in_45progressTypeNumber_0= ruleConcurrencyCancel_45in_45progressTypeNumber )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:156:4: ( ruleConcurrencyCancel_45in_45progressTypeNumber )=>this_ConcurrencyCancel_45in_45progressTypeNumber_0= ruleConcurrencyCancel_45in_45progressTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAbstractAccess().getConcurrencyCancel_45in_45progressTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ConcurrencyCancel_45in_45progressTypeNumber_0=ruleConcurrencyCancel_45in_45progressTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConcurrencyCancel_45in_45progressTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:167:3: this_ConcurrencyCancel_45in_45progressTypeString_1= ruleConcurrencyCancel_45in_45progressTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAbstractAccess().getConcurrencyCancel_45in_45progressTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConcurrencyCancel_45in_45progressTypeString_1=ruleConcurrencyCancel_45in_45progressTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConcurrencyCancel_45in_45progressTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:176:3: this_ConcurrencyCancel_45in_45progressTypeInteger_2= ruleConcurrencyCancel_45in_45progressTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAbstractAccess().getConcurrencyCancel_45in_45progressTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConcurrencyCancel_45in_45progressTypeInteger_2=ruleConcurrencyCancel_45in_45progressTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConcurrencyCancel_45in_45progressTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:185:3: this_ConcurrencyCancel_45in_45progressTypeBoolean_3= ruleConcurrencyCancel_45in_45progressTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAbstractAccess().getConcurrencyCancel_45in_45progressTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConcurrencyCancel_45in_45progressTypeBoolean_3=ruleConcurrencyCancel_45in_45progressTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConcurrencyCancel_45in_45progressTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:194:3: this_ConcurrencyCancel_45in_45progressTypeObject_4= ruleConcurrencyCancel_45in_45progressTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAbstractAccess().getConcurrencyCancel_45in_45progressTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConcurrencyCancel_45in_45progressTypeObject_4=ruleConcurrencyCancel_45in_45progressTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConcurrencyCancel_45in_45progressTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:203:3: this_ConcurrencyCancel_45in_45progressTypeArray_5= ruleConcurrencyCancel_45in_45progressTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAbstractAccess().getConcurrencyCancel_45in_45progressTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConcurrencyCancel_45in_45progressTypeArray_5=ruleConcurrencyCancel_45in_45progressTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConcurrencyCancel_45in_45progressTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:212:3: this_ConcurrencyCancel_45in_45progressTypeNull_6= ruleConcurrencyCancel_45in_45progressTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAbstractAccess().getConcurrencyCancel_45in_45progressTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConcurrencyCancel_45in_45progressTypeNull_6=ruleConcurrencyCancel_45in_45progressTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConcurrencyCancel_45in_45progressTypeNull_6;
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressAbstract"


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressPropertiesAbstract"
    // InternalNormalJobConcurrencyOneOf1Parser.g:224:1: entryRuleConcurrencyCancel_45in_45progressPropertiesAbstract returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressPropertiesAbstract= ruleConcurrencyCancel_45in_45progressPropertiesAbstract EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressPropertiesAbstract = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:224:92: (iv_ruleConcurrencyCancel_45in_45progressPropertiesAbstract= ruleConcurrencyCancel_45in_45progressPropertiesAbstract EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:225:2: iv_ruleConcurrencyCancel_45in_45progressPropertiesAbstract= ruleConcurrencyCancel_45in_45progressPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressPropertiesAbstract=ruleConcurrencyCancel_45in_45progressPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressPropertiesAbstract; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressPropertiesAbstract"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressPropertiesAbstract"
    // InternalNormalJobConcurrencyOneOf1Parser.g:231:1: ruleConcurrencyCancel_45in_45progressPropertiesAbstract returns [EObject current=null] : ( ( ruleConcurrencyCancel_45in_45progressAdditionalProperties )=>this_ConcurrencyCancel_45in_45progressAdditionalProperties_0= ruleConcurrencyCancel_45in_45progressAdditionalProperties ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ConcurrencyCancel_45in_45progressAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:237:2: ( ( ( ruleConcurrencyCancel_45in_45progressAdditionalProperties )=>this_ConcurrencyCancel_45in_45progressAdditionalProperties_0= ruleConcurrencyCancel_45in_45progressAdditionalProperties ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:238:2: ( ( ruleConcurrencyCancel_45in_45progressAdditionalProperties )=>this_ConcurrencyCancel_45in_45progressAdditionalProperties_0= ruleConcurrencyCancel_45in_45progressAdditionalProperties )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:238:2: ( ( ruleConcurrencyCancel_45in_45progressAdditionalProperties )=>this_ConcurrencyCancel_45in_45progressAdditionalProperties_0= ruleConcurrencyCancel_45in_45progressAdditionalProperties )
            // InternalNormalJobConcurrencyOneOf1Parser.g:239:3: ( ruleConcurrencyCancel_45in_45progressAdditionalProperties )=>this_ConcurrencyCancel_45in_45progressAdditionalProperties_0= ruleConcurrencyCancel_45in_45progressAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressPropertiesAbstractAccess().getConcurrencyCancel_45in_45progressAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ConcurrencyCancel_45in_45progressAdditionalProperties_0=ruleConcurrencyCancel_45in_45progressAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConcurrencyCancel_45in_45progressAdditionalProperties_0;
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalNormalJobConcurrencyOneOf1Parser.g:252:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:252:46: (iv_ruleValue= ruleValue EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:253:2: iv_ruleValue= ruleValue EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:259:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalNormalJobConcurrencyOneOf1Parser.g:265:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:266:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:266:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt3=6;
            switch ( input.LA(1) ) {
            case CancelInProgress:
            case Concurrency:
            case Group:
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:267:3: this_StringValue_0= ruleStringValue
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:276:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:285:3: this_NullValue_2= ruleNullValue
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:294:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:303:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:312:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleConcurrency"
    // InternalNormalJobConcurrencyOneOf1Parser.g:324:1: entryRuleConcurrency returns [EObject current=null] : iv_ruleConcurrency= ruleConcurrency EOF ;
    public final EObject entryRuleConcurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrency = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:324:52: (iv_ruleConcurrency= ruleConcurrency EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:325:2: iv_ruleConcurrency= ruleConcurrency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrency=ruleConcurrency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrency; 
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
    // $ANTLR end "entryRuleConcurrency"


    // $ANTLR start "ruleConcurrency"
    // InternalNormalJobConcurrencyOneOf1Parser.g:331:1: ruleConcurrency returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleConcurrency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_concurrency_2_0 = null;

        EObject lv_concurrency_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:337:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:338:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:338:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobConcurrencyOneOf1Parser.g:339:3: () otherlv_1= LeftCurlyBracket ( ( (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:339:3: ()
            // InternalNormalJobConcurrencyOneOf1Parser.g:340:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConcurrencyAccess().getConcurrencyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:350:3: ( ( (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==CancelInProgress||LA5_0==Group) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:351:4: ( (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:351:4: ( (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract ) )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:352:5: (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract )
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:352:5: (lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:353:6: lv_concurrency_2_0= ruleConcurrencyPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConcurrencyAccess().getConcurrencyConcurrencyPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_concurrency_2_0=ruleConcurrencyPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConcurrencyRule());
                      						}
                      						add(
                      							current,
                      							"concurrency",
                      							lv_concurrency_2_0,
                      							"githubwf.githubwf.NormalJobConcurrencyOneOf1.ConcurrencyPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobConcurrencyOneOf1Parser.g:370:4: (otherlv_3= Comma ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:371:5: otherlv_3= Comma ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getConcurrencyAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:375:5: ( (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract ) )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:376:6: (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:376:6: (lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:377:7: lv_concurrency_4_0= ruleConcurrencyPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConcurrencyAccess().getConcurrencyConcurrencyPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_concurrency_4_0=ruleConcurrencyPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConcurrencyRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"concurrency",
                    	      								lv_concurrency_4_0,
                    	      								"githubwf.githubwf.NormalJobConcurrencyOneOf1.ConcurrencyPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConcurrencyAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleConcurrency"


    // $ANTLR start "entryRuleConcurrencyGroup"
    // InternalNormalJobConcurrencyOneOf1Parser.g:404:1: entryRuleConcurrencyGroup returns [EObject current=null] : iv_ruleConcurrencyGroup= ruleConcurrencyGroup EOF ;
    public final EObject entryRuleConcurrencyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyGroup = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:404:57: (iv_ruleConcurrencyGroup= ruleConcurrencyGroup EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:405:2: iv_ruleConcurrencyGroup= ruleConcurrencyGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyGroup=ruleConcurrencyGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyGroup; 
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
    // $ANTLR end "entryRuleConcurrencyGroup"


    // $ANTLR start "ruleConcurrencyGroup"
    // InternalNormalJobConcurrencyOneOf1Parser.g:411:1: ruleConcurrencyGroup returns [EObject current=null] : (otherlv_0= Group otherlv_1= Colon ( (lv_group_2_0= ruleEString ) ) ) ;
    public final EObject ruleConcurrencyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_group_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:417:2: ( (otherlv_0= Group otherlv_1= Colon ( (lv_group_2_0= ruleEString ) ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:418:2: (otherlv_0= Group otherlv_1= Colon ( (lv_group_2_0= ruleEString ) ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:418:2: (otherlv_0= Group otherlv_1= Colon ( (lv_group_2_0= ruleEString ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:419:3: otherlv_0= Group otherlv_1= Colon ( (lv_group_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Group,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConcurrencyGroupAccess().getGroupKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyGroupAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:427:3: ( (lv_group_2_0= ruleEString ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:428:4: (lv_group_2_0= ruleEString )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:428:4: (lv_group_2_0= ruleEString )
            // InternalNormalJobConcurrencyOneOf1Parser.g:429:5: lv_group_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcurrencyGroupAccess().getGroupEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_group_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcurrencyGroupRule());
              					}
              					set(
              						current,
              						"group",
              						lv_group_2_0,
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.EString");
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
    // $ANTLR end "ruleConcurrencyGroup"


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progress"
    // InternalNormalJobConcurrencyOneOf1Parser.g:450:1: entryRuleConcurrencyCancel_45in_45progress returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progress= ruleConcurrencyCancel_45in_45progress EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progress = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:450:74: (iv_ruleConcurrencyCancel_45in_45progress= ruleConcurrencyCancel_45in_45progress EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:451:2: iv_ruleConcurrencyCancel_45in_45progress= ruleConcurrencyCancel_45in_45progress EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progress=ruleConcurrencyCancel_45in_45progress();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progress; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progress"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progress"
    // InternalNormalJobConcurrencyOneOf1Parser.g:457:1: ruleConcurrencyCancel_45in_45progress returns [EObject current=null] : ( (lv_cancel_45in_45progress_0_0= ruleConcurrencyCancel_45in_45progressAbstract ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progress() throws RecognitionException {
        EObject current = null;

        EObject lv_cancel_45in_45progress_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:463:2: ( ( (lv_cancel_45in_45progress_0_0= ruleConcurrencyCancel_45in_45progressAbstract ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:464:2: ( (lv_cancel_45in_45progress_0_0= ruleConcurrencyCancel_45in_45progressAbstract ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:464:2: ( (lv_cancel_45in_45progress_0_0= ruleConcurrencyCancel_45in_45progressAbstract ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:465:3: (lv_cancel_45in_45progress_0_0= ruleConcurrencyCancel_45in_45progressAbstract )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:465:3: (lv_cancel_45in_45progress_0_0= ruleConcurrencyCancel_45in_45progressAbstract )
            // InternalNormalJobConcurrencyOneOf1Parser.g:466:4: lv_cancel_45in_45progress_0_0= ruleConcurrencyCancel_45in_45progressAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAccess().getCancel_45in_45progressConcurrencyCancel_45in_45progressAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_cancel_45in_45progress_0_0=ruleConcurrencyCancel_45in_45progressAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressRule());
              				}
              				set(
              					current,
              					"cancel_45in_45progress",
              					lv_cancel_45in_45progress_0_0,
              					"githubwf.githubwf.NormalJobConcurrencyOneOf1.ConcurrencyCancel_45in_45progressAbstract");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progress"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobConcurrencyOneOf1Parser.g:486:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:486:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:487:2: iv_ruleEString= ruleEString EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:493:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:499:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobConcurrencyOneOf1Parser.g:500:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressTypeString"
    // InternalNormalJobConcurrencyOneOf1Parser.g:513:1: entryRuleConcurrencyCancel_45in_45progressTypeString returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressTypeString= ruleConcurrencyCancel_45in_45progressTypeString EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressTypeString = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:513:84: (iv_ruleConcurrencyCancel_45in_45progressTypeString= ruleConcurrencyCancel_45in_45progressTypeString EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:514:2: iv_ruleConcurrencyCancel_45in_45progressTypeString= ruleConcurrencyCancel_45in_45progressTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressTypeString=ruleConcurrencyCancel_45in_45progressTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressTypeString; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressTypeString"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressTypeString"
    // InternalNormalJobConcurrencyOneOf1Parser.g:520:1: ruleConcurrencyCancel_45in_45progressTypeString returns [EObject current=null] : (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEString ) ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_cancel_45in_45progress_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:526:2: ( (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEString ) ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:527:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEString ) ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:527:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEString ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:528:3: otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,CancelInProgress,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConcurrencyCancel_45in_45progressTypeStringAccess().getCancelInProgressKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressTypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:536:3: ( (lv_cancel_45in_45progress_2_0= ruleEString ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:537:4: (lv_cancel_45in_45progress_2_0= ruleEString )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:537:4: (lv_cancel_45in_45progress_2_0= ruleEString )
            // InternalNormalJobConcurrencyOneOf1Parser.g:538:5: lv_cancel_45in_45progress_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeStringAccess().getCancel_45in_45progressEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_cancel_45in_45progress_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressTypeStringRule());
              					}
              					set(
              						current,
              						"cancel_45in_45progress",
              						lv_cancel_45in_45progress_2_0,
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.EString");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressTypeString"


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressTypeInteger"
    // InternalNormalJobConcurrencyOneOf1Parser.g:559:1: entryRuleConcurrencyCancel_45in_45progressTypeInteger returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressTypeInteger= ruleConcurrencyCancel_45in_45progressTypeInteger EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressTypeInteger = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:559:85: (iv_ruleConcurrencyCancel_45in_45progressTypeInteger= ruleConcurrencyCancel_45in_45progressTypeInteger EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:560:2: iv_ruleConcurrencyCancel_45in_45progressTypeInteger= ruleConcurrencyCancel_45in_45progressTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressTypeInteger=ruleConcurrencyCancel_45in_45progressTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressTypeInteger; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressTypeInteger"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressTypeInteger"
    // InternalNormalJobConcurrencyOneOf1Parser.g:566:1: ruleConcurrencyCancel_45in_45progressTypeInteger returns [EObject current=null] : (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressTypeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_cancel_45in_45progress_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:572:2: ( (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:573:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:573:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:574:3: otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,CancelInProgress,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConcurrencyCancel_45in_45progressTypeIntegerAccess().getCancelInProgressKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressTypeIntegerAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:582:3: ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:583:4: (lv_cancel_45in_45progress_2_0= ruleEDoubleObject )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:583:4: (lv_cancel_45in_45progress_2_0= ruleEDoubleObject )
            // InternalNormalJobConcurrencyOneOf1Parser.g:584:5: lv_cancel_45in_45progress_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeIntegerAccess().getCancel_45in_45progressEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_cancel_45in_45progress_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressTypeIntegerRule());
              					}
              					set(
              						current,
              						"cancel_45in_45progress",
              						lv_cancel_45in_45progress_2_0,
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.EDoubleObject");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressTypeInteger"


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressTypeNumber"
    // InternalNormalJobConcurrencyOneOf1Parser.g:605:1: entryRuleConcurrencyCancel_45in_45progressTypeNumber returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressTypeNumber= ruleConcurrencyCancel_45in_45progressTypeNumber EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressTypeNumber = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:605:84: (iv_ruleConcurrencyCancel_45in_45progressTypeNumber= ruleConcurrencyCancel_45in_45progressTypeNumber EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:606:2: iv_ruleConcurrencyCancel_45in_45progressTypeNumber= ruleConcurrencyCancel_45in_45progressTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressTypeNumber=ruleConcurrencyCancel_45in_45progressTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressTypeNumber; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressTypeNumber"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressTypeNumber"
    // InternalNormalJobConcurrencyOneOf1Parser.g:612:1: ruleConcurrencyCancel_45in_45progressTypeNumber returns [EObject current=null] : (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressTypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_cancel_45in_45progress_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:618:2: ( (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:619:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:619:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:620:3: otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,CancelInProgress,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConcurrencyCancel_45in_45progressTypeNumberAccess().getCancelInProgressKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressTypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:628:3: ( (lv_cancel_45in_45progress_2_0= ruleEDoubleObject ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:629:4: (lv_cancel_45in_45progress_2_0= ruleEDoubleObject )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:629:4: (lv_cancel_45in_45progress_2_0= ruleEDoubleObject )
            // InternalNormalJobConcurrencyOneOf1Parser.g:630:5: lv_cancel_45in_45progress_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeNumberAccess().getCancel_45in_45progressEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_cancel_45in_45progress_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressTypeNumberRule());
              					}
              					set(
              						current,
              						"cancel_45in_45progress",
              						lv_cancel_45in_45progress_2_0,
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.EDoubleObject");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressTypeNumber"


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressTypeBoolean"
    // InternalNormalJobConcurrencyOneOf1Parser.g:651:1: entryRuleConcurrencyCancel_45in_45progressTypeBoolean returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressTypeBoolean= ruleConcurrencyCancel_45in_45progressTypeBoolean EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressTypeBoolean = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:651:85: (iv_ruleConcurrencyCancel_45in_45progressTypeBoolean= ruleConcurrencyCancel_45in_45progressTypeBoolean EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:652:2: iv_ruleConcurrencyCancel_45in_45progressTypeBoolean= ruleConcurrencyCancel_45in_45progressTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressTypeBoolean=ruleConcurrencyCancel_45in_45progressTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressTypeBoolean; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressTypeBoolean"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressTypeBoolean"
    // InternalNormalJobConcurrencyOneOf1Parser.g:658:1: ruleConcurrencyCancel_45in_45progressTypeBoolean returns [EObject current=null] : (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressTypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_cancel_45in_45progress_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:664:2: ( (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:665:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:665:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:666:3: otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,CancelInProgress,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConcurrencyCancel_45in_45progressTypeBooleanAccess().getCancelInProgressKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressTypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:674:3: ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:675:4: (lv_cancel_45in_45progress_2_0= ruleEBooleanObject )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:675:4: (lv_cancel_45in_45progress_2_0= ruleEBooleanObject )
            // InternalNormalJobConcurrencyOneOf1Parser.g:676:5: lv_cancel_45in_45progress_2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeBooleanAccess().getCancel_45in_45progressEBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_cancel_45in_45progress_2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressTypeBooleanRule());
              					}
              					set(
              						current,
              						"cancel_45in_45progress",
              						lv_cancel_45in_45progress_2_0,
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.EBooleanObject");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressTypeBoolean"


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressTypeObject"
    // InternalNormalJobConcurrencyOneOf1Parser.g:697:1: entryRuleConcurrencyCancel_45in_45progressTypeObject returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressTypeObject= ruleConcurrencyCancel_45in_45progressTypeObject EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressTypeObject = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:697:84: (iv_ruleConcurrencyCancel_45in_45progressTypeObject= ruleConcurrencyCancel_45in_45progressTypeObject EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:698:2: iv_ruleConcurrencyCancel_45in_45progressTypeObject= ruleConcurrencyCancel_45in_45progressTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressTypeObject=ruleConcurrencyCancel_45in_45progressTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressTypeObject; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressTypeObject"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressTypeObject"
    // InternalNormalJobConcurrencyOneOf1Parser.g:704:1: ruleConcurrencyCancel_45in_45progressTypeObject returns [EObject current=null] : ( () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_cancel_45in_45progress_4_0 = null;

        EObject lv_cancel_45in_45progress_6_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:710:2: ( ( () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:711:2: ( () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:711:2: ( () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalNormalJobConcurrencyOneOf1Parser.g:712:3: () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:712:3: ()
            // InternalNormalJobConcurrencyOneOf1Parser.g:713:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectAccess().getConcurrencyCancel_45in_45progressTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,CancelInProgress,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectAccess().getCancelInProgressKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:731:3: ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=CancelInProgress && LA7_0<=Group)||LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:732:4: ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:732:4: ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:733:5: (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract )
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:733:5: (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:734:6: lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectAccess().getCancel_45in_45progressConcurrencyCancel_45in_45progressPropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_cancel_45in_45progress_4_0=ruleConcurrencyCancel_45in_45progressPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"cancel_45in_45progress",
                      							lv_cancel_45in_45progress_4_0,
                      							"githubwf.githubwf.NormalJobConcurrencyOneOf1.ConcurrencyCancel_45in_45progressPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobConcurrencyOneOf1Parser.g:751:4: (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:752:5: otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:756:5: ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract ) )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:757:6: (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:757:6: (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:758:7: lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectAccess().getCancel_45in_45progressConcurrencyCancel_45in_45progressPropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_cancel_45in_45progress_6_0=ruleConcurrencyCancel_45in_45progressPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"cancel_45in_45progress",
                    	      								lv_cancel_45in_45progress_6_0,
                    	      								"githubwf.githubwf.NormalJobConcurrencyOneOf1.ConcurrencyCancel_45in_45progressPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConcurrencyCancel_45in_45progressTypeObjectAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressTypeObject"


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressTypeArray"
    // InternalNormalJobConcurrencyOneOf1Parser.g:785:1: entryRuleConcurrencyCancel_45in_45progressTypeArray returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressTypeArray= ruleConcurrencyCancel_45in_45progressTypeArray EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressTypeArray = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:785:83: (iv_ruleConcurrencyCancel_45in_45progressTypeArray= ruleConcurrencyCancel_45in_45progressTypeArray EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:786:2: iv_ruleConcurrencyCancel_45in_45progressTypeArray= ruleConcurrencyCancel_45in_45progressTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressTypeArray=ruleConcurrencyCancel_45in_45progressTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressTypeArray; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressTypeArray"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressTypeArray"
    // InternalNormalJobConcurrencyOneOf1Parser.g:792:1: ruleConcurrencyCancel_45in_45progressTypeArray returns [EObject current=null] : ( () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_cancel_45in_45progress_4_0 = null;

        EObject lv_cancel_45in_45progress_6_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:798:2: ( ( () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:799:2: ( () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:799:2: ( () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalNormalJobConcurrencyOneOf1Parser.g:800:3: () otherlv_1= CancelInProgress otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:800:3: ()
            // InternalNormalJobConcurrencyOneOf1Parser.g:801:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayAccess().getConcurrencyCancel_45in_45progressTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,CancelInProgress,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayAccess().getCancelInProgressKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:819:3: ( ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=CancelInProgress && LA9_0<=True)||LA9_0==LeftSquareBracket||LA9_0==LeftCurlyBracket||(LA9_0>=RULE_STRING && LA9_0<=RULE_E_DOUBLE)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:820:4: ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems ) ) (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) ) )*
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:820:4: ( (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems ) )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:821:5: (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems )
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:821:5: (lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:822:6: lv_cancel_45in_45progress_4_0= ruleConcurrencyCancel_45in_45progressItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayAccess().getCancel_45in_45progressConcurrencyCancel_45in_45progressItemsParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_cancel_45in_45progress_4_0=ruleConcurrencyCancel_45in_45progressItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"cancel_45in_45progress",
                      							lv_cancel_45in_45progress_4_0,
                      							"githubwf.githubwf.NormalJobConcurrencyOneOf1.ConcurrencyCancel_45in_45progressItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobConcurrencyOneOf1Parser.g:839:4: (otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:840:5: otherlv_5= Comma ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:844:5: ( (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems ) )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:845:6: (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems )
                    	    {
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:845:6: (lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:846:7: lv_cancel_45in_45progress_6_0= ruleConcurrencyCancel_45in_45progressItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayAccess().getCancel_45in_45progressConcurrencyCancel_45in_45progressItemsParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_cancel_45in_45progress_6_0=ruleConcurrencyCancel_45in_45progressItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"cancel_45in_45progress",
                    	      								lv_cancel_45in_45progress_6_0,
                    	      								"githubwf.githubwf.NormalJobConcurrencyOneOf1.ConcurrencyCancel_45in_45progressItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConcurrencyCancel_45in_45progressTypeArrayAccess().getRightSquareBracketKeyword_5());
              		
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressTypeArray"


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressTypeNull"
    // InternalNormalJobConcurrencyOneOf1Parser.g:873:1: entryRuleConcurrencyCancel_45in_45progressTypeNull returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressTypeNull= ruleConcurrencyCancel_45in_45progressTypeNull EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressTypeNull = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:873:82: (iv_ruleConcurrencyCancel_45in_45progressTypeNull= ruleConcurrencyCancel_45in_45progressTypeNull EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:874:2: iv_ruleConcurrencyCancel_45in_45progressTypeNull= ruleConcurrencyCancel_45in_45progressTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressTypeNull=ruleConcurrencyCancel_45in_45progressTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressTypeNull; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressTypeNull"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressTypeNull"
    // InternalNormalJobConcurrencyOneOf1Parser.g:880:1: ruleConcurrencyCancel_45in_45progressTypeNull returns [EObject current=null] : (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleNullValue ) ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressTypeNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_cancel_45in_45progress_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:886:2: ( (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleNullValue ) ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:887:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleNullValue ) ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:887:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleNullValue ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:888:3: otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleNullValue ) )
            {
            otherlv_0=(Token)match(input,CancelInProgress,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConcurrencyCancel_45in_45progressTypeNullAccess().getCancelInProgressKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressTypeNullAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:896:3: ( (lv_cancel_45in_45progress_2_0= ruleNullValue ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:897:4: (lv_cancel_45in_45progress_2_0= ruleNullValue )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:897:4: (lv_cancel_45in_45progress_2_0= ruleNullValue )
            // InternalNormalJobConcurrencyOneOf1Parser.g:898:5: lv_cancel_45in_45progress_2_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressTypeNullAccess().getCancel_45in_45progressNullValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_cancel_45in_45progress_2_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressTypeNullRule());
              					}
              					set(
              						current,
              						"cancel_45in_45progress",
              						lv_cancel_45in_45progress_2_0,
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.NullValue");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressTypeNull"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalNormalJobConcurrencyOneOf1Parser.g:919:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:919:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:920:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:926:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:932:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:933:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:933:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_E_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_E_DOUBLE) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:934:3: this_E_INT_0= RULE_E_INT
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:942:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:953:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:953:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:954:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:960:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:966:2: ( (kw= True | kw= False ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:967:2: (kw= True | kw= False )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:967:2: (kw= True | kw= False )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==True) ) {
                alt11=1;
            }
            else if ( (LA11_0==False) ) {
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:968:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:974:3: kw= False
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


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressAdditionalProperties"
    // InternalNormalJobConcurrencyOneOf1Parser.g:983:1: entryRuleConcurrencyCancel_45in_45progressAdditionalProperties returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressAdditionalProperties= ruleConcurrencyCancel_45in_45progressAdditionalProperties EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressAdditionalProperties = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:983:94: (iv_ruleConcurrencyCancel_45in_45progressAdditionalProperties= ruleConcurrencyCancel_45in_45progressAdditionalProperties EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:984:2: iv_ruleConcurrencyCancel_45in_45progressAdditionalProperties= ruleConcurrencyCancel_45in_45progressAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressAdditionalProperties=ruleConcurrencyCancel_45in_45progressAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressAdditionalProperties; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressAdditionalProperties"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressAdditionalProperties"
    // InternalNormalJobConcurrencyOneOf1Parser.g:990:1: ruleConcurrencyCancel_45in_45progressAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:996:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:997:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:997:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:998:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:998:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:999:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:999:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1000:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:1021:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1022:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1022:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1023:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.JsonDocument");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalNormalJobConcurrencyOneOf1Parser.g:1044:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1044:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1045:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1051:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1057:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1058:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1058:2: ( (lv_value_0_0= ruleValue ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1059:3: (lv_value_0_0= ruleValue )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1059:3: (lv_value_0_0= ruleValue )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1060:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.NormalJobConcurrencyOneOf1.Value");
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1080:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1080:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1081:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1087:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1093:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1094:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1094:2: ( (lv_value_0_0= ruleEString ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1095:3: (lv_value_0_0= ruleEString )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1095:3: (lv_value_0_0= ruleEString )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1096:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.NormalJobConcurrencyOneOf1.EString");
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1116:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1116:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1117:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1123:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1129:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1130:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1130:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1131:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1131:3: ()
            // InternalNormalJobConcurrencyOneOf1Parser.g:1132:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:1142:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=CancelInProgress && LA13_0<=True)||LA13_0==LeftSquareBracket||LA13_0==LeftCurlyBracket||(LA13_0>=RULE_STRING && LA13_0<=RULE_E_DOUBLE)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1143:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1143:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1144:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1144:5: (lv_value_2_0= ruleValue )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1145:6: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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
                      							"githubwf.githubwf.NormalJobConcurrencyOneOf1.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobConcurrencyOneOf1Parser.g:1162:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1163:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_15); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1167:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1168:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1168:6: (lv_value_4_0= ruleValue )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1169:7: lv_value_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
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
                    	      								"githubwf.githubwf.NormalJobConcurrencyOneOf1.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1196:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1196:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1197:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1203:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1209:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1210:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1210:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1211:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1211:3: (lv_value_0_0= ruleNullEnum )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1212:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.NormalJobConcurrencyOneOf1.NullEnum");
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1232:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1232:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1233:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1239:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1245:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1246:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1246:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1247:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1247:3: (lv_value_0_0= ruleEDouble )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1248:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.NormalJobConcurrencyOneOf1.EDouble");
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1268:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1268:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1269:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1275:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1281:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1282:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1282:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1283:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1283:3: ()
            // InternalNormalJobConcurrencyOneOf1Parser.g:1284:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:1294:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=CancelInProgress && LA15_0<=Group)||LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1295:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1295:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1296:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1296:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1297:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
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
                      							"githubwf.githubwf.NormalJobConcurrencyOneOf1.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobConcurrencyOneOf1Parser.g:1314:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1315:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1319:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1320:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1320:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalNormalJobConcurrencyOneOf1Parser.g:1321:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
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
                    	      								"githubwf.githubwf.NormalJobConcurrencyOneOf1.KeyValuePair");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1348:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1348:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1349:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1355:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1361:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1362:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1362:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1363:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1363:3: (lv_value_0_0= ruleEBoolean )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1364:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.NormalJobConcurrencyOneOf1.EBoolean");
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1384:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1384:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1385:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1391:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1397:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1398:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1398:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_E_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_E_DOUBLE) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1399:3: this_E_INT_0= RULE_E_INT
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1407:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1418:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1418:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1419:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1425:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1431:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1432:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1432:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1433:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1433:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1434:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1434:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1435:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobConcurrencyOneOf1Parser.g:1456:3: ( (lv_value_2_0= ruleValue ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1457:4: (lv_value_2_0= ruleValue )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1457:4: (lv_value_2_0= ruleValue )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1458:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.NormalJobConcurrencyOneOf1.Value");
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1479:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1479:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1480:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1486:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1492:2: ( (kw= True | kw= False ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1493:2: (kw= True | kw= False )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1493:2: (kw= True | kw= False )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==True) ) {
                alt17=1;
            }
            else if ( (LA17_0==False) ) {
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1494:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1500:3: kw= False
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


    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressItems"
    // InternalNormalJobConcurrencyOneOf1Parser.g:1509:1: entryRuleConcurrencyCancel_45in_45progressItems returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressItems= ruleConcurrencyCancel_45in_45progressItems EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressItems = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1509:79: (iv_ruleConcurrencyCancel_45in_45progressItems= ruleConcurrencyCancel_45in_45progressItems EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1510:2: iv_ruleConcurrencyCancel_45in_45progressItems= ruleConcurrencyCancel_45in_45progressItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressItems=ruleConcurrencyCancel_45in_45progressItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcurrencyCancel_45in_45progressItems; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressItems"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressItems"
    // InternalNormalJobConcurrencyOneOf1Parser.g:1516:1: ruleConcurrencyCancel_45in_45progressItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1522:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1523:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1523:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1524:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1524:3: (lv_items_0_0= ruleJsonDocument )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1525:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobConcurrencyOneOf1.JsonDocument");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalNormalJobConcurrencyOneOf1Parser.g:1545:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1545:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1546:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1552:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1558:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1559:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1559:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=CancelInProgress && LA18_0<=Group)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1560:3: this_STRING_0= RULE_STRING
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
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1568:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1582:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1582:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1583:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalNormalJobConcurrencyOneOf1Parser.g:1589:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= CancelInProgress | kw= Concurrency | kw= Group ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1595:2: ( (kw= CancelInProgress | kw= Concurrency | kw= Group ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1596:2: (kw= CancelInProgress | kw= Concurrency | kw= Group )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1596:2: (kw= CancelInProgress | kw= Concurrency | kw= Group )
            int alt19=3;
            switch ( input.LA(1) ) {
            case CancelInProgress:
                {
                alt19=1;
                }
                break;
            case Concurrency:
                {
                alt19=2;
                }
                break;
            case Group:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1597:3: kw= CancelInProgress
                    {
                    kw=(Token)match(input,CancelInProgress,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getCancelInProgressKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1603:3: kw= Concurrency
                    {
                    kw=(Token)match(input,Concurrency,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConcurrencyKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobConcurrencyOneOf1Parser.g:1609:3: kw= Group
                    {
                    kw=(Token)match(input,Group,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGroupKeyword_2());
                      		
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
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleNullEnum"
    // InternalNormalJobConcurrencyOneOf1Parser.g:1618:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1624:2: ( (enumLiteral_0= Null ) )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1625:2: (enumLiteral_0= Null )
            {
            // InternalNormalJobConcurrencyOneOf1Parser.g:1625:2: (enumLiteral_0= Null )
            // InternalNormalJobConcurrencyOneOf1Parser.g:1626:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalNormalJobConcurrencyOneOf1Parser
    public final void synpred1_InternalNormalJobConcurrencyOneOf1Parser_fragment() throws RecognitionException {   
        // InternalNormalJobConcurrencyOneOf1Parser.g:156:4: ( ruleConcurrencyCancel_45in_45progressTypeNumber )
        // InternalNormalJobConcurrencyOneOf1Parser.g:156:5: ruleConcurrencyCancel_45in_45progressTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleConcurrencyCancel_45in_45progressTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalNormalJobConcurrencyOneOf1Parser

    // Delegated rules

    public final boolean synpred1_InternalNormalJobConcurrencyOneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalNormalJobConcurrencyOneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\13\1\4\4\uffff\2\0\3\uffff";
    static final String dfa_3s = "\1\4\1\13\1\23\4\uffff\2\0\3\uffff";
    static final String dfa_4s = "\3\uffff\1\5\1\7\1\6\1\2\2\uffff\1\4\1\1\1\3";
    static final String dfa_5s = "\7\uffff\1\0\1\1\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\3\6\1\11\1\4\1\11\2\uffff\1\5\1\uffff\1\3\2\uffff\1\6\1\7\1\10",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "154:2: ( ( ( ruleConcurrencyCancel_45in_45progressTypeNumber )=>this_ConcurrencyCancel_45in_45progressTypeNumber_0= ruleConcurrencyCancel_45in_45progressTypeNumber ) | this_ConcurrencyCancel_45in_45progressTypeString_1= ruleConcurrencyCancel_45in_45progressTypeString | this_ConcurrencyCancel_45in_45progressTypeInteger_2= ruleConcurrencyCancel_45in_45progressTypeInteger | this_ConcurrencyCancel_45in_45progressTypeBoolean_3= ruleConcurrencyCancel_45in_45progressTypeBoolean | this_ConcurrencyCancel_45in_45progressTypeObject_4= ruleConcurrencyCancel_45in_45progressTypeObject | this_ConcurrencyCancel_45in_45progressTypeArray_5= ruleConcurrencyCancel_45in_45progressTypeArray | this_ConcurrencyCancel_45in_45progressTypeNull_6= ruleConcurrencyCancel_45in_45progressTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalNormalJobConcurrencyOneOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalNormalJobConcurrencyOneOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008050L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000028070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000E73F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000E53F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});

}
