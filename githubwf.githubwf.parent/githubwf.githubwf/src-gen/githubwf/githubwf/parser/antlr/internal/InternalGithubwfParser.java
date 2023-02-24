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
import githubwf.githubwf.services.GithubwfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGithubwfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WorkingDirectory", "Concurrency", "Permissions", "Defaults", "RunName", "Shell", "Jobs", "Name", "Env", "Run", "False", "On", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=16;
    public static final int True=17;
    public static final int RULE_STRING=25;
    public static final int False=14;
    public static final int Env=12;
    public static final int RunName=8;
    public static final int Name=11;
    public static final int RULE_SL_COMMENT=30;
    public static final int Comma=18;
    public static final int Shell=9;
    public static final int Concurrency=5;
    public static final int Jobs=10;
    public static final int Permissions=6;
    public static final int Colon=19;
    public static final int RightCurlyBracket=23;
    public static final int RULE_E_DOUBLE=27;
    public static final int EOF=-1;
    public static final int RightSquareBracket=21;
    public static final int WorkingDirectory=4;
    public static final int RULE_ID=28;
    public static final int RULE_WS=31;
    public static final int LeftCurlyBracket=22;
    public static final int RULE_E_INT=26;
    public static final int Run=13;
    public static final int RULE_ANY_OTHER=32;
    public static final int Defaults=7;
    public static final int RULE_INT=24;
    public static final int RULE_ML_COMMENT=29;
    public static final int LeftSquareBracket=20;
    public static final int On=15;

    // delegates
    // delegators


        public InternalGithubwfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfParser.g"; }



     	private GithubwfGrammarAccess grammarAccess;

        public InternalGithubwfParser(TokenStream input, GithubwfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GithubwfRoot";
       	}

       	@Override
       	protected GithubwfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGithubwfRoot"
    // InternalGithubwfParser.g:58:1: entryRuleGithubwfRoot returns [EObject current=null] : iv_ruleGithubwfRoot= ruleGithubwfRoot EOF ;
    public final EObject entryRuleGithubwfRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRoot = null;


        try {
            // InternalGithubwfParser.g:58:53: (iv_ruleGithubwfRoot= ruleGithubwfRoot EOF )
            // InternalGithubwfParser.g:59:2: iv_ruleGithubwfRoot= ruleGithubwfRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRoot=ruleGithubwfRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRoot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRoot"


    // $ANTLR start "ruleGithubwfRoot"
    // InternalGithubwfParser.g:65:1: ruleGithubwfRoot returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleGithubwfRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_githubwfRoot_2_0 = null;

        EObject lv_githubwfRoot_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:71:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfParser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfParser.g:73:3: () otherlv_1= LeftCurlyBracket ( ( (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfParser.g:73:3: ()
            // InternalGithubwfParser.g:74:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootAccess().getGithubwfRootAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfParser.g:84:3: ( ( (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=Concurrency && LA2_0<=RunName)||(LA2_0>=Jobs && LA2_0<=Env)||LA2_0==On) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGithubwfParser.g:85:4: ( (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfParser.g:85:4: ( (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract ) )
                    // InternalGithubwfParser.g:86:5: (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract )
                    {
                    // InternalGithubwfParser.g:86:5: (lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract )
                    // InternalGithubwfParser.g:87:6: lv_githubwfRoot_2_0= ruleGithubwfRootPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootAccess().getGithubwfRootGithubwfRootPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_githubwfRoot_2_0=ruleGithubwfRootPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootRule());
                      						}
                      						add(
                      							current,
                      							"githubwfRoot",
                      							lv_githubwfRoot_2_0,
                      							"githubwf.githubwf.Githubwf.GithubwfRootPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:104:4: (otherlv_3= Comma ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:105:5: otherlv_3= Comma ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getGithubwfRootAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:109:5: ( (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract ) )
                    	    // InternalGithubwfParser.g:110:6: (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfParser.g:110:6: (lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract )
                    	    // InternalGithubwfParser.g:111:7: lv_githubwfRoot_4_0= ruleGithubwfRootPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootAccess().getGithubwfRootGithubwfRootPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_githubwfRoot_4_0=ruleGithubwfRootPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"githubwfRoot",
                    	      								lv_githubwfRoot_4_0,
                    	      								"githubwf.githubwf.Githubwf.GithubwfRootPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGithubwfRootAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleGithubwfRoot"


    // $ANTLR start "entryRuleGithubwfRootPropertiesAbstract"
    // InternalGithubwfParser.g:138:1: entryRuleGithubwfRootPropertiesAbstract returns [EObject current=null] : iv_ruleGithubwfRootPropertiesAbstract= ruleGithubwfRootPropertiesAbstract EOF ;
    public final EObject entryRuleGithubwfRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootPropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:138:71: (iv_ruleGithubwfRootPropertiesAbstract= ruleGithubwfRootPropertiesAbstract EOF )
            // InternalGithubwfParser.g:139:2: iv_ruleGithubwfRootPropertiesAbstract= ruleGithubwfRootPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootPropertiesAbstract=ruleGithubwfRootPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootPropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootPropertiesAbstract"
    // InternalGithubwfParser.g:145:1: ruleGithubwfRootPropertiesAbstract returns [EObject current=null] : (this_GithubwfRootName_0= ruleGithubwfRootName | this_GithubwfRootOn_1= ruleGithubwfRootOn | this_GithubwfRootEnv_2= ruleGithubwfRootEnv | this_GithubwfRootDefaults_3= ruleGithubwfRootDefaults | this_GithubwfRootConcurrency_4= ruleGithubwfRootConcurrency | this_GithubwfRootJobs_5= ruleGithubwfRootJobs | this_GithubwfRootRun_45name_6= ruleGithubwfRootRun_45name | this_GithubwfRootPermissions_7= ruleGithubwfRootPermissions ) ;
    public final EObject ruleGithubwfRootPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootName_0 = null;

        EObject this_GithubwfRootOn_1 = null;

        EObject this_GithubwfRootEnv_2 = null;

        EObject this_GithubwfRootDefaults_3 = null;

        EObject this_GithubwfRootConcurrency_4 = null;

        EObject this_GithubwfRootJobs_5 = null;

        EObject this_GithubwfRootRun_45name_6 = null;

        EObject this_GithubwfRootPermissions_7 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:151:2: ( (this_GithubwfRootName_0= ruleGithubwfRootName | this_GithubwfRootOn_1= ruleGithubwfRootOn | this_GithubwfRootEnv_2= ruleGithubwfRootEnv | this_GithubwfRootDefaults_3= ruleGithubwfRootDefaults | this_GithubwfRootConcurrency_4= ruleGithubwfRootConcurrency | this_GithubwfRootJobs_5= ruleGithubwfRootJobs | this_GithubwfRootRun_45name_6= ruleGithubwfRootRun_45name | this_GithubwfRootPermissions_7= ruleGithubwfRootPermissions ) )
            // InternalGithubwfParser.g:152:2: (this_GithubwfRootName_0= ruleGithubwfRootName | this_GithubwfRootOn_1= ruleGithubwfRootOn | this_GithubwfRootEnv_2= ruleGithubwfRootEnv | this_GithubwfRootDefaults_3= ruleGithubwfRootDefaults | this_GithubwfRootConcurrency_4= ruleGithubwfRootConcurrency | this_GithubwfRootJobs_5= ruleGithubwfRootJobs | this_GithubwfRootRun_45name_6= ruleGithubwfRootRun_45name | this_GithubwfRootPermissions_7= ruleGithubwfRootPermissions )
            {
            // InternalGithubwfParser.g:152:2: (this_GithubwfRootName_0= ruleGithubwfRootName | this_GithubwfRootOn_1= ruleGithubwfRootOn | this_GithubwfRootEnv_2= ruleGithubwfRootEnv | this_GithubwfRootDefaults_3= ruleGithubwfRootDefaults | this_GithubwfRootConcurrency_4= ruleGithubwfRootConcurrency | this_GithubwfRootJobs_5= ruleGithubwfRootJobs | this_GithubwfRootRun_45name_6= ruleGithubwfRootRun_45name | this_GithubwfRootPermissions_7= ruleGithubwfRootPermissions )
            int alt3=8;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt3=1;
                }
                break;
            case On:
                {
                alt3=2;
                }
                break;
            case Env:
                {
                alt3=3;
                }
                break;
            case Defaults:
                {
                alt3=4;
                }
                break;
            case Concurrency:
                {
                alt3=5;
                }
                break;
            case Jobs:
                {
                alt3=6;
                }
                break;
            case RunName:
                {
                alt3=7;
                }
                break;
            case Permissions:
                {
                alt3=8;
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
                    // InternalGithubwfParser.g:153:3: this_GithubwfRootName_0= ruleGithubwfRootName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootPropertiesAbstractAccess().getGithubwfRootNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootName_0=ruleGithubwfRootName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootName_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:162:3: this_GithubwfRootOn_1= ruleGithubwfRootOn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootPropertiesAbstractAccess().getGithubwfRootOnParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOn_1=ruleGithubwfRootOn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOn_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfParser.g:171:3: this_GithubwfRootEnv_2= ruleGithubwfRootEnv
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootPropertiesAbstractAccess().getGithubwfRootEnvParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootEnv_2=ruleGithubwfRootEnv();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootEnv_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfParser.g:180:3: this_GithubwfRootDefaults_3= ruleGithubwfRootDefaults
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootPropertiesAbstractAccess().getGithubwfRootDefaultsParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootDefaults_3=ruleGithubwfRootDefaults();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootDefaults_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfParser.g:189:3: this_GithubwfRootConcurrency_4= ruleGithubwfRootConcurrency
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootPropertiesAbstractAccess().getGithubwfRootConcurrencyParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootConcurrency_4=ruleGithubwfRootConcurrency();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootConcurrency_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfParser.g:198:3: this_GithubwfRootJobs_5= ruleGithubwfRootJobs
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootPropertiesAbstractAccess().getGithubwfRootJobsParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootJobs_5=ruleGithubwfRootJobs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootJobs_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfParser.g:207:3: this_GithubwfRootRun_45name_6= ruleGithubwfRootRun_45name
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootPropertiesAbstractAccess().getGithubwfRootRun_45nameParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootRun_45name_6=ruleGithubwfRootRun_45name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootRun_45name_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGithubwfParser.g:216:3: this_GithubwfRootPermissions_7= ruleGithubwfRootPermissions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootPropertiesAbstractAccess().getGithubwfRootPermissionsParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootPermissions_7=ruleGithubwfRootPermissions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootPermissions_7;
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
    // $ANTLR end "ruleGithubwfRootPropertiesAbstract"


    // $ANTLR start "entryRuleGithubwfRootOnAbstract"
    // InternalGithubwfParser.g:228:1: entryRuleGithubwfRootOnAbstract returns [EObject current=null] : iv_ruleGithubwfRootOnAbstract= ruleGithubwfRootOnAbstract EOF ;
    public final EObject entryRuleGithubwfRootOnAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnAbstract = null;


        try {
            // InternalGithubwfParser.g:228:63: (iv_ruleGithubwfRootOnAbstract= ruleGithubwfRootOnAbstract EOF )
            // InternalGithubwfParser.g:229:2: iv_ruleGithubwfRootOnAbstract= ruleGithubwfRootOnAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnAbstract=ruleGithubwfRootOnAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnAbstract"


    // $ANTLR start "ruleGithubwfRootOnAbstract"
    // InternalGithubwfParser.g:235:1: ruleGithubwfRootOnAbstract returns [EObject current=null] : ( ( ( ruleGithubwfRootOnTypeNumber )=>this_GithubwfRootOnTypeNumber_0= ruleGithubwfRootOnTypeNumber ) | this_GithubwfRootOnTypeString_1= ruleGithubwfRootOnTypeString | this_GithubwfRootOnTypeInteger_2= ruleGithubwfRootOnTypeInteger | this_GithubwfRootOnTypeBoolean_3= ruleGithubwfRootOnTypeBoolean | this_GithubwfRootOnTypeObject_4= ruleGithubwfRootOnTypeObject | this_GithubwfRootOnTypeArray_5= ruleGithubwfRootOnTypeArray | this_GithubwfRootOnTypeNull_6= ruleGithubwfRootOnTypeNull ) ;
    public final EObject ruleGithubwfRootOnAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootOnTypeNumber_0 = null;

        EObject this_GithubwfRootOnTypeString_1 = null;

        EObject this_GithubwfRootOnTypeInteger_2 = null;

        EObject this_GithubwfRootOnTypeBoolean_3 = null;

        EObject this_GithubwfRootOnTypeObject_4 = null;

        EObject this_GithubwfRootOnTypeArray_5 = null;

        EObject this_GithubwfRootOnTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:241:2: ( ( ( ( ruleGithubwfRootOnTypeNumber )=>this_GithubwfRootOnTypeNumber_0= ruleGithubwfRootOnTypeNumber ) | this_GithubwfRootOnTypeString_1= ruleGithubwfRootOnTypeString | this_GithubwfRootOnTypeInteger_2= ruleGithubwfRootOnTypeInteger | this_GithubwfRootOnTypeBoolean_3= ruleGithubwfRootOnTypeBoolean | this_GithubwfRootOnTypeObject_4= ruleGithubwfRootOnTypeObject | this_GithubwfRootOnTypeArray_5= ruleGithubwfRootOnTypeArray | this_GithubwfRootOnTypeNull_6= ruleGithubwfRootOnTypeNull ) )
            // InternalGithubwfParser.g:242:2: ( ( ( ruleGithubwfRootOnTypeNumber )=>this_GithubwfRootOnTypeNumber_0= ruleGithubwfRootOnTypeNumber ) | this_GithubwfRootOnTypeString_1= ruleGithubwfRootOnTypeString | this_GithubwfRootOnTypeInteger_2= ruleGithubwfRootOnTypeInteger | this_GithubwfRootOnTypeBoolean_3= ruleGithubwfRootOnTypeBoolean | this_GithubwfRootOnTypeObject_4= ruleGithubwfRootOnTypeObject | this_GithubwfRootOnTypeArray_5= ruleGithubwfRootOnTypeArray | this_GithubwfRootOnTypeNull_6= ruleGithubwfRootOnTypeNull )
            {
            // InternalGithubwfParser.g:242:2: ( ( ( ruleGithubwfRootOnTypeNumber )=>this_GithubwfRootOnTypeNumber_0= ruleGithubwfRootOnTypeNumber ) | this_GithubwfRootOnTypeString_1= ruleGithubwfRootOnTypeString | this_GithubwfRootOnTypeInteger_2= ruleGithubwfRootOnTypeInteger | this_GithubwfRootOnTypeBoolean_3= ruleGithubwfRootOnTypeBoolean | this_GithubwfRootOnTypeObject_4= ruleGithubwfRootOnTypeObject | this_GithubwfRootOnTypeArray_5= ruleGithubwfRootOnTypeArray | this_GithubwfRootOnTypeNull_6= ruleGithubwfRootOnTypeNull )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalGithubwfParser.g:243:3: ( ( ruleGithubwfRootOnTypeNumber )=>this_GithubwfRootOnTypeNumber_0= ruleGithubwfRootOnTypeNumber )
                    {
                    // InternalGithubwfParser.g:243:3: ( ( ruleGithubwfRootOnTypeNumber )=>this_GithubwfRootOnTypeNumber_0= ruleGithubwfRootOnTypeNumber )
                    // InternalGithubwfParser.g:244:4: ( ruleGithubwfRootOnTypeNumber )=>this_GithubwfRootOnTypeNumber_0= ruleGithubwfRootOnTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getGithubwfRootOnAbstractAccess().getGithubwfRootOnTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnTypeNumber_0=ruleGithubwfRootOnTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GithubwfRootOnTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:255:3: this_GithubwfRootOnTypeString_1= ruleGithubwfRootOnTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnAbstractAccess().getGithubwfRootOnTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnTypeString_1=ruleGithubwfRootOnTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfParser.g:264:3: this_GithubwfRootOnTypeInteger_2= ruleGithubwfRootOnTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnAbstractAccess().getGithubwfRootOnTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnTypeInteger_2=ruleGithubwfRootOnTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfParser.g:273:3: this_GithubwfRootOnTypeBoolean_3= ruleGithubwfRootOnTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnAbstractAccess().getGithubwfRootOnTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnTypeBoolean_3=ruleGithubwfRootOnTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfParser.g:282:3: this_GithubwfRootOnTypeObject_4= ruleGithubwfRootOnTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnAbstractAccess().getGithubwfRootOnTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnTypeObject_4=ruleGithubwfRootOnTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfParser.g:291:3: this_GithubwfRootOnTypeArray_5= ruleGithubwfRootOnTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnAbstractAccess().getGithubwfRootOnTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnTypeArray_5=ruleGithubwfRootOnTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfParser.g:300:3: this_GithubwfRootOnTypeNull_6= ruleGithubwfRootOnTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootOnAbstractAccess().getGithubwfRootOnTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootOnTypeNull_6=ruleGithubwfRootOnTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootOnTypeNull_6;
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
    // $ANTLR end "ruleGithubwfRootOnAbstract"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyAbstract"
    // InternalGithubwfParser.g:312:1: entryRuleGithubwfRootConcurrencyAbstract returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyAbstract= ruleGithubwfRootConcurrencyAbstract EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyAbstract = null;


        try {
            // InternalGithubwfParser.g:312:72: (iv_ruleGithubwfRootConcurrencyAbstract= ruleGithubwfRootConcurrencyAbstract EOF )
            // InternalGithubwfParser.g:313:2: iv_ruleGithubwfRootConcurrencyAbstract= ruleGithubwfRootConcurrencyAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyAbstract=ruleGithubwfRootConcurrencyAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyAbstract"


    // $ANTLR start "ruleGithubwfRootConcurrencyAbstract"
    // InternalGithubwfParser.g:319:1: ruleGithubwfRootConcurrencyAbstract returns [EObject current=null] : ( ( ( ruleGithubwfRootConcurrencyTypeNumber )=>this_GithubwfRootConcurrencyTypeNumber_0= ruleGithubwfRootConcurrencyTypeNumber ) | this_GithubwfRootConcurrencyTypeString_1= ruleGithubwfRootConcurrencyTypeString | this_GithubwfRootConcurrencyTypeInteger_2= ruleGithubwfRootConcurrencyTypeInteger | this_GithubwfRootConcurrencyTypeBoolean_3= ruleGithubwfRootConcurrencyTypeBoolean | this_GithubwfRootConcurrencyTypeObject_4= ruleGithubwfRootConcurrencyTypeObject | this_GithubwfRootConcurrencyTypeArray_5= ruleGithubwfRootConcurrencyTypeArray | this_GithubwfRootConcurrencyTypeNull_6= ruleGithubwfRootConcurrencyTypeNull ) ;
    public final EObject ruleGithubwfRootConcurrencyAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootConcurrencyTypeNumber_0 = null;

        EObject this_GithubwfRootConcurrencyTypeString_1 = null;

        EObject this_GithubwfRootConcurrencyTypeInteger_2 = null;

        EObject this_GithubwfRootConcurrencyTypeBoolean_3 = null;

        EObject this_GithubwfRootConcurrencyTypeObject_4 = null;

        EObject this_GithubwfRootConcurrencyTypeArray_5 = null;

        EObject this_GithubwfRootConcurrencyTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:325:2: ( ( ( ( ruleGithubwfRootConcurrencyTypeNumber )=>this_GithubwfRootConcurrencyTypeNumber_0= ruleGithubwfRootConcurrencyTypeNumber ) | this_GithubwfRootConcurrencyTypeString_1= ruleGithubwfRootConcurrencyTypeString | this_GithubwfRootConcurrencyTypeInteger_2= ruleGithubwfRootConcurrencyTypeInteger | this_GithubwfRootConcurrencyTypeBoolean_3= ruleGithubwfRootConcurrencyTypeBoolean | this_GithubwfRootConcurrencyTypeObject_4= ruleGithubwfRootConcurrencyTypeObject | this_GithubwfRootConcurrencyTypeArray_5= ruleGithubwfRootConcurrencyTypeArray | this_GithubwfRootConcurrencyTypeNull_6= ruleGithubwfRootConcurrencyTypeNull ) )
            // InternalGithubwfParser.g:326:2: ( ( ( ruleGithubwfRootConcurrencyTypeNumber )=>this_GithubwfRootConcurrencyTypeNumber_0= ruleGithubwfRootConcurrencyTypeNumber ) | this_GithubwfRootConcurrencyTypeString_1= ruleGithubwfRootConcurrencyTypeString | this_GithubwfRootConcurrencyTypeInteger_2= ruleGithubwfRootConcurrencyTypeInteger | this_GithubwfRootConcurrencyTypeBoolean_3= ruleGithubwfRootConcurrencyTypeBoolean | this_GithubwfRootConcurrencyTypeObject_4= ruleGithubwfRootConcurrencyTypeObject | this_GithubwfRootConcurrencyTypeArray_5= ruleGithubwfRootConcurrencyTypeArray | this_GithubwfRootConcurrencyTypeNull_6= ruleGithubwfRootConcurrencyTypeNull )
            {
            // InternalGithubwfParser.g:326:2: ( ( ( ruleGithubwfRootConcurrencyTypeNumber )=>this_GithubwfRootConcurrencyTypeNumber_0= ruleGithubwfRootConcurrencyTypeNumber ) | this_GithubwfRootConcurrencyTypeString_1= ruleGithubwfRootConcurrencyTypeString | this_GithubwfRootConcurrencyTypeInteger_2= ruleGithubwfRootConcurrencyTypeInteger | this_GithubwfRootConcurrencyTypeBoolean_3= ruleGithubwfRootConcurrencyTypeBoolean | this_GithubwfRootConcurrencyTypeObject_4= ruleGithubwfRootConcurrencyTypeObject | this_GithubwfRootConcurrencyTypeArray_5= ruleGithubwfRootConcurrencyTypeArray | this_GithubwfRootConcurrencyTypeNull_6= ruleGithubwfRootConcurrencyTypeNull )
            int alt5=7;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalGithubwfParser.g:327:3: ( ( ruleGithubwfRootConcurrencyTypeNumber )=>this_GithubwfRootConcurrencyTypeNumber_0= ruleGithubwfRootConcurrencyTypeNumber )
                    {
                    // InternalGithubwfParser.g:327:3: ( ( ruleGithubwfRootConcurrencyTypeNumber )=>this_GithubwfRootConcurrencyTypeNumber_0= ruleGithubwfRootConcurrencyTypeNumber )
                    // InternalGithubwfParser.g:328:4: ( ruleGithubwfRootConcurrencyTypeNumber )=>this_GithubwfRootConcurrencyTypeNumber_0= ruleGithubwfRootConcurrencyTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAbstractAccess().getGithubwfRootConcurrencyTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootConcurrencyTypeNumber_0=ruleGithubwfRootConcurrencyTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GithubwfRootConcurrencyTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:339:3: this_GithubwfRootConcurrencyTypeString_1= ruleGithubwfRootConcurrencyTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAbstractAccess().getGithubwfRootConcurrencyTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootConcurrencyTypeString_1=ruleGithubwfRootConcurrencyTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootConcurrencyTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfParser.g:348:3: this_GithubwfRootConcurrencyTypeInteger_2= ruleGithubwfRootConcurrencyTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAbstractAccess().getGithubwfRootConcurrencyTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootConcurrencyTypeInteger_2=ruleGithubwfRootConcurrencyTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootConcurrencyTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfParser.g:357:3: this_GithubwfRootConcurrencyTypeBoolean_3= ruleGithubwfRootConcurrencyTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAbstractAccess().getGithubwfRootConcurrencyTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootConcurrencyTypeBoolean_3=ruleGithubwfRootConcurrencyTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootConcurrencyTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfParser.g:366:3: this_GithubwfRootConcurrencyTypeObject_4= ruleGithubwfRootConcurrencyTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAbstractAccess().getGithubwfRootConcurrencyTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootConcurrencyTypeObject_4=ruleGithubwfRootConcurrencyTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootConcurrencyTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfParser.g:375:3: this_GithubwfRootConcurrencyTypeArray_5= ruleGithubwfRootConcurrencyTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAbstractAccess().getGithubwfRootConcurrencyTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootConcurrencyTypeArray_5=ruleGithubwfRootConcurrencyTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootConcurrencyTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfParser.g:384:3: this_GithubwfRootConcurrencyTypeNull_6= ruleGithubwfRootConcurrencyTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAbstractAccess().getGithubwfRootConcurrencyTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootConcurrencyTypeNull_6=ruleGithubwfRootConcurrencyTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootConcurrencyTypeNull_6;
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
    // $ANTLR end "ruleGithubwfRootConcurrencyAbstract"


    // $ANTLR start "entryRuleGithubwfRootJobsPropertiesAbstract"
    // InternalGithubwfParser.g:396:1: entryRuleGithubwfRootJobsPropertiesAbstract returns [EObject current=null] : iv_ruleGithubwfRootJobsPropertiesAbstract= ruleGithubwfRootJobsPropertiesAbstract EOF ;
    public final EObject entryRuleGithubwfRootJobsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:396:75: (iv_ruleGithubwfRootJobsPropertiesAbstract= ruleGithubwfRootJobsPropertiesAbstract EOF )
            // InternalGithubwfParser.g:397:2: iv_ruleGithubwfRootJobsPropertiesAbstract= ruleGithubwfRootJobsPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPropertiesAbstract=ruleGithubwfRootJobsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootJobsPropertiesAbstract"
    // InternalGithubwfParser.g:403:1: ruleGithubwfRootJobsPropertiesAbstract returns [EObject current=null] : ( ( ruleGithubwfRootJobsPatternProperties0 )=>this_GithubwfRootJobsPatternProperties0_0= ruleGithubwfRootJobsPatternProperties0 ) ;
    public final EObject ruleGithubwfRootJobsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootJobsPatternProperties0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:409:2: ( ( ( ruleGithubwfRootJobsPatternProperties0 )=>this_GithubwfRootJobsPatternProperties0_0= ruleGithubwfRootJobsPatternProperties0 ) )
            // InternalGithubwfParser.g:410:2: ( ( ruleGithubwfRootJobsPatternProperties0 )=>this_GithubwfRootJobsPatternProperties0_0= ruleGithubwfRootJobsPatternProperties0 )
            {
            // InternalGithubwfParser.g:410:2: ( ( ruleGithubwfRootJobsPatternProperties0 )=>this_GithubwfRootJobsPatternProperties0_0= ruleGithubwfRootJobsPatternProperties0 )
            // InternalGithubwfParser.g:411:3: ( ruleGithubwfRootJobsPatternProperties0 )=>this_GithubwfRootJobsPatternProperties0_0= ruleGithubwfRootJobsPatternProperties0
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGithubwfRootJobsPropertiesAbstractAccess().getGithubwfRootJobsPatternProperties0ParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_GithubwfRootJobsPatternProperties0_0=ruleGithubwfRootJobsPatternProperties0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_GithubwfRootJobsPatternProperties0_0;
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
    // $ANTLR end "ruleGithubwfRootJobsPropertiesAbstract"


    // $ANTLR start "entryRuleGithubwfRootOnPropertiesAbstract"
    // InternalGithubwfParser.g:424:1: entryRuleGithubwfRootOnPropertiesAbstract returns [EObject current=null] : iv_ruleGithubwfRootOnPropertiesAbstract= ruleGithubwfRootOnPropertiesAbstract EOF ;
    public final EObject entryRuleGithubwfRootOnPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnPropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:424:73: (iv_ruleGithubwfRootOnPropertiesAbstract= ruleGithubwfRootOnPropertiesAbstract EOF )
            // InternalGithubwfParser.g:425:2: iv_ruleGithubwfRootOnPropertiesAbstract= ruleGithubwfRootOnPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnPropertiesAbstract=ruleGithubwfRootOnPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnPropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootOnPropertiesAbstract"
    // InternalGithubwfParser.g:431:1: ruleGithubwfRootOnPropertiesAbstract returns [EObject current=null] : ( ( ruleGithubwfRootOnAdditionalProperties )=>this_GithubwfRootOnAdditionalProperties_0= ruleGithubwfRootOnAdditionalProperties ) ;
    public final EObject ruleGithubwfRootOnPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootOnAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:437:2: ( ( ( ruleGithubwfRootOnAdditionalProperties )=>this_GithubwfRootOnAdditionalProperties_0= ruleGithubwfRootOnAdditionalProperties ) )
            // InternalGithubwfParser.g:438:2: ( ( ruleGithubwfRootOnAdditionalProperties )=>this_GithubwfRootOnAdditionalProperties_0= ruleGithubwfRootOnAdditionalProperties )
            {
            // InternalGithubwfParser.g:438:2: ( ( ruleGithubwfRootOnAdditionalProperties )=>this_GithubwfRootOnAdditionalProperties_0= ruleGithubwfRootOnAdditionalProperties )
            // InternalGithubwfParser.g:439:3: ( ruleGithubwfRootOnAdditionalProperties )=>this_GithubwfRootOnAdditionalProperties_0= ruleGithubwfRootOnAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGithubwfRootOnPropertiesAbstractAccess().getGithubwfRootOnAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_GithubwfRootOnAdditionalProperties_0=ruleGithubwfRootOnAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_GithubwfRootOnAdditionalProperties_0;
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
    // $ANTLR end "ruleGithubwfRootOnPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfParser.g:452:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalGithubwfParser.g:452:46: (iv_ruleValue= ruleValue EOF )
            // InternalGithubwfParser.g:453:2: iv_ruleValue= ruleValue EOF
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
    // InternalGithubwfParser.g:459:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalGithubwfParser.g:465:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalGithubwfParser.g:466:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalGithubwfParser.g:466:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt6=6;
            switch ( input.LA(1) ) {
            case WorkingDirectory:
            case Concurrency:
            case Permissions:
            case Defaults:
            case RunName:
            case Shell:
            case Jobs:
            case Name:
            case Env:
            case Run:
            case On:
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt6=2;
                }
                break;
            case Null:
                {
                alt6=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt6=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt6=5;
                }
                break;
            case False:
            case True:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGithubwfParser.g:467:3: this_StringValue_0= ruleStringValue
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
                    // InternalGithubwfParser.g:476:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalGithubwfParser.g:485:3: this_NullValue_2= ruleNullValue
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
                    // InternalGithubwfParser.g:494:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalGithubwfParser.g:503:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalGithubwfParser.g:512:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleEnvAbstract"
    // InternalGithubwfParser.g:524:1: entryRuleEnvAbstract returns [EObject current=null] : iv_ruleEnvAbstract= ruleEnvAbstract EOF ;
    public final EObject entryRuleEnvAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAbstract = null;


        try {
            // InternalGithubwfParser.g:524:52: (iv_ruleEnvAbstract= ruleEnvAbstract EOF )
            // InternalGithubwfParser.g:525:2: iv_ruleEnvAbstract= ruleEnvAbstract EOF
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
    // InternalGithubwfParser.g:531:1: ruleEnvAbstract returns [EObject current=null] : ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) ;
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
            // InternalGithubwfParser.g:537:2: ( ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) )
            // InternalGithubwfParser.g:538:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            {
            // InternalGithubwfParser.g:538:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalGithubwfParser.g:539:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    {
                    // InternalGithubwfParser.g:539:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    // InternalGithubwfParser.g:540:4: ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber
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
                    // InternalGithubwfParser.g:551:3: this_EnvTypeString_1= ruleEnvTypeString
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
                    // InternalGithubwfParser.g:560:3: this_EnvTypeInteger_2= ruleEnvTypeInteger
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
                    // InternalGithubwfParser.g:569:3: this_EnvTypeBoolean_3= ruleEnvTypeBoolean
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
                    // InternalGithubwfParser.g:578:3: this_EnvTypeObject_4= ruleEnvTypeObject
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
                    // InternalGithubwfParser.g:587:3: this_EnvTypeArray_5= ruleEnvTypeArray
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
                    // InternalGithubwfParser.g:596:3: this_EnvTypeNull_6= ruleEnvTypeNull
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
    // InternalGithubwfParser.g:608:1: entryRuleEnvPropertiesAbstract returns [EObject current=null] : iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF ;
    public final EObject entryRuleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvPropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:608:62: (iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF )
            // InternalGithubwfParser.g:609:2: iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF
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
    // InternalGithubwfParser.g:615:1: ruleEnvPropertiesAbstract returns [EObject current=null] : ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) ;
    public final EObject ruleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:621:2: ( ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) )
            // InternalGithubwfParser.g:622:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            {
            // InternalGithubwfParser.g:622:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            // InternalGithubwfParser.g:623:3: ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties
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


    // $ANTLR start "entryRuleDefaultsPropertiesAbstract"
    // InternalGithubwfParser.g:636:1: entryRuleDefaultsPropertiesAbstract returns [EObject current=null] : iv_ruleDefaultsPropertiesAbstract= ruleDefaultsPropertiesAbstract EOF ;
    public final EObject entryRuleDefaultsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultsPropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:636:67: (iv_ruleDefaultsPropertiesAbstract= ruleDefaultsPropertiesAbstract EOF )
            // InternalGithubwfParser.g:637:2: iv_ruleDefaultsPropertiesAbstract= ruleDefaultsPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultsPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultsPropertiesAbstract=ruleDefaultsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultsPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultsPropertiesAbstract"


    // $ANTLR start "ruleDefaultsPropertiesAbstract"
    // InternalGithubwfParser.g:643:1: ruleDefaultsPropertiesAbstract returns [EObject current=null] : this_DefaultsRun_0= ruleDefaultsRun ;
    public final EObject ruleDefaultsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultsRun_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:649:2: (this_DefaultsRun_0= ruleDefaultsRun )
            // InternalGithubwfParser.g:650:2: this_DefaultsRun_0= ruleDefaultsRun
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getDefaultsPropertiesAbstractAccess().getDefaultsRunParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_DefaultsRun_0=ruleDefaultsRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_DefaultsRun_0;
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
    // $ANTLR end "ruleDefaultsPropertiesAbstract"


    // $ANTLR start "entryRuleDefaultsRunPropertiesAbstract"
    // InternalGithubwfParser.g:661:1: entryRuleDefaultsRunPropertiesAbstract returns [EObject current=null] : iv_ruleDefaultsRunPropertiesAbstract= ruleDefaultsRunPropertiesAbstract EOF ;
    public final EObject entryRuleDefaultsRunPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultsRunPropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:661:70: (iv_ruleDefaultsRunPropertiesAbstract= ruleDefaultsRunPropertiesAbstract EOF )
            // InternalGithubwfParser.g:662:2: iv_ruleDefaultsRunPropertiesAbstract= ruleDefaultsRunPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultsRunPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultsRunPropertiesAbstract=ruleDefaultsRunPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultsRunPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultsRunPropertiesAbstract"


    // $ANTLR start "ruleDefaultsRunPropertiesAbstract"
    // InternalGithubwfParser.g:668:1: ruleDefaultsRunPropertiesAbstract returns [EObject current=null] : (this_DefaultsRunShell_0= ruleDefaultsRunShell | this_DefaultsRunWorking_45directory_1= ruleDefaultsRunWorking_45directory ) ;
    public final EObject ruleDefaultsRunPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultsRunShell_0 = null;

        EObject this_DefaultsRunWorking_45directory_1 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:674:2: ( (this_DefaultsRunShell_0= ruleDefaultsRunShell | this_DefaultsRunWorking_45directory_1= ruleDefaultsRunWorking_45directory ) )
            // InternalGithubwfParser.g:675:2: (this_DefaultsRunShell_0= ruleDefaultsRunShell | this_DefaultsRunWorking_45directory_1= ruleDefaultsRunWorking_45directory )
            {
            // InternalGithubwfParser.g:675:2: (this_DefaultsRunShell_0= ruleDefaultsRunShell | this_DefaultsRunWorking_45directory_1= ruleDefaultsRunWorking_45directory )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Shell) ) {
                alt8=1;
            }
            else if ( (LA8_0==WorkingDirectory) ) {
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
                    // InternalGithubwfParser.g:676:3: this_DefaultsRunShell_0= ruleDefaultsRunShell
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefaultsRunPropertiesAbstractAccess().getDefaultsRunShellParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefaultsRunShell_0=ruleDefaultsRunShell();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefaultsRunShell_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:685:3: this_DefaultsRunWorking_45directory_1= ruleDefaultsRunWorking_45directory
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefaultsRunPropertiesAbstractAccess().getDefaultsRunWorking_45directoryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefaultsRunWorking_45directory_1=ruleDefaultsRunWorking_45directory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefaultsRunWorking_45directory_1;
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
    // $ANTLR end "ruleDefaultsRunPropertiesAbstract"


    // $ANTLR start "entryRuleShellAbstract"
    // InternalGithubwfParser.g:697:1: entryRuleShellAbstract returns [EObject current=null] : iv_ruleShellAbstract= ruleShellAbstract EOF ;
    public final EObject entryRuleShellAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellAbstract = null;


        try {
            // InternalGithubwfParser.g:697:54: (iv_ruleShellAbstract= ruleShellAbstract EOF )
            // InternalGithubwfParser.g:698:2: iv_ruleShellAbstract= ruleShellAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellAbstract=ruleShellAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellAbstract"


    // $ANTLR start "ruleShellAbstract"
    // InternalGithubwfParser.g:704:1: ruleShellAbstract returns [EObject current=null] : ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull ) ;
    public final EObject ruleShellAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ShellTypeNumber_0 = null;

        EObject this_ShellTypeString_1 = null;

        EObject this_ShellTypeInteger_2 = null;

        EObject this_ShellTypeBoolean_3 = null;

        EObject this_ShellTypeObject_4 = null;

        EObject this_ShellTypeArray_5 = null;

        EObject this_ShellTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:710:2: ( ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull ) )
            // InternalGithubwfParser.g:711:2: ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull )
            {
            // InternalGithubwfParser.g:711:2: ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull )
            int alt9=7;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalGithubwfParser.g:712:3: ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber )
                    {
                    // InternalGithubwfParser.g:712:3: ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber )
                    // InternalGithubwfParser.g:713:4: ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeNumber_0=ruleShellTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ShellTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:724:3: this_ShellTypeString_1= ruleShellTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeString_1=ruleShellTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfParser.g:733:3: this_ShellTypeInteger_2= ruleShellTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeInteger_2=ruleShellTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfParser.g:742:3: this_ShellTypeBoolean_3= ruleShellTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeBoolean_3=ruleShellTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfParser.g:751:3: this_ShellTypeObject_4= ruleShellTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeObject_4=ruleShellTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfParser.g:760:3: this_ShellTypeArray_5= ruleShellTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeArray_5=ruleShellTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfParser.g:769:3: this_ShellTypeNull_6= ruleShellTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeNull_6=ruleShellTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeNull_6;
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
    // $ANTLR end "ruleShellAbstract"


    // $ANTLR start "entryRuleShellPropertiesAbstract"
    // InternalGithubwfParser.g:781:1: entryRuleShellPropertiesAbstract returns [EObject current=null] : iv_ruleShellPropertiesAbstract= ruleShellPropertiesAbstract EOF ;
    public final EObject entryRuleShellPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellPropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:781:64: (iv_ruleShellPropertiesAbstract= ruleShellPropertiesAbstract EOF )
            // InternalGithubwfParser.g:782:2: iv_ruleShellPropertiesAbstract= ruleShellPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellPropertiesAbstract=ruleShellPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellPropertiesAbstract"


    // $ANTLR start "ruleShellPropertiesAbstract"
    // InternalGithubwfParser.g:788:1: ruleShellPropertiesAbstract returns [EObject current=null] : ( ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties ) ;
    public final EObject ruleShellPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ShellAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:794:2: ( ( ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties ) )
            // InternalGithubwfParser.g:795:2: ( ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties )
            {
            // InternalGithubwfParser.g:795:2: ( ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties )
            // InternalGithubwfParser.g:796:3: ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShellPropertiesAbstractAccess().getShellAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ShellAdditionalProperties_0=ruleShellAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShellAdditionalProperties_0;
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
    // $ANTLR end "ruleShellPropertiesAbstract"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyPropertiesAbstract"
    // InternalGithubwfParser.g:809:1: entryRuleGithubwfRootConcurrencyPropertiesAbstract returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyPropertiesAbstract= ruleGithubwfRootConcurrencyPropertiesAbstract EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyPropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:809:82: (iv_ruleGithubwfRootConcurrencyPropertiesAbstract= ruleGithubwfRootConcurrencyPropertiesAbstract EOF )
            // InternalGithubwfParser.g:810:2: iv_ruleGithubwfRootConcurrencyPropertiesAbstract= ruleGithubwfRootConcurrencyPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyPropertiesAbstract=ruleGithubwfRootConcurrencyPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyPropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootConcurrencyPropertiesAbstract"
    // InternalGithubwfParser.g:816:1: ruleGithubwfRootConcurrencyPropertiesAbstract returns [EObject current=null] : ( ( ruleGithubwfRootConcurrencyAdditionalProperties )=>this_GithubwfRootConcurrencyAdditionalProperties_0= ruleGithubwfRootConcurrencyAdditionalProperties ) ;
    public final EObject ruleGithubwfRootConcurrencyPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootConcurrencyAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:822:2: ( ( ( ruleGithubwfRootConcurrencyAdditionalProperties )=>this_GithubwfRootConcurrencyAdditionalProperties_0= ruleGithubwfRootConcurrencyAdditionalProperties ) )
            // InternalGithubwfParser.g:823:2: ( ( ruleGithubwfRootConcurrencyAdditionalProperties )=>this_GithubwfRootConcurrencyAdditionalProperties_0= ruleGithubwfRootConcurrencyAdditionalProperties )
            {
            // InternalGithubwfParser.g:823:2: ( ( ruleGithubwfRootConcurrencyAdditionalProperties )=>this_GithubwfRootConcurrencyAdditionalProperties_0= ruleGithubwfRootConcurrencyAdditionalProperties )
            // InternalGithubwfParser.g:824:3: ( ruleGithubwfRootConcurrencyAdditionalProperties )=>this_GithubwfRootConcurrencyAdditionalProperties_0= ruleGithubwfRootConcurrencyAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGithubwfRootConcurrencyPropertiesAbstractAccess().getGithubwfRootConcurrencyAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_GithubwfRootConcurrencyAdditionalProperties_0=ruleGithubwfRootConcurrencyAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_GithubwfRootConcurrencyAdditionalProperties_0;
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
    // $ANTLR end "ruleGithubwfRootConcurrencyPropertiesAbstract"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0Abstract"
    // InternalGithubwfParser.g:837:1: entryRuleGithubwfRootJobsPatternProperties0Abstract returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0Abstract= ruleGithubwfRootJobsPatternProperties0Abstract EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0Abstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0Abstract = null;


        try {
            // InternalGithubwfParser.g:837:83: (iv_ruleGithubwfRootJobsPatternProperties0Abstract= ruleGithubwfRootJobsPatternProperties0Abstract EOF )
            // InternalGithubwfParser.g:838:2: iv_ruleGithubwfRootJobsPatternProperties0Abstract= ruleGithubwfRootJobsPatternProperties0Abstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0Abstract=ruleGithubwfRootJobsPatternProperties0Abstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0Abstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0Abstract"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0Abstract"
    // InternalGithubwfParser.g:844:1: ruleGithubwfRootJobsPatternProperties0Abstract returns [EObject current=null] : ( ( ( ruleGithubwfRootJobsPatternProperties0TypeNumber )=>this_GithubwfRootJobsPatternProperties0TypeNumber_0= ruleGithubwfRootJobsPatternProperties0TypeNumber ) | this_GithubwfRootJobsPatternProperties0TypeString_1= ruleGithubwfRootJobsPatternProperties0TypeString | this_GithubwfRootJobsPatternProperties0TypeInteger_2= ruleGithubwfRootJobsPatternProperties0TypeInteger | this_GithubwfRootJobsPatternProperties0TypeBoolean_3= ruleGithubwfRootJobsPatternProperties0TypeBoolean | this_GithubwfRootJobsPatternProperties0TypeObject_4= ruleGithubwfRootJobsPatternProperties0TypeObject | this_GithubwfRootJobsPatternProperties0TypeArray_5= ruleGithubwfRootJobsPatternProperties0TypeArray | this_GithubwfRootJobsPatternProperties0TypeNull_6= ruleGithubwfRootJobsPatternProperties0TypeNull ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0Abstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootJobsPatternProperties0TypeNumber_0 = null;

        EObject this_GithubwfRootJobsPatternProperties0TypeString_1 = null;

        EObject this_GithubwfRootJobsPatternProperties0TypeInteger_2 = null;

        EObject this_GithubwfRootJobsPatternProperties0TypeBoolean_3 = null;

        EObject this_GithubwfRootJobsPatternProperties0TypeObject_4 = null;

        EObject this_GithubwfRootJobsPatternProperties0TypeArray_5 = null;

        EObject this_GithubwfRootJobsPatternProperties0TypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:850:2: ( ( ( ( ruleGithubwfRootJobsPatternProperties0TypeNumber )=>this_GithubwfRootJobsPatternProperties0TypeNumber_0= ruleGithubwfRootJobsPatternProperties0TypeNumber ) | this_GithubwfRootJobsPatternProperties0TypeString_1= ruleGithubwfRootJobsPatternProperties0TypeString | this_GithubwfRootJobsPatternProperties0TypeInteger_2= ruleGithubwfRootJobsPatternProperties0TypeInteger | this_GithubwfRootJobsPatternProperties0TypeBoolean_3= ruleGithubwfRootJobsPatternProperties0TypeBoolean | this_GithubwfRootJobsPatternProperties0TypeObject_4= ruleGithubwfRootJobsPatternProperties0TypeObject | this_GithubwfRootJobsPatternProperties0TypeArray_5= ruleGithubwfRootJobsPatternProperties0TypeArray | this_GithubwfRootJobsPatternProperties0TypeNull_6= ruleGithubwfRootJobsPatternProperties0TypeNull ) )
            // InternalGithubwfParser.g:851:2: ( ( ( ruleGithubwfRootJobsPatternProperties0TypeNumber )=>this_GithubwfRootJobsPatternProperties0TypeNumber_0= ruleGithubwfRootJobsPatternProperties0TypeNumber ) | this_GithubwfRootJobsPatternProperties0TypeString_1= ruleGithubwfRootJobsPatternProperties0TypeString | this_GithubwfRootJobsPatternProperties0TypeInteger_2= ruleGithubwfRootJobsPatternProperties0TypeInteger | this_GithubwfRootJobsPatternProperties0TypeBoolean_3= ruleGithubwfRootJobsPatternProperties0TypeBoolean | this_GithubwfRootJobsPatternProperties0TypeObject_4= ruleGithubwfRootJobsPatternProperties0TypeObject | this_GithubwfRootJobsPatternProperties0TypeArray_5= ruleGithubwfRootJobsPatternProperties0TypeArray | this_GithubwfRootJobsPatternProperties0TypeNull_6= ruleGithubwfRootJobsPatternProperties0TypeNull )
            {
            // InternalGithubwfParser.g:851:2: ( ( ( ruleGithubwfRootJobsPatternProperties0TypeNumber )=>this_GithubwfRootJobsPatternProperties0TypeNumber_0= ruleGithubwfRootJobsPatternProperties0TypeNumber ) | this_GithubwfRootJobsPatternProperties0TypeString_1= ruleGithubwfRootJobsPatternProperties0TypeString | this_GithubwfRootJobsPatternProperties0TypeInteger_2= ruleGithubwfRootJobsPatternProperties0TypeInteger | this_GithubwfRootJobsPatternProperties0TypeBoolean_3= ruleGithubwfRootJobsPatternProperties0TypeBoolean | this_GithubwfRootJobsPatternProperties0TypeObject_4= ruleGithubwfRootJobsPatternProperties0TypeObject | this_GithubwfRootJobsPatternProperties0TypeArray_5= ruleGithubwfRootJobsPatternProperties0TypeArray | this_GithubwfRootJobsPatternProperties0TypeNull_6= ruleGithubwfRootJobsPatternProperties0TypeNull )
            int alt10=7;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalGithubwfParser.g:852:3: ( ( ruleGithubwfRootJobsPatternProperties0TypeNumber )=>this_GithubwfRootJobsPatternProperties0TypeNumber_0= ruleGithubwfRootJobsPatternProperties0TypeNumber )
                    {
                    // InternalGithubwfParser.g:852:3: ( ( ruleGithubwfRootJobsPatternProperties0TypeNumber )=>this_GithubwfRootJobsPatternProperties0TypeNumber_0= ruleGithubwfRootJobsPatternProperties0TypeNumber )
                    // InternalGithubwfParser.g:853:4: ( ruleGithubwfRootJobsPatternProperties0TypeNumber )=>this_GithubwfRootJobsPatternProperties0TypeNumber_0= ruleGithubwfRootJobsPatternProperties0TypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AbstractAccess().getGithubwfRootJobsPatternProperties0TypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootJobsPatternProperties0TypeNumber_0=ruleGithubwfRootJobsPatternProperties0TypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_GithubwfRootJobsPatternProperties0TypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:864:3: this_GithubwfRootJobsPatternProperties0TypeString_1= ruleGithubwfRootJobsPatternProperties0TypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AbstractAccess().getGithubwfRootJobsPatternProperties0TypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootJobsPatternProperties0TypeString_1=ruleGithubwfRootJobsPatternProperties0TypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootJobsPatternProperties0TypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfParser.g:873:3: this_GithubwfRootJobsPatternProperties0TypeInteger_2= ruleGithubwfRootJobsPatternProperties0TypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AbstractAccess().getGithubwfRootJobsPatternProperties0TypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootJobsPatternProperties0TypeInteger_2=ruleGithubwfRootJobsPatternProperties0TypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootJobsPatternProperties0TypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfParser.g:882:3: this_GithubwfRootJobsPatternProperties0TypeBoolean_3= ruleGithubwfRootJobsPatternProperties0TypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AbstractAccess().getGithubwfRootJobsPatternProperties0TypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootJobsPatternProperties0TypeBoolean_3=ruleGithubwfRootJobsPatternProperties0TypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootJobsPatternProperties0TypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfParser.g:891:3: this_GithubwfRootJobsPatternProperties0TypeObject_4= ruleGithubwfRootJobsPatternProperties0TypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AbstractAccess().getGithubwfRootJobsPatternProperties0TypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootJobsPatternProperties0TypeObject_4=ruleGithubwfRootJobsPatternProperties0TypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootJobsPatternProperties0TypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfParser.g:900:3: this_GithubwfRootJobsPatternProperties0TypeArray_5= ruleGithubwfRootJobsPatternProperties0TypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AbstractAccess().getGithubwfRootJobsPatternProperties0TypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootJobsPatternProperties0TypeArray_5=ruleGithubwfRootJobsPatternProperties0TypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootJobsPatternProperties0TypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfParser.g:909:3: this_GithubwfRootJobsPatternProperties0TypeNull_6= ruleGithubwfRootJobsPatternProperties0TypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AbstractAccess().getGithubwfRootJobsPatternProperties0TypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GithubwfRootJobsPatternProperties0TypeNull_6=ruleGithubwfRootJobsPatternProperties0TypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GithubwfRootJobsPatternProperties0TypeNull_6;
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0Abstract"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0PropertiesAbstract"
    // InternalGithubwfParser.g:921:1: entryRuleGithubwfRootJobsPatternProperties0PropertiesAbstract returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0PropertiesAbstract= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0PropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:921:93: (iv_ruleGithubwfRootJobsPatternProperties0PropertiesAbstract= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract EOF )
            // InternalGithubwfParser.g:922:2: iv_ruleGithubwfRootJobsPatternProperties0PropertiesAbstract= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0PropertiesAbstract=ruleGithubwfRootJobsPatternProperties0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0PropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0PropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0PropertiesAbstract"
    // InternalGithubwfParser.g:928:1: ruleGithubwfRootJobsPatternProperties0PropertiesAbstract returns [EObject current=null] : ( ( ruleGithubwfRootJobsPatternProperties0AdditionalProperties )=>this_GithubwfRootJobsPatternProperties0AdditionalProperties_0= ruleGithubwfRootJobsPatternProperties0AdditionalProperties ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_GithubwfRootJobsPatternProperties0AdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:934:2: ( ( ( ruleGithubwfRootJobsPatternProperties0AdditionalProperties )=>this_GithubwfRootJobsPatternProperties0AdditionalProperties_0= ruleGithubwfRootJobsPatternProperties0AdditionalProperties ) )
            // InternalGithubwfParser.g:935:2: ( ( ruleGithubwfRootJobsPatternProperties0AdditionalProperties )=>this_GithubwfRootJobsPatternProperties0AdditionalProperties_0= ruleGithubwfRootJobsPatternProperties0AdditionalProperties )
            {
            // InternalGithubwfParser.g:935:2: ( ( ruleGithubwfRootJobsPatternProperties0AdditionalProperties )=>this_GithubwfRootJobsPatternProperties0AdditionalProperties_0= ruleGithubwfRootJobsPatternProperties0AdditionalProperties )
            // InternalGithubwfParser.g:936:3: ( ruleGithubwfRootJobsPatternProperties0AdditionalProperties )=>this_GithubwfRootJobsPatternProperties0AdditionalProperties_0= ruleGithubwfRootJobsPatternProperties0AdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0PropertiesAbstractAccess().getGithubwfRootJobsPatternProperties0AdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_GithubwfRootJobsPatternProperties0AdditionalProperties_0=ruleGithubwfRootJobsPatternProperties0AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_GithubwfRootJobsPatternProperties0AdditionalProperties_0;
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0PropertiesAbstract"


    // $ANTLR start "entryRulePermissionsAbstract"
    // InternalGithubwfParser.g:949:1: entryRulePermissionsAbstract returns [EObject current=null] : iv_rulePermissionsAbstract= rulePermissionsAbstract EOF ;
    public final EObject entryRulePermissionsAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsAbstract = null;


        try {
            // InternalGithubwfParser.g:949:60: (iv_rulePermissionsAbstract= rulePermissionsAbstract EOF )
            // InternalGithubwfParser.g:950:2: iv_rulePermissionsAbstract= rulePermissionsAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsAbstract=rulePermissionsAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsAbstract"


    // $ANTLR start "rulePermissionsAbstract"
    // InternalGithubwfParser.g:956:1: rulePermissionsAbstract returns [EObject current=null] : ( ( ( rulePermissionsTypeNumber )=>this_PermissionsTypeNumber_0= rulePermissionsTypeNumber ) | this_PermissionsTypeString_1= rulePermissionsTypeString | this_PermissionsTypeInteger_2= rulePermissionsTypeInteger | this_PermissionsTypeBoolean_3= rulePermissionsTypeBoolean | this_PermissionsTypeObject_4= rulePermissionsTypeObject | this_PermissionsTypeArray_5= rulePermissionsTypeArray | this_PermissionsTypeNull_6= rulePermissionsTypeNull ) ;
    public final EObject rulePermissionsAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_PermissionsTypeNumber_0 = null;

        EObject this_PermissionsTypeString_1 = null;

        EObject this_PermissionsTypeInteger_2 = null;

        EObject this_PermissionsTypeBoolean_3 = null;

        EObject this_PermissionsTypeObject_4 = null;

        EObject this_PermissionsTypeArray_5 = null;

        EObject this_PermissionsTypeNull_6 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:962:2: ( ( ( ( rulePermissionsTypeNumber )=>this_PermissionsTypeNumber_0= rulePermissionsTypeNumber ) | this_PermissionsTypeString_1= rulePermissionsTypeString | this_PermissionsTypeInteger_2= rulePermissionsTypeInteger | this_PermissionsTypeBoolean_3= rulePermissionsTypeBoolean | this_PermissionsTypeObject_4= rulePermissionsTypeObject | this_PermissionsTypeArray_5= rulePermissionsTypeArray | this_PermissionsTypeNull_6= rulePermissionsTypeNull ) )
            // InternalGithubwfParser.g:963:2: ( ( ( rulePermissionsTypeNumber )=>this_PermissionsTypeNumber_0= rulePermissionsTypeNumber ) | this_PermissionsTypeString_1= rulePermissionsTypeString | this_PermissionsTypeInteger_2= rulePermissionsTypeInteger | this_PermissionsTypeBoolean_3= rulePermissionsTypeBoolean | this_PermissionsTypeObject_4= rulePermissionsTypeObject | this_PermissionsTypeArray_5= rulePermissionsTypeArray | this_PermissionsTypeNull_6= rulePermissionsTypeNull )
            {
            // InternalGithubwfParser.g:963:2: ( ( ( rulePermissionsTypeNumber )=>this_PermissionsTypeNumber_0= rulePermissionsTypeNumber ) | this_PermissionsTypeString_1= rulePermissionsTypeString | this_PermissionsTypeInteger_2= rulePermissionsTypeInteger | this_PermissionsTypeBoolean_3= rulePermissionsTypeBoolean | this_PermissionsTypeObject_4= rulePermissionsTypeObject | this_PermissionsTypeArray_5= rulePermissionsTypeArray | this_PermissionsTypeNull_6= rulePermissionsTypeNull )
            int alt11=7;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalGithubwfParser.g:964:3: ( ( rulePermissionsTypeNumber )=>this_PermissionsTypeNumber_0= rulePermissionsTypeNumber )
                    {
                    // InternalGithubwfParser.g:964:3: ( ( rulePermissionsTypeNumber )=>this_PermissionsTypeNumber_0= rulePermissionsTypeNumber )
                    // InternalGithubwfParser.g:965:4: ( rulePermissionsTypeNumber )=>this_PermissionsTypeNumber_0= rulePermissionsTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPermissionsAbstractAccess().getPermissionsTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PermissionsTypeNumber_0=rulePermissionsTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PermissionsTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:976:3: this_PermissionsTypeString_1= rulePermissionsTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissionsAbstractAccess().getPermissionsTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PermissionsTypeString_1=rulePermissionsTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PermissionsTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfParser.g:985:3: this_PermissionsTypeInteger_2= rulePermissionsTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissionsAbstractAccess().getPermissionsTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PermissionsTypeInteger_2=rulePermissionsTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PermissionsTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfParser.g:994:3: this_PermissionsTypeBoolean_3= rulePermissionsTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissionsAbstractAccess().getPermissionsTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PermissionsTypeBoolean_3=rulePermissionsTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PermissionsTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfParser.g:1003:3: this_PermissionsTypeObject_4= rulePermissionsTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissionsAbstractAccess().getPermissionsTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PermissionsTypeObject_4=rulePermissionsTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PermissionsTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfParser.g:1012:3: this_PermissionsTypeArray_5= rulePermissionsTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissionsAbstractAccess().getPermissionsTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PermissionsTypeArray_5=rulePermissionsTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PermissionsTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfParser.g:1021:3: this_PermissionsTypeNull_6= rulePermissionsTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPermissionsAbstractAccess().getPermissionsTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PermissionsTypeNull_6=rulePermissionsTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PermissionsTypeNull_6;
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
    // $ANTLR end "rulePermissionsAbstract"


    // $ANTLR start "entryRulePermissionsPropertiesAbstract"
    // InternalGithubwfParser.g:1033:1: entryRulePermissionsPropertiesAbstract returns [EObject current=null] : iv_rulePermissionsPropertiesAbstract= rulePermissionsPropertiesAbstract EOF ;
    public final EObject entryRulePermissionsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsPropertiesAbstract = null;


        try {
            // InternalGithubwfParser.g:1033:70: (iv_rulePermissionsPropertiesAbstract= rulePermissionsPropertiesAbstract EOF )
            // InternalGithubwfParser.g:1034:2: iv_rulePermissionsPropertiesAbstract= rulePermissionsPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsPropertiesAbstract=rulePermissionsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsPropertiesAbstract"


    // $ANTLR start "rulePermissionsPropertiesAbstract"
    // InternalGithubwfParser.g:1040:1: rulePermissionsPropertiesAbstract returns [EObject current=null] : ( ( rulePermissionsAdditionalProperties )=>this_PermissionsAdditionalProperties_0= rulePermissionsAdditionalProperties ) ;
    public final EObject rulePermissionsPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_PermissionsAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1046:2: ( ( ( rulePermissionsAdditionalProperties )=>this_PermissionsAdditionalProperties_0= rulePermissionsAdditionalProperties ) )
            // InternalGithubwfParser.g:1047:2: ( ( rulePermissionsAdditionalProperties )=>this_PermissionsAdditionalProperties_0= rulePermissionsAdditionalProperties )
            {
            // InternalGithubwfParser.g:1047:2: ( ( rulePermissionsAdditionalProperties )=>this_PermissionsAdditionalProperties_0= rulePermissionsAdditionalProperties )
            // InternalGithubwfParser.g:1048:3: ( rulePermissionsAdditionalProperties )=>this_PermissionsAdditionalProperties_0= rulePermissionsAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPermissionsPropertiesAbstractAccess().getPermissionsAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_PermissionsAdditionalProperties_0=rulePermissionsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PermissionsAdditionalProperties_0;
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
    // $ANTLR end "rulePermissionsPropertiesAbstract"


    // $ANTLR start "entryRuleGithubwfRootName"
    // InternalGithubwfParser.g:1061:1: entryRuleGithubwfRootName returns [EObject current=null] : iv_ruleGithubwfRootName= ruleGithubwfRootName EOF ;
    public final EObject entryRuleGithubwfRootName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootName = null;


        try {
            // InternalGithubwfParser.g:1061:57: (iv_ruleGithubwfRootName= ruleGithubwfRootName EOF )
            // InternalGithubwfParser.g:1062:2: iv_ruleGithubwfRootName= ruleGithubwfRootName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootName=ruleGithubwfRootName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootName"


    // $ANTLR start "ruleGithubwfRootName"
    // InternalGithubwfParser.g:1068:1: ruleGithubwfRootName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleGithubwfRootName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1074:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalGithubwfParser.g:1075:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalGithubwfParser.g:1075:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalGithubwfParser.g:1076:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalGithubwfParser.g:1076:3: ()
            // InternalGithubwfParser.g:1077:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootNameAccess().getGithubwfRootNameAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootNameAccess().getNameKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGithubwfRootNameAccess().getColonKeyword_2());
              		
            }
            // InternalGithubwfParser.g:1091:3: ( (lv_name_3_0= ruleEString ) )
            // InternalGithubwfParser.g:1092:4: (lv_name_3_0= ruleEString )
            {
            // InternalGithubwfParser.g:1092:4: (lv_name_3_0= ruleEString )
            // InternalGithubwfParser.g:1093:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootNameAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootNameRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"githubwf.githubwf.Githubwf.EString");
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
    // $ANTLR end "ruleGithubwfRootName"


    // $ANTLR start "entryRuleGithubwfRootOn"
    // InternalGithubwfParser.g:1114:1: entryRuleGithubwfRootOn returns [EObject current=null] : iv_ruleGithubwfRootOn= ruleGithubwfRootOn EOF ;
    public final EObject entryRuleGithubwfRootOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOn = null;


        try {
            // InternalGithubwfParser.g:1114:55: (iv_ruleGithubwfRootOn= ruleGithubwfRootOn EOF )
            // InternalGithubwfParser.g:1115:2: iv_ruleGithubwfRootOn= ruleGithubwfRootOn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOn=ruleGithubwfRootOn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOn"


    // $ANTLR start "ruleGithubwfRootOn"
    // InternalGithubwfParser.g:1121:1: ruleGithubwfRootOn returns [EObject current=null] : ( (lv_on_0_0= ruleGithubwfRootOnAbstract ) ) ;
    public final EObject ruleGithubwfRootOn() throws RecognitionException {
        EObject current = null;

        EObject lv_on_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1127:2: ( ( (lv_on_0_0= ruleGithubwfRootOnAbstract ) ) )
            // InternalGithubwfParser.g:1128:2: ( (lv_on_0_0= ruleGithubwfRootOnAbstract ) )
            {
            // InternalGithubwfParser.g:1128:2: ( (lv_on_0_0= ruleGithubwfRootOnAbstract ) )
            // InternalGithubwfParser.g:1129:3: (lv_on_0_0= ruleGithubwfRootOnAbstract )
            {
            // InternalGithubwfParser.g:1129:3: (lv_on_0_0= ruleGithubwfRootOnAbstract )
            // InternalGithubwfParser.g:1130:4: lv_on_0_0= ruleGithubwfRootOnAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnAccess().getOnGithubwfRootOnAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_on_0_0=ruleGithubwfRootOnAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnRule());
              				}
              				set(
              					current,
              					"on",
              					lv_on_0_0,
              					"githubwf.githubwf.Githubwf.GithubwfRootOnAbstract");
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
    // $ANTLR end "ruleGithubwfRootOn"


    // $ANTLR start "entryRuleGithubwfRootEnv"
    // InternalGithubwfParser.g:1150:1: entryRuleGithubwfRootEnv returns [EObject current=null] : iv_ruleGithubwfRootEnv= ruleGithubwfRootEnv EOF ;
    public final EObject entryRuleGithubwfRootEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootEnv = null;


        try {
            // InternalGithubwfParser.g:1150:56: (iv_ruleGithubwfRootEnv= ruleGithubwfRootEnv EOF )
            // InternalGithubwfParser.g:1151:2: iv_ruleGithubwfRootEnv= ruleGithubwfRootEnv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootEnvRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootEnv=ruleGithubwfRootEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootEnv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootEnv"


    // $ANTLR start "ruleGithubwfRootEnv"
    // InternalGithubwfParser.g:1157:1: ruleGithubwfRootEnv returns [EObject current=null] : (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) ) ;
    public final EObject ruleGithubwfRootEnv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_env_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1163:2: ( (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) ) )
            // InternalGithubwfParser.g:1164:2: (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) )
            {
            // InternalGithubwfParser.g:1164:2: (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) )
            // InternalGithubwfParser.g:1165:3: otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) )
            {
            otherlv_0=(Token)match(input,Env,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootEnvAccess().getEnvKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootEnvAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1173:3: ( (lv_env_2_0= ruleEnv ) )
            // InternalGithubwfParser.g:1174:4: (lv_env_2_0= ruleEnv )
            {
            // InternalGithubwfParser.g:1174:4: (lv_env_2_0= ruleEnv )
            // InternalGithubwfParser.g:1175:5: lv_env_2_0= ruleEnv
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootEnvAccess().getEnvEnvParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_env_2_0=ruleEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootEnvRule());
              					}
              					set(
              						current,
              						"env",
              						lv_env_2_0,
              						"githubwf.githubwf.Githubwf.Env");
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
    // $ANTLR end "ruleGithubwfRootEnv"


    // $ANTLR start "entryRuleGithubwfRootDefaults"
    // InternalGithubwfParser.g:1196:1: entryRuleGithubwfRootDefaults returns [EObject current=null] : iv_ruleGithubwfRootDefaults= ruleGithubwfRootDefaults EOF ;
    public final EObject entryRuleGithubwfRootDefaults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootDefaults = null;


        try {
            // InternalGithubwfParser.g:1196:61: (iv_ruleGithubwfRootDefaults= ruleGithubwfRootDefaults EOF )
            // InternalGithubwfParser.g:1197:2: iv_ruleGithubwfRootDefaults= ruleGithubwfRootDefaults EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootDefaultsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootDefaults=ruleGithubwfRootDefaults();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootDefaults; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootDefaults"


    // $ANTLR start "ruleGithubwfRootDefaults"
    // InternalGithubwfParser.g:1203:1: ruleGithubwfRootDefaults returns [EObject current=null] : (otherlv_0= Defaults otherlv_1= Colon ( (lv_defaults_2_0= ruleDefaults ) ) ) ;
    public final EObject ruleGithubwfRootDefaults() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_defaults_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1209:2: ( (otherlv_0= Defaults otherlv_1= Colon ( (lv_defaults_2_0= ruleDefaults ) ) ) )
            // InternalGithubwfParser.g:1210:2: (otherlv_0= Defaults otherlv_1= Colon ( (lv_defaults_2_0= ruleDefaults ) ) )
            {
            // InternalGithubwfParser.g:1210:2: (otherlv_0= Defaults otherlv_1= Colon ( (lv_defaults_2_0= ruleDefaults ) ) )
            // InternalGithubwfParser.g:1211:3: otherlv_0= Defaults otherlv_1= Colon ( (lv_defaults_2_0= ruleDefaults ) )
            {
            otherlv_0=(Token)match(input,Defaults,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootDefaultsAccess().getDefaultsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootDefaultsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1219:3: ( (lv_defaults_2_0= ruleDefaults ) )
            // InternalGithubwfParser.g:1220:4: (lv_defaults_2_0= ruleDefaults )
            {
            // InternalGithubwfParser.g:1220:4: (lv_defaults_2_0= ruleDefaults )
            // InternalGithubwfParser.g:1221:5: lv_defaults_2_0= ruleDefaults
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootDefaultsAccess().getDefaultsDefaultsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_defaults_2_0=ruleDefaults();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootDefaultsRule());
              					}
              					set(
              						current,
              						"defaults",
              						lv_defaults_2_0,
              						"githubwf.githubwf.Githubwf.Defaults");
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
    // $ANTLR end "ruleGithubwfRootDefaults"


    // $ANTLR start "entryRuleGithubwfRootConcurrency"
    // InternalGithubwfParser.g:1242:1: entryRuleGithubwfRootConcurrency returns [EObject current=null] : iv_ruleGithubwfRootConcurrency= ruleGithubwfRootConcurrency EOF ;
    public final EObject entryRuleGithubwfRootConcurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrency = null;


        try {
            // InternalGithubwfParser.g:1242:64: (iv_ruleGithubwfRootConcurrency= ruleGithubwfRootConcurrency EOF )
            // InternalGithubwfParser.g:1243:2: iv_ruleGithubwfRootConcurrency= ruleGithubwfRootConcurrency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrency=ruleGithubwfRootConcurrency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrency; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrency"


    // $ANTLR start "ruleGithubwfRootConcurrency"
    // InternalGithubwfParser.g:1249:1: ruleGithubwfRootConcurrency returns [EObject current=null] : ( (lv_concurrency_0_0= ruleGithubwfRootConcurrencyAbstract ) ) ;
    public final EObject ruleGithubwfRootConcurrency() throws RecognitionException {
        EObject current = null;

        EObject lv_concurrency_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1255:2: ( ( (lv_concurrency_0_0= ruleGithubwfRootConcurrencyAbstract ) ) )
            // InternalGithubwfParser.g:1256:2: ( (lv_concurrency_0_0= ruleGithubwfRootConcurrencyAbstract ) )
            {
            // InternalGithubwfParser.g:1256:2: ( (lv_concurrency_0_0= ruleGithubwfRootConcurrencyAbstract ) )
            // InternalGithubwfParser.g:1257:3: (lv_concurrency_0_0= ruleGithubwfRootConcurrencyAbstract )
            {
            // InternalGithubwfParser.g:1257:3: (lv_concurrency_0_0= ruleGithubwfRootConcurrencyAbstract )
            // InternalGithubwfParser.g:1258:4: lv_concurrency_0_0= ruleGithubwfRootConcurrencyAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAccess().getConcurrencyGithubwfRootConcurrencyAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_0_0=ruleGithubwfRootConcurrencyAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyRule());
              				}
              				set(
              					current,
              					"concurrency",
              					lv_concurrency_0_0,
              					"githubwf.githubwf.Githubwf.GithubwfRootConcurrencyAbstract");
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
    // $ANTLR end "ruleGithubwfRootConcurrency"


    // $ANTLR start "entryRuleGithubwfRootJobs"
    // InternalGithubwfParser.g:1278:1: entryRuleGithubwfRootJobs returns [EObject current=null] : iv_ruleGithubwfRootJobs= ruleGithubwfRootJobs EOF ;
    public final EObject entryRuleGithubwfRootJobs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobs = null;


        try {
            // InternalGithubwfParser.g:1278:57: (iv_ruleGithubwfRootJobs= ruleGithubwfRootJobs EOF )
            // InternalGithubwfParser.g:1279:2: iv_ruleGithubwfRootJobs= ruleGithubwfRootJobs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobs=ruleGithubwfRootJobs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobs"


    // $ANTLR start "ruleGithubwfRootJobs"
    // InternalGithubwfParser.g:1285:1: ruleGithubwfRootJobs returns [EObject current=null] : (otherlv_0= Jobs otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_jobs_3_0= ruleGithubwfRootJobsPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleGithubwfRootJobs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_jobs_3_0 = null;

        EObject lv_jobs_5_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1291:2: ( (otherlv_0= Jobs otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_jobs_3_0= ruleGithubwfRootJobsPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket ) )
            // InternalGithubwfParser.g:1292:2: (otherlv_0= Jobs otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_jobs_3_0= ruleGithubwfRootJobsPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:1292:2: (otherlv_0= Jobs otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_jobs_3_0= ruleGithubwfRootJobsPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket )
            // InternalGithubwfParser.g:1293:3: otherlv_0= Jobs otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_jobs_3_0= ruleGithubwfRootJobsPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Jobs,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootJobsAccess().getJobsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootJobsAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGithubwfRootJobsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGithubwfParser.g:1305:3: ( (lv_jobs_3_0= ruleGithubwfRootJobsPropertiesAbstract ) )
            // InternalGithubwfParser.g:1306:4: (lv_jobs_3_0= ruleGithubwfRootJobsPropertiesAbstract )
            {
            // InternalGithubwfParser.g:1306:4: (lv_jobs_3_0= ruleGithubwfRootJobsPropertiesAbstract )
            // InternalGithubwfParser.g:1307:5: lv_jobs_3_0= ruleGithubwfRootJobsPropertiesAbstract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootJobsAccess().getJobsGithubwfRootJobsPropertiesAbstractParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_jobs_3_0=ruleGithubwfRootJobsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootJobsRule());
              					}
              					add(
              						current,
              						"jobs",
              						lv_jobs_3_0,
              						"githubwf.githubwf.Githubwf.GithubwfRootJobsPropertiesAbstract");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGithubwfParser.g:1324:3: (otherlv_4= Comma ( (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGithubwfParser.g:1325:4: otherlv_4= Comma ( (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getGithubwfRootJobsAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalGithubwfParser.g:1329:4: ( (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract ) )
            	    // InternalGithubwfParser.g:1330:5: (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract )
            	    {
            	    // InternalGithubwfParser.g:1330:5: (lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract )
            	    // InternalGithubwfParser.g:1331:6: lv_jobs_5_0= ruleGithubwfRootJobsPropertiesAbstract
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGithubwfRootJobsAccess().getJobsGithubwfRootJobsPropertiesAbstractParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_jobs_5_0=ruleGithubwfRootJobsPropertiesAbstract();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGithubwfRootJobsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"jobs",
            	      							lv_jobs_5_0,
            	      							"githubwf.githubwf.Githubwf.GithubwfRootJobsPropertiesAbstract");
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

            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGithubwfRootJobsAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleGithubwfRootJobs"


    // $ANTLR start "entryRuleGithubwfRootRun_45name"
    // InternalGithubwfParser.g:1357:1: entryRuleGithubwfRootRun_45name returns [EObject current=null] : iv_ruleGithubwfRootRun_45name= ruleGithubwfRootRun_45name EOF ;
    public final EObject entryRuleGithubwfRootRun_45name() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootRun_45name = null;


        try {
            // InternalGithubwfParser.g:1357:63: (iv_ruleGithubwfRootRun_45name= ruleGithubwfRootRun_45name EOF )
            // InternalGithubwfParser.g:1358:2: iv_ruleGithubwfRootRun_45name= ruleGithubwfRootRun_45name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootRun_45nameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootRun_45name=ruleGithubwfRootRun_45name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootRun_45name; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootRun_45name"


    // $ANTLR start "ruleGithubwfRootRun_45name"
    // InternalGithubwfParser.g:1364:1: ruleGithubwfRootRun_45name returns [EObject current=null] : (otherlv_0= RunName otherlv_1= Colon ( (lv_run_45name_2_0= ruleEString ) ) ) ;
    public final EObject ruleGithubwfRootRun_45name() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_run_45name_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1370:2: ( (otherlv_0= RunName otherlv_1= Colon ( (lv_run_45name_2_0= ruleEString ) ) ) )
            // InternalGithubwfParser.g:1371:2: (otherlv_0= RunName otherlv_1= Colon ( (lv_run_45name_2_0= ruleEString ) ) )
            {
            // InternalGithubwfParser.g:1371:2: (otherlv_0= RunName otherlv_1= Colon ( (lv_run_45name_2_0= ruleEString ) ) )
            // InternalGithubwfParser.g:1372:3: otherlv_0= RunName otherlv_1= Colon ( (lv_run_45name_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,RunName,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootRun_45nameAccess().getRunNameKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootRun_45nameAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1380:3: ( (lv_run_45name_2_0= ruleEString ) )
            // InternalGithubwfParser.g:1381:4: (lv_run_45name_2_0= ruleEString )
            {
            // InternalGithubwfParser.g:1381:4: (lv_run_45name_2_0= ruleEString )
            // InternalGithubwfParser.g:1382:5: lv_run_45name_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootRun_45nameAccess().getRun_45nameEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_run_45name_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootRun_45nameRule());
              					}
              					set(
              						current,
              						"run_45name",
              						lv_run_45name_2_0,
              						"githubwf.githubwf.Githubwf.EString");
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
    // $ANTLR end "ruleGithubwfRootRun_45name"


    // $ANTLR start "entryRuleGithubwfRootPermissions"
    // InternalGithubwfParser.g:1403:1: entryRuleGithubwfRootPermissions returns [EObject current=null] : iv_ruleGithubwfRootPermissions= ruleGithubwfRootPermissions EOF ;
    public final EObject entryRuleGithubwfRootPermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootPermissions = null;


        try {
            // InternalGithubwfParser.g:1403:64: (iv_ruleGithubwfRootPermissions= ruleGithubwfRootPermissions EOF )
            // InternalGithubwfParser.g:1404:2: iv_ruleGithubwfRootPermissions= ruleGithubwfRootPermissions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootPermissionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootPermissions=ruleGithubwfRootPermissions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootPermissions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootPermissions"


    // $ANTLR start "ruleGithubwfRootPermissions"
    // InternalGithubwfParser.g:1410:1: ruleGithubwfRootPermissions returns [EObject current=null] : (otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions ) ) ) ;
    public final EObject ruleGithubwfRootPermissions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_permissions_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1416:2: ( (otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions ) ) ) )
            // InternalGithubwfParser.g:1417:2: (otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions ) ) )
            {
            // InternalGithubwfParser.g:1417:2: (otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions ) ) )
            // InternalGithubwfParser.g:1418:3: otherlv_0= Permissions otherlv_1= Colon ( (lv_permissions_2_0= rulePermissions ) )
            {
            otherlv_0=(Token)match(input,Permissions,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootPermissionsAccess().getPermissionsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootPermissionsAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1426:3: ( (lv_permissions_2_0= rulePermissions ) )
            // InternalGithubwfParser.g:1427:4: (lv_permissions_2_0= rulePermissions )
            {
            // InternalGithubwfParser.g:1427:4: (lv_permissions_2_0= rulePermissions )
            // InternalGithubwfParser.g:1428:5: lv_permissions_2_0= rulePermissions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootPermissionsAccess().getPermissionsPermissionsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_permissions_2_0=rulePermissions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootPermissionsRule());
              					}
              					set(
              						current,
              						"permissions",
              						lv_permissions_2_0,
              						"githubwf.githubwf.Githubwf.Permissions");
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
    // $ANTLR end "ruleGithubwfRootPermissions"


    // $ANTLR start "entryRuleEString"
    // InternalGithubwfParser.g:1449:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGithubwfParser.g:1449:47: (iv_ruleEString= ruleEString EOF )
            // InternalGithubwfParser.g:1450:2: iv_ruleEString= ruleEString EOF
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
    // InternalGithubwfParser.g:1456:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1462:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalGithubwfParser.g:1463:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleGithubwfRootOnTypeString"
    // InternalGithubwfParser.g:1476:1: entryRuleGithubwfRootOnTypeString returns [EObject current=null] : iv_ruleGithubwfRootOnTypeString= ruleGithubwfRootOnTypeString EOF ;
    public final EObject entryRuleGithubwfRootOnTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnTypeString = null;


        try {
            // InternalGithubwfParser.g:1476:65: (iv_ruleGithubwfRootOnTypeString= ruleGithubwfRootOnTypeString EOF )
            // InternalGithubwfParser.g:1477:2: iv_ruleGithubwfRootOnTypeString= ruleGithubwfRootOnTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnTypeString=ruleGithubwfRootOnTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnTypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnTypeString"


    // $ANTLR start "ruleGithubwfRootOnTypeString"
    // InternalGithubwfParser.g:1483:1: ruleGithubwfRootOnTypeString returns [EObject current=null] : (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEString ) ) ) ;
    public final EObject ruleGithubwfRootOnTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_on_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1489:2: ( (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEString ) ) ) )
            // InternalGithubwfParser.g:1490:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEString ) ) )
            {
            // InternalGithubwfParser.g:1490:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEString ) ) )
            // InternalGithubwfParser.g:1491:3: otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,On,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootOnTypeStringAccess().getOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnTypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1499:3: ( (lv_on_2_0= ruleEString ) )
            // InternalGithubwfParser.g:1500:4: (lv_on_2_0= ruleEString )
            {
            // InternalGithubwfParser.g:1500:4: (lv_on_2_0= ruleEString )
            // InternalGithubwfParser.g:1501:5: lv_on_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnTypeStringAccess().getOnEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_on_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnTypeStringRule());
              					}
              					set(
              						current,
              						"on",
              						lv_on_2_0,
              						"githubwf.githubwf.Githubwf.EString");
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
    // $ANTLR end "ruleGithubwfRootOnTypeString"


    // $ANTLR start "entryRuleGithubwfRootOnTypeInteger"
    // InternalGithubwfParser.g:1522:1: entryRuleGithubwfRootOnTypeInteger returns [EObject current=null] : iv_ruleGithubwfRootOnTypeInteger= ruleGithubwfRootOnTypeInteger EOF ;
    public final EObject entryRuleGithubwfRootOnTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnTypeInteger = null;


        try {
            // InternalGithubwfParser.g:1522:66: (iv_ruleGithubwfRootOnTypeInteger= ruleGithubwfRootOnTypeInteger EOF )
            // InternalGithubwfParser.g:1523:2: iv_ruleGithubwfRootOnTypeInteger= ruleGithubwfRootOnTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnTypeInteger=ruleGithubwfRootOnTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnTypeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnTypeInteger"


    // $ANTLR start "ruleGithubwfRootOnTypeInteger"
    // InternalGithubwfParser.g:1529:1: ruleGithubwfRootOnTypeInteger returns [EObject current=null] : (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleGithubwfRootOnTypeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_on_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1535:2: ( (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfParser.g:1536:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfParser.g:1536:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:1537:3: otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,On,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootOnTypeIntegerAccess().getOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnTypeIntegerAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1545:3: ( (lv_on_2_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:1546:4: (lv_on_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:1546:4: (lv_on_2_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:1547:5: lv_on_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnTypeIntegerAccess().getOnEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_on_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnTypeIntegerRule());
              					}
              					set(
              						current,
              						"on",
              						lv_on_2_0,
              						"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootOnTypeInteger"


    // $ANTLR start "entryRuleGithubwfRootOnTypeNumber"
    // InternalGithubwfParser.g:1568:1: entryRuleGithubwfRootOnTypeNumber returns [EObject current=null] : iv_ruleGithubwfRootOnTypeNumber= ruleGithubwfRootOnTypeNumber EOF ;
    public final EObject entryRuleGithubwfRootOnTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnTypeNumber = null;


        try {
            // InternalGithubwfParser.g:1568:65: (iv_ruleGithubwfRootOnTypeNumber= ruleGithubwfRootOnTypeNumber EOF )
            // InternalGithubwfParser.g:1569:2: iv_ruleGithubwfRootOnTypeNumber= ruleGithubwfRootOnTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnTypeNumber=ruleGithubwfRootOnTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnTypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnTypeNumber"


    // $ANTLR start "ruleGithubwfRootOnTypeNumber"
    // InternalGithubwfParser.g:1575:1: ruleGithubwfRootOnTypeNumber returns [EObject current=null] : (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleGithubwfRootOnTypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_on_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1581:2: ( (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfParser.g:1582:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfParser.g:1582:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:1583:3: otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,On,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootOnTypeNumberAccess().getOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnTypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1591:3: ( (lv_on_2_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:1592:4: (lv_on_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:1592:4: (lv_on_2_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:1593:5: lv_on_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnTypeNumberAccess().getOnEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_on_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnTypeNumberRule());
              					}
              					set(
              						current,
              						"on",
              						lv_on_2_0,
              						"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootOnTypeNumber"


    // $ANTLR start "entryRuleGithubwfRootOnTypeBoolean"
    // InternalGithubwfParser.g:1614:1: entryRuleGithubwfRootOnTypeBoolean returns [EObject current=null] : iv_ruleGithubwfRootOnTypeBoolean= ruleGithubwfRootOnTypeBoolean EOF ;
    public final EObject entryRuleGithubwfRootOnTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnTypeBoolean = null;


        try {
            // InternalGithubwfParser.g:1614:66: (iv_ruleGithubwfRootOnTypeBoolean= ruleGithubwfRootOnTypeBoolean EOF )
            // InternalGithubwfParser.g:1615:2: iv_ruleGithubwfRootOnTypeBoolean= ruleGithubwfRootOnTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnTypeBoolean=ruleGithubwfRootOnTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnTypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnTypeBoolean"


    // $ANTLR start "ruleGithubwfRootOnTypeBoolean"
    // InternalGithubwfParser.g:1621:1: ruleGithubwfRootOnTypeBoolean returns [EObject current=null] : (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleGithubwfRootOnTypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_on_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1627:2: ( (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEBooleanObject ) ) ) )
            // InternalGithubwfParser.g:1628:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEBooleanObject ) ) )
            {
            // InternalGithubwfParser.g:1628:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEBooleanObject ) ) )
            // InternalGithubwfParser.g:1629:3: otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,On,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootOnTypeBooleanAccess().getOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnTypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1637:3: ( (lv_on_2_0= ruleEBooleanObject ) )
            // InternalGithubwfParser.g:1638:4: (lv_on_2_0= ruleEBooleanObject )
            {
            // InternalGithubwfParser.g:1638:4: (lv_on_2_0= ruleEBooleanObject )
            // InternalGithubwfParser.g:1639:5: lv_on_2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnTypeBooleanAccess().getOnEBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_on_2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnTypeBooleanRule());
              					}
              					set(
              						current,
              						"on",
              						lv_on_2_0,
              						"githubwf.githubwf.Githubwf.EBooleanObject");
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
    // $ANTLR end "ruleGithubwfRootOnTypeBoolean"


    // $ANTLR start "entryRuleGithubwfRootOnTypeObject"
    // InternalGithubwfParser.g:1660:1: entryRuleGithubwfRootOnTypeObject returns [EObject current=null] : iv_ruleGithubwfRootOnTypeObject= ruleGithubwfRootOnTypeObject EOF ;
    public final EObject entryRuleGithubwfRootOnTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnTypeObject = null;


        try {
            // InternalGithubwfParser.g:1660:65: (iv_ruleGithubwfRootOnTypeObject= ruleGithubwfRootOnTypeObject EOF )
            // InternalGithubwfParser.g:1661:2: iv_ruleGithubwfRootOnTypeObject= ruleGithubwfRootOnTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnTypeObject=ruleGithubwfRootOnTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnTypeObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnTypeObject"


    // $ANTLR start "ruleGithubwfRootOnTypeObject"
    // InternalGithubwfParser.g:1667:1: ruleGithubwfRootOnTypeObject returns [EObject current=null] : ( () otherlv_1= On otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleGithubwfRootOnTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_on_4_0 = null;

        EObject lv_on_6_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1673:2: ( ( () otherlv_1= On otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalGithubwfParser.g:1674:2: ( () otherlv_1= On otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:1674:2: ( () otherlv_1= On otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalGithubwfParser.g:1675:3: () otherlv_1= On otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalGithubwfParser.g:1675:3: ()
            // InternalGithubwfParser.g:1676:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootOnTypeObjectAccess().getGithubwfRootOnTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,On,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnTypeObjectAccess().getOnKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGithubwfRootOnTypeObjectAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGithubwfRootOnTypeObjectAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGithubwfParser.g:1694:3: ( ( (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=WorkingDirectory && LA14_0<=Run)||LA14_0==On||LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGithubwfParser.g:1695:4: ( (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfParser.g:1695:4: ( (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract ) )
                    // InternalGithubwfParser.g:1696:5: (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract )
                    {
                    // InternalGithubwfParser.g:1696:5: (lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract )
                    // InternalGithubwfParser.g:1697:6: lv_on_4_0= ruleGithubwfRootOnPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootOnTypeObjectAccess().getOnGithubwfRootOnPropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_on_4_0=ruleGithubwfRootOnPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootOnTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"on",
                      							lv_on_4_0,
                      							"githubwf.githubwf.Githubwf.GithubwfRootOnPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:1714:4: (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:1715:5: otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getGithubwfRootOnTypeObjectAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:1719:5: ( (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract ) )
                    	    // InternalGithubwfParser.g:1720:6: (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfParser.g:1720:6: (lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract )
                    	    // InternalGithubwfParser.g:1721:7: lv_on_6_0= ruleGithubwfRootOnPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootOnTypeObjectAccess().getOnGithubwfRootOnPropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_on_6_0=ruleGithubwfRootOnPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootOnTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"on",
                    	      								lv_on_6_0,
                    	      								"githubwf.githubwf.Githubwf.GithubwfRootOnPropertiesAbstract");
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

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGithubwfRootOnTypeObjectAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleGithubwfRootOnTypeObject"


    // $ANTLR start "entryRuleGithubwfRootOnTypeArray"
    // InternalGithubwfParser.g:1748:1: entryRuleGithubwfRootOnTypeArray returns [EObject current=null] : iv_ruleGithubwfRootOnTypeArray= ruleGithubwfRootOnTypeArray EOF ;
    public final EObject entryRuleGithubwfRootOnTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnTypeArray = null;


        try {
            // InternalGithubwfParser.g:1748:64: (iv_ruleGithubwfRootOnTypeArray= ruleGithubwfRootOnTypeArray EOF )
            // InternalGithubwfParser.g:1749:2: iv_ruleGithubwfRootOnTypeArray= ruleGithubwfRootOnTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnTypeArray=ruleGithubwfRootOnTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnTypeArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnTypeArray"


    // $ANTLR start "ruleGithubwfRootOnTypeArray"
    // InternalGithubwfParser.g:1755:1: ruleGithubwfRootOnTypeArray returns [EObject current=null] : ( () otherlv_1= On otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_on_4_0= ruleGithubwfRootOnItems ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleGithubwfRootOnTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_on_4_0 = null;

        EObject lv_on_6_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1761:2: ( ( () otherlv_1= On otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_on_4_0= ruleGithubwfRootOnItems ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalGithubwfParser.g:1762:2: ( () otherlv_1= On otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_on_4_0= ruleGithubwfRootOnItems ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalGithubwfParser.g:1762:2: ( () otherlv_1= On otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_on_4_0= ruleGithubwfRootOnItems ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalGithubwfParser.g:1763:3: () otherlv_1= On otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_on_4_0= ruleGithubwfRootOnItems ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalGithubwfParser.g:1763:3: ()
            // InternalGithubwfParser.g:1764:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootOnTypeArrayAccess().getGithubwfRootOnTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,On,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnTypeArrayAccess().getOnKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGithubwfRootOnTypeArrayAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGithubwfRootOnTypeArrayAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalGithubwfParser.g:1782:3: ( ( (lv_on_4_0= ruleGithubwfRootOnItems ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnItems ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=WorkingDirectory && LA16_0<=True)||LA16_0==LeftSquareBracket||LA16_0==LeftCurlyBracket||(LA16_0>=RULE_STRING && LA16_0<=RULE_E_DOUBLE)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGithubwfParser.g:1783:4: ( (lv_on_4_0= ruleGithubwfRootOnItems ) ) (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnItems ) ) )*
                    {
                    // InternalGithubwfParser.g:1783:4: ( (lv_on_4_0= ruleGithubwfRootOnItems ) )
                    // InternalGithubwfParser.g:1784:5: (lv_on_4_0= ruleGithubwfRootOnItems )
                    {
                    // InternalGithubwfParser.g:1784:5: (lv_on_4_0= ruleGithubwfRootOnItems )
                    // InternalGithubwfParser.g:1785:6: lv_on_4_0= ruleGithubwfRootOnItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootOnTypeArrayAccess().getOnGithubwfRootOnItemsParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_on_4_0=ruleGithubwfRootOnItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootOnTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"on",
                      							lv_on_4_0,
                      							"githubwf.githubwf.Githubwf.GithubwfRootOnItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:1802:4: (otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnItems ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Comma) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:1803:5: otherlv_5= Comma ( (lv_on_6_0= ruleGithubwfRootOnItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getGithubwfRootOnTypeArrayAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:1807:5: ( (lv_on_6_0= ruleGithubwfRootOnItems ) )
                    	    // InternalGithubwfParser.g:1808:6: (lv_on_6_0= ruleGithubwfRootOnItems )
                    	    {
                    	    // InternalGithubwfParser.g:1808:6: (lv_on_6_0= ruleGithubwfRootOnItems )
                    	    // InternalGithubwfParser.g:1809:7: lv_on_6_0= ruleGithubwfRootOnItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootOnTypeArrayAccess().getOnGithubwfRootOnItemsParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_on_6_0=ruleGithubwfRootOnItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootOnTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"on",
                    	      								lv_on_6_0,
                    	      								"githubwf.githubwf.Githubwf.GithubwfRootOnItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGithubwfRootOnTypeArrayAccess().getRightSquareBracketKeyword_5());
              		
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
    // $ANTLR end "ruleGithubwfRootOnTypeArray"


    // $ANTLR start "entryRuleGithubwfRootOnTypeNull"
    // InternalGithubwfParser.g:1836:1: entryRuleGithubwfRootOnTypeNull returns [EObject current=null] : iv_ruleGithubwfRootOnTypeNull= ruleGithubwfRootOnTypeNull EOF ;
    public final EObject entryRuleGithubwfRootOnTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnTypeNull = null;


        try {
            // InternalGithubwfParser.g:1836:63: (iv_ruleGithubwfRootOnTypeNull= ruleGithubwfRootOnTypeNull EOF )
            // InternalGithubwfParser.g:1837:2: iv_ruleGithubwfRootOnTypeNull= ruleGithubwfRootOnTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnTypeNull=ruleGithubwfRootOnTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnTypeNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnTypeNull"


    // $ANTLR start "ruleGithubwfRootOnTypeNull"
    // InternalGithubwfParser.g:1843:1: ruleGithubwfRootOnTypeNull returns [EObject current=null] : (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleNullValue ) ) ) ;
    public final EObject ruleGithubwfRootOnTypeNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_on_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1849:2: ( (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleNullValue ) ) ) )
            // InternalGithubwfParser.g:1850:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleNullValue ) ) )
            {
            // InternalGithubwfParser.g:1850:2: (otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleNullValue ) ) )
            // InternalGithubwfParser.g:1851:3: otherlv_0= On otherlv_1= Colon ( (lv_on_2_0= ruleNullValue ) )
            {
            otherlv_0=(Token)match(input,On,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootOnTypeNullAccess().getOnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnTypeNullAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1859:3: ( (lv_on_2_0= ruleNullValue ) )
            // InternalGithubwfParser.g:1860:4: (lv_on_2_0= ruleNullValue )
            {
            // InternalGithubwfParser.g:1860:4: (lv_on_2_0= ruleNullValue )
            // InternalGithubwfParser.g:1861:5: lv_on_2_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnTypeNullAccess().getOnNullValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_on_2_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnTypeNullRule());
              					}
              					set(
              						current,
              						"on",
              						lv_on_2_0,
              						"githubwf.githubwf.Githubwf.NullValue");
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
    // $ANTLR end "ruleGithubwfRootOnTypeNull"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalGithubwfParser.g:1882:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalGithubwfParser.g:1882:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalGithubwfParser.g:1883:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalGithubwfParser.g:1889:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGithubwfParser.g:1895:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGithubwfParser.g:1896:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGithubwfParser.g:1896:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_E_INT) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_E_DOUBLE) ) {
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
                    // InternalGithubwfParser.g:1897:3: this_E_INT_0= RULE_E_INT
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
                    // InternalGithubwfParser.g:1905:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalGithubwfParser.g:1916:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalGithubwfParser.g:1916:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalGithubwfParser.g:1917:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalGithubwfParser.g:1923:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfParser.g:1929:2: ( (kw= True | kw= False ) )
            // InternalGithubwfParser.g:1930:2: (kw= True | kw= False )
            {
            // InternalGithubwfParser.g:1930:2: (kw= True | kw= False )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==True) ) {
                alt18=1;
            }
            else if ( (LA18_0==False) ) {
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
                    // InternalGithubwfParser.g:1931:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:1937:3: kw= False
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


    // $ANTLR start "entryRuleGithubwfRootOnAdditionalProperties"
    // InternalGithubwfParser.g:1946:1: entryRuleGithubwfRootOnAdditionalProperties returns [EObject current=null] : iv_ruleGithubwfRootOnAdditionalProperties= ruleGithubwfRootOnAdditionalProperties EOF ;
    public final EObject entryRuleGithubwfRootOnAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnAdditionalProperties = null;


        try {
            // InternalGithubwfParser.g:1946:75: (iv_ruleGithubwfRootOnAdditionalProperties= ruleGithubwfRootOnAdditionalProperties EOF )
            // InternalGithubwfParser.g:1947:2: iv_ruleGithubwfRootOnAdditionalProperties= ruleGithubwfRootOnAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnAdditionalProperties=ruleGithubwfRootOnAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnAdditionalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnAdditionalProperties"


    // $ANTLR start "ruleGithubwfRootOnAdditionalProperties"
    // InternalGithubwfParser.g:1953:1: ruleGithubwfRootOnAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleGithubwfRootOnAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:1959:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfParser.g:1960:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfParser.g:1960:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:1961:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:1961:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfParser.g:1962:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:1962:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfParser.g:1963:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.Githubwf.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootOnAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:1984:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:1985:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:1985:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfParser.g:1986:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootOnAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootOnAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootOnAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfParser.g:2007:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalGithubwfParser.g:2007:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalGithubwfParser.g:2008:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalGithubwfParser.g:2014:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2020:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalGithubwfParser.g:2021:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalGithubwfParser.g:2021:2: ( (lv_value_0_0= ruleValue ) )
            // InternalGithubwfParser.g:2022:3: (lv_value_0_0= ruleValue )
            {
            // InternalGithubwfParser.g:2022:3: (lv_value_0_0= ruleValue )
            // InternalGithubwfParser.g:2023:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.Githubwf.Value");
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
    // InternalGithubwfParser.g:2043:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalGithubwfParser.g:2043:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalGithubwfParser.g:2044:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalGithubwfParser.g:2050:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2056:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalGithubwfParser.g:2057:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalGithubwfParser.g:2057:2: ( (lv_value_0_0= ruleEString ) )
            // InternalGithubwfParser.g:2058:3: (lv_value_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:2058:3: (lv_value_0_0= ruleEString )
            // InternalGithubwfParser.g:2059:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.Githubwf.EString");
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
    // InternalGithubwfParser.g:2079:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalGithubwfParser.g:2079:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalGithubwfParser.g:2080:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalGithubwfParser.g:2086:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2092:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfParser.g:2093:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfParser.g:2093:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfParser.g:2094:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfParser.g:2094:3: ()
            // InternalGithubwfParser.g:2095:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfParser.g:2105:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=WorkingDirectory && LA20_0<=True)||LA20_0==LeftSquareBracket||LA20_0==LeftCurlyBracket||(LA20_0>=RULE_STRING && LA20_0<=RULE_E_DOUBLE)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGithubwfParser.g:2106:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalGithubwfParser.g:2106:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalGithubwfParser.g:2107:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalGithubwfParser.g:2107:5: (lv_value_2_0= ruleValue )
                    // InternalGithubwfParser.g:2108:6: lv_value_2_0= ruleValue
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
                      							"githubwf.githubwf.Githubwf.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:2125:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==Comma) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:2126:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:2130:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalGithubwfParser.g:2131:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalGithubwfParser.g:2131:6: (lv_value_4_0= ruleValue )
                    	    // InternalGithubwfParser.g:2132:7: lv_value_4_0= ruleValue
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
                    	      								"githubwf.githubwf.Githubwf.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
    // InternalGithubwfParser.g:2159:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalGithubwfParser.g:2159:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalGithubwfParser.g:2160:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalGithubwfParser.g:2166:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2172:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalGithubwfParser.g:2173:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalGithubwfParser.g:2173:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalGithubwfParser.g:2174:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalGithubwfParser.g:2174:3: (lv_value_0_0= ruleNullEnum )
            // InternalGithubwfParser.g:2175:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.Githubwf.NullEnum");
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
    // InternalGithubwfParser.g:2195:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalGithubwfParser.g:2195:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalGithubwfParser.g:2196:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalGithubwfParser.g:2202:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2208:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalGithubwfParser.g:2209:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalGithubwfParser.g:2209:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalGithubwfParser.g:2210:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalGithubwfParser.g:2210:3: (lv_value_0_0= ruleEDouble )
            // InternalGithubwfParser.g:2211:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.Githubwf.EDouble");
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
    // InternalGithubwfParser.g:2231:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalGithubwfParser.g:2231:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalGithubwfParser.g:2232:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalGithubwfParser.g:2238:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2244:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfParser.g:2245:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:2245:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfParser.g:2246:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfParser.g:2246:3: ()
            // InternalGithubwfParser.g:2247:4: 
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
            // InternalGithubwfParser.g:2257:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=WorkingDirectory && LA22_0<=Run)||LA22_0==On||LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGithubwfParser.g:2258:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalGithubwfParser.g:2258:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalGithubwfParser.g:2259:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalGithubwfParser.g:2259:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalGithubwfParser.g:2260:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.Githubwf.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:2277:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==Comma) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:2278:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:2282:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalGithubwfParser.g:2283:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalGithubwfParser.g:2283:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalGithubwfParser.g:2284:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.Githubwf.KeyValuePair");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
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
    // InternalGithubwfParser.g:2311:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalGithubwfParser.g:2311:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalGithubwfParser.g:2312:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalGithubwfParser.g:2318:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2324:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalGithubwfParser.g:2325:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalGithubwfParser.g:2325:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalGithubwfParser.g:2326:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalGithubwfParser.g:2326:3: (lv_value_0_0= ruleEBoolean )
            // InternalGithubwfParser.g:2327:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.Githubwf.EBoolean");
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
    // InternalGithubwfParser.g:2347:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalGithubwfParser.g:2347:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalGithubwfParser.g:2348:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalGithubwfParser.g:2354:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalGithubwfParser.g:2360:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalGithubwfParser.g:2361:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalGithubwfParser.g:2361:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_E_INT) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_E_DOUBLE) ) {
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
                    // InternalGithubwfParser.g:2362:3: this_E_INT_0= RULE_E_INT
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
                    // InternalGithubwfParser.g:2370:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalGithubwfParser.g:2381:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalGithubwfParser.g:2381:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalGithubwfParser.g:2382:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalGithubwfParser.g:2388:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2394:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalGithubwfParser.g:2395:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalGithubwfParser.g:2395:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalGithubwfParser.g:2396:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalGithubwfParser.g:2396:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfParser.g:2397:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:2397:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfParser.g:2398:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.Githubwf.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:2419:3: ( (lv_value_2_0= ruleValue ) )
            // InternalGithubwfParser.g:2420:4: (lv_value_2_0= ruleValue )
            {
            // InternalGithubwfParser.g:2420:4: (lv_value_2_0= ruleValue )
            // InternalGithubwfParser.g:2421:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.Githubwf.Value");
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
    // InternalGithubwfParser.g:2442:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGithubwfParser.g:2442:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGithubwfParser.g:2443:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalGithubwfParser.g:2449:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfParser.g:2455:2: ( (kw= True | kw= False ) )
            // InternalGithubwfParser.g:2456:2: (kw= True | kw= False )
            {
            // InternalGithubwfParser.g:2456:2: (kw= True | kw= False )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==True) ) {
                alt24=1;
            }
            else if ( (LA24_0==False) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalGithubwfParser.g:2457:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:2463:3: kw= False
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


    // $ANTLR start "entryRuleGithubwfRootOnItems"
    // InternalGithubwfParser.g:2472:1: entryRuleGithubwfRootOnItems returns [EObject current=null] : iv_ruleGithubwfRootOnItems= ruleGithubwfRootOnItems EOF ;
    public final EObject entryRuleGithubwfRootOnItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootOnItems = null;


        try {
            // InternalGithubwfParser.g:2472:60: (iv_ruleGithubwfRootOnItems= ruleGithubwfRootOnItems EOF )
            // InternalGithubwfParser.g:2473:2: iv_ruleGithubwfRootOnItems= ruleGithubwfRootOnItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootOnItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootOnItems=ruleGithubwfRootOnItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootOnItems; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootOnItems"


    // $ANTLR start "ruleGithubwfRootOnItems"
    // InternalGithubwfParser.g:2479:1: ruleGithubwfRootOnItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleGithubwfRootOnItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2485:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:2486:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:2486:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:2487:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:2487:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfParser.g:2488:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootOnItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootOnItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootOnItems"


    // $ANTLR start "entryRuleEnv"
    // InternalGithubwfParser.g:2508:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalGithubwfParser.g:2508:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalGithubwfParser.g:2509:2: iv_ruleEnv= ruleEnv EOF
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
    // InternalGithubwfParser.g:2515:1: ruleEnv returns [EObject current=null] : ( (lv_env_0_0= ruleEnvAbstract ) ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2521:2: ( ( (lv_env_0_0= ruleEnvAbstract ) ) )
            // InternalGithubwfParser.g:2522:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            {
            // InternalGithubwfParser.g:2522:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            // InternalGithubwfParser.g:2523:3: (lv_env_0_0= ruleEnvAbstract )
            {
            // InternalGithubwfParser.g:2523:3: (lv_env_0_0= ruleEnvAbstract )
            // InternalGithubwfParser.g:2524:4: lv_env_0_0= ruleEnvAbstract
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
              					"githubwf.githubwf.Githubwf.EnvAbstract");
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
    // InternalGithubwfParser.g:2544:1: entryRuleEnvTypeString returns [EObject current=null] : iv_ruleEnvTypeString= ruleEnvTypeString EOF ;
    public final EObject entryRuleEnvTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeString = null;


        try {
            // InternalGithubwfParser.g:2544:54: (iv_ruleEnvTypeString= ruleEnvTypeString EOF )
            // InternalGithubwfParser.g:2545:2: iv_ruleEnvTypeString= ruleEnvTypeString EOF
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
    // InternalGithubwfParser.g:2551:1: ruleEnvTypeString returns [EObject current=null] : ( (lv_env_0_0= ruleEString ) ) ;
    public final EObject ruleEnvTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2557:2: ( ( (lv_env_0_0= ruleEString ) ) )
            // InternalGithubwfParser.g:2558:2: ( (lv_env_0_0= ruleEString ) )
            {
            // InternalGithubwfParser.g:2558:2: ( (lv_env_0_0= ruleEString ) )
            // InternalGithubwfParser.g:2559:3: (lv_env_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:2559:3: (lv_env_0_0= ruleEString )
            // InternalGithubwfParser.g:2560:4: lv_env_0_0= ruleEString
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
              					"githubwf.githubwf.Githubwf.EString");
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
    // InternalGithubwfParser.g:2580:1: entryRuleEnvTypeInteger returns [EObject current=null] : iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF ;
    public final EObject entryRuleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeInteger = null;


        try {
            // InternalGithubwfParser.g:2580:55: (iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF )
            // InternalGithubwfParser.g:2581:2: iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF
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
    // InternalGithubwfParser.g:2587:1: ruleEnvTypeInteger returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2593:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:2594:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfParser.g:2594:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:2595:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:2595:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:2596:4: lv_env_0_0= ruleEDoubleObject
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
              					"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // InternalGithubwfParser.g:2616:1: entryRuleEnvTypeNumber returns [EObject current=null] : iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF ;
    public final EObject entryRuleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNumber = null;


        try {
            // InternalGithubwfParser.g:2616:54: (iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF )
            // InternalGithubwfParser.g:2617:2: iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF
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
    // InternalGithubwfParser.g:2623:1: ruleEnvTypeNumber returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2629:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:2630:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfParser.g:2630:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:2631:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:2631:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:2632:4: lv_env_0_0= ruleEDoubleObject
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
              					"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // InternalGithubwfParser.g:2652:1: entryRuleEnvTypeBoolean returns [EObject current=null] : iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF ;
    public final EObject entryRuleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeBoolean = null;


        try {
            // InternalGithubwfParser.g:2652:55: (iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF )
            // InternalGithubwfParser.g:2653:2: iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF
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
    // InternalGithubwfParser.g:2659:1: ruleEnvTypeBoolean returns [EObject current=null] : ( (lv_env_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2665:2: ( ( (lv_env_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfParser.g:2666:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfParser.g:2666:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            // InternalGithubwfParser.g:2667:3: (lv_env_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfParser.g:2667:3: (lv_env_0_0= ruleEBooleanObject )
            // InternalGithubwfParser.g:2668:4: lv_env_0_0= ruleEBooleanObject
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
              					"githubwf.githubwf.Githubwf.EBooleanObject");
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
    // InternalGithubwfParser.g:2688:1: entryRuleEnvTypeObject returns [EObject current=null] : iv_ruleEnvTypeObject= ruleEnvTypeObject EOF ;
    public final EObject entryRuleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeObject = null;


        try {
            // InternalGithubwfParser.g:2688:54: (iv_ruleEnvTypeObject= ruleEnvTypeObject EOF )
            // InternalGithubwfParser.g:2689:2: iv_ruleEnvTypeObject= ruleEnvTypeObject EOF
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
    // InternalGithubwfParser.g:2695:1: ruleEnvTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2701:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfParser.g:2702:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:2702:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfParser.g:2703:3: () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfParser.g:2703:3: ()
            // InternalGithubwfParser.g:2704:4: 
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
            // InternalGithubwfParser.g:2714:3: ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=WorkingDirectory && LA26_0<=Run)||LA26_0==On||LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGithubwfParser.g:2715:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfParser.g:2715:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) )
                    // InternalGithubwfParser.g:2716:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    {
                    // InternalGithubwfParser.g:2716:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    // InternalGithubwfParser.g:2717:6: lv_env_2_0= ruleEnvPropertiesAbstract
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
                      							"githubwf.githubwf.Githubwf.EnvPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:2734:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==Comma) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:2735:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:2739:5: ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    // InternalGithubwfParser.g:2740:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfParser.g:2740:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    // InternalGithubwfParser.g:2741:7: lv_env_4_0= ruleEnvPropertiesAbstract
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
                    	      								"githubwf.githubwf.Githubwf.EnvPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
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
    // InternalGithubwfParser.g:2768:1: entryRuleEnvTypeArray returns [EObject current=null] : iv_ruleEnvTypeArray= ruleEnvTypeArray EOF ;
    public final EObject entryRuleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeArray = null;


        try {
            // InternalGithubwfParser.g:2768:53: (iv_ruleEnvTypeArray= ruleEnvTypeArray EOF )
            // InternalGithubwfParser.g:2769:2: iv_ruleEnvTypeArray= ruleEnvTypeArray EOF
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
    // InternalGithubwfParser.g:2775:1: ruleEnvTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2781:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfParser.g:2782:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfParser.g:2782:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfParser.g:2783:3: () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfParser.g:2783:3: ()
            // InternalGithubwfParser.g:2784:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvTypeArrayAccess().getEnvTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfParser.g:2794:3: ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=WorkingDirectory && LA28_0<=True)||LA28_0==LeftSquareBracket||LA28_0==LeftCurlyBracket||(LA28_0>=RULE_STRING && LA28_0<=RULE_E_DOUBLE)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGithubwfParser.g:2795:4: ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    {
                    // InternalGithubwfParser.g:2795:4: ( (lv_env_2_0= ruleEnvItems ) )
                    // InternalGithubwfParser.g:2796:5: (lv_env_2_0= ruleEnvItems )
                    {
                    // InternalGithubwfParser.g:2796:5: (lv_env_2_0= ruleEnvItems )
                    // InternalGithubwfParser.g:2797:6: lv_env_2_0= ruleEnvItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
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
                      							"githubwf.githubwf.Githubwf.EnvItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:2814:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:2815:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:2819:5: ( (lv_env_4_0= ruleEnvItems ) )
                    	    // InternalGithubwfParser.g:2820:6: (lv_env_4_0= ruleEnvItems )
                    	    {
                    	    // InternalGithubwfParser.g:2820:6: (lv_env_4_0= ruleEnvItems )
                    	    // InternalGithubwfParser.g:2821:7: lv_env_4_0= ruleEnvItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
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
                    	      								"githubwf.githubwf.Githubwf.EnvItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
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
    // InternalGithubwfParser.g:2848:1: entryRuleEnvTypeNull returns [EObject current=null] : iv_ruleEnvTypeNull= ruleEnvTypeNull EOF ;
    public final EObject entryRuleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNull = null;


        try {
            // InternalGithubwfParser.g:2848:52: (iv_ruleEnvTypeNull= ruleEnvTypeNull EOF )
            // InternalGithubwfParser.g:2849:2: iv_ruleEnvTypeNull= ruleEnvTypeNull EOF
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
    // InternalGithubwfParser.g:2855:1: ruleEnvTypeNull returns [EObject current=null] : ( (lv_env_0_0= ruleNullValue ) ) ;
    public final EObject ruleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2861:2: ( ( (lv_env_0_0= ruleNullValue ) ) )
            // InternalGithubwfParser.g:2862:2: ( (lv_env_0_0= ruleNullValue ) )
            {
            // InternalGithubwfParser.g:2862:2: ( (lv_env_0_0= ruleNullValue ) )
            // InternalGithubwfParser.g:2863:3: (lv_env_0_0= ruleNullValue )
            {
            // InternalGithubwfParser.g:2863:3: (lv_env_0_0= ruleNullValue )
            // InternalGithubwfParser.g:2864:4: lv_env_0_0= ruleNullValue
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
              					"githubwf.githubwf.Githubwf.NullValue");
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
    // InternalGithubwfParser.g:2884:1: entryRuleEnvAdditionalProperties returns [EObject current=null] : iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF ;
    public final EObject entryRuleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAdditionalProperties = null;


        try {
            // InternalGithubwfParser.g:2884:64: (iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF )
            // InternalGithubwfParser.g:2885:2: iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF
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
    // InternalGithubwfParser.g:2891:1: ruleEnvAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2897:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfParser.g:2898:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfParser.g:2898:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:2899:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:2899:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfParser.g:2900:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:2900:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfParser.g:2901:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.Githubwf.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:2922:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:2923:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:2923:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfParser.g:2924:5: lv_additionalProperties_2_0= ruleJsonDocument
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
              						"githubwf.githubwf.Githubwf.JsonDocument");
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
    // InternalGithubwfParser.g:2945:1: entryRuleEnvItems returns [EObject current=null] : iv_ruleEnvItems= ruleEnvItems EOF ;
    public final EObject entryRuleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvItems = null;


        try {
            // InternalGithubwfParser.g:2945:49: (iv_ruleEnvItems= ruleEnvItems EOF )
            // InternalGithubwfParser.g:2946:2: iv_ruleEnvItems= ruleEnvItems EOF
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
    // InternalGithubwfParser.g:2952:1: ruleEnvItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2958:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:2959:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:2959:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:2960:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:2960:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfParser.g:2961:4: lv_items_0_0= ruleJsonDocument
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
              					"githubwf.githubwf.Githubwf.JsonDocument");
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


    // $ANTLR start "entryRuleDefaults"
    // InternalGithubwfParser.g:2981:1: entryRuleDefaults returns [EObject current=null] : iv_ruleDefaults= ruleDefaults EOF ;
    public final EObject entryRuleDefaults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaults = null;


        try {
            // InternalGithubwfParser.g:2981:49: (iv_ruleDefaults= ruleDefaults EOF )
            // InternalGithubwfParser.g:2982:2: iv_ruleDefaults= ruleDefaults EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaults=ruleDefaults();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaults; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaults"


    // $ANTLR start "ruleDefaults"
    // InternalGithubwfParser.g:2988:1: ruleDefaults returns [EObject current=null] : (otherlv_0= LeftCurlyBracket ( (lv_defaults_1_0= ruleDefaultsPropertiesAbstract ) ) (otherlv_2= Comma ( (lv_defaults_3_0= ruleDefaultsPropertiesAbstract ) ) )* otherlv_4= RightCurlyBracket ) ;
    public final EObject ruleDefaults() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_defaults_1_0 = null;

        EObject lv_defaults_3_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:2994:2: ( (otherlv_0= LeftCurlyBracket ( (lv_defaults_1_0= ruleDefaultsPropertiesAbstract ) ) (otherlv_2= Comma ( (lv_defaults_3_0= ruleDefaultsPropertiesAbstract ) ) )* otherlv_4= RightCurlyBracket ) )
            // InternalGithubwfParser.g:2995:2: (otherlv_0= LeftCurlyBracket ( (lv_defaults_1_0= ruleDefaultsPropertiesAbstract ) ) (otherlv_2= Comma ( (lv_defaults_3_0= ruleDefaultsPropertiesAbstract ) ) )* otherlv_4= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:2995:2: (otherlv_0= LeftCurlyBracket ( (lv_defaults_1_0= ruleDefaultsPropertiesAbstract ) ) (otherlv_2= Comma ( (lv_defaults_3_0= ruleDefaultsPropertiesAbstract ) ) )* otherlv_4= RightCurlyBracket )
            // InternalGithubwfParser.g:2996:3: otherlv_0= LeftCurlyBracket ( (lv_defaults_1_0= ruleDefaultsPropertiesAbstract ) ) (otherlv_2= Comma ( (lv_defaults_3_0= ruleDefaultsPropertiesAbstract ) ) )* otherlv_4= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,LeftCurlyBracket,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultsAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalGithubwfParser.g:3000:3: ( (lv_defaults_1_0= ruleDefaultsPropertiesAbstract ) )
            // InternalGithubwfParser.g:3001:4: (lv_defaults_1_0= ruleDefaultsPropertiesAbstract )
            {
            // InternalGithubwfParser.g:3001:4: (lv_defaults_1_0= ruleDefaultsPropertiesAbstract )
            // InternalGithubwfParser.g:3002:5: lv_defaults_1_0= ruleDefaultsPropertiesAbstract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultsAccess().getDefaultsDefaultsPropertiesAbstractParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_defaults_1_0=ruleDefaultsPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultsRule());
              					}
              					add(
              						current,
              						"defaults",
              						lv_defaults_1_0,
              						"githubwf.githubwf.Githubwf.DefaultsPropertiesAbstract");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGithubwfParser.g:3019:3: (otherlv_2= Comma ( (lv_defaults_3_0= ruleDefaultsPropertiesAbstract ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==Comma) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalGithubwfParser.g:3020:4: otherlv_2= Comma ( (lv_defaults_3_0= ruleDefaultsPropertiesAbstract ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDefaultsAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalGithubwfParser.g:3024:4: ( (lv_defaults_3_0= ruleDefaultsPropertiesAbstract ) )
            	    // InternalGithubwfParser.g:3025:5: (lv_defaults_3_0= ruleDefaultsPropertiesAbstract )
            	    {
            	    // InternalGithubwfParser.g:3025:5: (lv_defaults_3_0= ruleDefaultsPropertiesAbstract )
            	    // InternalGithubwfParser.g:3026:6: lv_defaults_3_0= ruleDefaultsPropertiesAbstract
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefaultsAccess().getDefaultsDefaultsPropertiesAbstractParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_defaults_3_0=ruleDefaultsPropertiesAbstract();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDefaultsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"defaults",
            	      							lv_defaults_3_0,
            	      							"githubwf.githubwf.Githubwf.DefaultsPropertiesAbstract");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefaultsAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleDefaults"


    // $ANTLR start "entryRuleDefaultsRun"
    // InternalGithubwfParser.g:3052:1: entryRuleDefaultsRun returns [EObject current=null] : iv_ruleDefaultsRun= ruleDefaultsRun EOF ;
    public final EObject entryRuleDefaultsRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultsRun = null;


        try {
            // InternalGithubwfParser.g:3052:52: (iv_ruleDefaultsRun= ruleDefaultsRun EOF )
            // InternalGithubwfParser.g:3053:2: iv_ruleDefaultsRun= ruleDefaultsRun EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultsRunRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultsRun=ruleDefaultsRun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultsRun; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultsRun"


    // $ANTLR start "ruleDefaultsRun"
    // InternalGithubwfParser.g:3059:1: ruleDefaultsRun returns [EObject current=null] : (otherlv_0= Run otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_run_3_0= ruleDefaultsRunPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_run_5_0= ruleDefaultsRunPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleDefaultsRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_run_3_0 = null;

        EObject lv_run_5_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3065:2: ( (otherlv_0= Run otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_run_3_0= ruleDefaultsRunPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_run_5_0= ruleDefaultsRunPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket ) )
            // InternalGithubwfParser.g:3066:2: (otherlv_0= Run otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_run_3_0= ruleDefaultsRunPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_run_5_0= ruleDefaultsRunPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:3066:2: (otherlv_0= Run otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_run_3_0= ruleDefaultsRunPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_run_5_0= ruleDefaultsRunPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket )
            // InternalGithubwfParser.g:3067:3: otherlv_0= Run otherlv_1= Colon otherlv_2= LeftCurlyBracket ( (lv_run_3_0= ruleDefaultsRunPropertiesAbstract ) ) (otherlv_4= Comma ( (lv_run_5_0= ruleDefaultsRunPropertiesAbstract ) ) )* otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,Run,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultsRunAccess().getRunKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultsRunAccess().getColonKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefaultsRunAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalGithubwfParser.g:3079:3: ( (lv_run_3_0= ruleDefaultsRunPropertiesAbstract ) )
            // InternalGithubwfParser.g:3080:4: (lv_run_3_0= ruleDefaultsRunPropertiesAbstract )
            {
            // InternalGithubwfParser.g:3080:4: (lv_run_3_0= ruleDefaultsRunPropertiesAbstract )
            // InternalGithubwfParser.g:3081:5: lv_run_3_0= ruleDefaultsRunPropertiesAbstract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultsRunAccess().getRunDefaultsRunPropertiesAbstractParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_run_3_0=ruleDefaultsRunPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultsRunRule());
              					}
              					add(
              						current,
              						"run",
              						lv_run_3_0,
              						"githubwf.githubwf.Githubwf.DefaultsRunPropertiesAbstract");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalGithubwfParser.g:3098:3: (otherlv_4= Comma ( (lv_run_5_0= ruleDefaultsRunPropertiesAbstract ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalGithubwfParser.g:3099:4: otherlv_4= Comma ( (lv_run_5_0= ruleDefaultsRunPropertiesAbstract ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getDefaultsRunAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalGithubwfParser.g:3103:4: ( (lv_run_5_0= ruleDefaultsRunPropertiesAbstract ) )
            	    // InternalGithubwfParser.g:3104:5: (lv_run_5_0= ruleDefaultsRunPropertiesAbstract )
            	    {
            	    // InternalGithubwfParser.g:3104:5: (lv_run_5_0= ruleDefaultsRunPropertiesAbstract )
            	    // InternalGithubwfParser.g:3105:6: lv_run_5_0= ruleDefaultsRunPropertiesAbstract
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDefaultsRunAccess().getRunDefaultsRunPropertiesAbstractParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_run_5_0=ruleDefaultsRunPropertiesAbstract();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDefaultsRunRule());
            	      						}
            	      						add(
            	      							current,
            	      							"run",
            	      							lv_run_5_0,
            	      							"githubwf.githubwf.Githubwf.DefaultsRunPropertiesAbstract");
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

            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDefaultsRunAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleDefaultsRun"


    // $ANTLR start "entryRuleDefaultsRunShell"
    // InternalGithubwfParser.g:3131:1: entryRuleDefaultsRunShell returns [EObject current=null] : iv_ruleDefaultsRunShell= ruleDefaultsRunShell EOF ;
    public final EObject entryRuleDefaultsRunShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultsRunShell = null;


        try {
            // InternalGithubwfParser.g:3131:57: (iv_ruleDefaultsRunShell= ruleDefaultsRunShell EOF )
            // InternalGithubwfParser.g:3132:2: iv_ruleDefaultsRunShell= ruleDefaultsRunShell EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultsRunShellRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultsRunShell=ruleDefaultsRunShell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultsRunShell; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultsRunShell"


    // $ANTLR start "ruleDefaultsRunShell"
    // InternalGithubwfParser.g:3138:1: ruleDefaultsRunShell returns [EObject current=null] : (otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) ) ) ;
    public final EObject ruleDefaultsRunShell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_shell_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3144:2: ( (otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) ) ) )
            // InternalGithubwfParser.g:3145:2: (otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) ) )
            {
            // InternalGithubwfParser.g:3145:2: (otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) ) )
            // InternalGithubwfParser.g:3146:3: otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) )
            {
            otherlv_0=(Token)match(input,Shell,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultsRunShellAccess().getShellKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultsRunShellAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:3154:3: ( (lv_shell_2_0= ruleShell ) )
            // InternalGithubwfParser.g:3155:4: (lv_shell_2_0= ruleShell )
            {
            // InternalGithubwfParser.g:3155:4: (lv_shell_2_0= ruleShell )
            // InternalGithubwfParser.g:3156:5: lv_shell_2_0= ruleShell
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultsRunShellAccess().getShellShellParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_shell_2_0=ruleShell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultsRunShellRule());
              					}
              					set(
              						current,
              						"shell",
              						lv_shell_2_0,
              						"githubwf.githubwf.Githubwf.Shell");
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
    // $ANTLR end "ruleDefaultsRunShell"


    // $ANTLR start "entryRuleDefaultsRunWorking_45directory"
    // InternalGithubwfParser.g:3177:1: entryRuleDefaultsRunWorking_45directory returns [EObject current=null] : iv_ruleDefaultsRunWorking_45directory= ruleDefaultsRunWorking_45directory EOF ;
    public final EObject entryRuleDefaultsRunWorking_45directory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultsRunWorking_45directory = null;


        try {
            // InternalGithubwfParser.g:3177:71: (iv_ruleDefaultsRunWorking_45directory= ruleDefaultsRunWorking_45directory EOF )
            // InternalGithubwfParser.g:3178:2: iv_ruleDefaultsRunWorking_45directory= ruleDefaultsRunWorking_45directory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultsRunWorking_45directoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultsRunWorking_45directory=ruleDefaultsRunWorking_45directory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultsRunWorking_45directory; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultsRunWorking_45directory"


    // $ANTLR start "ruleDefaultsRunWorking_45directory"
    // InternalGithubwfParser.g:3184:1: ruleDefaultsRunWorking_45directory returns [EObject current=null] : (otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) ) ) ;
    public final EObject ruleDefaultsRunWorking_45directory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_working_45directory_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3190:2: ( (otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) ) ) )
            // InternalGithubwfParser.g:3191:2: (otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) ) )
            {
            // InternalGithubwfParser.g:3191:2: (otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) ) )
            // InternalGithubwfParser.g:3192:3: otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) )
            {
            otherlv_0=(Token)match(input,WorkingDirectory,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultsRunWorking_45directoryAccess().getWorkingDirectoryKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultsRunWorking_45directoryAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:3200:3: ( (lv_working_45directory_2_0= ruleWorking_45directory ) )
            // InternalGithubwfParser.g:3201:4: (lv_working_45directory_2_0= ruleWorking_45directory )
            {
            // InternalGithubwfParser.g:3201:4: (lv_working_45directory_2_0= ruleWorking_45directory )
            // InternalGithubwfParser.g:3202:5: lv_working_45directory_2_0= ruleWorking_45directory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultsRunWorking_45directoryAccess().getWorking_45directoryWorking_45directoryParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_working_45directory_2_0=ruleWorking_45directory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultsRunWorking_45directoryRule());
              					}
              					set(
              						current,
              						"working_45directory",
              						lv_working_45directory_2_0,
              						"githubwf.githubwf.Githubwf.Working_45directory");
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
    // $ANTLR end "ruleDefaultsRunWorking_45directory"


    // $ANTLR start "entryRuleShell"
    // InternalGithubwfParser.g:3223:1: entryRuleShell returns [EObject current=null] : iv_ruleShell= ruleShell EOF ;
    public final EObject entryRuleShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShell = null;


        try {
            // InternalGithubwfParser.g:3223:46: (iv_ruleShell= ruleShell EOF )
            // InternalGithubwfParser.g:3224:2: iv_ruleShell= ruleShell EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShell=ruleShell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShell; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShell"


    // $ANTLR start "ruleShell"
    // InternalGithubwfParser.g:3230:1: ruleShell returns [EObject current=null] : ( (lv_shell_0_0= ruleShellAbstract ) ) ;
    public final EObject ruleShell() throws RecognitionException {
        EObject current = null;

        EObject lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3236:2: ( ( (lv_shell_0_0= ruleShellAbstract ) ) )
            // InternalGithubwfParser.g:3237:2: ( (lv_shell_0_0= ruleShellAbstract ) )
            {
            // InternalGithubwfParser.g:3237:2: ( (lv_shell_0_0= ruleShellAbstract ) )
            // InternalGithubwfParser.g:3238:3: (lv_shell_0_0= ruleShellAbstract )
            {
            // InternalGithubwfParser.g:3238:3: (lv_shell_0_0= ruleShellAbstract )
            // InternalGithubwfParser.g:3239:4: lv_shell_0_0= ruleShellAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellAccess().getShellShellAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleShellAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.Githubwf.ShellAbstract");
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
    // $ANTLR end "ruleShell"


    // $ANTLR start "entryRuleShellTypeString"
    // InternalGithubwfParser.g:3259:1: entryRuleShellTypeString returns [EObject current=null] : iv_ruleShellTypeString= ruleShellTypeString EOF ;
    public final EObject entryRuleShellTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeString = null;


        try {
            // InternalGithubwfParser.g:3259:56: (iv_ruleShellTypeString= ruleShellTypeString EOF )
            // InternalGithubwfParser.g:3260:2: iv_ruleShellTypeString= ruleShellTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeString=ruleShellTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellTypeString"


    // $ANTLR start "ruleShellTypeString"
    // InternalGithubwfParser.g:3266:1: ruleShellTypeString returns [EObject current=null] : ( (lv_shell_0_0= ruleEString ) ) ;
    public final EObject ruleShellTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3272:2: ( ( (lv_shell_0_0= ruleEString ) ) )
            // InternalGithubwfParser.g:3273:2: ( (lv_shell_0_0= ruleEString ) )
            {
            // InternalGithubwfParser.g:3273:2: ( (lv_shell_0_0= ruleEString ) )
            // InternalGithubwfParser.g:3274:3: (lv_shell_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:3274:3: (lv_shell_0_0= ruleEString )
            // InternalGithubwfParser.g:3275:4: lv_shell_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeStringAccess().getShellEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeStringRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.Githubwf.EString");
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
    // $ANTLR end "ruleShellTypeString"


    // $ANTLR start "entryRuleShellTypeInteger"
    // InternalGithubwfParser.g:3295:1: entryRuleShellTypeInteger returns [EObject current=null] : iv_ruleShellTypeInteger= ruleShellTypeInteger EOF ;
    public final EObject entryRuleShellTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeInteger = null;


        try {
            // InternalGithubwfParser.g:3295:57: (iv_ruleShellTypeInteger= ruleShellTypeInteger EOF )
            // InternalGithubwfParser.g:3296:2: iv_ruleShellTypeInteger= ruleShellTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeInteger=ruleShellTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellTypeInteger"


    // $ANTLR start "ruleShellTypeInteger"
    // InternalGithubwfParser.g:3302:1: ruleShellTypeInteger returns [EObject current=null] : ( (lv_shell_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleShellTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3308:2: ( ( (lv_shell_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:3309:2: ( (lv_shell_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfParser.g:3309:2: ( (lv_shell_0_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:3310:3: (lv_shell_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:3310:3: (lv_shell_0_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:3311:4: lv_shell_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeIntegerAccess().getShellEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeIntegerRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "ruleShellTypeInteger"


    // $ANTLR start "entryRuleShellTypeNumber"
    // InternalGithubwfParser.g:3331:1: entryRuleShellTypeNumber returns [EObject current=null] : iv_ruleShellTypeNumber= ruleShellTypeNumber EOF ;
    public final EObject entryRuleShellTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeNumber = null;


        try {
            // InternalGithubwfParser.g:3331:56: (iv_ruleShellTypeNumber= ruleShellTypeNumber EOF )
            // InternalGithubwfParser.g:3332:2: iv_ruleShellTypeNumber= ruleShellTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeNumber=ruleShellTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellTypeNumber"


    // $ANTLR start "ruleShellTypeNumber"
    // InternalGithubwfParser.g:3338:1: ruleShellTypeNumber returns [EObject current=null] : ( (lv_shell_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleShellTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3344:2: ( ( (lv_shell_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:3345:2: ( (lv_shell_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfParser.g:3345:2: ( (lv_shell_0_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:3346:3: (lv_shell_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:3346:3: (lv_shell_0_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:3347:4: lv_shell_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeNumberAccess().getShellEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeNumberRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "ruleShellTypeNumber"


    // $ANTLR start "entryRuleShellTypeBoolean"
    // InternalGithubwfParser.g:3367:1: entryRuleShellTypeBoolean returns [EObject current=null] : iv_ruleShellTypeBoolean= ruleShellTypeBoolean EOF ;
    public final EObject entryRuleShellTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeBoolean = null;


        try {
            // InternalGithubwfParser.g:3367:57: (iv_ruleShellTypeBoolean= ruleShellTypeBoolean EOF )
            // InternalGithubwfParser.g:3368:2: iv_ruleShellTypeBoolean= ruleShellTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeBoolean=ruleShellTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellTypeBoolean"


    // $ANTLR start "ruleShellTypeBoolean"
    // InternalGithubwfParser.g:3374:1: ruleShellTypeBoolean returns [EObject current=null] : ( (lv_shell_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleShellTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3380:2: ( ( (lv_shell_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfParser.g:3381:2: ( (lv_shell_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfParser.g:3381:2: ( (lv_shell_0_0= ruleEBooleanObject ) )
            // InternalGithubwfParser.g:3382:3: (lv_shell_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfParser.g:3382:3: (lv_shell_0_0= ruleEBooleanObject )
            // InternalGithubwfParser.g:3383:4: lv_shell_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeBooleanAccess().getShellEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeBooleanRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.Githubwf.EBooleanObject");
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
    // $ANTLR end "ruleShellTypeBoolean"


    // $ANTLR start "entryRuleShellTypeObject"
    // InternalGithubwfParser.g:3403:1: entryRuleShellTypeObject returns [EObject current=null] : iv_ruleShellTypeObject= ruleShellTypeObject EOF ;
    public final EObject entryRuleShellTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeObject = null;


        try {
            // InternalGithubwfParser.g:3403:56: (iv_ruleShellTypeObject= ruleShellTypeObject EOF )
            // InternalGithubwfParser.g:3404:2: iv_ruleShellTypeObject= ruleShellTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeObject=ruleShellTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellTypeObject"


    // $ANTLR start "ruleShellTypeObject"
    // InternalGithubwfParser.g:3410:1: ruleShellTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleShellTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_shell_2_0 = null;

        EObject lv_shell_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3416:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfParser.g:3417:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:3417:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfParser.g:3418:3: () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfParser.g:3418:3: ()
            // InternalGithubwfParser.g:3419:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getShellTypeObjectAccess().getShellTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShellTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfParser.g:3429:3: ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=WorkingDirectory && LA32_0<=Run)||LA32_0==On||LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGithubwfParser.g:3430:4: ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfParser.g:3430:4: ( (lv_shell_2_0= ruleShellPropertiesAbstract ) )
                    // InternalGithubwfParser.g:3431:5: (lv_shell_2_0= ruleShellPropertiesAbstract )
                    {
                    // InternalGithubwfParser.g:3431:5: (lv_shell_2_0= ruleShellPropertiesAbstract )
                    // InternalGithubwfParser.g:3432:6: lv_shell_2_0= ruleShellPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShellTypeObjectAccess().getShellShellPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_shell_2_0=ruleShellPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShellTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"shell",
                      							lv_shell_2_0,
                      							"githubwf.githubwf.Githubwf.ShellPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:3449:4: (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==Comma) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:3450:5: otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getShellTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:3454:5: ( (lv_shell_4_0= ruleShellPropertiesAbstract ) )
                    	    // InternalGithubwfParser.g:3455:6: (lv_shell_4_0= ruleShellPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfParser.g:3455:6: (lv_shell_4_0= ruleShellPropertiesAbstract )
                    	    // InternalGithubwfParser.g:3456:7: lv_shell_4_0= ruleShellPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShellTypeObjectAccess().getShellShellPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_shell_4_0=ruleShellPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getShellTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"shell",
                    	      								lv_shell_4_0,
                    	      								"githubwf.githubwf.Githubwf.ShellPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getShellTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleShellTypeObject"


    // $ANTLR start "entryRuleShellTypeArray"
    // InternalGithubwfParser.g:3483:1: entryRuleShellTypeArray returns [EObject current=null] : iv_ruleShellTypeArray= ruleShellTypeArray EOF ;
    public final EObject entryRuleShellTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeArray = null;


        try {
            // InternalGithubwfParser.g:3483:55: (iv_ruleShellTypeArray= ruleShellTypeArray EOF )
            // InternalGithubwfParser.g:3484:2: iv_ruleShellTypeArray= ruleShellTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeArray=ruleShellTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellTypeArray"


    // $ANTLR start "ruleShellTypeArray"
    // InternalGithubwfParser.g:3490:1: ruleShellTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleShellTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_shell_2_0 = null;

        EObject lv_shell_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3496:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfParser.g:3497:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfParser.g:3497:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfParser.g:3498:3: () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfParser.g:3498:3: ()
            // InternalGithubwfParser.g:3499:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getShellTypeArrayAccess().getShellTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShellTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfParser.g:3509:3: ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=WorkingDirectory && LA34_0<=True)||LA34_0==LeftSquareBracket||LA34_0==LeftCurlyBracket||(LA34_0>=RULE_STRING && LA34_0<=RULE_E_DOUBLE)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGithubwfParser.g:3510:4: ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )*
                    {
                    // InternalGithubwfParser.g:3510:4: ( (lv_shell_2_0= ruleShellItems ) )
                    // InternalGithubwfParser.g:3511:5: (lv_shell_2_0= ruleShellItems )
                    {
                    // InternalGithubwfParser.g:3511:5: (lv_shell_2_0= ruleShellItems )
                    // InternalGithubwfParser.g:3512:6: lv_shell_2_0= ruleShellItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShellTypeArrayAccess().getShellShellItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_shell_2_0=ruleShellItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShellTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"shell",
                      							lv_shell_2_0,
                      							"githubwf.githubwf.Githubwf.ShellItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:3529:4: (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==Comma) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:3530:5: otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getShellTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:3534:5: ( (lv_shell_4_0= ruleShellItems ) )
                    	    // InternalGithubwfParser.g:3535:6: (lv_shell_4_0= ruleShellItems )
                    	    {
                    	    // InternalGithubwfParser.g:3535:6: (lv_shell_4_0= ruleShellItems )
                    	    // InternalGithubwfParser.g:3536:7: lv_shell_4_0= ruleShellItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShellTypeArrayAccess().getShellShellItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_shell_4_0=ruleShellItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getShellTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"shell",
                    	      								lv_shell_4_0,
                    	      								"githubwf.githubwf.Githubwf.ShellItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getShellTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleShellTypeArray"


    // $ANTLR start "entryRuleShellTypeNull"
    // InternalGithubwfParser.g:3563:1: entryRuleShellTypeNull returns [EObject current=null] : iv_ruleShellTypeNull= ruleShellTypeNull EOF ;
    public final EObject entryRuleShellTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeNull = null;


        try {
            // InternalGithubwfParser.g:3563:54: (iv_ruleShellTypeNull= ruleShellTypeNull EOF )
            // InternalGithubwfParser.g:3564:2: iv_ruleShellTypeNull= ruleShellTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeNull=ruleShellTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellTypeNull"


    // $ANTLR start "ruleShellTypeNull"
    // InternalGithubwfParser.g:3570:1: ruleShellTypeNull returns [EObject current=null] : ( (lv_shell_0_0= ruleNullValue ) ) ;
    public final EObject ruleShellTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3576:2: ( ( (lv_shell_0_0= ruleNullValue ) ) )
            // InternalGithubwfParser.g:3577:2: ( (lv_shell_0_0= ruleNullValue ) )
            {
            // InternalGithubwfParser.g:3577:2: ( (lv_shell_0_0= ruleNullValue ) )
            // InternalGithubwfParser.g:3578:3: (lv_shell_0_0= ruleNullValue )
            {
            // InternalGithubwfParser.g:3578:3: (lv_shell_0_0= ruleNullValue )
            // InternalGithubwfParser.g:3579:4: lv_shell_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeNullAccess().getShellNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeNullRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.Githubwf.NullValue");
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
    // $ANTLR end "ruleShellTypeNull"


    // $ANTLR start "entryRuleShellAdditionalProperties"
    // InternalGithubwfParser.g:3599:1: entryRuleShellAdditionalProperties returns [EObject current=null] : iv_ruleShellAdditionalProperties= ruleShellAdditionalProperties EOF ;
    public final EObject entryRuleShellAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellAdditionalProperties = null;


        try {
            // InternalGithubwfParser.g:3599:66: (iv_ruleShellAdditionalProperties= ruleShellAdditionalProperties EOF )
            // InternalGithubwfParser.g:3600:2: iv_ruleShellAdditionalProperties= ruleShellAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellAdditionalProperties=ruleShellAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellAdditionalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellAdditionalProperties"


    // $ANTLR start "ruleShellAdditionalProperties"
    // InternalGithubwfParser.g:3606:1: ruleShellAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleShellAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3612:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfParser.g:3613:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfParser.g:3613:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:3614:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:3614:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfParser.g:3615:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:3615:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfParser.g:3616:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getShellAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getShellAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.Githubwf.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShellAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:3637:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:3638:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:3638:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfParser.g:3639:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getShellAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getShellAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "ruleShellAdditionalProperties"


    // $ANTLR start "entryRuleShellItems"
    // InternalGithubwfParser.g:3660:1: entryRuleShellItems returns [EObject current=null] : iv_ruleShellItems= ruleShellItems EOF ;
    public final EObject entryRuleShellItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellItems = null;


        try {
            // InternalGithubwfParser.g:3660:51: (iv_ruleShellItems= ruleShellItems EOF )
            // InternalGithubwfParser.g:3661:2: iv_ruleShellItems= ruleShellItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellItems=ruleShellItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellItems; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShellItems"


    // $ANTLR start "ruleShellItems"
    // InternalGithubwfParser.g:3667:1: ruleShellItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleShellItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3673:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:3674:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:3674:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:3675:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:3675:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfParser.g:3676:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "ruleShellItems"


    // $ANTLR start "entryRuleWorking_45directory"
    // InternalGithubwfParser.g:3696:1: entryRuleWorking_45directory returns [EObject current=null] : iv_ruleWorking_45directory= ruleWorking_45directory EOF ;
    public final EObject entryRuleWorking_45directory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorking_45directory = null;


        try {
            // InternalGithubwfParser.g:3696:60: (iv_ruleWorking_45directory= ruleWorking_45directory EOF )
            // InternalGithubwfParser.g:3697:2: iv_ruleWorking_45directory= ruleWorking_45directory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorking_45directoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorking_45directory=ruleWorking_45directory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorking_45directory; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorking_45directory"


    // $ANTLR start "ruleWorking_45directory"
    // InternalGithubwfParser.g:3703:1: ruleWorking_45directory returns [EObject current=null] : ( (lv_working_45directory_0_0= ruleEString ) ) ;
    public final EObject ruleWorking_45directory() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_working_45directory_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3709:2: ( ( (lv_working_45directory_0_0= ruleEString ) ) )
            // InternalGithubwfParser.g:3710:2: ( (lv_working_45directory_0_0= ruleEString ) )
            {
            // InternalGithubwfParser.g:3710:2: ( (lv_working_45directory_0_0= ruleEString ) )
            // InternalGithubwfParser.g:3711:3: (lv_working_45directory_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:3711:3: (lv_working_45directory_0_0= ruleEString )
            // InternalGithubwfParser.g:3712:4: lv_working_45directory_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getWorking_45directoryAccess().getWorking_45directoryEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_working_45directory_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getWorking_45directoryRule());
              				}
              				set(
              					current,
              					"working_45directory",
              					lv_working_45directory_0_0,
              					"githubwf.githubwf.Githubwf.EString");
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
    // $ANTLR end "ruleWorking_45directory"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyTypeString"
    // InternalGithubwfParser.g:3732:1: entryRuleGithubwfRootConcurrencyTypeString returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyTypeString= ruleGithubwfRootConcurrencyTypeString EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyTypeString = null;


        try {
            // InternalGithubwfParser.g:3732:74: (iv_ruleGithubwfRootConcurrencyTypeString= ruleGithubwfRootConcurrencyTypeString EOF )
            // InternalGithubwfParser.g:3733:2: iv_ruleGithubwfRootConcurrencyTypeString= ruleGithubwfRootConcurrencyTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyTypeString=ruleGithubwfRootConcurrencyTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyTypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyTypeString"


    // $ANTLR start "ruleGithubwfRootConcurrencyTypeString"
    // InternalGithubwfParser.g:3739:1: ruleGithubwfRootConcurrencyTypeString returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) ) ) ;
    public final EObject ruleGithubwfRootConcurrencyTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3745:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) ) ) )
            // InternalGithubwfParser.g:3746:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) ) )
            {
            // InternalGithubwfParser.g:3746:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) ) )
            // InternalGithubwfParser.g:3747:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootConcurrencyTypeStringAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootConcurrencyTypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:3755:3: ( (lv_concurrency_2_0= ruleEString ) )
            // InternalGithubwfParser.g:3756:4: (lv_concurrency_2_0= ruleEString )
            {
            // InternalGithubwfParser.g:3756:4: (lv_concurrency_2_0= ruleEString )
            // InternalGithubwfParser.g:3757:5: lv_concurrency_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeStringAccess().getConcurrencyEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyTypeStringRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.Githubwf.EString");
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
    // $ANTLR end "ruleGithubwfRootConcurrencyTypeString"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyTypeInteger"
    // InternalGithubwfParser.g:3778:1: entryRuleGithubwfRootConcurrencyTypeInteger returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyTypeInteger= ruleGithubwfRootConcurrencyTypeInteger EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyTypeInteger = null;


        try {
            // InternalGithubwfParser.g:3778:75: (iv_ruleGithubwfRootConcurrencyTypeInteger= ruleGithubwfRootConcurrencyTypeInteger EOF )
            // InternalGithubwfParser.g:3779:2: iv_ruleGithubwfRootConcurrencyTypeInteger= ruleGithubwfRootConcurrencyTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyTypeInteger=ruleGithubwfRootConcurrencyTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyTypeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyTypeInteger"


    // $ANTLR start "ruleGithubwfRootConcurrencyTypeInteger"
    // InternalGithubwfParser.g:3785:1: ruleGithubwfRootConcurrencyTypeInteger returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleGithubwfRootConcurrencyTypeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3791:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfParser.g:3792:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfParser.g:3792:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:3793:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootConcurrencyTypeIntegerAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootConcurrencyTypeIntegerAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:3801:3: ( (lv_concurrency_2_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:3802:4: (lv_concurrency_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:3802:4: (lv_concurrency_2_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:3803:5: lv_concurrency_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeIntegerAccess().getConcurrencyEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyTypeIntegerRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootConcurrencyTypeInteger"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyTypeNumber"
    // InternalGithubwfParser.g:3824:1: entryRuleGithubwfRootConcurrencyTypeNumber returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyTypeNumber= ruleGithubwfRootConcurrencyTypeNumber EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyTypeNumber = null;


        try {
            // InternalGithubwfParser.g:3824:74: (iv_ruleGithubwfRootConcurrencyTypeNumber= ruleGithubwfRootConcurrencyTypeNumber EOF )
            // InternalGithubwfParser.g:3825:2: iv_ruleGithubwfRootConcurrencyTypeNumber= ruleGithubwfRootConcurrencyTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyTypeNumber=ruleGithubwfRootConcurrencyTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyTypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyTypeNumber"


    // $ANTLR start "ruleGithubwfRootConcurrencyTypeNumber"
    // InternalGithubwfParser.g:3831:1: ruleGithubwfRootConcurrencyTypeNumber returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleGithubwfRootConcurrencyTypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3837:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) ) )
            // InternalGithubwfParser.g:3838:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) )
            {
            // InternalGithubwfParser.g:3838:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:3839:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootConcurrencyTypeNumberAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootConcurrencyTypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:3847:3: ( (lv_concurrency_2_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:3848:4: (lv_concurrency_2_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:3848:4: (lv_concurrency_2_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:3849:5: lv_concurrency_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeNumberAccess().getConcurrencyEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyTypeNumberRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootConcurrencyTypeNumber"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyTypeBoolean"
    // InternalGithubwfParser.g:3870:1: entryRuleGithubwfRootConcurrencyTypeBoolean returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyTypeBoolean= ruleGithubwfRootConcurrencyTypeBoolean EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyTypeBoolean = null;


        try {
            // InternalGithubwfParser.g:3870:75: (iv_ruleGithubwfRootConcurrencyTypeBoolean= ruleGithubwfRootConcurrencyTypeBoolean EOF )
            // InternalGithubwfParser.g:3871:2: iv_ruleGithubwfRootConcurrencyTypeBoolean= ruleGithubwfRootConcurrencyTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyTypeBoolean=ruleGithubwfRootConcurrencyTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyTypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyTypeBoolean"


    // $ANTLR start "ruleGithubwfRootConcurrencyTypeBoolean"
    // InternalGithubwfParser.g:3877:1: ruleGithubwfRootConcurrencyTypeBoolean returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleGithubwfRootConcurrencyTypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:3883:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) ) ) )
            // InternalGithubwfParser.g:3884:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) ) )
            {
            // InternalGithubwfParser.g:3884:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) ) )
            // InternalGithubwfParser.g:3885:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootConcurrencyTypeBooleanAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootConcurrencyTypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:3893:3: ( (lv_concurrency_2_0= ruleEBooleanObject ) )
            // InternalGithubwfParser.g:3894:4: (lv_concurrency_2_0= ruleEBooleanObject )
            {
            // InternalGithubwfParser.g:3894:4: (lv_concurrency_2_0= ruleEBooleanObject )
            // InternalGithubwfParser.g:3895:5: lv_concurrency_2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeBooleanAccess().getConcurrencyEBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyTypeBooleanRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.Githubwf.EBooleanObject");
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
    // $ANTLR end "ruleGithubwfRootConcurrencyTypeBoolean"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyTypeObject"
    // InternalGithubwfParser.g:3916:1: entryRuleGithubwfRootConcurrencyTypeObject returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyTypeObject= ruleGithubwfRootConcurrencyTypeObject EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyTypeObject = null;


        try {
            // InternalGithubwfParser.g:3916:74: (iv_ruleGithubwfRootConcurrencyTypeObject= ruleGithubwfRootConcurrencyTypeObject EOF )
            // InternalGithubwfParser.g:3917:2: iv_ruleGithubwfRootConcurrencyTypeObject= ruleGithubwfRootConcurrencyTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyTypeObject=ruleGithubwfRootConcurrencyTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyTypeObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyTypeObject"


    // $ANTLR start "ruleGithubwfRootConcurrencyTypeObject"
    // InternalGithubwfParser.g:3923:1: ruleGithubwfRootConcurrencyTypeObject returns [EObject current=null] : ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleGithubwfRootConcurrencyTypeObject() throws RecognitionException {
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
            // InternalGithubwfParser.g:3929:2: ( ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalGithubwfParser.g:3930:2: ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:3930:2: ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalGithubwfParser.g:3931:3: () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalGithubwfParser.g:3931:3: ()
            // InternalGithubwfParser.g:3932:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootConcurrencyTypeObjectAccess().getGithubwfRootConcurrencyTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootConcurrencyTypeObjectAccess().getConcurrencyKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGithubwfRootConcurrencyTypeObjectAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGithubwfRootConcurrencyTypeObjectAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalGithubwfParser.g:3950:3: ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=WorkingDirectory && LA36_0<=Run)||LA36_0==On||LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGithubwfParser.g:3951:4: ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfParser.g:3951:4: ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) )
                    // InternalGithubwfParser.g:3952:5: (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract )
                    {
                    // InternalGithubwfParser.g:3952:5: (lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract )
                    // InternalGithubwfParser.g:3953:6: lv_concurrency_4_0= ruleGithubwfRootConcurrencyPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeObjectAccess().getConcurrencyGithubwfRootConcurrencyPropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_concurrency_4_0=ruleGithubwfRootConcurrencyPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"concurrency",
                      							lv_concurrency_4_0,
                      							"githubwf.githubwf.Githubwf.GithubwfRootConcurrencyPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:3970:4: (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==Comma) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:3971:5: otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getGithubwfRootConcurrencyTypeObjectAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:3975:5: ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract ) )
                    	    // InternalGithubwfParser.g:3976:6: (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfParser.g:3976:6: (lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract )
                    	    // InternalGithubwfParser.g:3977:7: lv_concurrency_6_0= ruleGithubwfRootConcurrencyPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeObjectAccess().getConcurrencyGithubwfRootConcurrencyPropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_concurrency_6_0=ruleGithubwfRootConcurrencyPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"concurrency",
                    	      								lv_concurrency_6_0,
                    	      								"githubwf.githubwf.Githubwf.GithubwfRootConcurrencyPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGithubwfRootConcurrencyTypeObjectAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleGithubwfRootConcurrencyTypeObject"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyTypeArray"
    // InternalGithubwfParser.g:4004:1: entryRuleGithubwfRootConcurrencyTypeArray returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyTypeArray= ruleGithubwfRootConcurrencyTypeArray EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyTypeArray = null;


        try {
            // InternalGithubwfParser.g:4004:73: (iv_ruleGithubwfRootConcurrencyTypeArray= ruleGithubwfRootConcurrencyTypeArray EOF )
            // InternalGithubwfParser.g:4005:2: iv_ruleGithubwfRootConcurrencyTypeArray= ruleGithubwfRootConcurrencyTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyTypeArray=ruleGithubwfRootConcurrencyTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyTypeArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyTypeArray"


    // $ANTLR start "ruleGithubwfRootConcurrencyTypeArray"
    // InternalGithubwfParser.g:4011:1: ruleGithubwfRootConcurrencyTypeArray returns [EObject current=null] : ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleGithubwfRootConcurrencyTypeArray() throws RecognitionException {
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
            // InternalGithubwfParser.g:4017:2: ( ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalGithubwfParser.g:4018:2: ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalGithubwfParser.g:4018:2: ( () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalGithubwfParser.g:4019:3: () otherlv_1= Concurrency otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalGithubwfParser.g:4019:3: ()
            // InternalGithubwfParser.g:4020:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootConcurrencyTypeArrayAccess().getGithubwfRootConcurrencyTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootConcurrencyTypeArrayAccess().getConcurrencyKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGithubwfRootConcurrencyTypeArrayAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGithubwfRootConcurrencyTypeArrayAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalGithubwfParser.g:4038:3: ( ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=WorkingDirectory && LA38_0<=True)||LA38_0==LeftSquareBracket||LA38_0==LeftCurlyBracket||(LA38_0>=RULE_STRING && LA38_0<=RULE_E_DOUBLE)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGithubwfParser.g:4039:4: ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems ) ) (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) ) )*
                    {
                    // InternalGithubwfParser.g:4039:4: ( (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems ) )
                    // InternalGithubwfParser.g:4040:5: (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems )
                    {
                    // InternalGithubwfParser.g:4040:5: (lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems )
                    // InternalGithubwfParser.g:4041:6: lv_concurrency_4_0= ruleGithubwfRootConcurrencyItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeArrayAccess().getConcurrencyGithubwfRootConcurrencyItemsParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_concurrency_4_0=ruleGithubwfRootConcurrencyItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"concurrency",
                      							lv_concurrency_4_0,
                      							"githubwf.githubwf.Githubwf.GithubwfRootConcurrencyItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:4058:4: (otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==Comma) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:4059:5: otherlv_5= Comma ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getGithubwfRootConcurrencyTypeArrayAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:4063:5: ( (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems ) )
                    	    // InternalGithubwfParser.g:4064:6: (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems )
                    	    {
                    	    // InternalGithubwfParser.g:4064:6: (lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems )
                    	    // InternalGithubwfParser.g:4065:7: lv_concurrency_6_0= ruleGithubwfRootConcurrencyItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeArrayAccess().getConcurrencyGithubwfRootConcurrencyItemsParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_concurrency_6_0=ruleGithubwfRootConcurrencyItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"concurrency",
                    	      								lv_concurrency_6_0,
                    	      								"githubwf.githubwf.Githubwf.GithubwfRootConcurrencyItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGithubwfRootConcurrencyTypeArrayAccess().getRightSquareBracketKeyword_5());
              		
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
    // $ANTLR end "ruleGithubwfRootConcurrencyTypeArray"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyTypeNull"
    // InternalGithubwfParser.g:4092:1: entryRuleGithubwfRootConcurrencyTypeNull returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyTypeNull= ruleGithubwfRootConcurrencyTypeNull EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyTypeNull = null;


        try {
            // InternalGithubwfParser.g:4092:72: (iv_ruleGithubwfRootConcurrencyTypeNull= ruleGithubwfRootConcurrencyTypeNull EOF )
            // InternalGithubwfParser.g:4093:2: iv_ruleGithubwfRootConcurrencyTypeNull= ruleGithubwfRootConcurrencyTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyTypeNull=ruleGithubwfRootConcurrencyTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyTypeNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyTypeNull"


    // $ANTLR start "ruleGithubwfRootConcurrencyTypeNull"
    // InternalGithubwfParser.g:4099:1: ruleGithubwfRootConcurrencyTypeNull returns [EObject current=null] : (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) ) ) ;
    public final EObject ruleGithubwfRootConcurrencyTypeNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_concurrency_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4105:2: ( (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) ) ) )
            // InternalGithubwfParser.g:4106:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) ) )
            {
            // InternalGithubwfParser.g:4106:2: (otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) ) )
            // InternalGithubwfParser.g:4107:3: otherlv_0= Concurrency otherlv_1= Colon ( (lv_concurrency_2_0= ruleNullValue ) )
            {
            otherlv_0=(Token)match(input,Concurrency,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGithubwfRootConcurrencyTypeNullAccess().getConcurrencyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootConcurrencyTypeNullAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:4115:3: ( (lv_concurrency_2_0= ruleNullValue ) )
            // InternalGithubwfParser.g:4116:4: (lv_concurrency_2_0= ruleNullValue )
            {
            // InternalGithubwfParser.g:4116:4: (lv_concurrency_2_0= ruleNullValue )
            // InternalGithubwfParser.g:4117:5: lv_concurrency_2_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootConcurrencyTypeNullAccess().getConcurrencyNullValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_concurrency_2_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyTypeNullRule());
              					}
              					set(
              						current,
              						"concurrency",
              						lv_concurrency_2_0,
              						"githubwf.githubwf.Githubwf.NullValue");
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
    // $ANTLR end "ruleGithubwfRootConcurrencyTypeNull"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyAdditionalProperties"
    // InternalGithubwfParser.g:4138:1: entryRuleGithubwfRootConcurrencyAdditionalProperties returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyAdditionalProperties= ruleGithubwfRootConcurrencyAdditionalProperties EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyAdditionalProperties = null;


        try {
            // InternalGithubwfParser.g:4138:84: (iv_ruleGithubwfRootConcurrencyAdditionalProperties= ruleGithubwfRootConcurrencyAdditionalProperties EOF )
            // InternalGithubwfParser.g:4139:2: iv_ruleGithubwfRootConcurrencyAdditionalProperties= ruleGithubwfRootConcurrencyAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyAdditionalProperties=ruleGithubwfRootConcurrencyAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyAdditionalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyAdditionalProperties"


    // $ANTLR start "ruleGithubwfRootConcurrencyAdditionalProperties"
    // InternalGithubwfParser.g:4145:1: ruleGithubwfRootConcurrencyAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleGithubwfRootConcurrencyAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4151:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfParser.g:4152:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfParser.g:4152:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:4153:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:4153:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfParser.g:4154:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:4154:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfParser.g:4155:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.Githubwf.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootConcurrencyAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:4176:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:4177:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:4177:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfParser.g:4178:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootConcurrencyAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootConcurrencyAdditionalProperties"


    // $ANTLR start "entryRuleGithubwfRootConcurrencyItems"
    // InternalGithubwfParser.g:4199:1: entryRuleGithubwfRootConcurrencyItems returns [EObject current=null] : iv_ruleGithubwfRootConcurrencyItems= ruleGithubwfRootConcurrencyItems EOF ;
    public final EObject entryRuleGithubwfRootConcurrencyItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootConcurrencyItems = null;


        try {
            // InternalGithubwfParser.g:4199:69: (iv_ruleGithubwfRootConcurrencyItems= ruleGithubwfRootConcurrencyItems EOF )
            // InternalGithubwfParser.g:4200:2: iv_ruleGithubwfRootConcurrencyItems= ruleGithubwfRootConcurrencyItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootConcurrencyItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootConcurrencyItems=ruleGithubwfRootConcurrencyItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootConcurrencyItems; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootConcurrencyItems"


    // $ANTLR start "ruleGithubwfRootConcurrencyItems"
    // InternalGithubwfParser.g:4206:1: ruleGithubwfRootConcurrencyItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleGithubwfRootConcurrencyItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4212:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:4213:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:4213:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:4214:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:4214:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfParser.g:4215:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootConcurrencyItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootConcurrencyItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootConcurrencyItems"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0"
    // InternalGithubwfParser.g:4235:1: entryRuleGithubwfRootJobsPatternProperties0 returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0= ruleGithubwfRootJobsPatternProperties0 EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0 = null;


        try {
            // InternalGithubwfParser.g:4235:75: (iv_ruleGithubwfRootJobsPatternProperties0= ruleGithubwfRootJobsPatternProperties0 EOF )
            // InternalGithubwfParser.g:4236:2: iv_ruleGithubwfRootJobsPatternProperties0= ruleGithubwfRootJobsPatternProperties0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0=ruleGithubwfRootJobsPatternProperties0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0"
    // InternalGithubwfParser.g:4242:1: ruleGithubwfRootJobsPatternProperties0 returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Abstract ) ) ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_patternProperties0_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4248:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Abstract ) ) ) )
            // InternalGithubwfParser.g:4249:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Abstract ) ) )
            {
            // InternalGithubwfParser.g:4249:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Abstract ) ) )
            // InternalGithubwfParser.g:4250:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Abstract ) )
            {
            // InternalGithubwfParser.g:4250:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfParser.g:4251:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:4251:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfParser.g:4252:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0Access().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0Rule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.Githubwf.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootJobsPatternProperties0Access().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:4273:3: ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Abstract ) )
            // InternalGithubwfParser.g:4274:4: (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Abstract )
            {
            // InternalGithubwfParser.g:4274:4: (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Abstract )
            // InternalGithubwfParser.g:4275:5: lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Abstract
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0Access().getPatternProperties0GithubwfRootJobsPatternProperties0AbstractParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_2_0=ruleGithubwfRootJobsPatternProperties0Abstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0Rule());
              					}
              					set(
              						current,
              						"patternProperties0",
              						lv_patternProperties0_2_0,
              						"githubwf.githubwf.Githubwf.GithubwfRootJobsPatternProperties0Abstract");
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0TypeString"
    // InternalGithubwfParser.g:4296:1: entryRuleGithubwfRootJobsPatternProperties0TypeString returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0TypeString= ruleGithubwfRootJobsPatternProperties0TypeString EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0TypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0TypeString = null;


        try {
            // InternalGithubwfParser.g:4296:85: (iv_ruleGithubwfRootJobsPatternProperties0TypeString= ruleGithubwfRootJobsPatternProperties0TypeString EOF )
            // InternalGithubwfParser.g:4297:2: iv_ruleGithubwfRootJobsPatternProperties0TypeString= ruleGithubwfRootJobsPatternProperties0TypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0TypeString=ruleGithubwfRootJobsPatternProperties0TypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0TypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0TypeString"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0TypeString"
    // InternalGithubwfParser.g:4303:1: ruleGithubwfRootJobsPatternProperties0TypeString returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEString ) ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0TypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4309:2: ( ( (lv_patternProperties0_0_0= ruleEString ) ) )
            // InternalGithubwfParser.g:4310:2: ( (lv_patternProperties0_0_0= ruleEString ) )
            {
            // InternalGithubwfParser.g:4310:2: ( (lv_patternProperties0_0_0= ruleEString ) )
            // InternalGithubwfParser.g:4311:3: (lv_patternProperties0_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:4311:3: (lv_patternProperties0_0_0= ruleEString )
            // InternalGithubwfParser.g:4312:4: lv_patternProperties0_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeStringAccess().getPatternProperties0EStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0TypeStringRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.Githubwf.EString");
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0TypeString"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0TypeInteger"
    // InternalGithubwfParser.g:4332:1: entryRuleGithubwfRootJobsPatternProperties0TypeInteger returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0TypeInteger= ruleGithubwfRootJobsPatternProperties0TypeInteger EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0TypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0TypeInteger = null;


        try {
            // InternalGithubwfParser.g:4332:86: (iv_ruleGithubwfRootJobsPatternProperties0TypeInteger= ruleGithubwfRootJobsPatternProperties0TypeInteger EOF )
            // InternalGithubwfParser.g:4333:2: iv_ruleGithubwfRootJobsPatternProperties0TypeInteger= ruleGithubwfRootJobsPatternProperties0TypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0TypeInteger=ruleGithubwfRootJobsPatternProperties0TypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0TypeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0TypeInteger"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0TypeInteger"
    // InternalGithubwfParser.g:4339:1: ruleGithubwfRootJobsPatternProperties0TypeInteger returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0TypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4345:2: ( ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:4346:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfParser.g:4346:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:4347:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:4347:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:4348:4: lv_patternProperties0_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0TypeIntegerRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0TypeInteger"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0TypeNumber"
    // InternalGithubwfParser.g:4368:1: entryRuleGithubwfRootJobsPatternProperties0TypeNumber returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0TypeNumber= ruleGithubwfRootJobsPatternProperties0TypeNumber EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0TypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0TypeNumber = null;


        try {
            // InternalGithubwfParser.g:4368:85: (iv_ruleGithubwfRootJobsPatternProperties0TypeNumber= ruleGithubwfRootJobsPatternProperties0TypeNumber EOF )
            // InternalGithubwfParser.g:4369:2: iv_ruleGithubwfRootJobsPatternProperties0TypeNumber= ruleGithubwfRootJobsPatternProperties0TypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0TypeNumber=ruleGithubwfRootJobsPatternProperties0TypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0TypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0TypeNumber"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0TypeNumber"
    // InternalGithubwfParser.g:4375:1: ruleGithubwfRootJobsPatternProperties0TypeNumber returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0TypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4381:2: ( ( (lv_patternProperties0_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:4382:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfParser.g:4382:2: ( (lv_patternProperties0_0_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:4383:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:4383:3: (lv_patternProperties0_0_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:4384:4: lv_patternProperties0_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0TypeNumberRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0TypeNumber"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0TypeBoolean"
    // InternalGithubwfParser.g:4404:1: entryRuleGithubwfRootJobsPatternProperties0TypeBoolean returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0TypeBoolean= ruleGithubwfRootJobsPatternProperties0TypeBoolean EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0TypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0TypeBoolean = null;


        try {
            // InternalGithubwfParser.g:4404:86: (iv_ruleGithubwfRootJobsPatternProperties0TypeBoolean= ruleGithubwfRootJobsPatternProperties0TypeBoolean EOF )
            // InternalGithubwfParser.g:4405:2: iv_ruleGithubwfRootJobsPatternProperties0TypeBoolean= ruleGithubwfRootJobsPatternProperties0TypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0TypeBoolean=ruleGithubwfRootJobsPatternProperties0TypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0TypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0TypeBoolean"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0TypeBoolean"
    // InternalGithubwfParser.g:4411:1: ruleGithubwfRootJobsPatternProperties0TypeBoolean returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0TypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4417:2: ( ( (lv_patternProperties0_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfParser.g:4418:2: ( (lv_patternProperties0_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfParser.g:4418:2: ( (lv_patternProperties0_0_0= ruleEBooleanObject ) )
            // InternalGithubwfParser.g:4419:3: (lv_patternProperties0_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfParser.g:4419:3: (lv_patternProperties0_0_0= ruleEBooleanObject )
            // InternalGithubwfParser.g:4420:4: lv_patternProperties0_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0TypeBooleanRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.Githubwf.EBooleanObject");
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0TypeBoolean"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0TypeObject"
    // InternalGithubwfParser.g:4440:1: entryRuleGithubwfRootJobsPatternProperties0TypeObject returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0TypeObject= ruleGithubwfRootJobsPatternProperties0TypeObject EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0TypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0TypeObject = null;


        try {
            // InternalGithubwfParser.g:4440:85: (iv_ruleGithubwfRootJobsPatternProperties0TypeObject= ruleGithubwfRootJobsPatternProperties0TypeObject EOF )
            // InternalGithubwfParser.g:4441:2: iv_ruleGithubwfRootJobsPatternProperties0TypeObject= ruleGithubwfRootJobsPatternProperties0TypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0TypeObject=ruleGithubwfRootJobsPatternProperties0TypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0TypeObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0TypeObject"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0TypeObject"
    // InternalGithubwfParser.g:4447:1: ruleGithubwfRootJobsPatternProperties0TypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0TypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_patternProperties0_2_0 = null;

        EObject lv_patternProperties0_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4453:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfParser.g:4454:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:4454:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfParser.g:4455:3: () otherlv_1= LeftCurlyBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfParser.g:4455:3: ()
            // InternalGithubwfParser.g:4456:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootJobsPatternProperties0TypeObjectAccess().getGithubwfRootJobsPatternProperties0TypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootJobsPatternProperties0TypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfParser.g:4466:3: ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=WorkingDirectory && LA40_0<=Run)||LA40_0==On||LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGithubwfParser.g:4467:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfParser.g:4467:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) )
                    // InternalGithubwfParser.g:4468:5: (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract )
                    {
                    // InternalGithubwfParser.g:4468:5: (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract )
                    // InternalGithubwfParser.g:4469:6: lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeObjectAccess().getPatternProperties0GithubwfRootJobsPatternProperties0PropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_patternProperties0_2_0=ruleGithubwfRootJobsPatternProperties0PropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0TypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"patternProperties0",
                      							lv_patternProperties0_2_0,
                      							"githubwf.githubwf.Githubwf.GithubwfRootJobsPatternProperties0PropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:4486:4: (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==Comma) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:4487:5: otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getGithubwfRootJobsPatternProperties0TypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:4491:5: ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract ) )
                    	    // InternalGithubwfParser.g:4492:6: (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract )
                    	    {
                    	    // InternalGithubwfParser.g:4492:6: (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract )
                    	    // InternalGithubwfParser.g:4493:7: lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0PropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeObjectAccess().getPatternProperties0GithubwfRootJobsPatternProperties0PropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_patternProperties0_4_0=ruleGithubwfRootJobsPatternProperties0PropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0TypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"patternProperties0",
                    	      								lv_patternProperties0_4_0,
                    	      								"githubwf.githubwf.Githubwf.GithubwfRootJobsPatternProperties0PropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGithubwfRootJobsPatternProperties0TypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0TypeObject"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0TypeArray"
    // InternalGithubwfParser.g:4520:1: entryRuleGithubwfRootJobsPatternProperties0TypeArray returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0TypeArray= ruleGithubwfRootJobsPatternProperties0TypeArray EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0TypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0TypeArray = null;


        try {
            // InternalGithubwfParser.g:4520:84: (iv_ruleGithubwfRootJobsPatternProperties0TypeArray= ruleGithubwfRootJobsPatternProperties0TypeArray EOF )
            // InternalGithubwfParser.g:4521:2: iv_ruleGithubwfRootJobsPatternProperties0TypeArray= ruleGithubwfRootJobsPatternProperties0TypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0TypeArray=ruleGithubwfRootJobsPatternProperties0TypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0TypeArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0TypeArray"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0TypeArray"
    // InternalGithubwfParser.g:4527:1: ruleGithubwfRootJobsPatternProperties0TypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0TypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_patternProperties0_2_0 = null;

        EObject lv_patternProperties0_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4533:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfParser.g:4534:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfParser.g:4534:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfParser.g:4535:3: () otherlv_1= LeftSquareBracket ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfParser.g:4535:3: ()
            // InternalGithubwfParser.g:4536:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGithubwfRootJobsPatternProperties0TypeArrayAccess().getGithubwfRootJobsPatternProperties0TypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootJobsPatternProperties0TypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfParser.g:4546:3: ( ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=WorkingDirectory && LA42_0<=True)||LA42_0==LeftSquareBracket||LA42_0==LeftCurlyBracket||(LA42_0>=RULE_STRING && LA42_0<=RULE_E_DOUBLE)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGithubwfParser.g:4547:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items ) ) (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) ) )*
                    {
                    // InternalGithubwfParser.g:4547:4: ( (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items ) )
                    // InternalGithubwfParser.g:4548:5: (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items )
                    {
                    // InternalGithubwfParser.g:4548:5: (lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items )
                    // InternalGithubwfParser.g:4549:6: lv_patternProperties0_2_0= ruleGithubwfRootJobsPatternProperties0Items
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeArrayAccess().getPatternProperties0GithubwfRootJobsPatternProperties0ItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_patternProperties0_2_0=ruleGithubwfRootJobsPatternProperties0Items();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0TypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"patternProperties0",
                      							lv_patternProperties0_2_0,
                      							"githubwf.githubwf.Githubwf.GithubwfRootJobsPatternProperties0Items");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:4566:4: (otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==Comma) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:4567:5: otherlv_3= Comma ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getGithubwfRootJobsPatternProperties0TypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:4571:5: ( (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items ) )
                    	    // InternalGithubwfParser.g:4572:6: (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items )
                    	    {
                    	    // InternalGithubwfParser.g:4572:6: (lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items )
                    	    // InternalGithubwfParser.g:4573:7: lv_patternProperties0_4_0= ruleGithubwfRootJobsPatternProperties0Items
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeArrayAccess().getPatternProperties0GithubwfRootJobsPatternProperties0ItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_patternProperties0_4_0=ruleGithubwfRootJobsPatternProperties0Items();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0TypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"patternProperties0",
                    	      								lv_patternProperties0_4_0,
                    	      								"githubwf.githubwf.Githubwf.GithubwfRootJobsPatternProperties0Items");
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

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGithubwfRootJobsPatternProperties0TypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0TypeArray"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0TypeNull"
    // InternalGithubwfParser.g:4600:1: entryRuleGithubwfRootJobsPatternProperties0TypeNull returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0TypeNull= ruleGithubwfRootJobsPatternProperties0TypeNull EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0TypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0TypeNull = null;


        try {
            // InternalGithubwfParser.g:4600:83: (iv_ruleGithubwfRootJobsPatternProperties0TypeNull= ruleGithubwfRootJobsPatternProperties0TypeNull EOF )
            // InternalGithubwfParser.g:4601:2: iv_ruleGithubwfRootJobsPatternProperties0TypeNull= ruleGithubwfRootJobsPatternProperties0TypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0TypeNull=ruleGithubwfRootJobsPatternProperties0TypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0TypeNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0TypeNull"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0TypeNull"
    // InternalGithubwfParser.g:4607:1: ruleGithubwfRootJobsPatternProperties0TypeNull returns [EObject current=null] : ( (lv_patternProperties0_0_0= ruleNullValue ) ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0TypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_patternProperties0_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4613:2: ( ( (lv_patternProperties0_0_0= ruleNullValue ) ) )
            // InternalGithubwfParser.g:4614:2: ( (lv_patternProperties0_0_0= ruleNullValue ) )
            {
            // InternalGithubwfParser.g:4614:2: ( (lv_patternProperties0_0_0= ruleNullValue ) )
            // InternalGithubwfParser.g:4615:3: (lv_patternProperties0_0_0= ruleNullValue )
            {
            // InternalGithubwfParser.g:4615:3: (lv_patternProperties0_0_0= ruleNullValue )
            // InternalGithubwfParser.g:4616:4: lv_patternProperties0_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0TypeNullAccess().getPatternProperties0NullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_patternProperties0_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0TypeNullRule());
              				}
              				set(
              					current,
              					"patternProperties0",
              					lv_patternProperties0_0_0,
              					"githubwf.githubwf.Githubwf.NullValue");
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0TypeNull"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0AdditionalProperties"
    // InternalGithubwfParser.g:4636:1: entryRuleGithubwfRootJobsPatternProperties0AdditionalProperties returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0AdditionalProperties= ruleGithubwfRootJobsPatternProperties0AdditionalProperties EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0AdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0AdditionalProperties = null;


        try {
            // InternalGithubwfParser.g:4636:95: (iv_ruleGithubwfRootJobsPatternProperties0AdditionalProperties= ruleGithubwfRootJobsPatternProperties0AdditionalProperties EOF )
            // InternalGithubwfParser.g:4637:2: iv_ruleGithubwfRootJobsPatternProperties0AdditionalProperties= ruleGithubwfRootJobsPatternProperties0AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0AdditionalProperties=ruleGithubwfRootJobsPatternProperties0AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0AdditionalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0AdditionalProperties"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0AdditionalProperties"
    // InternalGithubwfParser.g:4643:1: ruleGithubwfRootJobsPatternProperties0AdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0AdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4649:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfParser.g:4650:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfParser.g:4650:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:4651:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:4651:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfParser.g:4652:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:4652:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfParser.g:4653:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.Githubwf.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGithubwfRootJobsPatternProperties0AdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:4674:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:4675:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:4675:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfParser.g:4676:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0AdditionalProperties"


    // $ANTLR start "entryRuleGithubwfRootJobsPatternProperties0Items"
    // InternalGithubwfParser.g:4697:1: entryRuleGithubwfRootJobsPatternProperties0Items returns [EObject current=null] : iv_ruleGithubwfRootJobsPatternProperties0Items= ruleGithubwfRootJobsPatternProperties0Items EOF ;
    public final EObject entryRuleGithubwfRootJobsPatternProperties0Items() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubwfRootJobsPatternProperties0Items = null;


        try {
            // InternalGithubwfParser.g:4697:80: (iv_ruleGithubwfRootJobsPatternProperties0Items= ruleGithubwfRootJobsPatternProperties0Items EOF )
            // InternalGithubwfParser.g:4698:2: iv_ruleGithubwfRootJobsPatternProperties0Items= ruleGithubwfRootJobsPatternProperties0Items EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0ItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGithubwfRootJobsPatternProperties0Items=ruleGithubwfRootJobsPatternProperties0Items();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGithubwfRootJobsPatternProperties0Items; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubwfRootJobsPatternProperties0Items"


    // $ANTLR start "ruleGithubwfRootJobsPatternProperties0Items"
    // InternalGithubwfParser.g:4704:1: ruleGithubwfRootJobsPatternProperties0Items returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleGithubwfRootJobsPatternProperties0Items() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4710:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:4711:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:4711:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:4712:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:4712:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfParser.g:4713:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getGithubwfRootJobsPatternProperties0ItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getGithubwfRootJobsPatternProperties0ItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "ruleGithubwfRootJobsPatternProperties0Items"


    // $ANTLR start "entryRulePermissions"
    // InternalGithubwfParser.g:4733:1: entryRulePermissions returns [EObject current=null] : iv_rulePermissions= rulePermissions EOF ;
    public final EObject entryRulePermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions = null;


        try {
            // InternalGithubwfParser.g:4733:52: (iv_rulePermissions= rulePermissions EOF )
            // InternalGithubwfParser.g:4734:2: iv_rulePermissions= rulePermissions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissions=rulePermissions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissions"


    // $ANTLR start "rulePermissions"
    // InternalGithubwfParser.g:4740:1: rulePermissions returns [EObject current=null] : ( (lv_permissions_0_0= rulePermissionsAbstract ) ) ;
    public final EObject rulePermissions() throws RecognitionException {
        EObject current = null;

        EObject lv_permissions_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4746:2: ( ( (lv_permissions_0_0= rulePermissionsAbstract ) ) )
            // InternalGithubwfParser.g:4747:2: ( (lv_permissions_0_0= rulePermissionsAbstract ) )
            {
            // InternalGithubwfParser.g:4747:2: ( (lv_permissions_0_0= rulePermissionsAbstract ) )
            // InternalGithubwfParser.g:4748:3: (lv_permissions_0_0= rulePermissionsAbstract )
            {
            // InternalGithubwfParser.g:4748:3: (lv_permissions_0_0= rulePermissionsAbstract )
            // InternalGithubwfParser.g:4749:4: lv_permissions_0_0= rulePermissionsAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPermissionsAccess().getPermissionsPermissionsAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_permissions_0_0=rulePermissionsAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPermissionsRule());
              				}
              				set(
              					current,
              					"permissions",
              					lv_permissions_0_0,
              					"githubwf.githubwf.Githubwf.PermissionsAbstract");
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
    // $ANTLR end "rulePermissions"


    // $ANTLR start "entryRulePermissionsTypeString"
    // InternalGithubwfParser.g:4769:1: entryRulePermissionsTypeString returns [EObject current=null] : iv_rulePermissionsTypeString= rulePermissionsTypeString EOF ;
    public final EObject entryRulePermissionsTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsTypeString = null;


        try {
            // InternalGithubwfParser.g:4769:62: (iv_rulePermissionsTypeString= rulePermissionsTypeString EOF )
            // InternalGithubwfParser.g:4770:2: iv_rulePermissionsTypeString= rulePermissionsTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsTypeString=rulePermissionsTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsTypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsTypeString"


    // $ANTLR start "rulePermissionsTypeString"
    // InternalGithubwfParser.g:4776:1: rulePermissionsTypeString returns [EObject current=null] : ( (lv_permissions_0_0= ruleEString ) ) ;
    public final EObject rulePermissionsTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_permissions_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4782:2: ( ( (lv_permissions_0_0= ruleEString ) ) )
            // InternalGithubwfParser.g:4783:2: ( (lv_permissions_0_0= ruleEString ) )
            {
            // InternalGithubwfParser.g:4783:2: ( (lv_permissions_0_0= ruleEString ) )
            // InternalGithubwfParser.g:4784:3: (lv_permissions_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:4784:3: (lv_permissions_0_0= ruleEString )
            // InternalGithubwfParser.g:4785:4: lv_permissions_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPermissionsTypeStringAccess().getPermissionsEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_permissions_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPermissionsTypeStringRule());
              				}
              				set(
              					current,
              					"permissions",
              					lv_permissions_0_0,
              					"githubwf.githubwf.Githubwf.EString");
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
    // $ANTLR end "rulePermissionsTypeString"


    // $ANTLR start "entryRulePermissionsTypeInteger"
    // InternalGithubwfParser.g:4805:1: entryRulePermissionsTypeInteger returns [EObject current=null] : iv_rulePermissionsTypeInteger= rulePermissionsTypeInteger EOF ;
    public final EObject entryRulePermissionsTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsTypeInteger = null;


        try {
            // InternalGithubwfParser.g:4805:63: (iv_rulePermissionsTypeInteger= rulePermissionsTypeInteger EOF )
            // InternalGithubwfParser.g:4806:2: iv_rulePermissionsTypeInteger= rulePermissionsTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsTypeInteger=rulePermissionsTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsTypeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsTypeInteger"


    // $ANTLR start "rulePermissionsTypeInteger"
    // InternalGithubwfParser.g:4812:1: rulePermissionsTypeInteger returns [EObject current=null] : ( (lv_permissions_0_0= ruleEDoubleObject ) ) ;
    public final EObject rulePermissionsTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_permissions_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4818:2: ( ( (lv_permissions_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:4819:2: ( (lv_permissions_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfParser.g:4819:2: ( (lv_permissions_0_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:4820:3: (lv_permissions_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:4820:3: (lv_permissions_0_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:4821:4: lv_permissions_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPermissionsTypeIntegerAccess().getPermissionsEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_permissions_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPermissionsTypeIntegerRule());
              				}
              				set(
              					current,
              					"permissions",
              					lv_permissions_0_0,
              					"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "rulePermissionsTypeInteger"


    // $ANTLR start "entryRulePermissionsTypeNumber"
    // InternalGithubwfParser.g:4841:1: entryRulePermissionsTypeNumber returns [EObject current=null] : iv_rulePermissionsTypeNumber= rulePermissionsTypeNumber EOF ;
    public final EObject entryRulePermissionsTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsTypeNumber = null;


        try {
            // InternalGithubwfParser.g:4841:62: (iv_rulePermissionsTypeNumber= rulePermissionsTypeNumber EOF )
            // InternalGithubwfParser.g:4842:2: iv_rulePermissionsTypeNumber= rulePermissionsTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsTypeNumber=rulePermissionsTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsTypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsTypeNumber"


    // $ANTLR start "rulePermissionsTypeNumber"
    // InternalGithubwfParser.g:4848:1: rulePermissionsTypeNumber returns [EObject current=null] : ( (lv_permissions_0_0= ruleEDoubleObject ) ) ;
    public final EObject rulePermissionsTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_permissions_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4854:2: ( ( (lv_permissions_0_0= ruleEDoubleObject ) ) )
            // InternalGithubwfParser.g:4855:2: ( (lv_permissions_0_0= ruleEDoubleObject ) )
            {
            // InternalGithubwfParser.g:4855:2: ( (lv_permissions_0_0= ruleEDoubleObject ) )
            // InternalGithubwfParser.g:4856:3: (lv_permissions_0_0= ruleEDoubleObject )
            {
            // InternalGithubwfParser.g:4856:3: (lv_permissions_0_0= ruleEDoubleObject )
            // InternalGithubwfParser.g:4857:4: lv_permissions_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPermissionsTypeNumberAccess().getPermissionsEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_permissions_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPermissionsTypeNumberRule());
              				}
              				set(
              					current,
              					"permissions",
              					lv_permissions_0_0,
              					"githubwf.githubwf.Githubwf.EDoubleObject");
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
    // $ANTLR end "rulePermissionsTypeNumber"


    // $ANTLR start "entryRulePermissionsTypeBoolean"
    // InternalGithubwfParser.g:4877:1: entryRulePermissionsTypeBoolean returns [EObject current=null] : iv_rulePermissionsTypeBoolean= rulePermissionsTypeBoolean EOF ;
    public final EObject entryRulePermissionsTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsTypeBoolean = null;


        try {
            // InternalGithubwfParser.g:4877:63: (iv_rulePermissionsTypeBoolean= rulePermissionsTypeBoolean EOF )
            // InternalGithubwfParser.g:4878:2: iv_rulePermissionsTypeBoolean= rulePermissionsTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsTypeBoolean=rulePermissionsTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsTypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsTypeBoolean"


    // $ANTLR start "rulePermissionsTypeBoolean"
    // InternalGithubwfParser.g:4884:1: rulePermissionsTypeBoolean returns [EObject current=null] : ( (lv_permissions_0_0= ruleEBooleanObject ) ) ;
    public final EObject rulePermissionsTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_permissions_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4890:2: ( ( (lv_permissions_0_0= ruleEBooleanObject ) ) )
            // InternalGithubwfParser.g:4891:2: ( (lv_permissions_0_0= ruleEBooleanObject ) )
            {
            // InternalGithubwfParser.g:4891:2: ( (lv_permissions_0_0= ruleEBooleanObject ) )
            // InternalGithubwfParser.g:4892:3: (lv_permissions_0_0= ruleEBooleanObject )
            {
            // InternalGithubwfParser.g:4892:3: (lv_permissions_0_0= ruleEBooleanObject )
            // InternalGithubwfParser.g:4893:4: lv_permissions_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPermissionsTypeBooleanAccess().getPermissionsEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_permissions_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPermissionsTypeBooleanRule());
              				}
              				set(
              					current,
              					"permissions",
              					lv_permissions_0_0,
              					"githubwf.githubwf.Githubwf.EBooleanObject");
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
    // $ANTLR end "rulePermissionsTypeBoolean"


    // $ANTLR start "entryRulePermissionsTypeObject"
    // InternalGithubwfParser.g:4913:1: entryRulePermissionsTypeObject returns [EObject current=null] : iv_rulePermissionsTypeObject= rulePermissionsTypeObject EOF ;
    public final EObject entryRulePermissionsTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsTypeObject = null;


        try {
            // InternalGithubwfParser.g:4913:62: (iv_rulePermissionsTypeObject= rulePermissionsTypeObject EOF )
            // InternalGithubwfParser.g:4914:2: iv_rulePermissionsTypeObject= rulePermissionsTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsTypeObject=rulePermissionsTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsTypeObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsTypeObject"


    // $ANTLR start "rulePermissionsTypeObject"
    // InternalGithubwfParser.g:4920:1: rulePermissionsTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_2_0= rulePermissionsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject rulePermissionsTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_permissions_2_0 = null;

        EObject lv_permissions_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:4926:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_2_0= rulePermissionsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalGithubwfParser.g:4927:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_2_0= rulePermissionsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalGithubwfParser.g:4927:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_2_0= rulePermissionsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalGithubwfParser.g:4928:3: () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_2_0= rulePermissionsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalGithubwfParser.g:4928:3: ()
            // InternalGithubwfParser.g:4929:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPermissionsTypeObjectAccess().getPermissionsTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissionsTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalGithubwfParser.g:4939:3: ( ( (lv_permissions_2_0= rulePermissionsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=WorkingDirectory && LA44_0<=Run)||LA44_0==On||LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGithubwfParser.g:4940:4: ( (lv_permissions_2_0= rulePermissionsPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) ) )*
                    {
                    // InternalGithubwfParser.g:4940:4: ( (lv_permissions_2_0= rulePermissionsPropertiesAbstract ) )
                    // InternalGithubwfParser.g:4941:5: (lv_permissions_2_0= rulePermissionsPropertiesAbstract )
                    {
                    // InternalGithubwfParser.g:4941:5: (lv_permissions_2_0= rulePermissionsPropertiesAbstract )
                    // InternalGithubwfParser.g:4942:6: lv_permissions_2_0= rulePermissionsPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPermissionsTypeObjectAccess().getPermissionsPermissionsPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_permissions_2_0=rulePermissionsPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPermissionsTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"permissions",
                      							lv_permissions_2_0,
                      							"githubwf.githubwf.Githubwf.PermissionsPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:4959:4: (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==Comma) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:4960:5: otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getPermissionsTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:4964:5: ( (lv_permissions_4_0= rulePermissionsPropertiesAbstract ) )
                    	    // InternalGithubwfParser.g:4965:6: (lv_permissions_4_0= rulePermissionsPropertiesAbstract )
                    	    {
                    	    // InternalGithubwfParser.g:4965:6: (lv_permissions_4_0= rulePermissionsPropertiesAbstract )
                    	    // InternalGithubwfParser.g:4966:7: lv_permissions_4_0= rulePermissionsPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPermissionsTypeObjectAccess().getPermissionsPermissionsPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_permissions_4_0=rulePermissionsPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPermissionsTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"permissions",
                    	      								lv_permissions_4_0,
                    	      								"githubwf.githubwf.Githubwf.PermissionsPropertiesAbstract");
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


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPermissionsTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "rulePermissionsTypeObject"


    // $ANTLR start "entryRulePermissionsTypeArray"
    // InternalGithubwfParser.g:4993:1: entryRulePermissionsTypeArray returns [EObject current=null] : iv_rulePermissionsTypeArray= rulePermissionsTypeArray EOF ;
    public final EObject entryRulePermissionsTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsTypeArray = null;


        try {
            // InternalGithubwfParser.g:4993:61: (iv_rulePermissionsTypeArray= rulePermissionsTypeArray EOF )
            // InternalGithubwfParser.g:4994:2: iv_rulePermissionsTypeArray= rulePermissionsTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsTypeArray=rulePermissionsTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsTypeArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsTypeArray"


    // $ANTLR start "rulePermissionsTypeArray"
    // InternalGithubwfParser.g:5000:1: rulePermissionsTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_permissions_2_0= rulePermissionsItems ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject rulePermissionsTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_permissions_2_0 = null;

        EObject lv_permissions_4_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:5006:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_permissions_2_0= rulePermissionsItems ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalGithubwfParser.g:5007:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_permissions_2_0= rulePermissionsItems ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalGithubwfParser.g:5007:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_permissions_2_0= rulePermissionsItems ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalGithubwfParser.g:5008:3: () otherlv_1= LeftSquareBracket ( ( (lv_permissions_2_0= rulePermissionsItems ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalGithubwfParser.g:5008:3: ()
            // InternalGithubwfParser.g:5009:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPermissionsTypeArrayAccess().getPermissionsTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissionsTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalGithubwfParser.g:5019:3: ( ( (lv_permissions_2_0= rulePermissionsItems ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsItems ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=WorkingDirectory && LA46_0<=True)||LA46_0==LeftSquareBracket||LA46_0==LeftCurlyBracket||(LA46_0>=RULE_STRING && LA46_0<=RULE_E_DOUBLE)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGithubwfParser.g:5020:4: ( (lv_permissions_2_0= rulePermissionsItems ) ) (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsItems ) ) )*
                    {
                    // InternalGithubwfParser.g:5020:4: ( (lv_permissions_2_0= rulePermissionsItems ) )
                    // InternalGithubwfParser.g:5021:5: (lv_permissions_2_0= rulePermissionsItems )
                    {
                    // InternalGithubwfParser.g:5021:5: (lv_permissions_2_0= rulePermissionsItems )
                    // InternalGithubwfParser.g:5022:6: lv_permissions_2_0= rulePermissionsItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPermissionsTypeArrayAccess().getPermissionsPermissionsItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_permissions_2_0=rulePermissionsItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPermissionsTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"permissions",
                      							lv_permissions_2_0,
                      							"githubwf.githubwf.Githubwf.PermissionsItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalGithubwfParser.g:5039:4: (otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsItems ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==Comma) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalGithubwfParser.g:5040:5: otherlv_3= Comma ( (lv_permissions_4_0= rulePermissionsItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getPermissionsTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalGithubwfParser.g:5044:5: ( (lv_permissions_4_0= rulePermissionsItems ) )
                    	    // InternalGithubwfParser.g:5045:6: (lv_permissions_4_0= rulePermissionsItems )
                    	    {
                    	    // InternalGithubwfParser.g:5045:6: (lv_permissions_4_0= rulePermissionsItems )
                    	    // InternalGithubwfParser.g:5046:7: lv_permissions_4_0= rulePermissionsItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPermissionsTypeArrayAccess().getPermissionsPermissionsItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_permissions_4_0=rulePermissionsItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPermissionsTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"permissions",
                    	      								lv_permissions_4_0,
                    	      								"githubwf.githubwf.Githubwf.PermissionsItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPermissionsTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "rulePermissionsTypeArray"


    // $ANTLR start "entryRulePermissionsTypeNull"
    // InternalGithubwfParser.g:5073:1: entryRulePermissionsTypeNull returns [EObject current=null] : iv_rulePermissionsTypeNull= rulePermissionsTypeNull EOF ;
    public final EObject entryRulePermissionsTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsTypeNull = null;


        try {
            // InternalGithubwfParser.g:5073:60: (iv_rulePermissionsTypeNull= rulePermissionsTypeNull EOF )
            // InternalGithubwfParser.g:5074:2: iv_rulePermissionsTypeNull= rulePermissionsTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsTypeNull=rulePermissionsTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsTypeNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsTypeNull"


    // $ANTLR start "rulePermissionsTypeNull"
    // InternalGithubwfParser.g:5080:1: rulePermissionsTypeNull returns [EObject current=null] : ( (lv_permissions_0_0= ruleNullValue ) ) ;
    public final EObject rulePermissionsTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_permissions_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:5086:2: ( ( (lv_permissions_0_0= ruleNullValue ) ) )
            // InternalGithubwfParser.g:5087:2: ( (lv_permissions_0_0= ruleNullValue ) )
            {
            // InternalGithubwfParser.g:5087:2: ( (lv_permissions_0_0= ruleNullValue ) )
            // InternalGithubwfParser.g:5088:3: (lv_permissions_0_0= ruleNullValue )
            {
            // InternalGithubwfParser.g:5088:3: (lv_permissions_0_0= ruleNullValue )
            // InternalGithubwfParser.g:5089:4: lv_permissions_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPermissionsTypeNullAccess().getPermissionsNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_permissions_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPermissionsTypeNullRule());
              				}
              				set(
              					current,
              					"permissions",
              					lv_permissions_0_0,
              					"githubwf.githubwf.Githubwf.NullValue");
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
    // $ANTLR end "rulePermissionsTypeNull"


    // $ANTLR start "entryRulePermissionsAdditionalProperties"
    // InternalGithubwfParser.g:5109:1: entryRulePermissionsAdditionalProperties returns [EObject current=null] : iv_rulePermissionsAdditionalProperties= rulePermissionsAdditionalProperties EOF ;
    public final EObject entryRulePermissionsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsAdditionalProperties = null;


        try {
            // InternalGithubwfParser.g:5109:72: (iv_rulePermissionsAdditionalProperties= rulePermissionsAdditionalProperties EOF )
            // InternalGithubwfParser.g:5110:2: iv_rulePermissionsAdditionalProperties= rulePermissionsAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsAdditionalProperties=rulePermissionsAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsAdditionalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsAdditionalProperties"


    // $ANTLR start "rulePermissionsAdditionalProperties"
    // InternalGithubwfParser.g:5116:1: rulePermissionsAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject rulePermissionsAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:5122:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalGithubwfParser.g:5123:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalGithubwfParser.g:5123:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:5124:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:5124:3: ( (lv_key_0_0= ruleEString ) )
            // InternalGithubwfParser.g:5125:4: (lv_key_0_0= ruleEString )
            {
            // InternalGithubwfParser.g:5125:4: (lv_key_0_0= ruleEString )
            // InternalGithubwfParser.g:5126:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissionsAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissionsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.Githubwf.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPermissionsAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalGithubwfParser.g:5147:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:5148:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:5148:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalGithubwfParser.g:5149:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPermissionsAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPermissionsAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "rulePermissionsAdditionalProperties"


    // $ANTLR start "entryRulePermissionsItems"
    // InternalGithubwfParser.g:5170:1: entryRulePermissionsItems returns [EObject current=null] : iv_rulePermissionsItems= rulePermissionsItems EOF ;
    public final EObject entryRulePermissionsItems() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsItems = null;


        try {
            // InternalGithubwfParser.g:5170:57: (iv_rulePermissionsItems= rulePermissionsItems EOF )
            // InternalGithubwfParser.g:5171:2: iv_rulePermissionsItems= rulePermissionsItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPermissionsItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePermissionsItems=rulePermissionsItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePermissionsItems; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionsItems"


    // $ANTLR start "rulePermissionsItems"
    // InternalGithubwfParser.g:5177:1: rulePermissionsItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject rulePermissionsItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:5183:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalGithubwfParser.g:5184:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalGithubwfParser.g:5184:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalGithubwfParser.g:5185:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalGithubwfParser.g:5185:3: (lv_items_0_0= ruleJsonDocument )
            // InternalGithubwfParser.g:5186:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPermissionsItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPermissionsItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.Githubwf.JsonDocument");
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
    // $ANTLR end "rulePermissionsItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGithubwfParser.g:5206:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalGithubwfParser.g:5206:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalGithubwfParser.g:5207:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalGithubwfParser.g:5213:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalGithubwfParser.g:5219:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalGithubwfParser.g:5220:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalGithubwfParser.g:5220:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=WorkingDirectory && LA47_0<=Run)||LA47_0==On) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalGithubwfParser.g:5221:3: this_STRING_0= RULE_STRING
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
                    // InternalGithubwfParser.g:5229:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalGithubwfParser.g:5243:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalGithubwfParser.g:5243:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalGithubwfParser.g:5244:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalGithubwfParser.g:5250:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Defaults | kw= Shell | kw= Permissions | kw= Jobs | kw= Name | kw= Run | kw= Env | kw= RunName | kw= WorkingDirectory | kw= On | kw= Concurrency ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGithubwfParser.g:5256:2: ( (kw= Defaults | kw= Shell | kw= Permissions | kw= Jobs | kw= Name | kw= Run | kw= Env | kw= RunName | kw= WorkingDirectory | kw= On | kw= Concurrency ) )
            // InternalGithubwfParser.g:5257:2: (kw= Defaults | kw= Shell | kw= Permissions | kw= Jobs | kw= Name | kw= Run | kw= Env | kw= RunName | kw= WorkingDirectory | kw= On | kw= Concurrency )
            {
            // InternalGithubwfParser.g:5257:2: (kw= Defaults | kw= Shell | kw= Permissions | kw= Jobs | kw= Name | kw= Run | kw= Env | kw= RunName | kw= WorkingDirectory | kw= On | kw= Concurrency )
            int alt48=11;
            switch ( input.LA(1) ) {
            case Defaults:
                {
                alt48=1;
                }
                break;
            case Shell:
                {
                alt48=2;
                }
                break;
            case Permissions:
                {
                alt48=3;
                }
                break;
            case Jobs:
                {
                alt48=4;
                }
                break;
            case Name:
                {
                alt48=5;
                }
                break;
            case Run:
                {
                alt48=6;
                }
                break;
            case Env:
                {
                alt48=7;
                }
                break;
            case RunName:
                {
                alt48=8;
                }
                break;
            case WorkingDirectory:
                {
                alt48=9;
                }
                break;
            case On:
                {
                alt48=10;
                }
                break;
            case Concurrency:
                {
                alt48=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalGithubwfParser.g:5258:3: kw= Defaults
                    {
                    kw=(Token)match(input,Defaults,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDefaultsKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalGithubwfParser.g:5264:3: kw= Shell
                    {
                    kw=(Token)match(input,Shell,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getShellKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalGithubwfParser.g:5270:3: kw= Permissions
                    {
                    kw=(Token)match(input,Permissions,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPermissionsKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalGithubwfParser.g:5276:3: kw= Jobs
                    {
                    kw=(Token)match(input,Jobs,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getJobsKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalGithubwfParser.g:5282:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalGithubwfParser.g:5288:3: kw= Run
                    {
                    kw=(Token)match(input,Run,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRunKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalGithubwfParser.g:5294:3: kw= Env
                    {
                    kw=(Token)match(input,Env,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnvKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalGithubwfParser.g:5300:3: kw= RunName
                    {
                    kw=(Token)match(input,RunName,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRunNameKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalGithubwfParser.g:5306:3: kw= WorkingDirectory
                    {
                    kw=(Token)match(input,WorkingDirectory,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getWorkingDirectoryKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalGithubwfParser.g:5312:3: kw= On
                    {
                    kw=(Token)match(input,On,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getOnKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalGithubwfParser.g:5318:3: kw= Concurrency
                    {
                    kw=(Token)match(input,Concurrency,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConcurrencyKeyword_10());
                      		
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
    // InternalGithubwfParser.g:5327:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalGithubwfParser.g:5333:2: ( (enumLiteral_0= Null ) )
            // InternalGithubwfParser.g:5334:2: (enumLiteral_0= Null )
            {
            // InternalGithubwfParser.g:5334:2: (enumLiteral_0= Null )
            // InternalGithubwfParser.g:5335:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalGithubwfParser
    public final void synpred1_InternalGithubwfParser_fragment() throws RecognitionException {   
        // InternalGithubwfParser.g:244:4: ( ruleGithubwfRootOnTypeNumber )
        // InternalGithubwfParser.g:244:5: ruleGithubwfRootOnTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGithubwfParser

    // $ANTLR start synpred2_InternalGithubwfParser
    public final void synpred2_InternalGithubwfParser_fragment() throws RecognitionException {   
        // InternalGithubwfParser.g:328:4: ( ruleGithubwfRootConcurrencyTypeNumber )
        // InternalGithubwfParser.g:328:5: ruleGithubwfRootConcurrencyTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootConcurrencyTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalGithubwfParser

    // $ANTLR start synpred5_InternalGithubwfParser
    public final void synpred5_InternalGithubwfParser_fragment() throws RecognitionException {   
        // InternalGithubwfParser.g:540:4: ( ruleEnvTypeNumber )
        // InternalGithubwfParser.g:540:5: ruleEnvTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleEnvTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalGithubwfParser

    // $ANTLR start synpred7_InternalGithubwfParser
    public final void synpred7_InternalGithubwfParser_fragment() throws RecognitionException {   
        // InternalGithubwfParser.g:713:4: ( ruleShellTypeNumber )
        // InternalGithubwfParser.g:713:5: ruleShellTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleShellTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalGithubwfParser

    // $ANTLR start synpred10_InternalGithubwfParser
    public final void synpred10_InternalGithubwfParser_fragment() throws RecognitionException {   
        // InternalGithubwfParser.g:853:4: ( ruleGithubwfRootJobsPatternProperties0TypeNumber )
        // InternalGithubwfParser.g:853:5: ruleGithubwfRootJobsPatternProperties0TypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootJobsPatternProperties0TypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalGithubwfParser

    // $ANTLR start synpred12_InternalGithubwfParser
    public final void synpred12_InternalGithubwfParser_fragment() throws RecognitionException {   
        // InternalGithubwfParser.g:965:4: ( rulePermissionsTypeNumber )
        // InternalGithubwfParser.g:965:5: rulePermissionsTypeNumber
        {
        pushFollow(FOLLOW_2);
        rulePermissionsTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalGithubwfParser

    // Delegated rules

    public final boolean synpred7_InternalGithubwfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGithubwfParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGithubwfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGithubwfParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGithubwfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGithubwfParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGithubwfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGithubwfParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalGithubwfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalGithubwfParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGithubwfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGithubwfParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\17\1\23\1\4\4\uffff\2\0\3\uffff";
    static final String dfa_3s = "\1\17\1\23\1\33\4\uffff\2\0\3\uffff";
    static final String dfa_4s = "\3\uffff\1\5\1\7\1\6\1\2\2\uffff\1\4\1\1\1\3";
    static final String dfa_5s = "\7\uffff\1\0\1\1\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\12\6\1\11\1\6\1\4\1\11\2\uffff\1\5\1\uffff\1\3\2\uffff\1\6\1\7\1\10",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "242:2: ( ( ( ruleGithubwfRootOnTypeNumber )=>this_GithubwfRootOnTypeNumber_0= ruleGithubwfRootOnTypeNumber ) | this_GithubwfRootOnTypeString_1= ruleGithubwfRootOnTypeString | this_GithubwfRootOnTypeInteger_2= ruleGithubwfRootOnTypeInteger | this_GithubwfRootOnTypeBoolean_3= ruleGithubwfRootOnTypeBoolean | this_GithubwfRootOnTypeObject_4= ruleGithubwfRootOnTypeObject | this_GithubwfRootOnTypeArray_5= ruleGithubwfRootOnTypeArray | this_GithubwfRootOnTypeNull_6= ruleGithubwfRootOnTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGithubwfParser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGithubwfParser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\1\5\1\23\1\4\4\uffff\2\0\3\uffff";
    static final String dfa_8s = "\1\5\1\23\1\33\4\uffff\2\0\3\uffff";
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "326:2: ( ( ( ruleGithubwfRootConcurrencyTypeNumber )=>this_GithubwfRootConcurrencyTypeNumber_0= ruleGithubwfRootConcurrencyTypeNumber ) | this_GithubwfRootConcurrencyTypeString_1= ruleGithubwfRootConcurrencyTypeString | this_GithubwfRootConcurrencyTypeInteger_2= ruleGithubwfRootConcurrencyTypeInteger | this_GithubwfRootConcurrencyTypeBoolean_3= ruleGithubwfRootConcurrencyTypeBoolean | this_GithubwfRootConcurrencyTypeObject_4= ruleGithubwfRootConcurrencyTypeObject | this_GithubwfRootConcurrencyTypeArray_5= ruleGithubwfRootConcurrencyTypeArray | this_GithubwfRootConcurrencyTypeNull_6= ruleGithubwfRootConcurrencyTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_7 = input.LA(1);

                         
                        int index5_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGithubwfParser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index5_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_8 = input.LA(1);

                         
                        int index5_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalGithubwfParser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index5_8);
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
    static final String dfa_9s = "\12\uffff";
    static final String dfa_10s = "\1\4\2\0\7\uffff";
    static final String dfa_11s = "\1\33\2\0\7\uffff";
    static final String dfa_12s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_13s = "\1\uffff\1\0\1\1\7\uffff}>";
    static final String[] dfa_14s = {
            "\12\3\1\4\1\3\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
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

    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_9;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "538:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalGithubwfParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalGithubwfParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\1\uffff\1\1\1\0\7\uffff}>";
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_9;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_15;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "711:2: ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGithubwfParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGithubwfParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index9_1);
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_9;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "851:2: ( ( ( ruleGithubwfRootJobsPatternProperties0TypeNumber )=>this_GithubwfRootJobsPatternProperties0TypeNumber_0= ruleGithubwfRootJobsPatternProperties0TypeNumber ) | this_GithubwfRootJobsPatternProperties0TypeString_1= ruleGithubwfRootJobsPatternProperties0TypeString | this_GithubwfRootJobsPatternProperties0TypeInteger_2= ruleGithubwfRootJobsPatternProperties0TypeInteger | this_GithubwfRootJobsPatternProperties0TypeBoolean_3= ruleGithubwfRootJobsPatternProperties0TypeBoolean | this_GithubwfRootJobsPatternProperties0TypeObject_4= ruleGithubwfRootJobsPatternProperties0TypeObject | this_GithubwfRootJobsPatternProperties0TypeArray_5= ruleGithubwfRootJobsPatternProperties0TypeArray | this_GithubwfRootJobsPatternProperties0TypeNull_6= ruleGithubwfRootJobsPatternProperties0TypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalGithubwfParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index10_2);
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_9;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "963:2: ( ( ( rulePermissionsTypeNumber )=>this_PermissionsTypeNumber_0= rulePermissionsTypeNumber ) | this_PermissionsTypeString_1= rulePermissionsTypeString | this_PermissionsTypeInteger_2= rulePermissionsTypeInteger | this_PermissionsTypeBoolean_3= rulePermissionsTypeBoolean | this_PermissionsTypeObject_4= rulePermissionsTypeObject | this_PermissionsTypeArray_5= rulePermissionsTypeArray | this_PermissionsTypeNull_6= rulePermissionsTypeNull )";
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
                        if ( (synpred12_InternalGithubwfParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalGithubwfParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index11_2);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000809DE0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000009DE0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000200BFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000E53FFF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000280BFF0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000E73FFF0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000210L});

}
