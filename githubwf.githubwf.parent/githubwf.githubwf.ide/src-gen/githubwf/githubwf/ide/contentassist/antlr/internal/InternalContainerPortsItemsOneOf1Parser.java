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
import githubwf.githubwf.services.ContainerPortsItemsOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContainerPortsItemsOneOf1Parser extends AbstractInternalContentAssistParser {
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


        public InternalContainerPortsItemsOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContainerPortsItemsOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContainerPortsItemsOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalContainerPortsItemsOneOf1Parser.g"; }


    	private ContainerPortsItemsOneOf1GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    	}

    	public void setGrammarAccess(ContainerPortsItemsOneOf1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleContainerPortsItemsOneOf1"
    // InternalContainerPortsItemsOneOf1Parser.g:55:1: entryRuleContainerPortsItemsOneOf1 : ruleContainerPortsItemsOneOf1 EOF ;
    public final void entryRuleContainerPortsItemsOneOf1() throws RecognitionException {
        try {
            // InternalContainerPortsItemsOneOf1Parser.g:56:1: ( ruleContainerPortsItemsOneOf1 EOF )
            // InternalContainerPortsItemsOneOf1Parser.g:57:1: ruleContainerPortsItemsOneOf1 EOF
            {
             before(grammarAccess.getContainerPortsItemsOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            ruleContainerPortsItemsOneOf1();

            state._fsp--;

             after(grammarAccess.getContainerPortsItemsOneOf1Rule()); 
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
    // $ANTLR end "entryRuleContainerPortsItemsOneOf1"


    // $ANTLR start "ruleContainerPortsItemsOneOf1"
    // InternalContainerPortsItemsOneOf1Parser.g:64:1: ruleContainerPortsItemsOneOf1 : ( ( rule__ContainerPortsItemsOneOf1__ItemsAssignment ) ) ;
    public final void ruleContainerPortsItemsOneOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainerPortsItemsOneOf1Parser.g:68:2: ( ( ( rule__ContainerPortsItemsOneOf1__ItemsAssignment ) ) )
            // InternalContainerPortsItemsOneOf1Parser.g:69:2: ( ( rule__ContainerPortsItemsOneOf1__ItemsAssignment ) )
            {
            // InternalContainerPortsItemsOneOf1Parser.g:69:2: ( ( rule__ContainerPortsItemsOneOf1__ItemsAssignment ) )
            // InternalContainerPortsItemsOneOf1Parser.g:70:3: ( rule__ContainerPortsItemsOneOf1__ItemsAssignment )
            {
             before(grammarAccess.getContainerPortsItemsOneOf1Access().getItemsAssignment()); 
            // InternalContainerPortsItemsOneOf1Parser.g:71:3: ( rule__ContainerPortsItemsOneOf1__ItemsAssignment )
            // InternalContainerPortsItemsOneOf1Parser.g:71:4: rule__ContainerPortsItemsOneOf1__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ContainerPortsItemsOneOf1__ItemsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getContainerPortsItemsOneOf1Access().getItemsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainerPortsItemsOneOf1"


    // $ANTLR start "entryRuleEString"
    // InternalContainerPortsItemsOneOf1Parser.g:80:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalContainerPortsItemsOneOf1Parser.g:81:1: ( ruleEString EOF )
            // InternalContainerPortsItemsOneOf1Parser.g:82:1: ruleEString EOF
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
    // InternalContainerPortsItemsOneOf1Parser.g:89:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainerPortsItemsOneOf1Parser.g:93:2: ( ( ruleVALID_STRING ) )
            // InternalContainerPortsItemsOneOf1Parser.g:94:2: ( ruleVALID_STRING )
            {
            // InternalContainerPortsItemsOneOf1Parser.g:94:2: ( ruleVALID_STRING )
            // InternalContainerPortsItemsOneOf1Parser.g:95:3: ruleVALID_STRING
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
    // InternalContainerPortsItemsOneOf1Parser.g:105:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalContainerPortsItemsOneOf1Parser.g:106:1: ( ruleVALID_STRING EOF )
            // InternalContainerPortsItemsOneOf1Parser.g:107:1: ruleVALID_STRING EOF
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
    // InternalContainerPortsItemsOneOf1Parser.g:114:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainerPortsItemsOneOf1Parser.g:118:2: ( ( RULE_STRING ) )
            // InternalContainerPortsItemsOneOf1Parser.g:119:2: ( RULE_STRING )
            {
            // InternalContainerPortsItemsOneOf1Parser.g:119:2: ( RULE_STRING )
            // InternalContainerPortsItemsOneOf1Parser.g:120:3: RULE_STRING
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


    // $ANTLR start "rule__ContainerPortsItemsOneOf1__ItemsAssignment"
    // InternalContainerPortsItemsOneOf1Parser.g:129:1: rule__ContainerPortsItemsOneOf1__ItemsAssignment : ( ruleEString ) ;
    public final void rule__ContainerPortsItemsOneOf1__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainerPortsItemsOneOf1Parser.g:133:1: ( ( ruleEString ) )
            // InternalContainerPortsItemsOneOf1Parser.g:134:2: ( ruleEString )
            {
            // InternalContainerPortsItemsOneOf1Parser.g:134:2: ( ruleEString )
            // InternalContainerPortsItemsOneOf1Parser.g:135:3: ruleEString
            {
             before(grammarAccess.getContainerPortsItemsOneOf1Access().getItemsEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerPortsItemsOneOf1Access().getItemsEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerPortsItemsOneOf1__ItemsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}