package githubwf.githubwf.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import githubwf.githubwf.services.PermissionsOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPermissionsOneOf1Parser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Null", "'null'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("Pages", "'\"pages\"'");
    		tokenNameToValue.put("Checks", "'\"checks\"'");
    		tokenNameToValue.put("Issues", "'\"issues\"'");
    		tokenNameToValue.put("Actions", "'\"actions\"'");
    		tokenNameToValue.put("Contents", "'\"contents\"'");
    		tokenNameToValue.put("IdToken", "'\"id-token\"'");
    		tokenNameToValue.put("Packages", "'\"packages\"'");
    		tokenNameToValue.put("Statuses", "'\"statuses\"'");
    		tokenNameToValue.put("Deployments", "'\"deployments\"'");
    		tokenNameToValue.put("Discussions", "'\"discussions\"'");
    		tokenNameToValue.put("PullRequests", "'\"pull-requests\"'");
    		tokenNameToValue.put("SecurityEvents", "'\"security-events\"'");
    		tokenNameToValue.put("RepositoryProjects", "'\"repository-projects\"'");
    	}

    	public void setGrammarAccess(PermissionsOneOf1GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRulePermissionsOneOf1"
    // InternalPermissionsOneOf1Parser.g:77:1: entryRulePermissionsOneOf1 : rulePermissionsOneOf1 EOF ;
    public final void entryRulePermissionsOneOf1() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:78:1: ( rulePermissionsOneOf1 EOF )
            // InternalPermissionsOneOf1Parser.g:79:1: rulePermissionsOneOf1 EOF
            {
             before(grammarAccess.getPermissionsOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            rulePermissionsOneOf1();

            state._fsp--;

             after(grammarAccess.getPermissionsOneOf1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissionsOneOf1"


    // $ANTLR start "rulePermissionsOneOf1"
    // InternalPermissionsOneOf1Parser.g:86:1: rulePermissionsOneOf1 : ( ( rule__PermissionsOneOf1__PermissionsAssignment ) ) ;
    public final void rulePermissionsOneOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:90:2: ( ( ( rule__PermissionsOneOf1__PermissionsAssignment ) ) )
            // InternalPermissionsOneOf1Parser.g:91:2: ( ( rule__PermissionsOneOf1__PermissionsAssignment ) )
            {
            // InternalPermissionsOneOf1Parser.g:91:2: ( ( rule__PermissionsOneOf1__PermissionsAssignment ) )
            // InternalPermissionsOneOf1Parser.g:92:3: ( rule__PermissionsOneOf1__PermissionsAssignment )
            {
             before(grammarAccess.getPermissionsOneOf1Access().getPermissionsAssignment()); 
            // InternalPermissionsOneOf1Parser.g:93:3: ( rule__PermissionsOneOf1__PermissionsAssignment )
            // InternalPermissionsOneOf1Parser.g:93:4: rule__PermissionsOneOf1__PermissionsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PermissionsOneOf1__PermissionsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPermissionsOneOf1Access().getPermissionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissionsOneOf1"


    // $ANTLR start "entryRulePermissions_45eventPropertiesAbstract"
    // InternalPermissionsOneOf1Parser.g:102:1: entryRulePermissions_45eventPropertiesAbstract : rulePermissions_45eventPropertiesAbstract EOF ;
    public final void entryRulePermissions_45eventPropertiesAbstract() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:103:1: ( rulePermissions_45eventPropertiesAbstract EOF )
            // InternalPermissionsOneOf1Parser.g:104:1: rulePermissions_45eventPropertiesAbstract EOF
            {
             before(grammarAccess.getPermissions_45eventPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventPropertiesAbstractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventPropertiesAbstract"


    // $ANTLR start "rulePermissions_45eventPropertiesAbstract"
    // InternalPermissionsOneOf1Parser.g:111:1: rulePermissions_45eventPropertiesAbstract : ( ( rule__Permissions_45eventPropertiesAbstract__Alternatives ) ) ;
    public final void rulePermissions_45eventPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:115:2: ( ( ( rule__Permissions_45eventPropertiesAbstract__Alternatives ) ) )
            // InternalPermissionsOneOf1Parser.g:116:2: ( ( rule__Permissions_45eventPropertiesAbstract__Alternatives ) )
            {
            // InternalPermissionsOneOf1Parser.g:116:2: ( ( rule__Permissions_45eventPropertiesAbstract__Alternatives ) )
            // InternalPermissionsOneOf1Parser.g:117:3: ( rule__Permissions_45eventPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getAlternatives()); 
            // InternalPermissionsOneOf1Parser.g:118:3: ( rule__Permissions_45eventPropertiesAbstract__Alternatives )
            // InternalPermissionsOneOf1Parser.g:118:4: rule__Permissions_45eventPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalPermissionsOneOf1Parser.g:127:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:128:1: ( ruleValue EOF )
            // InternalPermissionsOneOf1Parser.g:129:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalPermissionsOneOf1Parser.g:136:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:140:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalPermissionsOneOf1Parser.g:141:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalPermissionsOneOf1Parser.g:141:2: ( ( rule__Value__Alternatives ) )
            // InternalPermissionsOneOf1Parser.g:142:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalPermissionsOneOf1Parser.g:143:3: ( rule__Value__Alternatives )
            // InternalPermissionsOneOf1Parser.g:143:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRulePermissions_45event"
    // InternalPermissionsOneOf1Parser.g:152:1: entryRulePermissions_45event : rulePermissions_45event EOF ;
    public final void entryRulePermissions_45event() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:153:1: ( rulePermissions_45event EOF )
            // InternalPermissionsOneOf1Parser.g:154:1: rulePermissions_45event EOF
            {
             before(grammarAccess.getPermissions_45eventRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45event();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45event"


    // $ANTLR start "rulePermissions_45event"
    // InternalPermissionsOneOf1Parser.g:161:1: rulePermissions_45event : ( ( rule__Permissions_45event__Group__0 ) ) ;
    public final void rulePermissions_45event() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:165:2: ( ( ( rule__Permissions_45event__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:166:2: ( ( rule__Permissions_45event__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:166:2: ( ( rule__Permissions_45event__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:167:3: ( rule__Permissions_45event__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:168:3: ( rule__Permissions_45event__Group__0 )
            // InternalPermissionsOneOf1Parser.g:168:4: rule__Permissions_45event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45event"


    // $ANTLR start "entryRulePermissions_45eventActions"
    // InternalPermissionsOneOf1Parser.g:177:1: entryRulePermissions_45eventActions : rulePermissions_45eventActions EOF ;
    public final void entryRulePermissions_45eventActions() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:178:1: ( rulePermissions_45eventActions EOF )
            // InternalPermissionsOneOf1Parser.g:179:1: rulePermissions_45eventActions EOF
            {
             before(grammarAccess.getPermissions_45eventActionsRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventActions();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventActionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventActions"


    // $ANTLR start "rulePermissions_45eventActions"
    // InternalPermissionsOneOf1Parser.g:186:1: rulePermissions_45eventActions : ( ( rule__Permissions_45eventActions__Group__0 ) ) ;
    public final void rulePermissions_45eventActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:190:2: ( ( ( rule__Permissions_45eventActions__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:191:2: ( ( rule__Permissions_45eventActions__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:191:2: ( ( rule__Permissions_45eventActions__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:192:3: ( rule__Permissions_45eventActions__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventActionsAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:193:3: ( rule__Permissions_45eventActions__Group__0 )
            // InternalPermissionsOneOf1Parser.g:193:4: rule__Permissions_45eventActions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventActions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventActionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventActions"


    // $ANTLR start "entryRulePermissions_45eventChecks"
    // InternalPermissionsOneOf1Parser.g:202:1: entryRulePermissions_45eventChecks : rulePermissions_45eventChecks EOF ;
    public final void entryRulePermissions_45eventChecks() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:203:1: ( rulePermissions_45eventChecks EOF )
            // InternalPermissionsOneOf1Parser.g:204:1: rulePermissions_45eventChecks EOF
            {
             before(grammarAccess.getPermissions_45eventChecksRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventChecks();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventChecksRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventChecks"


    // $ANTLR start "rulePermissions_45eventChecks"
    // InternalPermissionsOneOf1Parser.g:211:1: rulePermissions_45eventChecks : ( ( rule__Permissions_45eventChecks__Group__0 ) ) ;
    public final void rulePermissions_45eventChecks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:215:2: ( ( ( rule__Permissions_45eventChecks__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:216:2: ( ( rule__Permissions_45eventChecks__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:216:2: ( ( rule__Permissions_45eventChecks__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:217:3: ( rule__Permissions_45eventChecks__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventChecksAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:218:3: ( rule__Permissions_45eventChecks__Group__0 )
            // InternalPermissionsOneOf1Parser.g:218:4: rule__Permissions_45eventChecks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventChecks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventChecksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventChecks"


    // $ANTLR start "entryRulePermissions_45eventContents"
    // InternalPermissionsOneOf1Parser.g:227:1: entryRulePermissions_45eventContents : rulePermissions_45eventContents EOF ;
    public final void entryRulePermissions_45eventContents() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:228:1: ( rulePermissions_45eventContents EOF )
            // InternalPermissionsOneOf1Parser.g:229:1: rulePermissions_45eventContents EOF
            {
             before(grammarAccess.getPermissions_45eventContentsRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventContents();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventContentsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventContents"


    // $ANTLR start "rulePermissions_45eventContents"
    // InternalPermissionsOneOf1Parser.g:236:1: rulePermissions_45eventContents : ( ( rule__Permissions_45eventContents__Group__0 ) ) ;
    public final void rulePermissions_45eventContents() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:240:2: ( ( ( rule__Permissions_45eventContents__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:241:2: ( ( rule__Permissions_45eventContents__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:241:2: ( ( rule__Permissions_45eventContents__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:242:3: ( rule__Permissions_45eventContents__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventContentsAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:243:3: ( rule__Permissions_45eventContents__Group__0 )
            // InternalPermissionsOneOf1Parser.g:243:4: rule__Permissions_45eventContents__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventContents__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventContentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventContents"


    // $ANTLR start "entryRulePermissions_45eventDeployments"
    // InternalPermissionsOneOf1Parser.g:252:1: entryRulePermissions_45eventDeployments : rulePermissions_45eventDeployments EOF ;
    public final void entryRulePermissions_45eventDeployments() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:253:1: ( rulePermissions_45eventDeployments EOF )
            // InternalPermissionsOneOf1Parser.g:254:1: rulePermissions_45eventDeployments EOF
            {
             before(grammarAccess.getPermissions_45eventDeploymentsRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventDeployments();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventDeploymentsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventDeployments"


    // $ANTLR start "rulePermissions_45eventDeployments"
    // InternalPermissionsOneOf1Parser.g:261:1: rulePermissions_45eventDeployments : ( ( rule__Permissions_45eventDeployments__Group__0 ) ) ;
    public final void rulePermissions_45eventDeployments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:265:2: ( ( ( rule__Permissions_45eventDeployments__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:266:2: ( ( rule__Permissions_45eventDeployments__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:266:2: ( ( rule__Permissions_45eventDeployments__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:267:3: ( rule__Permissions_45eventDeployments__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventDeploymentsAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:268:3: ( rule__Permissions_45eventDeployments__Group__0 )
            // InternalPermissionsOneOf1Parser.g:268:4: rule__Permissions_45eventDeployments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDeployments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventDeploymentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventDeployments"


    // $ANTLR start "entryRulePermissions_45eventDiscussions"
    // InternalPermissionsOneOf1Parser.g:277:1: entryRulePermissions_45eventDiscussions : rulePermissions_45eventDiscussions EOF ;
    public final void entryRulePermissions_45eventDiscussions() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:278:1: ( rulePermissions_45eventDiscussions EOF )
            // InternalPermissionsOneOf1Parser.g:279:1: rulePermissions_45eventDiscussions EOF
            {
             before(grammarAccess.getPermissions_45eventDiscussionsRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventDiscussions();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventDiscussionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventDiscussions"


    // $ANTLR start "rulePermissions_45eventDiscussions"
    // InternalPermissionsOneOf1Parser.g:286:1: rulePermissions_45eventDiscussions : ( ( rule__Permissions_45eventDiscussions__Group__0 ) ) ;
    public final void rulePermissions_45eventDiscussions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:290:2: ( ( ( rule__Permissions_45eventDiscussions__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:291:2: ( ( rule__Permissions_45eventDiscussions__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:291:2: ( ( rule__Permissions_45eventDiscussions__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:292:3: ( rule__Permissions_45eventDiscussions__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventDiscussionsAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:293:3: ( rule__Permissions_45eventDiscussions__Group__0 )
            // InternalPermissionsOneOf1Parser.g:293:4: rule__Permissions_45eventDiscussions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDiscussions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventDiscussionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventDiscussions"


    // $ANTLR start "entryRulePermissions_45eventId_45token"
    // InternalPermissionsOneOf1Parser.g:302:1: entryRulePermissions_45eventId_45token : rulePermissions_45eventId_45token EOF ;
    public final void entryRulePermissions_45eventId_45token() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:303:1: ( rulePermissions_45eventId_45token EOF )
            // InternalPermissionsOneOf1Parser.g:304:1: rulePermissions_45eventId_45token EOF
            {
             before(grammarAccess.getPermissions_45eventId_45tokenRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventId_45token();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventId_45tokenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventId_45token"


    // $ANTLR start "rulePermissions_45eventId_45token"
    // InternalPermissionsOneOf1Parser.g:311:1: rulePermissions_45eventId_45token : ( ( rule__Permissions_45eventId_45token__Group__0 ) ) ;
    public final void rulePermissions_45eventId_45token() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:315:2: ( ( ( rule__Permissions_45eventId_45token__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:316:2: ( ( rule__Permissions_45eventId_45token__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:316:2: ( ( rule__Permissions_45eventId_45token__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:317:3: ( rule__Permissions_45eventId_45token__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventId_45tokenAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:318:3: ( rule__Permissions_45eventId_45token__Group__0 )
            // InternalPermissionsOneOf1Parser.g:318:4: rule__Permissions_45eventId_45token__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventId_45token__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventId_45tokenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventId_45token"


    // $ANTLR start "entryRulePermissions_45eventIssues"
    // InternalPermissionsOneOf1Parser.g:327:1: entryRulePermissions_45eventIssues : rulePermissions_45eventIssues EOF ;
    public final void entryRulePermissions_45eventIssues() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:328:1: ( rulePermissions_45eventIssues EOF )
            // InternalPermissionsOneOf1Parser.g:329:1: rulePermissions_45eventIssues EOF
            {
             before(grammarAccess.getPermissions_45eventIssuesRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventIssues();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventIssuesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventIssues"


    // $ANTLR start "rulePermissions_45eventIssues"
    // InternalPermissionsOneOf1Parser.g:336:1: rulePermissions_45eventIssues : ( ( rule__Permissions_45eventIssues__Group__0 ) ) ;
    public final void rulePermissions_45eventIssues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:340:2: ( ( ( rule__Permissions_45eventIssues__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:341:2: ( ( rule__Permissions_45eventIssues__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:341:2: ( ( rule__Permissions_45eventIssues__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:342:3: ( rule__Permissions_45eventIssues__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventIssuesAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:343:3: ( rule__Permissions_45eventIssues__Group__0 )
            // InternalPermissionsOneOf1Parser.g:343:4: rule__Permissions_45eventIssues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventIssues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventIssuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventIssues"


    // $ANTLR start "entryRulePermissions_45eventPackages"
    // InternalPermissionsOneOf1Parser.g:352:1: entryRulePermissions_45eventPackages : rulePermissions_45eventPackages EOF ;
    public final void entryRulePermissions_45eventPackages() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:353:1: ( rulePermissions_45eventPackages EOF )
            // InternalPermissionsOneOf1Parser.g:354:1: rulePermissions_45eventPackages EOF
            {
             before(grammarAccess.getPermissions_45eventPackagesRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventPackages();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventPackagesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventPackages"


    // $ANTLR start "rulePermissions_45eventPackages"
    // InternalPermissionsOneOf1Parser.g:361:1: rulePermissions_45eventPackages : ( ( rule__Permissions_45eventPackages__Group__0 ) ) ;
    public final void rulePermissions_45eventPackages() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:365:2: ( ( ( rule__Permissions_45eventPackages__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:366:2: ( ( rule__Permissions_45eventPackages__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:366:2: ( ( rule__Permissions_45eventPackages__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:367:3: ( rule__Permissions_45eventPackages__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventPackagesAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:368:3: ( rule__Permissions_45eventPackages__Group__0 )
            // InternalPermissionsOneOf1Parser.g:368:4: rule__Permissions_45eventPackages__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPackages__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventPackagesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventPackages"


    // $ANTLR start "entryRulePermissions_45eventPages"
    // InternalPermissionsOneOf1Parser.g:377:1: entryRulePermissions_45eventPages : rulePermissions_45eventPages EOF ;
    public final void entryRulePermissions_45eventPages() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:378:1: ( rulePermissions_45eventPages EOF )
            // InternalPermissionsOneOf1Parser.g:379:1: rulePermissions_45eventPages EOF
            {
             before(grammarAccess.getPermissions_45eventPagesRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventPages();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventPagesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventPages"


    // $ANTLR start "rulePermissions_45eventPages"
    // InternalPermissionsOneOf1Parser.g:386:1: rulePermissions_45eventPages : ( ( rule__Permissions_45eventPages__Group__0 ) ) ;
    public final void rulePermissions_45eventPages() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:390:2: ( ( ( rule__Permissions_45eventPages__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:391:2: ( ( rule__Permissions_45eventPages__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:391:2: ( ( rule__Permissions_45eventPages__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:392:3: ( rule__Permissions_45eventPages__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventPagesAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:393:3: ( rule__Permissions_45eventPages__Group__0 )
            // InternalPermissionsOneOf1Parser.g:393:4: rule__Permissions_45eventPages__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPages__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventPagesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventPages"


    // $ANTLR start "entryRulePermissions_45eventPull_45requests"
    // InternalPermissionsOneOf1Parser.g:402:1: entryRulePermissions_45eventPull_45requests : rulePermissions_45eventPull_45requests EOF ;
    public final void entryRulePermissions_45eventPull_45requests() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:403:1: ( rulePermissions_45eventPull_45requests EOF )
            // InternalPermissionsOneOf1Parser.g:404:1: rulePermissions_45eventPull_45requests EOF
            {
             before(grammarAccess.getPermissions_45eventPull_45requestsRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventPull_45requests();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventPull_45requestsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventPull_45requests"


    // $ANTLR start "rulePermissions_45eventPull_45requests"
    // InternalPermissionsOneOf1Parser.g:411:1: rulePermissions_45eventPull_45requests : ( ( rule__Permissions_45eventPull_45requests__Group__0 ) ) ;
    public final void rulePermissions_45eventPull_45requests() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:415:2: ( ( ( rule__Permissions_45eventPull_45requests__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:416:2: ( ( rule__Permissions_45eventPull_45requests__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:416:2: ( ( rule__Permissions_45eventPull_45requests__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:417:3: ( rule__Permissions_45eventPull_45requests__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventPull_45requestsAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:418:3: ( rule__Permissions_45eventPull_45requests__Group__0 )
            // InternalPermissionsOneOf1Parser.g:418:4: rule__Permissions_45eventPull_45requests__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPull_45requests__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventPull_45requestsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventPull_45requests"


    // $ANTLR start "entryRulePermissions_45eventRepository_45projects"
    // InternalPermissionsOneOf1Parser.g:427:1: entryRulePermissions_45eventRepository_45projects : rulePermissions_45eventRepository_45projects EOF ;
    public final void entryRulePermissions_45eventRepository_45projects() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:428:1: ( rulePermissions_45eventRepository_45projects EOF )
            // InternalPermissionsOneOf1Parser.g:429:1: rulePermissions_45eventRepository_45projects EOF
            {
             before(grammarAccess.getPermissions_45eventRepository_45projectsRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventRepository_45projects();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventRepository_45projectsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventRepository_45projects"


    // $ANTLR start "rulePermissions_45eventRepository_45projects"
    // InternalPermissionsOneOf1Parser.g:436:1: rulePermissions_45eventRepository_45projects : ( ( rule__Permissions_45eventRepository_45projects__Group__0 ) ) ;
    public final void rulePermissions_45eventRepository_45projects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:440:2: ( ( ( rule__Permissions_45eventRepository_45projects__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:441:2: ( ( rule__Permissions_45eventRepository_45projects__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:441:2: ( ( rule__Permissions_45eventRepository_45projects__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:442:3: ( rule__Permissions_45eventRepository_45projects__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:443:3: ( rule__Permissions_45eventRepository_45projects__Group__0 )
            // InternalPermissionsOneOf1Parser.g:443:4: rule__Permissions_45eventRepository_45projects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventRepository_45projects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventRepository_45projects"


    // $ANTLR start "entryRulePermissions_45eventSecurity_45events"
    // InternalPermissionsOneOf1Parser.g:452:1: entryRulePermissions_45eventSecurity_45events : rulePermissions_45eventSecurity_45events EOF ;
    public final void entryRulePermissions_45eventSecurity_45events() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:453:1: ( rulePermissions_45eventSecurity_45events EOF )
            // InternalPermissionsOneOf1Parser.g:454:1: rulePermissions_45eventSecurity_45events EOF
            {
             before(grammarAccess.getPermissions_45eventSecurity_45eventsRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventSecurity_45events();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventSecurity_45eventsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventSecurity_45events"


    // $ANTLR start "rulePermissions_45eventSecurity_45events"
    // InternalPermissionsOneOf1Parser.g:461:1: rulePermissions_45eventSecurity_45events : ( ( rule__Permissions_45eventSecurity_45events__Group__0 ) ) ;
    public final void rulePermissions_45eventSecurity_45events() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:465:2: ( ( ( rule__Permissions_45eventSecurity_45events__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:466:2: ( ( rule__Permissions_45eventSecurity_45events__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:466:2: ( ( rule__Permissions_45eventSecurity_45events__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:467:3: ( rule__Permissions_45eventSecurity_45events__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:468:3: ( rule__Permissions_45eventSecurity_45events__Group__0 )
            // InternalPermissionsOneOf1Parser.g:468:4: rule__Permissions_45eventSecurity_45events__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventSecurity_45events__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventSecurity_45events"


    // $ANTLR start "entryRulePermissions_45eventStatuses"
    // InternalPermissionsOneOf1Parser.g:477:1: entryRulePermissions_45eventStatuses : rulePermissions_45eventStatuses EOF ;
    public final void entryRulePermissions_45eventStatuses() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:478:1: ( rulePermissions_45eventStatuses EOF )
            // InternalPermissionsOneOf1Parser.g:479:1: rulePermissions_45eventStatuses EOF
            {
             before(grammarAccess.getPermissions_45eventStatusesRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45eventStatuses();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventStatusesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45eventStatuses"


    // $ANTLR start "rulePermissions_45eventStatuses"
    // InternalPermissionsOneOf1Parser.g:486:1: rulePermissions_45eventStatuses : ( ( rule__Permissions_45eventStatuses__Group__0 ) ) ;
    public final void rulePermissions_45eventStatuses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:490:2: ( ( ( rule__Permissions_45eventStatuses__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:491:2: ( ( rule__Permissions_45eventStatuses__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:491:2: ( ( rule__Permissions_45eventStatuses__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:492:3: ( rule__Permissions_45eventStatuses__Group__0 )
            {
             before(grammarAccess.getPermissions_45eventStatusesAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:493:3: ( rule__Permissions_45eventStatuses__Group__0 )
            // InternalPermissionsOneOf1Parser.g:493:4: rule__Permissions_45eventStatuses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventStatuses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventStatusesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45eventStatuses"


    // $ANTLR start "entryRulePermissions_45level"
    // InternalPermissionsOneOf1Parser.g:502:1: entryRulePermissions_45level : rulePermissions_45level EOF ;
    public final void entryRulePermissions_45level() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:503:1: ( rulePermissions_45level EOF )
            // InternalPermissionsOneOf1Parser.g:504:1: rulePermissions_45level EOF
            {
             before(grammarAccess.getPermissions_45levelRule()); 
            pushFollow(FOLLOW_1);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45levelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePermissions_45level"


    // $ANTLR start "rulePermissions_45level"
    // InternalPermissionsOneOf1Parser.g:511:1: rulePermissions_45level : ( ( rule__Permissions_45level__Permissions_45levelAssignment ) ) ;
    public final void rulePermissions_45level() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:515:2: ( ( ( rule__Permissions_45level__Permissions_45levelAssignment ) ) )
            // InternalPermissionsOneOf1Parser.g:516:2: ( ( rule__Permissions_45level__Permissions_45levelAssignment ) )
            {
            // InternalPermissionsOneOf1Parser.g:516:2: ( ( rule__Permissions_45level__Permissions_45levelAssignment ) )
            // InternalPermissionsOneOf1Parser.g:517:3: ( rule__Permissions_45level__Permissions_45levelAssignment )
            {
             before(grammarAccess.getPermissions_45levelAccess().getPermissions_45levelAssignment()); 
            // InternalPermissionsOneOf1Parser.g:518:3: ( rule__Permissions_45level__Permissions_45levelAssignment )
            // InternalPermissionsOneOf1Parser.g:518:4: rule__Permissions_45level__Permissions_45levelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45level__Permissions_45levelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45levelAccess().getPermissions_45levelAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePermissions_45level"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalPermissionsOneOf1Parser.g:527:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:528:1: ( ruleJsonDocument EOF )
            // InternalPermissionsOneOf1Parser.g:529:1: ruleJsonDocument EOF
            {
             before(grammarAccess.getJsonDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getJsonDocumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonDocument"


    // $ANTLR start "ruleJsonDocument"
    // InternalPermissionsOneOf1Parser.g:536:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:540:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalPermissionsOneOf1Parser.g:541:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalPermissionsOneOf1Parser.g:541:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalPermissionsOneOf1Parser.g:542:3: ( rule__JsonDocument__ValueAssignment )
            {
             before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            // InternalPermissionsOneOf1Parser.g:543:3: ( rule__JsonDocument__ValueAssignment )
            // InternalPermissionsOneOf1Parser.g:543:4: rule__JsonDocument__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonDocument__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonDocument"


    // $ANTLR start "entryRuleStringValue"
    // InternalPermissionsOneOf1Parser.g:552:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:553:1: ( ruleStringValue EOF )
            // InternalPermissionsOneOf1Parser.g:554:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalPermissionsOneOf1Parser.g:561:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:565:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalPermissionsOneOf1Parser.g:566:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalPermissionsOneOf1Parser.g:566:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalPermissionsOneOf1Parser.g:567:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalPermissionsOneOf1Parser.g:568:3: ( rule__StringValue__ValueAssignment )
            // InternalPermissionsOneOf1Parser.g:568:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalPermissionsOneOf1Parser.g:577:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:578:1: ( ruleArrayValue EOF )
            // InternalPermissionsOneOf1Parser.g:579:1: ruleArrayValue EOF
            {
             before(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayValue();

            state._fsp--;

             after(grammarAccess.getArrayValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalPermissionsOneOf1Parser.g:586:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:590:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:591:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:591:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:592:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:593:3: ( rule__ArrayValue__Group__0 )
            // InternalPermissionsOneOf1Parser.g:593:4: rule__ArrayValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalPermissionsOneOf1Parser.g:602:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:603:1: ( ruleNullValue EOF )
            // InternalPermissionsOneOf1Parser.g:604:1: ruleNullValue EOF
            {
             before(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNullValue();

            state._fsp--;

             after(grammarAccess.getNullValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalPermissionsOneOf1Parser.g:611:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:615:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalPermissionsOneOf1Parser.g:616:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalPermissionsOneOf1Parser.g:616:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalPermissionsOneOf1Parser.g:617:3: ( rule__NullValue__ValueAssignment )
            {
             before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            // InternalPermissionsOneOf1Parser.g:618:3: ( rule__NullValue__ValueAssignment )
            // InternalPermissionsOneOf1Parser.g:618:4: rule__NullValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NullValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNullValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalPermissionsOneOf1Parser.g:627:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:628:1: ( ruleNumberValue EOF )
            // InternalPermissionsOneOf1Parser.g:629:1: ruleNumberValue EOF
            {
             before(grammarAccess.getNumberValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;

             after(grammarAccess.getNumberValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalPermissionsOneOf1Parser.g:636:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:640:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalPermissionsOneOf1Parser.g:641:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalPermissionsOneOf1Parser.g:641:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalPermissionsOneOf1Parser.g:642:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalPermissionsOneOf1Parser.g:643:3: ( rule__NumberValue__ValueAssignment )
            // InternalPermissionsOneOf1Parser.g:643:4: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalPermissionsOneOf1Parser.g:652:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:653:1: ( ruleObjectValue EOF )
            // InternalPermissionsOneOf1Parser.g:654:1: ruleObjectValue EOF
            {
             before(grammarAccess.getObjectValueRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectValue();

            state._fsp--;

             after(grammarAccess.getObjectValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalPermissionsOneOf1Parser.g:661:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:665:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:666:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:666:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:667:3: ( rule__ObjectValue__Group__0 )
            {
             before(grammarAccess.getObjectValueAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:668:3: ( rule__ObjectValue__Group__0 )
            // InternalPermissionsOneOf1Parser.g:668:4: rule__ObjectValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalPermissionsOneOf1Parser.g:677:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:678:1: ( ruleBooleanValue EOF )
            // InternalPermissionsOneOf1Parser.g:679:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalPermissionsOneOf1Parser.g:686:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:690:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalPermissionsOneOf1Parser.g:691:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalPermissionsOneOf1Parser.g:691:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalPermissionsOneOf1Parser.g:692:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalPermissionsOneOf1Parser.g:693:3: ( rule__BooleanValue__ValueAssignment )
            // InternalPermissionsOneOf1Parser.g:693:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEString"
    // InternalPermissionsOneOf1Parser.g:702:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:703:1: ( ruleEString EOF )
            // InternalPermissionsOneOf1Parser.g:704:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPermissionsOneOf1Parser.g:711:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:715:2: ( ( ruleVALID_STRING ) )
            // InternalPermissionsOneOf1Parser.g:716:2: ( ruleVALID_STRING )
            {
            // InternalPermissionsOneOf1Parser.g:716:2: ( ruleVALID_STRING )
            // InternalPermissionsOneOf1Parser.g:717:3: ruleVALID_STRING
            {
             before(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleVALID_STRING();

            state._fsp--;

             after(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalPermissionsOneOf1Parser.g:727:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:728:1: ( ruleEDouble EOF )
            // InternalPermissionsOneOf1Parser.g:729:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalPermissionsOneOf1Parser.g:736:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:740:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalPermissionsOneOf1Parser.g:741:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalPermissionsOneOf1Parser.g:741:2: ( ( rule__EDouble__Alternatives ) )
            // InternalPermissionsOneOf1Parser.g:742:3: ( rule__EDouble__Alternatives )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            // InternalPermissionsOneOf1Parser.g:743:3: ( rule__EDouble__Alternatives )
            // InternalPermissionsOneOf1Parser.g:743:4: rule__EDouble__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalPermissionsOneOf1Parser.g:752:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:753:1: ( ruleKeyValuePair EOF )
            // InternalPermissionsOneOf1Parser.g:754:1: ruleKeyValuePair EOF
            {
             before(grammarAccess.getKeyValuePairRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyValuePair();

            state._fsp--;

             after(grammarAccess.getKeyValuePairRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // InternalPermissionsOneOf1Parser.g:761:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:765:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalPermissionsOneOf1Parser.g:766:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:766:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalPermissionsOneOf1Parser.g:767:3: ( rule__KeyValuePair__Group__0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            // InternalPermissionsOneOf1Parser.g:768:3: ( rule__KeyValuePair__Group__0 )
            // InternalPermissionsOneOf1Parser.g:768:4: rule__KeyValuePair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValuePairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleEBoolean"
    // InternalPermissionsOneOf1Parser.g:777:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:778:1: ( ruleEBoolean EOF )
            // InternalPermissionsOneOf1Parser.g:779:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalPermissionsOneOf1Parser.g:786:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:790:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalPermissionsOneOf1Parser.g:791:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalPermissionsOneOf1Parser.g:791:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalPermissionsOneOf1Parser.g:792:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalPermissionsOneOf1Parser.g:793:3: ( rule__EBoolean__Alternatives )
            // InternalPermissionsOneOf1Parser.g:793:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalPermissionsOneOf1Parser.g:802:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:803:1: ( ruleVALID_STRING EOF )
            // InternalPermissionsOneOf1Parser.g:804:1: ruleVALID_STRING EOF
            {
             before(grammarAccess.getVALID_STRINGRule()); 
            pushFollow(FOLLOW_1);
            ruleVALID_STRING();

            state._fsp--;

             after(grammarAccess.getVALID_STRINGRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVALID_STRING"


    // $ANTLR start "ruleVALID_STRING"
    // InternalPermissionsOneOf1Parser.g:811:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:815:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalPermissionsOneOf1Parser.g:816:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalPermissionsOneOf1Parser.g:816:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalPermissionsOneOf1Parser.g:817:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalPermissionsOneOf1Parser.g:818:3: ( rule__VALID_STRING__Alternatives )
            // InternalPermissionsOneOf1Parser.g:818:4: rule__VALID_STRING__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VALID_STRING__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalPermissionsOneOf1Parser.g:827:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalPermissionsOneOf1Parser.g:828:1: ( ruleKEYWORD EOF )
            // InternalPermissionsOneOf1Parser.g:829:1: ruleKEYWORD EOF
            {
             before(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;

             after(grammarAccess.getKEYWORDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalPermissionsOneOf1Parser.g:836:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:840:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalPermissionsOneOf1Parser.g:841:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalPermissionsOneOf1Parser.g:841:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalPermissionsOneOf1Parser.g:842:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalPermissionsOneOf1Parser.g:843:3: ( rule__KEYWORD__Alternatives )
            // InternalPermissionsOneOf1Parser.g:843:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKEYWORDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleNullEnum"
    // InternalPermissionsOneOf1Parser.g:852:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:856:1: ( ( ( Null ) ) )
            // InternalPermissionsOneOf1Parser.g:857:2: ( ( Null ) )
            {
            // InternalPermissionsOneOf1Parser.g:857:2: ( ( Null ) )
            // InternalPermissionsOneOf1Parser.g:858:3: ( Null )
            {
             before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            // InternalPermissionsOneOf1Parser.g:859:3: ( Null )
            // InternalPermissionsOneOf1Parser.g:859:4: Null
            {
            match(input,Null,FOLLOW_2); 

            }

             after(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullEnum"


    // $ANTLR start "rule__Permissions_45eventPropertiesAbstract__Alternatives"
    // InternalPermissionsOneOf1Parser.g:867:1: rule__Permissions_45eventPropertiesAbstract__Alternatives : ( ( rulePermissions_45eventActions ) | ( rulePermissions_45eventChecks ) | ( rulePermissions_45eventContents ) | ( rulePermissions_45eventDeployments ) | ( rulePermissions_45eventDiscussions ) | ( rulePermissions_45eventId_45token ) | ( rulePermissions_45eventIssues ) | ( rulePermissions_45eventPackages ) | ( rulePermissions_45eventPages ) | ( rulePermissions_45eventPull_45requests ) | ( rulePermissions_45eventRepository_45projects ) | ( rulePermissions_45eventSecurity_45events ) | ( rulePermissions_45eventStatuses ) );
    public final void rule__Permissions_45eventPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:871:1: ( ( rulePermissions_45eventActions ) | ( rulePermissions_45eventChecks ) | ( rulePermissions_45eventContents ) | ( rulePermissions_45eventDeployments ) | ( rulePermissions_45eventDiscussions ) | ( rulePermissions_45eventId_45token ) | ( rulePermissions_45eventIssues ) | ( rulePermissions_45eventPackages ) | ( rulePermissions_45eventPages ) | ( rulePermissions_45eventPull_45requests ) | ( rulePermissions_45eventRepository_45projects ) | ( rulePermissions_45eventSecurity_45events ) | ( rulePermissions_45eventStatuses ) )
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
                    // InternalPermissionsOneOf1Parser.g:872:2: ( rulePermissions_45eventActions )
                    {
                    // InternalPermissionsOneOf1Parser.g:872:2: ( rulePermissions_45eventActions )
                    // InternalPermissionsOneOf1Parser.g:873:3: rulePermissions_45eventActions
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventActionsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventActions();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventActionsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:878:2: ( rulePermissions_45eventChecks )
                    {
                    // InternalPermissionsOneOf1Parser.g:878:2: ( rulePermissions_45eventChecks )
                    // InternalPermissionsOneOf1Parser.g:879:3: rulePermissions_45eventChecks
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventChecksParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventChecks();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventChecksParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPermissionsOneOf1Parser.g:884:2: ( rulePermissions_45eventContents )
                    {
                    // InternalPermissionsOneOf1Parser.g:884:2: ( rulePermissions_45eventContents )
                    // InternalPermissionsOneOf1Parser.g:885:3: rulePermissions_45eventContents
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventContentsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventContents();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventContentsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPermissionsOneOf1Parser.g:890:2: ( rulePermissions_45eventDeployments )
                    {
                    // InternalPermissionsOneOf1Parser.g:890:2: ( rulePermissions_45eventDeployments )
                    // InternalPermissionsOneOf1Parser.g:891:3: rulePermissions_45eventDeployments
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventDeploymentsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventDeployments();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventDeploymentsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPermissionsOneOf1Parser.g:896:2: ( rulePermissions_45eventDiscussions )
                    {
                    // InternalPermissionsOneOf1Parser.g:896:2: ( rulePermissions_45eventDiscussions )
                    // InternalPermissionsOneOf1Parser.g:897:3: rulePermissions_45eventDiscussions
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventDiscussionsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventDiscussions();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventDiscussionsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPermissionsOneOf1Parser.g:902:2: ( rulePermissions_45eventId_45token )
                    {
                    // InternalPermissionsOneOf1Parser.g:902:2: ( rulePermissions_45eventId_45token )
                    // InternalPermissionsOneOf1Parser.g:903:3: rulePermissions_45eventId_45token
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventId_45tokenParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventId_45token();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventId_45tokenParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPermissionsOneOf1Parser.g:908:2: ( rulePermissions_45eventIssues )
                    {
                    // InternalPermissionsOneOf1Parser.g:908:2: ( rulePermissions_45eventIssues )
                    // InternalPermissionsOneOf1Parser.g:909:3: rulePermissions_45eventIssues
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventIssuesParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventIssues();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventIssuesParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPermissionsOneOf1Parser.g:914:2: ( rulePermissions_45eventPackages )
                    {
                    // InternalPermissionsOneOf1Parser.g:914:2: ( rulePermissions_45eventPackages )
                    // InternalPermissionsOneOf1Parser.g:915:3: rulePermissions_45eventPackages
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPackagesParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventPackages();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPackagesParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPermissionsOneOf1Parser.g:920:2: ( rulePermissions_45eventPages )
                    {
                    // InternalPermissionsOneOf1Parser.g:920:2: ( rulePermissions_45eventPages )
                    // InternalPermissionsOneOf1Parser.g:921:3: rulePermissions_45eventPages
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPagesParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventPages();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPagesParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalPermissionsOneOf1Parser.g:926:2: ( rulePermissions_45eventPull_45requests )
                    {
                    // InternalPermissionsOneOf1Parser.g:926:2: ( rulePermissions_45eventPull_45requests )
                    // InternalPermissionsOneOf1Parser.g:927:3: rulePermissions_45eventPull_45requests
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPull_45requestsParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventPull_45requests();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventPull_45requestsParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalPermissionsOneOf1Parser.g:932:2: ( rulePermissions_45eventRepository_45projects )
                    {
                    // InternalPermissionsOneOf1Parser.g:932:2: ( rulePermissions_45eventRepository_45projects )
                    // InternalPermissionsOneOf1Parser.g:933:3: rulePermissions_45eventRepository_45projects
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventRepository_45projectsParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventRepository_45projects();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventRepository_45projectsParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalPermissionsOneOf1Parser.g:938:2: ( rulePermissions_45eventSecurity_45events )
                    {
                    // InternalPermissionsOneOf1Parser.g:938:2: ( rulePermissions_45eventSecurity_45events )
                    // InternalPermissionsOneOf1Parser.g:939:3: rulePermissions_45eventSecurity_45events
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventSecurity_45eventsParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventSecurity_45events();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventSecurity_45eventsParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalPermissionsOneOf1Parser.g:944:2: ( rulePermissions_45eventStatuses )
                    {
                    // InternalPermissionsOneOf1Parser.g:944:2: ( rulePermissions_45eventStatuses )
                    // InternalPermissionsOneOf1Parser.g:945:3: rulePermissions_45eventStatuses
                    {
                     before(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventStatusesParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    rulePermissions_45eventStatuses();

                    state._fsp--;

                     after(grammarAccess.getPermissions_45eventPropertiesAbstractAccess().getPermissions_45eventStatusesParserRuleCall_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalPermissionsOneOf1Parser.g:954:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:958:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
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
                    // InternalPermissionsOneOf1Parser.g:959:2: ( ruleStringValue )
                    {
                    // InternalPermissionsOneOf1Parser.g:959:2: ( ruleStringValue )
                    // InternalPermissionsOneOf1Parser.g:960:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:965:2: ( ruleArrayValue )
                    {
                    // InternalPermissionsOneOf1Parser.g:965:2: ( ruleArrayValue )
                    // InternalPermissionsOneOf1Parser.g:966:3: ruleArrayValue
                    {
                     before(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPermissionsOneOf1Parser.g:971:2: ( ruleNullValue )
                    {
                    // InternalPermissionsOneOf1Parser.g:971:2: ( ruleNullValue )
                    // InternalPermissionsOneOf1Parser.g:972:3: ruleNullValue
                    {
                     before(grammarAccess.getValueAccess().getNullValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNullValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNullValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPermissionsOneOf1Parser.g:977:2: ( ruleNumberValue )
                    {
                    // InternalPermissionsOneOf1Parser.g:977:2: ( ruleNumberValue )
                    // InternalPermissionsOneOf1Parser.g:978:3: ruleNumberValue
                    {
                     before(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPermissionsOneOf1Parser.g:983:2: ( ruleObjectValue )
                    {
                    // InternalPermissionsOneOf1Parser.g:983:2: ( ruleObjectValue )
                    // InternalPermissionsOneOf1Parser.g:984:3: ruleObjectValue
                    {
                     before(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPermissionsOneOf1Parser.g:989:2: ( ruleBooleanValue )
                    {
                    // InternalPermissionsOneOf1Parser.g:989:2: ( ruleBooleanValue )
                    // InternalPermissionsOneOf1Parser.g:990:3: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives"
    // InternalPermissionsOneOf1Parser.g:999:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1003:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_E_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_E_DOUBLE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1004:2: ( RULE_E_INT )
                    {
                    // InternalPermissionsOneOf1Parser.g:1004:2: ( RULE_E_INT )
                    // InternalPermissionsOneOf1Parser.g:1005:3: RULE_E_INT
                    {
                     before(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 
                    match(input,RULE_E_INT,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:1010:2: ( RULE_E_DOUBLE )
                    {
                    // InternalPermissionsOneOf1Parser.g:1010:2: ( RULE_E_DOUBLE )
                    // InternalPermissionsOneOf1Parser.g:1011:3: RULE_E_DOUBLE
                    {
                     before(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); 
                    match(input,RULE_E_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalPermissionsOneOf1Parser.g:1020:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1024:1: ( ( True ) | ( False ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==True) ) {
                alt4=1;
            }
            else if ( (LA4_0==False) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1025:2: ( True )
                    {
                    // InternalPermissionsOneOf1Parser.g:1025:2: ( True )
                    // InternalPermissionsOneOf1Parser.g:1026:3: True
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:1031:2: ( False )
                    {
                    // InternalPermissionsOneOf1Parser.g:1031:2: ( False )
                    // InternalPermissionsOneOf1Parser.g:1032:3: False
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,False,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__VALID_STRING__Alternatives"
    // InternalPermissionsOneOf1Parser.g:1041:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1045:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RepositoryProjects && LA5_0<=Pages)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1046:2: ( RULE_STRING )
                    {
                    // InternalPermissionsOneOf1Parser.g:1046:2: ( RULE_STRING )
                    // InternalPermissionsOneOf1Parser.g:1047:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:1052:2: ( ruleKEYWORD )
                    {
                    // InternalPermissionsOneOf1Parser.g:1052:2: ( ruleKEYWORD )
                    // InternalPermissionsOneOf1Parser.g:1053:3: ruleKEYWORD
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKEYWORD();

                    state._fsp--;

                     after(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALID_STRING__Alternatives"


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalPermissionsOneOf1Parser.g:1062:1: rule__KEYWORD__Alternatives : ( ( RepositoryProjects ) | ( Discussions ) | ( IdToken ) | ( Packages ) | ( Issues ) | ( Deployments ) | ( Checks ) | ( Pages ) | ( SecurityEvents ) | ( Contents ) | ( Statuses ) | ( Actions ) | ( PullRequests ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1066:1: ( ( RepositoryProjects ) | ( Discussions ) | ( IdToken ) | ( Packages ) | ( Issues ) | ( Deployments ) | ( Checks ) | ( Pages ) | ( SecurityEvents ) | ( Contents ) | ( Statuses ) | ( Actions ) | ( PullRequests ) )
            int alt6=13;
            switch ( input.LA(1) ) {
            case RepositoryProjects:
                {
                alt6=1;
                }
                break;
            case Discussions:
                {
                alt6=2;
                }
                break;
            case IdToken:
                {
                alt6=3;
                }
                break;
            case Packages:
                {
                alt6=4;
                }
                break;
            case Issues:
                {
                alt6=5;
                }
                break;
            case Deployments:
                {
                alt6=6;
                }
                break;
            case Checks:
                {
                alt6=7;
                }
                break;
            case Pages:
                {
                alt6=8;
                }
                break;
            case SecurityEvents:
                {
                alt6=9;
                }
                break;
            case Contents:
                {
                alt6=10;
                }
                break;
            case Statuses:
                {
                alt6=11;
                }
                break;
            case Actions:
                {
                alt6=12;
                }
                break;
            case PullRequests:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1067:2: ( RepositoryProjects )
                    {
                    // InternalPermissionsOneOf1Parser.g:1067:2: ( RepositoryProjects )
                    // InternalPermissionsOneOf1Parser.g:1068:3: RepositoryProjects
                    {
                     before(grammarAccess.getKEYWORDAccess().getRepositoryProjectsKeyword_0()); 
                    match(input,RepositoryProjects,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getRepositoryProjectsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPermissionsOneOf1Parser.g:1073:2: ( Discussions )
                    {
                    // InternalPermissionsOneOf1Parser.g:1073:2: ( Discussions )
                    // InternalPermissionsOneOf1Parser.g:1074:3: Discussions
                    {
                     before(grammarAccess.getKEYWORDAccess().getDiscussionsKeyword_1()); 
                    match(input,Discussions,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDiscussionsKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPermissionsOneOf1Parser.g:1079:2: ( IdToken )
                    {
                    // InternalPermissionsOneOf1Parser.g:1079:2: ( IdToken )
                    // InternalPermissionsOneOf1Parser.g:1080:3: IdToken
                    {
                     before(grammarAccess.getKEYWORDAccess().getIdTokenKeyword_2()); 
                    match(input,IdToken,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getIdTokenKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPermissionsOneOf1Parser.g:1085:2: ( Packages )
                    {
                    // InternalPermissionsOneOf1Parser.g:1085:2: ( Packages )
                    // InternalPermissionsOneOf1Parser.g:1086:3: Packages
                    {
                     before(grammarAccess.getKEYWORDAccess().getPackagesKeyword_3()); 
                    match(input,Packages,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPackagesKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPermissionsOneOf1Parser.g:1091:2: ( Issues )
                    {
                    // InternalPermissionsOneOf1Parser.g:1091:2: ( Issues )
                    // InternalPermissionsOneOf1Parser.g:1092:3: Issues
                    {
                     before(grammarAccess.getKEYWORDAccess().getIssuesKeyword_4()); 
                    match(input,Issues,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getIssuesKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPermissionsOneOf1Parser.g:1097:2: ( Deployments )
                    {
                    // InternalPermissionsOneOf1Parser.g:1097:2: ( Deployments )
                    // InternalPermissionsOneOf1Parser.g:1098:3: Deployments
                    {
                     before(grammarAccess.getKEYWORDAccess().getDeploymentsKeyword_5()); 
                    match(input,Deployments,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDeploymentsKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPermissionsOneOf1Parser.g:1103:2: ( Checks )
                    {
                    // InternalPermissionsOneOf1Parser.g:1103:2: ( Checks )
                    // InternalPermissionsOneOf1Parser.g:1104:3: Checks
                    {
                     before(grammarAccess.getKEYWORDAccess().getChecksKeyword_6()); 
                    match(input,Checks,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getChecksKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPermissionsOneOf1Parser.g:1109:2: ( Pages )
                    {
                    // InternalPermissionsOneOf1Parser.g:1109:2: ( Pages )
                    // InternalPermissionsOneOf1Parser.g:1110:3: Pages
                    {
                     before(grammarAccess.getKEYWORDAccess().getPagesKeyword_7()); 
                    match(input,Pages,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPagesKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPermissionsOneOf1Parser.g:1115:2: ( SecurityEvents )
                    {
                    // InternalPermissionsOneOf1Parser.g:1115:2: ( SecurityEvents )
                    // InternalPermissionsOneOf1Parser.g:1116:3: SecurityEvents
                    {
                     before(grammarAccess.getKEYWORDAccess().getSecurityEventsKeyword_8()); 
                    match(input,SecurityEvents,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getSecurityEventsKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalPermissionsOneOf1Parser.g:1121:2: ( Contents )
                    {
                    // InternalPermissionsOneOf1Parser.g:1121:2: ( Contents )
                    // InternalPermissionsOneOf1Parser.g:1122:3: Contents
                    {
                     before(grammarAccess.getKEYWORDAccess().getContentsKeyword_9()); 
                    match(input,Contents,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getContentsKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalPermissionsOneOf1Parser.g:1127:2: ( Statuses )
                    {
                    // InternalPermissionsOneOf1Parser.g:1127:2: ( Statuses )
                    // InternalPermissionsOneOf1Parser.g:1128:3: Statuses
                    {
                     before(grammarAccess.getKEYWORDAccess().getStatusesKeyword_10()); 
                    match(input,Statuses,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getStatusesKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalPermissionsOneOf1Parser.g:1133:2: ( Actions )
                    {
                    // InternalPermissionsOneOf1Parser.g:1133:2: ( Actions )
                    // InternalPermissionsOneOf1Parser.g:1134:3: Actions
                    {
                     before(grammarAccess.getKEYWORDAccess().getActionsKeyword_11()); 
                    match(input,Actions,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getActionsKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalPermissionsOneOf1Parser.g:1139:2: ( PullRequests )
                    {
                    // InternalPermissionsOneOf1Parser.g:1139:2: ( PullRequests )
                    // InternalPermissionsOneOf1Parser.g:1140:3: PullRequests
                    {
                     before(grammarAccess.getKEYWORDAccess().getPullRequestsKeyword_12()); 
                    match(input,PullRequests,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPullRequestsKeyword_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__Permissions_45event__Group__0"
    // InternalPermissionsOneOf1Parser.g:1149:1: rule__Permissions_45event__Group__0 : rule__Permissions_45event__Group__0__Impl rule__Permissions_45event__Group__1 ;
    public final void rule__Permissions_45event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1153:1: ( rule__Permissions_45event__Group__0__Impl rule__Permissions_45event__Group__1 )
            // InternalPermissionsOneOf1Parser.g:1154:2: rule__Permissions_45event__Group__0__Impl rule__Permissions_45event__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Permissions_45event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group__0"


    // $ANTLR start "rule__Permissions_45event__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1161:1: rule__Permissions_45event__Group__0__Impl : ( () ) ;
    public final void rule__Permissions_45event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1165:1: ( ( () ) )
            // InternalPermissionsOneOf1Parser.g:1166:1: ( () )
            {
            // InternalPermissionsOneOf1Parser.g:1166:1: ( () )
            // InternalPermissionsOneOf1Parser.g:1167:2: ()
            {
             before(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventAction_0()); 
            // InternalPermissionsOneOf1Parser.g:1168:2: ()
            // InternalPermissionsOneOf1Parser.g:1168:3: 
            {
            }

             after(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45event__Group__1"
    // InternalPermissionsOneOf1Parser.g:1176:1: rule__Permissions_45event__Group__1 : rule__Permissions_45event__Group__1__Impl rule__Permissions_45event__Group__2 ;
    public final void rule__Permissions_45event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1180:1: ( rule__Permissions_45event__Group__1__Impl rule__Permissions_45event__Group__2 )
            // InternalPermissionsOneOf1Parser.g:1181:2: rule__Permissions_45event__Group__1__Impl rule__Permissions_45event__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Permissions_45event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group__1"


    // $ANTLR start "rule__Permissions_45event__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1188:1: rule__Permissions_45event__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Permissions_45event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1192:1: ( ( LeftCurlyBracket ) )
            // InternalPermissionsOneOf1Parser.g:1193:1: ( LeftCurlyBracket )
            {
            // InternalPermissionsOneOf1Parser.g:1193:1: ( LeftCurlyBracket )
            // InternalPermissionsOneOf1Parser.g:1194:2: LeftCurlyBracket
            {
             before(grammarAccess.getPermissions_45eventAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45event__Group__2"
    // InternalPermissionsOneOf1Parser.g:1203:1: rule__Permissions_45event__Group__2 : rule__Permissions_45event__Group__2__Impl rule__Permissions_45event__Group__3 ;
    public final void rule__Permissions_45event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1207:1: ( rule__Permissions_45event__Group__2__Impl rule__Permissions_45event__Group__3 )
            // InternalPermissionsOneOf1Parser.g:1208:2: rule__Permissions_45event__Group__2__Impl rule__Permissions_45event__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Permissions_45event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group__2"


    // $ANTLR start "rule__Permissions_45event__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:1215:1: rule__Permissions_45event__Group__2__Impl : ( ( rule__Permissions_45event__Group_2__0 )? ) ;
    public final void rule__Permissions_45event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1219:1: ( ( ( rule__Permissions_45event__Group_2__0 )? ) )
            // InternalPermissionsOneOf1Parser.g:1220:1: ( ( rule__Permissions_45event__Group_2__0 )? )
            {
            // InternalPermissionsOneOf1Parser.g:1220:1: ( ( rule__Permissions_45event__Group_2__0 )? )
            // InternalPermissionsOneOf1Parser.g:1221:2: ( rule__Permissions_45event__Group_2__0 )?
            {
             before(grammarAccess.getPermissions_45eventAccess().getGroup_2()); 
            // InternalPermissionsOneOf1Parser.g:1222:2: ( rule__Permissions_45event__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RepositoryProjects && LA7_0<=Pages)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:1222:3: rule__Permissions_45event__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Permissions_45event__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPermissions_45eventAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45event__Group__3"
    // InternalPermissionsOneOf1Parser.g:1230:1: rule__Permissions_45event__Group__3 : rule__Permissions_45event__Group__3__Impl ;
    public final void rule__Permissions_45event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1234:1: ( rule__Permissions_45event__Group__3__Impl )
            // InternalPermissionsOneOf1Parser.g:1235:2: rule__Permissions_45event__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group__3"


    // $ANTLR start "rule__Permissions_45event__Group__3__Impl"
    // InternalPermissionsOneOf1Parser.g:1241:1: rule__Permissions_45event__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Permissions_45event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1245:1: ( ( RightCurlyBracket ) )
            // InternalPermissionsOneOf1Parser.g:1246:1: ( RightCurlyBracket )
            {
            // InternalPermissionsOneOf1Parser.g:1246:1: ( RightCurlyBracket )
            // InternalPermissionsOneOf1Parser.g:1247:2: RightCurlyBracket
            {
             before(grammarAccess.getPermissions_45eventAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group__3__Impl"


    // $ANTLR start "rule__Permissions_45event__Group_2__0"
    // InternalPermissionsOneOf1Parser.g:1257:1: rule__Permissions_45event__Group_2__0 : rule__Permissions_45event__Group_2__0__Impl rule__Permissions_45event__Group_2__1 ;
    public final void rule__Permissions_45event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1261:1: ( rule__Permissions_45event__Group_2__0__Impl rule__Permissions_45event__Group_2__1 )
            // InternalPermissionsOneOf1Parser.g:1262:2: rule__Permissions_45event__Group_2__0__Impl rule__Permissions_45event__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Permissions_45event__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group_2__0"


    // $ANTLR start "rule__Permissions_45event__Group_2__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1269:1: rule__Permissions_45event__Group_2__0__Impl : ( ( rule__Permissions_45event__Permissions_45eventAssignment_2_0 ) ) ;
    public final void rule__Permissions_45event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1273:1: ( ( ( rule__Permissions_45event__Permissions_45eventAssignment_2_0 ) ) )
            // InternalPermissionsOneOf1Parser.g:1274:1: ( ( rule__Permissions_45event__Permissions_45eventAssignment_2_0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:1274:1: ( ( rule__Permissions_45event__Permissions_45eventAssignment_2_0 ) )
            // InternalPermissionsOneOf1Parser.g:1275:2: ( rule__Permissions_45event__Permissions_45eventAssignment_2_0 )
            {
             before(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventAssignment_2_0()); 
            // InternalPermissionsOneOf1Parser.g:1276:2: ( rule__Permissions_45event__Permissions_45eventAssignment_2_0 )
            // InternalPermissionsOneOf1Parser.g:1276:3: rule__Permissions_45event__Permissions_45eventAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Permissions_45eventAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group_2__0__Impl"


    // $ANTLR start "rule__Permissions_45event__Group_2__1"
    // InternalPermissionsOneOf1Parser.g:1284:1: rule__Permissions_45event__Group_2__1 : rule__Permissions_45event__Group_2__1__Impl ;
    public final void rule__Permissions_45event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1288:1: ( rule__Permissions_45event__Group_2__1__Impl )
            // InternalPermissionsOneOf1Parser.g:1289:2: rule__Permissions_45event__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group_2__1"


    // $ANTLR start "rule__Permissions_45event__Group_2__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1295:1: rule__Permissions_45event__Group_2__1__Impl : ( ( rule__Permissions_45event__Group_2_1__0 )* ) ;
    public final void rule__Permissions_45event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1299:1: ( ( ( rule__Permissions_45event__Group_2_1__0 )* ) )
            // InternalPermissionsOneOf1Parser.g:1300:1: ( ( rule__Permissions_45event__Group_2_1__0 )* )
            {
            // InternalPermissionsOneOf1Parser.g:1300:1: ( ( rule__Permissions_45event__Group_2_1__0 )* )
            // InternalPermissionsOneOf1Parser.g:1301:2: ( rule__Permissions_45event__Group_2_1__0 )*
            {
             before(grammarAccess.getPermissions_45eventAccess().getGroup_2_1()); 
            // InternalPermissionsOneOf1Parser.g:1302:2: ( rule__Permissions_45event__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPermissionsOneOf1Parser.g:1302:3: rule__Permissions_45event__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Permissions_45event__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPermissions_45eventAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group_2__1__Impl"


    // $ANTLR start "rule__Permissions_45event__Group_2_1__0"
    // InternalPermissionsOneOf1Parser.g:1311:1: rule__Permissions_45event__Group_2_1__0 : rule__Permissions_45event__Group_2_1__0__Impl rule__Permissions_45event__Group_2_1__1 ;
    public final void rule__Permissions_45event__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1315:1: ( rule__Permissions_45event__Group_2_1__0__Impl rule__Permissions_45event__Group_2_1__1 )
            // InternalPermissionsOneOf1Parser.g:1316:2: rule__Permissions_45event__Group_2_1__0__Impl rule__Permissions_45event__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Permissions_45event__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group_2_1__0"


    // $ANTLR start "rule__Permissions_45event__Group_2_1__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1323:1: rule__Permissions_45event__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__Permissions_45event__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1327:1: ( ( Comma ) )
            // InternalPermissionsOneOf1Parser.g:1328:1: ( Comma )
            {
            // InternalPermissionsOneOf1Parser.g:1328:1: ( Comma )
            // InternalPermissionsOneOf1Parser.g:1329:2: Comma
            {
             before(grammarAccess.getPermissions_45eventAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group_2_1__0__Impl"


    // $ANTLR start "rule__Permissions_45event__Group_2_1__1"
    // InternalPermissionsOneOf1Parser.g:1338:1: rule__Permissions_45event__Group_2_1__1 : rule__Permissions_45event__Group_2_1__1__Impl ;
    public final void rule__Permissions_45event__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1342:1: ( rule__Permissions_45event__Group_2_1__1__Impl )
            // InternalPermissionsOneOf1Parser.g:1343:2: rule__Permissions_45event__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group_2_1__1"


    // $ANTLR start "rule__Permissions_45event__Group_2_1__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1349:1: rule__Permissions_45event__Group_2_1__1__Impl : ( ( rule__Permissions_45event__Permissions_45eventAssignment_2_1_1 ) ) ;
    public final void rule__Permissions_45event__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1353:1: ( ( ( rule__Permissions_45event__Permissions_45eventAssignment_2_1_1 ) ) )
            // InternalPermissionsOneOf1Parser.g:1354:1: ( ( rule__Permissions_45event__Permissions_45eventAssignment_2_1_1 ) )
            {
            // InternalPermissionsOneOf1Parser.g:1354:1: ( ( rule__Permissions_45event__Permissions_45eventAssignment_2_1_1 ) )
            // InternalPermissionsOneOf1Parser.g:1355:2: ( rule__Permissions_45event__Permissions_45eventAssignment_2_1_1 )
            {
             before(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventAssignment_2_1_1()); 
            // InternalPermissionsOneOf1Parser.g:1356:2: ( rule__Permissions_45event__Permissions_45eventAssignment_2_1_1 )
            // InternalPermissionsOneOf1Parser.g:1356:3: rule__Permissions_45event__Permissions_45eventAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45event__Permissions_45eventAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Group_2_1__1__Impl"


    // $ANTLR start "rule__Permissions_45eventActions__Group__0"
    // InternalPermissionsOneOf1Parser.g:1365:1: rule__Permissions_45eventActions__Group__0 : rule__Permissions_45eventActions__Group__0__Impl rule__Permissions_45eventActions__Group__1 ;
    public final void rule__Permissions_45eventActions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1369:1: ( rule__Permissions_45eventActions__Group__0__Impl rule__Permissions_45eventActions__Group__1 )
            // InternalPermissionsOneOf1Parser.g:1370:2: rule__Permissions_45eventActions__Group__0__Impl rule__Permissions_45eventActions__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventActions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventActions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventActions__Group__0"


    // $ANTLR start "rule__Permissions_45eventActions__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1377:1: rule__Permissions_45eventActions__Group__0__Impl : ( Actions ) ;
    public final void rule__Permissions_45eventActions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1381:1: ( ( Actions ) )
            // InternalPermissionsOneOf1Parser.g:1382:1: ( Actions )
            {
            // InternalPermissionsOneOf1Parser.g:1382:1: ( Actions )
            // InternalPermissionsOneOf1Parser.g:1383:2: Actions
            {
             before(grammarAccess.getPermissions_45eventActionsAccess().getActionsKeyword_0()); 
            match(input,Actions,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventActionsAccess().getActionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventActions__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventActions__Group__1"
    // InternalPermissionsOneOf1Parser.g:1392:1: rule__Permissions_45eventActions__Group__1 : rule__Permissions_45eventActions__Group__1__Impl rule__Permissions_45eventActions__Group__2 ;
    public final void rule__Permissions_45eventActions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1396:1: ( rule__Permissions_45eventActions__Group__1__Impl rule__Permissions_45eventActions__Group__2 )
            // InternalPermissionsOneOf1Parser.g:1397:2: rule__Permissions_45eventActions__Group__1__Impl rule__Permissions_45eventActions__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventActions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventActions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventActions__Group__1"


    // $ANTLR start "rule__Permissions_45eventActions__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1404:1: rule__Permissions_45eventActions__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventActions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1408:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:1409:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:1409:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:1410:2: Colon
            {
             before(grammarAccess.getPermissions_45eventActionsAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventActionsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventActions__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventActions__Group__2"
    // InternalPermissionsOneOf1Parser.g:1419:1: rule__Permissions_45eventActions__Group__2 : rule__Permissions_45eventActions__Group__2__Impl ;
    public final void rule__Permissions_45eventActions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1423:1: ( rule__Permissions_45eventActions__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:1424:2: rule__Permissions_45eventActions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventActions__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventActions__Group__2"


    // $ANTLR start "rule__Permissions_45eventActions__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:1430:1: rule__Permissions_45eventActions__Group__2__Impl : ( ( rule__Permissions_45eventActions__ActionsAssignment_2 ) ) ;
    public final void rule__Permissions_45eventActions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1434:1: ( ( ( rule__Permissions_45eventActions__ActionsAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:1435:1: ( ( rule__Permissions_45eventActions__ActionsAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:1435:1: ( ( rule__Permissions_45eventActions__ActionsAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:1436:2: ( rule__Permissions_45eventActions__ActionsAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventActionsAccess().getActionsAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:1437:2: ( rule__Permissions_45eventActions__ActionsAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:1437:3: rule__Permissions_45eventActions__ActionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventActions__ActionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventActionsAccess().getActionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventActions__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventChecks__Group__0"
    // InternalPermissionsOneOf1Parser.g:1446:1: rule__Permissions_45eventChecks__Group__0 : rule__Permissions_45eventChecks__Group__0__Impl rule__Permissions_45eventChecks__Group__1 ;
    public final void rule__Permissions_45eventChecks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1450:1: ( rule__Permissions_45eventChecks__Group__0__Impl rule__Permissions_45eventChecks__Group__1 )
            // InternalPermissionsOneOf1Parser.g:1451:2: rule__Permissions_45eventChecks__Group__0__Impl rule__Permissions_45eventChecks__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventChecks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventChecks__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventChecks__Group__0"


    // $ANTLR start "rule__Permissions_45eventChecks__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1458:1: rule__Permissions_45eventChecks__Group__0__Impl : ( Checks ) ;
    public final void rule__Permissions_45eventChecks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1462:1: ( ( Checks ) )
            // InternalPermissionsOneOf1Parser.g:1463:1: ( Checks )
            {
            // InternalPermissionsOneOf1Parser.g:1463:1: ( Checks )
            // InternalPermissionsOneOf1Parser.g:1464:2: Checks
            {
             before(grammarAccess.getPermissions_45eventChecksAccess().getChecksKeyword_0()); 
            match(input,Checks,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventChecksAccess().getChecksKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventChecks__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventChecks__Group__1"
    // InternalPermissionsOneOf1Parser.g:1473:1: rule__Permissions_45eventChecks__Group__1 : rule__Permissions_45eventChecks__Group__1__Impl rule__Permissions_45eventChecks__Group__2 ;
    public final void rule__Permissions_45eventChecks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1477:1: ( rule__Permissions_45eventChecks__Group__1__Impl rule__Permissions_45eventChecks__Group__2 )
            // InternalPermissionsOneOf1Parser.g:1478:2: rule__Permissions_45eventChecks__Group__1__Impl rule__Permissions_45eventChecks__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventChecks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventChecks__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventChecks__Group__1"


    // $ANTLR start "rule__Permissions_45eventChecks__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1485:1: rule__Permissions_45eventChecks__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventChecks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1489:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:1490:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:1490:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:1491:2: Colon
            {
             before(grammarAccess.getPermissions_45eventChecksAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventChecksAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventChecks__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventChecks__Group__2"
    // InternalPermissionsOneOf1Parser.g:1500:1: rule__Permissions_45eventChecks__Group__2 : rule__Permissions_45eventChecks__Group__2__Impl ;
    public final void rule__Permissions_45eventChecks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1504:1: ( rule__Permissions_45eventChecks__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:1505:2: rule__Permissions_45eventChecks__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventChecks__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventChecks__Group__2"


    // $ANTLR start "rule__Permissions_45eventChecks__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:1511:1: rule__Permissions_45eventChecks__Group__2__Impl : ( ( rule__Permissions_45eventChecks__ChecksAssignment_2 ) ) ;
    public final void rule__Permissions_45eventChecks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1515:1: ( ( ( rule__Permissions_45eventChecks__ChecksAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:1516:1: ( ( rule__Permissions_45eventChecks__ChecksAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:1516:1: ( ( rule__Permissions_45eventChecks__ChecksAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:1517:2: ( rule__Permissions_45eventChecks__ChecksAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventChecksAccess().getChecksAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:1518:2: ( rule__Permissions_45eventChecks__ChecksAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:1518:3: rule__Permissions_45eventChecks__ChecksAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventChecks__ChecksAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventChecksAccess().getChecksAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventChecks__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventContents__Group__0"
    // InternalPermissionsOneOf1Parser.g:1527:1: rule__Permissions_45eventContents__Group__0 : rule__Permissions_45eventContents__Group__0__Impl rule__Permissions_45eventContents__Group__1 ;
    public final void rule__Permissions_45eventContents__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1531:1: ( rule__Permissions_45eventContents__Group__0__Impl rule__Permissions_45eventContents__Group__1 )
            // InternalPermissionsOneOf1Parser.g:1532:2: rule__Permissions_45eventContents__Group__0__Impl rule__Permissions_45eventContents__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventContents__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventContents__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventContents__Group__0"


    // $ANTLR start "rule__Permissions_45eventContents__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1539:1: rule__Permissions_45eventContents__Group__0__Impl : ( Contents ) ;
    public final void rule__Permissions_45eventContents__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1543:1: ( ( Contents ) )
            // InternalPermissionsOneOf1Parser.g:1544:1: ( Contents )
            {
            // InternalPermissionsOneOf1Parser.g:1544:1: ( Contents )
            // InternalPermissionsOneOf1Parser.g:1545:2: Contents
            {
             before(grammarAccess.getPermissions_45eventContentsAccess().getContentsKeyword_0()); 
            match(input,Contents,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventContentsAccess().getContentsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventContents__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventContents__Group__1"
    // InternalPermissionsOneOf1Parser.g:1554:1: rule__Permissions_45eventContents__Group__1 : rule__Permissions_45eventContents__Group__1__Impl rule__Permissions_45eventContents__Group__2 ;
    public final void rule__Permissions_45eventContents__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1558:1: ( rule__Permissions_45eventContents__Group__1__Impl rule__Permissions_45eventContents__Group__2 )
            // InternalPermissionsOneOf1Parser.g:1559:2: rule__Permissions_45eventContents__Group__1__Impl rule__Permissions_45eventContents__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventContents__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventContents__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventContents__Group__1"


    // $ANTLR start "rule__Permissions_45eventContents__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1566:1: rule__Permissions_45eventContents__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventContents__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1570:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:1571:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:1571:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:1572:2: Colon
            {
             before(grammarAccess.getPermissions_45eventContentsAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventContentsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventContents__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventContents__Group__2"
    // InternalPermissionsOneOf1Parser.g:1581:1: rule__Permissions_45eventContents__Group__2 : rule__Permissions_45eventContents__Group__2__Impl ;
    public final void rule__Permissions_45eventContents__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1585:1: ( rule__Permissions_45eventContents__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:1586:2: rule__Permissions_45eventContents__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventContents__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventContents__Group__2"


    // $ANTLR start "rule__Permissions_45eventContents__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:1592:1: rule__Permissions_45eventContents__Group__2__Impl : ( ( rule__Permissions_45eventContents__ContentsAssignment_2 ) ) ;
    public final void rule__Permissions_45eventContents__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1596:1: ( ( ( rule__Permissions_45eventContents__ContentsAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:1597:1: ( ( rule__Permissions_45eventContents__ContentsAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:1597:1: ( ( rule__Permissions_45eventContents__ContentsAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:1598:2: ( rule__Permissions_45eventContents__ContentsAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventContentsAccess().getContentsAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:1599:2: ( rule__Permissions_45eventContents__ContentsAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:1599:3: rule__Permissions_45eventContents__ContentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventContents__ContentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventContentsAccess().getContentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventContents__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventDeployments__Group__0"
    // InternalPermissionsOneOf1Parser.g:1608:1: rule__Permissions_45eventDeployments__Group__0 : rule__Permissions_45eventDeployments__Group__0__Impl rule__Permissions_45eventDeployments__Group__1 ;
    public final void rule__Permissions_45eventDeployments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1612:1: ( rule__Permissions_45eventDeployments__Group__0__Impl rule__Permissions_45eventDeployments__Group__1 )
            // InternalPermissionsOneOf1Parser.g:1613:2: rule__Permissions_45eventDeployments__Group__0__Impl rule__Permissions_45eventDeployments__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventDeployments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDeployments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDeployments__Group__0"


    // $ANTLR start "rule__Permissions_45eventDeployments__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1620:1: rule__Permissions_45eventDeployments__Group__0__Impl : ( Deployments ) ;
    public final void rule__Permissions_45eventDeployments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1624:1: ( ( Deployments ) )
            // InternalPermissionsOneOf1Parser.g:1625:1: ( Deployments )
            {
            // InternalPermissionsOneOf1Parser.g:1625:1: ( Deployments )
            // InternalPermissionsOneOf1Parser.g:1626:2: Deployments
            {
             before(grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsKeyword_0()); 
            match(input,Deployments,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDeployments__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventDeployments__Group__1"
    // InternalPermissionsOneOf1Parser.g:1635:1: rule__Permissions_45eventDeployments__Group__1 : rule__Permissions_45eventDeployments__Group__1__Impl rule__Permissions_45eventDeployments__Group__2 ;
    public final void rule__Permissions_45eventDeployments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1639:1: ( rule__Permissions_45eventDeployments__Group__1__Impl rule__Permissions_45eventDeployments__Group__2 )
            // InternalPermissionsOneOf1Parser.g:1640:2: rule__Permissions_45eventDeployments__Group__1__Impl rule__Permissions_45eventDeployments__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventDeployments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDeployments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDeployments__Group__1"


    // $ANTLR start "rule__Permissions_45eventDeployments__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1647:1: rule__Permissions_45eventDeployments__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventDeployments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1651:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:1652:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:1652:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:1653:2: Colon
            {
             before(grammarAccess.getPermissions_45eventDeploymentsAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventDeploymentsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDeployments__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventDeployments__Group__2"
    // InternalPermissionsOneOf1Parser.g:1662:1: rule__Permissions_45eventDeployments__Group__2 : rule__Permissions_45eventDeployments__Group__2__Impl ;
    public final void rule__Permissions_45eventDeployments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1666:1: ( rule__Permissions_45eventDeployments__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:1667:2: rule__Permissions_45eventDeployments__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDeployments__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDeployments__Group__2"


    // $ANTLR start "rule__Permissions_45eventDeployments__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:1673:1: rule__Permissions_45eventDeployments__Group__2__Impl : ( ( rule__Permissions_45eventDeployments__DeploymentsAssignment_2 ) ) ;
    public final void rule__Permissions_45eventDeployments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1677:1: ( ( ( rule__Permissions_45eventDeployments__DeploymentsAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:1678:1: ( ( rule__Permissions_45eventDeployments__DeploymentsAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:1678:1: ( ( rule__Permissions_45eventDeployments__DeploymentsAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:1679:2: ( rule__Permissions_45eventDeployments__DeploymentsAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:1680:2: ( rule__Permissions_45eventDeployments__DeploymentsAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:1680:3: rule__Permissions_45eventDeployments__DeploymentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDeployments__DeploymentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDeployments__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventDiscussions__Group__0"
    // InternalPermissionsOneOf1Parser.g:1689:1: rule__Permissions_45eventDiscussions__Group__0 : rule__Permissions_45eventDiscussions__Group__0__Impl rule__Permissions_45eventDiscussions__Group__1 ;
    public final void rule__Permissions_45eventDiscussions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1693:1: ( rule__Permissions_45eventDiscussions__Group__0__Impl rule__Permissions_45eventDiscussions__Group__1 )
            // InternalPermissionsOneOf1Parser.g:1694:2: rule__Permissions_45eventDiscussions__Group__0__Impl rule__Permissions_45eventDiscussions__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventDiscussions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDiscussions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDiscussions__Group__0"


    // $ANTLR start "rule__Permissions_45eventDiscussions__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1701:1: rule__Permissions_45eventDiscussions__Group__0__Impl : ( Discussions ) ;
    public final void rule__Permissions_45eventDiscussions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1705:1: ( ( Discussions ) )
            // InternalPermissionsOneOf1Parser.g:1706:1: ( Discussions )
            {
            // InternalPermissionsOneOf1Parser.g:1706:1: ( Discussions )
            // InternalPermissionsOneOf1Parser.g:1707:2: Discussions
            {
             before(grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsKeyword_0()); 
            match(input,Discussions,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDiscussions__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventDiscussions__Group__1"
    // InternalPermissionsOneOf1Parser.g:1716:1: rule__Permissions_45eventDiscussions__Group__1 : rule__Permissions_45eventDiscussions__Group__1__Impl rule__Permissions_45eventDiscussions__Group__2 ;
    public final void rule__Permissions_45eventDiscussions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1720:1: ( rule__Permissions_45eventDiscussions__Group__1__Impl rule__Permissions_45eventDiscussions__Group__2 )
            // InternalPermissionsOneOf1Parser.g:1721:2: rule__Permissions_45eventDiscussions__Group__1__Impl rule__Permissions_45eventDiscussions__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventDiscussions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDiscussions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDiscussions__Group__1"


    // $ANTLR start "rule__Permissions_45eventDiscussions__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1728:1: rule__Permissions_45eventDiscussions__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventDiscussions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1732:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:1733:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:1733:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:1734:2: Colon
            {
             before(grammarAccess.getPermissions_45eventDiscussionsAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventDiscussionsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDiscussions__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventDiscussions__Group__2"
    // InternalPermissionsOneOf1Parser.g:1743:1: rule__Permissions_45eventDiscussions__Group__2 : rule__Permissions_45eventDiscussions__Group__2__Impl ;
    public final void rule__Permissions_45eventDiscussions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1747:1: ( rule__Permissions_45eventDiscussions__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:1748:2: rule__Permissions_45eventDiscussions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDiscussions__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDiscussions__Group__2"


    // $ANTLR start "rule__Permissions_45eventDiscussions__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:1754:1: rule__Permissions_45eventDiscussions__Group__2__Impl : ( ( rule__Permissions_45eventDiscussions__DiscussionsAssignment_2 ) ) ;
    public final void rule__Permissions_45eventDiscussions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1758:1: ( ( ( rule__Permissions_45eventDiscussions__DiscussionsAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:1759:1: ( ( rule__Permissions_45eventDiscussions__DiscussionsAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:1759:1: ( ( rule__Permissions_45eventDiscussions__DiscussionsAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:1760:2: ( rule__Permissions_45eventDiscussions__DiscussionsAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:1761:2: ( rule__Permissions_45eventDiscussions__DiscussionsAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:1761:3: rule__Permissions_45eventDiscussions__DiscussionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventDiscussions__DiscussionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDiscussions__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventId_45token__Group__0"
    // InternalPermissionsOneOf1Parser.g:1770:1: rule__Permissions_45eventId_45token__Group__0 : rule__Permissions_45eventId_45token__Group__0__Impl rule__Permissions_45eventId_45token__Group__1 ;
    public final void rule__Permissions_45eventId_45token__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1774:1: ( rule__Permissions_45eventId_45token__Group__0__Impl rule__Permissions_45eventId_45token__Group__1 )
            // InternalPermissionsOneOf1Parser.g:1775:2: rule__Permissions_45eventId_45token__Group__0__Impl rule__Permissions_45eventId_45token__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventId_45token__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventId_45token__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventId_45token__Group__0"


    // $ANTLR start "rule__Permissions_45eventId_45token__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1782:1: rule__Permissions_45eventId_45token__Group__0__Impl : ( IdToken ) ;
    public final void rule__Permissions_45eventId_45token__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1786:1: ( ( IdToken ) )
            // InternalPermissionsOneOf1Parser.g:1787:1: ( IdToken )
            {
            // InternalPermissionsOneOf1Parser.g:1787:1: ( IdToken )
            // InternalPermissionsOneOf1Parser.g:1788:2: IdToken
            {
             before(grammarAccess.getPermissions_45eventId_45tokenAccess().getIdTokenKeyword_0()); 
            match(input,IdToken,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventId_45tokenAccess().getIdTokenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventId_45token__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventId_45token__Group__1"
    // InternalPermissionsOneOf1Parser.g:1797:1: rule__Permissions_45eventId_45token__Group__1 : rule__Permissions_45eventId_45token__Group__1__Impl rule__Permissions_45eventId_45token__Group__2 ;
    public final void rule__Permissions_45eventId_45token__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1801:1: ( rule__Permissions_45eventId_45token__Group__1__Impl rule__Permissions_45eventId_45token__Group__2 )
            // InternalPermissionsOneOf1Parser.g:1802:2: rule__Permissions_45eventId_45token__Group__1__Impl rule__Permissions_45eventId_45token__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventId_45token__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventId_45token__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventId_45token__Group__1"


    // $ANTLR start "rule__Permissions_45eventId_45token__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1809:1: rule__Permissions_45eventId_45token__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventId_45token__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1813:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:1814:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:1814:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:1815:2: Colon
            {
             before(grammarAccess.getPermissions_45eventId_45tokenAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventId_45tokenAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventId_45token__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventId_45token__Group__2"
    // InternalPermissionsOneOf1Parser.g:1824:1: rule__Permissions_45eventId_45token__Group__2 : rule__Permissions_45eventId_45token__Group__2__Impl ;
    public final void rule__Permissions_45eventId_45token__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1828:1: ( rule__Permissions_45eventId_45token__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:1829:2: rule__Permissions_45eventId_45token__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventId_45token__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventId_45token__Group__2"


    // $ANTLR start "rule__Permissions_45eventId_45token__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:1835:1: rule__Permissions_45eventId_45token__Group__2__Impl : ( ( rule__Permissions_45eventId_45token__Id_45tokenAssignment_2 ) ) ;
    public final void rule__Permissions_45eventId_45token__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1839:1: ( ( ( rule__Permissions_45eventId_45token__Id_45tokenAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:1840:1: ( ( rule__Permissions_45eventId_45token__Id_45tokenAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:1840:1: ( ( rule__Permissions_45eventId_45token__Id_45tokenAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:1841:2: ( rule__Permissions_45eventId_45token__Id_45tokenAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventId_45tokenAccess().getId_45tokenAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:1842:2: ( rule__Permissions_45eventId_45token__Id_45tokenAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:1842:3: rule__Permissions_45eventId_45token__Id_45tokenAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventId_45token__Id_45tokenAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventId_45tokenAccess().getId_45tokenAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventId_45token__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventIssues__Group__0"
    // InternalPermissionsOneOf1Parser.g:1851:1: rule__Permissions_45eventIssues__Group__0 : rule__Permissions_45eventIssues__Group__0__Impl rule__Permissions_45eventIssues__Group__1 ;
    public final void rule__Permissions_45eventIssues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1855:1: ( rule__Permissions_45eventIssues__Group__0__Impl rule__Permissions_45eventIssues__Group__1 )
            // InternalPermissionsOneOf1Parser.g:1856:2: rule__Permissions_45eventIssues__Group__0__Impl rule__Permissions_45eventIssues__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventIssues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventIssues__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventIssues__Group__0"


    // $ANTLR start "rule__Permissions_45eventIssues__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1863:1: rule__Permissions_45eventIssues__Group__0__Impl : ( Issues ) ;
    public final void rule__Permissions_45eventIssues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1867:1: ( ( Issues ) )
            // InternalPermissionsOneOf1Parser.g:1868:1: ( Issues )
            {
            // InternalPermissionsOneOf1Parser.g:1868:1: ( Issues )
            // InternalPermissionsOneOf1Parser.g:1869:2: Issues
            {
             before(grammarAccess.getPermissions_45eventIssuesAccess().getIssuesKeyword_0()); 
            match(input,Issues,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventIssuesAccess().getIssuesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventIssues__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventIssues__Group__1"
    // InternalPermissionsOneOf1Parser.g:1878:1: rule__Permissions_45eventIssues__Group__1 : rule__Permissions_45eventIssues__Group__1__Impl rule__Permissions_45eventIssues__Group__2 ;
    public final void rule__Permissions_45eventIssues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1882:1: ( rule__Permissions_45eventIssues__Group__1__Impl rule__Permissions_45eventIssues__Group__2 )
            // InternalPermissionsOneOf1Parser.g:1883:2: rule__Permissions_45eventIssues__Group__1__Impl rule__Permissions_45eventIssues__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventIssues__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventIssues__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventIssues__Group__1"


    // $ANTLR start "rule__Permissions_45eventIssues__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1890:1: rule__Permissions_45eventIssues__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventIssues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1894:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:1895:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:1895:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:1896:2: Colon
            {
             before(grammarAccess.getPermissions_45eventIssuesAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventIssuesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventIssues__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventIssues__Group__2"
    // InternalPermissionsOneOf1Parser.g:1905:1: rule__Permissions_45eventIssues__Group__2 : rule__Permissions_45eventIssues__Group__2__Impl ;
    public final void rule__Permissions_45eventIssues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1909:1: ( rule__Permissions_45eventIssues__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:1910:2: rule__Permissions_45eventIssues__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventIssues__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventIssues__Group__2"


    // $ANTLR start "rule__Permissions_45eventIssues__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:1916:1: rule__Permissions_45eventIssues__Group__2__Impl : ( ( rule__Permissions_45eventIssues__IssuesAssignment_2 ) ) ;
    public final void rule__Permissions_45eventIssues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1920:1: ( ( ( rule__Permissions_45eventIssues__IssuesAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:1921:1: ( ( rule__Permissions_45eventIssues__IssuesAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:1921:1: ( ( rule__Permissions_45eventIssues__IssuesAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:1922:2: ( rule__Permissions_45eventIssues__IssuesAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventIssuesAccess().getIssuesAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:1923:2: ( rule__Permissions_45eventIssues__IssuesAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:1923:3: rule__Permissions_45eventIssues__IssuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventIssues__IssuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventIssuesAccess().getIssuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventIssues__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventPackages__Group__0"
    // InternalPermissionsOneOf1Parser.g:1932:1: rule__Permissions_45eventPackages__Group__0 : rule__Permissions_45eventPackages__Group__0__Impl rule__Permissions_45eventPackages__Group__1 ;
    public final void rule__Permissions_45eventPackages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1936:1: ( rule__Permissions_45eventPackages__Group__0__Impl rule__Permissions_45eventPackages__Group__1 )
            // InternalPermissionsOneOf1Parser.g:1937:2: rule__Permissions_45eventPackages__Group__0__Impl rule__Permissions_45eventPackages__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventPackages__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPackages__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPackages__Group__0"


    // $ANTLR start "rule__Permissions_45eventPackages__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:1944:1: rule__Permissions_45eventPackages__Group__0__Impl : ( Packages ) ;
    public final void rule__Permissions_45eventPackages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1948:1: ( ( Packages ) )
            // InternalPermissionsOneOf1Parser.g:1949:1: ( Packages )
            {
            // InternalPermissionsOneOf1Parser.g:1949:1: ( Packages )
            // InternalPermissionsOneOf1Parser.g:1950:2: Packages
            {
             before(grammarAccess.getPermissions_45eventPackagesAccess().getPackagesKeyword_0()); 
            match(input,Packages,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventPackagesAccess().getPackagesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPackages__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventPackages__Group__1"
    // InternalPermissionsOneOf1Parser.g:1959:1: rule__Permissions_45eventPackages__Group__1 : rule__Permissions_45eventPackages__Group__1__Impl rule__Permissions_45eventPackages__Group__2 ;
    public final void rule__Permissions_45eventPackages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1963:1: ( rule__Permissions_45eventPackages__Group__1__Impl rule__Permissions_45eventPackages__Group__2 )
            // InternalPermissionsOneOf1Parser.g:1964:2: rule__Permissions_45eventPackages__Group__1__Impl rule__Permissions_45eventPackages__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventPackages__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPackages__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPackages__Group__1"


    // $ANTLR start "rule__Permissions_45eventPackages__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:1971:1: rule__Permissions_45eventPackages__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventPackages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1975:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:1976:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:1976:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:1977:2: Colon
            {
             before(grammarAccess.getPermissions_45eventPackagesAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventPackagesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPackages__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventPackages__Group__2"
    // InternalPermissionsOneOf1Parser.g:1986:1: rule__Permissions_45eventPackages__Group__2 : rule__Permissions_45eventPackages__Group__2__Impl ;
    public final void rule__Permissions_45eventPackages__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:1990:1: ( rule__Permissions_45eventPackages__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:1991:2: rule__Permissions_45eventPackages__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPackages__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPackages__Group__2"


    // $ANTLR start "rule__Permissions_45eventPackages__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:1997:1: rule__Permissions_45eventPackages__Group__2__Impl : ( ( rule__Permissions_45eventPackages__PackagesAssignment_2 ) ) ;
    public final void rule__Permissions_45eventPackages__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2001:1: ( ( ( rule__Permissions_45eventPackages__PackagesAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:2002:1: ( ( rule__Permissions_45eventPackages__PackagesAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2002:1: ( ( rule__Permissions_45eventPackages__PackagesAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:2003:2: ( rule__Permissions_45eventPackages__PackagesAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventPackagesAccess().getPackagesAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:2004:2: ( rule__Permissions_45eventPackages__PackagesAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:2004:3: rule__Permissions_45eventPackages__PackagesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPackages__PackagesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventPackagesAccess().getPackagesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPackages__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventPages__Group__0"
    // InternalPermissionsOneOf1Parser.g:2013:1: rule__Permissions_45eventPages__Group__0 : rule__Permissions_45eventPages__Group__0__Impl rule__Permissions_45eventPages__Group__1 ;
    public final void rule__Permissions_45eventPages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2017:1: ( rule__Permissions_45eventPages__Group__0__Impl rule__Permissions_45eventPages__Group__1 )
            // InternalPermissionsOneOf1Parser.g:2018:2: rule__Permissions_45eventPages__Group__0__Impl rule__Permissions_45eventPages__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventPages__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPages__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPages__Group__0"


    // $ANTLR start "rule__Permissions_45eventPages__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2025:1: rule__Permissions_45eventPages__Group__0__Impl : ( Pages ) ;
    public final void rule__Permissions_45eventPages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2029:1: ( ( Pages ) )
            // InternalPermissionsOneOf1Parser.g:2030:1: ( Pages )
            {
            // InternalPermissionsOneOf1Parser.g:2030:1: ( Pages )
            // InternalPermissionsOneOf1Parser.g:2031:2: Pages
            {
             before(grammarAccess.getPermissions_45eventPagesAccess().getPagesKeyword_0()); 
            match(input,Pages,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventPagesAccess().getPagesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPages__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventPages__Group__1"
    // InternalPermissionsOneOf1Parser.g:2040:1: rule__Permissions_45eventPages__Group__1 : rule__Permissions_45eventPages__Group__1__Impl rule__Permissions_45eventPages__Group__2 ;
    public final void rule__Permissions_45eventPages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2044:1: ( rule__Permissions_45eventPages__Group__1__Impl rule__Permissions_45eventPages__Group__2 )
            // InternalPermissionsOneOf1Parser.g:2045:2: rule__Permissions_45eventPages__Group__1__Impl rule__Permissions_45eventPages__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventPages__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPages__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPages__Group__1"


    // $ANTLR start "rule__Permissions_45eventPages__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2052:1: rule__Permissions_45eventPages__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventPages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2056:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:2057:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:2057:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:2058:2: Colon
            {
             before(grammarAccess.getPermissions_45eventPagesAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventPagesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPages__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventPages__Group__2"
    // InternalPermissionsOneOf1Parser.g:2067:1: rule__Permissions_45eventPages__Group__2 : rule__Permissions_45eventPages__Group__2__Impl ;
    public final void rule__Permissions_45eventPages__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2071:1: ( rule__Permissions_45eventPages__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:2072:2: rule__Permissions_45eventPages__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPages__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPages__Group__2"


    // $ANTLR start "rule__Permissions_45eventPages__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:2078:1: rule__Permissions_45eventPages__Group__2__Impl : ( ( rule__Permissions_45eventPages__PagesAssignment_2 ) ) ;
    public final void rule__Permissions_45eventPages__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2082:1: ( ( ( rule__Permissions_45eventPages__PagesAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:2083:1: ( ( rule__Permissions_45eventPages__PagesAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2083:1: ( ( rule__Permissions_45eventPages__PagesAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:2084:2: ( rule__Permissions_45eventPages__PagesAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventPagesAccess().getPagesAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:2085:2: ( rule__Permissions_45eventPages__PagesAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:2085:3: rule__Permissions_45eventPages__PagesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPages__PagesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventPagesAccess().getPagesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPages__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventPull_45requests__Group__0"
    // InternalPermissionsOneOf1Parser.g:2094:1: rule__Permissions_45eventPull_45requests__Group__0 : rule__Permissions_45eventPull_45requests__Group__0__Impl rule__Permissions_45eventPull_45requests__Group__1 ;
    public final void rule__Permissions_45eventPull_45requests__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2098:1: ( rule__Permissions_45eventPull_45requests__Group__0__Impl rule__Permissions_45eventPull_45requests__Group__1 )
            // InternalPermissionsOneOf1Parser.g:2099:2: rule__Permissions_45eventPull_45requests__Group__0__Impl rule__Permissions_45eventPull_45requests__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventPull_45requests__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPull_45requests__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPull_45requests__Group__0"


    // $ANTLR start "rule__Permissions_45eventPull_45requests__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2106:1: rule__Permissions_45eventPull_45requests__Group__0__Impl : ( PullRequests ) ;
    public final void rule__Permissions_45eventPull_45requests__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2110:1: ( ( PullRequests ) )
            // InternalPermissionsOneOf1Parser.g:2111:1: ( PullRequests )
            {
            // InternalPermissionsOneOf1Parser.g:2111:1: ( PullRequests )
            // InternalPermissionsOneOf1Parser.g:2112:2: PullRequests
            {
             before(grammarAccess.getPermissions_45eventPull_45requestsAccess().getPullRequestsKeyword_0()); 
            match(input,PullRequests,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventPull_45requestsAccess().getPullRequestsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPull_45requests__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventPull_45requests__Group__1"
    // InternalPermissionsOneOf1Parser.g:2121:1: rule__Permissions_45eventPull_45requests__Group__1 : rule__Permissions_45eventPull_45requests__Group__1__Impl rule__Permissions_45eventPull_45requests__Group__2 ;
    public final void rule__Permissions_45eventPull_45requests__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2125:1: ( rule__Permissions_45eventPull_45requests__Group__1__Impl rule__Permissions_45eventPull_45requests__Group__2 )
            // InternalPermissionsOneOf1Parser.g:2126:2: rule__Permissions_45eventPull_45requests__Group__1__Impl rule__Permissions_45eventPull_45requests__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventPull_45requests__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPull_45requests__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPull_45requests__Group__1"


    // $ANTLR start "rule__Permissions_45eventPull_45requests__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2133:1: rule__Permissions_45eventPull_45requests__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventPull_45requests__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2137:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:2138:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:2138:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:2139:2: Colon
            {
             before(grammarAccess.getPermissions_45eventPull_45requestsAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventPull_45requestsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPull_45requests__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventPull_45requests__Group__2"
    // InternalPermissionsOneOf1Parser.g:2148:1: rule__Permissions_45eventPull_45requests__Group__2 : rule__Permissions_45eventPull_45requests__Group__2__Impl ;
    public final void rule__Permissions_45eventPull_45requests__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2152:1: ( rule__Permissions_45eventPull_45requests__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:2153:2: rule__Permissions_45eventPull_45requests__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPull_45requests__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPull_45requests__Group__2"


    // $ANTLR start "rule__Permissions_45eventPull_45requests__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:2159:1: rule__Permissions_45eventPull_45requests__Group__2__Impl : ( ( rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2 ) ) ;
    public final void rule__Permissions_45eventPull_45requests__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2163:1: ( ( ( rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:2164:1: ( ( rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2164:1: ( ( rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:2165:2: ( rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventPull_45requestsAccess().getPull_45requestsAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:2166:2: ( rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:2166:3: rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventPull_45requestsAccess().getPull_45requestsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPull_45requests__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventRepository_45projects__Group__0"
    // InternalPermissionsOneOf1Parser.g:2175:1: rule__Permissions_45eventRepository_45projects__Group__0 : rule__Permissions_45eventRepository_45projects__Group__0__Impl rule__Permissions_45eventRepository_45projects__Group__1 ;
    public final void rule__Permissions_45eventRepository_45projects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2179:1: ( rule__Permissions_45eventRepository_45projects__Group__0__Impl rule__Permissions_45eventRepository_45projects__Group__1 )
            // InternalPermissionsOneOf1Parser.g:2180:2: rule__Permissions_45eventRepository_45projects__Group__0__Impl rule__Permissions_45eventRepository_45projects__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventRepository_45projects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventRepository_45projects__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventRepository_45projects__Group__0"


    // $ANTLR start "rule__Permissions_45eventRepository_45projects__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2187:1: rule__Permissions_45eventRepository_45projects__Group__0__Impl : ( RepositoryProjects ) ;
    public final void rule__Permissions_45eventRepository_45projects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2191:1: ( ( RepositoryProjects ) )
            // InternalPermissionsOneOf1Parser.g:2192:1: ( RepositoryProjects )
            {
            // InternalPermissionsOneOf1Parser.g:2192:1: ( RepositoryProjects )
            // InternalPermissionsOneOf1Parser.g:2193:2: RepositoryProjects
            {
             before(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepositoryProjectsKeyword_0()); 
            match(input,RepositoryProjects,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepositoryProjectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventRepository_45projects__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventRepository_45projects__Group__1"
    // InternalPermissionsOneOf1Parser.g:2202:1: rule__Permissions_45eventRepository_45projects__Group__1 : rule__Permissions_45eventRepository_45projects__Group__1__Impl rule__Permissions_45eventRepository_45projects__Group__2 ;
    public final void rule__Permissions_45eventRepository_45projects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2206:1: ( rule__Permissions_45eventRepository_45projects__Group__1__Impl rule__Permissions_45eventRepository_45projects__Group__2 )
            // InternalPermissionsOneOf1Parser.g:2207:2: rule__Permissions_45eventRepository_45projects__Group__1__Impl rule__Permissions_45eventRepository_45projects__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventRepository_45projects__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventRepository_45projects__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventRepository_45projects__Group__1"


    // $ANTLR start "rule__Permissions_45eventRepository_45projects__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2214:1: rule__Permissions_45eventRepository_45projects__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventRepository_45projects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2218:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:2219:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:2219:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:2220:2: Colon
            {
             before(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventRepository_45projects__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventRepository_45projects__Group__2"
    // InternalPermissionsOneOf1Parser.g:2229:1: rule__Permissions_45eventRepository_45projects__Group__2 : rule__Permissions_45eventRepository_45projects__Group__2__Impl ;
    public final void rule__Permissions_45eventRepository_45projects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2233:1: ( rule__Permissions_45eventRepository_45projects__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:2234:2: rule__Permissions_45eventRepository_45projects__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventRepository_45projects__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventRepository_45projects__Group__2"


    // $ANTLR start "rule__Permissions_45eventRepository_45projects__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:2240:1: rule__Permissions_45eventRepository_45projects__Group__2__Impl : ( ( rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2 ) ) ;
    public final void rule__Permissions_45eventRepository_45projects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2244:1: ( ( ( rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:2245:1: ( ( rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2245:1: ( ( rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:2246:2: ( rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepository_45projectsAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:2247:2: ( rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:2247:3: rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepository_45projectsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventRepository_45projects__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventSecurity_45events__Group__0"
    // InternalPermissionsOneOf1Parser.g:2256:1: rule__Permissions_45eventSecurity_45events__Group__0 : rule__Permissions_45eventSecurity_45events__Group__0__Impl rule__Permissions_45eventSecurity_45events__Group__1 ;
    public final void rule__Permissions_45eventSecurity_45events__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2260:1: ( rule__Permissions_45eventSecurity_45events__Group__0__Impl rule__Permissions_45eventSecurity_45events__Group__1 )
            // InternalPermissionsOneOf1Parser.g:2261:2: rule__Permissions_45eventSecurity_45events__Group__0__Impl rule__Permissions_45eventSecurity_45events__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventSecurity_45events__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventSecurity_45events__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventSecurity_45events__Group__0"


    // $ANTLR start "rule__Permissions_45eventSecurity_45events__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2268:1: rule__Permissions_45eventSecurity_45events__Group__0__Impl : ( SecurityEvents ) ;
    public final void rule__Permissions_45eventSecurity_45events__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2272:1: ( ( SecurityEvents ) )
            // InternalPermissionsOneOf1Parser.g:2273:1: ( SecurityEvents )
            {
            // InternalPermissionsOneOf1Parser.g:2273:1: ( SecurityEvents )
            // InternalPermissionsOneOf1Parser.g:2274:2: SecurityEvents
            {
             before(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurityEventsKeyword_0()); 
            match(input,SecurityEvents,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurityEventsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventSecurity_45events__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventSecurity_45events__Group__1"
    // InternalPermissionsOneOf1Parser.g:2283:1: rule__Permissions_45eventSecurity_45events__Group__1 : rule__Permissions_45eventSecurity_45events__Group__1__Impl rule__Permissions_45eventSecurity_45events__Group__2 ;
    public final void rule__Permissions_45eventSecurity_45events__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2287:1: ( rule__Permissions_45eventSecurity_45events__Group__1__Impl rule__Permissions_45eventSecurity_45events__Group__2 )
            // InternalPermissionsOneOf1Parser.g:2288:2: rule__Permissions_45eventSecurity_45events__Group__1__Impl rule__Permissions_45eventSecurity_45events__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventSecurity_45events__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventSecurity_45events__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventSecurity_45events__Group__1"


    // $ANTLR start "rule__Permissions_45eventSecurity_45events__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2295:1: rule__Permissions_45eventSecurity_45events__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventSecurity_45events__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2299:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:2300:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:2300:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:2301:2: Colon
            {
             before(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventSecurity_45events__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventSecurity_45events__Group__2"
    // InternalPermissionsOneOf1Parser.g:2310:1: rule__Permissions_45eventSecurity_45events__Group__2 : rule__Permissions_45eventSecurity_45events__Group__2__Impl ;
    public final void rule__Permissions_45eventSecurity_45events__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2314:1: ( rule__Permissions_45eventSecurity_45events__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:2315:2: rule__Permissions_45eventSecurity_45events__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventSecurity_45events__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventSecurity_45events__Group__2"


    // $ANTLR start "rule__Permissions_45eventSecurity_45events__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:2321:1: rule__Permissions_45eventSecurity_45events__Group__2__Impl : ( ( rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2 ) ) ;
    public final void rule__Permissions_45eventSecurity_45events__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2325:1: ( ( ( rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:2326:1: ( ( rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2326:1: ( ( rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:2327:2: ( rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurity_45eventsAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:2328:2: ( rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:2328:3: rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurity_45eventsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventSecurity_45events__Group__2__Impl"


    // $ANTLR start "rule__Permissions_45eventStatuses__Group__0"
    // InternalPermissionsOneOf1Parser.g:2337:1: rule__Permissions_45eventStatuses__Group__0 : rule__Permissions_45eventStatuses__Group__0__Impl rule__Permissions_45eventStatuses__Group__1 ;
    public final void rule__Permissions_45eventStatuses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2341:1: ( rule__Permissions_45eventStatuses__Group__0__Impl rule__Permissions_45eventStatuses__Group__1 )
            // InternalPermissionsOneOf1Parser.g:2342:2: rule__Permissions_45eventStatuses__Group__0__Impl rule__Permissions_45eventStatuses__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Permissions_45eventStatuses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventStatuses__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventStatuses__Group__0"


    // $ANTLR start "rule__Permissions_45eventStatuses__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2349:1: rule__Permissions_45eventStatuses__Group__0__Impl : ( Statuses ) ;
    public final void rule__Permissions_45eventStatuses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2353:1: ( ( Statuses ) )
            // InternalPermissionsOneOf1Parser.g:2354:1: ( Statuses )
            {
            // InternalPermissionsOneOf1Parser.g:2354:1: ( Statuses )
            // InternalPermissionsOneOf1Parser.g:2355:2: Statuses
            {
             before(grammarAccess.getPermissions_45eventStatusesAccess().getStatusesKeyword_0()); 
            match(input,Statuses,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventStatusesAccess().getStatusesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventStatuses__Group__0__Impl"


    // $ANTLR start "rule__Permissions_45eventStatuses__Group__1"
    // InternalPermissionsOneOf1Parser.g:2364:1: rule__Permissions_45eventStatuses__Group__1 : rule__Permissions_45eventStatuses__Group__1__Impl rule__Permissions_45eventStatuses__Group__2 ;
    public final void rule__Permissions_45eventStatuses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2368:1: ( rule__Permissions_45eventStatuses__Group__1__Impl rule__Permissions_45eventStatuses__Group__2 )
            // InternalPermissionsOneOf1Parser.g:2369:2: rule__Permissions_45eventStatuses__Group__1__Impl rule__Permissions_45eventStatuses__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Permissions_45eventStatuses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Permissions_45eventStatuses__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventStatuses__Group__1"


    // $ANTLR start "rule__Permissions_45eventStatuses__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2376:1: rule__Permissions_45eventStatuses__Group__1__Impl : ( Colon ) ;
    public final void rule__Permissions_45eventStatuses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2380:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:2381:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:2381:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:2382:2: Colon
            {
             before(grammarAccess.getPermissions_45eventStatusesAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPermissions_45eventStatusesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventStatuses__Group__1__Impl"


    // $ANTLR start "rule__Permissions_45eventStatuses__Group__2"
    // InternalPermissionsOneOf1Parser.g:2391:1: rule__Permissions_45eventStatuses__Group__2 : rule__Permissions_45eventStatuses__Group__2__Impl ;
    public final void rule__Permissions_45eventStatuses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2395:1: ( rule__Permissions_45eventStatuses__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:2396:2: rule__Permissions_45eventStatuses__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventStatuses__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventStatuses__Group__2"


    // $ANTLR start "rule__Permissions_45eventStatuses__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:2402:1: rule__Permissions_45eventStatuses__Group__2__Impl : ( ( rule__Permissions_45eventStatuses__StatusesAssignment_2 ) ) ;
    public final void rule__Permissions_45eventStatuses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2406:1: ( ( ( rule__Permissions_45eventStatuses__StatusesAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:2407:1: ( ( rule__Permissions_45eventStatuses__StatusesAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2407:1: ( ( rule__Permissions_45eventStatuses__StatusesAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:2408:2: ( rule__Permissions_45eventStatuses__StatusesAssignment_2 )
            {
             before(grammarAccess.getPermissions_45eventStatusesAccess().getStatusesAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:2409:2: ( rule__Permissions_45eventStatuses__StatusesAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:2409:3: rule__Permissions_45eventStatuses__StatusesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Permissions_45eventStatuses__StatusesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPermissions_45eventStatusesAccess().getStatusesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventStatuses__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalPermissionsOneOf1Parser.g:2418:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2422:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalPermissionsOneOf1Parser.g:2423:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ArrayValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__0"


    // $ANTLR start "rule__ArrayValue__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2430:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2434:1: ( ( () ) )
            // InternalPermissionsOneOf1Parser.g:2435:1: ( () )
            {
            // InternalPermissionsOneOf1Parser.g:2435:1: ( () )
            // InternalPermissionsOneOf1Parser.g:2436:2: ()
            {
             before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            // InternalPermissionsOneOf1Parser.g:2437:2: ()
            // InternalPermissionsOneOf1Parser.g:2437:3: 
            {
            }

             after(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group__1"
    // InternalPermissionsOneOf1Parser.g:2445:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2449:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalPermissionsOneOf1Parser.g:2450:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ArrayValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__1"


    // $ANTLR start "rule__ArrayValue__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2457:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2461:1: ( ( LeftSquareBracket ) )
            // InternalPermissionsOneOf1Parser.g:2462:1: ( LeftSquareBracket )
            {
            // InternalPermissionsOneOf1Parser.g:2462:1: ( LeftSquareBracket )
            // InternalPermissionsOneOf1Parser.g:2463:2: LeftSquareBracket
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group__2"
    // InternalPermissionsOneOf1Parser.g:2472:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2476:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalPermissionsOneOf1Parser.g:2477:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ArrayValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__2"


    // $ANTLR start "rule__ArrayValue__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:2484:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2488:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalPermissionsOneOf1Parser.g:2489:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalPermissionsOneOf1Parser.g:2489:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalPermissionsOneOf1Parser.g:2490:2: ( rule__ArrayValue__Group_2__0 )?
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalPermissionsOneOf1Parser.g:2491:2: ( rule__ArrayValue__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RepositoryProjects && LA9_0<=True)||LA9_0==LeftSquareBracket||LA9_0==LeftCurlyBracket||(LA9_0>=RULE_STRING && LA9_0<=RULE_E_DOUBLE)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:2491:3: rule__ArrayValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayValue__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__3"
    // InternalPermissionsOneOf1Parser.g:2499:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2503:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalPermissionsOneOf1Parser.g:2504:2: rule__ArrayValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__3"


    // $ANTLR start "rule__ArrayValue__Group__3__Impl"
    // InternalPermissionsOneOf1Parser.g:2510:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2514:1: ( ( RightSquareBracket ) )
            // InternalPermissionsOneOf1Parser.g:2515:1: ( RightSquareBracket )
            {
            // InternalPermissionsOneOf1Parser.g:2515:1: ( RightSquareBracket )
            // InternalPermissionsOneOf1Parser.g:2516:2: RightSquareBracket
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__3__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2__0"
    // InternalPermissionsOneOf1Parser.g:2526:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2530:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalPermissionsOneOf1Parser.g:2531:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ArrayValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__0"


    // $ANTLR start "rule__ArrayValue__Group_2__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2538:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2542:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalPermissionsOneOf1Parser.g:2543:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2543:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalPermissionsOneOf1Parser.g:2544:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            // InternalPermissionsOneOf1Parser.g:2545:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalPermissionsOneOf1Parser.g:2545:3: rule__ArrayValue__ValueAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ValueAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2__1"
    // InternalPermissionsOneOf1Parser.g:2553:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2557:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalPermissionsOneOf1Parser.g:2558:2: rule__ArrayValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__1"


    // $ANTLR start "rule__ArrayValue__Group_2__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2564:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2568:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalPermissionsOneOf1Parser.g:2569:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalPermissionsOneOf1Parser.g:2569:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalPermissionsOneOf1Parser.g:2570:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            // InternalPermissionsOneOf1Parser.g:2571:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPermissionsOneOf1Parser.g:2571:3: rule__ArrayValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ArrayValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getArrayValueAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2_1__0"
    // InternalPermissionsOneOf1Parser.g:2580:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2584:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalPermissionsOneOf1Parser.g:2585:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ArrayValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2_1__0"


    // $ANTLR start "rule__ArrayValue__Group_2_1__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2592:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2596:1: ( ( Comma ) )
            // InternalPermissionsOneOf1Parser.g:2597:1: ( Comma )
            {
            // InternalPermissionsOneOf1Parser.g:2597:1: ( Comma )
            // InternalPermissionsOneOf1Parser.g:2598:2: Comma
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2_1__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2_1__1"
    // InternalPermissionsOneOf1Parser.g:2607:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2611:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalPermissionsOneOf1Parser.g:2612:2: rule__ArrayValue__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2_1__1"


    // $ANTLR start "rule__ArrayValue__Group_2_1__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2618:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2622:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalPermissionsOneOf1Parser.g:2623:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2623:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalPermissionsOneOf1Parser.g:2624:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            // InternalPermissionsOneOf1Parser.g:2625:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalPermissionsOneOf1Parser.g:2625:3: rule__ArrayValue__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ValueAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2_1__1__Impl"


    // $ANTLR start "rule__ObjectValue__Group__0"
    // InternalPermissionsOneOf1Parser.g:2634:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2638:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalPermissionsOneOf1Parser.g:2639:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ObjectValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0"


    // $ANTLR start "rule__ObjectValue__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2646:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2650:1: ( ( () ) )
            // InternalPermissionsOneOf1Parser.g:2651:1: ( () )
            {
            // InternalPermissionsOneOf1Parser.g:2651:1: ( () )
            // InternalPermissionsOneOf1Parser.g:2652:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalPermissionsOneOf1Parser.g:2653:2: ()
            // InternalPermissionsOneOf1Parser.g:2653:3: 
            {
            }

             after(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__0__Impl"


    // $ANTLR start "rule__ObjectValue__Group__1"
    // InternalPermissionsOneOf1Parser.g:2661:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2665:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalPermissionsOneOf1Parser.g:2666:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ObjectValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1"


    // $ANTLR start "rule__ObjectValue__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2673:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2677:1: ( ( LeftCurlyBracket ) )
            // InternalPermissionsOneOf1Parser.g:2678:1: ( LeftCurlyBracket )
            {
            // InternalPermissionsOneOf1Parser.g:2678:1: ( LeftCurlyBracket )
            // InternalPermissionsOneOf1Parser.g:2679:2: LeftCurlyBracket
            {
             before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__1__Impl"


    // $ANTLR start "rule__ObjectValue__Group__2"
    // InternalPermissionsOneOf1Parser.g:2688:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2692:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalPermissionsOneOf1Parser.g:2693:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ObjectValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2"


    // $ANTLR start "rule__ObjectValue__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:2700:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2704:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalPermissionsOneOf1Parser.g:2705:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalPermissionsOneOf1Parser.g:2705:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalPermissionsOneOf1Parser.g:2706:2: ( rule__ObjectValue__Group_2__0 )?
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            // InternalPermissionsOneOf1Parser.g:2707:2: ( rule__ObjectValue__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RepositoryProjects && LA11_0<=Pages)||LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPermissionsOneOf1Parser.g:2707:3: rule__ObjectValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectValue__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__2__Impl"


    // $ANTLR start "rule__ObjectValue__Group__3"
    // InternalPermissionsOneOf1Parser.g:2715:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2719:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalPermissionsOneOf1Parser.g:2720:2: rule__ObjectValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3"


    // $ANTLR start "rule__ObjectValue__Group__3__Impl"
    // InternalPermissionsOneOf1Parser.g:2726:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2730:1: ( ( RightCurlyBracket ) )
            // InternalPermissionsOneOf1Parser.g:2731:1: ( RightCurlyBracket )
            {
            // InternalPermissionsOneOf1Parser.g:2731:1: ( RightCurlyBracket )
            // InternalPermissionsOneOf1Parser.g:2732:2: RightCurlyBracket
            {
             before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group__3__Impl"


    // $ANTLR start "rule__ObjectValue__Group_2__0"
    // InternalPermissionsOneOf1Parser.g:2742:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2746:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalPermissionsOneOf1Parser.g:2747:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ObjectValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2__0"


    // $ANTLR start "rule__ObjectValue__Group_2__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2754:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2758:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalPermissionsOneOf1Parser.g:2759:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2759:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalPermissionsOneOf1Parser.g:2760:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            // InternalPermissionsOneOf1Parser.g:2761:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalPermissionsOneOf1Parser.g:2761:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__KeyvaluepairAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2__0__Impl"


    // $ANTLR start "rule__ObjectValue__Group_2__1"
    // InternalPermissionsOneOf1Parser.g:2769:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2773:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalPermissionsOneOf1Parser.g:2774:2: rule__ObjectValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2__1"


    // $ANTLR start "rule__ObjectValue__Group_2__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2780:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2784:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalPermissionsOneOf1Parser.g:2785:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalPermissionsOneOf1Parser.g:2785:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalPermissionsOneOf1Parser.g:2786:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            // InternalPermissionsOneOf1Parser.g:2787:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPermissionsOneOf1Parser.g:2787:3: rule__ObjectValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ObjectValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getObjectValueAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2__1__Impl"


    // $ANTLR start "rule__ObjectValue__Group_2_1__0"
    // InternalPermissionsOneOf1Parser.g:2796:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2800:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalPermissionsOneOf1Parser.g:2801:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
            {
            pushFollow(FOLLOW_13);
            rule__ObjectValue__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2_1__0"


    // $ANTLR start "rule__ObjectValue__Group_2_1__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2808:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2812:1: ( ( Comma ) )
            // InternalPermissionsOneOf1Parser.g:2813:1: ( Comma )
            {
            // InternalPermissionsOneOf1Parser.g:2813:1: ( Comma )
            // InternalPermissionsOneOf1Parser.g:2814:2: Comma
            {
             before(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2_1__0__Impl"


    // $ANTLR start "rule__ObjectValue__Group_2_1__1"
    // InternalPermissionsOneOf1Parser.g:2823:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2827:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalPermissionsOneOf1Parser.g:2828:2: rule__ObjectValue__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2_1__1"


    // $ANTLR start "rule__ObjectValue__Group_2_1__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2834:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2838:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalPermissionsOneOf1Parser.g:2839:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2839:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalPermissionsOneOf1Parser.g:2840:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            // InternalPermissionsOneOf1Parser.g:2841:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalPermissionsOneOf1Parser.g:2841:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__KeyvaluepairAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__Group_2_1__1__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__0"
    // InternalPermissionsOneOf1Parser.g:2850:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2854:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalPermissionsOneOf1Parser.g:2855:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__KeyValuePair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__0"


    // $ANTLR start "rule__KeyValuePair__Group__0__Impl"
    // InternalPermissionsOneOf1Parser.g:2862:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2866:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalPermissionsOneOf1Parser.g:2867:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2867:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalPermissionsOneOf1Parser.g:2868:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            // InternalPermissionsOneOf1Parser.g:2869:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalPermissionsOneOf1Parser.g:2869:3: rule__KeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__0__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__1"
    // InternalPermissionsOneOf1Parser.g:2877:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2881:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalPermissionsOneOf1Parser.g:2882:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__KeyValuePair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__1"


    // $ANTLR start "rule__KeyValuePair__Group__1__Impl"
    // InternalPermissionsOneOf1Parser.g:2889:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2893:1: ( ( Colon ) )
            // InternalPermissionsOneOf1Parser.g:2894:1: ( Colon )
            {
            // InternalPermissionsOneOf1Parser.g:2894:1: ( Colon )
            // InternalPermissionsOneOf1Parser.g:2895:2: Colon
            {
             before(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__1__Impl"


    // $ANTLR start "rule__KeyValuePair__Group__2"
    // InternalPermissionsOneOf1Parser.g:2904:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2908:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalPermissionsOneOf1Parser.g:2909:2: rule__KeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__2"


    // $ANTLR start "rule__KeyValuePair__Group__2__Impl"
    // InternalPermissionsOneOf1Parser.g:2915:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2919:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalPermissionsOneOf1Parser.g:2920:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalPermissionsOneOf1Parser.g:2920:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalPermissionsOneOf1Parser.g:2921:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            // InternalPermissionsOneOf1Parser.g:2922:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalPermissionsOneOf1Parser.g:2922:3: rule__KeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__Group__2__Impl"


    // $ANTLR start "rule__PermissionsOneOf1__PermissionsAssignment"
    // InternalPermissionsOneOf1Parser.g:2931:1: rule__PermissionsOneOf1__PermissionsAssignment : ( rulePermissions_45event ) ;
    public final void rule__PermissionsOneOf1__PermissionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2935:1: ( ( rulePermissions_45event ) )
            // InternalPermissionsOneOf1Parser.g:2936:2: ( rulePermissions_45event )
            {
            // InternalPermissionsOneOf1Parser.g:2936:2: ( rulePermissions_45event )
            // InternalPermissionsOneOf1Parser.g:2937:3: rulePermissions_45event
            {
             before(grammarAccess.getPermissionsOneOf1Access().getPermissionsPermissions_45eventParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45event();

            state._fsp--;

             after(grammarAccess.getPermissionsOneOf1Access().getPermissionsPermissions_45eventParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PermissionsOneOf1__PermissionsAssignment"


    // $ANTLR start "rule__Permissions_45event__Permissions_45eventAssignment_2_0"
    // InternalPermissionsOneOf1Parser.g:2946:1: rule__Permissions_45event__Permissions_45eventAssignment_2_0 : ( rulePermissions_45eventPropertiesAbstract ) ;
    public final void rule__Permissions_45event__Permissions_45eventAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2950:1: ( ( rulePermissions_45eventPropertiesAbstract ) )
            // InternalPermissionsOneOf1Parser.g:2951:2: ( rulePermissions_45eventPropertiesAbstract )
            {
            // InternalPermissionsOneOf1Parser.g:2951:2: ( rulePermissions_45eventPropertiesAbstract )
            // InternalPermissionsOneOf1Parser.g:2952:3: rulePermissions_45eventPropertiesAbstract
            {
             before(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventPermissions_45eventPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45eventPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventPermissions_45eventPropertiesAbstractParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Permissions_45eventAssignment_2_0"


    // $ANTLR start "rule__Permissions_45event__Permissions_45eventAssignment_2_1_1"
    // InternalPermissionsOneOf1Parser.g:2961:1: rule__Permissions_45event__Permissions_45eventAssignment_2_1_1 : ( rulePermissions_45eventPropertiesAbstract ) ;
    public final void rule__Permissions_45event__Permissions_45eventAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2965:1: ( ( rulePermissions_45eventPropertiesAbstract ) )
            // InternalPermissionsOneOf1Parser.g:2966:2: ( rulePermissions_45eventPropertiesAbstract )
            {
            // InternalPermissionsOneOf1Parser.g:2966:2: ( rulePermissions_45eventPropertiesAbstract )
            // InternalPermissionsOneOf1Parser.g:2967:3: rulePermissions_45eventPropertiesAbstract
            {
             before(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventPermissions_45eventPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45eventPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventAccess().getPermissions_45eventPermissions_45eventPropertiesAbstractParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45event__Permissions_45eventAssignment_2_1_1"


    // $ANTLR start "rule__Permissions_45eventActions__ActionsAssignment_2"
    // InternalPermissionsOneOf1Parser.g:2976:1: rule__Permissions_45eventActions__ActionsAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventActions__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2980:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:2981:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:2981:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:2982:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventActionsAccess().getActionsPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventActionsAccess().getActionsPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventActions__ActionsAssignment_2"


    // $ANTLR start "rule__Permissions_45eventChecks__ChecksAssignment_2"
    // InternalPermissionsOneOf1Parser.g:2991:1: rule__Permissions_45eventChecks__ChecksAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventChecks__ChecksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:2995:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:2996:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:2996:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:2997:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventChecksAccess().getChecksPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventChecksAccess().getChecksPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventChecks__ChecksAssignment_2"


    // $ANTLR start "rule__Permissions_45eventContents__ContentsAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3006:1: rule__Permissions_45eventContents__ContentsAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventContents__ContentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3010:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3011:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3011:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3012:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventContentsAccess().getContentsPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventContentsAccess().getContentsPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventContents__ContentsAssignment_2"


    // $ANTLR start "rule__Permissions_45eventDeployments__DeploymentsAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3021:1: rule__Permissions_45eventDeployments__DeploymentsAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventDeployments__DeploymentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3025:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3026:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3026:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3027:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventDeploymentsAccess().getDeploymentsPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDeployments__DeploymentsAssignment_2"


    // $ANTLR start "rule__Permissions_45eventDiscussions__DiscussionsAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3036:1: rule__Permissions_45eventDiscussions__DiscussionsAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventDiscussions__DiscussionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3040:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3041:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3041:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3042:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventDiscussionsAccess().getDiscussionsPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventDiscussions__DiscussionsAssignment_2"


    // $ANTLR start "rule__Permissions_45eventId_45token__Id_45tokenAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3051:1: rule__Permissions_45eventId_45token__Id_45tokenAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventId_45token__Id_45tokenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3055:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3056:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3056:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3057:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventId_45tokenAccess().getId_45tokenPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventId_45tokenAccess().getId_45tokenPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventId_45token__Id_45tokenAssignment_2"


    // $ANTLR start "rule__Permissions_45eventIssues__IssuesAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3066:1: rule__Permissions_45eventIssues__IssuesAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventIssues__IssuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3070:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3071:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3071:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3072:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventIssuesAccess().getIssuesPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventIssuesAccess().getIssuesPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventIssues__IssuesAssignment_2"


    // $ANTLR start "rule__Permissions_45eventPackages__PackagesAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3081:1: rule__Permissions_45eventPackages__PackagesAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventPackages__PackagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3085:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3086:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3086:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3087:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventPackagesAccess().getPackagesPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventPackagesAccess().getPackagesPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPackages__PackagesAssignment_2"


    // $ANTLR start "rule__Permissions_45eventPages__PagesAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3096:1: rule__Permissions_45eventPages__PagesAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventPages__PagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3100:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3101:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3101:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3102:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventPagesAccess().getPagesPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventPagesAccess().getPagesPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPages__PagesAssignment_2"


    // $ANTLR start "rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3111:1: rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3115:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3116:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3116:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3117:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventPull_45requestsAccess().getPull_45requestsPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventPull_45requestsAccess().getPull_45requestsPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventPull_45requests__Pull_45requestsAssignment_2"


    // $ANTLR start "rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3126:1: rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3130:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3131:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3131:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3132:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepository_45projectsPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventRepository_45projectsAccess().getRepository_45projectsPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventRepository_45projects__Repository_45projectsAssignment_2"


    // $ANTLR start "rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3141:1: rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3145:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3146:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3146:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3147:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurity_45eventsPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventSecurity_45eventsAccess().getSecurity_45eventsPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventSecurity_45events__Security_45eventsAssignment_2"


    // $ANTLR start "rule__Permissions_45eventStatuses__StatusesAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3156:1: rule__Permissions_45eventStatuses__StatusesAssignment_2 : ( rulePermissions_45level ) ;
    public final void rule__Permissions_45eventStatuses__StatusesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3160:1: ( ( rulePermissions_45level ) )
            // InternalPermissionsOneOf1Parser.g:3161:2: ( rulePermissions_45level )
            {
            // InternalPermissionsOneOf1Parser.g:3161:2: ( rulePermissions_45level )
            // InternalPermissionsOneOf1Parser.g:3162:3: rulePermissions_45level
            {
             before(grammarAccess.getPermissions_45eventStatusesAccess().getStatusesPermissions_45levelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePermissions_45level();

            state._fsp--;

             after(grammarAccess.getPermissions_45eventStatusesAccess().getStatusesPermissions_45levelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45eventStatuses__StatusesAssignment_2"


    // $ANTLR start "rule__Permissions_45level__Permissions_45levelAssignment"
    // InternalPermissionsOneOf1Parser.g:3171:1: rule__Permissions_45level__Permissions_45levelAssignment : ( ruleJsonDocument ) ;
    public final void rule__Permissions_45level__Permissions_45levelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3175:1: ( ( ruleJsonDocument ) )
            // InternalPermissionsOneOf1Parser.g:3176:2: ( ruleJsonDocument )
            {
            // InternalPermissionsOneOf1Parser.g:3176:2: ( ruleJsonDocument )
            // InternalPermissionsOneOf1Parser.g:3177:3: ruleJsonDocument
            {
             before(grammarAccess.getPermissions_45levelAccess().getPermissions_45levelJsonDocumentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getPermissions_45levelAccess().getPermissions_45levelJsonDocumentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Permissions_45level__Permissions_45levelAssignment"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalPermissionsOneOf1Parser.g:3186:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3190:1: ( ( ruleValue ) )
            // InternalPermissionsOneOf1Parser.g:3191:2: ( ruleValue )
            {
            // InternalPermissionsOneOf1Parser.g:3191:2: ( ruleValue )
            // InternalPermissionsOneOf1Parser.g:3192:3: ruleValue
            {
             before(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonDocument__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalPermissionsOneOf1Parser.g:3201:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3205:1: ( ( ruleEString ) )
            // InternalPermissionsOneOf1Parser.g:3206:2: ( ruleEString )
            {
            // InternalPermissionsOneOf1Parser.g:3206:2: ( ruleEString )
            // InternalPermissionsOneOf1Parser.g:3207:3: ruleEString
            {
             before(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__ArrayValue__ValueAssignment_2_0"
    // InternalPermissionsOneOf1Parser.g:3216:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3220:1: ( ( ruleValue ) )
            // InternalPermissionsOneOf1Parser.g:3221:2: ( ruleValue )
            {
            // InternalPermissionsOneOf1Parser.g:3221:2: ( ruleValue )
            // InternalPermissionsOneOf1Parser.g:3222:3: ruleValue
            {
             before(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__ValueAssignment_2_0"


    // $ANTLR start "rule__ArrayValue__ValueAssignment_2_1_1"
    // InternalPermissionsOneOf1Parser.g:3231:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3235:1: ( ( ruleValue ) )
            // InternalPermissionsOneOf1Parser.g:3236:2: ( ruleValue )
            {
            // InternalPermissionsOneOf1Parser.g:3236:2: ( ruleValue )
            // InternalPermissionsOneOf1Parser.g:3237:3: ruleValue
            {
             before(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__ValueAssignment_2_1_1"


    // $ANTLR start "rule__NullValue__ValueAssignment"
    // InternalPermissionsOneOf1Parser.g:3246:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3250:1: ( ( ruleNullEnum ) )
            // InternalPermissionsOneOf1Parser.g:3251:2: ( ruleNullEnum )
            {
            // InternalPermissionsOneOf1Parser.g:3251:2: ( ruleNullEnum )
            // InternalPermissionsOneOf1Parser.g:3252:3: ruleNullEnum
            {
             before(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNullEnum();

            state._fsp--;

             after(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullValue__ValueAssignment"


    // $ANTLR start "rule__NumberValue__ValueAssignment"
    // InternalPermissionsOneOf1Parser.g:3261:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3265:1: ( ( ruleEDouble ) )
            // InternalPermissionsOneOf1Parser.g:3266:2: ( ruleEDouble )
            {
            // InternalPermissionsOneOf1Parser.g:3266:2: ( ruleEDouble )
            // InternalPermissionsOneOf1Parser.g:3267:3: ruleEDouble
            {
             before(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__ValueAssignment"


    // $ANTLR start "rule__ObjectValue__KeyvaluepairAssignment_2_0"
    // InternalPermissionsOneOf1Parser.g:3276:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3280:1: ( ( ruleKeyValuePair ) )
            // InternalPermissionsOneOf1Parser.g:3281:2: ( ruleKeyValuePair )
            {
            // InternalPermissionsOneOf1Parser.g:3281:2: ( ruleKeyValuePair )
            // InternalPermissionsOneOf1Parser.g:3282:3: ruleKeyValuePair
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyValuePair();

            state._fsp--;

             after(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__KeyvaluepairAssignment_2_0"


    // $ANTLR start "rule__ObjectValue__KeyvaluepairAssignment_2_1_1"
    // InternalPermissionsOneOf1Parser.g:3291:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3295:1: ( ( ruleKeyValuePair ) )
            // InternalPermissionsOneOf1Parser.g:3296:2: ( ruleKeyValuePair )
            {
            // InternalPermissionsOneOf1Parser.g:3296:2: ( ruleKeyValuePair )
            // InternalPermissionsOneOf1Parser.g:3297:3: ruleKeyValuePair
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKeyValuePair();

            state._fsp--;

             after(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectValue__KeyvaluepairAssignment_2_1_1"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalPermissionsOneOf1Parser.g:3306:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3310:1: ( ( ruleEBoolean ) )
            // InternalPermissionsOneOf1Parser.g:3311:2: ( ruleEBoolean )
            {
            // InternalPermissionsOneOf1Parser.g:3311:2: ( ruleEBoolean )
            // InternalPermissionsOneOf1Parser.g:3312:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__KeyValuePair__KeyAssignment_0"
    // InternalPermissionsOneOf1Parser.g:3321:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3325:1: ( ( ruleEString ) )
            // InternalPermissionsOneOf1Parser.g:3326:2: ( ruleEString )
            {
            // InternalPermissionsOneOf1Parser.g:3326:2: ( ruleEString )
            // InternalPermissionsOneOf1Parser.g:3327:3: ruleEString
            {
             before(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__KeyAssignment_0"


    // $ANTLR start "rule__KeyValuePair__ValueAssignment_2"
    // InternalPermissionsOneOf1Parser.g:3336:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPermissionsOneOf1Parser.g:3340:1: ( ( ruleValue ) )
            // InternalPermissionsOneOf1Parser.g:3341:2: ( ruleValue )
            {
            // InternalPermissionsOneOf1Parser.g:3341:2: ( ruleValue )
            // InternalPermissionsOneOf1Parser.g:3342:3: ruleValue
            {
             before(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValuePair__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000201FFF0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001FFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000394FFFF0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000039CFFFF0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000A01FFF0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000801FFF0L});

}