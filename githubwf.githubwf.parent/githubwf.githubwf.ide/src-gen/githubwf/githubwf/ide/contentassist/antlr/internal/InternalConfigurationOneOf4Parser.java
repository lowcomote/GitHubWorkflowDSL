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
import githubwf.githubwf.services.ConfigurationOneOf4GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalConfigurationOneOf4Parser extends AbstractInternalContentAssistParser {
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


        public InternalConfigurationOneOf4Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigurationOneOf4Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigurationOneOf4Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigurationOneOf4Parser.g"; }


    	private ConfigurationOneOf4GrammarAccess grammarAccess;
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

    	public void setGrammarAccess(ConfigurationOneOf4GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleConfigurationOneOf4"
    // InternalConfigurationOneOf4Parser.g:65:1: entryRuleConfigurationOneOf4 : ruleConfigurationOneOf4 EOF ;
    public final void entryRuleConfigurationOneOf4() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:66:1: ( ruleConfigurationOneOf4 EOF )
            // InternalConfigurationOneOf4Parser.g:67:1: ruleConfigurationOneOf4 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationOneOf4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Rule()); 
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
    // $ANTLR end "entryRuleConfigurationOneOf4"


    // $ANTLR start "ruleConfigurationOneOf4"
    // InternalConfigurationOneOf4Parser.g:74:1: ruleConfigurationOneOf4 : ( ( rule__ConfigurationOneOf4__Group__0 ) ) ;
    public final void ruleConfigurationOneOf4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:78:2: ( ( ( rule__ConfigurationOneOf4__Group__0 ) ) )
            // InternalConfigurationOneOf4Parser.g:79:2: ( ( rule__ConfigurationOneOf4__Group__0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:79:2: ( ( rule__ConfigurationOneOf4__Group__0 ) )
            // InternalConfigurationOneOf4Parser.g:80:3: ( rule__ConfigurationOneOf4__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getGroup()); 
            }
            // InternalConfigurationOneOf4Parser.g:81:3: ( rule__ConfigurationOneOf4__Group__0 )
            // InternalConfigurationOneOf4Parser.g:81:4: rule__ConfigurationOneOf4__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationOneOf4"


    // $ANTLR start "entryRuleConfigurationAbstract"
    // InternalConfigurationOneOf4Parser.g:90:1: entryRuleConfigurationAbstract : ruleConfigurationAbstract EOF ;
    public final void entryRuleConfigurationAbstract() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:91:1: ( ruleConfigurationAbstract EOF )
            // InternalConfigurationOneOf4Parser.g:92:1: ruleConfigurationAbstract EOF
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
    // InternalConfigurationOneOf4Parser.g:99:1: ruleConfigurationAbstract : ( ( rule__ConfigurationAbstract__Alternatives ) ) ;
    public final void ruleConfigurationAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:103:2: ( ( ( rule__ConfigurationAbstract__Alternatives ) ) )
            // InternalConfigurationOneOf4Parser.g:104:2: ( ( rule__ConfigurationAbstract__Alternatives ) )
            {
            // InternalConfigurationOneOf4Parser.g:104:2: ( ( rule__ConfigurationAbstract__Alternatives ) )
            // InternalConfigurationOneOf4Parser.g:105:3: ( rule__ConfigurationAbstract__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAbstractAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf4Parser.g:106:3: ( rule__ConfigurationAbstract__Alternatives )
            // InternalConfigurationOneOf4Parser.g:106:4: rule__ConfigurationAbstract__Alternatives
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
    // InternalConfigurationOneOf4Parser.g:115:1: entryRuleConfigurationPropertiesAbstract : ruleConfigurationPropertiesAbstract EOF ;
    public final void entryRuleConfigurationPropertiesAbstract() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:116:1: ( ruleConfigurationPropertiesAbstract EOF )
            // InternalConfigurationOneOf4Parser.g:117:1: ruleConfigurationPropertiesAbstract EOF
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
    // InternalConfigurationOneOf4Parser.g:124:1: ruleConfigurationPropertiesAbstract : ( ( ruleConfigurationAdditionalProperties ) ) ;
    public final void ruleConfigurationPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:128:2: ( ( ( ruleConfigurationAdditionalProperties ) ) )
            // InternalConfigurationOneOf4Parser.g:129:2: ( ( ruleConfigurationAdditionalProperties ) )
            {
            // InternalConfigurationOneOf4Parser.g:129:2: ( ( ruleConfigurationAdditionalProperties ) )
            // InternalConfigurationOneOf4Parser.g:130:3: ( ruleConfigurationAdditionalProperties )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationPropertiesAbstractAccess().getConfigurationAdditionalPropertiesParserRuleCall()); 
            }
            // InternalConfigurationOneOf4Parser.g:131:3: ( ruleConfigurationAdditionalProperties )
            // InternalConfigurationOneOf4Parser.g:131:4: ruleConfigurationAdditionalProperties
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
    // InternalConfigurationOneOf4Parser.g:140:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:141:1: ( ruleValue EOF )
            // InternalConfigurationOneOf4Parser.g:142:1: ruleValue EOF
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
    // InternalConfigurationOneOf4Parser.g:149:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:153:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalConfigurationOneOf4Parser.g:154:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalConfigurationOneOf4Parser.g:154:2: ( ( rule__Value__Alternatives ) )
            // InternalConfigurationOneOf4Parser.g:155:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf4Parser.g:156:3: ( rule__Value__Alternatives )
            // InternalConfigurationOneOf4Parser.g:156:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleConfigurationOneOf4Items"
    // InternalConfigurationOneOf4Parser.g:165:1: entryRuleConfigurationOneOf4Items : ruleConfigurationOneOf4Items EOF ;
    public final void entryRuleConfigurationOneOf4Items() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:166:1: ( ruleConfigurationOneOf4Items EOF )
            // InternalConfigurationOneOf4Parser.g:167:1: ruleConfigurationOneOf4Items EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4ItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConfigurationOneOf4Items();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4ItemsRule()); 
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
    // $ANTLR end "entryRuleConfigurationOneOf4Items"


    // $ANTLR start "ruleConfigurationOneOf4Items"
    // InternalConfigurationOneOf4Parser.g:174:1: ruleConfigurationOneOf4Items : ( ( rule__ConfigurationOneOf4Items__ItemsAssignment ) ) ;
    public final void ruleConfigurationOneOf4Items() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:178:2: ( ( ( rule__ConfigurationOneOf4Items__ItemsAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:179:2: ( ( rule__ConfigurationOneOf4Items__ItemsAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:179:2: ( ( rule__ConfigurationOneOf4Items__ItemsAssignment ) )
            // InternalConfigurationOneOf4Parser.g:180:3: ( rule__ConfigurationOneOf4Items__ItemsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4ItemsAccess().getItemsAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:181:3: ( rule__ConfigurationOneOf4Items__ItemsAssignment )
            // InternalConfigurationOneOf4Parser.g:181:4: rule__ConfigurationOneOf4Items__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4Items__ItemsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4ItemsAccess().getItemsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationOneOf4Items"


    // $ANTLR start "entryRuleConfiguration"
    // InternalConfigurationOneOf4Parser.g:190:1: entryRuleConfiguration : ruleConfiguration EOF ;
    public final void entryRuleConfiguration() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:191:1: ( ruleConfiguration EOF )
            // InternalConfigurationOneOf4Parser.g:192:1: ruleConfiguration EOF
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
    // InternalConfigurationOneOf4Parser.g:199:1: ruleConfiguration : ( ( rule__Configuration__ConfigurationAssignment ) ) ;
    public final void ruleConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:203:2: ( ( ( rule__Configuration__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:204:2: ( ( rule__Configuration__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:204:2: ( ( rule__Configuration__ConfigurationAssignment ) )
            // InternalConfigurationOneOf4Parser.g:205:3: ( rule__Configuration__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:206:3: ( rule__Configuration__ConfigurationAssignment )
            // InternalConfigurationOneOf4Parser.g:206:4: rule__Configuration__ConfigurationAssignment
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
    // InternalConfigurationOneOf4Parser.g:215:1: entryRuleConfigurationTypeString : ruleConfigurationTypeString EOF ;
    public final void entryRuleConfigurationTypeString() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:216:1: ( ruleConfigurationTypeString EOF )
            // InternalConfigurationOneOf4Parser.g:217:1: ruleConfigurationTypeString EOF
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
    // InternalConfigurationOneOf4Parser.g:224:1: ruleConfigurationTypeString : ( ( rule__ConfigurationTypeString__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:228:2: ( ( ( rule__ConfigurationTypeString__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:229:2: ( ( rule__ConfigurationTypeString__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:229:2: ( ( rule__ConfigurationTypeString__ConfigurationAssignment ) )
            // InternalConfigurationOneOf4Parser.g:230:3: ( rule__ConfigurationTypeString__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeStringAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:231:3: ( rule__ConfigurationTypeString__ConfigurationAssignment )
            // InternalConfigurationOneOf4Parser.g:231:4: rule__ConfigurationTypeString__ConfigurationAssignment
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
    // InternalConfigurationOneOf4Parser.g:240:1: entryRuleConfigurationTypeInteger : ruleConfigurationTypeInteger EOF ;
    public final void entryRuleConfigurationTypeInteger() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:241:1: ( ruleConfigurationTypeInteger EOF )
            // InternalConfigurationOneOf4Parser.g:242:1: ruleConfigurationTypeInteger EOF
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
    // InternalConfigurationOneOf4Parser.g:249:1: ruleConfigurationTypeInteger : ( ( rule__ConfigurationTypeInteger__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:253:2: ( ( ( rule__ConfigurationTypeInteger__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:254:2: ( ( rule__ConfigurationTypeInteger__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:254:2: ( ( rule__ConfigurationTypeInteger__ConfigurationAssignment ) )
            // InternalConfigurationOneOf4Parser.g:255:3: ( rule__ConfigurationTypeInteger__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeIntegerAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:256:3: ( rule__ConfigurationTypeInteger__ConfigurationAssignment )
            // InternalConfigurationOneOf4Parser.g:256:4: rule__ConfigurationTypeInteger__ConfigurationAssignment
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
    // InternalConfigurationOneOf4Parser.g:265:1: entryRuleConfigurationTypeNumber : ruleConfigurationTypeNumber EOF ;
    public final void entryRuleConfigurationTypeNumber() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:266:1: ( ruleConfigurationTypeNumber EOF )
            // InternalConfigurationOneOf4Parser.g:267:1: ruleConfigurationTypeNumber EOF
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
    // InternalConfigurationOneOf4Parser.g:274:1: ruleConfigurationTypeNumber : ( ( rule__ConfigurationTypeNumber__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:278:2: ( ( ( rule__ConfigurationTypeNumber__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:279:2: ( ( rule__ConfigurationTypeNumber__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:279:2: ( ( rule__ConfigurationTypeNumber__ConfigurationAssignment ) )
            // InternalConfigurationOneOf4Parser.g:280:3: ( rule__ConfigurationTypeNumber__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeNumberAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:281:3: ( rule__ConfigurationTypeNumber__ConfigurationAssignment )
            // InternalConfigurationOneOf4Parser.g:281:4: rule__ConfigurationTypeNumber__ConfigurationAssignment
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
    // InternalConfigurationOneOf4Parser.g:290:1: entryRuleConfigurationTypeBoolean : ruleConfigurationTypeBoolean EOF ;
    public final void entryRuleConfigurationTypeBoolean() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:291:1: ( ruleConfigurationTypeBoolean EOF )
            // InternalConfigurationOneOf4Parser.g:292:1: ruleConfigurationTypeBoolean EOF
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
    // InternalConfigurationOneOf4Parser.g:299:1: ruleConfigurationTypeBoolean : ( ( rule__ConfigurationTypeBoolean__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:303:2: ( ( ( rule__ConfigurationTypeBoolean__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:304:2: ( ( rule__ConfigurationTypeBoolean__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:304:2: ( ( rule__ConfigurationTypeBoolean__ConfigurationAssignment ) )
            // InternalConfigurationOneOf4Parser.g:305:3: ( rule__ConfigurationTypeBoolean__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeBooleanAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:306:3: ( rule__ConfigurationTypeBoolean__ConfigurationAssignment )
            // InternalConfigurationOneOf4Parser.g:306:4: rule__ConfigurationTypeBoolean__ConfigurationAssignment
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
    // InternalConfigurationOneOf4Parser.g:315:1: entryRuleConfigurationTypeObject : ruleConfigurationTypeObject EOF ;
    public final void entryRuleConfigurationTypeObject() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:316:1: ( ruleConfigurationTypeObject EOF )
            // InternalConfigurationOneOf4Parser.g:317:1: ruleConfigurationTypeObject EOF
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
    // InternalConfigurationOneOf4Parser.g:324:1: ruleConfigurationTypeObject : ( ( rule__ConfigurationTypeObject__Group__0 ) ) ;
    public final void ruleConfigurationTypeObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:328:2: ( ( ( rule__ConfigurationTypeObject__Group__0 ) ) )
            // InternalConfigurationOneOf4Parser.g:329:2: ( ( rule__ConfigurationTypeObject__Group__0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:329:2: ( ( rule__ConfigurationTypeObject__Group__0 ) )
            // InternalConfigurationOneOf4Parser.g:330:3: ( rule__ConfigurationTypeObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getGroup()); 
            }
            // InternalConfigurationOneOf4Parser.g:331:3: ( rule__ConfigurationTypeObject__Group__0 )
            // InternalConfigurationOneOf4Parser.g:331:4: rule__ConfigurationTypeObject__Group__0
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
    // InternalConfigurationOneOf4Parser.g:340:1: entryRuleConfigurationTypeArray : ruleConfigurationTypeArray EOF ;
    public final void entryRuleConfigurationTypeArray() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:341:1: ( ruleConfigurationTypeArray EOF )
            // InternalConfigurationOneOf4Parser.g:342:1: ruleConfigurationTypeArray EOF
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
    // InternalConfigurationOneOf4Parser.g:349:1: ruleConfigurationTypeArray : ( ( rule__ConfigurationTypeArray__Group__0 ) ) ;
    public final void ruleConfigurationTypeArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:353:2: ( ( ( rule__ConfigurationTypeArray__Group__0 ) ) )
            // InternalConfigurationOneOf4Parser.g:354:2: ( ( rule__ConfigurationTypeArray__Group__0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:354:2: ( ( rule__ConfigurationTypeArray__Group__0 ) )
            // InternalConfigurationOneOf4Parser.g:355:3: ( rule__ConfigurationTypeArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getGroup()); 
            }
            // InternalConfigurationOneOf4Parser.g:356:3: ( rule__ConfigurationTypeArray__Group__0 )
            // InternalConfigurationOneOf4Parser.g:356:4: rule__ConfigurationTypeArray__Group__0
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
    // InternalConfigurationOneOf4Parser.g:365:1: entryRuleConfigurationTypeNull : ruleConfigurationTypeNull EOF ;
    public final void entryRuleConfigurationTypeNull() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:366:1: ( ruleConfigurationTypeNull EOF )
            // InternalConfigurationOneOf4Parser.g:367:1: ruleConfigurationTypeNull EOF
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
    // InternalConfigurationOneOf4Parser.g:374:1: ruleConfigurationTypeNull : ( ( rule__ConfigurationTypeNull__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationTypeNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:378:2: ( ( ( rule__ConfigurationTypeNull__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:379:2: ( ( rule__ConfigurationTypeNull__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:379:2: ( ( rule__ConfigurationTypeNull__ConfigurationAssignment ) )
            // InternalConfigurationOneOf4Parser.g:380:3: ( rule__ConfigurationTypeNull__ConfigurationAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeNullAccess().getConfigurationAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:381:3: ( rule__ConfigurationTypeNull__ConfigurationAssignment )
            // InternalConfigurationOneOf4Parser.g:381:4: rule__ConfigurationTypeNull__ConfigurationAssignment
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


    // $ANTLR start "entryRuleEString"
    // InternalConfigurationOneOf4Parser.g:390:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:391:1: ( ruleEString EOF )
            // InternalConfigurationOneOf4Parser.g:392:1: ruleEString EOF
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
    // InternalConfigurationOneOf4Parser.g:399:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:403:2: ( ( ruleVALID_STRING ) )
            // InternalConfigurationOneOf4Parser.g:404:2: ( ruleVALID_STRING )
            {
            // InternalConfigurationOneOf4Parser.g:404:2: ( ruleVALID_STRING )
            // InternalConfigurationOneOf4Parser.g:405:3: ruleVALID_STRING
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


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalConfigurationOneOf4Parser.g:415:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:416:1: ( ruleEDoubleObject EOF )
            // InternalConfigurationOneOf4Parser.g:417:1: ruleEDoubleObject EOF
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
    // InternalConfigurationOneOf4Parser.g:424:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:428:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalConfigurationOneOf4Parser.g:429:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalConfigurationOneOf4Parser.g:429:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalConfigurationOneOf4Parser.g:430:3: ( rule__EDoubleObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf4Parser.g:431:3: ( rule__EDoubleObject__Alternatives )
            // InternalConfigurationOneOf4Parser.g:431:4: rule__EDoubleObject__Alternatives
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
    // InternalConfigurationOneOf4Parser.g:440:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:441:1: ( ruleEBooleanObject EOF )
            // InternalConfigurationOneOf4Parser.g:442:1: ruleEBooleanObject EOF
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
    // InternalConfigurationOneOf4Parser.g:449:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:453:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalConfigurationOneOf4Parser.g:454:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalConfigurationOneOf4Parser.g:454:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalConfigurationOneOf4Parser.g:455:3: ( rule__EBooleanObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf4Parser.g:456:3: ( rule__EBooleanObject__Alternatives )
            // InternalConfigurationOneOf4Parser.g:456:4: rule__EBooleanObject__Alternatives
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
    // InternalConfigurationOneOf4Parser.g:465:1: entryRuleConfigurationAdditionalProperties : ruleConfigurationAdditionalProperties EOF ;
    public final void entryRuleConfigurationAdditionalProperties() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:466:1: ( ruleConfigurationAdditionalProperties EOF )
            // InternalConfigurationOneOf4Parser.g:467:1: ruleConfigurationAdditionalProperties EOF
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
    // InternalConfigurationOneOf4Parser.g:474:1: ruleConfigurationAdditionalProperties : ( ( rule__ConfigurationAdditionalProperties__Group__0 ) ) ;
    public final void ruleConfigurationAdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:478:2: ( ( ( rule__ConfigurationAdditionalProperties__Group__0 ) ) )
            // InternalConfigurationOneOf4Parser.g:479:2: ( ( rule__ConfigurationAdditionalProperties__Group__0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:479:2: ( ( rule__ConfigurationAdditionalProperties__Group__0 ) )
            // InternalConfigurationOneOf4Parser.g:480:3: ( rule__ConfigurationAdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesAccess().getGroup()); 
            }
            // InternalConfigurationOneOf4Parser.g:481:3: ( rule__ConfigurationAdditionalProperties__Group__0 )
            // InternalConfigurationOneOf4Parser.g:481:4: rule__ConfigurationAdditionalProperties__Group__0
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
    // InternalConfigurationOneOf4Parser.g:490:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:491:1: ( ruleJsonDocument EOF )
            // InternalConfigurationOneOf4Parser.g:492:1: ruleJsonDocument EOF
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
    // InternalConfigurationOneOf4Parser.g:499:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:503:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:504:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:504:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalConfigurationOneOf4Parser.g:505:3: ( rule__JsonDocument__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:506:3: ( rule__JsonDocument__ValueAssignment )
            // InternalConfigurationOneOf4Parser.g:506:4: rule__JsonDocument__ValueAssignment
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
    // InternalConfigurationOneOf4Parser.g:515:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:516:1: ( ruleStringValue EOF )
            // InternalConfigurationOneOf4Parser.g:517:1: ruleStringValue EOF
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
    // InternalConfigurationOneOf4Parser.g:524:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:528:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:529:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:529:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalConfigurationOneOf4Parser.g:530:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:531:3: ( rule__StringValue__ValueAssignment )
            // InternalConfigurationOneOf4Parser.g:531:4: rule__StringValue__ValueAssignment
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
    // InternalConfigurationOneOf4Parser.g:540:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:541:1: ( ruleArrayValue EOF )
            // InternalConfigurationOneOf4Parser.g:542:1: ruleArrayValue EOF
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
    // InternalConfigurationOneOf4Parser.g:549:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:553:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalConfigurationOneOf4Parser.g:554:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:554:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalConfigurationOneOf4Parser.g:555:3: ( rule__ArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup()); 
            }
            // InternalConfigurationOneOf4Parser.g:556:3: ( rule__ArrayValue__Group__0 )
            // InternalConfigurationOneOf4Parser.g:556:4: rule__ArrayValue__Group__0
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
    // InternalConfigurationOneOf4Parser.g:565:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:566:1: ( ruleNullValue EOF )
            // InternalConfigurationOneOf4Parser.g:567:1: ruleNullValue EOF
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
    // InternalConfigurationOneOf4Parser.g:574:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:578:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:579:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:579:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalConfigurationOneOf4Parser.g:580:3: ( rule__NullValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:581:3: ( rule__NullValue__ValueAssignment )
            // InternalConfigurationOneOf4Parser.g:581:4: rule__NullValue__ValueAssignment
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
    // InternalConfigurationOneOf4Parser.g:590:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:591:1: ( ruleNumberValue EOF )
            // InternalConfigurationOneOf4Parser.g:592:1: ruleNumberValue EOF
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
    // InternalConfigurationOneOf4Parser.g:599:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:603:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:604:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:604:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalConfigurationOneOf4Parser.g:605:3: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:606:3: ( rule__NumberValue__ValueAssignment )
            // InternalConfigurationOneOf4Parser.g:606:4: rule__NumberValue__ValueAssignment
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
    // InternalConfigurationOneOf4Parser.g:615:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:616:1: ( ruleObjectValue EOF )
            // InternalConfigurationOneOf4Parser.g:617:1: ruleObjectValue EOF
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
    // InternalConfigurationOneOf4Parser.g:624:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:628:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalConfigurationOneOf4Parser.g:629:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:629:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalConfigurationOneOf4Parser.g:630:3: ( rule__ObjectValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup()); 
            }
            // InternalConfigurationOneOf4Parser.g:631:3: ( rule__ObjectValue__Group__0 )
            // InternalConfigurationOneOf4Parser.g:631:4: rule__ObjectValue__Group__0
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
    // InternalConfigurationOneOf4Parser.g:640:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:641:1: ( ruleBooleanValue EOF )
            // InternalConfigurationOneOf4Parser.g:642:1: ruleBooleanValue EOF
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
    // InternalConfigurationOneOf4Parser.g:649:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:653:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:654:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:654:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalConfigurationOneOf4Parser.g:655:3: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:656:3: ( rule__BooleanValue__ValueAssignment )
            // InternalConfigurationOneOf4Parser.g:656:4: rule__BooleanValue__ValueAssignment
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
    // InternalConfigurationOneOf4Parser.g:665:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:666:1: ( ruleEDouble EOF )
            // InternalConfigurationOneOf4Parser.g:667:1: ruleEDouble EOF
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
    // InternalConfigurationOneOf4Parser.g:674:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:678:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalConfigurationOneOf4Parser.g:679:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalConfigurationOneOf4Parser.g:679:2: ( ( rule__EDouble__Alternatives ) )
            // InternalConfigurationOneOf4Parser.g:680:3: ( rule__EDouble__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf4Parser.g:681:3: ( rule__EDouble__Alternatives )
            // InternalConfigurationOneOf4Parser.g:681:4: rule__EDouble__Alternatives
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
    // InternalConfigurationOneOf4Parser.g:690:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:691:1: ( ruleKeyValuePair EOF )
            // InternalConfigurationOneOf4Parser.g:692:1: ruleKeyValuePair EOF
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
    // InternalConfigurationOneOf4Parser.g:699:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:703:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalConfigurationOneOf4Parser.g:704:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:704:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalConfigurationOneOf4Parser.g:705:3: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // InternalConfigurationOneOf4Parser.g:706:3: ( rule__KeyValuePair__Group__0 )
            // InternalConfigurationOneOf4Parser.g:706:4: rule__KeyValuePair__Group__0
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
    // InternalConfigurationOneOf4Parser.g:715:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:716:1: ( ruleEBoolean EOF )
            // InternalConfigurationOneOf4Parser.g:717:1: ruleEBoolean EOF
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
    // InternalConfigurationOneOf4Parser.g:724:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:728:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalConfigurationOneOf4Parser.g:729:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalConfigurationOneOf4Parser.g:729:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalConfigurationOneOf4Parser.g:730:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalConfigurationOneOf4Parser.g:731:3: ( rule__EBoolean__Alternatives )
            // InternalConfigurationOneOf4Parser.g:731:4: rule__EBoolean__Alternatives
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
    // InternalConfigurationOneOf4Parser.g:740:1: entryRuleConfigurationItems : ruleConfigurationItems EOF ;
    public final void entryRuleConfigurationItems() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:741:1: ( ruleConfigurationItems EOF )
            // InternalConfigurationOneOf4Parser.g:742:1: ruleConfigurationItems EOF
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
    // InternalConfigurationOneOf4Parser.g:749:1: ruleConfigurationItems : ( ( rule__ConfigurationItems__ItemsAssignment ) ) ;
    public final void ruleConfigurationItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:753:2: ( ( ( rule__ConfigurationItems__ItemsAssignment ) ) )
            // InternalConfigurationOneOf4Parser.g:754:2: ( ( rule__ConfigurationItems__ItemsAssignment ) )
            {
            // InternalConfigurationOneOf4Parser.g:754:2: ( ( rule__ConfigurationItems__ItemsAssignment ) )
            // InternalConfigurationOneOf4Parser.g:755:3: ( rule__ConfigurationItems__ItemsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationItemsAccess().getItemsAssignment()); 
            }
            // InternalConfigurationOneOf4Parser.g:756:3: ( rule__ConfigurationItems__ItemsAssignment )
            // InternalConfigurationOneOf4Parser.g:756:4: rule__ConfigurationItems__ItemsAssignment
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
    // InternalConfigurationOneOf4Parser.g:765:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalConfigurationOneOf4Parser.g:766:1: ( ruleVALID_STRING EOF )
            // InternalConfigurationOneOf4Parser.g:767:1: ruleVALID_STRING EOF
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
    // InternalConfigurationOneOf4Parser.g:774:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:778:2: ( ( RULE_STRING ) )
            // InternalConfigurationOneOf4Parser.g:779:2: ( RULE_STRING )
            {
            // InternalConfigurationOneOf4Parser.g:779:2: ( RULE_STRING )
            // InternalConfigurationOneOf4Parser.g:780:3: RULE_STRING
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
    // InternalConfigurationOneOf4Parser.g:790:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:794:1: ( ( ( Null ) ) )
            // InternalConfigurationOneOf4Parser.g:795:2: ( ( Null ) )
            {
            // InternalConfigurationOneOf4Parser.g:795:2: ( ( Null ) )
            // InternalConfigurationOneOf4Parser.g:796:3: ( Null )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            }
            // InternalConfigurationOneOf4Parser.g:797:3: ( Null )
            // InternalConfigurationOneOf4Parser.g:797:4: Null
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
    // InternalConfigurationOneOf4Parser.g:805:1: rule__ConfigurationAbstract__Alternatives : ( ( ( ruleConfigurationTypeNumber ) ) | ( ruleConfigurationTypeString ) | ( ruleConfigurationTypeInteger ) | ( ruleConfigurationTypeBoolean ) | ( ruleConfigurationTypeObject ) | ( ruleConfigurationTypeArray ) | ( ruleConfigurationTypeNull ) );
    public final void rule__ConfigurationAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:809:1: ( ( ( ruleConfigurationTypeNumber ) ) | ( ruleConfigurationTypeString ) | ( ruleConfigurationTypeInteger ) | ( ruleConfigurationTypeBoolean ) | ( ruleConfigurationTypeObject ) | ( ruleConfigurationTypeArray ) | ( ruleConfigurationTypeNull ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalConfigurationOneOf4Parser.g:810:2: ( ( ruleConfigurationTypeNumber ) )
                    {
                    // InternalConfigurationOneOf4Parser.g:810:2: ( ( ruleConfigurationTypeNumber ) )
                    // InternalConfigurationOneOf4Parser.g:811:3: ( ruleConfigurationTypeNumber )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNumberParserRuleCall_0()); 
                    }
                    // InternalConfigurationOneOf4Parser.g:812:3: ( ruleConfigurationTypeNumber )
                    // InternalConfigurationOneOf4Parser.g:812:4: ruleConfigurationTypeNumber
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
                    // InternalConfigurationOneOf4Parser.g:816:2: ( ruleConfigurationTypeString )
                    {
                    // InternalConfigurationOneOf4Parser.g:816:2: ( ruleConfigurationTypeString )
                    // InternalConfigurationOneOf4Parser.g:817:3: ruleConfigurationTypeString
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
                    // InternalConfigurationOneOf4Parser.g:822:2: ( ruleConfigurationTypeInteger )
                    {
                    // InternalConfigurationOneOf4Parser.g:822:2: ( ruleConfigurationTypeInteger )
                    // InternalConfigurationOneOf4Parser.g:823:3: ruleConfigurationTypeInteger
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
                    // InternalConfigurationOneOf4Parser.g:828:2: ( ruleConfigurationTypeBoolean )
                    {
                    // InternalConfigurationOneOf4Parser.g:828:2: ( ruleConfigurationTypeBoolean )
                    // InternalConfigurationOneOf4Parser.g:829:3: ruleConfigurationTypeBoolean
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
                    // InternalConfigurationOneOf4Parser.g:834:2: ( ruleConfigurationTypeObject )
                    {
                    // InternalConfigurationOneOf4Parser.g:834:2: ( ruleConfigurationTypeObject )
                    // InternalConfigurationOneOf4Parser.g:835:3: ruleConfigurationTypeObject
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
                    // InternalConfigurationOneOf4Parser.g:840:2: ( ruleConfigurationTypeArray )
                    {
                    // InternalConfigurationOneOf4Parser.g:840:2: ( ruleConfigurationTypeArray )
                    // InternalConfigurationOneOf4Parser.g:841:3: ruleConfigurationTypeArray
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
                    // InternalConfigurationOneOf4Parser.g:846:2: ( ruleConfigurationTypeNull )
                    {
                    // InternalConfigurationOneOf4Parser.g:846:2: ( ruleConfigurationTypeNull )
                    // InternalConfigurationOneOf4Parser.g:847:3: ruleConfigurationTypeNull
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
    // InternalConfigurationOneOf4Parser.g:856:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:860:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
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
                    // InternalConfigurationOneOf4Parser.g:861:2: ( ruleStringValue )
                    {
                    // InternalConfigurationOneOf4Parser.g:861:2: ( ruleStringValue )
                    // InternalConfigurationOneOf4Parser.g:862:3: ruleStringValue
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
                    // InternalConfigurationOneOf4Parser.g:867:2: ( ruleArrayValue )
                    {
                    // InternalConfigurationOneOf4Parser.g:867:2: ( ruleArrayValue )
                    // InternalConfigurationOneOf4Parser.g:868:3: ruleArrayValue
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
                    // InternalConfigurationOneOf4Parser.g:873:2: ( ruleNullValue )
                    {
                    // InternalConfigurationOneOf4Parser.g:873:2: ( ruleNullValue )
                    // InternalConfigurationOneOf4Parser.g:874:3: ruleNullValue
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
                    // InternalConfigurationOneOf4Parser.g:879:2: ( ruleNumberValue )
                    {
                    // InternalConfigurationOneOf4Parser.g:879:2: ( ruleNumberValue )
                    // InternalConfigurationOneOf4Parser.g:880:3: ruleNumberValue
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
                    // InternalConfigurationOneOf4Parser.g:885:2: ( ruleObjectValue )
                    {
                    // InternalConfigurationOneOf4Parser.g:885:2: ( ruleObjectValue )
                    // InternalConfigurationOneOf4Parser.g:886:3: ruleObjectValue
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
                    // InternalConfigurationOneOf4Parser.g:891:2: ( ruleBooleanValue )
                    {
                    // InternalConfigurationOneOf4Parser.g:891:2: ( ruleBooleanValue )
                    // InternalConfigurationOneOf4Parser.g:892:3: ruleBooleanValue
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
    // InternalConfigurationOneOf4Parser.g:901:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:905:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalConfigurationOneOf4Parser.g:906:2: ( RULE_E_INT )
                    {
                    // InternalConfigurationOneOf4Parser.g:906:2: ( RULE_E_INT )
                    // InternalConfigurationOneOf4Parser.g:907:3: RULE_E_INT
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
                    // InternalConfigurationOneOf4Parser.g:912:2: ( RULE_E_DOUBLE )
                    {
                    // InternalConfigurationOneOf4Parser.g:912:2: ( RULE_E_DOUBLE )
                    // InternalConfigurationOneOf4Parser.g:913:3: RULE_E_DOUBLE
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
    // InternalConfigurationOneOf4Parser.g:922:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:926:1: ( ( True ) | ( False ) )
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
                    // InternalConfigurationOneOf4Parser.g:927:2: ( True )
                    {
                    // InternalConfigurationOneOf4Parser.g:927:2: ( True )
                    // InternalConfigurationOneOf4Parser.g:928:3: True
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
                    // InternalConfigurationOneOf4Parser.g:933:2: ( False )
                    {
                    // InternalConfigurationOneOf4Parser.g:933:2: ( False )
                    // InternalConfigurationOneOf4Parser.g:934:3: False
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
    // InternalConfigurationOneOf4Parser.g:943:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:947:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalConfigurationOneOf4Parser.g:948:2: ( RULE_E_INT )
                    {
                    // InternalConfigurationOneOf4Parser.g:948:2: ( RULE_E_INT )
                    // InternalConfigurationOneOf4Parser.g:949:3: RULE_E_INT
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
                    // InternalConfigurationOneOf4Parser.g:954:2: ( RULE_E_DOUBLE )
                    {
                    // InternalConfigurationOneOf4Parser.g:954:2: ( RULE_E_DOUBLE )
                    // InternalConfigurationOneOf4Parser.g:955:3: RULE_E_DOUBLE
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
    // InternalConfigurationOneOf4Parser.g:964:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:968:1: ( ( True ) | ( False ) )
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
                    // InternalConfigurationOneOf4Parser.g:969:2: ( True )
                    {
                    // InternalConfigurationOneOf4Parser.g:969:2: ( True )
                    // InternalConfigurationOneOf4Parser.g:970:3: True
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
                    // InternalConfigurationOneOf4Parser.g:975:2: ( False )
                    {
                    // InternalConfigurationOneOf4Parser.g:975:2: ( False )
                    // InternalConfigurationOneOf4Parser.g:976:3: False
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


    // $ANTLR start "rule__ConfigurationOneOf4__Group__0"
    // InternalConfigurationOneOf4Parser.g:985:1: rule__ConfigurationOneOf4__Group__0 : rule__ConfigurationOneOf4__Group__0__Impl rule__ConfigurationOneOf4__Group__1 ;
    public final void rule__ConfigurationOneOf4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:989:1: ( rule__ConfigurationOneOf4__Group__0__Impl rule__ConfigurationOneOf4__Group__1 )
            // InternalConfigurationOneOf4Parser.g:990:2: rule__ConfigurationOneOf4__Group__0__Impl rule__ConfigurationOneOf4__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConfigurationOneOf4__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__Group__1();

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
    // $ANTLR end "rule__ConfigurationOneOf4__Group__0"


    // $ANTLR start "rule__ConfigurationOneOf4__Group__0__Impl"
    // InternalConfigurationOneOf4Parser.g:997:1: rule__ConfigurationOneOf4__Group__0__Impl : ( () ) ;
    public final void rule__ConfigurationOneOf4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1001:1: ( ( () ) )
            // InternalConfigurationOneOf4Parser.g:1002:1: ( () )
            {
            // InternalConfigurationOneOf4Parser.g:1002:1: ( () )
            // InternalConfigurationOneOf4Parser.g:1003:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getConfigurationOneOf4Action_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1004:2: ()
            // InternalConfigurationOneOf4Parser.g:1004:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getConfigurationOneOf4Action_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__Group__0__Impl"


    // $ANTLR start "rule__ConfigurationOneOf4__Group__1"
    // InternalConfigurationOneOf4Parser.g:1012:1: rule__ConfigurationOneOf4__Group__1 : rule__ConfigurationOneOf4__Group__1__Impl rule__ConfigurationOneOf4__Group__2 ;
    public final void rule__ConfigurationOneOf4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1016:1: ( rule__ConfigurationOneOf4__Group__1__Impl rule__ConfigurationOneOf4__Group__2 )
            // InternalConfigurationOneOf4Parser.g:1017:2: rule__ConfigurationOneOf4__Group__1__Impl rule__ConfigurationOneOf4__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConfigurationOneOf4__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__Group__2();

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
    // $ANTLR end "rule__ConfigurationOneOf4__Group__1"


    // $ANTLR start "rule__ConfigurationOneOf4__Group__1__Impl"
    // InternalConfigurationOneOf4Parser.g:1024:1: rule__ConfigurationOneOf4__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ConfigurationOneOf4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1028:1: ( ( LeftSquareBracket ) )
            // InternalConfigurationOneOf4Parser.g:1029:1: ( LeftSquareBracket )
            {
            // InternalConfigurationOneOf4Parser.g:1029:1: ( LeftSquareBracket )
            // InternalConfigurationOneOf4Parser.g:1030:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__Group__1__Impl"


    // $ANTLR start "rule__ConfigurationOneOf4__Group__2"
    // InternalConfigurationOneOf4Parser.g:1039:1: rule__ConfigurationOneOf4__Group__2 : rule__ConfigurationOneOf4__Group__2__Impl rule__ConfigurationOneOf4__Group__3 ;
    public final void rule__ConfigurationOneOf4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1043:1: ( rule__ConfigurationOneOf4__Group__2__Impl rule__ConfigurationOneOf4__Group__3 )
            // InternalConfigurationOneOf4Parser.g:1044:2: rule__ConfigurationOneOf4__Group__2__Impl rule__ConfigurationOneOf4__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ConfigurationOneOf4__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__Group__3();

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
    // $ANTLR end "rule__ConfigurationOneOf4__Group__2"


    // $ANTLR start "rule__ConfigurationOneOf4__Group__2__Impl"
    // InternalConfigurationOneOf4Parser.g:1051:1: rule__ConfigurationOneOf4__Group__2__Impl : ( ( rule__ConfigurationOneOf4__Group_2__0 )? ) ;
    public final void rule__ConfigurationOneOf4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1055:1: ( ( ( rule__ConfigurationOneOf4__Group_2__0 )? ) )
            // InternalConfigurationOneOf4Parser.g:1056:1: ( ( rule__ConfigurationOneOf4__Group_2__0 )? )
            {
            // InternalConfigurationOneOf4Parser.g:1056:1: ( ( rule__ConfigurationOneOf4__Group_2__0 )? )
            // InternalConfigurationOneOf4Parser.g:1057:2: ( rule__ConfigurationOneOf4__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getGroup_2()); 
            }
            // InternalConfigurationOneOf4Parser.g:1058:2: ( rule__ConfigurationOneOf4__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=False && LA7_0<=True)||LA7_0==LeftSquareBracket||LA7_0==LeftCurlyBracket||(LA7_0>=RULE_STRING && LA7_0<=RULE_E_DOUBLE)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConfigurationOneOf4Parser.g:1058:3: rule__ConfigurationOneOf4__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConfigurationOneOf4__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__Group__2__Impl"


    // $ANTLR start "rule__ConfigurationOneOf4__Group__3"
    // InternalConfigurationOneOf4Parser.g:1066:1: rule__ConfigurationOneOf4__Group__3 : rule__ConfigurationOneOf4__Group__3__Impl ;
    public final void rule__ConfigurationOneOf4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1070:1: ( rule__ConfigurationOneOf4__Group__3__Impl )
            // InternalConfigurationOneOf4Parser.g:1071:2: rule__ConfigurationOneOf4__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__Group__3__Impl();

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
    // $ANTLR end "rule__ConfigurationOneOf4__Group__3"


    // $ANTLR start "rule__ConfigurationOneOf4__Group__3__Impl"
    // InternalConfigurationOneOf4Parser.g:1077:1: rule__ConfigurationOneOf4__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ConfigurationOneOf4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1081:1: ( ( RightSquareBracket ) )
            // InternalConfigurationOneOf4Parser.g:1082:1: ( RightSquareBracket )
            {
            // InternalConfigurationOneOf4Parser.g:1082:1: ( RightSquareBracket )
            // InternalConfigurationOneOf4Parser.g:1083:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__Group__3__Impl"


    // $ANTLR start "rule__ConfigurationOneOf4__Group_2__0"
    // InternalConfigurationOneOf4Parser.g:1093:1: rule__ConfigurationOneOf4__Group_2__0 : rule__ConfigurationOneOf4__Group_2__0__Impl rule__ConfigurationOneOf4__Group_2__1 ;
    public final void rule__ConfigurationOneOf4__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1097:1: ( rule__ConfigurationOneOf4__Group_2__0__Impl rule__ConfigurationOneOf4__Group_2__1 )
            // InternalConfigurationOneOf4Parser.g:1098:2: rule__ConfigurationOneOf4__Group_2__0__Impl rule__ConfigurationOneOf4__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ConfigurationOneOf4__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__Group_2__1();

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
    // $ANTLR end "rule__ConfigurationOneOf4__Group_2__0"


    // $ANTLR start "rule__ConfigurationOneOf4__Group_2__0__Impl"
    // InternalConfigurationOneOf4Parser.g:1105:1: rule__ConfigurationOneOf4__Group_2__0__Impl : ( ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_0 ) ) ;
    public final void rule__ConfigurationOneOf4__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1109:1: ( ( ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_0 ) ) )
            // InternalConfigurationOneOf4Parser.g:1110:1: ( ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1110:1: ( ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_0 ) )
            // InternalConfigurationOneOf4Parser.g:1111:2: ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getConfigurationAssignment_2_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1112:2: ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_0 )
            // InternalConfigurationOneOf4Parser.g:1112:3: rule__ConfigurationOneOf4__ConfigurationAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__ConfigurationAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getConfigurationAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__Group_2__0__Impl"


    // $ANTLR start "rule__ConfigurationOneOf4__Group_2__1"
    // InternalConfigurationOneOf4Parser.g:1120:1: rule__ConfigurationOneOf4__Group_2__1 : rule__ConfigurationOneOf4__Group_2__1__Impl ;
    public final void rule__ConfigurationOneOf4__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1124:1: ( rule__ConfigurationOneOf4__Group_2__1__Impl )
            // InternalConfigurationOneOf4Parser.g:1125:2: rule__ConfigurationOneOf4__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__Group_2__1__Impl();

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
    // $ANTLR end "rule__ConfigurationOneOf4__Group_2__1"


    // $ANTLR start "rule__ConfigurationOneOf4__Group_2__1__Impl"
    // InternalConfigurationOneOf4Parser.g:1131:1: rule__ConfigurationOneOf4__Group_2__1__Impl : ( ( rule__ConfigurationOneOf4__Group_2_1__0 )* ) ;
    public final void rule__ConfigurationOneOf4__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1135:1: ( ( ( rule__ConfigurationOneOf4__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf4Parser.g:1136:1: ( ( rule__ConfigurationOneOf4__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf4Parser.g:1136:1: ( ( rule__ConfigurationOneOf4__Group_2_1__0 )* )
            // InternalConfigurationOneOf4Parser.g:1137:2: ( rule__ConfigurationOneOf4__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:1138:2: ( rule__ConfigurationOneOf4__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalConfigurationOneOf4Parser.g:1138:3: rule__ConfigurationOneOf4__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ConfigurationOneOf4__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__Group_2__1__Impl"


    // $ANTLR start "rule__ConfigurationOneOf4__Group_2_1__0"
    // InternalConfigurationOneOf4Parser.g:1147:1: rule__ConfigurationOneOf4__Group_2_1__0 : rule__ConfigurationOneOf4__Group_2_1__0__Impl rule__ConfigurationOneOf4__Group_2_1__1 ;
    public final void rule__ConfigurationOneOf4__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1151:1: ( rule__ConfigurationOneOf4__Group_2_1__0__Impl rule__ConfigurationOneOf4__Group_2_1__1 )
            // InternalConfigurationOneOf4Parser.g:1152:2: rule__ConfigurationOneOf4__Group_2_1__0__Impl rule__ConfigurationOneOf4__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ConfigurationOneOf4__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__Group_2_1__1();

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
    // $ANTLR end "rule__ConfigurationOneOf4__Group_2_1__0"


    // $ANTLR start "rule__ConfigurationOneOf4__Group_2_1__0__Impl"
    // InternalConfigurationOneOf4Parser.g:1159:1: rule__ConfigurationOneOf4__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ConfigurationOneOf4__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1163:1: ( ( Comma ) )
            // InternalConfigurationOneOf4Parser.g:1164:1: ( Comma )
            {
            // InternalConfigurationOneOf4Parser.g:1164:1: ( Comma )
            // InternalConfigurationOneOf4Parser.g:1165:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__Group_2_1__0__Impl"


    // $ANTLR start "rule__ConfigurationOneOf4__Group_2_1__1"
    // InternalConfigurationOneOf4Parser.g:1174:1: rule__ConfigurationOneOf4__Group_2_1__1 : rule__ConfigurationOneOf4__Group_2_1__1__Impl ;
    public final void rule__ConfigurationOneOf4__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1178:1: ( rule__ConfigurationOneOf4__Group_2_1__1__Impl )
            // InternalConfigurationOneOf4Parser.g:1179:2: rule__ConfigurationOneOf4__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ConfigurationOneOf4__Group_2_1__1"


    // $ANTLR start "rule__ConfigurationOneOf4__Group_2_1__1__Impl"
    // InternalConfigurationOneOf4Parser.g:1185:1: rule__ConfigurationOneOf4__Group_2_1__1__Impl : ( ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1 ) ) ;
    public final void rule__ConfigurationOneOf4__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1189:1: ( ( ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf4Parser.g:1190:1: ( ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1190:1: ( ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1 ) )
            // InternalConfigurationOneOf4Parser.g:1191:2: ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getConfigurationAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:1192:2: ( rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1 )
            // InternalConfigurationOneOf4Parser.g:1192:3: rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getConfigurationAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__Group_2_1__1__Impl"


    // $ANTLR start "rule__ConfigurationTypeObject__Group__0"
    // InternalConfigurationOneOf4Parser.g:1201:1: rule__ConfigurationTypeObject__Group__0 : rule__ConfigurationTypeObject__Group__0__Impl rule__ConfigurationTypeObject__Group__1 ;
    public final void rule__ConfigurationTypeObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1205:1: ( rule__ConfigurationTypeObject__Group__0__Impl rule__ConfigurationTypeObject__Group__1 )
            // InternalConfigurationOneOf4Parser.g:1206:2: rule__ConfigurationTypeObject__Group__0__Impl rule__ConfigurationTypeObject__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalConfigurationOneOf4Parser.g:1213:1: rule__ConfigurationTypeObject__Group__0__Impl : ( () ) ;
    public final void rule__ConfigurationTypeObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1217:1: ( ( () ) )
            // InternalConfigurationOneOf4Parser.g:1218:1: ( () )
            {
            // InternalConfigurationOneOf4Parser.g:1218:1: ( () )
            // InternalConfigurationOneOf4Parser.g:1219:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationTypeObjectAction_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1220:2: ()
            // InternalConfigurationOneOf4Parser.g:1220:3: 
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
    // InternalConfigurationOneOf4Parser.g:1228:1: rule__ConfigurationTypeObject__Group__1 : rule__ConfigurationTypeObject__Group__1__Impl rule__ConfigurationTypeObject__Group__2 ;
    public final void rule__ConfigurationTypeObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1232:1: ( rule__ConfigurationTypeObject__Group__1__Impl rule__ConfigurationTypeObject__Group__2 )
            // InternalConfigurationOneOf4Parser.g:1233:2: rule__ConfigurationTypeObject__Group__1__Impl rule__ConfigurationTypeObject__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalConfigurationOneOf4Parser.g:1240:1: rule__ConfigurationTypeObject__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ConfigurationTypeObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1244:1: ( ( LeftCurlyBracket ) )
            // InternalConfigurationOneOf4Parser.g:1245:1: ( LeftCurlyBracket )
            {
            // InternalConfigurationOneOf4Parser.g:1245:1: ( LeftCurlyBracket )
            // InternalConfigurationOneOf4Parser.g:1246:2: LeftCurlyBracket
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
    // InternalConfigurationOneOf4Parser.g:1255:1: rule__ConfigurationTypeObject__Group__2 : rule__ConfigurationTypeObject__Group__2__Impl rule__ConfigurationTypeObject__Group__3 ;
    public final void rule__ConfigurationTypeObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1259:1: ( rule__ConfigurationTypeObject__Group__2__Impl rule__ConfigurationTypeObject__Group__3 )
            // InternalConfigurationOneOf4Parser.g:1260:2: rule__ConfigurationTypeObject__Group__2__Impl rule__ConfigurationTypeObject__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalConfigurationOneOf4Parser.g:1267:1: rule__ConfigurationTypeObject__Group__2__Impl : ( ( rule__ConfigurationTypeObject__Group_2__0 )? ) ;
    public final void rule__ConfigurationTypeObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1271:1: ( ( ( rule__ConfigurationTypeObject__Group_2__0 )? ) )
            // InternalConfigurationOneOf4Parser.g:1272:1: ( ( rule__ConfigurationTypeObject__Group_2__0 )? )
            {
            // InternalConfigurationOneOf4Parser.g:1272:1: ( ( rule__ConfigurationTypeObject__Group_2__0 )? )
            // InternalConfigurationOneOf4Parser.g:1273:2: ( rule__ConfigurationTypeObject__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getGroup_2()); 
            }
            // InternalConfigurationOneOf4Parser.g:1274:2: ( rule__ConfigurationTypeObject__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConfigurationOneOf4Parser.g:1274:3: rule__ConfigurationTypeObject__Group_2__0
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
    // InternalConfigurationOneOf4Parser.g:1282:1: rule__ConfigurationTypeObject__Group__3 : rule__ConfigurationTypeObject__Group__3__Impl ;
    public final void rule__ConfigurationTypeObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1286:1: ( rule__ConfigurationTypeObject__Group__3__Impl )
            // InternalConfigurationOneOf4Parser.g:1287:2: rule__ConfigurationTypeObject__Group__3__Impl
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
    // InternalConfigurationOneOf4Parser.g:1293:1: rule__ConfigurationTypeObject__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ConfigurationTypeObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1297:1: ( ( RightCurlyBracket ) )
            // InternalConfigurationOneOf4Parser.g:1298:1: ( RightCurlyBracket )
            {
            // InternalConfigurationOneOf4Parser.g:1298:1: ( RightCurlyBracket )
            // InternalConfigurationOneOf4Parser.g:1299:2: RightCurlyBracket
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
    // InternalConfigurationOneOf4Parser.g:1309:1: rule__ConfigurationTypeObject__Group_2__0 : rule__ConfigurationTypeObject__Group_2__0__Impl rule__ConfigurationTypeObject__Group_2__1 ;
    public final void rule__ConfigurationTypeObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1313:1: ( rule__ConfigurationTypeObject__Group_2__0__Impl rule__ConfigurationTypeObject__Group_2__1 )
            // InternalConfigurationOneOf4Parser.g:1314:2: rule__ConfigurationTypeObject__Group_2__0__Impl rule__ConfigurationTypeObject__Group_2__1
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
    // InternalConfigurationOneOf4Parser.g:1321:1: rule__ConfigurationTypeObject__Group_2__0__Impl : ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 ) ) ;
    public final void rule__ConfigurationTypeObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1325:1: ( ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 ) ) )
            // InternalConfigurationOneOf4Parser.g:1326:1: ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1326:1: ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 ) )
            // InternalConfigurationOneOf4Parser.g:1327:2: ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationAssignment_2_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1328:2: ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 )
            // InternalConfigurationOneOf4Parser.g:1328:3: rule__ConfigurationTypeObject__ConfigurationAssignment_2_0
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
    // InternalConfigurationOneOf4Parser.g:1336:1: rule__ConfigurationTypeObject__Group_2__1 : rule__ConfigurationTypeObject__Group_2__1__Impl ;
    public final void rule__ConfigurationTypeObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1340:1: ( rule__ConfigurationTypeObject__Group_2__1__Impl )
            // InternalConfigurationOneOf4Parser.g:1341:2: rule__ConfigurationTypeObject__Group_2__1__Impl
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
    // InternalConfigurationOneOf4Parser.g:1347:1: rule__ConfigurationTypeObject__Group_2__1__Impl : ( ( rule__ConfigurationTypeObject__Group_2_1__0 )* ) ;
    public final void rule__ConfigurationTypeObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1351:1: ( ( ( rule__ConfigurationTypeObject__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf4Parser.g:1352:1: ( ( rule__ConfigurationTypeObject__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf4Parser.g:1352:1: ( ( rule__ConfigurationTypeObject__Group_2_1__0 )* )
            // InternalConfigurationOneOf4Parser.g:1353:2: ( rule__ConfigurationTypeObject__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:1354:2: ( rule__ConfigurationTypeObject__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalConfigurationOneOf4Parser.g:1354:3: rule__ConfigurationTypeObject__Group_2_1__0
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
    // InternalConfigurationOneOf4Parser.g:1363:1: rule__ConfigurationTypeObject__Group_2_1__0 : rule__ConfigurationTypeObject__Group_2_1__0__Impl rule__ConfigurationTypeObject__Group_2_1__1 ;
    public final void rule__ConfigurationTypeObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1367:1: ( rule__ConfigurationTypeObject__Group_2_1__0__Impl rule__ConfigurationTypeObject__Group_2_1__1 )
            // InternalConfigurationOneOf4Parser.g:1368:2: rule__ConfigurationTypeObject__Group_2_1__0__Impl rule__ConfigurationTypeObject__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalConfigurationOneOf4Parser.g:1375:1: rule__ConfigurationTypeObject__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ConfigurationTypeObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1379:1: ( ( Comma ) )
            // InternalConfigurationOneOf4Parser.g:1380:1: ( Comma )
            {
            // InternalConfigurationOneOf4Parser.g:1380:1: ( Comma )
            // InternalConfigurationOneOf4Parser.g:1381:2: Comma
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
    // InternalConfigurationOneOf4Parser.g:1390:1: rule__ConfigurationTypeObject__Group_2_1__1 : rule__ConfigurationTypeObject__Group_2_1__1__Impl ;
    public final void rule__ConfigurationTypeObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1394:1: ( rule__ConfigurationTypeObject__Group_2_1__1__Impl )
            // InternalConfigurationOneOf4Parser.g:1395:2: rule__ConfigurationTypeObject__Group_2_1__1__Impl
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
    // InternalConfigurationOneOf4Parser.g:1401:1: rule__ConfigurationTypeObject__Group_2_1__1__Impl : ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 ) ) ;
    public final void rule__ConfigurationTypeObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1405:1: ( ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf4Parser.g:1406:1: ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1406:1: ( ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 ) )
            // InternalConfigurationOneOf4Parser.g:1407:2: ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:1408:2: ( rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 )
            // InternalConfigurationOneOf4Parser.g:1408:3: rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1
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
    // InternalConfigurationOneOf4Parser.g:1417:1: rule__ConfigurationTypeArray__Group__0 : rule__ConfigurationTypeArray__Group__0__Impl rule__ConfigurationTypeArray__Group__1 ;
    public final void rule__ConfigurationTypeArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1421:1: ( rule__ConfigurationTypeArray__Group__0__Impl rule__ConfigurationTypeArray__Group__1 )
            // InternalConfigurationOneOf4Parser.g:1422:2: rule__ConfigurationTypeArray__Group__0__Impl rule__ConfigurationTypeArray__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalConfigurationOneOf4Parser.g:1429:1: rule__ConfigurationTypeArray__Group__0__Impl : ( () ) ;
    public final void rule__ConfigurationTypeArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1433:1: ( ( () ) )
            // InternalConfigurationOneOf4Parser.g:1434:1: ( () )
            {
            // InternalConfigurationOneOf4Parser.g:1434:1: ( () )
            // InternalConfigurationOneOf4Parser.g:1435:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationTypeArrayAction_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1436:2: ()
            // InternalConfigurationOneOf4Parser.g:1436:3: 
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
    // InternalConfigurationOneOf4Parser.g:1444:1: rule__ConfigurationTypeArray__Group__1 : rule__ConfigurationTypeArray__Group__1__Impl rule__ConfigurationTypeArray__Group__2 ;
    public final void rule__ConfigurationTypeArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1448:1: ( rule__ConfigurationTypeArray__Group__1__Impl rule__ConfigurationTypeArray__Group__2 )
            // InternalConfigurationOneOf4Parser.g:1449:2: rule__ConfigurationTypeArray__Group__1__Impl rule__ConfigurationTypeArray__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalConfigurationOneOf4Parser.g:1456:1: rule__ConfigurationTypeArray__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ConfigurationTypeArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1460:1: ( ( LeftSquareBracket ) )
            // InternalConfigurationOneOf4Parser.g:1461:1: ( LeftSquareBracket )
            {
            // InternalConfigurationOneOf4Parser.g:1461:1: ( LeftSquareBracket )
            // InternalConfigurationOneOf4Parser.g:1462:2: LeftSquareBracket
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
    // InternalConfigurationOneOf4Parser.g:1471:1: rule__ConfigurationTypeArray__Group__2 : rule__ConfigurationTypeArray__Group__2__Impl rule__ConfigurationTypeArray__Group__3 ;
    public final void rule__ConfigurationTypeArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1475:1: ( rule__ConfigurationTypeArray__Group__2__Impl rule__ConfigurationTypeArray__Group__3 )
            // InternalConfigurationOneOf4Parser.g:1476:2: rule__ConfigurationTypeArray__Group__2__Impl rule__ConfigurationTypeArray__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalConfigurationOneOf4Parser.g:1483:1: rule__ConfigurationTypeArray__Group__2__Impl : ( ( rule__ConfigurationTypeArray__Group_2__0 )? ) ;
    public final void rule__ConfigurationTypeArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1487:1: ( ( ( rule__ConfigurationTypeArray__Group_2__0 )? ) )
            // InternalConfigurationOneOf4Parser.g:1488:1: ( ( rule__ConfigurationTypeArray__Group_2__0 )? )
            {
            // InternalConfigurationOneOf4Parser.g:1488:1: ( ( rule__ConfigurationTypeArray__Group_2__0 )? )
            // InternalConfigurationOneOf4Parser.g:1489:2: ( rule__ConfigurationTypeArray__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getGroup_2()); 
            }
            // InternalConfigurationOneOf4Parser.g:1490:2: ( rule__ConfigurationTypeArray__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=False && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalConfigurationOneOf4Parser.g:1490:3: rule__ConfigurationTypeArray__Group_2__0
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
    // InternalConfigurationOneOf4Parser.g:1498:1: rule__ConfigurationTypeArray__Group__3 : rule__ConfigurationTypeArray__Group__3__Impl ;
    public final void rule__ConfigurationTypeArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1502:1: ( rule__ConfigurationTypeArray__Group__3__Impl )
            // InternalConfigurationOneOf4Parser.g:1503:2: rule__ConfigurationTypeArray__Group__3__Impl
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
    // InternalConfigurationOneOf4Parser.g:1509:1: rule__ConfigurationTypeArray__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ConfigurationTypeArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1513:1: ( ( RightSquareBracket ) )
            // InternalConfigurationOneOf4Parser.g:1514:1: ( RightSquareBracket )
            {
            // InternalConfigurationOneOf4Parser.g:1514:1: ( RightSquareBracket )
            // InternalConfigurationOneOf4Parser.g:1515:2: RightSquareBracket
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
    // InternalConfigurationOneOf4Parser.g:1525:1: rule__ConfigurationTypeArray__Group_2__0 : rule__ConfigurationTypeArray__Group_2__0__Impl rule__ConfigurationTypeArray__Group_2__1 ;
    public final void rule__ConfigurationTypeArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1529:1: ( rule__ConfigurationTypeArray__Group_2__0__Impl rule__ConfigurationTypeArray__Group_2__1 )
            // InternalConfigurationOneOf4Parser.g:1530:2: rule__ConfigurationTypeArray__Group_2__0__Impl rule__ConfigurationTypeArray__Group_2__1
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
    // InternalConfigurationOneOf4Parser.g:1537:1: rule__ConfigurationTypeArray__Group_2__0__Impl : ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 ) ) ;
    public final void rule__ConfigurationTypeArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1541:1: ( ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 ) ) )
            // InternalConfigurationOneOf4Parser.g:1542:1: ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1542:1: ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 ) )
            // InternalConfigurationOneOf4Parser.g:1543:2: ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationAssignment_2_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1544:2: ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 )
            // InternalConfigurationOneOf4Parser.g:1544:3: rule__ConfigurationTypeArray__ConfigurationAssignment_2_0
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
    // InternalConfigurationOneOf4Parser.g:1552:1: rule__ConfigurationTypeArray__Group_2__1 : rule__ConfigurationTypeArray__Group_2__1__Impl ;
    public final void rule__ConfigurationTypeArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1556:1: ( rule__ConfigurationTypeArray__Group_2__1__Impl )
            // InternalConfigurationOneOf4Parser.g:1557:2: rule__ConfigurationTypeArray__Group_2__1__Impl
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
    // InternalConfigurationOneOf4Parser.g:1563:1: rule__ConfigurationTypeArray__Group_2__1__Impl : ( ( rule__ConfigurationTypeArray__Group_2_1__0 )* ) ;
    public final void rule__ConfigurationTypeArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1567:1: ( ( ( rule__ConfigurationTypeArray__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf4Parser.g:1568:1: ( ( rule__ConfigurationTypeArray__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf4Parser.g:1568:1: ( ( rule__ConfigurationTypeArray__Group_2_1__0 )* )
            // InternalConfigurationOneOf4Parser.g:1569:2: ( rule__ConfigurationTypeArray__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:1570:2: ( rule__ConfigurationTypeArray__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalConfigurationOneOf4Parser.g:1570:3: rule__ConfigurationTypeArray__Group_2_1__0
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
    // InternalConfigurationOneOf4Parser.g:1579:1: rule__ConfigurationTypeArray__Group_2_1__0 : rule__ConfigurationTypeArray__Group_2_1__0__Impl rule__ConfigurationTypeArray__Group_2_1__1 ;
    public final void rule__ConfigurationTypeArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1583:1: ( rule__ConfigurationTypeArray__Group_2_1__0__Impl rule__ConfigurationTypeArray__Group_2_1__1 )
            // InternalConfigurationOneOf4Parser.g:1584:2: rule__ConfigurationTypeArray__Group_2_1__0__Impl rule__ConfigurationTypeArray__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalConfigurationOneOf4Parser.g:1591:1: rule__ConfigurationTypeArray__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ConfigurationTypeArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1595:1: ( ( Comma ) )
            // InternalConfigurationOneOf4Parser.g:1596:1: ( Comma )
            {
            // InternalConfigurationOneOf4Parser.g:1596:1: ( Comma )
            // InternalConfigurationOneOf4Parser.g:1597:2: Comma
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
    // InternalConfigurationOneOf4Parser.g:1606:1: rule__ConfigurationTypeArray__Group_2_1__1 : rule__ConfigurationTypeArray__Group_2_1__1__Impl ;
    public final void rule__ConfigurationTypeArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1610:1: ( rule__ConfigurationTypeArray__Group_2_1__1__Impl )
            // InternalConfigurationOneOf4Parser.g:1611:2: rule__ConfigurationTypeArray__Group_2_1__1__Impl
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
    // InternalConfigurationOneOf4Parser.g:1617:1: rule__ConfigurationTypeArray__Group_2_1__1__Impl : ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 ) ) ;
    public final void rule__ConfigurationTypeArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1621:1: ( ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf4Parser.g:1622:1: ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1622:1: ( ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 ) )
            // InternalConfigurationOneOf4Parser.g:1623:2: ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:1624:2: ( rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 )
            // InternalConfigurationOneOf4Parser.g:1624:3: rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1
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
    // InternalConfigurationOneOf4Parser.g:1633:1: rule__ConfigurationAdditionalProperties__Group__0 : rule__ConfigurationAdditionalProperties__Group__0__Impl rule__ConfigurationAdditionalProperties__Group__1 ;
    public final void rule__ConfigurationAdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1637:1: ( rule__ConfigurationAdditionalProperties__Group__0__Impl rule__ConfigurationAdditionalProperties__Group__1 )
            // InternalConfigurationOneOf4Parser.g:1638:2: rule__ConfigurationAdditionalProperties__Group__0__Impl rule__ConfigurationAdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalConfigurationOneOf4Parser.g:1645:1: rule__ConfigurationAdditionalProperties__Group__0__Impl : ( ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__ConfigurationAdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1649:1: ( ( ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 ) ) )
            // InternalConfigurationOneOf4Parser.g:1650:1: ( ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1650:1: ( ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 ) )
            // InternalConfigurationOneOf4Parser.g:1651:2: ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1652:2: ( rule__ConfigurationAdditionalProperties__KeyAssignment_0 )
            // InternalConfigurationOneOf4Parser.g:1652:3: rule__ConfigurationAdditionalProperties__KeyAssignment_0
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
    // InternalConfigurationOneOf4Parser.g:1660:1: rule__ConfigurationAdditionalProperties__Group__1 : rule__ConfigurationAdditionalProperties__Group__1__Impl rule__ConfigurationAdditionalProperties__Group__2 ;
    public final void rule__ConfigurationAdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1664:1: ( rule__ConfigurationAdditionalProperties__Group__1__Impl rule__ConfigurationAdditionalProperties__Group__2 )
            // InternalConfigurationOneOf4Parser.g:1665:2: rule__ConfigurationAdditionalProperties__Group__1__Impl rule__ConfigurationAdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalConfigurationOneOf4Parser.g:1672:1: rule__ConfigurationAdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__ConfigurationAdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1676:1: ( ( Colon ) )
            // InternalConfigurationOneOf4Parser.g:1677:1: ( Colon )
            {
            // InternalConfigurationOneOf4Parser.g:1677:1: ( Colon )
            // InternalConfigurationOneOf4Parser.g:1678:2: Colon
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
    // InternalConfigurationOneOf4Parser.g:1687:1: rule__ConfigurationAdditionalProperties__Group__2 : rule__ConfigurationAdditionalProperties__Group__2__Impl ;
    public final void rule__ConfigurationAdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1691:1: ( rule__ConfigurationAdditionalProperties__Group__2__Impl )
            // InternalConfigurationOneOf4Parser.g:1692:2: rule__ConfigurationAdditionalProperties__Group__2__Impl
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
    // InternalConfigurationOneOf4Parser.g:1698:1: rule__ConfigurationAdditionalProperties__Group__2__Impl : ( ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__ConfigurationAdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1702:1: ( ( ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalConfigurationOneOf4Parser.g:1703:1: ( ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1703:1: ( ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalConfigurationOneOf4Parser.g:1704:2: ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalConfigurationOneOf4Parser.g:1705:2: ( rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalConfigurationOneOf4Parser.g:1705:3: rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2
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
    // InternalConfigurationOneOf4Parser.g:1714:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1718:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalConfigurationOneOf4Parser.g:1719:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalConfigurationOneOf4Parser.g:1726:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1730:1: ( ( () ) )
            // InternalConfigurationOneOf4Parser.g:1731:1: ( () )
            {
            // InternalConfigurationOneOf4Parser.g:1731:1: ( () )
            // InternalConfigurationOneOf4Parser.g:1732:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1733:2: ()
            // InternalConfigurationOneOf4Parser.g:1733:3: 
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
    // InternalConfigurationOneOf4Parser.g:1741:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1745:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalConfigurationOneOf4Parser.g:1746:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalConfigurationOneOf4Parser.g:1753:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1757:1: ( ( LeftSquareBracket ) )
            // InternalConfigurationOneOf4Parser.g:1758:1: ( LeftSquareBracket )
            {
            // InternalConfigurationOneOf4Parser.g:1758:1: ( LeftSquareBracket )
            // InternalConfigurationOneOf4Parser.g:1759:2: LeftSquareBracket
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
    // InternalConfigurationOneOf4Parser.g:1768:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1772:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalConfigurationOneOf4Parser.g:1773:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalConfigurationOneOf4Parser.g:1780:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1784:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalConfigurationOneOf4Parser.g:1785:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalConfigurationOneOf4Parser.g:1785:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalConfigurationOneOf4Parser.g:1786:2: ( rule__ArrayValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            }
            // InternalConfigurationOneOf4Parser.g:1787:2: ( rule__ArrayValue__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=False && LA13_0<=True)||LA13_0==LeftSquareBracket||LA13_0==LeftCurlyBracket||(LA13_0>=RULE_STRING && LA13_0<=RULE_E_DOUBLE)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalConfigurationOneOf4Parser.g:1787:3: rule__ArrayValue__Group_2__0
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
    // InternalConfigurationOneOf4Parser.g:1795:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1799:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalConfigurationOneOf4Parser.g:1800:2: rule__ArrayValue__Group__3__Impl
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
    // InternalConfigurationOneOf4Parser.g:1806:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1810:1: ( ( RightSquareBracket ) )
            // InternalConfigurationOneOf4Parser.g:1811:1: ( RightSquareBracket )
            {
            // InternalConfigurationOneOf4Parser.g:1811:1: ( RightSquareBracket )
            // InternalConfigurationOneOf4Parser.g:1812:2: RightSquareBracket
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
    // InternalConfigurationOneOf4Parser.g:1822:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1826:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalConfigurationOneOf4Parser.g:1827:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalConfigurationOneOf4Parser.g:1834:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1838:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalConfigurationOneOf4Parser.g:1839:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1839:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalConfigurationOneOf4Parser.g:1840:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1841:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalConfigurationOneOf4Parser.g:1841:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalConfigurationOneOf4Parser.g:1849:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1853:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalConfigurationOneOf4Parser.g:1854:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalConfigurationOneOf4Parser.g:1860:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1864:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf4Parser.g:1865:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf4Parser.g:1865:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalConfigurationOneOf4Parser.g:1866:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:1867:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalConfigurationOneOf4Parser.g:1867:3: rule__ArrayValue__Group_2_1__0
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
    // InternalConfigurationOneOf4Parser.g:1876:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1880:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalConfigurationOneOf4Parser.g:1881:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalConfigurationOneOf4Parser.g:1888:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1892:1: ( ( Comma ) )
            // InternalConfigurationOneOf4Parser.g:1893:1: ( Comma )
            {
            // InternalConfigurationOneOf4Parser.g:1893:1: ( Comma )
            // InternalConfigurationOneOf4Parser.g:1894:2: Comma
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
    // InternalConfigurationOneOf4Parser.g:1903:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1907:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalConfigurationOneOf4Parser.g:1908:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalConfigurationOneOf4Parser.g:1914:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1918:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf4Parser.g:1919:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf4Parser.g:1919:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalConfigurationOneOf4Parser.g:1920:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:1921:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalConfigurationOneOf4Parser.g:1921:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalConfigurationOneOf4Parser.g:1930:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1934:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalConfigurationOneOf4Parser.g:1935:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalConfigurationOneOf4Parser.g:1942:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1946:1: ( ( () ) )
            // InternalConfigurationOneOf4Parser.g:1947:1: ( () )
            {
            // InternalConfigurationOneOf4Parser.g:1947:1: ( () )
            // InternalConfigurationOneOf4Parser.g:1948:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:1949:2: ()
            // InternalConfigurationOneOf4Parser.g:1949:3: 
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
    // InternalConfigurationOneOf4Parser.g:1957:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1961:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalConfigurationOneOf4Parser.g:1962:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalConfigurationOneOf4Parser.g:1969:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1973:1: ( ( LeftCurlyBracket ) )
            // InternalConfigurationOneOf4Parser.g:1974:1: ( LeftCurlyBracket )
            {
            // InternalConfigurationOneOf4Parser.g:1974:1: ( LeftCurlyBracket )
            // InternalConfigurationOneOf4Parser.g:1975:2: LeftCurlyBracket
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
    // InternalConfigurationOneOf4Parser.g:1984:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:1988:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalConfigurationOneOf4Parser.g:1989:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalConfigurationOneOf4Parser.g:1996:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2000:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalConfigurationOneOf4Parser.g:2001:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalConfigurationOneOf4Parser.g:2001:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalConfigurationOneOf4Parser.g:2002:2: ( rule__ObjectValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            }
            // InternalConfigurationOneOf4Parser.g:2003:2: ( rule__ObjectValue__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalConfigurationOneOf4Parser.g:2003:3: rule__ObjectValue__Group_2__0
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
    // InternalConfigurationOneOf4Parser.g:2011:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2015:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalConfigurationOneOf4Parser.g:2016:2: rule__ObjectValue__Group__3__Impl
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
    // InternalConfigurationOneOf4Parser.g:2022:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2026:1: ( ( RightCurlyBracket ) )
            // InternalConfigurationOneOf4Parser.g:2027:1: ( RightCurlyBracket )
            {
            // InternalConfigurationOneOf4Parser.g:2027:1: ( RightCurlyBracket )
            // InternalConfigurationOneOf4Parser.g:2028:2: RightCurlyBracket
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
    // InternalConfigurationOneOf4Parser.g:2038:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2042:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalConfigurationOneOf4Parser.g:2043:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalConfigurationOneOf4Parser.g:2050:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2054:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalConfigurationOneOf4Parser.g:2055:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:2055:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalConfigurationOneOf4Parser.g:2056:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:2057:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalConfigurationOneOf4Parser.g:2057:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalConfigurationOneOf4Parser.g:2065:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2069:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalConfigurationOneOf4Parser.g:2070:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalConfigurationOneOf4Parser.g:2076:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2080:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalConfigurationOneOf4Parser.g:2081:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalConfigurationOneOf4Parser.g:2081:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalConfigurationOneOf4Parser.g:2082:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:2083:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalConfigurationOneOf4Parser.g:2083:3: rule__ObjectValue__Group_2_1__0
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
    // InternalConfigurationOneOf4Parser.g:2092:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2096:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalConfigurationOneOf4Parser.g:2097:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalConfigurationOneOf4Parser.g:2104:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2108:1: ( ( Comma ) )
            // InternalConfigurationOneOf4Parser.g:2109:1: ( Comma )
            {
            // InternalConfigurationOneOf4Parser.g:2109:1: ( Comma )
            // InternalConfigurationOneOf4Parser.g:2110:2: Comma
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
    // InternalConfigurationOneOf4Parser.g:2119:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2123:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalConfigurationOneOf4Parser.g:2124:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalConfigurationOneOf4Parser.g:2130:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2134:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalConfigurationOneOf4Parser.g:2135:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalConfigurationOneOf4Parser.g:2135:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalConfigurationOneOf4Parser.g:2136:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            }
            // InternalConfigurationOneOf4Parser.g:2137:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalConfigurationOneOf4Parser.g:2137:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalConfigurationOneOf4Parser.g:2146:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2150:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalConfigurationOneOf4Parser.g:2151:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalConfigurationOneOf4Parser.g:2158:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2162:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalConfigurationOneOf4Parser.g:2163:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalConfigurationOneOf4Parser.g:2163:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalConfigurationOneOf4Parser.g:2164:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // InternalConfigurationOneOf4Parser.g:2165:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalConfigurationOneOf4Parser.g:2165:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalConfigurationOneOf4Parser.g:2173:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2177:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalConfigurationOneOf4Parser.g:2178:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalConfigurationOneOf4Parser.g:2185:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2189:1: ( ( Colon ) )
            // InternalConfigurationOneOf4Parser.g:2190:1: ( Colon )
            {
            // InternalConfigurationOneOf4Parser.g:2190:1: ( Colon )
            // InternalConfigurationOneOf4Parser.g:2191:2: Colon
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
    // InternalConfigurationOneOf4Parser.g:2200:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2204:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalConfigurationOneOf4Parser.g:2205:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalConfigurationOneOf4Parser.g:2211:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2215:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalConfigurationOneOf4Parser.g:2216:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalConfigurationOneOf4Parser.g:2216:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalConfigurationOneOf4Parser.g:2217:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // InternalConfigurationOneOf4Parser.g:2218:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalConfigurationOneOf4Parser.g:2218:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__ConfigurationOneOf4__ConfigurationAssignment_2_0"
    // InternalConfigurationOneOf4Parser.g:2227:1: rule__ConfigurationOneOf4__ConfigurationAssignment_2_0 : ( ruleConfigurationOneOf4Items ) ;
    public final void rule__ConfigurationOneOf4__ConfigurationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2231:1: ( ( ruleConfigurationOneOf4Items ) )
            // InternalConfigurationOneOf4Parser.g:2232:2: ( ruleConfigurationOneOf4Items )
            {
            // InternalConfigurationOneOf4Parser.g:2232:2: ( ruleConfigurationOneOf4Items )
            // InternalConfigurationOneOf4Parser.g:2233:3: ruleConfigurationOneOf4Items
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getConfigurationConfigurationOneOf4ItemsParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurationOneOf4Items();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getConfigurationConfigurationOneOf4ItemsParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__ConfigurationAssignment_2_0"


    // $ANTLR start "rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1"
    // InternalConfigurationOneOf4Parser.g:2242:1: rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1 : ( ruleConfigurationOneOf4Items ) ;
    public final void rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2246:1: ( ( ruleConfigurationOneOf4Items ) )
            // InternalConfigurationOneOf4Parser.g:2247:2: ( ruleConfigurationOneOf4Items )
            {
            // InternalConfigurationOneOf4Parser.g:2247:2: ( ruleConfigurationOneOf4Items )
            // InternalConfigurationOneOf4Parser.g:2248:3: ruleConfigurationOneOf4Items
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4Access().getConfigurationConfigurationOneOf4ItemsParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfigurationOneOf4Items();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4Access().getConfigurationConfigurationOneOf4ItemsParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4__ConfigurationAssignment_2_1_1"


    // $ANTLR start "rule__ConfigurationOneOf4Items__ItemsAssignment"
    // InternalConfigurationOneOf4Parser.g:2257:1: rule__ConfigurationOneOf4Items__ItemsAssignment : ( ruleConfiguration ) ;
    public final void rule__ConfigurationOneOf4Items__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2261:1: ( ( ruleConfiguration ) )
            // InternalConfigurationOneOf4Parser.g:2262:2: ( ruleConfiguration )
            {
            // InternalConfigurationOneOf4Parser.g:2262:2: ( ruleConfiguration )
            // InternalConfigurationOneOf4Parser.g:2263:3: ruleConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfigurationOneOf4ItemsAccess().getItemsConfigurationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfigurationOneOf4ItemsAccess().getItemsConfigurationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf4Items__ItemsAssignment"


    // $ANTLR start "rule__Configuration__ConfigurationAssignment"
    // InternalConfigurationOneOf4Parser.g:2272:1: rule__Configuration__ConfigurationAssignment : ( ruleConfigurationAbstract ) ;
    public final void rule__Configuration__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2276:1: ( ( ruleConfigurationAbstract ) )
            // InternalConfigurationOneOf4Parser.g:2277:2: ( ruleConfigurationAbstract )
            {
            // InternalConfigurationOneOf4Parser.g:2277:2: ( ruleConfigurationAbstract )
            // InternalConfigurationOneOf4Parser.g:2278:3: ruleConfigurationAbstract
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
    // InternalConfigurationOneOf4Parser.g:2287:1: rule__ConfigurationTypeString__ConfigurationAssignment : ( ruleEString ) ;
    public final void rule__ConfigurationTypeString__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2291:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf4Parser.g:2292:2: ( ruleEString )
            {
            // InternalConfigurationOneOf4Parser.g:2292:2: ( ruleEString )
            // InternalConfigurationOneOf4Parser.g:2293:3: ruleEString
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
    // InternalConfigurationOneOf4Parser.g:2302:1: rule__ConfigurationTypeInteger__ConfigurationAssignment : ( ruleEDoubleObject ) ;
    public final void rule__ConfigurationTypeInteger__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2306:1: ( ( ruleEDoubleObject ) )
            // InternalConfigurationOneOf4Parser.g:2307:2: ( ruleEDoubleObject )
            {
            // InternalConfigurationOneOf4Parser.g:2307:2: ( ruleEDoubleObject )
            // InternalConfigurationOneOf4Parser.g:2308:3: ruleEDoubleObject
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
    // InternalConfigurationOneOf4Parser.g:2317:1: rule__ConfigurationTypeNumber__ConfigurationAssignment : ( ruleEDoubleObject ) ;
    public final void rule__ConfigurationTypeNumber__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2321:1: ( ( ruleEDoubleObject ) )
            // InternalConfigurationOneOf4Parser.g:2322:2: ( ruleEDoubleObject )
            {
            // InternalConfigurationOneOf4Parser.g:2322:2: ( ruleEDoubleObject )
            // InternalConfigurationOneOf4Parser.g:2323:3: ruleEDoubleObject
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
    // InternalConfigurationOneOf4Parser.g:2332:1: rule__ConfigurationTypeBoolean__ConfigurationAssignment : ( ruleEBooleanObject ) ;
    public final void rule__ConfigurationTypeBoolean__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2336:1: ( ( ruleEBooleanObject ) )
            // InternalConfigurationOneOf4Parser.g:2337:2: ( ruleEBooleanObject )
            {
            // InternalConfigurationOneOf4Parser.g:2337:2: ( ruleEBooleanObject )
            // InternalConfigurationOneOf4Parser.g:2338:3: ruleEBooleanObject
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
    // InternalConfigurationOneOf4Parser.g:2347:1: rule__ConfigurationTypeObject__ConfigurationAssignment_2_0 : ( ruleConfigurationPropertiesAbstract ) ;
    public final void rule__ConfigurationTypeObject__ConfigurationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2351:1: ( ( ruleConfigurationPropertiesAbstract ) )
            // InternalConfigurationOneOf4Parser.g:2352:2: ( ruleConfigurationPropertiesAbstract )
            {
            // InternalConfigurationOneOf4Parser.g:2352:2: ( ruleConfigurationPropertiesAbstract )
            // InternalConfigurationOneOf4Parser.g:2353:3: ruleConfigurationPropertiesAbstract
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
    // InternalConfigurationOneOf4Parser.g:2362:1: rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1 : ( ruleConfigurationPropertiesAbstract ) ;
    public final void rule__ConfigurationTypeObject__ConfigurationAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2366:1: ( ( ruleConfigurationPropertiesAbstract ) )
            // InternalConfigurationOneOf4Parser.g:2367:2: ( ruleConfigurationPropertiesAbstract )
            {
            // InternalConfigurationOneOf4Parser.g:2367:2: ( ruleConfigurationPropertiesAbstract )
            // InternalConfigurationOneOf4Parser.g:2368:3: ruleConfigurationPropertiesAbstract
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
    // InternalConfigurationOneOf4Parser.g:2377:1: rule__ConfigurationTypeArray__ConfigurationAssignment_2_0 : ( ruleConfigurationItems ) ;
    public final void rule__ConfigurationTypeArray__ConfigurationAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2381:1: ( ( ruleConfigurationItems ) )
            // InternalConfigurationOneOf4Parser.g:2382:2: ( ruleConfigurationItems )
            {
            // InternalConfigurationOneOf4Parser.g:2382:2: ( ruleConfigurationItems )
            // InternalConfigurationOneOf4Parser.g:2383:3: ruleConfigurationItems
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
    // InternalConfigurationOneOf4Parser.g:2392:1: rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1 : ( ruleConfigurationItems ) ;
    public final void rule__ConfigurationTypeArray__ConfigurationAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2396:1: ( ( ruleConfigurationItems ) )
            // InternalConfigurationOneOf4Parser.g:2397:2: ( ruleConfigurationItems )
            {
            // InternalConfigurationOneOf4Parser.g:2397:2: ( ruleConfigurationItems )
            // InternalConfigurationOneOf4Parser.g:2398:3: ruleConfigurationItems
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
    // InternalConfigurationOneOf4Parser.g:2407:1: rule__ConfigurationTypeNull__ConfigurationAssignment : ( ruleNullValue ) ;
    public final void rule__ConfigurationTypeNull__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2411:1: ( ( ruleNullValue ) )
            // InternalConfigurationOneOf4Parser.g:2412:2: ( ruleNullValue )
            {
            // InternalConfigurationOneOf4Parser.g:2412:2: ( ruleNullValue )
            // InternalConfigurationOneOf4Parser.g:2413:3: ruleNullValue
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
    // InternalConfigurationOneOf4Parser.g:2422:1: rule__ConfigurationAdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__ConfigurationAdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2426:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf4Parser.g:2427:2: ( ruleEString )
            {
            // InternalConfigurationOneOf4Parser.g:2427:2: ( ruleEString )
            // InternalConfigurationOneOf4Parser.g:2428:3: ruleEString
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
    // InternalConfigurationOneOf4Parser.g:2437:1: rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__ConfigurationAdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2441:1: ( ( ruleJsonDocument ) )
            // InternalConfigurationOneOf4Parser.g:2442:2: ( ruleJsonDocument )
            {
            // InternalConfigurationOneOf4Parser.g:2442:2: ( ruleJsonDocument )
            // InternalConfigurationOneOf4Parser.g:2443:3: ruleJsonDocument
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
    // InternalConfigurationOneOf4Parser.g:2452:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2456:1: ( ( ruleValue ) )
            // InternalConfigurationOneOf4Parser.g:2457:2: ( ruleValue )
            {
            // InternalConfigurationOneOf4Parser.g:2457:2: ( ruleValue )
            // InternalConfigurationOneOf4Parser.g:2458:3: ruleValue
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
    // InternalConfigurationOneOf4Parser.g:2467:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2471:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf4Parser.g:2472:2: ( ruleEString )
            {
            // InternalConfigurationOneOf4Parser.g:2472:2: ( ruleEString )
            // InternalConfigurationOneOf4Parser.g:2473:3: ruleEString
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
    // InternalConfigurationOneOf4Parser.g:2482:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2486:1: ( ( ruleValue ) )
            // InternalConfigurationOneOf4Parser.g:2487:2: ( ruleValue )
            {
            // InternalConfigurationOneOf4Parser.g:2487:2: ( ruleValue )
            // InternalConfigurationOneOf4Parser.g:2488:3: ruleValue
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
    // InternalConfigurationOneOf4Parser.g:2497:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2501:1: ( ( ruleValue ) )
            // InternalConfigurationOneOf4Parser.g:2502:2: ( ruleValue )
            {
            // InternalConfigurationOneOf4Parser.g:2502:2: ( ruleValue )
            // InternalConfigurationOneOf4Parser.g:2503:3: ruleValue
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
    // InternalConfigurationOneOf4Parser.g:2512:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2516:1: ( ( ruleNullEnum ) )
            // InternalConfigurationOneOf4Parser.g:2517:2: ( ruleNullEnum )
            {
            // InternalConfigurationOneOf4Parser.g:2517:2: ( ruleNullEnum )
            // InternalConfigurationOneOf4Parser.g:2518:3: ruleNullEnum
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
    // InternalConfigurationOneOf4Parser.g:2527:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2531:1: ( ( ruleEDouble ) )
            // InternalConfigurationOneOf4Parser.g:2532:2: ( ruleEDouble )
            {
            // InternalConfigurationOneOf4Parser.g:2532:2: ( ruleEDouble )
            // InternalConfigurationOneOf4Parser.g:2533:3: ruleEDouble
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
    // InternalConfigurationOneOf4Parser.g:2542:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2546:1: ( ( ruleKeyValuePair ) )
            // InternalConfigurationOneOf4Parser.g:2547:2: ( ruleKeyValuePair )
            {
            // InternalConfigurationOneOf4Parser.g:2547:2: ( ruleKeyValuePair )
            // InternalConfigurationOneOf4Parser.g:2548:3: ruleKeyValuePair
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
    // InternalConfigurationOneOf4Parser.g:2557:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2561:1: ( ( ruleKeyValuePair ) )
            // InternalConfigurationOneOf4Parser.g:2562:2: ( ruleKeyValuePair )
            {
            // InternalConfigurationOneOf4Parser.g:2562:2: ( ruleKeyValuePair )
            // InternalConfigurationOneOf4Parser.g:2563:3: ruleKeyValuePair
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
    // InternalConfigurationOneOf4Parser.g:2572:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2576:1: ( ( ruleEBoolean ) )
            // InternalConfigurationOneOf4Parser.g:2577:2: ( ruleEBoolean )
            {
            // InternalConfigurationOneOf4Parser.g:2577:2: ( ruleEBoolean )
            // InternalConfigurationOneOf4Parser.g:2578:3: ruleEBoolean
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
    // InternalConfigurationOneOf4Parser.g:2587:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2591:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf4Parser.g:2592:2: ( ruleEString )
            {
            // InternalConfigurationOneOf4Parser.g:2592:2: ( ruleEString )
            // InternalConfigurationOneOf4Parser.g:2593:3: ruleEString
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
    // InternalConfigurationOneOf4Parser.g:2602:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2606:1: ( ( ruleValue ) )
            // InternalConfigurationOneOf4Parser.g:2607:2: ( ruleValue )
            {
            // InternalConfigurationOneOf4Parser.g:2607:2: ( ruleValue )
            // InternalConfigurationOneOf4Parser.g:2608:3: ruleValue
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
    // InternalConfigurationOneOf4Parser.g:2617:1: rule__ConfigurationItems__ItemsAssignment : ( ruleJsonDocument ) ;
    public final void rule__ConfigurationItems__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf4Parser.g:2621:1: ( ( ruleJsonDocument ) )
            // InternalConfigurationOneOf4Parser.g:2622:2: ( ruleJsonDocument )
            {
            // InternalConfigurationOneOf4Parser.g:2622:2: ( ruleJsonDocument )
            // InternalConfigurationOneOf4Parser.g:2623:3: ruleJsonDocument
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

    // $ANTLR start synpred1_InternalConfigurationOneOf4Parser
    public final void synpred1_InternalConfigurationOneOf4Parser_fragment() throws RecognitionException {   
        // InternalConfigurationOneOf4Parser.g:810:2: ( ( ( ruleConfigurationTypeNumber ) ) )
        // InternalConfigurationOneOf4Parser.g:810:2: ( ( ruleConfigurationTypeNumber ) )
        {
        // InternalConfigurationOneOf4Parser.g:810:2: ( ( ruleConfigurationTypeNumber ) )
        // InternalConfigurationOneOf4Parser.g:811:3: ( ruleConfigurationTypeNumber )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNumberParserRuleCall_0()); 
        }
        // InternalConfigurationOneOf4Parser.g:812:3: ( ruleConfigurationTypeNumber )
        // InternalConfigurationOneOf4Parser.g:812:4: ruleConfigurationTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleConfigurationTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalConfigurationOneOf4Parser

    // $ANTLR start synpred3_InternalConfigurationOneOf4Parser
    public final void synpred3_InternalConfigurationOneOf4Parser_fragment() throws RecognitionException {   
        // InternalConfigurationOneOf4Parser.g:822:2: ( ( ruleConfigurationTypeInteger ) )
        // InternalConfigurationOneOf4Parser.g:822:2: ( ruleConfigurationTypeInteger )
        {
        // InternalConfigurationOneOf4Parser.g:822:2: ( ruleConfigurationTypeInteger )
        // InternalConfigurationOneOf4Parser.g:823:3: ruleConfigurationTypeInteger
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
    // $ANTLR end synpred3_InternalConfigurationOneOf4Parser

    // Delegated rules

    public final boolean synpred3_InternalConfigurationOneOf4Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalConfigurationOneOf4Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalConfigurationOneOf4Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalConfigurationOneOf4Parser_fragment(); // can never throw exception
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
            return "805:1: rule__ConfigurationAbstract__Alternatives : ( ( ( ruleConfigurationTypeNumber ) ) | ( ruleConfigurationTypeString ) | ( ruleConfigurationTypeInteger ) | ( ruleConfigurationTypeBoolean ) | ( ruleConfigurationTypeObject ) | ( ruleConfigurationTypeArray ) | ( ruleConfigurationTypeNull ) );";
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
                        if ( (synpred1_InternalConfigurationOneOf4Parser()) ) {s = 8;}

                        else if ( (synpred3_InternalConfigurationOneOf4Parser()) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalConfigurationOneOf4Parser()) ) {s = 8;}

                        else if ( (synpred3_InternalConfigurationOneOf4Parser()) ) {s = 9;}

                         
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