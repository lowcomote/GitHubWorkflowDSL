package githubwf.githubwf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import githubwf.githubwf.services.NormalJobRuns_45onOneOf2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobRuns_45onOneOf2Parser extends AbstractInternalAntlrParser {
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

        public InternalNormalJobRuns_45onOneOf2Parser(TokenStream input, NormalJobRuns_45onOneOf2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobRuns_45onOneOf2";
       	}

       	@Override
       	protected NormalJobRuns_45onOneOf2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobRuns_45onOneOf2"
    // InternalNormalJobRuns_45onOneOf2Parser.g:57:1: entryRuleNormalJobRuns_45onOneOf2 returns [EObject current=null] : iv_ruleNormalJobRuns_45onOneOf2= ruleNormalJobRuns_45onOneOf2 EOF ;
    public final EObject entryRuleNormalJobRuns_45onOneOf2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobRuns_45onOneOf2 = null;


        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:57:65: (iv_ruleNormalJobRuns_45onOneOf2= ruleNormalJobRuns_45onOneOf2 EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:58:2: iv_ruleNormalJobRuns_45onOneOf2= ruleNormalJobRuns_45onOneOf2 EOF
            {
             newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobRuns_45onOneOf2=ruleNormalJobRuns_45onOneOf2();

            state._fsp--;

             current =iv_ruleNormalJobRuns_45onOneOf2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormalJobRuns_45onOneOf2"


    // $ANTLR start "ruleNormalJobRuns_45onOneOf2"
    // InternalNormalJobRuns_45onOneOf2Parser.g:64:1: ruleNormalJobRuns_45onOneOf2 returns [EObject current=null] : (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleStringContainingExpressionSyntax ) ) ) ;
    public final EObject ruleNormalJobRuns_45onOneOf2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_runs_45on_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:70:2: ( (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleStringContainingExpressionSyntax ) ) ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:71:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleStringContainingExpressionSyntax ) ) )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:71:2: (otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleStringContainingExpressionSyntax ) ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:72:3: otherlv_0= RunsOn otherlv_1= Colon ( (lv_runs_45on_2_0= ruleStringContainingExpressionSyntax ) )
            {
            otherlv_0=(Token)match(input,RunsOn,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalJobRuns_45onOneOf2Access().getRunsOnKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalJobRuns_45onOneOf2Access().getColonKeyword_1());
            		
            // InternalNormalJobRuns_45onOneOf2Parser.g:80:3: ( (lv_runs_45on_2_0= ruleStringContainingExpressionSyntax ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:81:4: (lv_runs_45on_2_0= ruleStringContainingExpressionSyntax )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:81:4: (lv_runs_45on_2_0= ruleStringContainingExpressionSyntax )
            // InternalNormalJobRuns_45onOneOf2Parser.g:82:5: lv_runs_45on_2_0= ruleStringContainingExpressionSyntax
            {

            					newCompositeNode(grammarAccess.getNormalJobRuns_45onOneOf2Access().getRuns_45onStringContainingExpressionSyntaxParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_runs_45on_2_0=ruleStringContainingExpressionSyntax();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNormalJobRuns_45onOneOf2Rule());
            					}
            					set(
            						current,
            						"runs_45on",
            						lv_runs_45on_2_0,
            						"githubwf.githubwf.NormalJobRuns_45onOneOf2.StringContainingExpressionSyntax");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormalJobRuns_45onOneOf2"


    // $ANTLR start "entryRuleStringContainingExpressionSyntax"
    // InternalNormalJobRuns_45onOneOf2Parser.g:103:1: entryRuleStringContainingExpressionSyntax returns [EObject current=null] : iv_ruleStringContainingExpressionSyntax= ruleStringContainingExpressionSyntax EOF ;
    public final EObject entryRuleStringContainingExpressionSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringContainingExpressionSyntax = null;


        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:103:73: (iv_ruleStringContainingExpressionSyntax= ruleStringContainingExpressionSyntax EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:104:2: iv_ruleStringContainingExpressionSyntax= ruleStringContainingExpressionSyntax EOF
            {
             newCompositeNode(grammarAccess.getStringContainingExpressionSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringContainingExpressionSyntax=ruleStringContainingExpressionSyntax();

            state._fsp--;

             current =iv_ruleStringContainingExpressionSyntax; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringContainingExpressionSyntax"


    // $ANTLR start "ruleStringContainingExpressionSyntax"
    // InternalNormalJobRuns_45onOneOf2Parser.g:110:1: ruleStringContainingExpressionSyntax returns [EObject current=null] : ( (lv_stringContainingExpressionSyntax_0_0= ruleEString ) ) ;
    public final EObject ruleStringContainingExpressionSyntax() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_stringContainingExpressionSyntax_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:116:2: ( ( (lv_stringContainingExpressionSyntax_0_0= ruleEString ) ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:117:2: ( (lv_stringContainingExpressionSyntax_0_0= ruleEString ) )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:117:2: ( (lv_stringContainingExpressionSyntax_0_0= ruleEString ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:118:3: (lv_stringContainingExpressionSyntax_0_0= ruleEString )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:118:3: (lv_stringContainingExpressionSyntax_0_0= ruleEString )
            // InternalNormalJobRuns_45onOneOf2Parser.g:119:4: lv_stringContainingExpressionSyntax_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringContainingExpressionSyntaxAccess().getStringContainingExpressionSyntaxEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_stringContainingExpressionSyntax_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringContainingExpressionSyntaxRule());
            				}
            				set(
            					current,
            					"stringContainingExpressionSyntax",
            					lv_stringContainingExpressionSyntax_0_0,
            					"githubwf.githubwf.NormalJobRuns_45onOneOf2.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringContainingExpressionSyntax"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobRuns_45onOneOf2Parser.g:139:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:139:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:140:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalNormalJobRuns_45onOneOf2Parser.g:146:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:152:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobRuns_45onOneOf2Parser.g:153:2: this_VALID_STRING_0= ruleVALID_STRING
            {

            		newCompositeNode(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_VALID_STRING_0=ruleVALID_STRING();

            state._fsp--;


            		current.merge(this_VALID_STRING_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalNormalJobRuns_45onOneOf2Parser.g:166:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:166:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:167:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
            {
             newCompositeNode(grammarAccess.getVALID_STRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALID_STRING=ruleVALID_STRING();

            state._fsp--;

             current =iv_ruleVALID_STRING.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVALID_STRING"


    // $ANTLR start "ruleVALID_STRING"
    // InternalNormalJobRuns_45onOneOf2Parser.g:173:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:179:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalNormalJobRuns_45onOneOf2Parser.g:180:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalNormalJobRuns_45onOneOf2Parser.g:180:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
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
                    // InternalNormalJobRuns_45onOneOf2Parser.g:181:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobRuns_45onOneOf2Parser.g:189:3: this_KEYWORD_1= ruleKEYWORD
                    {

                    			newCompositeNode(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_1=ruleKEYWORD();

                    state._fsp--;


                    			current.merge(this_KEYWORD_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalNormalJobRuns_45onOneOf2Parser.g:203:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:203:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobRuns_45onOneOf2Parser.g:204:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;

             current =iv_ruleKEYWORD.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalNormalJobRuns_45onOneOf2Parser.g:210:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= RunsOn ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobRuns_45onOneOf2Parser.g:216:2: (kw= RunsOn )
            // InternalNormalJobRuns_45onOneOf2Parser.g:217:2: kw= RunsOn
            {
            kw=(Token)match(input,RunsOn,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRunsOnKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKEYWORD"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000090L});

}
