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
import githubwf.githubwf.services.ContainerPortsItemsOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContainerPortsItemsOneOf0Parser extends AbstractInternalContentAssistParser {
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


        public InternalContainerPortsItemsOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContainerPortsItemsOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContainerPortsItemsOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalContainerPortsItemsOneOf0Parser.g"; }


    	private ContainerPortsItemsOneOf0GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    	}

    	public void setGrammarAccess(ContainerPortsItemsOneOf0GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleContainerPortsItemsOneOf0"
    // InternalContainerPortsItemsOneOf0Parser.g:55:1: entryRuleContainerPortsItemsOneOf0 : ruleContainerPortsItemsOneOf0 EOF ;
    public final void entryRuleContainerPortsItemsOneOf0() throws RecognitionException {
        try {
            // InternalContainerPortsItemsOneOf0Parser.g:56:1: ( ruleContainerPortsItemsOneOf0 EOF )
            // InternalContainerPortsItemsOneOf0Parser.g:57:1: ruleContainerPortsItemsOneOf0 EOF
            {
             before(grammarAccess.getContainerPortsItemsOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            ruleContainerPortsItemsOneOf0();

            state._fsp--;

             after(grammarAccess.getContainerPortsItemsOneOf0Rule()); 
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
    // $ANTLR end "entryRuleContainerPortsItemsOneOf0"


    // $ANTLR start "ruleContainerPortsItemsOneOf0"
    // InternalContainerPortsItemsOneOf0Parser.g:64:1: ruleContainerPortsItemsOneOf0 : ( ( rule__ContainerPortsItemsOneOf0__ItemsAssignment ) ) ;
    public final void ruleContainerPortsItemsOneOf0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainerPortsItemsOneOf0Parser.g:68:2: ( ( ( rule__ContainerPortsItemsOneOf0__ItemsAssignment ) ) )
            // InternalContainerPortsItemsOneOf0Parser.g:69:2: ( ( rule__ContainerPortsItemsOneOf0__ItemsAssignment ) )
            {
            // InternalContainerPortsItemsOneOf0Parser.g:69:2: ( ( rule__ContainerPortsItemsOneOf0__ItemsAssignment ) )
            // InternalContainerPortsItemsOneOf0Parser.g:70:3: ( rule__ContainerPortsItemsOneOf0__ItemsAssignment )
            {
             before(grammarAccess.getContainerPortsItemsOneOf0Access().getItemsAssignment()); 
            // InternalContainerPortsItemsOneOf0Parser.g:71:3: ( rule__ContainerPortsItemsOneOf0__ItemsAssignment )
            // InternalContainerPortsItemsOneOf0Parser.g:71:4: rule__ContainerPortsItemsOneOf0__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ContainerPortsItemsOneOf0__ItemsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getContainerPortsItemsOneOf0Access().getItemsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainerPortsItemsOneOf0"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalContainerPortsItemsOneOf0Parser.g:80:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalContainerPortsItemsOneOf0Parser.g:81:1: ( ruleEDoubleObject EOF )
            // InternalContainerPortsItemsOneOf0Parser.g:82:1: ruleEDoubleObject EOF
            {
             before(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getEDoubleObjectRule()); 
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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalContainerPortsItemsOneOf0Parser.g:89:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Alternatives ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainerPortsItemsOneOf0Parser.g:93:2: ( ( ( rule__EDoubleObject__Alternatives ) ) )
            // InternalContainerPortsItemsOneOf0Parser.g:94:2: ( ( rule__EDoubleObject__Alternatives ) )
            {
            // InternalContainerPortsItemsOneOf0Parser.g:94:2: ( ( rule__EDoubleObject__Alternatives ) )
            // InternalContainerPortsItemsOneOf0Parser.g:95:3: ( rule__EDoubleObject__Alternatives )
            {
             before(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 
            // InternalContainerPortsItemsOneOf0Parser.g:96:3: ( rule__EDoubleObject__Alternatives )
            // InternalContainerPortsItemsOneOf0Parser.g:96:4: rule__EDoubleObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleObjectAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__EDoubleObject__Alternatives"
    // InternalContainerPortsItemsOneOf0Parser.g:104:1: rule__EDoubleObject__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDoubleObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainerPortsItemsOneOf0Parser.g:108:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_E_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_E_DOUBLE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalContainerPortsItemsOneOf0Parser.g:109:2: ( RULE_E_INT )
                    {
                    // InternalContainerPortsItemsOneOf0Parser.g:109:2: ( RULE_E_INT )
                    // InternalContainerPortsItemsOneOf0Parser.g:110:3: RULE_E_INT
                    {
                     before(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); 
                    match(input,RULE_E_INT,FOLLOW_2); 
                     after(grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalContainerPortsItemsOneOf0Parser.g:115:2: ( RULE_E_DOUBLE )
                    {
                    // InternalContainerPortsItemsOneOf0Parser.g:115:2: ( RULE_E_DOUBLE )
                    // InternalContainerPortsItemsOneOf0Parser.g:116:3: RULE_E_DOUBLE
                    {
                     before(grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1()); 
                    match(input,RULE_E_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1()); 

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


    // $ANTLR start "rule__ContainerPortsItemsOneOf0__ItemsAssignment"
    // InternalContainerPortsItemsOneOf0Parser.g:125:1: rule__ContainerPortsItemsOneOf0__ItemsAssignment : ( ruleEDoubleObject ) ;
    public final void rule__ContainerPortsItemsOneOf0__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainerPortsItemsOneOf0Parser.g:129:1: ( ( ruleEDoubleObject ) )
            // InternalContainerPortsItemsOneOf0Parser.g:130:2: ( ruleEDoubleObject )
            {
            // InternalContainerPortsItemsOneOf0Parser.g:130:2: ( ruleEDoubleObject )
            // InternalContainerPortsItemsOneOf0Parser.g:131:3: ruleEDoubleObject
            {
             before(grammarAccess.getContainerPortsItemsOneOf0Access().getItemsEDoubleObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getContainerPortsItemsOneOf0Access().getItemsEDoubleObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerPortsItemsOneOf0__ItemsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}