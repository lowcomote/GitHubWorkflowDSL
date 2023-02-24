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
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Default", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
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
    public static final int Default=4;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;

    // delegates
    // delegators


        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g"; }



     	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess grammarAccess;

        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser(TokenStream input, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then";
       	}

       	@Override
       	protected GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:58:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:58:112: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:59:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:65:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then() throws RecognitionException {
        EObject current = null;

        EObject lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:71:2: ( ( (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:72:2: ( (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:72:2: ( (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:73:3: (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:73:3: (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:74:4: lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:94:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:94:120: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:95:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:101:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract returns [EObject current=null] : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_1 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_2 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_3 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_4 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_5 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:107:2: ( ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:108:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:108:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:109:3: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:109:3: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:110:4: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:121:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_1=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:130:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_2=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:139:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_3=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:148:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_4=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:157:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_5=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:166:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_6=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_6;
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:178:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:178:130: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:179:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:185:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract returns [EObject current=null] : (this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_0 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:191:2: ( (this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:192:2: (this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:192:2: (this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:193:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:202:3: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:202:3: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:203:4: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:217:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:217:46: (iv_ruleValue= ruleValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:218:2: iv_ruleValue= ruleValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:224:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:230:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:231:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:231:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt3=6;
            switch ( input.LA(1) ) {
            case Default:
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:232:3: this_StringValue_0= ruleStringValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:241:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:250:3: this_NullValue_2= ruleNullValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:259:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:268:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:277:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:289:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:289:122: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:290:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:296:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEString ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:302:2: ( ( (lv_patternProperties0_0_0= ruleEString ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:303:2: ( (lv_patternProperties0_0_0= ruleEString ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:303:2: ( (lv_patternProperties0_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:304:3: (lv_patternProperties0_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:304:3: (lv_patternProperties0_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:305:4: lv_patternProperties0_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringAccess().getPatternProperties0EStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EString");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:325:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:325:123: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:326:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:332:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:338:2: ( ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:339:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:339:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:340:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:340:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:341:4: lv_patternProperties0_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:361:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:361:122: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:362:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:368:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:374:2: ( ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:375:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:375:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:376:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:376:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:377:4: lv_patternProperties0_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:397:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:397:123: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:398:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:404:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:410:2: ( ( (lv_patternProperties0_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:411:2: ( (lv_patternProperties0_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:411:2: ( (lv_patternProperties0_0_0= ruleEBooleanObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:412:3: (lv_patternProperties0_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:412:3: (lv_patternProperties0_0_0= ruleEBooleanObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:413:4: lv_patternProperties0_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EBooleanObject");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:433:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:433:122: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:434:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:440:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_patternProperties0_2_0 = null;

        EObject lv_patternProperties0_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:446:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:447:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:447:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:448:3: () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:448:3: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:449:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:459:3: ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Default||LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:460:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:460:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:461:5: (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:461:5: (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:462:6: lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_patternProperties0_2_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"patternProperties0",
                      							lv_patternProperties0_2_0,
                      							"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:479:4: (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:480:5: otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:484:5: ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract ) )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:485:6: (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:485:6: (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:486:7: lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_patternProperties0_4_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"patternProperties0",
                    	      								lv_patternProperties0_4_0,
                    	      								"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract");
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

              			newLeafNode(otherlv_5, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:513:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:513:121: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:514:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:520:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_patternProperties0_2_0 = null;

        EObject lv_patternProperties0_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:526:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:527:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:527:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:528:3: () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:528:3: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:529:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:539:3: ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=Default && LA7_0<=True)||LA7_0==LeftSquareBracket||LA7_0==LeftCurlyBracket||(LA7_0>=RULE_STRING && LA7_0<=RULE_E_DOUBLE)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:540:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:540:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:541:5: (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:541:5: (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:542:6: lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_patternProperties0_2_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"patternProperties0",
                      							lv_patternProperties0_2_0,
                      							"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:559:4: (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:560:5: otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:564:5: ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems ) )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:565:6: (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems )
                    	    {
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:565:6: (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:566:7: lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_patternProperties0_4_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"patternProperties0",
                    	      								lv_patternProperties0_4_0,
                    	      								"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems");
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

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:593:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:593:120: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:594:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:600:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleNullValue ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:606:2: ( ( (lv_patternProperties0_0_0= ruleNullValue ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:607:2: ( (lv_patternProperties0_0_0= ruleNullValue ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:607:2: ( (lv_patternProperties0_0_0= ruleNullValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:608:3: (lv_patternProperties0_0_0= ruleNullValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:608:3: (lv_patternProperties0_0_0= ruleNullValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:609:4: lv_patternProperties0_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullAccess().getPatternProperties0NullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.NullValue");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:629:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:629:47: (iv_ruleEString= ruleEString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:630:2: iv_ruleEString= ruleEString EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:636:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:642:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:643:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:656:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:656:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:657:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:663:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:669:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:670:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:670:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_E_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_E_DOUBLE) ) {
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:671:3: this_E_INT_0= RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:679:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:690:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:690:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:691:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:697:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:703:2: ( (kw= True | kw= False ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:704:2: (kw= True | kw= False )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:704:2: (kw= True | kw= False )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==True) ) {
                alt9=1;
            }
            else if ( (LA9_0==False) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:705:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:711:3: kw= False
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:720:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:720:119: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:721:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:727:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault returns [EObject current=null] : (otherlv_0= Default otherlv_1= Colon ( (lv_default__2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_default__2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:733:2: ( (otherlv_0= Default otherlv_1= Colon ( (lv_default__2_0= ruleEBooleanObject ) ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:734:2: (otherlv_0= Default otherlv_1= Colon ( (lv_default__2_0= ruleEBooleanObject ) ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:734:2: (otherlv_0= Default otherlv_1= Colon ( (lv_default__2_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:735:3: otherlv_0= Default otherlv_1= Colon ( (lv_default__2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Default,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultAccess().getDefaultKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:743:3: ( (lv_default__2_0= ruleEBooleanObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:744:4: (lv_default__2_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:744:4: (lv_default__2_0= ruleEBooleanObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:745:5: lv_default__2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultAccess().getDefault_EBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_default__2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultRule());
              					}
              					set(
              						current,
              						"default_",
              						lv_default__2_0,
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EBooleanObject");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:766:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:766:132: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:767:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:773:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:779:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:780:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:780:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:781:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:781:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:782:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:782:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:783:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:804:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:805:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:805:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:806:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:827:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:827:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:828:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:834:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:840:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:841:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:841:2: ( (lv_value_0_0= ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:842:3: (lv_value_0_0= ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:842:3: (lv_value_0_0= ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:843:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.Value");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:863:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:863:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:864:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:870:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:876:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:877:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:877:2: ( (lv_value_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:878:3: (lv_value_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:878:3: (lv_value_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:879:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EString");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:899:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:899:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:900:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:906:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:912:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:913:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:913:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:914:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:914:3: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:915:4: 
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
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:925:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Default && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:926:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:926:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:927:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:927:5: (lv_value_2_0= ruleValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:928:6: lv_value_2_0= ruleValue
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
                      							"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:945:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:946:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:950:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:951:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:951:6: (lv_value_4_0= ruleValue )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:952:7: lv_value_4_0= ruleValue
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
                    	      								"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:979:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:979:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:980:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:986:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:992:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:993:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:993:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:994:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:994:3: (lv_value_0_0= ruleNullEnum )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:995:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.NullEnum");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1015:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1015:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1016:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1022:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1028:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1029:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1029:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1030:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1030:3: (lv_value_0_0= ruleEDouble )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1031:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EDouble");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1051:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1051:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1052:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1058:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1064:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1065:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1065:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1066:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1066:3: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1067:4: 
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
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1077:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Default||LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1078:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1078:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1079:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1079:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1080:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1097:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1098:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1102:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1103:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1103:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1104:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.KeyValuePair");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1131:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1131:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1132:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1138:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1144:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1145:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1145:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1146:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1146:3: (lv_value_0_0= ruleEBoolean )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1147:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EBoolean");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1167:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1167:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1168:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1174:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1180:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1181:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1181:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_E_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_E_DOUBLE) ) {
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1182:3: this_E_INT_0= RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1190:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1201:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1201:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1202:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1208:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1214:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1215:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1215:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1216:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1216:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1217:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1217:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1218:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1239:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1240:4: (lv_value_2_0= ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1240:4: (lv_value_2_0= ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1241:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.Value");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1262:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1262:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1263:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1269:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1275:2: ( (kw= True | kw= False ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1276:2: (kw= True | kw= False )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1276:2: (kw= True | kw= False )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==True) ) {
                alt15=1;
            }
            else if ( (LA15_0==False) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1277:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1283:3: kw= False
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1292:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1292:117: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1293:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1299:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1305:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1306:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1306:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1307:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1307:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1308:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1328:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1328:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1329:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1335:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1341:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1342:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1342:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==Default) ) {
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1343:3: this_STRING_0= RULE_STRING
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1351:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1365:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1365:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1366:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1372:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Default ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1378:2: (kw= Default )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1379:2: kw= Default
            {
            kw=(Token)match(input,Default,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDefaultKeyword());
              	
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1387:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1393:2: ( (enumLiteral_0= Null ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1394:2: (enumLiteral_0= Null )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1394:2: (enumLiteral_0= Null )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:1395:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser
    public final void synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:110:4: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:110:5: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser

    // $ANTLR start synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser
    public final void synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:203:4: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser.g:203:5: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser

    // Delegated rules

    public final boolean synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser_fragment(); // can never throw exception
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
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\0\7\uffff";
    static final String dfa_3s = "\1\21\2\0\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_5s = "\1\uffff\1\0\1\1\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
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
            return "108:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_2);
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
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\4\1\11\1\uffff\1\4\7\uffff\2\0\1\uffff";
    static final String dfa_9s = "\1\17\1\11\1\uffff\1\21\7\uffff\2\0\1\uffff";
    static final String dfa_10s = "\2\uffff\1\2\1\uffff\7\2\2\uffff\1\1";
    static final String dfa_11s = "\1\3\2\uffff\1\1\7\uffff\1\0\1\2\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\12\uffff\1\2",
            "\1\3",
            "",
            "\1\5\1\14\1\7\1\13\2\uffff\1\6\1\uffff\1\12\2\uffff\1\4\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "192:2: (this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 13;}

                        else if ( (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser()) ) {s = 10;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_3==RULE_STRING) && (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser())) {s = 4;}

                        else if ( (LA2_3==Default) && (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser())) {s = 5;}

                        else if ( (LA2_3==LeftSquareBracket) && (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser())) {s = 6;}

                        else if ( (LA2_3==Null) && (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser())) {s = 7;}

                        else if ( (LA2_3==RULE_E_INT) && (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser())) {s = 8;}

                        else if ( (LA2_3==RULE_E_DOUBLE) && (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser())) {s = 9;}

                        else if ( (LA2_3==LeftCurlyBracket) && (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser())) {s = 10;}

                        else if ( (LA2_3==True) ) {s = 11;}

                        else if ( (LA2_3==False) ) {s = 12;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_12 = input.LA(1);

                         
                        int index2_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 13;}

                        else if ( (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser()) ) {s = 10;}

                         
                        input.seek(index2_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==Default) ) {s = 1;}

                        else if ( (LA2_0==RULE_STRING) && (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenParser())) {s = 2;}

                         
                        input.seek(index2_0);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000A0L});

}
