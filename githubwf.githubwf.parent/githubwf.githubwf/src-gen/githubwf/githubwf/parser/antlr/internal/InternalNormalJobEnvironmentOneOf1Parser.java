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
import githubwf.githubwf.services.NormalJobEnvironmentOneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNormalJobEnvironmentOneOf1Parser extends AbstractInternalAntlrParser {
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

        public InternalNormalJobEnvironmentOneOf1Parser(TokenStream input, NormalJobEnvironmentOneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobEnvironmentOneOf1";
       	}

       	@Override
       	protected NormalJobEnvironmentOneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobEnvironmentOneOf1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:57:1: entryRuleNormalJobEnvironmentOneOf1 returns [EObject current=null] : iv_ruleNormalJobEnvironmentOneOf1= ruleNormalJobEnvironmentOneOf1 EOF ;
    public final EObject entryRuleNormalJobEnvironmentOneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobEnvironmentOneOf1 = null;


        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:57:67: (iv_ruleNormalJobEnvironmentOneOf1= ruleNormalJobEnvironmentOneOf1 EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:58:2: iv_ruleNormalJobEnvironmentOneOf1= ruleNormalJobEnvironmentOneOf1 EOF
            {
             newCompositeNode(grammarAccess.getNormalJobEnvironmentOneOf1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobEnvironmentOneOf1=ruleNormalJobEnvironmentOneOf1();

            state._fsp--;

             current =iv_ruleNormalJobEnvironmentOneOf1; 
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
    // $ANTLR end "entryRuleNormalJobEnvironmentOneOf1"


    // $ANTLR start "ruleNormalJobEnvironmentOneOf1"
    // InternalNormalJobEnvironmentOneOf1Parser.g:64:1: ruleNormalJobEnvironmentOneOf1 returns [EObject current=null] : (otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEnvironment ) ) ) ;
    public final EObject ruleNormalJobEnvironmentOneOf1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_environment_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:70:2: ( (otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEnvironment ) ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:71:2: (otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEnvironment ) ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:71:2: (otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEnvironment ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:72:3: otherlv_0= Environment otherlv_1= Colon ( (lv_environment_2_0= ruleEnvironment ) )
            {
            otherlv_0=(Token)match(input,Environment,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalJobEnvironmentOneOf1Access().getColonKeyword_1());
            		
            // InternalNormalJobEnvironmentOneOf1Parser.g:80:3: ( (lv_environment_2_0= ruleEnvironment ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:81:4: (lv_environment_2_0= ruleEnvironment )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:81:4: (lv_environment_2_0= ruleEnvironment )
            // InternalNormalJobEnvironmentOneOf1Parser.g:82:5: lv_environment_2_0= ruleEnvironment
            {

            					newCompositeNode(grammarAccess.getNormalJobEnvironmentOneOf1Access().getEnvironmentEnvironmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_environment_2_0=ruleEnvironment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNormalJobEnvironmentOneOf1Rule());
            					}
            					set(
            						current,
            						"environment",
            						lv_environment_2_0,
            						"githubwf.githubwf.NormalJobEnvironmentOneOf1.Environment");
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
    // $ANTLR end "ruleNormalJobEnvironmentOneOf1"


    // $ANTLR start "entryRuleEnvironmentPropertiesAbstract"
    // InternalNormalJobEnvironmentOneOf1Parser.g:103:1: entryRuleEnvironmentPropertiesAbstract returns [EObject current=null] : iv_ruleEnvironmentPropertiesAbstract= ruleEnvironmentPropertiesAbstract EOF ;
    public final EObject entryRuleEnvironmentPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentPropertiesAbstract = null;


        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:103:70: (iv_ruleEnvironmentPropertiesAbstract= ruleEnvironmentPropertiesAbstract EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:104:2: iv_ruleEnvironmentPropertiesAbstract= ruleEnvironmentPropertiesAbstract EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentPropertiesAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentPropertiesAbstract=ruleEnvironmentPropertiesAbstract();

            state._fsp--;

             current =iv_ruleEnvironmentPropertiesAbstract; 
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
    // $ANTLR end "entryRuleEnvironmentPropertiesAbstract"


    // $ANTLR start "ruleEnvironmentPropertiesAbstract"
    // InternalNormalJobEnvironmentOneOf1Parser.g:110:1: ruleEnvironmentPropertiesAbstract returns [EObject current=null] : (this_EnvironmentName_0= ruleEnvironmentName | this_EnvironmentUrl_1= ruleEnvironmentUrl ) ;
    public final EObject ruleEnvironmentPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvironmentName_0 = null;

        EObject this_EnvironmentUrl_1 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:116:2: ( (this_EnvironmentName_0= ruleEnvironmentName | this_EnvironmentUrl_1= ruleEnvironmentUrl ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:117:2: (this_EnvironmentName_0= ruleEnvironmentName | this_EnvironmentUrl_1= ruleEnvironmentUrl )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:117:2: (this_EnvironmentName_0= ruleEnvironmentName | this_EnvironmentUrl_1= ruleEnvironmentUrl )
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
                    // InternalNormalJobEnvironmentOneOf1Parser.g:118:3: this_EnvironmentName_0= ruleEnvironmentName
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentPropertiesAbstractAccess().getEnvironmentNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnvironmentName_0=ruleEnvironmentName();

                    state._fsp--;


                    			current = this_EnvironmentName_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:127:3: this_EnvironmentUrl_1= ruleEnvironmentUrl
                    {

                    			newCompositeNode(grammarAccess.getEnvironmentPropertiesAbstractAccess().getEnvironmentUrlParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnvironmentUrl_1=ruleEnvironmentUrl();

                    state._fsp--;


                    			current = this_EnvironmentUrl_1;
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
    // $ANTLR end "ruleEnvironmentPropertiesAbstract"


    // $ANTLR start "entryRuleEnvironment"
    // InternalNormalJobEnvironmentOneOf1Parser.g:139:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:139:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:140:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalNormalJobEnvironmentOneOf1Parser.g:146:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_environment_2_0= ruleEnvironmentPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_environment_2_0 = null;

        EObject lv_environment_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:152:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_environment_2_0= ruleEnvironmentPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:153:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_environment_2_0= ruleEnvironmentPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:153:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_environment_2_0= ruleEnvironmentPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobEnvironmentOneOf1Parser.g:154:3: () otherlv_1= LeftCurlyBracket ( ( (lv_environment_2_0= ruleEnvironmentPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:154:3: ()
            // InternalNormalJobEnvironmentOneOf1Parser.g:155:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalNormalJobEnvironmentOneOf1Parser.g:165:3: ( ( (lv_environment_2_0= ruleEnvironmentPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=Name && LA3_0<=Url)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:166:4: ( (lv_environment_2_0= ruleEnvironmentPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobEnvironmentOneOf1Parser.g:166:4: ( (lv_environment_2_0= ruleEnvironmentPropertiesAbstract ) )
                    // InternalNormalJobEnvironmentOneOf1Parser.g:167:5: (lv_environment_2_0= ruleEnvironmentPropertiesAbstract )
                    {
                    // InternalNormalJobEnvironmentOneOf1Parser.g:167:5: (lv_environment_2_0= ruleEnvironmentPropertiesAbstract )
                    // InternalNormalJobEnvironmentOneOf1Parser.g:168:6: lv_environment_2_0= ruleEnvironmentPropertiesAbstract
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentPropertiesAbstractParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_environment_2_0=ruleEnvironmentPropertiesAbstract();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    						}
                    						add(
                    							current,
                    							"environment",
                    							lv_environment_2_0,
                    							"githubwf.githubwf.NormalJobEnvironmentOneOf1.EnvironmentPropertiesAbstract");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalNormalJobEnvironmentOneOf1Parser.g:185:4: (otherlv_3= Comma ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Comma) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalNormalJobEnvironmentOneOf1Parser.g:186:5: otherlv_3= Comma ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalNormalJobEnvironmentOneOf1Parser.g:190:5: ( (lv_environment_4_0= ruleEnvironmentPropertiesAbstract ) )
                    	    // InternalNormalJobEnvironmentOneOf1Parser.g:191:6: (lv_environment_4_0= ruleEnvironmentPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobEnvironmentOneOf1Parser.g:191:6: (lv_environment_4_0= ruleEnvironmentPropertiesAbstract )
                    	    // InternalNormalJobEnvironmentOneOf1Parser.g:192:7: lv_environment_4_0= ruleEnvironmentPropertiesAbstract
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentAccess().getEnvironmentEnvironmentPropertiesAbstractParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_environment_4_0=ruleEnvironmentPropertiesAbstract();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"environment",
                    	    								lv_environment_4_0,
                    	    								"githubwf.githubwf.NormalJobEnvironmentOneOf1.EnvironmentPropertiesAbstract");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleEnvironmentName"
    // InternalNormalJobEnvironmentOneOf1Parser.g:219:1: entryRuleEnvironmentName returns [EObject current=null] : iv_ruleEnvironmentName= ruleEnvironmentName EOF ;
    public final EObject entryRuleEnvironmentName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentName = null;


        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:219:56: (iv_ruleEnvironmentName= ruleEnvironmentName EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:220:2: iv_ruleEnvironmentName= ruleEnvironmentName EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentName=ruleEnvironmentName();

            state._fsp--;

             current =iv_ruleEnvironmentName; 
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
    // $ANTLR end "entryRuleEnvironmentName"


    // $ANTLR start "ruleEnvironmentName"
    // InternalNormalJobEnvironmentOneOf1Parser.g:226:1: ruleEnvironmentName returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleEnvironmentName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:232:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:233:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:233:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:234:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:234:3: ()
            // InternalNormalJobEnvironmentOneOf1Parser.g:235:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentNameAccess().getEnvironmentNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentNameAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentNameAccess().getColonKeyword_2());
            		
            // InternalNormalJobEnvironmentOneOf1Parser.g:249:3: ( (lv_name_3_0= ruleEString ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:250:4: (lv_name_3_0= ruleEString )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:250:4: (lv_name_3_0= ruleEString )
            // InternalNormalJobEnvironmentOneOf1Parser.g:251:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentNameAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"githubwf.githubwf.NormalJobEnvironmentOneOf1.EString");
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
    // $ANTLR end "ruleEnvironmentName"


    // $ANTLR start "entryRuleEnvironmentUrl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:272:1: entryRuleEnvironmentUrl returns [EObject current=null] : iv_ruleEnvironmentUrl= ruleEnvironmentUrl EOF ;
    public final EObject entryRuleEnvironmentUrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentUrl = null;


        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:272:55: (iv_ruleEnvironmentUrl= ruleEnvironmentUrl EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:273:2: iv_ruleEnvironmentUrl= ruleEnvironmentUrl EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentUrlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentUrl=ruleEnvironmentUrl();

            state._fsp--;

             current =iv_ruleEnvironmentUrl; 
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
    // $ANTLR end "entryRuleEnvironmentUrl"


    // $ANTLR start "ruleEnvironmentUrl"
    // InternalNormalJobEnvironmentOneOf1Parser.g:279:1: ruleEnvironmentUrl returns [EObject current=null] : (otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) ) ) ;
    public final EObject ruleEnvironmentUrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_url_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:285:2: ( (otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:286:2: (otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) ) )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:286:2: (otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:287:3: otherlv_0= Url otherlv_1= Colon ( (lv_url_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Url,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentUrlAccess().getUrlKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentUrlAccess().getColonKeyword_1());
            		
            // InternalNormalJobEnvironmentOneOf1Parser.g:295:3: ( (lv_url_2_0= ruleEString ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:296:4: (lv_url_2_0= ruleEString )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:296:4: (lv_url_2_0= ruleEString )
            // InternalNormalJobEnvironmentOneOf1Parser.g:297:5: lv_url_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentUrlAccess().getUrlEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_url_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentUrlRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_2_0,
            						"githubwf.githubwf.NormalJobEnvironmentOneOf1.EString");
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
    // $ANTLR end "ruleEnvironmentUrl"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobEnvironmentOneOf1Parser.g:318:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:318:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:319:2: iv_ruleEString= ruleEString EOF
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:325:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:331:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobEnvironmentOneOf1Parser.g:332:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:345:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:345:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:346:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:352:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:358:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:359:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:359:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=Environment && LA4_0<=Url)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:360:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:368:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:382:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:382:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobEnvironmentOneOf1Parser.g:383:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalNormalJobEnvironmentOneOf1Parser.g:389:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Environment | kw= Name | kw= Url ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobEnvironmentOneOf1Parser.g:395:2: ( (kw= Environment | kw= Name | kw= Url ) )
            // InternalNormalJobEnvironmentOneOf1Parser.g:396:2: (kw= Environment | kw= Name | kw= Url )
            {
            // InternalNormalJobEnvironmentOneOf1Parser.g:396:2: (kw= Environment | kw= Name | kw= Url )
            int alt5=3;
            switch ( input.LA(1) ) {
            case Environment:
                {
                alt5=1;
                }
                break;
            case Name:
                {
                alt5=2;
                }
                break;
            case Url:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:397:3: kw= Environment
                    {
                    kw=(Token)match(input,Environment,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnvironmentKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:403:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalNormalJobEnvironmentOneOf1Parser.g:409:3: kw= Url
                    {
                    kw=(Token)match(input,Url,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUrlKeyword_2());
                    		

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
    // $ANTLR end "ruleKEYWORD"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000460L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001070L});

}
