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
import githubwf.githubwf.services.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ContinueOnError", "False", "True", "Colon", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=12;
    public static final int RULE_WS=15;
    public static final int True=6;
    public static final int RULE_E_INT=10;
    public static final int RULE_STRING=9;
    public static final int False=5;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=13;
    public static final int Colon=7;
    public static final int RULE_E_DOUBLE=11;
    public static final int EOF=-1;
    public static final int ContinueOnError=4;

    // delegates
    // delegators


        public InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g"; }


    	private NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("ContinueOnError", "'\"continue-on-error\"'");
    	}

    	public void setGrammarAccess(NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:59:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 : ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 EOF ;
    public final void entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0() throws RecognitionException {
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:60:1: ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 EOF )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:61:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 EOF
            {
             before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0();

            state._fsp--;

             after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Rule()); 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:68:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 : ( ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0 ) ) ;
    public final void ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:72:2: ( ( ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0 ) ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:73:2: ( ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0 ) )
            {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:73:2: ( ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0 ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:74:3: ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0 )
            {
             before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getGroup()); 
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:75:3: ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0 )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:75:4: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getGroup()); 

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:84:1: entryRuleEBooleanObject : ruleEBooleanObject EOF ;
    public final void entryRuleEBooleanObject() throws RecognitionException {
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:85:1: ( ruleEBooleanObject EOF )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:86:1: ruleEBooleanObject EOF
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
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:93:1: ruleEBooleanObject : ( ( rule__EBooleanObject__Alternatives ) ) ;
    public final void ruleEBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:97:2: ( ( ( rule__EBooleanObject__Alternatives ) ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:98:2: ( ( rule__EBooleanObject__Alternatives ) )
            {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:98:2: ( ( rule__EBooleanObject__Alternatives ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:99:3: ( rule__EBooleanObject__Alternatives )
            {
             before(grammarAccess.getEBooleanObjectAccess().getAlternatives()); 
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:100:3: ( rule__EBooleanObject__Alternatives )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:100:4: rule__EBooleanObject__Alternatives
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


    // $ANTLR start "entryRuleKEYWORD"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:109:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:110:1: ( ruleKEYWORD EOF )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:111:1: ruleKEYWORD EOF
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
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:118:1: ruleKEYWORD : ( ContinueOnError ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:122:2: ( ( ContinueOnError ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:123:2: ( ContinueOnError )
            {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:123:2: ( ContinueOnError )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:124:3: ContinueOnError
            {
             before(grammarAccess.getKEYWORDAccess().getContinueOnErrorKeyword()); 
            match(input,ContinueOnError,FOLLOW_2); 
             after(grammarAccess.getKEYWORDAccess().getContinueOnErrorKeyword()); 

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


    // $ANTLR start "rule__EBooleanObject__Alternatives"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:133:1: rule__EBooleanObject__Alternatives : ( ( True ) | ( False ) );
    public final void rule__EBooleanObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:137:1: ( ( True ) | ( False ) )
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
                    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:138:2: ( True )
                    {
                    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:138:2: ( True )
                    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:139:3: True
                    {
                     before(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 
                    match(input,True,FOLLOW_2); 
                     after(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:144:2: ( False )
                    {
                    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:144:2: ( False )
                    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:145:3: False
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


    // $ANTLR start "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:154:1: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0 : rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0__Impl rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1 ;
    public final void rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:158:1: ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0__Impl rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1 )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:159:2: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0__Impl rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1();

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
    // $ANTLR end "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0"


    // $ANTLR start "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0__Impl"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:166:1: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0__Impl : ( ContinueOnError ) ;
    public final void rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:170:1: ( ( ContinueOnError ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:171:1: ( ContinueOnError )
            {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:171:1: ( ContinueOnError )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:172:2: ContinueOnError
            {
             before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getContinueOnErrorKeyword_0()); 
            match(input,ContinueOnError,FOLLOW_2); 
             after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getContinueOnErrorKeyword_0()); 

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
    // $ANTLR end "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__0__Impl"


    // $ANTLR start "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:181:1: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1 : rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1__Impl rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2 ;
    public final void rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:185:1: ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1__Impl rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2 )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:186:2: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1__Impl rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2();

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
    // $ANTLR end "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1"


    // $ANTLR start "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1__Impl"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:193:1: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1__Impl : ( Colon ) ;
    public final void rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:197:1: ( ( Colon ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:198:1: ( Colon )
            {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:198:1: ( Colon )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:199:2: Colon
            {
             before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getColonKeyword_1()); 

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
    // $ANTLR end "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__1__Impl"


    // $ANTLR start "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:208:1: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2 : rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2__Impl ;
    public final void rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:212:1: ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2__Impl )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:213:2: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2__Impl();

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
    // $ANTLR end "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2"


    // $ANTLR start "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2__Impl"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:219:1: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2__Impl : ( ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2 ) ) ;
    public final void rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:223:1: ( ( ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2 ) ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:224:1: ( ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2 ) )
            {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:224:1: ( ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2 ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:225:2: ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2 )
            {
             before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getContinue_45on_45errorAssignment_2()); 
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:226:2: ( rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2 )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:226:3: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getContinue_45on_45errorAssignment_2()); 

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
    // $ANTLR end "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Group__2__Impl"


    // $ANTLR start "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2"
    // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:235:1: rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2 : ( ruleEBooleanObject ) ;
    public final void rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:239:1: ( ( ruleEBooleanObject ) )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:240:2: ( ruleEBooleanObject )
            {
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:240:2: ( ruleEBooleanObject )
            // InternalNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Parser.g:241:3: ruleEBooleanObject
            {
             before(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getContinue_45on_45errorEBooleanObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBooleanObject();

            state._fsp--;

             after(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Access().getContinue_45on_45errorEBooleanObjectParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0__Continue_45on_45errorAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});

}