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
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Type", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
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
    public static final int Type=4;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;

    // delegates
    // delegators


        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g"; }


    	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess grammarAccess;
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
    		tokenNameToValue.put("Type", "'\"type\"'");
    	}

    	public void setGrammarAccess(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:66:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:67:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:68:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:75:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:79:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:80:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:80:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:81:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:82:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:82:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:91:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:92:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:93:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:100:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:104:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:105:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:105:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:106:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:107:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:107:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:116:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:117:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:118:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:125:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:129:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:130:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:130:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:131:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:132:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:132:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:141:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:142:1: ( ruleValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:143:1: ruleValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:150:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:154:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:155:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:155:2: ( ( rule__Value__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:156:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:157:3: ( rule__Value__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:157:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:166:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:167:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:168:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:175:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:179:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:180:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:180:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:181:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:182:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:182:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:191:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:192:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:193:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:200:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:204:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:205:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:205:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:206:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:207:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:207:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:216:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:217:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:218:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:225:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:229:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:230:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:230:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:231:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:232:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:232:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:241:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:242:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:243:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:250:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:254:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:255:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:255:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:256:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:257:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:257:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:266:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:267:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:268:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:275:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:279:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:280:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:280:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:281:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:282:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:282:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:291:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:292:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:293:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:300:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:304:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:305:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:305:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:306:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:307:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:307:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:316:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:317:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:318:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:325:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:329:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:330:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:330:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:331:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:332:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:332:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:341:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:342:1: ( ruleEString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:343:1: ruleEString EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:350:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:354:2: ( ( ruleVALID_STRING ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:355:2: ( ruleVALID_STRING )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:355:2: ( ruleVALID_STRING )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:356:3: ruleVALID_STRING
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:366:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:367:1: ( ruleEDoubleObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:368:1: ruleEDoubleObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:375:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:379:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:380:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:380:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:381:3: ( rule__EDoubleObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:382:3: ( rule__EDoubleObject__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:382:4: rule__EDoubleObject__Alternatives
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:391:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:392:1: ( ruleEBooleanObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:393:1: ruleEBooleanObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:400:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:404:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:405:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:405:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:406:3: ( rule__EBooleanObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:407:3: ( rule__EBooleanObject__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:407:4: rule__EBooleanObject__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:416:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:417:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:418:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:425:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:429:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:430:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:430:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:431:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:432:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:432:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:441:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:442:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:443:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:450:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:454:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:455:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:455:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:456:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:457:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:457:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:466:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:467:1: ( ruleJsonDocument EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:468:1: ruleJsonDocument EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:475:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:479:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:480:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:480:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:481:3: ( rule__JsonDocument__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:482:3: ( rule__JsonDocument__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:482:4: rule__JsonDocument__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:491:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:492:1: ( ruleStringValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:493:1: ruleStringValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:500:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:504:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:505:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:505:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:506:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:507:3: ( rule__StringValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:507:4: rule__StringValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:516:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:517:1: ( ruleArrayValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:518:1: ruleArrayValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:525:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:529:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:530:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:530:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:531:3: ( rule__ArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:532:3: ( rule__ArrayValue__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:532:4: rule__ArrayValue__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:541:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:542:1: ( ruleNullValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:543:1: ruleNullValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:550:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:554:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:555:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:555:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:556:3: ( rule__NullValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:557:3: ( rule__NullValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:557:4: rule__NullValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:566:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:567:1: ( ruleNumberValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:568:1: ruleNumberValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:575:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:579:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:580:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:580:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:581:3: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:582:3: ( rule__NumberValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:582:4: rule__NumberValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:591:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:592:1: ( ruleObjectValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:593:1: ruleObjectValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:600:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:604:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:605:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:605:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:606:3: ( rule__ObjectValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:607:3: ( rule__ObjectValue__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:607:4: rule__ObjectValue__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:616:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:617:1: ( ruleBooleanValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:618:1: ruleBooleanValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:625:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:629:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:630:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:630:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:631:3: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:632:3: ( rule__BooleanValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:632:4: rule__BooleanValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:641:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:642:1: ( ruleEDouble EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:643:1: ruleEDouble EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:650:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:654:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:655:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:655:2: ( ( rule__EDouble__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:656:3: ( rule__EDouble__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:657:3: ( rule__EDouble__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:657:4: rule__EDouble__Alternatives
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:666:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:667:1: ( ruleKeyValuePair EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:668:1: ruleKeyValuePair EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:675:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:679:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:680:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:680:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:681:3: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:682:3: ( rule__KeyValuePair__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:682:4: rule__KeyValuePair__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:691:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:692:1: ( ruleEBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:693:1: ruleEBoolean EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:700:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:704:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:705:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:705:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:706:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:707:3: ( rule__EBoolean__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:707:4: rule__EBoolean__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:716:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:717:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:718:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:725:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:729:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:730:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:730:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:731:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsAccess().getItemsAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:732:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:732:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsAccess().getItemsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:741:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:742:1: ( ruleVALID_STRING EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:743:1: ruleVALID_STRING EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:750:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:754:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:755:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:755:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:756:3: ( rule__VALID_STRING__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:757:3: ( rule__VALID_STRING__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:757:4: rule__VALID_STRING__Alternatives
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:766:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:767:1: ( ruleKEYWORD EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:768:1: ruleKEYWORD EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:775:1: ruleKEYWORD : ( Type ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:779:2: ( ( Type ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:780:2: ( Type )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:780:2: ( Type )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:781:3: Type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKEYWORDAccess().getTypeKeyword()); 
            }
            match(input,Type,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKEYWORDAccess().getTypeKeyword()); 
            }

            }


            }

        }
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:791:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:795:1: ( ( ( Null ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:796:2: ( ( Null ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:796:2: ( ( Null ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:797:3: ( Null )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:798:3: ( Null )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:798:4: Null
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:806:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull ) );
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:810:1: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:811:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:811:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:812:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberParserRuleCall_0()); 
                    }
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:813:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:813:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber
                    {
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:817:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:817:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:818:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:823:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:823:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:824:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:829:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:829:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:830:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:835:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:835:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:836:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:841:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:841:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:842:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:847:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:847:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:848:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullParserRuleCall_6()); 
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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:857:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives : ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType ) | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties ) ) );
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:861:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType ) | ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Type) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:862:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:862:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:863:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:868:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties ) )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:868:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:869:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesParserRuleCall_1()); 
                    }
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:870:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:870:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties
                    {
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesParserRuleCall_1()); 
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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:878:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:882:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case Type:
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:883:2: ( ruleStringValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:883:2: ( ruleStringValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:884:3: ruleStringValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:889:2: ( ruleArrayValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:889:2: ( ruleArrayValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:890:3: ruleArrayValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:895:2: ( ruleNullValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:895:2: ( ruleNullValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:896:3: ruleNullValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:901:2: ( ruleNumberValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:901:2: ( ruleNumberValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:902:3: ruleNumberValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:907:2: ( ruleObjectValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:907:2: ( ruleObjectValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:908:3: ruleObjectValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:913:2: ( ruleBooleanValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:913:2: ( ruleBooleanValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:914:3: ruleBooleanValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:923:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:927:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:928:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:928:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:929:3: RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:934:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:934:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:935:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:944:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:948:1: ( ( True ) | ( False ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:949:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:949:2: ( True )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:950:3: True
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:955:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:955:2: ( False )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:956:3: False
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:965:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:969:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:970:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:970:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:971:3: RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:976:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:976:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:977:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:986:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:990:1: ( ( True ) | ( False ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:991:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:991:2: ( True )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:992:3: True
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:997:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:997:2: ( False )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:998:3: False
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1007:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1011:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==Type) ) {
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1012:2: ( RULE_STRING )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1012:2: ( RULE_STRING )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1013:3: RULE_STRING
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1018:2: ( ruleKEYWORD )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1018:2: ( ruleKEYWORD )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1019:3: ruleKEYWORD
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1028:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1032:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1033:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1040:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0__Impl : ( () ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1044:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1045:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1045:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1046:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1047:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1047:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1055:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1059:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1060:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1067:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1071:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1072:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1072:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1073:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1082:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1086:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1087:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1094:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0 )? ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1098:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1099:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1099:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1100:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1101:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Type||LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1101:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1109:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1113:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1114:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1120:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1124:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1125:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1125:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1126:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group__3__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1136:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1140:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1141:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1148:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1152:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1153:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1153:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1154:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0Assignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1155:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1155:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0Assignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1163:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1167:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1168:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1174:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0 )* ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1178:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1179:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1179:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1180:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1181:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1181:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1190:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1194:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1195:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1202:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1206:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1207:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1207:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1208:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1217:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1221:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1222:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1228:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1232:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1233:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1233:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1234:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0Assignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1235:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1235:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0Assignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1244:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1248:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1249:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1256:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0__Impl : ( () ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1260:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1261:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1261:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1262:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1263:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1263:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1271:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1275:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1276:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1283:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1287:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1288:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1288:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1289:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1298:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1302:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1303:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1310:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0 )? ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1314:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1315:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1315:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1316:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1317:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Type && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1317:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1325:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1329:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1330:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1336:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1340:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1341:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1341:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1342:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group__3__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1352:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1356:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1357:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1364:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1368:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1369:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1369:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1370:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0Assignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1371:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1371:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0Assignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1379:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1383:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1384:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1390:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0 )* ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1394:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1395:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1395:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1396:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1397:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1397:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1406:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1410:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1411:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1418:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1422:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1423:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1423:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1424:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1433:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1437:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1438:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1444:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1448:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1449:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1449:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1450:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0Assignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1451:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1451:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0Assignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1460:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1464:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1465:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1472:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0__Impl : ( Type ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1476:1: ( ( Type ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1477:1: ( Type )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1477:1: ( Type )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1478:2: Type
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getTypeKeyword_0()); 
            }
            match(input,Type,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getTypeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1487:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1491:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1492:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1499:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1__Impl : ( Colon ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1503:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1504:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1504:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1505:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1514:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1518:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1519:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1525:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1529:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1530:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1530:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1531:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getTypeAssignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1532:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1532:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1541:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1545:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1546:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1553:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1557:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1558:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1558:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1559:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1560:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1560:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getKeyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1568:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1572:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1573:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1580:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1584:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1585:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1585:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1586:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1595:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1599:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1600:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1606:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1610:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1611:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1611:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1612:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1613:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1613:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1622:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1626:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1627:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1634:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1638:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1639:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1639:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1640:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1641:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1641:3: 
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1649:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1653:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1654:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1661:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1665:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1666:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1666:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1667:2: LeftSquareBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1676:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1680:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1681:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1688:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1692:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1693:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1693:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1694:2: ( rule__ArrayValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1695:2: ( rule__ArrayValue__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=Type && LA13_0<=True)||LA13_0==LeftSquareBracket||LA13_0==LeftCurlyBracket||(LA13_0>=RULE_STRING && LA13_0<=RULE_E_DOUBLE)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1695:3: rule__ArrayValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1703:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1707:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1708:2: rule__ArrayValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1714:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1718:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1719:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1719:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1720:2: RightSquareBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1730:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1734:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1735:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1742:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1746:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1747:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1747:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1748:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1749:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1749:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1757:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1761:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1762:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1768:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1772:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1773:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1773:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1774:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1775:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1775:3: rule__ArrayValue__Group_2_1__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1784:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1788:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1789:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1796:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1800:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1801:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1801:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1802:2: Comma
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1811:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1815:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1816:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1822:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1826:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1827:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1827:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1828:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1829:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1829:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1838:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1842:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1843:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1850:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1854:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1855:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1855:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1856:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1857:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1857:3: 
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1865:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1869:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1870:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1877:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1881:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1882:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1882:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1883:2: LeftCurlyBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1892:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1896:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1897:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1904:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1908:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1909:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1909:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1910:2: ( rule__ObjectValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1911:2: ( rule__ObjectValue__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Type||LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1911:3: rule__ObjectValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1919:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1923:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1924:2: rule__ObjectValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1930:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1934:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1935:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1935:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1936:2: RightCurlyBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1946:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1950:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1951:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1958:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1962:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1963:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1963:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1964:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1965:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1965:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1973:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1977:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1978:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1984:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1988:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1989:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1989:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1990:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1991:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:1991:3: rule__ObjectValue__Group_2_1__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2000:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2004:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2005:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2012:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2016:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2017:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2017:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2018:2: Comma
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2027:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2031:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2032:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2038:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2042:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2043:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2043:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2044:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2045:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2045:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2054:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2058:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2059:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2066:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2070:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2071:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2071:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2072:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2073:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2073:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2081:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2085:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2086:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2093:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2097:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2098:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2098:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2099:2: Colon
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2108:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2112:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2113:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2119:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2123:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2124:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2124:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2125:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2126:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2126:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2135:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2139:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2140:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2140:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2141:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2150:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment : ( ruleEString ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2154:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2155:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2155:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2156:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringAccess().getPatternProperties0EStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringAccess().getPatternProperties0EStringParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2165:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment : ( ruleEDoubleObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2169:1: ( ( ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2170:2: ( ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2170:2: ( ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2171:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2180:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment : ( ruleEDoubleObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2184:1: ( ( ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2185:2: ( ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2185:2: ( ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2186:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2195:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment : ( ruleEBooleanObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2199:1: ( ( ruleEBooleanObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2200:2: ( ruleEBooleanObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2200:2: ( ruleEBooleanObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2201:3: ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2210:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2214:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2215:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2215:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2216:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2225:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2229:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2230:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2230:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2231:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__PatternProperties0Assignment_2_1_1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2240:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2244:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2245:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2245:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2246:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2255:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2259:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2260:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2260:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2261:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray__PatternProperties0Assignment_2_1_1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2270:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment : ( ruleNullValue ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2274:1: ( ( ruleNullValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2275:2: ( ruleNullValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2275:2: ( ruleNullValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2276:3: ruleNullValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullAccess().getPatternProperties0NullValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNullValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullAccess().getPatternProperties0NullValueParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2285:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2289:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2290:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2290:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2291:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getTypeJsonDocumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAccess().getTypeJsonDocumentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType__TypeAssignment_2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2300:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2304:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2305:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2305:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2306:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__KeyAssignment_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2315:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2319:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2320:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2320:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2321:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2330:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2334:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2335:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2335:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2336:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2345:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2349:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2350:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2350:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2351:3: ruleEString
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2360:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2364:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2365:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2365:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2366:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2375:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2379:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2380:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2380:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2381:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2390:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2394:1: ( ( ruleNullEnum ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2395:2: ( ruleNullEnum )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2395:2: ( ruleNullEnum )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2396:3: ruleNullEnum
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2405:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2409:1: ( ( ruleEDouble ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2410:2: ( ruleEDouble )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2410:2: ( ruleEDouble )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2411:3: ruleEDouble
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2420:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2424:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2425:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2425:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2426:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2435:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2439:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2440:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2440:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2441:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2450:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2454:1: ( ( ruleEBoolean ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2455:2: ( ruleEBoolean )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2455:2: ( ruleEBoolean )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2456:3: ruleEBoolean
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2465:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2469:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2470:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2470:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2471:3: ruleEString
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2480:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2484:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2485:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2485:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2486:3: ruleValue
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2495:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment : ( ruleJsonDocument ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2499:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2500:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2500:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:2501:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems__ItemsAssignment"

    // $ANTLR start synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser
    public final void synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:811:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:811:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:811:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:812:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberParserRuleCall_0()); 
        }
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:813:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:813:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser

    // $ANTLR start synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser
    public final void synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:823:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:823:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:823:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:824:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser

    // $ANTLR start synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser
    public final void synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:862:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:862:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:862:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser.g:863:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser

    // Delegated rules

    public final boolean synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser_fragment(); // can never throw exception
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
            return "806:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract__Alternatives : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull ) );";
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
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser()) ) {s = 8;}

                        else if ( (synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser()) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser()) ) {s = 8;}

                        else if ( (synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfParser()) ) {s = 9;}

                         
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