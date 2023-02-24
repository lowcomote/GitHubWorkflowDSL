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
import githubwf.githubwf.services.NormalJobRuns_45onOneOf2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobRuns_45onOneOf2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RunsOn", "Colon", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int RULE_E_INT=8;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_SL_COMMENT=12;
    public static final int RunsOn=4;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int Colon=5;
    public static final int RULE_E_DOUBLE=9;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalNormalJobRuns_45onOneOf2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobRuns_45onOneOf2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobRuns_45onOneOf2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobRuns_45onOneOf2Parser.g"; }


    	private NormalJobRuns_45onOneOf2GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("RunsOn", "'\"runs-on\"'");
    	}

    	public void setGrammarAccess(NormalJobRuns_45onOneOf2GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf2"
    // InternalNormalJobRuns_45onOneOf2Parser.g:57:1: entryRuleNormalJobRuns_45onOneOf2 : ruleNormalJobRuns_45onOneOf2 EOF ;
    public final void entryRuleNormalJobRuns_45onOneOf2() throws RecognitionException {
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:58:1: ( ruleNormalJobRuns_45onOneOf2 EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:59:1: ruleNormalJobRuns_45onOneOf2 EOF
            {
             before(grammarAccess.getNormalJobRuns_45onOneOf2Rule()); 
            pushFollow(FOLLOW_1);
            ruleNormalJobRuns_45onOneOf2();

            state._fsp--;

             after(grammarAccess.getNormalJobRuns_45onOneOf2Rule()); 
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
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf2"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf2"
    // InternalNormalJobRuns_45onOneOf2Parser.g:66:1: ruleNormalJobRuns_45onOneOf2 : ( ( rule__NormalJobRuns_45onOneOf2__Group__0 ) ) ;
    public final void ruleNormalJobRuns_45onOneOf2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:70:2: ( ( ( rule__NormalJobRuns_45onOneOf2__Group__0 ) ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:71:2: ( ( rule__NormalJobRuns_45onOneOf2__Group__0 ) )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:71:2: ( ( rule__NormalJobRuns_45onOneOf2__Group__0 ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:72:3: ( rule__NormalJobRuns_45onOneOf2__Group__0 )
            {
             before(grammarAccess.getNormalJobRuns_45onOneOf2Access().getGroup()); 
            // InternalNormalJobRuns_45onOneOf2Parser.g:73:3: ( rule__NormalJobRuns_45onOneOf2__Group__0 )
            // InternalNormalJobRuns_45onOneOf2Parser.g:73:4: rule__NormalJobRuns_45onOneOf2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobRuns_45onOneOf2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormalJobRuns_45onOneOf2Access().getGroup()); 

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
    // $ANTLR end "ruleNormalJobRuns_45onOneOf2"


    // $ANTLR start "entryRuleStringContainingExpressionSyntax"
    // InternalNormalJobRuns_45onOneOf2Parser.g:82:1: entryRuleStringContainingExpressionSyntax : ruleStringContainingExpressionSyntax EOF ;
    public final void entryRuleStringContainingExpressionSyntax() throws RecognitionException {
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:83:1: ( ruleStringContainingExpressionSyntax EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:84:1: ruleStringContainingExpressionSyntax EOF
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
    // InternalNormalJobRuns_45onOneOf2Parser.g:91:1: ruleStringContainingExpressionSyntax : ( ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment ) ) ;
    public final void ruleStringContainingExpressionSyntax() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:95:2: ( ( ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment ) ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:96:2: ( ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment ) )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:96:2: ( ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:97:3: ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment )
            {
             before(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxAssignment()); 
            // InternalNormalJobRuns_45onOneOf2Parser.g:98:3: ( rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment )
            // InternalNormalJobRuns_45onOneOf2Parser.g:98:4: rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment
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
    // InternalNormalJobRuns_45onOneOf2Parser.g:107:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:108:1: ( ruleEString EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:109:1: ruleEString EOF
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
    // InternalNormalJobRuns_45onOneOf2Parser.g:116:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:120:2: ( ( ruleVALID_STRING ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:121:2: ( ruleVALID_STRING )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:121:2: ( ruleVALID_STRING )
            // InternalNormalJobRuns_45onOneOf2Parser.g:122:3: ruleVALID_STRING
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
    // InternalNormalJobRuns_45onOneOf2Parser.g:132:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:133:1: ( ruleVALID_STRING EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:134:1: ruleVALID_STRING EOF
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
    // InternalNormalJobRuns_45onOneOf2Parser.g:141:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:145:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:146:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:146:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:147:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalNormalJobRuns_45onOneOf2Parser.g:148:3: ( rule__VALID_STRING__Alternatives )
            // InternalNormalJobRuns_45onOneOf2Parser.g:148:4: rule__VALID_STRING__Alternatives
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
    // InternalNormalJobRuns_45onOneOf2Parser.g:157:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:158:1: ( ruleKEYWORD EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:159:1: ruleKEYWORD EOF
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
    // InternalNormalJobRuns_45onOneOf2Parser.g:166:1: ruleKEYWORD : ( RunsOn ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:170:2: ( ( RunsOn ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:171:2: ( RunsOn )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:171:2: ( RunsOn )
            // InternalNormalJobRuns_45onOneOf2Parser.g:172:3: RunsOn
            {
             before(grammarAccess.getKEYWORDAccess().getRunsOnKeyword()); 
            match(input,RunsOn,FOLLOW_2); 
             after(grammarAccess.getKEYWORDAccess().getRunsOnKeyword()); 

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
    // InternalNormalJobRuns_45onOneOf2Parser.g:181:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:185:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RunsOn) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalNormalJobRuns_45onOneOf2Parser.g:186:2: ( RULE_STRING )
                    {
                    // InternalNormalJobRuns_45onOneOf2Parser.g:186:2: ( RULE_STRING )
                    // InternalNormalJobRuns_45onOneOf2Parser.g:187:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf2Parser.g:192:2: ( ruleKEYWORD )
                    {
                    // InternalNormalJobRuns_45onOneOf2Parser.g:192:2: ( ruleKEYWORD )
                    // InternalNormalJobRuns_45onOneOf2Parser.g:193:3: ruleKEYWORD
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


    // $ANTLR start "rule__NormalJobRuns_45onOneOf2__Group__0"
    // InternalNormalJobRuns_45onOneOf2Parser.g:202:1: rule__NormalJobRuns_45onOneOf2__Group__0 : rule__NormalJobRuns_45onOneOf2__Group__0__Impl rule__NormalJobRuns_45onOneOf2__Group__1 ;
    public final void rule__NormalJobRuns_45onOneOf2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:206:1: ( rule__NormalJobRuns_45onOneOf2__Group__0__Impl rule__NormalJobRuns_45onOneOf2__Group__1 )
            // InternalNormalJobRuns_45onOneOf2Parser.g:207:2: rule__NormalJobRuns_45onOneOf2__Group__0__Impl rule__NormalJobRuns_45onOneOf2__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NormalJobRuns_45onOneOf2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJobRuns_45onOneOf2__Group__1();

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
    // $ANTLR end "rule__NormalJobRuns_45onOneOf2__Group__0"


    // $ANTLR start "rule__NormalJobRuns_45onOneOf2__Group__0__Impl"
    // InternalNormalJobRuns_45onOneOf2Parser.g:214:1: rule__NormalJobRuns_45onOneOf2__Group__0__Impl : ( RunsOn ) ;
    public final void rule__NormalJobRuns_45onOneOf2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:218:1: ( ( RunsOn ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:219:1: ( RunsOn )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:219:1: ( RunsOn )
            // InternalNormalJobRuns_45onOneOf2Parser.g:220:2: RunsOn
            {
             before(grammarAccess.getNormalJobRuns_45onOneOf2Access().getRunsOnKeyword_0()); 
            match(input,RunsOn,FOLLOW_2); 
             after(grammarAccess.getNormalJobRuns_45onOneOf2Access().getRunsOnKeyword_0()); 

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
    // $ANTLR end "rule__NormalJobRuns_45onOneOf2__Group__0__Impl"


    // $ANTLR start "rule__NormalJobRuns_45onOneOf2__Group__1"
    // InternalNormalJobRuns_45onOneOf2Parser.g:229:1: rule__NormalJobRuns_45onOneOf2__Group__1 : rule__NormalJobRuns_45onOneOf2__Group__1__Impl rule__NormalJobRuns_45onOneOf2__Group__2 ;
    public final void rule__NormalJobRuns_45onOneOf2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:233:1: ( rule__NormalJobRuns_45onOneOf2__Group__1__Impl rule__NormalJobRuns_45onOneOf2__Group__2 )
            // InternalNormalJobRuns_45onOneOf2Parser.g:234:2: rule__NormalJobRuns_45onOneOf2__Group__1__Impl rule__NormalJobRuns_45onOneOf2__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NormalJobRuns_45onOneOf2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJobRuns_45onOneOf2__Group__2();

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
    // $ANTLR end "rule__NormalJobRuns_45onOneOf2__Group__1"


    // $ANTLR start "rule__NormalJobRuns_45onOneOf2__Group__1__Impl"
    // InternalNormalJobRuns_45onOneOf2Parser.g:241:1: rule__NormalJobRuns_45onOneOf2__Group__1__Impl : ( Colon ) ;
    public final void rule__NormalJobRuns_45onOneOf2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:245:1: ( ( Colon ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:246:1: ( Colon )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:246:1: ( Colon )
            // InternalNormalJobRuns_45onOneOf2Parser.g:247:2: Colon
            {
             before(grammarAccess.getNormalJobRuns_45onOneOf2Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getNormalJobRuns_45onOneOf2Access().getColonKeyword_1()); 

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
    // $ANTLR end "rule__NormalJobRuns_45onOneOf2__Group__1__Impl"


    // $ANTLR start "rule__NormalJobRuns_45onOneOf2__Group__2"
    // InternalNormalJobRuns_45onOneOf2Parser.g:256:1: rule__NormalJobRuns_45onOneOf2__Group__2 : rule__NormalJobRuns_45onOneOf2__Group__2__Impl ;
    public final void rule__NormalJobRuns_45onOneOf2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:260:1: ( rule__NormalJobRuns_45onOneOf2__Group__2__Impl )
            // InternalNormalJobRuns_45onOneOf2Parser.g:261:2: rule__NormalJobRuns_45onOneOf2__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobRuns_45onOneOf2__Group__2__Impl();

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
    // $ANTLR end "rule__NormalJobRuns_45onOneOf2__Group__2"


    // $ANTLR start "rule__NormalJobRuns_45onOneOf2__Group__2__Impl"
    // InternalNormalJobRuns_45onOneOf2Parser.g:267:1: rule__NormalJobRuns_45onOneOf2__Group__2__Impl : ( ( rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2 ) ) ;
    public final void rule__NormalJobRuns_45onOneOf2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:271:1: ( ( ( rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2 ) ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:272:1: ( ( rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2 ) )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:272:1: ( ( rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2 ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:273:2: ( rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2 )
            {
             before(grammarAccess.getNormalJobRuns_45onOneOf2Access().getRuns_45onAssignment_2()); 
            // InternalNormalJobRuns_45onOneOf2Parser.g:274:2: ( rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2 )
            // InternalNormalJobRuns_45onOneOf2Parser.g:274:3: rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormalJobRuns_45onOneOf2Access().getRuns_45onAssignment_2()); 

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
    // $ANTLR end "rule__NormalJobRuns_45onOneOf2__Group__2__Impl"


    // $ANTLR start "rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2"
    // InternalNormalJobRuns_45onOneOf2Parser.g:283:1: rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2 : ( ruleStringContainingExpressionSyntax ) ;
    public final void rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:287:1: ( ( ruleStringContainingExpressionSyntax ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:288:2: ( ruleStringContainingExpressionSyntax )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:288:2: ( ruleStringContainingExpressionSyntax )
            // InternalNormalJobRuns_45onOneOf2Parser.g:289:3: ruleStringContainingExpressionSyntax
            {
             before(grammarAccess.getNormalJobRuns_45onOneOf2Access().getRuns_45onStringContainingExpressionSyntaxParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStringContainingExpressionSyntax();

            state._fsp--;

             after(grammarAccess.getNormalJobRuns_45onOneOf2Access().getRuns_45onStringContainingExpressionSyntaxParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NormalJobRuns_45onOneOf2__Runs_45onAssignment_2"


    // $ANTLR start "rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment"
    // InternalNormalJobRuns_45onOneOf2Parser.g:298:1: rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment : ( ruleEString ) ;
    public final void rule__StringContainingExpressionSyntax__StringContainingExpressionSyntaxAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:302:1: ( ( ruleEString ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:303:2: ( ruleEString )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:303:2: ( ruleEString )
            // InternalNormalJobRuns_45onOneOf2Parser.g:304:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000090L});

}