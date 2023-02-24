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
import githubwf.githubwf.services.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=5;
    public static final int True=6;
    public static final int RULE_STRING=14;
    public static final int False=4;
    public static final int RULE_SL_COMMENT=19;
    public static final int Comma=7;
    public static final int Colon=8;
    public static final int RightCurlyBracket=12;
    public static final int RULE_E_DOUBLE=16;
    public static final int EOF=-1;
    public static final int RightSquareBracket=10;
    public static final int RULE_ID=17;
    public static final int RULE_WS=20;
    public static final int LeftCurlyBracket=11;
    public static final int RULE_E_INT=15;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_INT=13;
    public static final int RULE_ML_COMMENT=18;
    public static final int LeftSquareBracket=9;

    // delegates
    // delegators


        public InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g"; }



     	private ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0GrammarAccess grammarAccess;

        public InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser(TokenStream input, ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0";
       	}

       	@Override
       	protected ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:58:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:58:104: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:59:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:65:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_additionalProperties_1_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) (otherlv_2= Comma ( (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_additionalProperties_1_0 = null;

        EObject lv_additionalProperties_3_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:71:2: ( (otherlv_0= LeftSquareBracket ( (lv_additionalProperties_1_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) (otherlv_2= Comma ( (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:72:2: (otherlv_0= LeftSquareBracket ( (lv_additionalProperties_1_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) (otherlv_2= Comma ( (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:72:2: (otherlv_0= LeftSquareBracket ( (lv_additionalProperties_1_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) (otherlv_2= Comma ( (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) )* otherlv_4= RightSquareBracket )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:73:3: otherlv_0= LeftSquareBracket ( (lv_additionalProperties_1_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) (otherlv_2= Comma ( (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Access().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:77:3: ( (lv_additionalProperties_1_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:78:4: (lv_additionalProperties_1_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:78:4: (lv_additionalProperties_1_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:79:5: lv_additionalProperties_1_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Access().getAdditionalPropertiesReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_additionalProperties_1_0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Rule());
              					}
              					add(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_1_0,
              						"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:96:3: (otherlv_2= Comma ( (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comma) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:97:4: otherlv_2= Comma ( (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Access().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:101:4: ( (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items ) )
            	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:102:5: (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items )
            	    {
            	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:102:5: (lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items )
            	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:103:6: lv_additionalProperties_3_0= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Access().getAdditionalPropertiesReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_additionalProperties_3_0=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Rule());
            	      						}
            	      						add(
            	      							current,
            	      							"additionalProperties",
            	      							lv_additionalProperties_3_0,
            	      							"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items");
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

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Access().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0"


    // $ANTLR start "entryRuleConfigurationAbstract"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:129:1: entryRuleConfigurationAbstract returns [EObject current=null] : iv_ruleConfigurationAbstract= ruleConfigurationAbstract EOF ;
    public final EObject entryRuleConfigurationAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAbstract = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:129:62: (iv_ruleConfigurationAbstract= ruleConfigurationAbstract EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:130:2: iv_ruleConfigurationAbstract= ruleConfigurationAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationAbstract=ruleConfigurationAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationAbstract; 
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
    // $ANTLR end "entryRuleConfigurationAbstract"


    // $ANTLR start "ruleConfigurationAbstract"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:136:1: ruleConfigurationAbstract returns [EObject current=null] : ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull ) ;
    public final EObject ruleConfigurationAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationTypeNumber_0 = null;

        EObject this_ConfigurationTypeString_1 = null;

        EObject this_ConfigurationTypeInteger_2 = null;

        EObject this_ConfigurationTypeBoolean_3 = null;

        EObject this_ConfigurationTypeObject_4 = null;

        EObject this_ConfigurationTypeArray_5 = null;

        EObject this_ConfigurationTypeNull_6 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:142:2: ( ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:143:2: ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:143:2: ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:144:3: ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber )
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:144:3: ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber )
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:145:4: ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNumberParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeNumber_0=ruleConfigurationTypeNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ConfigurationTypeNumber_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:156:3: this_ConfigurationTypeString_1= ruleConfigurationTypeString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeStringParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeString_1=ruleConfigurationTypeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeString_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:165:3: this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeInteger_2=ruleConfigurationTypeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:174:3: this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeBooleanParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeBoolean_3=ruleConfigurationTypeBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:183:3: this_ConfigurationTypeObject_4= ruleConfigurationTypeObject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeObjectParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeObject_4=ruleConfigurationTypeObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeObject_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:192:3: this_ConfigurationTypeArray_5= ruleConfigurationTypeArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeArrayParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeArray_5=ruleConfigurationTypeArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeArray_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:201:3: this_ConfigurationTypeNull_6= ruleConfigurationTypeNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConfigurationAbstractAccess().getConfigurationTypeNullParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConfigurationTypeNull_6=ruleConfigurationTypeNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConfigurationTypeNull_6;
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
    // $ANTLR end "ruleConfigurationAbstract"


    // $ANTLR start "entryRuleConfigurationPropertiesAbstract"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:213:1: entryRuleConfigurationPropertiesAbstract returns [EObject current=null] : iv_ruleConfigurationPropertiesAbstract= ruleConfigurationPropertiesAbstract EOF ;
    public final EObject entryRuleConfigurationPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationPropertiesAbstract = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:213:72: (iv_ruleConfigurationPropertiesAbstract= ruleConfigurationPropertiesAbstract EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:214:2: iv_ruleConfigurationPropertiesAbstract= ruleConfigurationPropertiesAbstract EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationPropertiesAbstractRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationPropertiesAbstract=ruleConfigurationPropertiesAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationPropertiesAbstract; 
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
    // $ANTLR end "entryRuleConfigurationPropertiesAbstract"


    // $ANTLR start "ruleConfigurationPropertiesAbstract"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:220:1: ruleConfigurationPropertiesAbstract returns [EObject current=null] : ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties ) ;
    public final EObject ruleConfigurationPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigurationAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:226:2: ( ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:227:2: ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:227:2: ( ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:228:3: ( ruleConfigurationAdditionalProperties )=>this_ConfigurationAdditionalProperties_0= ruleConfigurationAdditionalProperties
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConfigurationPropertiesAbstractAccess().getConfigurationAdditionalPropertiesParserRuleCall());
              		
            }
            pushFollow(FOLLOW_2);
            this_ConfigurationAdditionalProperties_0=ruleConfigurationAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConfigurationAdditionalProperties_0;
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
    // $ANTLR end "ruleConfigurationPropertiesAbstract"


    // $ANTLR start "entryRuleValue"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:241:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:241:46: (iv_ruleValue= ruleValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:242:2: iv_ruleValue= ruleValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:248:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:254:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:255:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:255:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt3=6;
            switch ( input.LA(1) ) {
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:256:3: this_StringValue_0= ruleStringValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:265:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:274:3: this_NullValue_2= ruleNullValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:283:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:292:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:301:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:313:1: entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items returns [EObject current=null] : iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items EOF ;
    public final EObject entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:313:109: (iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:314:2: iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items= ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items=ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items"


    // $ANTLR start "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:320:1: ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items returns [EObject current=null] : ( (lv_items_0_0= ruleConfiguration ) ) ;
    public final EObject ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:326:2: ( ( (lv_items_0_0= ruleConfiguration ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:327:2: ( (lv_items_0_0= ruleConfiguration ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:327:2: ( (lv_items_0_0= ruleConfiguration ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:328:3: (lv_items_0_0= ruleConfiguration )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:328:3: (lv_items_0_0= ruleConfiguration )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:329:4: lv_items_0_0= ruleConfiguration
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsAccess().getItemsConfigurationParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.Configuration");
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
    // $ANTLR end "ruleReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items"


    // $ANTLR start "entryRuleConfiguration"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:349:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:349:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:350:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfiguration; 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:356:1: ruleConfiguration returns [EObject current=null] : ( (lv_configuration_0_0= ruleConfigurationAbstract ) ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:362:2: ( ( (lv_configuration_0_0= ruleConfigurationAbstract ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:363:2: ( (lv_configuration_0_0= ruleConfigurationAbstract ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:363:2: ( (lv_configuration_0_0= ruleConfigurationAbstract ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:364:3: (lv_configuration_0_0= ruleConfigurationAbstract )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:364:3: (lv_configuration_0_0= ruleConfigurationAbstract )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:365:4: lv_configuration_0_0= ruleConfigurationAbstract
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationAccess().getConfigurationConfigurationAbstractParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleConfigurationAbstract();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.ConfigurationAbstract");
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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleConfigurationTypeString"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:385:1: entryRuleConfigurationTypeString returns [EObject current=null] : iv_ruleConfigurationTypeString= ruleConfigurationTypeString EOF ;
    public final EObject entryRuleConfigurationTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeString = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:385:64: (iv_ruleConfigurationTypeString= ruleConfigurationTypeString EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:386:2: iv_ruleConfigurationTypeString= ruleConfigurationTypeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeString=ruleConfigurationTypeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeString; 
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
    // $ANTLR end "entryRuleConfigurationTypeString"


    // $ANTLR start "ruleConfigurationTypeString"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:392:1: ruleConfigurationTypeString returns [EObject current=null] : ( (lv_configuration_0_0= ruleEString ) ) ;
    public final EObject ruleConfigurationTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:398:2: ( ( (lv_configuration_0_0= ruleEString ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:399:2: ( (lv_configuration_0_0= ruleEString ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:399:2: ( (lv_configuration_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:400:3: (lv_configuration_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:400:3: (lv_configuration_0_0= ruleEString )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:401:4: lv_configuration_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeStringAccess().getConfigurationEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeStringRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.EString");
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
    // $ANTLR end "ruleConfigurationTypeString"


    // $ANTLR start "entryRuleConfigurationTypeInteger"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:421:1: entryRuleConfigurationTypeInteger returns [EObject current=null] : iv_ruleConfigurationTypeInteger= ruleConfigurationTypeInteger EOF ;
    public final EObject entryRuleConfigurationTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeInteger = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:421:65: (iv_ruleConfigurationTypeInteger= ruleConfigurationTypeInteger EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:422:2: iv_ruleConfigurationTypeInteger= ruleConfigurationTypeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeInteger=ruleConfigurationTypeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeInteger; 
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
    // $ANTLR end "entryRuleConfigurationTypeInteger"


    // $ANTLR start "ruleConfigurationTypeInteger"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:428:1: ruleConfigurationTypeInteger returns [EObject current=null] : ( (lv_configuration_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleConfigurationTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:434:2: ( ( (lv_configuration_0_0= ruleEDoubleObject ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:435:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:435:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:436:3: (lv_configuration_0_0= ruleEDoubleObject )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:436:3: (lv_configuration_0_0= ruleEDoubleObject )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:437:4: lv_configuration_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeIntegerAccess().getConfigurationEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeIntegerRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.EDoubleObject");
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
    // $ANTLR end "ruleConfigurationTypeInteger"


    // $ANTLR start "entryRuleConfigurationTypeNumber"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:457:1: entryRuleConfigurationTypeNumber returns [EObject current=null] : iv_ruleConfigurationTypeNumber= ruleConfigurationTypeNumber EOF ;
    public final EObject entryRuleConfigurationTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeNumber = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:457:64: (iv_ruleConfigurationTypeNumber= ruleConfigurationTypeNumber EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:458:2: iv_ruleConfigurationTypeNumber= ruleConfigurationTypeNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeNumber=ruleConfigurationTypeNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeNumber; 
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
    // $ANTLR end "entryRuleConfigurationTypeNumber"


    // $ANTLR start "ruleConfigurationTypeNumber"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:464:1: ruleConfigurationTypeNumber returns [EObject current=null] : ( (lv_configuration_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleConfigurationTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:470:2: ( ( (lv_configuration_0_0= ruleEDoubleObject ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:471:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:471:2: ( (lv_configuration_0_0= ruleEDoubleObject ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:472:3: (lv_configuration_0_0= ruleEDoubleObject )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:472:3: (lv_configuration_0_0= ruleEDoubleObject )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:473:4: lv_configuration_0_0= ruleEDoubleObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeNumberAccess().getConfigurationEDoubleObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEDoubleObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeNumberRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.EDoubleObject");
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
    // $ANTLR end "ruleConfigurationTypeNumber"


    // $ANTLR start "entryRuleConfigurationTypeBoolean"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:493:1: entryRuleConfigurationTypeBoolean returns [EObject current=null] : iv_ruleConfigurationTypeBoolean= ruleConfigurationTypeBoolean EOF ;
    public final EObject entryRuleConfigurationTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeBoolean = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:493:65: (iv_ruleConfigurationTypeBoolean= ruleConfigurationTypeBoolean EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:494:2: iv_ruleConfigurationTypeBoolean= ruleConfigurationTypeBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeBoolean=ruleConfigurationTypeBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeBoolean; 
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
    // $ANTLR end "entryRuleConfigurationTypeBoolean"


    // $ANTLR start "ruleConfigurationTypeBoolean"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:500:1: ruleConfigurationTypeBoolean returns [EObject current=null] : ( (lv_configuration_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleConfigurationTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:506:2: ( ( (lv_configuration_0_0= ruleEBooleanObject ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:507:2: ( (lv_configuration_0_0= ruleEBooleanObject ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:507:2: ( (lv_configuration_0_0= ruleEBooleanObject ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:508:3: (lv_configuration_0_0= ruleEBooleanObject )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:508:3: (lv_configuration_0_0= ruleEBooleanObject )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:509:4: lv_configuration_0_0= ruleEBooleanObject
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeBooleanAccess().getConfigurationEBooleanObjectParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleEBooleanObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeBooleanRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.EBooleanObject");
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
    // $ANTLR end "ruleConfigurationTypeBoolean"


    // $ANTLR start "entryRuleConfigurationTypeObject"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:529:1: entryRuleConfigurationTypeObject returns [EObject current=null] : iv_ruleConfigurationTypeObject= ruleConfigurationTypeObject EOF ;
    public final EObject entryRuleConfigurationTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeObject = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:529:64: (iv_ruleConfigurationTypeObject= ruleConfigurationTypeObject EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:530:2: iv_ruleConfigurationTypeObject= ruleConfigurationTypeObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeObject=ruleConfigurationTypeObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeObject; 
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
    // $ANTLR end "entryRuleConfigurationTypeObject"


    // $ANTLR start "ruleConfigurationTypeObject"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:536:1: ruleConfigurationTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleConfigurationTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_configuration_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:542:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:543:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:543:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:544:3: () otherlv_1= LeftCurlyBracket ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:544:3: ()
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:545:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigurationTypeObjectAccess().getConfigurationTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:555:3: ( ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:556:4: ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )*
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:556:4: ( (lv_configuration_2_0= ruleConfigurationPropertiesAbstract ) )
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:557:5: (lv_configuration_2_0= ruleConfigurationPropertiesAbstract )
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:557:5: (lv_configuration_2_0= ruleConfigurationPropertiesAbstract )
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:558:6: lv_configuration_2_0= ruleConfigurationPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_configuration_2_0=ruleConfigurationPropertiesAbstract();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConfigurationTypeObjectRule());
                      						}
                      						add(
                      							current,
                      							"configuration",
                      							lv_configuration_2_0,
                      							"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.ConfigurationPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:575:4: (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:576:5: otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getConfigurationTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:580:5: ( (lv_configuration_4_0= ruleConfigurationPropertiesAbstract ) )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:581:6: (lv_configuration_4_0= ruleConfigurationPropertiesAbstract )
                    	    {
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:581:6: (lv_configuration_4_0= ruleConfigurationPropertiesAbstract )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:582:7: lv_configuration_4_0= ruleConfigurationPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationTypeObjectAccess().getConfigurationConfigurationPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_configuration_4_0=ruleConfigurationPropertiesAbstract();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConfigurationTypeObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"configuration",
                    	      								lv_configuration_4_0,
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.ConfigurationPropertiesAbstract");
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

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConfigurationTypeObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleConfigurationTypeObject"


    // $ANTLR start "entryRuleConfigurationTypeArray"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:609:1: entryRuleConfigurationTypeArray returns [EObject current=null] : iv_ruleConfigurationTypeArray= ruleConfigurationTypeArray EOF ;
    public final EObject entryRuleConfigurationTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeArray = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:609:63: (iv_ruleConfigurationTypeArray= ruleConfigurationTypeArray EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:610:2: iv_ruleConfigurationTypeArray= ruleConfigurationTypeArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeArray=ruleConfigurationTypeArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeArray; 
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
    // $ANTLR end "entryRuleConfigurationTypeArray"


    // $ANTLR start "ruleConfigurationTypeArray"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:616:1: ruleConfigurationTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleConfigurationTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_configuration_2_0 = null;

        EObject lv_configuration_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:622:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:623:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:623:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:624:3: () otherlv_1= LeftSquareBracket ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:624:3: ()
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:625:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConfigurationTypeArrayAccess().getConfigurationTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:635:3: ( ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=False && LA7_0<=True)||LA7_0==LeftSquareBracket||LA7_0==LeftCurlyBracket||(LA7_0>=RULE_STRING && LA7_0<=RULE_E_DOUBLE)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:636:4: ( (lv_configuration_2_0= ruleConfigurationItems ) ) (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )*
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:636:4: ( (lv_configuration_2_0= ruleConfigurationItems ) )
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:637:5: (lv_configuration_2_0= ruleConfigurationItems )
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:637:5: (lv_configuration_2_0= ruleConfigurationItems )
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:638:6: lv_configuration_2_0= ruleConfigurationItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_configuration_2_0=ruleConfigurationItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConfigurationTypeArrayRule());
                      						}
                      						add(
                      							current,
                      							"configuration",
                      							lv_configuration_2_0,
                      							"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.ConfigurationItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:655:4: (otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:656:5: otherlv_3= Comma ( (lv_configuration_4_0= ruleConfigurationItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getConfigurationTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:660:5: ( (lv_configuration_4_0= ruleConfigurationItems ) )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:661:6: (lv_configuration_4_0= ruleConfigurationItems )
                    	    {
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:661:6: (lv_configuration_4_0= ruleConfigurationItems )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:662:7: lv_configuration_4_0= ruleConfigurationItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getConfigurationTypeArrayAccess().getConfigurationConfigurationItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
                    	    lv_configuration_4_0=ruleConfigurationItems();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getConfigurationTypeArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"configuration",
                    	      								lv_configuration_4_0,
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.ConfigurationItems");
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

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getConfigurationTypeArrayAccess().getRightSquareBracketKeyword_3());
              		
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
    // $ANTLR end "ruleConfigurationTypeArray"


    // $ANTLR start "entryRuleConfigurationTypeNull"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:689:1: entryRuleConfigurationTypeNull returns [EObject current=null] : iv_ruleConfigurationTypeNull= ruleConfigurationTypeNull EOF ;
    public final EObject entryRuleConfigurationTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationTypeNull = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:689:62: (iv_ruleConfigurationTypeNull= ruleConfigurationTypeNull EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:690:2: iv_ruleConfigurationTypeNull= ruleConfigurationTypeNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationTypeNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationTypeNull=ruleConfigurationTypeNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationTypeNull; 
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
    // $ANTLR end "entryRuleConfigurationTypeNull"


    // $ANTLR start "ruleConfigurationTypeNull"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:696:1: ruleConfigurationTypeNull returns [EObject current=null] : ( (lv_configuration_0_0= ruleNullValue ) ) ;
    public final EObject ruleConfigurationTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:702:2: ( ( (lv_configuration_0_0= ruleNullValue ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:703:2: ( (lv_configuration_0_0= ruleNullValue ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:703:2: ( (lv_configuration_0_0= ruleNullValue ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:704:3: (lv_configuration_0_0= ruleNullValue )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:704:3: (lv_configuration_0_0= ruleNullValue )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:705:4: lv_configuration_0_0= ruleNullValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationTypeNullAccess().getConfigurationNullValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_configuration_0_0=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationTypeNullRule());
              				}
              				set(
              					current,
              					"configuration",
              					lv_configuration_0_0,
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.NullValue");
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
    // $ANTLR end "ruleConfigurationTypeNull"


    // $ANTLR start "entryRuleEString"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:725:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:725:47: (iv_ruleEString= ruleEString EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:726:2: iv_ruleEString= ruleEString EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:732:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:738:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:739:2: this_VALID_STRING_0= ruleVALID_STRING
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


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:752:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:752:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:753:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:759:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:765:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:766:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:766:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:767:3: this_E_INT_0= RULE_E_INT
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:775:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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


    // $ANTLR start "entryRuleEBooleanObject"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:786:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:786:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:787:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:793:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:799:2: ( (kw= True | kw= False ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:800:2: (kw= True | kw= False )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:800:2: (kw= True | kw= False )
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:801:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:807:3: kw= False
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


    // $ANTLR start "entryRuleConfigurationAdditionalProperties"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:816:1: entryRuleConfigurationAdditionalProperties returns [EObject current=null] : iv_ruleConfigurationAdditionalProperties= ruleConfigurationAdditionalProperties EOF ;
    public final EObject entryRuleConfigurationAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationAdditionalProperties = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:816:74: (iv_ruleConfigurationAdditionalProperties= ruleConfigurationAdditionalProperties EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:817:2: iv_ruleConfigurationAdditionalProperties= ruleConfigurationAdditionalProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationAdditionalPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationAdditionalProperties=ruleConfigurationAdditionalProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationAdditionalProperties; 
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
    // $ANTLR end "entryRuleConfigurationAdditionalProperties"


    // $ANTLR start "ruleConfigurationAdditionalProperties"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:823:1: ruleConfigurationAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleConfigurationAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:829:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:830:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:830:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:831:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:831:3: ( (lv_key_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:832:4: (lv_key_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:832:4: (lv_key_0_0= ruleEString )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:833:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_key_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"key",
              						lv_key_0_0,
              						"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConfigurationAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:854:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:855:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:855:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:856:5: lv_additionalProperties_2_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConfigurationAdditionalPropertiesAccess().getAdditionalPropertiesJsonDocumentParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_additionalProperties_2_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConfigurationAdditionalPropertiesRule());
              					}
              					set(
              						current,
              						"additionalProperties",
              						lv_additionalProperties_2_0,
              						"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.JsonDocument");
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
    // $ANTLR end "ruleConfigurationAdditionalProperties"


    // $ANTLR start "entryRuleJsonDocument"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:877:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:877:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:878:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:884:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:890:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:891:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:891:2: ( (lv_value_0_0= ruleValue ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:892:3: (lv_value_0_0= ruleValue )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:892:3: (lv_value_0_0= ruleValue )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:893:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.Value");
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:913:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:913:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:914:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:920:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:926:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:927:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:927:2: ( (lv_value_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:928:3: (lv_value_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:928:3: (lv_value_0_0= ruleEString )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:929:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.EString");
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:949:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:949:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:950:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:956:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:962:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:963:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:963:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:964:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:964:3: ()
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:965:4: 
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
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:975:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=False && LA11_0<=True)||LA11_0==LeftSquareBracket||LA11_0==LeftCurlyBracket||(LA11_0>=RULE_STRING && LA11_0<=RULE_E_DOUBLE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:976:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:976:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:977:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:977:5: (lv_value_2_0= ruleValue )
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:978:6: lv_value_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
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
                      							"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:995:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:996:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1000:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1001:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1001:6: (lv_value_4_0= ruleValue )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1002:7: lv_value_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArrayValueAccess().getValueValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_4);
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
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1029:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1029:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1030:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1036:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1042:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1043:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1043:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1044:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1044:3: (lv_value_0_0= ruleNullEnum )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1045:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.NullEnum");
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1065:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1065:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1066:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1072:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1078:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1079:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1079:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1080:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1080:3: (lv_value_0_0= ruleEDouble )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1081:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.EDouble");
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1101:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1101:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1102:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1108:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1114:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1115:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1115:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1116:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1116:3: ()
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1117:4: 
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
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1127:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1128:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1128:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1129:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1129:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1130:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1147:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1148:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1152:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1153:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1153:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1154:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.KeyValuePair");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1181:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1181:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1182:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1188:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1194:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1195:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1195:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1196:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1196:3: (lv_value_0_0= ruleEBoolean )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1197:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.EBoolean");
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1217:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1217:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1218:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1224:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1230:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1231:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1231:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_E_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_E_DOUBLE) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1232:3: this_E_INT_0= RULE_E_INT
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
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1240:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1251:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1251:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1252:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1258:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1264:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1265:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1265:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1266:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1266:3: ( (lv_key_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1267:4: (lv_key_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1267:4: (lv_key_0_0= ruleEString )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1268:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
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
              						"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1289:3: ( (lv_value_2_0= ruleValue ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1290:4: (lv_value_2_0= ruleValue )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1290:4: (lv_value_2_0= ruleValue )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1291:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.Value");
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1312:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1312:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1313:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1319:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1325:2: ( (kw= True | kw= False ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1326:2: (kw= True | kw= False )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1326:2: (kw= True | kw= False )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==True) ) {
                alt15=1;
            }
            else if ( (LA15_0==False) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1327:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1333:3: kw= False
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


    // $ANTLR start "entryRuleConfigurationItems"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1342:1: entryRuleConfigurationItems returns [EObject current=null] : iv_ruleConfigurationItems= ruleConfigurationItems EOF ;
    public final EObject entryRuleConfigurationItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationItems = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1342:59: (iv_ruleConfigurationItems= ruleConfigurationItems EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1343:2: iv_ruleConfigurationItems= ruleConfigurationItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfigurationItemsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationItems=ruleConfigurationItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConfigurationItems; 
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
    // $ANTLR end "entryRuleConfigurationItems"


    // $ANTLR start "ruleConfigurationItems"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1349:1: ruleConfigurationItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleConfigurationItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1355:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1356:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1356:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1357:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1357:3: (lv_items_0_0= ruleJsonDocument )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1358:4: lv_items_0_0= ruleJsonDocument
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConfigurationItemsAccess().getItemsJsonDocumentParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_items_0_0=ruleJsonDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConfigurationItemsRule());
              				}
              				set(
              					current,
              					"items",
              					lv_items_0_0,
              					"githubwf.githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0.JsonDocument");
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
    // $ANTLR end "ruleConfigurationItems"


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1378:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1378:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1379:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1385:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1391:2: (this_STRING_0= RULE_STRING )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1392:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getVALID_STRINGAccess().getSTRINGTerminalRuleCall());
              	
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


    // $ANTLR start "ruleNullEnum"
    // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1402:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1408:2: ( (enumLiteral_0= Null ) )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1409:2: (enumLiteral_0= Null )
            {
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1409:2: (enumLiteral_0= Null )
            // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:1410:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser
    public final void synpred1_InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser_fragment() throws RecognitionException {   
        // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:145:4: ( ruleConfigurationTypeNumber )
        // InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser.g:145:5: ruleConfigurationTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleConfigurationTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser

    // Delegated rules

    public final boolean synpred1_InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\0\7\uffff";
    static final String dfa_3s = "\1\20\2\0\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_5s = "\1\uffff\1\1\1\0\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "143:2: ( ( ( ruleConfigurationTypeNumber )=>this_ConfigurationTypeNumber_0= ruleConfigurationTypeNumber ) | this_ConfigurationTypeString_1= ruleConfigurationTypeString | this_ConfigurationTypeInteger_2= ruleConfigurationTypeInteger | this_ConfigurationTypeBoolean_3= ruleConfigurationTypeBoolean | this_ConfigurationTypeObject_4= ruleConfigurationTypeObject | this_ConfigurationTypeArray_5= ruleConfigurationTypeArray | this_ConfigurationTypeNull_6= ruleConfigurationTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001CA70L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001CE70L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});

}
