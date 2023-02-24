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
import githubwf.githubwf.services.PermissionsOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPermissionsOneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RepositoryProjects", "SecurityEvents", "PullRequests", "Deployments", "Discussions", "Contents", "IdToken", "Packages", "Statuses", "Actions", "Checks", "Issues", "Pages", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=18;
    public static final int PullRequests=6;
    public static final int SecurityEvents=5;
    public static final int Discussions=8;
    public static final int Issues=15;
    public static final int Deployments=7;
    public static final int True=19;
    public static final int RULE_STRING=27;
    public static final int False=17;
    public static final int RULE_SL_COMMENT=32;
    public static final int Comma=20;
    public static final int Packages=11;
    public static final int Colon=21;
    public static final int RightCurlyBracket=25;
    public static final int RULE_E_DOUBLE=29;
    public static final int EOF=-1;
    public static final int RightSquareBracket=23;
    public static final int RepositoryProjects=4;
    public static final int IdToken=10;
    public static final int RULE_ID=30;
    public static final int Actions=13;
    public static final int RULE_WS=33;
    public static final int LeftCurlyBracket=24;
    public static final int RULE_E_INT=28;
    public static final int RULE_ANY_OTHER=34;
    public static final int Pages=16;
    public static final int Contents=9;
    public static final int Statuses=12;
    public static final int Checks=14;
    public static final int RULE_INT=26;
    public static final int RULE_ML_COMMENT=31;
    public static final int LeftSquareBracket=22;

    // delegates
    // delegators


        public InternalPermissionsOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPermissionsOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPermissionsOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPermissionsOneOf1Parser.g"; }



     	private PermissionsOneOf1GrammarAccess grammarAccess;

        public InternalPermissionsOneOf1Parser(TokenStream input, PermissionsOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PermissionsOneOf1";
       	}

       	@Override
       	protected PermissionsOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePermissionsOneOf1"
    // InternalPermissionsOneOf1Parser.g:58:1: entryRulePermissionsOneOf1 returns [EObject current=null] : iv_rulePermissionsOneOf1= rulePermissionsOneOf1 EOF ;
    public final EObject entryRulePermissionsOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionsOneOf1 = null;


        try {
            // InternalPermissionsOneOf1Parser.g:58:58: (iv_rulePermissionsOneOf1= rulePermissionsOneOf1 EOF )
            // InternalPermissionsOneOf1Parser.g:59:2: iv_rulePermissionsOneOf1= rulePermissionsOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getPermissionsOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissionsOneOf1=rulePermissionsOneOf1();

            state._fsp--;

             current =iv_rulePermissionsOneOf1; 
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
    // $ANTLR end "entryRulePermissionsOneOf1"


    // $ANTLR start "rulePermissionsOneOf1"
    // InternalPermissionsOneOf1Parser.g:65:1: rulePermissionsOneOf1 returns [EObject current=null] : ( (lv_permissions_0_0= rulePermissions_45event ) ) ;
    public final EObject rulePermissionsOneOf1() throws RecognitionException {
        EObject current = null;

        EObject lv_permissions_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:71:2: ( ( (lv_permissions_0_0= rulePermissions_45event ) ) )
            // InternalPermissionsOneOf1Parser.g:72:2: ( (lv_permissions_0_0= rulePermissions_45event ) )
            {
            // InternalPermissionsOneOf1Parser.g:72:2: ( (lv_permissions_0_0= rulePermissions_45event ) )
            // InternalPermissionsOneOf1Parser.g:73:3: (lv_permissions_0_0= rulePermissions_45event )
            {
            // InternalPermissionsOneOf1Parser.g:73:3: (lv_permissions_0_0= rulePermissions_45event )
            // InternalPermissionsOneOf1Parser.g:74:4: lv_permissions_0_0= rulePermissions_45event
            {

            				newCompositeNode(grammarAccess.getPermissionsOneOf1Access().getPermissionsPermissions_45eventParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_permissions_0_0=rulePermissions_45event();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPermissionsOneOf1Rule());
            				}
            				set(
            					current,
            					"permissions",
            					lv_permissions_0_0,
            					"githubwf.githubwf.PermissionsOneOf1.Permissions_45event");
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
    // $ANTLR end "rulePermissionsOneOf1"


    // $ANTLR start "entryRulePermissions_45eventPropertiesAbstract"
    // InternalPermissionsOneOf1Parser.g:94:1: entryRulePermissions_45eventPropertiesAbstract returns [EObject current=null] : iv_rulePermissions_45eventPropertiesAbstract= rulePermissions_45eventPropertiesAbstract EOF ;
    public final EObject entryRulePermissions_45eventPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventPropertiesAbstract = null;


        try {
            // InternalPermissionsOneOf1Parser.g:94:78: (iv_rulePermissions_45eventPropertiesAbstract= rulePermissions_45eventPropertiesAbstract EOF )
            // InternalPermissionsOneOf1Parser.g:95:2: iv_rulePermissions_45eventPropertiesAbstract= rulePermissions_45eventPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventPropertiesAbstract=rulePermissions_45eventPropertiesAbstract();

            state._fsp--;

             current =iv_rulePermissions_45eventPropertiesAbstract; 
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
    // $ANTLR end "entryRulePermissions_45eventPropertiesAbstract"


    // $ANTLR start "rulePermissions_45eventPropertiesAbstract"
    // InternalPermissionsOneOf1Parser.g:101:1: rulePermissions_45eventPropertiesAbstract returns [EObject current=null] : (this_Permissions_45eventActions_0= rulePermissions_45eventActions | this_Permissions_45eventChecks_1= rulePermissions_45eventChecks | this_Permissions_45eventContents_2= rulePermissions_45eventContents | this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments | this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions | this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token | this_Permissions_45eventIssues_6= rulePermissions_45eventIssues | this_Permissions_45eventPackages_7= rulePermissions_45eventPackages | this_Permissions_45eventPages_8= rulePermissions_45eventPages | this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests | this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects | this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events | this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses ) ;
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
            // InternalPermissionsOneOf1Parser.g:107:2: ( (this_Permissions_45eventActions_0= rulePermissions_45eventActions | this_Permissions_45eventChecks_1= rulePermissions_45eventChecks | this_Permissions_45eventContents_2= rulePermissions_45eventContents | this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments | this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions | this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token | this_Permissions_45eventIssues_6= rulePermissions_45eventIssues | this_Permissions_45eventPackages_7= rulePermissions_45eventPackages | this_Permissions_45eventPages_8= rulePermissions_45eventPages | this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests | this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects | this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events | this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses ) )
            // InternalPermissionsOneOf1Parser.g:108:2: (this_Permissions_45eventActions_0= rulePermissions_45eventActions | this_Permissions_45eventChecks_1= rulePermissions_45eventChecks | this_Permissions_45eventContents_2= rulePermissions_45eventContents | this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments | this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions | this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token | this_Permissions_45eventIssues_6= rulePermissions_45eventIssues | this_Permissions_45eventPackages_7= rulePermissions_45eventPackages | this_Permissions_45eventPages_8= rulePermissions_45eventPages | this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests | this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects | this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events | this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses )
            {
            // InternalPermissionsOneOf1Parser.g:108:2: (this_Permissions_45eventActions_0= rulePermissions_45eventActions | this_Permissions_45eventChecks_1= rulePermissions_45eventChecks | this_Permissions_45eventContents_2= rulePermissions_45eventContents | this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments | this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions | this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token | this_Permissions_45eventIssues_6= rulePermissions_45eventIssues | this_Permissions_45eventPackages_7= rulePermissions_45eventPackages | this_Permissions_45eventPages_8= rulePermissions_45eventPages | this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests | this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects | this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events | this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses )
            int alt1=13;
            switch ( input.LA(1) ) {
            case Actions:
                {
                alt1=1;
                }
                break;
            case Checks:
                {
                alt1=2;
                }
                break;
            case Contents:
                {
                alt1=3;
                }
                break;
            case Deployments:
                {
                alt1=4;
                }
                break;
            case Discussions:
                {
                alt1=5;
                }
                break;
            case IdToken:
                {
                alt1=6;
                }
                break;
            case Issues:
                {
                alt1=7;
                }
                break;
            case Packages:
                {
                alt1=8;
                }
                break;
            case Pages:
                {
                alt1=9;
                }
                break;
            case PullRequests:
                {
                alt1=10;
                }
                break;
            case RepositoryProjects:
                {
                alt1=11;
                }
                break;
            case SecurityEvents:
                {
                alt1=12;
                }
                break;
            case Statuses:
                {
                alt1=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:109:3: this_Permissions_45eventActions_0= rulePermissions_45eventActions
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventActionsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventActions_0=rulePermissions_45eventActions();

                    state._fsp--;


                    			current = this_Permissions_45eventActions_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:118:3: this_Permissions_45eventChecks_1= rulePermissions_45eventChecks
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventChecksParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventChecks_1=rulePermissions_45eventChecks();

                    state._fsp--;


                    			current = this_Permissions_45eventChecks_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPermissionsOneOf1Parser.g:127:3: this_Permissions_45eventContents_2= rulePermissions_45eventContents
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventContentsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventContents_2=rulePermissions_45eventContents();

                    state._fsp--;


                    			current = this_Permissions_45eventContents_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPermissionsOneOf1Parser.g:136:3: this_Permissions_45eventDeployments_3= rulePermissions_45eventDeployments
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventDeploymentsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventDeployments_3=rulePermissions_45eventDeployments();

                    state._fsp--;


                    			current = this_Permissions_45eventDeployments_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPermissionsOneOf1Parser.g:145:3: this_Permissions_45eventDiscussions_4= rulePermissions_45eventDiscussions
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventDiscussionsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventDiscussions_4=rulePermissions_45eventDiscussions();

                    state._fsp--;


                    			current = this_Permissions_45eventDiscussions_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPermissionsOneOf1Parser.g:154:3: this_Permissions_45eventId_45token_5= rulePermissions_45eventId_45token
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventId_45tokenParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventId_45token_5=rulePermissions_45eventId_45token();

                    state._fsp--;


                    			current = this_Permissions_45eventId_45token_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPermissionsOneOf1Parser.g:163:3: this_Permissions_45eventIssues_6= rulePermissions_45eventIssues
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventIssuesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventIssues_6=rulePermissions_45eventIssues();

                    state._fsp--;


                    			current = this_Permissions_45eventIssues_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPermissionsOneOf1Parser.g:172:3: this_Permissions_45eventPackages_7= rulePermissions_45eventPackages
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPackagesParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventPackages_7=rulePermissions_45eventPackages();

                    state._fsp--;


                    			current = this_Permissions_45eventPackages_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalPermissionsOneOf1Parser.g:181:3: this_Permissions_45eventPages_8= rulePermissions_45eventPages
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPagesParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventPages_8=rulePermissions_45eventPages();

                    state._fsp--;


                    			current = this_Permissions_45eventPages_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalPermissionsOneOf1Parser.g:190:3: this_Permissions_45eventPull_45requests_9= rulePermissions_45eventPull_45requests
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPull_45requestsParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventPull_45requests_9=rulePermissions_45eventPull_45requests();

                    state._fsp--;


                    			current = this_Permissions_45eventPull_45requests_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalPermissionsOneOf1Parser.g:199:3: this_Permissions_45eventRepository_45projects_10= rulePermissions_45eventRepository_45projects
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventRepository_45projectsParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventRepository_45projects_10=rulePermissions_45eventRepository_45projects();

                    state._fsp--;


                    			current = this_Permissions_45eventRepository_45projects_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalPermissionsOneOf1Parser.g:208:3: this_Permissions_45eventSecurity_45events_11= rulePermissions_45eventSecurity_45events
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventSecurity_45eventsParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventSecurity_45events_11=rulePermissions_45eventSecurity_45events();

                    state._fsp--;


                    			current = this_Permissions_45eventSecurity_45events_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalPermissionsOneOf1Parser.g:217:3: this_Permissions_45eventStatuses_12= rulePermissions_45eventStatuses
                    {

                    			newCompositeNode(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventStatusesParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Permissions_45eventStatuses_12=rulePermissions_45eventStatuses();

                    state._fsp--;


                    			current = this_Permissions_45eventStatuses_12;
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
    // $ANTLR end "rulePermissions_45eventPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalPermissionsOneOf1Parser.g:229:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalPermissionsOneOf1Parser.g:229:46: (iv_ruleValue= ruleValue EOF )
            // InternalPermissionsOneOf1Parser.g:230:2: iv_ruleValue= ruleValue EOF
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
    // InternalPermissionsOneOf1Parser.g:236:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalPermissionsOneOf1Parser.g:242:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalPermissionsOneOf1Parser.g:243:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalPermissionsOneOf1Parser.g:243:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RepositoryProjects:
            case SecurityEvents:
            case PullRequests:
            case Deployments:
            case Discussions:
            case Contents:
            case IdToken:
            case Packages:
            case Statuses:
            case Actions:
            case Checks:
            case Issues:
            case Pages:
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
                    // InternalPermissionsOneOf1Parser.g:244:3: this_StringValue_0= ruleStringValue
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
                    // InternalPermissionsOneOf1Parser.g:253:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalPermissionsOneOf1Parser.g:262:3: this_NullValue_2= ruleNullValue
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
                    // InternalPermissionsOneOf1Parser.g:271:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalPermissionsOneOf1Parser.g:280:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalPermissionsOneOf1Parser.g:289:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRulePermissions_45event"
    // InternalPermissionsOneOf1Parser.g:301:1: entryRulePermissions_45event returns [EObject current=null] : iv_rulePermissions_45event= rulePermissions_45event EOF ;
    public final EObject entryRulePermissions_45event() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45event = null;


        try {
            // InternalPermissionsOneOf1Parser.g:301:60: (iv_rulePermissions_45event= rulePermissions_45event EOF )
            // InternalPermissionsOneOf1Parser.g:302:2: iv_rulePermissions_45event= rulePermissions_45event EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45event=rulePermissions_45event();

            state._fsp--;

             current =iv_rulePermissions_45event; 
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
    // $ANTLR end "entryRulePermissions_45event"


    // $ANTLR start "rulePermissions_45event"
    // InternalPermissionsOneOf1Parser.g:308:1: rulePermissions_45event returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject rulePermissions_45event() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_permissions_45event_2_0 = null;

        EObject lv_permissions_45event_4_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:314:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalPermissionsOneOf1Parser.g:315:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalPermissionsOneOf1Parser.g:315:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalPermissionsOneOf1Parser.g:316:3: () otherlv_1= LeftCurlyBracket ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalPermissionsOneOf1Parser.g:316:3: ()
            // InternalPermissionsOneOf1Parser.g:317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPermissions_45eventAccess().getPermissions_45eventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:327:3: ( ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RepositoryProjects && LA4_0<=Pages)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:328:4: ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )*
                    {
                    // InternalPermissionsOneOf1Parser.g:328:4: ( (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract ) )
                    // InternalPermissionsOneOf1Parser.g:329:5: (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract )
                    {
                    // InternalPermissionsOneOf1Parser.g:329:5: (lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract )
                    // InternalPermissionsOneOf1Parser.g:330:6: lv_permissions_45event_2_0= rulePermissions_45eventPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventPermissions_45eventPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_permissions_45event_2_0=rulePermissions_45eventPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPermissions_45eventRule());
                    						}
                    						add(
                    							current,
                    							"permissions_45event",
                    							lv_permissions_45event_2_0,
                    							"githubwf.githubwf.PermissionsOneOf1.Permissions_45eventPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPermissionsOneOf1Parser.g:347:4: (otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Comma) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPermissionsOneOf1Parser.g:348:5: otherlv_3= Comma ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPermissions_45eventAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalPermissionsOneOf1Parser.g:352:5: ( (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract ) )
                    	    // InternalPermissionsOneOf1Parser.g:353:6: (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract )
                    	    {
                    	    // InternalPermissionsOneOf1Parser.g:353:6: (lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract )
                    	    // InternalPermissionsOneOf1Parser.g:354:7: lv_permissions_45event_4_0= rulePermissions_45eventPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventPermissions_45eventPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_permissions_45event_4_0=rulePermissions_45eventPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPermissions_45eventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"permissions_45event",
                    	    								lv_permissions_45event_4_0,
                    	    								"githubwf.githubwf.PermissionsOneOf1.Permissions_45eventPropertiesAbstract");
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

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPermissions_45eventAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "rulePermissions_45event"


    // $ANTLR start "entryRulePermissions_45eventActions"
    // InternalPermissionsOneOf1Parser.g:381:1: entryRulePermissions_45eventActions returns [EObject current=null] : iv_rulePermissions_45eventActions= rulePermissions_45eventActions EOF ;
    public final EObject entryRulePermissions_45eventActions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventActions = null;


        try {
            // InternalPermissionsOneOf1Parser.g:381:67: (iv_rulePermissions_45eventActions= rulePermissions_45eventActions EOF )
            // InternalPermissionsOneOf1Parser.g:382:2: iv_rulePermissions_45eventActions= rulePermissions_45eventActions EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventActions=rulePermissions_45eventActions();

            state._fsp--;

             current =iv_rulePermissions_45eventActions; 
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
    // $ANTLR end "entryRulePermissions_45eventActions"


    // $ANTLR start "rulePermissions_45eventActions"
    // InternalPermissionsOneOf1Parser.g:388:1: rulePermissions_45eventActions returns [EObject current=null] : (otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:394:2: ( (otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:395:2: (otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:395:2: (otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:396:3: otherlv_0= Actions otherlv_1= Colon ( (lv_actions_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Actions,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventActionsAccess().getActionsKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventActionsAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:404:3: ( (lv_actions_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:405:4: (lv_actions_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:405:4: (lv_actions_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:406:5: lv_actions_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventActionsAccess().getActionsPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_actions_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventActionsRule());
            					}
            					set(
            						current,
            						"actions",
            						lv_actions_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventActions"


    // $ANTLR start "entryRulePermissions_45eventChecks"
    // InternalPermissionsOneOf1Parser.g:427:1: entryRulePermissions_45eventChecks returns [EObject current=null] : iv_rulePermissions_45eventChecks= rulePermissions_45eventChecks EOF ;
    public final EObject entryRulePermissions_45eventChecks() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventChecks = null;


        try {
            // InternalPermissionsOneOf1Parser.g:427:66: (iv_rulePermissions_45eventChecks= rulePermissions_45eventChecks EOF )
            // InternalPermissionsOneOf1Parser.g:428:2: iv_rulePermissions_45eventChecks= rulePermissions_45eventChecks EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventChecksRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventChecks=rulePermissions_45eventChecks();

            state._fsp--;

             current =iv_rulePermissions_45eventChecks; 
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
    // $ANTLR end "entryRulePermissions_45eventChecks"


    // $ANTLR start "rulePermissions_45eventChecks"
    // InternalPermissionsOneOf1Parser.g:434:1: rulePermissions_45eventChecks returns [EObject current=null] : (otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventChecks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_checks_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:440:2: ( (otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:441:2: (otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:441:2: (otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:442:3: otherlv_0= Checks otherlv_1= Colon ( (lv_checks_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Checks,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventChecksAccess().getChecksKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventChecksAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:450:3: ( (lv_checks_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:451:4: (lv_checks_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:451:4: (lv_checks_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:452:5: lv_checks_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventChecksAccess().getChecksPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_checks_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventChecksRule());
            					}
            					set(
            						current,
            						"checks",
            						lv_checks_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventChecks"


    // $ANTLR start "entryRulePermissions_45eventContents"
    // InternalPermissionsOneOf1Parser.g:473:1: entryRulePermissions_45eventContents returns [EObject current=null] : iv_rulePermissions_45eventContents= rulePermissions_45eventContents EOF ;
    public final EObject entryRulePermissions_45eventContents() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventContents = null;


        try {
            // InternalPermissionsOneOf1Parser.g:473:68: (iv_rulePermissions_45eventContents= rulePermissions_45eventContents EOF )
            // InternalPermissionsOneOf1Parser.g:474:2: iv_rulePermissions_45eventContents= rulePermissions_45eventContents EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventContentsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventContents=rulePermissions_45eventContents();

            state._fsp--;

             current =iv_rulePermissions_45eventContents; 
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
    // $ANTLR end "entryRulePermissions_45eventContents"


    // $ANTLR start "rulePermissions_45eventContents"
    // InternalPermissionsOneOf1Parser.g:480:1: rulePermissions_45eventContents returns [EObject current=null] : (otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventContents() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_contents_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:486:2: ( (otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:487:2: (otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:487:2: (otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:488:3: otherlv_0= Contents otherlv_1= Colon ( (lv_contents_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Contents,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventContentsAccess().getContentsKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventContentsAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:496:3: ( (lv_contents_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:497:4: (lv_contents_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:497:4: (lv_contents_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:498:5: lv_contents_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventContentsAccess().getContentsPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_contents_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventContentsRule());
            					}
            					set(
            						current,
            						"contents",
            						lv_contents_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventContents"


    // $ANTLR start "entryRulePermissions_45eventDeployments"
    // InternalPermissionsOneOf1Parser.g:519:1: entryRulePermissions_45eventDeployments returns [EObject current=null] : iv_rulePermissions_45eventDeployments= rulePermissions_45eventDeployments EOF ;
    public final EObject entryRulePermissions_45eventDeployments() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventDeployments = null;


        try {
            // InternalPermissionsOneOf1Parser.g:519:71: (iv_rulePermissions_45eventDeployments= rulePermissions_45eventDeployments EOF )
            // InternalPermissionsOneOf1Parser.g:520:2: iv_rulePermissions_45eventDeployments= rulePermissions_45eventDeployments EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventDeploymentsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventDeployments=rulePermissions_45eventDeployments();

            state._fsp--;

             current =iv_rulePermissions_45eventDeployments; 
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
    // $ANTLR end "entryRulePermissions_45eventDeployments"


    // $ANTLR start "rulePermissions_45eventDeployments"
    // InternalPermissionsOneOf1Parser.g:526:1: rulePermissions_45eventDeployments returns [EObject current=null] : (otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventDeployments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_deployments_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:532:2: ( (otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:533:2: (otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:533:2: (otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:534:3: otherlv_0= Deployments otherlv_1= Colon ( (lv_deployments_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Deployments,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventDeploymentsAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:542:3: ( (lv_deployments_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:543:4: (lv_deployments_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:543:4: (lv_deployments_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:544:5: lv_deployments_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_deployments_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventDeploymentsRule());
            					}
            					set(
            						current,
            						"deployments",
            						lv_deployments_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventDeployments"


    // $ANTLR start "entryRulePermissions_45eventDiscussions"
    // InternalPermissionsOneOf1Parser.g:565:1: entryRulePermissions_45eventDiscussions returns [EObject current=null] : iv_rulePermissions_45eventDiscussions= rulePermissions_45eventDiscussions EOF ;
    public final EObject entryRulePermissions_45eventDiscussions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventDiscussions = null;


        try {
            // InternalPermissionsOneOf1Parser.g:565:71: (iv_rulePermissions_45eventDiscussions= rulePermissions_45eventDiscussions EOF )
            // InternalPermissionsOneOf1Parser.g:566:2: iv_rulePermissions_45eventDiscussions= rulePermissions_45eventDiscussions EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventDiscussionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventDiscussions=rulePermissions_45eventDiscussions();

            state._fsp--;

             current =iv_rulePermissions_45eventDiscussions; 
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
    // $ANTLR end "entryRulePermissions_45eventDiscussions"


    // $ANTLR start "rulePermissions_45eventDiscussions"
    // InternalPermissionsOneOf1Parser.g:572:1: rulePermissions_45eventDiscussions returns [EObject current=null] : (otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventDiscussions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_discussions_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:578:2: ( (otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:579:2: (otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:579:2: (otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:580:3: otherlv_0= Discussions otherlv_1= Colon ( (lv_discussions_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Discussions,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventDiscussionsAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:588:3: ( (lv_discussions_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:589:4: (lv_discussions_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:589:4: (lv_discussions_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:590:5: lv_discussions_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_discussions_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventDiscussionsRule());
            					}
            					set(
            						current,
            						"discussions",
            						lv_discussions_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventDiscussions"


    // $ANTLR start "entryRulePermissions_45eventId_45token"
    // InternalPermissionsOneOf1Parser.g:611:1: entryRulePermissions_45eventId_45token returns [EObject current=null] : iv_rulePermissions_45eventId_45token= rulePermissions_45eventId_45token EOF ;
    public final EObject entryRulePermissions_45eventId_45token() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventId_45token = null;


        try {
            // InternalPermissionsOneOf1Parser.g:611:70: (iv_rulePermissions_45eventId_45token= rulePermissions_45eventId_45token EOF )
            // InternalPermissionsOneOf1Parser.g:612:2: iv_rulePermissions_45eventId_45token= rulePermissions_45eventId_45token EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventId_45tokenRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventId_45token=rulePermissions_45eventId_45token();

            state._fsp--;

             current =iv_rulePermissions_45eventId_45token; 
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
    // $ANTLR end "entryRulePermissions_45eventId_45token"


    // $ANTLR start "rulePermissions_45eventId_45token"
    // InternalPermissionsOneOf1Parser.g:618:1: rulePermissions_45eventId_45token returns [EObject current=null] : (otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventId_45token() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_id_45token_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:624:2: ( (otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:625:2: (otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:625:2: (otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:626:3: otherlv_0= IdToken otherlv_1= Colon ( (lv_id_45token_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,IdToken,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventId_45tokenAccess().getIdTokenKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventId_45tokenAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:634:3: ( (lv_id_45token_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:635:4: (lv_id_45token_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:635:4: (lv_id_45token_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:636:5: lv_id_45token_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventId_45tokenAccess().getId_45tokenPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_id_45token_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventId_45tokenRule());
            					}
            					set(
            						current,
            						"id_45token",
            						lv_id_45token_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventId_45token"


    // $ANTLR start "entryRulePermissions_45eventIssues"
    // InternalPermissionsOneOf1Parser.g:657:1: entryRulePermissions_45eventIssues returns [EObject current=null] : iv_rulePermissions_45eventIssues= rulePermissions_45eventIssues EOF ;
    public final EObject entryRulePermissions_45eventIssues() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventIssues = null;


        try {
            // InternalPermissionsOneOf1Parser.g:657:66: (iv_rulePermissions_45eventIssues= rulePermissions_45eventIssues EOF )
            // InternalPermissionsOneOf1Parser.g:658:2: iv_rulePermissions_45eventIssues= rulePermissions_45eventIssues EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventIssuesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventIssues=rulePermissions_45eventIssues();

            state._fsp--;

             current =iv_rulePermissions_45eventIssues; 
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
    // $ANTLR end "entryRulePermissions_45eventIssues"


    // $ANTLR start "rulePermissions_45eventIssues"
    // InternalPermissionsOneOf1Parser.g:664:1: rulePermissions_45eventIssues returns [EObject current=null] : (otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventIssues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_issues_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:670:2: ( (otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:671:2: (otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:671:2: (otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:672:3: otherlv_0= Issues otherlv_1= Colon ( (lv_issues_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Issues,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventIssuesAccess().getIssuesKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventIssuesAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:680:3: ( (lv_issues_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:681:4: (lv_issues_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:681:4: (lv_issues_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:682:5: lv_issues_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventIssuesAccess().getIssuesPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_issues_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventIssuesRule());
            					}
            					set(
            						current,
            						"issues",
            						lv_issues_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventIssues"


    // $ANTLR start "entryRulePermissions_45eventPackages"
    // InternalPermissionsOneOf1Parser.g:703:1: entryRulePermissions_45eventPackages returns [EObject current=null] : iv_rulePermissions_45eventPackages= rulePermissions_45eventPackages EOF ;
    public final EObject entryRulePermissions_45eventPackages() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventPackages = null;


        try {
            // InternalPermissionsOneOf1Parser.g:703:68: (iv_rulePermissions_45eventPackages= rulePermissions_45eventPackages EOF )
            // InternalPermissionsOneOf1Parser.g:704:2: iv_rulePermissions_45eventPackages= rulePermissions_45eventPackages EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventPackagesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventPackages=rulePermissions_45eventPackages();

            state._fsp--;

             current =iv_rulePermissions_45eventPackages; 
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
    // $ANTLR end "entryRulePermissions_45eventPackages"


    // $ANTLR start "rulePermissions_45eventPackages"
    // InternalPermissionsOneOf1Parser.g:710:1: rulePermissions_45eventPackages returns [EObject current=null] : (otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventPackages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_packages_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:716:2: ( (otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:717:2: (otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:717:2: (otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:718:3: otherlv_0= Packages otherlv_1= Colon ( (lv_packages_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Packages,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventPackagesAccess().getPackagesKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventPackagesAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:726:3: ( (lv_packages_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:727:4: (lv_packages_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:727:4: (lv_packages_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:728:5: lv_packages_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventPackagesAccess().getPackagesPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_packages_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventPackagesRule());
            					}
            					set(
            						current,
            						"packages",
            						lv_packages_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventPackages"


    // $ANTLR start "entryRulePermissions_45eventPages"
    // InternalPermissionsOneOf1Parser.g:749:1: entryRulePermissions_45eventPages returns [EObject current=null] : iv_rulePermissions_45eventPages= rulePermissions_45eventPages EOF ;
    public final EObject entryRulePermissions_45eventPages() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventPages = null;


        try {
            // InternalPermissionsOneOf1Parser.g:749:65: (iv_rulePermissions_45eventPages= rulePermissions_45eventPages EOF )
            // InternalPermissionsOneOf1Parser.g:750:2: iv_rulePermissions_45eventPages= rulePermissions_45eventPages EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventPagesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventPages=rulePermissions_45eventPages();

            state._fsp--;

             current =iv_rulePermissions_45eventPages; 
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
    // $ANTLR end "entryRulePermissions_45eventPages"


    // $ANTLR start "rulePermissions_45eventPages"
    // InternalPermissionsOneOf1Parser.g:756:1: rulePermissions_45eventPages returns [EObject current=null] : (otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventPages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pages_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:762:2: ( (otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:763:2: (otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:763:2: (otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:764:3: otherlv_0= Pages otherlv_1= Colon ( (lv_pages_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Pages,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventPagesAccess().getPagesKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventPagesAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:772:3: ( (lv_pages_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:773:4: (lv_pages_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:773:4: (lv_pages_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:774:5: lv_pages_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventPagesAccess().getPagesPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pages_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventPagesRule());
            					}
            					set(
            						current,
            						"pages",
            						lv_pages_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventPages"


    // $ANTLR start "entryRulePermissions_45eventPull_45requests"
    // InternalPermissionsOneOf1Parser.g:795:1: entryRulePermissions_45eventPull_45requests returns [EObject current=null] : iv_rulePermissions_45eventPull_45requests= rulePermissions_45eventPull_45requests EOF ;
    public final EObject entryRulePermissions_45eventPull_45requests() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventPull_45requests = null;


        try {
            // InternalPermissionsOneOf1Parser.g:795:75: (iv_rulePermissions_45eventPull_45requests= rulePermissions_45eventPull_45requests EOF )
            // InternalPermissionsOneOf1Parser.g:796:2: iv_rulePermissions_45eventPull_45requests= rulePermissions_45eventPull_45requests EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventPull_45requestsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventPull_45requests=rulePermissions_45eventPull_45requests();

            state._fsp--;

             current =iv_rulePermissions_45eventPull_45requests; 
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
    // $ANTLR end "entryRulePermissions_45eventPull_45requests"


    // $ANTLR start "rulePermissions_45eventPull_45requests"
    // InternalPermissionsOneOf1Parser.g:802:1: rulePermissions_45eventPull_45requests returns [EObject current=null] : (otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventPull_45requests() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pull_45requests_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:808:2: ( (otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:809:2: (otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:809:2: (otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:810:3: otherlv_0= PullRequests otherlv_1= Colon ( (lv_pull_45requests_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,PullRequests,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventPull_45requestsAccess().getPullRequestsKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventPull_45requestsAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:818:3: ( (lv_pull_45requests_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:819:4: (lv_pull_45requests_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:819:4: (lv_pull_45requests_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:820:5: lv_pull_45requests_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventPull_45requestsAccess().getPull_45requestsPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pull_45requests_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventPull_45requestsRule());
            					}
            					set(
            						current,
            						"pull_45requests",
            						lv_pull_45requests_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventPull_45requests"


    // $ANTLR start "entryRulePermissions_45eventRepository_45projects"
    // InternalPermissionsOneOf1Parser.g:841:1: entryRulePermissions_45eventRepository_45projects returns [EObject current=null] : iv_rulePermissions_45eventRepository_45projects= rulePermissions_45eventRepository_45projects EOF ;
    public final EObject entryRulePermissions_45eventRepository_45projects() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventRepository_45projects = null;


        try {
            // InternalPermissionsOneOf1Parser.g:841:81: (iv_rulePermissions_45eventRepository_45projects= rulePermissions_45eventRepository_45projects EOF )
            // InternalPermissionsOneOf1Parser.g:842:2: iv_rulePermissions_45eventRepository_45projects= rulePermissions_45eventRepository_45projects EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventRepository_45projectsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventRepository_45projects=rulePermissions_45eventRepository_45projects();

            state._fsp--;

             current =iv_rulePermissions_45eventRepository_45projects; 
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
    // $ANTLR end "entryRulePermissions_45eventRepository_45projects"


    // $ANTLR start "rulePermissions_45eventRepository_45projects"
    // InternalPermissionsOneOf1Parser.g:848:1: rulePermissions_45eventRepository_45projects returns [EObject current=null] : (otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventRepository_45projects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_repository_45projects_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:854:2: ( (otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:855:2: (otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:855:2: (otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:856:3: otherlv_0= RepositoryProjects otherlv_1= Colon ( (lv_repository_45projects_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,RepositoryProjects,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepositoryProjectsKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventRepository_45projectsAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:864:3: ( (lv_repository_45projects_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:865:4: (lv_repository_45projects_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:865:4: (lv_repository_45projects_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:866:5: lv_repository_45projects_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepository_45projectsPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_repository_45projects_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventRepository_45projectsRule());
            					}
            					set(
            						current,
            						"repository_45projects",
            						lv_repository_45projects_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventRepository_45projects"


    // $ANTLR start "entryRulePermissions_45eventSecurity_45events"
    // InternalPermissionsOneOf1Parser.g:887:1: entryRulePermissions_45eventSecurity_45events returns [EObject current=null] : iv_rulePermissions_45eventSecurity_45events= rulePermissions_45eventSecurity_45events EOF ;
    public final EObject entryRulePermissions_45eventSecurity_45events() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventSecurity_45events = null;


        try {
            // InternalPermissionsOneOf1Parser.g:887:77: (iv_rulePermissions_45eventSecurity_45events= rulePermissions_45eventSecurity_45events EOF )
            // InternalPermissionsOneOf1Parser.g:888:2: iv_rulePermissions_45eventSecurity_45events= rulePermissions_45eventSecurity_45events EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventSecurity_45eventsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventSecurity_45events=rulePermissions_45eventSecurity_45events();

            state._fsp--;

             current =iv_rulePermissions_45eventSecurity_45events; 
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
    // $ANTLR end "entryRulePermissions_45eventSecurity_45events"


    // $ANTLR start "rulePermissions_45eventSecurity_45events"
    // InternalPermissionsOneOf1Parser.g:894:1: rulePermissions_45eventSecurity_45events returns [EObject current=null] : (otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventSecurity_45events() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_security_45events_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:900:2: ( (otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:901:2: (otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:901:2: (otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:902:3: otherlv_0= SecurityEvents otherlv_1= Colon ( (lv_security_45events_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,SecurityEvents,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurityEventsKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:910:3: ( (lv_security_45events_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:911:4: (lv_security_45events_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:911:4: (lv_security_45events_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:912:5: lv_security_45events_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurity_45eventsPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_security_45events_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventSecurity_45eventsRule());
            					}
            					set(
            						current,
            						"security_45events",
            						lv_security_45events_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventSecurity_45events"


    // $ANTLR start "entryRulePermissions_45eventStatuses"
    // InternalPermissionsOneOf1Parser.g:933:1: entryRulePermissions_45eventStatuses returns [EObject current=null] : iv_rulePermissions_45eventStatuses= rulePermissions_45eventStatuses EOF ;
    public final EObject entryRulePermissions_45eventStatuses() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45eventStatuses = null;


        try {
            // InternalPermissionsOneOf1Parser.g:933:68: (iv_rulePermissions_45eventStatuses= rulePermissions_45eventStatuses EOF )
            // InternalPermissionsOneOf1Parser.g:934:2: iv_rulePermissions_45eventStatuses= rulePermissions_45eventStatuses EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45eventStatusesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45eventStatuses=rulePermissions_45eventStatuses();

            state._fsp--;

             current =iv_rulePermissions_45eventStatuses; 
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
    // $ANTLR end "entryRulePermissions_45eventStatuses"


    // $ANTLR start "rulePermissions_45eventStatuses"
    // InternalPermissionsOneOf1Parser.g:940:1: rulePermissions_45eventStatuses returns [EObject current=null] : (otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) ) ) ;
    public final EObject rulePermissions_45eventStatuses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_statuses_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:946:2: ( (otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) ) ) )
            // InternalPermissionsOneOf1Parser.g:947:2: (otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:947:2: (otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) ) )
            // InternalPermissionsOneOf1Parser.g:948:3: otherlv_0= Statuses otherlv_1= Colon ( (lv_statuses_2_0= rulePermissions_45level ) )
            {
            otherlv_0=(Token)match(input,Statuses,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPermissions_45eventStatusesAccess().getStatusesKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPermissions_45eventStatusesAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:956:3: ( (lv_statuses_2_0= rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:957:4: (lv_statuses_2_0= rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:957:4: (lv_statuses_2_0= rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:958:5: lv_statuses_2_0= rulePermissions_45level
            {

            					newCompositeNode(grammarAccess.getPermissions_45eventStatusesAccess().getStatusesPermissions_45levelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_statuses_2_0=rulePermissions_45level();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissions_45eventStatusesRule());
            					}
            					set(
            						current,
            						"statuses",
            						lv_statuses_2_0,
            						"githubwf.githubwf.PermissionsOneOf1.Permissions_45level");
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
    // $ANTLR end "rulePermissions_45eventStatuses"


    // $ANTLR start "entryRulePermissions_45level"
    // InternalPermissionsOneOf1Parser.g:979:1: entryRulePermissions_45level returns [EObject current=null] : iv_rulePermissions_45level= rulePermissions_45level EOF ;
    public final EObject entryRulePermissions_45level() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions_45level = null;


        try {
            // InternalPermissionsOneOf1Parser.g:979:60: (iv_rulePermissions_45level= rulePermissions_45level EOF )
            // InternalPermissionsOneOf1Parser.g:980:2: iv_rulePermissions_45level= rulePermissions_45level EOF
            {
             newCompositeNode(grammarAccess.getPermissions_45levelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions_45level=rulePermissions_45level();

            state._fsp--;

             current =iv_rulePermissions_45level; 
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
    // $ANTLR end "entryRulePermissions_45level"


    // $ANTLR start "rulePermissions_45level"
    // InternalPermissionsOneOf1Parser.g:986:1: rulePermissions_45level returns [EObject current=null] : ( (lv_permissions_45level_0_0= ruleJsonDocument ) ) ;
    public final EObject rulePermissions_45level() throws RecognitionException {
        EObject current = null;

        EObject lv_permissions_45level_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:992:2: ( ( (lv_permissions_45level_0_0= ruleJsonDocument ) ) )
            // InternalPermissionsOneOf1Parser.g:993:2: ( (lv_permissions_45level_0_0= ruleJsonDocument ) )
            {
            // InternalPermissionsOneOf1Parser.g:993:2: ( (lv_permissions_45level_0_0= ruleJsonDocument ) )
            // InternalPermissionsOneOf1Parser.g:994:3: (lv_permissions_45level_0_0= ruleJsonDocument )
            {
            // InternalPermissionsOneOf1Parser.g:994:3: (lv_permissions_45level_0_0= ruleJsonDocument )
            // InternalPermissionsOneOf1Parser.g:995:4: lv_permissions_45level_0_0= ruleJsonDocument
            {

            				newCompositeNode(grammarAccess.getPermissions_45levelAccess().getPermissions_45levelJsonDocumentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_permissions_45level_0_0=ruleJsonDocument();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPermissions_45levelRule());
            				}
            				set(
            					current,
            					"permissions_45level",
            					lv_permissions_45level_0_0,
            					"githubwf.githubwf.PermissionsOneOf1.JsonDocument");
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
    // $ANTLR end "rulePermissions_45level"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalPermissionsOneOf1Parser.g:1015:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1015:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalPermissionsOneOf1Parser.g:1016:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalPermissionsOneOf1Parser.g:1022:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1028:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalPermissionsOneOf1Parser.g:1029:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalPermissionsOneOf1Parser.g:1029:2: ( (lv_value_0_0= ruleValue ) )
            // InternalPermissionsOneOf1Parser.g:1030:3: (lv_value_0_0= ruleValue )
            {
            // InternalPermissionsOneOf1Parser.g:1030:3: (lv_value_0_0= ruleValue )
            // InternalPermissionsOneOf1Parser.g:1031:4: lv_value_0_0= ruleValue
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
            					"githubwf.githubwf.PermissionsOneOf1.Value");
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
    // InternalPermissionsOneOf1Parser.g:1051:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1051:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalPermissionsOneOf1Parser.g:1052:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalPermissionsOneOf1Parser.g:1058:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1064:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalPermissionsOneOf1Parser.g:1065:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalPermissionsOneOf1Parser.g:1065:2: ( (lv_value_0_0= ruleEString ) )
            // InternalPermissionsOneOf1Parser.g:1066:3: (lv_value_0_0= ruleEString )
            {
            // InternalPermissionsOneOf1Parser.g:1066:3: (lv_value_0_0= ruleEString )
            // InternalPermissionsOneOf1Parser.g:1067:4: lv_value_0_0= ruleEString
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
            					"githubwf.githubwf.PermissionsOneOf1.EString");
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
    // InternalPermissionsOneOf1Parser.g:1087:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1087:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalPermissionsOneOf1Parser.g:1088:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalPermissionsOneOf1Parser.g:1094:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1100:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalPermissionsOneOf1Parser.g:1101:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalPermissionsOneOf1Parser.g:1101:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalPermissionsOneOf1Parser.g:1102:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalPermissionsOneOf1Parser.g:1102:3: ()
            // InternalPermissionsOneOf1Parser.g:1103:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:1113:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RepositoryProjects && LA6_0<=True)||LA6_0==LeftSquareBracket||LA6_0==LeftCurlyBracket||(LA6_0>=RULE_STRING && LA6_0<=RULE_E_DOUBLE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1114:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalPermissionsOneOf1Parser.g:1114:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalPermissionsOneOf1Parser.g:1115:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalPermissionsOneOf1Parser.g:1115:5: (lv_value_2_0= ruleValue )
                    // InternalPermissionsOneOf1Parser.g:1116:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"githubwf.githubwf.PermissionsOneOf1.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPermissionsOneOf1Parser.g:1133:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPermissionsOneOf1Parser.g:1134:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalPermissionsOneOf1Parser.g:1138:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalPermissionsOneOf1Parser.g:1139:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalPermissionsOneOf1Parser.g:1139:6: (lv_value_4_0= ruleValue )
                    	    // InternalPermissionsOneOf1Parser.g:1140:7: lv_value_4_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_value_4_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_4_0,
                    	    								"githubwf.githubwf.PermissionsOneOf1.Value");
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
    // InternalPermissionsOneOf1Parser.g:1167:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1167:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalPermissionsOneOf1Parser.g:1168:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalPermissionsOneOf1Parser.g:1174:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1180:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalPermissionsOneOf1Parser.g:1181:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalPermissionsOneOf1Parser.g:1181:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalPermissionsOneOf1Parser.g:1182:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalPermissionsOneOf1Parser.g:1182:3: (lv_value_0_0= ruleNullEnum )
            // InternalPermissionsOneOf1Parser.g:1183:4: lv_value_0_0= ruleNullEnum
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
            					"githubwf.githubwf.PermissionsOneOf1.NullEnum");
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
    // InternalPermissionsOneOf1Parser.g:1203:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1203:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalPermissionsOneOf1Parser.g:1204:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalPermissionsOneOf1Parser.g:1210:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1216:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalPermissionsOneOf1Parser.g:1217:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalPermissionsOneOf1Parser.g:1217:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalPermissionsOneOf1Parser.g:1218:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalPermissionsOneOf1Parser.g:1218:3: (lv_value_0_0= ruleEDouble )
            // InternalPermissionsOneOf1Parser.g:1219:4: lv_value_0_0= ruleEDouble
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
            					"githubwf.githubwf.PermissionsOneOf1.EDouble");
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
    // InternalPermissionsOneOf1Parser.g:1239:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1239:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalPermissionsOneOf1Parser.g:1240:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalPermissionsOneOf1Parser.g:1246:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1252:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalPermissionsOneOf1Parser.g:1253:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalPermissionsOneOf1Parser.g:1253:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalPermissionsOneOf1Parser.g:1254:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalPermissionsOneOf1Parser.g:1254:3: ()
            // InternalPermissionsOneOf1Parser.g:1255:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:1265:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RepositoryProjects && LA8_0<=Pages)||LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1266:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalPermissionsOneOf1Parser.g:1266:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalPermissionsOneOf1Parser.g:1267:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalPermissionsOneOf1Parser.g:1267:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalPermissionsOneOf1Parser.g:1268:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {

                    						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_keyvaluepair_2_0=ruleKeyValuePair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    						}
                    						add(
                    							current,
                    							"keyvaluepair",
                    							lv_keyvaluepair_2_0,
                    							"githubwf.githubwf.PermissionsOneOf1.KeyValuePair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPermissionsOneOf1Parser.g:1285:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Comma) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPermissionsOneOf1Parser.g:1286:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalPermissionsOneOf1Parser.g:1290:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalPermissionsOneOf1Parser.g:1291:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalPermissionsOneOf1Parser.g:1291:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalPermissionsOneOf1Parser.g:1292:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_keyvaluepair_4_0=ruleKeyValuePair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"keyvaluepair",
                    	    								lv_keyvaluepair_4_0,
                    	    								"githubwf.githubwf.PermissionsOneOf1.KeyValuePair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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
    // InternalPermissionsOneOf1Parser.g:1319:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1319:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalPermissionsOneOf1Parser.g:1320:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalPermissionsOneOf1Parser.g:1326:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1332:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalPermissionsOneOf1Parser.g:1333:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalPermissionsOneOf1Parser.g:1333:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalPermissionsOneOf1Parser.g:1334:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalPermissionsOneOf1Parser.g:1334:3: (lv_value_0_0= ruleEBoolean )
            // InternalPermissionsOneOf1Parser.g:1335:4: lv_value_0_0= ruleEBoolean
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
            					"githubwf.githubwf.PermissionsOneOf1.EBoolean");
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
    // InternalPermissionsOneOf1Parser.g:1355:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1355:47: (iv_ruleEString= ruleEString EOF )
            // InternalPermissionsOneOf1Parser.g:1356:2: iv_ruleEString= ruleEString EOF
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
    // InternalPermissionsOneOf1Parser.g:1362:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1368:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalPermissionsOneOf1Parser.g:1369:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalPermissionsOneOf1Parser.g:1382:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1382:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalPermissionsOneOf1Parser.g:1383:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalPermissionsOneOf1Parser.g:1389:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1395:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalPermissionsOneOf1Parser.g:1396:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalPermissionsOneOf1Parser.g:1396:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_E_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_E_DOUBLE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1397:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:1405:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalPermissionsOneOf1Parser.g:1416:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1416:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalPermissionsOneOf1Parser.g:1417:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalPermissionsOneOf1Parser.g:1423:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1429:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalPermissionsOneOf1Parser.g:1430:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalPermissionsOneOf1Parser.g:1430:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalPermissionsOneOf1Parser.g:1431:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalPermissionsOneOf1Parser.g:1431:3: ( (lv_key_0_0= ruleEString ) )
            // InternalPermissionsOneOf1Parser.g:1432:4: (lv_key_0_0= ruleEString )
            {
            // InternalPermissionsOneOf1Parser.g:1432:4: (lv_key_0_0= ruleEString )
            // InternalPermissionsOneOf1Parser.g:1433:5: lv_key_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"githubwf.githubwf.PermissionsOneOf1.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalPermissionsOneOf1Parser.g:1454:3: ( (lv_value_2_0= ruleValue ) )
            // InternalPermissionsOneOf1Parser.g:1455:4: (lv_value_2_0= ruleValue )
            {
            // InternalPermissionsOneOf1Parser.g:1455:4: (lv_value_2_0= ruleValue )
            // InternalPermissionsOneOf1Parser.g:1456:5: lv_value_2_0= ruleValue
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
            						"githubwf.githubwf.PermissionsOneOf1.Value");
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
    // InternalPermissionsOneOf1Parser.g:1477:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1477:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalPermissionsOneOf1Parser.g:1478:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalPermissionsOneOf1Parser.g:1484:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1490:2: ( (kw= True | kw= False ) )
            // InternalPermissionsOneOf1Parser.g:1491:2: (kw= True | kw= False )
            {
            // InternalPermissionsOneOf1Parser.g:1491:2: (kw= True | kw= False )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==True) ) {
                alt10=1;
            }
            else if ( (LA10_0==False) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1492:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:1498:3: kw= False
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
    // InternalPermissionsOneOf1Parser.g:1507:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1507:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalPermissionsOneOf1Parser.g:1508:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalPermissionsOneOf1Parser.g:1514:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1520:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalPermissionsOneOf1Parser.g:1521:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalPermissionsOneOf1Parser.g:1521:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RepositoryProjects && LA11_0<=Pages)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1522:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:1530:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalPermissionsOneOf1Parser.g:1544:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalPermissionsOneOf1Parser.g:1544:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalPermissionsOneOf1Parser.g:1545:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalPermissionsOneOf1Parser.g:1551:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= RepositoryProjects | kw= Discussions | kw= IdToken | kw= Packages | kw= Issues | kw= Deployments | kw= Checks | kw= Pages | kw= SecurityEvents | kw= Contents | kw= Statuses | kw= Actions | kw= PullRequests ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1557:2: ( (kw= RepositoryProjects | kw= Discussions | kw= IdToken | kw= Packages | kw= Issues | kw= Deployments | kw= Checks | kw= Pages | kw= SecurityEvents | kw= Contents | kw= Statuses | kw= Actions | kw= PullRequests ) )
            // InternalPermissionsOneOf1Parser.g:1558:2: (kw= RepositoryProjects | kw= Discussions | kw= IdToken | kw= Packages | kw= Issues | kw= Deployments | kw= Checks | kw= Pages | kw= SecurityEvents | kw= Contents | kw= Statuses | kw= Actions | kw= PullRequests )
            {
            // InternalPermissionsOneOf1Parser.g:1558:2: (kw= RepositoryProjects | kw= Discussions | kw= IdToken | kw= Packages | kw= Issues | kw= Deployments | kw= Checks | kw= Pages | kw= SecurityEvents | kw= Contents | kw= Statuses | kw= Actions | kw= PullRequests )
            int alt12=13;
            switch ( input.LA(1) ) {
            case RepositoryProjects:
                {
                alt12=1;
                }
                break;
            case Discussions:
                {
                alt12=2;
                }
                break;
            case IdToken:
                {
                alt12=3;
                }
                break;
            case Packages:
                {
                alt12=4;
                }
                break;
            case Issues:
                {
                alt12=5;
                }
                break;
            case Deployments:
                {
                alt12=6;
                }
                break;
            case Checks:
                {
                alt12=7;
                }
                break;
            case Pages:
                {
                alt12=8;
                }
                break;
            case SecurityEvents:
                {
                alt12=9;
                }
                break;
            case Contents:
                {
                alt12=10;
                }
                break;
            case Statuses:
                {
                alt12=11;
                }
                break;
            case Actions:
                {
                alt12=12;
                }
                break;
            case PullRequests:
                {
                alt12=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1559:3: kw= RepositoryProjects
                    {
                    kw=(Token)match(input,RepositoryProjects,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRepositoryProjectsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:1565:3: kw= Discussions
                    {
                    kw=(Token)match(input,Discussions,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDiscussionsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPermissionsOneOf1Parser.g:1571:3: kw= IdToken
                    {
                    kw=(Token)match(input,IdToken,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIdTokenKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPermissionsOneOf1Parser.g:1577:3: kw= Packages
                    {
                    kw=(Token)match(input,Packages,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPackagesKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPermissionsOneOf1Parser.g:1583:3: kw= Issues
                    {
                    kw=(Token)match(input,Issues,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIssuesKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPermissionsOneOf1Parser.g:1589:3: kw= Deployments
                    {
                    kw=(Token)match(input,Deployments,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDeploymentsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPermissionsOneOf1Parser.g:1595:3: kw= Checks
                    {
                    kw=(Token)match(input,Checks,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getChecksKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalPermissionsOneOf1Parser.g:1601:3: kw= Pages
                    {
                    kw=(Token)match(input,Pages,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPagesKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalPermissionsOneOf1Parser.g:1607:3: kw= SecurityEvents
                    {
                    kw=(Token)match(input,SecurityEvents,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSecurityEventsKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalPermissionsOneOf1Parser.g:1613:3: kw= Contents
                    {
                    kw=(Token)match(input,Contents,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContentsKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalPermissionsOneOf1Parser.g:1619:3: kw= Statuses
                    {
                    kw=(Token)match(input,Statuses,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStatusesKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalPermissionsOneOf1Parser.g:1625:3: kw= Actions
                    {
                    kw=(Token)match(input,Actions,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionsKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalPermissionsOneOf1Parser.g:1631:3: kw= PullRequests
                    {
                    kw=(Token)match(input,PullRequests,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPullRequestsKeyword_12());
                    		

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
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleNullEnum"
    // InternalPermissionsOneOf1Parser.g:1640:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalPermissionsOneOf1Parser.g:1646:2: ( (enumLiteral_0= Null ) )
            // InternalPermissionsOneOf1Parser.g:1647:2: (enumLiteral_0= Null )
            {
            // InternalPermissionsOneOf1Parser.g:1647:2: (enumLiteral_0= Null )
            // InternalPermissionsOneOf1Parser.g:1648:3: enumLiteral_0= Null
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000201FFF0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000394FFFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000039CFFFF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000A01FFF0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000801FFF0L});

}
