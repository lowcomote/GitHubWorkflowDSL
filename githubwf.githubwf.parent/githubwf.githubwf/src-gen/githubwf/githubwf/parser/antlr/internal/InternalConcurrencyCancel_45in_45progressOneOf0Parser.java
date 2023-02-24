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
import githubwf.githubwf.services.ConcurrencyCancel_45in_45progressOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConcurrencyCancel_45in_45progressOneOf0Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CancelInProgress", "False", "True", "Colon", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=12;
    public static final int RULE_WS=15;
    public static final int True=6;
    public static final int RULE_E_INT=10;
    public static final int RULE_STRING=9;
    public static final int False=5;
    public static final int RULE_ANY_OTHER=16;
    public static final int CancelInProgress=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=13;
    public static final int Colon=7;
    public static final int RULE_E_DOUBLE=11;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalConcurrencyCancel_45in_45progressOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConcurrencyCancel_45in_45progressOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConcurrencyCancel_45in_45progressOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalConcurrencyCancel_45in_45progressOneOf0Parser.g"; }



     	private ConcurrencyCancel_45in_45progressOneOf0GrammarAccess grammarAccess;

        public InternalConcurrencyCancel_45in_45progressOneOf0Parser(TokenStream input, ConcurrencyCancel_45in_45progressOneOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ConcurrencyCancel_45in_45progressOneOf0";
       	}

       	@Override
       	protected ConcurrencyCancel_45in_45progressOneOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConcurrencyCancel_45in_45progressOneOf0"
    // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:57:1: entryRuleConcurrencyCancel_45in_45progressOneOf0 returns [EObject current=null] : iv_ruleConcurrencyCancel_45in_45progressOneOf0= ruleConcurrencyCancel_45in_45progressOneOf0 EOF ;
    public final EObject entryRuleConcurrencyCancel_45in_45progressOneOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrencyCancel_45in_45progressOneOf0 = null;


        try {
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:57:80: (iv_ruleConcurrencyCancel_45in_45progressOneOf0= ruleConcurrencyCancel_45in_45progressOneOf0 EOF )
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:58:2: iv_ruleConcurrencyCancel_45in_45progressOneOf0= ruleConcurrencyCancel_45in_45progressOneOf0 EOF
            {
             newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcurrencyCancel_45in_45progressOneOf0=ruleConcurrencyCancel_45in_45progressOneOf0();

            state._fsp--;

             current =iv_ruleConcurrencyCancel_45in_45progressOneOf0; 
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
    // $ANTLR end "entryRuleConcurrencyCancel_45in_45progressOneOf0"


    // $ANTLR start "ruleConcurrencyCancel_45in_45progressOneOf0"
    // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:64:1: ruleConcurrencyCancel_45in_45progressOneOf0 returns [EObject current=null] : (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleConcurrencyCancel_45in_45progressOneOf0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_cancel_45in_45progress_2_0 = null;



        	enterRule();

        try {
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:70:2: ( (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) ) ) )
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:71:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) ) )
            {
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:71:2: (otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) ) )
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:72:3: otherlv_0= CancelInProgress otherlv_1= Colon ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,CancelInProgress,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getCancelInProgressKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getColonKeyword_1());
            		
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:80:3: ( (lv_cancel_45in_45progress_2_0= ruleEBooleanObject ) )
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:81:4: (lv_cancel_45in_45progress_2_0= ruleEBooleanObject )
            {
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:81:4: (lv_cancel_45in_45progress_2_0= ruleEBooleanObject )
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:82:5: lv_cancel_45in_45progress_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Access().getCancel_45in_45progressEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_cancel_45in_45progress_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConcurrencyCancel_45in_45progressOneOf0Rule());
            					}
            					set(
            						current,
            						"cancel_45in_45progress",
            						lv_cancel_45in_45progress_2_0,
            						"githubwf.githubwf.ConcurrencyCancel_45in_45progressOneOf0.EBooleanObject");
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
    // $ANTLR end "ruleConcurrencyCancel_45in_45progressOneOf0"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:103:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:103:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:104:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
            {
             newCompositeNode(grammarAccess.getEBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBooleanObject=ruleEBooleanObject();

            state._fsp--;

             current =iv_ruleEBooleanObject.getText(); 
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
    // $ANTLR end "entryRuleEBooleanObject"


    // $ANTLR start "ruleEBooleanObject"
    // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:110:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:116:2: ( (kw= True | kw= False ) )
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:117:2: (kw= True | kw= False )
            {
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:117:2: (kw= True | kw= False )
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
                    // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:118:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:124:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBooleanObject"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:133:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:133:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:134:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:140:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= CancelInProgress ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:146:2: (kw= CancelInProgress )
            // InternalConcurrencyCancel_45in_45progressOneOf0Parser.g:147:2: kw= CancelInProgress
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});

}
