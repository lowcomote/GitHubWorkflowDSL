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
import githubwf.githubwf.services.NormalJobContinue_45on_45errorOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobContinue_45on_45errorOneOf0Parser extends AbstractInternalAntlrParser {
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


        public InternalNormalJobContinue_45on_45errorOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobContinue_45on_45errorOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobContinue_45on_45errorOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobContinue_45on_45errorOneOf0Parser.g"; }



     	private NormalJobContinue_45on_45errorOneOf0GrammarAccess grammarAccess;

        public InternalNormalJobContinue_45on_45errorOneOf0Parser(TokenStream input, NormalJobContinue_45on_45errorOneOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobContinue_45on_45errorOneOf0";
       	}

       	@Override
       	protected NormalJobContinue_45on_45errorOneOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobContinue_45on_45errorOneOf0"
    // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:57:1: entryRuleNormalJobContinue_45on_45errorOneOf0 returns [EObject current=null] : iv_ruleNormalJobContinue_45on_45errorOneOf0= ruleNormalJobContinue_45on_45errorOneOf0 EOF ;
    public final EObject entryRuleNormalJobContinue_45on_45errorOneOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobContinue_45on_45errorOneOf0 = null;


        try {
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:57:77: (iv_ruleNormalJobContinue_45on_45errorOneOf0= ruleNormalJobContinue_45on_45errorOneOf0 EOF )
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:58:2: iv_ruleNormalJobContinue_45on_45errorOneOf0= ruleNormalJobContinue_45on_45errorOneOf0 EOF
            {
             newCompositeNode(grammarAccess.getNormalJobContinue_45on_45errorOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobContinue_45on_45errorOneOf0=ruleNormalJobContinue_45on_45errorOneOf0();

            state._fsp--;

             current =iv_ruleNormalJobContinue_45on_45errorOneOf0; 
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
    // $ANTLR end "entryRuleNormalJobContinue_45on_45errorOneOf0"


    // $ANTLR start "ruleNormalJobContinue_45on_45errorOneOf0"
    // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:64:1: ruleNormalJobContinue_45on_45errorOneOf0 returns [EObject current=null] : (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleNormalJobContinue_45on_45errorOneOf0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_continue_45on_45error_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:70:2: ( (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) ) ) )
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:71:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) ) )
            {
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:71:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) ) )
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:72:3: otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,ContinueOnError,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalJobContinue_45on_45errorOneOf0Access().getContinueOnErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalJobContinue_45on_45errorOneOf0Access().getColonKeyword_1());
            		
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:80:3: ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) )
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:81:4: (lv_continue_45on_45error_2_0= ruleEBooleanObject )
            {
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:81:4: (lv_continue_45on_45error_2_0= ruleEBooleanObject )
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:82:5: lv_continue_45on_45error_2_0= ruleEBooleanObject
            {

            					newCompositeNode(grammarAccess.getNormalJobContinue_45on_45errorOneOf0Access().getContinue_45on_45errorEBooleanObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_continue_45on_45error_2_0=ruleEBooleanObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNormalJobContinue_45on_45errorOneOf0Rule());
            					}
            					set(
            						current,
            						"continue_45on_45error",
            						lv_continue_45on_45error_2_0,
            						"githubwf.githubwf.NormalJobContinue_45on_45errorOneOf0.EBooleanObject");
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
    // $ANTLR end "ruleNormalJobContinue_45on_45errorOneOf0"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:103:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:103:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:104:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:110:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:116:2: ( (kw= True | kw= False ) )
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:117:2: (kw= True | kw= False )
            {
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:117:2: (kw= True | kw= False )
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
                    // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:118:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:124:3: kw= False
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
    // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:133:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:133:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:134:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:140:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ContinueOnError ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:146:2: (kw= ContinueOnError )
            // InternalNormalJobContinue_45on_45errorOneOf0Parser.g:147:2: kw= ContinueOnError
            {
            kw=(Token)match(input,ContinueOnError,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContinueOnErrorKeyword());
            	

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
