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
import githubwf.githubwf.services.NormalJobEnvironmentOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobEnvironmentOneOf0Parser extends AbstractInternalAntlrParser {
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

        public InternalNormalJobEnvironmentOneOf0Parser(TokenStream input, NormalJobEnvironmentOneOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobEnvironmentOneOf0";
       	}

       	@Override
       	protected NormalJobEnvironmentOneOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobEnvironmentOneOf0"
    // InternalNormalJobEnvironmentOneOf0Parser.g:57:1: entryRuleNormalJobEnvironmentOneOf0 returns [EObject current=null] : iv_ruleNormalJobEnvironmentOneOf0= ruleNormalJobEnvironmentOneOf0 EOF ;
    public final EObject entryRuleNormalJobEnvironmentOneOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobEnvironmentOneOf0 = null;


        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:57:67: (iv_ruleNormalJobEnvironmentOneOf0= ruleNormalJobEnvironmentOneOf0 EOF )
            // InternalNormalJobEnvironmentOneOf0Parser.g:58:2: iv_ruleNormalJobEnvironmentOneOf0= ruleNormalJobEnvironmentOneOf0 EOF
            {
             newCompositeNode(grammarAccess.getNormalJobEnvironmentOneOf0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobEnvironmentOneOf0=ruleNormalJobEnvironmentOneOf0();

            state._fsp--;

             current =iv_ruleNormalJobEnvironmentOneOf0; 
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
    // $ANTLR end "entryRuleNormalJobEnvironmentOneOf0"


    // $ANTLR start "ruleNormalJobEnvironmentOneOf0"
    // InternalNormalJobEnvironmentOneOf0Parser.g:64:1: ruleNormalJobEnvironmentOneOf0 returns [EObject current=null] : (otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEString ) ) ) ;
    public final EObject ruleNormalJobEnvironmentOneOf0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_environment_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:70:2: ( (otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEString ) ) ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:71:2: (otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEString ) ) )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:71:2: (otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEString ) ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:72:3: otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Environment,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalJobEnvironmentOneOf0Access().getColonKeyword_1());
            		
            // InternalNormalJobEnvironmentOneOf0Parser.g:80:3: ( (lv_environment_2_0= ruleEString ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:81:4: (lv_environment_2_0= ruleEString )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:81:4: (lv_environment_2_0= ruleEString )
            // InternalNormalJobEnvironmentOneOf0Parser.g:82:5: lv_environment_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNormalJobEnvironmentOneOf0Access().getEnvironmentEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_environment_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNormalJobEnvironmentOneOf0Rule());
            					}
            					set(
            						current,
            						"environment",
            						lv_environment_2_0,
            						"githubwf.githubwf.NormalJobEnvironmentOneOf0.EString");
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
    // $ANTLR end "ruleNormalJobEnvironmentOneOf0"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobEnvironmentOneOf0Parser.g:103:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:103:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobEnvironmentOneOf0Parser.g:104:2: iv_ruleEString= ruleEString EOF
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
    // InternalNormalJobEnvironmentOneOf0Parser.g:110:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:116:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobEnvironmentOneOf0Parser.g:117:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalNormalJobEnvironmentOneOf0Parser.g:130:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:130:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobEnvironmentOneOf0Parser.g:131:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalNormalJobEnvironmentOneOf0Parser.g:137:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:143:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalNormalJobEnvironmentOneOf0Parser.g:144:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalNormalJobEnvironmentOneOf0Parser.g:144:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
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
                    // InternalNormalJobEnvironmentOneOf0Parser.g:145:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobEnvironmentOneOf0Parser.g:153:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalNormalJobEnvironmentOneOf0Parser.g:167:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:167:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobEnvironmentOneOf0Parser.g:168:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalNormalJobEnvironmentOneOf0Parser.g:174:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Environment ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf0Parser.g:180:2: (kw= Environment )
            // InternalNormalJobEnvironmentOneOf0Parser.g:181:2: kw= Environment
            {
            kw=(Token)match(input,Environment,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnvironmentKeyword());
            	

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
