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
import githubwf.githubwf.services.ConfigurationOneOf2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigurationOneOf2Parser extends AbstractInternalContentAssistParser {
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


        public InternalConfigurationOneOf2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigurationOneOf2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigurationOneOf2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigurationOneOf2Parser.g"; }


    	private ConfigurationOneOf2GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("False", "'false'");
    	}

    	public void setGrammarAccess(ConfigurationOneOf2GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleConfigurationOneOf2"
    // InternalConfigurationOneOf2Parser.g:57:1: entryRuleConfigurationOneOf2 : ruleConfigurationOneOf2 EOF ;
    public final void entryRuleConfigurationOneOf2() throws RecognitionException {
        try {
            // InternalConfigurationOneOf2Parser.g:58:1: ( ruleConfigurationOneOf2 EOF )
            // InternalConfigurationOneOf2Parser.g:59:1: ruleConfigurationOneOf2 EOF
            {
             before(grammarAccess.getConfigurationOneOf2Rule()); 
            pushFollow(FOLLOW_1);
            ruleConfigurationOneOf2();

            state._fsp--;

             after(grammarAccess.getConfigurationOneOf2Rule()); 
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
    // $ANTLR end "entryRuleConfigurationOneOf2"


    // $ANTLR start "ruleConfigurationOneOf2"
    // InternalConfigurationOneOf2Parser.g:66:1: ruleConfigurationOneOf2 : ( ( rule__ConfigurationOneOf2__ConfigurationAssignment ) ) ;
    public final void ruleConfigurationOneOf2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf2Parser.g:70:2: ( ( ( rule__ConfigurationOneOf2__ConfigurationAssignment ) ) )
            // InternalConfigurationOneOf2Parser.g:71:2: ( ( rule__ConfigurationOneOf2__ConfigurationAssignment ) )
            {
            // InternalConfigurationOneOf2Parser.g:71:2: ( ( rule__ConfigurationOneOf2__ConfigurationAssignment ) )
            // InternalConfigurationOneOf2Parser.g:72:3: ( rule__ConfigurationOneOf2__ConfigurationAssignment )
            {
             before(grammarAccess.getConfigurationOneOf2Access().getConfigurationAssignment()); 
            // InternalConfigurationOneOf2Parser.g:73:3: ( rule__ConfigurationOneOf2__ConfigurationAssignment )
            // InternalConfigurationOneOf2Parser.g:73:4: rule__ConfigurationOneOf2__ConfigurationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ConfigurationOneOf2__ConfigurationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConfigurationOneOf2Access().getConfigurationAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigurationOneOf2"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalConfigurationOneOf2Parser.g:82:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalConfigurationOneOf2Parser.g:83:1: ( ruleEBooleanObject EOF )
            // InternalConfigurationOneOf2Parser.g:84:1: ruleEBooleanObject EOF
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
    // InternalConfigurationOneOf2Parser.g:91:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf2Parser.g:95:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalConfigurationOneOf2Parser.g:96:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalConfigurationOneOf2Parser.g:96:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalConfigurationOneOf2Parser.g:97:3: ( rule__EBooleanObject__Alternatives )
            {
             before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            // InternalConfigurationOneOf2Parser.g:98:3: ( rule__EBooleanObject__Alternatives )
            // InternalConfigurationOneOf2Parser.g:98:4: rule__EBooleanObject__Alternatives
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
    // InternalConfigurationOneOf2Parser.g:106:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf2Parser.g:110:1: ( ( True ) | ( False ) )
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
                    // InternalConfigurationOneOf2Parser.g:111:2: ( True )
                    {
                    // InternalConfigurationOneOf2Parser.g:111:2: ( True )
                    // InternalConfigurationOneOf2Parser.g:112:3: True
                    {
                     before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalConfigurationOneOf2Parser.g:117:2: ( False )
                    {
                    // InternalConfigurationOneOf2Parser.g:117:2: ( False )
                    // InternalConfigurationOneOf2Parser.g:118:3: False
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


    // $ANTLR start "rule__ConfigurationOneOf2__ConfigurationAssignment"
    // InternalConfigurationOneOf2Parser.g:127:1: rule__ConfigurationOneOf2__ConfigurationAssignment : ( ruleEBooleanObject ) ;
    public final void rule__ConfigurationOneOf2__ConfigurationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigurationOneOf2Parser.g:131:1: ( ( ruleEBooleanObject ) )
            // InternalConfigurationOneOf2Parser.g:132:2: ( ruleEBooleanObject )
            {
            // InternalConfigurationOneOf2Parser.g:132:2: ( ruleEBooleanObject )
            // InternalConfigurationOneOf2Parser.g:133:3: ruleEBooleanObject
            {
             before(grammarAccess.getConfigurationOneOf2Access().getConfigurationEBooleanObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getConfigurationOneOf2Access().getConfigurationEBooleanObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigurationOneOf2__ConfigurationAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}