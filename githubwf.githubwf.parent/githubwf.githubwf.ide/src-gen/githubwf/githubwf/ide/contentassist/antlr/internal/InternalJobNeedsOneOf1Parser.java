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
import githubwf.githubwf.services.JobNeedsOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJobNeedsOneOf1Parser extends AbstractInternalContentAssistParser {
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


        public InternalJobNeedsOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJobNeedsOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJobNeedsOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalJobNeedsOneOf1Parser.g"; }


    	private JobNeedsOneOf1GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    	}

    	public void setGrammarAccess(JobNeedsOneOf1GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJobNeedsOneOf1"
    // InternalJobNeedsOneOf1Parser.g:55:1: entryRuleJobNeedsOneOf1 : ruleJobNeedsOneOf1 EOF ;
    public final void entryRuleJobNeedsOneOf1() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf1Parser.g:56:1: ( ruleJobNeedsOneOf1 EOF )
            // InternalJobNeedsOneOf1Parser.g:57:1: ruleJobNeedsOneOf1 EOF
            {
             before(grammarAccess.getJobNeedsOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            ruleJobNeedsOneOf1();

            state._fsp--;

             after(grammarAccess.getJobNeedsOneOf1Rule()); 
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
    // $ANTLR end "entryRuleJobNeedsOneOf1"


    // $ANTLR start "ruleJobNeedsOneOf1"
    // InternalJobNeedsOneOf1Parser.g:64:1: ruleJobNeedsOneOf1 : ( ( rule__JobNeedsOneOf1__JobNeedsAssignment ) ) ;
    public final void ruleJobNeedsOneOf1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:68:2: ( ( ( rule__JobNeedsOneOf1__JobNeedsAssignment ) ) )
            // InternalJobNeedsOneOf1Parser.g:69:2: ( ( rule__JobNeedsOneOf1__JobNeedsAssignment ) )
            {
            // InternalJobNeedsOneOf1Parser.g:69:2: ( ( rule__JobNeedsOneOf1__JobNeedsAssignment ) )
            // InternalJobNeedsOneOf1Parser.g:70:3: ( rule__JobNeedsOneOf1__JobNeedsAssignment )
            {
             before(grammarAccess.getJobNeedsOneOf1Access().getJobNeedsAssignment()); 
            // InternalJobNeedsOneOf1Parser.g:71:3: ( rule__JobNeedsOneOf1__JobNeedsAssignment )
            // InternalJobNeedsOneOf1Parser.g:71:4: rule__JobNeedsOneOf1__JobNeedsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JobNeedsOneOf1__JobNeedsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJobNeedsOneOf1Access().getJobNeedsAssignment()); 

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
    // $ANTLR end "ruleJobNeedsOneOf1"


    // $ANTLR start "entryRuleName"
    // InternalJobNeedsOneOf1Parser.g:80:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf1Parser.g:81:1: ( ruleName EOF )
            // InternalJobNeedsOneOf1Parser.g:82:1: ruleName EOF
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
    // InternalJobNeedsOneOf1Parser.g:89:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:93:2: ( ( ( rule__Name__Group__0 ) ) )
            // InternalJobNeedsOneOf1Parser.g:94:2: ( ( rule__Name__Group__0 ) )
            {
            // InternalJobNeedsOneOf1Parser.g:94:2: ( ( rule__Name__Group__0 ) )
            // InternalJobNeedsOneOf1Parser.g:95:3: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // InternalJobNeedsOneOf1Parser.g:96:3: ( rule__Name__Group__0 )
            // InternalJobNeedsOneOf1Parser.g:96:4: rule__Name__Group__0
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
    // InternalJobNeedsOneOf1Parser.g:105:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf1Parser.g:106:1: ( ruleEString EOF )
            // InternalJobNeedsOneOf1Parser.g:107:1: ruleEString EOF
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
    // InternalJobNeedsOneOf1Parser.g:114:1: ruleEString : ( ruleVALID_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:118:2: ( ( ruleVALID_STRING ) )
            // InternalJobNeedsOneOf1Parser.g:119:2: ( ruleVALID_STRING )
            {
            // InternalJobNeedsOneOf1Parser.g:119:2: ( ruleVALID_STRING )
            // InternalJobNeedsOneOf1Parser.g:120:3: ruleVALID_STRING
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
    // InternalJobNeedsOneOf1Parser.g:130:1: entryRuleVALID_STRING : ruleVALID_STRING EOF ;
    public final void entryRuleVALID_STRING() throws RecognitionException {
        try {
            // InternalJobNeedsOneOf1Parser.g:131:1: ( ruleVALID_STRING EOF )
            // InternalJobNeedsOneOf1Parser.g:132:1: ruleVALID_STRING EOF
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
    // InternalJobNeedsOneOf1Parser.g:139:1: ruleVALID_STRING : ( RULE_STRING ) ;
    public final void ruleVALID_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:143:2: ( ( RULE_STRING ) )
            // InternalJobNeedsOneOf1Parser.g:144:2: ( RULE_STRING )
            {
            // InternalJobNeedsOneOf1Parser.g:144:2: ( RULE_STRING )
            // InternalJobNeedsOneOf1Parser.g:145:3: RULE_STRING
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


    // $ANTLR start "rule__Name__Group__0"
    // InternalJobNeedsOneOf1Parser.g:154:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:158:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // InternalJobNeedsOneOf1Parser.g:159:2: rule__Name__Group__0__Impl rule__Name__Group__1
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
    // InternalJobNeedsOneOf1Parser.g:166:1: rule__Name__Group__0__Impl : ( () ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:170:1: ( ( () ) )
            // InternalJobNeedsOneOf1Parser.g:171:1: ( () )
            {
            // InternalJobNeedsOneOf1Parser.g:171:1: ( () )
            // InternalJobNeedsOneOf1Parser.g:172:2: ()
            {
             before(grammarAccess.getNameAccess().getNameAction_0()); 
            // InternalJobNeedsOneOf1Parser.g:173:2: ()
            // InternalJobNeedsOneOf1Parser.g:173:3: 
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
    // InternalJobNeedsOneOf1Parser.g:181:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:185:1: ( rule__Name__Group__1__Impl )
            // InternalJobNeedsOneOf1Parser.g:186:2: rule__Name__Group__1__Impl
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
    // InternalJobNeedsOneOf1Parser.g:192:1: rule__Name__Group__1__Impl : ( ( rule__Name__NameAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:196:1: ( ( ( rule__Name__NameAssignment_1 ) ) )
            // InternalJobNeedsOneOf1Parser.g:197:1: ( ( rule__Name__NameAssignment_1 ) )
            {
            // InternalJobNeedsOneOf1Parser.g:197:1: ( ( rule__Name__NameAssignment_1 ) )
            // InternalJobNeedsOneOf1Parser.g:198:2: ( rule__Name__NameAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getNameAssignment_1()); 
            // InternalJobNeedsOneOf1Parser.g:199:2: ( rule__Name__NameAssignment_1 )
            // InternalJobNeedsOneOf1Parser.g:199:3: rule__Name__NameAssignment_1
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


    // $ANTLR start "rule__JobNeedsOneOf1__JobNeedsAssignment"
    // InternalJobNeedsOneOf1Parser.g:208:1: rule__JobNeedsOneOf1__JobNeedsAssignment : ( ruleName ) ;
    public final void rule__JobNeedsOneOf1__JobNeedsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:212:1: ( ( ruleName ) )
            // InternalJobNeedsOneOf1Parser.g:213:2: ( ruleName )
            {
            // InternalJobNeedsOneOf1Parser.g:213:2: ( ruleName )
            // InternalJobNeedsOneOf1Parser.g:214:3: ruleName
            {
             before(grammarAccess.getJobNeedsOneOf1Access().getJobNeedsNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleName();

            state._fsp--;

             after(grammarAccess.getJobNeedsOneOf1Access().getJobNeedsNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__JobNeedsOneOf1__JobNeedsAssignment"


    // $ANTLR start "rule__Name__NameAssignment_1"
    // InternalJobNeedsOneOf1Parser.g:223:1: rule__Name__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Name__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJobNeedsOneOf1Parser.g:227:1: ( ( ruleEString ) )
            // InternalJobNeedsOneOf1Parser.g:228:2: ( ruleEString )
            {
            // InternalJobNeedsOneOf1Parser.g:228:2: ( ruleEString )
            // InternalJobNeedsOneOf1Parser.g:229:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});

}