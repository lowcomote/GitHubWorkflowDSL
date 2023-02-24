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
import githubwf.githubwf.services.NormalJobEnvironmentOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobEnvironmentOneOf0Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Environment", "Colon", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int RULE_E_INT=8;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int Environment=4;
    public static final int Colon=5;
    public static final int RULE_E_DOUBLE=9;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalNormalJobEnvironmentOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobEnvironmentOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobEnvironmentOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobEnvironmentOneOf0Parser.g"; }


    	private NormalJobEnvironmentOneOf0GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Environment", "'\"environment\"'");
    	}

    	public void setGrammarAccess(NormalJobEnvironmentOneOf0GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleNormalJobEnvironmentOneOf0"
    // InternalNormalJobEnvironmentOneOf0Parser.g:57:1: entryRuleNormalJobEnvironmentOneOf0 : ruleNormalJobEnvironmentOneOf0 EOF ;
    public final void entryRuleNormalJobEnvironmentOneOf0() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:58:1: ( ruleNormalJobEnvironmentOneOf0 EOF )
            // InternalNormalJobEnvironmentOneOf0Parser.g:59:1: ruleNormalJobEnvironmentOneOf0 EOF
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            ruleNormalJobEnvironmentOneOf0();

            state._fsp--;

             after(grammarAccess.getNormalJobEnvironmentOneOf0Rule()); 
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
    // $ANTLR end "entryRuleNormalJobEnvironmentOneOf0"


    // $ANTLR start "ruleNormalJobEnvironmentOneOf0"
    // InternalNormalJobEnvironmentOneOf0Parser.g:66:1: ruleNormalJobEnvironmentOneOf0 : ( ( rule__NormalJobEnvironmentOneOf0__Group__0 ) ) ;
    public final void ruleNormalJobEnvironmentOneOf0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:70:2: ( ( ( rule__NormalJobEnvironmentOneOf0__Group__0 ) ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:71:2: ( ( rule__NormalJobEnvironmentOneOf0__Group__0 ) )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:71:2: ( ( rule__NormalJobEnvironmentOneOf0__Group__0 ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:72:3: ( rule__NormalJobEnvironmentOneOf0__Group__0 )
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getGroup()); 
            // InternalNormalJobEnvironmentOneOf0Parser.g:73:3: ( rule__NormalJobEnvironmentOneOf0__Group__0 )
            // InternalNormalJobEnvironmentOneOf0Parser.g:73:4: rule__NormalJobEnvironmentOneOf0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getGroup()); 

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
    // $ANTLR end "ruleNormalJobEnvironmentOneOf0"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobEnvironmentOneOf0Parser.g:82:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:83:1: ( ruleEString EOF )
            // InternalNormalJobEnvironmentOneOf0Parser.g:84:1: ruleEString EOF
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
    // InternalNormalJobEnvironmentOneOf0Parser.g:91:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:95:2: ( ( ruleVALID_STRING ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:96:2: ( ruleVALID_STRING )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:96:2: ( ruleVALID_STRING )
            // InternalNormalJobEnvironmentOneOf0Parser.g:97:3: ruleVALID_STRING
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
    // InternalNormalJobEnvironmentOneOf0Parser.g:107:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:108:1: ( ruleVALID_STRING EOF )
            // InternalNormalJobEnvironmentOneOf0Parser.g:109:1: ruleVALID_STRING EOF
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
    // InternalNormalJobEnvironmentOneOf0Parser.g:116:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:120:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:121:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:121:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:122:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalNormalJobEnvironmentOneOf0Parser.g:123:3: ( rule__VALID_STRING__Alternatives )
            // InternalNormalJobEnvironmentOneOf0Parser.g:123:4: rule__VALID_STRING__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VALID_STRING__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleKEYWORD"
    // InternalNormalJobEnvironmentOneOf0Parser.g:132:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:133:1: ( ruleKEYWORD EOF )
            // InternalNormalJobEnvironmentOneOf0Parser.g:134:1: ruleKEYWORD EOF
            {
             before(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;

             after(grammarAccess.getKEYWORDRule()); 
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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalNormalJobEnvironmentOneOf0Parser.g:141:1: ruleKEYWORD : ( Environment ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:145:2: ( ( Environment ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:146:2: ( Environment )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:146:2: ( Environment )
            // InternalNormalJobEnvironmentOneOf0Parser.g:147:3: Environment
            {
             before(grammarAccess.getKEYWORDAccess().getEnvironmentKeyword()); 
            match(input,Environment,FOLLOW_2); 
             after(grammarAccess.getKEYWORDAccess().getEnvironmentKeyword()); 

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
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "rule__VALID_STRING__Alternatives"
    // InternalNormalJobEnvironmentOneOf0Parser.g:156:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:160:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==Environment) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf0Parser.g:161:2: ( RULE_STRING )
                    {
                    // InternalNormalJobEnvironmentOneOf0Parser.g:161:2: ( RULE_STRING )
                    // InternalNormalJobEnvironmentOneOf0Parser.g:162:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobEnvironmentOneOf0Parser.g:167:2: ( ruleKEYWORD )
                    {
                    // InternalNormalJobEnvironmentOneOf0Parser.g:167:2: ( ruleKEYWORD )
                    // InternalNormalJobEnvironmentOneOf0Parser.g:168:3: ruleKEYWORD
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKEYWORD();

                    state._fsp--;

                     after(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1()); 

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
    // $ANTLR end "rule__VALID_STRING__Alternatives"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf0__Group__0"
    // InternalNormalJobEnvironmentOneOf0Parser.g:177:1: rule__NormalJobEnvironmentOneOf0__Group__0 : rule__NormalJobEnvironmentOneOf0__Group__0__Impl rule__NormalJobEnvironmentOneOf0__Group__1 ;
    public final void rule__NormalJobEnvironmentOneOf0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:181:1: ( rule__NormalJobEnvironmentOneOf0__Group__0__Impl rule__NormalJobEnvironmentOneOf0__Group__1 )
            // InternalNormalJobEnvironmentOneOf0Parser.g:182:2: rule__NormalJobEnvironmentOneOf0__Group__0__Impl rule__NormalJobEnvironmentOneOf0__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NormalJobEnvironmentOneOf0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalJobEnvironmentOneOf0__Group__0"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf0__Group__0__Impl"
    // InternalNormalJobEnvironmentOneOf0Parser.g:189:1: rule__NormalJobEnvironmentOneOf0__Group__0__Impl : ( Environment ) ;
    public final void rule__NormalJobEnvironmentOneOf0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:193:1: ( ( Environment ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:194:1: ( Environment )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:194:1: ( Environment )
            // InternalNormalJobEnvironmentOneOf0Parser.g:195:2: Environment
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentKeyword_0()); 
            match(input,Environment,FOLLOW_2); 
             after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentKeyword_0()); 

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf0__Group__0__Impl"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf0__Group__1"
    // InternalNormalJobEnvironmentOneOf0Parser.g:204:1: rule__NormalJobEnvironmentOneOf0__Group__1 : rule__NormalJobEnvironmentOneOf0__Group__1__Impl rule__NormalJobEnvironmentOneOf0__Group__2 ;
    public final void rule__NormalJobEnvironmentOneOf0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:208:1: ( rule__NormalJobEnvironmentOneOf0__Group__1__Impl rule__NormalJobEnvironmentOneOf0__Group__2 )
            // InternalNormalJobEnvironmentOneOf0Parser.g:209:2: rule__NormalJobEnvironmentOneOf0__Group__1__Impl rule__NormalJobEnvironmentOneOf0__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NormalJobEnvironmentOneOf0__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf0__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalJobEnvironmentOneOf0__Group__1"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf0__Group__1__Impl"
    // InternalNormalJobEnvironmentOneOf0Parser.g:216:1: rule__NormalJobEnvironmentOneOf0__Group__1__Impl : ( Colon ) ;
    public final void rule__NormalJobEnvironmentOneOf0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:220:1: ( ( Colon ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:221:1: ( Colon )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:221:1: ( Colon )
            // InternalNormalJobEnvironmentOneOf0Parser.g:222:2: Colon
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getColonKeyword_1()); 

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf0__Group__1__Impl"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf0__Group__2"
    // InternalNormalJobEnvironmentOneOf0Parser.g:231:1: rule__NormalJobEnvironmentOneOf0__Group__2 : rule__NormalJobEnvironmentOneOf0__Group__2__Impl ;
    public final void rule__NormalJobEnvironmentOneOf0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:235:1: ( rule__NormalJobEnvironmentOneOf0__Group__2__Impl )
            // InternalNormalJobEnvironmentOneOf0Parser.g:236:2: rule__NormalJobEnvironmentOneOf0__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf0__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalJobEnvironmentOneOf0__Group__2"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf0__Group__2__Impl"
    // InternalNormalJobEnvironmentOneOf0Parser.g:242:1: rule__NormalJobEnvironmentOneOf0__Group__2__Impl : ( ( rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2 ) ) ;
    public final void rule__NormalJobEnvironmentOneOf0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:246:1: ( ( ( rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2 ) ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:247:1: ( ( rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2 ) )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:247:1: ( ( rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2 ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:248:2: ( rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2 )
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentAssignment_2()); 
            // InternalNormalJobEnvironmentOneOf0Parser.g:249:2: ( rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2 )
            // InternalNormalJobEnvironmentOneOf0Parser.g:249:3: rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentAssignment_2()); 

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf0__Group__2__Impl"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2"
    // InternalNormalJobEnvironmentOneOf0Parser.g:258:1: rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2 : ( ruleEString ) ;
    public final void rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:262:1: ( ( ruleEString ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:263:2: ( ruleEString )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:263:2: ( ruleEString )
            // InternalNormalJobEnvironmentOneOf0Parser.g:264:3: ruleEString
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf0__EnvironmentAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000090L});

}