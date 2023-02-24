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
import githubwf.githubwf.services.EventObjectOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEventObjectOneOf0Parser extends AbstractInternalContentAssistParser {
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


        public InternalEventObjectOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventObjectOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventObjectOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEventObjectOneOf0Parser.g"; }


    	private EventObjectOneOf0GrammarAccess grammarAccess;
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

    	public void setGrammarAccess(EventObjectOneOf0GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEventObjectOneOf0"
    // InternalEventObjectOneOf0Parser.g:65:1: entryRuleEventObjectOneOf0 : ruleEventObjectOneOf0 EOF ;
    public final void entryRuleEventObjectOneOf0() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:66:1: ( ruleEventObjectOneOf0 EOF )
            // InternalEventObjectOneOf0Parser.g:67:1: ruleEventObjectOneOf0 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventObjectOneOf0();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEventObjectOneOf0"


    // $ANTLR start "ruleEventObjectOneOf0"
    // InternalEventObjectOneOf0Parser.g:74:1: ruleEventObjectOneOf0 : ( ( rule__EventObjectOneOf0__Group__0 ) ) ;
    public final void ruleEventObjectOneOf0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:78:2: ( ( ( rule__EventObjectOneOf0__Group__0 ) ) )
            // InternalEventObjectOneOf0Parser.g:79:2: ( ( rule__EventObjectOneOf0__Group__0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:79:2: ( ( rule__EventObjectOneOf0__Group__0 ) )
            // InternalEventObjectOneOf0Parser.g:80:3: ( rule__EventObjectOneOf0__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getGroup()); 
            }
            // InternalEventObjectOneOf0Parser.g:81:3: ( rule__EventObjectOneOf0__Group__0 )
            // InternalEventObjectOneOf0Parser.g:81:4: rule__EventObjectOneOf0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventObjectOneOf0"


    // $ANTLR start "entryRuleEventObjectOneOf0PropertiesAbstract"
    // InternalEventObjectOneOf0Parser.g:90:1: entryRuleEventObjectOneOf0PropertiesAbstract : ruleEventObjectOneOf0PropertiesAbstract EOF ;
    public final void entryRuleEventObjectOneOf0PropertiesAbstract() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:91:1: ( ruleEventObjectOneOf0PropertiesAbstract EOF )
            // InternalEventObjectOneOf0Parser.g:92:1: ruleEventObjectOneOf0PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventObjectOneOf0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0PropertiesAbstractRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEventObjectOneOf0PropertiesAbstract"


    // $ANTLR start "ruleEventObjectOneOf0PropertiesAbstract"
    // InternalEventObjectOneOf0Parser.g:99:1: ruleEventObjectOneOf0PropertiesAbstract : ( ( ruleEventObjectOneOf0AdditionalProperties ) ) ;
    public final void ruleEventObjectOneOf0PropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:103:2: ( ( ( ruleEventObjectOneOf0AdditionalProperties ) ) )
            // InternalEventObjectOneOf0Parser.g:104:2: ( ( ruleEventObjectOneOf0AdditionalProperties ) )
            {
            // InternalEventObjectOneOf0Parser.g:104:2: ( ( ruleEventObjectOneOf0AdditionalProperties ) )
            // InternalEventObjectOneOf0Parser.g:105:3: ( ruleEventObjectOneOf0AdditionalProperties )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0PropertiesAbstractAccess().getEventObjectOneOf0AdditionalPropertiesParserRuleCall()); 
            }
            // InternalEventObjectOneOf0Parser.g:106:3: ( ruleEventObjectOneOf0AdditionalProperties )
            // InternalEventObjectOneOf0Parser.g:106:4: ruleEventObjectOneOf0AdditionalProperties
            {
            pushFollow(FOLLOW_2);
            ruleEventObjectOneOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0PropertiesAbstractAccess().getEventObjectOneOf0AdditionalPropertiesParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventObjectOneOf0PropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalEventObjectOneOf0Parser.g:115:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:116:1: ( ruleValue EOF )
            // InternalEventObjectOneOf0Parser.g:117:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:124:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:128:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalEventObjectOneOf0Parser.g:129:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalEventObjectOneOf0Parser.g:129:2: ( ( rule__Value__Alternatives ) )
            // InternalEventObjectOneOf0Parser.g:130:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalEventObjectOneOf0Parser.g:131:3: ( rule__Value__Alternatives )
            // InternalEventObjectOneOf0Parser.g:131:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleEventObjectOneOf0AdditionalProperties"
    // InternalEventObjectOneOf0Parser.g:140:1: entryRuleEventObjectOneOf0AdditionalProperties : ruleEventObjectOneOf0AdditionalProperties EOF ;
    public final void entryRuleEventObjectOneOf0AdditionalProperties() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:141:1: ( ruleEventObjectOneOf0AdditionalProperties EOF )
            // InternalEventObjectOneOf0Parser.g:142:1: ruleEventObjectOneOf0AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventObjectOneOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0AdditionalPropertiesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEventObjectOneOf0AdditionalProperties"


    // $ANTLR start "ruleEventObjectOneOf0AdditionalProperties"
    // InternalEventObjectOneOf0Parser.g:149:1: ruleEventObjectOneOf0AdditionalProperties : ( ( rule__EventObjectOneOf0AdditionalProperties__Group__0 ) ) ;
    public final void ruleEventObjectOneOf0AdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:153:2: ( ( ( rule__EventObjectOneOf0AdditionalProperties__Group__0 ) ) )
            // InternalEventObjectOneOf0Parser.g:154:2: ( ( rule__EventObjectOneOf0AdditionalProperties__Group__0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:154:2: ( ( rule__EventObjectOneOf0AdditionalProperties__Group__0 ) )
            // InternalEventObjectOneOf0Parser.g:155:3: ( rule__EventObjectOneOf0AdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getGroup()); 
            }
            // InternalEventObjectOneOf0Parser.g:156:3: ( rule__EventObjectOneOf0AdditionalProperties__Group__0 )
            // InternalEventObjectOneOf0Parser.g:156:4: rule__EventObjectOneOf0AdditionalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0AdditionalProperties__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventObjectOneOf0AdditionalProperties"


    // $ANTLR start "entryRuleEString"
    // InternalEventObjectOneOf0Parser.g:165:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:166:1: ( ruleEString EOF )
            // InternalEventObjectOneOf0Parser.g:167:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:174:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:178:2: ( ( ruleVALID_STRING ) )
            // InternalEventObjectOneOf0Parser.g:179:2: ( ruleVALID_STRING )
            {
            // InternalEventObjectOneOf0Parser.g:179:2: ( ruleVALID_STRING )
            // InternalEventObjectOneOf0Parser.g:180:3: ruleVALID_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleVALID_STRING();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleJsonDocument"
    // InternalEventObjectOneOf0Parser.g:190:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:191:1: ( ruleJsonDocument EOF )
            // InternalEventObjectOneOf0Parser.g:192:1: ruleJsonDocument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonDocumentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:199:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:203:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalEventObjectOneOf0Parser.g:204:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalEventObjectOneOf0Parser.g:204:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalEventObjectOneOf0Parser.g:205:3: ( rule__JsonDocument__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            }
            // InternalEventObjectOneOf0Parser.g:206:3: ( rule__JsonDocument__ValueAssignment )
            // InternalEventObjectOneOf0Parser.g:206:4: rule__JsonDocument__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JsonDocument__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:215:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:216:1: ( ruleStringValue EOF )
            // InternalEventObjectOneOf0Parser.g:217:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:224:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:228:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalEventObjectOneOf0Parser.g:229:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalEventObjectOneOf0Parser.g:229:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalEventObjectOneOf0Parser.g:230:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalEventObjectOneOf0Parser.g:231:3: ( rule__StringValue__ValueAssignment )
            // InternalEventObjectOneOf0Parser.g:231:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:240:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:241:1: ( ruleArrayValue EOF )
            // InternalEventObjectOneOf0Parser.g:242:1: ruleArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:249:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:253:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalEventObjectOneOf0Parser.g:254:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:254:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalEventObjectOneOf0Parser.g:255:3: ( rule__ArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup()); 
            }
            // InternalEventObjectOneOf0Parser.g:256:3: ( rule__ArrayValue__Group__0 )
            // InternalEventObjectOneOf0Parser.g:256:4: rule__ArrayValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:265:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:266:1: ( ruleNullValue EOF )
            // InternalEventObjectOneOf0Parser.g:267:1: ruleNullValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNullValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:274:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:278:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalEventObjectOneOf0Parser.g:279:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalEventObjectOneOf0Parser.g:279:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalEventObjectOneOf0Parser.g:280:3: ( rule__NullValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            }
            // InternalEventObjectOneOf0Parser.g:281:3: ( rule__NullValue__ValueAssignment )
            // InternalEventObjectOneOf0Parser.g:281:4: rule__NullValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NullValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullValueAccess().getValueAssignment()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:290:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:291:1: ( ruleNumberValue EOF )
            // InternalEventObjectOneOf0Parser.g:292:1: ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:299:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:303:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalEventObjectOneOf0Parser.g:304:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalEventObjectOneOf0Parser.g:304:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalEventObjectOneOf0Parser.g:305:3: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // InternalEventObjectOneOf0Parser.g:306:3: ( rule__NumberValue__ValueAssignment )
            // InternalEventObjectOneOf0Parser.g:306:4: rule__NumberValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:315:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:316:1: ( ruleObjectValue EOF )
            // InternalEventObjectOneOf0Parser.g:317:1: ruleObjectValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObjectValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:324:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:328:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalEventObjectOneOf0Parser.g:329:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:329:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalEventObjectOneOf0Parser.g:330:3: ( rule__ObjectValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup()); 
            }
            // InternalEventObjectOneOf0Parser.g:331:3: ( rule__ObjectValue__Group__0 )
            // InternalEventObjectOneOf0Parser.g:331:4: rule__ObjectValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:340:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:341:1: ( ruleBooleanValue EOF )
            // InternalEventObjectOneOf0Parser.g:342:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:349:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:353:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalEventObjectOneOf0Parser.g:354:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalEventObjectOneOf0Parser.g:354:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalEventObjectOneOf0Parser.g:355:3: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalEventObjectOneOf0Parser.g:356:3: ( rule__BooleanValue__ValueAssignment )
            // InternalEventObjectOneOf0Parser.g:356:4: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleEDouble"
    // InternalEventObjectOneOf0Parser.g:365:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:366:1: ( ruleEDouble EOF )
            // InternalEventObjectOneOf0Parser.g:367:1: ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:374:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:378:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalEventObjectOneOf0Parser.g:379:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalEventObjectOneOf0Parser.g:379:2: ( ( rule__EDouble__Alternatives ) )
            // InternalEventObjectOneOf0Parser.g:380:3: ( rule__EDouble__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            }
            // InternalEventObjectOneOf0Parser.g:381:3: ( rule__EDouble__Alternatives )
            // InternalEventObjectOneOf0Parser.g:381:4: rule__EDouble__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:390:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:391:1: ( ruleKeyValuePair EOF )
            // InternalEventObjectOneOf0Parser.g:392:1: ruleKeyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:399:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:403:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalEventObjectOneOf0Parser.g:404:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:404:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalEventObjectOneOf0Parser.g:405:3: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // InternalEventObjectOneOf0Parser.g:406:3: ( rule__KeyValuePair__Group__0 )
            // InternalEventObjectOneOf0Parser.g:406:4: rule__KeyValuePair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:415:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:416:1: ( ruleEBoolean EOF )
            // InternalEventObjectOneOf0Parser.g:417:1: ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:424:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:428:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalEventObjectOneOf0Parser.g:429:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalEventObjectOneOf0Parser.g:429:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalEventObjectOneOf0Parser.g:430:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalEventObjectOneOf0Parser.g:431:3: ( rule__EBoolean__Alternatives )
            // InternalEventObjectOneOf0Parser.g:431:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:440:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalEventObjectOneOf0Parser.g:441:1: ( ruleVALID_STRING EOF )
            // InternalEventObjectOneOf0Parser.g:442:1: ruleVALID_STRING EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALID_STRINGRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVALID_STRING();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALID_STRINGRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalEventObjectOneOf0Parser.g:449:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:453:2: ( ( RULE_STRING ) )
            // InternalEventObjectOneOf0Parser.g:454:2: ( RULE_STRING )
            {
            // InternalEventObjectOneOf0Parser.g:454:2: ( RULE_STRING )
            // InternalEventObjectOneOf0Parser.g:455:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:465:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:469:1: ( ( ( Null ) ) )
            // InternalEventObjectOneOf0Parser.g:470:2: ( ( Null ) )
            {
            // InternalEventObjectOneOf0Parser.g:470:2: ( ( Null ) )
            // InternalEventObjectOneOf0Parser.g:471:3: ( Null )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            }
            // InternalEventObjectOneOf0Parser.g:472:3: ( Null )
            // InternalEventObjectOneOf0Parser.g:472:4: Null
            {
            match(input,Null,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:480:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:484:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEventObjectOneOf0Parser.g:485:2: ( ruleStringValue )
                    {
                    // InternalEventObjectOneOf0Parser.g:485:2: ( ruleStringValue )
                    // InternalEventObjectOneOf0Parser.g:486:3: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEventObjectOneOf0Parser.g:491:2: ( ruleArrayValue )
                    {
                    // InternalEventObjectOneOf0Parser.g:491:2: ( ruleArrayValue )
                    // InternalEventObjectOneOf0Parser.g:492:3: ruleArrayValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArrayValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEventObjectOneOf0Parser.g:497:2: ( ruleNullValue )
                    {
                    // InternalEventObjectOneOf0Parser.g:497:2: ( ruleNullValue )
                    // InternalEventObjectOneOf0Parser.g:498:3: ruleNullValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNullValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNullValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNullValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEventObjectOneOf0Parser.g:503:2: ( ruleNumberValue )
                    {
                    // InternalEventObjectOneOf0Parser.g:503:2: ( ruleNumberValue )
                    // InternalEventObjectOneOf0Parser.g:504:3: ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEventObjectOneOf0Parser.g:509:2: ( ruleObjectValue )
                    {
                    // InternalEventObjectOneOf0Parser.g:509:2: ( ruleObjectValue )
                    // InternalEventObjectOneOf0Parser.g:510:3: ruleObjectValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleObjectValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEventObjectOneOf0Parser.g:515:2: ( ruleBooleanValue )
                    {
                    // InternalEventObjectOneOf0Parser.g:515:2: ( ruleBooleanValue )
                    // InternalEventObjectOneOf0Parser.g:516:3: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5()); 
                    }

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
    // InternalEventObjectOneOf0Parser.g:525:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:529:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_E_INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_E_DOUBLE) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEventObjectOneOf0Parser.g:530:2: ( RULE_E_INT )
                    {
                    // InternalEventObjectOneOf0Parser.g:530:2: ( RULE_E_INT )
                    // InternalEventObjectOneOf0Parser.g:531:3: RULE_E_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_E_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEventObjectOneOf0Parser.g:536:2: ( RULE_E_DOUBLE )
                    {
                    // InternalEventObjectOneOf0Parser.g:536:2: ( RULE_E_DOUBLE )
                    // InternalEventObjectOneOf0Parser.g:537:3: RULE_E_DOUBLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); 
                    }
                    match(input,RULE_E_DOUBLE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); 
                    }

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
    // InternalEventObjectOneOf0Parser.g:546:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:550:1: ( ( True ) | ( False ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==True) ) {
                alt3=1;
            }
            else if ( (LA3_0==False) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEventObjectOneOf0Parser.g:551:2: ( True )
                    {
                    // InternalEventObjectOneOf0Parser.g:551:2: ( True )
                    // InternalEventObjectOneOf0Parser.g:552:3: True
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,True,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEventObjectOneOf0Parser.g:557:2: ( False )
                    {
                    // InternalEventObjectOneOf0Parser.g:557:2: ( False )
                    // InternalEventObjectOneOf0Parser.g:558:3: False
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,False,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    }

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


    // $ANTLR start "rule__EventObjectOneOf0__Group__0"
    // InternalEventObjectOneOf0Parser.g:567:1: rule__EventObjectOneOf0__Group__0 : rule__EventObjectOneOf0__Group__0__Impl rule__EventObjectOneOf0__Group__1 ;
    public final void rule__EventObjectOneOf0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:571:1: ( rule__EventObjectOneOf0__Group__0__Impl rule__EventObjectOneOf0__Group__1 )
            // InternalEventObjectOneOf0Parser.g:572:2: rule__EventObjectOneOf0__Group__0__Impl rule__EventObjectOneOf0__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EventObjectOneOf0__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group__0"


    // $ANTLR start "rule__EventObjectOneOf0__Group__0__Impl"
    // InternalEventObjectOneOf0Parser.g:579:1: rule__EventObjectOneOf0__Group__0__Impl : ( () ) ;
    public final void rule__EventObjectOneOf0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:583:1: ( ( () ) )
            // InternalEventObjectOneOf0Parser.g:584:1: ( () )
            {
            // InternalEventObjectOneOf0Parser.g:584:1: ( () )
            // InternalEventObjectOneOf0Parser.g:585:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getEventObjectOneOf0Action_0()); 
            }
            // InternalEventObjectOneOf0Parser.g:586:2: ()
            // InternalEventObjectOneOf0Parser.g:586:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getEventObjectOneOf0Action_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group__0__Impl"


    // $ANTLR start "rule__EventObjectOneOf0__Group__1"
    // InternalEventObjectOneOf0Parser.g:594:1: rule__EventObjectOneOf0__Group__1 : rule__EventObjectOneOf0__Group__1__Impl rule__EventObjectOneOf0__Group__2 ;
    public final void rule__EventObjectOneOf0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:598:1: ( rule__EventObjectOneOf0__Group__1__Impl rule__EventObjectOneOf0__Group__2 )
            // InternalEventObjectOneOf0Parser.g:599:2: rule__EventObjectOneOf0__Group__1__Impl rule__EventObjectOneOf0__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EventObjectOneOf0__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group__1"


    // $ANTLR start "rule__EventObjectOneOf0__Group__1__Impl"
    // InternalEventObjectOneOf0Parser.g:606:1: rule__EventObjectOneOf0__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__EventObjectOneOf0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:610:1: ( ( LeftCurlyBracket ) )
            // InternalEventObjectOneOf0Parser.g:611:1: ( LeftCurlyBracket )
            {
            // InternalEventObjectOneOf0Parser.g:611:1: ( LeftCurlyBracket )
            // InternalEventObjectOneOf0Parser.g:612:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group__1__Impl"


    // $ANTLR start "rule__EventObjectOneOf0__Group__2"
    // InternalEventObjectOneOf0Parser.g:621:1: rule__EventObjectOneOf0__Group__2 : rule__EventObjectOneOf0__Group__2__Impl rule__EventObjectOneOf0__Group__3 ;
    public final void rule__EventObjectOneOf0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:625:1: ( rule__EventObjectOneOf0__Group__2__Impl rule__EventObjectOneOf0__Group__3 )
            // InternalEventObjectOneOf0Parser.g:626:2: rule__EventObjectOneOf0__Group__2__Impl rule__EventObjectOneOf0__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__EventObjectOneOf0__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group__2"


    // $ANTLR start "rule__EventObjectOneOf0__Group__2__Impl"
    // InternalEventObjectOneOf0Parser.g:633:1: rule__EventObjectOneOf0__Group__2__Impl : ( ( rule__EventObjectOneOf0__Group_2__0 )? ) ;
    public final void rule__EventObjectOneOf0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:637:1: ( ( ( rule__EventObjectOneOf0__Group_2__0 )? ) )
            // InternalEventObjectOneOf0Parser.g:638:1: ( ( rule__EventObjectOneOf0__Group_2__0 )? )
            {
            // InternalEventObjectOneOf0Parser.g:638:1: ( ( rule__EventObjectOneOf0__Group_2__0 )? )
            // InternalEventObjectOneOf0Parser.g:639:2: ( rule__EventObjectOneOf0__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getGroup_2()); 
            }
            // InternalEventObjectOneOf0Parser.g:640:2: ( rule__EventObjectOneOf0__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEventObjectOneOf0Parser.g:640:3: rule__EventObjectOneOf0__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventObjectOneOf0__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group__2__Impl"


    // $ANTLR start "rule__EventObjectOneOf0__Group__3"
    // InternalEventObjectOneOf0Parser.g:648:1: rule__EventObjectOneOf0__Group__3 : rule__EventObjectOneOf0__Group__3__Impl ;
    public final void rule__EventObjectOneOf0__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:652:1: ( rule__EventObjectOneOf0__Group__3__Impl )
            // InternalEventObjectOneOf0Parser.g:653:2: rule__EventObjectOneOf0__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group__3"


    // $ANTLR start "rule__EventObjectOneOf0__Group__3__Impl"
    // InternalEventObjectOneOf0Parser.g:659:1: rule__EventObjectOneOf0__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__EventObjectOneOf0__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:663:1: ( ( RightCurlyBracket ) )
            // InternalEventObjectOneOf0Parser.g:664:1: ( RightCurlyBracket )
            {
            // InternalEventObjectOneOf0Parser.g:664:1: ( RightCurlyBracket )
            // InternalEventObjectOneOf0Parser.g:665:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group__3__Impl"


    // $ANTLR start "rule__EventObjectOneOf0__Group_2__0"
    // InternalEventObjectOneOf0Parser.g:675:1: rule__EventObjectOneOf0__Group_2__0 : rule__EventObjectOneOf0__Group_2__0__Impl rule__EventObjectOneOf0__Group_2__1 ;
    public final void rule__EventObjectOneOf0__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:679:1: ( rule__EventObjectOneOf0__Group_2__0__Impl rule__EventObjectOneOf0__Group_2__1 )
            // InternalEventObjectOneOf0Parser.g:680:2: rule__EventObjectOneOf0__Group_2__0__Impl rule__EventObjectOneOf0__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EventObjectOneOf0__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group_2__0"


    // $ANTLR start "rule__EventObjectOneOf0__Group_2__0__Impl"
    // InternalEventObjectOneOf0Parser.g:687:1: rule__EventObjectOneOf0__Group_2__0__Impl : ( ( rule__EventObjectOneOf0__EventObjectAssignment_2_0 ) ) ;
    public final void rule__EventObjectOneOf0__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:691:1: ( ( ( rule__EventObjectOneOf0__EventObjectAssignment_2_0 ) ) )
            // InternalEventObjectOneOf0Parser.g:692:1: ( ( rule__EventObjectOneOf0__EventObjectAssignment_2_0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:692:1: ( ( rule__EventObjectOneOf0__EventObjectAssignment_2_0 ) )
            // InternalEventObjectOneOf0Parser.g:693:2: ( rule__EventObjectOneOf0__EventObjectAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getEventObjectAssignment_2_0()); 
            }
            // InternalEventObjectOneOf0Parser.g:694:2: ( rule__EventObjectOneOf0__EventObjectAssignment_2_0 )
            // InternalEventObjectOneOf0Parser.g:694:3: rule__EventObjectOneOf0__EventObjectAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__EventObjectAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getEventObjectAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group_2__0__Impl"


    // $ANTLR start "rule__EventObjectOneOf0__Group_2__1"
    // InternalEventObjectOneOf0Parser.g:702:1: rule__EventObjectOneOf0__Group_2__1 : rule__EventObjectOneOf0__Group_2__1__Impl ;
    public final void rule__EventObjectOneOf0__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:706:1: ( rule__EventObjectOneOf0__Group_2__1__Impl )
            // InternalEventObjectOneOf0Parser.g:707:2: rule__EventObjectOneOf0__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group_2__1"


    // $ANTLR start "rule__EventObjectOneOf0__Group_2__1__Impl"
    // InternalEventObjectOneOf0Parser.g:713:1: rule__EventObjectOneOf0__Group_2__1__Impl : ( ( rule__EventObjectOneOf0__Group_2_1__0 )* ) ;
    public final void rule__EventObjectOneOf0__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:717:1: ( ( ( rule__EventObjectOneOf0__Group_2_1__0 )* ) )
            // InternalEventObjectOneOf0Parser.g:718:1: ( ( rule__EventObjectOneOf0__Group_2_1__0 )* )
            {
            // InternalEventObjectOneOf0Parser.g:718:1: ( ( rule__EventObjectOneOf0__Group_2_1__0 )* )
            // InternalEventObjectOneOf0Parser.g:719:2: ( rule__EventObjectOneOf0__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getGroup_2_1()); 
            }
            // InternalEventObjectOneOf0Parser.g:720:2: ( rule__EventObjectOneOf0__Group_2_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEventObjectOneOf0Parser.g:720:3: rule__EventObjectOneOf0__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__EventObjectOneOf0__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group_2__1__Impl"


    // $ANTLR start "rule__EventObjectOneOf0__Group_2_1__0"
    // InternalEventObjectOneOf0Parser.g:729:1: rule__EventObjectOneOf0__Group_2_1__0 : rule__EventObjectOneOf0__Group_2_1__0__Impl rule__EventObjectOneOf0__Group_2_1__1 ;
    public final void rule__EventObjectOneOf0__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:733:1: ( rule__EventObjectOneOf0__Group_2_1__0__Impl rule__EventObjectOneOf0__Group_2_1__1 )
            // InternalEventObjectOneOf0Parser.g:734:2: rule__EventObjectOneOf0__Group_2_1__0__Impl rule__EventObjectOneOf0__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__EventObjectOneOf0__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group_2_1__0"


    // $ANTLR start "rule__EventObjectOneOf0__Group_2_1__0__Impl"
    // InternalEventObjectOneOf0Parser.g:741:1: rule__EventObjectOneOf0__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__EventObjectOneOf0__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:745:1: ( ( Comma ) )
            // InternalEventObjectOneOf0Parser.g:746:1: ( Comma )
            {
            // InternalEventObjectOneOf0Parser.g:746:1: ( Comma )
            // InternalEventObjectOneOf0Parser.g:747:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group_2_1__0__Impl"


    // $ANTLR start "rule__EventObjectOneOf0__Group_2_1__1"
    // InternalEventObjectOneOf0Parser.g:756:1: rule__EventObjectOneOf0__Group_2_1__1 : rule__EventObjectOneOf0__Group_2_1__1__Impl ;
    public final void rule__EventObjectOneOf0__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:760:1: ( rule__EventObjectOneOf0__Group_2_1__1__Impl )
            // InternalEventObjectOneOf0Parser.g:761:2: rule__EventObjectOneOf0__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group_2_1__1"


    // $ANTLR start "rule__EventObjectOneOf0__Group_2_1__1__Impl"
    // InternalEventObjectOneOf0Parser.g:767:1: rule__EventObjectOneOf0__Group_2_1__1__Impl : ( ( rule__EventObjectOneOf0__EventObjectAssignment_2_1_1 ) ) ;
    public final void rule__EventObjectOneOf0__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:771:1: ( ( ( rule__EventObjectOneOf0__EventObjectAssignment_2_1_1 ) ) )
            // InternalEventObjectOneOf0Parser.g:772:1: ( ( rule__EventObjectOneOf0__EventObjectAssignment_2_1_1 ) )
            {
            // InternalEventObjectOneOf0Parser.g:772:1: ( ( rule__EventObjectOneOf0__EventObjectAssignment_2_1_1 ) )
            // InternalEventObjectOneOf0Parser.g:773:2: ( rule__EventObjectOneOf0__EventObjectAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getEventObjectAssignment_2_1_1()); 
            }
            // InternalEventObjectOneOf0Parser.g:774:2: ( rule__EventObjectOneOf0__EventObjectAssignment_2_1_1 )
            // InternalEventObjectOneOf0Parser.g:774:3: rule__EventObjectOneOf0__EventObjectAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0__EventObjectAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getEventObjectAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__Group_2_1__1__Impl"


    // $ANTLR start "rule__EventObjectOneOf0AdditionalProperties__Group__0"
    // InternalEventObjectOneOf0Parser.g:783:1: rule__EventObjectOneOf0AdditionalProperties__Group__0 : rule__EventObjectOneOf0AdditionalProperties__Group__0__Impl rule__EventObjectOneOf0AdditionalProperties__Group__1 ;
    public final void rule__EventObjectOneOf0AdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:787:1: ( rule__EventObjectOneOf0AdditionalProperties__Group__0__Impl rule__EventObjectOneOf0AdditionalProperties__Group__1 )
            // InternalEventObjectOneOf0Parser.g:788:2: rule__EventObjectOneOf0AdditionalProperties__Group__0__Impl rule__EventObjectOneOf0AdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EventObjectOneOf0AdditionalProperties__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0AdditionalProperties__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0AdditionalProperties__Group__0"


    // $ANTLR start "rule__EventObjectOneOf0AdditionalProperties__Group__0__Impl"
    // InternalEventObjectOneOf0Parser.g:795:1: rule__EventObjectOneOf0AdditionalProperties__Group__0__Impl : ( ( rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__EventObjectOneOf0AdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:799:1: ( ( ( rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0 ) ) )
            // InternalEventObjectOneOf0Parser.g:800:1: ( ( rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:800:1: ( ( rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0 ) )
            // InternalEventObjectOneOf0Parser.g:801:2: ( rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalEventObjectOneOf0Parser.g:802:2: ( rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0 )
            // InternalEventObjectOneOf0Parser.g:802:3: rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getKeyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0AdditionalProperties__Group__0__Impl"


    // $ANTLR start "rule__EventObjectOneOf0AdditionalProperties__Group__1"
    // InternalEventObjectOneOf0Parser.g:810:1: rule__EventObjectOneOf0AdditionalProperties__Group__1 : rule__EventObjectOneOf0AdditionalProperties__Group__1__Impl rule__EventObjectOneOf0AdditionalProperties__Group__2 ;
    public final void rule__EventObjectOneOf0AdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:814:1: ( rule__EventObjectOneOf0AdditionalProperties__Group__1__Impl rule__EventObjectOneOf0AdditionalProperties__Group__2 )
            // InternalEventObjectOneOf0Parser.g:815:2: rule__EventObjectOneOf0AdditionalProperties__Group__1__Impl rule__EventObjectOneOf0AdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EventObjectOneOf0AdditionalProperties__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0AdditionalProperties__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0AdditionalProperties__Group__1"


    // $ANTLR start "rule__EventObjectOneOf0AdditionalProperties__Group__1__Impl"
    // InternalEventObjectOneOf0Parser.g:822:1: rule__EventObjectOneOf0AdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__EventObjectOneOf0AdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:826:1: ( ( Colon ) )
            // InternalEventObjectOneOf0Parser.g:827:1: ( Colon )
            {
            // InternalEventObjectOneOf0Parser.g:827:1: ( Colon )
            // InternalEventObjectOneOf0Parser.g:828:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0AdditionalProperties__Group__1__Impl"


    // $ANTLR start "rule__EventObjectOneOf0AdditionalProperties__Group__2"
    // InternalEventObjectOneOf0Parser.g:837:1: rule__EventObjectOneOf0AdditionalProperties__Group__2 : rule__EventObjectOneOf0AdditionalProperties__Group__2__Impl ;
    public final void rule__EventObjectOneOf0AdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:841:1: ( rule__EventObjectOneOf0AdditionalProperties__Group__2__Impl )
            // InternalEventObjectOneOf0Parser.g:842:2: rule__EventObjectOneOf0AdditionalProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0AdditionalProperties__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0AdditionalProperties__Group__2"


    // $ANTLR start "rule__EventObjectOneOf0AdditionalProperties__Group__2__Impl"
    // InternalEventObjectOneOf0Parser.g:848:1: rule__EventObjectOneOf0AdditionalProperties__Group__2__Impl : ( ( rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__EventObjectOneOf0AdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:852:1: ( ( ( rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalEventObjectOneOf0Parser.g:853:1: ( ( rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalEventObjectOneOf0Parser.g:853:1: ( ( rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalEventObjectOneOf0Parser.g:854:2: ( rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalEventObjectOneOf0Parser.g:855:2: ( rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalEventObjectOneOf0Parser.g:855:3: rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0AdditionalProperties__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalEventObjectOneOf0Parser.g:864:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:868:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalEventObjectOneOf0Parser.g:869:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ArrayValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:876:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:880:1: ( ( () ) )
            // InternalEventObjectOneOf0Parser.g:881:1: ( () )
            {
            // InternalEventObjectOneOf0Parser.g:881:1: ( () )
            // InternalEventObjectOneOf0Parser.g:882:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            }
            // InternalEventObjectOneOf0Parser.g:883:2: ()
            // InternalEventObjectOneOf0Parser.g:883:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            }

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
    // InternalEventObjectOneOf0Parser.g:891:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:895:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalEventObjectOneOf0Parser.g:896:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ArrayValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:903:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:907:1: ( ( LeftSquareBracket ) )
            // InternalEventObjectOneOf0Parser.g:908:1: ( LeftSquareBracket )
            {
            // InternalEventObjectOneOf0Parser.g:908:1: ( LeftSquareBracket )
            // InternalEventObjectOneOf0Parser.g:909:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:918:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:922:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalEventObjectOneOf0Parser.g:923:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ArrayValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:930:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:934:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalEventObjectOneOf0Parser.g:935:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalEventObjectOneOf0Parser.g:935:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalEventObjectOneOf0Parser.g:936:2: ( rule__ArrayValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            }
            // InternalEventObjectOneOf0Parser.g:937:2: ( rule__ArrayValue__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=False && LA6_0<=True)||LA6_0==LeftSquareBracket||LA6_0==LeftCurlyBracket||(LA6_0>=RULE_STRING && LA6_0<=RULE_E_DOUBLE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEventObjectOneOf0Parser.g:937:3: rule__ArrayValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayValue__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:945:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:949:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalEventObjectOneOf0Parser.g:950:2: rule__ArrayValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:956:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:960:1: ( ( RightSquareBracket ) )
            // InternalEventObjectOneOf0Parser.g:961:1: ( RightSquareBracket )
            {
            // InternalEventObjectOneOf0Parser.g:961:1: ( RightSquareBracket )
            // InternalEventObjectOneOf0Parser.g:962:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:972:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:976:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalEventObjectOneOf0Parser.g:977:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ArrayValue__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:984:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:988:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalEventObjectOneOf0Parser.g:989:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:989:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalEventObjectOneOf0Parser.g:990:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            }
            // InternalEventObjectOneOf0Parser.g:991:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalEventObjectOneOf0Parser.g:991:3: rule__ArrayValue__ValueAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ValueAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:999:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1003:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalEventObjectOneOf0Parser.g:1004:2: rule__ArrayValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1010:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1014:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalEventObjectOneOf0Parser.g:1015:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalEventObjectOneOf0Parser.g:1015:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalEventObjectOneOf0Parser.g:1016:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            }
            // InternalEventObjectOneOf0Parser.g:1017:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEventObjectOneOf0Parser.g:1017:3: rule__ArrayValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ArrayValue__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1026:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1030:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalEventObjectOneOf0Parser.g:1031:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ArrayValue__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1038:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1042:1: ( ( Comma ) )
            // InternalEventObjectOneOf0Parser.g:1043:1: ( Comma )
            {
            // InternalEventObjectOneOf0Parser.g:1043:1: ( Comma )
            // InternalEventObjectOneOf0Parser.g:1044:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1053:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1057:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalEventObjectOneOf0Parser.g:1058:2: rule__ArrayValue__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1064:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1068:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalEventObjectOneOf0Parser.g:1069:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalEventObjectOneOf0Parser.g:1069:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalEventObjectOneOf0Parser.g:1070:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            }
            // InternalEventObjectOneOf0Parser.g:1071:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalEventObjectOneOf0Parser.g:1071:3: rule__ArrayValue__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ValueAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1080:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1084:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalEventObjectOneOf0Parser.g:1085:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ObjectValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1092:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1096:1: ( ( () ) )
            // InternalEventObjectOneOf0Parser.g:1097:1: ( () )
            {
            // InternalEventObjectOneOf0Parser.g:1097:1: ( () )
            // InternalEventObjectOneOf0Parser.g:1098:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }
            // InternalEventObjectOneOf0Parser.g:1099:2: ()
            // InternalEventObjectOneOf0Parser.g:1099:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }

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
    // InternalEventObjectOneOf0Parser.g:1107:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1111:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalEventObjectOneOf0Parser.g:1112:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ObjectValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1119:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1123:1: ( ( LeftCurlyBracket ) )
            // InternalEventObjectOneOf0Parser.g:1124:1: ( LeftCurlyBracket )
            {
            // InternalEventObjectOneOf0Parser.g:1124:1: ( LeftCurlyBracket )
            // InternalEventObjectOneOf0Parser.g:1125:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1134:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1138:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalEventObjectOneOf0Parser.g:1139:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ObjectValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1146:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1150:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalEventObjectOneOf0Parser.g:1151:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalEventObjectOneOf0Parser.g:1151:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalEventObjectOneOf0Parser.g:1152:2: ( rule__ObjectValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            }
            // InternalEventObjectOneOf0Parser.g:1153:2: ( rule__ObjectValue__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEventObjectOneOf0Parser.g:1153:3: rule__ObjectValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectValue__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getGroup_2()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1161:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1165:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalEventObjectOneOf0Parser.g:1166:2: rule__ObjectValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1172:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1176:1: ( ( RightCurlyBracket ) )
            // InternalEventObjectOneOf0Parser.g:1177:1: ( RightCurlyBracket )
            {
            // InternalEventObjectOneOf0Parser.g:1177:1: ( RightCurlyBracket )
            // InternalEventObjectOneOf0Parser.g:1178:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1188:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1192:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalEventObjectOneOf0Parser.g:1193:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ObjectValue__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1200:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1204:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalEventObjectOneOf0Parser.g:1205:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:1205:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalEventObjectOneOf0Parser.g:1206:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            }
            // InternalEventObjectOneOf0Parser.g:1207:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalEventObjectOneOf0Parser.g:1207:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__KeyvaluepairAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1215:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1219:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalEventObjectOneOf0Parser.g:1220:2: rule__ObjectValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1226:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1230:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalEventObjectOneOf0Parser.g:1231:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalEventObjectOneOf0Parser.g:1231:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalEventObjectOneOf0Parser.g:1232:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            }
            // InternalEventObjectOneOf0Parser.g:1233:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Comma) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEventObjectOneOf0Parser.g:1233:3: rule__ObjectValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ObjectValue__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1242:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1246:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalEventObjectOneOf0Parser.g:1247:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ObjectValue__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1254:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1258:1: ( ( Comma ) )
            // InternalEventObjectOneOf0Parser.g:1259:1: ( Comma )
            {
            // InternalEventObjectOneOf0Parser.g:1259:1: ( Comma )
            // InternalEventObjectOneOf0Parser.g:1260:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1269:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1273:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalEventObjectOneOf0Parser.g:1274:2: rule__ObjectValue__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1280:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1284:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalEventObjectOneOf0Parser.g:1285:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalEventObjectOneOf0Parser.g:1285:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalEventObjectOneOf0Parser.g:1286:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            }
            // InternalEventObjectOneOf0Parser.g:1287:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalEventObjectOneOf0Parser.g:1287:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectValue__KeyvaluepairAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1296:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1300:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalEventObjectOneOf0Parser.g:1301:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__KeyValuePair__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1308:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1312:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalEventObjectOneOf0Parser.g:1313:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalEventObjectOneOf0Parser.g:1313:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalEventObjectOneOf0Parser.g:1314:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // InternalEventObjectOneOf0Parser.g:1315:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalEventObjectOneOf0Parser.g:1315:3: rule__KeyValuePair__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1323:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1327:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalEventObjectOneOf0Parser.g:1328:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__KeyValuePair__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1335:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1339:1: ( ( Colon ) )
            // InternalEventObjectOneOf0Parser.g:1340:1: ( Colon )
            {
            // InternalEventObjectOneOf0Parser.g:1340:1: ( Colon )
            // InternalEventObjectOneOf0Parser.g:1341:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getColonKeyword_1()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1350:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1354:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalEventObjectOneOf0Parser.g:1355:2: rule__KeyValuePair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1361:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1365:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalEventObjectOneOf0Parser.g:1366:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalEventObjectOneOf0Parser.g:1366:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalEventObjectOneOf0Parser.g:1367:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // InternalEventObjectOneOf0Parser.g:1368:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalEventObjectOneOf0Parser.g:1368:3: rule__KeyValuePair__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeyValuePair__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EventObjectOneOf0__EventObjectAssignment_2_0"
    // InternalEventObjectOneOf0Parser.g:1377:1: rule__EventObjectOneOf0__EventObjectAssignment_2_0 : ( ruleEventObjectOneOf0PropertiesAbstract ) ;
    public final void rule__EventObjectOneOf0__EventObjectAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1381:1: ( ( ruleEventObjectOneOf0PropertiesAbstract ) )
            // InternalEventObjectOneOf0Parser.g:1382:2: ( ruleEventObjectOneOf0PropertiesAbstract )
            {
            // InternalEventObjectOneOf0Parser.g:1382:2: ( ruleEventObjectOneOf0PropertiesAbstract )
            // InternalEventObjectOneOf0Parser.g:1383:3: ruleEventObjectOneOf0PropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getEventObjectEventObjectOneOf0PropertiesAbstractParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventObjectOneOf0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getEventObjectEventObjectOneOf0PropertiesAbstractParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__EventObjectAssignment_2_0"


    // $ANTLR start "rule__EventObjectOneOf0__EventObjectAssignment_2_1_1"
    // InternalEventObjectOneOf0Parser.g:1392:1: rule__EventObjectOneOf0__EventObjectAssignment_2_1_1 : ( ruleEventObjectOneOf0PropertiesAbstract ) ;
    public final void rule__EventObjectOneOf0__EventObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1396:1: ( ( ruleEventObjectOneOf0PropertiesAbstract ) )
            // InternalEventObjectOneOf0Parser.g:1397:2: ( ruleEventObjectOneOf0PropertiesAbstract )
            {
            // InternalEventObjectOneOf0Parser.g:1397:2: ( ruleEventObjectOneOf0PropertiesAbstract )
            // InternalEventObjectOneOf0Parser.g:1398:3: ruleEventObjectOneOf0PropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0Access().getEventObjectEventObjectOneOf0PropertiesAbstractParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventObjectOneOf0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0Access().getEventObjectEventObjectOneOf0PropertiesAbstractParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0__EventObjectAssignment_2_1_1"


    // $ANTLR start "rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0"
    // InternalEventObjectOneOf0Parser.g:1407:1: rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1411:1: ( ( ruleEString ) )
            // InternalEventObjectOneOf0Parser.g:1412:2: ( ruleEString )
            {
            // InternalEventObjectOneOf0Parser.g:1412:2: ( ruleEString )
            // InternalEventObjectOneOf0Parser.g:1413:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0AdditionalProperties__KeyAssignment_0"


    // $ANTLR start "rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2"
    // InternalEventObjectOneOf0Parser.g:1422:1: rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1426:1: ( ( ruleJsonDocument ) )
            // InternalEventObjectOneOf0Parser.g:1427:2: ( ruleJsonDocument )
            {
            // InternalEventObjectOneOf0Parser.g:1427:2: ( ruleJsonDocument )
            // InternalEventObjectOneOf0Parser.g:1428:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventObjectOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalEventObjectOneOf0Parser.g:1437:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1441:1: ( ( ruleValue ) )
            // InternalEventObjectOneOf0Parser.g:1442:2: ( ruleValue )
            {
            // InternalEventObjectOneOf0Parser.g:1442:2: ( ruleValue )
            // InternalEventObjectOneOf0Parser.g:1443:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1452:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1456:1: ( ( ruleEString ) )
            // InternalEventObjectOneOf0Parser.g:1457:2: ( ruleEString )
            {
            // InternalEventObjectOneOf0Parser.g:1457:2: ( ruleEString )
            // InternalEventObjectOneOf0Parser.g:1458:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1467:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1471:1: ( ( ruleValue ) )
            // InternalEventObjectOneOf0Parser.g:1472:2: ( ruleValue )
            {
            // InternalEventObjectOneOf0Parser.g:1472:2: ( ruleValue )
            // InternalEventObjectOneOf0Parser.g:1473:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1482:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1486:1: ( ( ruleValue ) )
            // InternalEventObjectOneOf0Parser.g:1487:2: ( ruleValue )
            {
            // InternalEventObjectOneOf0Parser.g:1487:2: ( ruleValue )
            // InternalEventObjectOneOf0Parser.g:1488:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1497:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1501:1: ( ( ruleNullEnum ) )
            // InternalEventObjectOneOf0Parser.g:1502:2: ( ruleNullEnum )
            {
            // InternalEventObjectOneOf0Parser.g:1502:2: ( ruleNullEnum )
            // InternalEventObjectOneOf0Parser.g:1503:3: ruleNullEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNullEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1512:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1516:1: ( ( ruleEDouble ) )
            // InternalEventObjectOneOf0Parser.g:1517:2: ( ruleEDouble )
            {
            // InternalEventObjectOneOf0Parser.g:1517:2: ( ruleEDouble )
            // InternalEventObjectOneOf0Parser.g:1518:3: ruleEDouble
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1527:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1531:1: ( ( ruleKeyValuePair ) )
            // InternalEventObjectOneOf0Parser.g:1532:2: ( ruleKeyValuePair )
            {
            // InternalEventObjectOneOf0Parser.g:1532:2: ( ruleKeyValuePair )
            // InternalEventObjectOneOf0Parser.g:1533:3: ruleKeyValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1542:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1546:1: ( ( ruleKeyValuePair ) )
            // InternalEventObjectOneOf0Parser.g:1547:2: ( ruleKeyValuePair )
            {
            // InternalEventObjectOneOf0Parser.g:1547:2: ( ruleKeyValuePair )
            // InternalEventObjectOneOf0Parser.g:1548:3: ruleKeyValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1557:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1561:1: ( ( ruleEBoolean ) )
            // InternalEventObjectOneOf0Parser.g:1562:2: ( ruleEBoolean )
            {
            // InternalEventObjectOneOf0Parser.g:1562:2: ( ruleEBoolean )
            // InternalEventObjectOneOf0Parser.g:1563:3: ruleEBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1572:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1576:1: ( ( ruleEString ) )
            // InternalEventObjectOneOf0Parser.g:1577:2: ( ruleEString )
            {
            // InternalEventObjectOneOf0Parser.g:1577:2: ( ruleEString )
            // InternalEventObjectOneOf0Parser.g:1578:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // InternalEventObjectOneOf0Parser.g:1587:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf0Parser.g:1591:1: ( ( ruleValue ) )
            // InternalEventObjectOneOf0Parser.g:1592:2: ( ruleValue )
            {
            // InternalEventObjectOneOf0Parser.g:1592:2: ( ruleValue )
            // InternalEventObjectOneOf0Parser.g:1593:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001CA70L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001CE70L});

}