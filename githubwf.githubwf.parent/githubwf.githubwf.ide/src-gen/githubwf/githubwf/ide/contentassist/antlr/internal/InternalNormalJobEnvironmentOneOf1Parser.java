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
import githubwf.githubwf.services.NormalJobEnvironmentOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobEnvironmentOneOf1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Environment", "Name", "Url", "Comma", "Colon", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_STRING=12;
    public static final int Url=6;
    public static final int Name=5;
    public static final int RULE_SL_COMMENT=17;
    public static final int Comma=7;
    public static final int Colon=8;
    public static final int RightCurlyBracket=10;
    public static final int RULE_E_DOUBLE=14;
    public static final int EOF=-1;
    public static final int RULE_ID=15;
    public static final int RULE_WS=18;
    public static final int LeftCurlyBracket=9;
    public static final int RULE_E_INT=13;
    public static final int RULE_ANY_OTHER=19;
    public static final int RULE_INT=11;
    public static final int RULE_ML_COMMENT=16;
    public static final int Environment=4;

    // delegates
    // delegators


        public InternalNormalJobEnvironmentOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobEnvironmentOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobEnvironmentOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobEnvironmentOneOf1Parser.g"; }


    	private NormalJobEnvironmentOneOf1GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Url", "'\"url\"'");
    		tokenNameToValue.put("Name", "'\"name\"'");
    		tokenNameToValue.put("Environment", "'\"environment\"'");
    	}

    	public void setGrammarAccess(NormalJobEnvironmentOneOf1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleNormalJobEnvironmentOneOf1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:62:1: entryRuleNormalJobEnvironmentOneOf1 : ruleNormalJobEnvironmentOneOf1 EOF ;
    public final void entryRuleNormalJobEnvironmentOneOf1() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:63:1: ( ruleNormalJobEnvironmentOneOf1 EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:64:1: ruleNormalJobEnvironmentOneOf1 EOF
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            ruleNormalJobEnvironmentOneOf1();

            state._fsp--;

             after(grammarAccess.getNormalJobEnvironmentOneOf1Rule()); 
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
    // $ANTLR end "entryRuleNormalJobEnvironmentOneOf1"


    // $ANTLR start "ruleNormalJobEnvironmentOneOf1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:71:1: ruleNormalJobEnvironmentOneOf1 : ( ( rule__NormalJobEnvironmentOneOf1__Group__0 ) ) ;
    public final void ruleNormalJobEnvironmentOneOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:75:2: ( ( ( rule__NormalJobEnvironmentOneOf1__Group__0 ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:76:2: ( ( rule__NormalJobEnvironmentOneOf1__Group__0 ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:76:2: ( ( rule__NormalJobEnvironmentOneOf1__Group__0 ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:77:3: ( rule__NormalJobEnvironmentOneOf1__Group__0 )
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf1Access().getGroup()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:78:3: ( rule__NormalJobEnvironmentOneOf1__Group__0 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:78:4: rule__NormalJobEnvironmentOneOf1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormalJobEnvironmentOneOf1Access().getGroup()); 

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
    // $ANTLR end "ruleNormalJobEnvironmentOneOf1"


    // $ANTLR start "entryRuleEnvironmentPropertiesAbstract"
    // InternalNormalJobEnvironmentOneOf1Parser.g:87:1: entryRuleEnvironmentPropertiesAbstract : ruleEnvironmentPropertiesAbstract EOF ;
    public final void entryRuleEnvironmentPropertiesAbstract() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:88:1: ( ruleEnvironmentPropertiesAbstract EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:89:1: ruleEnvironmentPropertiesAbstract EOF
            {
             before(grammarAccess.getEnvironmentPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getEnvironmentPropertiesAbstractRule()); 
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
    // $ANTLR end "entryRuleEnvironmentPropertiesAbstract"


    // $ANTLR start "ruleEnvironmentPropertiesAbstract"
    // InternalNormalJobEnvironmentOneOf1Parser.g:96:1: ruleEnvironmentPropertiesAbstract : ( ( rule__EnvironmentPropertiesAbstract__Alternatives ) ) ;
    public final void ruleEnvironmentPropertiesAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:100:2: ( ( ( rule__EnvironmentPropertiesAbstract__Alternatives ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:101:2: ( ( rule__EnvironmentPropertiesAbstract__Alternatives ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:101:2: ( ( rule__EnvironmentPropertiesAbstract__Alternatives ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:102:3: ( rule__EnvironmentPropertiesAbstract__Alternatives )
            {
             before(grammarAccess.getEnvironmentPropertiesAbstractAccess().getAlternatives()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:103:3: ( rule__EnvironmentPropertiesAbstract__Alternatives )
            // InternalNormalJobEnvironmentOneOf1Parser.g:103:4: rule__EnvironmentPropertiesAbstract__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentPropertiesAbstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentPropertiesAbstractAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEnvironmentPropertiesAbstract"


    // $ANTLR start "entryRuleEnvironment"
    // InternalNormalJobEnvironmentOneOf1Parser.g:112:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:113:1: ( ruleEnvironment EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:114:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalNormalJobEnvironmentOneOf1Parser.g:121:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:125:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:126:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:126:2: ( ( rule__Environment__Group__0 ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:127:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:128:3: ( rule__Environment__Group__0 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:128:4: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleEnvironmentName"
    // InternalNormalJobEnvironmentOneOf1Parser.g:137:1: entryRuleEnvironmentName : ruleEnvironmentName EOF ;
    public final void entryRuleEnvironmentName() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:138:1: ( ruleEnvironmentName EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:139:1: ruleEnvironmentName EOF
            {
             before(grammarAccess.getEnvironmentNameRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentName();

            state._fsp--;

             after(grammarAccess.getEnvironmentNameRule()); 
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
    // $ANTLR end "entryRuleEnvironmentName"


    // $ANTLR start "ruleEnvironmentName"
    // InternalNormalJobEnvironmentOneOf1Parser.g:146:1: ruleEnvironmentName : ( ( rule__EnvironmentName__Group__0 ) ) ;
    public final void ruleEnvironmentName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:150:2: ( ( ( rule__EnvironmentName__Group__0 ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:151:2: ( ( rule__EnvironmentName__Group__0 ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:151:2: ( ( rule__EnvironmentName__Group__0 ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:152:3: ( rule__EnvironmentName__Group__0 )
            {
             before(grammarAccess.getEnvironmentNameAccess().getGroup()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:153:3: ( rule__EnvironmentName__Group__0 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:153:4: rule__EnvironmentName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentNameAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironmentName"


    // $ANTLR start "entryRuleEnvironmentUrl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:162:1: entryRuleEnvironmentUrl : ruleEnvironmentUrl EOF ;
    public final void entryRuleEnvironmentUrl() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:163:1: ( ruleEnvironmentUrl EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:164:1: ruleEnvironmentUrl EOF
            {
             before(grammarAccess.getEnvironmentUrlRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentUrl();

            state._fsp--;

             after(grammarAccess.getEnvironmentUrlRule()); 
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
    // $ANTLR end "entryRuleEnvironmentUrl"


    // $ANTLR start "ruleEnvironmentUrl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:171:1: ruleEnvironmentUrl : ( ( rule__EnvironmentUrl__Group__0 ) ) ;
    public final void ruleEnvironmentUrl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:175:2: ( ( ( rule__EnvironmentUrl__Group__0 ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:176:2: ( ( rule__EnvironmentUrl__Group__0 ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:176:2: ( ( rule__EnvironmentUrl__Group__0 ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:177:3: ( rule__EnvironmentUrl__Group__0 )
            {
             before(grammarAccess.getEnvironmentUrlAccess().getGroup()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:178:3: ( rule__EnvironmentUrl__Group__0 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:178:4: rule__EnvironmentUrl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentUrl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentUrlAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironmentUrl"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobEnvironmentOneOf1Parser.g:187:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:188:1: ( ruleEString EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:189:1: ruleEString EOF
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:196:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:200:2: ( ( ruleVALID_STRING ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:201:2: ( ruleVALID_STRING )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:201:2: ( ruleVALID_STRING )
            // InternalNormalJobEnvironmentOneOf1Parser.g:202:3: ruleVALID_STRING
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:212:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:213:1: ( ruleVALID_STRING EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:214:1: ruleVALID_STRING EOF
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:221:1: ruleVALID_STRING : ( ( rule__VALID_STRING__Alternatives ) ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:225:2: ( ( ( rule__VALID_STRING__Alternatives ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:226:2: ( ( rule__VALID_STRING__Alternatives ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:226:2: ( ( rule__VALID_STRING__Alternatives ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:227:3: ( rule__VALID_STRING__Alternatives )
            {
             before(grammarAccess.getVALID_STRINGAccess().getAlternatives()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:228:3: ( rule__VALID_STRING__Alternatives )
            // InternalNormalJobEnvironmentOneOf1Parser.g:228:4: rule__VALID_STRING__Alternatives
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:237:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:238:1: ( ruleKEYWORD EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:239:1: ruleKEYWORD EOF
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:246:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:250:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:251:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:251:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:252:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:253:3: ( rule__KEYWORD__Alternatives )
            // InternalNormalJobEnvironmentOneOf1Parser.g:253:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKEYWORDAccess().getAlternatives()); 

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


    // $ANTLR start "rule__EnvironmentPropertiesAbstract__Alternatives"
    // InternalNormalJobEnvironmentOneOf1Parser.g:261:1: rule__EnvironmentPropertiesAbstract__Alternatives : ( ( ruleEnvironmentName ) | ( ruleEnvironmentUrl ) );
    public final void rule__EnvironmentPropertiesAbstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:265:1: ( ( ruleEnvironmentName ) | ( ruleEnvironmentUrl ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Name) ) {
                alt1=1;
            }
            else if ( (LA1_0==Url) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:266:2: ( ruleEnvironmentName )
                    {
                    // InternalNormalJobEnvironmentOneOf1Parser.g:266:2: ( ruleEnvironmentName )
                    // InternalNormalJobEnvironmentOneOf1Parser.g:267:3: ruleEnvironmentName
                    {
                     before(grammarAccess.getEnvironmentPropertiesAbstractAccess().getEnvironmentNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnvironmentName();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentPropertiesAbstractAccess().getEnvironmentNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:272:2: ( ruleEnvironmentUrl )
                    {
                    // InternalNormalJobEnvironmentOneOf1Parser.g:272:2: ( ruleEnvironmentUrl )
                    // InternalNormalJobEnvironmentOneOf1Parser.g:273:3: ruleEnvironmentUrl
                    {
                     before(grammarAccess.getEnvironmentPropertiesAbstractAccess().getEnvironmentUrlParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnvironmentUrl();

                    state._fsp--;

                     after(grammarAccess.getEnvironmentPropertiesAbstractAccess().getEnvironmentUrlParserRuleCall_1()); 

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
    // $ANTLR end "rule__EnvironmentPropertiesAbstract__Alternatives"


    // $ANTLR start "rule__VALID_STRING__Alternatives"
    // InternalNormalJobEnvironmentOneOf1Parser.g:282:1: rule__VALID_STRING__Alternatives : ( ( RULE_STRING ) | ( ruleKEYWORD ) );
    public final void rule__VALID_STRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:286:1: ( ( RULE_STRING ) | ( ruleKEYWORD ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=Environment && LA2_0<=Url)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:287:2: ( RULE_STRING )
                    {
                    // InternalNormalJobEnvironmentOneOf1Parser.g:287:2: ( RULE_STRING )
                    // InternalNormalJobEnvironmentOneOf1Parser.g:288:3: RULE_STRING
                    {
                     before(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:293:2: ( ruleKEYWORD )
                    {
                    // InternalNormalJobEnvironmentOneOf1Parser.g:293:2: ( ruleKEYWORD )
                    // InternalNormalJobEnvironmentOneOf1Parser.g:294:3: ruleKEYWORD
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


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalNormalJobEnvironmentOneOf1Parser.g:303:1: rule__KEYWORD__Alternatives : ( ( Environment ) | ( Name ) | ( Url ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:307:1: ( ( Environment ) | ( Name ) | ( Url ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case Environment:
                {
                alt3=1;
                }
                break;
            case Name:
                {
                alt3=2;
                }
                break;
            case Url:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:308:2: ( Environment )
                    {
                    // InternalNormalJobEnvironmentOneOf1Parser.g:308:2: ( Environment )
                    // InternalNormalJobEnvironmentOneOf1Parser.g:309:3: Environment
                    {
                     before(grammarAccess.getKEYWORDAccess().getEnvironmentKeyword_0()); 
                    match(input,Environment,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getEnvironmentKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:314:2: ( Name )
                    {
                    // InternalNormalJobEnvironmentOneOf1Parser.g:314:2: ( Name )
                    // InternalNormalJobEnvironmentOneOf1Parser.g:315:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_1()); 
                    match(input,Name,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:320:2: ( Url )
                    {
                    // InternalNormalJobEnvironmentOneOf1Parser.g:320:2: ( Url )
                    // InternalNormalJobEnvironmentOneOf1Parser.g:321:3: Url
                    {
                     before(grammarAccess.getKEYWORDAccess().getUrlKeyword_2()); 
                    match(input,Url,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getUrlKeyword_2()); 

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
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf1__Group__0"
    // InternalNormalJobEnvironmentOneOf1Parser.g:330:1: rule__NormalJobEnvironmentOneOf1__Group__0 : rule__NormalJobEnvironmentOneOf1__Group__0__Impl rule__NormalJobEnvironmentOneOf1__Group__1 ;
    public final void rule__NormalJobEnvironmentOneOf1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:334:1: ( rule__NormalJobEnvironmentOneOf1__Group__0__Impl rule__NormalJobEnvironmentOneOf1__Group__1 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:335:2: rule__NormalJobEnvironmentOneOf1__Group__0__Impl rule__NormalJobEnvironmentOneOf1__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NormalJobEnvironmentOneOf1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf1__Group__1();

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf1__Group__0"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf1__Group__0__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:342:1: rule__NormalJobEnvironmentOneOf1__Group__0__Impl : ( Environment ) ;
    public final void rule__NormalJobEnvironmentOneOf1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:346:1: ( ( Environment ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:347:1: ( Environment )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:347:1: ( Environment )
            // InternalNormalJobEnvironmentOneOf1Parser.g:348:2: Environment
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentKeyword_0()); 
            match(input,Environment,FOLLOW_2); 
             after(grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentKeyword_0()); 

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf1__Group__0__Impl"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf1__Group__1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:357:1: rule__NormalJobEnvironmentOneOf1__Group__1 : rule__NormalJobEnvironmentOneOf1__Group__1__Impl rule__NormalJobEnvironmentOneOf1__Group__2 ;
    public final void rule__NormalJobEnvironmentOneOf1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:361:1: ( rule__NormalJobEnvironmentOneOf1__Group__1__Impl rule__NormalJobEnvironmentOneOf1__Group__2 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:362:2: rule__NormalJobEnvironmentOneOf1__Group__1__Impl rule__NormalJobEnvironmentOneOf1__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NormalJobEnvironmentOneOf1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf1__Group__2();

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf1__Group__1"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf1__Group__1__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:369:1: rule__NormalJobEnvironmentOneOf1__Group__1__Impl : ( Colon ) ;
    public final void rule__NormalJobEnvironmentOneOf1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:373:1: ( ( Colon ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:374:1: ( Colon )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:374:1: ( Colon )
            // InternalNormalJobEnvironmentOneOf1Parser.g:375:2: Colon
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf1Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getNormalJobEnvironmentOneOf1Access().getColonKeyword_1()); 

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf1__Group__1__Impl"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf1__Group__2"
    // InternalNormalJobEnvironmentOneOf1Parser.g:384:1: rule__NormalJobEnvironmentOneOf1__Group__2 : rule__NormalJobEnvironmentOneOf1__Group__2__Impl ;
    public final void rule__NormalJobEnvironmentOneOf1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:388:1: ( rule__NormalJobEnvironmentOneOf1__Group__2__Impl )
            // InternalNormalJobEnvironmentOneOf1Parser.g:389:2: rule__NormalJobEnvironmentOneOf1__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf1__Group__2__Impl();

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf1__Group__2"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf1__Group__2__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:395:1: rule__NormalJobEnvironmentOneOf1__Group__2__Impl : ( ( rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2 ) ) ;
    public final void rule__NormalJobEnvironmentOneOf1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:399:1: ( ( ( rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2 ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:400:1: ( ( rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2 ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:400:1: ( ( rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2 ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:401:2: ( rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2 )
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentAssignment_2()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:402:2: ( rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:402:3: rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentAssignment_2()); 

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf1__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__0"
    // InternalNormalJobEnvironmentOneOf1Parser.g:411:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:415:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:416:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__1();

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
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:423:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:427:1: ( ( () ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:428:1: ( () )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:428:1: ( () )
            // InternalNormalJobEnvironmentOneOf1Parser.g:429:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:430:2: ()
            // InternalNormalJobEnvironmentOneOf1Parser.g:430:3: 
            {
            }

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:438:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:442:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:443:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__2();

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
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:450:1: rule__Environment__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:454:1: ( ( LeftCurlyBracket ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:455:1: ( LeftCurlyBracket )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:455:1: ( LeftCurlyBracket )
            // InternalNormalJobEnvironmentOneOf1Parser.g:456:2: LeftCurlyBracket
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // InternalNormalJobEnvironmentOneOf1Parser.g:465:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:469:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:470:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__3();

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
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:477:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Group_2__0 )? ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:481:1: ( ( ( rule__Environment__Group_2__0 )? ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:482:1: ( ( rule__Environment__Group_2__0 )? )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:482:1: ( ( rule__Environment__Group_2__0 )? )
            // InternalNormalJobEnvironmentOneOf1Parser.g:483:2: ( rule__Environment__Group_2__0 )?
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_2()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:484:2: ( rule__Environment__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=Name && LA4_0<=Url)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:484:3: rule__Environment__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // InternalNormalJobEnvironmentOneOf1Parser.g:492:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:496:1: ( rule__Environment__Group__3__Impl )
            // InternalNormalJobEnvironmentOneOf1Parser.g:497:2: rule__Environment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__3__Impl();

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
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:503:1: rule__Environment__Group__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:507:1: ( ( RightCurlyBracket ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:508:1: ( RightCurlyBracket )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:508:1: ( RightCurlyBracket )
            // InternalNormalJobEnvironmentOneOf1Parser.g:509:2: RightCurlyBracket
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group_2__0"
    // InternalNormalJobEnvironmentOneOf1Parser.g:519:1: rule__Environment__Group_2__0 : rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1 ;
    public final void rule__Environment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:523:1: ( rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:524:2: rule__Environment__Group_2__0__Impl rule__Environment__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_2__1();

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
    // $ANTLR end "rule__Environment__Group_2__0"


    // $ANTLR start "rule__Environment__Group_2__0__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:531:1: rule__Environment__Group_2__0__Impl : ( ( rule__Environment__EnvironmentAssignment_2_0 ) ) ;
    public final void rule__Environment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:535:1: ( ( ( rule__Environment__EnvironmentAssignment_2_0 ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:536:1: ( ( rule__Environment__EnvironmentAssignment_2_0 ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:536:1: ( ( rule__Environment__EnvironmentAssignment_2_0 ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:537:2: ( rule__Environment__EnvironmentAssignment_2_0 )
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAssignment_2_0()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:538:2: ( rule__Environment__EnvironmentAssignment_2_0 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:538:3: rule__Environment__EnvironmentAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__EnvironmentAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAssignment_2_0()); 

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
    // $ANTLR end "rule__Environment__Group_2__0__Impl"


    // $ANTLR start "rule__Environment__Group_2__1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:546:1: rule__Environment__Group_2__1 : rule__Environment__Group_2__1__Impl ;
    public final void rule__Environment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:550:1: ( rule__Environment__Group_2__1__Impl )
            // InternalNormalJobEnvironmentOneOf1Parser.g:551:2: rule__Environment__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_2__1__Impl();

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
    // $ANTLR end "rule__Environment__Group_2__1"


    // $ANTLR start "rule__Environment__Group_2__1__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:557:1: rule__Environment__Group_2__1__Impl : ( ( rule__Environment__Group_2_1__0 )* ) ;
    public final void rule__Environment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:561:1: ( ( ( rule__Environment__Group_2_1__0 )* ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:562:1: ( ( rule__Environment__Group_2_1__0 )* )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:562:1: ( ( rule__Environment__Group_2_1__0 )* )
            // InternalNormalJobEnvironmentOneOf1Parser.g:563:2: ( rule__Environment__Group_2_1__0 )*
            {
             before(grammarAccess.getEnvironmentAccess().getGroup_2_1()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:564:2: ( rule__Environment__Group_2_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNormalJobEnvironmentOneOf1Parser.g:564:3: rule__Environment__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Environment__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Environment__Group_2__1__Impl"


    // $ANTLR start "rule__Environment__Group_2_1__0"
    // InternalNormalJobEnvironmentOneOf1Parser.g:573:1: rule__Environment__Group_2_1__0 : rule__Environment__Group_2_1__0__Impl rule__Environment__Group_2_1__1 ;
    public final void rule__Environment__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:577:1: ( rule__Environment__Group_2_1__0__Impl rule__Environment__Group_2_1__1 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:578:2: rule__Environment__Group_2_1__0__Impl rule__Environment__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group_2_1__1();

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
    // $ANTLR end "rule__Environment__Group_2_1__0"


    // $ANTLR start "rule__Environment__Group_2_1__0__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:585:1: rule__Environment__Group_2_1__0__Impl : ( Comma ) ;
    public final void rule__Environment__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:589:1: ( ( Comma ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:590:1: ( Comma )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:590:1: ( Comma )
            // InternalNormalJobEnvironmentOneOf1Parser.g:591:2: Comma
            {
             before(grammarAccess.getEnvironmentAccess().getCommaKeyword_2_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Environment__Group_2_1__0__Impl"


    // $ANTLR start "rule__Environment__Group_2_1__1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:600:1: rule__Environment__Group_2_1__1 : rule__Environment__Group_2_1__1__Impl ;
    public final void rule__Environment__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:604:1: ( rule__Environment__Group_2_1__1__Impl )
            // InternalNormalJobEnvironmentOneOf1Parser.g:605:2: rule__Environment__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Environment__Group_2_1__1"


    // $ANTLR start "rule__Environment__Group_2_1__1__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:611:1: rule__Environment__Group_2_1__1__Impl : ( ( rule__Environment__EnvironmentAssignment_2_1_1 ) ) ;
    public final void rule__Environment__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:615:1: ( ( ( rule__Environment__EnvironmentAssignment_2_1_1 ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:616:1: ( ( rule__Environment__EnvironmentAssignment_2_1_1 ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:616:1: ( ( rule__Environment__EnvironmentAssignment_2_1_1 ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:617:2: ( rule__Environment__EnvironmentAssignment_2_1_1 )
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAssignment_2_1_1()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:618:2: ( rule__Environment__EnvironmentAssignment_2_1_1 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:618:3: rule__Environment__EnvironmentAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Environment__EnvironmentAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Environment__Group_2_1__1__Impl"


    // $ANTLR start "rule__EnvironmentName__Group__0"
    // InternalNormalJobEnvironmentOneOf1Parser.g:627:1: rule__EnvironmentName__Group__0 : rule__EnvironmentName__Group__0__Impl rule__EnvironmentName__Group__1 ;
    public final void rule__EnvironmentName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:631:1: ( rule__EnvironmentName__Group__0__Impl rule__EnvironmentName__Group__1 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:632:2: rule__EnvironmentName__Group__0__Impl rule__EnvironmentName__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EnvironmentName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentName__Group__1();

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
    // $ANTLR end "rule__EnvironmentName__Group__0"


    // $ANTLR start "rule__EnvironmentName__Group__0__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:639:1: rule__EnvironmentName__Group__0__Impl : ( () ) ;
    public final void rule__EnvironmentName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:643:1: ( ( () ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:644:1: ( () )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:644:1: ( () )
            // InternalNormalJobEnvironmentOneOf1Parser.g:645:2: ()
            {
             before(grammarAccess.getEnvironmentNameAccess().getEnvironmentNameAction_0()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:646:2: ()
            // InternalNormalJobEnvironmentOneOf1Parser.g:646:3: 
            {
            }

             after(grammarAccess.getEnvironmentNameAccess().getEnvironmentNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnvironmentName__Group__0__Impl"


    // $ANTLR start "rule__EnvironmentName__Group__1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:654:1: rule__EnvironmentName__Group__1 : rule__EnvironmentName__Group__1__Impl rule__EnvironmentName__Group__2 ;
    public final void rule__EnvironmentName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:658:1: ( rule__EnvironmentName__Group__1__Impl rule__EnvironmentName__Group__2 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:659:2: rule__EnvironmentName__Group__1__Impl rule__EnvironmentName__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__EnvironmentName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentName__Group__2();

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
    // $ANTLR end "rule__EnvironmentName__Group__1"


    // $ANTLR start "rule__EnvironmentName__Group__1__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:666:1: rule__EnvironmentName__Group__1__Impl : ( Name ) ;
    public final void rule__EnvironmentName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:670:1: ( ( Name ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:671:1: ( Name )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:671:1: ( Name )
            // InternalNormalJobEnvironmentOneOf1Parser.g:672:2: Name
            {
             before(grammarAccess.getEnvironmentNameAccess().getNameKeyword_1()); 
            match(input,Name,FOLLOW_2); 
             after(grammarAccess.getEnvironmentNameAccess().getNameKeyword_1()); 

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
    // $ANTLR end "rule__EnvironmentName__Group__1__Impl"


    // $ANTLR start "rule__EnvironmentName__Group__2"
    // InternalNormalJobEnvironmentOneOf1Parser.g:681:1: rule__EnvironmentName__Group__2 : rule__EnvironmentName__Group__2__Impl rule__EnvironmentName__Group__3 ;
    public final void rule__EnvironmentName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:685:1: ( rule__EnvironmentName__Group__2__Impl rule__EnvironmentName__Group__3 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:686:2: rule__EnvironmentName__Group__2__Impl rule__EnvironmentName__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__EnvironmentName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentName__Group__3();

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
    // $ANTLR end "rule__EnvironmentName__Group__2"


    // $ANTLR start "rule__EnvironmentName__Group__2__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:693:1: rule__EnvironmentName__Group__2__Impl : ( Colon ) ;
    public final void rule__EnvironmentName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:697:1: ( ( Colon ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:698:1: ( Colon )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:698:1: ( Colon )
            // InternalNormalJobEnvironmentOneOf1Parser.g:699:2: Colon
            {
             before(grammarAccess.getEnvironmentNameAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getEnvironmentNameAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__EnvironmentName__Group__2__Impl"


    // $ANTLR start "rule__EnvironmentName__Group__3"
    // InternalNormalJobEnvironmentOneOf1Parser.g:708:1: rule__EnvironmentName__Group__3 : rule__EnvironmentName__Group__3__Impl ;
    public final void rule__EnvironmentName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:712:1: ( rule__EnvironmentName__Group__3__Impl )
            // InternalNormalJobEnvironmentOneOf1Parser.g:713:2: rule__EnvironmentName__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentName__Group__3__Impl();

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
    // $ANTLR end "rule__EnvironmentName__Group__3"


    // $ANTLR start "rule__EnvironmentName__Group__3__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:719:1: rule__EnvironmentName__Group__3__Impl : ( ( rule__EnvironmentName__NameAssignment_3 ) ) ;
    public final void rule__EnvironmentName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:723:1: ( ( ( rule__EnvironmentName__NameAssignment_3 ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:724:1: ( ( rule__EnvironmentName__NameAssignment_3 ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:724:1: ( ( rule__EnvironmentName__NameAssignment_3 ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:725:2: ( rule__EnvironmentName__NameAssignment_3 )
            {
             before(grammarAccess.getEnvironmentNameAccess().getNameAssignment_3()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:726:2: ( rule__EnvironmentName__NameAssignment_3 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:726:3: rule__EnvironmentName__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentName__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentNameAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__EnvironmentName__Group__3__Impl"


    // $ANTLR start "rule__EnvironmentUrl__Group__0"
    // InternalNormalJobEnvironmentOneOf1Parser.g:735:1: rule__EnvironmentUrl__Group__0 : rule__EnvironmentUrl__Group__0__Impl rule__EnvironmentUrl__Group__1 ;
    public final void rule__EnvironmentUrl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:739:1: ( rule__EnvironmentUrl__Group__0__Impl rule__EnvironmentUrl__Group__1 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:740:2: rule__EnvironmentUrl__Group__0__Impl rule__EnvironmentUrl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EnvironmentUrl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentUrl__Group__1();

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
    // $ANTLR end "rule__EnvironmentUrl__Group__0"


    // $ANTLR start "rule__EnvironmentUrl__Group__0__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:747:1: rule__EnvironmentUrl__Group__0__Impl : ( Url ) ;
    public final void rule__EnvironmentUrl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:751:1: ( ( Url ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:752:1: ( Url )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:752:1: ( Url )
            // InternalNormalJobEnvironmentOneOf1Parser.g:753:2: Url
            {
             before(grammarAccess.getEnvironmentUrlAccess().getUrlKeyword_0()); 
            match(input,Url,FOLLOW_2); 
             after(grammarAccess.getEnvironmentUrlAccess().getUrlKeyword_0()); 

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
    // $ANTLR end "rule__EnvironmentUrl__Group__0__Impl"


    // $ANTLR start "rule__EnvironmentUrl__Group__1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:762:1: rule__EnvironmentUrl__Group__1 : rule__EnvironmentUrl__Group__1__Impl rule__EnvironmentUrl__Group__2 ;
    public final void rule__EnvironmentUrl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:766:1: ( rule__EnvironmentUrl__Group__1__Impl rule__EnvironmentUrl__Group__2 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:767:2: rule__EnvironmentUrl__Group__1__Impl rule__EnvironmentUrl__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EnvironmentUrl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentUrl__Group__2();

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
    // $ANTLR end "rule__EnvironmentUrl__Group__1"


    // $ANTLR start "rule__EnvironmentUrl__Group__1__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:774:1: rule__EnvironmentUrl__Group__1__Impl : ( Colon ) ;
    public final void rule__EnvironmentUrl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:778:1: ( ( Colon ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:779:1: ( Colon )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:779:1: ( Colon )
            // InternalNormalJobEnvironmentOneOf1Parser.g:780:2: Colon
            {
             before(grammarAccess.getEnvironmentUrlAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getEnvironmentUrlAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__EnvironmentUrl__Group__1__Impl"


    // $ANTLR start "rule__EnvironmentUrl__Group__2"
    // InternalNormalJobEnvironmentOneOf1Parser.g:789:1: rule__EnvironmentUrl__Group__2 : rule__EnvironmentUrl__Group__2__Impl ;
    public final void rule__EnvironmentUrl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:793:1: ( rule__EnvironmentUrl__Group__2__Impl )
            // InternalNormalJobEnvironmentOneOf1Parser.g:794:2: rule__EnvironmentUrl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentUrl__Group__2__Impl();

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
    // $ANTLR end "rule__EnvironmentUrl__Group__2"


    // $ANTLR start "rule__EnvironmentUrl__Group__2__Impl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:800:1: rule__EnvironmentUrl__Group__2__Impl : ( ( rule__EnvironmentUrl__UrlAssignment_2 ) ) ;
    public final void rule__EnvironmentUrl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:804:1: ( ( ( rule__EnvironmentUrl__UrlAssignment_2 ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:805:1: ( ( rule__EnvironmentUrl__UrlAssignment_2 ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:805:1: ( ( rule__EnvironmentUrl__UrlAssignment_2 ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:806:2: ( rule__EnvironmentUrl__UrlAssignment_2 )
            {
             before(grammarAccess.getEnvironmentUrlAccess().getUrlAssignment_2()); 
            // InternalNormalJobEnvironmentOneOf1Parser.g:807:2: ( rule__EnvironmentUrl__UrlAssignment_2 )
            // InternalNormalJobEnvironmentOneOf1Parser.g:807:3: rule__EnvironmentUrl__UrlAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentUrl__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentUrlAccess().getUrlAssignment_2()); 

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
    // $ANTLR end "rule__EnvironmentUrl__Group__2__Impl"


    // $ANTLR start "rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2"
    // InternalNormalJobEnvironmentOneOf1Parser.g:816:1: rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2 : ( ruleEnvironment ) ;
    public final void rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:820:1: ( ( ruleEnvironment ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:821:2: ( ruleEnvironment )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:821:2: ( ruleEnvironment )
            // InternalNormalJobEnvironmentOneOf1Parser.g:822:3: ruleEnvironment
            {
             before(grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentEnvironmentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentEnvironmentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NormalJobEnvironmentOneOf1__EnvironmentAssignment_2"


    // $ANTLR start "rule__Environment__EnvironmentAssignment_2_0"
    // InternalNormalJobEnvironmentOneOf1Parser.g:831:1: rule__Environment__EnvironmentAssignment_2_0 : ( ruleEnvironmentPropertiesAbstract ) ;
    public final void rule__Environment__EnvironmentAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:835:1: ( ( ruleEnvironmentPropertiesAbstract ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:836:2: ( ruleEnvironmentPropertiesAbstract )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:836:2: ( ruleEnvironmentPropertiesAbstract )
            // InternalNormalJobEnvironmentOneOf1Parser.g:837:3: ruleEnvironmentPropertiesAbstract
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentPropertiesAbstractParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentPropertiesAbstractParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Environment__EnvironmentAssignment_2_0"


    // $ANTLR start "rule__Environment__EnvironmentAssignment_2_1_1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:846:1: rule__Environment__EnvironmentAssignment_2_1_1 : ( ruleEnvironmentPropertiesAbstract ) ;
    public final void rule__Environment__EnvironmentAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:850:1: ( ( ruleEnvironmentPropertiesAbstract ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:851:2: ( ruleEnvironmentPropertiesAbstract )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:851:2: ( ruleEnvironmentPropertiesAbstract )
            // InternalNormalJobEnvironmentOneOf1Parser.g:852:3: ruleEnvironmentPropertiesAbstract
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentPropertiesAbstractParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironmentPropertiesAbstract();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentPropertiesAbstractParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Environment__EnvironmentAssignment_2_1_1"


    // $ANTLR start "rule__EnvironmentName__NameAssignment_3"
    // InternalNormalJobEnvironmentOneOf1Parser.g:861:1: rule__EnvironmentName__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__EnvironmentName__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:865:1: ( ( ruleEString ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:866:2: ( ruleEString )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:866:2: ( ruleEString )
            // InternalNormalJobEnvironmentOneOf1Parser.g:867:3: ruleEString
            {
             before(grammarAccess.getEnvironmentNameAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnvironmentNameAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnvironmentName__NameAssignment_3"


    // $ANTLR start "rule__EnvironmentUrl__UrlAssignment_2"
    // InternalNormalJobEnvironmentOneOf1Parser.g:876:1: rule__EnvironmentUrl__UrlAssignment_2 : ( ruleEString ) ;
    public final void rule__EnvironmentUrl__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:880:1: ( ( ruleEString ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:881:2: ( ruleEString )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:881:2: ( ruleEString )
            // InternalNormalJobEnvironmentOneOf1Parser.g:882:3: ruleEString
            {
             before(grammarAccess.getEnvironmentUrlAccess().getUrlEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnvironmentUrlAccess().getUrlEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EnvironmentUrl__UrlAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000460L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001070L});

}