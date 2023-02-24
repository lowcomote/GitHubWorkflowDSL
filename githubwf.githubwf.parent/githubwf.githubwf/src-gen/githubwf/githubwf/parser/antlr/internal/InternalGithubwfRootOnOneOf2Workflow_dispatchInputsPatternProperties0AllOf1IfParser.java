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
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Type", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
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
    public static final int Type=4;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;

    // delegates
    // delegators


        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g"; }



     	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess grammarAccess;

        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser(TokenStream input, GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If";
       	}

       	@Override
       	protected GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:58:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:58:110: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:59:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:65:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If() throws RecognitionException {
        EObject current = null;

        EObject lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:71:2: ( ( (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:72:2: ( (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:72:2: ( (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:73:3: (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:73:3: (lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:74:4: lv_patternProperties0_0_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:94:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:94:118: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:95:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:101:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract returns [EObject current=null] : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_1 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_2 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_3 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_4 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_5 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:107:2: ( ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:108:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:108:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:109:3: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:109:3: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:110:4: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:121:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_1=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:130:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_2=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:139:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_3=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:148:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_4=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:157:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_5=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:166:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_6=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_6;
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:178:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:178:128: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:179:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:185:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract returns [EObject current=null] : (this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType_0 = null;

        EObject this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:191:2: ( (this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:192:2: (this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:192:2: (this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Type) ) {
                int LA2_1 = input.LA(2);

                if ( (true) ) {
                    alt2=1;
                }
                else if ( (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser()) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_STRING) && (synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser())) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:193:3: this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:202:3: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:202:3: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:203:4: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_1;
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:217:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:217:46: (iv_ruleValue= ruleValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:218:2: iv_ruleValue= ruleValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:224:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:230:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:231:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:231:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt3=6;
            switch ( input.LA(1) ) {
            case Type:
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:232:3: this_StringValue_0= ruleStringValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:241:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:250:3: this_NullValue_2= ruleNullValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:259:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:268:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:277:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:289:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:289:120: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:290:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:296:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEString ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:302:2: ( ( (lv_patternProperties0_0_0= ruleEString ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:303:2: ( (lv_patternProperties0_0_0= ruleEString ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:303:2: ( (lv_patternProperties0_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:304:3: (lv_patternProperties0_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:304:3: (lv_patternProperties0_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:305:4: lv_patternProperties0_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringAccess().getPatternProperties0EStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.EString");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:325:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:325:121: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:326:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:332:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:338:2: ( ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:339:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:339:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:340:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:340:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:341:4: lv_patternProperties0_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:361:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:361:120: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:362:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:368:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:374:2: ( ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:375:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:375:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:376:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:376:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:377:4: lv_patternProperties0_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:397:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:397:121: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:398:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:404:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:410:2: ( ( (lv_patternProperties0_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:411:2: ( (lv_patternProperties0_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:411:2: ( (lv_patternProperties0_0_0= ruleEBooleanObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:412:3: (lv_patternProperties0_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:412:3: (lv_patternProperties0_0_0= ruleEBooleanObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:413:4: lv_patternProperties0_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.EBooleanObject");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:433:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:433:120: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:434:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:440:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_patternProperties0_2_0 = null;

        EObject lv_patternProperties0_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:446:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:447:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:447:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:448:3: () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:448:3: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:449:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:459:3: ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Type||LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:460:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:460:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:461:5: (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:461:5: (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:462:6: lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_patternProperties0_2_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"patternProperties0",
                      							lv_patternProperties0_2_0,
                      							"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:479:4: (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:480:5: otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:484:5: ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:485:6: (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:485:6: (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:486:7: lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_patternProperties0_4_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"patternProperties0",
                    	      								lv_patternProperties0_4_0,
                    	      								"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract");
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

              			newLeafNode(otherlv_5, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:513:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:513:119: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:514:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:520:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_patternProperties0_2_0 = null;

        EObject lv_patternProperties0_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:526:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:527:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:527:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:528:3: () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:528:3: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:529:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:539:3: ( ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=Type && LA7_0<=True)||LA7_0==LeftSquareBracket||LA7_0==LeftCurlyBracket||(LA7_0>=RULE_STRING && LA7_0<=RULE_E_DOUBLE)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:540:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:540:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:541:5: (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:541:5: (lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:542:6: lv_patternProperties0_2_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_patternProperties0_2_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"patternProperties0",
                      							lv_patternProperties0_2_0,
                      							"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:559:4: (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:560:5: otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:564:5: ( (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:565:6: (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems )
                    	    {
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:565:6: (lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:566:7: lv_patternProperties0_4_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_patternProperties0_4_0=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"patternProperties0",
                    	      								lv_patternProperties0_4_0,
                    	      								"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems");
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

              			newLeafNode(otherlv_5, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:593:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:593:118: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:594:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:600:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleNullValue ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:606:2: ( ( (lv_patternProperties0_0_0= ruleNullValue ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:607:2: ( (lv_patternProperties0_0_0= ruleNullValue ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:607:2: ( (lv_patternProperties0_0_0= ruleNullValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:608:3: (lv_patternProperties0_0_0= ruleNullValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:608:3: (lv_patternProperties0_0_0= ruleNullValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:609:4: lv_patternProperties0_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullAccess().getPatternProperties0NullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.NullValue");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:629:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:629:47: (iv_ruleEString= ruleEString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:630:2: iv_ruleEString= ruleEString EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:636:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:642:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:643:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:656:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:656:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:657:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:663:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:669:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:670:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:670:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:671:3: this_E_INT_0= RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:679:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:690:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:690:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:691:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:697:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:703:2: ( (kw= True | kw= False ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:704:2: (kw= True | kw= False )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:704:2: (kw= True | kw= False )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:705:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:711:3: kw= False
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:720:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:720:114: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:721:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:727:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType returns [EObject current=null] : (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:733:2: ( (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:734:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:734:2: (otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:735:3: otherlv_0= Type otherlv_1= Colon ( (lv_type_2_0= ruleJsonDocument ) )
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getTypeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:743:3: ( (lv_type_2_0= ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:744:4: (lv_type_2_0= ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:744:4: (lv_type_2_0= ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:745:5: lv_type_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getTypeJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:766:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:766:130: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:767:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:773:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:779:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:780:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:780:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:781:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:781:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:782:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:782:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:783:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:804:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:805:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:805:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:806:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:827:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:827:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:828:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:834:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:840:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:841:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:841:2: ( (lv_value_0_0= ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:842:3: (lv_value_0_0= ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:842:3: (lv_value_0_0= ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:843:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.Value");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:863:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:863:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:864:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:870:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:876:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:877:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:877:2: ( (lv_value_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:878:3: (lv_value_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:878:3: (lv_value_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:879:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.EString");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:899:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:899:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:900:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:906:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:912:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:913:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:913:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:914:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:914:3: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:915:4: 
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
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:925:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Type && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:926:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:926:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:927:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:927:5: (lv_value_2_0= ruleValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:928:6: lv_value_2_0= ruleValue
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
                      							"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:945:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:946:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:950:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:951:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:951:6: (lv_value_4_0= ruleValue )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:952:7: lv_value_4_0= ruleValue
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
                    	      								"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.Value");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:979:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:979:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:980:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:986:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:992:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:993:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:993:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:994:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:994:3: (lv_value_0_0= ruleNullEnum )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:995:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.NullEnum");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1015:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1015:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1016:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1022:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1028:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1029:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1029:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1030:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1030:3: (lv_value_0_0= ruleEDouble )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1031:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.EDouble");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1051:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1051:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1052:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1058:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1064:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1065:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1065:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1066:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1066:3: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1067:4: 
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
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1077:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Type||LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1078:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1078:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1079:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1079:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1080:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1097:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1098:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1102:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1103:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1103:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1104:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.KeyValuePair");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1131:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1131:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1132:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1138:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1144:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1145:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1145:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1146:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1146:3: (lv_value_0_0= ruleEBoolean )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1147:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.EBoolean");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1167:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1167:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1168:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1174:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1180:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1181:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1181:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1182:3: this_E_INT_0= RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1190:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1201:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1201:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1202:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1208:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1214:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1215:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1215:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1216:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1216:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1217:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1217:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1218:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1239:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1240:4: (lv_value_2_0= ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1240:4: (lv_value_2_0= ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1241:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.Value");
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1262:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1262:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1263:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1269:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1275:2: ( (kw= True | kw= False ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1276:2: (kw= True | kw= False )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1276:2: (kw= True | kw= False )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1277:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1283:3: kw= False
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1292:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems returns [EObject current=null] : iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems EOF ;
    public final EObject entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1292:115: (iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1293:2: iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems=ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems; 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1299:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1305:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1306:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1306:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1307:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1307:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1308:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1328:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1328:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1329:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1335:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1341:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1342:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1342:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==Type) ) {
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1343:3: this_STRING_0= RULE_STRING
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1351:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1365:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1365:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1366:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1372:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Type ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1378:2: (kw= Type )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1379:2: kw= Type
            {
            kw=(Token)match(input,Type,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword());
              	
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1387:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1393:2: ( (enumLiteral_0= Null ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1394:2: (enumLiteral_0= Null )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1394:2: (enumLiteral_0= Null )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1395:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser
    public final void synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:110:4: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:110:5: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser

    // $ANTLR start synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser
    public final void synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:203:4: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:203:5: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser

    // Delegated rules

    public final boolean synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment(); // can never throw exception
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
            return "108:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )=>this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_0= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_1= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_2= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_3= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_4= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_5= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray | this_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_6= ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull )";
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
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser()) ) {s = 8;}

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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});

}
