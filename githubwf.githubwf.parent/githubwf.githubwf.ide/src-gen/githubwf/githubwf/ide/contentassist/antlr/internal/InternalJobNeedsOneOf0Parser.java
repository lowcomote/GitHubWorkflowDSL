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
import githubwf.githubwf.services.JobNeedsOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJobNeedsOneOf0Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Comma", "LeftSquareBracket", "RightSquareBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=11;
    public static final int RULE_WS=14;
    public static final int RULE_E_INT=9;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_SL_COMMENT=13;
    public static final int Comma=4;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=12;
    public static final int LeftSquareBracket=5;
    public static final int RULE_E_DOUBLE=10;
    public static final int EOF=-1;
    public static final int RightSquareBracket=6;

    // delegates
    // delegators


        public InternalJobNeedsOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJobNeedsOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJobNeedsOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalJobNeedsOneOf0Parser.g"; }


    	private JobNeedsOneOf0GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    	}

    	public void setGrammarAccess(JobNeedsOneOf0GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJobNeedsOneOf0"
    // InternalJobNeedsOneOf0Parser.g:58:1: entryRuleJobNeedsOneOf0 : ruleJobNeedsOneOf0 EOF ;
    public final void entryRuleJobNeedsOneOf0() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf0Parser.g:59:1: ( ruleJobNeedsOneOf0 EOF )
            // InternalJobNeedsOneOf0Parser.g:60:1: ruleJobNeedsOneOf0 EOF
            {
             before(grammarAccess.getJobNeedsOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            ruleJobNeedsOneOf0();

            state._fsp--;

             after(grammarAccess.getJobNeedsOneOf0Rule()); 
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
    // $ANTLR end "entryRuleJobNeedsOneOf0"


    // $ANTLR start "ruleJobNeedsOneOf0"
    // InternalJobNeedsOneOf0Parser.g:67:1: ruleJobNeedsOneOf0 : ( ( rule__JobNeedsOneOf0__Group__0 ) ) ;
    public final void ruleJobNeedsOneOf0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:71:2: ( ( ( rule__JobNeedsOneOf0__Group__0 ) ) )
            // InternalJobNeedsOneOf0Parser.g:72:2: ( ( rule__JobNeedsOneOf0__Group__0 ) )
            {
            // InternalJobNeedsOneOf0Parser.g:72:2: ( ( rule__JobNeedsOneOf0__Group__0 ) )
            // InternalJobNeedsOneOf0Parser.g:73:3: ( rule__JobNeedsOneOf0__Group__0 )
            {
             before(grammarAccess.getJobNeedsOneOf0Access().getGroup()); 
            // InternalJobNeedsOneOf0Parser.g:74:3: ( rule__JobNeedsOneOf0__Group__0 )
            // InternalJobNeedsOneOf0Parser.g:74:4: rule__JobNeedsOneOf0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJobNeedsOneOf0Access().getGroup()); 

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
    // $ANTLR end "ruleJobNeedsOneOf0"


    // $ANTLR start "entryRuleJobNeedsOneOf0Items"
    // InternalJobNeedsOneOf0Parser.g:83:1: entryRuleJobNeedsOneOf0Items : ruleJobNeedsOneOf0Items EOF ;
    public final void entryRuleJobNeedsOneOf0Items() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf0Parser.g:84:1: ( ruleJobNeedsOneOf0Items EOF )
            // InternalJobNeedsOneOf0Parser.g:85:1: ruleJobNeedsOneOf0Items EOF
            {
             before(grammarAccess.getJobNeedsOneOf0ItemsRule()); 
            pushFollow(FOLLOW_1);
            ruleJobNeedsOneOf0Items();

            state._fsp--;

             after(grammarAccess.getJobNeedsOneOf0ItemsRule()); 
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
    // $ANTLR end "entryRuleJobNeedsOneOf0Items"


    // $ANTLR start "ruleJobNeedsOneOf0Items"
    // InternalJobNeedsOneOf0Parser.g:92:1: ruleJobNeedsOneOf0Items : ( ( rule__JobNeedsOneOf0Items__ItemsAssignment ) ) ;
    public final void ruleJobNeedsOneOf0Items() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:96:2: ( ( ( rule__JobNeedsOneOf0Items__ItemsAssignment ) ) )
            // InternalJobNeedsOneOf0Parser.g:97:2: ( ( rule__JobNeedsOneOf0Items__ItemsAssignment ) )
            {
            // InternalJobNeedsOneOf0Parser.g:97:2: ( ( rule__JobNeedsOneOf0Items__ItemsAssignment ) )
            // InternalJobNeedsOneOf0Parser.g:98:3: ( rule__JobNeedsOneOf0Items__ItemsAssignment )
            {
             before(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsAssignment()); 
            // InternalJobNeedsOneOf0Parser.g:99:3: ( rule__JobNeedsOneOf0Items__ItemsAssignment )
            // InternalJobNeedsOneOf0Parser.g:99:4: rule__JobNeedsOneOf0Items__ItemsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0Items__ItemsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsAssignment()); 

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
    // $ANTLR end "ruleJobNeedsOneOf0Items"


    // $ANTLR start "entryRuleName"
    // InternalJobNeedsOneOf0Parser.g:108:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf0Parser.g:109:1: ( ruleName EOF )
            // InternalJobNeedsOneOf0Parser.g:110:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalJobNeedsOneOf0Parser.g:117:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:121:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalJobNeedsOneOf0Parser.g:122:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalJobNeedsOneOf0Parser.g:122:2: ( ( rule__Name__Group__0 ) )
            // InternalJobNeedsOneOf0Parser.g:123:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalJobNeedsOneOf0Parser.g:124:3: ( rule__Name__Group__0 )
            // InternalJobNeedsOneOf0Parser.g:124:4: rule__Name__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleEString"
    // InternalJobNeedsOneOf0Parser.g:133:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf0Parser.g:134:1: ( ruleEString EOF )
            // InternalJobNeedsOneOf0Parser.g:135:1: ruleEString EOF
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
    // InternalJobNeedsOneOf0Parser.g:142:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:146:2: ( ( ruleVALID_STRING ) )
            // InternalJobNeedsOneOf0Parser.g:147:2: ( ruleVALID_STRING )
            {
            // InternalJobNeedsOneOf0Parser.g:147:2: ( ruleVALID_STRING )
            // InternalJobNeedsOneOf0Parser.g:148:3: ruleVALID_STRING
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
    // InternalJobNeedsOneOf0Parser.g:158:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf0Parser.g:159:1: ( ruleVALID_STRING EOF )
            // InternalJobNeedsOneOf0Parser.g:160:1: ruleVALID_STRING EOF
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
    // InternalJobNeedsOneOf0Parser.g:167:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:171:2: ( ( RULE_STRING ) )
            // InternalJobNeedsOneOf0Parser.g:172:2: ( RULE_STRING )
            {
            // InternalJobNeedsOneOf0Parser.g:172:2: ( RULE_STRING )
            // InternalJobNeedsOneOf0Parser.g:173:3: RULE_STRING
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


    // $ANTLR start "rule__JobNeedsOneOf0__Group__0"
    // InternalJobNeedsOneOf0Parser.g:182:1: rule__JobNeedsOneOf0__Group__0 : rule__JobNeedsOneOf0__Group__0__Impl rule__JobNeedsOneOf0__Group__1 ;
    public final void rule__JobNeedsOneOf0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:186:1: ( rule__JobNeedsOneOf0__Group__0__Impl rule__JobNeedsOneOf0__Group__1 )
            // InternalJobNeedsOneOf0Parser.g:187:2: rule__JobNeedsOneOf0__Group__0__Impl rule__JobNeedsOneOf0__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JobNeedsOneOf0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0__Group__1();

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group__0"


    // $ANTLR start "rule__JobNeedsOneOf0__Group__0__Impl"
    // InternalJobNeedsOneOf0Parser.g:194:1: rule__JobNeedsOneOf0__Group__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__JobNeedsOneOf0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:198:1: ( ( LeftSquareBracket ) )
            // InternalJobNeedsOneOf0Parser.g:199:1: ( LeftSquareBracket )
            {
            // InternalJobNeedsOneOf0Parser.g:199:1: ( LeftSquareBracket )
            // InternalJobNeedsOneOf0Parser.g:200:2: LeftSquareBracket
            {
             before(grammarAccess.getJobNeedsOneOf0Access().getLeftSquareBracketKeyword_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getJobNeedsOneOf0Access().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group__0__Impl"


    // $ANTLR start "rule__JobNeedsOneOf0__Group__1"
    // InternalJobNeedsOneOf0Parser.g:209:1: rule__JobNeedsOneOf0__Group__1 : rule__JobNeedsOneOf0__Group__1__Impl rule__JobNeedsOneOf0__Group__2 ;
    public final void rule__JobNeedsOneOf0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:213:1: ( rule__JobNeedsOneOf0__Group__1__Impl rule__JobNeedsOneOf0__Group__2 )
            // InternalJobNeedsOneOf0Parser.g:214:2: rule__JobNeedsOneOf0__Group__1__Impl rule__JobNeedsOneOf0__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__JobNeedsOneOf0__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0__Group__2();

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group__1"


    // $ANTLR start "rule__JobNeedsOneOf0__Group__1__Impl"
    // InternalJobNeedsOneOf0Parser.g:221:1: rule__JobNeedsOneOf0__Group__1__Impl : ( ( rule__JobNeedsOneOf0__JobNeedsAssignment_1 ) ) ;
    public final void rule__JobNeedsOneOf0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:225:1: ( ( ( rule__JobNeedsOneOf0__JobNeedsAssignment_1 ) ) )
            // InternalJobNeedsOneOf0Parser.g:226:1: ( ( rule__JobNeedsOneOf0__JobNeedsAssignment_1 ) )
            {
            // InternalJobNeedsOneOf0Parser.g:226:1: ( ( rule__JobNeedsOneOf0__JobNeedsAssignment_1 ) )
            // InternalJobNeedsOneOf0Parser.g:227:2: ( rule__JobNeedsOneOf0__JobNeedsAssignment_1 )
            {
             before(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_1()); 
            // InternalJobNeedsOneOf0Parser.g:228:2: ( rule__JobNeedsOneOf0__JobNeedsAssignment_1 )
            // InternalJobNeedsOneOf0Parser.g:228:3: rule__JobNeedsOneOf0__JobNeedsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0__JobNeedsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_1()); 

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group__1__Impl"


    // $ANTLR start "rule__JobNeedsOneOf0__Group__2"
    // InternalJobNeedsOneOf0Parser.g:236:1: rule__JobNeedsOneOf0__Group__2 : rule__JobNeedsOneOf0__Group__2__Impl rule__JobNeedsOneOf0__Group__3 ;
    public final void rule__JobNeedsOneOf0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:240:1: ( rule__JobNeedsOneOf0__Group__2__Impl rule__JobNeedsOneOf0__Group__3 )
            // InternalJobNeedsOneOf0Parser.g:241:2: rule__JobNeedsOneOf0__Group__2__Impl rule__JobNeedsOneOf0__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__JobNeedsOneOf0__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0__Group__3();

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group__2"


    // $ANTLR start "rule__JobNeedsOneOf0__Group__2__Impl"
    // InternalJobNeedsOneOf0Parser.g:248:1: rule__JobNeedsOneOf0__Group__2__Impl : ( ( rule__JobNeedsOneOf0__Group_2__0 )* ) ;
    public final void rule__JobNeedsOneOf0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:252:1: ( ( ( rule__JobNeedsOneOf0__Group_2__0 )* ) )
            // InternalJobNeedsOneOf0Parser.g:253:1: ( ( rule__JobNeedsOneOf0__Group_2__0 )* )
            {
            // InternalJobNeedsOneOf0Parser.g:253:1: ( ( rule__JobNeedsOneOf0__Group_2__0 )* )
            // InternalJobNeedsOneOf0Parser.g:254:2: ( rule__JobNeedsOneOf0__Group_2__0 )*
            {
             before(grammarAccess.getJobNeedsOneOf0Access().getGroup_2()); 
            // InternalJobNeedsOneOf0Parser.g:255:2: ( rule__JobNeedsOneOf0__Group_2__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comma) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJobNeedsOneOf0Parser.g:255:3: rule__JobNeedsOneOf0__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JobNeedsOneOf0__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getJobNeedsOneOf0Access().getGroup_2()); 

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group__2__Impl"


    // $ANTLR start "rule__JobNeedsOneOf0__Group__3"
    // InternalJobNeedsOneOf0Parser.g:263:1: rule__JobNeedsOneOf0__Group__3 : rule__JobNeedsOneOf0__Group__3__Impl ;
    public final void rule__JobNeedsOneOf0__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:267:1: ( rule__JobNeedsOneOf0__Group__3__Impl )
            // InternalJobNeedsOneOf0Parser.g:268:2: rule__JobNeedsOneOf0__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0__Group__3__Impl();

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group__3"


    // $ANTLR start "rule__JobNeedsOneOf0__Group__3__Impl"
    // InternalJobNeedsOneOf0Parser.g:274:1: rule__JobNeedsOneOf0__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__JobNeedsOneOf0__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:278:1: ( ( RightSquareBracket ) )
            // InternalJobNeedsOneOf0Parser.g:279:1: ( RightSquareBracket )
            {
            // InternalJobNeedsOneOf0Parser.g:279:1: ( RightSquareBracket )
            // InternalJobNeedsOneOf0Parser.g:280:2: RightSquareBracket
            {
             before(grammarAccess.getJobNeedsOneOf0Access().getRightSquareBracketKeyword_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getJobNeedsOneOf0Access().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group__3__Impl"


    // $ANTLR start "rule__JobNeedsOneOf0__Group_2__0"
    // InternalJobNeedsOneOf0Parser.g:290:1: rule__JobNeedsOneOf0__Group_2__0 : rule__JobNeedsOneOf0__Group_2__0__Impl rule__JobNeedsOneOf0__Group_2__1 ;
    public final void rule__JobNeedsOneOf0__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:294:1: ( rule__JobNeedsOneOf0__Group_2__0__Impl rule__JobNeedsOneOf0__Group_2__1 )
            // InternalJobNeedsOneOf0Parser.g:295:2: rule__JobNeedsOneOf0__Group_2__0__Impl rule__JobNeedsOneOf0__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__JobNeedsOneOf0__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0__Group_2__1();

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group_2__0"


    // $ANTLR start "rule__JobNeedsOneOf0__Group_2__0__Impl"
    // InternalJobNeedsOneOf0Parser.g:302:1: rule__JobNeedsOneOf0__Group_2__0__Impl : ( Comma ) ;
    public final void rule__JobNeedsOneOf0__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:306:1: ( ( Comma ) )
            // InternalJobNeedsOneOf0Parser.g:307:1: ( Comma )
            {
            // InternalJobNeedsOneOf0Parser.g:307:1: ( Comma )
            // InternalJobNeedsOneOf0Parser.g:308:2: Comma
            {
             before(grammarAccess.getJobNeedsOneOf0Access().getCommaKeyword_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getJobNeedsOneOf0Access().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group_2__0__Impl"


    // $ANTLR start "rule__JobNeedsOneOf0__Group_2__1"
    // InternalJobNeedsOneOf0Parser.g:317:1: rule__JobNeedsOneOf0__Group_2__1 : rule__JobNeedsOneOf0__Group_2__1__Impl ;
    public final void rule__JobNeedsOneOf0__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:321:1: ( rule__JobNeedsOneOf0__Group_2__1__Impl )
            // InternalJobNeedsOneOf0Parser.g:322:2: rule__JobNeedsOneOf0__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0__Group_2__1__Impl();

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group_2__1"


    // $ANTLR start "rule__JobNeedsOneOf0__Group_2__1__Impl"
    // InternalJobNeedsOneOf0Parser.g:328:1: rule__JobNeedsOneOf0__Group_2__1__Impl : ( ( rule__JobNeedsOneOf0__JobNeedsAssignment_2_1 ) ) ;
    public final void rule__JobNeedsOneOf0__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:332:1: ( ( ( rule__JobNeedsOneOf0__JobNeedsAssignment_2_1 ) ) )
            // InternalJobNeedsOneOf0Parser.g:333:1: ( ( rule__JobNeedsOneOf0__JobNeedsAssignment_2_1 ) )
            {
            // InternalJobNeedsOneOf0Parser.g:333:1: ( ( rule__JobNeedsOneOf0__JobNeedsAssignment_2_1 ) )
            // InternalJobNeedsOneOf0Parser.g:334:2: ( rule__JobNeedsOneOf0__JobNeedsAssignment_2_1 )
            {
             before(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_2_1()); 
            // InternalJobNeedsOneOf0Parser.g:335:2: ( rule__JobNeedsOneOf0__JobNeedsAssignment_2_1 )
            // InternalJobNeedsOneOf0Parser.g:335:3: rule__JobNeedsOneOf0__JobNeedsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf0__JobNeedsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsAssignment_2_1()); 

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
    // $ANTLR end "rule__JobNeedsOneOf0__Group_2__1__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // InternalJobNeedsOneOf0Parser.g:344:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:348:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalJobNeedsOneOf0Parser.g:349:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Name__Group__1();

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
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // InternalJobNeedsOneOf0Parser.g:356:1: rule__Name__Group__0__Impl : ( () ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:360:1: ( ( () ) )
            // InternalJobNeedsOneOf0Parser.g:361:1: ( () )
            {
            // InternalJobNeedsOneOf0Parser.g:361:1: ( () )
            // InternalJobNeedsOneOf0Parser.g:362:2: ()
            {
             before(grammarAccess.getNameAccess().getNameAction_0()); 
            // InternalJobNeedsOneOf0Parser.g:363:2: ()
            // InternalJobNeedsOneOf0Parser.g:363:3: 
            {
            }

             after(grammarAccess.getNameAccess().getNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // InternalJobNeedsOneOf0Parser.g:371:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:375:1: ( rule__Name__Group__1__Impl )
            // InternalJobNeedsOneOf0Parser.g:376:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Name__Group__1__Impl();

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
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // InternalJobNeedsOneOf0Parser.g:382:1: rule__Name__Group__1__Impl : ( ( rule__Name__NameAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:386:1: ( ( ( rule__Name__NameAssignment_1 ) ) )
            // InternalJobNeedsOneOf0Parser.g:387:1: ( ( rule__Name__NameAssignment_1 ) )
            {
            // InternalJobNeedsOneOf0Parser.g:387:1: ( ( rule__Name__NameAssignment_1 ) )
            // InternalJobNeedsOneOf0Parser.g:388:2: ( rule__Name__NameAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1()); 
            // InternalJobNeedsOneOf0Parser.g:389:2: ( rule__Name__NameAssignment_1 )
            // InternalJobNeedsOneOf0Parser.g:389:3: rule__Name__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Name__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__JobNeedsOneOf0__JobNeedsAssignment_1"
    // InternalJobNeedsOneOf0Parser.g:398:1: rule__JobNeedsOneOf0__JobNeedsAssignment_1 : ( ruleJobNeedsOneOf0Items ) ;
    public final void rule__JobNeedsOneOf0__JobNeedsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:402:1: ( ( ruleJobNeedsOneOf0Items ) )
            // InternalJobNeedsOneOf0Parser.g:403:2: ( ruleJobNeedsOneOf0Items )
            {
            // InternalJobNeedsOneOf0Parser.g:403:2: ( ruleJobNeedsOneOf0Items )
            // InternalJobNeedsOneOf0Parser.g:404:3: ruleJobNeedsOneOf0Items
            {
             before(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJobNeedsOneOf0Items();

            state._fsp--;

             after(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__JobNeedsOneOf0__JobNeedsAssignment_1"


    // $ANTLR start "rule__JobNeedsOneOf0__JobNeedsAssignment_2_1"
    // InternalJobNeedsOneOf0Parser.g:413:1: rule__JobNeedsOneOf0__JobNeedsAssignment_2_1 : ( ruleJobNeedsOneOf0Items ) ;
    public final void rule__JobNeedsOneOf0__JobNeedsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:417:1: ( ( ruleJobNeedsOneOf0Items ) )
            // InternalJobNeedsOneOf0Parser.g:418:2: ( ruleJobNeedsOneOf0Items )
            {
            // InternalJobNeedsOneOf0Parser.g:418:2: ( ruleJobNeedsOneOf0Items )
            // InternalJobNeedsOneOf0Parser.g:419:3: ruleJobNeedsOneOf0Items
            {
             before(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJobNeedsOneOf0Items();

            state._fsp--;

             after(grammarAccess.getJobNeedsOneOf0Access().getJobNeedsJobNeedsOneOf0ItemsParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__JobNeedsOneOf0__JobNeedsAssignment_2_1"


    // $ANTLR start "rule__JobNeedsOneOf0Items__ItemsAssignment"
    // InternalJobNeedsOneOf0Parser.g:428:1: rule__JobNeedsOneOf0Items__ItemsAssignment : ( ruleName ) ;
    public final void rule__JobNeedsOneOf0Items__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:432:1: ( ( ruleName ) )
            // InternalJobNeedsOneOf0Parser.g:433:2: ( ruleName )
            {
            // InternalJobNeedsOneOf0Parser.g:433:2: ( ruleName )
            // InternalJobNeedsOneOf0Parser.g:434:3: ruleName
            {
             before(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getJobNeedsOneOf0ItemsAccess().getItemsNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__JobNeedsOneOf0Items__ItemsAssignment"


    // $ANTLR start "rule__Name__NameAssignment_1"
    // InternalJobNeedsOneOf0Parser.g:443:1: rule__Name__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Name__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf0Parser.g:447:1: ( ( ruleEString ) )
            // InternalJobNeedsOneOf0Parser.g:448:2: ( ruleEString )
            {
            // InternalJobNeedsOneOf0Parser.g:448:2: ( ruleEString )
            // InternalJobNeedsOneOf0Parser.g:449:3: ruleEString
            {
             before(grammarAccess.getNameAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNameAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Name__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});

}