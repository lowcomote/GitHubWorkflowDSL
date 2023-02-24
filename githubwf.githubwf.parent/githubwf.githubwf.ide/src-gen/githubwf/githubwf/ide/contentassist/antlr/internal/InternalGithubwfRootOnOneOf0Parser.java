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
import githubwf.githubwf.services.GithubwfRootOnOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf0Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "On", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=6;
    public static final int True=7;
    public static final int RULE_STRING=15;
    public static final int False=4;
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
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;
    public static final int On=5;

    // delegates
    // delegators


        public InternalGithubwfRootOnOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootOnOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootOnOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf0Parser.g"; }


    	private GithubwfRootOnOneOf0GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("On", "'\"on\"'");
    		tokenNameToValue.put("Null", "'null'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("False", "'false'");
    	}

    	public void setGrammarAccess(GithubwfRootOnOneOf0GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGithubwfRootOnOneOf0"
    // InternalGithubwfRootOnOneOf0Parser.g:65:1: entryRuleGithubwfRootOnOneOf0 : ruleGithubwfRootOnOneOf0 EOF ;
    public final void entryRuleGithubwfRootOnOneOf0() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:66:1: ( ruleGithubwfRootOnOneOf0 EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:67:1: ruleGithubwfRootOnOneOf0 EOF
            {
             before(grammarAccess.getGithubwfRootOnOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf0();

            state._fsp--;

             after(grammarAccess.getGithubwfRootOnOneOf0Rule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf0"


    // $ANTLR start "ruleGithubwfRootOnOneOf0"
    // InternalGithubwfRootOnOneOf0Parser.g:74:1: ruleGithubwfRootOnOneOf0 : ( ( rule__GithubwfRootOnOneOf0__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:78:2: ( ( ( rule__GithubwfRootOnOneOf0__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:79:2: ( ( rule__GithubwfRootOnOneOf0__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:79:2: ( ( rule__GithubwfRootOnOneOf0__Group__0 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:80:3: ( rule__GithubwfRootOnOneOf0__Group__0 )
            {
             before(grammarAccess.getGithubwfRootOnOneOf0Access().getGroup()); 
            // InternalGithubwfRootOnOneOf0Parser.g:81:3: ( rule__GithubwfRootOnOneOf0__Group__0 )
            // InternalGithubwfRootOnOneOf0Parser.g:81:4: rule__GithubwfRootOnOneOf0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGithubwfRootOnOneOf0Access().getGroup()); 

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
    // $ANTLR end "ruleGithubwfRootOnOneOf0"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootOnOneOf0Parser.g:90:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:91:1: ( ruleValue EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:92:1: ruleValue EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:99:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:103:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:104:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:104:2: ( ( rule__Value__Alternatives ) )
            // InternalGithubwfRootOnOneOf0Parser.g:105:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalGithubwfRootOnOneOf0Parser.g:106:3: ( rule__Value__Alternatives )
            // InternalGithubwfRootOnOneOf0Parser.g:106:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleEvent"
    // InternalGithubwfRootOnOneOf0Parser.g:115:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:116:1: ( ruleEvent EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:117:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalGithubwfRootOnOneOf0Parser.g:124:1: ruleEvent : ( ( rule__Event__EventAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:128:2: ( ( ( rule__Event__EventAssignment ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:129:2: ( ( rule__Event__EventAssignment ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:129:2: ( ( rule__Event__EventAssignment ) )
            // InternalGithubwfRootOnOneOf0Parser.g:130:3: ( rule__Event__EventAssignment )
            {
             before(grammarAccess.getEventAccess().getEventAssignment()); 
            // InternalGithubwfRootOnOneOf0Parser.g:131:3: ( rule__Event__EventAssignment )
            // InternalGithubwfRootOnOneOf0Parser.g:131:4: rule__Event__EventAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Event__EventAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventAssignment()); 

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfRootOnOneOf0Parser.g:140:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:141:1: ( ruleJsonDocument EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:142:1: ruleJsonDocument EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:149:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:153:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:154:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:154:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf0Parser.g:155:3: ( rule__JsonDocument__ValueAssignment )
            {
             before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf0Parser.g:156:3: ( rule__JsonDocument__ValueAssignment )
            // InternalGithubwfRootOnOneOf0Parser.g:156:4: rule__JsonDocument__ValueAssignment
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
    // InternalGithubwfRootOnOneOf0Parser.g:165:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:166:1: ( ruleStringValue EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:167:1: ruleStringValue EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:174:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:178:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:179:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:179:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf0Parser.g:180:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf0Parser.g:181:3: ( rule__StringValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf0Parser.g:181:4: rule__StringValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf0Parser.g:190:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:191:1: ( ruleArrayValue EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:192:1: ruleArrayValue EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:199:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:203:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:204:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:204:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:205:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalGithubwfRootOnOneOf0Parser.g:206:3: ( rule__ArrayValue__Group__0 )
            // InternalGithubwfRootOnOneOf0Parser.g:206:4: rule__ArrayValue__Group__0
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
    // InternalGithubwfRootOnOneOf0Parser.g:215:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:216:1: ( ruleNullValue EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:217:1: ruleNullValue EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:224:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:228:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:229:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:229:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf0Parser.g:230:3: ( rule__NullValue__ValueAssignment )
            {
             before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf0Parser.g:231:3: ( rule__NullValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf0Parser.g:231:4: rule__NullValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf0Parser.g:240:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:241:1: ( ruleNumberValue EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:242:1: ruleNumberValue EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:249:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:253:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:254:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:254:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf0Parser.g:255:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf0Parser.g:256:3: ( rule__NumberValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf0Parser.g:256:4: rule__NumberValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf0Parser.g:265:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:266:1: ( ruleObjectValue EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:267:1: ruleObjectValue EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:274:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:278:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:279:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:279:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:280:3: ( rule__ObjectValue__Group__0 )
            {
             before(grammarAccess.getObjectValueAccess().getGroup()); 
            // InternalGithubwfRootOnOneOf0Parser.g:281:3: ( rule__ObjectValue__Group__0 )
            // InternalGithubwfRootOnOneOf0Parser.g:281:4: rule__ObjectValue__Group__0
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
    // InternalGithubwfRootOnOneOf0Parser.g:290:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:291:1: ( ruleBooleanValue EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:292:1: ruleBooleanValue EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:299:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:303:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:304:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:304:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf0Parser.g:305:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf0Parser.g:306:3: ( rule__BooleanValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf0Parser.g:306:4: rule__BooleanValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf0Parser.g:315:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:316:1: ( ruleEString EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:317:1: ruleEString EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:324:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:328:2: ( ( ruleVALID_STRING ) )
            // InternalGithubwfRootOnOneOf0Parser.g:329:2: ( ruleVALID_STRING )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:329:2: ( ruleVALID_STRING )
            // InternalGithubwfRootOnOneOf0Parser.g:330:3: ruleVALID_STRING
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
    // InternalGithubwfRootOnOneOf0Parser.g:340:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:341:1: ( ruleEDouble EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:342:1: ruleEDouble EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:349:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:353:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:354:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:354:2: ( ( rule__EDouble__Alternatives ) )
            // InternalGithubwfRootOnOneOf0Parser.g:355:3: ( rule__EDouble__Alternatives )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            // InternalGithubwfRootOnOneOf0Parser.g:356:3: ( rule__EDouble__Alternatives )
            // InternalGithubwfRootOnOneOf0Parser.g:356:4: rule__EDouble__Alternatives
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
    // InternalGithubwfRootOnOneOf0Parser.g:365:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:366:1: ( ruleKeyValuePair EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:367:1: ruleKeyValuePair EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:374:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:378:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:379:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:379:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:380:3: ( rule__KeyValuePair__Group__0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            // InternalGithubwfRootOnOneOf0Parser.g:381:3: ( rule__KeyValuePair__Group__0 )
            // InternalGithubwfRootOnOneOf0Parser.g:381:4: rule__KeyValuePair__Group__0
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
    // InternalGithubwfRootOnOneOf0Parser.g:390:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:391:1: ( ruleEBoolean EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:392:1: ruleEBoolean EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:399:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:403:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:404:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:404:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalGithubwfRootOnOneOf0Parser.g:405:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalGithubwfRootOnOneOf0Parser.g:406:3: ( rule__EBoolean__Alternatives )
            // InternalGithubwfRootOnOneOf0Parser.g:406:4: rule__EBoolean__Alternatives
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
    // InternalGithubwfRootOnOneOf0Parser.g:415:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:416:1: ( ruleVALID_STRING EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:417:1: ruleVALID_STRING EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:424:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:428:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:429:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:429:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalGithubwfRootOnOneOf0Parser.g:430:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalGithubwfRootOnOneOf0Parser.g:431:3: ( rule__VALID_STRING__Alternatives )
            // InternalGithubwfRootOnOneOf0Parser.g:431:4: rule__VALID_STRING__Alternatives
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
    // InternalGithubwfRootOnOneOf0Parser.g:440:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:441:1: ( ruleKEYWORD EOF )
            // InternalGithubwfRootOnOneOf0Parser.g:442:1: ruleKEYWORD EOF
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
    // InternalGithubwfRootOnOneOf0Parser.g:449:1: ruleKEYWORD : ( On ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:453:2: ( ( On ) )
            // InternalGithubwfRootOnOneOf0Parser.g:454:2: ( On )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:454:2: ( On )
            // InternalGithubwfRootOnOneOf0Parser.g:455:3: On
            {
             before(grammarAccess.getKEYWORDAccess().getOnKeyword()); 
            match(input,On,FOLLOW_2); 
             after(grammarAccess.getKEYWORDAccess().getOnKeyword()); 

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
    // InternalGithubwfRootOnOneOf0Parser.g:465:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:469:1: ( ( ( Null ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:470:2: ( ( Null ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:470:2: ( ( Null ) )
            // InternalGithubwfRootOnOneOf0Parser.g:471:3: ( Null )
            {
             before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            // InternalGithubwfRootOnOneOf0Parser.g:472:3: ( Null )
            // InternalGithubwfRootOnOneOf0Parser.g:472:4: Null
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


    // $ANTLR start "rule__Value__Alternatives"
    // InternalGithubwfRootOnOneOf0Parser.g:480:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:484:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case On:
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt1=2;
                }
                break;
            case Null:
                {
                alt1=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt1=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt1=5;
                }
                break;
            case False:
            case True:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Parser.g:485:2: ( ruleStringValue )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:485:2: ( ruleStringValue )
                    // InternalGithubwfRootOnOneOf0Parser.g:486:3: ruleStringValue
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
                    // InternalGithubwfRootOnOneOf0Parser.g:491:2: ( ruleArrayValue )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:491:2: ( ruleArrayValue )
                    // InternalGithubwfRootOnOneOf0Parser.g:492:3: ruleArrayValue
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
                    // InternalGithubwfRootOnOneOf0Parser.g:497:2: ( ruleNullValue )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:497:2: ( ruleNullValue )
                    // InternalGithubwfRootOnOneOf0Parser.g:498:3: ruleNullValue
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
                    // InternalGithubwfRootOnOneOf0Parser.g:503:2: ( ruleNumberValue )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:503:2: ( ruleNumberValue )
                    // InternalGithubwfRootOnOneOf0Parser.g:504:3: ruleNumberValue
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
                    // InternalGithubwfRootOnOneOf0Parser.g:509:2: ( ruleObjectValue )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:509:2: ( ruleObjectValue )
                    // InternalGithubwfRootOnOneOf0Parser.g:510:3: ruleObjectValue
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
                    // InternalGithubwfRootOnOneOf0Parser.g:515:2: ( ruleBooleanValue )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:515:2: ( ruleBooleanValue )
                    // InternalGithubwfRootOnOneOf0Parser.g:516:3: ruleBooleanValue
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
    // InternalGithubwfRootOnOneOf0Parser.g:525:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:529:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_E_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_E_DOUBLE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Parser.g:530:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:530:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf0Parser.g:531:3: RULE_E_INT
                    {
                     before(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 
                    match(input,RULE_E_INT,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf0Parser.g:536:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:536:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf0Parser.g:537:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf0Parser.g:546:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:550:1: ( ( True ) | ( False ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==True) ) {
                alt3=1;
            }
            else if ( (LA3_0==False) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Parser.g:551:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:551:2: ( True )
                    // InternalGithubwfRootOnOneOf0Parser.g:552:3: True
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf0Parser.g:557:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:557:2: ( False )
                    // InternalGithubwfRootOnOneOf0Parser.g:558:3: False
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
    // InternalGithubwfRootOnOneOf0Parser.g:567:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:571:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==On) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Parser.g:572:2: ( RULE_STRING )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:572:2: ( RULE_STRING )
                    // InternalGithubwfRootOnOneOf0Parser.g:573:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf0Parser.g:578:2: ( ruleKEYWORD )
                    {
                    // InternalGithubwfRootOnOneOf0Parser.g:578:2: ( ruleKEYWORD )
                    // InternalGithubwfRootOnOneOf0Parser.g:579:3: ruleKEYWORD
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


    // $ANTLR start "rule__GithubwfRootOnOneOf0__Group__0"
    // InternalGithubwfRootOnOneOf0Parser.g:588:1: rule__GithubwfRootOnOneOf0__Group__0 : rule__GithubwfRootOnOneOf0__Group__0__Impl rule__GithubwfRootOnOneOf0__Group__1 ;
    public final void rule__GithubwfRootOnOneOf0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:592:1: ( rule__GithubwfRootOnOneOf0__Group__0__Impl rule__GithubwfRootOnOneOf0__Group__1 )
            // InternalGithubwfRootOnOneOf0Parser.g:593:2: rule__GithubwfRootOnOneOf0__Group__0__Impl rule__GithubwfRootOnOneOf0__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GithubwfRootOnOneOf0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf0__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf0__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf0__Group__0__Impl"
    // InternalGithubwfRootOnOneOf0Parser.g:600:1: rule__GithubwfRootOnOneOf0__Group__0__Impl : ( On ) ;
    public final void rule__GithubwfRootOnOneOf0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:604:1: ( ( On ) )
            // InternalGithubwfRootOnOneOf0Parser.g:605:1: ( On )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:605:1: ( On )
            // InternalGithubwfRootOnOneOf0Parser.g:606:2: On
            {
             before(grammarAccess.getGithubwfRootOnOneOf0Access().getOnKeyword_0()); 
            match(input,On,FOLLOW_2); 
             after(grammarAccess.getGithubwfRootOnOneOf0Access().getOnKeyword_0()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf0__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf0__Group__1"
    // InternalGithubwfRootOnOneOf0Parser.g:615:1: rule__GithubwfRootOnOneOf0__Group__1 : rule__GithubwfRootOnOneOf0__Group__1__Impl rule__GithubwfRootOnOneOf0__Group__2 ;
    public final void rule__GithubwfRootOnOneOf0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:619:1: ( rule__GithubwfRootOnOneOf0__Group__1__Impl rule__GithubwfRootOnOneOf0__Group__2 )
            // InternalGithubwfRootOnOneOf0Parser.g:620:2: rule__GithubwfRootOnOneOf0__Group__1__Impl rule__GithubwfRootOnOneOf0__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf0__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf0__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf0__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf0__Group__1__Impl"
    // InternalGithubwfRootOnOneOf0Parser.g:627:1: rule__GithubwfRootOnOneOf0__Group__1__Impl : ( Colon ) ;
    public final void rule__GithubwfRootOnOneOf0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:631:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf0Parser.g:632:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:632:1: ( Colon )
            // InternalGithubwfRootOnOneOf0Parser.g:633:2: Colon
            {
             before(grammarAccess.getGithubwfRootOnOneOf0Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGithubwfRootOnOneOf0Access().getColonKeyword_1()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf0__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf0__Group__2"
    // InternalGithubwfRootOnOneOf0Parser.g:642:1: rule__GithubwfRootOnOneOf0__Group__2 : rule__GithubwfRootOnOneOf0__Group__2__Impl ;
    public final void rule__GithubwfRootOnOneOf0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:646:1: ( rule__GithubwfRootOnOneOf0__Group__2__Impl )
            // InternalGithubwfRootOnOneOf0Parser.g:647:2: rule__GithubwfRootOnOneOf0__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf0__Group__2__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf0__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf0__Group__2__Impl"
    // InternalGithubwfRootOnOneOf0Parser.g:653:1: rule__GithubwfRootOnOneOf0__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf0__OnAssignment_2 ) ) ;
    public final void rule__GithubwfRootOnOneOf0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:657:1: ( ( ( rule__GithubwfRootOnOneOf0__OnAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:658:1: ( ( rule__GithubwfRootOnOneOf0__OnAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:658:1: ( ( rule__GithubwfRootOnOneOf0__OnAssignment_2 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:659:2: ( rule__GithubwfRootOnOneOf0__OnAssignment_2 )
            {
             before(grammarAccess.getGithubwfRootOnOneOf0Access().getOnAssignment_2()); 
            // InternalGithubwfRootOnOneOf0Parser.g:660:2: ( rule__GithubwfRootOnOneOf0__OnAssignment_2 )
            // InternalGithubwfRootOnOneOf0Parser.g:660:3: rule__GithubwfRootOnOneOf0__OnAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf0__OnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGithubwfRootOnOneOf0Access().getOnAssignment_2()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf0__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalGithubwfRootOnOneOf0Parser.g:669:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:673:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalGithubwfRootOnOneOf0Parser.g:674:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGithubwfRootOnOneOf0Parser.g:681:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:685:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf0Parser.g:686:1: ( () )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:686:1: ( () )
            // InternalGithubwfRootOnOneOf0Parser.g:687:2: ()
            {
             before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            // InternalGithubwfRootOnOneOf0Parser.g:688:2: ()
            // InternalGithubwfRootOnOneOf0Parser.g:688:3: 
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
    // InternalGithubwfRootOnOneOf0Parser.g:696:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:700:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalGithubwfRootOnOneOf0Parser.g:701:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalGithubwfRootOnOneOf0Parser.g:708:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:712:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf0Parser.g:713:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:713:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf0Parser.g:714:2: LeftSquareBracket
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
    // InternalGithubwfRootOnOneOf0Parser.g:723:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:727:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalGithubwfRootOnOneOf0Parser.g:728:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalGithubwfRootOnOneOf0Parser.g:735:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:739:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf0Parser.g:740:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:740:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf0Parser.g:741:2: ( rule__ArrayValue__Group_2__0 )?
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalGithubwfRootOnOneOf0Parser.g:742:2: ( rule__ArrayValue__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=False && LA5_0<=True)||LA5_0==LeftSquareBracket||LA5_0==LeftCurlyBracket||(LA5_0>=RULE_STRING && LA5_0<=RULE_E_DOUBLE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Parser.g:742:3: rule__ArrayValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf0Parser.g:750:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:754:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf0Parser.g:755:2: rule__ArrayValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf0Parser.g:761:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:765:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf0Parser.g:766:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:766:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf0Parser.g:767:2: RightSquareBracket
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
    // InternalGithubwfRootOnOneOf0Parser.g:777:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:781:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf0Parser.g:782:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGithubwfRootOnOneOf0Parser.g:789:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:793:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:794:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:794:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:795:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            // InternalGithubwfRootOnOneOf0Parser.g:796:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalGithubwfRootOnOneOf0Parser.g:796:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalGithubwfRootOnOneOf0Parser.g:804:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:808:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf0Parser.g:809:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf0Parser.g:815:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:819:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf0Parser.g:820:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:820:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf0Parser.g:821:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            // InternalGithubwfRootOnOneOf0Parser.g:822:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Comma) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf0Parser.g:822:3: rule__ArrayValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ArrayValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalGithubwfRootOnOneOf0Parser.g:831:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:835:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf0Parser.g:836:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGithubwfRootOnOneOf0Parser.g:843:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:847:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf0Parser.g:848:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:848:1: ( Comma )
            // InternalGithubwfRootOnOneOf0Parser.g:849:2: Comma
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
    // InternalGithubwfRootOnOneOf0Parser.g:858:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:862:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf0Parser.g:863:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf0Parser.g:869:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:873:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:874:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:874:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:875:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            // InternalGithubwfRootOnOneOf0Parser.g:876:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf0Parser.g:876:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf0Parser.g:885:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:889:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGithubwfRootOnOneOf0Parser.g:890:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGithubwfRootOnOneOf0Parser.g:897:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:901:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf0Parser.g:902:1: ( () )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:902:1: ( () )
            // InternalGithubwfRootOnOneOf0Parser.g:903:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalGithubwfRootOnOneOf0Parser.g:904:2: ()
            // InternalGithubwfRootOnOneOf0Parser.g:904:3: 
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
    // InternalGithubwfRootOnOneOf0Parser.g:912:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:916:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGithubwfRootOnOneOf0Parser.g:917:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGithubwfRootOnOneOf0Parser.g:924:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:928:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf0Parser.g:929:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:929:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf0Parser.g:930:2: LeftCurlyBracket
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
    // InternalGithubwfRootOnOneOf0Parser.g:939:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:943:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGithubwfRootOnOneOf0Parser.g:944:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalGithubwfRootOnOneOf0Parser.g:951:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:955:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf0Parser.g:956:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:956:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf0Parser.g:957:2: ( rule__ObjectValue__Group_2__0 )?
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            // InternalGithubwfRootOnOneOf0Parser.g:958:2: ( rule__ObjectValue__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==On||LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootOnOneOf0Parser.g:958:3: rule__ObjectValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf0Parser.g:966:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:970:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf0Parser.g:971:2: rule__ObjectValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf0Parser.g:977:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:981:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf0Parser.g:982:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:982:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf0Parser.g:983:2: RightCurlyBracket
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
    // InternalGithubwfRootOnOneOf0Parser.g:993:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:997:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf0Parser.g:998:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGithubwfRootOnOneOf0Parser.g:1005:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1009:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1010:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1010:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1011:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            // InternalGithubwfRootOnOneOf0Parser.g:1012:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalGithubwfRootOnOneOf0Parser.g:1012:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalGithubwfRootOnOneOf0Parser.g:1020:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1024:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf0Parser.g:1025:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf0Parser.g:1031:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1035:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1036:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1036:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf0Parser.g:1037:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            // InternalGithubwfRootOnOneOf0Parser.g:1038:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf0Parser.g:1038:3: rule__ObjectValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ObjectValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalGithubwfRootOnOneOf0Parser.g:1047:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1051:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf0Parser.g:1052:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGithubwfRootOnOneOf0Parser.g:1059:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1063:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1064:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1064:1: ( Comma )
            // InternalGithubwfRootOnOneOf0Parser.g:1065:2: Comma
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
    // InternalGithubwfRootOnOneOf0Parser.g:1074:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1078:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf0Parser.g:1079:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf0Parser.g:1085:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1089:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1090:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1090:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1091:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            // InternalGithubwfRootOnOneOf0Parser.g:1092:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf0Parser.g:1092:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf0Parser.g:1101:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1105:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalGithubwfRootOnOneOf0Parser.g:1106:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalGithubwfRootOnOneOf0Parser.g:1113:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1117:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1118:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1118:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1119:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            // InternalGithubwfRootOnOneOf0Parser.g:1120:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf0Parser.g:1120:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalGithubwfRootOnOneOf0Parser.g:1128:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1132:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalGithubwfRootOnOneOf0Parser.g:1133:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalGithubwfRootOnOneOf0Parser.g:1140:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1144:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1145:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1145:1: ( Colon )
            // InternalGithubwfRootOnOneOf0Parser.g:1146:2: Colon
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
    // InternalGithubwfRootOnOneOf0Parser.g:1155:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1159:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalGithubwfRootOnOneOf0Parser.g:1160:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalGithubwfRootOnOneOf0Parser.g:1166:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1170:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1171:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1171:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1172:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            // InternalGithubwfRootOnOneOf0Parser.g:1173:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalGithubwfRootOnOneOf0Parser.g:1173:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__GithubwfRootOnOneOf0__OnAssignment_2"
    // InternalGithubwfRootOnOneOf0Parser.g:1182:1: rule__GithubwfRootOnOneOf0__OnAssignment_2 : ( ruleEvent ) ;
    public final void rule__GithubwfRootOnOneOf0__OnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1186:1: ( ( ruleEvent ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1187:2: ( ruleEvent )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1187:2: ( ruleEvent )
            // InternalGithubwfRootOnOneOf0Parser.g:1188:3: ruleEvent
            {
             before(grammarAccess.getGithubwfRootOnOneOf0Access().getOnEventParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getGithubwfRootOnOneOf0Access().getOnEventParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf0__OnAssignment_2"


    // $ANTLR start "rule__Event__EventAssignment"
    // InternalGithubwfRootOnOneOf0Parser.g:1197:1: rule__Event__EventAssignment : ( ruleJsonDocument ) ;
    public final void rule__Event__EventAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1201:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1202:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1202:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf0Parser.g:1203:3: ruleJsonDocument
            {
             before(grammarAccess.getEventAccess().getEventJsonDocumentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getEventAccess().getEventJsonDocumentParserRuleCall_0()); 

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
    // $ANTLR end "rule__Event__EventAssignment"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalGithubwfRootOnOneOf0Parser.g:1212:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1216:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1217:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1217:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf0Parser.g:1218:3: ruleValue
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
    // InternalGithubwfRootOnOneOf0Parser.g:1227:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1231:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1232:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1232:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf0Parser.g:1233:3: ruleEString
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
    // InternalGithubwfRootOnOneOf0Parser.g:1242:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1246:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1247:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1247:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf0Parser.g:1248:3: ruleValue
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
    // InternalGithubwfRootOnOneOf0Parser.g:1257:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1261:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1262:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1262:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf0Parser.g:1263:3: ruleValue
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
    // InternalGithubwfRootOnOneOf0Parser.g:1272:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1276:1: ( ( ruleNullEnum ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1277:2: ( ruleNullEnum )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1277:2: ( ruleNullEnum )
            // InternalGithubwfRootOnOneOf0Parser.g:1278:3: ruleNullEnum
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
    // InternalGithubwfRootOnOneOf0Parser.g:1287:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1291:1: ( ( ruleEDouble ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1292:2: ( ruleEDouble )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1292:2: ( ruleEDouble )
            // InternalGithubwfRootOnOneOf0Parser.g:1293:3: ruleEDouble
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
    // InternalGithubwfRootOnOneOf0Parser.g:1302:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1306:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1307:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1307:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf0Parser.g:1308:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf0Parser.g:1317:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1321:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1322:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1322:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf0Parser.g:1323:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf0Parser.g:1332:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1336:1: ( ( ruleEBoolean ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1337:2: ( ruleEBoolean )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1337:2: ( ruleEBoolean )
            // InternalGithubwfRootOnOneOf0Parser.g:1338:3: ruleEBoolean
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
    // InternalGithubwfRootOnOneOf0Parser.g:1347:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1351:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1352:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1352:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf0Parser.g:1353:3: ruleEString
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
    // InternalGithubwfRootOnOneOf0Parser.g:1362:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf0Parser.g:1366:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf0Parser.g:1367:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf0Parser.g:1367:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf0Parser.g:1368:3: ruleValue
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008020L});

}