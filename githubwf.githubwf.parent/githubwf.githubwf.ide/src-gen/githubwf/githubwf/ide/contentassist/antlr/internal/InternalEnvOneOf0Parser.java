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
import githubwf.githubwf.services.EnvOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEnvOneOf0Parser extends AbstractInternalContentAssistParser {
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


        public InternalEnvOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnvOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnvOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnvOneOf0Parser.g"; }


    	private EnvOneOf0GrammarAccess grammarAccess;
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

    	public void setGrammarAccess(EnvOneOf0GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEnvOneOf0"
    // InternalEnvOneOf0Parser.g:65:1: entryRuleEnvOneOf0 : ruleEnvOneOf0 EOF ;
    public final void entryRuleEnvOneOf0() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:66:1: ( ruleEnvOneOf0 EOF )
            // InternalEnvOneOf0Parser.g:67:1: ruleEnvOneOf0 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Rule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0"


    // $ANTLR start "ruleEnvOneOf0"
    // InternalEnvOneOf0Parser.g:74:1: ruleEnvOneOf0 : ( ( rule__EnvOneOf0__Group__0 ) ) ;
    public final void ruleEnvOneOf0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:78:2: ( ( ( rule__EnvOneOf0__Group__0 ) ) )
            // InternalEnvOneOf0Parser.g:79:2: ( ( rule__EnvOneOf0__Group__0 ) )
            {
            // InternalEnvOneOf0Parser.g:79:2: ( ( rule__EnvOneOf0__Group__0 ) )
            // InternalEnvOneOf0Parser.g:80:3: ( rule__EnvOneOf0__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getGroup()); 
            }
            // InternalEnvOneOf0Parser.g:81:3: ( rule__EnvOneOf0__Group__0 )
            // InternalEnvOneOf0Parser.g:81:4: rule__EnvOneOf0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getGroup()); 
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
    // $ANTLR end "ruleEnvOneOf0"


    // $ANTLR start "entryRuleEnvOneOf0PropertiesAbstract"
    // InternalEnvOneOf0Parser.g:90:1: entryRuleEnvOneOf0PropertiesAbstract : ruleEnvOneOf0PropertiesAbstract EOF ;
    public final void entryRuleEnvOneOf0PropertiesAbstract() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:91:1: ( ruleEnvOneOf0PropertiesAbstract EOF )
            // InternalEnvOneOf0Parser.g:92:1: ruleEnvOneOf0PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0PropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0PropertiesAbstract"


    // $ANTLR start "ruleEnvOneOf0PropertiesAbstract"
    // InternalEnvOneOf0Parser.g:99:1: ruleEnvOneOf0PropertiesAbstract : ( ( ruleEnvOneOf0AdditionalProperties ) ) ;
    public final void ruleEnvOneOf0PropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:103:2: ( ( ( ruleEnvOneOf0AdditionalProperties ) ) )
            // InternalEnvOneOf0Parser.g:104:2: ( ( ruleEnvOneOf0AdditionalProperties ) )
            {
            // InternalEnvOneOf0Parser.g:104:2: ( ( ruleEnvOneOf0AdditionalProperties ) )
            // InternalEnvOneOf0Parser.g:105:3: ( ruleEnvOneOf0AdditionalProperties )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0PropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesParserRuleCall()); 
            }
            // InternalEnvOneOf0Parser.g:106:3: ( ruleEnvOneOf0AdditionalProperties )
            // InternalEnvOneOf0Parser.g:106:4: ruleEnvOneOf0AdditionalProperties
            {
            pushFollow(FOLLOW_2);
            ruleEnvOneOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0PropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesParserRuleCall()); 
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
    // $ANTLR end "ruleEnvOneOf0PropertiesAbstract"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesAbstract"
    // InternalEnvOneOf0Parser.g:115:1: entryRuleEnvOneOf0AdditionalPropertiesAbstract : ruleEnvOneOf0AdditionalPropertiesAbstract EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesAbstract() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:116:1: ( ruleEnvOneOf0AdditionalPropertiesAbstract EOF )
            // InternalEnvOneOf0Parser.g:117:1: ruleEnvOneOf0AdditionalPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesAbstract"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesAbstract"
    // InternalEnvOneOf0Parser.g:124:1: ruleEnvOneOf0AdditionalPropertiesAbstract : ( ( rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:128:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives ) ) )
            // InternalEnvOneOf0Parser.g:129:2: ( ( rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives ) )
            {
            // InternalEnvOneOf0Parser.g:129:2: ( ( rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives ) )
            // InternalEnvOneOf0Parser.g:130:3: ( rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getAlternatives()); 
            }
            // InternalEnvOneOf0Parser.g:131:3: ( rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives )
            // InternalEnvOneOf0Parser.g:131:4: rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesAbstract"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesPropertiesAbstract"
    // InternalEnvOneOf0Parser.g:140:1: entryRuleEnvOneOf0AdditionalPropertiesPropertiesAbstract : ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesPropertiesAbstract() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:141:1: ( ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract EOF )
            // InternalEnvOneOf0Parser.g:142:1: ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesPropertiesAbstract"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract"
    // InternalEnvOneOf0Parser.g:149:1: ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract : ( ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:153:2: ( ( ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties ) ) )
            // InternalEnvOneOf0Parser.g:154:2: ( ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties ) )
            {
            // InternalEnvOneOf0Parser.g:154:2: ( ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties ) )
            // InternalEnvOneOf0Parser.g:155:3: ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesAdditionalPropertiesParserRuleCall()); 
            }
            // InternalEnvOneOf0Parser.g:156:3: ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties )
            // InternalEnvOneOf0Parser.g:156:4: ruleEnvOneOf0AdditionalPropertiesAdditionalProperties
            {
            pushFollow(FOLLOW_2);
            ruleEnvOneOf0AdditionalPropertiesAdditionalProperties();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesAdditionalPropertiesParserRuleCall()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalEnvOneOf0Parser.g:165:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:166:1: ( ruleValue EOF )
            // InternalEnvOneOf0Parser.g:167:1: ruleValue EOF
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
    // InternalEnvOneOf0Parser.g:174:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:178:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalEnvOneOf0Parser.g:179:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalEnvOneOf0Parser.g:179:2: ( ( rule__Value__Alternatives ) )
            // InternalEnvOneOf0Parser.g:180:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalEnvOneOf0Parser.g:181:3: ( rule__Value__Alternatives )
            // InternalEnvOneOf0Parser.g:181:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleEnvOneOf0AdditionalProperties"
    // InternalEnvOneOf0Parser.g:190:1: entryRuleEnvOneOf0AdditionalProperties : ruleEnvOneOf0AdditionalProperties EOF ;
    public final void entryRuleEnvOneOf0AdditionalProperties() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:191:1: ( ruleEnvOneOf0AdditionalProperties EOF )
            // InternalEnvOneOf0Parser.g:192:1: ruleEnvOneOf0AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalProperties"


    // $ANTLR start "ruleEnvOneOf0AdditionalProperties"
    // InternalEnvOneOf0Parser.g:199:1: ruleEnvOneOf0AdditionalProperties : ( ( rule__EnvOneOf0AdditionalProperties__Group__0 ) ) ;
    public final void ruleEnvOneOf0AdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:203:2: ( ( ( rule__EnvOneOf0AdditionalProperties__Group__0 ) ) )
            // InternalEnvOneOf0Parser.g:204:2: ( ( rule__EnvOneOf0AdditionalProperties__Group__0 ) )
            {
            // InternalEnvOneOf0Parser.g:204:2: ( ( rule__EnvOneOf0AdditionalProperties__Group__0 ) )
            // InternalEnvOneOf0Parser.g:205:3: ( rule__EnvOneOf0AdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getGroup()); 
            }
            // InternalEnvOneOf0Parser.g:206:3: ( rule__EnvOneOf0AdditionalProperties__Group__0 )
            // InternalEnvOneOf0Parser.g:206:4: rule__EnvOneOf0AdditionalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalProperties__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getGroup()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalProperties"


    // $ANTLR start "entryRuleEString"
    // InternalEnvOneOf0Parser.g:215:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:216:1: ( ruleEString EOF )
            // InternalEnvOneOf0Parser.g:217:1: ruleEString EOF
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
    // InternalEnvOneOf0Parser.g:224:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:228:2: ( ( ruleVALID_STRING ) )
            // InternalEnvOneOf0Parser.g:229:2: ( ruleVALID_STRING )
            {
            // InternalEnvOneOf0Parser.g:229:2: ( ruleVALID_STRING )
            // InternalEnvOneOf0Parser.g:230:3: ruleVALID_STRING
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


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeString"
    // InternalEnvOneOf0Parser.g:240:1: entryRuleEnvOneOf0AdditionalPropertiesTypeString : ruleEnvOneOf0AdditionalPropertiesTypeString EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesTypeString() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:241:1: ( ruleEnvOneOf0AdditionalPropertiesTypeString EOF )
            // InternalEnvOneOf0Parser.g:242:1: ruleEnvOneOf0AdditionalPropertiesTypeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesTypeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeString"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeString"
    // InternalEnvOneOf0Parser.g:249:1: ruleEnvOneOf0AdditionalPropertiesTypeString : ( ( rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesTypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:253:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment ) ) )
            // InternalEnvOneOf0Parser.g:254:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:254:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment ) )
            // InternalEnvOneOf0Parser.g:255:3: ( rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringAccess().getAdditionalPropertiesAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:256:3: ( rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment )
            // InternalEnvOneOf0Parser.g:256:4: rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringAccess().getAdditionalPropertiesAssignment()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeString"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeInteger"
    // InternalEnvOneOf0Parser.g:265:1: entryRuleEnvOneOf0AdditionalPropertiesTypeInteger : ruleEnvOneOf0AdditionalPropertiesTypeInteger EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesTypeInteger() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:266:1: ( ruleEnvOneOf0AdditionalPropertiesTypeInteger EOF )
            // InternalEnvOneOf0Parser.g:267:1: ruleEnvOneOf0AdditionalPropertiesTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesTypeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeInteger"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeInteger"
    // InternalEnvOneOf0Parser.g:274:1: ruleEnvOneOf0AdditionalPropertiesTypeInteger : ( ( rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesTypeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:278:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment ) ) )
            // InternalEnvOneOf0Parser.g:279:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:279:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment ) )
            // InternalEnvOneOf0Parser.g:280:3: ( rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerAccess().getAdditionalPropertiesAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:281:3: ( rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment )
            // InternalEnvOneOf0Parser.g:281:4: rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerAccess().getAdditionalPropertiesAssignment()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeInteger"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeNumber"
    // InternalEnvOneOf0Parser.g:290:1: entryRuleEnvOneOf0AdditionalPropertiesTypeNumber : ruleEnvOneOf0AdditionalPropertiesTypeNumber EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesTypeNumber() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:291:1: ( ruleEnvOneOf0AdditionalPropertiesTypeNumber EOF )
            // InternalEnvOneOf0Parser.g:292:1: ruleEnvOneOf0AdditionalPropertiesTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesTypeNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeNumber"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeNumber"
    // InternalEnvOneOf0Parser.g:299:1: ruleEnvOneOf0AdditionalPropertiesTypeNumber : ( ( rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesTypeNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:303:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment ) ) )
            // InternalEnvOneOf0Parser.g:304:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:304:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment ) )
            // InternalEnvOneOf0Parser.g:305:3: ( rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberAccess().getAdditionalPropertiesAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:306:3: ( rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment )
            // InternalEnvOneOf0Parser.g:306:4: rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberAccess().getAdditionalPropertiesAssignment()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeNumber"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeBoolean"
    // InternalEnvOneOf0Parser.g:315:1: entryRuleEnvOneOf0AdditionalPropertiesTypeBoolean : ruleEnvOneOf0AdditionalPropertiesTypeBoolean EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesTypeBoolean() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:316:1: ( ruleEnvOneOf0AdditionalPropertiesTypeBoolean EOF )
            // InternalEnvOneOf0Parser.g:317:1: ruleEnvOneOf0AdditionalPropertiesTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesTypeBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeBoolean"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeBoolean"
    // InternalEnvOneOf0Parser.g:324:1: ruleEnvOneOf0AdditionalPropertiesTypeBoolean : ( ( rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesTypeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:328:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment ) ) )
            // InternalEnvOneOf0Parser.g:329:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:329:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment ) )
            // InternalEnvOneOf0Parser.g:330:3: ( rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanAccess().getAdditionalPropertiesAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:331:3: ( rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment )
            // InternalEnvOneOf0Parser.g:331:4: rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanAccess().getAdditionalPropertiesAssignment()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeBoolean"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeObject"
    // InternalEnvOneOf0Parser.g:340:1: entryRuleEnvOneOf0AdditionalPropertiesTypeObject : ruleEnvOneOf0AdditionalPropertiesTypeObject EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesTypeObject() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:341:1: ( ruleEnvOneOf0AdditionalPropertiesTypeObject EOF )
            // InternalEnvOneOf0Parser.g:342:1: ruleEnvOneOf0AdditionalPropertiesTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesTypeObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeObject"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeObject"
    // InternalEnvOneOf0Parser.g:349:1: ruleEnvOneOf0AdditionalPropertiesTypeObject : ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0 ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesTypeObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:353:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0 ) ) )
            // InternalEnvOneOf0Parser.g:354:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0 ) )
            {
            // InternalEnvOneOf0Parser.g:354:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0 ) )
            // InternalEnvOneOf0Parser.g:355:3: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getGroup()); 
            }
            // InternalEnvOneOf0Parser.g:356:3: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0 )
            // InternalEnvOneOf0Parser.g:356:4: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getGroup()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeObject"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeArray"
    // InternalEnvOneOf0Parser.g:365:1: entryRuleEnvOneOf0AdditionalPropertiesTypeArray : ruleEnvOneOf0AdditionalPropertiesTypeArray EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesTypeArray() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:366:1: ( ruleEnvOneOf0AdditionalPropertiesTypeArray EOF )
            // InternalEnvOneOf0Parser.g:367:1: ruleEnvOneOf0AdditionalPropertiesTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesTypeArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeArray"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeArray"
    // InternalEnvOneOf0Parser.g:374:1: ruleEnvOneOf0AdditionalPropertiesTypeArray : ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0 ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesTypeArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:378:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0 ) ) )
            // InternalEnvOneOf0Parser.g:379:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0 ) )
            {
            // InternalEnvOneOf0Parser.g:379:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0 ) )
            // InternalEnvOneOf0Parser.g:380:3: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getGroup()); 
            }
            // InternalEnvOneOf0Parser.g:381:3: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0 )
            // InternalEnvOneOf0Parser.g:381:4: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getGroup()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeArray"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesTypeNull"
    // InternalEnvOneOf0Parser.g:390:1: entryRuleEnvOneOf0AdditionalPropertiesTypeNull : ruleEnvOneOf0AdditionalPropertiesTypeNull EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesTypeNull() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:391:1: ( ruleEnvOneOf0AdditionalPropertiesTypeNull EOF )
            // InternalEnvOneOf0Parser.g:392:1: ruleEnvOneOf0AdditionalPropertiesTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesTypeNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesTypeNull"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesTypeNull"
    // InternalEnvOneOf0Parser.g:399:1: ruleEnvOneOf0AdditionalPropertiesTypeNull : ( ( rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesTypeNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:403:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment ) ) )
            // InternalEnvOneOf0Parser.g:404:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:404:2: ( ( rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment ) )
            // InternalEnvOneOf0Parser.g:405:3: ( rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullAccess().getAdditionalPropertiesAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:406:3: ( rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment )
            // InternalEnvOneOf0Parser.g:406:4: rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullAccess().getAdditionalPropertiesAssignment()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesTypeNull"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalEnvOneOf0Parser.g:415:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:416:1: ( ruleEDoubleObject EOF )
            // InternalEnvOneOf0Parser.g:417:1: ruleEDoubleObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleObjectRule()); 
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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalEnvOneOf0Parser.g:424:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:428:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalEnvOneOf0Parser.g:429:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalEnvOneOf0Parser.g:429:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalEnvOneOf0Parser.g:430:3: ( rule__EDoubleObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            }
            // InternalEnvOneOf0Parser.g:431:3: ( rule__EDoubleObject__Alternatives )
            // InternalEnvOneOf0Parser.g:431:4: rule__EDoubleObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalEnvOneOf0Parser.g:440:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:441:1: ( ruleEBooleanObject EOF )
            // InternalEnvOneOf0Parser.g:442:1: ruleEBooleanObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanObjectRule()); 
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
    // $ANTLR end "entryRuleEBooleanObject"


    // $ANTLR start "ruleEBooleanObject"
    // InternalEnvOneOf0Parser.g:449:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:453:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalEnvOneOf0Parser.g:454:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalEnvOneOf0Parser.g:454:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalEnvOneOf0Parser.g:455:3: ( rule__EBooleanObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }
            // InternalEnvOneOf0Parser.g:456:3: ( rule__EBooleanObject__Alternatives )
            // InternalEnvOneOf0Parser.g:456:4: rule__EBooleanObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBooleanObject__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEBooleanObject"


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesAdditionalProperties"
    // InternalEnvOneOf0Parser.g:465:1: entryRuleEnvOneOf0AdditionalPropertiesAdditionalProperties : ruleEnvOneOf0AdditionalPropertiesAdditionalProperties EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesAdditionalProperties() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:466:1: ( ruleEnvOneOf0AdditionalPropertiesAdditionalProperties EOF )
            // InternalEnvOneOf0Parser.g:467:1: ruleEnvOneOf0AdditionalPropertiesAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesAdditionalProperties();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesAdditionalProperties"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesAdditionalProperties"
    // InternalEnvOneOf0Parser.g:474:1: ruleEnvOneOf0AdditionalPropertiesAdditionalProperties : ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0 ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesAdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:478:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0 ) ) )
            // InternalEnvOneOf0Parser.g:479:2: ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0 ) )
            {
            // InternalEnvOneOf0Parser.g:479:2: ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0 ) )
            // InternalEnvOneOf0Parser.g:480:3: ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getGroup()); 
            }
            // InternalEnvOneOf0Parser.g:481:3: ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0 )
            // InternalEnvOneOf0Parser.g:481:4: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getGroup()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalEnvOneOf0Parser.g:490:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:491:1: ( ruleJsonDocument EOF )
            // InternalEnvOneOf0Parser.g:492:1: ruleJsonDocument EOF
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
    // InternalEnvOneOf0Parser.g:499:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:503:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalEnvOneOf0Parser.g:504:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:504:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalEnvOneOf0Parser.g:505:3: ( rule__JsonDocument__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:506:3: ( rule__JsonDocument__ValueAssignment )
            // InternalEnvOneOf0Parser.g:506:4: rule__JsonDocument__ValueAssignment
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
    // InternalEnvOneOf0Parser.g:515:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:516:1: ( ruleStringValue EOF )
            // InternalEnvOneOf0Parser.g:517:1: ruleStringValue EOF
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
    // InternalEnvOneOf0Parser.g:524:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:528:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalEnvOneOf0Parser.g:529:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:529:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalEnvOneOf0Parser.g:530:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:531:3: ( rule__StringValue__ValueAssignment )
            // InternalEnvOneOf0Parser.g:531:4: rule__StringValue__ValueAssignment
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
    // InternalEnvOneOf0Parser.g:540:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:541:1: ( ruleArrayValue EOF )
            // InternalEnvOneOf0Parser.g:542:1: ruleArrayValue EOF
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
    // InternalEnvOneOf0Parser.g:549:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:553:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalEnvOneOf0Parser.g:554:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalEnvOneOf0Parser.g:554:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalEnvOneOf0Parser.g:555:3: ( rule__ArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup()); 
            }
            // InternalEnvOneOf0Parser.g:556:3: ( rule__ArrayValue__Group__0 )
            // InternalEnvOneOf0Parser.g:556:4: rule__ArrayValue__Group__0
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
    // InternalEnvOneOf0Parser.g:565:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:566:1: ( ruleNullValue EOF )
            // InternalEnvOneOf0Parser.g:567:1: ruleNullValue EOF
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
    // InternalEnvOneOf0Parser.g:574:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:578:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalEnvOneOf0Parser.g:579:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:579:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalEnvOneOf0Parser.g:580:3: ( rule__NullValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:581:3: ( rule__NullValue__ValueAssignment )
            // InternalEnvOneOf0Parser.g:581:4: rule__NullValue__ValueAssignment
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
    // InternalEnvOneOf0Parser.g:590:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:591:1: ( ruleNumberValue EOF )
            // InternalEnvOneOf0Parser.g:592:1: ruleNumberValue EOF
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
    // InternalEnvOneOf0Parser.g:599:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:603:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalEnvOneOf0Parser.g:604:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:604:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalEnvOneOf0Parser.g:605:3: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:606:3: ( rule__NumberValue__ValueAssignment )
            // InternalEnvOneOf0Parser.g:606:4: rule__NumberValue__ValueAssignment
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
    // InternalEnvOneOf0Parser.g:615:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:616:1: ( ruleObjectValue EOF )
            // InternalEnvOneOf0Parser.g:617:1: ruleObjectValue EOF
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
    // InternalEnvOneOf0Parser.g:624:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:628:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalEnvOneOf0Parser.g:629:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalEnvOneOf0Parser.g:629:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalEnvOneOf0Parser.g:630:3: ( rule__ObjectValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup()); 
            }
            // InternalEnvOneOf0Parser.g:631:3: ( rule__ObjectValue__Group__0 )
            // InternalEnvOneOf0Parser.g:631:4: rule__ObjectValue__Group__0
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
    // InternalEnvOneOf0Parser.g:640:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:641:1: ( ruleBooleanValue EOF )
            // InternalEnvOneOf0Parser.g:642:1: ruleBooleanValue EOF
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
    // InternalEnvOneOf0Parser.g:649:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:653:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalEnvOneOf0Parser.g:654:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:654:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalEnvOneOf0Parser.g:655:3: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:656:3: ( rule__BooleanValue__ValueAssignment )
            // InternalEnvOneOf0Parser.g:656:4: rule__BooleanValue__ValueAssignment
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
    // InternalEnvOneOf0Parser.g:665:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:666:1: ( ruleEDouble EOF )
            // InternalEnvOneOf0Parser.g:667:1: ruleEDouble EOF
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
    // InternalEnvOneOf0Parser.g:674:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:678:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalEnvOneOf0Parser.g:679:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalEnvOneOf0Parser.g:679:2: ( ( rule__EDouble__Alternatives ) )
            // InternalEnvOneOf0Parser.g:680:3: ( rule__EDouble__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            }
            // InternalEnvOneOf0Parser.g:681:3: ( rule__EDouble__Alternatives )
            // InternalEnvOneOf0Parser.g:681:4: rule__EDouble__Alternatives
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
    // InternalEnvOneOf0Parser.g:690:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:691:1: ( ruleKeyValuePair EOF )
            // InternalEnvOneOf0Parser.g:692:1: ruleKeyValuePair EOF
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
    // InternalEnvOneOf0Parser.g:699:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:703:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalEnvOneOf0Parser.g:704:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalEnvOneOf0Parser.g:704:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalEnvOneOf0Parser.g:705:3: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // InternalEnvOneOf0Parser.g:706:3: ( rule__KeyValuePair__Group__0 )
            // InternalEnvOneOf0Parser.g:706:4: rule__KeyValuePair__Group__0
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
    // InternalEnvOneOf0Parser.g:715:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:716:1: ( ruleEBoolean EOF )
            // InternalEnvOneOf0Parser.g:717:1: ruleEBoolean EOF
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
    // InternalEnvOneOf0Parser.g:724:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:728:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalEnvOneOf0Parser.g:729:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalEnvOneOf0Parser.g:729:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalEnvOneOf0Parser.g:730:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalEnvOneOf0Parser.g:731:3: ( rule__EBoolean__Alternatives )
            // InternalEnvOneOf0Parser.g:731:4: rule__EBoolean__Alternatives
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


    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesItems"
    // InternalEnvOneOf0Parser.g:740:1: entryRuleEnvOneOf0AdditionalPropertiesItems : ruleEnvOneOf0AdditionalPropertiesItems EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesItems() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:741:1: ( ruleEnvOneOf0AdditionalPropertiesItems EOF )
            // InternalEnvOneOf0Parser.g:742:1: ruleEnvOneOf0AdditionalPropertiesItems EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsRule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesItems"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesItems"
    // InternalEnvOneOf0Parser.g:749:1: ruleEnvOneOf0AdditionalPropertiesItems : ( ( rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:753:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment ) ) )
            // InternalEnvOneOf0Parser.g:754:2: ( ( rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment ) )
            {
            // InternalEnvOneOf0Parser.g:754:2: ( ( rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment ) )
            // InternalEnvOneOf0Parser.g:755:3: ( rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsAccess().getItemsAssignment()); 
            }
            // InternalEnvOneOf0Parser.g:756:3: ( rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment )
            // InternalEnvOneOf0Parser.g:756:4: rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsAccess().getItemsAssignment()); 
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
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalEnvOneOf0Parser.g:765:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalEnvOneOf0Parser.g:766:1: ( ruleVALID_STRING EOF )
            // InternalEnvOneOf0Parser.g:767:1: ruleVALID_STRING EOF
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
    // InternalEnvOneOf0Parser.g:774:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:778:2: ( ( RULE_STRING ) )
            // InternalEnvOneOf0Parser.g:779:2: ( RULE_STRING )
            {
            // InternalEnvOneOf0Parser.g:779:2: ( RULE_STRING )
            // InternalEnvOneOf0Parser.g:780:3: RULE_STRING
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
    // InternalEnvOneOf0Parser.g:790:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:794:1: ( ( ( Null ) ) )
            // InternalEnvOneOf0Parser.g:795:2: ( ( Null ) )
            {
            // InternalEnvOneOf0Parser.g:795:2: ( ( Null ) )
            // InternalEnvOneOf0Parser.g:796:3: ( Null )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            }
            // InternalEnvOneOf0Parser.g:797:3: ( Null )
            // InternalEnvOneOf0Parser.g:797:4: Null
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


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives"
    // InternalEnvOneOf0Parser.g:805:1: rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives : ( ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber ) ) | ( ruleEnvOneOf0AdditionalPropertiesTypeString ) | ( ruleEnvOneOf0AdditionalPropertiesTypeInteger ) | ( ruleEnvOneOf0AdditionalPropertiesTypeBoolean ) | ( ruleEnvOneOf0AdditionalPropertiesTypeObject ) | ( ruleEnvOneOf0AdditionalPropertiesTypeArray ) | ( ruleEnvOneOf0AdditionalPropertiesTypeNull ) );
    public final void rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:809:1: ( ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber ) ) | ( ruleEnvOneOf0AdditionalPropertiesTypeString ) | ( ruleEnvOneOf0AdditionalPropertiesTypeInteger ) | ( ruleEnvOneOf0AdditionalPropertiesTypeBoolean ) | ( ruleEnvOneOf0AdditionalPropertiesTypeObject ) | ( ruleEnvOneOf0AdditionalPropertiesTypeArray ) | ( ruleEnvOneOf0AdditionalPropertiesTypeNull ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:810:2: ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber ) )
                    {
                    // InternalEnvOneOf0Parser.g:810:2: ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber ) )
                    // InternalEnvOneOf0Parser.g:811:3: ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeNumberParserRuleCall_0()); 
                    }
                    // InternalEnvOneOf0Parser.g:812:3: ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )
                    // InternalEnvOneOf0Parser.g:812:4: ruleEnvOneOf0AdditionalPropertiesTypeNumber
                    {
                    pushFollow(FOLLOW_2);
                    ruleEnvOneOf0AdditionalPropertiesTypeNumber();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeNumberParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0Parser.g:816:2: ( ruleEnvOneOf0AdditionalPropertiesTypeString )
                    {
                    // InternalEnvOneOf0Parser.g:816:2: ( ruleEnvOneOf0AdditionalPropertiesTypeString )
                    // InternalEnvOneOf0Parser.g:817:3: ruleEnvOneOf0AdditionalPropertiesTypeString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeStringParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnvOneOf0AdditionalPropertiesTypeString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeStringParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEnvOneOf0Parser.g:822:2: ( ruleEnvOneOf0AdditionalPropertiesTypeInteger )
                    {
                    // InternalEnvOneOf0Parser.g:822:2: ( ruleEnvOneOf0AdditionalPropertiesTypeInteger )
                    // InternalEnvOneOf0Parser.g:823:3: ruleEnvOneOf0AdditionalPropertiesTypeInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeIntegerParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnvOneOf0AdditionalPropertiesTypeInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeIntegerParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEnvOneOf0Parser.g:828:2: ( ruleEnvOneOf0AdditionalPropertiesTypeBoolean )
                    {
                    // InternalEnvOneOf0Parser.g:828:2: ( ruleEnvOneOf0AdditionalPropertiesTypeBoolean )
                    // InternalEnvOneOf0Parser.g:829:3: ruleEnvOneOf0AdditionalPropertiesTypeBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeBooleanParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnvOneOf0AdditionalPropertiesTypeBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeBooleanParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEnvOneOf0Parser.g:834:2: ( ruleEnvOneOf0AdditionalPropertiesTypeObject )
                    {
                    // InternalEnvOneOf0Parser.g:834:2: ( ruleEnvOneOf0AdditionalPropertiesTypeObject )
                    // InternalEnvOneOf0Parser.g:835:3: ruleEnvOneOf0AdditionalPropertiesTypeObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeObjectParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnvOneOf0AdditionalPropertiesTypeObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeObjectParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEnvOneOf0Parser.g:840:2: ( ruleEnvOneOf0AdditionalPropertiesTypeArray )
                    {
                    // InternalEnvOneOf0Parser.g:840:2: ( ruleEnvOneOf0AdditionalPropertiesTypeArray )
                    // InternalEnvOneOf0Parser.g:841:3: ruleEnvOneOf0AdditionalPropertiesTypeArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeArrayParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnvOneOf0AdditionalPropertiesTypeArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeArrayParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEnvOneOf0Parser.g:846:2: ( ruleEnvOneOf0AdditionalPropertiesTypeNull )
                    {
                    // InternalEnvOneOf0Parser.g:846:2: ( ruleEnvOneOf0AdditionalPropertiesTypeNull )
                    // InternalEnvOneOf0Parser.g:847:3: ruleEnvOneOf0AdditionalPropertiesTypeNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeNullParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnvOneOf0AdditionalPropertiesTypeNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeNullParserRuleCall_6()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalEnvOneOf0Parser.g:856:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:860:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
            int alt2=6;
            switch ( input.LA(1) ) {
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:861:2: ( ruleStringValue )
                    {
                    // InternalEnvOneOf0Parser.g:861:2: ( ruleStringValue )
                    // InternalEnvOneOf0Parser.g:862:3: ruleStringValue
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
                    // InternalEnvOneOf0Parser.g:867:2: ( ruleArrayValue )
                    {
                    // InternalEnvOneOf0Parser.g:867:2: ( ruleArrayValue )
                    // InternalEnvOneOf0Parser.g:868:3: ruleArrayValue
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
                    // InternalEnvOneOf0Parser.g:873:2: ( ruleNullValue )
                    {
                    // InternalEnvOneOf0Parser.g:873:2: ( ruleNullValue )
                    // InternalEnvOneOf0Parser.g:874:3: ruleNullValue
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
                    // InternalEnvOneOf0Parser.g:879:2: ( ruleNumberValue )
                    {
                    // InternalEnvOneOf0Parser.g:879:2: ( ruleNumberValue )
                    // InternalEnvOneOf0Parser.g:880:3: ruleNumberValue
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
                    // InternalEnvOneOf0Parser.g:885:2: ( ruleObjectValue )
                    {
                    // InternalEnvOneOf0Parser.g:885:2: ( ruleObjectValue )
                    // InternalEnvOneOf0Parser.g:886:3: ruleObjectValue
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
                    // InternalEnvOneOf0Parser.g:891:2: ( ruleBooleanValue )
                    {
                    // InternalEnvOneOf0Parser.g:891:2: ( ruleBooleanValue )
                    // InternalEnvOneOf0Parser.g:892:3: ruleBooleanValue
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


    // $ANTLR start "rule__EDoubleObject__Alternatives"
    // InternalEnvOneOf0Parser.g:901:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:905:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_E_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_E_DOUBLE) ) {
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
                    // InternalEnvOneOf0Parser.g:906:2: ( RULE_E_INT )
                    {
                    // InternalEnvOneOf0Parser.g:906:2: ( RULE_E_INT )
                    // InternalEnvOneOf0Parser.g:907:3: RULE_E_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_E_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0Parser.g:912:2: ( RULE_E_DOUBLE )
                    {
                    // InternalEnvOneOf0Parser.g:912:2: ( RULE_E_DOUBLE )
                    // InternalEnvOneOf0Parser.g:913:3: RULE_E_DOUBLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1()); 
                    }
                    match(input,RULE_E_DOUBLE,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1()); 
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
    // $ANTLR end "rule__EDoubleObject__Alternatives"


    // $ANTLR start "rule__EBooleanObject__Alternatives"
    // InternalEnvOneOf0Parser.g:922:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:926:1: ( ( True ) | ( False ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==True) ) {
                alt4=1;
            }
            else if ( (LA4_0==False) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:927:2: ( True )
                    {
                    // InternalEnvOneOf0Parser.g:927:2: ( True )
                    // InternalEnvOneOf0Parser.g:928:3: True
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    }
                    match(input,True,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0Parser.g:933:2: ( False )
                    {
                    // InternalEnvOneOf0Parser.g:933:2: ( False )
                    // InternalEnvOneOf0Parser.g:934:3: False
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 
                    }
                    match(input,False,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 
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
    // $ANTLR end "rule__EBooleanObject__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives"
    // InternalEnvOneOf0Parser.g:943:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:947:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_E_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_E_DOUBLE) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:948:2: ( RULE_E_INT )
                    {
                    // InternalEnvOneOf0Parser.g:948:2: ( RULE_E_INT )
                    // InternalEnvOneOf0Parser.g:949:3: RULE_E_INT
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
                    // InternalEnvOneOf0Parser.g:954:2: ( RULE_E_DOUBLE )
                    {
                    // InternalEnvOneOf0Parser.g:954:2: ( RULE_E_DOUBLE )
                    // InternalEnvOneOf0Parser.g:955:3: RULE_E_DOUBLE
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
    // InternalEnvOneOf0Parser.g:964:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:968:1: ( ( True ) | ( False ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==True) ) {
                alt6=1;
            }
            else if ( (LA6_0==False) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:969:2: ( True )
                    {
                    // InternalEnvOneOf0Parser.g:969:2: ( True )
                    // InternalEnvOneOf0Parser.g:970:3: True
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
                    // InternalEnvOneOf0Parser.g:975:2: ( False )
                    {
                    // InternalEnvOneOf0Parser.g:975:2: ( False )
                    // InternalEnvOneOf0Parser.g:976:3: False
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


    // $ANTLR start "rule__EnvOneOf0__Group__0"
    // InternalEnvOneOf0Parser.g:985:1: rule__EnvOneOf0__Group__0 : rule__EnvOneOf0__Group__0__Impl rule__EnvOneOf0__Group__1 ;
    public final void rule__EnvOneOf0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:989:1: ( rule__EnvOneOf0__Group__0__Impl rule__EnvOneOf0__Group__1 )
            // InternalEnvOneOf0Parser.g:990:2: rule__EnvOneOf0__Group__0__Impl rule__EnvOneOf0__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EnvOneOf0__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__Group__1();

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
    // $ANTLR end "rule__EnvOneOf0__Group__0"


    // $ANTLR start "rule__EnvOneOf0__Group__0__Impl"
    // InternalEnvOneOf0Parser.g:997:1: rule__EnvOneOf0__Group__0__Impl : ( () ) ;
    public final void rule__EnvOneOf0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1001:1: ( ( () ) )
            // InternalEnvOneOf0Parser.g:1002:1: ( () )
            {
            // InternalEnvOneOf0Parser.g:1002:1: ( () )
            // InternalEnvOneOf0Parser.g:1003:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getEnvOneOf0Action_0()); 
            }
            // InternalEnvOneOf0Parser.g:1004:2: ()
            // InternalEnvOneOf0Parser.g:1004:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getEnvOneOf0Action_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvOneOf0__Group__0__Impl"


    // $ANTLR start "rule__EnvOneOf0__Group__1"
    // InternalEnvOneOf0Parser.g:1012:1: rule__EnvOneOf0__Group__1 : rule__EnvOneOf0__Group__1__Impl rule__EnvOneOf0__Group__2 ;
    public final void rule__EnvOneOf0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1016:1: ( rule__EnvOneOf0__Group__1__Impl rule__EnvOneOf0__Group__2 )
            // InternalEnvOneOf0Parser.g:1017:2: rule__EnvOneOf0__Group__1__Impl rule__EnvOneOf0__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EnvOneOf0__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__Group__2();

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
    // $ANTLR end "rule__EnvOneOf0__Group__1"


    // $ANTLR start "rule__EnvOneOf0__Group__1__Impl"
    // InternalEnvOneOf0Parser.g:1024:1: rule__EnvOneOf0__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__EnvOneOf0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1028:1: ( ( LeftCurlyBracket ) )
            // InternalEnvOneOf0Parser.g:1029:1: ( LeftCurlyBracket )
            {
            // InternalEnvOneOf0Parser.g:1029:1: ( LeftCurlyBracket )
            // InternalEnvOneOf0Parser.g:1030:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__EnvOneOf0__Group__1__Impl"


    // $ANTLR start "rule__EnvOneOf0__Group__2"
    // InternalEnvOneOf0Parser.g:1039:1: rule__EnvOneOf0__Group__2 : rule__EnvOneOf0__Group__2__Impl rule__EnvOneOf0__Group__3 ;
    public final void rule__EnvOneOf0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1043:1: ( rule__EnvOneOf0__Group__2__Impl rule__EnvOneOf0__Group__3 )
            // InternalEnvOneOf0Parser.g:1044:2: rule__EnvOneOf0__Group__2__Impl rule__EnvOneOf0__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__EnvOneOf0__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__Group__3();

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
    // $ANTLR end "rule__EnvOneOf0__Group__2"


    // $ANTLR start "rule__EnvOneOf0__Group__2__Impl"
    // InternalEnvOneOf0Parser.g:1051:1: rule__EnvOneOf0__Group__2__Impl : ( ( rule__EnvOneOf0__Group_2__0 )? ) ;
    public final void rule__EnvOneOf0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1055:1: ( ( ( rule__EnvOneOf0__Group_2__0 )? ) )
            // InternalEnvOneOf0Parser.g:1056:1: ( ( rule__EnvOneOf0__Group_2__0 )? )
            {
            // InternalEnvOneOf0Parser.g:1056:1: ( ( rule__EnvOneOf0__Group_2__0 )? )
            // InternalEnvOneOf0Parser.g:1057:2: ( rule__EnvOneOf0__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getGroup_2()); 
            }
            // InternalEnvOneOf0Parser.g:1058:2: ( rule__EnvOneOf0__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:1058:3: rule__EnvOneOf0__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvOneOf0__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getGroup_2()); 
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
    // $ANTLR end "rule__EnvOneOf0__Group__2__Impl"


    // $ANTLR start "rule__EnvOneOf0__Group__3"
    // InternalEnvOneOf0Parser.g:1066:1: rule__EnvOneOf0__Group__3 : rule__EnvOneOf0__Group__3__Impl ;
    public final void rule__EnvOneOf0__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1070:1: ( rule__EnvOneOf0__Group__3__Impl )
            // InternalEnvOneOf0Parser.g:1071:2: rule__EnvOneOf0__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__Group__3__Impl();

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
    // $ANTLR end "rule__EnvOneOf0__Group__3"


    // $ANTLR start "rule__EnvOneOf0__Group__3__Impl"
    // InternalEnvOneOf0Parser.g:1077:1: rule__EnvOneOf0__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__EnvOneOf0__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1081:1: ( ( RightCurlyBracket ) )
            // InternalEnvOneOf0Parser.g:1082:1: ( RightCurlyBracket )
            {
            // InternalEnvOneOf0Parser.g:1082:1: ( RightCurlyBracket )
            // InternalEnvOneOf0Parser.g:1083:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__EnvOneOf0__Group__3__Impl"


    // $ANTLR start "rule__EnvOneOf0__Group_2__0"
    // InternalEnvOneOf0Parser.g:1093:1: rule__EnvOneOf0__Group_2__0 : rule__EnvOneOf0__Group_2__0__Impl rule__EnvOneOf0__Group_2__1 ;
    public final void rule__EnvOneOf0__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1097:1: ( rule__EnvOneOf0__Group_2__0__Impl rule__EnvOneOf0__Group_2__1 )
            // InternalEnvOneOf0Parser.g:1098:2: rule__EnvOneOf0__Group_2__0__Impl rule__EnvOneOf0__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EnvOneOf0__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__Group_2__1();

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
    // $ANTLR end "rule__EnvOneOf0__Group_2__0"


    // $ANTLR start "rule__EnvOneOf0__Group_2__0__Impl"
    // InternalEnvOneOf0Parser.g:1105:1: rule__EnvOneOf0__Group_2__0__Impl : ( ( rule__EnvOneOf0__EnvAssignment_2_0 ) ) ;
    public final void rule__EnvOneOf0__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1109:1: ( ( ( rule__EnvOneOf0__EnvAssignment_2_0 ) ) )
            // InternalEnvOneOf0Parser.g:1110:1: ( ( rule__EnvOneOf0__EnvAssignment_2_0 ) )
            {
            // InternalEnvOneOf0Parser.g:1110:1: ( ( rule__EnvOneOf0__EnvAssignment_2_0 ) )
            // InternalEnvOneOf0Parser.g:1111:2: ( rule__EnvOneOf0__EnvAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getEnvAssignment_2_0()); 
            }
            // InternalEnvOneOf0Parser.g:1112:2: ( rule__EnvOneOf0__EnvAssignment_2_0 )
            // InternalEnvOneOf0Parser.g:1112:3: rule__EnvOneOf0__EnvAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__EnvAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getEnvAssignment_2_0()); 
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
    // $ANTLR end "rule__EnvOneOf0__Group_2__0__Impl"


    // $ANTLR start "rule__EnvOneOf0__Group_2__1"
    // InternalEnvOneOf0Parser.g:1120:1: rule__EnvOneOf0__Group_2__1 : rule__EnvOneOf0__Group_2__1__Impl ;
    public final void rule__EnvOneOf0__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1124:1: ( rule__EnvOneOf0__Group_2__1__Impl )
            // InternalEnvOneOf0Parser.g:1125:2: rule__EnvOneOf0__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__Group_2__1__Impl();

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
    // $ANTLR end "rule__EnvOneOf0__Group_2__1"


    // $ANTLR start "rule__EnvOneOf0__Group_2__1__Impl"
    // InternalEnvOneOf0Parser.g:1131:1: rule__EnvOneOf0__Group_2__1__Impl : ( ( rule__EnvOneOf0__Group_2_1__0 )* ) ;
    public final void rule__EnvOneOf0__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1135:1: ( ( ( rule__EnvOneOf0__Group_2_1__0 )* ) )
            // InternalEnvOneOf0Parser.g:1136:1: ( ( rule__EnvOneOf0__Group_2_1__0 )* )
            {
            // InternalEnvOneOf0Parser.g:1136:1: ( ( rule__EnvOneOf0__Group_2_1__0 )* )
            // InternalEnvOneOf0Parser.g:1137:2: ( rule__EnvOneOf0__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getGroup_2_1()); 
            }
            // InternalEnvOneOf0Parser.g:1138:2: ( rule__EnvOneOf0__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEnvOneOf0Parser.g:1138:3: rule__EnvOneOf0__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__EnvOneOf0__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getGroup_2_1()); 
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
    // $ANTLR end "rule__EnvOneOf0__Group_2__1__Impl"


    // $ANTLR start "rule__EnvOneOf0__Group_2_1__0"
    // InternalEnvOneOf0Parser.g:1147:1: rule__EnvOneOf0__Group_2_1__0 : rule__EnvOneOf0__Group_2_1__0__Impl rule__EnvOneOf0__Group_2_1__1 ;
    public final void rule__EnvOneOf0__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1151:1: ( rule__EnvOneOf0__Group_2_1__0__Impl rule__EnvOneOf0__Group_2_1__1 )
            // InternalEnvOneOf0Parser.g:1152:2: rule__EnvOneOf0__Group_2_1__0__Impl rule__EnvOneOf0__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__EnvOneOf0__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__Group_2_1__1();

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
    // $ANTLR end "rule__EnvOneOf0__Group_2_1__0"


    // $ANTLR start "rule__EnvOneOf0__Group_2_1__0__Impl"
    // InternalEnvOneOf0Parser.g:1159:1: rule__EnvOneOf0__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__EnvOneOf0__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1163:1: ( ( Comma ) )
            // InternalEnvOneOf0Parser.g:1164:1: ( Comma )
            {
            // InternalEnvOneOf0Parser.g:1164:1: ( Comma )
            // InternalEnvOneOf0Parser.g:1165:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__EnvOneOf0__Group_2_1__0__Impl"


    // $ANTLR start "rule__EnvOneOf0__Group_2_1__1"
    // InternalEnvOneOf0Parser.g:1174:1: rule__EnvOneOf0__Group_2_1__1 : rule__EnvOneOf0__Group_2_1__1__Impl ;
    public final void rule__EnvOneOf0__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1178:1: ( rule__EnvOneOf0__Group_2_1__1__Impl )
            // InternalEnvOneOf0Parser.g:1179:2: rule__EnvOneOf0__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__EnvOneOf0__Group_2_1__1"


    // $ANTLR start "rule__EnvOneOf0__Group_2_1__1__Impl"
    // InternalEnvOneOf0Parser.g:1185:1: rule__EnvOneOf0__Group_2_1__1__Impl : ( ( rule__EnvOneOf0__EnvAssignment_2_1_1 ) ) ;
    public final void rule__EnvOneOf0__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1189:1: ( ( ( rule__EnvOneOf0__EnvAssignment_2_1_1 ) ) )
            // InternalEnvOneOf0Parser.g:1190:1: ( ( rule__EnvOneOf0__EnvAssignment_2_1_1 ) )
            {
            // InternalEnvOneOf0Parser.g:1190:1: ( ( rule__EnvOneOf0__EnvAssignment_2_1_1 ) )
            // InternalEnvOneOf0Parser.g:1191:2: ( rule__EnvOneOf0__EnvAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getEnvAssignment_2_1_1()); 
            }
            // InternalEnvOneOf0Parser.g:1192:2: ( rule__EnvOneOf0__EnvAssignment_2_1_1 )
            // InternalEnvOneOf0Parser.g:1192:3: rule__EnvOneOf0__EnvAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0__EnvAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getEnvAssignment_2_1_1()); 
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
    // $ANTLR end "rule__EnvOneOf0__Group_2_1__1__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalProperties__Group__0"
    // InternalEnvOneOf0Parser.g:1201:1: rule__EnvOneOf0AdditionalProperties__Group__0 : rule__EnvOneOf0AdditionalProperties__Group__0__Impl rule__EnvOneOf0AdditionalProperties__Group__1 ;
    public final void rule__EnvOneOf0AdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1205:1: ( rule__EnvOneOf0AdditionalProperties__Group__0__Impl rule__EnvOneOf0AdditionalProperties__Group__1 )
            // InternalEnvOneOf0Parser.g:1206:2: rule__EnvOneOf0AdditionalProperties__Group__0__Impl rule__EnvOneOf0AdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EnvOneOf0AdditionalProperties__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalProperties__Group__1();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalProperties__Group__0"


    // $ANTLR start "rule__EnvOneOf0AdditionalProperties__Group__0__Impl"
    // InternalEnvOneOf0Parser.g:1213:1: rule__EnvOneOf0AdditionalProperties__Group__0__Impl : ( ( rule__EnvOneOf0AdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__EnvOneOf0AdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1217:1: ( ( ( rule__EnvOneOf0AdditionalProperties__KeyAssignment_0 ) ) )
            // InternalEnvOneOf0Parser.g:1218:1: ( ( rule__EnvOneOf0AdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalEnvOneOf0Parser.g:1218:1: ( ( rule__EnvOneOf0AdditionalProperties__KeyAssignment_0 ) )
            // InternalEnvOneOf0Parser.g:1219:2: ( rule__EnvOneOf0AdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalEnvOneOf0Parser.g:1220:2: ( rule__EnvOneOf0AdditionalProperties__KeyAssignment_0 )
            // InternalEnvOneOf0Parser.g:1220:3: rule__EnvOneOf0AdditionalProperties__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalProperties__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getKeyAssignment_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalProperties__Group__0__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalProperties__Group__1"
    // InternalEnvOneOf0Parser.g:1228:1: rule__EnvOneOf0AdditionalProperties__Group__1 : rule__EnvOneOf0AdditionalProperties__Group__1__Impl rule__EnvOneOf0AdditionalProperties__Group__2 ;
    public final void rule__EnvOneOf0AdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1232:1: ( rule__EnvOneOf0AdditionalProperties__Group__1__Impl rule__EnvOneOf0AdditionalProperties__Group__2 )
            // InternalEnvOneOf0Parser.g:1233:2: rule__EnvOneOf0AdditionalProperties__Group__1__Impl rule__EnvOneOf0AdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EnvOneOf0AdditionalProperties__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalProperties__Group__2();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalProperties__Group__1"


    // $ANTLR start "rule__EnvOneOf0AdditionalProperties__Group__1__Impl"
    // InternalEnvOneOf0Parser.g:1240:1: rule__EnvOneOf0AdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__EnvOneOf0AdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1244:1: ( ( Colon ) )
            // InternalEnvOneOf0Parser.g:1245:1: ( Colon )
            {
            // InternalEnvOneOf0Parser.g:1245:1: ( Colon )
            // InternalEnvOneOf0Parser.g:1246:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalProperties__Group__1__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalProperties__Group__2"
    // InternalEnvOneOf0Parser.g:1255:1: rule__EnvOneOf0AdditionalProperties__Group__2 : rule__EnvOneOf0AdditionalProperties__Group__2__Impl ;
    public final void rule__EnvOneOf0AdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1259:1: ( rule__EnvOneOf0AdditionalProperties__Group__2__Impl )
            // InternalEnvOneOf0Parser.g:1260:2: rule__EnvOneOf0AdditionalProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalProperties__Group__2__Impl();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalProperties__Group__2"


    // $ANTLR start "rule__EnvOneOf0AdditionalProperties__Group__2__Impl"
    // InternalEnvOneOf0Parser.g:1266:1: rule__EnvOneOf0AdditionalProperties__Group__2__Impl : ( ( rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__EnvOneOf0AdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1270:1: ( ( ( rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalEnvOneOf0Parser.g:1271:1: ( ( rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalEnvOneOf0Parser.g:1271:1: ( ( rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalEnvOneOf0Parser.g:1272:2: ( rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalEnvOneOf0Parser.g:1273:2: ( rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalEnvOneOf0Parser.g:1273:3: rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalProperties__Group__2__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0"
    // InternalEnvOneOf0Parser.g:1282:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0 : rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1286:1: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1 )
            // InternalEnvOneOf0Parser.g:1287:2: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0__Impl"
    // InternalEnvOneOf0Parser.g:1294:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0__Impl : ( () ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1298:1: ( ( () ) )
            // InternalEnvOneOf0Parser.g:1299:1: ( () )
            {
            // InternalEnvOneOf0Parser.g:1299:1: ( () )
            // InternalEnvOneOf0Parser.g:1300:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getEnvOneOf0AdditionalPropertiesTypeObjectAction_0()); 
            }
            // InternalEnvOneOf0Parser.g:1301:2: ()
            // InternalEnvOneOf0Parser.g:1301:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getEnvOneOf0AdditionalPropertiesTypeObjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__0__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1"
    // InternalEnvOneOf0Parser.g:1309:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1 : rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1313:1: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2 )
            // InternalEnvOneOf0Parser.g:1314:2: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1__Impl"
    // InternalEnvOneOf0Parser.g:1321:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1325:1: ( ( LeftCurlyBracket ) )
            // InternalEnvOneOf0Parser.g:1326:1: ( LeftCurlyBracket )
            {
            // InternalEnvOneOf0Parser.g:1326:1: ( LeftCurlyBracket )
            // InternalEnvOneOf0Parser.g:1327:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__1__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2"
    // InternalEnvOneOf0Parser.g:1336:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2 : rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1340:1: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3 )
            // InternalEnvOneOf0Parser.g:1341:2: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2__Impl"
    // InternalEnvOneOf0Parser.g:1348:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0 )? ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1352:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0 )? ) )
            // InternalEnvOneOf0Parser.g:1353:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0 )? )
            {
            // InternalEnvOneOf0Parser.g:1353:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0 )? )
            // InternalEnvOneOf0Parser.g:1354:2: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getGroup_2()); 
            }
            // InternalEnvOneOf0Parser.g:1355:2: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:1355:3: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getGroup_2()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__2__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3"
    // InternalEnvOneOf0Parser.g:1363:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3 : rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3__Impl ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1367:1: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3__Impl )
            // InternalEnvOneOf0Parser.g:1368:2: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3__Impl();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3__Impl"
    // InternalEnvOneOf0Parser.g:1374:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1378:1: ( ( RightCurlyBracket ) )
            // InternalEnvOneOf0Parser.g:1379:1: ( RightCurlyBracket )
            {
            // InternalEnvOneOf0Parser.g:1379:1: ( RightCurlyBracket )
            // InternalEnvOneOf0Parser.g:1380:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group__3__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0"
    // InternalEnvOneOf0Parser.g:1390:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0 : rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1394:1: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1 )
            // InternalEnvOneOf0Parser.g:1395:2: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0__Impl"
    // InternalEnvOneOf0Parser.g:1402:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0 ) ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1406:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0 ) ) )
            // InternalEnvOneOf0Parser.g:1407:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0 ) )
            {
            // InternalEnvOneOf0Parser.g:1407:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0 ) )
            // InternalEnvOneOf0Parser.g:1408:2: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesAssignment_2_0()); 
            }
            // InternalEnvOneOf0Parser.g:1409:2: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0 )
            // InternalEnvOneOf0Parser.g:1409:3: rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesAssignment_2_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__0__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1"
    // InternalEnvOneOf0Parser.g:1417:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1 : rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1__Impl ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1421:1: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1__Impl )
            // InternalEnvOneOf0Parser.g:1422:2: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1__Impl"
    // InternalEnvOneOf0Parser.g:1428:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0 )* ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1432:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0 )* ) )
            // InternalEnvOneOf0Parser.g:1433:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0 )* )
            {
            // InternalEnvOneOf0Parser.g:1433:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0 )* )
            // InternalEnvOneOf0Parser.g:1434:2: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getGroup_2_1()); 
            }
            // InternalEnvOneOf0Parser.g:1435:2: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEnvOneOf0Parser.g:1435:3: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2__1__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0"
    // InternalEnvOneOf0Parser.g:1444:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0 : rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1448:1: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1 )
            // InternalEnvOneOf0Parser.g:1449:2: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0__Impl"
    // InternalEnvOneOf0Parser.g:1456:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1460:1: ( ( Comma ) )
            // InternalEnvOneOf0Parser.g:1461:1: ( Comma )
            {
            // InternalEnvOneOf0Parser.g:1461:1: ( Comma )
            // InternalEnvOneOf0Parser.g:1462:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1"
    // InternalEnvOneOf0Parser.g:1471:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1 : rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1__Impl ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1475:1: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1__Impl )
            // InternalEnvOneOf0Parser.g:1476:2: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1__Impl"
    // InternalEnvOneOf0Parser.g:1482:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1 ) ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1486:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1 ) ) )
            // InternalEnvOneOf0Parser.g:1487:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1 ) )
            {
            // InternalEnvOneOf0Parser.g:1487:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1 ) )
            // InternalEnvOneOf0Parser.g:1488:2: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesAssignment_2_1_1()); 
            }
            // InternalEnvOneOf0Parser.g:1489:2: ( rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1 )
            // InternalEnvOneOf0Parser.g:1489:3: rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesAssignment_2_1_1()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0"
    // InternalEnvOneOf0Parser.g:1498:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0 : rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1502:1: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1 )
            // InternalEnvOneOf0Parser.g:1503:2: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0__Impl"
    // InternalEnvOneOf0Parser.g:1510:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0__Impl : ( () ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1514:1: ( ( () ) )
            // InternalEnvOneOf0Parser.g:1515:1: ( () )
            {
            // InternalEnvOneOf0Parser.g:1515:1: ( () )
            // InternalEnvOneOf0Parser.g:1516:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getEnvOneOf0AdditionalPropertiesTypeArrayAction_0()); 
            }
            // InternalEnvOneOf0Parser.g:1517:2: ()
            // InternalEnvOneOf0Parser.g:1517:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getEnvOneOf0AdditionalPropertiesTypeArrayAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__0__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1"
    // InternalEnvOneOf0Parser.g:1525:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1 : rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1529:1: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2 )
            // InternalEnvOneOf0Parser.g:1530:2: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1__Impl"
    // InternalEnvOneOf0Parser.g:1537:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1541:1: ( ( LeftSquareBracket ) )
            // InternalEnvOneOf0Parser.g:1542:1: ( LeftSquareBracket )
            {
            // InternalEnvOneOf0Parser.g:1542:1: ( LeftSquareBracket )
            // InternalEnvOneOf0Parser.g:1543:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__1__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2"
    // InternalEnvOneOf0Parser.g:1552:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2 : rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1556:1: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3 )
            // InternalEnvOneOf0Parser.g:1557:2: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2__Impl"
    // InternalEnvOneOf0Parser.g:1564:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0 )? ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1568:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0 )? ) )
            // InternalEnvOneOf0Parser.g:1569:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0 )? )
            {
            // InternalEnvOneOf0Parser.g:1569:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0 )? )
            // InternalEnvOneOf0Parser.g:1570:2: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getGroup_2()); 
            }
            // InternalEnvOneOf0Parser.g:1571:2: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=False && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:1571:3: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getGroup_2()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__2__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3"
    // InternalEnvOneOf0Parser.g:1579:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3 : rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3__Impl ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1583:1: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3__Impl )
            // InternalEnvOneOf0Parser.g:1584:2: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3__Impl();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3__Impl"
    // InternalEnvOneOf0Parser.g:1590:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1594:1: ( ( RightSquareBracket ) )
            // InternalEnvOneOf0Parser.g:1595:1: ( RightSquareBracket )
            {
            // InternalEnvOneOf0Parser.g:1595:1: ( RightSquareBracket )
            // InternalEnvOneOf0Parser.g:1596:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group__3__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0"
    // InternalEnvOneOf0Parser.g:1606:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0 : rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1610:1: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1 )
            // InternalEnvOneOf0Parser.g:1611:2: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0__Impl"
    // InternalEnvOneOf0Parser.g:1618:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0 ) ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1622:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0 ) ) )
            // InternalEnvOneOf0Parser.g:1623:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0 ) )
            {
            // InternalEnvOneOf0Parser.g:1623:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0 ) )
            // InternalEnvOneOf0Parser.g:1624:2: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesAssignment_2_0()); 
            }
            // InternalEnvOneOf0Parser.g:1625:2: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0 )
            // InternalEnvOneOf0Parser.g:1625:3: rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesAssignment_2_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__0__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1"
    // InternalEnvOneOf0Parser.g:1633:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1 : rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1__Impl ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1637:1: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1__Impl )
            // InternalEnvOneOf0Parser.g:1638:2: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1__Impl();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1__Impl"
    // InternalEnvOneOf0Parser.g:1644:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0 )* ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1648:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0 )* ) )
            // InternalEnvOneOf0Parser.g:1649:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0 )* )
            {
            // InternalEnvOneOf0Parser.g:1649:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0 )* )
            // InternalEnvOneOf0Parser.g:1650:2: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getGroup_2_1()); 
            }
            // InternalEnvOneOf0Parser.g:1651:2: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEnvOneOf0Parser.g:1651:3: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2__1__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0"
    // InternalEnvOneOf0Parser.g:1660:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0 : rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1 ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1664:1: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1 )
            // InternalEnvOneOf0Parser.g:1665:2: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0__Impl rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0__Impl"
    // InternalEnvOneOf0Parser.g:1672:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1676:1: ( ( Comma ) )
            // InternalEnvOneOf0Parser.g:1677:1: ( Comma )
            {
            // InternalEnvOneOf0Parser.g:1677:1: ( Comma )
            // InternalEnvOneOf0Parser.g:1678:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1"
    // InternalEnvOneOf0Parser.g:1687:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1 : rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1__Impl ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1691:1: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1__Impl )
            // InternalEnvOneOf0Parser.g:1692:2: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1__Impl"
    // InternalEnvOneOf0Parser.g:1698:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1 ) ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1702:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1 ) ) )
            // InternalEnvOneOf0Parser.g:1703:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1 ) )
            {
            // InternalEnvOneOf0Parser.g:1703:1: ( ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1 ) )
            // InternalEnvOneOf0Parser.g:1704:2: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesAssignment_2_1_1()); 
            }
            // InternalEnvOneOf0Parser.g:1705:2: ( rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1 )
            // InternalEnvOneOf0Parser.g:1705:3: rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesAssignment_2_1_1()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0"
    // InternalEnvOneOf0Parser.g:1714:1: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0 : rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0__Impl rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1 ;
    public final void rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1718:1: ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0__Impl rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1 )
            // InternalEnvOneOf0Parser.g:1719:2: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0__Impl rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0__Impl"
    // InternalEnvOneOf0Parser.g:1726:1: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1730:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0 ) ) )
            // InternalEnvOneOf0Parser.g:1731:1: ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalEnvOneOf0Parser.g:1731:1: ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0 ) )
            // InternalEnvOneOf0Parser.g:1732:2: ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalEnvOneOf0Parser.g:1733:2: ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0 )
            // InternalEnvOneOf0Parser.g:1733:3: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getKeyAssignment_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__0__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1"
    // InternalEnvOneOf0Parser.g:1741:1: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1 : rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1__Impl rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2 ;
    public final void rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1745:1: ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1__Impl rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2 )
            // InternalEnvOneOf0Parser.g:1746:2: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1__Impl rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1__Impl"
    // InternalEnvOneOf0Parser.g:1753:1: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1757:1: ( ( Colon ) )
            // InternalEnvOneOf0Parser.g:1758:1: ( Colon )
            {
            // InternalEnvOneOf0Parser.g:1758:1: ( Colon )
            // InternalEnvOneOf0Parser.g:1759:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__1__Impl"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2"
    // InternalEnvOneOf0Parser.g:1768:1: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2 : rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2__Impl ;
    public final void rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1772:1: ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2__Impl )
            // InternalEnvOneOf0Parser.g:1773:2: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2__Impl();

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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2__Impl"
    // InternalEnvOneOf0Parser.g:1779:1: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2__Impl : ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1783:1: ( ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalEnvOneOf0Parser.g:1784:1: ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalEnvOneOf0Parser.g:1784:1: ( ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalEnvOneOf0Parser.g:1785:2: ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalEnvOneOf0Parser.g:1786:2: ( rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalEnvOneOf0Parser.g:1786:3: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalEnvOneOf0Parser.g:1795:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1799:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalEnvOneOf0Parser.g:1800:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
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
    // InternalEnvOneOf0Parser.g:1807:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1811:1: ( ( () ) )
            // InternalEnvOneOf0Parser.g:1812:1: ( () )
            {
            // InternalEnvOneOf0Parser.g:1812:1: ( () )
            // InternalEnvOneOf0Parser.g:1813:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            }
            // InternalEnvOneOf0Parser.g:1814:2: ()
            // InternalEnvOneOf0Parser.g:1814:3: 
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
    // InternalEnvOneOf0Parser.g:1822:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1826:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalEnvOneOf0Parser.g:1827:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
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
    // InternalEnvOneOf0Parser.g:1834:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1838:1: ( ( LeftSquareBracket ) )
            // InternalEnvOneOf0Parser.g:1839:1: ( LeftSquareBracket )
            {
            // InternalEnvOneOf0Parser.g:1839:1: ( LeftSquareBracket )
            // InternalEnvOneOf0Parser.g:1840:2: LeftSquareBracket
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
    // InternalEnvOneOf0Parser.g:1849:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1853:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalEnvOneOf0Parser.g:1854:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
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
    // InternalEnvOneOf0Parser.g:1861:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1865:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalEnvOneOf0Parser.g:1866:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalEnvOneOf0Parser.g:1866:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalEnvOneOf0Parser.g:1867:2: ( rule__ArrayValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            }
            // InternalEnvOneOf0Parser.g:1868:2: ( rule__ArrayValue__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=False && LA13_0<=True)||LA13_0==LeftSquareBracket||LA13_0==LeftCurlyBracket||(LA13_0>=RULE_STRING && LA13_0<=RULE_E_DOUBLE)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:1868:3: rule__ArrayValue__Group_2__0
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
    // InternalEnvOneOf0Parser.g:1876:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1880:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalEnvOneOf0Parser.g:1881:2: rule__ArrayValue__Group__3__Impl
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
    // InternalEnvOneOf0Parser.g:1887:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1891:1: ( ( RightSquareBracket ) )
            // InternalEnvOneOf0Parser.g:1892:1: ( RightSquareBracket )
            {
            // InternalEnvOneOf0Parser.g:1892:1: ( RightSquareBracket )
            // InternalEnvOneOf0Parser.g:1893:2: RightSquareBracket
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
    // InternalEnvOneOf0Parser.g:1903:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1907:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalEnvOneOf0Parser.g:1908:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalEnvOneOf0Parser.g:1915:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1919:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalEnvOneOf0Parser.g:1920:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalEnvOneOf0Parser.g:1920:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalEnvOneOf0Parser.g:1921:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            }
            // InternalEnvOneOf0Parser.g:1922:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalEnvOneOf0Parser.g:1922:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalEnvOneOf0Parser.g:1930:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1934:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalEnvOneOf0Parser.g:1935:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalEnvOneOf0Parser.g:1941:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1945:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalEnvOneOf0Parser.g:1946:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalEnvOneOf0Parser.g:1946:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalEnvOneOf0Parser.g:1947:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            }
            // InternalEnvOneOf0Parser.g:1948:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEnvOneOf0Parser.g:1948:3: rule__ArrayValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ArrayValue__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalEnvOneOf0Parser.g:1957:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1961:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalEnvOneOf0Parser.g:1962:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
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
    // InternalEnvOneOf0Parser.g:1969:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1973:1: ( ( Comma ) )
            // InternalEnvOneOf0Parser.g:1974:1: ( Comma )
            {
            // InternalEnvOneOf0Parser.g:1974:1: ( Comma )
            // InternalEnvOneOf0Parser.g:1975:2: Comma
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
    // InternalEnvOneOf0Parser.g:1984:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1988:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalEnvOneOf0Parser.g:1989:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalEnvOneOf0Parser.g:1995:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:1999:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalEnvOneOf0Parser.g:2000:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalEnvOneOf0Parser.g:2000:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalEnvOneOf0Parser.g:2001:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            }
            // InternalEnvOneOf0Parser.g:2002:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalEnvOneOf0Parser.g:2002:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalEnvOneOf0Parser.g:2011:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2015:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalEnvOneOf0Parser.g:2016:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
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
    // InternalEnvOneOf0Parser.g:2023:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2027:1: ( ( () ) )
            // InternalEnvOneOf0Parser.g:2028:1: ( () )
            {
            // InternalEnvOneOf0Parser.g:2028:1: ( () )
            // InternalEnvOneOf0Parser.g:2029:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }
            // InternalEnvOneOf0Parser.g:2030:2: ()
            // InternalEnvOneOf0Parser.g:2030:3: 
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
    // InternalEnvOneOf0Parser.g:2038:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2042:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalEnvOneOf0Parser.g:2043:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
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
    // InternalEnvOneOf0Parser.g:2050:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2054:1: ( ( LeftCurlyBracket ) )
            // InternalEnvOneOf0Parser.g:2055:1: ( LeftCurlyBracket )
            {
            // InternalEnvOneOf0Parser.g:2055:1: ( LeftCurlyBracket )
            // InternalEnvOneOf0Parser.g:2056:2: LeftCurlyBracket
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
    // InternalEnvOneOf0Parser.g:2065:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2069:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalEnvOneOf0Parser.g:2070:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
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
    // InternalEnvOneOf0Parser.g:2077:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2081:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalEnvOneOf0Parser.g:2082:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalEnvOneOf0Parser.g:2082:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalEnvOneOf0Parser.g:2083:2: ( rule__ObjectValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            }
            // InternalEnvOneOf0Parser.g:2084:2: ( rule__ObjectValue__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEnvOneOf0Parser.g:2084:3: rule__ObjectValue__Group_2__0
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
    // InternalEnvOneOf0Parser.g:2092:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2096:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalEnvOneOf0Parser.g:2097:2: rule__ObjectValue__Group__3__Impl
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
    // InternalEnvOneOf0Parser.g:2103:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2107:1: ( ( RightCurlyBracket ) )
            // InternalEnvOneOf0Parser.g:2108:1: ( RightCurlyBracket )
            {
            // InternalEnvOneOf0Parser.g:2108:1: ( RightCurlyBracket )
            // InternalEnvOneOf0Parser.g:2109:2: RightCurlyBracket
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
    // InternalEnvOneOf0Parser.g:2119:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2123:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalEnvOneOf0Parser.g:2124:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalEnvOneOf0Parser.g:2131:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2135:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalEnvOneOf0Parser.g:2136:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalEnvOneOf0Parser.g:2136:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalEnvOneOf0Parser.g:2137:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            }
            // InternalEnvOneOf0Parser.g:2138:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalEnvOneOf0Parser.g:2138:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalEnvOneOf0Parser.g:2146:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2150:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalEnvOneOf0Parser.g:2151:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalEnvOneOf0Parser.g:2157:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2161:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalEnvOneOf0Parser.g:2162:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalEnvOneOf0Parser.g:2162:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalEnvOneOf0Parser.g:2163:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            }
            // InternalEnvOneOf0Parser.g:2164:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEnvOneOf0Parser.g:2164:3: rule__ObjectValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ObjectValue__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalEnvOneOf0Parser.g:2173:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2177:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalEnvOneOf0Parser.g:2178:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
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
    // InternalEnvOneOf0Parser.g:2185:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2189:1: ( ( Comma ) )
            // InternalEnvOneOf0Parser.g:2190:1: ( Comma )
            {
            // InternalEnvOneOf0Parser.g:2190:1: ( Comma )
            // InternalEnvOneOf0Parser.g:2191:2: Comma
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
    // InternalEnvOneOf0Parser.g:2200:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2204:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalEnvOneOf0Parser.g:2205:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalEnvOneOf0Parser.g:2211:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2215:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalEnvOneOf0Parser.g:2216:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalEnvOneOf0Parser.g:2216:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalEnvOneOf0Parser.g:2217:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            }
            // InternalEnvOneOf0Parser.g:2218:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalEnvOneOf0Parser.g:2218:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalEnvOneOf0Parser.g:2227:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2231:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalEnvOneOf0Parser.g:2232:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
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
    // InternalEnvOneOf0Parser.g:2239:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2243:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalEnvOneOf0Parser.g:2244:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalEnvOneOf0Parser.g:2244:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalEnvOneOf0Parser.g:2245:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // InternalEnvOneOf0Parser.g:2246:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalEnvOneOf0Parser.g:2246:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalEnvOneOf0Parser.g:2254:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2258:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalEnvOneOf0Parser.g:2259:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
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
    // InternalEnvOneOf0Parser.g:2266:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2270:1: ( ( Colon ) )
            // InternalEnvOneOf0Parser.g:2271:1: ( Colon )
            {
            // InternalEnvOneOf0Parser.g:2271:1: ( Colon )
            // InternalEnvOneOf0Parser.g:2272:2: Colon
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
    // InternalEnvOneOf0Parser.g:2281:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2285:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalEnvOneOf0Parser.g:2286:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalEnvOneOf0Parser.g:2292:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2296:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalEnvOneOf0Parser.g:2297:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalEnvOneOf0Parser.g:2297:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalEnvOneOf0Parser.g:2298:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // InternalEnvOneOf0Parser.g:2299:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalEnvOneOf0Parser.g:2299:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__EnvOneOf0__EnvAssignment_2_0"
    // InternalEnvOneOf0Parser.g:2308:1: rule__EnvOneOf0__EnvAssignment_2_0 : ( ruleEnvOneOf0PropertiesAbstract ) ;
    public final void rule__EnvOneOf0__EnvAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2312:1: ( ( ruleEnvOneOf0PropertiesAbstract ) )
            // InternalEnvOneOf0Parser.g:2313:2: ( ruleEnvOneOf0PropertiesAbstract )
            {
            // InternalEnvOneOf0Parser.g:2313:2: ( ruleEnvOneOf0PropertiesAbstract )
            // InternalEnvOneOf0Parser.g:2314:3: ruleEnvOneOf0PropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getEnvEnvOneOf0PropertiesAbstractParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnvOneOf0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getEnvEnvOneOf0PropertiesAbstractParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__EnvOneOf0__EnvAssignment_2_0"


    // $ANTLR start "rule__EnvOneOf0__EnvAssignment_2_1_1"
    // InternalEnvOneOf0Parser.g:2323:1: rule__EnvOneOf0__EnvAssignment_2_1_1 : ( ruleEnvOneOf0PropertiesAbstract ) ;
    public final void rule__EnvOneOf0__EnvAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2327:1: ( ( ruleEnvOneOf0PropertiesAbstract ) )
            // InternalEnvOneOf0Parser.g:2328:2: ( ruleEnvOneOf0PropertiesAbstract )
            {
            // InternalEnvOneOf0Parser.g:2328:2: ( ruleEnvOneOf0PropertiesAbstract )
            // InternalEnvOneOf0Parser.g:2329:3: ruleEnvOneOf0PropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0Access().getEnvEnvOneOf0PropertiesAbstractParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnvOneOf0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0Access().getEnvEnvOneOf0PropertiesAbstractParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__EnvOneOf0__EnvAssignment_2_1_1"


    // $ANTLR start "rule__EnvOneOf0AdditionalProperties__KeyAssignment_0"
    // InternalEnvOneOf0Parser.g:2338:1: rule__EnvOneOf0AdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__EnvOneOf0AdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2342:1: ( ( ruleEString ) )
            // InternalEnvOneOf0Parser.g:2343:2: ( ruleEString )
            {
            // InternalEnvOneOf0Parser.g:2343:2: ( ruleEString )
            // InternalEnvOneOf0Parser.g:2344:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalProperties__KeyAssignment_0"


    // $ANTLR start "rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2"
    // InternalEnvOneOf0Parser.g:2353:1: rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleEnvOneOf0AdditionalPropertiesAbstract ) ;
    public final void rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2357:1: ( ( ruleEnvOneOf0AdditionalPropertiesAbstract ) )
            // InternalEnvOneOf0Parser.g:2358:2: ( ruleEnvOneOf0AdditionalPropertiesAbstract )
            {
            // InternalEnvOneOf0Parser.g:2358:2: ( ruleEnvOneOf0AdditionalPropertiesAbstract )
            // InternalEnvOneOf0Parser.g:2359:3: ruleEnvOneOf0AdditionalPropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesAbstractParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnvOneOf0AdditionalPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesAbstractParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalProperties__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment"
    // InternalEnvOneOf0Parser.g:2368:1: rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment : ( ruleEString ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2372:1: ( ( ruleEString ) )
            // InternalEnvOneOf0Parser.g:2373:2: ( ruleEString )
            {
            // InternalEnvOneOf0Parser.g:2373:2: ( ruleEString )
            // InternalEnvOneOf0Parser.g:2374:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringAccess().getAdditionalPropertiesEStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeStringAccess().getAdditionalPropertiesEStringParserRuleCall_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeString__AdditionalPropertiesAssignment"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment"
    // InternalEnvOneOf0Parser.g:2383:1: rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment : ( ruleEDoubleObject ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2387:1: ( ( ruleEDoubleObject ) )
            // InternalEnvOneOf0Parser.g:2388:2: ( ruleEDoubleObject )
            {
            // InternalEnvOneOf0Parser.g:2388:2: ( ruleEDoubleObject )
            // InternalEnvOneOf0Parser.g:2389:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeIntegerAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeInteger__AdditionalPropertiesAssignment"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment"
    // InternalEnvOneOf0Parser.g:2398:1: rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment : ( ruleEDoubleObject ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2402:1: ( ( ruleEDoubleObject ) )
            // InternalEnvOneOf0Parser.g:2403:2: ( ruleEDoubleObject )
            {
            // InternalEnvOneOf0Parser.g:2403:2: ( ruleEDoubleObject )
            // InternalEnvOneOf0Parser.g:2404:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNumberAccess().getAdditionalPropertiesEDoubleObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeNumber__AdditionalPropertiesAssignment"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment"
    // InternalEnvOneOf0Parser.g:2413:1: rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment : ( ruleEBooleanObject ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2417:1: ( ( ruleEBooleanObject ) )
            // InternalEnvOneOf0Parser.g:2418:2: ( ruleEBooleanObject )
            {
            // InternalEnvOneOf0Parser.g:2418:2: ( ruleEBooleanObject )
            // InternalEnvOneOf0Parser.g:2419:3: ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanAccess().getAdditionalPropertiesEBooleanObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeBooleanAccess().getAdditionalPropertiesEBooleanObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeBoolean__AdditionalPropertiesAssignment"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0"
    // InternalEnvOneOf0Parser.g:2428:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0 : ( ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2432:1: ( ( ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) )
            // InternalEnvOneOf0Parser.g:2433:2: ( ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract )
            {
            // InternalEnvOneOf0Parser.g:2433:2: ( ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract )
            // InternalEnvOneOf0Parser.g:2434:3: ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesPropertiesAbstractParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesPropertiesAbstractParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1"
    // InternalEnvOneOf0Parser.g:2443:1: rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1 : ( ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2447:1: ( ( ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract ) )
            // InternalEnvOneOf0Parser.g:2448:2: ( ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract )
            {
            // InternalEnvOneOf0Parser.g:2448:2: ( ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract )
            // InternalEnvOneOf0Parser.g:2449:3: ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesPropertiesAbstractParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnvOneOf0AdditionalPropertiesPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeObjectAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesPropertiesAbstractParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeObject__AdditionalPropertiesAssignment_2_1_1"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0"
    // InternalEnvOneOf0Parser.g:2458:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0 : ( ruleEnvOneOf0AdditionalPropertiesItems ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2462:1: ( ( ruleEnvOneOf0AdditionalPropertiesItems ) )
            // InternalEnvOneOf0Parser.g:2463:2: ( ruleEnvOneOf0AdditionalPropertiesItems )
            {
            // InternalEnvOneOf0Parser.g:2463:2: ( ruleEnvOneOf0AdditionalPropertiesItems )
            // InternalEnvOneOf0Parser.g:2464:3: ruleEnvOneOf0AdditionalPropertiesItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesItemsParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnvOneOf0AdditionalPropertiesItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesItemsParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1"
    // InternalEnvOneOf0Parser.g:2473:1: rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1 : ( ruleEnvOneOf0AdditionalPropertiesItems ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2477:1: ( ( ruleEnvOneOf0AdditionalPropertiesItems ) )
            // InternalEnvOneOf0Parser.g:2478:2: ( ruleEnvOneOf0AdditionalPropertiesItems )
            {
            // InternalEnvOneOf0Parser.g:2478:2: ( ruleEnvOneOf0AdditionalPropertiesItems )
            // InternalEnvOneOf0Parser.g:2479:3: ruleEnvOneOf0AdditionalPropertiesItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesItemsParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnvOneOf0AdditionalPropertiesItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeArrayAccess().getAdditionalPropertiesEnvOneOf0AdditionalPropertiesItemsParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeArray__AdditionalPropertiesAssignment_2_1_1"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment"
    // InternalEnvOneOf0Parser.g:2488:1: rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment : ( ruleNullValue ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2492:1: ( ( ruleNullValue ) )
            // InternalEnvOneOf0Parser.g:2493:2: ( ruleNullValue )
            {
            // InternalEnvOneOf0Parser.g:2493:2: ( ruleNullValue )
            // InternalEnvOneOf0Parser.g:2494:3: ruleNullValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullAccess().getAdditionalPropertiesNullValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNullValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesTypeNullAccess().getAdditionalPropertiesNullValueParserRuleCall_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesTypeNull__AdditionalPropertiesAssignment"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0"
    // InternalEnvOneOf0Parser.g:2503:1: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2507:1: ( ( ruleEString ) )
            // InternalEnvOneOf0Parser.g:2508:2: ( ruleEString )
            {
            // InternalEnvOneOf0Parser.g:2508:2: ( ruleEString )
            // InternalEnvOneOf0Parser.g:2509:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__KeyAssignment_0"


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2"
    // InternalEnvOneOf0Parser.g:2518:1: rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2522:1: ( ( ruleJsonDocument ) )
            // InternalEnvOneOf0Parser.g:2523:2: ( ruleJsonDocument )
            {
            // InternalEnvOneOf0Parser.g:2523:2: ( ruleJsonDocument )
            // InternalEnvOneOf0Parser.g:2524:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesAdditionalProperties__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalEnvOneOf0Parser.g:2533:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2537:1: ( ( ruleValue ) )
            // InternalEnvOneOf0Parser.g:2538:2: ( ruleValue )
            {
            // InternalEnvOneOf0Parser.g:2538:2: ( ruleValue )
            // InternalEnvOneOf0Parser.g:2539:3: ruleValue
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
    // InternalEnvOneOf0Parser.g:2548:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2552:1: ( ( ruleEString ) )
            // InternalEnvOneOf0Parser.g:2553:2: ( ruleEString )
            {
            // InternalEnvOneOf0Parser.g:2553:2: ( ruleEString )
            // InternalEnvOneOf0Parser.g:2554:3: ruleEString
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
    // InternalEnvOneOf0Parser.g:2563:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2567:1: ( ( ruleValue ) )
            // InternalEnvOneOf0Parser.g:2568:2: ( ruleValue )
            {
            // InternalEnvOneOf0Parser.g:2568:2: ( ruleValue )
            // InternalEnvOneOf0Parser.g:2569:3: ruleValue
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
    // InternalEnvOneOf0Parser.g:2578:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2582:1: ( ( ruleValue ) )
            // InternalEnvOneOf0Parser.g:2583:2: ( ruleValue )
            {
            // InternalEnvOneOf0Parser.g:2583:2: ( ruleValue )
            // InternalEnvOneOf0Parser.g:2584:3: ruleValue
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
    // InternalEnvOneOf0Parser.g:2593:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2597:1: ( ( ruleNullEnum ) )
            // InternalEnvOneOf0Parser.g:2598:2: ( ruleNullEnum )
            {
            // InternalEnvOneOf0Parser.g:2598:2: ( ruleNullEnum )
            // InternalEnvOneOf0Parser.g:2599:3: ruleNullEnum
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
    // InternalEnvOneOf0Parser.g:2608:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2612:1: ( ( ruleEDouble ) )
            // InternalEnvOneOf0Parser.g:2613:2: ( ruleEDouble )
            {
            // InternalEnvOneOf0Parser.g:2613:2: ( ruleEDouble )
            // InternalEnvOneOf0Parser.g:2614:3: ruleEDouble
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
    // InternalEnvOneOf0Parser.g:2623:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2627:1: ( ( ruleKeyValuePair ) )
            // InternalEnvOneOf0Parser.g:2628:2: ( ruleKeyValuePair )
            {
            // InternalEnvOneOf0Parser.g:2628:2: ( ruleKeyValuePair )
            // InternalEnvOneOf0Parser.g:2629:3: ruleKeyValuePair
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
    // InternalEnvOneOf0Parser.g:2638:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2642:1: ( ( ruleKeyValuePair ) )
            // InternalEnvOneOf0Parser.g:2643:2: ( ruleKeyValuePair )
            {
            // InternalEnvOneOf0Parser.g:2643:2: ( ruleKeyValuePair )
            // InternalEnvOneOf0Parser.g:2644:3: ruleKeyValuePair
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
    // InternalEnvOneOf0Parser.g:2653:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2657:1: ( ( ruleEBoolean ) )
            // InternalEnvOneOf0Parser.g:2658:2: ( ruleEBoolean )
            {
            // InternalEnvOneOf0Parser.g:2658:2: ( ruleEBoolean )
            // InternalEnvOneOf0Parser.g:2659:3: ruleEBoolean
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
    // InternalEnvOneOf0Parser.g:2668:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2672:1: ( ( ruleEString ) )
            // InternalEnvOneOf0Parser.g:2673:2: ( ruleEString )
            {
            // InternalEnvOneOf0Parser.g:2673:2: ( ruleEString )
            // InternalEnvOneOf0Parser.g:2674:3: ruleEString
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
    // InternalEnvOneOf0Parser.g:2683:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2687:1: ( ( ruleValue ) )
            // InternalEnvOneOf0Parser.g:2688:2: ( ruleValue )
            {
            // InternalEnvOneOf0Parser.g:2688:2: ( ruleValue )
            // InternalEnvOneOf0Parser.g:2689:3: ruleValue
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


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment"
    // InternalEnvOneOf0Parser.g:2698:1: rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment : ( ruleJsonDocument ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0Parser.g:2702:1: ( ( ruleJsonDocument ) )
            // InternalEnvOneOf0Parser.g:2703:2: ( ruleJsonDocument )
            {
            // InternalEnvOneOf0Parser.g:2703:2: ( ruleJsonDocument )
            // InternalEnvOneOf0Parser.g:2704:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnvOneOf0AdditionalPropertiesItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
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
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesItems__ItemsAssignment"

    // $ANTLR start synpred1_InternalEnvOneOf0Parser
    public final void synpred1_InternalEnvOneOf0Parser_fragment() throws RecognitionException {   
        // InternalEnvOneOf0Parser.g:810:2: ( ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber ) ) )
        // InternalEnvOneOf0Parser.g:810:2: ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber ) )
        {
        // InternalEnvOneOf0Parser.g:810:2: ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber ) )
        // InternalEnvOneOf0Parser.g:811:3: ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeNumberParserRuleCall_0()); 
        }
        // InternalEnvOneOf0Parser.g:812:3: ( ruleEnvOneOf0AdditionalPropertiesTypeNumber )
        // InternalEnvOneOf0Parser.g:812:4: ruleEnvOneOf0AdditionalPropertiesTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleEnvOneOf0AdditionalPropertiesTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalEnvOneOf0Parser

    // $ANTLR start synpred3_InternalEnvOneOf0Parser
    public final void synpred3_InternalEnvOneOf0Parser_fragment() throws RecognitionException {   
        // InternalEnvOneOf0Parser.g:822:2: ( ( ruleEnvOneOf0AdditionalPropertiesTypeInteger ) )
        // InternalEnvOneOf0Parser.g:822:2: ( ruleEnvOneOf0AdditionalPropertiesTypeInteger )
        {
        // InternalEnvOneOf0Parser.g:822:2: ( ruleEnvOneOf0AdditionalPropertiesTypeInteger )
        // InternalEnvOneOf0Parser.g:823:3: ruleEnvOneOf0AdditionalPropertiesTypeInteger
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEnvOneOf0AdditionalPropertiesAbstractAccess().getEnvOneOf0AdditionalPropertiesTypeIntegerParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleEnvOneOf0AdditionalPropertiesTypeInteger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalEnvOneOf0Parser

    // Delegated rules

    public final boolean synpred1_InternalEnvOneOf0Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEnvOneOf0Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEnvOneOf0Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEnvOneOf0Parser_fragment(); // can never throw exception
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
    static final String dfa_3s = "\1\20\2\0\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_5s = "\1\uffff\1\1\1\0\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
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
            return "805:1: rule__EnvOneOf0AdditionalPropertiesAbstract__Alternatives : ( ( ( ruleEnvOneOf0AdditionalPropertiesTypeNumber ) ) | ( ruleEnvOneOf0AdditionalPropertiesTypeString ) | ( ruleEnvOneOf0AdditionalPropertiesTypeInteger ) | ( ruleEnvOneOf0AdditionalPropertiesTypeBoolean ) | ( ruleEnvOneOf0AdditionalPropertiesTypeObject ) | ( ruleEnvOneOf0AdditionalPropertiesTypeArray ) | ( ruleEnvOneOf0AdditionalPropertiesTypeNull ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalEnvOneOf0Parser()) ) {s = 8;}

                        else if ( (synpred3_InternalEnvOneOf0Parser()) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalEnvOneOf0Parser()) ) {s = 8;}

                        else if ( (synpred3_InternalEnvOneOf0Parser()) ) {s = 9;}

                         
                        input.seek(index1_1);
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