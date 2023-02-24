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
import githubwf.githubwf.services.EnvOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnvOneOf1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=8;
    public static final int RULE_WS=11;
    public static final int RULE_E_INT=6;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_E_DOUBLE=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEnvOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnvOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnvOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnvOneOf1Parser.g"; }


    	private EnvOneOf1GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    	}

    	public void setGrammarAccess(EnvOneOf1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEnvOneOf1"
    // InternalEnvOneOf1Parser.g:55:1: entryRuleEnvOneOf1 : ruleEnvOneOf1 EOF ;
    public final void entryRuleEnvOneOf1() throws RecognitionException {
        try {
            // InternalEnvOneOf1Parser.g:56:1: ( ruleEnvOneOf1 EOF )
            // InternalEnvOneOf1Parser.g:57:1: ruleEnvOneOf1 EOF
            {
             before(grammarAccess.getEnvOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            ruleEnvOneOf1();

            state._fsp--;

             after(grammarAccess.getEnvOneOf1Rule()); 
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
    // $ANTLR end "entryRuleEnvOneOf1"


    // $ANTLR start "ruleEnvOneOf1"
    // InternalEnvOneOf1Parser.g:64:1: ruleEnvOneOf1 : ( ( rule__EnvOneOf1__EnvAssignment ) ) ;
    public final void ruleEnvOneOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf1Parser.g:68:2: ( ( ( rule__EnvOneOf1__EnvAssignment ) ) )
            // InternalEnvOneOf1Parser.g:69:2: ( ( rule__EnvOneOf1__EnvAssignment ) )
            {
            // InternalEnvOneOf1Parser.g:69:2: ( ( rule__EnvOneOf1__EnvAssignment ) )
            // InternalEnvOneOf1Parser.g:70:3: ( rule__EnvOneOf1__EnvAssignment )
            {
             before(grammarAccess.getEnvOneOf1Access().getEnvAssignment()); 
            // InternalEnvOneOf1Parser.g:71:3: ( rule__EnvOneOf1__EnvAssignment )
            // InternalEnvOneOf1Parser.g:71:4: rule__EnvOneOf1__EnvAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf1__EnvAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnvOneOf1Access().getEnvAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvOneOf1"


    // $ANTLR start "entryRuleStringContainingExpressionSyntax"
    // InternalEnvOneOf1Parser.g:80:1: entryRuleStringContainingExpressionSyntax : ruleStringContainingExpressionSyntax EOF ;
    public final void entryRuleStringContainingExpressionSyntax() throws RecognitionException {
        try {
            // InternalEnvOneOf1Parser.g:81:1: ( ruleStringContainingExpressionSyntax EOF )
            // InternalEnvOneOf1Parser.g:82:1: ruleStringContainingExpressionSyntax EOF
            {
             before(grammarAccess.getStringContainingExpressionSyntaxRule()); 
            pushFollow(FOLLOW_1);
            ruleStringContainingExpressionSyntax();

            state._fsp--;

             after(grammarAccess.getStringContainingExpressionSyntaxRule()); 
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
    // $ANTLR end "entryRuleStringContainingExpressionSyntax"


    // $ANTLR start "ruleStringContainingExpressionSyntax"
    // InternalEnvOneOf1Parser.g:89:1: ruleStringContainingExpressionSyntax : ( ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment ) ) ;
    public final void ruleStringContainingExpressionSyntax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf1Parser.g:93:2: ( ( ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment ) ) )
            // InternalEnvOneOf1Parser.g:94:2: ( ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment ) )
            {
            // InternalEnvOneOf1Parser.g:94:2: ( ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment ) )
            // InternalEnvOneOf1Parser.g:95:3: ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment )
            {
             before(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxAssignment()); 
            // InternalEnvOneOf1Parser.g:96:3: ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment )
            // InternalEnvOneOf1Parser.g:96:4: rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringContainingExpressionSyntax"


    // $ANTLR start "entryRuleEString"
    // InternalEnvOneOf1Parser.g:105:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEnvOneOf1Parser.g:106:1: ( ruleEString EOF )
            // InternalEnvOneOf1Parser.g:107:1: ruleEString EOF
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
    // InternalEnvOneOf1Parser.g:114:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf1Parser.g:118:2: ( ( ruleVALID_STRING ) )
            // InternalEnvOneOf1Parser.g:119:2: ( ruleVALID_STRING )
            {
            // InternalEnvOneOf1Parser.g:119:2: ( ruleVALID_STRING )
            // InternalEnvOneOf1Parser.g:120:3: ruleVALID_STRING
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


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalEnvOneOf1Parser.g:130:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalEnvOneOf1Parser.g:131:1: ( ruleVALID_STRING EOF )
            // InternalEnvOneOf1Parser.g:132:1: ruleVALID_STRING EOF
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
    // InternalEnvOneOf1Parser.g:139:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf1Parser.g:143:2: ( ( RULE_STRING ) )
            // InternalEnvOneOf1Parser.g:144:2: ( RULE_STRING )
            {
            // InternalEnvOneOf1Parser.g:144:2: ( RULE_STRING )
            // InternalEnvOneOf1Parser.g:145:3: RULE_STRING
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


    // $ANTLR start "rule__EnvOneOf1__EnvAssignment"
    // InternalEnvOneOf1Parser.g:154:1: rule__EnvOneOf1__EnvAssignment : ( ruleStringContainingExpressionSyntax ) ;
    public final void rule__EnvOneOf1__EnvAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf1Parser.g:158:1: ( ( ruleStringContainingExpressionSyntax ) )
            // InternalEnvOneOf1Parser.g:159:2: ( ruleStringContainingExpressionSyntax )
            {
            // InternalEnvOneOf1Parser.g:159:2: ( ruleStringContainingExpressionSyntax )
            // InternalEnvOneOf1Parser.g:160:3: ruleStringContainingExpressionSyntax
            {
             before(grammarAccess.getEnvOneOf1Access().getEnvStringContainingExpressionSyntaxParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStringContainingExpressionSyntax();

            state._fsp--;

             after(grammarAccess.getEnvOneOf1Access().getEnvStringContainingExpressionSyntaxParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvOneOf1__EnvAssignment"


    // $ANTLR start "rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment"
    // InternalEnvOneOf1Parser.g:169:1: rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment : ( ruleEString ) ;
    public final void rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf1Parser.g:173:1: ( ( ruleEString ) )
            // InternalEnvOneOf1Parser.g:174:2: ( ruleEString )
            {
            // InternalEnvOneOf1Parser.g:174:2: ( ruleEString )
            // InternalEnvOneOf1Parser.g:175:3: ruleEString
            {
             before(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}