package githubwf.githubwf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import githubwf.githubwf.services.NormalJobStepsItemsAllOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNormalJobStepsItemsAllOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ContinueOnError", "WorkingDirectory", "TimeoutMinutes", "Shell", "Name", "Uses", "With", "Env", "Run", "False", "Id", "If", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=16;
    public static final int Uses=9;
    public static final int True=17;
    public static final int RULE_STRING=25;
    public static final int False=13;
    public static final int Env=11;
    public static final int Name=8;
    public static final int With=10;
    public static final int RULE_SL_COMMENT=30;
    public static final int Comma=18;
    public static final int Shell=7;
    public static final int Colon=19;
    public static final int RightCurlyBracket=23;
    public static final int RULE_E_DOUBLE=27;
    public static final int EOF=-1;
    public static final int RightSquareBracket=21;
    public static final int WorkingDirectory=5;
    public static final int TimeoutMinutes=6;
    public static final int RULE_ID=28;
    public static final int RULE_WS=31;
    public static final int LeftCurlyBracket=22;
    public static final int RULE_E_INT=26;
    public static final int Run=12;
    public static final int RULE_ANY_OTHER=32;
    public static final int RULE_INT=24;
    public static final int RULE_ML_COMMENT=29;
    public static final int LeftSquareBracket=20;
    public static final int Id=14;
    public static final int ContinueOnError=4;
    public static final int If=15;

    // delegates
    // delegators


        public InternalNormalJobStepsItemsAllOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobStepsItemsAllOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobStepsItemsAllOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobStepsItemsAllOf1Parser.g"; }



     	private NormalJobStepsItemsAllOf1GrammarAccess grammarAccess;

        public InternalNormalJobStepsItemsAllOf1Parser(TokenStream input, NormalJobStepsItemsAllOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobStepsItemsAllOf1";
       	}

       	@Override
       	protected NormalJobStepsItemsAllOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1"
    // InternalNormalJobStepsItemsAllOf1Parser.g:58:1: entryRuleNormalJobStepsItemsAllOf1 returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1= ruleNormalJobStepsItemsAllOf1 EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1 = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:58:66: (iv_ruleNormalJobStepsItemsAllOf1= ruleNormalJobStepsItemsAllOf1 EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:59:2: iv_ruleNormalJobStepsItemsAllOf1= ruleNormalJobStepsItemsAllOf1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1=ruleNormalJobStepsItemsAllOf1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1"
    // InternalNormalJobStepsItemsAllOf1Parser.g:65:1: ruleNormalJobStepsItemsAllOf1 returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:71:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobStepsItemsAllOf1Parser.g:73:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:73:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:74:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNormalJobStepsItemsAllOf1Access().getNormalJobStepsItemsAllOf1Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Access().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:84:3: ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=ContinueOnError && LA2_0<=Run)||(LA2_0>=Id && LA2_0<=If)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:85:4: ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:85:4: ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:86:5: (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:86:5: (lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:87:6: lv_items_2_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Access().getItemsNormalJobStepsItemsAllOf1PropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleNormalJobStepsItemsAllOf1PropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Rule());
                      						}
                      						add(
                      							current,
                      							"items",
                      							lv_items_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf1.NormalJobStepsItemsAllOf1PropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf1Parser.g:104:4: (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:105:5: otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getNormalJobStepsItemsAllOf1Access().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:109:5: ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract ) )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:110:6: (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:110:6: (lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:111:7: lv_items_4_0= ruleNormalJobStepsItemsAllOf1PropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Access().getItemsNormalJobStepsItemsAllOf1PropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleNormalJobStepsItemsAllOf1PropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Rule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"items",
                    	      								lv_items_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf1.NormalJobStepsItemsAllOf1PropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getNormalJobStepsItemsAllOf1Access().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1PropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:138:1: entryRuleNormalJobStepsItemsAllOf1PropertiesAbstract returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1PropertiesAbstract= ruleNormalJobStepsItemsAllOf1PropertiesAbstract EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1PropertiesAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:138:84: (iv_ruleNormalJobStepsItemsAllOf1PropertiesAbstract= ruleNormalJobStepsItemsAllOf1PropertiesAbstract EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:139:2: iv_ruleNormalJobStepsItemsAllOf1PropertiesAbstract= ruleNormalJobStepsItemsAllOf1PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1PropertiesAbstract=ruleNormalJobStepsItemsAllOf1PropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1PropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1PropertiesAbstract"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1PropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:145:1: ruleNormalJobStepsItemsAllOf1PropertiesAbstract returns [EObject current=null] : (this_NormalJobStepsItemsAllOf1Id_0= ruleNormalJobStepsItemsAllOf1Id | this_NormalJobStepsItemsAllOf1If_1= ruleNormalJobStepsItemsAllOf1If | this_NormalJobStepsItemsAllOf1Name_2= ruleNormalJobStepsItemsAllOf1Name | this_NormalJobStepsItemsAllOf1Uses_3= ruleNormalJobStepsItemsAllOf1Uses | this_NormalJobStepsItemsAllOf1Run_4= ruleNormalJobStepsItemsAllOf1Run | this_NormalJobStepsItemsAllOf1Working_45directory_5= ruleNormalJobStepsItemsAllOf1Working_45directory | this_NormalJobStepsItemsAllOf1Shell_6= ruleNormalJobStepsItemsAllOf1Shell | this_NormalJobStepsItemsAllOf1With_7= ruleNormalJobStepsItemsAllOf1With | this_NormalJobStepsItemsAllOf1Env_8= ruleNormalJobStepsItemsAllOf1Env | this_NormalJobStepsItemsAllOf1Continue_45on_45error_9= ruleNormalJobStepsItemsAllOf1Continue_45on_45error | this_NormalJobStepsItemsAllOf1Timeout_45minutes_10= ruleNormalJobStepsItemsAllOf1Timeout_45minutes ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_NormalJobStepsItemsAllOf1Id_0 = null;

        EObject this_NormalJobStepsItemsAllOf1If_1 = null;

        EObject this_NormalJobStepsItemsAllOf1Name_2 = null;

        EObject this_NormalJobStepsItemsAllOf1Uses_3 = null;

        EObject this_NormalJobStepsItemsAllOf1Run_4 = null;

        EObject this_NormalJobStepsItemsAllOf1Working_45directory_5 = null;

        EObject this_NormalJobStepsItemsAllOf1Shell_6 = null;

        EObject this_NormalJobStepsItemsAllOf1With_7 = null;

        EObject this_NormalJobStepsItemsAllOf1Env_8 = null;

        EObject this_NormalJobStepsItemsAllOf1Continue_45on_45error_9 = null;

        EObject this_NormalJobStepsItemsAllOf1Timeout_45minutes_10 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:151:2: ( (this_NormalJobStepsItemsAllOf1Id_0= ruleNormalJobStepsItemsAllOf1Id | this_NormalJobStepsItemsAllOf1If_1= ruleNormalJobStepsItemsAllOf1If | this_NormalJobStepsItemsAllOf1Name_2= ruleNormalJobStepsItemsAllOf1Name | this_NormalJobStepsItemsAllOf1Uses_3= ruleNormalJobStepsItemsAllOf1Uses | this_NormalJobStepsItemsAllOf1Run_4= ruleNormalJobStepsItemsAllOf1Run | this_NormalJobStepsItemsAllOf1Working_45directory_5= ruleNormalJobStepsItemsAllOf1Working_45directory | this_NormalJobStepsItemsAllOf1Shell_6= ruleNormalJobStepsItemsAllOf1Shell | this_NormalJobStepsItemsAllOf1With_7= ruleNormalJobStepsItemsAllOf1With | this_NormalJobStepsItemsAllOf1Env_8= ruleNormalJobStepsItemsAllOf1Env | this_NormalJobStepsItemsAllOf1Continue_45on_45error_9= ruleNormalJobStepsItemsAllOf1Continue_45on_45error | this_NormalJobStepsItemsAllOf1Timeout_45minutes_10= ruleNormalJobStepsItemsAllOf1Timeout_45minutes ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:152:2: (this_NormalJobStepsItemsAllOf1Id_0= ruleNormalJobStepsItemsAllOf1Id | this_NormalJobStepsItemsAllOf1If_1= ruleNormalJobStepsItemsAllOf1If | this_NormalJobStepsItemsAllOf1Name_2= ruleNormalJobStepsItemsAllOf1Name | this_NormalJobStepsItemsAllOf1Uses_3= ruleNormalJobStepsItemsAllOf1Uses | this_NormalJobStepsItemsAllOf1Run_4= ruleNormalJobStepsItemsAllOf1Run | this_NormalJobStepsItemsAllOf1Working_45directory_5= ruleNormalJobStepsItemsAllOf1Working_45directory | this_NormalJobStepsItemsAllOf1Shell_6= ruleNormalJobStepsItemsAllOf1Shell | this_NormalJobStepsItemsAllOf1With_7= ruleNormalJobStepsItemsAllOf1With | this_NormalJobStepsItemsAllOf1Env_8= ruleNormalJobStepsItemsAllOf1Env | this_NormalJobStepsItemsAllOf1Continue_45on_45error_9= ruleNormalJobStepsItemsAllOf1Continue_45on_45error | this_NormalJobStepsItemsAllOf1Timeout_45minutes_10= ruleNormalJobStepsItemsAllOf1Timeout_45minutes )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:152:2: (this_NormalJobStepsItemsAllOf1Id_0= ruleNormalJobStepsItemsAllOf1Id | this_NormalJobStepsItemsAllOf1If_1= ruleNormalJobStepsItemsAllOf1If | this_NormalJobStepsItemsAllOf1Name_2= ruleNormalJobStepsItemsAllOf1Name | this_NormalJobStepsItemsAllOf1Uses_3= ruleNormalJobStepsItemsAllOf1Uses | this_NormalJobStepsItemsAllOf1Run_4= ruleNormalJobStepsItemsAllOf1Run | this_NormalJobStepsItemsAllOf1Working_45directory_5= ruleNormalJobStepsItemsAllOf1Working_45directory | this_NormalJobStepsItemsAllOf1Shell_6= ruleNormalJobStepsItemsAllOf1Shell | this_NormalJobStepsItemsAllOf1With_7= ruleNormalJobStepsItemsAllOf1With | this_NormalJobStepsItemsAllOf1Env_8= ruleNormalJobStepsItemsAllOf1Env | this_NormalJobStepsItemsAllOf1Continue_45on_45error_9= ruleNormalJobStepsItemsAllOf1Continue_45on_45error | this_NormalJobStepsItemsAllOf1Timeout_45minutes_10= ruleNormalJobStepsItemsAllOf1Timeout_45minutes )
            int alt3=11;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:153:3: this_NormalJobStepsItemsAllOf1Id_0= ruleNormalJobStepsItemsAllOf1Id
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1IdParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Id_0=ruleNormalJobStepsItemsAllOf1Id();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Id_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:162:3: this_NormalJobStepsItemsAllOf1If_1= ruleNormalJobStepsItemsAllOf1If
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1IfParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1If_1=ruleNormalJobStepsItemsAllOf1If();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1If_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:171:3: this_NormalJobStepsItemsAllOf1Name_2= ruleNormalJobStepsItemsAllOf1Name
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1NameParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Name_2=ruleNormalJobStepsItemsAllOf1Name();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Name_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:180:3: this_NormalJobStepsItemsAllOf1Uses_3= ruleNormalJobStepsItemsAllOf1Uses
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1UsesParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Uses_3=ruleNormalJobStepsItemsAllOf1Uses();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Uses_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:189:3: this_NormalJobStepsItemsAllOf1Run_4= ruleNormalJobStepsItemsAllOf1Run
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1RunParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Run_4=ruleNormalJobStepsItemsAllOf1Run();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Run_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:198:3: this_NormalJobStepsItemsAllOf1Working_45directory_5= ruleNormalJobStepsItemsAllOf1Working_45directory
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1Working_45directoryParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Working_45directory_5=ruleNormalJobStepsItemsAllOf1Working_45directory();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Working_45directory_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:207:3: this_NormalJobStepsItemsAllOf1Shell_6= ruleNormalJobStepsItemsAllOf1Shell
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1ShellParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Shell_6=ruleNormalJobStepsItemsAllOf1Shell();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Shell_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:216:3: this_NormalJobStepsItemsAllOf1With_7= ruleNormalJobStepsItemsAllOf1With
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1WithParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1With_7=ruleNormalJobStepsItemsAllOf1With();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1With_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:225:3: this_NormalJobStepsItemsAllOf1Env_8= ruleNormalJobStepsItemsAllOf1Env
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1EnvParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Env_8=ruleNormalJobStepsItemsAllOf1Env();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Env_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:234:3: this_NormalJobStepsItemsAllOf1Continue_45on_45error_9= ruleNormalJobStepsItemsAllOf1Continue_45on_45error
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Continue_45on_45error_9=ruleNormalJobStepsItemsAllOf1Continue_45on_45error();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Continue_45on_45error_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:243:3: this_NormalJobStepsItemsAllOf1Timeout_45minutes_10= ruleNormalJobStepsItemsAllOf1Timeout_45minutes
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf1Timeout_45minutesParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Timeout_45minutes_10=ruleNormalJobStepsItemsAllOf1Timeout_45minutes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Timeout_45minutes_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1PropertiesAbstract"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1IfAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:255:1: entryRuleNormalJobStepsItemsAllOf1IfAbstract returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1IfAbstract= ruleNormalJobStepsItemsAllOf1IfAbstract EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1IfAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1IfAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:255:76: (iv_ruleNormalJobStepsItemsAllOf1IfAbstract= ruleNormalJobStepsItemsAllOf1IfAbstract EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:256:2: iv_ruleNormalJobStepsItemsAllOf1IfAbstract= ruleNormalJobStepsItemsAllOf1IfAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1IfAbstract=ruleNormalJobStepsItemsAllOf1IfAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1IfAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1IfAbstract"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1IfAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:262:1: ruleNormalJobStepsItemsAllOf1IfAbstract returns [EObject current=null] : ( ( ( ruleNormalJobStepsItemsAllOf1IfTypeNumber )=>this_NormalJobStepsItemsAllOf1IfTypeNumber_0= ruleNormalJobStepsItemsAllOf1IfTypeNumber ) | this_NormalJobStepsItemsAllOf1IfTypeBoolean_1= ruleNormalJobStepsItemsAllOf1IfTypeBoolean | this_NormalJobStepsItemsAllOf1IfTypeString_2= ruleNormalJobStepsItemsAllOf1IfTypeString ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1IfAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_NormalJobStepsItemsAllOf1IfTypeNumber_0 = null;

        EObject this_NormalJobStepsItemsAllOf1IfTypeBoolean_1 = null;

        EObject this_NormalJobStepsItemsAllOf1IfTypeString_2 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:268:2: ( ( ( ( ruleNormalJobStepsItemsAllOf1IfTypeNumber )=>this_NormalJobStepsItemsAllOf1IfTypeNumber_0= ruleNormalJobStepsItemsAllOf1IfTypeNumber ) | this_NormalJobStepsItemsAllOf1IfTypeBoolean_1= ruleNormalJobStepsItemsAllOf1IfTypeBoolean | this_NormalJobStepsItemsAllOf1IfTypeString_2= ruleNormalJobStepsItemsAllOf1IfTypeString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:269:2: ( ( ( ruleNormalJobStepsItemsAllOf1IfTypeNumber )=>this_NormalJobStepsItemsAllOf1IfTypeNumber_0= ruleNormalJobStepsItemsAllOf1IfTypeNumber ) | this_NormalJobStepsItemsAllOf1IfTypeBoolean_1= ruleNormalJobStepsItemsAllOf1IfTypeBoolean | this_NormalJobStepsItemsAllOf1IfTypeString_2= ruleNormalJobStepsItemsAllOf1IfTypeString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:269:2: ( ( ( ruleNormalJobStepsItemsAllOf1IfTypeNumber )=>this_NormalJobStepsItemsAllOf1IfTypeNumber_0= ruleNormalJobStepsItemsAllOf1IfTypeNumber ) | this_NormalJobStepsItemsAllOf1IfTypeBoolean_1= ruleNormalJobStepsItemsAllOf1IfTypeBoolean | this_NormalJobStepsItemsAllOf1IfTypeString_2= ruleNormalJobStepsItemsAllOf1IfTypeString )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==If) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==Colon) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_E_INT) && (synpred1_InternalNormalJobStepsItemsAllOf1Parser())) {
                        alt4=1;
                    }
                    else if ( (LA4_2==RULE_E_DOUBLE) && (synpred1_InternalNormalJobStepsItemsAllOf1Parser())) {
                        alt4=1;
                    }
                    else if ( (LA4_2==False||LA4_2==True) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_2>=ContinueOnError && LA4_2<=Run)||(LA4_2>=Id && LA4_2<=If)||LA4_2==RULE_STRING) ) {
                        alt4=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:270:3: ( ( ruleNormalJobStepsItemsAllOf1IfTypeNumber )=>this_NormalJobStepsItemsAllOf1IfTypeNumber_0= ruleNormalJobStepsItemsAllOf1IfTypeNumber )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:270:3: ( ( ruleNormalJobStepsItemsAllOf1IfTypeNumber )=>this_NormalJobStepsItemsAllOf1IfTypeNumber_0= ruleNormalJobStepsItemsAllOf1IfTypeNumber )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:271:4: ( ruleNormalJobStepsItemsAllOf1IfTypeNumber )=>this_NormalJobStepsItemsAllOf1IfTypeNumber_0= ruleNormalJobStepsItemsAllOf1IfTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfAbstractAccess().getNormalJobStepsItemsAllOf1IfTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1IfTypeNumber_0=ruleNormalJobStepsItemsAllOf1IfTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_NormalJobStepsItemsAllOf1IfTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:282:3: this_NormalJobStepsItemsAllOf1IfTypeBoolean_1= ruleNormalJobStepsItemsAllOf1IfTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfAbstractAccess().getNormalJobStepsItemsAllOf1IfTypeBooleanParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1IfTypeBoolean_1=ruleNormalJobStepsItemsAllOf1IfTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1IfTypeBoolean_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:291:3: this_NormalJobStepsItemsAllOf1IfTypeString_2= ruleNormalJobStepsItemsAllOf1IfTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfAbstractAccess().getNormalJobStepsItemsAllOf1IfTypeStringParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1IfTypeString_2=ruleNormalJobStepsItemsAllOf1IfTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1IfTypeString_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1IfAbstract"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:303:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:303:95: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:304:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:310:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract returns [EObject current=null] : ( ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber ) | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_1= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_2= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_3= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_4= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_5= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_6= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0 = null;

        EObject this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_1 = null;

        EObject this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_2 = null;

        EObject this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_3 = null;

        EObject this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_4 = null;

        EObject this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_5 = null;

        EObject this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_6 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:316:2: ( ( ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber ) | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_1= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_2= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_3= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_4= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_5= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_6= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:317:2: ( ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber ) | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_1= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_2= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_3= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_4= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_5= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_6= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:317:2: ( ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber ) | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_1= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_2= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_3= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_4= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_5= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_6= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull )
            int alt5=7;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:318:3: ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:318:3: ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:319:4: ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:330:3: this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_1= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_1=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:339:3: this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_2= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_2=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:348:3: this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_3= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_3=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:357:3: this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_4= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_4=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:366:3: this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_5= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_5=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:375:3: this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_6= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_6=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract"


    // $ANTLR start "entryRuleShellAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:387:1: entryRuleShellAbstract returns [EObject current=null] : iv_ruleShellAbstract= ruleShellAbstract EOF ;
    public final EObject entryRuleShellAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:387:54: (iv_ruleShellAbstract= ruleShellAbstract EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:388:2: iv_ruleShellAbstract= ruleShellAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellAbstract=ruleShellAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellAbstract"


    // $ANTLR start "ruleShellAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:394:1: ruleShellAbstract returns [EObject current=null] : ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull ) ;
    public final EObject ruleShellAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ShellTypeNumber_0 = null;

        EObject this_ShellTypeString_1 = null;

        EObject this_ShellTypeInteger_2 = null;

        EObject this_ShellTypeBoolean_3 = null;

        EObject this_ShellTypeObject_4 = null;

        EObject this_ShellTypeArray_5 = null;

        EObject this_ShellTypeNull_6 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:400:2: ( ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:401:2: ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:401:2: ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:402:3: ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:402:3: ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:403:4: ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeNumber_0=ruleShellTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ShellTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:414:3: this_ShellTypeString_1= ruleShellTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeString_1=ruleShellTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:423:3: this_ShellTypeInteger_2= ruleShellTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeInteger_2=ruleShellTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:432:3: this_ShellTypeBoolean_3= ruleShellTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeBoolean_3=ruleShellTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:441:3: this_ShellTypeObject_4= ruleShellTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeObject_4=ruleShellTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:450:3: this_ShellTypeArray_5= ruleShellTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeArray_5=ruleShellTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:459:3: this_ShellTypeNull_6= ruleShellTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getShellAbstractAccess().getShellTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShellTypeNull_6=ruleShellTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShellTypeNull_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellAbstract"


    // $ANTLR start "entryRuleShellPropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:471:1: entryRuleShellPropertiesAbstract returns [EObject current=null] : iv_ruleShellPropertiesAbstract= ruleShellPropertiesAbstract EOF ;
    public final EObject entryRuleShellPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellPropertiesAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:471:64: (iv_ruleShellPropertiesAbstract= ruleShellPropertiesAbstract EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:472:2: iv_ruleShellPropertiesAbstract= ruleShellPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellPropertiesAbstract=ruleShellPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellPropertiesAbstract"


    // $ANTLR start "ruleShellPropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:478:1: ruleShellPropertiesAbstract returns [EObject current=null] : ( ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties ) ;
    public final EObject ruleShellPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ShellAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:484:2: ( ( ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:485:2: ( ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:485:2: ( ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties )
            // InternalNormalJobStepsItemsAllOf1Parser.g:486:3: ( ruleShellAdditionalProperties )=>this_ShellAdditionalProperties_0= ruleShellAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShellPropertiesAbstractAccess().getShellAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ShellAdditionalProperties_0=ruleShellAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShellAdditionalProperties_0;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:499:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:499:46: (iv_ruleValue= ruleValue EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:500:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:506:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_ArrayValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_NumberValue_3 = null;

        EObject this_ObjectValue_4 = null;

        EObject this_BooleanValue_5 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:512:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:513:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:513:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt7=6;
            switch ( input.LA(1) ) {
            case ContinueOnError:
            case WorkingDirectory:
            case TimeoutMinutes:
            case Shell:
            case Name:
            case Uses:
            case With:
            case Env:
            case Run:
            case Id:
            case If:
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt7=2;
                }
                break;
            case Null:
                {
                alt7=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt7=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt7=5;
                }
                break;
            case False:
            case True:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:514:3: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:523:3: this_ArrayValue_1= ruleArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getArrayValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayValue_1=ruleArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:532:3: this_NullValue_2= ruleNullValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getNullValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:541:3: this_NumberValue_3= ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getNumberValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberValue_3=ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:550:3: this_ObjectValue_4= ruleObjectValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getObjectValueParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ObjectValue_4=ruleObjectValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ObjectValue_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:559:3: this_BooleanValue_5= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_5=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValue_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEnvAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:571:1: entryRuleEnvAbstract returns [EObject current=null] : iv_ruleEnvAbstract= ruleEnvAbstract EOF ;
    public final EObject entryRuleEnvAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:571:52: (iv_ruleEnvAbstract= ruleEnvAbstract EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:572:2: iv_ruleEnvAbstract= ruleEnvAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvAbstract=ruleEnvAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvAbstract"


    // $ANTLR start "ruleEnvAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:578:1: ruleEnvAbstract returns [EObject current=null] : ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) ;
    public final EObject ruleEnvAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvTypeNumber_0 = null;

        EObject this_EnvTypeString_1 = null;

        EObject this_EnvTypeInteger_2 = null;

        EObject this_EnvTypeBoolean_3 = null;

        EObject this_EnvTypeObject_4 = null;

        EObject this_EnvTypeArray_5 = null;

        EObject this_EnvTypeNull_6 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:584:2: ( ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:585:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:585:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            int alt8=7;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:586:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:586:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:587:4: ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeNumber_0=ruleEnvTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_EnvTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:598:3: this_EnvTypeString_1= ruleEnvTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeString_1=ruleEnvTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:607:3: this_EnvTypeInteger_2= ruleEnvTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeInteger_2=ruleEnvTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:616:3: this_EnvTypeBoolean_3= ruleEnvTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeBoolean_3=ruleEnvTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:625:3: this_EnvTypeObject_4= ruleEnvTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeObject_4=ruleEnvTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:634:3: this_EnvTypeArray_5= ruleEnvTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeArray_5=ruleEnvTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:643:3: this_EnvTypeNull_6= ruleEnvTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnvAbstractAccess().getEnvTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnvTypeNull_6=ruleEnvTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnvTypeNull_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvAbstract"


    // $ANTLR start "entryRuleEnvPropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:655:1: entryRuleEnvPropertiesAbstract returns [EObject current=null] : iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF ;
    public final EObject entryRuleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvPropertiesAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:655:62: (iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:656:2: iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvPropertiesAbstract=ruleEnvPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvPropertiesAbstract"


    // $ANTLR start "ruleEnvPropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:662:1: ruleEnvPropertiesAbstract returns [EObject current=null] : ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) ;
    public final EObject ruleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:668:2: ( ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:669:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:669:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            // InternalNormalJobStepsItemsAllOf1Parser.g:670:3: ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEnvPropertiesAbstractAccess().getEnvAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_EnvAdditionalProperties_0=ruleEnvAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EnvAdditionalProperties_0;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvPropertiesAbstract"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:683:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:683:105: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:684:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf1Parser.g:690:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract returns [EObject current=null] : ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:696:2: ( ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:697:2: ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:697:2: ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties )
            // InternalNormalJobStepsItemsAllOf1Parser.g:698:3: ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_0=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_0;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Id"
    // InternalNormalJobStepsItemsAllOf1Parser.g:711:1: entryRuleNormalJobStepsItemsAllOf1Id returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Id= ruleNormalJobStepsItemsAllOf1Id EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Id() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Id = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:711:68: (iv_ruleNormalJobStepsItemsAllOf1Id= ruleNormalJobStepsItemsAllOf1Id EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:712:2: iv_ruleNormalJobStepsItemsAllOf1Id= ruleNormalJobStepsItemsAllOf1Id EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Id=ruleNormalJobStepsItemsAllOf1Id();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Id; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Id"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Id"
    // InternalNormalJobStepsItemsAllOf1Parser.g:718:1: ruleNormalJobStepsItemsAllOf1Id returns [EObject current=null] : (otherlv_0= Id otherlv_1= Colon ( (lv_id_2_0= ruleEString ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Id() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:724:2: ( (otherlv_0= Id otherlv_1= Colon ( (lv_id_2_0= ruleEString ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:725:2: (otherlv_0= Id otherlv_1= Colon ( (lv_id_2_0= ruleEString ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:725:2: (otherlv_0= Id otherlv_1= Colon ( (lv_id_2_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:726:3: otherlv_0= Id otherlv_1= Colon ( (lv_id_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Id,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1IdAccess().getIdKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1IdAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:734:3: ( (lv_id_2_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:735:4: (lv_id_2_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:735:4: (lv_id_2_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:736:5: lv_id_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IdAccess().getIdEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_id_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1IdRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Id"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1If"
    // InternalNormalJobStepsItemsAllOf1Parser.g:757:1: entryRuleNormalJobStepsItemsAllOf1If returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1If= ruleNormalJobStepsItemsAllOf1If EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1If() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1If = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:757:68: (iv_ruleNormalJobStepsItemsAllOf1If= ruleNormalJobStepsItemsAllOf1If EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:758:2: iv_ruleNormalJobStepsItemsAllOf1If= ruleNormalJobStepsItemsAllOf1If EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1If=ruleNormalJobStepsItemsAllOf1If();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1If; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1If"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1If"
    // InternalNormalJobStepsItemsAllOf1Parser.g:764:1: ruleNormalJobStepsItemsAllOf1If returns [EObject current=null] : ( (lv_if__0_0= ruleNormalJobStepsItemsAllOf1IfAbstract ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1If() throws RecognitionException {
        EObject current = null;

        EObject lv_if__0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:770:2: ( ( (lv_if__0_0= ruleNormalJobStepsItemsAllOf1IfAbstract ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:771:2: ( (lv_if__0_0= ruleNormalJobStepsItemsAllOf1IfAbstract ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:771:2: ( (lv_if__0_0= ruleNormalJobStepsItemsAllOf1IfAbstract ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:772:3: (lv_if__0_0= ruleNormalJobStepsItemsAllOf1IfAbstract )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:772:3: (lv_if__0_0= ruleNormalJobStepsItemsAllOf1IfAbstract )
            // InternalNormalJobStepsItemsAllOf1Parser.g:773:4: lv_if__0_0= ruleNormalJobStepsItemsAllOf1IfAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfAccess().getIf_NormalJobStepsItemsAllOf1IfAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_if__0_0=ruleNormalJobStepsItemsAllOf1IfAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1IfRule());
              				}
              				set(
              					current,
              					"if_",
              					lv_if__0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.NormalJobStepsItemsAllOf1IfAbstract");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1If"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Name"
    // InternalNormalJobStepsItemsAllOf1Parser.g:793:1: entryRuleNormalJobStepsItemsAllOf1Name returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Name= ruleNormalJobStepsItemsAllOf1Name EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Name() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Name = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:793:70: (iv_ruleNormalJobStepsItemsAllOf1Name= ruleNormalJobStepsItemsAllOf1Name EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:794:2: iv_ruleNormalJobStepsItemsAllOf1Name= ruleNormalJobStepsItemsAllOf1Name EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1NameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Name=ruleNormalJobStepsItemsAllOf1Name();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Name; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Name"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Name"
    // InternalNormalJobStepsItemsAllOf1Parser.g:800:1: ruleNormalJobStepsItemsAllOf1Name returns [EObject current=null] : ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Name() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:806:2: ( ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:807:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:807:2: ( () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:808:3: () otherlv_1= Name otherlv_2= Colon ( (lv_name_3_0= ruleEString ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:808:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:809:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNormalJobStepsItemsAllOf1NameAccess().getNormalJobStepsItemsAllOf1NameAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Name,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1NameAccess().getNameKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNormalJobStepsItemsAllOf1NameAccess().getColonKeyword_2());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:823:3: ( (lv_name_3_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:824:4: (lv_name_3_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:824:4: (lv_name_3_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:825:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1NameAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1NameRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Name"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Uses"
    // InternalNormalJobStepsItemsAllOf1Parser.g:846:1: entryRuleNormalJobStepsItemsAllOf1Uses returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Uses= ruleNormalJobStepsItemsAllOf1Uses EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Uses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Uses = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:846:70: (iv_ruleNormalJobStepsItemsAllOf1Uses= ruleNormalJobStepsItemsAllOf1Uses EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:847:2: iv_ruleNormalJobStepsItemsAllOf1Uses= ruleNormalJobStepsItemsAllOf1Uses EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1UsesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Uses=ruleNormalJobStepsItemsAllOf1Uses();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Uses; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Uses"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Uses"
    // InternalNormalJobStepsItemsAllOf1Parser.g:853:1: ruleNormalJobStepsItemsAllOf1Uses returns [EObject current=null] : (otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Uses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_uses_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:859:2: ( (otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:860:2: (otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:860:2: (otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:861:3: otherlv_0= Uses otherlv_1= Colon ( (lv_uses_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Uses,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1UsesAccess().getUsesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1UsesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:869:3: ( (lv_uses_2_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:870:4: (lv_uses_2_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:870:4: (lv_uses_2_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:871:5: lv_uses_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1UsesAccess().getUsesEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_uses_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1UsesRule());
              					}
              					set(
              						current,
              						"uses",
              						lv_uses_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Uses"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Run"
    // InternalNormalJobStepsItemsAllOf1Parser.g:892:1: entryRuleNormalJobStepsItemsAllOf1Run returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Run= ruleNormalJobStepsItemsAllOf1Run EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Run() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Run = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:892:69: (iv_ruleNormalJobStepsItemsAllOf1Run= ruleNormalJobStepsItemsAllOf1Run EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:893:2: iv_ruleNormalJobStepsItemsAllOf1Run= ruleNormalJobStepsItemsAllOf1Run EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1RunRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Run=ruleNormalJobStepsItemsAllOf1Run();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Run; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Run"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Run"
    // InternalNormalJobStepsItemsAllOf1Parser.g:899:1: ruleNormalJobStepsItemsAllOf1Run returns [EObject current=null] : (otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Run() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_run_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:905:2: ( (otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:906:2: (otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:906:2: (otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:907:3: otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Run,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1RunAccess().getRunKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1RunAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:915:3: ( (lv_run_2_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:916:4: (lv_run_2_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:916:4: (lv_run_2_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:917:5: lv_run_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1RunAccess().getRunEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_run_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1RunRule());
              					}
              					set(
              						current,
              						"run",
              						lv_run_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Run"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Working_45directory"
    // InternalNormalJobStepsItemsAllOf1Parser.g:938:1: entryRuleNormalJobStepsItemsAllOf1Working_45directory returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Working_45directory= ruleNormalJobStepsItemsAllOf1Working_45directory EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Working_45directory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Working_45directory = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:938:85: (iv_ruleNormalJobStepsItemsAllOf1Working_45directory= ruleNormalJobStepsItemsAllOf1Working_45directory EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:939:2: iv_ruleNormalJobStepsItemsAllOf1Working_45directory= ruleNormalJobStepsItemsAllOf1Working_45directory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Working_45directoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Working_45directory=ruleNormalJobStepsItemsAllOf1Working_45directory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Working_45directory; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Working_45directory"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Working_45directory"
    // InternalNormalJobStepsItemsAllOf1Parser.g:945:1: ruleNormalJobStepsItemsAllOf1Working_45directory returns [EObject current=null] : (otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Working_45directory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_working_45directory_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:951:2: ( (otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:952:2: (otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:952:2: (otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:953:3: otherlv_0= WorkingDirectory otherlv_1= Colon ( (lv_working_45directory_2_0= ruleWorking_45directory ) )
            {
            otherlv_0=(Token)match(input,WorkingDirectory,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1Working_45directoryAccess().getWorkingDirectoryKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Working_45directoryAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:961:3: ( (lv_working_45directory_2_0= ruleWorking_45directory ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:962:4: (lv_working_45directory_2_0= ruleWorking_45directory )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:962:4: (lv_working_45directory_2_0= ruleWorking_45directory )
            // InternalNormalJobStepsItemsAllOf1Parser.g:963:5: lv_working_45directory_2_0= ruleWorking_45directory
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Working_45directoryAccess().getWorking_45directoryWorking_45directoryParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_working_45directory_2_0=ruleWorking_45directory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Working_45directoryRule());
              					}
              					set(
              						current,
              						"working_45directory",
              						lv_working_45directory_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.Working_45directory");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Working_45directory"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Shell"
    // InternalNormalJobStepsItemsAllOf1Parser.g:984:1: entryRuleNormalJobStepsItemsAllOf1Shell returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Shell= ruleNormalJobStepsItemsAllOf1Shell EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Shell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Shell = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:984:71: (iv_ruleNormalJobStepsItemsAllOf1Shell= ruleNormalJobStepsItemsAllOf1Shell EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:985:2: iv_ruleNormalJobStepsItemsAllOf1Shell= ruleNormalJobStepsItemsAllOf1Shell EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1ShellRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Shell=ruleNormalJobStepsItemsAllOf1Shell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Shell; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Shell"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Shell"
    // InternalNormalJobStepsItemsAllOf1Parser.g:991:1: ruleNormalJobStepsItemsAllOf1Shell returns [EObject current=null] : (otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Shell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_shell_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:997:2: ( (otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:998:2: (otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:998:2: (otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:999:3: otherlv_0= Shell otherlv_1= Colon ( (lv_shell_2_0= ruleShell ) )
            {
            otherlv_0=(Token)match(input,Shell,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1ShellAccess().getShellKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1ShellAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1007:3: ( (lv_shell_2_0= ruleShell ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1008:4: (lv_shell_2_0= ruleShell )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1008:4: (lv_shell_2_0= ruleShell )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1009:5: lv_shell_2_0= ruleShell
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1ShellAccess().getShellShellParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_shell_2_0=ruleShell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1ShellRule());
              					}
              					set(
              						current,
              						"shell",
              						lv_shell_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.Shell");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Shell"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1With"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1030:1: entryRuleNormalJobStepsItemsAllOf1With returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1With= ruleNormalJobStepsItemsAllOf1With EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1With() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1With = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1030:70: (iv_ruleNormalJobStepsItemsAllOf1With= ruleNormalJobStepsItemsAllOf1With EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1031:2: iv_ruleNormalJobStepsItemsAllOf1With= ruleNormalJobStepsItemsAllOf1With EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1WithRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1With=ruleNormalJobStepsItemsAllOf1With();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1With; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1With"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1With"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1037:1: ruleNormalJobStepsItemsAllOf1With returns [EObject current=null] : (otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1With() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_with_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1043:2: ( (otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1044:2: (otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1044:2: (otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1045:3: otherlv_0= With otherlv_1= Colon ( (lv_with_2_0= ruleEnv ) )
            {
            otherlv_0=(Token)match(input,With,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1WithAccess().getWithKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1WithAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1053:3: ( (lv_with_2_0= ruleEnv ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1054:4: (lv_with_2_0= ruleEnv )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1054:4: (lv_with_2_0= ruleEnv )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1055:5: lv_with_2_0= ruleEnv
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1WithAccess().getWithEnvParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_with_2_0=ruleEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1WithRule());
              					}
              					set(
              						current,
              						"with",
              						lv_with_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.Env");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1With"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Env"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1076:1: entryRuleNormalJobStepsItemsAllOf1Env returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Env= ruleNormalJobStepsItemsAllOf1Env EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Env() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Env = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1076:69: (iv_ruleNormalJobStepsItemsAllOf1Env= ruleNormalJobStepsItemsAllOf1Env EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1077:2: iv_ruleNormalJobStepsItemsAllOf1Env= ruleNormalJobStepsItemsAllOf1Env EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1EnvRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Env=ruleNormalJobStepsItemsAllOf1Env();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Env; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Env"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Env"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1083:1: ruleNormalJobStepsItemsAllOf1Env returns [EObject current=null] : (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Env() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_env_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1089:2: ( (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1090:2: (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1090:2: (otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1091:3: otherlv_0= Env otherlv_1= Colon ( (lv_env_2_0= ruleEnv ) )
            {
            otherlv_0=(Token)match(input,Env,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1EnvAccess().getEnvKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1EnvAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1099:3: ( (lv_env_2_0= ruleEnv ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1100:4: (lv_env_2_0= ruleEnv )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1100:4: (lv_env_2_0= ruleEnv )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1101:5: lv_env_2_0= ruleEnv
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1EnvAccess().getEnvEnvParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_env_2_0=ruleEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1EnvRule());
              					}
              					set(
              						current,
              						"env",
              						lv_env_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.Env");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Env"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45error"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1122:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45error returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45error= ruleNormalJobStepsItemsAllOf1Continue_45on_45error EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45error() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45error = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1122:87: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45error= ruleNormalJobStepsItemsAllOf1Continue_45on_45error EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1123:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45error= ruleNormalJobStepsItemsAllOf1Continue_45on_45error EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45error=ruleNormalJobStepsItemsAllOf1Continue_45on_45error();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45error; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45error"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45error"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1129:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45error returns [EObject current=null] : ( (lv_continue_45on_45error_0_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45error() throws RecognitionException {
        EObject current = null;

        EObject lv_continue_45on_45error_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1135:2: ( ( (lv_continue_45on_45error_0_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1136:2: ( (lv_continue_45on_45error_0_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1136:2: ( (lv_continue_45on_45error_0_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1137:3: (lv_continue_45on_45error_0_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1137:3: (lv_continue_45on_45error_0_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1138:4: lv_continue_45on_45error_0_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAccess().getContinue_45on_45errorNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_continue_45on_45error_0_0=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorRule());
              				}
              				set(
              					current,
              					"continue_45on_45error",
              					lv_continue_45on_45error_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45error"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Timeout_45minutes"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1158:1: entryRuleNormalJobStepsItemsAllOf1Timeout_45minutes returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Timeout_45minutes= ruleNormalJobStepsItemsAllOf1Timeout_45minutes EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Timeout_45minutes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Timeout_45minutes = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1158:83: (iv_ruleNormalJobStepsItemsAllOf1Timeout_45minutes= ruleNormalJobStepsItemsAllOf1Timeout_45minutes EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1159:2: iv_ruleNormalJobStepsItemsAllOf1Timeout_45minutes= ruleNormalJobStepsItemsAllOf1Timeout_45minutes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Timeout_45minutesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Timeout_45minutes=ruleNormalJobStepsItemsAllOf1Timeout_45minutes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Timeout_45minutes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Timeout_45minutes"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Timeout_45minutes"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1165:1: ruleNormalJobStepsItemsAllOf1Timeout_45minutes returns [EObject current=null] : (otherlv_0= TimeoutMinutes otherlv_1= Colon ( (lv_timeout_45minutes_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Timeout_45minutes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_timeout_45minutes_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1171:2: ( (otherlv_0= TimeoutMinutes otherlv_1= Colon ( (lv_timeout_45minutes_2_0= ruleEDoubleObject ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1172:2: (otherlv_0= TimeoutMinutes otherlv_1= Colon ( (lv_timeout_45minutes_2_0= ruleEDoubleObject ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1172:2: (otherlv_0= TimeoutMinutes otherlv_1= Colon ( (lv_timeout_45minutes_2_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1173:3: otherlv_0= TimeoutMinutes otherlv_1= Colon ( (lv_timeout_45minutes_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,TimeoutMinutes,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1Timeout_45minutesAccess().getTimeoutMinutesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Timeout_45minutesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1181:3: ( (lv_timeout_45minutes_2_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1182:4: (lv_timeout_45minutes_2_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1182:4: (lv_timeout_45minutes_2_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1183:5: lv_timeout_45minutes_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Timeout_45minutesAccess().getTimeout_45minutesEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_timeout_45minutes_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Timeout_45minutesRule());
              					}
              					set(
              						current,
              						"timeout_45minutes",
              						lv_timeout_45minutes_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EDoubleObject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Timeout_45minutes"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1204:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1204:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1205:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalNormalJobStepsItemsAllOf1Parser.g:1211:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1217:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1218:2: this_VALID_STRING_0= ruleVALID_STRING
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEStringAccess().getVALID_STRINGParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_VALID_STRING_0=ruleVALID_STRING();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VALID_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1IfTypeBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1231:1: entryRuleNormalJobStepsItemsAllOf1IfTypeBoolean returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1IfTypeBoolean= ruleNormalJobStepsItemsAllOf1IfTypeBoolean EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1IfTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1IfTypeBoolean = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1231:79: (iv_ruleNormalJobStepsItemsAllOf1IfTypeBoolean= ruleNormalJobStepsItemsAllOf1IfTypeBoolean EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1232:2: iv_ruleNormalJobStepsItemsAllOf1IfTypeBoolean= ruleNormalJobStepsItemsAllOf1IfTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1IfTypeBoolean=ruleNormalJobStepsItemsAllOf1IfTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1IfTypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1IfTypeBoolean"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1IfTypeBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1238:1: ruleNormalJobStepsItemsAllOf1IfTypeBoolean returns [EObject current=null] : (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1IfTypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_if__2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1244:2: ( (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1245:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1245:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1246:3: otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1IfTypeBooleanAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1IfTypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1254:3: ( (lv_if__2_0= ruleEBooleanObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1255:4: (lv_if__2_0= ruleEBooleanObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1255:4: (lv_if__2_0= ruleEBooleanObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1256:5: lv_if__2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfTypeBooleanAccess().getIf_EBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_if__2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1IfTypeBooleanRule());
              					}
              					set(
              						current,
              						"if_",
              						lv_if__2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EBooleanObject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1IfTypeBoolean"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1IfTypeNumber"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1277:1: entryRuleNormalJobStepsItemsAllOf1IfTypeNumber returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1IfTypeNumber= ruleNormalJobStepsItemsAllOf1IfTypeNumber EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1IfTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1IfTypeNumber = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1277:78: (iv_ruleNormalJobStepsItemsAllOf1IfTypeNumber= ruleNormalJobStepsItemsAllOf1IfTypeNumber EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1278:2: iv_ruleNormalJobStepsItemsAllOf1IfTypeNumber= ruleNormalJobStepsItemsAllOf1IfTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1IfTypeNumber=ruleNormalJobStepsItemsAllOf1IfTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1IfTypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1IfTypeNumber"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1IfTypeNumber"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1284:1: ruleNormalJobStepsItemsAllOf1IfTypeNumber returns [EObject current=null] : (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1IfTypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_if__2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1290:2: ( (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1291:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1291:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1292:3: otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1IfTypeNumberAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1IfTypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1300:3: ( (lv_if__2_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1301:4: (lv_if__2_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1301:4: (lv_if__2_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1302:5: lv_if__2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfTypeNumberAccess().getIf_EDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_if__2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1IfTypeNumberRule());
              					}
              					set(
              						current,
              						"if_",
              						lv_if__2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EDoubleObject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1IfTypeNumber"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1IfTypeString"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1323:1: entryRuleNormalJobStepsItemsAllOf1IfTypeString returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1IfTypeString= ruleNormalJobStepsItemsAllOf1IfTypeString EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1IfTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1IfTypeString = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1323:78: (iv_ruleNormalJobStepsItemsAllOf1IfTypeString= ruleNormalJobStepsItemsAllOf1IfTypeString EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1324:2: iv_ruleNormalJobStepsItemsAllOf1IfTypeString= ruleNormalJobStepsItemsAllOf1IfTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1IfTypeString=ruleNormalJobStepsItemsAllOf1IfTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1IfTypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1IfTypeString"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1IfTypeString"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1330:1: ruleNormalJobStepsItemsAllOf1IfTypeString returns [EObject current=null] : (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1IfTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_if__2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1336:2: ( (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1337:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1337:2: (otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1338:3: otherlv_0= If otherlv_1= Colon ( (lv_if__2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,If,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1IfTypeStringAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1IfTypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1346:3: ( (lv_if__2_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1347:4: (lv_if__2_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1347:4: (lv_if__2_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1348:5: lv_if__2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1IfTypeStringAccess().getIf_EStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_if__2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1IfTypeStringRule());
              					}
              					set(
              						current,
              						"if_",
              						lv_if__2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1IfTypeString"


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1369:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1369:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1370:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBooleanObject=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBooleanObject.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalNormalJobStepsItemsAllOf1Parser.g:1376:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1382:2: ( (kw= True | kw= False ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1383:2: (kw= True | kw= False )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1383:2: (kw= True | kw= False )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==True) ) {
                alt9=1;
            }
            else if ( (LA9_0==False) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1384:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1390:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEBooleanObject"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1399:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1399:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1400:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDoubleObject.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1406:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1412:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1413:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1413:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_E_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_E_DOUBLE) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1414:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_E_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleObjectAccess().getE_INTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1422:3: this_E_DOUBLE_1= RULE_E_DOUBLE
                    {
                    this_E_DOUBLE_1=(Token)match(input,RULE_E_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_E_DOUBLE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleObjectAccess().getE_DOUBLETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "entryRuleWorking_45directory"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1433:1: entryRuleWorking_45directory returns [EObject current=null] : iv_ruleWorking_45directory= ruleWorking_45directory EOF ;
    public final EObject entryRuleWorking_45directory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorking_45directory = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1433:60: (iv_ruleWorking_45directory= ruleWorking_45directory EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1434:2: iv_ruleWorking_45directory= ruleWorking_45directory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorking_45directoryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWorking_45directory=ruleWorking_45directory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorking_45directory; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWorking_45directory"


    // $ANTLR start "ruleWorking_45directory"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1440:1: ruleWorking_45directory returns [EObject current=null] : ( (lv_working_45directory_0_0= ruleEString ) ) ;
    public final EObject ruleWorking_45directory() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_working_45directory_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1446:2: ( ( (lv_working_45directory_0_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1447:2: ( (lv_working_45directory_0_0= ruleEString ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1447:2: ( (lv_working_45directory_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1448:3: (lv_working_45directory_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1448:3: (lv_working_45directory_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1449:4: lv_working_45directory_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getWorking_45directoryAccess().getWorking_45directoryEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_working_45directory_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getWorking_45directoryRule());
              				}
              				set(
              					current,
              					"working_45directory",
              					lv_working_45directory_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWorking_45directory"


    // $ANTLR start "entryRuleShell"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1469:1: entryRuleShell returns [EObject current=null] : iv_ruleShell= ruleShell EOF ;
    public final EObject entryRuleShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShell = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1469:46: (iv_ruleShell= ruleShell EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1470:2: iv_ruleShell= ruleShell EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShell=ruleShell();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShell; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShell"


    // $ANTLR start "ruleShell"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1476:1: ruleShell returns [EObject current=null] : ( (lv_shell_0_0= ruleShellAbstract ) ) ;
    public final EObject ruleShell() throws RecognitionException {
        EObject current = null;

        EObject lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1482:2: ( ( (lv_shell_0_0= ruleShellAbstract ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1483:2: ( (lv_shell_0_0= ruleShellAbstract ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1483:2: ( (lv_shell_0_0= ruleShellAbstract ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1484:3: (lv_shell_0_0= ruleShellAbstract )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1484:3: (lv_shell_0_0= ruleShellAbstract )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1485:4: lv_shell_0_0= ruleShellAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellAccess().getShellShellAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleShellAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.ShellAbstract");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShell"


    // $ANTLR start "entryRuleShellTypeString"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1505:1: entryRuleShellTypeString returns [EObject current=null] : iv_ruleShellTypeString= ruleShellTypeString EOF ;
    public final EObject entryRuleShellTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeString = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1505:56: (iv_ruleShellTypeString= ruleShellTypeString EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1506:2: iv_ruleShellTypeString= ruleShellTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeString=ruleShellTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellTypeString"


    // $ANTLR start "ruleShellTypeString"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1512:1: ruleShellTypeString returns [EObject current=null] : ( (lv_shell_0_0= ruleEString ) ) ;
    public final EObject ruleShellTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1518:2: ( ( (lv_shell_0_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1519:2: ( (lv_shell_0_0= ruleEString ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1519:2: ( (lv_shell_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1520:3: (lv_shell_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1520:3: (lv_shell_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1521:4: lv_shell_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeStringAccess().getShellEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeStringRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellTypeString"


    // $ANTLR start "entryRuleShellTypeInteger"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1541:1: entryRuleShellTypeInteger returns [EObject current=null] : iv_ruleShellTypeInteger= ruleShellTypeInteger EOF ;
    public final EObject entryRuleShellTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeInteger = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1541:57: (iv_ruleShellTypeInteger= ruleShellTypeInteger EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1542:2: iv_ruleShellTypeInteger= ruleShellTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeInteger=ruleShellTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellTypeInteger"


    // $ANTLR start "ruleShellTypeInteger"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1548:1: ruleShellTypeInteger returns [EObject current=null] : ( (lv_shell_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleShellTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1554:2: ( ( (lv_shell_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1555:2: ( (lv_shell_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1555:2: ( (lv_shell_0_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1556:3: (lv_shell_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1556:3: (lv_shell_0_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1557:4: lv_shell_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeIntegerAccess().getShellEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeIntegerRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EDoubleObject");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellTypeInteger"


    // $ANTLR start "entryRuleShellTypeNumber"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1577:1: entryRuleShellTypeNumber returns [EObject current=null] : iv_ruleShellTypeNumber= ruleShellTypeNumber EOF ;
    public final EObject entryRuleShellTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeNumber = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1577:56: (iv_ruleShellTypeNumber= ruleShellTypeNumber EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1578:2: iv_ruleShellTypeNumber= ruleShellTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeNumber=ruleShellTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellTypeNumber"


    // $ANTLR start "ruleShellTypeNumber"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1584:1: ruleShellTypeNumber returns [EObject current=null] : ( (lv_shell_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleShellTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1590:2: ( ( (lv_shell_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1591:2: ( (lv_shell_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1591:2: ( (lv_shell_0_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1592:3: (lv_shell_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1592:3: (lv_shell_0_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1593:4: lv_shell_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeNumberAccess().getShellEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeNumberRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EDoubleObject");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellTypeNumber"


    // $ANTLR start "entryRuleShellTypeBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1613:1: entryRuleShellTypeBoolean returns [EObject current=null] : iv_ruleShellTypeBoolean= ruleShellTypeBoolean EOF ;
    public final EObject entryRuleShellTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeBoolean = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1613:57: (iv_ruleShellTypeBoolean= ruleShellTypeBoolean EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1614:2: iv_ruleShellTypeBoolean= ruleShellTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeBoolean=ruleShellTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellTypeBoolean"


    // $ANTLR start "ruleShellTypeBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1620:1: ruleShellTypeBoolean returns [EObject current=null] : ( (lv_shell_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleShellTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1626:2: ( ( (lv_shell_0_0= ruleEBooleanObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1627:2: ( (lv_shell_0_0= ruleEBooleanObject ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1627:2: ( (lv_shell_0_0= ruleEBooleanObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1628:3: (lv_shell_0_0= ruleEBooleanObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1628:3: (lv_shell_0_0= ruleEBooleanObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1629:4: lv_shell_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeBooleanAccess().getShellEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeBooleanRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EBooleanObject");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellTypeBoolean"


    // $ANTLR start "entryRuleShellTypeObject"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1649:1: entryRuleShellTypeObject returns [EObject current=null] : iv_ruleShellTypeObject= ruleShellTypeObject EOF ;
    public final EObject entryRuleShellTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeObject = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1649:56: (iv_ruleShellTypeObject= ruleShellTypeObject EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1650:2: iv_ruleShellTypeObject= ruleShellTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeObject=ruleShellTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellTypeObject"


    // $ANTLR start "ruleShellTypeObject"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1656:1: ruleShellTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleShellTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_shell_2_0 = null;

        EObject lv_shell_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1662:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1663:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1663:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1664:3: () otherlv_1= LeftCurlyBracket ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1664:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:1665:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getShellTypeObjectAccess().getShellTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShellTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1675:3: ( ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=ContinueOnError && LA12_0<=Run)||(LA12_0>=Id && LA12_0<=If)||LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1676:4: ( (lv_shell_2_0= ruleShellPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1676:4: ( (lv_shell_2_0= ruleShellPropertiesAbstract ) )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1677:5: (lv_shell_2_0= ruleShellPropertiesAbstract )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1677:5: (lv_shell_2_0= ruleShellPropertiesAbstract )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1678:6: lv_shell_2_0= ruleShellPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShellTypeObjectAccess().getShellShellPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_shell_2_0=ruleShellPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShellTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"shell",
                      							lv_shell_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf1.ShellPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf1Parser.g:1695:4: (otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1696:5: otherlv_3= Comma ( (lv_shell_4_0= ruleShellPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getShellTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1700:5: ( (lv_shell_4_0= ruleShellPropertiesAbstract ) )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1701:6: (lv_shell_4_0= ruleShellPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1701:6: (lv_shell_4_0= ruleShellPropertiesAbstract )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1702:7: lv_shell_4_0= ruleShellPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShellTypeObjectAccess().getShellShellPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_shell_4_0=ruleShellPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getShellTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"shell",
                    	      								lv_shell_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf1.ShellPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getShellTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellTypeObject"


    // $ANTLR start "entryRuleShellTypeArray"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1729:1: entryRuleShellTypeArray returns [EObject current=null] : iv_ruleShellTypeArray= ruleShellTypeArray EOF ;
    public final EObject entryRuleShellTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeArray = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1729:55: (iv_ruleShellTypeArray= ruleShellTypeArray EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1730:2: iv_ruleShellTypeArray= ruleShellTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeArray=ruleShellTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellTypeArray"


    // $ANTLR start "ruleShellTypeArray"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1736:1: ruleShellTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleShellTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_shell_2_0 = null;

        EObject lv_shell_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1742:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1743:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1743:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1744:3: () otherlv_1= LeftSquareBracket ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1744:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:1745:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getShellTypeArrayAccess().getShellTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShellTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1755:3: ( ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=ContinueOnError && LA14_0<=True)||LA14_0==LeftSquareBracket||LA14_0==LeftCurlyBracket||(LA14_0>=RULE_STRING && LA14_0<=RULE_E_DOUBLE)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1756:4: ( (lv_shell_2_0= ruleShellItems ) ) (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1756:4: ( (lv_shell_2_0= ruleShellItems ) )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1757:5: (lv_shell_2_0= ruleShellItems )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1757:5: (lv_shell_2_0= ruleShellItems )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:1758:6: lv_shell_2_0= ruleShellItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShellTypeArrayAccess().getShellShellItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_shell_2_0=ruleShellItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getShellTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"shell",
                      							lv_shell_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf1.ShellItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf1Parser.g:1775:4: (otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1776:5: otherlv_3= Comma ( (lv_shell_4_0= ruleShellItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getShellTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1780:5: ( (lv_shell_4_0= ruleShellItems ) )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1781:6: (lv_shell_4_0= ruleShellItems )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1781:6: (lv_shell_4_0= ruleShellItems )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:1782:7: lv_shell_4_0= ruleShellItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShellTypeArrayAccess().getShellShellItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_shell_4_0=ruleShellItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getShellTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"shell",
                    	      								lv_shell_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf1.ShellItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getShellTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellTypeArray"


    // $ANTLR start "entryRuleShellTypeNull"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1809:1: entryRuleShellTypeNull returns [EObject current=null] : iv_ruleShellTypeNull= ruleShellTypeNull EOF ;
    public final EObject entryRuleShellTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellTypeNull = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1809:54: (iv_ruleShellTypeNull= ruleShellTypeNull EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1810:2: iv_ruleShellTypeNull= ruleShellTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellTypeNull=ruleShellTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellTypeNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellTypeNull"


    // $ANTLR start "ruleShellTypeNull"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1816:1: ruleShellTypeNull returns [EObject current=null] : ( (lv_shell_0_0= ruleNullValue ) ) ;
    public final EObject ruleShellTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_shell_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1822:2: ( ( (lv_shell_0_0= ruleNullValue ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1823:2: ( (lv_shell_0_0= ruleNullValue ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1823:2: ( (lv_shell_0_0= ruleNullValue ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1824:3: (lv_shell_0_0= ruleNullValue )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1824:3: (lv_shell_0_0= ruleNullValue )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1825:4: lv_shell_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellTypeNullAccess().getShellNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_shell_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellTypeNullRule());
              				}
              				set(
              					current,
              					"shell",
              					lv_shell_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.NullValue");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellTypeNull"


    // $ANTLR start "entryRuleShellAdditionalProperties"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1845:1: entryRuleShellAdditionalProperties returns [EObject current=null] : iv_ruleShellAdditionalProperties= ruleShellAdditionalProperties EOF ;
    public final EObject entryRuleShellAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellAdditionalProperties = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1845:66: (iv_ruleShellAdditionalProperties= ruleShellAdditionalProperties EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1846:2: iv_ruleShellAdditionalProperties= ruleShellAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellAdditionalProperties=ruleShellAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellAdditionalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellAdditionalProperties"


    // $ANTLR start "ruleShellAdditionalProperties"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1852:1: ruleShellAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleShellAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1858:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1859:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1859:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1860:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1860:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1861:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1861:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1862:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getShellAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getShellAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getShellAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:1883:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1884:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1884:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1885:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getShellAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getShellAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.JsonDocument");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1906:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1906:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1907:2: iv_ruleJsonDocument= ruleJsonDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJsonDocument=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonDocument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJsonDocument"


    // $ANTLR start "ruleJsonDocument"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1913:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1919:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1920:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1920:2: ( (lv_value_0_0= ruleValue ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1921:3: (lv_value_0_0= ruleValue )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1921:3: (lv_value_0_0= ruleValue )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1922:4: lv_value_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getJsonDocumentAccess().getValueValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getJsonDocumentRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.Value");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJsonDocument"


    // $ANTLR start "entryRuleStringValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1942:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1942:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1943:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1949:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1955:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1956:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1956:2: ( (lv_value_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1957:3: (lv_value_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1957:3: (lv_value_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1958:4: lv_value_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getStringValueRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1978:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1978:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1979:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:1985:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1991:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1992:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1992:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobStepsItemsAllOf1Parser.g:1993:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:1993:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:1994:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:2004:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=ContinueOnError && LA16_0<=True)||LA16_0==LeftSquareBracket||LA16_0==LeftCurlyBracket||(LA16_0>=RULE_STRING && LA16_0<=RULE_E_DOUBLE)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2005:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2005:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2006:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2006:5: (lv_value_2_0= ruleValue )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2007:6: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_value_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArrayValueRule());
                      						}
                      						add(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf1.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf1Parser.g:2024:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Comma) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2025:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2029:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2030:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2030:6: (lv_value_4_0= ruleValue )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2031:7: lv_value_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_value_4_0=ruleValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"value",
                    	      								lv_value_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf1.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2058:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2058:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2059:2: iv_ruleNullValue= ruleNullValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2065:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2071:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2072:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2072:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2073:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2073:3: (lv_value_0_0= ruleNullEnum )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2074:4: lv_value_0_0= ruleNullEnum
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNullValueAccess().getValueNullEnumEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNullEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNullValueRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.NullEnum");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleNumberValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2094:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2094:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2095:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2101:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2107:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2108:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2108:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2109:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2109:3: (lv_value_0_0= ruleEDouble )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2110:4: lv_value_0_0= ruleEDouble
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberValueAccess().getValueEDoubleParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberValueRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EDouble");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleObjectValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2130:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2130:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2131:2: iv_ruleObjectValue= ruleObjectValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObjectValue=ruleObjectValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObjectValue"


    // $ANTLR start "ruleObjectValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2137:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2143:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2144:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2144:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2145:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2145:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:2146:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:2156:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=ContinueOnError && LA18_0<=Run)||(LA18_0>=Id && LA18_0<=If)||LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2157:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2157:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2158:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2158:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2159:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_keyvaluepair_2_0=ruleKeyValuePair();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getObjectValueRule());
                      						}
                      						add(
                      							current,
                      							"keyvaluepair",
                      							lv_keyvaluepair_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf1.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf1Parser.g:2176:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==Comma) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2177:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2181:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2182:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2182:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2183:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_keyvaluepair_4_0=ruleKeyValuePair();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getObjectValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"keyvaluepair",
                    	      								lv_keyvaluepair_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf1.KeyValuePair");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getObjectValueAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleObjectValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2210:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2210:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2211:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2217:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2223:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2224:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2224:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2225:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2225:3: (lv_value_0_0= ruleEBoolean )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2226:4: lv_value_0_0= ruleEBoolean
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBooleanValueRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EBoolean");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEDouble"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2246:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2246:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2247:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2253:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2259:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2260:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2260:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_E_INT) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_E_DOUBLE) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2261:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_E_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2269:3: this_E_DOUBLE_1= RULE_E_DOUBLE
                    {
                    this_E_DOUBLE_1=(Token)match(input,RULE_E_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_E_DOUBLE_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2280:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2280:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2281:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyValuePairRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyValuePair=ruleKeyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyValuePair; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2287:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2293:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2294:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2294:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2295:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2295:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2296:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2296:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2297:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:2318:3: ( (lv_value_2_0= ruleValue ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2319:4: (lv_value_2_0= ruleValue )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2319:4: (lv_value_2_0= ruleValue )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2320:5: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyValuePairAccess().getValueValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleEBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2341:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2341:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2342:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2348:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2354:2: ( (kw= True | kw= False ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2355:2: (kw= True | kw= False )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2355:2: (kw= True | kw= False )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==True) ) {
                alt20=1;
            }
            else if ( (LA20_0==False) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2356:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2362:3: kw= False
                    {
                    kw=(Token)match(input,False,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleShellItems"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2371:1: entryRuleShellItems returns [EObject current=null] : iv_ruleShellItems= ruleShellItems EOF ;
    public final EObject entryRuleShellItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShellItems = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2371:51: (iv_ruleShellItems= ruleShellItems EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2372:2: iv_ruleShellItems= ruleShellItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShellItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShellItems=ruleShellItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShellItems; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShellItems"


    // $ANTLR start "ruleShellItems"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2378:1: ruleShellItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleShellItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2384:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2385:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2385:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2386:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2386:3: (lv_items_0_0= ruleJsonDocument )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2387:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getShellItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getShellItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.JsonDocument");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShellItems"


    // $ANTLR start "entryRuleEnv"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2407:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2407:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2408:2: iv_ruleEnv= ruleEnv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnv=ruleEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnv"


    // $ANTLR start "ruleEnv"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2414:1: ruleEnv returns [EObject current=null] : ( (lv_env_0_0= ruleEnvAbstract ) ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2420:2: ( ( (lv_env_0_0= ruleEnvAbstract ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2421:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2421:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2422:3: (lv_env_0_0= ruleEnvAbstract )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2422:3: (lv_env_0_0= ruleEnvAbstract )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2423:4: lv_env_0_0= ruleEnvAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvAccess().getEnvEnvAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEnvAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EnvAbstract");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnv"


    // $ANTLR start "entryRuleEnvTypeString"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2443:1: entryRuleEnvTypeString returns [EObject current=null] : iv_ruleEnvTypeString= ruleEnvTypeString EOF ;
    public final EObject entryRuleEnvTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeString = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2443:54: (iv_ruleEnvTypeString= ruleEnvTypeString EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2444:2: iv_ruleEnvTypeString= ruleEnvTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeString=ruleEnvTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvTypeString"


    // $ANTLR start "ruleEnvTypeString"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2450:1: ruleEnvTypeString returns [EObject current=null] : ( (lv_env_0_0= ruleEString ) ) ;
    public final EObject ruleEnvTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2456:2: ( ( (lv_env_0_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2457:2: ( (lv_env_0_0= ruleEString ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2457:2: ( (lv_env_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2458:3: (lv_env_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2458:3: (lv_env_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2459:4: lv_env_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeStringAccess().getEnvEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeStringRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvTypeString"


    // $ANTLR start "entryRuleEnvTypeInteger"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2479:1: entryRuleEnvTypeInteger returns [EObject current=null] : iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF ;
    public final EObject entryRuleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeInteger = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2479:55: (iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2480:2: iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeInteger=ruleEnvTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvTypeInteger"


    // $ANTLR start "ruleEnvTypeInteger"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2486:1: ruleEnvTypeInteger returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2492:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2493:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2493:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2494:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2494:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2495:4: lv_env_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeIntegerAccess().getEnvEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeIntegerRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EDoubleObject");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvTypeInteger"


    // $ANTLR start "entryRuleEnvTypeNumber"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2515:1: entryRuleEnvTypeNumber returns [EObject current=null] : iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF ;
    public final EObject entryRuleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNumber = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2515:54: (iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2516:2: iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeNumber=ruleEnvTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvTypeNumber"


    // $ANTLR start "ruleEnvTypeNumber"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2522:1: ruleEnvTypeNumber returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2528:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2529:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2529:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2530:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2530:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2531:4: lv_env_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeNumberAccess().getEnvEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeNumberRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EDoubleObject");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvTypeNumber"


    // $ANTLR start "entryRuleEnvTypeBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2551:1: entryRuleEnvTypeBoolean returns [EObject current=null] : iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF ;
    public final EObject entryRuleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeBoolean = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2551:55: (iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2552:2: iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeBoolean=ruleEnvTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvTypeBoolean"


    // $ANTLR start "ruleEnvTypeBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2558:1: ruleEnvTypeBoolean returns [EObject current=null] : ( (lv_env_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2564:2: ( ( (lv_env_0_0= ruleEBooleanObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2565:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2565:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2566:3: (lv_env_0_0= ruleEBooleanObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2566:3: (lv_env_0_0= ruleEBooleanObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2567:4: lv_env_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeBooleanAccess().getEnvEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeBooleanRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.EBooleanObject");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvTypeBoolean"


    // $ANTLR start "entryRuleEnvTypeObject"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2587:1: entryRuleEnvTypeObject returns [EObject current=null] : iv_ruleEnvTypeObject= ruleEnvTypeObject EOF ;
    public final EObject entryRuleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeObject = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2587:54: (iv_ruleEnvTypeObject= ruleEnvTypeObject EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2588:2: iv_ruleEnvTypeObject= ruleEnvTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeObject=ruleEnvTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvTypeObject"


    // $ANTLR start "ruleEnvTypeObject"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2594:1: ruleEnvTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2600:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2601:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2601:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2602:3: () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2602:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:2603:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvTypeObjectAccess().getEnvTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:2613:3: ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=ContinueOnError && LA22_0<=Run)||(LA22_0>=Id && LA22_0<=If)||LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2614:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2614:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2615:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2615:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2616:6: lv_env_2_0= ruleEnvPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvTypeObjectAccess().getEnvEnvPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_env_2_0=ruleEnvPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnvTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"env",
                      							lv_env_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf1.EnvPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf1Parser.g:2633:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==Comma) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2634:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2638:5: ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2639:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2639:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2640:7: lv_env_4_0= ruleEnvPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvTypeObjectAccess().getEnvEnvPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_env_4_0=ruleEnvPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnvTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"env",
                    	      								lv_env_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf1.EnvPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEnvTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvTypeObject"


    // $ANTLR start "entryRuleEnvTypeArray"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2667:1: entryRuleEnvTypeArray returns [EObject current=null] : iv_ruleEnvTypeArray= ruleEnvTypeArray EOF ;
    public final EObject entryRuleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeArray = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2667:53: (iv_ruleEnvTypeArray= ruleEnvTypeArray EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2668:2: iv_ruleEnvTypeArray= ruleEnvTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeArray=ruleEnvTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvTypeArray"


    // $ANTLR start "ruleEnvTypeArray"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2674:1: ruleEnvTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2680:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2681:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2681:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2682:3: () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2682:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:2683:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvTypeArrayAccess().getEnvTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:2693:3: ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=ContinueOnError && LA24_0<=True)||LA24_0==LeftSquareBracket||LA24_0==LeftCurlyBracket||(LA24_0>=RULE_STRING && LA24_0<=RULE_E_DOUBLE)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2694:4: ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2694:4: ( (lv_env_2_0= ruleEnvItems ) )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2695:5: (lv_env_2_0= ruleEnvItems )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2695:5: (lv_env_2_0= ruleEnvItems )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:2696:6: lv_env_2_0= ruleEnvItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_env_2_0=ruleEnvItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEnvTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"env",
                      							lv_env_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf1.EnvItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf1Parser.g:2713:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==Comma) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2714:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2718:5: ( (lv_env_4_0= ruleEnvItems ) )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2719:6: (lv_env_4_0= ruleEnvItems )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2719:6: (lv_env_4_0= ruleEnvItems )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:2720:7: lv_env_4_0= ruleEnvItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_env_4_0=ruleEnvItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEnvTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"env",
                    	      								lv_env_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf1.EnvItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEnvTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvTypeArray"


    // $ANTLR start "entryRuleEnvTypeNull"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2747:1: entryRuleEnvTypeNull returns [EObject current=null] : iv_ruleEnvTypeNull= ruleEnvTypeNull EOF ;
    public final EObject entryRuleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNull = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2747:52: (iv_ruleEnvTypeNull= ruleEnvTypeNull EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2748:2: iv_ruleEnvTypeNull= ruleEnvTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvTypeNull=ruleEnvTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvTypeNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvTypeNull"


    // $ANTLR start "ruleEnvTypeNull"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2754:1: ruleEnvTypeNull returns [EObject current=null] : ( (lv_env_0_0= ruleNullValue ) ) ;
    public final EObject ruleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2760:2: ( ( (lv_env_0_0= ruleNullValue ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2761:2: ( (lv_env_0_0= ruleNullValue ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2761:2: ( (lv_env_0_0= ruleNullValue ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2762:3: (lv_env_0_0= ruleNullValue )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2762:3: (lv_env_0_0= ruleNullValue )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2763:4: lv_env_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvTypeNullAccess().getEnvNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_env_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvTypeNullRule());
              				}
              				set(
              					current,
              					"env",
              					lv_env_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.NullValue");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvTypeNull"


    // $ANTLR start "entryRuleEnvAdditionalProperties"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2783:1: entryRuleEnvAdditionalProperties returns [EObject current=null] : iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF ;
    public final EObject entryRuleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAdditionalProperties = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2783:64: (iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2784:2: iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvAdditionalProperties=ruleEnvAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvAdditionalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvAdditionalProperties"


    // $ANTLR start "ruleEnvAdditionalProperties"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2790:1: ruleEnvAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2796:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2797:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2797:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2798:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2798:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2799:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2799:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2800:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnvAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnvAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:2821:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2822:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2822:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2823:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnvAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnvAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.JsonDocument");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvAdditionalProperties"


    // $ANTLR start "entryRuleEnvItems"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2844:1: entryRuleEnvItems returns [EObject current=null] : iv_ruleEnvItems= ruleEnvItems EOF ;
    public final EObject entryRuleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvItems = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2844:49: (iv_ruleEnvItems= ruleEnvItems EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2845:2: iv_ruleEnvItems= ruleEnvItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnvItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnvItems=ruleEnvItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnvItems; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnvItems"


    // $ANTLR start "ruleEnvItems"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2851:1: ruleEnvItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2857:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2858:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2858:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2859:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2859:3: (lv_items_0_0= ruleJsonDocument )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2860:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnvItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEnvItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.JsonDocument");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnvItems"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2880:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2880:97: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2881:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2887:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString returns [EObject current=null] : (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEString ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_continue_45on_45error_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2893:2: ( (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEString ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2894:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEString ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2894:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2895:3: otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,ContinueOnError,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringAccess().getContinueOnErrorKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:2903:3: ( (lv_continue_45on_45error_2_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2904:4: (lv_continue_45on_45error_2_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2904:4: (lv_continue_45on_45error_2_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2905:5: lv_continue_45on_45error_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringAccess().getContinue_45on_45errorEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_continue_45on_45error_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringRule());
              					}
              					set(
              						current,
              						"continue_45on_45error",
              						lv_continue_45on_45error_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2926:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2926:98: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2927:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2933:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger returns [EObject current=null] : (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_continue_45on_45error_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2939:2: ( (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2940:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2940:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2941:3: otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,ContinueOnError,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerAccess().getContinueOnErrorKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:2949:3: ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2950:4: (lv_continue_45on_45error_2_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2950:4: (lv_continue_45on_45error_2_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2951:5: lv_continue_45on_45error_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerAccess().getContinue_45on_45errorEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_continue_45on_45error_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerRule());
              					}
              					set(
              						current,
              						"continue_45on_45error",
              						lv_continue_45on_45error_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EDoubleObject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2972:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2972:97: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2973:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber"
    // InternalNormalJobStepsItemsAllOf1Parser.g:2979:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber returns [EObject current=null] : (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_continue_45on_45error_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2985:2: ( (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2986:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2986:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2987:3: otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) )
            {
            otherlv_0=(Token)match(input,ContinueOnError,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberAccess().getContinueOnErrorKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:2995:3: ( (lv_continue_45on_45error_2_0= ruleEDoubleObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2996:4: (lv_continue_45on_45error_2_0= ruleEDoubleObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:2996:4: (lv_continue_45on_45error_2_0= ruleEDoubleObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:2997:5: lv_continue_45on_45error_2_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberAccess().getContinue_45on_45errorEDoubleObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_continue_45on_45error_2_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberRule());
              					}
              					set(
              						current,
              						"continue_45on_45error",
              						lv_continue_45on_45error_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EDoubleObject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3018:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3018:98: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3019:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3025:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean returns [EObject current=null] : (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_continue_45on_45error_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3031:2: ( (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3032:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3032:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3033:3: otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) )
            {
            otherlv_0=(Token)match(input,ContinueOnError,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanAccess().getContinueOnErrorKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:3041:3: ( (lv_continue_45on_45error_2_0= ruleEBooleanObject ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3042:4: (lv_continue_45on_45error_2_0= ruleEBooleanObject )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3042:4: (lv_continue_45on_45error_2_0= ruleEBooleanObject )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3043:5: lv_continue_45on_45error_2_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanAccess().getContinue_45on_45errorEBooleanObjectParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_continue_45on_45error_2_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanRule());
              					}
              					set(
              						current,
              						"continue_45on_45error",
              						lv_continue_45on_45error_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EBooleanObject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3064:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3064:97: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3065:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3071:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject returns [EObject current=null] : ( () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_continue_45on_45error_4_0 = null;

        EObject lv_continue_45on_45error_6_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3077:2: ( ( () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3078:2: ( () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3078:2: ( () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3079:3: () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3079:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:3080:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,ContinueOnError,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAccess().getContinueOnErrorKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:3098:3: ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=ContinueOnError && LA26_0<=Run)||(LA26_0>=Id && LA26_0<=If)||LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3099:4: ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3099:4: ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3100:5: (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3100:5: (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3101:6: lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAccess().getContinue_45on_45errorNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_continue_45on_45error_4_0=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"continue_45on_45error",
                      							lv_continue_45on_45error_4_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf1.NormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf1Parser.g:3118:4: (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==Comma) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3119:5: otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3123:5: ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract ) )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3124:6: (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3124:6: (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3125:7: lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAccess().getContinue_45on_45errorNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_continue_45on_45error_6_0=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"continue_45on_45error",
                    	      								lv_continue_45on_45error_6_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf1.NormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3152:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3152:96: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3153:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3159:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray returns [EObject current=null] : ( () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) )* )? otherlv_7= RightSquareBracket ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_continue_45on_45error_4_0 = null;

        EObject lv_continue_45on_45error_6_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3165:2: ( ( () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) )* )? otherlv_7= RightSquareBracket ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3166:2: ( () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) )* )? otherlv_7= RightSquareBracket )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3166:2: ( () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) )* )? otherlv_7= RightSquareBracket )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3167:3: () otherlv_1= ContinueOnError otherlv_2= Colon otherlv_3= LeftSquareBracket ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) )* )? otherlv_7= RightSquareBracket
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3167:3: ()
            // InternalNormalJobStepsItemsAllOf1Parser.g:3168:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAccess().getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,ContinueOnError,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAccess().getContinueOnErrorKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftSquareBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:3186:3: ( ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=ContinueOnError && LA28_0<=True)||LA28_0==LeftSquareBracket||LA28_0==LeftCurlyBracket||(LA28_0>=RULE_STRING && LA28_0<=RULE_E_DOUBLE)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3187:4: ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3187:4: ( (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3188:5: (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems )
                    {
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3188:5: (lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems )
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3189:6: lv_continue_45on_45error_4_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAccess().getContinue_45on_45errorNormalJobStepsItemsAllOf1Continue_45on_45errorItemsParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_continue_45on_45error_4_0=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"continue_45on_45error",
                      							lv_continue_45on_45error_4_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf1.NormalJobStepsItemsAllOf1Continue_45on_45errorItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf1Parser.g:3206:4: (otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3207:5: otherlv_5= Comma ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3211:5: ( (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems ) )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3212:6: (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3212:6: (lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems )
                    	    // InternalNormalJobStepsItemsAllOf1Parser.g:3213:7: lv_continue_45on_45error_6_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAccess().getContinue_45on_45errorNormalJobStepsItemsAllOf1Continue_45on_45errorItemsParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_continue_45on_45error_6_0=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"continue_45on_45error",
                    	      								lv_continue_45on_45error_6_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf1.NormalJobStepsItemsAllOf1Continue_45on_45errorItems");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3240:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3240:95: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3241:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3247:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull returns [EObject current=null] : (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleNullValue ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_continue_45on_45error_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3253:2: ( (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleNullValue ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3254:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleNullValue ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3254:2: (otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleNullValue ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3255:3: otherlv_0= ContinueOnError otherlv_1= Colon ( (lv_continue_45on_45error_2_0= ruleNullValue ) )
            {
            otherlv_0=(Token)match(input,ContinueOnError,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullAccess().getContinueOnErrorKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:3263:3: ( (lv_continue_45on_45error_2_0= ruleNullValue ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3264:4: (lv_continue_45on_45error_2_0= ruleNullValue )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3264:4: (lv_continue_45on_45error_2_0= ruleNullValue )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3265:5: lv_continue_45on_45error_2_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullAccess().getContinue_45on_45errorNullValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_continue_45on_45error_2_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullRule());
              					}
              					set(
              						current,
              						"continue_45on_45error",
              						lv_continue_45on_45error_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.NullValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3286:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3286:107: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3287:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3293:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3299:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3300:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3300:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3301:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3301:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3302:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3302:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3303:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf1Parser.g:3324:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3325:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3325:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3326:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf1.JsonDocument");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorItems"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3347:1: entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorItems returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3347:92: (iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3348:2: iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems=ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf1Continue_45on_45errorItems"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3354:1: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3360:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3361:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3361:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3362:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3362:3: (lv_items_0_0= ruleJsonDocument )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3363:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf1Continue_45on_45errorItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.NormalJobStepsItemsAllOf1.JsonDocument");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf1Continue_45on_45errorItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3383:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3383:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3384:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVALID_STRINGRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVALID_STRING=ruleVALID_STRING();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVALID_STRING.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalNormalJobStepsItemsAllOf1Parser.g:3390:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3396:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3397:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3397:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=ContinueOnError && LA29_0<=Run)||(LA29_0>=Id && LA29_0<=If)) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3398:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3406:3: this_KEYWORD_1= ruleKEYWORD
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVALID_STRINGAccess().getKEYWORDParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_1=ruleKEYWORD();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVALID_STRING"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3420:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3420:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3421:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKEYWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKEYWORD.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalNormalJobStepsItemsAllOf1Parser.g:3427:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= With | kw= Shell | kw= Name | kw= Uses | kw= Run | kw= Id | kw= WorkingDirectory | kw= Env | kw= TimeoutMinutes | kw= If | kw= ContinueOnError ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3433:2: ( (kw= With | kw= Shell | kw= Name | kw= Uses | kw= Run | kw= Id | kw= WorkingDirectory | kw= Env | kw= TimeoutMinutes | kw= If | kw= ContinueOnError ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3434:2: (kw= With | kw= Shell | kw= Name | kw= Uses | kw= Run | kw= Id | kw= WorkingDirectory | kw= Env | kw= TimeoutMinutes | kw= If | kw= ContinueOnError )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3434:2: (kw= With | kw= Shell | kw= Name | kw= Uses | kw= Run | kw= Id | kw= WorkingDirectory | kw= Env | kw= TimeoutMinutes | kw= If | kw= ContinueOnError )
            int alt30=11;
            switch ( input.LA(1) ) {
            case With:
                {
                alt30=1;
                }
                break;
            case Shell:
                {
                alt30=2;
                }
                break;
            case Name:
                {
                alt30=3;
                }
                break;
            case Uses:
                {
                alt30=4;
                }
                break;
            case Run:
                {
                alt30=5;
                }
                break;
            case Id:
                {
                alt30=6;
                }
                break;
            case WorkingDirectory:
                {
                alt30=7;
                }
                break;
            case Env:
                {
                alt30=8;
                }
                break;
            case TimeoutMinutes:
                {
                alt30=9;
                }
                break;
            case If:
                {
                alt30=10;
                }
                break;
            case ContinueOnError:
                {
                alt30=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3435:3: kw= With
                    {
                    kw=(Token)match(input,With,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getWithKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3441:3: kw= Shell
                    {
                    kw=(Token)match(input,Shell,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getShellKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3447:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3453:3: kw= Uses
                    {
                    kw=(Token)match(input,Uses,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUsesKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3459:3: kw= Run
                    {
                    kw=(Token)match(input,Run,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRunKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3465:3: kw= Id
                    {
                    kw=(Token)match(input,Id,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIdKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3471:3: kw= WorkingDirectory
                    {
                    kw=(Token)match(input,WorkingDirectory,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getWorkingDirectoryKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3477:3: kw= Env
                    {
                    kw=(Token)match(input,Env,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnvKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3483:3: kw= TimeoutMinutes
                    {
                    kw=(Token)match(input,TimeoutMinutes,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTimeoutMinutesKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3489:3: kw= If
                    {
                    kw=(Token)match(input,If,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIfKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalNormalJobStepsItemsAllOf1Parser.g:3495:3: kw= ContinueOnError
                    {
                    kw=(Token)match(input,ContinueOnError,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getContinueOnErrorKeyword_10());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleNullEnum"
    // InternalNormalJobStepsItemsAllOf1Parser.g:3504:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3510:2: ( (enumLiteral_0= Null ) )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3511:2: (enumLiteral_0= Null )
            {
            // InternalNormalJobStepsItemsAllOf1Parser.g:3511:2: (enumLiteral_0= Null )
            // InternalNormalJobStepsItemsAllOf1Parser.g:3512:3: enumLiteral_0= Null
            {
            enumLiteral_0=(Token)match(input,Null,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getNullEnumAccess().getNullEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNullEnum"

    // $ANTLR start synpred1_InternalNormalJobStepsItemsAllOf1Parser
    public final void synpred1_InternalNormalJobStepsItemsAllOf1Parser_fragment() throws RecognitionException {   
        // InternalNormalJobStepsItemsAllOf1Parser.g:271:4: ( ruleNormalJobStepsItemsAllOf1IfTypeNumber )
        // InternalNormalJobStepsItemsAllOf1Parser.g:271:5: ruleNormalJobStepsItemsAllOf1IfTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleNormalJobStepsItemsAllOf1IfTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalNormalJobStepsItemsAllOf1Parser

    // $ANTLR start synpred2_InternalNormalJobStepsItemsAllOf1Parser
    public final void synpred2_InternalNormalJobStepsItemsAllOf1Parser_fragment() throws RecognitionException {   
        // InternalNormalJobStepsItemsAllOf1Parser.g:319:4: ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )
        // InternalNormalJobStepsItemsAllOf1Parser.g:319:5: ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalNormalJobStepsItemsAllOf1Parser

    // $ANTLR start synpred3_InternalNormalJobStepsItemsAllOf1Parser
    public final void synpred3_InternalNormalJobStepsItemsAllOf1Parser_fragment() throws RecognitionException {   
        // InternalNormalJobStepsItemsAllOf1Parser.g:403:4: ( ruleShellTypeNumber )
        // InternalNormalJobStepsItemsAllOf1Parser.g:403:5: ruleShellTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleShellTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalNormalJobStepsItemsAllOf1Parser

    // $ANTLR start synpred5_InternalNormalJobStepsItemsAllOf1Parser
    public final void synpred5_InternalNormalJobStepsItemsAllOf1Parser_fragment() throws RecognitionException {   
        // InternalNormalJobStepsItemsAllOf1Parser.g:587:4: ( ruleEnvTypeNumber )
        // InternalNormalJobStepsItemsAllOf1Parser.g:587:5: ruleEnvTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleEnvTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalNormalJobStepsItemsAllOf1Parser

    // Delegated rules

    public final boolean synpred5_InternalNormalJobStepsItemsAllOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalNormalJobStepsItemsAllOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalNormalJobStepsItemsAllOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalNormalJobStepsItemsAllOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalNormalJobStepsItemsAllOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalNormalJobStepsItemsAllOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalNormalJobStepsItemsAllOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalNormalJobStepsItemsAllOf1Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\13\uffff";
    static final String dfa_3s = "\1\17\13\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\1\6\1\13\1\7\1\3\1\4\1\10\1\11\1\5\1\uffff\1\1\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "152:2: (this_NormalJobStepsItemsAllOf1Id_0= ruleNormalJobStepsItemsAllOf1Id | this_NormalJobStepsItemsAllOf1If_1= ruleNormalJobStepsItemsAllOf1If | this_NormalJobStepsItemsAllOf1Name_2= ruleNormalJobStepsItemsAllOf1Name | this_NormalJobStepsItemsAllOf1Uses_3= ruleNormalJobStepsItemsAllOf1Uses | this_NormalJobStepsItemsAllOf1Run_4= ruleNormalJobStepsItemsAllOf1Run | this_NormalJobStepsItemsAllOf1Working_45directory_5= ruleNormalJobStepsItemsAllOf1Working_45directory | this_NormalJobStepsItemsAllOf1Shell_6= ruleNormalJobStepsItemsAllOf1Shell | this_NormalJobStepsItemsAllOf1With_7= ruleNormalJobStepsItemsAllOf1With | this_NormalJobStepsItemsAllOf1Env_8= ruleNormalJobStepsItemsAllOf1Env | this_NormalJobStepsItemsAllOf1Continue_45on_45error_9= ruleNormalJobStepsItemsAllOf1Continue_45on_45error | this_NormalJobStepsItemsAllOf1Timeout_45minutes_10= ruleNormalJobStepsItemsAllOf1Timeout_45minutes )";
        }
    }
    static final String dfa_7s = "\1\4\1\23\1\4\2\0\7\uffff";
    static final String dfa_8s = "\1\4\1\23\1\33\2\0\7\uffff";
    static final String dfa_9s = "\5\uffff\1\4\1\5\1\7\1\6\1\2\1\1\1\3";
    static final String dfa_10s = "\3\uffff\1\1\1\0\7\uffff}>";
    static final String[] dfa_11s = {
            "\1\1",
            "\1\2",
            "\11\11\1\5\2\11\1\7\1\5\2\uffff\1\10\1\uffff\1\6\2\uffff\1\11\1\3\1\4",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_7 = DFA.unpackEncodedStringToUnsignedChars(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_7;
            this.max = dfa_8;
            this.accept = dfa_9;
            this.special = dfa_10;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "317:2: ( ( ( ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber )=>this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_0= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber ) | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_1= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_2= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_3= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_4= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_5= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray | this_NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_6= ruleNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_4 = input.LA(1);

                         
                        int index5_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalNormalJobStepsItemsAllOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index5_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalNormalJobStepsItemsAllOf1Parser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_12s = "\12\uffff";
    static final String dfa_13s = "\1\4\2\0\7\uffff";
    static final String dfa_14s = "\1\33\2\0\7\uffff";
    static final String dfa_15s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_16s = "\1\uffff\1\0\1\1\7\uffff}>";
    static final String[] dfa_17s = {
            "\11\3\1\4\2\3\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_16;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "401:2: ( ( ( ruleShellTypeNumber )=>this_ShellTypeNumber_0= ruleShellTypeNumber ) | this_ShellTypeString_1= ruleShellTypeString | this_ShellTypeInteger_2= ruleShellTypeInteger | this_ShellTypeBoolean_3= ruleShellTypeBoolean | this_ShellTypeObject_4= ruleShellTypeObject | this_ShellTypeArray_5= ruleShellTypeArray | this_ShellTypeNull_6= ruleShellTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalNormalJobStepsItemsAllOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalNormalJobStepsItemsAllOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_18s = "\1\uffff\1\1\1\0\7\uffff}>";
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_12;
            this.eof = dfa_12;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_18;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "585:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalNormalJobStepsItemsAllOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalNormalJobStepsItemsAllOf1Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000080DFF0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000DFF0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000200DFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000E53FFF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000280DFF0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E73FFF0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});

}
