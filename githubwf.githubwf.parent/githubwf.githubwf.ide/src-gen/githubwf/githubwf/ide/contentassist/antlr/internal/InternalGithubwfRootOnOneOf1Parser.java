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
import githubwf.githubwf.services.GithubwfRootOnOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf1Parser extends AbstractInternalContentAssistParser {
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


        public InternalGithubwfRootOnOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootOnOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootOnOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf1Parser.g"; }


    	private GithubwfRootOnOneOf1GrammarAccess grammarAccess;
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

    	public void setGrammarAccess(GithubwfRootOnOneOf1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGithubwfRootOnOneOf1"
    // InternalGithubwfRootOnOneOf1Parser.g:65:1: entryRuleGithubwfRootOnOneOf1 : ruleGithubwfRootOnOneOf1 EOF ;
    public final void entryRuleGithubwfRootOnOneOf1() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:66:1: ( ruleGithubwfRootOnOneOf1 EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:67:1: ruleGithubwfRootOnOneOf1 EOF
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf1();

            state._fsp--;

             after(grammarAccess.getGithubwfRootOnOneOf1Rule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf1"


    // $ANTLR start "ruleGithubwfRootOnOneOf1"
    // InternalGithubwfRootOnOneOf1Parser.g:74:1: ruleGithubwfRootOnOneOf1 : ( ( rule__GithubwfRootOnOneOf1__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:78:2: ( ( ( rule__GithubwfRootOnOneOf1__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:79:2: ( ( rule__GithubwfRootOnOneOf1__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:79:2: ( ( rule__GithubwfRootOnOneOf1__Group__0 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:80:3: ( rule__GithubwfRootOnOneOf1__Group__0 )
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getGroup()); 
            // InternalGithubwfRootOnOneOf1Parser.g:81:3: ( rule__GithubwfRootOnOneOf1__Group__0 )
            // InternalGithubwfRootOnOneOf1Parser.g:81:4: rule__GithubwfRootOnOneOf1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGithubwfRootOnOneOf1Access().getGroup()); 

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
    // $ANTLR end "ruleGithubwfRootOnOneOf1"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootOnOneOf1Parser.g:90:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:91:1: ( ruleValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:92:1: ruleValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:99:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:103:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:104:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:104:2: ( ( rule__Value__Alternatives ) )
            // InternalGithubwfRootOnOneOf1Parser.g:105:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalGithubwfRootOnOneOf1Parser.g:106:3: ( rule__Value__Alternatives )
            // InternalGithubwfRootOnOneOf1Parser.g:106:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf1Items"
    // InternalGithubwfRootOnOneOf1Parser.g:115:1: entryRuleGithubwfRootOnOneOf1Items : ruleGithubwfRootOnOneOf1Items EOF ;
    public final void entryRuleGithubwfRootOnOneOf1Items() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:116:1: ( ruleGithubwfRootOnOneOf1Items EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:117:1: ruleGithubwfRootOnOneOf1Items EOF
            {
             before(grammarAccess.getGithubwfRootOnOneOf1ItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf1Items();

            state._fsp--;

             after(grammarAccess.getGithubwfRootOnOneOf1ItemsRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf1Items"


    // $ANTLR start "ruleGithubwfRootOnOneOf1Items"
    // InternalGithubwfRootOnOneOf1Parser.g:124:1: ruleGithubwfRootOnOneOf1Items : ( ( rule__GithubwfRootOnOneOf1Items__ItemsAssignment ) ) ;
    public final void ruleGithubwfRootOnOneOf1Items() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:128:2: ( ( ( rule__GithubwfRootOnOneOf1Items__ItemsAssignment ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:129:2: ( ( rule__GithubwfRootOnOneOf1Items__ItemsAssignment ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:129:2: ( ( rule__GithubwfRootOnOneOf1Items__ItemsAssignment ) )
            // InternalGithubwfRootOnOneOf1Parser.g:130:3: ( rule__GithubwfRootOnOneOf1Items__ItemsAssignment )
            {
             before(grammarAccess.getGithubwfRootOnOneOf1ItemsAccess().getItemsAssignment()); 
            // InternalGithubwfRootOnOneOf1Parser.g:131:3: ( rule__GithubwfRootOnOneOf1Items__ItemsAssignment )
            // InternalGithubwfRootOnOneOf1Parser.g:131:4: rule__GithubwfRootOnOneOf1Items__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1Items__ItemsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGithubwfRootOnOneOf1ItemsAccess().getItemsAssignment()); 

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
    // $ANTLR end "ruleGithubwfRootOnOneOf1Items"


    // $ANTLR start "entryRuleEvent"
    // InternalGithubwfRootOnOneOf1Parser.g:140:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:141:1: ( ruleEvent EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:142:1: ruleEvent EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:149:1: ruleEvent : ( ( rule__Event__EventAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:153:2: ( ( ( rule__Event__EventAssignment ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:154:2: ( ( rule__Event__EventAssignment ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:154:2: ( ( rule__Event__EventAssignment ) )
            // InternalGithubwfRootOnOneOf1Parser.g:155:3: ( rule__Event__EventAssignment )
            {
             before(grammarAccess.getEventAccess().getEventAssignment()); 
            // InternalGithubwfRootOnOneOf1Parser.g:156:3: ( rule__Event__EventAssignment )
            // InternalGithubwfRootOnOneOf1Parser.g:156:4: rule__Event__EventAssignment
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
    // InternalGithubwfRootOnOneOf1Parser.g:165:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:166:1: ( ruleJsonDocument EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:167:1: ruleJsonDocument EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:174:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:178:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:179:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:179:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf1Parser.g:180:3: ( rule__JsonDocument__ValueAssignment )
            {
             before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf1Parser.g:181:3: ( rule__JsonDocument__ValueAssignment )
            // InternalGithubwfRootOnOneOf1Parser.g:181:4: rule__JsonDocument__ValueAssignment
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
    // InternalGithubwfRootOnOneOf1Parser.g:190:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:191:1: ( ruleStringValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:192:1: ruleStringValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:199:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:203:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:204:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:204:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf1Parser.g:205:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf1Parser.g:206:3: ( rule__StringValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf1Parser.g:206:4: rule__StringValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf1Parser.g:215:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:216:1: ( ruleArrayValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:217:1: ruleArrayValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:224:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:228:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:229:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:229:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:230:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalGithubwfRootOnOneOf1Parser.g:231:3: ( rule__ArrayValue__Group__0 )
            // InternalGithubwfRootOnOneOf1Parser.g:231:4: rule__ArrayValue__Group__0
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
    // InternalGithubwfRootOnOneOf1Parser.g:240:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:241:1: ( ruleNullValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:242:1: ruleNullValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:249:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:253:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:254:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:254:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf1Parser.g:255:3: ( rule__NullValue__ValueAssignment )
            {
             before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf1Parser.g:256:3: ( rule__NullValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf1Parser.g:256:4: rule__NullValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf1Parser.g:265:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:266:1: ( ruleNumberValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:267:1: ruleNumberValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:274:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:278:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:279:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:279:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf1Parser.g:280:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf1Parser.g:281:3: ( rule__NumberValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf1Parser.g:281:4: rule__NumberValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf1Parser.g:290:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:291:1: ( ruleObjectValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:292:1: ruleObjectValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:299:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:303:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:304:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:304:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:305:3: ( rule__ObjectValue__Group__0 )
            {
             before(grammarAccess.getObjectValueAccess().getGroup()); 
            // InternalGithubwfRootOnOneOf1Parser.g:306:3: ( rule__ObjectValue__Group__0 )
            // InternalGithubwfRootOnOneOf1Parser.g:306:4: rule__ObjectValue__Group__0
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
    // InternalGithubwfRootOnOneOf1Parser.g:315:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:316:1: ( ruleBooleanValue EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:317:1: ruleBooleanValue EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:324:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:328:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:329:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:329:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf1Parser.g:330:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalGithubwfRootOnOneOf1Parser.g:331:3: ( rule__BooleanValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf1Parser.g:331:4: rule__BooleanValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf1Parser.g:340:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:341:1: ( ruleEString EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:342:1: ruleEString EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:349:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:353:2: ( ( ruleVALID_STRING ) )
            // InternalGithubwfRootOnOneOf1Parser.g:354:2: ( ruleVALID_STRING )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:354:2: ( ruleVALID_STRING )
            // InternalGithubwfRootOnOneOf1Parser.g:355:3: ruleVALID_STRING
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
    // InternalGithubwfRootOnOneOf1Parser.g:365:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:366:1: ( ruleEDouble EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:367:1: ruleEDouble EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:374:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:378:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:379:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:379:2: ( ( rule__EDouble__Alternatives ) )
            // InternalGithubwfRootOnOneOf1Parser.g:380:3: ( rule__EDouble__Alternatives )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            // InternalGithubwfRootOnOneOf1Parser.g:381:3: ( rule__EDouble__Alternatives )
            // InternalGithubwfRootOnOneOf1Parser.g:381:4: rule__EDouble__Alternatives
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
    // InternalGithubwfRootOnOneOf1Parser.g:390:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:391:1: ( ruleKeyValuePair EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:392:1: ruleKeyValuePair EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:399:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:403:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:404:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:404:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:405:3: ( rule__KeyValuePair__Group__0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            // InternalGithubwfRootOnOneOf1Parser.g:406:3: ( rule__KeyValuePair__Group__0 )
            // InternalGithubwfRootOnOneOf1Parser.g:406:4: rule__KeyValuePair__Group__0
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
    // InternalGithubwfRootOnOneOf1Parser.g:415:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:416:1: ( ruleEBoolean EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:417:1: ruleEBoolean EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:424:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:428:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:429:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:429:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalGithubwfRootOnOneOf1Parser.g:430:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalGithubwfRootOnOneOf1Parser.g:431:3: ( rule__EBoolean__Alternatives )
            // InternalGithubwfRootOnOneOf1Parser.g:431:4: rule__EBoolean__Alternatives
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
    // InternalGithubwfRootOnOneOf1Parser.g:440:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:441:1: ( ruleVALID_STRING EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:442:1: ruleVALID_STRING EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:449:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:453:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:454:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:454:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalGithubwfRootOnOneOf1Parser.g:455:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalGithubwfRootOnOneOf1Parser.g:456:3: ( rule__VALID_STRING__Alternatives )
            // InternalGithubwfRootOnOneOf1Parser.g:456:4: rule__VALID_STRING__Alternatives
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
    // InternalGithubwfRootOnOneOf1Parser.g:465:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:466:1: ( ruleKEYWORD EOF )
            // InternalGithubwfRootOnOneOf1Parser.g:467:1: ruleKEYWORD EOF
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
    // InternalGithubwfRootOnOneOf1Parser.g:474:1: ruleKEYWORD : ( On ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:478:2: ( ( On ) )
            // InternalGithubwfRootOnOneOf1Parser.g:479:2: ( On )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:479:2: ( On )
            // InternalGithubwfRootOnOneOf1Parser.g:480:3: On
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
    // InternalGithubwfRootOnOneOf1Parser.g:490:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:494:1: ( ( ( Null ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:495:2: ( ( Null ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:495:2: ( ( Null ) )
            // InternalGithubwfRootOnOneOf1Parser.g:496:3: ( Null )
            {
             before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            // InternalGithubwfRootOnOneOf1Parser.g:497:3: ( Null )
            // InternalGithubwfRootOnOneOf1Parser.g:497:4: Null
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
    // InternalGithubwfRootOnOneOf1Parser.g:505:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:509:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
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
                    // InternalGithubwfRootOnOneOf1Parser.g:510:2: ( ruleStringValue )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:510:2: ( ruleStringValue )
                    // InternalGithubwfRootOnOneOf1Parser.g:511:3: ruleStringValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:516:2: ( ruleArrayValue )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:516:2: ( ruleArrayValue )
                    // InternalGithubwfRootOnOneOf1Parser.g:517:3: ruleArrayValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:522:2: ( ruleNullValue )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:522:2: ( ruleNullValue )
                    // InternalGithubwfRootOnOneOf1Parser.g:523:3: ruleNullValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:528:2: ( ruleNumberValue )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:528:2: ( ruleNumberValue )
                    // InternalGithubwfRootOnOneOf1Parser.g:529:3: ruleNumberValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:534:2: ( ruleObjectValue )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:534:2: ( ruleObjectValue )
                    // InternalGithubwfRootOnOneOf1Parser.g:535:3: ruleObjectValue
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
                    // InternalGithubwfRootOnOneOf1Parser.g:540:2: ( ruleBooleanValue )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:540:2: ( ruleBooleanValue )
                    // InternalGithubwfRootOnOneOf1Parser.g:541:3: ruleBooleanValue
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
    // InternalGithubwfRootOnOneOf1Parser.g:550:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:554:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalGithubwfRootOnOneOf1Parser.g:555:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:555:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf1Parser.g:556:3: RULE_E_INT
                    {
                     before(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 
                    match(input,RULE_E_INT,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf1Parser.g:561:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:561:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf1Parser.g:562:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf1Parser.g:571:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:575:1: ( ( True ) | ( False ) )
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
                    // InternalGithubwfRootOnOneOf1Parser.g:576:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:576:2: ( True )
                    // InternalGithubwfRootOnOneOf1Parser.g:577:3: True
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf1Parser.g:582:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:582:2: ( False )
                    // InternalGithubwfRootOnOneOf1Parser.g:583:3: False
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
    // InternalGithubwfRootOnOneOf1Parser.g:592:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:596:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
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
                    // InternalGithubwfRootOnOneOf1Parser.g:597:2: ( RULE_STRING )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:597:2: ( RULE_STRING )
                    // InternalGithubwfRootOnOneOf1Parser.g:598:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf1Parser.g:603:2: ( ruleKEYWORD )
                    {
                    // InternalGithubwfRootOnOneOf1Parser.g:603:2: ( ruleKEYWORD )
                    // InternalGithubwfRootOnOneOf1Parser.g:604:3: ruleKEYWORD
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


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__0"
    // InternalGithubwfRootOnOneOf1Parser.g:613:1: rule__GithubwfRootOnOneOf1__Group__0 : rule__GithubwfRootOnOneOf1__Group__0__Impl rule__GithubwfRootOnOneOf1__Group__1 ;
    public final void rule__GithubwfRootOnOneOf1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:617:1: ( rule__GithubwfRootOnOneOf1__Group__0__Impl rule__GithubwfRootOnOneOf1__Group__1 )
            // InternalGithubwfRootOnOneOf1Parser.g:618:2: rule__GithubwfRootOnOneOf1__Group__0__Impl rule__GithubwfRootOnOneOf1__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GithubwfRootOnOneOf1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__0__Impl"
    // InternalGithubwfRootOnOneOf1Parser.g:625:1: rule__GithubwfRootOnOneOf1__Group__0__Impl : ( On ) ;
    public final void rule__GithubwfRootOnOneOf1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:629:1: ( ( On ) )
            // InternalGithubwfRootOnOneOf1Parser.g:630:1: ( On )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:630:1: ( On )
            // InternalGithubwfRootOnOneOf1Parser.g:631:2: On
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getOnKeyword_0()); 
            match(input,On,FOLLOW_2); 
             after(grammarAccess.getGithubwfRootOnOneOf1Access().getOnKeyword_0()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__1"
    // InternalGithubwfRootOnOneOf1Parser.g:640:1: rule__GithubwfRootOnOneOf1__Group__1 : rule__GithubwfRootOnOneOf1__Group__1__Impl rule__GithubwfRootOnOneOf1__Group__2 ;
    public final void rule__GithubwfRootOnOneOf1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:644:1: ( rule__GithubwfRootOnOneOf1__Group__1__Impl rule__GithubwfRootOnOneOf1__Group__2 )
            // InternalGithubwfRootOnOneOf1Parser.g:645:2: rule__GithubwfRootOnOneOf1__Group__1__Impl rule__GithubwfRootOnOneOf1__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__1__Impl"
    // InternalGithubwfRootOnOneOf1Parser.g:652:1: rule__GithubwfRootOnOneOf1__Group__1__Impl : ( Colon ) ;
    public final void rule__GithubwfRootOnOneOf1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:656:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf1Parser.g:657:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:657:1: ( Colon )
            // InternalGithubwfRootOnOneOf1Parser.g:658:2: Colon
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getGithubwfRootOnOneOf1Access().getColonKeyword_1()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__2"
    // InternalGithubwfRootOnOneOf1Parser.g:667:1: rule__GithubwfRootOnOneOf1__Group__2 : rule__GithubwfRootOnOneOf1__Group__2__Impl rule__GithubwfRootOnOneOf1__Group__3 ;
    public final void rule__GithubwfRootOnOneOf1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:671:1: ( rule__GithubwfRootOnOneOf1__Group__2__Impl rule__GithubwfRootOnOneOf1__Group__3 )
            // InternalGithubwfRootOnOneOf1Parser.g:672:2: rule__GithubwfRootOnOneOf1__Group__2__Impl rule__GithubwfRootOnOneOf1__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__Group__3();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__2__Impl"
    // InternalGithubwfRootOnOneOf1Parser.g:679:1: rule__GithubwfRootOnOneOf1__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:683:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf1Parser.g:684:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:684:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf1Parser.g:685:2: LeftSquareBracket
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getLeftSquareBracketKeyword_2()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGithubwfRootOnOneOf1Access().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__3"
    // InternalGithubwfRootOnOneOf1Parser.g:694:1: rule__GithubwfRootOnOneOf1__Group__3 : rule__GithubwfRootOnOneOf1__Group__3__Impl rule__GithubwfRootOnOneOf1__Group__4 ;
    public final void rule__GithubwfRootOnOneOf1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:698:1: ( rule__GithubwfRootOnOneOf1__Group__3__Impl rule__GithubwfRootOnOneOf1__Group__4 )
            // InternalGithubwfRootOnOneOf1Parser.g:699:2: rule__GithubwfRootOnOneOf1__Group__3__Impl rule__GithubwfRootOnOneOf1__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__GithubwfRootOnOneOf1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__Group__4();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__3"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__3__Impl"
    // InternalGithubwfRootOnOneOf1Parser.g:706:1: rule__GithubwfRootOnOneOf1__Group__3__Impl : ( ( rule__GithubwfRootOnOneOf1__OnAssignment_3 ) ) ;
    public final void rule__GithubwfRootOnOneOf1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:710:1: ( ( ( rule__GithubwfRootOnOneOf1__OnAssignment_3 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:711:1: ( ( rule__GithubwfRootOnOneOf1__OnAssignment_3 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:711:1: ( ( rule__GithubwfRootOnOneOf1__OnAssignment_3 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:712:2: ( rule__GithubwfRootOnOneOf1__OnAssignment_3 )
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getOnAssignment_3()); 
            // InternalGithubwfRootOnOneOf1Parser.g:713:2: ( rule__GithubwfRootOnOneOf1__OnAssignment_3 )
            // InternalGithubwfRootOnOneOf1Parser.g:713:3: rule__GithubwfRootOnOneOf1__OnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__OnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGithubwfRootOnOneOf1Access().getOnAssignment_3()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__3__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__4"
    // InternalGithubwfRootOnOneOf1Parser.g:721:1: rule__GithubwfRootOnOneOf1__Group__4 : rule__GithubwfRootOnOneOf1__Group__4__Impl rule__GithubwfRootOnOneOf1__Group__5 ;
    public final void rule__GithubwfRootOnOneOf1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:725:1: ( rule__GithubwfRootOnOneOf1__Group__4__Impl rule__GithubwfRootOnOneOf1__Group__5 )
            // InternalGithubwfRootOnOneOf1Parser.g:726:2: rule__GithubwfRootOnOneOf1__Group__4__Impl rule__GithubwfRootOnOneOf1__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__GithubwfRootOnOneOf1__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__Group__5();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__4"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__4__Impl"
    // InternalGithubwfRootOnOneOf1Parser.g:733:1: rule__GithubwfRootOnOneOf1__Group__4__Impl : ( ( rule__GithubwfRootOnOneOf1__Group_4__0 )* ) ;
    public final void rule__GithubwfRootOnOneOf1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:737:1: ( ( ( rule__GithubwfRootOnOneOf1__Group_4__0 )* ) )
            // InternalGithubwfRootOnOneOf1Parser.g:738:1: ( ( rule__GithubwfRootOnOneOf1__Group_4__0 )* )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:738:1: ( ( rule__GithubwfRootOnOneOf1__Group_4__0 )* )
            // InternalGithubwfRootOnOneOf1Parser.g:739:2: ( rule__GithubwfRootOnOneOf1__Group_4__0 )*
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getGroup_4()); 
            // InternalGithubwfRootOnOneOf1Parser.g:740:2: ( rule__GithubwfRootOnOneOf1__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf1Parser.g:740:3: rule__GithubwfRootOnOneOf1__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__GithubwfRootOnOneOf1__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGithubwfRootOnOneOf1Access().getGroup_4()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__4__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__5"
    // InternalGithubwfRootOnOneOf1Parser.g:748:1: rule__GithubwfRootOnOneOf1__Group__5 : rule__GithubwfRootOnOneOf1__Group__5__Impl ;
    public final void rule__GithubwfRootOnOneOf1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:752:1: ( rule__GithubwfRootOnOneOf1__Group__5__Impl )
            // InternalGithubwfRootOnOneOf1Parser.g:753:2: rule__GithubwfRootOnOneOf1__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__Group__5__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__5"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group__5__Impl"
    // InternalGithubwfRootOnOneOf1Parser.g:759:1: rule__GithubwfRootOnOneOf1__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:763:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf1Parser.g:764:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:764:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf1Parser.g:765:2: RightSquareBracket
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGithubwfRootOnOneOf1Access().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group__5__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group_4__0"
    // InternalGithubwfRootOnOneOf1Parser.g:775:1: rule__GithubwfRootOnOneOf1__Group_4__0 : rule__GithubwfRootOnOneOf1__Group_4__0__Impl rule__GithubwfRootOnOneOf1__Group_4__1 ;
    public final void rule__GithubwfRootOnOneOf1__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:779:1: ( rule__GithubwfRootOnOneOf1__Group_4__0__Impl rule__GithubwfRootOnOneOf1__Group_4__1 )
            // InternalGithubwfRootOnOneOf1Parser.g:780:2: rule__GithubwfRootOnOneOf1__Group_4__0__Impl rule__GithubwfRootOnOneOf1__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf1__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__Group_4__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group_4__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group_4__0__Impl"
    // InternalGithubwfRootOnOneOf1Parser.g:787:1: rule__GithubwfRootOnOneOf1__Group_4__0__Impl : ( Comma ) ;
    public final void rule__GithubwfRootOnOneOf1__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:791:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf1Parser.g:792:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:792:1: ( Comma )
            // InternalGithubwfRootOnOneOf1Parser.g:793:2: Comma
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGithubwfRootOnOneOf1Access().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group_4__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group_4__1"
    // InternalGithubwfRootOnOneOf1Parser.g:802:1: rule__GithubwfRootOnOneOf1__Group_4__1 : rule__GithubwfRootOnOneOf1__Group_4__1__Impl ;
    public final void rule__GithubwfRootOnOneOf1__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:806:1: ( rule__GithubwfRootOnOneOf1__Group_4__1__Impl )
            // InternalGithubwfRootOnOneOf1Parser.g:807:2: rule__GithubwfRootOnOneOf1__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__Group_4__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group_4__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__Group_4__1__Impl"
    // InternalGithubwfRootOnOneOf1Parser.g:813:1: rule__GithubwfRootOnOneOf1__Group_4__1__Impl : ( ( rule__GithubwfRootOnOneOf1__OnAssignment_4_1 ) ) ;
    public final void rule__GithubwfRootOnOneOf1__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:817:1: ( ( ( rule__GithubwfRootOnOneOf1__OnAssignment_4_1 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:818:1: ( ( rule__GithubwfRootOnOneOf1__OnAssignment_4_1 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:818:1: ( ( rule__GithubwfRootOnOneOf1__OnAssignment_4_1 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:819:2: ( rule__GithubwfRootOnOneOf1__OnAssignment_4_1 )
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getOnAssignment_4_1()); 
            // InternalGithubwfRootOnOneOf1Parser.g:820:2: ( rule__GithubwfRootOnOneOf1__OnAssignment_4_1 )
            // InternalGithubwfRootOnOneOf1Parser.g:820:3: rule__GithubwfRootOnOneOf1__OnAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf1__OnAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGithubwfRootOnOneOf1Access().getOnAssignment_4_1()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__Group_4__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalGithubwfRootOnOneOf1Parser.g:829:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:833:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalGithubwfRootOnOneOf1Parser.g:834:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGithubwfRootOnOneOf1Parser.g:841:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:845:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf1Parser.g:846:1: ( () )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:846:1: ( () )
            // InternalGithubwfRootOnOneOf1Parser.g:847:2: ()
            {
             before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            // InternalGithubwfRootOnOneOf1Parser.g:848:2: ()
            // InternalGithubwfRootOnOneOf1Parser.g:848:3: 
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
    // InternalGithubwfRootOnOneOf1Parser.g:856:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:860:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalGithubwfRootOnOneOf1Parser.g:861:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGithubwfRootOnOneOf1Parser.g:868:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:872:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf1Parser.g:873:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:873:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf1Parser.g:874:2: LeftSquareBracket
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
    // InternalGithubwfRootOnOneOf1Parser.g:883:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:887:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalGithubwfRootOnOneOf1Parser.g:888:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalGithubwfRootOnOneOf1Parser.g:895:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:899:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf1Parser.g:900:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:900:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf1Parser.g:901:2: ( rule__ArrayValue__Group_2__0 )?
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalGithubwfRootOnOneOf1Parser.g:902:2: ( rule__ArrayValue__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=False && LA6_0<=True)||LA6_0==LeftSquareBracket||LA6_0==LeftCurlyBracket||(LA6_0>=RULE_STRING && LA6_0<=RULE_E_DOUBLE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGithubwfRootOnOneOf1Parser.g:902:3: rule__ArrayValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf1Parser.g:910:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:914:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf1Parser.g:915:2: rule__ArrayValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf1Parser.g:921:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:925:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf1Parser.g:926:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:926:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf1Parser.g:927:2: RightSquareBracket
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
    // InternalGithubwfRootOnOneOf1Parser.g:937:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:941:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf1Parser.g:942:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGithubwfRootOnOneOf1Parser.g:949:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:953:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:954:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:954:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:955:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            // InternalGithubwfRootOnOneOf1Parser.g:956:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalGithubwfRootOnOneOf1Parser.g:956:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalGithubwfRootOnOneOf1Parser.g:964:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:968:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf1Parser.g:969:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf1Parser.g:975:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:979:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf1Parser.g:980:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:980:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf1Parser.g:981:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            // InternalGithubwfRootOnOneOf1Parser.g:982:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf1Parser.g:982:3: rule__ArrayValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ArrayValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalGithubwfRootOnOneOf1Parser.g:991:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:995:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf1Parser.g:996:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGithubwfRootOnOneOf1Parser.g:1003:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1007:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1008:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1008:1: ( Comma )
            // InternalGithubwfRootOnOneOf1Parser.g:1009:2: Comma
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
    // InternalGithubwfRootOnOneOf1Parser.g:1018:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1022:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf1Parser.g:1023:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf1Parser.g:1029:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1033:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1034:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1034:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1035:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            // InternalGithubwfRootOnOneOf1Parser.g:1036:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf1Parser.g:1036:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf1Parser.g:1045:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1049:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGithubwfRootOnOneOf1Parser.g:1050:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGithubwfRootOnOneOf1Parser.g:1057:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1061:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1062:1: ( () )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1062:1: ( () )
            // InternalGithubwfRootOnOneOf1Parser.g:1063:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalGithubwfRootOnOneOf1Parser.g:1064:2: ()
            // InternalGithubwfRootOnOneOf1Parser.g:1064:3: 
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
    // InternalGithubwfRootOnOneOf1Parser.g:1072:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1076:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGithubwfRootOnOneOf1Parser.g:1077:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalGithubwfRootOnOneOf1Parser.g:1084:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1088:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1089:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1089:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf1Parser.g:1090:2: LeftCurlyBracket
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
    // InternalGithubwfRootOnOneOf1Parser.g:1099:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1103:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGithubwfRootOnOneOf1Parser.g:1104:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalGithubwfRootOnOneOf1Parser.g:1111:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1115:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1116:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1116:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf1Parser.g:1117:2: ( rule__ObjectValue__Group_2__0 )?
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            // InternalGithubwfRootOnOneOf1Parser.g:1118:2: ( rule__ObjectValue__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==On||LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGithubwfRootOnOneOf1Parser.g:1118:3: rule__ObjectValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf1Parser.g:1126:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1130:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf1Parser.g:1131:2: rule__ObjectValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf1Parser.g:1137:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1141:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1142:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1142:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf1Parser.g:1143:2: RightCurlyBracket
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
    // InternalGithubwfRootOnOneOf1Parser.g:1153:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1157:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf1Parser.g:1158:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGithubwfRootOnOneOf1Parser.g:1165:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1169:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1170:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1170:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1171:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            // InternalGithubwfRootOnOneOf1Parser.g:1172:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalGithubwfRootOnOneOf1Parser.g:1172:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalGithubwfRootOnOneOf1Parser.g:1180:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1184:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf1Parser.g:1185:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf1Parser.g:1191:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1195:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1196:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1196:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf1Parser.g:1197:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            // InternalGithubwfRootOnOneOf1Parser.g:1198:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Comma) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf1Parser.g:1198:3: rule__ObjectValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ObjectValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalGithubwfRootOnOneOf1Parser.g:1207:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1211:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf1Parser.g:1212:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalGithubwfRootOnOneOf1Parser.g:1219:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1223:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1224:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1224:1: ( Comma )
            // InternalGithubwfRootOnOneOf1Parser.g:1225:2: Comma
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
    // InternalGithubwfRootOnOneOf1Parser.g:1234:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1238:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf1Parser.g:1239:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf1Parser.g:1245:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1249:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1250:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1250:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1251:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            // InternalGithubwfRootOnOneOf1Parser.g:1252:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf1Parser.g:1252:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf1Parser.g:1261:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1265:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalGithubwfRootOnOneOf1Parser.g:1266:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
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
    // InternalGithubwfRootOnOneOf1Parser.g:1273:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1277:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1278:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1278:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1279:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            // InternalGithubwfRootOnOneOf1Parser.g:1280:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf1Parser.g:1280:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalGithubwfRootOnOneOf1Parser.g:1288:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1292:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalGithubwfRootOnOneOf1Parser.g:1293:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalGithubwfRootOnOneOf1Parser.g:1300:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1304:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1305:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1305:1: ( Colon )
            // InternalGithubwfRootOnOneOf1Parser.g:1306:2: Colon
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
    // InternalGithubwfRootOnOneOf1Parser.g:1315:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1319:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalGithubwfRootOnOneOf1Parser.g:1320:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalGithubwfRootOnOneOf1Parser.g:1326:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1330:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1331:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1331:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1332:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            // InternalGithubwfRootOnOneOf1Parser.g:1333:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalGithubwfRootOnOneOf1Parser.g:1333:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__GithubwfRootOnOneOf1__OnAssignment_3"
    // InternalGithubwfRootOnOneOf1Parser.g:1342:1: rule__GithubwfRootOnOneOf1__OnAssignment_3 : ( ruleGithubwfRootOnOneOf1Items ) ;
    public final void rule__GithubwfRootOnOneOf1__OnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1346:1: ( ( ruleGithubwfRootOnOneOf1Items ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1347:2: ( ruleGithubwfRootOnOneOf1Items )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1347:2: ( ruleGithubwfRootOnOneOf1Items )
            // InternalGithubwfRootOnOneOf1Parser.g:1348:3: ruleGithubwfRootOnOneOf1Items
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getOnGithubwfRootOnOneOf1ItemsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf1Items();

            state._fsp--;

             after(grammarAccess.getGithubwfRootOnOneOf1Access().getOnGithubwfRootOnOneOf1ItemsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__OnAssignment_3"


    // $ANTLR start "rule__GithubwfRootOnOneOf1__OnAssignment_4_1"
    // InternalGithubwfRootOnOneOf1Parser.g:1357:1: rule__GithubwfRootOnOneOf1__OnAssignment_4_1 : ( ruleGithubwfRootOnOneOf1Items ) ;
    public final void rule__GithubwfRootOnOneOf1__OnAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1361:1: ( ( ruleGithubwfRootOnOneOf1Items ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1362:2: ( ruleGithubwfRootOnOneOf1Items )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1362:2: ( ruleGithubwfRootOnOneOf1Items )
            // InternalGithubwfRootOnOneOf1Parser.g:1363:3: ruleGithubwfRootOnOneOf1Items
            {
             before(grammarAccess.getGithubwfRootOnOneOf1Access().getOnGithubwfRootOnOneOf1ItemsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf1Items();

            state._fsp--;

             after(grammarAccess.getGithubwfRootOnOneOf1Access().getOnGithubwfRootOnOneOf1ItemsParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1__OnAssignment_4_1"


    // $ANTLR start "rule__GithubwfRootOnOneOf1Items__ItemsAssignment"
    // InternalGithubwfRootOnOneOf1Parser.g:1372:1: rule__GithubwfRootOnOneOf1Items__ItemsAssignment : ( ruleEvent ) ;
    public final void rule__GithubwfRootOnOneOf1Items__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1376:1: ( ( ruleEvent ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1377:2: ( ruleEvent )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1377:2: ( ruleEvent )
            // InternalGithubwfRootOnOneOf1Parser.g:1378:3: ruleEvent
            {
             before(grammarAccess.getGithubwfRootOnOneOf1ItemsAccess().getItemsEventParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getGithubwfRootOnOneOf1ItemsAccess().getItemsEventParserRuleCall_0()); 

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
    // $ANTLR end "rule__GithubwfRootOnOneOf1Items__ItemsAssignment"


    // $ANTLR start "rule__Event__EventAssignment"
    // InternalGithubwfRootOnOneOf1Parser.g:1387:1: rule__Event__EventAssignment : ( ruleJsonDocument ) ;
    public final void rule__Event__EventAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1391:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1392:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1392:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf1Parser.g:1393:3: ruleJsonDocument
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
    // InternalGithubwfRootOnOneOf1Parser.g:1402:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1406:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1407:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1407:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf1Parser.g:1408:3: ruleValue
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
    // InternalGithubwfRootOnOneOf1Parser.g:1417:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1421:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1422:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1422:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf1Parser.g:1423:3: ruleEString
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
    // InternalGithubwfRootOnOneOf1Parser.g:1432:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1436:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1437:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1437:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf1Parser.g:1438:3: ruleValue
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
    // InternalGithubwfRootOnOneOf1Parser.g:1447:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1451:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1452:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1452:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf1Parser.g:1453:3: ruleValue
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
    // InternalGithubwfRootOnOneOf1Parser.g:1462:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1466:1: ( ( ruleNullEnum ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1467:2: ( ruleNullEnum )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1467:2: ( ruleNullEnum )
            // InternalGithubwfRootOnOneOf1Parser.g:1468:3: ruleNullEnum
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
    // InternalGithubwfRootOnOneOf1Parser.g:1477:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1481:1: ( ( ruleEDouble ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1482:2: ( ruleEDouble )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1482:2: ( ruleEDouble )
            // InternalGithubwfRootOnOneOf1Parser.g:1483:3: ruleEDouble
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
    // InternalGithubwfRootOnOneOf1Parser.g:1492:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1496:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1497:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1497:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf1Parser.g:1498:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf1Parser.g:1507:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1511:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1512:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1512:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf1Parser.g:1513:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf1Parser.g:1522:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1526:1: ( ( ruleEBoolean ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1527:2: ( ruleEBoolean )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1527:2: ( ruleEBoolean )
            // InternalGithubwfRootOnOneOf1Parser.g:1528:3: ruleEBoolean
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
    // InternalGithubwfRootOnOneOf1Parser.g:1537:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1541:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1542:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1542:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf1Parser.g:1543:3: ruleEString
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
    // InternalGithubwfRootOnOneOf1Parser.g:1552:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf1Parser.g:1556:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf1Parser.g:1557:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf1Parser.g:1557:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf1Parser.g:1558:3: ruleValue
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008020L});

}