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
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser extends AbstractInternalContentAssistParser {
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


        public InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g"; }


    	private ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    	}

    	public void setGrammarAccess(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:55:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 : ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 EOF ;
    public final void entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1() throws RecognitionException {
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:56:1: ( ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:57:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 EOF
            {
             before(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1();

            state._fsp--;

             after(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Rule()); 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:64:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 : ( ( rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment ) ) ;
    public final void ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:68:2: ( ( ( rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:69:2: ( ( rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:69:2: ( ( rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:70:3: ( rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment )
            {
             before(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Access().getAdditionalPropertiesAssignment()); 
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:71:3: ( rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:71:4: rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Access().getAdditionalPropertiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1"


    // $ANTLR start "entryRuleExpressionSyntax"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:80:1: entryRuleExpressionSyntax : ruleExpressionSyntax EOF ;
    public final void entryRuleExpressionSyntax() throws RecognitionException {
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:81:1: ( ruleExpressionSyntax EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:82:1: ruleExpressionSyntax EOF
            {
             before(grammarAccess.getExpressionSyntaxRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionSyntax();

            state._fsp--;

             after(grammarAccess.getExpressionSyntaxRule()); 
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
    // $ANTLR end "entryRuleExpressionSyntax"


    // $ANTLR start "ruleExpressionSyntax"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:89:1: ruleExpressionSyntax : ( ( rule__ExpressionSyntax__ExpressionSyntaxAssignment ) ) ;
    public final void ruleExpressionSyntax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:93:2: ( ( ( rule__ExpressionSyntax__ExpressionSyntaxAssignment ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:94:2: ( ( rule__ExpressionSyntax__ExpressionSyntaxAssignment ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:94:2: ( ( rule__ExpressionSyntax__ExpressionSyntaxAssignment ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:95:3: ( rule__ExpressionSyntax__ExpressionSyntaxAssignment )
            {
             before(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxAssignment()); 
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:96:3: ( rule__ExpressionSyntax__ExpressionSyntaxAssignment )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:96:4: rule__ExpressionSyntax__ExpressionSyntaxAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionSyntax__ExpressionSyntaxAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionSyntax"


    // $ANTLR start "entryRuleEString"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:105:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:106:1: ( ruleEString EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:107:1: ruleEString EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:114:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:118:2: ( ( ruleVALID_STRING ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:119:2: ( ruleVALID_STRING )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:119:2: ( ruleVALID_STRING )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:120:3: ruleVALID_STRING
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:130:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:131:1: ( ruleVALID_STRING EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:132:1: ruleVALID_STRING EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:139:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:143:2: ( ( RULE_STRING ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:144:2: ( RULE_STRING )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:144:2: ( RULE_STRING )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:145:3: RULE_STRING
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


    // $ANTLR start "rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:154:1: rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment : ( ruleExpressionSyntax ) ;
    public final void rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:158:1: ( ( ruleExpressionSyntax ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:159:2: ( ruleExpressionSyntax )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:159:2: ( ruleExpressionSyntax )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:160:3: ruleExpressionSyntax
            {
             before(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Access().getAdditionalPropertiesExpressionSyntaxParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionSyntax();

            state._fsp--;

             after(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Access().getAdditionalPropertiesExpressionSyntaxParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1__AdditionalPropertiesAssignment"


    // $ANTLR start "rule__ExpressionSyntax__ExpressionSyntaxAssignment"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:169:1: rule__ExpressionSyntax__ExpressionSyntaxAssignment : ( ruleEString ) ;
    public final void rule__ExpressionSyntax__ExpressionSyntaxAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:173:1: ( ( ruleEString ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:174:2: ( ruleEString )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:174:2: ( ruleEString )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Parser.g:175:3: ruleEString
            {
             before(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionSyntax__ExpressionSyntaxAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}