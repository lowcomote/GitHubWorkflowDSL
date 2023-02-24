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
import githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser extends AbstractInternalContentAssistParser {
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


        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g"; }


    	private GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1GrammarAccess grammarAccess;
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

    	public void setGrammarAccess(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:65:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1 : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1 EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:66:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1 EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:67:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Rule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:74:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1 : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:78:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:79:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:79:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:80:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Access().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:81:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:81:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Access().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:90:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:91:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:92:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:99:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:103:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:104:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:104:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:105:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:106:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:106:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:115:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:116:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:117:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:124:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract : ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:128:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:129:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:129:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:130:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesParserRuleCall()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:131:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:131:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties
            {
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:140:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:141:1: ( ruleValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:142:1: ruleValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:149:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:153:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:154:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:154:2: ( ( rule__Value__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:155:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:156:3: ( rule__Value__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:156:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:165:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:166:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:167:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:174:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:178:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:179:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:179:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:180:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:181:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:181:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:190:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:191:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:192:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:199:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:203:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:204:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:204:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:205:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:206:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:206:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:215:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:216:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:217:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:224:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:228:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:229:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:229:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:230:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:231:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:231:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:240:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:241:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:242:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:249:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:253:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:254:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:254:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:255:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:256:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:256:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:265:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:266:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:267:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:274:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:278:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:279:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:279:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:280:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:281:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:281:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:290:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:291:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:292:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:299:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:303:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:304:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:304:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:305:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:306:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:306:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray"


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:315:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:316:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:317:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:324:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:328:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:329:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:329:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:330:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullAccess().getPatternProperties0Assignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:331:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:331:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullAccess().getPatternProperties0Assignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:340:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:341:1: ( ruleEString EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:342:1: ruleEString EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:349:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:353:2: ( ( ruleVALID_STRING ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:354:2: ( ruleVALID_STRING )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:354:2: ( ruleVALID_STRING )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:355:3: ruleVALID_STRING
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:365:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:366:1: ( ruleEDoubleObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:367:1: ruleEDoubleObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:374:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:378:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:379:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:379:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:380:3: ( rule__EDoubleObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:381:3: ( rule__EDoubleObject__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:381:4: rule__EDoubleObject__Alternatives
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:390:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:391:1: ( ruleEBooleanObject EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:392:1: ruleEBooleanObject EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:399:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:403:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:404:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:404:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:405:3: ( rule__EBooleanObject__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:406:3: ( rule__EBooleanObject__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:406:4: rule__EBooleanObject__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:415:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:416:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:417:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:424:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0 ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:428:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:429:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:429:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:430:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:431:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:431:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:440:1: entryRuleJsonDocument : ruleJsonDocument EOF ;
    public final void entryRuleJsonDocument() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:441:1: ( ruleJsonDocument EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:442:1: ruleJsonDocument EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:449:1: ruleJsonDocument : ( ( rule__JsonDocument__ValueAssignment ) ) ;
    public final void ruleJsonDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:453:2: ( ( ( rule__JsonDocument__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:454:2: ( ( rule__JsonDocument__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:454:2: ( ( rule__JsonDocument__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:455:3: ( rule__JsonDocument__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJsonDocumentAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:456:3: ( rule__JsonDocument__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:456:4: rule__JsonDocument__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:465:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:466:1: ( ruleStringValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:467:1: ruleStringValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:474:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:478:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:479:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:479:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:480:3: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:481:3: ( rule__StringValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:481:4: rule__StringValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:490:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:491:1: ( ruleArrayValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:492:1: ruleArrayValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:499:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:503:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:504:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:504:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:505:3: ( rule__ArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:506:3: ( rule__ArrayValue__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:506:4: rule__ArrayValue__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:515:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:516:1: ( ruleNullValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:517:1: ruleNullValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:524:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:528:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:529:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:529:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:530:3: ( rule__NullValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:531:3: ( rule__NullValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:531:4: rule__NullValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:540:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:541:1: ( ruleNumberValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:542:1: ruleNumberValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:549:1: ruleNumberValue : ( ( rule__NumberValue__ValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:553:2: ( ( ( rule__NumberValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:554:2: ( ( rule__NumberValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:554:2: ( ( rule__NumberValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:555:3: ( rule__NumberValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:556:3: ( rule__NumberValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:556:4: rule__NumberValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:565:1: entryRuleObjectValue : ruleObjectValue EOF ;
    public final void entryRuleObjectValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:566:1: ( ruleObjectValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:567:1: ruleObjectValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:574:1: ruleObjectValue : ( ( rule__ObjectValue__Group__0 ) ) ;
    public final void ruleObjectValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:578:2: ( ( ( rule__ObjectValue__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:579:2: ( ( rule__ObjectValue__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:579:2: ( ( rule__ObjectValue__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:580:3: ( rule__ObjectValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:581:3: ( rule__ObjectValue__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:581:4: rule__ObjectValue__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:590:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:591:1: ( ruleBooleanValue EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:592:1: ruleBooleanValue EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:599:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:603:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:604:2: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:604:2: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:605:3: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:606:3: ( rule__BooleanValue__ValueAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:606:4: rule__BooleanValue__ValueAssignment
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:615:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:616:1: ( ruleEDouble EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:617:1: ruleEDouble EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:624:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:628:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:629:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:629:2: ( ( rule__EDouble__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:630:3: ( rule__EDouble__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:631:3: ( rule__EDouble__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:631:4: rule__EDouble__Alternatives
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:640:1: entryRuleKeyValuePair : ruleKeyValuePair EOF ;
    public final void entryRuleKeyValuePair() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:641:1: ( ruleKeyValuePair EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:642:1: ruleKeyValuePair EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:649:1: ruleKeyValuePair : ( ( rule__KeyValuePair__Group__0 ) ) ;
    public final void ruleKeyValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:653:2: ( ( ( rule__KeyValuePair__Group__0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:654:2: ( ( rule__KeyValuePair__Group__0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:654:2: ( ( rule__KeyValuePair__Group__0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:655:3: ( rule__KeyValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getGroup()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:656:3: ( rule__KeyValuePair__Group__0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:656:4: rule__KeyValuePair__Group__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:665:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:666:1: ( ruleEBoolean EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:667:1: ruleEBoolean EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:674:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:678:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:679:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:679:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:680:3: ( rule__EBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:681:3: ( rule__EBoolean__Alternatives )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:681:4: rule__EBoolean__Alternatives
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


    // $ANTLR start "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:690:1: entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items : ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items EOF ;
    public final void entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:691:1: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:692:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsRule()); 
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
    // $ANTLR end "entryRuleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items"


    // $ANTLR start "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:699:1: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment ) ) ;
    public final void ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:703:2: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:704:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:704:2: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:705:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsAccess().getItemsAssignment()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:706:3: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:706:4: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsAccess().getItemsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:715:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:716:1: ( ruleVALID_STRING EOF )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:717:1: ruleVALID_STRING EOF
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:724:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:728:2: ( ( RULE_STRING ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:729:2: ( RULE_STRING )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:729:2: ( RULE_STRING )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:730:3: RULE_STRING
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:740:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:744:1: ( ( ( Null ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:745:2: ( ( Null ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:745:2: ( ( Null ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:746:3: ( Null )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:747:3: ( Null )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:747:4: Null
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:755:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull ) );
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:759:1: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:760:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber ) )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:760:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber ) )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:761:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberParserRuleCall_0()); 
                    }
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:762:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:762:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber
                    {
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:766:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:766:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:767:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:772:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:772:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:773:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:778:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:778:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:779:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:784:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:784:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:785:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:790:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:790:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:791:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:796:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:796:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:797:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullParserRuleCall_6()); 
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
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:806:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:810:1: ( ( ruleStringValue ) | ( ruleArrayValue ) | ( ruleNullValue ) | ( ruleNumberValue ) | ( ruleObjectValue ) | ( ruleBooleanValue ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:811:2: ( ruleStringValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:811:2: ( ruleStringValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:812:3: ruleStringValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:817:2: ( ruleArrayValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:817:2: ( ruleArrayValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:818:3: ruleArrayValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:823:2: ( ruleNullValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:823:2: ( ruleNullValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:824:3: ruleNullValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:829:2: ( ruleNumberValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:829:2: ( ruleNumberValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:830:3: ruleNumberValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:835:2: ( ruleObjectValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:835:2: ( ruleObjectValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:836:3: ruleObjectValue
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:841:2: ( ruleBooleanValue )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:841:2: ( ruleBooleanValue )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:842:3: ruleBooleanValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:851:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:855:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:856:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:856:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:857:3: RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:862:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:862:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:863:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:872:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:876:1: ( ( True ) | ( False ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:877:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:877:2: ( True )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:878:3: True
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:883:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:883:2: ( False )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:884:3: False
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:893:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:897:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:898:2: ( RULE_E_INT )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:898:2: ( RULE_E_INT )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:899:3: RULE_E_INT
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:904:2: ( RULE_E_DOUBLE )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:904:2: ( RULE_E_DOUBLE )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:905:3: RULE_E_DOUBLE
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:914:1: rule__EBoolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:918:1: ( ( True ) | ( False ) )
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:919:2: ( True )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:919:2: ( True )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:920:3: True
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
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:925:2: ( False )
                    {
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:925:2: ( False )
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:926:3: False
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:935:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:939:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:940:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:947:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0__Impl : ( () ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:951:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:952:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:952:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:953:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:954:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:954:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:962:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:966:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:967:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:974:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:978:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:979:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:979:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:980:2: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:989:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:993:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:994:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1001:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0 )? ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1005:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1006:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1006:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1007:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1008:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1008:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1016:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1020:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1021:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1027:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1031:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1032:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1032:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1033:2: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group__3__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1043:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1047:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1048:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1055:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1059:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1060:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1060:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1061:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getPatternProperties0Assignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1062:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1062:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getPatternProperties0Assignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1070:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1074:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1075:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1081:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0 )* ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1085:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1086:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1086:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1087:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1088:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1088:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1097:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1101:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1102:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1109:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1113:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1114:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1114:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1115:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1124:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1128:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1129:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1135:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1139:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1140:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1140:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1141:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getPatternProperties0Assignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1142:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1142:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getPatternProperties0Assignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1151:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1155:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1156:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1163:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0__Impl : ( () ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1167:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1168:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1168:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1169:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1170:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1170:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1178:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1182:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1183:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1190:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1194:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1195:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1195:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1196:2: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1205:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1209:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1210:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1217:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0 )? ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1221:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1222:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1222:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1223:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1224:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=False && LA9_0<=True)||LA9_0==LeftSquareBracket||LA9_0==LeftCurlyBracket||(LA9_0>=RULE_STRING && LA9_0<=RULE_E_DOUBLE)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1224:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__2__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1232:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1236:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1237:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1243:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1247:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1248:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1248:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1249:2: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group__3__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1259:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1263:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1264:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1271:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1275:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1276:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1276:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1277:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getPatternProperties0Assignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1278:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1278:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getPatternProperties0Assignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1286:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1290:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1291:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1297:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0 )* ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1301:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1302:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1302:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1303:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1304:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1304:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1313:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1317:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1318:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1325:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1329:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1330:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1330:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1331:2: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,Comma,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1340:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1344:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1345:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1351:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1355:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1356:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1356:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1357:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getPatternProperties0Assignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1358:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1358:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getPatternProperties0Assignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1367:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1371:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1372:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1379:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1383:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1384:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1384:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1385:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getKeyAssignment_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1386:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1386:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getKeyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__0__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1394:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2 ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1398:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1399:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1__Impl rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1406:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1__Impl : ( Colon ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1410:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1411:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1411:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1412:2: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getColonKeyword_1()); 
            }
            match(input,Colon,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__1__Impl"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1421:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2 : rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2__Impl ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1425:1: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1426:2: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2__Impl"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1432:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2__Impl : ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2 ) ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1436:1: ( ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1437:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1437:1: ( ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1438:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1439:2: ( rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1439:3: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getAdditionalPropertiesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1448:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1452:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1453:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1460:1: rule__ArrayValue__Group__0__Impl : ( () ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1464:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1465:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1465:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1466:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getArrayValueAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1467:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1467:3: 
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1475:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1479:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1480:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1487:1: rule__ArrayValue__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1491:1: ( ( LeftSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1492:1: ( LeftSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1492:1: ( LeftSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1493:2: LeftSquareBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1502:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1506:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1507:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1514:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )? ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1518:1: ( ( ( rule__ArrayValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1519:1: ( ( rule__ArrayValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1519:1: ( ( rule__ArrayValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1520:2: ( rule__ArrayValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1521:2: ( rule__ArrayValue__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=False && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1521:3: rule__ArrayValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1529:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1533:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1534:2: rule__ArrayValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1540:1: rule__ArrayValue__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1544:1: ( ( RightSquareBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1545:1: ( RightSquareBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1545:1: ( RightSquareBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1546:2: RightSquareBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1556:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1560:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1561:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1568:1: rule__ArrayValue__Group_2__0__Impl : ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1572:1: ( ( ( rule__ArrayValue__ValueAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1573:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1573:1: ( ( rule__ArrayValue__ValueAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1574:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1575:2: ( rule__ArrayValue__ValueAssignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1575:3: rule__ArrayValue__ValueAssignment_2_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1583:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1587:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1588:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1594:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__Group_2_1__0 )* ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1598:1: ( ( ( rule__ArrayValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1599:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1599:1: ( ( rule__ArrayValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1600:2: ( rule__ArrayValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1601:2: ( rule__ArrayValue__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1601:3: rule__ArrayValue__Group_2_1__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1610:1: rule__ArrayValue__Group_2_1__0 : rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 ;
    public final void rule__ArrayValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1614:1: ( rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1615:2: rule__ArrayValue__Group_2_1__0__Impl rule__ArrayValue__Group_2_1__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1622:1: rule__ArrayValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ArrayValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1626:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1627:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1627:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1628:2: Comma
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1637:1: rule__ArrayValue__Group_2_1__1 : rule__ArrayValue__Group_2_1__1__Impl ;
    public final void rule__ArrayValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1641:1: ( rule__ArrayValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1642:2: rule__ArrayValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1648:1: rule__ArrayValue__Group_2_1__1__Impl : ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ArrayValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1652:1: ( ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1653:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1653:1: ( ( rule__ArrayValue__ValueAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1654:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayValueAccess().getValueAssignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1655:2: ( rule__ArrayValue__ValueAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1655:3: rule__ArrayValue__ValueAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1664:1: rule__ObjectValue__Group__0 : rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 ;
    public final void rule__ObjectValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1668:1: ( rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1669:2: rule__ObjectValue__Group__0__Impl rule__ObjectValue__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1676:1: rule__ObjectValue__Group__0__Impl : ( () ) ;
    public final void rule__ObjectValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1680:1: ( ( () ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1681:1: ( () )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1681:1: ( () )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1682:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getObjectValueAction_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1683:2: ()
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1683:3: 
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1691:1: rule__ObjectValue__Group__1 : rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 ;
    public final void rule__ObjectValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1695:1: ( rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1696:2: rule__ObjectValue__Group__1__Impl rule__ObjectValue__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1703:1: rule__ObjectValue__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ObjectValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1707:1: ( ( LeftCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1708:1: ( LeftCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1708:1: ( LeftCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1709:2: LeftCurlyBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1718:1: rule__ObjectValue__Group__2 : rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 ;
    public final void rule__ObjectValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1722:1: ( rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1723:2: rule__ObjectValue__Group__2__Impl rule__ObjectValue__Group__3
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1730:1: rule__ObjectValue__Group__2__Impl : ( ( rule__ObjectValue__Group_2__0 )? ) ;
    public final void rule__ObjectValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1734:1: ( ( ( rule__ObjectValue__Group_2__0 )? ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1735:1: ( ( rule__ObjectValue__Group_2__0 )? )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1735:1: ( ( rule__ObjectValue__Group_2__0 )? )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1736:2: ( rule__ObjectValue__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1737:2: ( rule__ObjectValue__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1737:3: rule__ObjectValue__Group_2__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1745:1: rule__ObjectValue__Group__3 : rule__ObjectValue__Group__3__Impl ;
    public final void rule__ObjectValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1749:1: ( rule__ObjectValue__Group__3__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1750:2: rule__ObjectValue__Group__3__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1756:1: rule__ObjectValue__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ObjectValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1760:1: ( ( RightCurlyBracket ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1761:1: ( RightCurlyBracket )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1761:1: ( RightCurlyBracket )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1762:2: RightCurlyBracket
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1772:1: rule__ObjectValue__Group_2__0 : rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 ;
    public final void rule__ObjectValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1776:1: ( rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1777:2: rule__ObjectValue__Group_2__0__Impl rule__ObjectValue__Group_2__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1784:1: rule__ObjectValue__Group_2__0__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) ;
    public final void rule__ObjectValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1788:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1789:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1789:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1790:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1791:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1791:3: rule__ObjectValue__KeyvaluepairAssignment_2_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1799:1: rule__ObjectValue__Group_2__1 : rule__ObjectValue__Group_2__1__Impl ;
    public final void rule__ObjectValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1803:1: ( rule__ObjectValue__Group_2__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1804:2: rule__ObjectValue__Group_2__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1810:1: rule__ObjectValue__Group_2__1__Impl : ( ( rule__ObjectValue__Group_2_1__0 )* ) ;
    public final void rule__ObjectValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1814:1: ( ( ( rule__ObjectValue__Group_2_1__0 )* ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1815:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1815:1: ( ( rule__ObjectValue__Group_2_1__0 )* )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1816:2: ( rule__ObjectValue__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getGroup_2_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1817:2: ( rule__ObjectValue__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1817:3: rule__ObjectValue__Group_2_1__0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1826:1: rule__ObjectValue__Group_2_1__0 : rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 ;
    public final void rule__ObjectValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1830:1: ( rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1831:2: rule__ObjectValue__Group_2_1__0__Impl rule__ObjectValue__Group_2_1__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1838:1: rule__ObjectValue__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__ObjectValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1842:1: ( ( Comma ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1843:1: ( Comma )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1843:1: ( Comma )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1844:2: Comma
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1853:1: rule__ObjectValue__Group_2_1__1 : rule__ObjectValue__Group_2_1__1__Impl ;
    public final void rule__ObjectValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1857:1: ( rule__ObjectValue__Group_2_1__1__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1858:2: rule__ObjectValue__Group_2_1__1__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1864:1: rule__ObjectValue__Group_2_1__1__Impl : ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) ;
    public final void rule__ObjectValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1868:1: ( ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1869:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1869:1: ( ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1870:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObjectValueAccess().getKeyvaluepairAssignment_2_1_1()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1871:2: ( rule__ObjectValue__KeyvaluepairAssignment_2_1_1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1871:3: rule__ObjectValue__KeyvaluepairAssignment_2_1_1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1880:1: rule__KeyValuePair__Group__0 : rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 ;
    public final void rule__KeyValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1884:1: ( rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1885:2: rule__KeyValuePair__Group__0__Impl rule__KeyValuePair__Group__1
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1892:1: rule__KeyValuePair__Group__0__Impl : ( ( rule__KeyValuePair__KeyAssignment_0 ) ) ;
    public final void rule__KeyValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1896:1: ( ( ( rule__KeyValuePair__KeyAssignment_0 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1897:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1897:1: ( ( rule__KeyValuePair__KeyAssignment_0 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1898:2: ( rule__KeyValuePair__KeyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getKeyAssignment_0()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1899:2: ( rule__KeyValuePair__KeyAssignment_0 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1899:3: rule__KeyValuePair__KeyAssignment_0
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1907:1: rule__KeyValuePair__Group__1 : rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 ;
    public final void rule__KeyValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1911:1: ( rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1912:2: rule__KeyValuePair__Group__1__Impl rule__KeyValuePair__Group__2
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1919:1: rule__KeyValuePair__Group__1__Impl : ( Colon ) ;
    public final void rule__KeyValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1923:1: ( ( Colon ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1924:1: ( Colon )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1924:1: ( Colon )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1925:2: Colon
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1934:1: rule__KeyValuePair__Group__2 : rule__KeyValuePair__Group__2__Impl ;
    public final void rule__KeyValuePair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1938:1: ( rule__KeyValuePair__Group__2__Impl )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1939:2: rule__KeyValuePair__Group__2__Impl
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1945:1: rule__KeyValuePair__Group__2__Impl : ( ( rule__KeyValuePair__ValueAssignment_2 ) ) ;
    public final void rule__KeyValuePair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1949:1: ( ( ( rule__KeyValuePair__ValueAssignment_2 ) ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1950:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1950:1: ( ( rule__KeyValuePair__ValueAssignment_2 ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1951:2: ( rule__KeyValuePair__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyValuePairAccess().getValueAssignment_2()); 
            }
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1952:2: ( rule__KeyValuePair__ValueAssignment_2 )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1952:3: rule__KeyValuePair__ValueAssignment_2
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1961:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1965:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1966:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1966:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1967:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Access().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Access().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1976:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment : ( ruleEString ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1980:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1981:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1981:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1982:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringAccess().getPatternProperties0EStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringAccess().getPatternProperties0EStringParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1991:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment : ( ruleEDoubleObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1995:1: ( ( ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1996:2: ( ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1996:2: ( ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:1997:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2006:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment : ( ruleEDoubleObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2010:1: ( ( ruleEDoubleObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2011:2: ( ruleEDoubleObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2011:2: ( ruleEDoubleObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2012:3: ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberAccess().getPatternProperties0EDoubleObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2021:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment : ( ruleEBooleanObject ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2025:1: ( ( ruleEBooleanObject ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2026:2: ( ruleEBooleanObject )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2026:2: ( ruleEBooleanObject )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2027:3: ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanAccess().getPatternProperties0EBooleanObjectParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2036:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2040:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2041:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2041:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2042:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2051:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2055:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2056:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2056:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2057:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__PatternProperties0Assignment_2_1_1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2066:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2070:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2071:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2071:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2072:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2081:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1 : ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2085:1: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2086:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2086:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2087:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAccess().getPatternProperties0GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray__PatternProperties0Assignment_2_1_1"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2096:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment : ( ruleNullValue ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2100:1: ( ( ruleNullValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2101:2: ( ruleNullValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2101:2: ( ruleNullValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2102:3: ruleNullValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullAccess().getPatternProperties0NullValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNullValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullAccess().getPatternProperties0NullValueParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull__PatternProperties0Assignment"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2111:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2115:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2116:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2116:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2117:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__KeyAssignment_0"


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2126:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2 : ( ruleJsonDocument ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2130:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2131:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2131:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2132:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__AdditionalPropertiesAssignment_2"


    // $ANTLR start "rule__JsonDocument__ValueAssignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2141:1: rule__JsonDocument__ValueAssignment : ( ruleValue ) ;
    public final void rule__JsonDocument__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2145:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2146:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2146:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2147:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2156:1: rule__StringValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2160:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2161:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2161:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2162:3: ruleEString
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2171:1: rule__ArrayValue__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2175:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2176:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2176:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2177:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2186:1: rule__ArrayValue__ValueAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2190:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2191:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2191:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2192:3: ruleValue
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2201:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2205:1: ( ( ruleNullEnum ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2206:2: ( ruleNullEnum )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2206:2: ( ruleNullEnum )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2207:3: ruleNullEnum
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2216:1: rule__NumberValue__ValueAssignment : ( ruleEDouble ) ;
    public final void rule__NumberValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2220:1: ( ( ruleEDouble ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2221:2: ( ruleEDouble )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2221:2: ( ruleEDouble )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2222:3: ruleEDouble
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2231:1: rule__ObjectValue__KeyvaluepairAssignment_2_0 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2235:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2236:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2236:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2237:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2246:1: rule__ObjectValue__KeyvaluepairAssignment_2_1_1 : ( ruleKeyValuePair ) ;
    public final void rule__ObjectValue__KeyvaluepairAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2250:1: ( ( ruleKeyValuePair ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2251:2: ( ruleKeyValuePair )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2251:2: ( ruleKeyValuePair )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2252:3: ruleKeyValuePair
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2261:1: rule__BooleanValue__ValueAssignment : ( ruleEBoolean ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2265:1: ( ( ruleEBoolean ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2266:2: ( ruleEBoolean )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2266:2: ( ruleEBoolean )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2267:3: ruleEBoolean
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2276:1: rule__KeyValuePair__KeyAssignment_0 : ( ruleEString ) ;
    public final void rule__KeyValuePair__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2280:1: ( ( ruleEString ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2281:2: ( ruleEString )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2281:2: ( ruleEString )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2282:3: ruleEString
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
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2291:1: rule__KeyValuePair__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__KeyValuePair__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2295:1: ( ( ruleValue ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2296:2: ( ruleValue )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2296:2: ( ruleValue )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2297:3: ruleValue
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


    // $ANTLR start "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment"
    // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2306:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment : ( ruleJsonDocument ) ;
    public final void rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2310:1: ( ( ruleJsonDocument ) )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2311:2: ( ruleJsonDocument )
            {
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2311:2: ( ruleJsonDocument )
            // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:2312:3: ruleJsonDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleJsonDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsAccess().getItemsJsonDocumentParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items__ItemsAssignment"

    // $ANTLR start synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser
    public final void synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:760:2: ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber ) ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:760:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber ) )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:760:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:761:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberParserRuleCall_0()); 
        }
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:762:3: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:762:4: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser

    // $ANTLR start synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser
    public final void synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser_fragment() throws RecognitionException {   
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:772:2: ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger ) )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:772:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger )
        {
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:772:2: ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger )
        // InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser.g:773:3: ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAccess().getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser

    // Delegated rules

    public final boolean synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser_fragment(); // can never throw exception
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
            return "755:1: rule__GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract__Alternatives : ( ( ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber ) ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray ) | ( ruleGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull ) );";
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
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser()) ) {s = 8;}

                        else if ( (synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser()) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser()) ) {s = 8;}

                        else if ( (synpred3_InternalGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Parser()) ) {s = 9;}

                         
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