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
import githubwf.githubwf.services.ConfigurationOneOf3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalConfigurationOneOf3Parser extends AbstractInternalContentAssistParser {
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


        public InternalConfigurationOneOf3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigurationOneOf3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigurationOneOf3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigurationOneOf3Parser.g"; }


    	private ConfigurationOneOf3GrammarAccess grammarAccess;
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

    	public void setGrammarAccess(ConfigurationOneOf3GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleConfigurationOneOf3"
    // InternalConfigurationOneOf3Parser.g:65:1: entryRuleConfigurationOneOf3 : ruleConfigurationOneOf3 EOF ;
    public final void entryRuleConfigurationOneOf3() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:66:1: ( ruleConfigurationOneOf3 EOF )
            // InternalConfigurationOneOf3Parser.g:67:1: ruleConfigurationOneOf3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationOneOf3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Rule()); 
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
    // $ANTLR end "entryRuleConfigurationOneOf3"


    // $ANTLR start "ruleConfigurationOneOf3"
    // InternalConfigurationOneOf3Parser.g:74:1: ruleConfigurationOneOf3 : ( ( rule__ConfigurationOneOf3__Group__0 ) ) ;
    public final void ruleConfigurationOneOf3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:78:2: ( ( ( rule__ConfigurationOneOf3__Group__0 ) ) )
            // InternalConfigurationOneOf3Parser.g:79:2: ( ( rule__ConfigurationOneOf3__Group__0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:79:2: ( ( rule__ConfigurationOneOf3__Group__0 ) )
            // InternalConfigurationOneOf3Parser.g:80:3: ( rule__ConfigurationOneOf3__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getGroup()); 
            }
            // InternalConfigurationOneOf3Parser.g:81:3: ( rule__ConfigurationOneOf3__Group__0 )
            // InternalConfigurationOneOf3Parser.g:81:4: rule__ConfigurationOneOf3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getGroup()); 
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
    // $ANTLR end "ruleConfigurationOneOf3"


    // $ANTLR start "entryRuleConfigurationOneOf3PropertiesAbstract"
    // InternalConfigurationOneOf3Parser.g:90:1: entryRuleConfigurationOneOf3PropertiesAbstract : ruleConfigurationOneOf3PropertiesAbstract EOF ;
    public final void entryRuleConfigurationOneOf3PropertiesAbstract() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:91:1: ( ruleConfigurationOneOf3PropertiesAbstract EOF )
            // InternalConfigurationOneOf3Parser.g:92:1: ruleConfigurationOneOf3PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationOneOf3PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3PropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleConfigurationOneOf3PropertiesAbstract"


    // $ANTLR start "ruleConfigurationOneOf3PropertiesAbstract"
    // InternalConfigurationOneOf3Parser.g:99:1: ruleConfigurationOneOf3PropertiesAbstract : ( ( ruleConfigurationOneOf3AdditionalProperties ) ) ;
    public final void ruleConfigurationOneOf3PropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:103:2: ( ( ( ruleConfigurationOneOf3AdditionalProperties ) ) )
            // InternalConfigurationOneOf3Parser.g:104:2: ( ( ruleConfigurationOneOf3AdditionalProperties ) )
            {
            // InternalConfigurationOneOf3Parser.g:104:2: ( ( ruleConfigurationOneOf3AdditionalProperties ) )
            // InternalConfigurationOneOf3Parser.g:105:3: ( ruleConfigurationOneOf3AdditionalProperties )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3PropertiesAbstractAccess().getConfigurationOneOf3AdditionalPropertiesParserRuleCall()); 
            }
            // InternalConfigurationOneOf3Parser.g:106:3: ( ruleConfigurationOneOf3AdditionalProperties )
            // InternalConfigurationOneOf3Parser.g:106:4: ruleConfigurationOneOf3AdditionalProperties
            {
            pushFollow(FOLLOW_2);
            ruleConfigurationOneOf3AdditionalProperties();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3PropertiesAbstractAccess().getConfigurationOneOf3AdditionalPropertiesParserRuleCall()); 
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
    // $ANTLR end "ruleConfigurationOneOf3PropertiesAbstract"


    // $ANTLR start "entryRuleConfigurationAbstract"
    // InternalConfigurationOneOf3Parser.g:115:1: entryRuleConfigurationAbstract : ruleConfigurationAbstract EOF ;
    public final void entryRuleConfigurationAbstract() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:116:1: ( ruleConfigurationAbstract EOF )
            // InternalConfigurationOneOf3Parser.g:117:1: ruleConfigurationAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAbstractRule()); 
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
    // $ANTLR end "entryRuleConfigurationAbstract"


    // $ANTLR start "ruleConfigurationAbstract"
    // InternalConfigurationOneOf3Parser.g:124:1: ruleConfigurationAbstract : ( ( rule__ConfigurationAbstract__Alternatives ) ) ;
    public final void ruleConfigurationAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:128:2: ( ( ( rule__ConfigurationAbstract__Alternatives ) ) )
            // InternalConfigurationOneOf3Parser.g:129:2: ( ( rule__ConfigurationAbstract__Alternatives ) )
            {
            // InternalConfigurationOneOf3Parser.g:129:2: ( ( rule__ConfigurationAbstract__Alternatives ) )
            // InternalConfigurationOneOf3Parser.g:130:3: ( rule__ConfigurationAbstract__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAbstractAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf3Parser.g:131:3: ( rule__ConfigurationAbstract__Alternatives )
            // InternalConfigurationOneOf3Parser.g:131:4: rule__ConfigurationAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationAbstract__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAbstractAccess().getAlternatives()); 
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
    // $ANTLR end "ruleConfigurationAbstract"


    // $ANTLR start "entryRuleConfigurationPropertiesAbstract"
    // InternalConfigurationOneOf3Parser.g:140:1: entryRuleConfigurationPropertiesAbstract : ruleConfigurationPropertiesAbstract EOF ;
    public final void entryRuleConfigurationPropertiesAbstract() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:141:1: ( ruleConfigurationPropertiesAbstract EOF )
            // InternalConfigurationOneOf3Parser.g:142:1: ruleConfigurationPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleConfigurationPropertiesAbstract"


    // $ANTLR start "ruleConfigurationPropertiesAbstract"
    // InternalConfigurationOneOf3Parser.g:149:1: ruleConfigurationPropertiesAbstract : ( ( ruleConfigurationAdditionalProperties ) ) ;
    public final void ruleConfigurationPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:153:2: ( ( ( ruleConfigurationAdditionalProperties ) ) )
            // InternalConfigurationOneOf3Parser.g:154:2: ( ( ruleConfigurationAdditionalProperties ) )
            {
            // InternalConfigurationOneOf3Parser.g:154:2: ( ( ruleConfigurationAdditionalProperties ) )
            // InternalConfigurationOneOf3Parser.g:155:3: ( ruleConfigurationAdditionalProperties )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationPropertiesAbstractAccess().getConfigurationAdditionalPropertiesParserRuleCall()); 
            }
            // InternalConfigurationOneOf3Parser.g:156:3: ( ruleConfigurationAdditionalProperties )
            // InternalConfigurationOneOf3Parser.g:156:4: ruleConfigurationAdditionalProperties
            {
            pushFollow(FOLLOW_2);
            ruleConfigurationAdditionalProperties();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationPropertiesAbstractAccess().getConfigurationAdditionalPropertiesParserRuleCall()); 
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
    // $ANTLR end "ruleConfigurationPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalConfigurationOneOf3Parser.g:165:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:166:1: ( ruleValue EOF )
            // InternalConfigurationOneOf3Parser.g:167:1: ruleValue EOF
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
    // InternalConfigurationOneOf3Parser.g:174:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:178:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalConfigurationOneOf3Parser.g:179:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalConfigurationOneOf3Parser.g:179:2: ( ( rule__Value__Alternatives ) )
            // InternalConfigurationOneOf3Parser.g:180:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf3Parser.g:181:3: ( rule__Value__Alternatives )
            // InternalConfigurationOneOf3Parser.g:181:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleConfigurationOneOf3AdditionalProperties"
    // InternalConfigurationOneOf3Parser.g:190:1: entryRuleConfigurationOneOf3AdditionalProperties : ruleConfigurationOneOf3AdditionalProperties EOF ;
    public final void entryRuleConfigurationOneOf3AdditionalProperties() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:191:1: ( ruleConfigurationOneOf3AdditionalProperties EOF )
            // InternalConfigurationOneOf3Parser.g:192:1: ruleConfigurationOneOf3AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationOneOf3AdditionalProperties();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3AdditionalPropertiesRule()); 
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
    // $ANTLR end "entryRuleConfigurationOneOf3AdditionalProperties"


    // $ANTLR start "ruleConfigurationOneOf3AdditionalProperties"
    // InternalConfigurationOneOf3Parser.g:199:1: ruleConfigurationOneOf3AdditionalProperties : ( ( rule__ConfigurationOneOf3AdditionalProperties__Group__0 ) ) ;
    public final void ruleConfigurationOneOf3AdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:203:2: ( ( ( rule__ConfigurationOneOf3AdditionalProperties__Group__0 ) ) )
            // InternalConfigurationOneOf3Parser.g:204:2: ( ( rule__ConfigurationOneOf3AdditionalProperties__Group__0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:204:2: ( ( rule__ConfigurationOneOf3AdditionalProperties__Group__0 ) )
            // InternalConfigurationOneOf3Parser.g:205:3: ( rule__ConfigurationOneOf3AdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getGroup()); 
            }
            // InternalConfigurationOneOf3Parser.g:206:3: ( rule__ConfigurationOneOf3AdditionalProperties__Group__0 )
            // InternalConfigurationOneOf3Parser.g:206:4: rule__ConfigurationOneOf3AdditionalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3AdditionalProperties__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getGroup()); 
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
    // $ANTLR end "ruleConfigurationOneOf3AdditionalProperties"


    // $ANTLR start "entryRuleEString"
    // InternalConfigurationOneOf3Parser.g:215:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:216:1: ( ruleEString EOF )
            // InternalConfigurationOneOf3Parser.g:217:1: ruleEString EOF
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
    // InternalConfigurationOneOf3Parser.g:224:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:228:2: ( ( ruleVALID_STRING ) )
            // InternalConfigurationOneOf3Parser.g:229:2: ( ruleVALID_STRING )
            {
            // InternalConfigurationOneOf3Parser.g:229:2: ( ruleVALID_STRING )
            // InternalConfigurationOneOf3Parser.g:230:3: ruleVALID_STRING
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


    // $ANTLR start "entryRuleConfiguration"
    // InternalConfigurationOneOf3Parser.g:240:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:241:1: ( ruleConfiguration EOF )
            // InternalConfigurationOneOf3Parser.g:242:1: ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationRule()); 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalConfigurationOneOf3Parser.g:249:1: ruleConfiguration : ( ( rule__Configuration__ConfigurationAssignment ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:253:2: ( ( ( rule__Configuration__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:254:2: ( ( rule__Configuration__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:254:2: ( ( rule__Configuration__ConfigurationAssignment ) )
            // InternalConfigurationOneOf3Parser.g:255:3: ( rule__Configuration__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:256:3: ( rule__Configuration__ConfigurationAssignment )
            // InternalConfigurationOneOf3Parser.g:256:4: rule__Configuration__ConfigurationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Configuration__ConfigurationAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getConfigurationAssignment()); 
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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleConfigurationTypeString"
    // InternalConfigurationOneOf3Parser.g:265:1: entryRuleConfigurationTypeString : ruleConfigurationTypeString EOF ;
    public final void entryRuleConfigurationTypeString() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:266:1: ( ruleConfigurationTypeString EOF )
            // InternalConfigurationOneOf3Parser.g:267:1: ruleConfigurationTypeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationTypeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeStringRule()); 
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
    // $ANTLR end "entryRuleConfigurationTypeString"


    // $ANTLR start "ruleConfigurationTypeString"
    // InternalConfigurationOneOf3Parser.g:274:1: ruleConfigurationTypeString : ( ( rule__ConfigurationTypeString__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:278:2: ( ( ( rule__ConfigurationTypeString__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:279:2: ( ( rule__ConfigurationTypeString__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:279:2: ( ( rule__ConfigurationTypeString__ConfigurationAssignment ) )
            // InternalConfigurationOneOf3Parser.g:280:3: ( rule__ConfigurationTypeString__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeStringAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:281:3: ( rule__ConfigurationTypeString__ConfigurationAssignment )
            // InternalConfigurationOneOf3Parser.g:281:4: rule__ConfigurationTypeString__ConfigurationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeString__ConfigurationAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeStringAccess().getConfigurationAssignment()); 
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
    // $ANTLR end "ruleConfigurationTypeString"


    // $ANTLR start "entryRuleConfigurationTypeInteger"
    // InternalConfigurationOneOf3Parser.g:290:1: entryRuleConfigurationTypeInteger : ruleConfigurationTypeInteger EOF ;
    public final void entryRuleConfigurationTypeInteger() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:291:1: ( ruleConfigurationTypeInteger EOF )
            // InternalConfigurationOneOf3Parser.g:292:1: ruleConfigurationTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationTypeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeIntegerRule()); 
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
    // $ANTLR end "entryRuleConfigurationTypeInteger"


    // $ANTLR start "ruleConfigurationTypeInteger"
    // InternalConfigurationOneOf3Parser.g:299:1: ruleConfigurationTypeInteger : ( ( rule__ConfigurationTypeInteger__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:303:2: ( ( ( rule__ConfigurationTypeInteger__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:304:2: ( ( rule__ConfigurationTypeInteger__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:304:2: ( ( rule__ConfigurationTypeInteger__ConfigurationAssignment ) )
            // InternalConfigurationOneOf3Parser.g:305:3: ( rule__ConfigurationTypeInteger__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeIntegerAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:306:3: ( rule__ConfigurationTypeInteger__ConfigurationAssignment )
            // InternalConfigurationOneOf3Parser.g:306:4: rule__ConfigurationTypeInteger__ConfigurationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeInteger__ConfigurationAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeIntegerAccess().getConfigurationAssignment()); 
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
    // $ANTLR end "ruleConfigurationTypeInteger"


    // $ANTLR start "entryRuleConfigurationTypeNumber"
    // InternalConfigurationOneOf3Parser.g:315:1: entryRuleConfigurationTypeNumber : ruleConfigurationTypeNumber EOF ;
    public final void entryRuleConfigurationTypeNumber() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:316:1: ( ruleConfigurationTypeNumber EOF )
            // InternalConfigurationOneOf3Parser.g:317:1: ruleConfigurationTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationTypeNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeNumberRule()); 
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
    // $ANTLR end "entryRuleConfigurationTypeNumber"


    // $ANTLR start "ruleConfigurationTypeNumber"
    // InternalConfigurationOneOf3Parser.g:324:1: ruleConfigurationTypeNumber : ( ( rule__ConfigurationTypeNumber__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:328:2: ( ( ( rule__ConfigurationTypeNumber__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:329:2: ( ( rule__ConfigurationTypeNumber__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:329:2: ( ( rule__ConfigurationTypeNumber__ConfigurationAssignment ) )
            // InternalConfigurationOneOf3Parser.g:330:3: ( rule__ConfigurationTypeNumber__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeNumberAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:331:3: ( rule__ConfigurationTypeNumber__ConfigurationAssignment )
            // InternalConfigurationOneOf3Parser.g:331:4: rule__ConfigurationTypeNumber__ConfigurationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeNumber__ConfigurationAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeNumberAccess().getConfigurationAssignment()); 
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
    // $ANTLR end "ruleConfigurationTypeNumber"


    // $ANTLR start "entryRuleConfigurationTypeBoolean"
    // InternalConfigurationOneOf3Parser.g:340:1: entryRuleConfigurationTypeBoolean : ruleConfigurationTypeBoolean EOF ;
    public final void entryRuleConfigurationTypeBoolean() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:341:1: ( ruleConfigurationTypeBoolean EOF )
            // InternalConfigurationOneOf3Parser.g:342:1: ruleConfigurationTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationTypeBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeBooleanRule()); 
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
    // $ANTLR end "entryRuleConfigurationTypeBoolean"


    // $ANTLR start "ruleConfigurationTypeBoolean"
    // InternalConfigurationOneOf3Parser.g:349:1: ruleConfigurationTypeBoolean : ( ( rule__ConfigurationTypeBoolean__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:353:2: ( ( ( rule__ConfigurationTypeBoolean__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:354:2: ( ( rule__ConfigurationTypeBoolean__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:354:2: ( ( rule__ConfigurationTypeBoolean__ConfigurationAssignment ) )
            // InternalConfigurationOneOf3Parser.g:355:3: ( rule__ConfigurationTypeBoolean__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeBooleanAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:356:3: ( rule__ConfigurationTypeBoolean__ConfigurationAssignment )
            // InternalConfigurationOneOf3Parser.g:356:4: rule__ConfigurationTypeBoolean__ConfigurationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeBoolean__ConfigurationAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeBooleanAccess().getConfigurationAssignment()); 
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
    // $ANTLR end "ruleConfigurationTypeBoolean"


    // $ANTLR start "entryRuleConfigurationTypeObject"
    // InternalConfigurationOneOf3Parser.g:365:1: entryRuleConfigurationTypeObject : ruleConfigurationTypeObject EOF ;
    public final void entryRuleConfigurationTypeObject() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:366:1: ( ruleConfigurationTypeObject EOF )
            // InternalConfigurationOneOf3Parser.g:367:1: ruleConfigurationTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationTypeObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectRule()); 
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
    // $ANTLR end "entryRuleConfigurationTypeObject"


    // $ANTLR start "ruleConfigurationTypeObject"
    // InternalConfigurationOneOf3Parser.g:374:1: ruleConfigurationTypeObject : ( ( rule__ConfigurationTypeObject__Group__0 ) ) ;
    public final void ruleConfigurationTypeObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:378:2: ( ( ( rule__ConfigurationTypeObject__Group__0 ) ) )
            // InternalConfigurationOneOf3Parser.g:379:2: ( ( rule__ConfigurationTypeObject__Group__0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:379:2: ( ( rule__ConfigurationTypeObject__Group__0 ) )
            // InternalConfigurationOneOf3Parser.g:380:3: ( rule__ConfigurationTypeObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getGroup()); 
            }
            // InternalConfigurationOneOf3Parser.g:381:3: ( rule__ConfigurationTypeObject__Group__0 )
            // InternalConfigurationOneOf3Parser.g:381:4: rule__ConfigurationTypeObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getGroup()); 
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
    // $ANTLR end "ruleConfigurationTypeObject"


    // $ANTLR start "entryRuleConfigurationTypeArray"
    // InternalConfigurationOneOf3Parser.g:390:1: entryRuleConfigurationTypeArray : ruleConfigurationTypeArray EOF ;
    public final void entryRuleConfigurationTypeArray() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:391:1: ( ruleConfigurationTypeArray EOF )
            // InternalConfigurationOneOf3Parser.g:392:1: ruleConfigurationTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationTypeArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayRule()); 
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
    // $ANTLR end "entryRuleConfigurationTypeArray"


    // $ANTLR start "ruleConfigurationTypeArray"
    // InternalConfigurationOneOf3Parser.g:399:1: ruleConfigurationTypeArray : ( ( rule__ConfigurationTypeArray__Group__0 ) ) ;
    public final void ruleConfigurationTypeArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:403:2: ( ( ( rule__ConfigurationTypeArray__Group__0 ) ) )
            // InternalConfigurationOneOf3Parser.g:404:2: ( ( rule__ConfigurationTypeArray__Group__0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:404:2: ( ( rule__ConfigurationTypeArray__Group__0 ) )
            // InternalConfigurationOneOf3Parser.g:405:3: ( rule__ConfigurationTypeArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getGroup()); 
            }
            // InternalConfigurationOneOf3Parser.g:406:3: ( rule__ConfigurationTypeArray__Group__0 )
            // InternalConfigurationOneOf3Parser.g:406:4: rule__ConfigurationTypeArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getGroup()); 
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
    // $ANTLR end "ruleConfigurationTypeArray"


    // $ANTLR start "entryRuleConfigurationTypeNull"
    // InternalConfigurationOneOf3Parser.g:415:1: entryRuleConfigurationTypeNull : ruleConfigurationTypeNull EOF ;
    public final void entryRuleConfigurationTypeNull() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:416:1: ( ruleConfigurationTypeNull EOF )
            // InternalConfigurationOneOf3Parser.g:417:1: ruleConfigurationTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationTypeNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeNullRule()); 
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
    // $ANTLR end "entryRuleConfigurationTypeNull"


    // $ANTLR start "ruleConfigurationTypeNull"
    // InternalConfigurationOneOf3Parser.g:424:1: ruleConfigurationTypeNull : ( ( rule__ConfigurationTypeNull__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:428:2: ( ( ( rule__ConfigurationTypeNull__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:429:2: ( ( rule__ConfigurationTypeNull__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:429:2: ( ( rule__ConfigurationTypeNull__ConfigurationAssignment ) )
            // InternalConfigurationOneOf3Parser.g:430:3: ( rule__ConfigurationTypeNull__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeNullAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:431:3: ( rule__ConfigurationTypeNull__ConfigurationAssignment )
            // InternalConfigurationOneOf3Parser.g:431:4: rule__ConfigurationTypeNull__ConfigurationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeNull__ConfigurationAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeNullAccess().getConfigurationAssignment()); 
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
    // $ANTLR end "ruleConfigurationTypeNull"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalConfigurationOneOf3Parser.g:440:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:441:1: ( ruleEDoubleObject EOF )
            // InternalConfigurationOneOf3Parser.g:442:1: ruleEDoubleObject EOF
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
    // InternalConfigurationOneOf3Parser.g:449:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:453:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalConfigurationOneOf3Parser.g:454:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalConfigurationOneOf3Parser.g:454:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalConfigurationOneOf3Parser.g:455:3: ( rule__EDoubleObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf3Parser.g:456:3: ( rule__EDoubleObject__Alternatives )
            // InternalConfigurationOneOf3Parser.g:456:4: rule__EDoubleObject__Alternatives
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
    // InternalConfigurationOneOf3Parser.g:465:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:466:1: ( ruleEBooleanObject EOF )
            // InternalConfigurationOneOf3Parser.g:467:1: ruleEBooleanObject EOF
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
    // InternalConfigurationOneOf3Parser.g:474:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:478:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalConfigurationOneOf3Parser.g:479:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalConfigurationOneOf3Parser.g:479:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalConfigurationOneOf3Parser.g:480:3: ( rule__EBooleanObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf3Parser.g:481:3: ( rule__EBooleanObject__Alternatives )
            // InternalConfigurationOneOf3Parser.g:481:4: rule__EBooleanObject__Alternatives
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


    // $ANTLR start "entryRuleConfigurationAdditionalProperties"
    // InternalConfigurationOneOf3Parser.g:490:1: entryRuleConfigurationAdditionalProperties : ruleConfigurationAdditionalProperties EOF ;
    public final void entryRuleConfigurationAdditionalProperties() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:491:1: ( ruleConfigurationAdditionalProperties EOF )
            // InternalConfigurationOneOf3Parser.g:492:1: ruleConfigurationAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationAdditionalProperties();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAdditionalPropertiesRule()); 
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
    // $ANTLR end "entryRuleConfigurationAdditionalProperties"


    // $ANTLR start "ruleConfigurationAdditionalProperties"
    // InternalConfigurationOneOf3Parser.g:499:1: ruleConfigurationAdditionalProperties : ( ( rule__ConfigurationAdditionalProperties__Group__0 ) ) ;
    public final void ruleConfigurationAdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:503:2: ( ( ( rule__ConfigurationAdditionalProperties__Group__0 ) ) )
            // InternalConfigurationOneOf3Parser.g:504:2: ( ( rule__ConfigurationAdditionalProperties__Group__0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:504:2: ( ( rule__ConfigurationAdditionalProperties__Group__0 ) )
            // InternalConfigurationOneOf3Parser.g:505:3: ( rule__ConfigurationAdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesAccess().getGroup()); 
            }
            // InternalConfigurationOneOf3Parser.g:506:3: ( rule__ConfigurationAdditionalProperties__Group__0 )
            // InternalConfigurationOneOf3Parser.g:506:4: rule__ConfigurationAdditionalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationAdditionalProperties__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAdditionalPropertiesAccess().getGroup()); 
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
    // $ANTLR end "ruleConfigurationAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalConfigurationOneOf3Parser.g:515:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:516:1: ( ruleJsonDocument EOF )
            // InternalConfigurationOneOf3Parser.g:517:1: ruleJsonDocument EOF
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
    // InternalConfigurationOneOf3Parser.g:524:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:528:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:529:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:529:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalConfigurationOneOf3Parser.g:530:3: ( rule__JsonDocument__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:531:3: ( rule__JsonDocument__ValueAssignment )
            // InternalConfigurationOneOf3Parser.g:531:4: rule__JsonDocument__ValueAssignment
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
    // InternalConfigurationOneOf3Parser.g:540:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:541:1: ( ruleStringValue EOF )
            // InternalConfigurationOneOf3Parser.g:542:1: ruleStringValue EOF
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
    // InternalConfigurationOneOf3Parser.g:549:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:553:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:554:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:554:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalConfigurationOneOf3Parser.g:555:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:556:3: ( rule__StringValue__ValueAssignment )
            // InternalConfigurationOneOf3Parser.g:556:4: rule__StringValue__ValueAssignment
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
    // InternalConfigurationOneOf3Parser.g:565:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:566:1: ( ruleArrayValue EOF )
            // InternalConfigurationOneOf3Parser.g:567:1: ruleArrayValue EOF
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
    // InternalConfigurationOneOf3Parser.g:574:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:578:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalConfigurationOneOf3Parser.g:579:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:579:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalConfigurationOneOf3Parser.g:580:3: ( rule__ArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup()); 
            }
            // InternalConfigurationOneOf3Parser.g:581:3: ( rule__ArrayValue__Group__0 )
            // InternalConfigurationOneOf3Parser.g:581:4: rule__ArrayValue__Group__0
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
    // InternalConfigurationOneOf3Parser.g:590:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:591:1: ( ruleNullValue EOF )
            // InternalConfigurationOneOf3Parser.g:592:1: ruleNullValue EOF
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
    // InternalConfigurationOneOf3Parser.g:599:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:603:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:604:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:604:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalConfigurationOneOf3Parser.g:605:3: ( rule__NullValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:606:3: ( rule__NullValue__ValueAssignment )
            // InternalConfigurationOneOf3Parser.g:606:4: rule__NullValue__ValueAssignment
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
    // InternalConfigurationOneOf3Parser.g:615:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:616:1: ( ruleNumberValue EOF )
            // InternalConfigurationOneOf3Parser.g:617:1: ruleNumberValue EOF
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
    // InternalConfigurationOneOf3Parser.g:624:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:628:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:629:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:629:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalConfigurationOneOf3Parser.g:630:3: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:631:3: ( rule__NumberValue__ValueAssignment )
            // InternalConfigurationOneOf3Parser.g:631:4: rule__NumberValue__ValueAssignment
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
    // InternalConfigurationOneOf3Parser.g:640:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:641:1: ( ruleObjectValue EOF )
            // InternalConfigurationOneOf3Parser.g:642:1: ruleObjectValue EOF
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
    // InternalConfigurationOneOf3Parser.g:649:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:653:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalConfigurationOneOf3Parser.g:654:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:654:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalConfigurationOneOf3Parser.g:655:3: ( rule__ObjectValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup()); 
            }
            // InternalConfigurationOneOf3Parser.g:656:3: ( rule__ObjectValue__Group__0 )
            // InternalConfigurationOneOf3Parser.g:656:4: rule__ObjectValue__Group__0
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
    // InternalConfigurationOneOf3Parser.g:665:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:666:1: ( ruleBooleanValue EOF )
            // InternalConfigurationOneOf3Parser.g:667:1: ruleBooleanValue EOF
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
    // InternalConfigurationOneOf3Parser.g:674:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:678:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:679:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:679:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalConfigurationOneOf3Parser.g:680:3: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:681:3: ( rule__BooleanValue__ValueAssignment )
            // InternalConfigurationOneOf3Parser.g:681:4: rule__BooleanValue__ValueAssignment
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
    // InternalConfigurationOneOf3Parser.g:690:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:691:1: ( ruleEDouble EOF )
            // InternalConfigurationOneOf3Parser.g:692:1: ruleEDouble EOF
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
    // InternalConfigurationOneOf3Parser.g:699:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:703:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalConfigurationOneOf3Parser.g:704:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalConfigurationOneOf3Parser.g:704:2: ( ( rule__EDouble__Alternatives ) )
            // InternalConfigurationOneOf3Parser.g:705:3: ( rule__EDouble__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf3Parser.g:706:3: ( rule__EDouble__Alternatives )
            // InternalConfigurationOneOf3Parser.g:706:4: rule__EDouble__Alternatives
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
    // InternalConfigurationOneOf3Parser.g:715:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:716:1: ( ruleKeyValuePair EOF )
            // InternalConfigurationOneOf3Parser.g:717:1: ruleKeyValuePair EOF
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
    // InternalConfigurationOneOf3Parser.g:724:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:728:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalConfigurationOneOf3Parser.g:729:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:729:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalConfigurationOneOf3Parser.g:730:3: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // InternalConfigurationOneOf3Parser.g:731:3: ( rule__KeyValuePair__Group__0 )
            // InternalConfigurationOneOf3Parser.g:731:4: rule__KeyValuePair__Group__0
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
    // InternalConfigurationOneOf3Parser.g:740:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:741:1: ( ruleEBoolean EOF )
            // InternalConfigurationOneOf3Parser.g:742:1: ruleEBoolean EOF
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
    // InternalConfigurationOneOf3Parser.g:749:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:753:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalConfigurationOneOf3Parser.g:754:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalConfigurationOneOf3Parser.g:754:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalConfigurationOneOf3Parser.g:755:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf3Parser.g:756:3: ( rule__EBoolean__Alternatives )
            // InternalConfigurationOneOf3Parser.g:756:4: rule__EBoolean__Alternatives
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


    // $ANTLR start "entryRuleConfigurationItems"
    // InternalConfigurationOneOf3Parser.g:765:1: entryRuleConfigurationItems : ruleConfigurationItems EOF ;
    public final void entryRuleConfigurationItems() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:766:1: ( ruleConfigurationItems EOF )
            // InternalConfigurationOneOf3Parser.g:767:1: ruleConfigurationItems EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationItemsRule()); 
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
    // $ANTLR end "entryRuleConfigurationItems"


    // $ANTLR start "ruleConfigurationItems"
    // InternalConfigurationOneOf3Parser.g:774:1: ruleConfigurationItems : ( ( rule__ConfigurationItems__ItemsAssignment ) ) ;
    public final void ruleConfigurationItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:778:2: ( ( ( rule__ConfigurationItems__ItemsAssignment ) ) )
            // InternalConfigurationOneOf3Parser.g:779:2: ( ( rule__ConfigurationItems__ItemsAssignment ) )
            {
            // InternalConfigurationOneOf3Parser.g:779:2: ( ( rule__ConfigurationItems__ItemsAssignment ) )
            // InternalConfigurationOneOf3Parser.g:780:3: ( rule__ConfigurationItems__ItemsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationItemsAccess().getItemsAssignment()); 
            }
            // InternalConfigurationOneOf3Parser.g:781:3: ( rule__ConfigurationItems__ItemsAssignment )
            // InternalConfigurationOneOf3Parser.g:781:4: rule__ConfigurationItems__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationItems__ItemsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationItemsAccess().getItemsAssignment()); 
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
    // $ANTLR end "ruleConfigurationItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalConfigurationOneOf3Parser.g:790:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalConfigurationOneOf3Parser.g:791:1: ( ruleVALID_STRING EOF )
            // InternalConfigurationOneOf3Parser.g:792:1: ruleVALID_STRING EOF
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
    // InternalConfigurationOneOf3Parser.g:799:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:803:2: ( ( RULE_STRING ) )
            // InternalConfigurationOneOf3Parser.g:804:2: ( RULE_STRING )
            {
            // InternalConfigurationOneOf3Parser.g:804:2: ( RULE_STRING )
            // InternalConfigurationOneOf3Parser.g:805:3: RULE_STRING
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
    // InternalConfigurationOneOf3Parser.g:815:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:819:1: ( ( ( Null ) ) )
            // InternalConfigurationOneOf3Parser.g:820:2: ( ( Null ) )
            {
            // InternalConfigurationOneOf3Parser.g:820:2: ( ( Null ) )
            // InternalConfigurationOneOf3Parser.g:821:3: ( Null )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            }
            // InternalConfigurationOneOf3Parser.g:822:3: ( Null )
            // InternalConfigurationOneOf3Parser.g:822:4: Null
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


    // $ANTLR start "rule__ConfigurationAbstract__Alternatives"
    // InternalConfigurationOneOf3Parser.g:830:1: rule__ConfigurationAbstract__Alternatives : ( ( ( ruleConfigurationTypeNumber ) ) | ( ruleConfigurationTypeString ) | ( ruleConfigurationTypeInteger ) | ( ruleConfigurationTypeBoolean ) | ( ruleConfigurationTypeObject ) | ( ruleConfigurationTypeArray ) | ( ruleConfigurationTypeNull ) );
    public final void rule__ConfigurationAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:834:1: ( ( ( ruleConfigurationTypeNumber ) ) | ( ruleConfigurationTypeString ) | ( ruleConfigurationTypeInteger ) | ( ruleConfigurationTypeBoolean ) | ( ruleConfigurationTypeObject ) | ( ruleConfigurationTypeArray ) | ( ruleConfigurationTypeNull ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:835:2: ( ( ruleConfigurationTypeNumber ) )
                    {
                    // InternalConfigurationOneOf3Parser.g:835:2: ( ( ruleConfigurationTypeNumber ) )
                    // InternalConfigurationOneOf3Parser.g:836:3: ( ruleConfigurationTypeNumber )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNumberParserRuleCall_0()); 
                    }
                    // InternalConfigurationOneOf3Parser.g:837:3: ( ruleConfigurationTypeNumber )
                    // InternalConfigurationOneOf3Parser.g:837:4: ruleConfigurationTypeNumber
                    {
                    pushFollow(FOLLOW_2);
                    ruleConfigurationTypeNumber();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNumberParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalConfigurationOneOf3Parser.g:841:2: ( ruleConfigurationTypeString )
                    {
                    // InternalConfigurationOneOf3Parser.g:841:2: ( ruleConfigurationTypeString )
                    // InternalConfigurationOneOf3Parser.g:842:3: ruleConfigurationTypeString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeStringParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConfigurationTypeString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeStringParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalConfigurationOneOf3Parser.g:847:2: ( ruleConfigurationTypeInteger )
                    {
                    // InternalConfigurationOneOf3Parser.g:847:2: ( ruleConfigurationTypeInteger )
                    // InternalConfigurationOneOf3Parser.g:848:3: ruleConfigurationTypeInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeIntegerParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConfigurationTypeInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeIntegerParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalConfigurationOneOf3Parser.g:853:2: ( ruleConfigurationTypeBoolean )
                    {
                    // InternalConfigurationOneOf3Parser.g:853:2: ( ruleConfigurationTypeBoolean )
                    // InternalConfigurationOneOf3Parser.g:854:3: ruleConfigurationTypeBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeBooleanParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConfigurationTypeBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeBooleanParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalConfigurationOneOf3Parser.g:859:2: ( ruleConfigurationTypeObject )
                    {
                    // InternalConfigurationOneOf3Parser.g:859:2: ( ruleConfigurationTypeObject )
                    // InternalConfigurationOneOf3Parser.g:860:3: ruleConfigurationTypeObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeObjectParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConfigurationTypeObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeObjectParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalConfigurationOneOf3Parser.g:865:2: ( ruleConfigurationTypeArray )
                    {
                    // InternalConfigurationOneOf3Parser.g:865:2: ( ruleConfigurationTypeArray )
                    // InternalConfigurationOneOf3Parser.g:866:3: ruleConfigurationTypeArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeArrayParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConfigurationTypeArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeArrayParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalConfigurationOneOf3Parser.g:871:2: ( ruleConfigurationTypeNull )
                    {
                    // InternalConfigurationOneOf3Parser.g:871:2: ( ruleConfigurationTypeNull )
                    // InternalConfigurationOneOf3Parser.g:872:3: ruleConfigurationTypeNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNullParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConfigurationTypeNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNullParserRuleCall_6()); 
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
    // $ANTLR end "rule__ConfigurationAbstract__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalConfigurationOneOf3Parser.g:881:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:885:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
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
                    // InternalConfigurationOneOf3Parser.g:886:2: ( ruleStringValue )
                    {
                    // InternalConfigurationOneOf3Parser.g:886:2: ( ruleStringValue )
                    // InternalConfigurationOneOf3Parser.g:887:3: ruleStringValue
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
                    // InternalConfigurationOneOf3Parser.g:892:2: ( ruleArrayValue )
                    {
                    // InternalConfigurationOneOf3Parser.g:892:2: ( ruleArrayValue )
                    // InternalConfigurationOneOf3Parser.g:893:3: ruleArrayValue
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
                    // InternalConfigurationOneOf3Parser.g:898:2: ( ruleNullValue )
                    {
                    // InternalConfigurationOneOf3Parser.g:898:2: ( ruleNullValue )
                    // InternalConfigurationOneOf3Parser.g:899:3: ruleNullValue
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
                    // InternalConfigurationOneOf3Parser.g:904:2: ( ruleNumberValue )
                    {
                    // InternalConfigurationOneOf3Parser.g:904:2: ( ruleNumberValue )
                    // InternalConfigurationOneOf3Parser.g:905:3: ruleNumberValue
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
                    // InternalConfigurationOneOf3Parser.g:910:2: ( ruleObjectValue )
                    {
                    // InternalConfigurationOneOf3Parser.g:910:2: ( ruleObjectValue )
                    // InternalConfigurationOneOf3Parser.g:911:3: ruleObjectValue
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
                    // InternalConfigurationOneOf3Parser.g:916:2: ( ruleBooleanValue )
                    {
                    // InternalConfigurationOneOf3Parser.g:916:2: ( ruleBooleanValue )
                    // InternalConfigurationOneOf3Parser.g:917:3: ruleBooleanValue
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
    // InternalConfigurationOneOf3Parser.g:926:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:930:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalConfigurationOneOf3Parser.g:931:2: ( RULE_E_INT )
                    {
                    // InternalConfigurationOneOf3Parser.g:931:2: ( RULE_E_INT )
                    // InternalConfigurationOneOf3Parser.g:932:3: RULE_E_INT
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
                    // InternalConfigurationOneOf3Parser.g:937:2: ( RULE_E_DOUBLE )
                    {
                    // InternalConfigurationOneOf3Parser.g:937:2: ( RULE_E_DOUBLE )
                    // InternalConfigurationOneOf3Parser.g:938:3: RULE_E_DOUBLE
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
    // InternalConfigurationOneOf3Parser.g:947:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:951:1: ( ( True ) | ( False ) )
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
                    // InternalConfigurationOneOf3Parser.g:952:2: ( True )
                    {
                    // InternalConfigurationOneOf3Parser.g:952:2: ( True )
                    // InternalConfigurationOneOf3Parser.g:953:3: True
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
                    // InternalConfigurationOneOf3Parser.g:958:2: ( False )
                    {
                    // InternalConfigurationOneOf3Parser.g:958:2: ( False )
                    // InternalConfigurationOneOf3Parser.g:959:3: False
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
    // InternalConfigurationOneOf3Parser.g:968:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:972:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalConfigurationOneOf3Parser.g:973:2: ( RULE_E_INT )
                    {
                    // InternalConfigurationOneOf3Parser.g:973:2: ( RULE_E_INT )
                    // InternalConfigurationOneOf3Parser.g:974:3: RULE_E_INT
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
                    // InternalConfigurationOneOf3Parser.g:979:2: ( RULE_E_DOUBLE )
                    {
                    // InternalConfigurationOneOf3Parser.g:979:2: ( RULE_E_DOUBLE )
                    // InternalConfigurationOneOf3Parser.g:980:3: RULE_E_DOUBLE
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
    // InternalConfigurationOneOf3Parser.g:989:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:993:1: ( ( True ) | ( False ) )
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
                    // InternalConfigurationOneOf3Parser.g:994:2: ( True )
                    {
                    // InternalConfigurationOneOf3Parser.g:994:2: ( True )
                    // InternalConfigurationOneOf3Parser.g:995:3: True
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
                    // InternalConfigurationOneOf3Parser.g:1000:2: ( False )
                    {
                    // InternalConfigurationOneOf3Parser.g:1000:2: ( False )
                    // InternalConfigurationOneOf3Parser.g:1001:3: False
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


    // $ANTLR start "rule__ConfigurationOneOf3__Group__0"
    // InternalConfigurationOneOf3Parser.g:1010:1: rule__ConfigurationOneOf3__Group__0 : rule__ConfigurationOneOf3__Group__0__Impl rule__ConfigurationOneOf3__Group__1 ;
    public final void rule__ConfigurationOneOf3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1014:1: ( rule__ConfigurationOneOf3__Group__0__Impl rule__ConfigurationOneOf3__Group__1 )
            // InternalConfigurationOneOf3Parser.g:1015:2: rule__ConfigurationOneOf3__Group__0__Impl rule__ConfigurationOneOf3__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConfigurationOneOf3__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__Group__1();

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
    // $ANTLR end "rule__ConfigurationOneOf3__Group__0"


    // $ANTLR start "rule__ConfigurationOneOf3__Group__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1022:1: rule__ConfigurationOneOf3__Group__0__Impl : ( () ) ;
    public final void rule__ConfigurationOneOf3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1026:1: ( ( () ) )
            // InternalConfigurationOneOf3Parser.g:1027:1: ( () )
            {
            // InternalConfigurationOneOf3Parser.g:1027:1: ( () )
            // InternalConfigurationOneOf3Parser.g:1028:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getConfigurationOneOf3Action_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1029:2: ()
            // InternalConfigurationOneOf3Parser.g:1029:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getConfigurationOneOf3Action_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf3__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3__Group__1"
    // InternalConfigurationOneOf3Parser.g:1037:1: rule__ConfigurationOneOf3__Group__1 : rule__ConfigurationOneOf3__Group__1__Impl rule__ConfigurationOneOf3__Group__2 ;
    public final void rule__ConfigurationOneOf3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1041:1: ( rule__ConfigurationOneOf3__Group__1__Impl rule__ConfigurationOneOf3__Group__2 )
            // InternalConfigurationOneOf3Parser.g:1042:2: rule__ConfigurationOneOf3__Group__1__Impl rule__ConfigurationOneOf3__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConfigurationOneOf3__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__Group__2();

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
    // $ANTLR end "rule__ConfigurationOneOf3__Group__1"


    // $ANTLR start "rule__ConfigurationOneOf3__Group__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1049:1: rule__ConfigurationOneOf3__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ConfigurationOneOf3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1053:1: ( ( LeftCurlyBracket ) )
            // InternalConfigurationOneOf3Parser.g:1054:1: ( LeftCurlyBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1054:1: ( LeftCurlyBracket )
            // InternalConfigurationOneOf3Parser.g:1055:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3__Group__2"
    // InternalConfigurationOneOf3Parser.g:1064:1: rule__ConfigurationOneOf3__Group__2 : rule__ConfigurationOneOf3__Group__2__Impl rule__ConfigurationOneOf3__Group__3 ;
    public final void rule__ConfigurationOneOf3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1068:1: ( rule__ConfigurationOneOf3__Group__2__Impl rule__ConfigurationOneOf3__Group__3 )
            // InternalConfigurationOneOf3Parser.g:1069:2: rule__ConfigurationOneOf3__Group__2__Impl rule__ConfigurationOneOf3__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ConfigurationOneOf3__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__Group__3();

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
    // $ANTLR end "rule__ConfigurationOneOf3__Group__2"


    // $ANTLR start "rule__ConfigurationOneOf3__Group__2__Impl"
    // InternalConfigurationOneOf3Parser.g:1076:1: rule__ConfigurationOneOf3__Group__2__Impl : ( ( rule__ConfigurationOneOf3__Group_2__0 )? ) ;
    public final void rule__ConfigurationOneOf3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1080:1: ( ( ( rule__ConfigurationOneOf3__Group_2__0 )? ) )
            // InternalConfigurationOneOf3Parser.g:1081:1: ( ( rule__ConfigurationOneOf3__Group_2__0 )? )
            {
            // InternalConfigurationOneOf3Parser.g:1081:1: ( ( rule__ConfigurationOneOf3__Group_2__0 )? )
            // InternalConfigurationOneOf3Parser.g:1082:2: ( rule__ConfigurationOneOf3__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getGroup_2()); 
            }
            // InternalConfigurationOneOf3Parser.g:1083:2: ( rule__ConfigurationOneOf3__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:1083:3: rule__ConfigurationOneOf3__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigurationOneOf3__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getGroup_2()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3__Group__3"
    // InternalConfigurationOneOf3Parser.g:1091:1: rule__ConfigurationOneOf3__Group__3 : rule__ConfigurationOneOf3__Group__3__Impl ;
    public final void rule__ConfigurationOneOf3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1095:1: ( rule__ConfigurationOneOf3__Group__3__Impl )
            // InternalConfigurationOneOf3Parser.g:1096:2: rule__ConfigurationOneOf3__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__Group__3__Impl();

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
    // $ANTLR end "rule__ConfigurationOneOf3__Group__3"


    // $ANTLR start "rule__ConfigurationOneOf3__Group__3__Impl"
    // InternalConfigurationOneOf3Parser.g:1102:1: rule__ConfigurationOneOf3__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ConfigurationOneOf3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1106:1: ( ( RightCurlyBracket ) )
            // InternalConfigurationOneOf3Parser.g:1107:1: ( RightCurlyBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1107:1: ( RightCurlyBracket )
            // InternalConfigurationOneOf3Parser.g:1108:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3__Group__3__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3__Group_2__0"
    // InternalConfigurationOneOf3Parser.g:1118:1: rule__ConfigurationOneOf3__Group_2__0 : rule__ConfigurationOneOf3__Group_2__0__Impl rule__ConfigurationOneOf3__Group_2__1 ;
    public final void rule__ConfigurationOneOf3__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1122:1: ( rule__ConfigurationOneOf3__Group_2__0__Impl rule__ConfigurationOneOf3__Group_2__1 )
            // InternalConfigurationOneOf3Parser.g:1123:2: rule__ConfigurationOneOf3__Group_2__0__Impl rule__ConfigurationOneOf3__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ConfigurationOneOf3__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__Group_2__1();

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
    // $ANTLR end "rule__ConfigurationOneOf3__Group_2__0"


    // $ANTLR start "rule__ConfigurationOneOf3__Group_2__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1130:1: rule__ConfigurationOneOf3__Group_2__0__Impl : ( ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_0 ) ) ;
    public final void rule__ConfigurationOneOf3__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1134:1: ( ( ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_0 ) ) )
            // InternalConfigurationOneOf3Parser.g:1135:1: ( ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1135:1: ( ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_0 ) )
            // InternalConfigurationOneOf3Parser.g:1136:2: ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getConfigurationAssignment_2_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1137:2: ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_0 )
            // InternalConfigurationOneOf3Parser.g:1137:3: rule__ConfigurationOneOf3__ConfigurationAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__ConfigurationAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getConfigurationAssignment_2_0()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3__Group_2__0__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3__Group_2__1"
    // InternalConfigurationOneOf3Parser.g:1145:1: rule__ConfigurationOneOf3__Group_2__1 : rule__ConfigurationOneOf3__Group_2__1__Impl ;
    public final void rule__ConfigurationOneOf3__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1149:1: ( rule__ConfigurationOneOf3__Group_2__1__Impl )
            // InternalConfigurationOneOf3Parser.g:1150:2: rule__ConfigurationOneOf3__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__Group_2__1__Impl();

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
    // $ANTLR end "rule__ConfigurationOneOf3__Group_2__1"


    // $ANTLR start "rule__ConfigurationOneOf3__Group_2__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1156:1: rule__ConfigurationOneOf3__Group_2__1__Impl : ( ( rule__ConfigurationOneOf3__Group_2_1__0 )* ) ;
    public final void rule__ConfigurationOneOf3__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1160:1: ( ( ( rule__ConfigurationOneOf3__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf3Parser.g:1161:1: ( ( rule__ConfigurationOneOf3__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf3Parser.g:1161:1: ( ( rule__ConfigurationOneOf3__Group_2_1__0 )* )
            // InternalConfigurationOneOf3Parser.g:1162:2: ( rule__ConfigurationOneOf3__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:1163:2: ( rule__ConfigurationOneOf3__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalConfigurationOneOf3Parser.g:1163:3: rule__ConfigurationOneOf3__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ConfigurationOneOf3__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getGroup_2_1()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3__Group_2__1__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3__Group_2_1__0"
    // InternalConfigurationOneOf3Parser.g:1172:1: rule__ConfigurationOneOf3__Group_2_1__0 : rule__ConfigurationOneOf3__Group_2_1__0__Impl rule__ConfigurationOneOf3__Group_2_1__1 ;
    public final void rule__ConfigurationOneOf3__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1176:1: ( rule__ConfigurationOneOf3__Group_2_1__0__Impl rule__ConfigurationOneOf3__Group_2_1__1 )
            // InternalConfigurationOneOf3Parser.g:1177:2: rule__ConfigurationOneOf3__Group_2_1__0__Impl rule__ConfigurationOneOf3__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ConfigurationOneOf3__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__Group_2_1__1();

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
    // $ANTLR end "rule__ConfigurationOneOf3__Group_2_1__0"


    // $ANTLR start "rule__ConfigurationOneOf3__Group_2_1__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1184:1: rule__ConfigurationOneOf3__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ConfigurationOneOf3__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1188:1: ( ( Comma ) )
            // InternalConfigurationOneOf3Parser.g:1189:1: ( Comma )
            {
            // InternalConfigurationOneOf3Parser.g:1189:1: ( Comma )
            // InternalConfigurationOneOf3Parser.g:1190:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3__Group_2_1__0__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3__Group_2_1__1"
    // InternalConfigurationOneOf3Parser.g:1199:1: rule__ConfigurationOneOf3__Group_2_1__1 : rule__ConfigurationOneOf3__Group_2_1__1__Impl ;
    public final void rule__ConfigurationOneOf3__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1203:1: ( rule__ConfigurationOneOf3__Group_2_1__1__Impl )
            // InternalConfigurationOneOf3Parser.g:1204:2: rule__ConfigurationOneOf3__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ConfigurationOneOf3__Group_2_1__1"


    // $ANTLR start "rule__ConfigurationOneOf3__Group_2_1__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1210:1: rule__ConfigurationOneOf3__Group_2_1__1__Impl : ( ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1 ) ) ;
    public final void rule__ConfigurationOneOf3__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1214:1: ( ( ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf3Parser.g:1215:1: ( ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1215:1: ( ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1 ) )
            // InternalConfigurationOneOf3Parser.g:1216:2: ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getConfigurationAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:1217:2: ( rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1 )
            // InternalConfigurationOneOf3Parser.g:1217:3: rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getConfigurationAssignment_2_1_1()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3__Group_2_1__1__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3AdditionalProperties__Group__0"
    // InternalConfigurationOneOf3Parser.g:1226:1: rule__ConfigurationOneOf3AdditionalProperties__Group__0 : rule__ConfigurationOneOf3AdditionalProperties__Group__0__Impl rule__ConfigurationOneOf3AdditionalProperties__Group__1 ;
    public final void rule__ConfigurationOneOf3AdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1230:1: ( rule__ConfigurationOneOf3AdditionalProperties__Group__0__Impl rule__ConfigurationOneOf3AdditionalProperties__Group__1 )
            // InternalConfigurationOneOf3Parser.g:1231:2: rule__ConfigurationOneOf3AdditionalProperties__Group__0__Impl rule__ConfigurationOneOf3AdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConfigurationOneOf3AdditionalProperties__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3AdditionalProperties__Group__1();

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
    // $ANTLR end "rule__ConfigurationOneOf3AdditionalProperties__Group__0"


    // $ANTLR start "rule__ConfigurationOneOf3AdditionalProperties__Group__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1238:1: rule__ConfigurationOneOf3AdditionalProperties__Group__0__Impl : ( ( rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__ConfigurationOneOf3AdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1242:1: ( ( ( rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0 ) ) )
            // InternalConfigurationOneOf3Parser.g:1243:1: ( ( rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1243:1: ( ( rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0 ) )
            // InternalConfigurationOneOf3Parser.g:1244:2: ( rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1245:2: ( rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0 )
            // InternalConfigurationOneOf3Parser.g:1245:3: rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getKeyAssignment_0()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3AdditionalProperties__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3AdditionalProperties__Group__1"
    // InternalConfigurationOneOf3Parser.g:1253:1: rule__ConfigurationOneOf3AdditionalProperties__Group__1 : rule__ConfigurationOneOf3AdditionalProperties__Group__1__Impl rule__ConfigurationOneOf3AdditionalProperties__Group__2 ;
    public final void rule__ConfigurationOneOf3AdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1257:1: ( rule__ConfigurationOneOf3AdditionalProperties__Group__1__Impl rule__ConfigurationOneOf3AdditionalProperties__Group__2 )
            // InternalConfigurationOneOf3Parser.g:1258:2: rule__ConfigurationOneOf3AdditionalProperties__Group__1__Impl rule__ConfigurationOneOf3AdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ConfigurationOneOf3AdditionalProperties__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3AdditionalProperties__Group__2();

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
    // $ANTLR end "rule__ConfigurationOneOf3AdditionalProperties__Group__1"


    // $ANTLR start "rule__ConfigurationOneOf3AdditionalProperties__Group__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1265:1: rule__ConfigurationOneOf3AdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__ConfigurationOneOf3AdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1269:1: ( ( Colon ) )
            // InternalConfigurationOneOf3Parser.g:1270:1: ( Colon )
            {
            // InternalConfigurationOneOf3Parser.g:1270:1: ( Colon )
            // InternalConfigurationOneOf3Parser.g:1271:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3AdditionalProperties__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationOneOf3AdditionalProperties__Group__2"
    // InternalConfigurationOneOf3Parser.g:1280:1: rule__ConfigurationOneOf3AdditionalProperties__Group__2 : rule__ConfigurationOneOf3AdditionalProperties__Group__2__Impl ;
    public final void rule__ConfigurationOneOf3AdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1284:1: ( rule__ConfigurationOneOf3AdditionalProperties__Group__2__Impl )
            // InternalConfigurationOneOf3Parser.g:1285:2: rule__ConfigurationOneOf3AdditionalProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3AdditionalProperties__Group__2__Impl();

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
    // $ANTLR end "rule__ConfigurationOneOf3AdditionalProperties__Group__2"


    // $ANTLR start "rule__ConfigurationOneOf3AdditionalProperties__Group__2__Impl"
    // InternalConfigurationOneOf3Parser.g:1291:1: rule__ConfigurationOneOf3AdditionalProperties__Group__2__Impl : ( ( rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__ConfigurationOneOf3AdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1295:1: ( ( ( rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalConfigurationOneOf3Parser.g:1296:1: ( ( rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1296:1: ( ( rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalConfigurationOneOf3Parser.g:1297:2: ( rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalConfigurationOneOf3Parser.g:1298:2: ( rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalConfigurationOneOf3Parser.g:1298:3: rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3AdditionalProperties__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationTypeObject__Group__0"
    // InternalConfigurationOneOf3Parser.g:1307:1: rule__ConfigurationTypeObject__Group__0 : rule__ConfigurationTypeObject__Group__0__Impl rule__ConfigurationTypeObject__Group__1 ;
    public final void rule__ConfigurationTypeObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1311:1: ( rule__ConfigurationTypeObject__Group__0__Impl rule__ConfigurationTypeObject__Group__1 )
            // InternalConfigurationOneOf3Parser.g:1312:2: rule__ConfigurationTypeObject__Group__0__Impl rule__ConfigurationTypeObject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConfigurationTypeObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__Group__1();

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
    // $ANTLR end "rule__ConfigurationTypeObject__Group__0"


    // $ANTLR start "rule__ConfigurationTypeObject__Group__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1319:1: rule__ConfigurationTypeObject__Group__0__Impl : ( () ) ;
    public final void rule__ConfigurationTypeObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1323:1: ( ( () ) )
            // InternalConfigurationOneOf3Parser.g:1324:1: ( () )
            {
            // InternalConfigurationOneOf3Parser.g:1324:1: ( () )
            // InternalConfigurationOneOf3Parser.g:1325:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationTypeObjectAction_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1326:2: ()
            // InternalConfigurationOneOf3Parser.g:1326:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationTypeObjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationTypeObject__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationTypeObject__Group__1"
    // InternalConfigurationOneOf3Parser.g:1334:1: rule__ConfigurationTypeObject__Group__1 : rule__ConfigurationTypeObject__Group__1__Impl rule__ConfigurationTypeObject__Group__2 ;
    public final void rule__ConfigurationTypeObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1338:1: ( rule__ConfigurationTypeObject__Group__1__Impl rule__ConfigurationTypeObject__Group__2 )
            // InternalConfigurationOneOf3Parser.g:1339:2: rule__ConfigurationTypeObject__Group__1__Impl rule__ConfigurationTypeObject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConfigurationTypeObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__Group__2();

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
    // $ANTLR end "rule__ConfigurationTypeObject__Group__1"


    // $ANTLR start "rule__ConfigurationTypeObject__Group__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1346:1: rule__ConfigurationTypeObject__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ConfigurationTypeObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1350:1: ( ( LeftCurlyBracket ) )
            // InternalConfigurationOneOf3Parser.g:1351:1: ( LeftCurlyBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1351:1: ( LeftCurlyBracket )
            // InternalConfigurationOneOf3Parser.g:1352:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__ConfigurationTypeObject__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationTypeObject__Group__2"
    // InternalConfigurationOneOf3Parser.g:1361:1: rule__ConfigurationTypeObject__Group__2 : rule__ConfigurationTypeObject__Group__2__Impl rule__ConfigurationTypeObject__Group__3 ;
    public final void rule__ConfigurationTypeObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1365:1: ( rule__ConfigurationTypeObject__Group__2__Impl rule__ConfigurationTypeObject__Group__3 )
            // InternalConfigurationOneOf3Parser.g:1366:2: rule__ConfigurationTypeObject__Group__2__Impl rule__ConfigurationTypeObject__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ConfigurationTypeObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__Group__3();

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
    // $ANTLR end "rule__ConfigurationTypeObject__Group__2"


    // $ANTLR start "rule__ConfigurationTypeObject__Group__2__Impl"
    // InternalConfigurationOneOf3Parser.g:1373:1: rule__ConfigurationTypeObject__Group__2__Impl : ( ( rule__ConfigurationTypeObject__Group_2__0 )? ) ;
    public final void rule__ConfigurationTypeObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1377:1: ( ( ( rule__ConfigurationTypeObject__Group_2__0 )? ) )
            // InternalConfigurationOneOf3Parser.g:1378:1: ( ( rule__ConfigurationTypeObject__Group_2__0 )? )
            {
            // InternalConfigurationOneOf3Parser.g:1378:1: ( ( rule__ConfigurationTypeObject__Group_2__0 )? )
            // InternalConfigurationOneOf3Parser.g:1379:2: ( rule__ConfigurationTypeObject__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getGroup_2()); 
            }
            // InternalConfigurationOneOf3Parser.g:1380:2: ( rule__ConfigurationTypeObject__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:1380:3: rule__ConfigurationTypeObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigurationTypeObject__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ConfigurationTypeObject__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationTypeObject__Group__3"
    // InternalConfigurationOneOf3Parser.g:1388:1: rule__ConfigurationTypeObject__Group__3 : rule__ConfigurationTypeObject__Group__3__Impl ;
    public final void rule__ConfigurationTypeObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1392:1: ( rule__ConfigurationTypeObject__Group__3__Impl )
            // InternalConfigurationOneOf3Parser.g:1393:2: rule__ConfigurationTypeObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__Group__3__Impl();

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
    // $ANTLR end "rule__ConfigurationTypeObject__Group__3"


    // $ANTLR start "rule__ConfigurationTypeObject__Group__3__Impl"
    // InternalConfigurationOneOf3Parser.g:1399:1: rule__ConfigurationTypeObject__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ConfigurationTypeObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1403:1: ( ( RightCurlyBracket ) )
            // InternalConfigurationOneOf3Parser.g:1404:1: ( RightCurlyBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1404:1: ( RightCurlyBracket )
            // InternalConfigurationOneOf3Parser.g:1405:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__ConfigurationTypeObject__Group__3__Impl"


    // $ANTLR start "rule__ConfigurationTypeObject__Group_2__0"
    // InternalConfigurationOneOf3Parser.g:1415:1: rule__ConfigurationTypeObject__Group_2__0 : rule__ConfigurationTypeObject__Group_2__0__Impl rule__ConfigurationTypeObject__Group_2__1 ;
    public final void rule__ConfigurationTypeObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1419:1: ( rule__ConfigurationTypeObject__Group_2__0__Impl rule__ConfigurationTypeObject__Group_2__1 )
            // InternalConfigurationOneOf3Parser.g:1420:2: rule__ConfigurationTypeObject__Group_2__0__Impl rule__ConfigurationTypeObject__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ConfigurationTypeObject__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__Group_2__1();

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
    // $ANTLR end "rule__ConfigurationTypeObject__Group_2__0"


    // $ANTLR start "rule__ConfigurationTypeObject__Group_2__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1427:1: rule__ConfigurationTypeObject__Group_2__0__Impl : ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 ) ) ;
    public final void rule__ConfigurationTypeObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1431:1: ( ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 ) ) )
            // InternalConfigurationOneOf3Parser.g:1432:1: ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1432:1: ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 ) )
            // InternalConfigurationOneOf3Parser.g:1433:2: ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationAssignment_2_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1434:2: ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 )
            // InternalConfigurationOneOf3Parser.g:1434:3: rule__ConfigurationTypeObject__ConfigurationAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__ConfigurationAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationAssignment_2_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeObject__Group_2__0__Impl"


    // $ANTLR start "rule__ConfigurationTypeObject__Group_2__1"
    // InternalConfigurationOneOf3Parser.g:1442:1: rule__ConfigurationTypeObject__Group_2__1 : rule__ConfigurationTypeObject__Group_2__1__Impl ;
    public final void rule__ConfigurationTypeObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1446:1: ( rule__ConfigurationTypeObject__Group_2__1__Impl )
            // InternalConfigurationOneOf3Parser.g:1447:2: rule__ConfigurationTypeObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__ConfigurationTypeObject__Group_2__1"


    // $ANTLR start "rule__ConfigurationTypeObject__Group_2__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1453:1: rule__ConfigurationTypeObject__Group_2__1__Impl : ( ( rule__ConfigurationTypeObject__Group_2_1__0 )* ) ;
    public final void rule__ConfigurationTypeObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1457:1: ( ( ( rule__ConfigurationTypeObject__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf3Parser.g:1458:1: ( ( rule__ConfigurationTypeObject__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf3Parser.g:1458:1: ( ( rule__ConfigurationTypeObject__Group_2_1__0 )* )
            // InternalConfigurationOneOf3Parser.g:1459:2: ( rule__ConfigurationTypeObject__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:1460:2: ( rule__ConfigurationTypeObject__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalConfigurationOneOf3Parser.g:1460:3: rule__ConfigurationTypeObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ConfigurationTypeObject__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__ConfigurationTypeObject__Group_2__1__Impl"


    // $ANTLR start "rule__ConfigurationTypeObject__Group_2_1__0"
    // InternalConfigurationOneOf3Parser.g:1469:1: rule__ConfigurationTypeObject__Group_2_1__0 : rule__ConfigurationTypeObject__Group_2_1__0__Impl rule__ConfigurationTypeObject__Group_2_1__1 ;
    public final void rule__ConfigurationTypeObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1473:1: ( rule__ConfigurationTypeObject__Group_2_1__0__Impl rule__ConfigurationTypeObject__Group_2_1__1 )
            // InternalConfigurationOneOf3Parser.g:1474:2: rule__ConfigurationTypeObject__Group_2_1__0__Impl rule__ConfigurationTypeObject__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ConfigurationTypeObject__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__Group_2_1__1();

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
    // $ANTLR end "rule__ConfigurationTypeObject__Group_2_1__0"


    // $ANTLR start "rule__ConfigurationTypeObject__Group_2_1__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1481:1: rule__ConfigurationTypeObject__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ConfigurationTypeObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1485:1: ( ( Comma ) )
            // InternalConfigurationOneOf3Parser.g:1486:1: ( Comma )
            {
            // InternalConfigurationOneOf3Parser.g:1486:1: ( Comma )
            // InternalConfigurationOneOf3Parser.g:1487:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__ConfigurationTypeObject__Group_2_1__1"
    // InternalConfigurationOneOf3Parser.g:1496:1: rule__ConfigurationTypeObject__Group_2_1__1 : rule__ConfigurationTypeObject__Group_2_1__1__Impl ;
    public final void rule__ConfigurationTypeObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1500:1: ( rule__ConfigurationTypeObject__Group_2_1__1__Impl )
            // InternalConfigurationOneOf3Parser.g:1501:2: rule__ConfigurationTypeObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ConfigurationTypeObject__Group_2_1__1"


    // $ANTLR start "rule__ConfigurationTypeObject__Group_2_1__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1507:1: rule__ConfigurationTypeObject__Group_2_1__1__Impl : ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 ) ) ;
    public final void rule__ConfigurationTypeObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1511:1: ( ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf3Parser.g:1512:1: ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1512:1: ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 ) )
            // InternalConfigurationOneOf3Parser.g:1513:2: ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:1514:2: ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 )
            // InternalConfigurationOneOf3Parser.g:1514:3: rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationAssignment_2_1_1()); 
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
    // $ANTLR end "rule__ConfigurationTypeObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__ConfigurationTypeArray__Group__0"
    // InternalConfigurationOneOf3Parser.g:1523:1: rule__ConfigurationTypeArray__Group__0 : rule__ConfigurationTypeArray__Group__0__Impl rule__ConfigurationTypeArray__Group__1 ;
    public final void rule__ConfigurationTypeArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1527:1: ( rule__ConfigurationTypeArray__Group__0__Impl rule__ConfigurationTypeArray__Group__1 )
            // InternalConfigurationOneOf3Parser.g:1528:2: rule__ConfigurationTypeArray__Group__0__Impl rule__ConfigurationTypeArray__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ConfigurationTypeArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__Group__1();

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
    // $ANTLR end "rule__ConfigurationTypeArray__Group__0"


    // $ANTLR start "rule__ConfigurationTypeArray__Group__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1535:1: rule__ConfigurationTypeArray__Group__0__Impl : ( () ) ;
    public final void rule__ConfigurationTypeArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1539:1: ( ( () ) )
            // InternalConfigurationOneOf3Parser.g:1540:1: ( () )
            {
            // InternalConfigurationOneOf3Parser.g:1540:1: ( () )
            // InternalConfigurationOneOf3Parser.g:1541:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationTypeArrayAction_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1542:2: ()
            // InternalConfigurationOneOf3Parser.g:1542:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationTypeArrayAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationTypeArray__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationTypeArray__Group__1"
    // InternalConfigurationOneOf3Parser.g:1550:1: rule__ConfigurationTypeArray__Group__1 : rule__ConfigurationTypeArray__Group__1__Impl rule__ConfigurationTypeArray__Group__2 ;
    public final void rule__ConfigurationTypeArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1554:1: ( rule__ConfigurationTypeArray__Group__1__Impl rule__ConfigurationTypeArray__Group__2 )
            // InternalConfigurationOneOf3Parser.g:1555:2: rule__ConfigurationTypeArray__Group__1__Impl rule__ConfigurationTypeArray__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ConfigurationTypeArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__Group__2();

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
    // $ANTLR end "rule__ConfigurationTypeArray__Group__1"


    // $ANTLR start "rule__ConfigurationTypeArray__Group__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1562:1: rule__ConfigurationTypeArray__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ConfigurationTypeArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1566:1: ( ( LeftSquareBracket ) )
            // InternalConfigurationOneOf3Parser.g:1567:1: ( LeftSquareBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1567:1: ( LeftSquareBracket )
            // InternalConfigurationOneOf3Parser.g:1568:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__ConfigurationTypeArray__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationTypeArray__Group__2"
    // InternalConfigurationOneOf3Parser.g:1577:1: rule__ConfigurationTypeArray__Group__2 : rule__ConfigurationTypeArray__Group__2__Impl rule__ConfigurationTypeArray__Group__3 ;
    public final void rule__ConfigurationTypeArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1581:1: ( rule__ConfigurationTypeArray__Group__2__Impl rule__ConfigurationTypeArray__Group__3 )
            // InternalConfigurationOneOf3Parser.g:1582:2: rule__ConfigurationTypeArray__Group__2__Impl rule__ConfigurationTypeArray__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ConfigurationTypeArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__Group__3();

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
    // $ANTLR end "rule__ConfigurationTypeArray__Group__2"


    // $ANTLR start "rule__ConfigurationTypeArray__Group__2__Impl"
    // InternalConfigurationOneOf3Parser.g:1589:1: rule__ConfigurationTypeArray__Group__2__Impl : ( ( rule__ConfigurationTypeArray__Group_2__0 )? ) ;
    public final void rule__ConfigurationTypeArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1593:1: ( ( ( rule__ConfigurationTypeArray__Group_2__0 )? ) )
            // InternalConfigurationOneOf3Parser.g:1594:1: ( ( rule__ConfigurationTypeArray__Group_2__0 )? )
            {
            // InternalConfigurationOneOf3Parser.g:1594:1: ( ( rule__ConfigurationTypeArray__Group_2__0 )? )
            // InternalConfigurationOneOf3Parser.g:1595:2: ( rule__ConfigurationTypeArray__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getGroup_2()); 
            }
            // InternalConfigurationOneOf3Parser.g:1596:2: ( rule__ConfigurationTypeArray__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=False && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:1596:3: rule__ConfigurationTypeArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigurationTypeArray__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ConfigurationTypeArray__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationTypeArray__Group__3"
    // InternalConfigurationOneOf3Parser.g:1604:1: rule__ConfigurationTypeArray__Group__3 : rule__ConfigurationTypeArray__Group__3__Impl ;
    public final void rule__ConfigurationTypeArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1608:1: ( rule__ConfigurationTypeArray__Group__3__Impl )
            // InternalConfigurationOneOf3Parser.g:1609:2: rule__ConfigurationTypeArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__Group__3__Impl();

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
    // $ANTLR end "rule__ConfigurationTypeArray__Group__3"


    // $ANTLR start "rule__ConfigurationTypeArray__Group__3__Impl"
    // InternalConfigurationOneOf3Parser.g:1615:1: rule__ConfigurationTypeArray__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ConfigurationTypeArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1619:1: ( ( RightSquareBracket ) )
            // InternalConfigurationOneOf3Parser.g:1620:1: ( RightSquareBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1620:1: ( RightSquareBracket )
            // InternalConfigurationOneOf3Parser.g:1621:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__ConfigurationTypeArray__Group__3__Impl"


    // $ANTLR start "rule__ConfigurationTypeArray__Group_2__0"
    // InternalConfigurationOneOf3Parser.g:1631:1: rule__ConfigurationTypeArray__Group_2__0 : rule__ConfigurationTypeArray__Group_2__0__Impl rule__ConfigurationTypeArray__Group_2__1 ;
    public final void rule__ConfigurationTypeArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1635:1: ( rule__ConfigurationTypeArray__Group_2__0__Impl rule__ConfigurationTypeArray__Group_2__1 )
            // InternalConfigurationOneOf3Parser.g:1636:2: rule__ConfigurationTypeArray__Group_2__0__Impl rule__ConfigurationTypeArray__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ConfigurationTypeArray__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__Group_2__1();

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
    // $ANTLR end "rule__ConfigurationTypeArray__Group_2__0"


    // $ANTLR start "rule__ConfigurationTypeArray__Group_2__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1643:1: rule__ConfigurationTypeArray__Group_2__0__Impl : ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 ) ) ;
    public final void rule__ConfigurationTypeArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1647:1: ( ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 ) ) )
            // InternalConfigurationOneOf3Parser.g:1648:1: ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1648:1: ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 ) )
            // InternalConfigurationOneOf3Parser.g:1649:2: ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationAssignment_2_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1650:2: ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 )
            // InternalConfigurationOneOf3Parser.g:1650:3: rule__ConfigurationTypeArray__ConfigurationAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__ConfigurationAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationAssignment_2_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeArray__Group_2__0__Impl"


    // $ANTLR start "rule__ConfigurationTypeArray__Group_2__1"
    // InternalConfigurationOneOf3Parser.g:1658:1: rule__ConfigurationTypeArray__Group_2__1 : rule__ConfigurationTypeArray__Group_2__1__Impl ;
    public final void rule__ConfigurationTypeArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1662:1: ( rule__ConfigurationTypeArray__Group_2__1__Impl )
            // InternalConfigurationOneOf3Parser.g:1663:2: rule__ConfigurationTypeArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__Group_2__1__Impl();

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
    // $ANTLR end "rule__ConfigurationTypeArray__Group_2__1"


    // $ANTLR start "rule__ConfigurationTypeArray__Group_2__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1669:1: rule__ConfigurationTypeArray__Group_2__1__Impl : ( ( rule__ConfigurationTypeArray__Group_2_1__0 )* ) ;
    public final void rule__ConfigurationTypeArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1673:1: ( ( ( rule__ConfigurationTypeArray__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf3Parser.g:1674:1: ( ( rule__ConfigurationTypeArray__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf3Parser.g:1674:1: ( ( rule__ConfigurationTypeArray__Group_2_1__0 )* )
            // InternalConfigurationOneOf3Parser.g:1675:2: ( rule__ConfigurationTypeArray__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:1676:2: ( rule__ConfigurationTypeArray__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalConfigurationOneOf3Parser.g:1676:3: rule__ConfigurationTypeArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ConfigurationTypeArray__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__ConfigurationTypeArray__Group_2__1__Impl"


    // $ANTLR start "rule__ConfigurationTypeArray__Group_2_1__0"
    // InternalConfigurationOneOf3Parser.g:1685:1: rule__ConfigurationTypeArray__Group_2_1__0 : rule__ConfigurationTypeArray__Group_2_1__0__Impl rule__ConfigurationTypeArray__Group_2_1__1 ;
    public final void rule__ConfigurationTypeArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1689:1: ( rule__ConfigurationTypeArray__Group_2_1__0__Impl rule__ConfigurationTypeArray__Group_2_1__1 )
            // InternalConfigurationOneOf3Parser.g:1690:2: rule__ConfigurationTypeArray__Group_2_1__0__Impl rule__ConfigurationTypeArray__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ConfigurationTypeArray__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__Group_2_1__1();

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
    // $ANTLR end "rule__ConfigurationTypeArray__Group_2_1__0"


    // $ANTLR start "rule__ConfigurationTypeArray__Group_2_1__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1697:1: rule__ConfigurationTypeArray__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ConfigurationTypeArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1701:1: ( ( Comma ) )
            // InternalConfigurationOneOf3Parser.g:1702:1: ( Comma )
            {
            // InternalConfigurationOneOf3Parser.g:1702:1: ( Comma )
            // InternalConfigurationOneOf3Parser.g:1703:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__ConfigurationTypeArray__Group_2_1__1"
    // InternalConfigurationOneOf3Parser.g:1712:1: rule__ConfigurationTypeArray__Group_2_1__1 : rule__ConfigurationTypeArray__Group_2_1__1__Impl ;
    public final void rule__ConfigurationTypeArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1716:1: ( rule__ConfigurationTypeArray__Group_2_1__1__Impl )
            // InternalConfigurationOneOf3Parser.g:1717:2: rule__ConfigurationTypeArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ConfigurationTypeArray__Group_2_1__1"


    // $ANTLR start "rule__ConfigurationTypeArray__Group_2_1__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1723:1: rule__ConfigurationTypeArray__Group_2_1__1__Impl : ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 ) ) ;
    public final void rule__ConfigurationTypeArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1727:1: ( ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf3Parser.g:1728:1: ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1728:1: ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 ) )
            // InternalConfigurationOneOf3Parser.g:1729:2: ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:1730:2: ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 )
            // InternalConfigurationOneOf3Parser.g:1730:3: rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationAssignment_2_1_1()); 
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
    // $ANTLR end "rule__ConfigurationTypeArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__ConfigurationAdditionalProperties__Group__0"
    // InternalConfigurationOneOf3Parser.g:1739:1: rule__ConfigurationAdditionalProperties__Group__0 : rule__ConfigurationAdditionalProperties__Group__0__Impl rule__ConfigurationAdditionalProperties__Group__1 ;
    public final void rule__ConfigurationAdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1743:1: ( rule__ConfigurationAdditionalProperties__Group__0__Impl rule__ConfigurationAdditionalProperties__Group__1 )
            // InternalConfigurationOneOf3Parser.g:1744:2: rule__ConfigurationAdditionalProperties__Group__0__Impl rule__ConfigurationAdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConfigurationAdditionalProperties__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationAdditionalProperties__Group__1();

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
    // $ANTLR end "rule__ConfigurationAdditionalProperties__Group__0"


    // $ANTLR start "rule__ConfigurationAdditionalProperties__Group__0__Impl"
    // InternalConfigurationOneOf3Parser.g:1751:1: rule__ConfigurationAdditionalProperties__Group__0__Impl : ( ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__ConfigurationAdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1755:1: ( ( ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 ) ) )
            // InternalConfigurationOneOf3Parser.g:1756:1: ( ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1756:1: ( ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 ) )
            // InternalConfigurationOneOf3Parser.g:1757:2: ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1758:2: ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 )
            // InternalConfigurationOneOf3Parser.g:1758:3: rule__ConfigurationAdditionalProperties__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationAdditionalProperties__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAdditionalPropertiesAccess().getKeyAssignment_0()); 
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
    // $ANTLR end "rule__ConfigurationAdditionalProperties__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationAdditionalProperties__Group__1"
    // InternalConfigurationOneOf3Parser.g:1766:1: rule__ConfigurationAdditionalProperties__Group__1 : rule__ConfigurationAdditionalProperties__Group__1__Impl rule__ConfigurationAdditionalProperties__Group__2 ;
    public final void rule__ConfigurationAdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1770:1: ( rule__ConfigurationAdditionalProperties__Group__1__Impl rule__ConfigurationAdditionalProperties__Group__2 )
            // InternalConfigurationOneOf3Parser.g:1771:2: rule__ConfigurationAdditionalProperties__Group__1__Impl rule__ConfigurationAdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ConfigurationAdditionalProperties__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationAdditionalProperties__Group__2();

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
    // $ANTLR end "rule__ConfigurationAdditionalProperties__Group__1"


    // $ANTLR start "rule__ConfigurationAdditionalProperties__Group__1__Impl"
    // InternalConfigurationOneOf3Parser.g:1778:1: rule__ConfigurationAdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__ConfigurationAdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1782:1: ( ( Colon ) )
            // InternalConfigurationOneOf3Parser.g:1783:1: ( Colon )
            {
            // InternalConfigurationOneOf3Parser.g:1783:1: ( Colon )
            // InternalConfigurationOneOf3Parser.g:1784:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAdditionalPropertiesAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__ConfigurationAdditionalProperties__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationAdditionalProperties__Group__2"
    // InternalConfigurationOneOf3Parser.g:1793:1: rule__ConfigurationAdditionalProperties__Group__2 : rule__ConfigurationAdditionalProperties__Group__2__Impl ;
    public final void rule__ConfigurationAdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1797:1: ( rule__ConfigurationAdditionalProperties__Group__2__Impl )
            // InternalConfigurationOneOf3Parser.g:1798:2: rule__ConfigurationAdditionalProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationAdditionalProperties__Group__2__Impl();

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
    // $ANTLR end "rule__ConfigurationAdditionalProperties__Group__2"


    // $ANTLR start "rule__ConfigurationAdditionalProperties__Group__2__Impl"
    // InternalConfigurationOneOf3Parser.g:1804:1: rule__ConfigurationAdditionalProperties__Group__2__Impl : ( ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__ConfigurationAdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1808:1: ( ( ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalConfigurationOneOf3Parser.g:1809:1: ( ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1809:1: ( ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalConfigurationOneOf3Parser.g:1810:2: ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalConfigurationOneOf3Parser.g:1811:2: ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalConfigurationOneOf3Parser.g:1811:3: rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
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
    // $ANTLR end "rule__ConfigurationAdditionalProperties__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalConfigurationOneOf3Parser.g:1820:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1824:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalConfigurationOneOf3Parser.g:1825:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
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
    // InternalConfigurationOneOf3Parser.g:1832:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1836:1: ( ( () ) )
            // InternalConfigurationOneOf3Parser.g:1837:1: ( () )
            {
            // InternalConfigurationOneOf3Parser.g:1837:1: ( () )
            // InternalConfigurationOneOf3Parser.g:1838:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1839:2: ()
            // InternalConfigurationOneOf3Parser.g:1839:3: 
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
    // InternalConfigurationOneOf3Parser.g:1847:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1851:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalConfigurationOneOf3Parser.g:1852:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
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
    // InternalConfigurationOneOf3Parser.g:1859:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1863:1: ( ( LeftSquareBracket ) )
            // InternalConfigurationOneOf3Parser.g:1864:1: ( LeftSquareBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1864:1: ( LeftSquareBracket )
            // InternalConfigurationOneOf3Parser.g:1865:2: LeftSquareBracket
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
    // InternalConfigurationOneOf3Parser.g:1874:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1878:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalConfigurationOneOf3Parser.g:1879:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
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
    // InternalConfigurationOneOf3Parser.g:1886:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1890:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalConfigurationOneOf3Parser.g:1891:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalConfigurationOneOf3Parser.g:1891:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalConfigurationOneOf3Parser.g:1892:2: ( rule__ArrayValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            }
            // InternalConfigurationOneOf3Parser.g:1893:2: ( rule__ArrayValue__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=False && LA13_0<=True)||LA13_0==LeftSquareBracket||LA13_0==LeftCurlyBracket||(LA13_0>=RULE_STRING && LA13_0<=RULE_E_DOUBLE)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:1893:3: rule__ArrayValue__Group_2__0
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
    // InternalConfigurationOneOf3Parser.g:1901:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1905:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalConfigurationOneOf3Parser.g:1906:2: rule__ArrayValue__Group__3__Impl
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
    // InternalConfigurationOneOf3Parser.g:1912:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1916:1: ( ( RightSquareBracket ) )
            // InternalConfigurationOneOf3Parser.g:1917:1: ( RightSquareBracket )
            {
            // InternalConfigurationOneOf3Parser.g:1917:1: ( RightSquareBracket )
            // InternalConfigurationOneOf3Parser.g:1918:2: RightSquareBracket
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
    // InternalConfigurationOneOf3Parser.g:1928:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1932:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalConfigurationOneOf3Parser.g:1933:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalConfigurationOneOf3Parser.g:1940:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1944:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalConfigurationOneOf3Parser.g:1945:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:1945:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalConfigurationOneOf3Parser.g:1946:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:1947:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalConfigurationOneOf3Parser.g:1947:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalConfigurationOneOf3Parser.g:1955:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1959:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalConfigurationOneOf3Parser.g:1960:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalConfigurationOneOf3Parser.g:1966:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1970:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf3Parser.g:1971:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf3Parser.g:1971:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalConfigurationOneOf3Parser.g:1972:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:1973:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalConfigurationOneOf3Parser.g:1973:3: rule__ArrayValue__Group_2_1__0
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
    // InternalConfigurationOneOf3Parser.g:1982:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1986:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalConfigurationOneOf3Parser.g:1987:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
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
    // InternalConfigurationOneOf3Parser.g:1994:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:1998:1: ( ( Comma ) )
            // InternalConfigurationOneOf3Parser.g:1999:1: ( Comma )
            {
            // InternalConfigurationOneOf3Parser.g:1999:1: ( Comma )
            // InternalConfigurationOneOf3Parser.g:2000:2: Comma
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
    // InternalConfigurationOneOf3Parser.g:2009:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2013:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalConfigurationOneOf3Parser.g:2014:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalConfigurationOneOf3Parser.g:2020:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2024:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf3Parser.g:2025:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf3Parser.g:2025:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalConfigurationOneOf3Parser.g:2026:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:2027:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalConfigurationOneOf3Parser.g:2027:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalConfigurationOneOf3Parser.g:2036:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2040:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalConfigurationOneOf3Parser.g:2041:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
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
    // InternalConfigurationOneOf3Parser.g:2048:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2052:1: ( ( () ) )
            // InternalConfigurationOneOf3Parser.g:2053:1: ( () )
            {
            // InternalConfigurationOneOf3Parser.g:2053:1: ( () )
            // InternalConfigurationOneOf3Parser.g:2054:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:2055:2: ()
            // InternalConfigurationOneOf3Parser.g:2055:3: 
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
    // InternalConfigurationOneOf3Parser.g:2063:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2067:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalConfigurationOneOf3Parser.g:2068:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
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
    // InternalConfigurationOneOf3Parser.g:2075:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2079:1: ( ( LeftCurlyBracket ) )
            // InternalConfigurationOneOf3Parser.g:2080:1: ( LeftCurlyBracket )
            {
            // InternalConfigurationOneOf3Parser.g:2080:1: ( LeftCurlyBracket )
            // InternalConfigurationOneOf3Parser.g:2081:2: LeftCurlyBracket
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
    // InternalConfigurationOneOf3Parser.g:2090:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2094:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalConfigurationOneOf3Parser.g:2095:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
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
    // InternalConfigurationOneOf3Parser.g:2102:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2106:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalConfigurationOneOf3Parser.g:2107:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalConfigurationOneOf3Parser.g:2107:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalConfigurationOneOf3Parser.g:2108:2: ( rule__ObjectValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            }
            // InternalConfigurationOneOf3Parser.g:2109:2: ( rule__ObjectValue__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalConfigurationOneOf3Parser.g:2109:3: rule__ObjectValue__Group_2__0
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
    // InternalConfigurationOneOf3Parser.g:2117:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2121:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalConfigurationOneOf3Parser.g:2122:2: rule__ObjectValue__Group__3__Impl
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
    // InternalConfigurationOneOf3Parser.g:2128:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2132:1: ( ( RightCurlyBracket ) )
            // InternalConfigurationOneOf3Parser.g:2133:1: ( RightCurlyBracket )
            {
            // InternalConfigurationOneOf3Parser.g:2133:1: ( RightCurlyBracket )
            // InternalConfigurationOneOf3Parser.g:2134:2: RightCurlyBracket
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
    // InternalConfigurationOneOf3Parser.g:2144:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2148:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalConfigurationOneOf3Parser.g:2149:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalConfigurationOneOf3Parser.g:2156:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2160:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalConfigurationOneOf3Parser.g:2161:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:2161:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalConfigurationOneOf3Parser.g:2162:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:2163:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalConfigurationOneOf3Parser.g:2163:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalConfigurationOneOf3Parser.g:2171:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2175:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalConfigurationOneOf3Parser.g:2176:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalConfigurationOneOf3Parser.g:2182:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2186:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf3Parser.g:2187:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf3Parser.g:2187:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalConfigurationOneOf3Parser.g:2188:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:2189:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalConfigurationOneOf3Parser.g:2189:3: rule__ObjectValue__Group_2_1__0
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
    // InternalConfigurationOneOf3Parser.g:2198:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2202:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalConfigurationOneOf3Parser.g:2203:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
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
    // InternalConfigurationOneOf3Parser.g:2210:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2214:1: ( ( Comma ) )
            // InternalConfigurationOneOf3Parser.g:2215:1: ( Comma )
            {
            // InternalConfigurationOneOf3Parser.g:2215:1: ( Comma )
            // InternalConfigurationOneOf3Parser.g:2216:2: Comma
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
    // InternalConfigurationOneOf3Parser.g:2225:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2229:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalConfigurationOneOf3Parser.g:2230:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalConfigurationOneOf3Parser.g:2236:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2240:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf3Parser.g:2241:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf3Parser.g:2241:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalConfigurationOneOf3Parser.g:2242:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf3Parser.g:2243:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalConfigurationOneOf3Parser.g:2243:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalConfigurationOneOf3Parser.g:2252:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2256:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalConfigurationOneOf3Parser.g:2257:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
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
    // InternalConfigurationOneOf3Parser.g:2264:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2268:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalConfigurationOneOf3Parser.g:2269:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalConfigurationOneOf3Parser.g:2269:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalConfigurationOneOf3Parser.g:2270:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // InternalConfigurationOneOf3Parser.g:2271:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalConfigurationOneOf3Parser.g:2271:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalConfigurationOneOf3Parser.g:2279:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2283:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalConfigurationOneOf3Parser.g:2284:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
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
    // InternalConfigurationOneOf3Parser.g:2291:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2295:1: ( ( Colon ) )
            // InternalConfigurationOneOf3Parser.g:2296:1: ( Colon )
            {
            // InternalConfigurationOneOf3Parser.g:2296:1: ( Colon )
            // InternalConfigurationOneOf3Parser.g:2297:2: Colon
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
    // InternalConfigurationOneOf3Parser.g:2306:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2310:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalConfigurationOneOf3Parser.g:2311:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalConfigurationOneOf3Parser.g:2317:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2321:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalConfigurationOneOf3Parser.g:2322:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalConfigurationOneOf3Parser.g:2322:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalConfigurationOneOf3Parser.g:2323:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // InternalConfigurationOneOf3Parser.g:2324:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalConfigurationOneOf3Parser.g:2324:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__ConfigurationOneOf3__ConfigurationAssignment_2_0"
    // InternalConfigurationOneOf3Parser.g:2333:1: rule__ConfigurationOneOf3__ConfigurationAssignment_2_0 : ( ruleConfigurationOneOf3PropertiesAbstract ) ;
    public final void rule__ConfigurationOneOf3__ConfigurationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2337:1: ( ( ruleConfigurationOneOf3PropertiesAbstract ) )
            // InternalConfigurationOneOf3Parser.g:2338:2: ( ruleConfigurationOneOf3PropertiesAbstract )
            {
            // InternalConfigurationOneOf3Parser.g:2338:2: ( ruleConfigurationOneOf3PropertiesAbstract )
            // InternalConfigurationOneOf3Parser.g:2339:3: ruleConfigurationOneOf3PropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getConfigurationConfigurationOneOf3PropertiesAbstractParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurationOneOf3PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getConfigurationConfigurationOneOf3PropertiesAbstractParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3__ConfigurationAssignment_2_0"


    // $ANTLR start "rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1"
    // InternalConfigurationOneOf3Parser.g:2348:1: rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1 : ( ruleConfigurationOneOf3PropertiesAbstract ) ;
    public final void rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2352:1: ( ( ruleConfigurationOneOf3PropertiesAbstract ) )
            // InternalConfigurationOneOf3Parser.g:2353:2: ( ruleConfigurationOneOf3PropertiesAbstract )
            {
            // InternalConfigurationOneOf3Parser.g:2353:2: ( ruleConfigurationOneOf3PropertiesAbstract )
            // InternalConfigurationOneOf3Parser.g:2354:3: ruleConfigurationOneOf3PropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3Access().getConfigurationConfigurationOneOf3PropertiesAbstractParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurationOneOf3PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3Access().getConfigurationConfigurationOneOf3PropertiesAbstractParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3__ConfigurationAssignment_2_1_1"


    // $ANTLR start "rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0"
    // InternalConfigurationOneOf3Parser.g:2363:1: rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2367:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:2368:2: ( ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:2368:2: ( ruleEString )
            // InternalConfigurationOneOf3Parser.g:2369:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3AdditionalProperties__KeyAssignment_0"


    // $ANTLR start "rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2"
    // InternalConfigurationOneOf3Parser.g:2378:1: rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleConfiguration ) ;
    public final void rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2382:1: ( ( ruleConfiguration ) )
            // InternalConfigurationOneOf3Parser.g:2383:2: ( ruleConfiguration )
            {
            // InternalConfigurationOneOf3Parser.g:2383:2: ( ruleConfiguration )
            // InternalConfigurationOneOf3Parser.g:2384:3: ruleConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getAdditionalPropertiesConfigurationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf3AdditionalPropertiesAccess().getAdditionalPropertiesConfigurationParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ConfigurationOneOf3AdditionalProperties__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__Configuration__ConfigurationAssignment"
    // InternalConfigurationOneOf3Parser.g:2393:1: rule__Configuration__ConfigurationAssignment : ( ruleConfigurationAbstract ) ;
    public final void rule__Configuration__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2397:1: ( ( ruleConfigurationAbstract ) )
            // InternalConfigurationOneOf3Parser.g:2398:2: ( ruleConfigurationAbstract )
            {
            // InternalConfigurationOneOf3Parser.g:2398:2: ( ruleConfigurationAbstract )
            // InternalConfigurationOneOf3Parser.g:2399:3: ruleConfigurationAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationConfigurationAbstractParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurationAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAccess().getConfigurationConfigurationAbstractParserRuleCall_0()); 
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
    // $ANTLR end "rule__Configuration__ConfigurationAssignment"


    // $ANTLR start "rule__ConfigurationTypeString__ConfigurationAssignment"
    // InternalConfigurationOneOf3Parser.g:2408:1: rule__ConfigurationTypeString__ConfigurationAssignment : ( ruleEString ) ;
    public final void rule__ConfigurationTypeString__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2412:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:2413:2: ( ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:2413:2: ( ruleEString )
            // InternalConfigurationOneOf3Parser.g:2414:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeStringAccess().getConfigurationEStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeStringAccess().getConfigurationEStringParserRuleCall_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeString__ConfigurationAssignment"


    // $ANTLR start "rule__ConfigurationTypeInteger__ConfigurationAssignment"
    // InternalConfigurationOneOf3Parser.g:2423:1: rule__ConfigurationTypeInteger__ConfigurationAssignment : ( ruleEDoubleObject ) ;
    public final void rule__ConfigurationTypeInteger__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2427:1: ( ( ruleEDoubleObject ) )
            // InternalConfigurationOneOf3Parser.g:2428:2: ( ruleEDoubleObject )
            {
            // InternalConfigurationOneOf3Parser.g:2428:2: ( ruleEDoubleObject )
            // InternalConfigurationOneOf3Parser.g:2429:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeIntegerAccess().getConfigurationEDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeIntegerAccess().getConfigurationEDoubleObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeInteger__ConfigurationAssignment"


    // $ANTLR start "rule__ConfigurationTypeNumber__ConfigurationAssignment"
    // InternalConfigurationOneOf3Parser.g:2438:1: rule__ConfigurationTypeNumber__ConfigurationAssignment : ( ruleEDoubleObject ) ;
    public final void rule__ConfigurationTypeNumber__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2442:1: ( ( ruleEDoubleObject ) )
            // InternalConfigurationOneOf3Parser.g:2443:2: ( ruleEDoubleObject )
            {
            // InternalConfigurationOneOf3Parser.g:2443:2: ( ruleEDoubleObject )
            // InternalConfigurationOneOf3Parser.g:2444:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeNumberAccess().getConfigurationEDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeNumberAccess().getConfigurationEDoubleObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeNumber__ConfigurationAssignment"


    // $ANTLR start "rule__ConfigurationTypeBoolean__ConfigurationAssignment"
    // InternalConfigurationOneOf3Parser.g:2453:1: rule__ConfigurationTypeBoolean__ConfigurationAssignment : ( ruleEBooleanObject ) ;
    public final void rule__ConfigurationTypeBoolean__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2457:1: ( ( ruleEBooleanObject ) )
            // InternalConfigurationOneOf3Parser.g:2458:2: ( ruleEBooleanObject )
            {
            // InternalConfigurationOneOf3Parser.g:2458:2: ( ruleEBooleanObject )
            // InternalConfigurationOneOf3Parser.g:2459:3: ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeBooleanAccess().getConfigurationEBooleanObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeBooleanAccess().getConfigurationEBooleanObjectParserRuleCall_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeBoolean__ConfigurationAssignment"


    // $ANTLR start "rule__ConfigurationTypeObject__ConfigurationAssignment_2_0"
    // InternalConfigurationOneOf3Parser.g:2468:1: rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 : ( ruleConfigurationPropertiesAbstract ) ;
    public final void rule__ConfigurationTypeObject__ConfigurationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2472:1: ( ( ruleConfigurationPropertiesAbstract ) )
            // InternalConfigurationOneOf3Parser.g:2473:2: ( ruleConfigurationPropertiesAbstract )
            {
            // InternalConfigurationOneOf3Parser.g:2473:2: ( ruleConfigurationPropertiesAbstract )
            // InternalConfigurationOneOf3Parser.g:2474:3: ruleConfigurationPropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurationPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeObject__ConfigurationAssignment_2_0"


    // $ANTLR start "rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1"
    // InternalConfigurationOneOf3Parser.g:2483:1: rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 : ( ruleConfigurationPropertiesAbstract ) ;
    public final void rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2487:1: ( ( ruleConfigurationPropertiesAbstract ) )
            // InternalConfigurationOneOf3Parser.g:2488:2: ( ruleConfigurationPropertiesAbstract )
            {
            // InternalConfigurationOneOf3Parser.g:2488:2: ( ruleConfigurationPropertiesAbstract )
            // InternalConfigurationOneOf3Parser.g:2489:3: ruleConfigurationPropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurationPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1"


    // $ANTLR start "rule__ConfigurationTypeArray__ConfigurationAssignment_2_0"
    // InternalConfigurationOneOf3Parser.g:2498:1: rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 : ( ruleConfigurationItems ) ;
    public final void rule__ConfigurationTypeArray__ConfigurationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2502:1: ( ( ruleConfigurationItems ) )
            // InternalConfigurationOneOf3Parser.g:2503:2: ( ruleConfigurationItems )
            {
            // InternalConfigurationOneOf3Parser.g:2503:2: ( ruleConfigurationItems )
            // InternalConfigurationOneOf3Parser.g:2504:3: ruleConfigurationItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurationItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeArray__ConfigurationAssignment_2_0"


    // $ANTLR start "rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1"
    // InternalConfigurationOneOf3Parser.g:2513:1: rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 : ( ruleConfigurationItems ) ;
    public final void rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2517:1: ( ( ruleConfigurationItems ) )
            // InternalConfigurationOneOf3Parser.g:2518:2: ( ruleConfigurationItems )
            {
            // InternalConfigurationOneOf3Parser.g:2518:2: ( ruleConfigurationItems )
            // InternalConfigurationOneOf3Parser.g:2519:3: ruleConfigurationItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurationItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1"


    // $ANTLR start "rule__ConfigurationTypeNull__ConfigurationAssignment"
    // InternalConfigurationOneOf3Parser.g:2528:1: rule__ConfigurationTypeNull__ConfigurationAssignment : ( ruleNullValue ) ;
    public final void rule__ConfigurationTypeNull__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2532:1: ( ( ruleNullValue ) )
            // InternalConfigurationOneOf3Parser.g:2533:2: ( ruleNullValue )
            {
            // InternalConfigurationOneOf3Parser.g:2533:2: ( ruleNullValue )
            // InternalConfigurationOneOf3Parser.g:2534:3: ruleNullValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeNullAccess().getConfigurationNullValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNullValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationTypeNullAccess().getConfigurationNullValueParserRuleCall_0()); 
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
    // $ANTLR end "rule__ConfigurationTypeNull__ConfigurationAssignment"


    // $ANTLR start "rule__ConfigurationAdditionalProperties__KeyAssignment_0"
    // InternalConfigurationOneOf3Parser.g:2543:1: rule__ConfigurationAdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__ConfigurationAdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2547:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:2548:2: ( ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:2548:2: ( ruleEString )
            // InternalConfigurationOneOf3Parser.g:2549:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ConfigurationAdditionalProperties__KeyAssignment_0"


    // $ANTLR start "rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2"
    // InternalConfigurationOneOf3Parser.g:2558:1: rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2562:1: ( ( ruleJsonDocument ) )
            // InternalConfigurationOneOf3Parser.g:2563:2: ( ruleJsonDocument )
            {
            // InternalConfigurationOneOf3Parser.g:2563:2: ( ruleJsonDocument )
            // InternalConfigurationOneOf3Parser.g:2564:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalConfigurationOneOf3Parser.g:2573:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2577:1: ( ( ruleValue ) )
            // InternalConfigurationOneOf3Parser.g:2578:2: ( ruleValue )
            {
            // InternalConfigurationOneOf3Parser.g:2578:2: ( ruleValue )
            // InternalConfigurationOneOf3Parser.g:2579:3: ruleValue
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
    // InternalConfigurationOneOf3Parser.g:2588:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2592:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:2593:2: ( ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:2593:2: ( ruleEString )
            // InternalConfigurationOneOf3Parser.g:2594:3: ruleEString
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
    // InternalConfigurationOneOf3Parser.g:2603:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2607:1: ( ( ruleValue ) )
            // InternalConfigurationOneOf3Parser.g:2608:2: ( ruleValue )
            {
            // InternalConfigurationOneOf3Parser.g:2608:2: ( ruleValue )
            // InternalConfigurationOneOf3Parser.g:2609:3: ruleValue
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
    // InternalConfigurationOneOf3Parser.g:2618:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2622:1: ( ( ruleValue ) )
            // InternalConfigurationOneOf3Parser.g:2623:2: ( ruleValue )
            {
            // InternalConfigurationOneOf3Parser.g:2623:2: ( ruleValue )
            // InternalConfigurationOneOf3Parser.g:2624:3: ruleValue
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
    // InternalConfigurationOneOf3Parser.g:2633:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2637:1: ( ( ruleNullEnum ) )
            // InternalConfigurationOneOf3Parser.g:2638:2: ( ruleNullEnum )
            {
            // InternalConfigurationOneOf3Parser.g:2638:2: ( ruleNullEnum )
            // InternalConfigurationOneOf3Parser.g:2639:3: ruleNullEnum
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
    // InternalConfigurationOneOf3Parser.g:2648:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2652:1: ( ( ruleEDouble ) )
            // InternalConfigurationOneOf3Parser.g:2653:2: ( ruleEDouble )
            {
            // InternalConfigurationOneOf3Parser.g:2653:2: ( ruleEDouble )
            // InternalConfigurationOneOf3Parser.g:2654:3: ruleEDouble
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
    // InternalConfigurationOneOf3Parser.g:2663:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2667:1: ( ( ruleKeyValuePair ) )
            // InternalConfigurationOneOf3Parser.g:2668:2: ( ruleKeyValuePair )
            {
            // InternalConfigurationOneOf3Parser.g:2668:2: ( ruleKeyValuePair )
            // InternalConfigurationOneOf3Parser.g:2669:3: ruleKeyValuePair
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
    // InternalConfigurationOneOf3Parser.g:2678:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2682:1: ( ( ruleKeyValuePair ) )
            // InternalConfigurationOneOf3Parser.g:2683:2: ( ruleKeyValuePair )
            {
            // InternalConfigurationOneOf3Parser.g:2683:2: ( ruleKeyValuePair )
            // InternalConfigurationOneOf3Parser.g:2684:3: ruleKeyValuePair
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
    // InternalConfigurationOneOf3Parser.g:2693:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2697:1: ( ( ruleEBoolean ) )
            // InternalConfigurationOneOf3Parser.g:2698:2: ( ruleEBoolean )
            {
            // InternalConfigurationOneOf3Parser.g:2698:2: ( ruleEBoolean )
            // InternalConfigurationOneOf3Parser.g:2699:3: ruleEBoolean
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
    // InternalConfigurationOneOf3Parser.g:2708:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2712:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf3Parser.g:2713:2: ( ruleEString )
            {
            // InternalConfigurationOneOf3Parser.g:2713:2: ( ruleEString )
            // InternalConfigurationOneOf3Parser.g:2714:3: ruleEString
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
    // InternalConfigurationOneOf3Parser.g:2723:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2727:1: ( ( ruleValue ) )
            // InternalConfigurationOneOf3Parser.g:2728:2: ( ruleValue )
            {
            // InternalConfigurationOneOf3Parser.g:2728:2: ( ruleValue )
            // InternalConfigurationOneOf3Parser.g:2729:3: ruleValue
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


    // $ANTLR start "rule__ConfigurationItems__ItemsAssignment"
    // InternalConfigurationOneOf3Parser.g:2738:1: rule__ConfigurationItems__ItemsAssignment : ( ruleJsonDocument ) ;
    public final void rule__ConfigurationItems__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf3Parser.g:2742:1: ( ( ruleJsonDocument ) )
            // InternalConfigurationOneOf3Parser.g:2743:2: ( ruleJsonDocument )
            {
            // InternalConfigurationOneOf3Parser.g:2743:2: ( ruleJsonDocument )
            // InternalConfigurationOneOf3Parser.g:2744:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
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
    // $ANTLR end "rule__ConfigurationItems__ItemsAssignment"

    // $ANTLR start synpred1_InternalConfigurationOneOf3Parser
    public final void synpred1_InternalConfigurationOneOf3Parser_fragment() throws RecognitionException {   
        // InternalConfigurationOneOf3Parser.g:835:2: ( ( ( ruleConfigurationTypeNumber ) ) )
        // InternalConfigurationOneOf3Parser.g:835:2: ( ( ruleConfigurationTypeNumber ) )
        {
        // InternalConfigurationOneOf3Parser.g:835:2: ( ( ruleConfigurationTypeNumber ) )
        // InternalConfigurationOneOf3Parser.g:836:3: ( ruleConfigurationTypeNumber )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNumberParserRuleCall_0()); 
        }
        // InternalConfigurationOneOf3Parser.g:837:3: ( ruleConfigurationTypeNumber )
        // InternalConfigurationOneOf3Parser.g:837:4: ruleConfigurationTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleConfigurationTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalConfigurationOneOf3Parser

    // $ANTLR start synpred3_InternalConfigurationOneOf3Parser
    public final void synpred3_InternalConfigurationOneOf3Parser_fragment() throws RecognitionException {   
        // InternalConfigurationOneOf3Parser.g:847:2: ( ( ruleConfigurationTypeInteger ) )
        // InternalConfigurationOneOf3Parser.g:847:2: ( ruleConfigurationTypeInteger )
        {
        // InternalConfigurationOneOf3Parser.g:847:2: ( ruleConfigurationTypeInteger )
        // InternalConfigurationOneOf3Parser.g:848:3: ruleConfigurationTypeInteger
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeIntegerParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleConfigurationTypeInteger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalConfigurationOneOf3Parser

    // Delegated rules

    public final boolean synpred3_InternalConfigurationOneOf3Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalConfigurationOneOf3Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalConfigurationOneOf3Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalConfigurationOneOf3Parser_fragment(); // can never throw exception
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
            return "830:1: rule__ConfigurationAbstract__Alternatives : ( ( ( ruleConfigurationTypeNumber ) ) | ( ruleConfigurationTypeString ) | ( ruleConfigurationTypeInteger ) | ( ruleConfigurationTypeBoolean ) | ( ruleConfigurationTypeObject ) | ( ruleConfigurationTypeArray ) | ( ruleConfigurationTypeNull ) );";
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
                        if ( (synpred1_InternalConfigurationOneOf3Parser()) ) {s = 8;}

                        else if ( (synpred3_InternalConfigurationOneOf3Parser()) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalConfigurationOneOf3Parser()) ) {s = 8;}

                        else if ( (synpred3_InternalConfigurationOneOf3Parser()) ) {s = 9;}

                         
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