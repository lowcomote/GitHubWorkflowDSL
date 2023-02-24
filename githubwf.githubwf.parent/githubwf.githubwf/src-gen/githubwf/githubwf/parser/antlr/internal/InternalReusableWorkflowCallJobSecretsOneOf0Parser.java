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
import githubwf.githubwf.services.ReusableWorkflowCallJobSecretsOneOf0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalReusableWorkflowCallJobSecretsOneOf0Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Secrets", "False", "Null", "True", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_STRING", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Null=6;
    public static final int Secrets=4;
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
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=19;
    public static final int LeftSquareBracket=10;

    // delegates
    // delegators


        public InternalReusableWorkflowCallJobSecretsOneOf0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReusableWorkflowCallJobSecretsOneOf0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReusableWorkflowCallJobSecretsOneOf0Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalReusableWorkflowCallJobSecretsOneOf0Parser.g"; }



     	private ReusableWorkflowCallJobSecretsOneOf0GrammarAccess grammarAccess;

        public InternalReusableWorkflowCallJobSecretsOneOf0Parser(TokenStream input, ReusableWorkflowCallJobSecretsOneOf0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ReusableWorkflowCallJobSecretsOneOf0";
       	}

       	@Override
       	protected ReusableWorkflowCallJobSecretsOneOf0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleReusableWorkflowCallJobSecretsOneOf0"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:58:1: entryRuleReusableWorkflowCallJobSecretsOneOf0 returns [EObject current=null] : iv_ruleReusableWorkflowCallJobSecretsOneOf0= ruleReusableWorkflowCallJobSecretsOneOf0 EOF ;
    public final EObject entryRuleReusableWorkflowCallJobSecretsOneOf0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReusableWorkflowCallJobSecretsOneOf0 = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:58:77: (iv_ruleReusableWorkflowCallJobSecretsOneOf0= ruleReusableWorkflowCallJobSecretsOneOf0 EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:59:2: iv_ruleReusableWorkflowCallJobSecretsOneOf0= ruleReusableWorkflowCallJobSecretsOneOf0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsOneOf0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReusableWorkflowCallJobSecretsOneOf0=ruleReusableWorkflowCallJobSecretsOneOf0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReusableWorkflowCallJobSecretsOneOf0; 
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
    // $ANTLR end "entryRuleReusableWorkflowCallJobSecretsOneOf0"


    // $ANTLR start "ruleReusableWorkflowCallJobSecretsOneOf0"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:65:1: ruleReusableWorkflowCallJobSecretsOneOf0 returns [EObject current=null] : (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEnv ) ) ) ;
    public final EObject ruleReusableWorkflowCallJobSecretsOneOf0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_secrets_2_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:71:2: ( (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEnv ) ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:72:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEnv ) ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:72:2: (otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEnv ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:73:3: otherlv_0= Secrets otherlv_1= Colon ( (lv_secrets_2_0= ruleEnv ) )
            {
            otherlv_0=(Token)match(input,Secrets,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReusableWorkflowCallJobSecretsOneOf0Access().getSecretsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReusableWorkflowCallJobSecretsOneOf0Access().getColonKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:81:3: ( (lv_secrets_2_0= ruleEnv ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:82:4: (lv_secrets_2_0= ruleEnv )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:82:4: (lv_secrets_2_0= ruleEnv )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:83:5: lv_secrets_2_0= ruleEnv
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReusableWorkflowCallJobSecretsOneOf0Access().getSecretsEnvParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_secrets_2_0=ruleEnv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReusableWorkflowCallJobSecretsOneOf0Rule());
              					}
              					set(
              						current,
              						"secrets",
              						lv_secrets_2_0,
              						"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.Env");
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
    // $ANTLR end "ruleReusableWorkflowCallJobSecretsOneOf0"


    // $ANTLR start "entryRuleEnvAbstract"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:104:1: entryRuleEnvAbstract returns [EObject current=null] : iv_ruleEnvAbstract= ruleEnvAbstract EOF ;
    public final EObject entryRuleEnvAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAbstract = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:104:52: (iv_ruleEnvAbstract= ruleEnvAbstract EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:105:2: iv_ruleEnvAbstract= ruleEnvAbstract EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:111:1: ruleEnvAbstract returns [EObject current=null] : ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) ;
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
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:117:2: ( ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:118:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:118:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:119:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    {
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:119:3: ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber )
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:120:4: ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:131:3: this_EnvTypeString_1= ruleEnvTypeString
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:140:3: this_EnvTypeInteger_2= ruleEnvTypeInteger
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:149:3: this_EnvTypeBoolean_3= ruleEnvTypeBoolean
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:158:3: this_EnvTypeObject_4= ruleEnvTypeObject
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:167:3: this_EnvTypeArray_5= ruleEnvTypeArray
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:176:3: this_EnvTypeNull_6= ruleEnvTypeNull
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:188:1: entryRuleEnvPropertiesAbstract returns [EObject current=null] : iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF ;
    public final EObject entryRuleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvPropertiesAbstract = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:188:62: (iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:189:2: iv_ruleEnvPropertiesAbstract= ruleEnvPropertiesAbstract EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:195:1: ruleEnvPropertiesAbstract returns [EObject current=null] : ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) ;
    public final EObject ruleEnvPropertiesAbstract() throws RecognitionException {
        EObject current = null;

        EObject this_EnvAdditionalProperties_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:201:2: ( ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:202:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:202:2: ( ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:203:3: ( ruleEnvAdditionalProperties )=>this_EnvAdditionalProperties_0= ruleEnvAdditionalProperties
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


    // $ANTLR start "entryRuleValue"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:216:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:216:46: (iv_ruleValue= ruleValue EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:217:2: iv_ruleValue= ruleValue EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:223:1: ruleValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) ;
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
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:229:2: ( (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:230:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:230:2: (this_StringValue_0= ruleStringValue | this_ArrayValue_1= ruleArrayValue | this_NullValue_2= ruleNullValue | this_NumberValue_3= ruleNumberValue | this_ObjectValue_4= ruleObjectValue | this_BooleanValue_5= ruleBooleanValue )
            int alt2=6;
            switch ( input.LA(1) ) {
            case Secrets:
            case RULE_STRING:
                {
                alt2=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt2=2;
                }
                break;
            case Null:
                {
                alt2=3;
                }
                break;
            case RULE_E_INT:
            case RULE_E_DOUBLE:
                {
                alt2=4;
                }
                break;
            case LeftCurlyBracket:
                {
                alt2=5;
                }
                break;
            case False:
            case True:
                {
                alt2=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:231:3: this_StringValue_0= ruleStringValue
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:240:3: this_ArrayValue_1= ruleArrayValue
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:249:3: this_NullValue_2= ruleNullValue
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:258:3: this_NumberValue_3= ruleNumberValue
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:267:3: this_ObjectValue_4= ruleObjectValue
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:276:3: this_BooleanValue_5= ruleBooleanValue
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


    // $ANTLR start "entryRuleEnv"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:288:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:288:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:289:2: iv_ruleEnv= ruleEnv EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:295:1: ruleEnv returns [EObject current=null] : ( (lv_env_0_0= ruleEnvAbstract ) ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:301:2: ( ( (lv_env_0_0= ruleEnvAbstract ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:302:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:302:2: ( (lv_env_0_0= ruleEnvAbstract ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:303:3: (lv_env_0_0= ruleEnvAbstract )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:303:3: (lv_env_0_0= ruleEnvAbstract )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:304:4: lv_env_0_0= ruleEnvAbstract
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EnvAbstract");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:324:1: entryRuleEnvTypeString returns [EObject current=null] : iv_ruleEnvTypeString= ruleEnvTypeString EOF ;
    public final EObject entryRuleEnvTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeString = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:324:54: (iv_ruleEnvTypeString= ruleEnvTypeString EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:325:2: iv_ruleEnvTypeString= ruleEnvTypeString EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:331:1: ruleEnvTypeString returns [EObject current=null] : ( (lv_env_0_0= ruleEString ) ) ;
    public final EObject ruleEnvTypeString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:337:2: ( ( (lv_env_0_0= ruleEString ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:338:2: ( (lv_env_0_0= ruleEString ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:338:2: ( (lv_env_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:339:3: (lv_env_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:339:3: (lv_env_0_0= ruleEString )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:340:4: lv_env_0_0= ruleEString
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EString");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:360:1: entryRuleEnvTypeInteger returns [EObject current=null] : iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF ;
    public final EObject entryRuleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeInteger = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:360:55: (iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:361:2: iv_ruleEnvTypeInteger= ruleEnvTypeInteger EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:367:1: ruleEnvTypeInteger returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:373:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:374:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:374:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:375:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:375:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:376:4: lv_env_0_0= ruleEDoubleObject
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EDoubleObject");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:396:1: entryRuleEnvTypeNumber returns [EObject current=null] : iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF ;
    public final EObject entryRuleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNumber = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:396:54: (iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:397:2: iv_ruleEnvTypeNumber= ruleEnvTypeNumber EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:403:1: ruleEnvTypeNumber returns [EObject current=null] : ( (lv_env_0_0= ruleEDoubleObject ) ) ;
    public final EObject ruleEnvTypeNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:409:2: ( ( (lv_env_0_0= ruleEDoubleObject ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:410:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:410:2: ( (lv_env_0_0= ruleEDoubleObject ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:411:3: (lv_env_0_0= ruleEDoubleObject )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:411:3: (lv_env_0_0= ruleEDoubleObject )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:412:4: lv_env_0_0= ruleEDoubleObject
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EDoubleObject");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:432:1: entryRuleEnvTypeBoolean returns [EObject current=null] : iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF ;
    public final EObject entryRuleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeBoolean = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:432:55: (iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:433:2: iv_ruleEnvTypeBoolean= ruleEnvTypeBoolean EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:439:1: ruleEnvTypeBoolean returns [EObject current=null] : ( (lv_env_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleEnvTypeBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:445:2: ( ( (lv_env_0_0= ruleEBooleanObject ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:446:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:446:2: ( (lv_env_0_0= ruleEBooleanObject ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:447:3: (lv_env_0_0= ruleEBooleanObject )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:447:3: (lv_env_0_0= ruleEBooleanObject )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:448:4: lv_env_0_0= ruleEBooleanObject
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EBooleanObject");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:468:1: entryRuleEnvTypeObject returns [EObject current=null] : iv_ruleEnvTypeObject= ruleEnvTypeObject EOF ;
    public final EObject entryRuleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeObject = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:468:54: (iv_ruleEnvTypeObject= ruleEnvTypeObject EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:469:2: iv_ruleEnvTypeObject= ruleEnvTypeObject EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:475:1: ruleEnvTypeObject returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleEnvTypeObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:481:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:482:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:482:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:483:3: () otherlv_1= LeftCurlyBracket ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:483:3: ()
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:484:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvTypeObjectAccess().getEnvTypeObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvTypeObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:494:3: ( ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Secrets||LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:495:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    {
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:495:4: ( (lv_env_2_0= ruleEnvPropertiesAbstract ) )
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:496:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    {
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:496:5: (lv_env_2_0= ruleEnvPropertiesAbstract )
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:497:6: lv_env_2_0= ruleEnvPropertiesAbstract
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvTypeObjectAccess().getEnvEnvPropertiesAbstractParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
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
                      							"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EnvPropertiesAbstract");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:514:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Comma) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:515:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:519:5: ( (lv_env_4_0= ruleEnvPropertiesAbstract ) )
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:520:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    {
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:520:6: (lv_env_4_0= ruleEnvPropertiesAbstract )
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:521:7: lv_env_4_0= ruleEnvPropertiesAbstract
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvTypeObjectAccess().getEnvEnvPropertiesAbstractParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_6);
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
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EnvPropertiesAbstract");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:548:1: entryRuleEnvTypeArray returns [EObject current=null] : iv_ruleEnvTypeArray= ruleEnvTypeArray EOF ;
    public final EObject entryRuleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeArray = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:548:53: (iv_ruleEnvTypeArray= ruleEnvTypeArray EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:549:2: iv_ruleEnvTypeArray= ruleEnvTypeArray EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:555:1: ruleEnvTypeArray returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleEnvTypeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_env_2_0 = null;

        EObject lv_env_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:561:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:562:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:562:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:563:3: () otherlv_1= LeftSquareBracket ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:563:3: ()
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:564:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnvTypeArrayAccess().getEnvTypeArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvTypeArrayAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:574:3: ( ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=Secrets && LA6_0<=True)||LA6_0==LeftSquareBracket||LA6_0==LeftCurlyBracket||(LA6_0>=RULE_STRING && LA6_0<=RULE_E_DOUBLE)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:575:4: ( (lv_env_2_0= ruleEnvItems ) ) (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    {
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:575:4: ( (lv_env_2_0= ruleEnvItems ) )
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:576:5: (lv_env_2_0= ruleEnvItems )
                    {
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:576:5: (lv_env_2_0= ruleEnvItems )
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:577:6: lv_env_2_0= ruleEnvItems
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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
                      							"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EnvItems");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:594:4: (otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==Comma) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:595:5: otherlv_3= Comma ( (lv_env_4_0= ruleEnvItems ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getEnvTypeArrayAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:599:5: ( (lv_env_4_0= ruleEnvItems ) )
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:600:6: (lv_env_4_0= ruleEnvItems )
                    	    {
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:600:6: (lv_env_4_0= ruleEnvItems )
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:601:7: lv_env_4_0= ruleEnvItems
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEnvTypeArrayAccess().getEnvEnvItemsParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EnvItems");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:628:1: entryRuleEnvTypeNull returns [EObject current=null] : iv_ruleEnvTypeNull= ruleEnvTypeNull EOF ;
    public final EObject entryRuleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvTypeNull = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:628:52: (iv_ruleEnvTypeNull= ruleEnvTypeNull EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:629:2: iv_ruleEnvTypeNull= ruleEnvTypeNull EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:635:1: ruleEnvTypeNull returns [EObject current=null] : ( (lv_env_0_0= ruleNullValue ) ) ;
    public final EObject ruleEnvTypeNull() throws RecognitionException {
        EObject current = null;

        EObject lv_env_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:641:2: ( ( (lv_env_0_0= ruleNullValue ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:642:2: ( (lv_env_0_0= ruleNullValue ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:642:2: ( (lv_env_0_0= ruleNullValue ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:643:3: (lv_env_0_0= ruleNullValue )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:643:3: (lv_env_0_0= ruleNullValue )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:644:4: lv_env_0_0= ruleNullValue
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.NullValue");
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


    // $ANTLR start "entryRuleEString"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:664:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:664:47: (iv_ruleEString= ruleEString EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:665:2: iv_ruleEString= ruleEString EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:671:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_VALID_STRING_0= ruleVALID_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VALID_STRING_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:677:2: (this_VALID_STRING_0= ruleVALID_STRING )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:678:2: this_VALID_STRING_0= ruleVALID_STRING
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:691:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:691:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:692:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:698:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:704:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:705:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:705:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_E_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_E_DOUBLE) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:706:3: this_E_INT_0= RULE_E_INT
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:714:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:725:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:725:54: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:726:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:732:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:738:2: ( (kw= True | kw= False ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:739:2: (kw= True | kw= False )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:739:2: (kw= True | kw= False )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==True) ) {
                alt8=1;
            }
            else if ( (LA8_0==False) ) {
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:740:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:746:3: kw= False
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


    // $ANTLR start "entryRuleEnvAdditionalProperties"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:755:1: entryRuleEnvAdditionalProperties returns [EObject current=null] : iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF ;
    public final EObject entryRuleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvAdditionalProperties = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:755:64: (iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:756:2: iv_ruleEnvAdditionalProperties= ruleEnvAdditionalProperties EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:762:1: ruleEnvAdditionalProperties returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) ;
    public final EObject ruleEnvAdditionalProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_additionalProperties_2_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:768:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:769:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:769:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:770:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:770:3: ( (lv_key_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:771:4: (lv_key_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:771:4: (lv_key_0_0= ruleEString )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:772:5: lv_key_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnvAdditionalPropertiesAccess().getKeyEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
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
              						"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnvAdditionalPropertiesAccess().getColonKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:793:3: ( (lv_additionalProperties_2_0= ruleJsonDocument ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:794:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:794:4: (lv_additionalProperties_2_0= ruleJsonDocument )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:795:5: lv_additionalProperties_2_0= ruleJsonDocument
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
              						"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.JsonDocument");
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


    // $ANTLR start "entryRuleJsonDocument"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:816:1: entryRuleJsonDocument returns [EObject current=null] : iv_ruleJsonDocument= ruleJsonDocument EOF ;
    public final EObject entryRuleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonDocument = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:816:53: (iv_ruleJsonDocument= ruleJsonDocument EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:817:2: iv_ruleJsonDocument= ruleJsonDocument EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:823:1: ruleJsonDocument returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleJsonDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:829:2: ( ( (lv_value_0_0= ruleValue ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:830:2: ( (lv_value_0_0= ruleValue ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:830:2: ( (lv_value_0_0= ruleValue ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:831:3: (lv_value_0_0= ruleValue )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:831:3: (lv_value_0_0= ruleValue )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:832:4: lv_value_0_0= ruleValue
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.Value");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:852:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:852:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:853:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:859:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:865:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:866:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:866:2: ( (lv_value_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:867:3: (lv_value_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:867:3: (lv_value_0_0= ruleEString )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:868:4: lv_value_0_0= ruleEString
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EString");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:888:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:888:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:889:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:895:1: ruleArrayValue returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:901:2: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:902:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:902:2: ( () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:903:3: () otherlv_1= LeftSquareBracket ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )? otherlv_5= RightSquareBracket
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:903:3: ()
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:904:4: 
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
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:914:3: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=Secrets && LA10_0<=True)||LA10_0==LeftSquareBracket||LA10_0==LeftCurlyBracket||(LA10_0>=RULE_STRING && LA10_0<=RULE_E_DOUBLE)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:915:4: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    {
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:915:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:916:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:916:5: (lv_value_2_0= ruleValue )
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:917:6: lv_value_2_0= ruleValue
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
                      							"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:934:4: (otherlv_3= Comma ( (lv_value_4_0= ruleValue ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Comma) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:935:5: otherlv_3= Comma ( (lv_value_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:939:5: ( (lv_value_4_0= ruleValue ) )
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:940:6: (lv_value_4_0= ruleValue )
                    	    {
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:940:6: (lv_value_4_0= ruleValue )
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:941:7: lv_value_4_0= ruleValue
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
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.Value");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:968:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:968:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:969:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:975:1: ruleNullValue returns [EObject current=null] : ( (lv_value_0_0= ruleNullEnum ) ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:981:2: ( ( (lv_value_0_0= ruleNullEnum ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:982:2: ( (lv_value_0_0= ruleNullEnum ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:982:2: ( (lv_value_0_0= ruleNullEnum ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:983:3: (lv_value_0_0= ruleNullEnum )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:983:3: (lv_value_0_0= ruleNullEnum )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:984:4: lv_value_0_0= ruleNullEnum
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.NullEnum");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1004:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1004:52: (iv_ruleNumberValue= ruleNumberValue EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1005:2: iv_ruleNumberValue= ruleNumberValue EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1011:1: ruleNumberValue returns [EObject current=null] : ( (lv_value_0_0= ruleEDouble ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1017:2: ( ( (lv_value_0_0= ruleEDouble ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1018:2: ( (lv_value_0_0= ruleEDouble ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1018:2: ( (lv_value_0_0= ruleEDouble ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1019:3: (lv_value_0_0= ruleEDouble )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1019:3: (lv_value_0_0= ruleEDouble )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1020:4: lv_value_0_0= ruleEDouble
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EDouble");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1040:1: entryRuleObjectValue returns [EObject current=null] : iv_ruleObjectValue= ruleObjectValue EOF ;
    public final EObject entryRuleObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectValue = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1040:52: (iv_ruleObjectValue= ruleObjectValue EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1041:2: iv_ruleObjectValue= ruleObjectValue EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1047:1: ruleObjectValue returns [EObject current=null] : ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_keyvaluepair_2_0 = null;

        EObject lv_keyvaluepair_4_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1053:2: ( ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1054:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1054:2: ( () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1055:3: () otherlv_1= LeftCurlyBracket ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )? otherlv_5= RightCurlyBracket
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1055:3: ()
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1056:4: 
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
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1066:3: ( ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Secrets||LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1067:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) ) (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    {
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1067:4: ( (lv_keyvaluepair_2_0= ruleKeyValuePair ) )
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1068:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    {
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1068:5: (lv_keyvaluepair_2_0= ruleKeyValuePair )
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1069:6: lv_keyvaluepair_2_0= ruleKeyValuePair
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
                      							"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.KeyValuePair");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1086:4: (otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1087:5: otherlv_3= Comma ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1091:5: ( (lv_keyvaluepair_4_0= ruleKeyValuePair ) )
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1092:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    {
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1092:6: (lv_keyvaluepair_4_0= ruleKeyValuePair )
                    	    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1093:7: lv_keyvaluepair_4_0= ruleKeyValuePair
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
                    	      								"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.KeyValuePair");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1120:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1120:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1121:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1127:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1133:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1134:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1134:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1135:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1135:3: (lv_value_0_0= ruleEBoolean )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1136:4: lv_value_0_0= ruleEBoolean
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EBoolean");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1156:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1156:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1157:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1163:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1169:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1170:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1170:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_E_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_E_DOUBLE) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1171:3: this_E_INT_0= RULE_E_INT
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1179:3: this_E_DOUBLE_1= RULE_E_DOUBLE
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1190:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1190:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1191:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1197:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1203:2: ( ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1204:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1204:2: ( ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1205:3: ( (lv_key_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleValue ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1205:3: ( (lv_key_0_0= ruleEString ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1206:4: (lv_key_0_0= ruleEString )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1206:4: (lv_key_0_0= ruleEString )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1207:5: lv_key_0_0= ruleEString
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
              						"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
              		
            }
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1228:3: ( (lv_value_2_0= ruleValue ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1229:4: (lv_value_2_0= ruleValue )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1229:4: (lv_value_2_0= ruleValue )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1230:5: lv_value_2_0= ruleValue
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
              						"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.Value");
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1251:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1251:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1252:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1258:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1264:2: ( (kw= True | kw= False ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1265:2: (kw= True | kw= False )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1265:2: (kw= True | kw= False )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==True) ) {
                alt14=1;
            }
            else if ( (LA14_0==False) ) {
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1266:3: kw= True
                    {
                    kw=(Token)match(input,True,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1272:3: kw= False
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


    // $ANTLR start "entryRuleEnvItems"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1281:1: entryRuleEnvItems returns [EObject current=null] : iv_ruleEnvItems= ruleEnvItems EOF ;
    public final EObject entryRuleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvItems = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1281:49: (iv_ruleEnvItems= ruleEnvItems EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1282:2: iv_ruleEnvItems= ruleEnvItems EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1288:1: ruleEnvItems returns [EObject current=null] : ( (lv_items_0_0= ruleJsonDocument ) ) ;
    public final EObject ruleEnvItems() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1294:2: ( ( (lv_items_0_0= ruleJsonDocument ) ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1295:2: ( (lv_items_0_0= ruleJsonDocument ) )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1295:2: ( (lv_items_0_0= ruleJsonDocument ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1296:3: (lv_items_0_0= ruleJsonDocument )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1296:3: (lv_items_0_0= ruleJsonDocument )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1297:4: lv_items_0_0= ruleJsonDocument
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
              					"githubwf.githubwf.ReusableWorkflowCallJobSecretsOneOf0.JsonDocument");
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


    // $ANTLR start "entryRuleVALID_STRING"
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1317:1: entryRuleVALID_STRING returns [String current=null] : iv_ruleVALID_STRING= ruleVALID_STRING EOF ;
    public final String entryRuleVALID_STRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALID_STRING = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1317:52: (iv_ruleVALID_STRING= ruleVALID_STRING EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1318:2: iv_ruleVALID_STRING= ruleVALID_STRING EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1324:1: ruleVALID_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleVALID_STRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1330:2: ( (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1331:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1331:2: (this_STRING_0= RULE_STRING | this_KEYWORD_1= ruleKEYWORD )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==Secrets) ) {
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1332:3: this_STRING_0= RULE_STRING
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
                    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1340:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1354:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1354:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1355:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1361:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Secrets ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1367:2: (kw= Secrets )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1368:2: kw= Secrets
            {
            kw=(Token)match(input,Secrets,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSecretsKeyword());
              	
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
    // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1376:1: ruleNullEnum returns [Enumerator current=null] : (enumLiteral_0= Null ) ;
    public final Enumerator ruleNullEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1382:2: ( (enumLiteral_0= Null ) )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1383:2: (enumLiteral_0= Null )
            {
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1383:2: (enumLiteral_0= Null )
            // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:1384:3: enumLiteral_0= Null
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

    // $ANTLR start synpred1_InternalReusableWorkflowCallJobSecretsOneOf0Parser
    public final void synpred1_InternalReusableWorkflowCallJobSecretsOneOf0Parser_fragment() throws RecognitionException {   
        // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:120:4: ( ruleEnvTypeNumber )
        // InternalReusableWorkflowCallJobSecretsOneOf0Parser.g:120:5: ruleEnvTypeNumber
        {
        pushFollow(FOLLOW_2);
        ruleEnvTypeNumber();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalReusableWorkflowCallJobSecretsOneOf0Parser

    // Delegated rules

    public final boolean synpred1_InternalReusableWorkflowCallJobSecretsOneOf0Parser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalReusableWorkflowCallJobSecretsOneOf0Parser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\0\7\uffff";
    static final String dfa_3s = "\1\21\2\0\7\uffff";
    static final String dfa_4s = "\3\uffff\1\2\1\4\1\5\1\6\1\7\1\1\1\3";
    static final String dfa_5s = "\1\uffff\1\1\1\0\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\1\7\1\4\2\uffff\1\6\1\uffff\1\5\2\uffff\1\3\1\1\1\2",
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

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "118:2: ( ( ( ruleEnvTypeNumber )=>this_EnvTypeNumber_0= ruleEnvTypeNumber ) | this_EnvTypeString_1= ruleEnvTypeString | this_EnvTypeInteger_2= ruleEnvTypeInteger | this_EnvTypeBoolean_3= ruleEnvTypeBoolean | this_EnvTypeObject_4= ruleEnvTypeObject | this_EnvTypeArray_5= ruleEnvTypeArray | this_EnvTypeNull_6= ruleEnvTypeNull )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalReusableWorkflowCallJobSecretsOneOf0Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalReusableWorkflowCallJobSecretsOneOf0Parser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000394F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000039CF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000900L});

}
