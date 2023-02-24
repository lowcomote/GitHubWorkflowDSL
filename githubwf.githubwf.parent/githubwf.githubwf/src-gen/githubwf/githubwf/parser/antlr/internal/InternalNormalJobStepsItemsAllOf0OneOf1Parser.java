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
import githubwf.githubwf.services.NormalJobStepsItemsAllOf0OneOf1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalNormalJobStepsItemsAllOf0OneOf1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Run", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=6;
    public static final int True=7;
    public static final int RULE_STRING=15;
    public static final int False=5;
    public static final int RULE_SL_COMMENT=20;
    public static final int Comma=8;
    public static final int Colon=9;
    public static final int RightCurlyBracket=13;
    public static final int RULE_E_DOUBLE=17;
    public static final int EOF=-1;
    public static final int RightSquareBracket=11;
    public static final int RULE_ID=18;
    public static final int RULE_WS=21;
    public static final int LeftCurlyBracket=12;
    public static final int RULE_E_INT=16;
    public static final int Run=4;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;

    // delegates
    // delegators


        public InternalNormalJobStepsItemsAllOf0OneOf1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNormalJobStepsItemsAllOf0OneOf1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNormalJobStepsItemsAllOf0OneOf1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalNormalJobStepsItemsAllOf0OneOf1Parser.g"; }



     	private NormalJobStepsItemsAllOf0OneOf1GrammarAccess grammarAccess;

        public InternalNormalJobStepsItemsAllOf0OneOf1Parser(TokenStream input, NormalJobStepsItemsAllOf0OneOf1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NormalJobStepsItemsAllOf0OneOf1";
       	}

       	@Override
       	protected NormalJobStepsItemsAllOf0OneOf1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0OneOf1"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:58:1: entryRuleNormalJobStepsItemsAllOf0OneOf1 returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0OneOf1= ruleNormalJobStepsItemsAllOf0OneOf1 EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0OneOf1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0OneOf1 = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:58:72: (iv_ruleNormalJobStepsItemsAllOf0OneOf1= ruleNormalJobStepsItemsAllOf0OneOf1 EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:59:2: iv_ruleNormalJobStepsItemsAllOf0OneOf1= ruleNormalJobStepsItemsAllOf0OneOf1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0OneOf1=ruleNormalJobStepsItemsAllOf0OneOf1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0OneOf1; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0OneOf1"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0OneOf1"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:65:1: ruleNormalJobStepsItemsAllOf0OneOf1 returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0OneOf1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:71:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:72:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:73:3: () otherlv_1= LeftCurlyBracket ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:73:3: ()
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:74:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNormalJobStepsItemsAllOf0OneOf1Access().getNormalJobStepsItemsAllOf0OneOf1Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf0OneOf1Access().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:84:3: ( ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Run||LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:85:4: ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:85:4: ( (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) )
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:86:5: (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract )
                    {
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:86:5: (lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract )
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:87:6: lv_items_2_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1Access().getItemsNormalJobStepsItemsAllOf0OneOf1PropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_items_2_0=ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1Rule());
                      						}
                      						add(
                      							current,
                      							"items",
                      							lv_items_2_0,
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.NormalJobStepsItemsAllOf0OneOf1PropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:104:4: (otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Comma) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:105:5: otherlv_3= Comma ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getNormalJobStepsItemsAllOf0OneOf1Access().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:109:5: ( (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract ) )
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:110:6: (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:110:6: (lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract )
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:111:7: lv_items_4_0= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1Access().getItemsNormalJobStepsItemsAllOf0OneOf1PropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_items_4_0=ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1Rule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"items",
                    	      								lv_items_4_0,
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.NormalJobStepsItemsAllOf0OneOf1PropertiesAbstract");
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

              			newLeafNode(otherlv_5, grammarAccess.getNormalJobStepsItemsAllOf0OneOf1Access().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0OneOf1"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:138:1: entryRuleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:138:90: (iv_ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:139:2: iv_ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract= ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1PropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract=ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:145:1: ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract returns [EObject current=null] : (this_NormalJobStepsItemsAllOf0OneOf1Run_0= ruleNormalJobStepsItemsAllOf0OneOf1Run | ( ( ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )=>this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_NormalJobStepsItemsAllOf0OneOf1Run_0 = null;

        EObject this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:151:2: ( (this_NormalJobStepsItemsAllOf0OneOf1Run_0= ruleNormalJobStepsItemsAllOf0OneOf1Run | ( ( ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )=>this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:152:2: (this_NormalJobStepsItemsAllOf0OneOf1Run_0= ruleNormalJobStepsItemsAllOf0OneOf1Run | ( ( ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )=>this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:152:2: (this_NormalJobStepsItemsAllOf0OneOf1Run_0= ruleNormalJobStepsItemsAllOf0OneOf1Run | ( ( ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )=>this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:153:3: this_NormalJobStepsItemsAllOf0OneOf1Run_0= ruleNormalJobStepsItemsAllOf0OneOf1Run
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf0OneOf1RunParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf0OneOf1Run_0=ruleNormalJobStepsItemsAllOf0OneOf1Run();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NormalJobStepsItemsAllOf0OneOf1Run_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:162:3: ( ( ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )=>this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )
                    {
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:162:3: ( ( ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )=>this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:163:4: ( ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )=>this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1PropertiesAbstractAccess().getNormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1=ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:177:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:177:46: (iv_ruleValue= ruleValue EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:178:2: iv_ruleValue= ruleValue EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:184:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:190:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:191:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:191:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt4=6;
            switch ( input.LA(1) ) {
            case Run:
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt4=2;
                }
                break;
            case Null:
                {
                alt4=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt4=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt4=5;
                }
                break;
            case False:
            case True:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:192:3: this_StringValue_0= ruleStringValue
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
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:201:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:210:3: this_NullValue_2= ruleNullValue
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
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:219:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:228:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:237:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0OneOf1Run"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:249:1: entryRuleNormalJobStepsItemsAllOf0OneOf1Run returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0OneOf1Run= ruleNormalJobStepsItemsAllOf0OneOf1Run EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0OneOf1Run() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0OneOf1Run = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:249:75: (iv_ruleNormalJobStepsItemsAllOf0OneOf1Run= ruleNormalJobStepsItemsAllOf0OneOf1Run EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:250:2: iv_ruleNormalJobStepsItemsAllOf0OneOf1Run= ruleNormalJobStepsItemsAllOf0OneOf1Run EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1RunRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0OneOf1Run=ruleNormalJobStepsItemsAllOf0OneOf1Run();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0OneOf1Run; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0OneOf1Run"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0OneOf1Run"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:256:1: ruleNormalJobStepsItemsAllOf0OneOf1Run returns [EObject current=null] : (otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0OneOf1Run() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_run_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:262:2: ( (otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:263:2: (otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:263:2: (otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:264:3: otherlv_0= Run otherlv_1= Colon ( (lv_run_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,Run,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNormalJobStepsItemsAllOf0OneOf1RunAccess().getRunKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf0OneOf1RunAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:272:3: ( (lv_run_2_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:273:4: (lv_run_2_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:273:4: (lv_run_2_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:274:5: lv_run_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1RunAccess().getRunEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_run_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1RunRule());
              					}
              					set(
              						current,
              						"run",
              						lv_run_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.EString");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0OneOf1Run"


    // $ANTLR start "entryRuleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:295:1: entryRuleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties returns [EObject current=null] : iv_ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties EOF ;
    public final EObject entryRuleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:295:92: (iv_ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:296:2: iv_ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties=ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties; 
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
    // $ANTLR end "entryRuleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties"


    // $ANTLR start "ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:302:1: ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:308:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:309:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:309:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:310:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:310:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:311:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:311:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:312:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:333:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:334:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:334:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:335:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.JsonDocument");
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
    // $ANTLR end "ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties"


    // $ANTLR start "entryRuleEString"
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:356:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:356:47: (iv_ruleEString= ruleEString EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:357:2: iv_ruleEString= ruleEString EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:363:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:369:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:370:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:383:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:383:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:384:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:390:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:396:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:397:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:397:2: ( (lv_value_0_0= ruleValue ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:398:3: (lv_value_0_0= ruleValue )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:398:3: (lv_value_0_0= ruleValue )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:399:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.Value");
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:419:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:419:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:420:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:426:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:432:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:433:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:433:2: ( (lv_value_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:434:3: (lv_value_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:434:3: (lv_value_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:435:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.EString");
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:455:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:455:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:456:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:462:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:468:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:469:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:469:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:470:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:470:3: ()
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:471:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayValueAccess().getArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:481:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=Run && LA6_0<=True)||LA6_0==LeftSquareBracket||LA6_0==LeftCurlyBracket||(LA6_0>=RULE_STRING && LA6_0<=RULE_E_DOUBLE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:482:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:482:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:483:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:483:5: (lv_value_2_0= ruleValue )
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:484:6: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:501:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:502:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:506:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:507:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:507:6: (lv_value_4_0= ruleValue )
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:508:7: lv_value_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:535:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:535:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:536:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:542:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:548:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:549:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:549:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:550:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:550:3: (lv_value_0_0= ruleNullEnum )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:551:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.NullEnum");
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:571:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:571:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:572:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:578:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:584:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:585:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:585:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:586:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:586:3: (lv_value_0_0= ruleEDouble )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:587:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.EDouble");
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:607:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:607:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:608:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:614:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:620:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:621:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:621:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:622:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:622:3: ()
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:623:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getObjectValueAccess().getObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:633:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Run||LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:634:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:634:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:635:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:635:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:636:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:653:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Comma) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:654:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:658:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:659:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:659:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:660:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.KeyValuePair");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:687:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:687:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:688:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:694:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:700:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:701:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:701:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:702:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:702:3: (lv_value_0_0= ruleEBoolean )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:703:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.EBoolean");
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:723:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:723:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:724:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:730:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:736:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:737:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:737:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_E_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_E_DOUBLE) ) {
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
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:738:3: this_E_INT_0= RULE_E_INT
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
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:746:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:757:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:757:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:758:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:764:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:770:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:771:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:771:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:772:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:772:3: ( (lv_key_0_0= ruleEString ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:773:4: (lv_key_0_0= ruleEString )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:773:4: (lv_key_0_0= ruleEString )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:774:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:795:3: ( (lv_value_2_0= ruleValue ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:796:4: (lv_value_2_0= ruleValue )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:796:4: (lv_value_2_0= ruleValue )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:797:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.NormalJobStepsItemsAllOf0OneOf1.Value");
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:818:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:818:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:819:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:825:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:831:2: ( (kw= True | kw= False ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:832:2: (kw= True | kw= False )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:832:2: (kw= True | kw= False )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==True) ) {
                alt10=1;
            }
            else if ( (LA10_0==False) ) {
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
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:833:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:839:3: kw= False
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:848:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:848:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:849:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:855:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:861:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:862:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:862:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==Run) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:863:3: this_STRING_0= RULE_STRING
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
                    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:871:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:885:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:885:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:886:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:892:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Run ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:898:2: (kw= Run )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:899:2: kw= Run
            {
            kw=(Token)match(input,Run,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRunKeyword());
              	
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
    // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:907:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:913:2: ( (enumLiteral_0= Null ) )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:914:2: (enumLiteral_0= Null )
            {
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:914:2: (enumLiteral_0= Null )
            // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:915:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser
    public final void synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser_fragment() throws RecognitionException {   
        // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:163:4: ( ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )
        // InternalNormalJobStepsItemsAllOf0OneOf1Parser.g:163:5: ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties
        {
        pushFollow(FOLLOW_2);
        ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser

    // Delegated rules

    public final boolean synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser_fragment(); // can never throw exception
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
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\1\11\1\uffff\1\4\2\0\10\uffff";
    static final String dfa_3s = "\1\17\1\11\1\uffff\1\21\2\0\10\uffff";
    static final String dfa_4s = "\2\uffff\1\2\3\uffff\7\2\1\1";
    static final String dfa_5s = "\1\3\2\uffff\1\2\1\1\1\0\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\2",
            "\1\3",
            "",
            "\1\5\1\14\1\7\1\13\2\uffff\1\6\1\uffff\1\12\2\uffff\1\4\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
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
            return "152:2: (this_NormalJobStepsItemsAllOf0OneOf1Run_0= ruleNormalJobStepsItemsAllOf0OneOf1Run | ( ( ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties )=>this_NormalJobStepsItemsAllOf0OneOf1AdditionalProperties_1= ruleNormalJobStepsItemsAllOf0OneOf1AdditionalProperties ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_5 = input.LA(1);

                         
                        int index3_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 13;}

                        else if ( (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser()) ) {s = 12;}

                         
                        input.seek(index3_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_4 = input.LA(1);

                         
                        int index3_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 13;}

                        else if ( (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser()) ) {s = 12;}

                         
                        input.seek(index3_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA3_3 = input.LA(1);

                         
                        int index3_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_3==RULE_STRING) ) {s = 4;}

                        else if ( (LA3_3==Run) ) {s = 5;}

                        else if ( (LA3_3==LeftSquareBracket) && (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser())) {s = 6;}

                        else if ( (LA3_3==Null) && (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser())) {s = 7;}

                        else if ( (LA3_3==RULE_E_INT) && (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser())) {s = 8;}

                        else if ( (LA3_3==RULE_E_DOUBLE) && (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser())) {s = 9;}

                        else if ( (LA3_3==LeftCurlyBracket) && (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser())) {s = 10;}

                        else if ( (LA3_3==True) && (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser())) {s = 11;}

                        else if ( (LA3_3==False) && (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser())) {s = 12;}

                         
                        input.seek(index3_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==Run) ) {s = 1;}

                        else if ( (LA3_0==RULE_STRING) && (synpred1_InternalNormalJobStepsItemsAllOf0OneOf1Parser())) {s = 2;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000900L});

}
