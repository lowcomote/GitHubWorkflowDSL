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
import githubwf.githubwf.services.GithubwfRootJobsPatternProperties0OneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGithubwfRootJobsPatternProperties0OneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RepositoryProjects", "SecurityEvents", "PullRequests", "MaxParallel", "Concurrency", "Deployments", "Discussions", "Permissions", "FailFast", "Contents", "IdToken", "Packages", "Statuses", "Strategy", "Actions", "Secrets", "Checks", "Issues", "Matrix", "Needs", "Pages", "Name", "Uses", "With", "False", "If", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=30;
    public static final int PullRequests=6;
    public static final int Secrets=19;
    public static final int Discussions=10;
    public static final int Needs=23;
    public static final int Deployments=9;
    public static final int True=31;
    public static final int False=28;
    public static final int Name=25;
    public static final int Matrix=22;
    public static final int Concurrency=8;
    public static final int Packages=15;
    public static final int Permissions=11;
    public static final int RightSquareBracket=35;
    public static final int RepositoryProjects=4;
    public static final int RULE_ID=42;
    public static final int Actions=18;
    public static final int Pages=24;
    public static final int Contents=13;
    public static final int FailFast=12;
    public static final int Statuses=16;
    public static final int MaxParallel=7;
    public static final int Checks=20;
    public static final int RULE_INT=38;
    public static final int RULE_ML_COMMENT=43;
    public static final int LeftSquareBracket=34;
    public static final int If=29;
    public static final int Uses=26;
    public static final int SecurityEvents=5;
    public static final int Issues=21;
    public static final int RULE_STRING=39;
    public static final int With=27;
    public static final int RULE_SL_COMMENT=44;
    public static final int Comma=32;
    public static final int Colon=33;
    public static final int RightCurlyBracket=37;
    public static final int RULE_E_DOUBLE=41;
    public static final int EOF=-1;
    public static final int IdToken=14;
    public static final int RULE_WS=45;
    public static final int LeftCurlyBracket=36;
    public static final int RULE_E_INT=40;
    public static final int RULE_ANY_OTHER=46;
    public static final int Strategy=17;

    // delegates
    // delegators


        public InternalGithubwfRootJobsPatternProperties0OneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootJobsPatternProperties0OneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootJobsPatternProperties0OneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g"; }



     	private GithubwfRootJobsPatternProperties0OneOf1GrammarAccess grammarAccess;

        public InternalGithubwfRootJobsPatternProperties0OneOf1Parser(TokenStream input, GithubwfRootJobsPatternProperties0OneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GithubwfRootJobsPatternProperties0OneOf1";
       	}

       	@Override
       	protected GithubwfRootJobsPatternProperties0OneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0OneOf1"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:58:1: entryRuleGithubwfRootJobsPatternProperties0OneOf1 returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0OneOf1= ruleGithubwfRootJobsPatternProperties0OneOf1 EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0OneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0OneOf1 = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:58:81: (iv_ruleGithubwfRootJobsPatternProperties0OneOf1= ruleGithubwfRootJobsPatternProperties0OneOf1 EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:59:2: iv_ruleGithubwfRootJobsPatternProperties0OneOf1= ruleGithubwfRootJobsPatternProperties0OneOf1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0OneOf1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0OneOf1=ruleGithubwfRootJobsPatternProperties0OneOf1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0OneOf1; 
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
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0OneOf1"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0OneOf1"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:65:1: ruleGithubwfRootJobsPatternProperties0OneOf1 returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleReusableWorkflowCallJob ) ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0OneOf1() throws RecognitionException {
        EObject current = null;

        EObject lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:71:2: ( ( (lv_patternProperties0_0_0= ruleReusableWorkflowCallJob ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:72:2: ( (lv_patternProperties0_0_0= ruleReusableWorkflowCallJob ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:72:2: ( (lv_patternProperties0_0_0= ruleReusableWorkflowCallJob ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:73:3: (lv_patternProperties0_0_0= ruleReusableWorkflowCallJob )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:73:3: (lv_patternProperties0_0_0= ruleReusableWorkflowCallJob )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:74:4: lv_patternProperties0_0_0= ruleReusableWorkflowCallJob
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0OneOf1Access().getPatternProperties0ReusableWorkflowCallJobParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleReusableWorkflowCallJob();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0OneOf1Rule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJob");
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0OneOf1"


    // $ANTLR start "entryRuleReusableWorkflowCallJobPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:94:1: entryRuleReusableWorkflowCallJobPropertiesAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobPropertiesAbstract= ruleReusableWorkflowCallJobPropertiesAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:94:82: (iv_ruleReusableWorkflowCallJobPropertiesAbstract= ruleReusableWorkflowCallJobPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:95:2: iv_ruleReusableWorkflowCallJobPropertiesAbstract= ruleReusableWorkflowCallJobPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobPropertiesAbstract=ruleReusableWorkflowCallJobPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobPropertiesAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobPropertiesAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:101:1: ruleReusableWorkflowCallJobPropertiesAbstract returns [EObject current=null] : (this_ReusableWorkflowCallJobName_0= ruleReusableWorkflowCallJobName | this_ReusableWorkflowCallJobNeeds_1= ruleReusableWorkflowCallJobNeeds | this_ReusableWorkflowCallJobPermissions_2= ruleReusableWorkflowCallJobPermissions | this_ReusableWorkflowCallJobIf_3= ruleReusableWorkflowCallJobIf | this_ReusableWorkflowCallJobUses_4= ruleReusableWorkflowCallJobUses | this_ReusableWorkflowCallJobWith_5= ruleReusableWorkflowCallJobWith | this_ReusableWorkflowCallJobSecrets_6= ruleReusableWorkflowCallJobSecrets | this_ReusableWorkflowCallJobStrategy_7= ruleReusableWorkflowCallJobStrategy | this_ReusableWorkflowCallJobConcurrency_8= ruleReusableWorkflowCallJobConcurrency ) ;
    public final EObject ruleReusableWorkflowCallJobPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobName_0 = null;

        EObject this_ReusableWorkflowCallJobNeeds_1 = null;

        EObject this_ReusableWorkflowCallJobPermissions_2 = null;

        EObject this_ReusableWorkflowCallJobIf_3 = null;

        EObject this_ReusableWorkflowCallJobUses_4 = null;

        EObject this_ReusableWorkflowCallJobWith_5 = null;

        EObject this_ReusableWorkflowCallJobSecrets_6 = null;

        EObject this_ReusableWorkflowCallJobStrategy_7 = null;

        EObject this_ReusableWorkflowCallJobConcurrency_8 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:107:2: ( (this_ReusableWorkflowCallJobName_0= ruleReusableWorkflowCallJobName | this_ReusableWorkflowCallJobNeeds_1= ruleReusableWorkflowCallJobNeeds | this_ReusableWorkflowCallJobPermissions_2= ruleReusableWorkflowCallJobPermissions | this_ReusableWorkflowCallJobIf_3= ruleReusableWorkflowCallJobIf | this_ReusableWorkflowCallJobUses_4= ruleReusableWorkflowCallJobUses | this_ReusableWorkflowCallJobWith_5= ruleReusableWorkflowCallJobWith | this_ReusableWorkflowCallJobSecrets_6= ruleReusableWorkflowCallJobSecrets | this_ReusableWorkflowCallJobStrategy_7= ruleReusableWorkflowCallJobStrategy | this_ReusableWorkflowCallJobConcurrency_8= ruleReusableWorkflowCallJobConcurrency ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:108:2: (this_ReusableWorkflowCallJobName_0= ruleReusableWorkflowCallJobName | this_ReusableWorkflowCallJobNeeds_1= ruleReusableWorkflowCallJobNeeds | this_ReusableWorkflowCallJobPermissions_2= ruleReusableWorkflowCallJobPermissions | this_ReusableWorkflowCallJobIf_3= ruleReusableWorkflowCallJobIf | this_ReusableWorkflowCallJobUses_4= ruleReusableWorkflowCallJobUses | this_ReusableWorkflowCallJobWith_5= ruleReusableWorkflowCallJobWith | this_ReusableWorkflowCallJobSecrets_6= ruleReusableWorkflowCallJobSecrets | this_ReusableWorkflowCallJobStrategy_7= ruleReusableWorkflowCallJobStrategy | this_ReusableWorkflowCallJobConcurrency_8= ruleReusableWorkflowCallJobConcurrency )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:108:2: (this_ReusableWorkflowCallJobName_0= ruleReusableWorkflowCallJobName | this_ReusableWorkflowCallJobNeeds_1= ruleReusableWorkflowCallJobNeeds | this_ReusableWorkflowCallJobPermissions_2= ruleReusableWorkflowCallJobPermissions | this_ReusableWorkflowCallJobIf_3= ruleReusableWorkflowCallJobIf | this_ReusableWorkflowCallJobUses_4= ruleReusableWorkflowCallJobUses | this_ReusableWorkflowCallJobWith_5= ruleReusableWorkflowCallJobWith | this_ReusableWorkflowCallJobSecrets_6= ruleReusableWorkflowCallJobSecrets | this_ReusableWorkflowCallJobStrategy_7= ruleReusableWorkflowCallJobStrategy | this_ReusableWorkflowCallJobConcurrency_8= ruleReusableWorkflowCallJobConcurrency )
            int alt1=9;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:109:3: this_ReusableWorkflowCallJobName_0= ruleReusableWorkflowCallJobName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractAccess().getReusableWorkflowCallJobNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobName_0=ruleReusableWorkflowCallJobName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobName_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:118:3: this_ReusableWorkflowCallJobNeeds_1= ruleReusableWorkflowCallJobNeeds
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractAccess().getReusableWorkflowCallJobNeedsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobNeeds_1=ruleReusableWorkflowCallJobNeeds();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobNeeds_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:127:3: this_ReusableWorkflowCallJobPermissions_2= ruleReusableWorkflowCallJobPermissions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractAccess().getReusableWorkflowCallJobPermissionsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobPermissions_2=ruleReusableWorkflowCallJobPermissions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobPermissions_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:136:3: this_ReusableWorkflowCallJobIf_3= ruleReusableWorkflowCallJobIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractAccess().getReusableWorkflowCallJobIfParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobIf_3=ruleReusableWorkflowCallJobIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobIf_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:145:3: this_ReusableWorkflowCallJobUses_4= ruleReusableWorkflowCallJobUses
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractAccess().getReusableWorkflowCallJobUsesParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobUses_4=ruleReusableWorkflowCallJobUses();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobUses_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:154:3: this_ReusableWorkflowCallJobWith_5= ruleReusableWorkflowCallJobWith
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractAccess().getReusableWorkflowCallJobWithParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobWith_5=ruleReusableWorkflowCallJobWith();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobWith_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:163:3: this_ReusableWorkflowCallJobSecrets_6= ruleReusableWorkflowCallJobSecrets
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractAccess().getReusableWorkflowCallJobSecretsParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobSecrets_6=ruleReusableWorkflowCallJobSecrets();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobSecrets_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:172:3: this_ReusableWorkflowCallJobStrategy_7= ruleReusableWorkflowCallJobStrategy
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategy_7=ruleReusableWorkflowCallJobStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategy_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:181:3: this_ReusableWorkflowCallJobConcurrency_8= ruleReusableWorkflowCallJobConcurrency
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobPropertiesAbstractAccess().getReusableWorkflowCallJobConcurrencyParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobConcurrency_8=ruleReusableWorkflowCallJobConcurrency();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobConcurrency_8;
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
    // $ANTLR end "ruleReusableWorkflowCallJobPropertiesAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobIfAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:193:1: entryRuleReusableWorkflowCallJobIfAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobIfAbstract= ruleReusableWorkflowCallJobIfAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobIfAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobIfAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:193:74: (iv_ruleReusableWorkflowCallJobIfAbstract= ruleReusableWorkflowCallJobIfAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:194:2: iv_ruleReusableWorkflowCallJobIfAbstract= ruleReusableWorkflowCallJobIfAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobIfAbstract=ruleReusableWorkflowCallJobIfAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobIfAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobIfAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobIfAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:200:1: ruleReusableWorkflowCallJobIfAbstract returns [EObject current=null] : ( ( ( ruleReusableWorkflowCallJobIfTypeNumber )=>this_ReusableWorkflowCallJobIfTypeNumber_0= ruleReusableWorkflowCallJobIfTypeNumber ) | this_ReusableWorkflowCallJobIfTypeBoolean_1= ruleReusableWorkflowCallJobIfTypeBoolean | this_ReusableWorkflowCallJobIfTypeString_2= ruleReusableWorkflowCallJobIfTypeString ) ;
    public final EObject ruleReusableWorkflowCallJobIfAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobIfTypeNumber_0 = null;

        EObject this_ReusableWorkflowCallJobIfTypeBoolean_1 = null;

        EObject this_ReusableWorkflowCallJobIfTypeString_2 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:206:2: ( ( ( ( ruleReusableWorkflowCallJobIfTypeNumber )=>this_ReusableWorkflowCallJobIfTypeNumber_0= ruleReusableWorkflowCallJobIfTypeNumber ) | this_ReusableWorkflowCallJobIfTypeBoolean_1= ruleReusableWorkflowCallJobIfTypeBoolean | this_ReusableWorkflowCallJobIfTypeString_2= ruleReusableWorkflowCallJobIfTypeString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:207:2: ( ( ( ruleReusableWorkflowCallJobIfTypeNumber )=>this_ReusableWorkflowCallJobIfTypeNumber_0= ruleReusableWorkflowCallJobIfTypeNumber ) | this_ReusableWorkflowCallJobIfTypeBoolean_1= ruleReusableWorkflowCallJobIfTypeBoolean | this_ReusableWorkflowCallJobIfTypeString_2= ruleReusableWorkflowCallJobIfTypeString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:207:2: ( ( ( ruleReusableWorkflowCallJobIfTypeNumber )=>this_ReusableWorkflowCallJobIfTypeNumber_0= ruleReusableWorkflowCallJobIfTypeNumber ) | this_ReusableWorkflowCallJobIfTypeBoolean_1= ruleReusableWorkflowCallJobIfTypeBoolean | this_ReusableWorkflowCallJobIfTypeString_2= ruleReusableWorkflowCallJobIfTypeString )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==If) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==Colon) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==False||LA2_2==True) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_2>=RepositoryProjects && LA2_2<=With)||LA2_2==If||LA2_2==RULE_STRING) ) {
                        alt2=3;
                    }
                    else if ( (LA2_2==RULE_E_INT) && (synpred1_InternalGithubwfRootJobsPatternProperties0OneOf1Parser())) {
                        alt2=1;
                    }
                    else if ( (LA2_2==RULE_E_DOUBLE) && (synpred1_InternalGithubwfRootJobsPatternProperties0OneOf1Parser())) {
                        alt2=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:208:3: ( ( ruleReusableWorkflowCallJobIfTypeNumber )=>this_ReusableWorkflowCallJobIfTypeNumber_0= ruleReusableWorkflowCallJobIfTypeNumber )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:208:3: ( ( ruleReusableWorkflowCallJobIfTypeNumber )=>this_ReusableWorkflowCallJobIfTypeNumber_0= ruleReusableWorkflowCallJobIfTypeNumber )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:209:4: ( ruleReusableWorkflowCallJobIfTypeNumber )=>this_ReusableWorkflowCallJobIfTypeNumber_0= ruleReusableWorkflowCallJobIfTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfAbstractAccess().getReusableWorkflowCallJobIfTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobIfTypeNumber_0=ruleReusableWorkflowCallJobIfTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReusableWorkflowCallJobIfTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:220:3: this_ReusableWorkflowCallJobIfTypeBoolean_1= ruleReusableWorkflowCallJobIfTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfAbstractAccess().getReusableWorkflowCallJobIfTypeBooleanParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobIfTypeBoolean_1=ruleReusableWorkflowCallJobIfTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobIfTypeBoolean_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:229:3: this_ReusableWorkflowCallJobIfTypeString_2= ruleReusableWorkflowCallJobIfTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfAbstractAccess().getReusableWorkflowCallJobIfTypeStringParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobIfTypeString_2=ruleReusableWorkflowCallJobIfTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobIfTypeString_2;
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
    // $ANTLR end "ruleReusableWorkflowCallJobIfAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:241:1: entryRuleReusableWorkflowCallJobSecretsAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsAbstract= ruleReusableWorkflowCallJobSecretsAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:241:79: (iv_ruleReusableWorkflowCallJobSecretsAbstract= ruleReusableWorkflowCallJobSecretsAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:242:2: iv_ruleReusableWorkflowCallJobSecretsAbstract= ruleReusableWorkflowCallJobSecretsAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsAbstract=ruleReusableWorkflowCallJobSecretsAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:248:1: ruleReusableWorkflowCallJobSecretsAbstract returns [EObject current=null] : ( ( ( ruleReusableWorkflowCallJobSecretsTypeNumber )=>this_ReusableWorkflowCallJobSecretsTypeNumber_0= ruleReusableWorkflowCallJobSecretsTypeNumber ) | this_ReusableWorkflowCallJobSecretsTypeString_1= ruleReusableWorkflowCallJobSecretsTypeString | this_ReusableWorkflowCallJobSecretsTypeInteger_2= ruleReusableWorkflowCallJobSecretsTypeInteger | this_ReusableWorkflowCallJobSecretsTypeBoolean_3= ruleReusableWorkflowCallJobSecretsTypeBoolean | this_ReusableWorkflowCallJobSecretsTypeObject_4= ruleReusableWorkflowCallJobSecretsTypeObject | this_ReusableWorkflowCallJobSecretsTypeArray_5= ruleReusableWorkflowCallJobSecretsTypeArray | this_ReusableWorkflowCallJobSecretsTypeNull_6= ruleReusableWorkflowCallJobSecretsTypeNull ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobSecretsTypeNumber_0 = null;

        EObject this_ReusableWorkflowCallJobSecretsTypeString_1 = null;

        EObject this_ReusableWorkflowCallJobSecretsTypeInteger_2 = null;

        EObject this_ReusableWorkflowCallJobSecretsTypeBoolean_3 = null;

        EObject this_ReusableWorkflowCallJobSecretsTypeObject_4 = null;

        EObject this_ReusableWorkflowCallJobSecretsTypeArray_5 = null;

        EObject this_ReusableWorkflowCallJobSecretsTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:254:2: ( ( ( ( ruleReusableWorkflowCallJobSecretsTypeNumber )=>this_ReusableWorkflowCallJobSecretsTypeNumber_0= ruleReusableWorkflowCallJobSecretsTypeNumber ) | this_ReusableWorkflowCallJobSecretsTypeString_1= ruleReusableWorkflowCallJobSecretsTypeString | this_ReusableWorkflowCallJobSecretsTypeInteger_2= ruleReusableWorkflowCallJobSecretsTypeInteger | this_ReusableWorkflowCallJobSecretsTypeBoolean_3= ruleReusableWorkflowCallJobSecretsTypeBoolean | this_ReusableWorkflowCallJobSecretsTypeObject_4= ruleReusableWorkflowCallJobSecretsTypeObject | this_ReusableWorkflowCallJobSecretsTypeArray_5= ruleReusableWorkflowCallJobSecretsTypeArray | this_ReusableWorkflowCallJobSecretsTypeNull_6= ruleReusableWorkflowCallJobSecretsTypeNull ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:255:2: ( ( ( ruleReusableWorkflowCallJobSecretsTypeNumber )=>this_ReusableWorkflowCallJobSecretsTypeNumber_0= ruleReusableWorkflowCallJobSecretsTypeNumber ) | this_ReusableWorkflowCallJobSecretsTypeString_1= ruleReusableWorkflowCallJobSecretsTypeString | this_ReusableWorkflowCallJobSecretsTypeInteger_2= ruleReusableWorkflowCallJobSecretsTypeInteger | this_ReusableWorkflowCallJobSecretsTypeBoolean_3= ruleReusableWorkflowCallJobSecretsTypeBoolean | this_ReusableWorkflowCallJobSecretsTypeObject_4= ruleReusableWorkflowCallJobSecretsTypeObject | this_ReusableWorkflowCallJobSecretsTypeArray_5= ruleReusableWorkflowCallJobSecretsTypeArray | this_ReusableWorkflowCallJobSecretsTypeNull_6= ruleReusableWorkflowCallJobSecretsTypeNull )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:255:2: ( ( ( ruleReusableWorkflowCallJobSecretsTypeNumber )=>this_ReusableWorkflowCallJobSecretsTypeNumber_0= ruleReusableWorkflowCallJobSecretsTypeNumber ) | this_ReusableWorkflowCallJobSecretsTypeString_1= ruleReusableWorkflowCallJobSecretsTypeString | this_ReusableWorkflowCallJobSecretsTypeInteger_2= ruleReusableWorkflowCallJobSecretsTypeInteger | this_ReusableWorkflowCallJobSecretsTypeBoolean_3= ruleReusableWorkflowCallJobSecretsTypeBoolean | this_ReusableWorkflowCallJobSecretsTypeObject_4= ruleReusableWorkflowCallJobSecretsTypeObject | this_ReusableWorkflowCallJobSecretsTypeArray_5= ruleReusableWorkflowCallJobSecretsTypeArray | this_ReusableWorkflowCallJobSecretsTypeNull_6= ruleReusableWorkflowCallJobSecretsTypeNull )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:256:3: ( ( ruleReusableWorkflowCallJobSecretsTypeNumber )=>this_ReusableWorkflowCallJobSecretsTypeNumber_0= ruleReusableWorkflowCallJobSecretsTypeNumber )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:256:3: ( ( ruleReusableWorkflowCallJobSecretsTypeNumber )=>this_ReusableWorkflowCallJobSecretsTypeNumber_0= ruleReusableWorkflowCallJobSecretsTypeNumber )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:257:4: ( ruleReusableWorkflowCallJobSecretsTypeNumber )=>this_ReusableWorkflowCallJobSecretsTypeNumber_0= ruleReusableWorkflowCallJobSecretsTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAbstractAccess().getReusableWorkflowCallJobSecretsTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobSecretsTypeNumber_0=ruleReusableWorkflowCallJobSecretsTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReusableWorkflowCallJobSecretsTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:268:3: this_ReusableWorkflowCallJobSecretsTypeString_1= ruleReusableWorkflowCallJobSecretsTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAbstractAccess().getReusableWorkflowCallJobSecretsTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobSecretsTypeString_1=ruleReusableWorkflowCallJobSecretsTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobSecretsTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:277:3: this_ReusableWorkflowCallJobSecretsTypeInteger_2= ruleReusableWorkflowCallJobSecretsTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAbstractAccess().getReusableWorkflowCallJobSecretsTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobSecretsTypeInteger_2=ruleReusableWorkflowCallJobSecretsTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobSecretsTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:286:3: this_ReusableWorkflowCallJobSecretsTypeBoolean_3= ruleReusableWorkflowCallJobSecretsTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAbstractAccess().getReusableWorkflowCallJobSecretsTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobSecretsTypeBoolean_3=ruleReusableWorkflowCallJobSecretsTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobSecretsTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:295:3: this_ReusableWorkflowCallJobSecretsTypeObject_4= ruleReusableWorkflowCallJobSecretsTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAbstractAccess().getReusableWorkflowCallJobSecretsTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobSecretsTypeObject_4=ruleReusableWorkflowCallJobSecretsTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobSecretsTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:304:3: this_ReusableWorkflowCallJobSecretsTypeArray_5= ruleReusableWorkflowCallJobSecretsTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAbstractAccess().getReusableWorkflowCallJobSecretsTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobSecretsTypeArray_5=ruleReusableWorkflowCallJobSecretsTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobSecretsTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:313:3: this_ReusableWorkflowCallJobSecretsTypeNull_6= ruleReusableWorkflowCallJobSecretsTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAbstractAccess().getReusableWorkflowCallJobSecretsTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobSecretsTypeNull_6=ruleReusableWorkflowCallJobSecretsTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobSecretsTypeNull_6;
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:325:1: entryRuleReusableWorkflowCallJobStrategyPropertiesAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyPropertiesAbstract= ruleReusableWorkflowCallJobStrategyPropertiesAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:325:90: (iv_ruleReusableWorkflowCallJobStrategyPropertiesAbstract= ruleReusableWorkflowCallJobStrategyPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:326:2: iv_ruleReusableWorkflowCallJobStrategyPropertiesAbstract= ruleReusableWorkflowCallJobStrategyPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyPropertiesAbstract=ruleReusableWorkflowCallJobStrategyPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyPropertiesAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyPropertiesAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:332:1: ruleReusableWorkflowCallJobStrategyPropertiesAbstract returns [EObject current=null] : (this_ReusableWorkflowCallJobStrategyMatrix_0= ruleReusableWorkflowCallJobStrategyMatrix | this_ReusableWorkflowCallJobStrategyFail_45fast_1= ruleReusableWorkflowCallJobStrategyFail_45fast | this_ReusableWorkflowCallJobStrategyMax_45parallel_2= ruleReusableWorkflowCallJobStrategyMax_45parallel ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrix_0 = null;

        EObject this_ReusableWorkflowCallJobStrategyFail_45fast_1 = null;

        EObject this_ReusableWorkflowCallJobStrategyMax_45parallel_2 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:338:2: ( (this_ReusableWorkflowCallJobStrategyMatrix_0= ruleReusableWorkflowCallJobStrategyMatrix | this_ReusableWorkflowCallJobStrategyFail_45fast_1= ruleReusableWorkflowCallJobStrategyFail_45fast | this_ReusableWorkflowCallJobStrategyMax_45parallel_2= ruleReusableWorkflowCallJobStrategyMax_45parallel ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:339:2: (this_ReusableWorkflowCallJobStrategyMatrix_0= ruleReusableWorkflowCallJobStrategyMatrix | this_ReusableWorkflowCallJobStrategyFail_45fast_1= ruleReusableWorkflowCallJobStrategyFail_45fast | this_ReusableWorkflowCallJobStrategyMax_45parallel_2= ruleReusableWorkflowCallJobStrategyMax_45parallel )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:339:2: (this_ReusableWorkflowCallJobStrategyMatrix_0= ruleReusableWorkflowCallJobStrategyMatrix | this_ReusableWorkflowCallJobStrategyFail_45fast_1= ruleReusableWorkflowCallJobStrategyFail_45fast | this_ReusableWorkflowCallJobStrategyMax_45parallel_2= ruleReusableWorkflowCallJobStrategyMax_45parallel )
            int alt4=3;
            switch ( input.LA(1) ) {
            case Matrix:
                {
                alt4=1;
                }
                break;
            case FailFast:
                {
                alt4=2;
                }
                break;
            case MaxParallel:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:340:3: this_ReusableWorkflowCallJobStrategyMatrix_0= ruleReusableWorkflowCallJobStrategyMatrix
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrix_0=ruleReusableWorkflowCallJobStrategyMatrix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrix_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:349:3: this_ReusableWorkflowCallJobStrategyFail_45fast_1= ruleReusableWorkflowCallJobStrategyFail_45fast
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyFail_45fastParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyFail_45fast_1=ruleReusableWorkflowCallJobStrategyFail_45fast();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyFail_45fast_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:358:3: this_ReusableWorkflowCallJobStrategyMax_45parallel_2= ruleReusableWorkflowCallJobStrategyMax_45parallel
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMax_45parallelParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMax_45parallel_2=ruleReusableWorkflowCallJobStrategyMax_45parallel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMax_45parallel_2;
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyPropertiesAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:370:1: entryRuleReusableWorkflowCallJobConcurrencyAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyAbstract= ruleReusableWorkflowCallJobConcurrencyAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:370:83: (iv_ruleReusableWorkflowCallJobConcurrencyAbstract= ruleReusableWorkflowCallJobConcurrencyAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:371:2: iv_ruleReusableWorkflowCallJobConcurrencyAbstract= ruleReusableWorkflowCallJobConcurrencyAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyAbstract=ruleReusableWorkflowCallJobConcurrencyAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:377:1: ruleReusableWorkflowCallJobConcurrencyAbstract returns [EObject current=null] : ( ( ( ruleReusableWorkflowCallJobConcurrencyTypeNumber )=>this_ReusableWorkflowCallJobConcurrencyTypeNumber_0= ruleReusableWorkflowCallJobConcurrencyTypeNumber ) | this_ReusableWorkflowCallJobConcurrencyTypeString_1= ruleReusableWorkflowCallJobConcurrencyTypeString | this_ReusableWorkflowCallJobConcurrencyTypeInteger_2= ruleReusableWorkflowCallJobConcurrencyTypeInteger | this_ReusableWorkflowCallJobConcurrencyTypeBoolean_3= ruleReusableWorkflowCallJobConcurrencyTypeBoolean | this_ReusableWorkflowCallJobConcurrencyTypeObject_4= ruleReusableWorkflowCallJobConcurrencyTypeObject | this_ReusableWorkflowCallJobConcurrencyTypeArray_5= ruleReusableWorkflowCallJobConcurrencyTypeArray | this_ReusableWorkflowCallJobConcurrencyTypeNull_6= ruleReusableWorkflowCallJobConcurrencyTypeNull ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobConcurrencyTypeNumber_0 = null;

        EObject this_ReusableWorkflowCallJobConcurrencyTypeString_1 = null;

        EObject this_ReusableWorkflowCallJobConcurrencyTypeInteger_2 = null;

        EObject this_ReusableWorkflowCallJobConcurrencyTypeBoolean_3 = null;

        EObject this_ReusableWorkflowCallJobConcurrencyTypeObject_4 = null;

        EObject this_ReusableWorkflowCallJobConcurrencyTypeArray_5 = null;

        EObject this_ReusableWorkflowCallJobConcurrencyTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:383:2: ( ( ( ( ruleReusableWorkflowCallJobConcurrencyTypeNumber )=>this_ReusableWorkflowCallJobConcurrencyTypeNumber_0= ruleReusableWorkflowCallJobConcurrencyTypeNumber ) | this_ReusableWorkflowCallJobConcurrencyTypeString_1= ruleReusableWorkflowCallJobConcurrencyTypeString | this_ReusableWorkflowCallJobConcurrencyTypeInteger_2= ruleReusableWorkflowCallJobConcurrencyTypeInteger | this_ReusableWorkflowCallJobConcurrencyTypeBoolean_3= ruleReusableWorkflowCallJobConcurrencyTypeBoolean | this_ReusableWorkflowCallJobConcurrencyTypeObject_4= ruleReusableWorkflowCallJobConcurrencyTypeObject | this_ReusableWorkflowCallJobConcurrencyTypeArray_5= ruleReusableWorkflowCallJobConcurrencyTypeArray | this_ReusableWorkflowCallJobConcurrencyTypeNull_6= ruleReusableWorkflowCallJobConcurrencyTypeNull ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:384:2: ( ( ( ruleReusableWorkflowCallJobConcurrencyTypeNumber )=>this_ReusableWorkflowCallJobConcurrencyTypeNumber_0= ruleReusableWorkflowCallJobConcurrencyTypeNumber ) | this_ReusableWorkflowCallJobConcurrencyTypeString_1= ruleReusableWorkflowCallJobConcurrencyTypeString | this_ReusableWorkflowCallJobConcurrencyTypeInteger_2= ruleReusableWorkflowCallJobConcurrencyTypeInteger | this_ReusableWorkflowCallJobConcurrencyTypeBoolean_3= ruleReusableWorkflowCallJobConcurrencyTypeBoolean | this_ReusableWorkflowCallJobConcurrencyTypeObject_4= ruleReusableWorkflowCallJobConcurrencyTypeObject | this_ReusableWorkflowCallJobConcurrencyTypeArray_5= ruleReusableWorkflowCallJobConcurrencyTypeArray | this_ReusableWorkflowCallJobConcurrencyTypeNull_6= ruleReusableWorkflowCallJobConcurrencyTypeNull )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:384:2: ( ( ( ruleReusableWorkflowCallJobConcurrencyTypeNumber )=>this_ReusableWorkflowCallJobConcurrencyTypeNumber_0= ruleReusableWorkflowCallJobConcurrencyTypeNumber ) | this_ReusableWorkflowCallJobConcurrencyTypeString_1= ruleReusableWorkflowCallJobConcurrencyTypeString | this_ReusableWorkflowCallJobConcurrencyTypeInteger_2= ruleReusableWorkflowCallJobConcurrencyTypeInteger | this_ReusableWorkflowCallJobConcurrencyTypeBoolean_3= ruleReusableWorkflowCallJobConcurrencyTypeBoolean | this_ReusableWorkflowCallJobConcurrencyTypeObject_4= ruleReusableWorkflowCallJobConcurrencyTypeObject | this_ReusableWorkflowCallJobConcurrencyTypeArray_5= ruleReusableWorkflowCallJobConcurrencyTypeArray | this_ReusableWorkflowCallJobConcurrencyTypeNull_6= ruleReusableWorkflowCallJobConcurrencyTypeNull )
            int alt5=7;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:385:3: ( ( ruleReusableWorkflowCallJobConcurrencyTypeNumber )=>this_ReusableWorkflowCallJobConcurrencyTypeNumber_0= ruleReusableWorkflowCallJobConcurrencyTypeNumber )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:385:3: ( ( ruleReusableWorkflowCallJobConcurrencyTypeNumber )=>this_ReusableWorkflowCallJobConcurrencyTypeNumber_0= ruleReusableWorkflowCallJobConcurrencyTypeNumber )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:386:4: ( ruleReusableWorkflowCallJobConcurrencyTypeNumber )=>this_ReusableWorkflowCallJobConcurrencyTypeNumber_0= ruleReusableWorkflowCallJobConcurrencyTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAbstractAccess().getReusableWorkflowCallJobConcurrencyTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobConcurrencyTypeNumber_0=ruleReusableWorkflowCallJobConcurrencyTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReusableWorkflowCallJobConcurrencyTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:397:3: this_ReusableWorkflowCallJobConcurrencyTypeString_1= ruleReusableWorkflowCallJobConcurrencyTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAbstractAccess().getReusableWorkflowCallJobConcurrencyTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobConcurrencyTypeString_1=ruleReusableWorkflowCallJobConcurrencyTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobConcurrencyTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:406:3: this_ReusableWorkflowCallJobConcurrencyTypeInteger_2= ruleReusableWorkflowCallJobConcurrencyTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAbstractAccess().getReusableWorkflowCallJobConcurrencyTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobConcurrencyTypeInteger_2=ruleReusableWorkflowCallJobConcurrencyTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobConcurrencyTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:415:3: this_ReusableWorkflowCallJobConcurrencyTypeBoolean_3= ruleReusableWorkflowCallJobConcurrencyTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAbstractAccess().getReusableWorkflowCallJobConcurrencyTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobConcurrencyTypeBoolean_3=ruleReusableWorkflowCallJobConcurrencyTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobConcurrencyTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:424:3: this_ReusableWorkflowCallJobConcurrencyTypeObject_4= ruleReusableWorkflowCallJobConcurrencyTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAbstractAccess().getReusableWorkflowCallJobConcurrencyTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobConcurrencyTypeObject_4=ruleReusableWorkflowCallJobConcurrencyTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobConcurrencyTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:433:3: this_ReusableWorkflowCallJobConcurrencyTypeArray_5= ruleReusableWorkflowCallJobConcurrencyTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAbstractAccess().getReusableWorkflowCallJobConcurrencyTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobConcurrencyTypeArray_5=ruleReusableWorkflowCallJobConcurrencyTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobConcurrencyTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:442:3: this_ReusableWorkflowCallJobConcurrencyTypeNull_6= ruleReusableWorkflowCallJobConcurrencyTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAbstractAccess().getReusableWorkflowCallJobConcurrencyTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobConcurrencyTypeNull_6=ruleReusableWorkflowCallJobConcurrencyTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobConcurrencyTypeNull_6;
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyAbstract"


    // $ANTLR start "entryRuleJobNeedsAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:454:1: entryRuleJobNeedsAbstract returns [EObject current=null] : iv_ruleJobNeedsAbstract= ruleJobNeedsAbstract EOF ;
    public final EObject entryRuleJobNeedsAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:454:57: (iv_ruleJobNeedsAbstract= ruleJobNeedsAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:455:2: iv_ruleJobNeedsAbstract= ruleJobNeedsAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsAbstract=ruleJobNeedsAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsAbstract; 
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
    // $ANTLR end "entryRuleJobNeedsAbstract"


    // $ANTLR start "ruleJobNeedsAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:461:1: ruleJobNeedsAbstract returns [EObject current=null] : ( ( ( ruleJobNeedsTypeNumber )=>this_JobNeedsTypeNumber_0= ruleJobNeedsTypeNumber ) | this_JobNeedsTypeString_1= ruleJobNeedsTypeString | this_JobNeedsTypeInteger_2= ruleJobNeedsTypeInteger | this_JobNeedsTypeBoolean_3= ruleJobNeedsTypeBoolean | this_JobNeedsTypeObject_4= ruleJobNeedsTypeObject | this_JobNeedsTypeArray_5= ruleJobNeedsTypeArray | this_JobNeedsTypeNull_6= ruleJobNeedsTypeNull ) ;
    public final EObject ruleJobNeedsAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_JobNeedsTypeNumber_0 = null;

        EObject this_JobNeedsTypeString_1 = null;

        EObject this_JobNeedsTypeInteger_2 = null;

        EObject this_JobNeedsTypeBoolean_3 = null;

        EObject this_JobNeedsTypeObject_4 = null;

        EObject this_JobNeedsTypeArray_5 = null;

        EObject this_JobNeedsTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:467:2: ( ( ( ( ruleJobNeedsTypeNumber )=>this_JobNeedsTypeNumber_0= ruleJobNeedsTypeNumber ) | this_JobNeedsTypeString_1= ruleJobNeedsTypeString | this_JobNeedsTypeInteger_2= ruleJobNeedsTypeInteger | this_JobNeedsTypeBoolean_3= ruleJobNeedsTypeBoolean | this_JobNeedsTypeObject_4= ruleJobNeedsTypeObject | this_JobNeedsTypeArray_5= ruleJobNeedsTypeArray | this_JobNeedsTypeNull_6= ruleJobNeedsTypeNull ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:468:2: ( ( ( ruleJobNeedsTypeNumber )=>this_JobNeedsTypeNumber_0= ruleJobNeedsTypeNumber ) | this_JobNeedsTypeString_1= ruleJobNeedsTypeString | this_JobNeedsTypeInteger_2= ruleJobNeedsTypeInteger | this_JobNeedsTypeBoolean_3= ruleJobNeedsTypeBoolean | this_JobNeedsTypeObject_4= ruleJobNeedsTypeObject | this_JobNeedsTypeArray_5= ruleJobNeedsTypeArray | this_JobNeedsTypeNull_6= ruleJobNeedsTypeNull )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:468:2: ( ( ( ruleJobNeedsTypeNumber )=>this_JobNeedsTypeNumber_0= ruleJobNeedsTypeNumber ) | this_JobNeedsTypeString_1= ruleJobNeedsTypeString | this_JobNeedsTypeInteger_2= ruleJobNeedsTypeInteger | this_JobNeedsTypeBoolean_3= ruleJobNeedsTypeBoolean | this_JobNeedsTypeObject_4= ruleJobNeedsTypeObject | this_JobNeedsTypeArray_5= ruleJobNeedsTypeArray | this_JobNeedsTypeNull_6= ruleJobNeedsTypeNull )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:469:3: ( ( ruleJobNeedsTypeNumber )=>this_JobNeedsTypeNumber_0= ruleJobNeedsTypeNumber )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:469:3: ( ( ruleJobNeedsTypeNumber )=>this_JobNeedsTypeNumber_0= ruleJobNeedsTypeNumber )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:470:4: ( ruleJobNeedsTypeNumber )=>this_JobNeedsTypeNumber_0= ruleJobNeedsTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getJobNeedsAbstractAccess().getJobNeedsTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_JobNeedsTypeNumber_0=ruleJobNeedsTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_JobNeedsTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:481:3: this_JobNeedsTypeString_1= ruleJobNeedsTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJobNeedsAbstractAccess().getJobNeedsTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JobNeedsTypeString_1=ruleJobNeedsTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JobNeedsTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:490:3: this_JobNeedsTypeInteger_2= ruleJobNeedsTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJobNeedsAbstractAccess().getJobNeedsTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JobNeedsTypeInteger_2=ruleJobNeedsTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JobNeedsTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:499:3: this_JobNeedsTypeBoolean_3= ruleJobNeedsTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJobNeedsAbstractAccess().getJobNeedsTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JobNeedsTypeBoolean_3=ruleJobNeedsTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JobNeedsTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:508:3: this_JobNeedsTypeObject_4= ruleJobNeedsTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJobNeedsAbstractAccess().getJobNeedsTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JobNeedsTypeObject_4=ruleJobNeedsTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JobNeedsTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:517:3: this_JobNeedsTypeArray_5= ruleJobNeedsTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJobNeedsAbstractAccess().getJobNeedsTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JobNeedsTypeArray_5=ruleJobNeedsTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JobNeedsTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:526:3: this_JobNeedsTypeNull_6= ruleJobNeedsTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJobNeedsAbstractAccess().getJobNeedsTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JobNeedsTypeNull_6=ruleJobNeedsTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JobNeedsTypeNull_6;
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
    // $ANTLR end "ruleJobNeedsAbstract"


    // $ANTLR start "entryRuleJobNeedsPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:538:1: entryRuleJobNeedsPropertiesAbstract returns [EObject current=null] : iv_ruleJobNeedsPropertiesAbstract= ruleJobNeedsPropertiesAbstract EOF ;
    public final EObject entryRuleJobNeedsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:538:67: (iv_ruleJobNeedsPropertiesAbstract= ruleJobNeedsPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:539:2: iv_ruleJobNeedsPropertiesAbstract= ruleJobNeedsPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsPropertiesAbstract=ruleJobNeedsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleJobNeedsPropertiesAbstract"


    // $ANTLR start "ruleJobNeedsPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:545:1: ruleJobNeedsPropertiesAbstract returns [EObject current=null] : ( ( ruleJobNeedsAdditionalProperties )=>this_JobNeedsAdditionalProperties_0= ruleJobNeedsAdditionalProperties ) ;
    public final EObject ruleJobNeedsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_JobNeedsAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:551:2: ( ( ( ruleJobNeedsAdditionalProperties )=>this_JobNeedsAdditionalProperties_0= ruleJobNeedsAdditionalProperties ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:552:2: ( ( ruleJobNeedsAdditionalProperties )=>this_JobNeedsAdditionalProperties_0= ruleJobNeedsAdditionalProperties )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:552:2: ( ( ruleJobNeedsAdditionalProperties )=>this_JobNeedsAdditionalProperties_0= ruleJobNeedsAdditionalProperties )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:553:3: ( ruleJobNeedsAdditionalProperties )=>this_JobNeedsAdditionalProperties_0= ruleJobNeedsAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getJobNeedsPropertiesAbstractAccess().getJobNeedsAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_JobNeedsAdditionalProperties_0=ruleJobNeedsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_JobNeedsAdditionalProperties_0;
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
    // $ANTLR end "ruleJobNeedsPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:566:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:566:46: (iv_ruleValue= ruleValue EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:567:2: iv_ruleValue= ruleValue EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:573:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:579:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:580:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:580:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RepositoryProjects:
            case SecurityEvents:
            case PullRequests:
            case MaxParallel:
            case Concurrency:
            case Deployments:
            case Discussions:
            case Permissions:
            case FailFast:
            case Contents:
            case IdToken:
            case Packages:
            case Statuses:
            case Strategy:
            case Actions:
            case Secrets:
            case Checks:
            case Issues:
            case Matrix:
            case Needs:
            case Pages:
            case Name:
            case Uses:
            case With:
            case If:
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt7=2;
                }
                break;
            case Null:
                {
                alt7=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt7=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt7=5;
                }
                break;
            case False:
            case True:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:581:3: this_StringValue_0= ruleStringValue
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
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:590:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:599:3: this_NullValue_2= ruleNullValue
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
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:608:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:617:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:626:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRulePermissions_45eventPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:638:1: entryRulePermissions_45eventPropertiesAbstract returns [EObject current=null] : iv_rulePermissions_45eventPropertiesAbstract= rulePermissions_45eventPropertiesAbstract EOF ;
    public final EObject entryRulePermissions_45eventPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:638:78: (iv_rulePermissions_45eventPropertiesAbstract= rulePermissions_45eventPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:639:2: iv_rulePermissions_45eventPropertiesAbstract= rulePermissions_45eventPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventPropertiesAbstract=rulePermissions_45eventPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventPropertiesAbstract; 
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
    // $ANTLR end "entryRulePermissions_45eventPropertiesAbstract"


    // $ANTLR start "rulePermissions_45eventPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:645:1: rulePermissions_45eventPropertiesAbstract returns [EObject current=null] : (this_Permissions_45eventActions_0= rulePermissions_45eventActions | this_Permissions_45eventChecks_1= rulePermissions_45eventChecks | this_Permissions_45eventContents_2= rulePermissions_45eventContents | this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments | this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions | this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token | this_Permissions_45eventIssues_6= rulePermissions_45eventIssues | this_Permissions_45eventPackages_7= rulePermissions_45eventPackages | this_Permissions_45eventPages_8= rulePermissions_45eventPages | this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests | this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects | this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events | this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses ) ;
    public final EObject rulePermissions_45eventPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_Permissions_45eventActions_0 = null;

        EObject this_Permissions_45eventChecks_1 = null;

        EObject this_Permissions_45eventContents_2 = null;

        EObject this_Permissions_45eventDeployments_3 = null;

        EObject this_Permissions_45eventDiscussions_4 = null;

        EObject this_Permissions_45eventId_45token_5 = null;

        EObject this_Permissions_45eventIssues_6 = null;

        EObject this_Permissions_45eventPackages_7 = null;

        EObject this_Permissions_45eventPages_8 = null;

        EObject this_Permissions_45eventPull_45requests_9 = null;

        EObject this_Permissions_45eventRepository_45projects_10 = null;

        EObject this_Permissions_45eventSecurity_45events_11 = null;

        EObject this_Permissions_45eventStatuses_12 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:651:2: ( (this_Permissions_45eventActions_0= rulePermissions_45eventActions | this_Permissions_45eventChecks_1= rulePermissions_45eventChecks | this_Permissions_45eventContents_2= rulePermissions_45eventContents | this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments | this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions | this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token | this_Permissions_45eventIssues_6= rulePermissions_45eventIssues | this_Permissions_45eventPackages_7= rulePermissions_45eventPackages | this_Permissions_45eventPages_8= rulePermissions_45eventPages | this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests | this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects | this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events | this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:652:2: (this_Permissions_45eventActions_0= rulePermissions_45eventActions | this_Permissions_45eventChecks_1= rulePermissions_45eventChecks | this_Permissions_45eventContents_2= rulePermissions_45eventContents | this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments | this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions | this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token | this_Permissions_45eventIssues_6= rulePermissions_45eventIssues | this_Permissions_45eventPackages_7= rulePermissions_45eventPackages | this_Permissions_45eventPages_8= rulePermissions_45eventPages | this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests | this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects | this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events | this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:652:2: (this_Permissions_45eventActions_0= rulePermissions_45eventActions | this_Permissions_45eventChecks_1= rulePermissions_45eventChecks | this_Permissions_45eventContents_2= rulePermissions_45eventContents | this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments | this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions | this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token | this_Permissions_45eventIssues_6= rulePermissions_45eventIssues | this_Permissions_45eventPackages_7= rulePermissions_45eventPackages | this_Permissions_45eventPages_8= rulePermissions_45eventPages | this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests | this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects | this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events | this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses )
            int alt8=13;
            switch ( input.LA(1) ) {
            case Actions:
                {
                alt8=1;
                }
                break;
            case Checks:
                {
                alt8=2;
                }
                break;
            case Contents:
                {
                alt8=3;
                }
                break;
            case Deployments:
                {
                alt8=4;
                }
                break;
            case Discussions:
                {
                alt8=5;
                }
                break;
            case IdToken:
                {
                alt8=6;
                }
                break;
            case Issues:
                {
                alt8=7;
                }
                break;
            case Packages:
                {
                alt8=8;
                }
                break;
            case Pages:
                {
                alt8=9;
                }
                break;
            case PullRequests:
                {
                alt8=10;
                }
                break;
            case RepositoryProjects:
                {
                alt8=11;
                }
                break;
            case SecurityEvents:
                {
                alt8=12;
                }
                break;
            case Statuses:
                {
                alt8=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:653:3: this_Permissions_45eventActions_0= rulePermissions_45eventActions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventActionsParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventActions_0=rulePermissions_45eventActions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventActions_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:662:3: this_Permissions_45eventChecks_1= rulePermissions_45eventChecks
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventChecksParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventChecks_1=rulePermissions_45eventChecks();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventChecks_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:671:3: this_Permissions_45eventContents_2= rulePermissions_45eventContents
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventContentsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventContents_2=rulePermissions_45eventContents();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventContents_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:680:3: this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventDeploymentsParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventDeployments_3=rulePermissions_45eventDeployments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventDeployments_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:689:3: this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventDiscussionsParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventDiscussions_4=rulePermissions_45eventDiscussions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventDiscussions_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:698:3: this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventId_45tokenParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventId_45token_5=rulePermissions_45eventId_45token();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventId_45token_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:707:3: this_Permissions_45eventIssues_6= rulePermissions_45eventIssues
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventIssuesParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventIssues_6=rulePermissions_45eventIssues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventIssues_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:716:3: this_Permissions_45eventPackages_7= rulePermissions_45eventPackages
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPackagesParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventPackages_7=rulePermissions_45eventPackages();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventPackages_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:725:3: this_Permissions_45eventPages_8= rulePermissions_45eventPages
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPagesParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventPages_8=rulePermissions_45eventPages();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventPages_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:734:3: this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPull_45requestsParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventPull_45requests_9=rulePermissions_45eventPull_45requests();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventPull_45requests_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:743:3: this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventRepository_45projectsParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventRepository_45projects_10=rulePermissions_45eventRepository_45projects();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventRepository_45projects_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:752:3: this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventSecurity_45eventsParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventSecurity_45events_11=rulePermissions_45eventSecurity_45events();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventSecurity_45events_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:761:3: this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventStatusesParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventStatuses_12=rulePermissions_45eventStatuses();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Permissions_45eventStatuses_12;
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
    // $ANTLR end "rulePermissions_45eventPropertiesAbstract"


    // $ANTLR start "entryRuleEnvAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:773:1: entryRuleEnvAbstract returns [EObject current=null] : iv_ruleEnvAbstract= ruleEnvAbstract EOF ;
    public final EObject entryRuleEnvAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:773:52: (iv_ruleEnvAbstract= ruleEnvAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:774:2: iv_ruleEnvAbstract= ruleEnvAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvAbstract=ruleEnvAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvAbstract; 
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
    // $ANTLR end "entryRuleEnvAbstract"


    // $ANTLR start "ruleEnvAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:780:1: ruleEnvAbstract returns [EObject current=null] : ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) ;
    public final EObject ruleEnvAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvTypeNumber_0 = null;

        EObject this_EnvTypeString_1 = null;

        EObject this_EnvTypeInteger_2 = null;

        EObject this_EnvTypeBoolean_3 = null;

        EObject this_EnvTypeObject_4 = null;

        EObject this_EnvTypeArray_5 = null;

        EObject this_EnvTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:786:2: ( ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:787:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:787:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            int alt9=7;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:788:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:788:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:789:4: ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeNumber_0=ruleEnvTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_EnvTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:800:3: this_EnvTypeString_1= ruleEnvTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeString_1=ruleEnvTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:809:3: this_EnvTypeInteger_2= ruleEnvTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeInteger_2=ruleEnvTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:818:3: this_EnvTypeBoolean_3= ruleEnvTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeBoolean_3=ruleEnvTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:827:3: this_EnvTypeObject_4= ruleEnvTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeObject_4=ruleEnvTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:836:3: this_EnvTypeArray_5= ruleEnvTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeArray_5=ruleEnvTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:845:3: this_EnvTypeNull_6= ruleEnvTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeNull_6=ruleEnvTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeNull_6;
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
    // $ANTLR end "ruleEnvAbstract"


    // $ANTLR start "entryRuleEnvPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:857:1: entryRuleEnvPropertiesAbstract returns [EObject current=null] : iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF ;
    public final EObject entryRuleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:857:62: (iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:858:2: iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvPropertiesAbstract=ruleEnvPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvPropertiesAbstract; 
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
    // $ANTLR end "entryRuleEnvPropertiesAbstract"


    // $ANTLR start "ruleEnvPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:864:1: ruleEnvPropertiesAbstract returns [EObject current=null] : ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) ;
    public final EObject ruleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:870:2: ( ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:871:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:871:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:872:3: ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEnvPropertiesAbstractAccess().getEnvAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_EnvAdditionalProperties_0=ruleEnvAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EnvAdditionalProperties_0;
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
    // $ANTLR end "ruleEnvPropertiesAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:885:1: entryRuleReusableWorkflowCallJobSecretsPropertiesAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsPropertiesAbstract= ruleReusableWorkflowCallJobSecretsPropertiesAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:885:89: (iv_ruleReusableWorkflowCallJobSecretsPropertiesAbstract= ruleReusableWorkflowCallJobSecretsPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:886:2: iv_ruleReusableWorkflowCallJobSecretsPropertiesAbstract= ruleReusableWorkflowCallJobSecretsPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsPropertiesAbstract=ruleReusableWorkflowCallJobSecretsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsPropertiesAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:892:1: ruleReusableWorkflowCallJobSecretsPropertiesAbstract returns [EObject current=null] : ( ( ruleReusableWorkflowCallJobSecretsAdditionalProperties )=>this_ReusableWorkflowCallJobSecretsAdditionalProperties_0= ruleReusableWorkflowCallJobSecretsAdditionalProperties ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobSecretsAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:898:2: ( ( ( ruleReusableWorkflowCallJobSecretsAdditionalProperties )=>this_ReusableWorkflowCallJobSecretsAdditionalProperties_0= ruleReusableWorkflowCallJobSecretsAdditionalProperties ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:899:2: ( ( ruleReusableWorkflowCallJobSecretsAdditionalProperties )=>this_ReusableWorkflowCallJobSecretsAdditionalProperties_0= ruleReusableWorkflowCallJobSecretsAdditionalProperties )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:899:2: ( ( ruleReusableWorkflowCallJobSecretsAdditionalProperties )=>this_ReusableWorkflowCallJobSecretsAdditionalProperties_0= ruleReusableWorkflowCallJobSecretsAdditionalProperties )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:900:3: ( ruleReusableWorkflowCallJobSecretsAdditionalProperties )=>this_ReusableWorkflowCallJobSecretsAdditionalProperties_0= ruleReusableWorkflowCallJobSecretsAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsPropertiesAbstractAccess().getReusableWorkflowCallJobSecretsAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ReusableWorkflowCallJobSecretsAdditionalProperties_0=ruleReusableWorkflowCallJobSecretsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ReusableWorkflowCallJobSecretsAdditionalProperties_0;
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsPropertiesAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:913:1: entryRuleReusableWorkflowCallJobStrategyMatrixAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAbstract= ruleReusableWorkflowCallJobStrategyMatrixAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:913:86: (iv_ruleReusableWorkflowCallJobStrategyMatrixAbstract= ruleReusableWorkflowCallJobStrategyMatrixAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:914:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAbstract= ruleReusableWorkflowCallJobStrategyMatrixAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAbstract=ruleReusableWorkflowCallJobStrategyMatrixAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:920:1: ruleReusableWorkflowCallJobStrategyMatrixAbstract returns [EObject current=null] : ( ( ( ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixTypeString | this_ReusableWorkflowCallJobStrategyMatrixTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixTypeObject | this_ReusableWorkflowCallJobStrategyMatrixTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixTypeArray | this_ReusableWorkflowCallJobStrategyMatrixTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixTypeNull ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixTypeString_1 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixTypeInteger_2 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixTypeBoolean_3 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixTypeObject_4 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixTypeArray_5 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:926:2: ( ( ( ( ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixTypeString | this_ReusableWorkflowCallJobStrategyMatrixTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixTypeObject | this_ReusableWorkflowCallJobStrategyMatrixTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixTypeArray | this_ReusableWorkflowCallJobStrategyMatrixTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixTypeNull ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:927:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixTypeString | this_ReusableWorkflowCallJobStrategyMatrixTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixTypeObject | this_ReusableWorkflowCallJobStrategyMatrixTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixTypeArray | this_ReusableWorkflowCallJobStrategyMatrixTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixTypeNull )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:927:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixTypeString | this_ReusableWorkflowCallJobStrategyMatrixTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixTypeObject | this_ReusableWorkflowCallJobStrategyMatrixTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixTypeArray | this_ReusableWorkflowCallJobStrategyMatrixTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixTypeNull )
            int alt10=7;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:928:3: ( ( ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:928:3: ( ( ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:929:4: ( ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAbstractAccess().getReusableWorkflowCallJobStrategyMatrixTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0=ruleReusableWorkflowCallJobStrategyMatrixTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:940:3: this_ReusableWorkflowCallJobStrategyMatrixTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAbstractAccess().getReusableWorkflowCallJobStrategyMatrixTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixTypeString_1=ruleReusableWorkflowCallJobStrategyMatrixTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:949:3: this_ReusableWorkflowCallJobStrategyMatrixTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAbstractAccess().getReusableWorkflowCallJobStrategyMatrixTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixTypeInteger_2=ruleReusableWorkflowCallJobStrategyMatrixTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:958:3: this_ReusableWorkflowCallJobStrategyMatrixTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAbstractAccess().getReusableWorkflowCallJobStrategyMatrixTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixTypeBoolean_3=ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:967:3: this_ReusableWorkflowCallJobStrategyMatrixTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAbstractAccess().getReusableWorkflowCallJobStrategyMatrixTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixTypeObject_4=ruleReusableWorkflowCallJobStrategyMatrixTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:976:3: this_ReusableWorkflowCallJobStrategyMatrixTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAbstractAccess().getReusableWorkflowCallJobStrategyMatrixTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixTypeArray_5=ruleReusableWorkflowCallJobStrategyMatrixTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:985:3: this_ReusableWorkflowCallJobStrategyMatrixTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAbstractAccess().getReusableWorkflowCallJobStrategyMatrixTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixTypeNull_6=ruleReusableWorkflowCallJobStrategyMatrixTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixTypeNull_6;
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:997:1: entryRuleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:997:96: (iv_ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:998:2: iv_ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract=ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1004:1: ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract returns [EObject current=null] : ( ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 ) | ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1010:2: ( ( ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 ) | ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1011:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 ) | ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1011:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 ) | ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1012:3: ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1012:3: ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1013:4: ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixPatternProperties0ParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1024:3: ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1024:3: ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1025:4: ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1=ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1;
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1039:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1039:106: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1040:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1046:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract returns [EObject current=null] : ( ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_1 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_2 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_3 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_4 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_5 = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1052:2: ( ( ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1053:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1053:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull )
            int alt12=7;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1054:3: ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1054:3: ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1055:4: ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1066:3: this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_1=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1075:3: this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_2=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1084:3: this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_3=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1093:3: this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_4=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1102:3: this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_5=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1111:3: this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_6=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_6;
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1123:1: entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1123:119: (iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1124:2: iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1130:1: ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract returns [EObject current=null] : ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1136:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1137:2: ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1137:2: ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1138:3: ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_0=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_0;
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract"


    // $ANTLR start "entryRuleConfigurationAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1151:1: entryRuleConfigurationAbstract returns [EObject current=null] : iv_ruleConfigurationAbstract= ruleConfigurationAbstract EOF ;
    public final EObject entryRuleConfigurationAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1151:62: (iv_ruleConfigurationAbstract= ruleConfigurationAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1152:2: iv_ruleConfigurationAbstract= ruleConfigurationAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationAbstract=ruleConfigurationAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationAbstract; 
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
    // $ANTLR end "entryRuleConfigurationAbstract"


    // $ANTLR start "ruleConfigurationAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1158:1: ruleConfigurationAbstract returns [EObject current=null] : ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull ) ;
    public final EObject ruleConfigurationAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationTypeNumber_0 = null;

        EObject this_ConfigurationTypeString_1 = null;

        EObject this_ConfigurationTypeInteger_2 = null;

        EObject this_ConfigurationTypeBoolean_3 = null;

        EObject this_ConfigurationTypeObject_4 = null;

        EObject this_ConfigurationTypeArray_5 = null;

        EObject this_ConfigurationTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1164:2: ( ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1165:2: ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1165:2: ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1166:3: ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1166:3: ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1167:4: ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeNumber_0=ruleConfigurationTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1178:3: this_ConfigurationTypeString_1= ruleConfigurationTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeString_1=ruleConfigurationTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1187:3: this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeInteger_2=ruleConfigurationTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1196:3: this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeBoolean_3=ruleConfigurationTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1205:3: this_ConfigurationTypeObject_4= ruleConfigurationTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeObject_4=ruleConfigurationTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1214:3: this_ConfigurationTypeArray_5= ruleConfigurationTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeArray_5=ruleConfigurationTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1223:3: this_ConfigurationTypeNull_6= ruleConfigurationTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeNull_6=ruleConfigurationTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeNull_6;
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
    // $ANTLR end "ruleConfigurationAbstract"


    // $ANTLR start "entryRuleConfigurationPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1235:1: entryRuleConfigurationPropertiesAbstract returns [EObject current=null] : iv_ruleConfigurationPropertiesAbstract= ruleConfigurationPropertiesAbstract EOF ;
    public final EObject entryRuleConfigurationPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1235:72: (iv_ruleConfigurationPropertiesAbstract= ruleConfigurationPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1236:2: iv_ruleConfigurationPropertiesAbstract= ruleConfigurationPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationPropertiesAbstract=ruleConfigurationPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationPropertiesAbstract; 
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
    // $ANTLR end "entryRuleConfigurationPropertiesAbstract"


    // $ANTLR start "ruleConfigurationPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1242:1: ruleConfigurationPropertiesAbstract returns [EObject current=null] : ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties ) ;
    public final EObject ruleConfigurationPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1248:2: ( ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1249:2: ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1249:2: ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1250:3: ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConfigurationPropertiesAbstractAccess().getConfigurationAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ConfigurationAdditionalProperties_0=ruleConfigurationAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationAdditionalProperties_0;
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
    // $ANTLR end "ruleConfigurationPropertiesAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1263:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1263:116: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1264:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1270:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract returns [EObject current=null] : ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1276:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1277:2: ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1277:2: ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1278:3: ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_0;
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1291:1: entryRuleReusableWorkflowCallJobConcurrencyPropertiesAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1291:93: (iv_ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1292:2: iv_ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract=ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyPropertiesAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1298:1: ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract returns [EObject current=null] : ( ( ruleReusableWorkflowCallJobConcurrencyAdditionalProperties )=>this_ReusableWorkflowCallJobConcurrencyAdditionalProperties_0= ruleReusableWorkflowCallJobConcurrencyAdditionalProperties ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobConcurrencyAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1304:2: ( ( ( ruleReusableWorkflowCallJobConcurrencyAdditionalProperties )=>this_ReusableWorkflowCallJobConcurrencyAdditionalProperties_0= ruleReusableWorkflowCallJobConcurrencyAdditionalProperties ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1305:2: ( ( ruleReusableWorkflowCallJobConcurrencyAdditionalProperties )=>this_ReusableWorkflowCallJobConcurrencyAdditionalProperties_0= ruleReusableWorkflowCallJobConcurrencyAdditionalProperties )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1305:2: ( ( ruleReusableWorkflowCallJobConcurrencyAdditionalProperties )=>this_ReusableWorkflowCallJobConcurrencyAdditionalProperties_0= ruleReusableWorkflowCallJobConcurrencyAdditionalProperties )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1306:3: ( ruleReusableWorkflowCallJobConcurrencyAdditionalProperties )=>this_ReusableWorkflowCallJobConcurrencyAdditionalProperties_0= ruleReusableWorkflowCallJobConcurrencyAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyPropertiesAbstractAccess().getReusableWorkflowCallJobConcurrencyAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ReusableWorkflowCallJobConcurrencyAdditionalProperties_0=ruleReusableWorkflowCallJobConcurrencyAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ReusableWorkflowCallJobConcurrencyAdditionalProperties_0;
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract"


    // $ANTLR start "entryRuleReusableWorkflowCallJob"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1319:1: entryRuleReusableWorkflowCallJob returns [EObject current=null] : iv_ruleReusableWorkflowCallJob= ruleReusableWorkflowCallJob EOF ;
    public final EObject entryRuleReusableWorkflowCallJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJob = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1319:64: (iv_ruleReusableWorkflowCallJob= ruleReusableWorkflowCallJob EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1320:2: iv_ruleReusableWorkflowCallJob= ruleReusableWorkflowCallJob EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJob=ruleReusableWorkflowCallJob();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJob; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJob"


    // $ANTLR start "ruleReusableWorkflowCallJob"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1326:1: ruleReusableWorkflowCallJob returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleReusableWorkflowCallJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_reusableWorkflowCallJob_2_0 = null;

        EObject lv_reusableWorkflowCallJob_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1332:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1333:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1333:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1334:3: () otherlv_1= LeftCurlyBracket ( ( (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1334:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1335:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobAccess().getReusableWorkflowCallJobAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1345:3: ( ( (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Concurrency||LA15_0==Permissions||LA15_0==Strategy||LA15_0==Secrets||LA15_0==Needs||(LA15_0>=Name && LA15_0<=With)||LA15_0==If) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1346:4: ( (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1346:4: ( (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1347:5: (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1347:5: (lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1348:6: lv_reusableWorkflowCallJob_2_0= ruleReusableWorkflowCallJobPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobAccess().getReusableWorkflowCallJobReusableWorkflowCallJobPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_reusableWorkflowCallJob_2_0=ruleReusableWorkflowCallJobPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobRule());
                      						}
                      						add(
                      							current,
                      							"reusableWorkflowCallJob",
                      							lv_reusableWorkflowCallJob_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1365:4: (otherlv_3= Comma ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1366:5: otherlv_3= Comma ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1370:5: ( (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1371:6: (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1371:6: (lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1372:7: lv_reusableWorkflowCallJob_4_0= ruleReusableWorkflowCallJobPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobAccess().getReusableWorkflowCallJobReusableWorkflowCallJobPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_reusableWorkflowCallJob_4_0=ruleReusableWorkflowCallJobPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"reusableWorkflowCallJob",
                    	      								lv_reusableWorkflowCallJob_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobPropertiesAbstract");
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

              			newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJob"


    // $ANTLR start "entryRuleReusableWorkflowCallJobName"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1399:1: entryRuleReusableWorkflowCallJobName returns [EObject current=null] : iv_ruleReusableWorkflowCallJobName= ruleReusableWorkflowCallJobName EOF ;
    public final EObject entryRuleReusableWorkflowCallJobName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobName = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1399:68: (iv_ruleReusableWorkflowCallJobName= ruleReusableWorkflowCallJobName EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1400:2: iv_ruleReusableWorkflowCallJobName= ruleReusableWorkflowCallJobName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobName=ruleReusableWorkflowCallJobName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobName; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobName"


    // $ANTLR start "ruleReusableWorkflowCallJobName"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1406:1: ruleReusableWorkflowCallJobName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1412:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1413:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1413:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1414:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1414:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1415:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobNameAccess().getReusableWorkflowCallJobNameAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobNameAccess().getNameKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobNameAccess().getColonKeyword_2());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1429:3: ( (lv_name_3_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1430:4: (lv_name_3_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1430:4: (lv_name_3_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1431:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobNameAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobNameRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleReusableWorkflowCallJobName"


    // $ANTLR start "entryRuleReusableWorkflowCallJobNeeds"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1452:1: entryRuleReusableWorkflowCallJobNeeds returns [EObject current=null] : iv_ruleReusableWorkflowCallJobNeeds= ruleReusableWorkflowCallJobNeeds EOF ;
    public final EObject entryRuleReusableWorkflowCallJobNeeds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobNeeds = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1452:69: (iv_ruleReusableWorkflowCallJobNeeds= ruleReusableWorkflowCallJobNeeds EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1453:2: iv_ruleReusableWorkflowCallJobNeeds= ruleReusableWorkflowCallJobNeeds EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobNeedsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobNeeds=ruleReusableWorkflowCallJobNeeds();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobNeeds; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobNeeds"


    // $ANTLR start "ruleReusableWorkflowCallJobNeeds"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1459:1: ruleReusableWorkflowCallJobNeeds returns [EObject current=null] : (otherlv_0= Needs otherlv_1= Colon ( (lv_needs_2_0= ruleJobNeeds ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobNeeds() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_needs_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1465:2: ( (otherlv_0= Needs otherlv_1= Colon ( (lv_needs_2_0= ruleJobNeeds ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1466:2: (otherlv_0= Needs otherlv_1= Colon ( (lv_needs_2_0= ruleJobNeeds ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1466:2: (otherlv_0= Needs otherlv_1= Colon ( (lv_needs_2_0= ruleJobNeeds ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1467:3: otherlv_0= Needs otherlv_1= Colon ( (lv_needs_2_0= ruleJobNeeds ) )
            {
            otherlv_0=(Token)match(input,Needs,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobNeedsAccess().getNeedsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobNeedsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1475:3: ( (lv_needs_2_0= ruleJobNeeds ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1476:4: (lv_needs_2_0= ruleJobNeeds )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1476:4: (lv_needs_2_0= ruleJobNeeds )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1477:5: lv_needs_2_0= ruleJobNeeds
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobNeedsAccess().getNeedsJobNeedsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_needs_2_0=ruleJobNeeds();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobNeedsRule());
              					}
              					set(
              						current,
              						"needs",
              						lv_needs_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JobNeeds");
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
    // $ANTLR end "ruleReusableWorkflowCallJobNeeds"


    // $ANTLR start "entryRuleReusableWorkflowCallJobPermissions"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1498:1: entryRuleReusableWorkflowCallJobPermissions returns [EObject current=null] : iv_ruleReusableWorkflowCallJobPermissions= ruleReusableWorkflowCallJobPermissions EOF ;
    public final EObject entryRuleReusableWorkflowCallJobPermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobPermissions = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1498:75: (iv_ruleReusableWorkflowCallJobPermissions= ruleReusableWorkflowCallJobPermissions EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1499:2: iv_ruleReusableWorkflowCallJobPermissions= ruleReusableWorkflowCallJobPermissions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobPermissionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobPermissions=ruleReusableWorkflowCallJobPermissions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobPermissions; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobPermissions"


    // $ANTLR start "ruleReusableWorkflowCallJobPermissions"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1505:1: ruleReusableWorkflowCallJobPermissions returns [EObject current=null] : (otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions_45event ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobPermissions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_permissions_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1511:2: ( (otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions_45event ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1512:2: (otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions_45event ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1512:2: (otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions_45event ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1513:3: otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions_45event ) )
            {
            otherlv_0=(Token)match(input,Permissions,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobPermissionsAccess().getPermissionsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobPermissionsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1521:3: ( (lv_permissions_2_0= rulePermissions_45event ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1522:4: (lv_permissions_2_0= rulePermissions_45event )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1522:4: (lv_permissions_2_0= rulePermissions_45event )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1523:5: lv_permissions_2_0= rulePermissions_45event
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobPermissionsAccess().getPermissionsPermissions_45eventParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_permissions_2_0=rulePermissions_45event();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobPermissionsRule());
              					}
              					set(
              						current,
              						"permissions",
              						lv_permissions_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45event");
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
    // $ANTLR end "ruleReusableWorkflowCallJobPermissions"


    // $ANTLR start "entryRuleReusableWorkflowCallJobIf"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1544:1: entryRuleReusableWorkflowCallJobIf returns [EObject current=null] : iv_ruleReusableWorkflowCallJobIf= ruleReusableWorkflowCallJobIf EOF ;
    public final EObject entryRuleReusableWorkflowCallJobIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobIf = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1544:66: (iv_ruleReusableWorkflowCallJobIf= ruleReusableWorkflowCallJobIf EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1545:2: iv_ruleReusableWorkflowCallJobIf= ruleReusableWorkflowCallJobIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobIf=ruleReusableWorkflowCallJobIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobIf; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobIf"


    // $ANTLR start "ruleReusableWorkflowCallJobIf"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1551:1: ruleReusableWorkflowCallJobIf returns [EObject current=null] : ( (lv_if__0_0= ruleReusableWorkflowCallJobIfAbstract ) ) ;
    public final EObject ruleReusableWorkflowCallJobIf() throws RecognitionException {
        EObject current = null;

        EObject lv_if__0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1557:2: ( ( (lv_if__0_0= ruleReusableWorkflowCallJobIfAbstract ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1558:2: ( (lv_if__0_0= ruleReusableWorkflowCallJobIfAbstract ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1558:2: ( (lv_if__0_0= ruleReusableWorkflowCallJobIfAbstract ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1559:3: (lv_if__0_0= ruleReusableWorkflowCallJobIfAbstract )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1559:3: (lv_if__0_0= ruleReusableWorkflowCallJobIfAbstract )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1560:4: lv_if__0_0= ruleReusableWorkflowCallJobIfAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfAccess().getIf_ReusableWorkflowCallJobIfAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_if__0_0=ruleReusableWorkflowCallJobIfAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobIfRule());
              				}
              				set(
              					current,
              					"if_",
              					lv_if__0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobIfAbstract");
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
    // $ANTLR end "ruleReusableWorkflowCallJobIf"


    // $ANTLR start "entryRuleReusableWorkflowCallJobUses"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1580:1: entryRuleReusableWorkflowCallJobUses returns [EObject current=null] : iv_ruleReusableWorkflowCallJobUses= ruleReusableWorkflowCallJobUses EOF ;
    public final EObject entryRuleReusableWorkflowCallJobUses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobUses = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1580:68: (iv_ruleReusableWorkflowCallJobUses= ruleReusableWorkflowCallJobUses EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1581:2: iv_ruleReusableWorkflowCallJobUses= ruleReusableWorkflowCallJobUses EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobUsesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobUses=ruleReusableWorkflowCallJobUses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobUses; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobUses"


    // $ANTLR start "ruleReusableWorkflowCallJobUses"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1587:1: ruleReusableWorkflowCallJobUses returns [EObject current=null] : (otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobUses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uses_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1593:2: ( (otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1594:2: (otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1594:2: (otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1595:3: otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Uses,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobUsesAccess().getUsesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobUsesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1603:3: ( (lv_uses_2_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1604:4: (lv_uses_2_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1604:4: (lv_uses_2_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1605:5: lv_uses_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobUsesAccess().getUsesEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_uses_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobUsesRule());
              					}
              					set(
              						current,
              						"uses",
              						lv_uses_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleReusableWorkflowCallJobUses"


    // $ANTLR start "entryRuleReusableWorkflowCallJobWith"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1626:1: entryRuleReusableWorkflowCallJobWith returns [EObject current=null] : iv_ruleReusableWorkflowCallJobWith= ruleReusableWorkflowCallJobWith EOF ;
    public final EObject entryRuleReusableWorkflowCallJobWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobWith = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1626:68: (iv_ruleReusableWorkflowCallJobWith= ruleReusableWorkflowCallJobWith EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1627:2: iv_ruleReusableWorkflowCallJobWith= ruleReusableWorkflowCallJobWith EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobWithRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobWith=ruleReusableWorkflowCallJobWith();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobWith; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobWith"


    // $ANTLR start "ruleReusableWorkflowCallJobWith"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1633:1: ruleReusableWorkflowCallJobWith returns [EObject current=null] : (otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_with_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1639:2: ( (otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1640:2: (otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1640:2: (otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1641:3: otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) )
            {
            otherlv_0=(Token)match(input,With,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobWithAccess().getWithKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobWithAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1649:3: ( (lv_with_2_0= ruleEnv ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1650:4: (lv_with_2_0= ruleEnv )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1650:4: (lv_with_2_0= ruleEnv )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1651:5: lv_with_2_0= ruleEnv
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobWithAccess().getWithEnvParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_with_2_0=ruleEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobWithRule());
              					}
              					set(
              						current,
              						"with",
              						lv_with_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Env");
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
    // $ANTLR end "ruleReusableWorkflowCallJobWith"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecrets"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1672:1: entryRuleReusableWorkflowCallJobSecrets returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecrets= ruleReusableWorkflowCallJobSecrets EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecrets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecrets = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1672:71: (iv_ruleReusableWorkflowCallJobSecrets= ruleReusableWorkflowCallJobSecrets EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1673:2: iv_ruleReusableWorkflowCallJobSecrets= ruleReusableWorkflowCallJobSecrets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecrets=ruleReusableWorkflowCallJobSecrets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecrets; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecrets"


    // $ANTLR start "ruleReusableWorkflowCallJobSecrets"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1679:1: ruleReusableWorkflowCallJobSecrets returns [EObject current=null] : ( (lv_secrets_0_0= ruleReusableWorkflowCallJobSecretsAbstract ) ) ;
    public final EObject ruleReusableWorkflowCallJobSecrets() throws RecognitionException {
        EObject current = null;

        EObject lv_secrets_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1685:2: ( ( (lv_secrets_0_0= ruleReusableWorkflowCallJobSecretsAbstract ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1686:2: ( (lv_secrets_0_0= ruleReusableWorkflowCallJobSecretsAbstract ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1686:2: ( (lv_secrets_0_0= ruleReusableWorkflowCallJobSecretsAbstract ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1687:3: (lv_secrets_0_0= ruleReusableWorkflowCallJobSecretsAbstract )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1687:3: (lv_secrets_0_0= ruleReusableWorkflowCallJobSecretsAbstract )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1688:4: lv_secrets_0_0= ruleReusableWorkflowCallJobSecretsAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAccess().getSecretsReusableWorkflowCallJobSecretsAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_secrets_0_0=ruleReusableWorkflowCallJobSecretsAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsRule());
              				}
              				set(
              					current,
              					"secrets",
              					lv_secrets_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobSecretsAbstract");
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecrets"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategy"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1708:1: entryRuleReusableWorkflowCallJobStrategy returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategy= ruleReusableWorkflowCallJobStrategy EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategy = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1708:72: (iv_ruleReusableWorkflowCallJobStrategy= ruleReusableWorkflowCallJobStrategy EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1709:2: iv_ruleReusableWorkflowCallJobStrategy= ruleReusableWorkflowCallJobStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategy=ruleReusableWorkflowCallJobStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategy; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategy"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategy"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1715:1: ruleReusableWorkflowCallJobStrategy returns [EObject current=null] : ( () otherlv_1= Strategy otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleReusableWorkflowCallJobStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_strategy_4_0 = null;

        EObject lv_strategy_6_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1721:2: ( ( () otherlv_1= Strategy otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1722:2: ( () otherlv_1= Strategy otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1722:2: ( () otherlv_1= Strategy otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1723:3: () otherlv_1= Strategy otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1723:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1724:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobStrategyAccess().getReusableWorkflowCallJobStrategyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Strategy,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyAccess().getStrategyKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobStrategyAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobStrategyAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1742:3: ( ( (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==MaxParallel||LA17_0==FailFast||LA17_0==Matrix) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1743:4: ( (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1743:4: ( (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1744:5: (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1744:5: (lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1745:6: lv_strategy_4_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyAccess().getStrategyReusableWorkflowCallJobStrategyPropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_strategy_4_0=ruleReusableWorkflowCallJobStrategyPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyRule());
                      						}
                      						add(
                      							current,
                      							"strategy",
                      							lv_strategy_4_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1762:4: (otherlv_5= Comma ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1763:5: otherlv_5= Comma ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobStrategyAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1767:5: ( (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1768:6: (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1768:6: (lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1769:7: lv_strategy_6_0= ruleReusableWorkflowCallJobStrategyPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyAccess().getStrategyReusableWorkflowCallJobStrategyPropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_strategy_6_0=ruleReusableWorkflowCallJobStrategyPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"strategy",
                    	      								lv_strategy_6_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getReusableWorkflowCallJobStrategyAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategy"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrency"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1796:1: entryRuleReusableWorkflowCallJobConcurrency returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrency= ruleReusableWorkflowCallJobConcurrency EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrency = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1796:75: (iv_ruleReusableWorkflowCallJobConcurrency= ruleReusableWorkflowCallJobConcurrency EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1797:2: iv_ruleReusableWorkflowCallJobConcurrency= ruleReusableWorkflowCallJobConcurrency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrency=ruleReusableWorkflowCallJobConcurrency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrency; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrency"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrency"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1803:1: ruleReusableWorkflowCallJobConcurrency returns [EObject current=null] : ( (lv_concurrency_0_0= ruleReusableWorkflowCallJobConcurrencyAbstract ) ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrency() throws RecognitionException {
        EObject current = null;

        EObject lv_concurrency_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1809:2: ( ( (lv_concurrency_0_0= ruleReusableWorkflowCallJobConcurrencyAbstract ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1810:2: ( (lv_concurrency_0_0= ruleReusableWorkflowCallJobConcurrencyAbstract ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1810:2: ( (lv_concurrency_0_0= ruleReusableWorkflowCallJobConcurrencyAbstract ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1811:3: (lv_concurrency_0_0= ruleReusableWorkflowCallJobConcurrencyAbstract )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1811:3: (lv_concurrency_0_0= ruleReusableWorkflowCallJobConcurrencyAbstract )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1812:4: lv_concurrency_0_0= ruleReusableWorkflowCallJobConcurrencyAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAccess().getConcurrencyReusableWorkflowCallJobConcurrencyAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_0_0=ruleReusableWorkflowCallJobConcurrencyAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyRule());
              				}
              				set(
              					current,
              					"concurrency",
              					lv_concurrency_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobConcurrencyAbstract");
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrency"


    // $ANTLR start "entryRuleEString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1832:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1832:47: (iv_ruleEString= ruleEString EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1833:2: iv_ruleEString= ruleEString EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1839:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1845:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1846:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleJobNeeds"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1859:1: entryRuleJobNeeds returns [EObject current=null] : iv_ruleJobNeeds= ruleJobNeeds EOF ;
    public final EObject entryRuleJobNeeds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeeds = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1859:49: (iv_ruleJobNeeds= ruleJobNeeds EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1860:2: iv_ruleJobNeeds= ruleJobNeeds EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeeds=ruleJobNeeds();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeeds; 
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
    // $ANTLR end "entryRuleJobNeeds"


    // $ANTLR start "ruleJobNeeds"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1866:1: ruleJobNeeds returns [EObject current=null] : ( (lv_jobNeeds_0_0= ruleJobNeedsAbstract ) ) ;
    public final EObject ruleJobNeeds() throws RecognitionException {
        EObject current = null;

        EObject lv_jobNeeds_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1872:2: ( ( (lv_jobNeeds_0_0= ruleJobNeedsAbstract ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1873:2: ( (lv_jobNeeds_0_0= ruleJobNeedsAbstract ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1873:2: ( (lv_jobNeeds_0_0= ruleJobNeedsAbstract ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1874:3: (lv_jobNeeds_0_0= ruleJobNeedsAbstract )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1874:3: (lv_jobNeeds_0_0= ruleJobNeedsAbstract )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1875:4: lv_jobNeeds_0_0= ruleJobNeedsAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJobNeedsAccess().getJobNeedsJobNeedsAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_jobNeeds_0_0=ruleJobNeedsAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getJobNeedsRule());
              				}
              				set(
              					current,
              					"jobNeeds",
              					lv_jobNeeds_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JobNeedsAbstract");
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
    // $ANTLR end "ruleJobNeeds"


    // $ANTLR start "entryRuleJobNeedsTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1895:1: entryRuleJobNeedsTypeString returns [EObject current=null] : iv_ruleJobNeedsTypeString= ruleJobNeedsTypeString EOF ;
    public final EObject entryRuleJobNeedsTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsTypeString = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1895:59: (iv_ruleJobNeedsTypeString= ruleJobNeedsTypeString EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1896:2: iv_ruleJobNeedsTypeString= ruleJobNeedsTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsTypeString=ruleJobNeedsTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsTypeString; 
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
    // $ANTLR end "entryRuleJobNeedsTypeString"


    // $ANTLR start "ruleJobNeedsTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1902:1: ruleJobNeedsTypeString returns [EObject current=null] : ( (lv_jobNeeds_0_0= ruleEString ) ) ;
    public final EObject ruleJobNeedsTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_jobNeeds_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1908:2: ( ( (lv_jobNeeds_0_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1909:2: ( (lv_jobNeeds_0_0= ruleEString ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1909:2: ( (lv_jobNeeds_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1910:3: (lv_jobNeeds_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1910:3: (lv_jobNeeds_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1911:4: lv_jobNeeds_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJobNeedsTypeStringAccess().getJobNeedsEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_jobNeeds_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getJobNeedsTypeStringRule());
              				}
              				set(
              					current,
              					"jobNeeds",
              					lv_jobNeeds_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleJobNeedsTypeString"


    // $ANTLR start "entryRuleJobNeedsTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1931:1: entryRuleJobNeedsTypeInteger returns [EObject current=null] : iv_ruleJobNeedsTypeInteger= ruleJobNeedsTypeInteger EOF ;
    public final EObject entryRuleJobNeedsTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsTypeInteger = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1931:60: (iv_ruleJobNeedsTypeInteger= ruleJobNeedsTypeInteger EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1932:2: iv_ruleJobNeedsTypeInteger= ruleJobNeedsTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsTypeInteger=ruleJobNeedsTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsTypeInteger; 
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
    // $ANTLR end "entryRuleJobNeedsTypeInteger"


    // $ANTLR start "ruleJobNeedsTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1938:1: ruleJobNeedsTypeInteger returns [EObject current=null] : ( (lv_jobNeeds_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleJobNeedsTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_jobNeeds_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1944:2: ( ( (lv_jobNeeds_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1945:2: ( (lv_jobNeeds_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1945:2: ( (lv_jobNeeds_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1946:3: (lv_jobNeeds_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1946:3: (lv_jobNeeds_0_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1947:4: lv_jobNeeds_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJobNeedsTypeIntegerAccess().getJobNeedsEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_jobNeeds_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getJobNeedsTypeIntegerRule());
              				}
              				set(
              					current,
              					"jobNeeds",
              					lv_jobNeeds_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleJobNeedsTypeInteger"


    // $ANTLR start "entryRuleJobNeedsTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1967:1: entryRuleJobNeedsTypeNumber returns [EObject current=null] : iv_ruleJobNeedsTypeNumber= ruleJobNeedsTypeNumber EOF ;
    public final EObject entryRuleJobNeedsTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsTypeNumber = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1967:59: (iv_ruleJobNeedsTypeNumber= ruleJobNeedsTypeNumber EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1968:2: iv_ruleJobNeedsTypeNumber= ruleJobNeedsTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsTypeNumber=ruleJobNeedsTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsTypeNumber; 
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
    // $ANTLR end "entryRuleJobNeedsTypeNumber"


    // $ANTLR start "ruleJobNeedsTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1974:1: ruleJobNeedsTypeNumber returns [EObject current=null] : ( (lv_jobNeeds_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleJobNeedsTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_jobNeeds_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1980:2: ( ( (lv_jobNeeds_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1981:2: ( (lv_jobNeeds_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1981:2: ( (lv_jobNeeds_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1982:3: (lv_jobNeeds_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1982:3: (lv_jobNeeds_0_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1983:4: lv_jobNeeds_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJobNeedsTypeNumberAccess().getJobNeedsEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_jobNeeds_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getJobNeedsTypeNumberRule());
              				}
              				set(
              					current,
              					"jobNeeds",
              					lv_jobNeeds_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleJobNeedsTypeNumber"


    // $ANTLR start "entryRuleJobNeedsTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2003:1: entryRuleJobNeedsTypeBoolean returns [EObject current=null] : iv_ruleJobNeedsTypeBoolean= ruleJobNeedsTypeBoolean EOF ;
    public final EObject entryRuleJobNeedsTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsTypeBoolean = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2003:60: (iv_ruleJobNeedsTypeBoolean= ruleJobNeedsTypeBoolean EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2004:2: iv_ruleJobNeedsTypeBoolean= ruleJobNeedsTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsTypeBoolean=ruleJobNeedsTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsTypeBoolean; 
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
    // $ANTLR end "entryRuleJobNeedsTypeBoolean"


    // $ANTLR start "ruleJobNeedsTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2010:1: ruleJobNeedsTypeBoolean returns [EObject current=null] : ( (lv_jobNeeds_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleJobNeedsTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_jobNeeds_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2016:2: ( ( (lv_jobNeeds_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2017:2: ( (lv_jobNeeds_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2017:2: ( (lv_jobNeeds_0_0= ruleEBooleanObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2018:3: (lv_jobNeeds_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2018:3: (lv_jobNeeds_0_0= ruleEBooleanObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2019:4: lv_jobNeeds_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJobNeedsTypeBooleanAccess().getJobNeedsEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_jobNeeds_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getJobNeedsTypeBooleanRule());
              				}
              				set(
              					current,
              					"jobNeeds",
              					lv_jobNeeds_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBooleanObject");
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
    // $ANTLR end "ruleJobNeedsTypeBoolean"


    // $ANTLR start "entryRuleJobNeedsTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2039:1: entryRuleJobNeedsTypeObject returns [EObject current=null] : iv_ruleJobNeedsTypeObject= ruleJobNeedsTypeObject EOF ;
    public final EObject entryRuleJobNeedsTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsTypeObject = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2039:59: (iv_ruleJobNeedsTypeObject= ruleJobNeedsTypeObject EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2040:2: iv_ruleJobNeedsTypeObject= ruleJobNeedsTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsTypeObject=ruleJobNeedsTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsTypeObject; 
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
    // $ANTLR end "entryRuleJobNeedsTypeObject"


    // $ANTLR start "ruleJobNeedsTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2046:1: ruleJobNeedsTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleJobNeedsTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_jobNeeds_2_0 = null;

        EObject lv_jobNeeds_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2052:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2053:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2053:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2054:3: () otherlv_1= LeftCurlyBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2054:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2055:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJobNeedsTypeObjectAccess().getJobNeedsTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJobNeedsTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2065:3: ( ( (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RepositoryProjects && LA19_0<=With)||LA19_0==If||LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2066:4: ( (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2066:4: ( (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2067:5: (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2067:5: (lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2068:6: lv_jobNeeds_2_0= ruleJobNeedsPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJobNeedsTypeObjectAccess().getJobNeedsJobNeedsPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_jobNeeds_2_0=ruleJobNeedsPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJobNeedsTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"jobNeeds",
                      							lv_jobNeeds_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JobNeedsPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2085:4: (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2086:5: otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJobNeedsTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2090:5: ( (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2091:6: (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2091:6: (lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2092:7: lv_jobNeeds_4_0= ruleJobNeedsPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJobNeedsTypeObjectAccess().getJobNeedsJobNeedsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_jobNeeds_4_0=ruleJobNeedsPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJobNeedsTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"jobNeeds",
                    	      								lv_jobNeeds_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JobNeedsPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getJobNeedsTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleJobNeedsTypeObject"


    // $ANTLR start "entryRuleJobNeedsTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2119:1: entryRuleJobNeedsTypeArray returns [EObject current=null] : iv_ruleJobNeedsTypeArray= ruleJobNeedsTypeArray EOF ;
    public final EObject entryRuleJobNeedsTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsTypeArray = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2119:58: (iv_ruleJobNeedsTypeArray= ruleJobNeedsTypeArray EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2120:2: iv_ruleJobNeedsTypeArray= ruleJobNeedsTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsTypeArray=ruleJobNeedsTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsTypeArray; 
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
    // $ANTLR end "entryRuleJobNeedsTypeArray"


    // $ANTLR start "ruleJobNeedsTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2126:1: ruleJobNeedsTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsItems ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleJobNeedsTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_jobNeeds_2_0 = null;

        EObject lv_jobNeeds_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2132:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsItems ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2133:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsItems ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2133:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsItems ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2134:3: () otherlv_1= LeftSquareBracket ( ( (lv_jobNeeds_2_0= ruleJobNeedsItems ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2134:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2135:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJobNeedsTypeArrayAccess().getJobNeedsTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJobNeedsTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2145:3: ( ( (lv_jobNeeds_2_0= ruleJobNeedsItems ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RepositoryProjects && LA21_0<=True)||LA21_0==LeftSquareBracket||LA21_0==LeftCurlyBracket||(LA21_0>=RULE_STRING && LA21_0<=RULE_E_DOUBLE)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2146:4: ( (lv_jobNeeds_2_0= ruleJobNeedsItems ) ) (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2146:4: ( (lv_jobNeeds_2_0= ruleJobNeedsItems ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2147:5: (lv_jobNeeds_2_0= ruleJobNeedsItems )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2147:5: (lv_jobNeeds_2_0= ruleJobNeedsItems )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2148:6: lv_jobNeeds_2_0= ruleJobNeedsItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJobNeedsTypeArrayAccess().getJobNeedsJobNeedsItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_jobNeeds_2_0=ruleJobNeedsItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJobNeedsTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"jobNeeds",
                      							lv_jobNeeds_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JobNeedsItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2165:4: (otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Comma) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2166:5: otherlv_3= Comma ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJobNeedsTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2170:5: ( (lv_jobNeeds_4_0= ruleJobNeedsItems ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2171:6: (lv_jobNeeds_4_0= ruleJobNeedsItems )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2171:6: (lv_jobNeeds_4_0= ruleJobNeedsItems )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2172:7: lv_jobNeeds_4_0= ruleJobNeedsItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJobNeedsTypeArrayAccess().getJobNeedsJobNeedsItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_jobNeeds_4_0=ruleJobNeedsItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJobNeedsTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"jobNeeds",
                    	      								lv_jobNeeds_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JobNeedsItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getJobNeedsTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleJobNeedsTypeArray"


    // $ANTLR start "entryRuleJobNeedsTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2199:1: entryRuleJobNeedsTypeNull returns [EObject current=null] : iv_ruleJobNeedsTypeNull= ruleJobNeedsTypeNull EOF ;
    public final EObject entryRuleJobNeedsTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsTypeNull = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2199:57: (iv_ruleJobNeedsTypeNull= ruleJobNeedsTypeNull EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2200:2: iv_ruleJobNeedsTypeNull= ruleJobNeedsTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsTypeNull=ruleJobNeedsTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsTypeNull; 
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
    // $ANTLR end "entryRuleJobNeedsTypeNull"


    // $ANTLR start "ruleJobNeedsTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2206:1: ruleJobNeedsTypeNull returns [EObject current=null] : ( (lv_jobNeeds_0_0= ruleNullValue ) ) ;
    public final EObject ruleJobNeedsTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_jobNeeds_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2212:2: ( ( (lv_jobNeeds_0_0= ruleNullValue ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2213:2: ( (lv_jobNeeds_0_0= ruleNullValue ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2213:2: ( (lv_jobNeeds_0_0= ruleNullValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2214:3: (lv_jobNeeds_0_0= ruleNullValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2214:3: (lv_jobNeeds_0_0= ruleNullValue )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2215:4: lv_jobNeeds_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJobNeedsTypeNullAccess().getJobNeedsNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_jobNeeds_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getJobNeedsTypeNullRule());
              				}
              				set(
              					current,
              					"jobNeeds",
              					lv_jobNeeds_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.NullValue");
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
    // $ANTLR end "ruleJobNeedsTypeNull"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2235:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2235:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2236:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2242:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2248:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2249:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2249:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_E_INT) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_E_DOUBLE) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2250:3: this_E_INT_0= RULE_E_INT
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
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2258:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2269:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2269:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2270:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2276:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2282:2: ( (kw= True | kw= False ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2283:2: (kw= True | kw= False )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2283:2: (kw= True | kw= False )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==True) ) {
                alt23=1;
            }
            else if ( (LA23_0==False) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2284:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2290:3: kw= False
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


    // $ANTLR start "entryRuleJobNeedsAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2299:1: entryRuleJobNeedsAdditionalProperties returns [EObject current=null] : iv_ruleJobNeedsAdditionalProperties= ruleJobNeedsAdditionalProperties EOF ;
    public final EObject entryRuleJobNeedsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsAdditionalProperties = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2299:69: (iv_ruleJobNeedsAdditionalProperties= ruleJobNeedsAdditionalProperties EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2300:2: iv_ruleJobNeedsAdditionalProperties= ruleJobNeedsAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsAdditionalProperties=ruleJobNeedsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsAdditionalProperties; 
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
    // $ANTLR end "entryRuleJobNeedsAdditionalProperties"


    // $ANTLR start "ruleJobNeedsAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2306:1: ruleJobNeedsAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleJobNeedsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2312:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2313:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2313:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2314:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2314:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2315:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2315:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2316:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJobNeedsAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJobNeedsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJobNeedsAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2337:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2338:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2338:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2339:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJobNeedsAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJobNeedsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleJobNeedsAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2360:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2360:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2361:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2367:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2373:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2374:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2374:2: ( (lv_value_0_0= ruleValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2375:3: (lv_value_0_0= ruleValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2375:3: (lv_value_0_0= ruleValue )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2376:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Value");
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2396:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2396:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2397:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2403:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2409:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2410:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2410:2: ( (lv_value_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2411:3: (lv_value_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2411:3: (lv_value_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2412:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2432:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2432:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2433:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2439:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2445:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2446:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2446:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2447:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2447:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2448:4: 
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
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2458:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RepositoryProjects && LA25_0<=True)||LA25_0==LeftSquareBracket||LA25_0==LeftCurlyBracket||(LA25_0>=RULE_STRING && LA25_0<=RULE_E_DOUBLE)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2459:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2459:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2460:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2460:5: (lv_value_2_0= ruleValue )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2461:6: lv_value_2_0= ruleValue
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
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2478:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2479:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2483:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2484:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2484:6: (lv_value_4_0= ruleValue )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2485:7: lv_value_4_0= ruleValue
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
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2512:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2512:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2513:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2519:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2525:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2526:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2526:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2527:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2527:3: (lv_value_0_0= ruleNullEnum )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2528:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.NullEnum");
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2548:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2548:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2549:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2555:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2561:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2562:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2562:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2563:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2563:3: (lv_value_0_0= ruleEDouble )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2564:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDouble");
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2584:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2584:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2585:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2591:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2597:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2598:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2598:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2599:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2599:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2600:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2610:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RepositoryProjects && LA27_0<=With)||LA27_0==If||LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2611:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2611:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2612:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2612:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2613:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2630:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==Comma) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2631:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2635:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2636:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2636:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2637:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.KeyValuePair");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2664:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2664:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2665:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2671:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2677:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2678:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2678:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2679:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2679:3: (lv_value_0_0= ruleEBoolean )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2680:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBoolean");
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2700:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2700:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2701:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2707:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2713:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2714:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2714:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_E_INT) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_E_DOUBLE) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2715:3: this_E_INT_0= RULE_E_INT
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
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2723:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2734:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2734:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2735:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2741:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2747:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2748:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2748:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2749:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2749:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2750:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2750:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2751:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
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
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2772:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2773:4: (lv_value_2_0= ruleValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2773:4: (lv_value_2_0= ruleValue )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2774:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Value");
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2795:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2795:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2796:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2802:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2808:2: ( (kw= True | kw= False ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2809:2: (kw= True | kw= False )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2809:2: (kw= True | kw= False )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==True) ) {
                alt29=1;
            }
            else if ( (LA29_0==False) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2810:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2816:3: kw= False
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


    // $ANTLR start "entryRuleJobNeedsItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2825:1: entryRuleJobNeedsItems returns [EObject current=null] : iv_ruleJobNeedsItems= ruleJobNeedsItems EOF ;
    public final EObject entryRuleJobNeedsItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobNeedsItems = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2825:54: (iv_ruleJobNeedsItems= ruleJobNeedsItems EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2826:2: iv_ruleJobNeedsItems= ruleJobNeedsItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJobNeedsItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJobNeedsItems=ruleJobNeedsItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJobNeedsItems; 
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
    // $ANTLR end "entryRuleJobNeedsItems"


    // $ANTLR start "ruleJobNeedsItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2832:1: ruleJobNeedsItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleJobNeedsItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2838:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2839:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2839:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2840:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2840:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2841:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJobNeedsItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getJobNeedsItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleJobNeedsItems"


    // $ANTLR start "entryRulePermissions_45event"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2861:1: entryRulePermissions_45event returns [EObject current=null] : iv_rulePermissions_45event= rulePermissions_45event EOF ;
    public final EObject entryRulePermissions_45event() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45event = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2861:60: (iv_rulePermissions_45event= rulePermissions_45event EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2862:2: iv_rulePermissions_45event= rulePermissions_45event EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45event=rulePermissions_45event();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45event; 
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
    // $ANTLR end "entryRulePermissions_45event"


    // $ANTLR start "rulePermissions_45event"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2868:1: rulePermissions_45event returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject rulePermissions_45event() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_permissions_45event_2_0 = null;

        EObject lv_permissions_45event_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2874:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2875:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2875:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2876:3: () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2876:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2877:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPermissions_45eventAccess().getPermissions_45eventAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2887:3: ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RepositoryProjects && LA31_0<=PullRequests)||(LA31_0>=Deployments && LA31_0<=Discussions)||(LA31_0>=Contents && LA31_0<=Statuses)||LA31_0==Actions||(LA31_0>=Checks && LA31_0<=Issues)||LA31_0==Pages) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2888:4: ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2888:4: ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2889:5: (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2889:5: (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2890:6: lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventPermissions_45eventPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_permissions_45event_2_0=rulePermissions_45eventPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPermissions_45eventRule());
                      						}
                      						add(
                      							current,
                      							"permissions_45event",
                      							lv_permissions_45event_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45eventPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2907:4: (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==Comma) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2908:5: otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getPermissions_45eventAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2912:5: ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2913:6: (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2913:6: (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2914:7: lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventPermissions_45eventPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_permissions_45event_4_0=rulePermissions_45eventPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPermissions_45eventRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"permissions_45event",
                    	      								lv_permissions_45event_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45eventPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPermissions_45eventAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "rulePermissions_45event"


    // $ANTLR start "entryRulePermissions_45eventActions"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2941:1: entryRulePermissions_45eventActions returns [EObject current=null] : iv_rulePermissions_45eventActions= rulePermissions_45eventActions EOF ;
    public final EObject entryRulePermissions_45eventActions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventActions = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2941:67: (iv_rulePermissions_45eventActions= rulePermissions_45eventActions EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2942:2: iv_rulePermissions_45eventActions= rulePermissions_45eventActions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventActionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventActions=rulePermissions_45eventActions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventActions; 
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
    // $ANTLR end "entryRulePermissions_45eventActions"


    // $ANTLR start "rulePermissions_45eventActions"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2948:1: rulePermissions_45eventActions returns [EObject current=null] : (otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2954:2: ( (otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2955:2: (otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2955:2: (otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2956:3: otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Actions,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventActionsAccess().getActionsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventActionsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2964:3: ( (lv_actions_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2965:4: (lv_actions_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2965:4: (lv_actions_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2966:5: lv_actions_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventActionsAccess().getActionsPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_actions_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventActionsRule());
              					}
              					set(
              						current,
              						"actions",
              						lv_actions_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventActions"


    // $ANTLR start "entryRulePermissions_45eventChecks"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2987:1: entryRulePermissions_45eventChecks returns [EObject current=null] : iv_rulePermissions_45eventChecks= rulePermissions_45eventChecks EOF ;
    public final EObject entryRulePermissions_45eventChecks() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventChecks = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2987:66: (iv_rulePermissions_45eventChecks= rulePermissions_45eventChecks EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2988:2: iv_rulePermissions_45eventChecks= rulePermissions_45eventChecks EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventChecksRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventChecks=rulePermissions_45eventChecks();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventChecks; 
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
    // $ANTLR end "entryRulePermissions_45eventChecks"


    // $ANTLR start "rulePermissions_45eventChecks"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:2994:1: rulePermissions_45eventChecks returns [EObject current=null] : (otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventChecks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_checks_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3000:2: ( (otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3001:2: (otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3001:2: (otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3002:3: otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Checks,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventChecksAccess().getChecksKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventChecksAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3010:3: ( (lv_checks_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3011:4: (lv_checks_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3011:4: (lv_checks_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3012:5: lv_checks_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventChecksAccess().getChecksPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_checks_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventChecksRule());
              					}
              					set(
              						current,
              						"checks",
              						lv_checks_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventChecks"


    // $ANTLR start "entryRulePermissions_45eventContents"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3033:1: entryRulePermissions_45eventContents returns [EObject current=null] : iv_rulePermissions_45eventContents= rulePermissions_45eventContents EOF ;
    public final EObject entryRulePermissions_45eventContents() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventContents = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3033:68: (iv_rulePermissions_45eventContents= rulePermissions_45eventContents EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3034:2: iv_rulePermissions_45eventContents= rulePermissions_45eventContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventContentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventContents=rulePermissions_45eventContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventContents; 
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
    // $ANTLR end "entryRulePermissions_45eventContents"


    // $ANTLR start "rulePermissions_45eventContents"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3040:1: rulePermissions_45eventContents returns [EObject current=null] : (otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventContents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_contents_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3046:2: ( (otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3047:2: (otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3047:2: (otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3048:3: otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Contents,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventContentsAccess().getContentsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventContentsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3056:3: ( (lv_contents_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3057:4: (lv_contents_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3057:4: (lv_contents_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3058:5: lv_contents_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventContentsAccess().getContentsPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_contents_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventContentsRule());
              					}
              					set(
              						current,
              						"contents",
              						lv_contents_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventContents"


    // $ANTLR start "entryRulePermissions_45eventDeployments"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3079:1: entryRulePermissions_45eventDeployments returns [EObject current=null] : iv_rulePermissions_45eventDeployments= rulePermissions_45eventDeployments EOF ;
    public final EObject entryRulePermissions_45eventDeployments() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventDeployments = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3079:71: (iv_rulePermissions_45eventDeployments= rulePermissions_45eventDeployments EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3080:2: iv_rulePermissions_45eventDeployments= rulePermissions_45eventDeployments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventDeploymentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventDeployments=rulePermissions_45eventDeployments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventDeployments; 
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
    // $ANTLR end "entryRulePermissions_45eventDeployments"


    // $ANTLR start "rulePermissions_45eventDeployments"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3086:1: rulePermissions_45eventDeployments returns [EObject current=null] : (otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventDeployments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_deployments_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3092:2: ( (otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3093:2: (otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3093:2: (otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3094:3: otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Deployments,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventDeploymentsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3102:3: ( (lv_deployments_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3103:4: (lv_deployments_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3103:4: (lv_deployments_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3104:5: lv_deployments_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_deployments_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventDeploymentsRule());
              					}
              					set(
              						current,
              						"deployments",
              						lv_deployments_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventDeployments"


    // $ANTLR start "entryRulePermissions_45eventDiscussions"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3125:1: entryRulePermissions_45eventDiscussions returns [EObject current=null] : iv_rulePermissions_45eventDiscussions= rulePermissions_45eventDiscussions EOF ;
    public final EObject entryRulePermissions_45eventDiscussions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventDiscussions = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3125:71: (iv_rulePermissions_45eventDiscussions= rulePermissions_45eventDiscussions EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3126:2: iv_rulePermissions_45eventDiscussions= rulePermissions_45eventDiscussions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventDiscussionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventDiscussions=rulePermissions_45eventDiscussions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventDiscussions; 
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
    // $ANTLR end "entryRulePermissions_45eventDiscussions"


    // $ANTLR start "rulePermissions_45eventDiscussions"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3132:1: rulePermissions_45eventDiscussions returns [EObject current=null] : (otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventDiscussions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_discussions_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3138:2: ( (otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3139:2: (otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3139:2: (otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3140:3: otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Discussions,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventDiscussionsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3148:3: ( (lv_discussions_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3149:4: (lv_discussions_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3149:4: (lv_discussions_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3150:5: lv_discussions_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_discussions_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventDiscussionsRule());
              					}
              					set(
              						current,
              						"discussions",
              						lv_discussions_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventDiscussions"


    // $ANTLR start "entryRulePermissions_45eventId_45token"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3171:1: entryRulePermissions_45eventId_45token returns [EObject current=null] : iv_rulePermissions_45eventId_45token= rulePermissions_45eventId_45token EOF ;
    public final EObject entryRulePermissions_45eventId_45token() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventId_45token = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3171:70: (iv_rulePermissions_45eventId_45token= rulePermissions_45eventId_45token EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3172:2: iv_rulePermissions_45eventId_45token= rulePermissions_45eventId_45token EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventId_45tokenRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventId_45token=rulePermissions_45eventId_45token();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventId_45token; 
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
    // $ANTLR end "entryRulePermissions_45eventId_45token"


    // $ANTLR start "rulePermissions_45eventId_45token"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3178:1: rulePermissions_45eventId_45token returns [EObject current=null] : (otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventId_45token() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_id_45token_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3184:2: ( (otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3185:2: (otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3185:2: (otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3186:3: otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,IdToken,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventId_45tokenAccess().getIdTokenKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventId_45tokenAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3194:3: ( (lv_id_45token_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3195:4: (lv_id_45token_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3195:4: (lv_id_45token_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3196:5: lv_id_45token_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventId_45tokenAccess().getId_45tokenPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_id_45token_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventId_45tokenRule());
              					}
              					set(
              						current,
              						"id_45token",
              						lv_id_45token_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventId_45token"


    // $ANTLR start "entryRulePermissions_45eventIssues"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3217:1: entryRulePermissions_45eventIssues returns [EObject current=null] : iv_rulePermissions_45eventIssues= rulePermissions_45eventIssues EOF ;
    public final EObject entryRulePermissions_45eventIssues() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventIssues = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3217:66: (iv_rulePermissions_45eventIssues= rulePermissions_45eventIssues EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3218:2: iv_rulePermissions_45eventIssues= rulePermissions_45eventIssues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventIssuesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventIssues=rulePermissions_45eventIssues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventIssues; 
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
    // $ANTLR end "entryRulePermissions_45eventIssues"


    // $ANTLR start "rulePermissions_45eventIssues"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3224:1: rulePermissions_45eventIssues returns [EObject current=null] : (otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventIssues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_issues_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3230:2: ( (otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3231:2: (otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3231:2: (otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3232:3: otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Issues,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventIssuesAccess().getIssuesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventIssuesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3240:3: ( (lv_issues_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3241:4: (lv_issues_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3241:4: (lv_issues_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3242:5: lv_issues_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventIssuesAccess().getIssuesPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_issues_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventIssuesRule());
              					}
              					set(
              						current,
              						"issues",
              						lv_issues_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventIssues"


    // $ANTLR start "entryRulePermissions_45eventPackages"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3263:1: entryRulePermissions_45eventPackages returns [EObject current=null] : iv_rulePermissions_45eventPackages= rulePermissions_45eventPackages EOF ;
    public final EObject entryRulePermissions_45eventPackages() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventPackages = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3263:68: (iv_rulePermissions_45eventPackages= rulePermissions_45eventPackages EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3264:2: iv_rulePermissions_45eventPackages= rulePermissions_45eventPackages EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventPackagesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventPackages=rulePermissions_45eventPackages();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventPackages; 
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
    // $ANTLR end "entryRulePermissions_45eventPackages"


    // $ANTLR start "rulePermissions_45eventPackages"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3270:1: rulePermissions_45eventPackages returns [EObject current=null] : (otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventPackages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_packages_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3276:2: ( (otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3277:2: (otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3277:2: (otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3278:3: otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Packages,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventPackagesAccess().getPackagesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventPackagesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3286:3: ( (lv_packages_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3287:4: (lv_packages_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3287:4: (lv_packages_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3288:5: lv_packages_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventPackagesAccess().getPackagesPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_packages_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventPackagesRule());
              					}
              					set(
              						current,
              						"packages",
              						lv_packages_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventPackages"


    // $ANTLR start "entryRulePermissions_45eventPages"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3309:1: entryRulePermissions_45eventPages returns [EObject current=null] : iv_rulePermissions_45eventPages= rulePermissions_45eventPages EOF ;
    public final EObject entryRulePermissions_45eventPages() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventPages = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3309:65: (iv_rulePermissions_45eventPages= rulePermissions_45eventPages EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3310:2: iv_rulePermissions_45eventPages= rulePermissions_45eventPages EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventPagesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventPages=rulePermissions_45eventPages();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventPages; 
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
    // $ANTLR end "entryRulePermissions_45eventPages"


    // $ANTLR start "rulePermissions_45eventPages"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3316:1: rulePermissions_45eventPages returns [EObject current=null] : (otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventPages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pages_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3322:2: ( (otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3323:2: (otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3323:2: (otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3324:3: otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Pages,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventPagesAccess().getPagesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventPagesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3332:3: ( (lv_pages_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3333:4: (lv_pages_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3333:4: (lv_pages_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3334:5: lv_pages_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventPagesAccess().getPagesPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pages_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventPagesRule());
              					}
              					set(
              						current,
              						"pages",
              						lv_pages_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventPages"


    // $ANTLR start "entryRulePermissions_45eventPull_45requests"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3355:1: entryRulePermissions_45eventPull_45requests returns [EObject current=null] : iv_rulePermissions_45eventPull_45requests= rulePermissions_45eventPull_45requests EOF ;
    public final EObject entryRulePermissions_45eventPull_45requests() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventPull_45requests = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3355:75: (iv_rulePermissions_45eventPull_45requests= rulePermissions_45eventPull_45requests EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3356:2: iv_rulePermissions_45eventPull_45requests= rulePermissions_45eventPull_45requests EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventPull_45requestsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventPull_45requests=rulePermissions_45eventPull_45requests();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventPull_45requests; 
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
    // $ANTLR end "entryRulePermissions_45eventPull_45requests"


    // $ANTLR start "rulePermissions_45eventPull_45requests"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3362:1: rulePermissions_45eventPull_45requests returns [EObject current=null] : (otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventPull_45requests() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pull_45requests_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3368:2: ( (otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3369:2: (otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3369:2: (otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3370:3: otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,PullRequests,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventPull_45requestsAccess().getPullRequestsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventPull_45requestsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3378:3: ( (lv_pull_45requests_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3379:4: (lv_pull_45requests_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3379:4: (lv_pull_45requests_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3380:5: lv_pull_45requests_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventPull_45requestsAccess().getPull_45requestsPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_pull_45requests_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventPull_45requestsRule());
              					}
              					set(
              						current,
              						"pull_45requests",
              						lv_pull_45requests_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventPull_45requests"


    // $ANTLR start "entryRulePermissions_45eventRepository_45projects"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3401:1: entryRulePermissions_45eventRepository_45projects returns [EObject current=null] : iv_rulePermissions_45eventRepository_45projects= rulePermissions_45eventRepository_45projects EOF ;
    public final EObject entryRulePermissions_45eventRepository_45projects() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventRepository_45projects = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3401:81: (iv_rulePermissions_45eventRepository_45projects= rulePermissions_45eventRepository_45projects EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3402:2: iv_rulePermissions_45eventRepository_45projects= rulePermissions_45eventRepository_45projects EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventRepository_45projectsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventRepository_45projects=rulePermissions_45eventRepository_45projects();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventRepository_45projects; 
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
    // $ANTLR end "entryRulePermissions_45eventRepository_45projects"


    // $ANTLR start "rulePermissions_45eventRepository_45projects"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3408:1: rulePermissions_45eventRepository_45projects returns [EObject current=null] : (otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventRepository_45projects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_repository_45projects_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3414:2: ( (otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3415:2: (otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3415:2: (otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3416:3: otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,RepositoryProjects,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepositoryProjectsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventRepository_45projectsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3424:3: ( (lv_repository_45projects_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3425:4: (lv_repository_45projects_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3425:4: (lv_repository_45projects_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3426:5: lv_repository_45projects_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepository_45projectsPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_repository_45projects_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventRepository_45projectsRule());
              					}
              					set(
              						current,
              						"repository_45projects",
              						lv_repository_45projects_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventRepository_45projects"


    // $ANTLR start "entryRulePermissions_45eventSecurity_45events"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3447:1: entryRulePermissions_45eventSecurity_45events returns [EObject current=null] : iv_rulePermissions_45eventSecurity_45events= rulePermissions_45eventSecurity_45events EOF ;
    public final EObject entryRulePermissions_45eventSecurity_45events() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventSecurity_45events = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3447:77: (iv_rulePermissions_45eventSecurity_45events= rulePermissions_45eventSecurity_45events EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3448:2: iv_rulePermissions_45eventSecurity_45events= rulePermissions_45eventSecurity_45events EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventSecurity_45eventsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventSecurity_45events=rulePermissions_45eventSecurity_45events();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventSecurity_45events; 
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
    // $ANTLR end "entryRulePermissions_45eventSecurity_45events"


    // $ANTLR start "rulePermissions_45eventSecurity_45events"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3454:1: rulePermissions_45eventSecurity_45events returns [EObject current=null] : (otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventSecurity_45events() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_security_45events_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3460:2: ( (otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3461:2: (otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3461:2: (otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3462:3: otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,SecurityEvents,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurityEventsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3470:3: ( (lv_security_45events_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3471:4: (lv_security_45events_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3471:4: (lv_security_45events_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3472:5: lv_security_45events_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurity_45eventsPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_security_45events_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventSecurity_45eventsRule());
              					}
              					set(
              						current,
              						"security_45events",
              						lv_security_45events_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventSecurity_45events"


    // $ANTLR start "entryRulePermissions_45eventStatuses"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3493:1: entryRulePermissions_45eventStatuses returns [EObject current=null] : iv_rulePermissions_45eventStatuses= rulePermissions_45eventStatuses EOF ;
    public final EObject entryRulePermissions_45eventStatuses() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventStatuses = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3493:68: (iv_rulePermissions_45eventStatuses= rulePermissions_45eventStatuses EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3494:2: iv_rulePermissions_45eventStatuses= rulePermissions_45eventStatuses EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45eventStatusesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventStatuses=rulePermissions_45eventStatuses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45eventStatuses; 
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
    // $ANTLR end "entryRulePermissions_45eventStatuses"


    // $ANTLR start "rulePermissions_45eventStatuses"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3500:1: rulePermissions_45eventStatuses returns [EObject current=null] : (otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventStatuses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_statuses_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3506:2: ( (otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3507:2: (otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3507:2: (otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3508:3: otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Statuses,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventStatusesAccess().getStatusesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventStatusesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3516:3: ( (lv_statuses_2_0= rulePermissions_45level ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3517:4: (lv_statuses_2_0= rulePermissions_45level )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3517:4: (lv_statuses_2_0= rulePermissions_45level )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3518:5: lv_statuses_2_0= rulePermissions_45level
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissions_45eventStatusesAccess().getStatusesPermissions_45levelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_statuses_2_0=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissions_45eventStatusesRule());
              					}
              					set(
              						current,
              						"statuses",
              						lv_statuses_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventStatuses"


    // $ANTLR start "entryRulePermissions_45level"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3539:1: entryRulePermissions_45level returns [EObject current=null] : iv_rulePermissions_45level= rulePermissions_45level EOF ;
    public final EObject entryRulePermissions_45level() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45level = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3539:60: (iv_rulePermissions_45level= rulePermissions_45level EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3540:2: iv_rulePermissions_45level= rulePermissions_45level EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissions_45levelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45level=rulePermissions_45level();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions_45level; 
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
    // $ANTLR end "entryRulePermissions_45level"


    // $ANTLR start "rulePermissions_45level"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3546:1: rulePermissions_45level returns [EObject current=null] : ( (lv_permissions_45level_0_0= ruleJsonDocument ) ) ;
    public final EObject rulePermissions_45level() throws RecognitionException {
        EObject current = null;

        EObject lv_permissions_45level_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3552:2: ( ( (lv_permissions_45level_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3553:2: ( (lv_permissions_45level_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3553:2: ( (lv_permissions_45level_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3554:3: (lv_permissions_45level_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3554:3: (lv_permissions_45level_0_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3555:4: lv_permissions_45level_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPermissions_45levelAccess().getPermissions_45levelJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_permissions_45level_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPermissions_45levelRule());
              				}
              				set(
              					current,
              					"permissions_45level",
              					lv_permissions_45level_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "rulePermissions_45level"


    // $ANTLR start "entryRuleReusableWorkflowCallJobIfTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3575:1: entryRuleReusableWorkflowCallJobIfTypeBoolean returns [EObject current=null] : iv_ruleReusableWorkflowCallJobIfTypeBoolean= ruleReusableWorkflowCallJobIfTypeBoolean EOF ;
    public final EObject entryRuleReusableWorkflowCallJobIfTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobIfTypeBoolean = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3575:77: (iv_ruleReusableWorkflowCallJobIfTypeBoolean= ruleReusableWorkflowCallJobIfTypeBoolean EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3576:2: iv_ruleReusableWorkflowCallJobIfTypeBoolean= ruleReusableWorkflowCallJobIfTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobIfTypeBoolean=ruleReusableWorkflowCallJobIfTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobIfTypeBoolean; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobIfTypeBoolean"


    // $ANTLR start "ruleReusableWorkflowCallJobIfTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3582:1: ruleReusableWorkflowCallJobIfTypeBoolean returns [EObject current=null] : (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobIfTypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_if__2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3588:2: ( (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3589:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3589:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3590:3: otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobIfTypeBooleanAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobIfTypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3598:3: ( (lv_if__2_0= ruleEBooleanObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3599:4: (lv_if__2_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3599:4: (lv_if__2_0= ruleEBooleanObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3600:5: lv_if__2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfTypeBooleanAccess().getIf_EBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_if__2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobIfTypeBooleanRule());
              					}
              					set(
              						current,
              						"if_",
              						lv_if__2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBooleanObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobIfTypeBoolean"


    // $ANTLR start "entryRuleReusableWorkflowCallJobIfTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3621:1: entryRuleReusableWorkflowCallJobIfTypeNumber returns [EObject current=null] : iv_ruleReusableWorkflowCallJobIfTypeNumber= ruleReusableWorkflowCallJobIfTypeNumber EOF ;
    public final EObject entryRuleReusableWorkflowCallJobIfTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobIfTypeNumber = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3621:76: (iv_ruleReusableWorkflowCallJobIfTypeNumber= ruleReusableWorkflowCallJobIfTypeNumber EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3622:2: iv_ruleReusableWorkflowCallJobIfTypeNumber= ruleReusableWorkflowCallJobIfTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobIfTypeNumber=ruleReusableWorkflowCallJobIfTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobIfTypeNumber; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobIfTypeNumber"


    // $ANTLR start "ruleReusableWorkflowCallJobIfTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3628:1: ruleReusableWorkflowCallJobIfTypeNumber returns [EObject current=null] : (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobIfTypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_if__2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3634:2: ( (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3635:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3635:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3636:3: otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobIfTypeNumberAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobIfTypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3644:3: ( (lv_if__2_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3645:4: (lv_if__2_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3645:4: (lv_if__2_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3646:5: lv_if__2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfTypeNumberAccess().getIf_EDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_if__2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobIfTypeNumberRule());
              					}
              					set(
              						current,
              						"if_",
              						lv_if__2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobIfTypeNumber"


    // $ANTLR start "entryRuleReusableWorkflowCallJobIfTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3667:1: entryRuleReusableWorkflowCallJobIfTypeString returns [EObject current=null] : iv_ruleReusableWorkflowCallJobIfTypeString= ruleReusableWorkflowCallJobIfTypeString EOF ;
    public final EObject entryRuleReusableWorkflowCallJobIfTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobIfTypeString = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3667:76: (iv_ruleReusableWorkflowCallJobIfTypeString= ruleReusableWorkflowCallJobIfTypeString EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3668:2: iv_ruleReusableWorkflowCallJobIfTypeString= ruleReusableWorkflowCallJobIfTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobIfTypeString=ruleReusableWorkflowCallJobIfTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobIfTypeString; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobIfTypeString"


    // $ANTLR start "ruleReusableWorkflowCallJobIfTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3674:1: ruleReusableWorkflowCallJobIfTypeString returns [EObject current=null] : (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobIfTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_if__2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3680:2: ( (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3681:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3681:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3682:3: otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobIfTypeStringAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobIfTypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3690:3: ( (lv_if__2_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3691:4: (lv_if__2_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3691:4: (lv_if__2_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3692:5: lv_if__2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobIfTypeStringAccess().getIf_EStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_if__2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobIfTypeStringRule());
              					}
              					set(
              						current,
              						"if_",
              						lv_if__2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleReusableWorkflowCallJobIfTypeString"


    // $ANTLR start "entryRuleEnv"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3713:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3713:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3714:2: iv_ruleEnv= ruleEnv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnv=ruleEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnv; 
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
    // $ANTLR end "entryRuleEnv"


    // $ANTLR start "ruleEnv"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3720:1: ruleEnv returns [EObject current=null] : ( (lv_env_0_0= ruleEnvAbstract ) ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3726:2: ( ( (lv_env_0_0= ruleEnvAbstract ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3727:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3727:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3728:3: (lv_env_0_0= ruleEnvAbstract )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3728:3: (lv_env_0_0= ruleEnvAbstract )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3729:4: lv_env_0_0= ruleEnvAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvAccess().getEnvEnvAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEnvAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EnvAbstract");
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
    // $ANTLR end "ruleEnv"


    // $ANTLR start "entryRuleEnvTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3749:1: entryRuleEnvTypeString returns [EObject current=null] : iv_ruleEnvTypeString= ruleEnvTypeString EOF ;
    public final EObject entryRuleEnvTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeString = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3749:54: (iv_ruleEnvTypeString= ruleEnvTypeString EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3750:2: iv_ruleEnvTypeString= ruleEnvTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeString=ruleEnvTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeString; 
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
    // $ANTLR end "entryRuleEnvTypeString"


    // $ANTLR start "ruleEnvTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3756:1: ruleEnvTypeString returns [EObject current=null] : ( (lv_env_0_0= ruleEString ) ) ;
    public final EObject ruleEnvTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3762:2: ( ( (lv_env_0_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3763:2: ( (lv_env_0_0= ruleEString ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3763:2: ( (lv_env_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3764:3: (lv_env_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3764:3: (lv_env_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3765:4: lv_env_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeStringAccess().getEnvEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeStringRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleEnvTypeString"


    // $ANTLR start "entryRuleEnvTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3785:1: entryRuleEnvTypeInteger returns [EObject current=null] : iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF ;
    public final EObject entryRuleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeInteger = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3785:55: (iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3786:2: iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeInteger=ruleEnvTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeInteger; 
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
    // $ANTLR end "entryRuleEnvTypeInteger"


    // $ANTLR start "ruleEnvTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3792:1: ruleEnvTypeInteger returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3798:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3799:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3799:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3800:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3800:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3801:4: lv_env_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeIntegerAccess().getEnvEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeIntegerRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleEnvTypeInteger"


    // $ANTLR start "entryRuleEnvTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3821:1: entryRuleEnvTypeNumber returns [EObject current=null] : iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF ;
    public final EObject entryRuleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNumber = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3821:54: (iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3822:2: iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeNumber=ruleEnvTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeNumber; 
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
    // $ANTLR end "entryRuleEnvTypeNumber"


    // $ANTLR start "ruleEnvTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3828:1: ruleEnvTypeNumber returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3834:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3835:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3835:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3836:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3836:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3837:4: lv_env_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeNumberAccess().getEnvEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeNumberRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleEnvTypeNumber"


    // $ANTLR start "entryRuleEnvTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3857:1: entryRuleEnvTypeBoolean returns [EObject current=null] : iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF ;
    public final EObject entryRuleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeBoolean = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3857:55: (iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3858:2: iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeBoolean=ruleEnvTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeBoolean; 
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
    // $ANTLR end "entryRuleEnvTypeBoolean"


    // $ANTLR start "ruleEnvTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3864:1: ruleEnvTypeBoolean returns [EObject current=null] : ( (lv_env_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3870:2: ( ( (lv_env_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3871:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3871:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3872:3: (lv_env_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3872:3: (lv_env_0_0= ruleEBooleanObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3873:4: lv_env_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeBooleanAccess().getEnvEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeBooleanRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBooleanObject");
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
    // $ANTLR end "ruleEnvTypeBoolean"


    // $ANTLR start "entryRuleEnvTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3893:1: entryRuleEnvTypeObject returns [EObject current=null] : iv_ruleEnvTypeObject= ruleEnvTypeObject EOF ;
    public final EObject entryRuleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeObject = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3893:54: (iv_ruleEnvTypeObject= ruleEnvTypeObject EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3894:2: iv_ruleEnvTypeObject= ruleEnvTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeObject=ruleEnvTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeObject; 
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
    // $ANTLR end "entryRuleEnvTypeObject"


    // $ANTLR start "ruleEnvTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3900:1: ruleEnvTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3906:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3907:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3907:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3908:3: () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3908:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3909:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvTypeObjectAccess().getEnvTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3919:3: ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RepositoryProjects && LA33_0<=With)||LA33_0==If||LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3920:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3920:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3921:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3921:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3922:6: lv_env_2_0= ruleEnvPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvTypeObjectAccess().getEnvEnvPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_env_2_0=ruleEnvPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnvTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"env",
                      							lv_env_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EnvPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3939:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Comma) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3940:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3944:5: ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3945:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3945:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3946:7: lv_env_4_0= ruleEnvPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvTypeObjectAccess().getEnvEnvPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_env_4_0=ruleEnvPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnvTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"env",
                    	      								lv_env_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EnvPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEnvTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleEnvTypeObject"


    // $ANTLR start "entryRuleEnvTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3973:1: entryRuleEnvTypeArray returns [EObject current=null] : iv_ruleEnvTypeArray= ruleEnvTypeArray EOF ;
    public final EObject entryRuleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeArray = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3973:53: (iv_ruleEnvTypeArray= ruleEnvTypeArray EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3974:2: iv_ruleEnvTypeArray= ruleEnvTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeArray=ruleEnvTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeArray; 
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
    // $ANTLR end "entryRuleEnvTypeArray"


    // $ANTLR start "ruleEnvTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3980:1: ruleEnvTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3986:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3987:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3987:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3988:3: () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3988:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3989:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvTypeArrayAccess().getEnvTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:3999:3: ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RepositoryProjects && LA35_0<=True)||LA35_0==LeftSquareBracket||LA35_0==LeftCurlyBracket||(LA35_0>=RULE_STRING && LA35_0<=RULE_E_DOUBLE)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4000:4: ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4000:4: ( (lv_env_2_0= ruleEnvItems ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4001:5: (lv_env_2_0= ruleEnvItems )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4001:5: (lv_env_2_0= ruleEnvItems )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4002:6: lv_env_2_0= ruleEnvItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_env_2_0=ruleEnvItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnvTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"env",
                      							lv_env_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EnvItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4019:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==Comma) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4020:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4024:5: ( (lv_env_4_0= ruleEnvItems ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4025:6: (lv_env_4_0= ruleEnvItems )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4025:6: (lv_env_4_0= ruleEnvItems )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4026:7: lv_env_4_0= ruleEnvItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_env_4_0=ruleEnvItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnvTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"env",
                    	      								lv_env_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EnvItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEnvTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleEnvTypeArray"


    // $ANTLR start "entryRuleEnvTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4053:1: entryRuleEnvTypeNull returns [EObject current=null] : iv_ruleEnvTypeNull= ruleEnvTypeNull EOF ;
    public final EObject entryRuleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNull = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4053:52: (iv_ruleEnvTypeNull= ruleEnvTypeNull EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4054:2: iv_ruleEnvTypeNull= ruleEnvTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeNull=ruleEnvTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeNull; 
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
    // $ANTLR end "entryRuleEnvTypeNull"


    // $ANTLR start "ruleEnvTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4060:1: ruleEnvTypeNull returns [EObject current=null] : ( (lv_env_0_0= ruleNullValue ) ) ;
    public final EObject ruleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4066:2: ( ( (lv_env_0_0= ruleNullValue ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4067:2: ( (lv_env_0_0= ruleNullValue ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4067:2: ( (lv_env_0_0= ruleNullValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4068:3: (lv_env_0_0= ruleNullValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4068:3: (lv_env_0_0= ruleNullValue )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4069:4: lv_env_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeNullAccess().getEnvNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeNullRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.NullValue");
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
    // $ANTLR end "ruleEnvTypeNull"


    // $ANTLR start "entryRuleEnvAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4089:1: entryRuleEnvAdditionalProperties returns [EObject current=null] : iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF ;
    public final EObject entryRuleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAdditionalProperties = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4089:64: (iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4090:2: iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvAdditionalProperties=ruleEnvAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvAdditionalProperties; 
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
    // $ANTLR end "entryRuleEnvAdditionalProperties"


    // $ANTLR start "ruleEnvAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4096:1: ruleEnvAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4102:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4103:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4103:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4104:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4104:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4105:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4105:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4106:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnvAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnvAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4127:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4128:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4128:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4129:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnvAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnvAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleEnvAdditionalProperties"


    // $ANTLR start "entryRuleEnvItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4150:1: entryRuleEnvItems returns [EObject current=null] : iv_ruleEnvItems= ruleEnvItems EOF ;
    public final EObject entryRuleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvItems = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4150:49: (iv_ruleEnvItems= ruleEnvItems EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4151:2: iv_ruleEnvItems= ruleEnvItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvItems=ruleEnvItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvItems; 
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
    // $ANTLR end "entryRuleEnvItems"


    // $ANTLR start "ruleEnvItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4157:1: ruleEnvItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4163:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4164:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4164:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4165:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4165:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4166:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleEnvItems"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4186:1: entryRuleReusableWorkflowCallJobSecretsTypeString returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsTypeString= ruleReusableWorkflowCallJobSecretsTypeString EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsTypeString = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4186:81: (iv_ruleReusableWorkflowCallJobSecretsTypeString= ruleReusableWorkflowCallJobSecretsTypeString EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4187:2: iv_ruleReusableWorkflowCallJobSecretsTypeString= ruleReusableWorkflowCallJobSecretsTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsTypeString=ruleReusableWorkflowCallJobSecretsTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsTypeString; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsTypeString"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4193:1: ruleReusableWorkflowCallJobSecretsTypeString returns [EObject current=null] : (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEString ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_secrets_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4199:2: ( (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEString ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4200:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEString ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4200:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4201:3: otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Secrets,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobSecretsTypeStringAccess().getSecretsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobSecretsTypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4209:3: ( (lv_secrets_2_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4210:4: (lv_secrets_2_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4210:4: (lv_secrets_2_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4211:5: lv_secrets_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeStringAccess().getSecretsEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_secrets_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsTypeStringRule());
              					}
              					set(
              						current,
              						"secrets",
              						lv_secrets_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsTypeString"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4232:1: entryRuleReusableWorkflowCallJobSecretsTypeInteger returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsTypeInteger= ruleReusableWorkflowCallJobSecretsTypeInteger EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsTypeInteger = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4232:82: (iv_ruleReusableWorkflowCallJobSecretsTypeInteger= ruleReusableWorkflowCallJobSecretsTypeInteger EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4233:2: iv_ruleReusableWorkflowCallJobSecretsTypeInteger= ruleReusableWorkflowCallJobSecretsTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsTypeInteger=ruleReusableWorkflowCallJobSecretsTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsTypeInteger; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsTypeInteger"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4239:1: ruleReusableWorkflowCallJobSecretsTypeInteger returns [EObject current=null] : (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsTypeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_secrets_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4245:2: ( (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4246:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4246:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4247:3: otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,Secrets,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobSecretsTypeIntegerAccess().getSecretsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobSecretsTypeIntegerAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4255:3: ( (lv_secrets_2_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4256:4: (lv_secrets_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4256:4: (lv_secrets_2_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4257:5: lv_secrets_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeIntegerAccess().getSecretsEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_secrets_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsTypeIntegerRule());
              					}
              					set(
              						current,
              						"secrets",
              						lv_secrets_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsTypeInteger"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4278:1: entryRuleReusableWorkflowCallJobSecretsTypeNumber returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsTypeNumber= ruleReusableWorkflowCallJobSecretsTypeNumber EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsTypeNumber = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4278:81: (iv_ruleReusableWorkflowCallJobSecretsTypeNumber= ruleReusableWorkflowCallJobSecretsTypeNumber EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4279:2: iv_ruleReusableWorkflowCallJobSecretsTypeNumber= ruleReusableWorkflowCallJobSecretsTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsTypeNumber=ruleReusableWorkflowCallJobSecretsTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsTypeNumber; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsTypeNumber"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4285:1: ruleReusableWorkflowCallJobSecretsTypeNumber returns [EObject current=null] : (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsTypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_secrets_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4291:2: ( (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4292:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4292:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4293:3: otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,Secrets,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobSecretsTypeNumberAccess().getSecretsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobSecretsTypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4301:3: ( (lv_secrets_2_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4302:4: (lv_secrets_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4302:4: (lv_secrets_2_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4303:5: lv_secrets_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeNumberAccess().getSecretsEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_secrets_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsTypeNumberRule());
              					}
              					set(
              						current,
              						"secrets",
              						lv_secrets_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsTypeNumber"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4324:1: entryRuleReusableWorkflowCallJobSecretsTypeBoolean returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsTypeBoolean= ruleReusableWorkflowCallJobSecretsTypeBoolean EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsTypeBoolean = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4324:82: (iv_ruleReusableWorkflowCallJobSecretsTypeBoolean= ruleReusableWorkflowCallJobSecretsTypeBoolean EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4325:2: iv_ruleReusableWorkflowCallJobSecretsTypeBoolean= ruleReusableWorkflowCallJobSecretsTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsTypeBoolean=ruleReusableWorkflowCallJobSecretsTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsTypeBoolean; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsTypeBoolean"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4331:1: ruleReusableWorkflowCallJobSecretsTypeBoolean returns [EObject current=null] : (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsTypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_secrets_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4337:2: ( (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEBooleanObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4338:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEBooleanObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4338:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4339:3: otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Secrets,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobSecretsTypeBooleanAccess().getSecretsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobSecretsTypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4347:3: ( (lv_secrets_2_0= ruleEBooleanObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4348:4: (lv_secrets_2_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4348:4: (lv_secrets_2_0= ruleEBooleanObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4349:5: lv_secrets_2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeBooleanAccess().getSecretsEBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_secrets_2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsTypeBooleanRule());
              					}
              					set(
              						current,
              						"secrets",
              						lv_secrets_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBooleanObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsTypeBoolean"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4370:1: entryRuleReusableWorkflowCallJobSecretsTypeObject returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsTypeObject= ruleReusableWorkflowCallJobSecretsTypeObject EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsTypeObject = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4370:81: (iv_ruleReusableWorkflowCallJobSecretsTypeObject= ruleReusableWorkflowCallJobSecretsTypeObject EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4371:2: iv_ruleReusableWorkflowCallJobSecretsTypeObject= ruleReusableWorkflowCallJobSecretsTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsTypeObject=ruleReusableWorkflowCallJobSecretsTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsTypeObject; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsTypeObject"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4377:1: ruleReusableWorkflowCallJobSecretsTypeObject returns [EObject current=null] : ( () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_secrets_4_0 = null;

        EObject lv_secrets_6_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4383:2: ( ( () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4384:2: ( () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4384:2: ( () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4385:3: () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4385:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4386:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectAccess().getReusableWorkflowCallJobSecretsTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Secrets,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectAccess().getSecretsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4404:3: ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RepositoryProjects && LA37_0<=With)||LA37_0==If||LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4405:4: ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4405:4: ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4406:5: (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4406:5: (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4407:6: lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectAccess().getSecretsReusableWorkflowCallJobSecretsPropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_secrets_4_0=ruleReusableWorkflowCallJobSecretsPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"secrets",
                      							lv_secrets_4_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobSecretsPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4424:4: (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==Comma) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4425:5: otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4429:5: ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4430:6: (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4430:6: (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4431:7: lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectAccess().getSecretsReusableWorkflowCallJobSecretsPropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_secrets_6_0=ruleReusableWorkflowCallJobSecretsPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"secrets",
                    	      								lv_secrets_6_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobSecretsPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getReusableWorkflowCallJobSecretsTypeObjectAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsTypeObject"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4458:1: entryRuleReusableWorkflowCallJobSecretsTypeArray returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsTypeArray= ruleReusableWorkflowCallJobSecretsTypeArray EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsTypeArray = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4458:80: (iv_ruleReusableWorkflowCallJobSecretsTypeArray= ruleReusableWorkflowCallJobSecretsTypeArray EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4459:2: iv_ruleReusableWorkflowCallJobSecretsTypeArray= ruleReusableWorkflowCallJobSecretsTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsTypeArray=ruleReusableWorkflowCallJobSecretsTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsTypeArray; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsTypeArray"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4465:1: ruleReusableWorkflowCallJobSecretsTypeArray returns [EObject current=null] : ( () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_secrets_4_0 = null;

        EObject lv_secrets_6_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4471:2: ( ( () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4472:2: ( () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4472:2: ( () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4473:3: () otherlv_1= Secrets otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4473:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4474:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayAccess().getReusableWorkflowCallJobSecretsTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Secrets,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayAccess().getSecretsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4492:3: ( ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RepositoryProjects && LA39_0<=True)||LA39_0==LeftSquareBracket||LA39_0==LeftCurlyBracket||(LA39_0>=RULE_STRING && LA39_0<=RULE_E_DOUBLE)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4493:4: ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems ) ) (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4493:4: ( (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4494:5: (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4494:5: (lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4495:6: lv_secrets_4_0= ruleReusableWorkflowCallJobSecretsItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayAccess().getSecretsReusableWorkflowCallJobSecretsItemsParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_secrets_4_0=ruleReusableWorkflowCallJobSecretsItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"secrets",
                      							lv_secrets_4_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobSecretsItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4512:4: (otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==Comma) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4513:5: otherlv_5= Comma ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4517:5: ( (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4518:6: (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4518:6: (lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4519:7: lv_secrets_6_0= ruleReusableWorkflowCallJobSecretsItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayAccess().getSecretsReusableWorkflowCallJobSecretsItemsParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_secrets_6_0=ruleReusableWorkflowCallJobSecretsItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"secrets",
                    	      								lv_secrets_6_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobSecretsItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getReusableWorkflowCallJobSecretsTypeArrayAccess().getRightSquareBracketKeyword_5());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsTypeArray"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4546:1: entryRuleReusableWorkflowCallJobSecretsTypeNull returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsTypeNull= ruleReusableWorkflowCallJobSecretsTypeNull EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsTypeNull = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4546:79: (iv_ruleReusableWorkflowCallJobSecretsTypeNull= ruleReusableWorkflowCallJobSecretsTypeNull EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4547:2: iv_ruleReusableWorkflowCallJobSecretsTypeNull= ruleReusableWorkflowCallJobSecretsTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsTypeNull=ruleReusableWorkflowCallJobSecretsTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsTypeNull; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsTypeNull"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4553:1: ruleReusableWorkflowCallJobSecretsTypeNull returns [EObject current=null] : (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleNullValue ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsTypeNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_secrets_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4559:2: ( (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleNullValue ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4560:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleNullValue ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4560:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleNullValue ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4561:3: otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleNullValue ) )
            {
            otherlv_0=(Token)match(input,Secrets,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobSecretsTypeNullAccess().getSecretsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobSecretsTypeNullAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4569:3: ( (lv_secrets_2_0= ruleNullValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4570:4: (lv_secrets_2_0= ruleNullValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4570:4: (lv_secrets_2_0= ruleNullValue )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4571:5: lv_secrets_2_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsTypeNullAccess().getSecretsNullValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_secrets_2_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsTypeNullRule());
              					}
              					set(
              						current,
              						"secrets",
              						lv_secrets_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.NullValue");
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsTypeNull"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4592:1: entryRuleReusableWorkflowCallJobSecretsAdditionalProperties returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsAdditionalProperties= ruleReusableWorkflowCallJobSecretsAdditionalProperties EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsAdditionalProperties = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4592:91: (iv_ruleReusableWorkflowCallJobSecretsAdditionalProperties= ruleReusableWorkflowCallJobSecretsAdditionalProperties EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4593:2: iv_ruleReusableWorkflowCallJobSecretsAdditionalProperties= ruleReusableWorkflowCallJobSecretsAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsAdditionalProperties=ruleReusableWorkflowCallJobSecretsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsAdditionalProperties; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsAdditionalProperties"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4599:1: ruleReusableWorkflowCallJobSecretsAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4605:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4606:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4606:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4607:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4607:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4608:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4608:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4609:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobSecretsAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4630:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4631:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4631:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4632:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsAdditionalProperties"


    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4653:1: entryRuleReusableWorkflowCallJobSecretsItems returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsItems= ruleReusableWorkflowCallJobSecretsItems EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsItems = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4653:76: (iv_ruleReusableWorkflowCallJobSecretsItems= ruleReusableWorkflowCallJobSecretsItems EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4654:2: iv_ruleReusableWorkflowCallJobSecretsItems= ruleReusableWorkflowCallJobSecretsItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsItems=ruleReusableWorkflowCallJobSecretsItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsItems; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsItems"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4660:1: ruleReusableWorkflowCallJobSecretsItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4666:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4667:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4667:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4668:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4668:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4669:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsItems"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrix"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4689:1: entryRuleReusableWorkflowCallJobStrategyMatrix returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrix= ruleReusableWorkflowCallJobStrategyMatrix EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrix = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4689:78: (iv_ruleReusableWorkflowCallJobStrategyMatrix= ruleReusableWorkflowCallJobStrategyMatrix EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4690:2: iv_ruleReusableWorkflowCallJobStrategyMatrix= ruleReusableWorkflowCallJobStrategyMatrix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrix=ruleReusableWorkflowCallJobStrategyMatrix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrix; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrix"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrix"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4696:1: ruleReusableWorkflowCallJobStrategyMatrix returns [EObject current=null] : ( (lv_matrix_0_0= ruleReusableWorkflowCallJobStrategyMatrixAbstract ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrix() throws RecognitionException {
        EObject current = null;

        EObject lv_matrix_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4702:2: ( ( (lv_matrix_0_0= ruleReusableWorkflowCallJobStrategyMatrixAbstract ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4703:2: ( (lv_matrix_0_0= ruleReusableWorkflowCallJobStrategyMatrixAbstract ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4703:2: ( (lv_matrix_0_0= ruleReusableWorkflowCallJobStrategyMatrixAbstract ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4704:3: (lv_matrix_0_0= ruleReusableWorkflowCallJobStrategyMatrixAbstract )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4704:3: (lv_matrix_0_0= ruleReusableWorkflowCallJobStrategyMatrixAbstract )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4705:4: lv_matrix_0_0= ruleReusableWorkflowCallJobStrategyMatrixAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAccess().getMatrixReusableWorkflowCallJobStrategyMatrixAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_matrix_0_0=ruleReusableWorkflowCallJobStrategyMatrixAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixRule());
              				}
              				set(
              					current,
              					"matrix",
              					lv_matrix_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixAbstract");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrix"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyFail_45fast"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4725:1: entryRuleReusableWorkflowCallJobStrategyFail_45fast returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyFail_45fast= ruleReusableWorkflowCallJobStrategyFail_45fast EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyFail_45fast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyFail_45fast = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4725:83: (iv_ruleReusableWorkflowCallJobStrategyFail_45fast= ruleReusableWorkflowCallJobStrategyFail_45fast EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4726:2: iv_ruleReusableWorkflowCallJobStrategyFail_45fast= ruleReusableWorkflowCallJobStrategyFail_45fast EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyFail_45fastRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyFail_45fast=ruleReusableWorkflowCallJobStrategyFail_45fast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyFail_45fast; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyFail_45fast"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyFail_45fast"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4732:1: ruleReusableWorkflowCallJobStrategyFail_45fast returns [EObject current=null] : (otherlv_0= FailFast otherlv_1= Colon ( (lv_fail_45fast_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyFail_45fast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_fail_45fast_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4738:2: ( (otherlv_0= FailFast otherlv_1= Colon ( (lv_fail_45fast_2_0= ruleEBooleanObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4739:2: (otherlv_0= FailFast otherlv_1= Colon ( (lv_fail_45fast_2_0= ruleEBooleanObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4739:2: (otherlv_0= FailFast otherlv_1= Colon ( (lv_fail_45fast_2_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4740:3: otherlv_0= FailFast otherlv_1= Colon ( (lv_fail_45fast_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,FailFast,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobStrategyFail_45fastAccess().getFailFastKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyFail_45fastAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4748:3: ( (lv_fail_45fast_2_0= ruleEBooleanObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4749:4: (lv_fail_45fast_2_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4749:4: (lv_fail_45fast_2_0= ruleEBooleanObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4750:5: lv_fail_45fast_2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyFail_45fastAccess().getFail_45fastEBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_fail_45fast_2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyFail_45fastRule());
              					}
              					set(
              						current,
              						"fail_45fast",
              						lv_fail_45fast_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBooleanObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyFail_45fast"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMax_45parallel"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4771:1: entryRuleReusableWorkflowCallJobStrategyMax_45parallel returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMax_45parallel= ruleReusableWorkflowCallJobStrategyMax_45parallel EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMax_45parallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMax_45parallel = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4771:86: (iv_ruleReusableWorkflowCallJobStrategyMax_45parallel= ruleReusableWorkflowCallJobStrategyMax_45parallel EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4772:2: iv_ruleReusableWorkflowCallJobStrategyMax_45parallel= ruleReusableWorkflowCallJobStrategyMax_45parallel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMax_45parallelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMax_45parallel=ruleReusableWorkflowCallJobStrategyMax_45parallel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMax_45parallel; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMax_45parallel"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMax_45parallel"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4778:1: ruleReusableWorkflowCallJobStrategyMax_45parallel returns [EObject current=null] : (otherlv_0= MaxParallel otherlv_1= Colon ( (lv_max_45parallel_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMax_45parallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_max_45parallel_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4784:2: ( (otherlv_0= MaxParallel otherlv_1= Colon ( (lv_max_45parallel_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4785:2: (otherlv_0= MaxParallel otherlv_1= Colon ( (lv_max_45parallel_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4785:2: (otherlv_0= MaxParallel otherlv_1= Colon ( (lv_max_45parallel_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4786:3: otherlv_0= MaxParallel otherlv_1= Colon ( (lv_max_45parallel_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,MaxParallel,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobStrategyMax_45parallelAccess().getMaxParallelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMax_45parallelAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4794:3: ( (lv_max_45parallel_2_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4795:4: (lv_max_45parallel_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4795:4: (lv_max_45parallel_2_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4796:5: lv_max_45parallel_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMax_45parallelAccess().getMax_45parallelEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_max_45parallel_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMax_45parallelRule());
              					}
              					set(
              						current,
              						"max_45parallel",
              						lv_max_45parallel_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMax_45parallel"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4817:1: entryRuleReusableWorkflowCallJobStrategyMatrixTypeString returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixTypeString= ruleReusableWorkflowCallJobStrategyMatrixTypeString EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixTypeString = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4817:88: (iv_ruleReusableWorkflowCallJobStrategyMatrixTypeString= ruleReusableWorkflowCallJobStrategyMatrixTypeString EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4818:2: iv_ruleReusableWorkflowCallJobStrategyMatrixTypeString= ruleReusableWorkflowCallJobStrategyMatrixTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixTypeString=ruleReusableWorkflowCallJobStrategyMatrixTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixTypeString; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixTypeString"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4824:1: ruleReusableWorkflowCallJobStrategyMatrixTypeString returns [EObject current=null] : (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEString ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_matrix_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4830:2: ( (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEString ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4831:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEString ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4831:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4832:3: otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeStringAccess().getMatrixKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4840:3: ( (lv_matrix_2_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4841:4: (lv_matrix_2_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4841:4: (lv_matrix_2_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4842:5: lv_matrix_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeStringAccess().getMatrixEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_matrix_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeStringRule());
              					}
              					set(
              						current,
              						"matrix",
              						lv_matrix_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixTypeString"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4863:1: entryRuleReusableWorkflowCallJobStrategyMatrixTypeInteger returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixTypeInteger= ruleReusableWorkflowCallJobStrategyMatrixTypeInteger EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixTypeInteger = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4863:89: (iv_ruleReusableWorkflowCallJobStrategyMatrixTypeInteger= ruleReusableWorkflowCallJobStrategyMatrixTypeInteger EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4864:2: iv_ruleReusableWorkflowCallJobStrategyMatrixTypeInteger= ruleReusableWorkflowCallJobStrategyMatrixTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixTypeInteger=ruleReusableWorkflowCallJobStrategyMatrixTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixTypeInteger; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixTypeInteger"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4870:1: ruleReusableWorkflowCallJobStrategyMatrixTypeInteger returns [EObject current=null] : (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixTypeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_matrix_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4876:2: ( (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4877:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4877:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4878:3: otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeIntegerAccess().getMatrixKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeIntegerAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4886:3: ( (lv_matrix_2_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4887:4: (lv_matrix_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4887:4: (lv_matrix_2_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4888:5: lv_matrix_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeIntegerAccess().getMatrixEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_matrix_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeIntegerRule());
              					}
              					set(
              						current,
              						"matrix",
              						lv_matrix_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixTypeInteger"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4909:1: entryRuleReusableWorkflowCallJobStrategyMatrixTypeNumber returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNumber= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNumber = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4909:88: (iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNumber= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4910:2: iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNumber= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNumber=ruleReusableWorkflowCallJobStrategyMatrixTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNumber; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixTypeNumber"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4916:1: ruleReusableWorkflowCallJobStrategyMatrixTypeNumber returns [EObject current=null] : (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixTypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_matrix_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4922:2: ( (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4923:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4923:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4924:3: otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNumberAccess().getMatrixKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4932:3: ( (lv_matrix_2_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4933:4: (lv_matrix_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4933:4: (lv_matrix_2_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4934:5: lv_matrix_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNumberAccess().getMatrixEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_matrix_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNumberRule());
              					}
              					set(
              						current,
              						"matrix",
              						lv_matrix_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixTypeNumber"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4955:1: entryRuleReusableWorkflowCallJobStrategyMatrixTypeBoolean returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean= ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4955:89: (iv_ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean= ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4956:2: iv_ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean= ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean=ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixTypeBoolean"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4962:1: ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean returns [EObject current=null] : (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_matrix_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4968:2: ( (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEBooleanObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4969:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEBooleanObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4969:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4970:3: otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeBooleanAccess().getMatrixKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4978:3: ( (lv_matrix_2_0= ruleEBooleanObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4979:4: (lv_matrix_2_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4979:4: (lv_matrix_2_0= ruleEBooleanObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:4980:5: lv_matrix_2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeBooleanAccess().getMatrixEBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_matrix_2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeBooleanRule());
              					}
              					set(
              						current,
              						"matrix",
              						lv_matrix_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBooleanObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5001:1: entryRuleReusableWorkflowCallJobStrategyMatrixTypeObject returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixTypeObject= ruleReusableWorkflowCallJobStrategyMatrixTypeObject EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixTypeObject = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5001:88: (iv_ruleReusableWorkflowCallJobStrategyMatrixTypeObject= ruleReusableWorkflowCallJobStrategyMatrixTypeObject EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5002:2: iv_ruleReusableWorkflowCallJobStrategyMatrixTypeObject= ruleReusableWorkflowCallJobStrategyMatrixTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixTypeObject=ruleReusableWorkflowCallJobStrategyMatrixTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixTypeObject; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixTypeObject"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5008:1: ruleReusableWorkflowCallJobStrategyMatrixTypeObject returns [EObject current=null] : (otherlv_0= Matrix otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_matrix_3_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_matrix_3_0 = null;

        EObject lv_matrix_5_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5014:2: ( (otherlv_0= Matrix otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_matrix_3_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5015:2: (otherlv_0= Matrix otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_matrix_3_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5015:2: (otherlv_0= Matrix otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_matrix_3_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5016:3: otherlv_0= Matrix otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_matrix_3_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectAccess().getMatrixKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5028:3: ( (lv_matrix_3_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5029:4: (lv_matrix_3_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5029:4: (lv_matrix_3_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5030:5: lv_matrix_3_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectAccess().getMatrixReusableWorkflowCallJobStrategyMatrixPropertiesAbstractParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_matrix_3_0=ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectRule());
              					}
              					add(
              						current,
              						"matrix",
              						lv_matrix_3_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixPropertiesAbstract");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5047:3: (otherlv_4= Comma ( (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Comma) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5048:4: otherlv_4= Comma ( (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5052:4: ( (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract ) )
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5053:5: (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract )
            	    {
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5053:5: (lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract )
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5054:6: lv_matrix_5_0= ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectAccess().getMatrixReusableWorkflowCallJobStrategyMatrixPropertiesAbstractParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_matrix_5_0=ruleReusableWorkflowCallJobStrategyMatrixPropertiesAbstract();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectRule());
            	      						}
            	      						add(
            	      							current,
            	      							"matrix",
            	      							lv_matrix_5_0,
            	      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixPropertiesAbstract");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeObjectAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixTypeObject"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5080:1: entryRuleReusableWorkflowCallJobStrategyMatrixTypeArray returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixTypeArray= ruleReusableWorkflowCallJobStrategyMatrixTypeArray EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixTypeArray = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5080:87: (iv_ruleReusableWorkflowCallJobStrategyMatrixTypeArray= ruleReusableWorkflowCallJobStrategyMatrixTypeArray EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5081:2: iv_ruleReusableWorkflowCallJobStrategyMatrixTypeArray= ruleReusableWorkflowCallJobStrategyMatrixTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixTypeArray=ruleReusableWorkflowCallJobStrategyMatrixTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixTypeArray; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixTypeArray"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5087:1: ruleReusableWorkflowCallJobStrategyMatrixTypeArray returns [EObject current=null] : ( () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_matrix_4_0 = null;

        EObject lv_matrix_6_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5093:2: ( ( () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5094:2: ( () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5094:2: ( () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5095:3: () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5095:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5096:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayAccess().getReusableWorkflowCallJobStrategyMatrixTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Matrix,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayAccess().getMatrixKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5114:3: ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RepositoryProjects && LA42_0<=True)||LA42_0==LeftSquareBracket||LA42_0==LeftCurlyBracket||(LA42_0>=RULE_STRING && LA42_0<=RULE_E_DOUBLE)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5115:4: ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5115:4: ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5116:5: (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5116:5: (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5117:6: lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayAccess().getMatrixReusableWorkflowCallJobStrategyMatrixItemsParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_matrix_4_0=ruleReusableWorkflowCallJobStrategyMatrixItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"matrix",
                      							lv_matrix_4_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5134:4: (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==Comma) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5135:5: otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5139:5: ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5140:6: (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5140:6: (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5141:7: lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayAccess().getMatrixReusableWorkflowCallJobStrategyMatrixItemsParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_matrix_6_0=ruleReusableWorkflowCallJobStrategyMatrixItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"matrix",
                    	      								lv_matrix_6_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeArrayAccess().getRightSquareBracketKeyword_5());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixTypeArray"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5168:1: entryRuleReusableWorkflowCallJobStrategyMatrixTypeNull returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNull= ruleReusableWorkflowCallJobStrategyMatrixTypeNull EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNull = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5168:86: (iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNull= ruleReusableWorkflowCallJobStrategyMatrixTypeNull EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5169:2: iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNull= ruleReusableWorkflowCallJobStrategyMatrixTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNull=ruleReusableWorkflowCallJobStrategyMatrixTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixTypeNull; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixTypeNull"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5175:1: ruleReusableWorkflowCallJobStrategyMatrixTypeNull returns [EObject current=null] : (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleNullValue ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixTypeNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_matrix_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5181:2: ( (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleNullValue ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5182:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleNullValue ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5182:2: (otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleNullValue ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5183:3: otherlv_0= Matrix otherlv_1= Colon ( (lv_matrix_2_0= ruleNullValue ) )
            {
            otherlv_0=(Token)match(input,Matrix,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNullAccess().getMatrixKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNullAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5191:3: ( (lv_matrix_2_0= ruleNullValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5192:4: (lv_matrix_2_0= ruleNullValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5192:4: (lv_matrix_2_0= ruleNullValue )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5193:5: lv_matrix_2_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNullAccess().getMatrixNullValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_matrix_2_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixTypeNullRule());
              					}
              					set(
              						current,
              						"matrix",
              						lv_matrix_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.NullValue");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixTypeNull"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5214:1: entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0 returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5214:96: (iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5215:2: iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5221:1: ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_patternProperties0_3_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) (otherlv_4= Comma ( (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_patternProperties0_3_0 = null;

        EObject lv_patternProperties0_5_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5227:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_patternProperties0_3_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) (otherlv_4= Comma ( (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5228:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_patternProperties0_3_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) (otherlv_4= Comma ( (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5228:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_patternProperties0_3_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) (otherlv_4= Comma ( (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) )* otherlv_6= RightSquareBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5229:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_patternProperties0_3_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) (otherlv_4= Comma ( (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5229:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5230:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5230:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5231:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Access().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Rule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Access().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Access().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5256:3: ( (lv_patternProperties0_3_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5257:4: (lv_patternProperties0_3_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5257:4: (lv_patternProperties0_3_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5258:5: lv_patternProperties0_3_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Access().getPatternProperties0ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_patternProperties0_3_0=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Rule());
              					}
              					add(
              						current,
              						"patternProperties0",
              						lv_patternProperties0_3_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixPatternProperties0Items");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5275:3: (otherlv_4= Comma ( (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==Comma) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5276:4: otherlv_4= Comma ( (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Access().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5280:4: ( (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items ) )
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5281:5: (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items )
            	    {
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5281:5: (lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items )
            	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5282:6: lv_patternProperties0_5_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Access().getPatternProperties0ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_patternProperties0_5_0=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Rule());
            	      						}
            	      						add(
            	      							current,
            	      							"patternProperties0",
            	      							lv_patternProperties0_5_0,
            	      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixPatternProperties0Items");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0Access().getRightSquareBracketKeyword_5());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5308:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalProperties returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5308:98: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5309:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties=ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalProperties"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5315:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5321:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5322:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5322:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5323:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5323:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5324:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5324:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5325:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5346:3: ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5347:4: (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5347:4: (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5348:5: lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAccess().getAdditionalPropertiesReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5369:1: entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5369:101: (iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5370:2: iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5376:1: ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5382:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5383:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5383:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5384:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5384:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5385:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAccess().getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5395:3: ( ( (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RepositoryProjects && LA45_0<=With)||LA45_0==If||LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5396:4: ( (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5396:4: ( (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5397:5: (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5397:5: (lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5398:6: lv_items_2_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAccess().getItemsReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsRule());
                      						}
                      						add(
                      							current,
                      							"items",
                      							lv_items_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5415:4: (otherlv_3= Comma ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==Comma) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5416:5: otherlv_3= Comma ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5420:5: ( (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5421:6: (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5421:6: (lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5422:7: lv_items_4_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAccess().getItemsReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"items",
                    	      								lv_items_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0Items"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5449:1: entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5449:121: (iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5450:2: iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties=ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5456:1: ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5462:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5463:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5463:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5464:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleConfiguration ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5464:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5465:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5465:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5466:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5487:3: ( (lv_additionalProperties_2_0= ruleConfiguration ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5488:4: (lv_additionalProperties_2_0= ruleConfiguration )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5488:4: (lv_additionalProperties_2_0= ruleConfiguration )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5489:5: lv_additionalProperties_2_0= ruleConfiguration
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesAccess().getAdditionalPropertiesConfigurationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.Configuration");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties"


    // $ANTLR start "entryRuleConfiguration"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5510:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5510:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5511:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfiguration; 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5517:1: ruleConfiguration returns [EObject current=null] : ( (lv_configuration_0_0= ruleConfigurationAbstract ) ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5523:2: ( ( (lv_configuration_0_0= ruleConfigurationAbstract ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5524:2: ( (lv_configuration_0_0= ruleConfigurationAbstract ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5524:2: ( (lv_configuration_0_0= ruleConfigurationAbstract ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5525:3: (lv_configuration_0_0= ruleConfigurationAbstract )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5525:3: (lv_configuration_0_0= ruleConfigurationAbstract )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5526:4: lv_configuration_0_0= ruleConfigurationAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationAccess().getConfigurationConfigurationAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleConfigurationAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ConfigurationAbstract");
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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleConfigurationTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5546:1: entryRuleConfigurationTypeString returns [EObject current=null] : iv_ruleConfigurationTypeString= ruleConfigurationTypeString EOF ;
    public final EObject entryRuleConfigurationTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeString = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5546:64: (iv_ruleConfigurationTypeString= ruleConfigurationTypeString EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5547:2: iv_ruleConfigurationTypeString= ruleConfigurationTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeString=ruleConfigurationTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeString; 
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
    // $ANTLR end "entryRuleConfigurationTypeString"


    // $ANTLR start "ruleConfigurationTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5553:1: ruleConfigurationTypeString returns [EObject current=null] : ( (lv_configuration_0_0= ruleEString ) ) ;
    public final EObject ruleConfigurationTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5559:2: ( ( (lv_configuration_0_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5560:2: ( (lv_configuration_0_0= ruleEString ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5560:2: ( (lv_configuration_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5561:3: (lv_configuration_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5561:3: (lv_configuration_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5562:4: lv_configuration_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeStringAccess().getConfigurationEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeStringRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleConfigurationTypeString"


    // $ANTLR start "entryRuleConfigurationTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5582:1: entryRuleConfigurationTypeInteger returns [EObject current=null] : iv_ruleConfigurationTypeInteger= ruleConfigurationTypeInteger EOF ;
    public final EObject entryRuleConfigurationTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeInteger = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5582:65: (iv_ruleConfigurationTypeInteger= ruleConfigurationTypeInteger EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5583:2: iv_ruleConfigurationTypeInteger= ruleConfigurationTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeInteger=ruleConfigurationTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeInteger; 
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
    // $ANTLR end "entryRuleConfigurationTypeInteger"


    // $ANTLR start "ruleConfigurationTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5589:1: ruleConfigurationTypeInteger returns [EObject current=null] : ( (lv_configuration_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleConfigurationTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5595:2: ( ( (lv_configuration_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5596:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5596:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5597:3: (lv_configuration_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5597:3: (lv_configuration_0_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5598:4: lv_configuration_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeIntegerAccess().getConfigurationEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeIntegerRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleConfigurationTypeInteger"


    // $ANTLR start "entryRuleConfigurationTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5618:1: entryRuleConfigurationTypeNumber returns [EObject current=null] : iv_ruleConfigurationTypeNumber= ruleConfigurationTypeNumber EOF ;
    public final EObject entryRuleConfigurationTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeNumber = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5618:64: (iv_ruleConfigurationTypeNumber= ruleConfigurationTypeNumber EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5619:2: iv_ruleConfigurationTypeNumber= ruleConfigurationTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeNumber=ruleConfigurationTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeNumber; 
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
    // $ANTLR end "entryRuleConfigurationTypeNumber"


    // $ANTLR start "ruleConfigurationTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5625:1: ruleConfigurationTypeNumber returns [EObject current=null] : ( (lv_configuration_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleConfigurationTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5631:2: ( ( (lv_configuration_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5632:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5632:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5633:3: (lv_configuration_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5633:3: (lv_configuration_0_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5634:4: lv_configuration_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeNumberAccess().getConfigurationEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeNumberRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleConfigurationTypeNumber"


    // $ANTLR start "entryRuleConfigurationTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5654:1: entryRuleConfigurationTypeBoolean returns [EObject current=null] : iv_ruleConfigurationTypeBoolean= ruleConfigurationTypeBoolean EOF ;
    public final EObject entryRuleConfigurationTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeBoolean = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5654:65: (iv_ruleConfigurationTypeBoolean= ruleConfigurationTypeBoolean EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5655:2: iv_ruleConfigurationTypeBoolean= ruleConfigurationTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeBoolean=ruleConfigurationTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeBoolean; 
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
    // $ANTLR end "entryRuleConfigurationTypeBoolean"


    // $ANTLR start "ruleConfigurationTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5661:1: ruleConfigurationTypeBoolean returns [EObject current=null] : ( (lv_configuration_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleConfigurationTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5667:2: ( ( (lv_configuration_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5668:2: ( (lv_configuration_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5668:2: ( (lv_configuration_0_0= ruleEBooleanObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5669:3: (lv_configuration_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5669:3: (lv_configuration_0_0= ruleEBooleanObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5670:4: lv_configuration_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeBooleanAccess().getConfigurationEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeBooleanRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBooleanObject");
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
    // $ANTLR end "ruleConfigurationTypeBoolean"


    // $ANTLR start "entryRuleConfigurationTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5690:1: entryRuleConfigurationTypeObject returns [EObject current=null] : iv_ruleConfigurationTypeObject= ruleConfigurationTypeObject EOF ;
    public final EObject entryRuleConfigurationTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeObject = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5690:64: (iv_ruleConfigurationTypeObject= ruleConfigurationTypeObject EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5691:2: iv_ruleConfigurationTypeObject= ruleConfigurationTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeObject=ruleConfigurationTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeObject; 
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
    // $ANTLR end "entryRuleConfigurationTypeObject"


    // $ANTLR start "ruleConfigurationTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5697:1: ruleConfigurationTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleConfigurationTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_configuration_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5703:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5704:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5704:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5705:3: () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5705:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5706:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigurationTypeObjectAccess().getConfigurationTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5716:3: ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RepositoryProjects && LA47_0<=With)||LA47_0==If||LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5717:4: ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5717:4: ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5718:5: (lv_configuration_2_0= ruleConfigurationPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5718:5: (lv_configuration_2_0= ruleConfigurationPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5719:6: lv_configuration_2_0= ruleConfigurationPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_configuration_2_0=ruleConfigurationPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConfigurationTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"configuration",
                      							lv_configuration_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ConfigurationPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5736:4: (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==Comma) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5737:5: otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getConfigurationTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5741:5: ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5742:6: (lv_configuration_4_0= ruleConfigurationPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5742:6: (lv_configuration_4_0= ruleConfigurationPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5743:7: lv_configuration_4_0= ruleConfigurationPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_configuration_4_0=ruleConfigurationPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConfigurationTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"configuration",
                    	      								lv_configuration_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ConfigurationPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConfigurationTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleConfigurationTypeObject"


    // $ANTLR start "entryRuleConfigurationTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5770:1: entryRuleConfigurationTypeArray returns [EObject current=null] : iv_ruleConfigurationTypeArray= ruleConfigurationTypeArray EOF ;
    public final EObject entryRuleConfigurationTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeArray = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5770:63: (iv_ruleConfigurationTypeArray= ruleConfigurationTypeArray EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5771:2: iv_ruleConfigurationTypeArray= ruleConfigurationTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeArray=ruleConfigurationTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeArray; 
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
    // $ANTLR end "entryRuleConfigurationTypeArray"


    // $ANTLR start "ruleConfigurationTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5777:1: ruleConfigurationTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleConfigurationTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_configuration_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5783:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5784:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5784:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5785:3: () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5785:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5786:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigurationTypeArrayAccess().getConfigurationTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5796:3: ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RepositoryProjects && LA49_0<=True)||LA49_0==LeftSquareBracket||LA49_0==LeftCurlyBracket||(LA49_0>=RULE_STRING && LA49_0<=RULE_E_DOUBLE)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5797:4: ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5797:4: ( (lv_configuration_2_0= ruleConfigurationItems ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5798:5: (lv_configuration_2_0= ruleConfigurationItems )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5798:5: (lv_configuration_2_0= ruleConfigurationItems )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5799:6: lv_configuration_2_0= ruleConfigurationItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_configuration_2_0=ruleConfigurationItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConfigurationTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"configuration",
                      							lv_configuration_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ConfigurationItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5816:4: (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==Comma) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5817:5: otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getConfigurationTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5821:5: ( (lv_configuration_4_0= ruleConfigurationItems ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5822:6: (lv_configuration_4_0= ruleConfigurationItems )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5822:6: (lv_configuration_4_0= ruleConfigurationItems )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5823:7: lv_configuration_4_0= ruleConfigurationItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_configuration_4_0=ruleConfigurationItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConfigurationTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"configuration",
                    	      								lv_configuration_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ConfigurationItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConfigurationTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleConfigurationTypeArray"


    // $ANTLR start "entryRuleConfigurationTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5850:1: entryRuleConfigurationTypeNull returns [EObject current=null] : iv_ruleConfigurationTypeNull= ruleConfigurationTypeNull EOF ;
    public final EObject entryRuleConfigurationTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeNull = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5850:62: (iv_ruleConfigurationTypeNull= ruleConfigurationTypeNull EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5851:2: iv_ruleConfigurationTypeNull= ruleConfigurationTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeNull=ruleConfigurationTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeNull; 
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
    // $ANTLR end "entryRuleConfigurationTypeNull"


    // $ANTLR start "ruleConfigurationTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5857:1: ruleConfigurationTypeNull returns [EObject current=null] : ( (lv_configuration_0_0= ruleNullValue ) ) ;
    public final EObject ruleConfigurationTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5863:2: ( ( (lv_configuration_0_0= ruleNullValue ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5864:2: ( (lv_configuration_0_0= ruleNullValue ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5864:2: ( (lv_configuration_0_0= ruleNullValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5865:3: (lv_configuration_0_0= ruleNullValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5865:3: (lv_configuration_0_0= ruleNullValue )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5866:4: lv_configuration_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeNullAccess().getConfigurationNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeNullRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.NullValue");
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
    // $ANTLR end "ruleConfigurationTypeNull"


    // $ANTLR start "entryRuleConfigurationAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5886:1: entryRuleConfigurationAdditionalProperties returns [EObject current=null] : iv_ruleConfigurationAdditionalProperties= ruleConfigurationAdditionalProperties EOF ;
    public final EObject entryRuleConfigurationAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAdditionalProperties = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5886:74: (iv_ruleConfigurationAdditionalProperties= ruleConfigurationAdditionalProperties EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5887:2: iv_ruleConfigurationAdditionalProperties= ruleConfigurationAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationAdditionalProperties=ruleConfigurationAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationAdditionalProperties; 
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
    // $ANTLR end "entryRuleConfigurationAdditionalProperties"


    // $ANTLR start "ruleConfigurationAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5893:1: ruleConfigurationAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleConfigurationAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5899:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5900:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5900:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5901:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5901:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5902:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5902:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5903:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5924:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5925:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5925:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5926:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleConfigurationAdditionalProperties"


    // $ANTLR start "entryRuleConfigurationItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5947:1: entryRuleConfigurationItems returns [EObject current=null] : iv_ruleConfigurationItems= ruleConfigurationItems EOF ;
    public final EObject entryRuleConfigurationItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationItems = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5947:59: (iv_ruleConfigurationItems= ruleConfigurationItems EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5948:2: iv_ruleConfigurationItems= ruleConfigurationItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationItems=ruleConfigurationItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationItems; 
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
    // $ANTLR end "entryRuleConfigurationItems"


    // $ANTLR start "ruleConfigurationItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5954:1: ruleConfigurationItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleConfigurationItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5960:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5961:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5961:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5962:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5962:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5963:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleConfigurationItems"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5983:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5983:108: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5984:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5990:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEString ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5996:2: ( ( (lv_additionalProperties_0_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5997:2: ( (lv_additionalProperties_0_0= ruleEString ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5997:2: ( (lv_additionalProperties_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5998:3: (lv_additionalProperties_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5998:3: (lv_additionalProperties_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:5999:4: lv_additionalProperties_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringAccess().getAdditionalPropertiesEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6019:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6019:109: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6020:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6026:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6032:2: ( ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6033:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6033:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6034:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6034:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6035:4: lv_additionalProperties_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6055:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6055:108: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6056:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6062:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6068:2: ( ( (lv_additionalProperties_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6069:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6069:2: ( (lv_additionalProperties_0_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6070:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6070:3: (lv_additionalProperties_0_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6071:4: lv_additionalProperties_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6091:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6091:109: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6092:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6098:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6104:2: ( ( (lv_additionalProperties_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6105:2: ( (lv_additionalProperties_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6105:2: ( (lv_additionalProperties_0_0= ruleEBooleanObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6106:3: (lv_additionalProperties_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6106:3: (lv_additionalProperties_0_0= ruleEBooleanObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6107:4: lv_additionalProperties_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanAccess().getAdditionalPropertiesEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBooleanObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6127:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6127:108: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6128:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6134:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_additionalProperties_2_0 = null;

        EObject lv_additionalProperties_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6140:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6141:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6141:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6142:3: () otherlv_1= LeftCurlyBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6142:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6143:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6153:3: ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RepositoryProjects && LA51_0<=With)||LA51_0==If||LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6154:4: ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6154:4: ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6155:5: (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6155:5: (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6156:6: lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_additionalProperties_2_0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"additionalProperties",
                      							lv_additionalProperties_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6173:4: (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==Comma) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6174:5: otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6178:5: ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6179:6: (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6179:6: (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6180:7: lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_additionalProperties_4_0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"additionalProperties",
                    	      								lv_additionalProperties_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6207:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6207:107: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6208:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6214:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_additionalProperties_2_0 = null;

        EObject lv_additionalProperties_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6220:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6221:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6221:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6222:3: () otherlv_1= LeftSquareBracket ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6222:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6223:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayAccess().getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6233:3: ( ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RepositoryProjects && LA53_0<=True)||LA53_0==LeftSquareBracket||LA53_0==LeftCurlyBracket||(LA53_0>=RULE_STRING && LA53_0<=RULE_E_DOUBLE)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6234:4: ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6234:4: ( (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6235:5: (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6235:5: (lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6236:6: lv_additionalProperties_2_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_additionalProperties_2_0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"additionalProperties",
                      							lv_additionalProperties_2_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6253:4: (otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==Comma) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6254:5: otherlv_3= Comma ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6258:5: ( (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6259:6: (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6259:6: (lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6260:7: lv_additionalProperties_4_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_additionalProperties_4_0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"additionalProperties",
                    	      								lv_additionalProperties_4_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6287:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6287:106: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6288:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6294:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull returns [EObject current=null] : ( (lv_additionalProperties_0_0= ruleNullValue ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_additionalProperties_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6300:2: ( ( (lv_additionalProperties_0_0= ruleNullValue ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6301:2: ( (lv_additionalProperties_0_0= ruleNullValue ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6301:2: ( (lv_additionalProperties_0_0= ruleNullValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6302:3: (lv_additionalProperties_0_0= ruleNullValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6302:3: (lv_additionalProperties_0_0= ruleNullValue )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6303:4: lv_additionalProperties_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullAccess().getAdditionalPropertiesNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullRule());
              				}
              				set(
              					current,
              					"additionalProperties",
              					lv_additionalProperties_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.NullValue");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6323:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6323:118: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6324:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6330:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6336:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6337:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6337:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6338:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6338:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6339:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6339:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6340:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6361:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6362:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6362:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6363:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6384:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6384:103: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6385:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6391:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6397:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6398:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6398:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6399:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6399:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6400:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6420:1: entryRuleReusableWorkflowCallJobStrategyMatrixItems returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixItems= ruleReusableWorkflowCallJobStrategyMatrixItems EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixItems = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6420:83: (iv_ruleReusableWorkflowCallJobStrategyMatrixItems= ruleReusableWorkflowCallJobStrategyMatrixItems EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6421:2: iv_ruleReusableWorkflowCallJobStrategyMatrixItems= ruleReusableWorkflowCallJobStrategyMatrixItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixItems=ruleReusableWorkflowCallJobStrategyMatrixItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixItems; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixItems"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6427:1: ruleReusableWorkflowCallJobStrategyMatrixItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6433:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6434:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6434:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6435:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6435:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6436:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixItems"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6456:1: entryRuleReusableWorkflowCallJobConcurrencyTypeString returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyTypeString= ruleReusableWorkflowCallJobConcurrencyTypeString EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyTypeString = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6456:85: (iv_ruleReusableWorkflowCallJobConcurrencyTypeString= ruleReusableWorkflowCallJobConcurrencyTypeString EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6457:2: iv_ruleReusableWorkflowCallJobConcurrencyTypeString= ruleReusableWorkflowCallJobConcurrencyTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyTypeString=ruleReusableWorkflowCallJobConcurrencyTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyTypeString; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyTypeString"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyTypeString"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6463:1: ruleReusableWorkflowCallJobConcurrencyTypeString returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6469:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6470:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6470:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6471:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeStringAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6479:3: ( (lv_concurrency_2_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6480:4: (lv_concurrency_2_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6480:4: (lv_concurrency_2_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6481:5: lv_concurrency_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeStringAccess().getConcurrencyEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeStringRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyTypeString"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6502:1: entryRuleReusableWorkflowCallJobConcurrencyTypeInteger returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyTypeInteger= ruleReusableWorkflowCallJobConcurrencyTypeInteger EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyTypeInteger = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6502:86: (iv_ruleReusableWorkflowCallJobConcurrencyTypeInteger= ruleReusableWorkflowCallJobConcurrencyTypeInteger EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6503:2: iv_ruleReusableWorkflowCallJobConcurrencyTypeInteger= ruleReusableWorkflowCallJobConcurrencyTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyTypeInteger=ruleReusableWorkflowCallJobConcurrencyTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyTypeInteger; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyTypeInteger"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyTypeInteger"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6509:1: ruleReusableWorkflowCallJobConcurrencyTypeInteger returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyTypeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6515:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6516:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6516:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6517:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeIntegerAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeIntegerAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6525:3: ( (lv_concurrency_2_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6526:4: (lv_concurrency_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6526:4: (lv_concurrency_2_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6527:5: lv_concurrency_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeIntegerAccess().getConcurrencyEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeIntegerRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyTypeInteger"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6548:1: entryRuleReusableWorkflowCallJobConcurrencyTypeNumber returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyTypeNumber= ruleReusableWorkflowCallJobConcurrencyTypeNumber EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyTypeNumber = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6548:85: (iv_ruleReusableWorkflowCallJobConcurrencyTypeNumber= ruleReusableWorkflowCallJobConcurrencyTypeNumber EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6549:2: iv_ruleReusableWorkflowCallJobConcurrencyTypeNumber= ruleReusableWorkflowCallJobConcurrencyTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyTypeNumber=ruleReusableWorkflowCallJobConcurrencyTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyTypeNumber; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyTypeNumber"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyTypeNumber"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6555:1: ruleReusableWorkflowCallJobConcurrencyTypeNumber returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyTypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6561:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6562:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6562:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6563:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNumberAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6571:3: ( (lv_concurrency_2_0= ruleEDoubleObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6572:4: (lv_concurrency_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6572:4: (lv_concurrency_2_0= ruleEDoubleObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6573:5: lv_concurrency_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNumberAccess().getConcurrencyEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNumberRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EDoubleObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyTypeNumber"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6594:1: entryRuleReusableWorkflowCallJobConcurrencyTypeBoolean returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyTypeBoolean= ruleReusableWorkflowCallJobConcurrencyTypeBoolean EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyTypeBoolean = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6594:86: (iv_ruleReusableWorkflowCallJobConcurrencyTypeBoolean= ruleReusableWorkflowCallJobConcurrencyTypeBoolean EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6595:2: iv_ruleReusableWorkflowCallJobConcurrencyTypeBoolean= ruleReusableWorkflowCallJobConcurrencyTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyTypeBoolean=ruleReusableWorkflowCallJobConcurrencyTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyTypeBoolean; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyTypeBoolean"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyTypeBoolean"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6601:1: ruleReusableWorkflowCallJobConcurrencyTypeBoolean returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyTypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6607:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6608:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6608:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6609:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeBooleanAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6617:3: ( (lv_concurrency_2_0= ruleEBooleanObject ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6618:4: (lv_concurrency_2_0= ruleEBooleanObject )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6618:4: (lv_concurrency_2_0= ruleEBooleanObject )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6619:5: lv_concurrency_2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeBooleanAccess().getConcurrencyEBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeBooleanRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EBooleanObject");
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyTypeBoolean"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6640:1: entryRuleReusableWorkflowCallJobConcurrencyTypeObject returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyTypeObject= ruleReusableWorkflowCallJobConcurrencyTypeObject EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyTypeObject = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6640:85: (iv_ruleReusableWorkflowCallJobConcurrencyTypeObject= ruleReusableWorkflowCallJobConcurrencyTypeObject EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6641:2: iv_ruleReusableWorkflowCallJobConcurrencyTypeObject= ruleReusableWorkflowCallJobConcurrencyTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyTypeObject=ruleReusableWorkflowCallJobConcurrencyTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyTypeObject; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyTypeObject"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyTypeObject"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6647:1: ruleReusableWorkflowCallJobConcurrencyTypeObject returns [EObject current=null] : ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_concurrency_4_0 = null;

        EObject lv_concurrency_6_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6653:2: ( ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6654:2: ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6654:2: ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6655:3: () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6655:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6656:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectAccess().getReusableWorkflowCallJobConcurrencyTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectAccess().getConcurrencyKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6674:3: ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RepositoryProjects && LA55_0<=With)||LA55_0==If||LA55_0==RULE_STRING) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6675:4: ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6675:4: ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6676:5: (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6676:5: (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6677:6: lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectAccess().getConcurrencyReusableWorkflowCallJobConcurrencyPropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_concurrency_4_0=ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"concurrency",
                      							lv_concurrency_4_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobConcurrencyPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6694:4: (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==Comma) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6695:5: otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6699:5: ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6700:6: (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6700:6: (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6701:7: lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectAccess().getConcurrencyReusableWorkflowCallJobConcurrencyPropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_concurrency_6_0=ruleReusableWorkflowCallJobConcurrencyPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"concurrency",
                    	      								lv_concurrency_6_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobConcurrencyPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeObjectAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyTypeObject"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6728:1: entryRuleReusableWorkflowCallJobConcurrencyTypeArray returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyTypeArray= ruleReusableWorkflowCallJobConcurrencyTypeArray EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyTypeArray = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6728:84: (iv_ruleReusableWorkflowCallJobConcurrencyTypeArray= ruleReusableWorkflowCallJobConcurrencyTypeArray EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6729:2: iv_ruleReusableWorkflowCallJobConcurrencyTypeArray= ruleReusableWorkflowCallJobConcurrencyTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyTypeArray=ruleReusableWorkflowCallJobConcurrencyTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyTypeArray; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyTypeArray"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyTypeArray"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6735:1: ruleReusableWorkflowCallJobConcurrencyTypeArray returns [EObject current=null] : ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_concurrency_4_0 = null;

        EObject lv_concurrency_6_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6741:2: ( ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6742:2: ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6742:2: ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6743:3: () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6743:3: ()
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6744:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayAccess().getReusableWorkflowCallJobConcurrencyTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayAccess().getConcurrencyKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6762:3: ( ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RepositoryProjects && LA57_0<=True)||LA57_0==LeftSquareBracket||LA57_0==LeftCurlyBracket||(LA57_0>=RULE_STRING && LA57_0<=RULE_E_DOUBLE)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6763:4: ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) )*
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6763:4: ( (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems ) )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6764:5: (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems )
                    {
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6764:5: (lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems )
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6765:6: lv_concurrency_4_0= ruleReusableWorkflowCallJobConcurrencyItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayAccess().getConcurrencyReusableWorkflowCallJobConcurrencyItemsParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_concurrency_4_0=ruleReusableWorkflowCallJobConcurrencyItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"concurrency",
                      							lv_concurrency_4_0,
                      							"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobConcurrencyItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6782:4: (otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==Comma) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6783:5: otherlv_5= Comma ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6787:5: ( (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems ) )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6788:6: (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems )
                    	    {
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6788:6: (lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems )
                    	    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6789:7: lv_concurrency_6_0= ruleReusableWorkflowCallJobConcurrencyItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayAccess().getConcurrencyReusableWorkflowCallJobConcurrencyItemsParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_concurrency_6_0=ruleReusableWorkflowCallJobConcurrencyItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"concurrency",
                    	      								lv_concurrency_6_0,
                    	      								"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.ReusableWorkflowCallJobConcurrencyItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeArrayAccess().getRightSquareBracketKeyword_5());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyTypeArray"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6816:1: entryRuleReusableWorkflowCallJobConcurrencyTypeNull returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyTypeNull= ruleReusableWorkflowCallJobConcurrencyTypeNull EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyTypeNull = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6816:83: (iv_ruleReusableWorkflowCallJobConcurrencyTypeNull= ruleReusableWorkflowCallJobConcurrencyTypeNull EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6817:2: iv_ruleReusableWorkflowCallJobConcurrencyTypeNull= ruleReusableWorkflowCallJobConcurrencyTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyTypeNull=ruleReusableWorkflowCallJobConcurrencyTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyTypeNull; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyTypeNull"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyTypeNull"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6823:1: ruleReusableWorkflowCallJobConcurrencyTypeNull returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyTypeNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6829:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6830:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6830:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6831:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNullAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNullAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6839:3: ( (lv_concurrency_2_0= ruleNullValue ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6840:4: (lv_concurrency_2_0= ruleNullValue )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6840:4: (lv_concurrency_2_0= ruleNullValue )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6841:5: lv_concurrency_2_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNullAccess().getConcurrencyNullValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyTypeNullRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.NullValue");
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyTypeNull"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6862:1: entryRuleReusableWorkflowCallJobConcurrencyAdditionalProperties returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyAdditionalProperties= ruleReusableWorkflowCallJobConcurrencyAdditionalProperties EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyAdditionalProperties = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6862:95: (iv_ruleReusableWorkflowCallJobConcurrencyAdditionalProperties= ruleReusableWorkflowCallJobConcurrencyAdditionalProperties EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6863:2: iv_ruleReusableWorkflowCallJobConcurrencyAdditionalProperties= ruleReusableWorkflowCallJobConcurrencyAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyAdditionalProperties=ruleReusableWorkflowCallJobConcurrencyAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyAdditionalProperties; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyAdditionalProperties"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyAdditionalProperties"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6869:1: ruleReusableWorkflowCallJobConcurrencyAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6875:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6876:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6876:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6877:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6877:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6878:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6878:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6879:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobConcurrencyAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6900:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6901:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6901:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6902:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyAdditionalProperties"


    // $ANTLR start "entryRuleReusableWorkflowCallJobConcurrencyItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6923:1: entryRuleReusableWorkflowCallJobConcurrencyItems returns [EObject current=null] : iv_ruleReusableWorkflowCallJobConcurrencyItems= ruleReusableWorkflowCallJobConcurrencyItems EOF ;
    public final EObject entryRuleReusableWorkflowCallJobConcurrencyItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobConcurrencyItems = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6923:80: (iv_ruleReusableWorkflowCallJobConcurrencyItems= ruleReusableWorkflowCallJobConcurrencyItems EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6924:2: iv_ruleReusableWorkflowCallJobConcurrencyItems= ruleReusableWorkflowCallJobConcurrencyItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobConcurrencyItems=ruleReusableWorkflowCallJobConcurrencyItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobConcurrencyItems; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobConcurrencyItems"


    // $ANTLR start "ruleReusableWorkflowCallJobConcurrencyItems"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6930:1: ruleReusableWorkflowCallJobConcurrencyItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleReusableWorkflowCallJobConcurrencyItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6936:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6937:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6937:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6938:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6938:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6939:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobConcurrencyItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobConcurrencyItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.GithubwfRootJobsPatternProperties0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleReusableWorkflowCallJobConcurrencyItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6959:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6959:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6960:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6966:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6972:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6973:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6973:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=RepositoryProjects && LA58_0<=With)||LA58_0==If) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6974:3: this_STRING_0= RULE_STRING
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
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6982:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6996:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6996:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:6997:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7003:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= MaxParallel | kw= Discussions | kw= Matrix | kw= Issues | kw= FailFast | kw= Pages | kw= SecurityEvents | kw= Permissions | kw= PullRequests | kw= If | kw= Needs | kw= RepositoryProjects | kw= IdToken | kw= Packages | kw= Secrets | kw= Concurrency | kw= With | kw= Deployments | kw= Checks | kw= Contents | kw= Name | kw= Statuses | kw= Uses | kw= Strategy | kw= Actions ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7009:2: ( (kw= MaxParallel | kw= Discussions | kw= Matrix | kw= Issues | kw= FailFast | kw= Pages | kw= SecurityEvents | kw= Permissions | kw= PullRequests | kw= If | kw= Needs | kw= RepositoryProjects | kw= IdToken | kw= Packages | kw= Secrets | kw= Concurrency | kw= With | kw= Deployments | kw= Checks | kw= Contents | kw= Name | kw= Statuses | kw= Uses | kw= Strategy | kw= Actions ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7010:2: (kw= MaxParallel | kw= Discussions | kw= Matrix | kw= Issues | kw= FailFast | kw= Pages | kw= SecurityEvents | kw= Permissions | kw= PullRequests | kw= If | kw= Needs | kw= RepositoryProjects | kw= IdToken | kw= Packages | kw= Secrets | kw= Concurrency | kw= With | kw= Deployments | kw= Checks | kw= Contents | kw= Name | kw= Statuses | kw= Uses | kw= Strategy | kw= Actions )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7010:2: (kw= MaxParallel | kw= Discussions | kw= Matrix | kw= Issues | kw= FailFast | kw= Pages | kw= SecurityEvents | kw= Permissions | kw= PullRequests | kw= If | kw= Needs | kw= RepositoryProjects | kw= IdToken | kw= Packages | kw= Secrets | kw= Concurrency | kw= With | kw= Deployments | kw= Checks | kw= Contents | kw= Name | kw= Statuses | kw= Uses | kw= Strategy | kw= Actions )
            int alt59=25;
            switch ( input.LA(1) ) {
            case MaxParallel:
                {
                alt59=1;
                }
                break;
            case Discussions:
                {
                alt59=2;
                }
                break;
            case Matrix:
                {
                alt59=3;
                }
                break;
            case Issues:
                {
                alt59=4;
                }
                break;
            case FailFast:
                {
                alt59=5;
                }
                break;
            case Pages:
                {
                alt59=6;
                }
                break;
            case SecurityEvents:
                {
                alt59=7;
                }
                break;
            case Permissions:
                {
                alt59=8;
                }
                break;
            case PullRequests:
                {
                alt59=9;
                }
                break;
            case If:
                {
                alt59=10;
                }
                break;
            case Needs:
                {
                alt59=11;
                }
                break;
            case RepositoryProjects:
                {
                alt59=12;
                }
                break;
            case IdToken:
                {
                alt59=13;
                }
                break;
            case Packages:
                {
                alt59=14;
                }
                break;
            case Secrets:
                {
                alt59=15;
                }
                break;
            case Concurrency:
                {
                alt59=16;
                }
                break;
            case With:
                {
                alt59=17;
                }
                break;
            case Deployments:
                {
                alt59=18;
                }
                break;
            case Checks:
                {
                alt59=19;
                }
                break;
            case Contents:
                {
                alt59=20;
                }
                break;
            case Name:
                {
                alt59=21;
                }
                break;
            case Statuses:
                {
                alt59=22;
                }
                break;
            case Uses:
                {
                alt59=23;
                }
                break;
            case Strategy:
                {
                alt59=24;
                }
                break;
            case Actions:
                {
                alt59=25;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7011:3: kw= MaxParallel
                    {
                    kw=(Token)match(input,MaxParallel,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxParallelKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7017:3: kw= Discussions
                    {
                    kw=(Token)match(input,Discussions,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDiscussionsKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7023:3: kw= Matrix
                    {
                    kw=(Token)match(input,Matrix,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMatrixKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7029:3: kw= Issues
                    {
                    kw=(Token)match(input,Issues,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIssuesKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7035:3: kw= FailFast
                    {
                    kw=(Token)match(input,FailFast,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFailFastKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7041:3: kw= Pages
                    {
                    kw=(Token)match(input,Pages,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPagesKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7047:3: kw= SecurityEvents
                    {
                    kw=(Token)match(input,SecurityEvents,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSecurityEventsKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7053:3: kw= Permissions
                    {
                    kw=(Token)match(input,Permissions,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPermissionsKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7059:3: kw= PullRequests
                    {
                    kw=(Token)match(input,PullRequests,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPullRequestsKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7065:3: kw= If
                    {
                    kw=(Token)match(input,If,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIfKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7071:3: kw= Needs
                    {
                    kw=(Token)match(input,Needs,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNeedsKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7077:3: kw= RepositoryProjects
                    {
                    kw=(Token)match(input,RepositoryProjects,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRepositoryProjectsKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7083:3: kw= IdToken
                    {
                    kw=(Token)match(input,IdToken,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIdTokenKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7089:3: kw= Packages
                    {
                    kw=(Token)match(input,Packages,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPackagesKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7095:3: kw= Secrets
                    {
                    kw=(Token)match(input,Secrets,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSecretsKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7101:3: kw= Concurrency
                    {
                    kw=(Token)match(input,Concurrency,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConcurrencyKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7107:3: kw= With
                    {
                    kw=(Token)match(input,With,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getWithKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7113:3: kw= Deployments
                    {
                    kw=(Token)match(input,Deployments,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDeploymentsKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7119:3: kw= Checks
                    {
                    kw=(Token)match(input,Checks,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getChecksKeyword_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7125:3: kw= Contents
                    {
                    kw=(Token)match(input,Contents,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContentsKeyword_19());
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7131:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_20());
                      		
                    }

                    }
                    break;
                case 22 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7137:3: kw= Statuses
                    {
                    kw=(Token)match(input,Statuses,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStatusesKeyword_21());
                      		
                    }

                    }
                    break;
                case 23 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7143:3: kw= Uses
                    {
                    kw=(Token)match(input,Uses,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUsesKeyword_22());
                      		
                    }

                    }
                    break;
                case 24 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7149:3: kw= Strategy
                    {
                    kw=(Token)match(input,Strategy,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStrategyKeyword_23());
                      		
                    }

                    }
                    break;
                case 25 :
                    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7155:3: kw= Actions
                    {
                    kw=(Token)match(input,Actions,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionsKeyword_24());
                      		
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
    // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7164:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7170:2: ( (enumLiteral_0= Null ) )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7171:2: (enumLiteral_0= Null )
            {
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7171:2: (enumLiteral_0= Null )
            // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:7172:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred1_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:209:4: ( ruleReusableWorkflowCallJobIfTypeNumber )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:209:5: ruleReusableWorkflowCallJobIfTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleReusableWorkflowCallJobIfTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // $ANTLR start synpred2_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred2_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:257:4: ( ruleReusableWorkflowCallJobSecretsTypeNumber )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:257:5: ruleReusableWorkflowCallJobSecretsTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleReusableWorkflowCallJobSecretsTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // $ANTLR start synpred3_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred3_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:386:4: ( ruleReusableWorkflowCallJobConcurrencyTypeNumber )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:386:5: ruleReusableWorkflowCallJobConcurrencyTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleReusableWorkflowCallJobConcurrencyTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // $ANTLR start synpred4_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred4_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:470:4: ( ruleJobNeedsTypeNumber )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:470:5: ruleJobNeedsTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleJobNeedsTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // $ANTLR start synpred6_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred6_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:789:4: ( ruleEnvTypeNumber )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:789:5: ruleEnvTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleEnvTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // $ANTLR start synpred9_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred9_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:929:4: ( ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:929:5: ruleReusableWorkflowCallJobStrategyMatrixTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleReusableWorkflowCallJobStrategyMatrixTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // $ANTLR start synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1013:4: ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1013:5: ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0
        {
        pushFollow(FOLLOW_2);
        ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // $ANTLR start synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1025:4: ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1025:5: ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties
        {
        pushFollow(FOLLOW_2);
        ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // $ANTLR start synpred12_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred12_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1055:4: ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1055:5: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // $ANTLR start synpred14_InternalGithubwfRootJobsPatternProperties0OneOf1Parser
    public final void synpred14_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1167:4: ( ruleConfigurationTypeNumber )
        // InternalGithubwfRootJobsPatternProperties0OneOf1Parser.g:1167:5: ruleConfigurationTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleConfigurationTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalGithubwfRootJobsPatternProperties0OneOf1Parser

    // Delegated rules

    public final boolean synpred3_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
		if (!jku.se.atl.transformation.utils.Utils.find("^(in|ex)clude$", input.LT(1).getText().substring(1,input.LT(1).getText().length() - 1)))  return false;
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGithubwfRootJobsPatternProperties0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGithubwfRootJobsPatternProperties0OneOf1Parser_fragment(); // can never throw exception
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
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\10\11\uffff";
    static final String dfa_3s = "\1\35\11\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\2\uffff\1\3\5\uffff\1\10\1\uffff\1\7\3\uffff\1\2\1\uffff\1\1\1\5\1\6\1\uffff\1\4",
            "",
            "",
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
            return "108:2: (this_ReusableWorkflowCallJobName_0= ruleReusableWorkflowCallJobName | this_ReusableWorkflowCallJobNeeds_1= ruleReusableWorkflowCallJobNeeds | this_ReusableWorkflowCallJobPermissions_2= ruleReusableWorkflowCallJobPermissions | this_ReusableWorkflowCallJobIf_3= ruleReusableWorkflowCallJobIf | this_ReusableWorkflowCallJobUses_4= ruleReusableWorkflowCallJobUses | this_ReusableWorkflowCallJobWith_5= ruleReusableWorkflowCallJobWith | this_ReusableWorkflowCallJobSecrets_6= ruleReusableWorkflowCallJobSecrets | this_ReusableWorkflowCallJobStrategy_7= ruleReusableWorkflowCallJobStrategy | this_ReusableWorkflowCallJobConcurrency_8= ruleReusableWorkflowCallJobConcurrency )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\23\1\41\1\4\4\uffff\2\0\3\uffff";
    static final String dfa_9s = "\1\23\1\41\1\51\4\uffff\2\0\3\uffff";
    static final String dfa_10s = "\3\uffff\1\5\1\7\1\6\1\2\2\uffff\1\4\1\1\1\3";
    static final String dfa_11s = "\7\uffff\1\0\1\1\3\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\30\6\1\11\1\6\1\4\1\11\2\uffff\1\5\1\uffff\1\3\2\uffff\1\6\1\7\1\10",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "255:2: ( ( ( ruleReusableWorkflowCallJobSecretsTypeNumber )=>this_ReusableWorkflowCallJobSecretsTypeNumber_0= ruleReusableWorkflowCallJobSecretsTypeNumber ) | this_ReusableWorkflowCallJobSecretsTypeString_1= ruleReusableWorkflowCallJobSecretsTypeString | this_ReusableWorkflowCallJobSecretsTypeInteger_2= ruleReusableWorkflowCallJobSecretsTypeInteger | this_ReusableWorkflowCallJobSecretsTypeBoolean_3= ruleReusableWorkflowCallJobSecretsTypeBoolean | this_ReusableWorkflowCallJobSecretsTypeObject_4= ruleReusableWorkflowCallJobSecretsTypeObject | this_ReusableWorkflowCallJobSecretsTypeArray_5= ruleReusableWorkflowCallJobSecretsTypeArray | this_ReusableWorkflowCallJobSecretsTypeNull_6= ruleReusableWorkflowCallJobSecretsTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_7 = input.LA(1);

                         
                        int index3_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_8 = input.LA(1);

                         
                        int index3_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index3_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\1\10\1\41\1\4\2\uffff\2\0\5\uffff";
    static final String dfa_14s = "\1\10\1\41\1\51\2\uffff\2\0\5\uffff";
    static final String dfa_15s = "\3\uffff\1\6\1\2\2\uffff\1\4\1\5\1\7\1\1\1\3";
    static final String dfa_16s = "\5\uffff\1\0\1\1\5\uffff}>";
    static final String[] dfa_17s = {
            "\1\1",
            "\1\2",
            "\30\4\1\7\1\4\1\11\1\7\2\uffff\1\3\1\uffff\1\10\2\uffff\1\4\1\5\1\6",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "384:2: ( ( ( ruleReusableWorkflowCallJobConcurrencyTypeNumber )=>this_ReusableWorkflowCallJobConcurrencyTypeNumber_0= ruleReusableWorkflowCallJobConcurrencyTypeNumber ) | this_ReusableWorkflowCallJobConcurrencyTypeString_1= ruleReusableWorkflowCallJobConcurrencyTypeString | this_ReusableWorkflowCallJobConcurrencyTypeInteger_2= ruleReusableWorkflowCallJobConcurrencyTypeInteger | this_ReusableWorkflowCallJobConcurrencyTypeBoolean_3= ruleReusableWorkflowCallJobConcurrencyTypeBoolean | this_ReusableWorkflowCallJobConcurrencyTypeObject_4= ruleReusableWorkflowCallJobConcurrencyTypeObject | this_ReusableWorkflowCallJobConcurrencyTypeArray_5= ruleReusableWorkflowCallJobConcurrencyTypeArray | this_ReusableWorkflowCallJobConcurrencyTypeNull_6= ruleReusableWorkflowCallJobConcurrencyTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_6 = input.LA(1);

                         
                        int index5_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index5_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_18s = "\1\4\2\0\7\uffff";
    static final String dfa_19s = "\1\51\2\0\7\uffff";
    static final String dfa_20s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_21s = "\1\uffff\1\0\1\1\7\uffff}>";
    static final String[] dfa_22s = {
            "\30\3\1\4\1\3\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
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
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "468:2: ( ( ( ruleJobNeedsTypeNumber )=>this_JobNeedsTypeNumber_0= ruleJobNeedsTypeNumber ) | this_JobNeedsTypeString_1= ruleJobNeedsTypeString | this_JobNeedsTypeInteger_2= ruleJobNeedsTypeInteger | this_JobNeedsTypeBoolean_3= ruleJobNeedsTypeBoolean | this_JobNeedsTypeObject_4= ruleJobNeedsTypeObject | this_JobNeedsTypeArray_5= ruleJobNeedsTypeArray | this_JobNeedsTypeNull_6= ruleJobNeedsTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "787:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_23s = "\1\26\1\41\1\4\1\uffff\2\0\6\uffff";
    static final String dfa_24s = "\1\26\1\41\1\51\1\uffff\2\0\6\uffff";
    static final String dfa_25s = "\3\uffff\1\2\2\uffff\1\4\1\7\1\5\1\6\1\1\1\3";
    static final String dfa_26s = "\4\uffff\1\1\1\0\6\uffff}>";
    static final String[] dfa_27s = {
            "\1\1",
            "\1\2",
            "\30\3\1\6\1\3\1\7\1\6\2\uffff\1\11\1\uffff\1\10\2\uffff\1\3\1\4\1\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "927:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixTypeString | this_ReusableWorkflowCallJobStrategyMatrixTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixTypeObject | this_ReusableWorkflowCallJobStrategyMatrixTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixTypeArray | this_ReusableWorkflowCallJobStrategyMatrixTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_28s = "\35\uffff";
    static final String dfa_29s = "\1\4\32\0\2\uffff";
    static final String dfa_30s = "\1\47\32\0\2\uffff";
    static final String dfa_31s = "\33\uffff\1\1\1\2";
    static final String dfa_32s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\2\uffff}>";
    static final String[] dfa_33s = {
            "\1\15\1\10\1\12\1\2\1\21\1\23\1\3\1\11\1\6\1\25\1\16\1\17\1\27\1\31\1\32\1\20\1\24\1\5\1\4\1\14\1\7\1\26\1\30\1\22\1\uffff\1\13\11\uffff\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_28;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "1011:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 )=>this_ReusableWorkflowCallJobStrategyMatrixPatternProperties0_0= ruleReusableWorkflowCallJobStrategyMatrixPatternProperties0 ) | ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalProperties_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalProperties ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_18 = input.LA(1);

                         
                        int index11_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA11_19 = input.LA(1);

                         
                        int index11_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA11_20 = input.LA(1);

                         
                        int index11_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA11_21 = input.LA(1);

                         
                        int index11_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA11_22 = input.LA(1);

                         
                        int index11_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA11_23 = input.LA(1);

                         
                        int index11_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA11_24 = input.LA(1);

                         
                        int index11_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA11_25 = input.LA(1);

                         
                        int index11_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA11_26 = input.LA(1);

                         
                        int index11_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 27;}

                        else if ( (synpred11_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 28;}

                         
                        input.seek(index11_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1053:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber )=>this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber ) | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_1= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_2= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_3= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_4= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_5= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray | this_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_6= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\1\uffff\1\1\1\0\7\uffff}>";
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_34;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1165:2: ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalGithubwfRootJobsPatternProperties0OneOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000202E8A0900L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000002E8A0900L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000802FFFFFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000394FFFFFFF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000401080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000401080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000A02FFFFFF0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000039CFFFFFFF0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000200135E670L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000135E670L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});

}
