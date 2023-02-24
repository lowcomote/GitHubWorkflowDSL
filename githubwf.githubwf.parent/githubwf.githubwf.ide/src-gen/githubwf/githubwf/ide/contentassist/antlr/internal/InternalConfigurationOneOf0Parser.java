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
import githubwf.githubwf.services.ConfigurationOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigurationOneOf0Parser extends AbstractInternalContentAssistParser {
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


        public InternalConfigurationOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigurationOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigurationOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigurationOneOf0Parser.g"; }


    	private ConfigurationOneOf0GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    	}

    	public void setGrammarAccess(ConfigurationOneOf0GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleConfigurationOneOf0"
    // InternalConfigurationOneOf0Parser.g:55:1: entryRuleConfigurationOneOf0 : ruleConfigurationOneOf0 EOF ;
    public final void entryRuleConfigurationOneOf0() throws RecognitionException {
        try {
            // InternalConfigurationOneOf0Parser.g:56:1: ( ruleConfigurationOneOf0 EOF )
            // InternalConfigurationOneOf0Parser.g:57:1: ruleConfigurationOneOf0 EOF
            {
             before(grammarAccess.getConfigurationOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            ruleConfigurationOneOf0();

            state._fsp--;

             after(grammarAccess.getConfigurationOneOf0Rule()); 
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
    // $ANTLR end "entryRuleConfigurationOneOf0"


    // $ANTLR start "ruleConfigurationOneOf0"
    // InternalConfigurationOneOf0Parser.g:64:1: ruleConfigurationOneOf0 : ( ( rule__ConfigurationOneOf0__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationOneOf0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf0Parser.g:68:2: ( ( ( rule__ConfigurationOneOf0__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf0Parser.g:69:2: ( ( rule__ConfigurationOneOf0__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf0Parser.g:69:2: ( ( rule__ConfigurationOneOf0__ConfigurationAssignment ) )
            // InternalConfigurationOneOf0Parser.g:70:3: ( rule__ConfigurationOneOf0__ConfigurationAssignment )
            {
             before(grammarAccess.getConfigurationOneOf0Access().getConfigurationAssignment()); 
            // InternalConfigurationOneOf0Parser.g:71:3: ( rule__ConfigurationOneOf0__ConfigurationAssignment )
            // InternalConfigurationOneOf0Parser.g:71:4: rule__ConfigurationOneOf0__ConfigurationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf0__ConfigurationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationOneOf0Access().getConfigurationAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationOneOf0"


    // $ANTLR start "entryRuleEString"
    // InternalConfigurationOneOf0Parser.g:80:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalConfigurationOneOf0Parser.g:81:1: ( ruleEString EOF )
            // InternalConfigurationOneOf0Parser.g:82:1: ruleEString EOF
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
    // InternalConfigurationOneOf0Parser.g:89:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf0Parser.g:93:2: ( ( ruleVALID_STRING ) )
            // InternalConfigurationOneOf0Parser.g:94:2: ( ruleVALID_STRING )
            {
            // InternalConfigurationOneOf0Parser.g:94:2: ( ruleVALID_STRING )
            // InternalConfigurationOneOf0Parser.g:95:3: ruleVALID_STRING
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
    // InternalConfigurationOneOf0Parser.g:105:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalConfigurationOneOf0Parser.g:106:1: ( ruleVALID_STRING EOF )
            // InternalConfigurationOneOf0Parser.g:107:1: ruleVALID_STRING EOF
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
    // InternalConfigurationOneOf0Parser.g:114:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf0Parser.g:118:2: ( ( RULE_STRING ) )
            // InternalConfigurationOneOf0Parser.g:119:2: ( RULE_STRING )
            {
            // InternalConfigurationOneOf0Parser.g:119:2: ( RULE_STRING )
            // InternalConfigurationOneOf0Parser.g:120:3: RULE_STRING
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


    // $ANTLR start "rule__ConfigurationOneOf0__ConfigurationAssignment"
    // InternalConfigurationOneOf0Parser.g:129:1: rule__ConfigurationOneOf0__ConfigurationAssignment : ( ruleEString ) ;
    public final void rule__ConfigurationOneOf0__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf0Parser.g:133:1: ( ( ruleEString ) )
            // InternalConfigurationOneOf0Parser.g:134:2: ( ruleEString )
            {
            // InternalConfigurationOneOf0Parser.g:134:2: ( ruleEString )
            // InternalConfigurationOneOf0Parser.g:135:3: ruleEString
            {
             before(grammarAccess.getConfigurationOneOf0Access().getConfigurationEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConfigurationOneOf0Access().getConfigurationEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf0__ConfigurationAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}