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
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Default", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=6;
    public static final int True=7;
    public static final int RULE_STRING=15;
    public static final int False=5;
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
    public static final int Default=4;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;

    // delegates
    // delegators


        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g"; }


    	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseGrammarAccess grammarAccess;
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
    		tokenNameToValue.put("Default", "'\"default\"'");
    	}

    	public void setGrammarAccess(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:66:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:67:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:68:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:75:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:79:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:80:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:80:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:81:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:82:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:82:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:91:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:92:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:93:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:100:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:104:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:105:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:105:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:106:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:107:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:107:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:116:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:117:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:118:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:125:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:129:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:130:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:130:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:131:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:132:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:132:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:141:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:142:1: ( ruleValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:143:1: ruleValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:150:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:154:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:155:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:155:2: ( ( rule__Value__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:156:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:157:3: ( rule__Value__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:157:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:166:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:167:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:168:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:175:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:179:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:180:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:180:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:181:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:182:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:182:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:191:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:192:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:193:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:200:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:204:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:205:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:205:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:206:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:207:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:207:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:216:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:217:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:218:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:225:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:229:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:230:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:230:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:231:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:232:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:232:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:241:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:242:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:243:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:250:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:254:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:255:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:255:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:256:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:257:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:257:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:266:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:267:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:268:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:275:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:279:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:280:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:280:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:281:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:282:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:282:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:291:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:292:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:293:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:300:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:304:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:305:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:305:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:306:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:307:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:307:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:316:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:317:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:318:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:325:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:329:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:330:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:330:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:331:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:332:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:332:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:341:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:342:1: ( ruleEString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:343:1: ruleEString EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:350:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:354:2: ( ( ruleVALID_STRING ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:355:2: ( ruleVALID_STRING )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:355:2: ( ruleVALID_STRING )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:356:3: ruleVALID_STRING
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:366:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:367:1: ( ruleEDoubleObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:368:1: ruleEDoubleObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:375:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:379:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:380:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:380:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:381:3: ( rule__EDoubleObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:382:3: ( rule__EDoubleObject__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:382:4: rule__EDoubleObject__Alternatives
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:391:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:392:1: ( ruleEBooleanObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:393:1: ruleEBooleanObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:400:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:404:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:405:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:405:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:406:3: ( rule__EBooleanObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:407:3: ( rule__EBooleanObject__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:407:4: rule__EBooleanObject__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:416:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:417:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:418:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:425:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:429:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:430:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:430:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:431:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:432:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:432:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:441:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:442:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:443:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:450:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:454:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:455:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:455:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:456:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:457:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:457:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:466:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:467:1: ( ruleJsonDocument EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:468:1: ruleJsonDocument EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:475:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:479:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:480:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:480:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:481:3: ( rule__JsonDocument__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:482:3: ( rule__JsonDocument__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:482:4: rule__JsonDocument__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:491:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:492:1: ( ruleStringValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:493:1: ruleStringValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:500:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:504:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:505:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:505:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:506:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:507:3: ( rule__StringValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:507:4: rule__StringValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:516:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:517:1: ( ruleArrayValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:518:1: ruleArrayValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:525:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:529:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:530:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:530:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:531:3: ( rule__ArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:532:3: ( rule__ArrayValue__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:532:4: rule__ArrayValue__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:541:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:542:1: ( ruleNullValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:543:1: ruleNullValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:550:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:554:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:555:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:555:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:556:3: ( rule__NullValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:557:3: ( rule__NullValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:557:4: rule__NullValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:566:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:567:1: ( ruleNumberValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:568:1: ruleNumberValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:575:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:579:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:580:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:580:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:581:3: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:582:3: ( rule__NumberValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:582:4: rule__NumberValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:591:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:592:1: ( ruleObjectValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:593:1: ruleObjectValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:600:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:604:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:605:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:605:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:606:3: ( rule__ObjectValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:607:3: ( rule__ObjectValue__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:607:4: rule__ObjectValue__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:616:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:617:1: ( ruleBooleanValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:618:1: ruleBooleanValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:625:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:629:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:630:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:630:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:631:3: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:632:3: ( rule__BooleanValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:632:4: rule__BooleanValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:641:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:642:1: ( ruleEDouble EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:643:1: ruleEDouble EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:650:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:654:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:655:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:655:2: ( ( rule__EDouble__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:656:3: ( rule__EDouble__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:657:3: ( rule__EDouble__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:657:4: rule__EDouble__Alternatives
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:666:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:667:1: ( ruleKeyValuePair EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:668:1: ruleKeyValuePair EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:675:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:679:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:680:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:680:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:681:3: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:682:3: ( rule__KeyValuePair__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:682:4: rule__KeyValuePair__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:691:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:692:1: ( ruleEBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:693:1: ruleEBoolean EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:700:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:704:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:705:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:705:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:706:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:707:3: ( rule__EBoolean__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:707:4: rule__EBoolean__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:716:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:717:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:718:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:725:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:729:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:730:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:730:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:731:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsAccess().getItemsAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:732:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:732:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsAccess().getItemsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:741:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:742:1: ( ruleVALID_STRING EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:743:1: ruleVALID_STRING EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:750:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:754:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:755:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:755:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:756:3: ( rule__VALID_STRING__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:757:3: ( rule__VALID_STRING__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:757:4: rule__VALID_STRING__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VALID_STRING__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            }

            }


            }

        }
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:766:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:767:1: ( ruleKEYWORD EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:768:1: ruleKEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKEYWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKEYWORDRule()); 
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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:775:1: ruleKEYWORD : ( Default ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:779:2: ( ( Default ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:780:2: ( Default )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:780:2: ( Default )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:781:3: Default
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKEYWORDAccess().getDefaultKeyword()); 
            }
            match(input,Default,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKEYWORDAccess().getDefaultKeyword()); 
            }

            }


            }

        }
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:791:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:795:1: ( ( ( Null ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:796:2: ( ( Null ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:796:2: ( ( Null ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:797:3: ( Null )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:798:3: ( Null )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:798:4: Null
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:806:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull ) );
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:810:1: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:811:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber ) )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:811:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:812:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberParserRuleCall_0()); 
                    }
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:813:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:813:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber
                    {
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:817:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:817:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:818:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:823:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:823:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:824:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:829:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:829:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:830:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:835:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:835:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:836:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:841:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:841:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:842:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:847:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:847:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:848:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullParserRuleCall_6()); 
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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:857:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives : ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault ) | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties ) ) );
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:861:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault ) | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Default) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==Colon) ) {
                    switch ( input.LA(3) ) {
                    case RULE_STRING:
                        {
                        int LA2_4 = input.LA(4);

                        if ( (synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser()) ) {
                            alt2=1;
                        }
                        else if ( (true) ) {
                            alt2=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Default:
                        {
                        int LA2_5 = input.LA(4);

                        if ( (synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser()) ) {
                            alt2=1;
                        }
                        else if ( (true) ) {
                            alt2=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case False:
                    case Null:
                    case True:
                    case LeftSquareBracket:
                    case LeftCurlyBracket:
                    case RULE_E_INT:
                    case RULE_E_DOUBLE:
                        {
                        alt2=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_STRING) ) {
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:862:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:862:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:863:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:868:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties ) )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:868:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:869:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesParserRuleCall_1()); 
                    }
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:870:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:870:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties
                    {
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesParserRuleCall_1()); 
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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:878:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:882:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case Default:
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt3=2;
                }
                break;
            case Null:
                {
                alt3=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt3=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt3=5;
                }
                break;
            case False:
            case True:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:883:2: ( ruleStringValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:883:2: ( ruleStringValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:884:3: ruleStringValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:889:2: ( ruleArrayValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:889:2: ( ruleArrayValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:890:3: ruleArrayValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:895:2: ( ruleNullValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:895:2: ( ruleNullValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:896:3: ruleNullValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:901:2: ( ruleNumberValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:901:2: ( ruleNumberValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:902:3: ruleNumberValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:907:2: ( ruleObjectValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:907:2: ( ruleObjectValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:908:3: ruleObjectValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:913:2: ( ruleBooleanValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:913:2: ( ruleBooleanValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:914:3: ruleBooleanValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:923:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:927:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_E_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_E_DOUBLE) ) {
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:928:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:928:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:929:3: RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:934:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:934:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:935:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:944:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:948:1: ( ( True ) | ( False ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==True) ) {
                alt5=1;
            }
            else if ( (LA5_0==False) ) {
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:949:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:949:2: ( True )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:950:3: True
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:955:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:955:2: ( False )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:956:3: False
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:965:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:969:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_E_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_E_DOUBLE) ) {
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:970:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:970:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:971:3: RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:976:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:976:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:977:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:986:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:990:1: ( ( True ) | ( False ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==True) ) {
                alt7=1;
            }
            else if ( (LA7_0==False) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:991:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:991:2: ( True )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:992:3: True
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:997:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:997:2: ( False )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:998:3: False
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


    // $ANTLR start "rule__VALID_STRING__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1007:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1011:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==Default) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1012:2: ( RULE_STRING )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1012:2: ( RULE_STRING )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1013:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1018:2: ( ruleKEYWORD )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1018:2: ( ruleKEYWORD )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1019:3: ruleKEYWORD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleKEYWORD();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 
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
    // $ANTLR end "rule__VALID_STRING__Alternatives"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1028:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1032:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1033:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1040:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0__Impl : ( () ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1044:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1045:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1045:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1046:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1047:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1047:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1055:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1059:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1060:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1067:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1071:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1072:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1072:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1073:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1082:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1086:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1087:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1094:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0 )? ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1098:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1099:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1099:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1100:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1101:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Default||LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1101:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1109:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1113:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1114:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1120:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1124:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1125:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1125:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1126:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group__3__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1136:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1140:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1141:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1148:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1152:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1153:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1153:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1154:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0Assignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1155:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1155:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0Assignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1163:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1167:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1168:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1174:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0 )* ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1178:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1179:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1179:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1180:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1181:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1181:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1190:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1194:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1195:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1202:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1206:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1207:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1207:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1208:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1217:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1221:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1222:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1228:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1232:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1233:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1233:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1234:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0Assignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1235:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1235:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0Assignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1244:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1248:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1249:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1256:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0__Impl : ( () ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1260:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1261:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1261:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1262:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1263:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1263:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1271:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1275:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1276:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1283:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1287:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1288:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1288:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1289:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1298:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1302:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1303:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1310:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0 )? ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1314:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1315:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1315:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1316:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1317:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Default && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1317:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1325:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1329:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1330:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1336:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1340:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1341:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1341:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1342:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group__3__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1352:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1356:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1357:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1364:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1368:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1369:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1369:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1370:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0Assignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1371:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1371:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0Assignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1379:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1383:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1384:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1390:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0 )* ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1394:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1395:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1395:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1396:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1397:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1397:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1406:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1410:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1411:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1418:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1422:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1423:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1423:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1424:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1433:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1437:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1438:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1444:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1448:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1449:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1449:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1450:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0Assignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1451:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1451:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0Assignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1460:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1464:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1465:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1472:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0__Impl : ( Default ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1476:1: ( ( Default ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1477:1: ( Default )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1477:1: ( Default )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1478:2: Default
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getDefaultKeyword_0()); 
            }
            match(input,Default,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getDefaultKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1487:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1491:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1492:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1499:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1__Impl : ( Colon ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1503:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1504:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1504:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1505:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1514:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1518:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1519:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1525:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1529:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1530:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1530:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1531:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getDefault_Assignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1532:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1532:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getDefault_Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1541:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1545:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1546:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1553:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1557:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1558:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1558:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1559:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1560:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1560:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getKeyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1568:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1572:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1573:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1580:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1584:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1585:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1585:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1586:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1595:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1599:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1600:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1606:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1610:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1611:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1611:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1612:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1613:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1613:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1622:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1626:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1627:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1634:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1638:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1639:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1639:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1640:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1641:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1641:3: 
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1649:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1653:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1654:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1661:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1665:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1666:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1666:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1667:2: LeftSquareBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1676:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1680:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1681:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1688:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1692:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1693:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1693:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1694:2: ( rule__ArrayValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1695:2: ( rule__ArrayValue__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=Default && LA13_0<=True)||LA13_0==LeftSquareBracket||LA13_0==LeftCurlyBracket||(LA13_0>=RULE_STRING && LA13_0<=RULE_E_DOUBLE)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1695:3: rule__ArrayValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1703:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1707:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1708:2: rule__ArrayValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1714:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1718:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1719:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1719:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1720:2: RightSquareBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1730:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1734:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1735:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1742:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1746:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1747:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1747:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1748:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1749:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1749:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1757:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1761:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1762:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1768:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1772:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1773:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1773:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1774:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1775:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1775:3: rule__ArrayValue__Group_2_1__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1784:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1788:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1789:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1796:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1800:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1801:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1801:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1802:2: Comma
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1811:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1815:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1816:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1822:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1826:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1827:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1827:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1828:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1829:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1829:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1838:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1842:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1843:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1850:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1854:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1855:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1855:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1856:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1857:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1857:3: 
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1865:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1869:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1870:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1877:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1881:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1882:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1882:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1883:2: LeftCurlyBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1892:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1896:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1897:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1904:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1908:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1909:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1909:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1910:2: ( rule__ObjectValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1911:2: ( rule__ObjectValue__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Default||LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1911:3: rule__ObjectValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1919:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1923:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1924:2: rule__ObjectValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1930:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1934:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1935:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1935:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1936:2: RightCurlyBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1946:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1950:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1951:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1958:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1962:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1963:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1963:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1964:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1965:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1965:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1973:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1977:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1978:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1984:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1988:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1989:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1989:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1990:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1991:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:1991:3: rule__ObjectValue__Group_2_1__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2000:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2004:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2005:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2012:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2016:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2017:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2017:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2018:2: Comma
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2027:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2031:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2032:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2038:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2042:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2043:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2043:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2044:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2045:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2045:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2054:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2058:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2059:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2066:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2070:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2071:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2071:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2072:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2073:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2073:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2081:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2085:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2086:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2093:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2097:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2098:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2098:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2099:2: Colon
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2108:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2112:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2113:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2119:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2123:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2124:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2124:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2125:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2126:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2126:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2135:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2139:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2140:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2140:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2141:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2150:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment : ( ruleEString ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2154:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2155:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2155:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2156:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringAccess().getPatternProperties0EStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringAccess().getPatternProperties0EStringParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2165:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment : ( ruleEDoubleObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2169:1: ( ( ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2170:2: ( ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2170:2: ( ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2171:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2180:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment : ( ruleEDoubleObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2184:1: ( ( ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2185:2: ( ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2185:2: ( ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2186:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2195:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment : ( ruleEBooleanObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2199:1: ( ( ruleEBooleanObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2200:2: ( ruleEBooleanObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2200:2: ( ruleEBooleanObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2201:3: ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2210:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2214:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2215:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2215:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2216:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2225:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2229:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2230:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2230:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2231:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__PatternProperties0Assignment_2_1_1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2240:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2244:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2245:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2245:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2246:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2255:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2259:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2260:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2260:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2261:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray__PatternProperties0Assignment_2_1_1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2270:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment : ( ruleNullValue ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2274:1: ( ( ruleNullValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2275:2: ( ruleNullValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2275:2: ( ruleNullValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2276:3: ruleNullValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullAccess().getPatternProperties0NullValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNullValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullAccess().getPatternProperties0NullValueParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2285:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2 : ( ruleEString ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2289:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2290:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2290:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2291:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getDefault_EStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAccess().getDefault_EStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault__Default_Assignment_2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2300:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2304:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2305:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2305:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2306:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__KeyAssignment_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2315:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2319:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2320:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2320:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2321:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2330:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2334:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2335:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2335:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2336:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2345:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2349:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2350:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2350:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2351:3: ruleEString
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2360:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2364:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2365:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2365:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2366:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2375:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2379:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2380:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2380:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2381:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2390:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2394:1: ( ( ruleNullEnum ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2395:2: ( ruleNullEnum )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2395:2: ( ruleNullEnum )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2396:3: ruleNullEnum
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2405:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2409:1: ( ( ruleEDouble ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2410:2: ( ruleEDouble )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2410:2: ( ruleEDouble )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2411:3: ruleEDouble
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2420:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2424:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2425:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2425:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2426:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2435:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2439:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2440:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2440:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2441:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2450:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2454:1: ( ( ruleEBoolean ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2455:2: ( ruleEBoolean )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2455:2: ( ruleEBoolean )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2456:3: ruleEBoolean
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2465:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2469:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2470:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2470:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2471:3: ruleEString
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2480:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2484:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2485:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2485:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2486:3: ruleValue
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2495:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment : ( ruleJsonDocument ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2499:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2500:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2500:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:2501:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems__ItemsAssignment"

    // $ANTLR start synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser
    public final void synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:811:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber ) ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:811:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber ) )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:811:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:812:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberParserRuleCall_0()); 
        }
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:813:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:813:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser

    // $ANTLR start synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser
    public final void synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:823:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:823:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:823:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:824:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser

    // $ANTLR start synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser
    public final void synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:862:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:862:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:862:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser.g:863:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser

    // Delegated rules

    public final boolean synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser_fragment(); // can never throw exception
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
    static final String dfa_3s = "\1\21\2\0\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_5s = "\1\uffff\1\1\1\0\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
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
            return "806:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract__Alternatives : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull ) );";
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
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser()) ) {s = 8;}

                        else if ( (synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser()) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser()) ) {s = 8;}

                        else if ( (synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseParser()) ) {s = 9;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});

}