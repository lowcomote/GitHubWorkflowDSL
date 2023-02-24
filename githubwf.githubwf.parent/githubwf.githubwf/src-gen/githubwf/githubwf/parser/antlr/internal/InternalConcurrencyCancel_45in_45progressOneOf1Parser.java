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
import githubwf.githubwf.services.ConcurrencyCancel_45in_45progressOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConcurrencyCancel_45in_45progressOneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CancelInProgress", "Colon", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int RULE_E_INT=8;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=14;
    public static final int CancelInProgress=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int Colon=5;
    public static final int RULE_E_DOUBLE=9;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalConcurrencyCancel_45in_45progressOneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConcurrencyCancel_45in_45progressOneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConcurrencyCancel_45in_45progressOneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalConcurrencyCancel_45in_45progressOneOf1Parser.g"; }



     	private ConcurrencyCancel_45in_45progressOneOf1GrammarAccess grammarAccess;

        public InternalConcurrencyCancel_45in_45progressOneOf1Parser(TokenStream input, ConcurrencyCancel_45in_45progressOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConcurrencyCancel_45in_45progressOneOf1";
       	}

       	@Override
       	protected ConcurrencyCancel_45in_45progressOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressOneOf1"
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:57:1: entryRuleConcurrencyCancel_45in_45progressOneOf1 returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressOneOf1= ruleConcurrencyCancel_45in_45progressOneOf1 EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressOneOf1 = null;


        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:57:80: (iv_ruleConcurrencyCancel_45in_45progressOneOf1= ruleConcurrencyCancel_45in_45progressOneOf1 EOF )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:58:2: iv_ruleConcurrencyCancel_45in_45progressOneOf1= ruleConcurrencyCancel_45in_45progressOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressOneOf1=ruleConcurrencyCancel_45in_45progressOneOf1();

            state._fsp--;

             current =iv_ruleConcurrencyCancel_45in_45progressOneOf1; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressOneOf1"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressOneOf1"
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:64:1: ruleConcurrencyCancel_45in_45progressOneOf1 returns [EObject current=null] : (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleExpressionSyntax ) ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressOneOf1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_cancel_45in_45progress_2_0 = null;



        	enterRule();

        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:70:2: ( (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleExpressionSyntax ) ) ) )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:71:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleExpressionSyntax ) ) )
            {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:71:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleExpressionSyntax ) ) )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:72:3: otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleExpressionSyntax ) )
            {
            otherlv_0=(Token)match(input,CancelInProgress,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConcurrencyCancel_45in_45progressOneOf1Access().getCancelInProgressKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressOneOf1Access().getColonKeyword_1());
            		
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:80:3: ( (lv_cancel_45in_45progress_2_0= ruleExpressionSyntax ) )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:81:4: (lv_cancel_45in_45progress_2_0= ruleExpressionSyntax )
            {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:81:4: (lv_cancel_45in_45progress_2_0= ruleExpressionSyntax )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:82:5: lv_cancel_45in_45progress_2_0= ruleExpressionSyntax
            {

            					newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressOneOf1Access().getCancel_45in_45progressExpressionSyntaxParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_cancel_45in_45progress_2_0=ruleExpressionSyntax();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressOneOf1Rule());
            					}
            					set(
            						current,
            						"cancel_45in_45progress",
            						lv_cancel_45in_45progress_2_0,
            						"githubwf.githubwf.ConcurrencyCancel_45in_45progressOneOf1.ExpressionSyntax");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressOneOf1"


    // $ANTLR start "entryRuleExpressionSyntax"
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:103:1: entryRuleExpressionSyntax returns [EObject current=null] : iv_ruleExpressionSyntax= ruleExpressionSyntax EOF ;
    public final EObject entryRuleExpressionSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionSyntax = null;


        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:103:57: (iv_ruleExpressionSyntax= ruleExpressionSyntax EOF )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:104:2: iv_ruleExpressionSyntax= ruleExpressionSyntax EOF
            {
             newCompositeNode(grammarAccess.getExpressionSyntaxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionSyntax=ruleExpressionSyntax();

            state._fsp--;

             current =iv_ruleExpressionSyntax; 
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
    // $ANTLR end "entryRuleExpressionSyntax"


    // $ANTLR start "ruleExpressionSyntax"
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:110:1: ruleExpressionSyntax returns [EObject current=null] : ( (lv_expressionSyntax_0_0= ruleEString ) ) ;
    public final EObject ruleExpressionSyntax() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_expressionSyntax_0_0 = null;



        	enterRule();

        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:116:2: ( ( (lv_expressionSyntax_0_0= ruleEString ) ) )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:117:2: ( (lv_expressionSyntax_0_0= ruleEString ) )
            {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:117:2: ( (lv_expressionSyntax_0_0= ruleEString ) )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:118:3: (lv_expressionSyntax_0_0= ruleEString )
            {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:118:3: (lv_expressionSyntax_0_0= ruleEString )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:119:4: lv_expressionSyntax_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getExpressionSyntaxAccess().getExpressionSyntaxEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expressionSyntax_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionSyntaxRule());
            				}
            				set(
            					current,
            					"expressionSyntax",
            					lv_expressionSyntax_0_0,
            					"githubwf.githubwf.ConcurrencyCancel_45in_45progressOneOf1.EString");
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
    // $ANTLR end "ruleExpressionSyntax"


    // $ANTLR start "entryRuleEString"
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:139:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:139:47: (iv_ruleEString= ruleEString EOF )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:140:2: iv_ruleEString= ruleEString EOF
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
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:146:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:152:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:153:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:166:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:166:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:167:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:173:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:179:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:180:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:180:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==CancelInProgress) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:181:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:189:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:203:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:203:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:204:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:210:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= CancelInProgress ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:216:2: (kw= CancelInProgress )
            // InternalConcurrencyCancel_45in_45progressOneOf1Parser.g:217:2: kw= CancelInProgress
            {
            kw=(Token)match(input,CancelInProgress,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getCancelInProgressKeyword());
            	

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
