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
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser extends AbstractInternalContentAssistParser {
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


        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g"; }


    	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenGrammarAccess grammarAccess;
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

    	public void setGrammarAccess(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:65:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:66:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:67:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:74:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:78:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:79:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:79:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:80:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:81:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:81:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:90:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:91:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:92:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:99:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:103:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:104:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:104:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:105:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:106:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:106:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:115:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:116:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:117:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:124:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract : ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:128:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:129:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:129:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:130:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesParserRuleCall()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:131:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:131:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties
            {
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:140:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:141:1: ( ruleValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:142:1: ruleValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:149:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:153:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:154:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:154:2: ( ( rule__Value__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:155:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:156:3: ( rule__Value__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:156:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:165:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:166:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:167:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:174:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:178:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:179:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:179:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:180:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:181:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:181:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:190:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:191:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:192:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:199:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:203:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:204:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:204:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:205:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:206:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:206:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:215:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:216:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:217:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:224:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:228:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:229:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:229:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:230:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:231:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:231:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:240:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:241:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:242:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:249:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:253:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:254:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:254:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:255:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:256:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:256:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:265:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:266:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:267:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:274:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:278:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:279:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:279:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:280:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:281:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:281:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:290:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:291:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:292:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:299:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:303:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:304:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:304:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:305:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:306:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:306:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:315:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:316:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:317:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:324:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:328:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:329:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:329:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:330:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:331:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:331:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:340:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:341:1: ( ruleEString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:342:1: ruleEString EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:349:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:353:2: ( ( ruleVALID_STRING ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:354:2: ( ruleVALID_STRING )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:354:2: ( ruleVALID_STRING )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:355:3: ruleVALID_STRING
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:365:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:366:1: ( ruleEDoubleObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:367:1: ruleEDoubleObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:374:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:378:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:379:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:379:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:380:3: ( rule__EDoubleObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:381:3: ( rule__EDoubleObject__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:381:4: rule__EDoubleObject__Alternatives
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:390:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:391:1: ( ruleEBooleanObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:392:1: ruleEBooleanObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:399:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:403:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:404:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:404:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:405:3: ( rule__EBooleanObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:406:3: ( rule__EBooleanObject__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:406:4: rule__EBooleanObject__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:415:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:416:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:417:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:424:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:428:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:429:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:429:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:430:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:431:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:431:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:440:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:441:1: ( ruleJsonDocument EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:442:1: ruleJsonDocument EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:449:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:453:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:454:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:454:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:455:3: ( rule__JsonDocument__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:456:3: ( rule__JsonDocument__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:456:4: rule__JsonDocument__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:465:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:466:1: ( ruleStringValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:467:1: ruleStringValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:474:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:478:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:479:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:479:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:480:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:481:3: ( rule__StringValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:481:4: rule__StringValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:490:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:491:1: ( ruleArrayValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:492:1: ruleArrayValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:499:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:503:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:504:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:504:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:505:3: ( rule__ArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:506:3: ( rule__ArrayValue__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:506:4: rule__ArrayValue__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:515:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:516:1: ( ruleNullValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:517:1: ruleNullValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:524:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:528:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:529:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:529:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:530:3: ( rule__NullValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:531:3: ( rule__NullValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:531:4: rule__NullValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:540:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:541:1: ( ruleNumberValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:542:1: ruleNumberValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:549:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:553:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:554:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:554:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:555:3: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:556:3: ( rule__NumberValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:556:4: rule__NumberValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:565:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:566:1: ( ruleObjectValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:567:1: ruleObjectValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:574:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:578:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:579:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:579:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:580:3: ( rule__ObjectValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:581:3: ( rule__ObjectValue__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:581:4: rule__ObjectValue__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:590:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:591:1: ( ruleBooleanValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:592:1: ruleBooleanValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:599:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:603:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:604:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:604:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:605:3: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:606:3: ( rule__BooleanValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:606:4: rule__BooleanValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:615:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:616:1: ( ruleEDouble EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:617:1: ruleEDouble EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:624:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:628:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:629:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:629:2: ( ( rule__EDouble__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:630:3: ( rule__EDouble__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:631:3: ( rule__EDouble__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:631:4: rule__EDouble__Alternatives
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:640:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:641:1: ( ruleKeyValuePair EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:642:1: ruleKeyValuePair EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:649:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:653:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:654:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:654:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:655:3: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:656:3: ( rule__KeyValuePair__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:656:4: rule__KeyValuePair__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:665:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:666:1: ( ruleEBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:667:1: ruleEBoolean EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:674:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:678:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:679:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:679:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:680:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:681:3: ( rule__EBoolean__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:681:4: rule__EBoolean__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:690:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:691:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:692:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:699:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:703:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:704:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:704:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:705:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsAccess().getItemsAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:706:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:706:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsAccess().getItemsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:715:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:716:1: ( ruleVALID_STRING EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:717:1: ruleVALID_STRING EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:724:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:728:2: ( ( RULE_STRING ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:729:2: ( RULE_STRING )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:729:2: ( RULE_STRING )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:730:3: RULE_STRING
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:740:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:744:1: ( ( ( Null ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:745:2: ( ( Null ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:745:2: ( ( Null ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:746:3: ( Null )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:747:3: ( Null )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:747:4: Null
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:755:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull ) );
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:759:1: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:760:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber ) )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:760:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:761:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberParserRuleCall_0()); 
                    }
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:762:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:762:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber
                    {
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:766:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:766:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:767:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:772:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:772:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:773:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:778:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:778:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:779:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:784:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:784:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:785:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:790:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:790:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:791:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:796:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:796:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:797:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullParserRuleCall_6()); 
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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:806:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:810:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:811:2: ( ruleStringValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:811:2: ( ruleStringValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:812:3: ruleStringValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:817:2: ( ruleArrayValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:817:2: ( ruleArrayValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:818:3: ruleArrayValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:823:2: ( ruleNullValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:823:2: ( ruleNullValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:824:3: ruleNullValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:829:2: ( ruleNumberValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:829:2: ( ruleNumberValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:830:3: ruleNumberValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:835:2: ( ruleObjectValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:835:2: ( ruleObjectValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:836:3: ruleObjectValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:841:2: ( ruleBooleanValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:841:2: ( ruleBooleanValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:842:3: ruleBooleanValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:851:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:855:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:856:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:856:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:857:3: RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:862:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:862:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:863:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:872:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:876:1: ( ( True ) | ( False ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:877:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:877:2: ( True )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:878:3: True
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:883:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:883:2: ( False )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:884:3: False
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:893:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:897:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:898:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:898:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:899:3: RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:904:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:904:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:905:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:914:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:918:1: ( ( True ) | ( False ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:919:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:919:2: ( True )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:920:3: True
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:925:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:925:2: ( False )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:926:3: False
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:935:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:939:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:940:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:947:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0__Impl : ( () ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:951:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:952:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:952:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:953:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:954:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:954:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:962:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:966:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:967:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:974:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:978:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:979:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:979:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:980:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:989:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:993:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:994:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1001:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0 )? ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1005:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1006:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1006:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1007:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1008:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1008:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1016:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1020:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1021:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1027:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1031:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1032:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1032:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1033:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group__3__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1043:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1047:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1048:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1055:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1059:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1060:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1060:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1061:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getPatternProperties0Assignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1062:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1062:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getPatternProperties0Assignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1070:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1074:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1075:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1081:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0 )* ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1085:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1086:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1086:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1087:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1088:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1088:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1097:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1101:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1102:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1109:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1113:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1114:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1114:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1115:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1124:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1128:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1129:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1135:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1139:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1140:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1140:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1141:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getPatternProperties0Assignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1142:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1142:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getPatternProperties0Assignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1151:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1155:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1156:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1163:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0__Impl : ( () ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1167:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1168:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1168:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1169:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1170:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1170:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1178:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1182:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1183:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1190:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1194:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1195:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1195:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1196:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1205:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1209:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1210:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1217:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0 )? ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1221:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1222:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1222:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1223:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1224:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=False && LA9_0<=True)||LA9_0==LeftSquareBracket||LA9_0==LeftCurlyBracket||(LA9_0>=RULE_STRING && LA9_0<=RULE_E_DOUBLE)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1224:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1232:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1236:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1237:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1243:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1247:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1248:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1248:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1249:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group__3__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1259:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1263:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1264:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1271:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1275:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1276:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1276:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1277:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getPatternProperties0Assignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1278:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1278:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getPatternProperties0Assignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1286:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1290:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1291:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1297:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0 )* ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1301:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1302:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1302:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1303:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1304:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1304:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1313:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1317:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1318:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1325:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1329:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1330:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1330:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1331:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1340:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1344:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1345:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1351:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1355:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1356:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1356:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1357:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getPatternProperties0Assignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1358:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1358:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getPatternProperties0Assignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1367:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1371:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1372:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1379:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1383:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1384:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1384:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1385:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1386:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1386:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getKeyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1394:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1398:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1399:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1406:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1410:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1411:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1411:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1412:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1421:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1425:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1426:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2__Impl();

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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1432:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1436:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1437:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1437:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1438:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1439:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1439:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1448:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1452:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1453:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1460:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1464:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1465:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1465:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1466:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1467:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1467:3: 
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1475:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1479:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1480:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1487:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1491:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1492:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1492:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1493:2: LeftSquareBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1502:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1506:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1507:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1514:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1518:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1519:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1519:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1520:2: ( rule__ArrayValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1521:2: ( rule__ArrayValue__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=False && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1521:3: rule__ArrayValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1529:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1533:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1534:2: rule__ArrayValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1540:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1544:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1545:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1545:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1546:2: RightSquareBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1556:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1560:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1561:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1568:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1572:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1573:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1573:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1574:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1575:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1575:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1583:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1587:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1588:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1594:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1598:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1599:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1599:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1600:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1601:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1601:3: rule__ArrayValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ArrayValue__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1610:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1614:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1615:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1622:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1626:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1627:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1627:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1628:2: Comma
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1637:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1641:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1642:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1648:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1652:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1653:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1653:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1654:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1655:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1655:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1664:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1668:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1669:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1676:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1680:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1681:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1681:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1682:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1683:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1683:3: 
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1691:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1695:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1696:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1703:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1707:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1708:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1708:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1709:2: LeftCurlyBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1718:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1722:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1723:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1730:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1734:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1735:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1735:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1736:2: ( rule__ObjectValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1737:2: ( rule__ObjectValue__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1737:3: rule__ObjectValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1745:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1749:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1750:2: rule__ObjectValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1756:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1760:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1761:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1761:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1762:2: RightCurlyBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1772:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1776:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1777:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1784:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1788:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1789:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1789:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1790:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1791:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1791:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1799:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1803:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1804:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1810:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1814:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1815:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1815:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1816:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1817:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1817:3: rule__ObjectValue__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ObjectValue__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1826:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1830:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1831:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1838:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1842:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1843:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1843:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1844:2: Comma
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1853:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1857:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1858:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1864:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1868:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1869:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1869:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1870:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1871:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1871:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1880:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1884:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1885:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1892:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1896:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1897:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1897:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1898:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1899:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1899:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1907:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1911:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1912:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1919:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1923:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1924:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1924:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1925:2: Colon
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1934:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1938:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1939:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1945:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1949:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1950:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1950:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1951:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1952:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1952:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1961:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1965:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1966:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1966:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1967:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1976:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment : ( ruleEString ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1980:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1981:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1981:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1982:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringAccess().getPatternProperties0EStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringAccess().getPatternProperties0EStringParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1991:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment : ( ruleEDoubleObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1995:1: ( ( ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1996:2: ( ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1996:2: ( ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:1997:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2006:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment : ( ruleEDoubleObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2010:1: ( ( ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2011:2: ( ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2011:2: ( ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2012:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2021:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment : ( ruleEBooleanObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2025:1: ( ( ruleEBooleanObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2026:2: ( ruleEBooleanObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2026:2: ( ruleEBooleanObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2027:3: ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2036:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2040:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2041:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2041:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2042:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2051:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2055:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2056:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2056:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2057:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__PatternProperties0Assignment_2_1_1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2066:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2070:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2071:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2071:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2072:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2081:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2085:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2086:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2086:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2087:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray__PatternProperties0Assignment_2_1_1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2096:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment : ( ruleNullValue ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2100:1: ( ( ruleNullValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2101:2: ( ruleNullValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2101:2: ( ruleNullValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2102:3: ruleNullValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullAccess().getPatternProperties0NullValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNullValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullAccess().getPatternProperties0NullValueParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2111:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2115:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2116:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2116:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2117:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__KeyAssignment_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2126:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2130:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2131:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2131:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2132:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2141:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2145:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2146:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2146:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2147:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2156:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2160:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2161:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2161:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2162:3: ruleEString
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2171:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2175:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2176:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2176:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2177:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2186:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2190:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2191:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2191:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2192:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2201:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2205:1: ( ( ruleNullEnum ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2206:2: ( ruleNullEnum )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2206:2: ( ruleNullEnum )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2207:3: ruleNullEnum
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2216:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2220:1: ( ( ruleEDouble ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2221:2: ( ruleEDouble )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2221:2: ( ruleEDouble )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2222:3: ruleEDouble
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2231:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2235:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2236:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2236:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2237:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2246:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2250:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2251:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2251:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2252:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2261:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2265:1: ( ( ruleEBoolean ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2266:2: ( ruleEBoolean )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2266:2: ( ruleEBoolean )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2267:3: ruleEBoolean
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2276:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2280:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2281:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2281:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2282:3: ruleEString
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2291:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2295:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2296:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2296:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2297:3: ruleValue
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2306:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment : ( ruleJsonDocument ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2310:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2311:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2311:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:2312:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems__ItemsAssignment"

    // $ANTLR start synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser
    public final void synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:760:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber ) ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:760:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber ) )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:760:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:761:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberParserRuleCall_0()); 
        }
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:762:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:762:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser

    // $ANTLR start synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser
    public final void synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:772:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:772:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:772:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser.g:773:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser

    // Delegated rules

    public final boolean synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser_fragment(); // can never throw exception
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
            return "755:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract__Alternatives : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull ) );";
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
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser()) ) {s = 8;}

                        else if ( (synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser()) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser()) ) {s = 8;}

                        else if ( (synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenParser()) ) {s = 9;}

                         
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001CE70L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000001CA70L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});

}