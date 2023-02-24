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
import githubwf.githubwf.services.ShellAnyOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShellAnyOf1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=5;
    public static final int True=6;
    public static final int RULE_STRING=14;
    public static final int False=4;
    public static final int RULE_SL_COMMENT=19;
    public static final int Comma=7;
    public static final int Colon=8;
    public static final int RightCurlyBracket=12;
    public static final int RULE_E_DOUBLE=16;
    public static final int EOF=-1;
    public static final int RightSquareBracket=10;
    public static final int RULE_ID=17;
    public static final int RULE_WS=20;
    public static final int LeftCurlyBracket=11;
    public static final int RULE_E_INT=15;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_INT=13;
    public static final int RULE_ML_COMMENT=18;
    public static final int LeftSquareBracket=9;

    // delegates
    // delegators


        public InternalShellAnyOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShellAnyOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShellAnyOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalShellAnyOf1Parser.g"; }


    	private ShellAnyOf1GrammarAccess grammarAccess;
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
    	}

    	public void setGrammarAccess(ShellAnyOf1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleShellAnyOf1"
    // InternalShellAnyOf1Parser.g:64:1: entryRuleShellAnyOf1 : ruleShellAnyOf1 EOF ;
    public final void entryRuleShellAnyOf1() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:65:1: ( ruleShellAnyOf1 EOF )
            // InternalShellAnyOf1Parser.g:66:1: ruleShellAnyOf1 EOF
            {
             before(grammarAccess.getShellAnyOf1Rule()); 
            pushFollow(FOLLOW_1);
            ruleShellAnyOf1();

            state._fsp--;

             after(grammarAccess.getShellAnyOf1Rule()); 
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
    // $ANTLR end "entryRuleShellAnyOf1"


    // $ANTLR start "ruleShellAnyOf1"
    // InternalShellAnyOf1Parser.g:73:1: ruleShellAnyOf1 : ( ( rule__ShellAnyOf1__ShellAssignment ) ) ;
    public final void ruleShellAnyOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:77:2: ( ( ( rule__ShellAnyOf1__ShellAssignment ) ) )
            // InternalShellAnyOf1Parser.g:78:2: ( ( rule__ShellAnyOf1__ShellAssignment ) )
            {
            // InternalShellAnyOf1Parser.g:78:2: ( ( rule__ShellAnyOf1__ShellAssignment ) )
            // InternalShellAnyOf1Parser.g:79:3: ( rule__ShellAnyOf1__ShellAssignment )
            {
             before(grammarAccess.getShellAnyOf1Access().getShellAssignment()); 
            // InternalShellAnyOf1Parser.g:80:3: ( rule__ShellAnyOf1__ShellAssignment )
            // InternalShellAnyOf1Parser.g:80:4: rule__ShellAnyOf1__ShellAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ShellAnyOf1__ShellAssignment();

            state._fsp--;


            }

             after(grammarAccess.getShellAnyOf1Access().getShellAssignment()); 

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
    // $ANTLR end "ruleShellAnyOf1"


    // $ANTLR start "entryRuleValue"
    // InternalShellAnyOf1Parser.g:89:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:90:1: ( ruleValue EOF )
            // InternalShellAnyOf1Parser.g:91:1: ruleValue EOF
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
    // InternalShellAnyOf1Parser.g:98:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:102:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalShellAnyOf1Parser.g:103:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalShellAnyOf1Parser.g:103:2: ( ( rule__Value__Alternatives ) )
            // InternalShellAnyOf1Parser.g:104:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalShellAnyOf1Parser.g:105:3: ( rule__Value__Alternatives )
            // InternalShellAnyOf1Parser.g:105:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleJsonDocument"
    // InternalShellAnyOf1Parser.g:114:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:115:1: ( ruleJsonDocument EOF )
            // InternalShellAnyOf1Parser.g:116:1: ruleJsonDocument EOF
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
    // InternalShellAnyOf1Parser.g:123:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:127:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalShellAnyOf1Parser.g:128:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalShellAnyOf1Parser.g:128:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalShellAnyOf1Parser.g:129:3: ( rule__JsonDocument__ValueAssignment )
            {
             before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            // InternalShellAnyOf1Parser.g:130:3: ( rule__JsonDocument__ValueAssignment )
            // InternalShellAnyOf1Parser.g:130:4: rule__JsonDocument__ValueAssignment
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
    // InternalShellAnyOf1Parser.g:139:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:140:1: ( ruleStringValue EOF )
            // InternalShellAnyOf1Parser.g:141:1: ruleStringValue EOF
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
    // InternalShellAnyOf1Parser.g:148:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:152:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalShellAnyOf1Parser.g:153:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalShellAnyOf1Parser.g:153:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalShellAnyOf1Parser.g:154:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalShellAnyOf1Parser.g:155:3: ( rule__StringValue__ValueAssignment )
            // InternalShellAnyOf1Parser.g:155:4: rule__StringValue__ValueAssignment
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
    // InternalShellAnyOf1Parser.g:164:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:165:1: ( ruleArrayValue EOF )
            // InternalShellAnyOf1Parser.g:166:1: ruleArrayValue EOF
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
    // InternalShellAnyOf1Parser.g:173:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:177:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalShellAnyOf1Parser.g:178:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalShellAnyOf1Parser.g:178:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalShellAnyOf1Parser.g:179:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalShellAnyOf1Parser.g:180:3: ( rule__ArrayValue__Group__0 )
            // InternalShellAnyOf1Parser.g:180:4: rule__ArrayValue__Group__0
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
    // InternalShellAnyOf1Parser.g:189:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:190:1: ( ruleNullValue EOF )
            // InternalShellAnyOf1Parser.g:191:1: ruleNullValue EOF
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
    // InternalShellAnyOf1Parser.g:198:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:202:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalShellAnyOf1Parser.g:203:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalShellAnyOf1Parser.g:203:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalShellAnyOf1Parser.g:204:3: ( rule__NullValue__ValueAssignment )
            {
             before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            // InternalShellAnyOf1Parser.g:205:3: ( rule__NullValue__ValueAssignment )
            // InternalShellAnyOf1Parser.g:205:4: rule__NullValue__ValueAssignment
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
    // InternalShellAnyOf1Parser.g:214:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:215:1: ( ruleNumberValue EOF )
            // InternalShellAnyOf1Parser.g:216:1: ruleNumberValue EOF
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
    // InternalShellAnyOf1Parser.g:223:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:227:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalShellAnyOf1Parser.g:228:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalShellAnyOf1Parser.g:228:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalShellAnyOf1Parser.g:229:3: ( rule__NumberValue__ValueAssignment )
            {
             before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            // InternalShellAnyOf1Parser.g:230:3: ( rule__NumberValue__ValueAssignment )
            // InternalShellAnyOf1Parser.g:230:4: rule__NumberValue__ValueAssignment
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
    // InternalShellAnyOf1Parser.g:239:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:240:1: ( ruleObjectValue EOF )
            // InternalShellAnyOf1Parser.g:241:1: ruleObjectValue EOF
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
    // InternalShellAnyOf1Parser.g:248:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:252:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalShellAnyOf1Parser.g:253:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalShellAnyOf1Parser.g:253:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalShellAnyOf1Parser.g:254:3: ( rule__ObjectValue__Group__0 )
            {
             before(grammarAccess.getObjectValueAccess().getGroup()); 
            // InternalShellAnyOf1Parser.g:255:3: ( rule__ObjectValue__Group__0 )
            // InternalShellAnyOf1Parser.g:255:4: rule__ObjectValue__Group__0
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
    // InternalShellAnyOf1Parser.g:264:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:265:1: ( ruleBooleanValue EOF )
            // InternalShellAnyOf1Parser.g:266:1: ruleBooleanValue EOF
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
    // InternalShellAnyOf1Parser.g:273:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:277:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalShellAnyOf1Parser.g:278:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalShellAnyOf1Parser.g:278:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalShellAnyOf1Parser.g:279:3: ( rule__BooleanValue__ValueAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            // InternalShellAnyOf1Parser.g:280:3: ( rule__BooleanValue__ValueAssignment )
            // InternalShellAnyOf1Parser.g:280:4: rule__BooleanValue__ValueAssignment
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
    // InternalShellAnyOf1Parser.g:289:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:290:1: ( ruleEString EOF )
            // InternalShellAnyOf1Parser.g:291:1: ruleEString EOF
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
    // InternalShellAnyOf1Parser.g:298:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:302:2: ( ( ruleVALID_STRING ) )
            // InternalShellAnyOf1Parser.g:303:2: ( ruleVALID_STRING )
            {
            // InternalShellAnyOf1Parser.g:303:2: ( ruleVALID_STRING )
            // InternalShellAnyOf1Parser.g:304:3: ruleVALID_STRING
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
    // InternalShellAnyOf1Parser.g:314:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:315:1: ( ruleEDouble EOF )
            // InternalShellAnyOf1Parser.g:316:1: ruleEDouble EOF
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
    // InternalShellAnyOf1Parser.g:323:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:327:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalShellAnyOf1Parser.g:328:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalShellAnyOf1Parser.g:328:2: ( ( rule__EDouble__Alternatives ) )
            // InternalShellAnyOf1Parser.g:329:3: ( rule__EDouble__Alternatives )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            // InternalShellAnyOf1Parser.g:330:3: ( rule__EDouble__Alternatives )
            // InternalShellAnyOf1Parser.g:330:4: rule__EDouble__Alternatives
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
    // InternalShellAnyOf1Parser.g:339:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:340:1: ( ruleKeyValuePair EOF )
            // InternalShellAnyOf1Parser.g:341:1: ruleKeyValuePair EOF
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
    // InternalShellAnyOf1Parser.g:348:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:352:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalShellAnyOf1Parser.g:353:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalShellAnyOf1Parser.g:353:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalShellAnyOf1Parser.g:354:3: ( rule__KeyValuePair__Group__0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            // InternalShellAnyOf1Parser.g:355:3: ( rule__KeyValuePair__Group__0 )
            // InternalShellAnyOf1Parser.g:355:4: rule__KeyValuePair__Group__0
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
    // InternalShellAnyOf1Parser.g:364:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:365:1: ( ruleEBoolean EOF )
            // InternalShellAnyOf1Parser.g:366:1: ruleEBoolean EOF
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
    // InternalShellAnyOf1Parser.g:373:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:377:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalShellAnyOf1Parser.g:378:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalShellAnyOf1Parser.g:378:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalShellAnyOf1Parser.g:379:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalShellAnyOf1Parser.g:380:3: ( rule__EBoolean__Alternatives )
            // InternalShellAnyOf1Parser.g:380:4: rule__EBoolean__Alternatives
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
    // InternalShellAnyOf1Parser.g:389:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalShellAnyOf1Parser.g:390:1: ( ruleVALID_STRING EOF )
            // InternalShellAnyOf1Parser.g:391:1: ruleVALID_STRING EOF
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
    // InternalShellAnyOf1Parser.g:398:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:402:2: ( ( RULE_STRING ) )
            // InternalShellAnyOf1Parser.g:403:2: ( RULE_STRING )
            {
            // InternalShellAnyOf1Parser.g:403:2: ( RULE_STRING )
            // InternalShellAnyOf1Parser.g:404:3: RULE_STRING
            {
             before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall()); 

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


    // $ANTLR start "ruleNullEnum"
    // InternalShellAnyOf1Parser.g:414:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:418:1: ( ( ( Null ) ) )
            // InternalShellAnyOf1Parser.g:419:2: ( ( Null ) )
            {
            // InternalShellAnyOf1Parser.g:419:2: ( ( Null ) )
            // InternalShellAnyOf1Parser.g:420:3: ( Null )
            {
             before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            // InternalShellAnyOf1Parser.g:421:3: ( Null )
            // InternalShellAnyOf1Parser.g:421:4: Null
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
    // InternalShellAnyOf1Parser.g:429:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:433:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
            int alt1=6;
            switch ( input.LA(1) ) {
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
                    // InternalShellAnyOf1Parser.g:434:2: ( ruleStringValue )
                    {
                    // InternalShellAnyOf1Parser.g:434:2: ( ruleStringValue )
                    // InternalShellAnyOf1Parser.g:435:3: ruleStringValue
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
                    // InternalShellAnyOf1Parser.g:440:2: ( ruleArrayValue )
                    {
                    // InternalShellAnyOf1Parser.g:440:2: ( ruleArrayValue )
                    // InternalShellAnyOf1Parser.g:441:3: ruleArrayValue
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
                    // InternalShellAnyOf1Parser.g:446:2: ( ruleNullValue )
                    {
                    // InternalShellAnyOf1Parser.g:446:2: ( ruleNullValue )
                    // InternalShellAnyOf1Parser.g:447:3: ruleNullValue
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
                    // InternalShellAnyOf1Parser.g:452:2: ( ruleNumberValue )
                    {
                    // InternalShellAnyOf1Parser.g:452:2: ( ruleNumberValue )
                    // InternalShellAnyOf1Parser.g:453:3: ruleNumberValue
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
                    // InternalShellAnyOf1Parser.g:458:2: ( ruleObjectValue )
                    {
                    // InternalShellAnyOf1Parser.g:458:2: ( ruleObjectValue )
                    // InternalShellAnyOf1Parser.g:459:3: ruleObjectValue
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
                    // InternalShellAnyOf1Parser.g:464:2: ( ruleBooleanValue )
                    {
                    // InternalShellAnyOf1Parser.g:464:2: ( ruleBooleanValue )
                    // InternalShellAnyOf1Parser.g:465:3: ruleBooleanValue
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
    // InternalShellAnyOf1Parser.g:474:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:478:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalShellAnyOf1Parser.g:479:2: ( RULE_E_INT )
                    {
                    // InternalShellAnyOf1Parser.g:479:2: ( RULE_E_INT )
                    // InternalShellAnyOf1Parser.g:480:3: RULE_E_INT
                    {
                     before(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 
                    match(input,RULE_E_INT,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShellAnyOf1Parser.g:485:2: ( RULE_E_DOUBLE )
                    {
                    // InternalShellAnyOf1Parser.g:485:2: ( RULE_E_DOUBLE )
                    // InternalShellAnyOf1Parser.g:486:3: RULE_E_DOUBLE
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
    // InternalShellAnyOf1Parser.g:495:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:499:1: ( ( True ) | ( False ) )
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
                    // InternalShellAnyOf1Parser.g:500:2: ( True )
                    {
                    // InternalShellAnyOf1Parser.g:500:2: ( True )
                    // InternalShellAnyOf1Parser.g:501:3: True
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShellAnyOf1Parser.g:506:2: ( False )
                    {
                    // InternalShellAnyOf1Parser.g:506:2: ( False )
                    // InternalShellAnyOf1Parser.g:507:3: False
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


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalShellAnyOf1Parser.g:516:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:520:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalShellAnyOf1Parser.g:521:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalShellAnyOf1Parser.g:528:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:532:1: ( ( () ) )
            // InternalShellAnyOf1Parser.g:533:1: ( () )
            {
            // InternalShellAnyOf1Parser.g:533:1: ( () )
            // InternalShellAnyOf1Parser.g:534:2: ()
            {
             before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            // InternalShellAnyOf1Parser.g:535:2: ()
            // InternalShellAnyOf1Parser.g:535:3: 
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
    // InternalShellAnyOf1Parser.g:543:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:547:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalShellAnyOf1Parser.g:548:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalShellAnyOf1Parser.g:555:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:559:1: ( ( LeftSquareBracket ) )
            // InternalShellAnyOf1Parser.g:560:1: ( LeftSquareBracket )
            {
            // InternalShellAnyOf1Parser.g:560:1: ( LeftSquareBracket )
            // InternalShellAnyOf1Parser.g:561:2: LeftSquareBracket
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
    // InternalShellAnyOf1Parser.g:570:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:574:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalShellAnyOf1Parser.g:575:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalShellAnyOf1Parser.g:582:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:586:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalShellAnyOf1Parser.g:587:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalShellAnyOf1Parser.g:587:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalShellAnyOf1Parser.g:588:2: ( rule__ArrayValue__Group_2__0 )?
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalShellAnyOf1Parser.g:589:2: ( rule__ArrayValue__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=False && LA4_0<=True)||LA4_0==LeftSquareBracket||LA4_0==LeftCurlyBracket||(LA4_0>=RULE_STRING && LA4_0<=RULE_E_DOUBLE)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalShellAnyOf1Parser.g:589:3: rule__ArrayValue__Group_2__0
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
    // InternalShellAnyOf1Parser.g:597:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:601:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalShellAnyOf1Parser.g:602:2: rule__ArrayValue__Group__3__Impl
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
    // InternalShellAnyOf1Parser.g:608:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:612:1: ( ( RightSquareBracket ) )
            // InternalShellAnyOf1Parser.g:613:1: ( RightSquareBracket )
            {
            // InternalShellAnyOf1Parser.g:613:1: ( RightSquareBracket )
            // InternalShellAnyOf1Parser.g:614:2: RightSquareBracket
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
    // InternalShellAnyOf1Parser.g:624:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:628:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalShellAnyOf1Parser.g:629:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalShellAnyOf1Parser.g:636:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:640:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalShellAnyOf1Parser.g:641:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalShellAnyOf1Parser.g:641:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalShellAnyOf1Parser.g:642:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            // InternalShellAnyOf1Parser.g:643:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalShellAnyOf1Parser.g:643:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalShellAnyOf1Parser.g:651:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:655:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalShellAnyOf1Parser.g:656:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalShellAnyOf1Parser.g:662:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:666:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalShellAnyOf1Parser.g:667:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalShellAnyOf1Parser.g:667:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalShellAnyOf1Parser.g:668:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            // InternalShellAnyOf1Parser.g:669:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalShellAnyOf1Parser.g:669:3: rule__ArrayValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ArrayValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalShellAnyOf1Parser.g:678:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:682:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalShellAnyOf1Parser.g:683:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalShellAnyOf1Parser.g:690:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:694:1: ( ( Comma ) )
            // InternalShellAnyOf1Parser.g:695:1: ( Comma )
            {
            // InternalShellAnyOf1Parser.g:695:1: ( Comma )
            // InternalShellAnyOf1Parser.g:696:2: Comma
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
    // InternalShellAnyOf1Parser.g:705:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:709:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalShellAnyOf1Parser.g:710:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalShellAnyOf1Parser.g:716:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:720:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalShellAnyOf1Parser.g:721:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalShellAnyOf1Parser.g:721:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalShellAnyOf1Parser.g:722:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            // InternalShellAnyOf1Parser.g:723:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalShellAnyOf1Parser.g:723:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalShellAnyOf1Parser.g:732:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:736:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalShellAnyOf1Parser.g:737:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalShellAnyOf1Parser.g:744:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:748:1: ( ( () ) )
            // InternalShellAnyOf1Parser.g:749:1: ( () )
            {
            // InternalShellAnyOf1Parser.g:749:1: ( () )
            // InternalShellAnyOf1Parser.g:750:2: ()
            {
             before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            // InternalShellAnyOf1Parser.g:751:2: ()
            // InternalShellAnyOf1Parser.g:751:3: 
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
    // InternalShellAnyOf1Parser.g:759:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:763:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalShellAnyOf1Parser.g:764:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalShellAnyOf1Parser.g:771:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:775:1: ( ( LeftCurlyBracket ) )
            // InternalShellAnyOf1Parser.g:776:1: ( LeftCurlyBracket )
            {
            // InternalShellAnyOf1Parser.g:776:1: ( LeftCurlyBracket )
            // InternalShellAnyOf1Parser.g:777:2: LeftCurlyBracket
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
    // InternalShellAnyOf1Parser.g:786:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:790:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalShellAnyOf1Parser.g:791:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalShellAnyOf1Parser.g:798:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:802:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalShellAnyOf1Parser.g:803:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalShellAnyOf1Parser.g:803:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalShellAnyOf1Parser.g:804:2: ( rule__ObjectValue__Group_2__0 )?
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            // InternalShellAnyOf1Parser.g:805:2: ( rule__ObjectValue__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalShellAnyOf1Parser.g:805:3: rule__ObjectValue__Group_2__0
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
    // InternalShellAnyOf1Parser.g:813:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:817:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalShellAnyOf1Parser.g:818:2: rule__ObjectValue__Group__3__Impl
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
    // InternalShellAnyOf1Parser.g:824:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:828:1: ( ( RightCurlyBracket ) )
            // InternalShellAnyOf1Parser.g:829:1: ( RightCurlyBracket )
            {
            // InternalShellAnyOf1Parser.g:829:1: ( RightCurlyBracket )
            // InternalShellAnyOf1Parser.g:830:2: RightCurlyBracket
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
    // InternalShellAnyOf1Parser.g:840:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:844:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalShellAnyOf1Parser.g:845:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalShellAnyOf1Parser.g:852:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:856:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalShellAnyOf1Parser.g:857:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalShellAnyOf1Parser.g:857:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalShellAnyOf1Parser.g:858:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            // InternalShellAnyOf1Parser.g:859:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalShellAnyOf1Parser.g:859:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalShellAnyOf1Parser.g:867:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:871:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalShellAnyOf1Parser.g:872:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalShellAnyOf1Parser.g:878:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:882:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalShellAnyOf1Parser.g:883:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalShellAnyOf1Parser.g:883:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalShellAnyOf1Parser.g:884:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
             before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            // InternalShellAnyOf1Parser.g:885:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalShellAnyOf1Parser.g:885:3: rule__ObjectValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ObjectValue__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalShellAnyOf1Parser.g:894:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:898:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalShellAnyOf1Parser.g:899:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalShellAnyOf1Parser.g:906:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:910:1: ( ( Comma ) )
            // InternalShellAnyOf1Parser.g:911:1: ( Comma )
            {
            // InternalShellAnyOf1Parser.g:911:1: ( Comma )
            // InternalShellAnyOf1Parser.g:912:2: Comma
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
    // InternalShellAnyOf1Parser.g:921:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:925:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalShellAnyOf1Parser.g:926:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalShellAnyOf1Parser.g:932:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:936:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalShellAnyOf1Parser.g:937:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalShellAnyOf1Parser.g:937:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalShellAnyOf1Parser.g:938:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
             before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            // InternalShellAnyOf1Parser.g:939:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalShellAnyOf1Parser.g:939:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalShellAnyOf1Parser.g:948:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:952:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalShellAnyOf1Parser.g:953:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalShellAnyOf1Parser.g:960:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:964:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalShellAnyOf1Parser.g:965:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalShellAnyOf1Parser.g:965:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalShellAnyOf1Parser.g:966:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            // InternalShellAnyOf1Parser.g:967:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalShellAnyOf1Parser.g:967:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalShellAnyOf1Parser.g:975:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:979:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalShellAnyOf1Parser.g:980:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalShellAnyOf1Parser.g:987:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:991:1: ( ( Colon ) )
            // InternalShellAnyOf1Parser.g:992:1: ( Colon )
            {
            // InternalShellAnyOf1Parser.g:992:1: ( Colon )
            // InternalShellAnyOf1Parser.g:993:2: Colon
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
    // InternalShellAnyOf1Parser.g:1002:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1006:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalShellAnyOf1Parser.g:1007:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalShellAnyOf1Parser.g:1013:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1017:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalShellAnyOf1Parser.g:1018:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalShellAnyOf1Parser.g:1018:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalShellAnyOf1Parser.g:1019:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            // InternalShellAnyOf1Parser.g:1020:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalShellAnyOf1Parser.g:1020:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__ShellAnyOf1__ShellAssignment"
    // InternalShellAnyOf1Parser.g:1029:1: rule__ShellAnyOf1__ShellAssignment : ( ruleJsonDocument ) ;
    public final void rule__ShellAnyOf1__ShellAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1033:1: ( ( ruleJsonDocument ) )
            // InternalShellAnyOf1Parser.g:1034:2: ( ruleJsonDocument )
            {
            // InternalShellAnyOf1Parser.g:1034:2: ( ruleJsonDocument )
            // InternalShellAnyOf1Parser.g:1035:3: ruleJsonDocument
            {
             before(grammarAccess.getShellAnyOf1Access().getShellJsonDocumentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;

             after(grammarAccess.getShellAnyOf1Access().getShellJsonDocumentParserRuleCall_0()); 

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
    // $ANTLR end "rule__ShellAnyOf1__ShellAssignment"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalShellAnyOf1Parser.g:1044:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1048:1: ( ( ruleValue ) )
            // InternalShellAnyOf1Parser.g:1049:2: ( ruleValue )
            {
            // InternalShellAnyOf1Parser.g:1049:2: ( ruleValue )
            // InternalShellAnyOf1Parser.g:1050:3: ruleValue
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
    // InternalShellAnyOf1Parser.g:1059:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1063:1: ( ( ruleEString ) )
            // InternalShellAnyOf1Parser.g:1064:2: ( ruleEString )
            {
            // InternalShellAnyOf1Parser.g:1064:2: ( ruleEString )
            // InternalShellAnyOf1Parser.g:1065:3: ruleEString
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
    // InternalShellAnyOf1Parser.g:1074:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1078:1: ( ( ruleValue ) )
            // InternalShellAnyOf1Parser.g:1079:2: ( ruleValue )
            {
            // InternalShellAnyOf1Parser.g:1079:2: ( ruleValue )
            // InternalShellAnyOf1Parser.g:1080:3: ruleValue
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
    // InternalShellAnyOf1Parser.g:1089:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1093:1: ( ( ruleValue ) )
            // InternalShellAnyOf1Parser.g:1094:2: ( ruleValue )
            {
            // InternalShellAnyOf1Parser.g:1094:2: ( ruleValue )
            // InternalShellAnyOf1Parser.g:1095:3: ruleValue
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
    // InternalShellAnyOf1Parser.g:1104:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1108:1: ( ( ruleNullEnum ) )
            // InternalShellAnyOf1Parser.g:1109:2: ( ruleNullEnum )
            {
            // InternalShellAnyOf1Parser.g:1109:2: ( ruleNullEnum )
            // InternalShellAnyOf1Parser.g:1110:3: ruleNullEnum
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
    // InternalShellAnyOf1Parser.g:1119:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1123:1: ( ( ruleEDouble ) )
            // InternalShellAnyOf1Parser.g:1124:2: ( ruleEDouble )
            {
            // InternalShellAnyOf1Parser.g:1124:2: ( ruleEDouble )
            // InternalShellAnyOf1Parser.g:1125:3: ruleEDouble
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
    // InternalShellAnyOf1Parser.g:1134:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1138:1: ( ( ruleKeyValuePair ) )
            // InternalShellAnyOf1Parser.g:1139:2: ( ruleKeyValuePair )
            {
            // InternalShellAnyOf1Parser.g:1139:2: ( ruleKeyValuePair )
            // InternalShellAnyOf1Parser.g:1140:3: ruleKeyValuePair
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
    // InternalShellAnyOf1Parser.g:1149:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1153:1: ( ( ruleKeyValuePair ) )
            // InternalShellAnyOf1Parser.g:1154:2: ( ruleKeyValuePair )
            {
            // InternalShellAnyOf1Parser.g:1154:2: ( ruleKeyValuePair )
            // InternalShellAnyOf1Parser.g:1155:3: ruleKeyValuePair
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
    // InternalShellAnyOf1Parser.g:1164:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1168:1: ( ( ruleEBoolean ) )
            // InternalShellAnyOf1Parser.g:1169:2: ( ruleEBoolean )
            {
            // InternalShellAnyOf1Parser.g:1169:2: ( ruleEBoolean )
            // InternalShellAnyOf1Parser.g:1170:3: ruleEBoolean
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
    // InternalShellAnyOf1Parser.g:1179:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1183:1: ( ( ruleEString ) )
            // InternalShellAnyOf1Parser.g:1184:2: ( ruleEString )
            {
            // InternalShellAnyOf1Parser.g:1184:2: ( ruleEString )
            // InternalShellAnyOf1Parser.g:1185:3: ruleEString
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
    // InternalShellAnyOf1Parser.g:1194:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShellAnyOf1Parser.g:1198:1: ( ( ruleValue ) )
            // InternalShellAnyOf1Parser.g:1199:2: ( ruleValue )
            {
            // InternalShellAnyOf1Parser.g:1199:2: ( ruleValue )
            // InternalShellAnyOf1Parser.g:1200:3: ruleValue
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001CE70L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001CA70L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});

}