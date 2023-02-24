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
import githubwf.githubwf.services.EventObjectOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventObjectOneOf1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Null", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=4;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_E_INT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_E_DOUBLE=8;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEventObjectOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventObjectOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventObjectOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEventObjectOneOf1Parser.g"; }


    	private EventObjectOneOf1GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Null", "'null'");
    	}

    	public void setGrammarAccess(EventObjectOneOf1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEventObjectOneOf1"
    // InternalEventObjectOneOf1Parser.g:56:1: entryRuleEventObjectOneOf1 : ruleEventObjectOneOf1 EOF ;
    public final void entryRuleEventObjectOneOf1() throws RecognitionException {
        try {
            // InternalEventObjectOneOf1Parser.g:57:1: ( ruleEventObjectOneOf1 EOF )
            // InternalEventObjectOneOf1Parser.g:58:1: ruleEventObjectOneOf1 EOF
            {
             before(grammarAccess.getEventObjectOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            ruleEventObjectOneOf1();

            state._fsp--;

             after(grammarAccess.getEventObjectOneOf1Rule()); 
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
    // $ANTLR end "entryRuleEventObjectOneOf1"


    // $ANTLR start "ruleEventObjectOneOf1"
    // InternalEventObjectOneOf1Parser.g:65:1: ruleEventObjectOneOf1 : ( ( rule__EventObjectOneOf1__EventObjectAssignment ) ) ;
    public final void ruleEventObjectOneOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf1Parser.g:69:2: ( ( ( rule__EventObjectOneOf1__EventObjectAssignment ) ) )
            // InternalEventObjectOneOf1Parser.g:70:2: ( ( rule__EventObjectOneOf1__EventObjectAssignment ) )
            {
            // InternalEventObjectOneOf1Parser.g:70:2: ( ( rule__EventObjectOneOf1__EventObjectAssignment ) )
            // InternalEventObjectOneOf1Parser.g:71:3: ( rule__EventObjectOneOf1__EventObjectAssignment )
            {
             before(grammarAccess.getEventObjectOneOf1Access().getEventObjectAssignment()); 
            // InternalEventObjectOneOf1Parser.g:72:3: ( rule__EventObjectOneOf1__EventObjectAssignment )
            // InternalEventObjectOneOf1Parser.g:72:4: rule__EventObjectOneOf1__EventObjectAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EventObjectOneOf1__EventObjectAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventObjectOneOf1Access().getEventObjectAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventObjectOneOf1"


    // $ANTLR start "entryRuleNullValue"
    // InternalEventObjectOneOf1Parser.g:81:1: entryRuleNullValue : ruleNullValue EOF ;
    public final void entryRuleNullValue() throws RecognitionException {
        try {
            // InternalEventObjectOneOf1Parser.g:82:1: ( ruleNullValue EOF )
            // InternalEventObjectOneOf1Parser.g:83:1: ruleNullValue EOF
            {
             before(grammarAccess.getNullValueRule()); 
            pushFollow(FOLLOW_1);
            ruleNullValue();

            state._fsp--;

             after(grammarAccess.getNullValueRule()); 
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
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalEventObjectOneOf1Parser.g:90:1: ruleNullValue : ( ( rule__NullValue__ValueAssignment ) ) ;
    public final void ruleNullValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf1Parser.g:94:2: ( ( ( rule__NullValue__ValueAssignment ) ) )
            // InternalEventObjectOneOf1Parser.g:95:2: ( ( rule__NullValue__ValueAssignment ) )
            {
            // InternalEventObjectOneOf1Parser.g:95:2: ( ( rule__NullValue__ValueAssignment ) )
            // InternalEventObjectOneOf1Parser.g:96:3: ( rule__NullValue__ValueAssignment )
            {
             before(grammarAccess.getNullValueAccess().getValueAssignment()); 
            // InternalEventObjectOneOf1Parser.g:97:3: ( rule__NullValue__ValueAssignment )
            // InternalEventObjectOneOf1Parser.g:97:4: rule__NullValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NullValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNullValueAccess().getValueAssignment()); 

            }


            }

        }
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


    // $ANTLR start "ruleNullEnum"
    // InternalEventObjectOneOf1Parser.g:106:1: ruleNullEnum : ( ( Null ) ) ;
    public final void ruleNullEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf1Parser.g:110:1: ( ( ( Null ) ) )
            // InternalEventObjectOneOf1Parser.g:111:2: ( ( Null ) )
            {
            // InternalEventObjectOneOf1Parser.g:111:2: ( ( Null ) )
            // InternalEventObjectOneOf1Parser.g:112:3: ( Null )
            {
             before(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 
            // InternalEventObjectOneOf1Parser.g:113:3: ( Null )
            // InternalEventObjectOneOf1Parser.g:113:4: Null
            {
            match(input,Null,FOLLOW_2); 

            }

             after(grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration()); 

            }


            }

        }
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


    // $ANTLR start "rule__EventObjectOneOf1__EventObjectAssignment"
    // InternalEventObjectOneOf1Parser.g:121:1: rule__EventObjectOneOf1__EventObjectAssignment : ( ruleNullValue ) ;
    public final void rule__EventObjectOneOf1__EventObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf1Parser.g:125:1: ( ( ruleNullValue ) )
            // InternalEventObjectOneOf1Parser.g:126:2: ( ruleNullValue )
            {
            // InternalEventObjectOneOf1Parser.g:126:2: ( ruleNullValue )
            // InternalEventObjectOneOf1Parser.g:127:3: ruleNullValue
            {
             before(grammarAccess.getEventObjectOneOf1Access().getEventObjectNullValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNullValue();

            state._fsp--;

             after(grammarAccess.getEventObjectOneOf1Access().getEventObjectNullValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventObjectOneOf1__EventObjectAssignment"


    // $ANTLR start "rule__NullValue__ValueAssignment"
    // InternalEventObjectOneOf1Parser.g:136:1: rule__NullValue__ValueAssignment : ( ruleNullEnum ) ;
    public final void rule__NullValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventObjectOneOf1Parser.g:140:1: ( ( ruleNullEnum ) )
            // InternalEventObjectOneOf1Parser.g:141:2: ( ruleNullEnum )
            {
            // InternalEventObjectOneOf1Parser.g:141:2: ( ruleNullEnum )
            // InternalEventObjectOneOf1Parser.g:142:3: ruleNullEnum
            {
             before(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNullEnum();

            state._fsp--;

             after(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0()); 

            }


            }

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}