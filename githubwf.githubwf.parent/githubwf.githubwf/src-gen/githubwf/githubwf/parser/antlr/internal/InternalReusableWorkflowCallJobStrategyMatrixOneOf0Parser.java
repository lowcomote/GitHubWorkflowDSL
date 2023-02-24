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
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Matrix", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=6;
    public static final int True=7;
    public static final int RULE_STRING=15;
    public static final int False=5;
    public static final int RULE_SL_COMMENT=20;
    public static final int Comma=8;
    public static final int Matrix=4;
    public static final int Colon=9;
    public static final int RightCurlyBracket=13;
    public static final int RULE_E_DOUBLE=17;
    public static final int EOF=-1;
    public static final int RightSquareBracket=11;
    public static final int RULE_ID=18;
    public static final int RULE_WS=21;
    public static final int LeftCurlyBracket=12;
    public static final int RULE_E_INT=16;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;

    // delegates
    // delegators


        public InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g"; }



     	private ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess grammarAccess;

        public InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser(TokenStream input, ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ReusableWorkflowCallJobStrategyMatrixOneOf0";
       	}

       	@Override
       	protected ReusableWorkflowCallJobStrategyMatrixOneOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:58:1: entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0 returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0 EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0 = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:58:84: (iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0 EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:59:2: iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0=ruleReusableWorkflowCallJobStrategyMatrixOneOf0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixOneOf0"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:65:1: ruleReusableWorkflowCallJobStrategyMatrixOneOf0 returns [EObject current=null] : ( () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixOneOf0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_matrix_4_0 = null;

        EObject lv_matrix_6_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:71:2: ( ( () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:72:2: ( () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:72:2: ( () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:73:3: () otherlv_1= Matrix otherlv_2= Colon otherlv_3= LeftCurlyBracket ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) )* )? otherlv_7= RightCurlyBracket
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:73:3: ()
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:74:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Access().getReusableWorkflowCallJobStrategyMatrixOneOf0Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Matrix,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Access().getMatrixKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Access().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Access().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:92:3: ( ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Matrix||LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:93:4: ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) )*
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:93:4: ( (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) )
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:94:5: (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract )
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:94:5: (lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract )
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:95:6: lv_matrix_4_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Access().getMatrixReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_matrix_4_0=ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Rule());
                      						}
                      						add(
                      							current,
                      							"matrix",
                      							lv_matrix_4_0,
                      							"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.ReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:112:4: (otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:113:5: otherlv_5= Comma ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Access().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:117:5: ( (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract ) )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:118:6: (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract )
                    	    {
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:118:6: (lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:119:7: lv_matrix_6_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Access().getMatrixReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_matrix_6_0=ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Rule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"matrix",
                    	      								lv_matrix_6_0,
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.ReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract");
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

            otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0Access().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixOneOf0"


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:146:1: entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:146:102: (iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:147:2: iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract= ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract=ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:153:1: ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract returns [EObject current=null] : ( ( ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:159:2: ( ( ( ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:160:2: ( ( ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:160:2: ( ( ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:161:3: ( ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties )=>this_ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_0= ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractAccess().getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_0=ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_0;
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:174:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:174:46: (iv_ruleValue= ruleValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:175:2: iv_ruleValue= ruleValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:181:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:187:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:188:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:188:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt3=6;
            switch ( input.LA(1) ) {
            case Matrix:
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt3=2;
                }
                break;
            case Null:
                {
                alt3=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt3=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt3=5;
                }
                break;
            case False:
            case True:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:189:3: this_StringValue_0= ruleStringValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:198:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:207:3: this_NullValue_2= ruleNullValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:216:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:225:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:234:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:246:1: entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:246:104: (iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:247:2: iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties= ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties=ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:253:1: ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:259:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:260:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:260:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:261:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:261:3: ( (lv_key_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:262:4: (lv_key_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:262:4: (lv_key_0_0= ruleEString )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:263:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:284:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:285:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:285:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:286:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.JsonDocument");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties"


    // $ANTLR start "entryRuleEString"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:307:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:307:47: (iv_ruleEString= ruleEString EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:308:2: iv_ruleEString= ruleEString EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:314:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:320:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:321:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleJsonDocument"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:334:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:334:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:335:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:341:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:347:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:348:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:348:2: ( (lv_value_0_0= ruleValue ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:349:3: (lv_value_0_0= ruleValue )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:349:3: (lv_value_0_0= ruleValue )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:350:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.Value");
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:370:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:370:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:371:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:377:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:383:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:384:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:384:2: ( (lv_value_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:385:3: (lv_value_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:385:3: (lv_value_0_0= ruleEString )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:386:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.EString");
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:406:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:406:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:407:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:413:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:419:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:420:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:420:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:421:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:421:3: ()
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:422:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:432:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=Matrix && LA5_0<=True)||LA5_0==LeftSquareBracket||LA5_0==LeftCurlyBracket||(LA5_0>=RULE_STRING && LA5_0<=RULE_E_DOUBLE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:433:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:433:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:434:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:434:5: (lv_value_2_0= ruleValue )
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:435:6: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
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
                      							"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:452:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:453:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:457:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:458:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:458:6: (lv_value_4_0= ruleValue )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:459:7: lv_value_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_10);
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
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:486:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:486:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:487:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:493:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:499:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:500:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:500:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:501:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:501:3: (lv_value_0_0= ruleNullEnum )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:502:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.NullEnum");
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:522:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:522:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:523:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:529:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:535:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:536:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:536:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:537:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:537:3: (lv_value_0_0= ruleEDouble )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:538:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.EDouble");
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:558:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:558:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:559:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:565:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:571:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:572:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:572:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:573:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:573:3: ()
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:574:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:584:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Matrix||LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:585:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:585:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:586:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:586:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:587:6: lv_keyvaluepair_2_0= ruleKeyValuePair
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
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
                      							"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:604:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:605:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:609:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:610:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:610:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:611:7: lv_keyvaluepair_4_0= ruleKeyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getObjectValueAccess().getKeyvaluepairKeyValuePairParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
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
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.KeyValuePair");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:638:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:638:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:639:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:645:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:651:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:652:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:652:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:653:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:653:3: (lv_value_0_0= ruleEBoolean )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:654:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.EBoolean");
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:674:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:674:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:675:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:681:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:687:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:688:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:688:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_E_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_E_DOUBLE) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:689:3: this_E_INT_0= RULE_E_INT
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
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:697:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:708:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:708:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:709:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:715:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:721:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:722:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:722:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:723:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:723:3: ( (lv_key_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:724:4: (lv_key_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:724:4: (lv_key_0_0= ruleEString )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:725:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
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
              						"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:746:3: ( (lv_value_2_0= ruleValue ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:747:4: (lv_value_2_0= ruleValue )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:747:4: (lv_value_2_0= ruleValue )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:748:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0.Value");
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:769:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:769:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:770:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:776:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:782:2: ( (kw= True | kw= False ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:783:2: (kw= True | kw= False )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:783:2: (kw= True | kw= False )
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
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:784:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:790:3: kw= False
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


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:799:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:799:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:800:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:806:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:812:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:813:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:813:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==Matrix) ) {
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
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:814:3: this_STRING_0= RULE_STRING
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
                    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:822:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:836:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:836:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:837:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:843:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Matrix ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:849:2: (kw= Matrix )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:850:2: kw= Matrix
            {
            kw=(Token)match(input,Matrix,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMatrixKeyword());
              	
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
    // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:858:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:864:2: ( (enumLiteral_0= Null ) )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:865:2: (enumLiteral_0= Null )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:865:2: (enumLiteral_0= Null )
            // InternalReusableWorkflowCallJobStrategyMatrixOneOf0Parser.g:866:3: enumLiteral_0= Null
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000900L});

}
