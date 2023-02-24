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
import githubwf.githubwf.services.EnvOneOf0AdditionalPropertiesOneOf2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnvOneOf0AdditionalPropertiesOneOf2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "True", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int True=5;
    public static final int RULE_E_INT=8;
    public static final int RULE_STRING=7;
    public static final int False=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_E_DOUBLE=9;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEnvOneOf0AdditionalPropertiesOneOf2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnvOneOf0AdditionalPropertiesOneOf2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g"; }


    	private EnvOneOf0AdditionalPropertiesOneOf2GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("False", "'false'");
    	}

    	public void setGrammarAccess(EnvOneOf0AdditionalPropertiesOneOf2GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEnvOneOf0AdditionalPropertiesOneOf2"
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:57:1: entryRuleEnvOneOf0AdditionalPropertiesOneOf2 : ruleEnvOneOf0AdditionalPropertiesOneOf2 EOF ;
    public final void entryRuleEnvOneOf0AdditionalPropertiesOneOf2() throws RecognitionException {
        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:58:1: ( ruleEnvOneOf0AdditionalPropertiesOneOf2 EOF )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:59:1: ruleEnvOneOf0AdditionalPropertiesOneOf2 EOF
            {
             before(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf2Rule()); 
            pushFollow(FOLLOW_1);
            ruleEnvOneOf0AdditionalPropertiesOneOf2();

            state._fsp--;

             after(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf2Rule()); 
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
    // $ANTLR end "entryRuleEnvOneOf0AdditionalPropertiesOneOf2"


    // $ANTLR start "ruleEnvOneOf0AdditionalPropertiesOneOf2"
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:66:1: ruleEnvOneOf0AdditionalPropertiesOneOf2 : ( ( rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment ) ) ;
    public final void ruleEnvOneOf0AdditionalPropertiesOneOf2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:70:2: ( ( ( rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment ) ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:71:2: ( ( rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment ) )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:71:2: ( ( rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:72:3: ( rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment )
            {
             before(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf2Access().getAdditionalPropertiesAssignment()); 
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:73:3: ( rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:73:4: rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf2Access().getAdditionalPropertiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvOneOf0AdditionalPropertiesOneOf2"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:82:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:83:1: ( ruleEBooleanObject EOF )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:84:1: ruleEBooleanObject EOF
            {
             before(grammarAccess.getEBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getEBooleanObjectRule()); 
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
    // $ANTLR end "entryRuleEBooleanObject"


    // $ANTLR start "ruleEBooleanObject"
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:91:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:95:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:96:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:96:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:97:3: ( rule__EBooleanObject__Alternatives )
            {
             before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:98:3: ( rule__EBooleanObject__Alternatives )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:98:4: rule__EBooleanObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBooleanObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__EBooleanObject__Alternatives"
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:106:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:110:1: ( ( True ) | ( False ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==True) ) {
                alt1=1;
            }
            else if ( (LA1_0==False) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:111:2: ( True )
                    {
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:111:2: ( True )
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:112:3: True
                    {
                     before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:117:2: ( False )
                    {
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:117:2: ( False )
                    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:118:3: False
                    {
                     before(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 
                    match(input,False,FOLLOW_2); 
                     after(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1()); 

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


    // $ANTLR start "rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment"
    // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:127:1: rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment : ( ruleEBooleanObject ) ;
    public final void rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:131:1: ( ( ruleEBooleanObject ) )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:132:2: ( ruleEBooleanObject )
            {
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:132:2: ( ruleEBooleanObject )
            // InternalEnvOneOf0AdditionalPropertiesOneOf2Parser.g:133:3: ruleEBooleanObject
            {
             before(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf2Access().getAdditionalPropertiesEBooleanObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getEnvOneOf0AdditionalPropertiesOneOf2Access().getAdditionalPropertiesEBooleanObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvOneOf0AdditionalPropertiesOneOf2__AdditionalPropertiesAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}